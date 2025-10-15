package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes8.dex */
public final class UnsignedInts {
    public static final long INT_MASK = 4294967295L;

    public static int flip(int value) {
        return value ^ Integer.MIN_VALUE;
    }

    public static int saturatedCast(long value) {
        if (value <= 0) {
            return 0;
        }
        if (value >= 4294967296L) {
            return -1;
        }
        return (int) value;
    }

    public static long toLong(int value) {
        return value & 4294967295L;
    }

    public static int compare(int a2, int b) {
        return Ints.compare(flip(a2), flip(b));
    }

    public static int checkedCast(long value) {
        Preconditions.checkArgument((value >> 32) == 0, "out of range: %s", value);
        return (int) value;
    }

    public static int min(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int iFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            int iFlip2 = flip(array[i]);
            if (iFlip2 < iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static int max(int... array) {
        Preconditions.checkArgument(array.length > 0);
        int iFlip = flip(array[0]);
        for (int i = 1; i < array.length; i++) {
            int iFlip2 = flip(array[i]);
            if (iFlip2 > iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static String join(String separator, int... array) {
        Preconditions.checkNotNull(separator);
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(array.length * 5);
        sb.append(toString(array[0]));
        for (int i = 1; i < array.length; i++) {
            sb.append(separator);
            sb.append(toString(array[i]));
        }
        return sb.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] left, int[] right) {
            int iMin = Math.min(left.length, right.length);
            for (int i = 0; i < iMin; i++) {
                int i2 = left[i];
                int i3 = right[i];
                if (i2 != i3) {
                    return UnsignedInts.compare(i2, i3);
                }
            }
            return left.length - right.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    public static void sort(int[] array) {
        Preconditions.checkNotNull(array);
        sort(array, 0, array.length);
    }

    public static void sort(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = flip(array[i]);
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = flip(array[fromIndex]);
            fromIndex++;
        }
    }

    public static void sortDescending(int[] array) {
        Preconditions.checkNotNull(array);
        sortDescending(array, 0, array.length);
    }

    public static void sortDescending(int[] array, int fromIndex, int toIndex) {
        Preconditions.checkNotNull(array);
        Preconditions.checkPositionIndexes(fromIndex, toIndex, array.length);
        for (int i = fromIndex; i < toIndex; i++) {
            array[i] = Integer.MAX_VALUE ^ array[i];
        }
        Arrays.sort(array, fromIndex, toIndex);
        while (fromIndex < toIndex) {
            array[fromIndex] = array[fromIndex] ^ Integer.MAX_VALUE;
            fromIndex++;
        }
    }

    public static int divide(int dividend, int divisor) {
        return (int) (toLong(dividend) / toLong(divisor));
    }

    public static int remainder(int dividend, int divisor) {
        return (int) (toLong(dividend) % toLong(divisor));
    }

    @CanIgnoreReturnValue
    public static int decode(String stringValue) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(stringValue);
        try {
            return parseUnsignedInt(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + stringValue);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String s) {
        return parseUnsignedInt(s, 10);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String string, int radix) throws NumberFormatException {
        Preconditions.checkNotNull(string);
        long j = Long.parseLong(string, radix);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException("Input " + string + " in base " + radix + " is not in the range of an unsigned integer");
    }

    public static String toString(int x) {
        return toString(x, 10);
    }

    public static String toString(int x, int radix) {
        return Long.toString(x & 4294967295L, radix);
    }
}
