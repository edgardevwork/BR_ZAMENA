package org.apache.http.impl.p060io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.p061io.BufferInfo;
import org.apache.http.p061io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes8.dex */
public class ChunkedInputStream extends InputStream {
    public static final int BUFFER_SIZE = 2048;
    public static final int CHUNK_CRLF = 3;
    public static final int CHUNK_DATA = 2;
    public static final int CHUNK_INVALID = Integer.MAX_VALUE;
    public static final int CHUNK_LEN = 1;
    public final CharArrayBuffer buffer;
    public long chunkSize;
    public boolean closed;
    public final MessageConstraints constraints;
    public boolean eof;
    public Header[] footers;

    /* renamed from: in */
    public final SessionInputBuffer f9937in;
    public long pos;
    public int state;

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this.eof = false;
        this.closed = false;
        this.footers = new Header[0];
        this.f9937in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.pos = 0L;
        this.buffer = new CharArrayBuffer(16);
        this.constraints = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.state = 1;
    }

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, null);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f9937in instanceof BufferInfo) {
            return (int) Math.min(((BufferInfo) r0).length(), this.chunkSize - this.pos);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.eof) {
            return -1;
        }
        if (this.state != 2) {
            nextChunk();
            if (this.eof) {
                return -1;
            }
        }
        int i = this.f9937in.read();
        if (i != -1) {
            long j = this.pos + 1;
            this.pos = j;
            if (j >= this.chunkSize) {
                this.state = 3;
            }
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.eof) {
            return -1;
        }
        if (this.state != 2) {
            nextChunk();
            if (this.eof) {
                return -1;
            }
        }
        int i3 = this.f9937in.read(bArr, i, (int) Math.min(i2, this.chunkSize - this.pos));
        if (i3 != -1) {
            long j = this.pos + i3;
            this.pos = j;
            if (j >= this.chunkSize) {
                this.state = 3;
            }
            return i3;
        }
        this.eof = true;
        throw new TruncatedChunkException("Truncated chunk (expected size: %,d; actual size: %,d)", Long.valueOf(this.chunkSize), Long.valueOf(this.pos));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final void nextChunk() throws IOException {
        if (this.state == Integer.MAX_VALUE) {
            throw new MalformedChunkCodingException("Corrupt data stream");
        }
        try {
            long chunkSize = getChunkSize();
            this.chunkSize = chunkSize;
            if (chunkSize < 0) {
                throw new MalformedChunkCodingException("Negative chunk size");
            }
            this.state = 2;
            this.pos = 0L;
            if (chunkSize == 0) {
                this.eof = true;
                parseTrailerHeaders();
            }
        } catch (MalformedChunkCodingException e) {
            this.state = Integer.MAX_VALUE;
            throw e;
        }
    }

    public final long getChunkSize() throws IOException {
        int i = this.state;
        if (i != 1) {
            if (i == 3) {
                this.buffer.clear();
                if (this.f9937in.readLine(this.buffer) == -1) {
                    throw new MalformedChunkCodingException("CRLF expected at end of chunk");
                }
                if (!this.buffer.isEmpty()) {
                    throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
                }
                this.state = 1;
            } else {
                throw new IllegalStateException("Inconsistent codec state");
            }
        }
        this.buffer.clear();
        if (this.f9937in.readLine(this.buffer) == -1) {
            throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
        }
        int iIndexOf = this.buffer.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = this.buffer.length();
        }
        String strSubstringTrimmed = this.buffer.substringTrimmed(0, iIndexOf);
        try {
            return Long.parseLong(strSubstringTrimmed, 16);
        } catch (NumberFormatException unused) {
            throw new MalformedChunkCodingException("Bad chunk header: " + strSubstringTrimmed);
        }
    }

    public final void parseTrailerHeaders() throws IOException {
        try {
            this.footers = AbstractMessageParser.parseHeaders(this.f9937in, this.constraints.getMaxHeaderCount(), this.constraints.getMaxLineLength(), null);
        } catch (HttpException e) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            malformedChunkCodingException.initCause(e);
            throw malformedChunkCodingException;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            if (!this.eof && this.state != Integer.MAX_VALUE) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.eof = true;
            this.closed = true;
        }
    }

    public Header[] getFooters() {
        return (Header[]) this.footers.clone();
    }
}
