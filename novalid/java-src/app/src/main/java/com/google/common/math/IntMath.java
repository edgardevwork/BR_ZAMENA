package com.google.common.math;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.GpsStatusWrapper;
import androidx.media3.exoplayer.audio.AudioTimestampPoller;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes7.dex */
public final class IntMath {

    @VisibleForTesting
    public static final int FLOOR_SQRT_MAX_INT = 46340;

    @VisibleForTesting
    public static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @VisibleForTesting
    public static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @VisibleForTesting
    public static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    @VisibleForTesting
    public static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, AudioTimestampPoller.SLOW_POLL_INTERVAL_US, 100000000, 1000000000};

    @VisibleForTesting
    public static final int[] halfPowersOf10 = {3, 31, TypedValues.AttributesType.TYPE_PATH_ROTATE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    public static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    @VisibleForTesting
    public static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, GpsStatusWrapper.QZSS_SVID_MIN, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static boolean isPowerOfTwo(int x) {
        return (x > 0) & ((x & (x + (-1))) == 0);
    }

    @VisibleForTesting
    public static int lessThanBranchFree(int x, int y) {
        return (~(~(x - y))) >>> 31;
    }

    public static int mean(int x, int y) {
        return (x & y) + ((x ^ y) >> 1);
    }

    public static int ceilingPowerOfTwo(int x) {
        MathPreconditions.checkPositive("x", x);
        if (x > 1073741824) {
            throw new ArithmeticException("ceilingPowerOfTwo(" + x + ") not representable as an int");
        }
        return 1 << (-Integer.numberOfLeadingZeros(x - 1));
    }

    public static int floorPowerOfTwo(int x) {
        MathPreconditions.checkPositive("x", x);
        return Integer.highestOneBit(x);
    }

    /* renamed from: com.google.common.math.IntMath$1 */
    public static /* synthetic */ class C75061 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int log2(int x, RoundingMode mode) {
        MathPreconditions.checkPositive("x", x);
        switch (C75061.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(x));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(x - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(x);
                return (31 - iNumberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, x);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(x);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static int log10(int x, RoundingMode mode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", x);
        int iLog10Floor = log10Floor(x);
        int i = powersOf10[iLog10Floor];
        switch (C75061.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(x == i);
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(i, x);
                return iLog10Floor + iLessThanBranchFree;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], x);
                return iLog10Floor + iLessThanBranchFree;
            default:
                throw new AssertionError();
        }
    }

    public static int log10Floor(int x) {
        byte b = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(x)];
        return b - lessThanBranchFree(x, powersOf10[b]);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static int pow(int b, int k) {
        MathPreconditions.checkNonNegative("exponent", k);
        if (b == -2) {
            if (k < 32) {
                return (k & 1) == 0 ? 1 << k : -(1 << k);
            }
            return 0;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            if (k < 32) {
                return 1 << k;
            }
            return 0;
        }
        int i = 1;
        while (k != 0) {
            if (k == 1) {
                return b * i;
            }
            i *= (k & 1) == 0 ? 1 : b;
            b *= b;
            k >>= 1;
        }
        return i;
    }

    @GwtIncompatible
    public static int sqrt(int x, RoundingMode mode) {
        int iLessThanBranchFree;
        MathPreconditions.checkNonNegative("x", x);
        int iSqrtFloor = sqrtFloor(x);
        switch (C75061.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iSqrtFloor * iSqrtFloor == x);
            case 2:
            case 3:
                return iSqrtFloor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(iSqrtFloor * iSqrtFloor, x);
                return iSqrtFloor + iLessThanBranchFree;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree((iSqrtFloor * iSqrtFloor) + iSqrtFloor, x);
                return iSqrtFloor + iLessThanBranchFree;
            default:
                throw new AssertionError();
        }
    }

    public static int sqrtFloor(int x) {
        return (int) Math.sqrt(x);
    }

    public static int divide(int p, int q, RoundingMode mode) {
        Preconditions.checkNotNull(mode);
        if (q == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i = p / q;
        int i2 = p - (q * i);
        if (i2 == 0) {
            return i;
        }
        int i3 = ((p ^ q) >> 31) | 1;
        switch (C75061.$SwitchMap$java$math$RoundingMode[mode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i2 == 0);
                return i;
            case 2:
                return i;
            case 3:
                if (i3 >= 0) {
                    return i;
                }
                break;
            case 4:
                break;
            case 5:
                if (i3 <= 0) {
                    return i;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i2);
                int iAbs2 = iAbs - (Math.abs(q) - iAbs);
                if (iAbs2 == 0) {
                    if (mode != RoundingMode.HALF_UP) {
                        if (!((mode == RoundingMode.HALF_EVEN) & ((i & 1) != 0))) {
                            return i;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i + i3;
    }

    public static int mod(int x, int m) {
        if (m <= 0) {
            throw new ArithmeticException("Modulus " + m + " must be > 0");
        }
        int i = x % m;
        return i >= 0 ? i : i + m;
    }

    public static int gcd(int a2, int b) {
        MathPreconditions.checkNonNegative("a", a2);
        MathPreconditions.checkNonNegative("b", b);
        if (a2 == 0) {
            return b;
        }
        if (b == 0) {
            return a2;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(a2);
        int iNumberOfTrailingZeros2 = a2 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(b);
        int i = b >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i) {
            int i2 = iNumberOfTrailingZeros2 - i;
            int i3 = (i2 >> 31) & i2;
            int i4 = (i2 - i3) - i3;
            i += i3;
            iNumberOfTrailingZeros2 = i4 >> Integer.numberOfTrailingZeros(i4);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static int checkedAdd(int a2, int b) {
        long j = a2 + b;
        int i = (int) j;
        MathPreconditions.checkNoOverflow(j == ((long) i), "checkedAdd", a2, b);
        return i;
    }

    public static int checkedSubtract(int a2, int b) {
        long j = a2 - b;
        int i = (int) j;
        MathPreconditions.checkNoOverflow(j == ((long) i), "checkedSubtract", a2, b);
        return i;
    }

    public static int checkedMultiply(int a2, int b) {
        long j = a2 * b;
        int i = (int) j;
        MathPreconditions.checkNoOverflow(j == ((long) i), "checkedMultiply", a2, b);
        return i;
    }

    public static int checkedPow(int b, int k) {
        MathPreconditions.checkNonNegative("exponent", k);
        if (b == -2) {
            MathPreconditions.checkNoOverflow(k < 32, "checkedPow", b, k);
            return (k & 1) == 0 ? 1 << k : (-1) << k;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            MathPreconditions.checkNoOverflow(k < 31, "checkedPow", b, k);
            return 1 << k;
        }
        int iCheckedMultiply = 1;
        while (k != 0) {
            if (k == 1) {
                return checkedMultiply(iCheckedMultiply, b);
            }
            if ((k & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, b);
            }
            k >>= 1;
            if (k > 0) {
                MathPreconditions.checkNoOverflow((-46340 <= b) & (b <= 46340), "checkedPow", b, k);
                b *= b;
            }
        }
        return iCheckedMultiply;
    }

    public static int saturatedAdd(int a2, int b) {
        return Ints.saturatedCast(a2 + b);
    }

    public static int saturatedSubtract(int a2, int b) {
        return Ints.saturatedCast(a2 - b);
    }

    public static int saturatedMultiply(int a2, int b) {
        return Ints.saturatedCast(a2 * b);
    }

    public static int saturatedPow(int b, int k) {
        MathPreconditions.checkNonNegative("exponent", k);
        if (b == -2) {
            return k >= 32 ? (k & 1) + Integer.MAX_VALUE : (k & 1) == 0 ? 1 << k : (-1) << k;
        }
        if (b == -1) {
            return (k & 1) == 0 ? 1 : -1;
        }
        if (b == 0) {
            return k == 0 ? 1 : 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            if (k >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << k;
        }
        int i = ((b >>> 31) & k & 1) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (k != 0) {
            if (k == 1) {
                return saturatedMultiply(iSaturatedMultiply, b);
            }
            if ((k & 1) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, b);
            }
            k >>= 1;
            if (k > 0) {
                if ((-46340 > b) || (b > 46340)) {
                    return i;
                }
                b *= b;
            }
        }
        return iSaturatedMultiply;
    }

    public static int factorial(int n) {
        MathPreconditions.checkNonNegative("n", n);
        int[] iArr = factorials;
        if (n < iArr.length) {
            return iArr[n];
        }
        return Integer.MAX_VALUE;
    }

    public static int binomial(int n, int k) {
        MathPreconditions.checkNonNegative("n", n);
        MathPreconditions.checkNonNegative("k", k);
        int i = 0;
        Preconditions.checkArgument(k <= n, "k (%s) > n (%s)", k, n);
        if (k > (n >> 1)) {
            k = n - k;
        }
        int[] iArr = biggestBinomials;
        if (k >= iArr.length || n > iArr[k]) {
            return Integer.MAX_VALUE;
        }
        if (k == 0) {
            return 1;
        }
        if (k == 1) {
            return n;
        }
        long j = 1;
        while (i < k) {
            long j2 = j * (n - i);
            i++;
            j = j2 / i;
        }
        return (int) j;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static boolean isPrime(int n) {
        return LongMath.isPrime(n);
    }
}
