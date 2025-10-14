package com.fasterxml.jackson.core.p022io.doubleparser;

/* loaded from: classes8.dex */
public class FastDoubleParser {
    public static double parseDouble(CharSequence charSequence) throws NumberFormatException {
        return parseDouble(charSequence, 0, charSequence.length());
    }

    public static double parseDouble(CharSequence charSequence, int i, int i2) throws NumberFormatException {
        long floatingPointLiteral = new DoubleBitsFromCharSequence().parseFloatingPointLiteral(charSequence, i, i2);
        if (floatingPointLiteral == -1) {
            throw new NumberFormatException("Illegal input");
        }
        return Double.longBitsToDouble(floatingPointLiteral);
    }

    public static double parseDouble(char[] cArr) throws NumberFormatException {
        return parseDouble(cArr, 0, cArr.length);
    }

    public static double parseDouble(char[] cArr, int i, int i2) throws NumberFormatException {
        long floatingPointLiteral = new DoubleBitsFromCharArray().parseFloatingPointLiteral(cArr, i, i2);
        if (floatingPointLiteral == -1) {
            throw new NumberFormatException("Illegal input");
        }
        return Double.longBitsToDouble(floatingPointLiteral);
    }

    public static long parseDoubleBits(CharSequence charSequence, int i, int i2) {
        return new DoubleBitsFromCharSequence().parseFloatingPointLiteral(charSequence, i, i2);
    }

    public static long parseDoubleBits(char[] cArr, int i, int i2) {
        return new DoubleBitsFromCharArray().parseFloatingPointLiteral(cArr, i, i2);
    }
}
