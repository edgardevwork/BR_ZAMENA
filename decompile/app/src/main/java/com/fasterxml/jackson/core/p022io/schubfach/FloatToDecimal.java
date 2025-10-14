package com.fasterxml.jackson.core.p022io.schubfach;

import androidx.emoji2.text.flatbuffer.Utf8Old$$ExternalSyntheticThreadLocal1;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.io.IOException;
import java.util.function.Supplier;

/* loaded from: classes8.dex */
public final class FloatToDecimal {
    public static final int BQ_MASK = 255;
    public static final int C_MIN = 8388608;
    public static final int C_TINY = 8;
    public static final int E_MAX = 39;
    public static final int E_MIN = -44;

    /* renamed from: H */
    public static final int f628H = 9;
    public static final int K_MAX = 31;
    public static final int K_MIN = -45;
    public static final int MASK_28 = 268435455;
    public static final long MASK_32 = 4294967295L;
    public static final int MINUS_INF = 4;
    public static final int MINUS_ZERO = 2;
    public static final int NAN = 5;
    public static final int NON_SPECIAL = 0;

    /* renamed from: P */
    public static final int f629P = 24;
    public static final int PLUS_INF = 3;
    public static final int PLUS_ZERO = 1;
    public static final int Q_MAX = 104;
    public static final int Q_MIN = -149;
    public static final int T_MASK = 8388607;

