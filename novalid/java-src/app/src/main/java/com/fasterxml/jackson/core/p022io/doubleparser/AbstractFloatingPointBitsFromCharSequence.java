package com.fasterxml.jackson.core.p022io.doubleparser;

/* loaded from: classes7.dex */
public abstract class AbstractFloatingPointBitsFromCharSequence extends AbstractFloatValueParser {
    private boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    public abstract long nan();

    public abstract long negativeInfinity();

    public abstract long positiveInfinity();

    public abstract long valueOfFloatLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public abstract long valueOfHexLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public final long parseDecFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
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
        char cCharAt = 0;
        boolean z4 = false;
        while (true) {
            c = '.';
            if (i10 >= i3) {
                break;
            }
            cCharAt = charSequence.charAt(i10);
            if (!isDigit(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                z4 |= i9 >= 0;
                int i11 = i10;
                while (i11 < i3 - 8 && (iTryToParseEightDigits = tryToParseEightDigits(charSequence, i11 + 1)) >= 0) {
                    j2 = (j2 * 100000000) + iTryToParseEightDigits;
                    i11 += 8;
                }
                int i12 = i10;
                i10 = i11;
                i9 = i12;
            } else {
                j2 = ((j2 * 10) + cCharAt) - 48;
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
        if (cCharAt == 'e' || cCharAt == 'E') {
            i6 = i10 + 1;
            cCharAt = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            boolean z5 = cCharAt == '-';
            if (z5 || cCharAt == '+') {
                i6 = i10 + 2;
                cCharAt = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            }
            z4 |= !isDigit(cCharAt);
            i7 = 0;
            do {
                if (i7 < 1024) {
                    i7 = ((i7 * 10) + cCharAt) - 48;
                }
                i6++;
                cCharAt = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            } while (isDigit(cCharAt));
            if (z5) {
                i7 = -i7;
            }
            i5 += i7;
        } else {
            i6 = i10;
            i7 = 0;
        }
        char c2 = cCharAt;
        int i13 = i5;
        if (i6 < i3 && (c2 == 'd' || c2 == 'D' || c2 == 'f' || c2 == 'F')) {
            i6++;
        }
        int iSkipWhitespace = skipWhitespace(charSequence, i6, i3);
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
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 != c) {
                    if (Long.compare(j3 ^ Long.MIN_VALUE, AbstractFloatValueParser.MINIMAL_NINETEEN_DIGIT_INTEGER ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j3 = ((j3 * 10) + cCharAt2) - 48;
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
        return valueOfFloatLiteral(charSequence, i2, i3, z, j, i13, z3, i8);
    }

    public long parseFloatingPointLiteral(CharSequence charSequence, int i, int i2) {
        int iSkipWhitespace;
        int i3;
        int i4 = i + i2;
        if (i < 0 || i4 > charSequence.length() || (iSkipWhitespace = skipWhitespace(charSequence, i, i4)) == i4) {
            return -1L;
        }
        char cCharAt = charSequence.charAt(iSkipWhitespace);
        boolean z = cCharAt == '-';
        if (z || cCharAt == '+') {
            iSkipWhitespace++;
            cCharAt = iSkipWhitespace < i4 ? charSequence.charAt(iSkipWhitespace) : (char) 0;
            if (cCharAt == 0) {
                return -1L;
            }
        }
        if (cCharAt >= 'I') {
            if (cCharAt == 'N') {
                return parseNaN(charSequence, iSkipWhitespace, i4);
            }
            return parseInfinity(charSequence, iSkipWhitespace, i4, z);
        }
        boolean z2 = cCharAt == '0';
        if (z2) {
            int i5 = iSkipWhitespace + 1;
            char cCharAt2 = i5 < i4 ? charSequence.charAt(i5) : (char) 0;
            if (cCharAt2 == 'x' || cCharAt2 == 'X') {
                return parseHexFloatLiteral(charSequence, iSkipWhitespace + 2, i, i4, z);
            }
            i3 = i5;
        } else {
            i3 = iSkipWhitespace;
        }
        return parseDecFloatLiteral(charSequence, i3, i, i4, z, z2);
    }

    public final long parseHexFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        int i4;
        int iMin;
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        char cCharAt;
        long j;
        boolean z4;
        int i8;
        int i9 = i;
        long j2 = 0;
        int i10 = -1;
        char cCharAt2 = 0;
        boolean z5 = false;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            cCharAt2 = charSequence.charAt(i9);
            byte b = cCharAt2 > 127 ? (byte) -1 : AbstractFloatValueParser.CHAR_TO_HEX_MAP[cCharAt2];
            if (b < 0) {
                if (b != -4) {
                    break;
                }
                z5 |= i10 >= 0;
                i10 = i9;
            } else {
                j2 = (j2 << 4) | b;
            }
            i9++;
        }
        if (i10 < 0) {
            i4 = i9 - i;
            i10 = i9;
            iMin = 0;
        } else {
            i4 = (i9 - i) - 1;
            iMin = Math.min((i10 - i9) + 1, 1024) * 4;
        }
        boolean z6 = cCharAt2 == 'p' || cCharAt2 == 'P';
        if (z6) {
            int i11 = i9 + 1;
            char cCharAt3 = i11 < i3 ? charSequence.charAt(i11) : (char) 0;
            boolean z7 = cCharAt3 == '-';
            if (z7 || cCharAt3 == '+') {
                i11 = i9 + 2;
                cCharAt3 = i11 < i3 ? charSequence.charAt(i11) : (char) 0;
            }
            boolean z8 = (!isDigit(cCharAt3)) | z5;
            int i12 = 1024;
            i6 = 0;
            while (true) {
                if (i6 < i12) {
                    i6 = ((i6 * 10) + cCharAt3) - 48;
                }
                z2 = true;
                i11++;
                cCharAt = i11 < i3 ? charSequence.charAt(i11) : (char) 0;
                if (!isDigit(cCharAt)) {
                    break;
                }
                cCharAt3 = cCharAt;
                i12 = 1024;
            }
            if (z7) {
                i6 = -i6;
            }
            int i13 = iMin + i6;
            z3 = z8;
            i5 = i11;
            i7 = i13;
        } else {
            z2 = true;
            i5 = i9;
            i6 = 0;
            char c = cCharAt2;
            i7 = iMin;
            z3 = z5;
            cCharAt = c;
        }
        if (i5 < i3 && (cCharAt == 'd' || cCharAt == 'D' || cCharAt == 'f' || cCharAt == 'F')) {
            i5++;
        }
        int iSkipWhitespace = skipWhitespace(charSequence, i5, i3);
        if (z3 || iSkipWhitespace < i3 || i4 == 0 || !z6) {
            return -1L;
        }
        if (i4 > 16) {
            iSkipWhitespace = i;
            int i14 = 0;
            long j3 = 0;
            while (iSkipWhitespace < i9) {
                char cCharAt4 = charSequence.charAt(iSkipWhitespace);
                byte b2 = cCharAt4 > 127 ? (byte) -1 : AbstractFloatValueParser.CHAR_TO_HEX_MAP[cCharAt4];
                if (b2 < 0) {
                    i14++;
                } else {
                    if (Long.compare(j3 ^ Long.MIN_VALUE, AbstractFloatValueParser.MINIMAL_NINETEEN_DIGIT_INTEGER ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j3 = (j3 << 4) | b2;
                }
                iSkipWhitespace++;
            }
            if (iSkipWhitespace >= i9) {
                z2 = false;
            }
            i8 = i14;
            j = j3;
            z4 = z2;
        } else {
            j = j2;
            z4 = false;
            i8 = 0;
        }
        return valueOfHexLiteral(charSequence, i2, i3, z, j, i7, z4, (i10 - iSkipWhitespace) + i8 + i6);
    }

    public final long parseInfinity(CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = i + 7;
        if (i3 < i2 && charSequence.charAt(i) == 'I' && charSequence.charAt(i + 1) == 'n' && charSequence.charAt(i + 2) == 'f' && charSequence.charAt(i + 3) == 'i' && charSequence.charAt(i + 4) == 'n' && charSequence.charAt(i + 5) == 'i' && charSequence.charAt(i + 6) == 't' && charSequence.charAt(i3) == 'y' && skipWhitespace(charSequence, i + 8, i2) == i2) {
            return z ? negativeInfinity() : positiveInfinity();
        }
        return -1L;
    }

    public final long parseNaN(CharSequence charSequence, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && charSequence.charAt(i + 1) == 'a' && charSequence.charAt(i3) == 'N' && skipWhitespace(charSequence, i + 3, i2) == i2) {
            return nan();
        }
        return -1L;
    }

    public final int skipWhitespace(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    public final int tryToParseEightDigits(CharSequence charSequence, int i) {
        return FastDoubleSwar.tryToParseEightDigitsUtf16(charSequence.charAt(i) | (charSequence.charAt(i + 1) << 16) | (charSequence.charAt(i + 2) << 32) | (charSequence.charAt(i + 3) << 48), (charSequence.charAt(i + 7) << 48) | charSequence.charAt(i + 4) | (charSequence.charAt(i + 5) << 16) | (charSequence.charAt(i + 6) << 32));
    }
}
