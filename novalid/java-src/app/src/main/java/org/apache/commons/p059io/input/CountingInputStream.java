package org.apache.commons.p059io.input;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class CountingInputStream extends ProxyInputStream {
    public long count;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long jSkip;
        jSkip = super.skip(j);
        this.count += jSkip;
        return jSkip;
    }

    @Override // org.apache.commons.p059io.input.ProxyInputStream
    public synchronized void afterRead(int i) {
        if (i != -1) {
            this.count += i;
        }
    }

    public int getCount() {
        long byteCount = getByteCount();
        if (byteCount <= ParserMinimalBase.MAX_INT_L) {
            return (int) byteCount;
        }
        throw new ArithmeticException("The byte count " + byteCount + " is too large to be converted to an int");
    }

    public int resetCount() {
        long jResetByteCount = resetByteCount();
        if (jResetByteCount <= ParserMinimalBase.MAX_INT_L) {
            return (int) jResetByteCount;
        }
        throw new ArithmeticException("The byte count " + jResetByteCount + " is too large to be converted to an int");
    }

    public synchronized long getByteCount() {
        return this.count;
    }

    public synchronized long resetByteCount() {
        long j;
        j = this.count;
        this.count = 0L;
        return j;
    }
}
