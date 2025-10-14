package com.fasterxml.jackson.core.p022io;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.math.BigDecimal;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class BigDecimalParser {
    public static final int MAX_CHARS_TO_REPORT = 1000;

    public static BigDecimal parse(String str) {
        return parse(str.toCharArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BigDecimal parse(char[] cArr, int i, int i2) {
        String message;
        String str;
        try {
            if (i2 < 500) {
                return new BigDecimal(cArr, i, i2);
            }
            return parseBigDecimal(cArr, i, i2, i2 / 10);
        } catch (ArithmeticException e) {
            e = e;
            message = e.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (i2 > 1000) {
                str = new String(cArr, i, i2);
            } else {
                str = new String(Arrays.copyOfRange(cArr, i, 1000)) + "(truncated, full length is " + cArr.length + " chars)";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        } catch (NumberFormatException e2) {
            e = e2;
            message = e.getMessage();
            if (message == null) {
            }
            if (i2 > 1000) {
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        }
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2, int i3) throws NumberFormatException {
        int i4;
        int i5;
        BigDecimal bigDecimalRec;
        int i6 = i + i2;
        int i7 = i;
        int i8 = i7;
        int i9 = -1;
        int i10 = -1;
        int iAdjustScale = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i7 < i6) {
            char c = cArr[i7];
            if (c != '+') {
                if (c == 'E' || c == 'e') {
                    if (i9 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i9 = i7;
                } else if (c != '-') {
                    if (c != '.') {
                        if (i10 >= 0 && i9 == -1) {
                            iAdjustScale++;
                        }
                    } else {
                        if (i10 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i10 = i7;
                    }
                } else if (i9 >= 0) {
                    if (z2) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z2 = true;
                } else {
                    if (z) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i8 = i7 + 1;
                    z = true;
                    z3 = true;
                }
            } else if (i9 >= 0) {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z2 = true;
            } else {
                if (z) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i8 = i7 + 1;
                z = true;
            }
            i7++;
        }
        if (i9 >= 0) {
            i4 = 1;
            i5 = Integer.parseInt(new String(cArr, i9 + 1, (i6 - i9) - 1));
            iAdjustScale = adjustScale(iAdjustScale, i5);
            i6 = i9;
        } else {
            i4 = 1;
            i5 = 0;
        }
        if (i10 >= 0) {
            int i11 = (i6 - i10) - i4;
            bigDecimalRec = toBigDecimalRec(cArr, i8, i10 - i8, i5, i3).add(toBigDecimalRec(cArr, i10 + i4, i11, i5 - i11, i3));
        } else {
            bigDecimalRec = toBigDecimalRec(cArr, i8, i6 - i8, i5, i3);
        }
        if (iAdjustScale != 0) {
            bigDecimalRec = bigDecimalRec.setScale(iAdjustScale);
        }
        return z3 ? bigDecimalRec.negate() : bigDecimalRec;
    }

    public static int adjustScale(int i, long j) {
        long j2 = i - j;
        if (j2 <= ParserMinimalBase.MAX_INT_L && j2 >= ParserMinimalBase.MIN_INT_L) {
            return (int) j2;
        }
        throw new NumberFormatException("Scale out of range: " + j2 + " while adjusting scale " + i + " to exponent " + j);
    }

    public static BigDecimal toBigDecimalRec(char[] cArr, int i, int i2, int i3, int i4) {
        if (i2 <= i4) {
            return i2 == 0 ? BigDecimal.ZERO : new BigDecimal(cArr, i, i2).movePointRight(i3);
        }
        int i5 = i2 / 2;
        return toBigDecimalRec(cArr, i, i5, (i3 + i2) - i5, i4).add(toBigDecimalRec(cArr, i + i5, i2 - i5, i3, i4));
    }
}
