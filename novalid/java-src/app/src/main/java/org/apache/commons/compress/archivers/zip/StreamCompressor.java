package org.apache.commons.compress.archivers.zip;

import java.io.Closeable;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;

/* loaded from: classes5.dex */
public abstract class StreamCompressor implements Closeable {
    public static final int BUFFER_SIZE = 4096;
    public static final int DEFLATER_BLOCK_SIZE = 8192;
    public final Deflater def;
    public long sourcePayloadLength;
    public long totalWrittenToOutputStream;
    public long writtenToOutputStreamForLastEntry;
    public final CRC32 crc = new CRC32();
    public final byte[] outputBuffer = new byte[4096];
    public final byte[] readerBuf = new byte[4096];

    public abstract void writeOut(byte[] bArr, int i, int i2) throws IOException;

    public StreamCompressor(Deflater deflater) {
        this.def = deflater;
    }

    public static StreamCompressor create(OutputStream outputStream, Deflater deflater) {
        return new OutputStreamCompressor(deflater, outputStream);
    }

    public static StreamCompressor create(OutputStream outputStream) {
        return create(outputStream, new Deflater(-1, true));
    }

    public static StreamCompressor create(DataOutput dataOutput, Deflater deflater) {
        return new DataOutputCompressor(deflater, dataOutput);
    }

    public static StreamCompressor create(SeekableByteChannel seekableByteChannel, Deflater deflater) {
        return new SeekableByteChannelCompressor(deflater, seekableByteChannel);
    }

    public static StreamCompressor create(int i, ScatterGatherBackingStore scatterGatherBackingStore) {
        return new ScatterGatherBackingStoreCompressor(new Deflater(i, true), scatterGatherBackingStore);
    }

    public static StreamCompressor create(ScatterGatherBackingStore scatterGatherBackingStore) {
        return create(-1, scatterGatherBackingStore);
    }

    public long getCrc32() {
        return this.crc.getValue();
    }

    public long getBytesRead() {
        return this.sourcePayloadLength;
    }

    public long getBytesWrittenForLastEntry() {
        return this.writtenToOutputStreamForLastEntry;
    }

    public long getTotalBytesWritten() {
        return this.totalWrittenToOutputStream;
    }

    public void deflate(InputStream inputStream, int i) throws IOException {
        reset();
        while (true) {
            byte[] bArr = this.readerBuf;
            int i2 = inputStream.read(bArr, 0, bArr.length);
            if (i2 < 0) {
                break;
            } else {
                write(this.readerBuf, 0, i2, i);
            }
        }
        if (i == 8) {
            flushDeflater();
        }
    }

    public long write(byte[] bArr, int i, int i2, int i3) throws IOException {
        long j = this.writtenToOutputStreamForLastEntry;
        this.crc.update(bArr, i, i2);
        if (i3 == 8) {
            writeDeflated(bArr, i, i2);
        } else {
            writeCounted(bArr, i, i2);
        }
        this.sourcePayloadLength += i2;
        return this.writtenToOutputStreamForLastEntry - j;
    }

    public void reset() {
        this.crc.reset();
        this.def.reset();
        this.sourcePayloadLength = 0L;
        this.writtenToOutputStreamForLastEntry = 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.def.end();
    }

    public void flushDeflater() throws IOException {
        this.def.finish();
        while (!this.def.finished()) {
            deflate();
        }
    }

    public final void writeDeflated(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0 || this.def.finished()) {
            return;
        }
        if (i2 <= 8192) {
            this.def.setInput(bArr, i, i2);
            deflateUntilInputIsNeeded();
            return;
        }
        int i3 = i2 / 8192;
        for (int i4 = 0; i4 < i3; i4++) {
            this.def.setInput(bArr, (i4 * 8192) + i, 8192);
            deflateUntilInputIsNeeded();
        }
        int i5 = i3 * 8192;
        if (i5 < i2) {
            this.def.setInput(bArr, i + i5, i2 - i5);
            deflateUntilInputIsNeeded();
        }
    }

    public final void deflateUntilInputIsNeeded() throws IOException {
        while (!this.def.needsInput()) {
            deflate();
        }
    }

    public void deflate() throws IOException {
        Deflater deflater = this.def;
        byte[] bArr = this.outputBuffer;
        int iDeflate = deflater.deflate(bArr, 0, bArr.length);
        if (iDeflate > 0) {
            writeCounted(this.outputBuffer, 0, iDeflate);
        }
    }

    public void writeCounted(byte[] bArr) throws IOException {
        writeCounted(bArr, 0, bArr.length);
    }

    public void writeCounted(byte[] bArr, int i, int i2) throws IOException {
        writeOut(bArr, i, i2);
        long j = i2;
        this.writtenToOutputStreamForLastEntry += j;
        this.totalWrittenToOutputStream += j;
    }

    /* loaded from: classes8.dex */
    public static final class ScatterGatherBackingStoreCompressor extends StreamCompressor {

        /* renamed from: bs */
        public final ScatterGatherBackingStore f9838bs;

        public ScatterGatherBackingStoreCompressor(Deflater deflater, ScatterGatherBackingStore scatterGatherBackingStore) {
            super(deflater);
            this.f9838bs = scatterGatherBackingStore;
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        public void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.f9838bs.writeOut(bArr, i, i2);
        }
    }

    /* loaded from: classes8.dex */
    public static final class OutputStreamCompressor extends StreamCompressor {

        /* renamed from: os */
        public final OutputStream f9837os;

        public OutputStreamCompressor(Deflater deflater, OutputStream outputStream) {
            super(deflater);
            this.f9837os = outputStream;
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        public void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.f9837os.write(bArr, i, i2);
        }
    }

    /* loaded from: classes8.dex */
    public static final class DataOutputCompressor extends StreamCompressor {
        public final DataOutput raf;

        public DataOutputCompressor(Deflater deflater, DataOutput dataOutput) {
            super(deflater);
            this.raf = dataOutput;
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        public void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.raf.write(bArr, i, i2);
        }
    }

    /* loaded from: classes8.dex */
    public static final class SeekableByteChannelCompressor extends StreamCompressor {
        public final SeekableByteChannel channel;

        public SeekableByteChannelCompressor(Deflater deflater, SeekableByteChannel seekableByteChannel) {
            super(deflater);
            this.channel = seekableByteChannel;
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        public void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.channel.write(ByteBuffer.wrap(bArr, i, i2));
        }
    }
}
