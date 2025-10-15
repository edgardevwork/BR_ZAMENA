package com.fasterxml.jackson.core.p022io.doubleparser;

/* loaded from: classes8.dex */
public class FastFloatParser {
    public static float parseFloat(CharSequence charSequence) throws NumberFormatException {
        return parseFloat(charSequence, 0, charSequence.length());
    }

    public static float parseFloat(CharSequence charSequence, int i, int i2) throws NumberFormatException {
        long floatingPointLiteral = new FloatBitsFromCharSequence().parseFloatingPointLiteral(charSequence, i, i2);
        if (floatingPointLiteral == -1) {
            throw new NumberFormatException("Illegal input");
        }
        return Float.intBitsToFloat((int) floatingPointLiteral);
    }

    public static float parseFloat(char[] cArr) throws NumberFormatException {
        return parseFloat(cArr, 0, cArr.length);
    }

    public static float parseFloat(char[] cArr, int i, int i2) throws NumberFormatException {
        long floatingPointLiteral = new FloatBitsFromCharArray().parseFloatingPointLiteral(cArr, i, i2);
        if (floatingPointLiteral == -1) {
            throw new NumberFormatException("Illegal input");
        }
        return Float.intBitsToFloat((int) floatingPointLiteral);
    }

    public static long parseFloatBits(CharSequence charSequence, int i, int i2) {
        return new FloatBitsFromCharSequence().parseFloatingPointLiteral(charSequence, i, i2);
    }

    public static long parseFloatBits(char[] cArr, int i, int i2) {
        return new FloatBitsFromCharArray().parseFloatingPointLiteral(cArr, i, i2);
    }
}