    /* renamed from: W */
    public static final int f630W = 8;
    public static final ThreadLocal<FloatToDecimal> threadLocal = new Utf8Old$$ExternalSyntheticThreadLocal1(new Supplier() { // from class: com.fasterxml.jackson.core.io.schubfach.FloatToDecimal$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final Object get() {
            return FloatToDecimal.$r8$lambda$XAWs114WYfPTu25EQERGjJynv_Y();
        }
    });
    public final int MAX_CHARS = 15;
    public final byte[] bytes = new byte[15];
    public final char[] chars = new char[15];
    public int index;

    public static /* synthetic */ FloatToDecimal $r8$lambda$XAWs114WYfPTu25EQERGjJynv_Y() {
        return new FloatToDecimal();
    }

    public static String toString(float f) {
        return threadLocalInstance().toDecimalString(f);
    }

    public static Appendable appendTo(float f, Appendable appendable) throws IOException {
        return threadLocalInstance().appendDecimalTo(f, appendable);
    }

    public static FloatToDecimal threadLocalInstance() {
        return threadLocal.get();
    }

    public final String toDecimalString(float f) {
        int decimal = toDecimal(f);
        if (decimal == 0) {
            return charsToString();
        }
        if (decimal == 1) {
            return IdManager.DEFAULT_VERSION_NAME;
        }
        if (decimal == 2) {
            return "-0.0";
        }
        if (decimal == 3) {
            return "Infinity";
        }
        if (decimal == 4) {
            return "-Infinity";
        }
        return "NaN";
    }

    public final Appendable appendDecimalTo(float f, Appendable appendable) throws IOException {
        int i;
        int decimal = toDecimal(f);
        if (decimal != 0) {
            if (decimal == 1) {
                return appendable.append(IdManager.DEFAULT_VERSION_NAME);
            }
            if (decimal == 2) {
                return appendable.append("-0.0");
            }
            if (decimal == 3) {
                return appendable.append("Infinity");
            }
            if (decimal == 4) {
                return appendable.append("-Infinity");
            }
            return appendable.append("NaN");
        }
        int i2 = 0;
        while (true) {
            i = this.index;
            if (i2 > i) {
                break;
            }
            this.chars[i2] = (char) this.bytes[i2];
            i2++;
        }
        if (appendable instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) appendable;
            sb.append(this.chars, 0, i + 1);
            return sb;
        }
        if (appendable instanceof StringBuffer) {
            StringBuffer stringBuffer = (StringBuffer) appendable;
            stringBuffer.append(this.chars, 0, i + 1);
            return stringBuffer;
        }
        for (int i3 = 0; i3 <= this.index; i3++) {
            appendable.append(this.chars[i3]);
        }
        return appendable;
    }

    public final int toDecimal(float f) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i = 8388607 & iFloatToRawIntBits;
        int i2 = (iFloatToRawIntBits >>> 23) & 255;
        if (i2 >= 255) {
            if (i != 0) {
                return 5;
            }
            return iFloatToRawIntBits > 0 ? 3 : 4;
        }
        this.index = -1;
        if (iFloatToRawIntBits < 0) {
            append(45);
        }
        if (i2 == 0) {
            if (i == 0) {
                return iFloatToRawIntBits == 0 ? 1 : 2;
            }
            if (i < 8) {
                return toDecimal(Q_MIN, i * 10, -1);
            }
            return toDecimal(Q_MIN, i, 0);
        }
        int i3 = 150 - i2;
        int i4 = i | 8388608;
        if ((i3 > 0) & (i3 < 24)) {
            int i5 = i4 >> i3;
            if ((i5 << i3) == i4) {
                return toChars(i5, 0);
            }
        }
        return toDecimal(-i3, i4, 0);
    }

    public final int toDecimal(int i, int i2, int i3) {
        long j;
        int iFlog10threeQuartersPow2;
        int i4 = i2 & 1;
        long j2 = i2 << 2;
        long j3 = j2 + 2;
        if ((i2 != 8388608) | (i == -149)) {
            j = j2 - 2;
            iFlog10threeQuartersPow2 = MathUtils.flog10pow2(i);
        } else {
            j = j2 - 1;
            iFlog10threeQuartersPow2 = MathUtils.flog10threeQuartersPow2(i);
        }
        int iFlog2pow10 = i + MathUtils.flog2pow10(-iFlog10threeQuartersPow2) + 33;
        long jM1018g1 = 1 + MathUtils.m1018g1(iFlog10threeQuartersPow2);
        int iRop = rop(jM1018g1, j2 << iFlog2pow10);
        int iRop2 = rop(jM1018g1, j << iFlog2pow10);
        int iRop3 = rop(jM1018g1, j3 << iFlog2pow10);
        int i5 = iRop >> 2;
        if (i5 >= 100) {
            int i6 = ((int) ((i5 * 1717986919) >>> 34)) * 10;
            int i7 = i6 + 10;
            boolean z = iRop2 + i4 <= (i6 << 2);
            if (z != ((i7 << 2) + i4 <= iRop3)) {
                if (!z) {
                    i6 = i7;
                }
                return toChars(i6, iFlog10threeQuartersPow2);
            }
        }
        int i8 = i5 + 1;
        boolean z2 = iRop2 + i4 <= (i5 << 2);
        if (z2 != ((i8 << 2) + i4 <= iRop3)) {
            if (!z2) {
                i5 = i8;
            }
            return toChars(i5, iFlog10threeQuartersPow2 + i3);
        }
        int i9 = iRop - ((i5 + i8) << 1);
        if (i9 >= 0 && (i9 != 0 || (i5 & 1) != 0)) {
            i5 = i8;
        }
        return toChars(i5, iFlog10threeQuartersPow2 + i3);
    }

    public static int rop(long j, long j2) {
        long jMultiplyHigh = MathUtils.multiplyHigh(j, j2);
        return (int) ((((jMultiplyHigh & 4294967295L) + 4294967295L) >>> 32) | (jMultiplyHigh >>> 31));
    }

    public final int toChars(int i, int i2) {
        int iFlog10pow2 = MathUtils.flog10pow2(32 - Integer.numberOfLeadingZeros(i));
        long j = i;
        if (j >= MathUtils.pow10(iFlog10pow2)) {
            iFlog10pow2++;
        }
        int iPow10 = (int) (j * MathUtils.pow10(9 - iFlog10pow2));
        int i3 = i2 + iFlog10pow2;
        int i4 = (int) ((iPow10 * 1441151881) >>> 57);
        int i5 = iPow10 - (100000000 * i4);
        if (i3 > 0 && i3 <= 7) {
            return toChars1(i4, i5, i3);
        }
        if (-3 < i3 && i3 <= 0) {
            return toChars2(i4, i5, i3);
        }
        return toChars3(i4, i5, i3);
    }

    public final int toChars1(int i, int i2, int i3) {
        appendDigit(i);
        int iM1016y = m1016y(i2);
        int i4 = 1;
        while (i4 < i3) {
            int i5 = iM1016y * 10;
            appendDigit(i5 >>> 28);
            iM1016y = i5 & 268435455;
            i4++;
        }
        append(46);
        while (i4 <= 8) {
            int i6 = iM1016y * 10;
            appendDigit(i6 >>> 28);
            iM1016y = i6 & 268435455;
            i4++;
        }
        removeTrailingZeroes();
        return 0;
    }

    public final int toChars2(int i, int i2, int i3) {
        appendDigit(0);
        append(46);
        while (i3 < 0) {
            appendDigit(0);
            i3++;
        }
        appendDigit(i);
        append8Digits(i2);
        removeTrailingZeroes();
        return 0;
    }

    public final int toChars3(int i, int i2, int i3) {
        appendDigit(i);
        append(46);
        append8Digits(i2);
        removeTrailingZeroes();
        exponent(i3 - 1);
        return 0;
    }

    public final void append8Digits(int i) {
        int iM1016y = m1016y(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iM1016y * 10;
            appendDigit(i3 >>> 28);
            iM1016y = i3 & 268435455;
        }
    }

    public final void removeTrailingZeroes() {
        int i;
        byte b;
        while (true) {
            byte[] bArr = this.bytes;
            i = this.index;
            b = bArr[i];
            if (b != 48) {
                break;
            } else {
                this.index = i - 1;
            }
        }
        if (b == 46) {
            this.index = i + 1;
        }
    }

    /* renamed from: y */
    public final int m1016y(int i) {
        return ((int) (MathUtils.multiplyHigh((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    public final void exponent(int i) {
        append(69);
        if (i < 0) {
            append(45);
            i = -i;
        }
        if (i < 10) {
            appendDigit(i);
            return;
        }
        int i2 = (i * 103) >>> 10;
        appendDigit(i2);
        appendDigit(i - (i2 * 10));
    }

    public final void append(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.index + 1;
        this.index = i2;
        bArr[i2] = (byte) i;
    }

    public final void appendDigit(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.index + 1;
        this.index = i2;
        bArr[i2] = (byte) (i + 48);
    }

    public final String charsToString() {
        return new String(this.bytes, 0, 0, this.index + 1);
    }
}
