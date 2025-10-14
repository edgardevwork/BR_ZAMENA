package org.apache.commons.p059io.input;

import java.io.Reader;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes6.dex */
public class CharSequenceReader extends Reader implements Serializable {
    public static final long serialVersionUID = 3724187752191401220L;
    public final CharSequence charSequence;
    public final Integer end;
    public int idx;
    public int mark;
    public final int start;

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public CharSequenceReader(CharSequence charSequence) {
        this(charSequence, 0);
    }

    public CharSequenceReader(CharSequence charSequence, int i) {
        this(charSequence, i, Integer.MAX_VALUE);
    }

    public CharSequenceReader(String str, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index is less than zero: " + i);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("End index is less than start " + i + ": " + i2);
        }
        this.charSequence = str == null ? "" : str;
        this.start = i;
        this.end = Integer.valueOf(i2);
        this.idx = i;
        this.mark = i;
    }

    public final int start() {
        return Math.min(this.charSequence.length(), this.start);
    }

    public final int end() {
        int length = this.charSequence.length();
        Integer num = this.end;
        return Math.min(length, num == null ? Integer.MAX_VALUE : num.intValue());
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.start;
        this.idx = i;
        this.mark = i;
    }

    @Override // java.io.Reader
    public boolean ready() {
        return this.idx < end();
    }

    @Override // java.io.Reader
    public void mark(int i) {
        this.mark = this.idx;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.idx >= end()) {
            return -1;
        }
        CharSequence charSequence = this.charSequence;
        int i = this.idx;
        this.idx = i + 1;
        return charSequence.charAt(i);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        if (this.idx >= end()) {
            return -1;
        }
        Objects.requireNonNull(cArr, "array");
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
        }
        CharSequence charSequence = this.charSequence;
        if (charSequence instanceof String) {
            int iMin = Math.min(i2, end() - this.idx);
            String str = (String) this.charSequence;
            int i3 = this.idx;
            str.getChars(i3, i3 + iMin, cArr, i);
            this.idx += iMin;
            return iMin;
        }
        if (charSequence instanceof StringBuilder) {
            int iMin2 = Math.min(i2, end() - this.idx);
            StringBuilder sb = (StringBuilder) this.charSequence;
            int i4 = this.idx;
            sb.getChars(i4, i4 + iMin2, cArr, i);
            this.idx += iMin2;
            return iMin2;
        }
        if (charSequence instanceof StringBuffer) {
            int iMin3 = Math.min(i2, end() - this.idx);
            StringBuffer stringBuffer = (StringBuffer) this.charSequence;
            int i5 = this.idx;
            stringBuffer.getChars(i5, i5 + iMin3, cArr, i);
            this.idx += iMin3;
            return iMin3;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = read();
            if (i8 == -1) {
                return i6;
            }
            cArr[i + i7] = (char) i8;
            i6++;
        }
        return i6;
    }

    @Override // java.io.Reader
    public void reset() {
        this.idx = this.mark;
    }

    @Override // java.io.Reader
    public long skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Number of characters to skip is less than zero: " + j);
        }
        if (this.idx >= end()) {
            return 0L;
        }
        int iMin = (int) Math.min(end(), this.idx + j);
        int i = iMin - this.idx;
        this.idx = iMin;
        return i;
    }

    public String toString() {
        return this.charSequence.subSequence(start(), end()).toString();
    }
}
