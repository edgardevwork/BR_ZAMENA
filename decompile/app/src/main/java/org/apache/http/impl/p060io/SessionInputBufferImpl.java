package org.apache.http.impl.p060io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.MessageConstraintException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.p061io.BufferInfo;
import org.apache.http.p061io.HttpTransportMetrics;
import org.apache.http.p061io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes8.dex */
public class SessionInputBufferImpl implements SessionInputBuffer, BufferInfo {
    public final byte[] buffer;
    public int bufferLen;
    public int bufferPos;
    public CharBuffer cbuf;
    public final MessageConstraints constraints;
    public final CharsetDecoder decoder;
    public InputStream inStream;
    public final ByteArrayBuffer lineBuffer;
    public final HttpTransportMetricsImpl metrics;
    public final int minChunkLimit;

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, MessageConstraints messageConstraints, CharsetDecoder charsetDecoder) {
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        Args.positive(i, "Buffer size");
        this.metrics = httpTransportMetricsImpl;
        this.buffer = new byte[i];
        this.bufferPos = 0;
        this.bufferLen = 0;
        this.minChunkLimit = i2 < 0 ? 512 : i2;
        this.constraints = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.lineBuffer = new ByteArrayBuffer(i);
        this.decoder = charsetDecoder;
    }

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null, null);
    }

    public void bind(InputStream inputStream) {
        this.inStream = inputStream;
    }

    public boolean isBound() {
        return this.inStream != null;
    }

    @Override // org.apache.http.p061io.BufferInfo
    public int capacity() {
        return this.buffer.length;
    }

    @Override // org.apache.http.p061io.BufferInfo
    public int length() {
        return this.bufferLen - this.bufferPos;
    }

    @Override // org.apache.http.p061io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    public final int streamRead(byte[] bArr, int i, int i2) throws IOException {
        Asserts.notNull(this.inStream, "Input stream");
        return this.inStream.read(bArr, i, i2);
    }

    public int fillBuffer() throws IOException {
        int i = this.bufferPos;
        if (i > 0) {
            int i2 = this.bufferLen - i;
            if (i2 > 0) {
                byte[] bArr = this.buffer;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.bufferPos = 0;
            this.bufferLen = i2;
        }
        int i3 = this.bufferLen;
        byte[] bArr2 = this.buffer;
        int iStreamRead = streamRead(bArr2, i3, bArr2.length - i3);
        if (iStreamRead == -1) {
            return -1;
        }
        this.bufferLen = i3 + iStreamRead;
        this.metrics.incrementBytesTransferred(iStreamRead);
        return iStreamRead;
    }

    public boolean hasBufferedData() {
        return this.bufferPos < this.bufferLen;
    }

    public void clear() {
        this.bufferPos = 0;
        this.bufferLen = 0;
    }

    @Override // org.apache.http.p061io.SessionInputBuffer
    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i] & 255;
    }

    @Override // org.apache.http.p061io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int iMin = Math.min(i2, this.bufferLen - this.bufferPos);
            System.arraycopy(this.buffer, this.bufferPos, bArr, i, iMin);
            this.bufferPos += iMin;
            return iMin;
        }
        if (i2 > this.minChunkLimit) {
            int iStreamRead = streamRead(bArr, i, i2);
            if (iStreamRead > 0) {
                this.metrics.incrementBytesTransferred(iStreamRead);
            }
            return iStreamRead;
        }
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        int iMin2 = Math.min(i2, this.bufferLen - this.bufferPos);
        System.arraycopy(this.buffer, this.bufferPos, bArr, i, iMin2);
        this.bufferPos += iMin2;
        return iMin2;
    }

    @Override // org.apache.http.p061io.SessionInputBuffer
    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.p061io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        int maxLineLength = this.constraints.getMaxLineLength();
        boolean z = true;
        int iFillBuffer = 0;
        while (z) {
            int i = this.bufferPos;
            while (true) {
                if (i >= this.bufferLen) {
                    i = -1;
                    break;
                }
                if (this.buffer[i] == 10) {
                    break;
                }
                i++;
            }
            if (maxLineLength > 0) {
                if ((this.lineBuffer.length() + (i >= 0 ? i : this.bufferLen)) - this.bufferPos >= maxLineLength) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
            }
            if (i != -1) {
                if (this.lineBuffer.isEmpty()) {
                    return lineFromReadBuffer(charArrayBuffer, i);
                }
                int i2 = i + 1;
                int i3 = this.bufferPos;
                this.lineBuffer.append(this.buffer, i3, i2 - i3);
                this.bufferPos = i2;
            } else {
                if (hasBufferedData()) {
                    int i4 = this.bufferLen;
                    int i5 = this.bufferPos;
                    this.lineBuffer.append(this.buffer, i5, i4 - i5);
                    this.bufferPos = this.bufferLen;
                }
                iFillBuffer = fillBuffer();
                if (iFillBuffer == -1) {
                }
            }
            z = false;
        }
        if (iFillBuffer == -1 && this.lineBuffer.isEmpty()) {
            return -1;
        }
        return lineFromLineBuffer(charArrayBuffer);
    }

    private int lineFromLineBuffer(CharArrayBuffer charArrayBuffer) throws IOException {
        int length = this.lineBuffer.length();
        if (length > 0) {
            if (this.lineBuffer.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.lineBuffer.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.decoder == null) {
            charArrayBuffer.append(this.lineBuffer, 0, length);
        } else {
            length = appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.lineBuffer.buffer(), 0, length));
        }
        this.lineBuffer.clear();
        return length;
    }

    private int lineFromReadBuffer(CharArrayBuffer charArrayBuffer, int i) throws IOException {
        int i2 = this.bufferPos;
        this.bufferPos = i + 1;
        if (i > i2 && this.buffer[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.decoder == null) {
            charArrayBuffer.append(this.buffer, i2, i3);
            return i3;
        }
        return appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.buffer, i2, i3));
    }

    private int appendDecoded(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        int iHandleDecodingResult = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.cbuf == null) {
            this.cbuf = CharBuffer.allocate(1024);
        }
        this.decoder.reset();
        while (byteBuffer.hasRemaining()) {
            iHandleDecodingResult += handleDecodingResult(this.decoder.decode(byteBuffer, this.cbuf, true), charArrayBuffer, byteBuffer);
        }
        int iHandleDecodingResult2 = iHandleDecodingResult + handleDecodingResult(this.decoder.flush(this.cbuf), charArrayBuffer, byteBuffer);
        this.cbuf.clear();
        return iHandleDecodingResult2;
    }

    private int handleDecodingResult(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.cbuf.flip();
        int iRemaining = this.cbuf.remaining();
        while (this.cbuf.hasRemaining()) {
            charArrayBuffer.append(this.cbuf.get());
        }
        this.cbuf.compact();
        return iRemaining;
    }

    @Override // org.apache.http.p061io.SessionInputBuffer
    public String readLine() throws IOException {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }

    @Override // org.apache.http.p061io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws IOException {
        return hasBufferedData();
    }

    @Override // org.apache.http.p061io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }
}
