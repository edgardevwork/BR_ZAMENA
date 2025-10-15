package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes7.dex */
public final class DoubleMath {

    @VisibleForTesting
    public static final int MAX_FACTORIAL = 170;
    public static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    public static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    public static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    public static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    public static final double LN_2 = Math.log(2.0d);

    @VisibleForTesting
    public static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    @J2ktIncompatible
    @GwtIncompatible
    public static double roundIntermediate(double x, RoundingMode mode) {
        if (!DoubleUtils.isFinite(x)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C75051.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(x));
                return x;
            case 2:
                return (x >= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) - 1;
            case 3:
                return (x <= 0.0d || isMathematicalInteger(x)) ? x : ((long) x) + 1;
            case 4:
                return x;
            case 5:
                if (isMathematicalInteger(x)) {
                    return x;
                }
                return ((long) x) + (x > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(x);
            case 7:
                double dRint = Math.rint(x);
                return Math.abs(x - dRint) == 0.5d ? x + Math.copySign(0.5d, x) : dRint;
            case 8:
                double dRint2 = Math.rint(x);
                return Math.abs(x - dRint2) == 0.5d ? x : dRint2;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.math.DoubleMath$1 */
    public static /* synthetic */ class C75051 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static int roundToInt(double x, RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x, mode);
        MathPreconditions.checkInRangeForRoundingInputs((dRoundIntermediate > -2.147483649E9d) & (dRoundIntermediate < 2.147483648E9d), x, mode);
        return (int) dRoundIntermediate;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static long roundToLong(double x, RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x, mode);
        MathPreconditions.checkInRangeForRoundingInputs(((-9.223372036854776E18d) - dRoundIntermediate < 1.0d) & (dRoundIntermediate < 9.223372036854776E18d), x, mode);
        return (long) dRoundIntermediate;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static BigInteger roundToBigInteger(double x, RoundingMode mode) {
        double dRoundIntermediate = roundIntermediate(x, mode);
        if (((-9.223372036854776E18d) - dRoundIntermediate < 1.0d) & (dRoundIntermediate < 9.223372036854776E18d)) {
            return BigInteger.valueOf((long) dRoundIntermediate);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(DoubleUtils.getSignificand(dRoundIntermediate)).shiftLeft(Math.getExponent(dRoundIntermediate) - 52);
        return dRoundIntermediate < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean isPowerOfTwo(double x) {
        if (x <= 0.0d || !DoubleUtils.isFinite(x)) {
            return false;
        }
        long significand = DoubleUtils.getSignificand(x);
        return (significand & (significand - 1)) == 0;
    }

    public static double log2(double x) {
        return Math.log(x) / LN_2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @J2ktIncompatible
    @GwtIncompatible
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int log2(double x, RoundingMode mode) {
        boolean zIsPowerOfTwo;
        Preconditions.checkArgument(x > 0.0d && DoubleUtils.isFinite(x), "x must be positive and finite");
        int exponent = Math.getExponent(x);
        if (!DoubleUtils.isNormal(x)) {
            return log2(x * 4.503599627370496E15d, mode) - 52;
        }
        switch (C75051.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x));
                return !z ? exponent + 1 : exponent;
            case 2:
                if (!z) {
                }
                break;
            case 3:
                z = !isPowerOfTwo(x);
                if (!z) {
                }
                break;
            case 4:
                z = exponent < 0;
                zIsPowerOfTwo = isPowerOfTwo(x);
                z &= !zIsPowerOfTwo;
                if (!z) {
                }
                break;
            case 5:
                z = exponent >= 0;
                zIsPowerOfTwo = isPowerOfTwo(x);
                z &= !zIsPowerOfTwo;
                if (!z) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double dScaleNormalize = DoubleUtils.scaleNormalize(x);
                if (dScaleNormalize * dScaleNormalize > 2.0d) {
                    z = true;
                }
                if (!z) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double x) {
        return DoubleUtils.isFinite(x) && (x == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(x)) <= Math.getExponent(x));
    }

    public static double factorial(int n) {
        MathPreconditions.checkNonNegative("n", n);
        if (n > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        for (int i = (n & (-16)) + 1; i <= n; i++) {
            d *= i;
        }
        return d * everySixteenthFactorial[n >> 4];
    }

    public static boolean fuzzyEquals(double a2, double b, double tolerance) {
        MathPreconditions.checkNonNegative("tolerance", tolerance);
        return Math.copySign(a2 - b, 1.0d) <= tolerance || a2 == b || (Double.isNaN(a2) && Double.isNaN(b));
    }

    public static int fuzzyCompare(double a2, double b, double tolerance) {
        if (fuzzyEquals(a2, b, tolerance)) {
            return 0;
        }
        if (a2 < b) {
            return -1;
        }
        if (a2 > b) {
            return 1;
        }
        return Booleans.compare(Double.isNaN(a2), Double.isNaN(b));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static double mean(double... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values[0]);
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            checkFinite(values[i]);
            j++;
            dCheckFinite += (values[i] - dCheckFinite) / j;
        }
        return dCheckFinite;
    }

    @Deprecated
    public static double mean(int... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : values) {
            j += i;
        }
        return j / values.length;
    }

    @Deprecated
    public static double mean(long... values) {
        Preconditions.checkArgument(values.length > 0, "Cannot take mean of 0 values");
        double d = values[0];
        long j = 1;
        for (int i = 1; i < values.length; i++) {
            j++;
            d += (values[i] - d) / j;
        }
        return d;
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static double mean(Iterable<? extends Number> values) {
        return mean(values.iterator());
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static double mean(Iterator<? extends Number> values) {
        Preconditions.checkArgument(values.hasNext(), "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(values.next().doubleValue());
        long j = 1;
        while (values.hasNext()) {
            j++;
            dCheckFinite += (checkFinite(values.next().doubleValue()) - dCheckFinite) / j;
        }
        return dCheckFinite;
    }

    @CanIgnoreReturnValue
    @J2ktIncompatible
    @GwtIncompatible
    public static double checkFinite(double argument) {
        Preconditions.checkArgument(DoubleUtils.isFinite(argument));
        return argument;
    }
}
