package com.fasterxml.jackson.core.p022io.doubleparser;

/* loaded from: classes7.dex */
public abstract class AbstractFloatingPointBitsFromCharArray extends AbstractFloatValueParser {
    public static boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    public abstract long nan();

    public abstract long negativeInfinity();

    public abstract long positiveInfinity();

    public abstract long valueOfFloatLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public abstract long valueOfHexLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public final int skipWhitespace(char[] cArr, int i, int i2) {
        while (i < i2 && (cArr[i] & 255) <= 32) {
            i++;
        }
        return i;
    }

    public final long parseDecFloatLiteral(char[] cArr, int i, int i2, int i3, boolean z, boolean z2) {
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z3;
        int i8;
        int iTryToParseEightDigits;
        int i9 = -1;
        int i10 = i;
        long j2 = 0;
        char c2 = 0;
        boolean z4 = false;
        while (true) {
            c = '.';
            if (i10 >= i3) {
                break;
            }
            c2 = cArr[i10];
            if (!isDigit(c2)) {
                if (c2 != '.') {
                    break;
                }
                z4 |= i9 >= 0;
                int i11 = i10;
                while (i11 < i3 - 8 && (iTryToParseEightDigits = tryToParseEightDigits(cArr, i11 + 1)) >= 0) {
                    j2 = (j2 * 100000000) + iTryToParseEightDigits;
                    i11 += 8;
                }
                int i12 = i10;
                i10 = i11;
                i9 = i12;
            } else {
                j2 = ((j2 * 10) + c2) - 48;
            }
            i10++;
        }
        if (i9 < 0) {
            i4 = i10 - i;
            i9 = i10;
            i5 = 0;
        } else {
            i4 = (i10 - i) - 1;
            i5 = (i9 - i10) + 1;
        }
        if (c2 == 'e' || c2 == 'E') {
            i6 = i10 + 1;
            c2 = i6 < i3 ? cArr[i6] : (char) 0;
            boolean z5 = c2 == '-';
            if (z5 || c2 == '+') {
                i6 = i10 + 2;
                c2 = i6 < i3 ? cArr[i6] : (char) 0;
            }
            z4 |= !isDigit(c2);
            i7 = 0;
            do {
                if (i7 < 1024) {
                    i7 = ((i7 * 10) + c2) - 48;
                }
                i6++;
                c2 = i6 < i3 ? cArr[i6] : (char) 0;
            } while (isDigit(c2));
            if (z5) {
                i7 = -i7;
            }
            i5 += i7;
        } else {
            i6 = i10;
            i7 = 0;
        }
        char c3 = c2;
        int i13 = i5;
        if (i6 < i3 && (c3 == 'd' || c3 == 'D' || c3 == 'f' || c3 == 'F')) {
            i6++;
        }
        int iSkipWhitespace = skipWhitespace(cArr, i6, i3);
        if (z4 || iSkipWhitespace < i3) {
            return -1L;
        }
        if (!z2 && i4 == 0) {
            return -1L;
        }
        if (i4 > 19) {
            int i14 = i;
            long j3 = 0;
            int i15 = 0;
            while (i14 < i10) {
                char c4 = cArr[i14];
                if (c4 != c) {
                    if (Long.compare(j3 ^ Long.MIN_VALUE, AbstractFloatValueParser.MINIMAL_NINETEEN_DIGIT_INTEGER ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j3 = ((j3 * 10) + c4) - 48;
                } else {
                    i15++;
                }
                i14++;
                c = '.';
            }
            i8 = (i9 - i14) + i15 + i7;
            j = j3;
            z3 = i14 < i10;
        } else {
            j = j2;
            z3 = false;
            i8 = 0;
        }
        return valueOfFloatLiteral(cArr, i2, i3, z, j, i13, z3, i8);
    }

    public long parseFloatingPointLiteral(char[] cArr, int i, int i2) {
        int iSkipWhitespace;
        int i3;
        int i4 = i + i2;
        if (i < 0 || i4 > cArr.length || (iSkipWhitespace = skipWhitespace(cArr, i, i4)) == i4) {
            return -1L;
        }
        char c = cArr[iSkipWhitespace];
        boolean z = c == '-';
        if (z || c == '+') {
            iSkipWhitespace++;
            c = iSkipWhitespace < i4 ? cArr[iSkipWhitespace] : (char) 0;
            if (c == 0) {
                return -1L;
            }
        }
        if (c >= 'I') {
            if (c == 'N') {
                return parseNaN(cArr, iSkipWhitespace, i4);
            }
            return parseInfinity(cArr, iSkipWhitespace, i4, z);
        }
        boolean z2 = c == '0';
        if (z2) {
            int i5 = iSkipWhitespace + 1;
            char c2 = i5 < i4 ? cArr[i5] : (char) 0;
            if (c2 == 'x' || c2 == 'X') {
                return parseHexFloatLiteral(cArr, iSkipWhitespace + 2, i, i4, z);
            }
            i3 = i5;
        } else {
            i3 = iSkipWhitespace;
        }
        return parseDecFloatLiteral(cArr, i3, i, i4, z, z2);
    }

    public final long parseHexFloatLiteral(char[] cArr, int i, int i2, int i3, boolean z) {
        int i4;
        int iMin;
        int i5;
        char c;
        int i6;
        int i7;
        long j;
        boolean z2;
        int i8;
        int i9 = i;
        long j2 = 0;
        int i10 = -1;
        char c2 = 0;
        boolean z3 = false;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            c2 = cArr[i9];
            byte b = c2 > 127 ? (byte) -1 : AbstractFloatValueParser.CHAR_TO_HEX_MAP[c2];
            if (b < 0) {
                if (b != -4) {
                    break;
                }
                z3 |= i10 >= 0;
                i10 = i9;
            } else {
                j2 = (j2 << 4) | b;
            }
            i9++;
        }
        if (i10 < 0) {
            i4 = i9 - i;
            iMin = 0;
            i10 = i9;
        } else {
            i4 = (i9 - i) - 1;
            iMin = Math.min((i10 - i9) + 1, 1024) * 4;
        }
        boolean z4 = c2 == 'p' || c2 == 'P';
        if (z4) {
            i5 = i9 + 1;
            char c3 = i5 < i3 ? cArr[i5] : (char) 0;
            boolean z5 = c3 == '-';
            if (z5 || c3 == '+') {
                i5 = i9 + 2;
                c3 = i5 < i3 ? cArr[i5] : (char) 0;
            }
            boolean z6 = (!isDigit(c3)) | z3;
            int i11 = 0;
            do {
                if (i11 < 1024) {
                    i11 = ((i11 * 10) + c3) - 48;
                }
                i5++;
                c3 = i5 < i3 ? cArr[i5] : (char) 0;
            } while (isDigit(c3));
            if (z5) {
                i11 = -i11;
            }
            c = c3;
            i6 = iMin + i11;
            i7 = i11;
            z3 = z6;
        } else {
            i5 = i9;
            c = c2;
            i6 = iMin;
            i7 = 0;
        }
        if (i5 < i3 && (c == 'd' || c == 'D' || c == 'f' || c == 'F')) {
            i5++;
        }
        int iSkipWhitespace = skipWhitespace(cArr, i5, i3);
        if (z3 || iSkipWhitespace < i3 || i4 == 0 || !z4) {
            return -1L;
        }
        if (i4 > 16) {
            iSkipWhitespace = i;
            long j3 = 0;
            int i12 = 0;
            while (iSkipWhitespace < i9) {
                char c4 = cArr[iSkipWhitespace];
                byte b2 = c4 > 127 ? (byte) -1 : AbstractFloatValueParser.CHAR_TO_HEX_MAP[c4];
                if (b2 < 0) {
                    i12++;
                } else {
                    if (Long.compare(j3 ^ Long.MIN_VALUE, AbstractFloatValueParser.MINIMAL_NINETEEN_DIGIT_INTEGER ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j3 = (j3 << 4) | b2;
                }
                iSkipWhitespace++;
            }
            j = j3;
            i8 = i12;
            z2 = iSkipWhitespace < i9;
        } else {
            j = j2;
            z2 = false;
            i8 = 0;
        }
        return valueOfHexLiteral(cArr, i2, i3, z, j, i6, z2, (i10 - iSkipWhitespace) + i8 + i7);
    }

    public final long parseInfinity(char[] cArr, int i, int i2, boolean z) {
        int i3 = i + 7;
        if (i3 < i2 && cArr[i] == 'I' && cArr[i + 1] == 'n' && cArr[i + 2] == 'f' && cArr[i + 3] == 'i' && cArr[i + 4] == 'n' && cArr[i + 5] == 'i' && cArr[i + 6] == 't' && cArr[i3] == 'y' && skipWhitespace(cArr, i + 8, i2) == i2) {
            return z ? negativeInfinity() : positiveInfinity();
        }
        return -1L;
    }

    public final long parseNaN(char[] cArr, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && cArr[i + 1] == 'a' && cArr[i3] == 'N' && skipWhitespace(cArr, i + 3, i2) == i2) {
            return nan();
        }
        return -1L;
    }

    public final int tryToParseEightDigits(char[] cArr, int i) {
        return FastDoubleSwar.tryToParseEightDigitsUtf16(cArr, i);
    }
}
