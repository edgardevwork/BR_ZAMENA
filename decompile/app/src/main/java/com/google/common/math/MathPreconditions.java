package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes7.dex */
public final class MathPreconditions {
    @CanIgnoreReturnValue
    public static int checkPositive(String role, int x) {
        if (x > 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    @CanIgnoreReturnValue
    public static long checkPositive(String role, long x) {
        if (x > 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    @CanIgnoreReturnValue
    public static BigInteger checkPositive(String role, BigInteger x) {
        if (x.signum() > 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    @CanIgnoreReturnValue
    public static int checkNonNegative(String role, int x) {
        if (x >= 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static long checkNonNegative(String role, long x) {
        if (x >= 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static BigInteger checkNonNegative(String role, BigInteger x) {
        if (x.signum() >= 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    @CanIgnoreReturnValue
    public static double checkNonNegative(String role, double x) {
        if (x >= 0.0d) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    public static void checkRoundingUnnecessary(boolean condition) {
        if (!condition) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void checkInRangeForRoundingInputs(boolean condition, double input, RoundingMode mode) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + input + " and rounding mode " + mode);
    }

    public static void checkNoOverflow(boolean condition, String methodName, int a2, int b) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + "(" + a2 + ", " + b + ")");
    }

    public static void checkNoOverflow(boolean condition, String methodName, long a2, long b) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + "(" + a2 + ", " + b + ")");
    }
}
