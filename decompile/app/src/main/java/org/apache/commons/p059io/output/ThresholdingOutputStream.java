package org.apache.commons.p059io.output;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.p059io.function.IOConsumer;
import org.apache.commons.p059io.function.IOFunction;

/* loaded from: classes6.dex */
public class ThresholdingOutputStream extends OutputStream {
    public static final IOFunction<ThresholdingOutputStream, OutputStream> NOOP_OS_GETTER = new IOFunction() { // from class: org.apache.commons.io.output.ThresholdingOutputStream$$ExternalSyntheticLambda0
        @Override // org.apache.commons.p059io.function.IOFunction
        public final Object apply(Object obj) {
            return ThresholdingOutputStream.lambda$static$0((ThresholdingOutputStream) obj);
        }
    };
    public final IOFunction<ThresholdingOutputStream, OutputStream> outputStreamGetter;
    public final int threshold;
    public final IOConsumer<ThresholdingOutputStream> thresholdConsumer;
    public boolean thresholdExceeded;
    public long written;

    public static /* synthetic */ OutputStream lambda$static$0(ThresholdingOutputStream thresholdingOutputStream) throws IOException {
        return NullOutputStream.NULL_OUTPUT_STREAM;
    }

    public ThresholdingOutputStream(int i) {
        this(i, IOConsumer.noop(), NOOP_OS_GETTER);
    }

    public ThresholdingOutputStream(int i, IOConsumer<ThresholdingOutputStream> iOConsumer, IOFunction<ThresholdingOutputStream, OutputStream> iOFunction) {
        this.threshold = i;
        this.thresholdConsumer = iOConsumer == null ? IOConsumer.noop() : iOConsumer;
        this.outputStreamGetter = iOFunction == null ? NOOP_OS_GETTER : iOFunction;
    }

    public void checkThreshold(int i) throws IOException {
        if (this.thresholdExceeded || this.written + i <= this.threshold) {
            return;
        }
        this.thresholdExceeded = true;
        thresholdReached();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
        getStream().close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        getStream().flush();
    }

    public long getByteCount() {
        return this.written;
    }

    public OutputStream getStream() throws IOException {
        return this.outputStreamGetter.apply(this);
    }

    public int getThreshold() {
        return this.threshold;
    }

    public boolean isThresholdExceeded() {
        return this.written > ((long) this.threshold);
    }

    public void resetByteCount() {
        this.thresholdExceeded = false;
        this.written = 0L;
    }

    public void setByteCount(long j) {
        this.written = j;
    }

    public void thresholdReached() throws IOException {
        this.thresholdConsumer.accept(this);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        checkThreshold(bArr.length);
        getStream().write(bArr);
        this.written += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        checkThreshold(i2);
        getStream().write(bArr, i, i2);
        this.written += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        checkThreshold(1);
        getStream().write(i);
        this.written++;
    }
}
