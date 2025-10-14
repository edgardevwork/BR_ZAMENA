package org.apache.commons.compress.compressors.gzip;

import io.ktor.util.DeflaterKt;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.apache.commons.compress.compressors.CompressorOutputStream;

/* loaded from: classes6.dex */
public class GzipCompressorOutputStream extends CompressorOutputStream {
    public static final int FCOMMENT = 16;
    public static final int FNAME = 8;
    public boolean closed;
    public final CRC32 crc;
    public final byte[] deflateBuffer;
    public final Deflater deflater;
    public final OutputStream out;

    public GzipCompressorOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, new GzipParameters());
    }

    public GzipCompressorOutputStream(OutputStream outputStream, GzipParameters gzipParameters) throws IOException {
        this.crc = new CRC32();
        this.out = outputStream;
        this.deflater = new Deflater(gzipParameters.getCompressionLevel(), true);
        this.deflateBuffer = new byte[gzipParameters.getBufferSize()];
        writeHeader(gzipParameters);
    }

    public final void writeHeader(GzipParameters gzipParameters) throws IOException {
        String filename = gzipParameters.getFilename();
        String comment = gzipParameters.getComment();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(DeflaterKt.GZIP_MAGIC);
        byteBufferAllocate.put((byte) 8);
        byteBufferAllocate.put((byte) ((filename == null ? 0 : 8) | (comment != null ? 16 : 0)));
        byteBufferAllocate.putInt((int) (gzipParameters.getModificationTime() / 1000));
        int compressionLevel = gzipParameters.getCompressionLevel();
        if (compressionLevel == 9) {
            byteBufferAllocate.put((byte) 2);
        } else if (compressionLevel == 1) {
            byteBufferAllocate.put((byte) 4);
        } else {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.put((byte) gzipParameters.getOperatingSystem());
        this.out.write(byteBufferAllocate.array());
        if (filename != null) {
            this.out.write(filename.getBytes(StandardCharsets.ISO_8859_1));
            this.out.write(0);
        }
        if (comment != null) {
            this.out.write(comment.getBytes(StandardCharsets.ISO_8859_1));
            this.out.write(0);
        }
    }

    public final void writeTrailer() throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt((int) this.crc.getValue());
        byteBufferAllocate.putInt(this.deflater.getTotalIn());
        this.out.write(byteBufferAllocate.array());
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) (i & 255)}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.deflater.finished()) {
            throw new IOException("Cannot write more data, the end of the compressed data stream has been reached");
        }
        if (i2 > 0) {
            this.deflater.setInput(bArr, i, i2);
            while (!this.deflater.needsInput()) {
                deflate();
            }
            this.crc.update(bArr, i, i2);
        }
    }

    private void deflate() throws IOException {
        Deflater deflater = this.deflater;
        byte[] bArr = this.deflateBuffer;
        int iDeflate = deflater.deflate(bArr, 0, bArr.length);
        if (iDeflate > 0) {
            this.out.write(this.deflateBuffer, 0, iDeflate);
        }
    }

    public void finish() throws IOException {
        if (this.deflater.finished()) {
            return;
        }
        this.deflater.finish();
        while (!this.deflater.finished()) {
            deflate();
        }
        writeTrailer();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            finish();
        } finally {
            this.deflater.end();
            this.out.close();
            this.closed = true;
        }
    }
}
