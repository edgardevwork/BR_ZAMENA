package org.apache.commons.p059io.output;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class CountingOutputStream extends ProxyOutputStream {
    public long count;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.apache.commons.p059io.output.ProxyOutputStream
    public synchronized void beforeWrite(int i) {
        this.count += i;
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
