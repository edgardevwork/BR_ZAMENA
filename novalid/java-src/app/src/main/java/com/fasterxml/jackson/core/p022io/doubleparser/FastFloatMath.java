package com.fasterxml.jackson.core.p022io.doubleparser;

import com.caverock.androidsvg.SVG;
import com.fasterxml.jackson.core.p022io.doubleparser.FastDoubleMath;

/* loaded from: classes8.dex */
public class FastFloatMath {
    public static final int FLOAT_EXPONENT_BIAS = 127;
    public static final int FLOAT_MAX_EXPONENT_POWER_OF_TEN = 38;
    public static final int FLOAT_MAX_EXPONENT_POWER_OF_TWO = 127;
    public static final int FLOAT_MIN_EXPONENT_POWER_OF_TEN = -45;
    public static final int FLOAT_MIN_EXPONENT_POWER_OF_TWO = -126;
    public static final float[] FLOAT_POWER_OF_TEN = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final int FLOAT_SIGNIFICAND_WIDTH = 24;

    public static float decFloatLiteralToFloat(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return z ? -0.0f : 0.0f;
        }
        if (!z2) {
            if (-45 > i || i > 38) {
                return Float.NaN;
            }
            return tryDecToFloatWithFastAlgorithm(z, j, i);
        }
        if (-45 > i2 || i2 > 38) {
            return Float.NaN;
        }
        float fTryDecToFloatWithFastAlgorithm = tryDecToFloatWithFastAlgorithm(z, j, i2);
        float fTryDecToFloatWithFastAlgorithm2 = tryDecToFloatWithFastAlgorithm(z, j + 1, i2);
        if (Float.isNaN(fTryDecToFloatWithFastAlgorithm) || fTryDecToFloatWithFastAlgorithm2 != fTryDecToFloatWithFastAlgorithm) {
            return Float.NaN;
        }
        return fTryDecToFloatWithFastAlgorithm;
    }

    public static float hexFloatLiteralToFloat(boolean z, long j, int i, boolean z2, int i2) {
        if (j == 0) {
            return z ? -0.0f : 0.0f;
        }
        if (!z2) {
            if (-126 > i || i > 127) {
                return Float.NaN;
            }
            return tryHexToFloatWithFastAlgorithm(z, j, i);
        }
        if (-126 > i2 || i2 > 127) {
            return Float.NaN;
        }
        float fTryHexToFloatWithFastAlgorithm = tryHexToFloatWithFastAlgorithm(z, j, i2);
        float fTryHexToFloatWithFastAlgorithm2 = tryHexToFloatWithFastAlgorithm(z, j + 1, i2);
        if (Double.isNaN(fTryHexToFloatWithFastAlgorithm) || fTryHexToFloatWithFastAlgorithm2 != fTryHexToFloatWithFastAlgorithm) {
            return Float.NaN;
        }
        return fTryHexToFloatWithFastAlgorithm;
    }

    public static float tryDecToFloatWithFastAlgorithm(boolean z, long j, int i) {
        float f;
        if (-10 <= i && i <= 10 && Long.compare(j ^ Long.MIN_VALUE, 16777215 ^ Long.MIN_VALUE) <= 0) {
            float f2 = j;
            if (i < 0) {
                f = f2 / FLOAT_POWER_OF_TEN[-i];
            } else {
                f = f2 * FLOAT_POWER_OF_TEN[i];
            }
            return z ? -f : f;
        }
        int i2 = i + 325;
        long j2 = FastDoubleMath.MANTISSA_64[i2];
        long j3 = ((i * 217706) >> 16) + 191;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long j4 = j << iNumberOfLeadingZeros;
        FastDoubleMath.UInt128 uInt128FullMultiplication = FastDoubleMath.fullMultiplication(j4, j2);
        long j5 = uInt128FullMultiplication.low;
        long j6 = uInt128FullMultiplication.high;
        if ((j6 & 274877906943L) == 274877906943L && Long.compare((j5 + j4) ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) < 0) {
            FastDoubleMath.UInt128 uInt128FullMultiplication2 = FastDoubleMath.fullMultiplication(j4, FastDoubleMath.MANTISSA_128[i2]);
            long j7 = uInt128FullMultiplication2.low;
            long j8 = uInt128FullMultiplication2.high + j5;
            if (Long.compare(j8 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) < 0) {
                j6++;
            }
            if (j8 + 1 == 0 && (j6 & 549755813887L) == 549755813887L && j7 + Long.compare(j4 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0) {
                return Float.NaN;
            }
        }
        long j9 = j6 >>> 63;
        long j10 = j6 >>> ((int) (38 + j9));
        int i3 = iNumberOfLeadingZeros + ((int) (j9 ^ 1));
        long j11 = j6 & 274877906943L;
        if (j11 == 274877906943L || (j11 == 0 && (3 & j10) == 1)) {
            return Float.NaN;
        }
        long j12 = (j10 + 1) >>> 1;
        if (j12 >= 16777216) {
            i3--;
            j12 = SVG.SPECIFIED_MARKER_END;
        }
        long j13 = j12 & (-8388609);
        long j14 = j3 - i3;
        if (j14 < 1 || j14 > 254) {
            return Float.NaN;
        }
        return Float.intBitsToFloat((int) ((j14 << 23) | j13 | (z ? SVG.SPECIFIED_SOLID_COLOR : 0L)));
    }

    public static float tryHexToFloatWithFastAlgorithm(boolean z, long j, int i) {
        if (j == 0 || i < -180) {
            return z ? -0.0f : 0.0f;
        }
        if (i > 127) {
            return z ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        if (Long.compare(j ^ Long.MIN_VALUE, 9007199254740991L ^ Long.MIN_VALUE) > 0) {
            return Float.NaN;
        }
        float fScalb = j * Math.scalb(1.0f, i);
        return z ? -fScalb : fScalb;
    }
}
