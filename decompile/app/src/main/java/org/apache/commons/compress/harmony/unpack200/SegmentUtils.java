package org.apache.commons.compress.harmony.unpack200;

/* loaded from: classes7.dex */
public final class SegmentUtils {
    public static int countArgs(String str) {
        return countArgs(str, 1);
    }

    public static int countInvokeInterfaceArgs(String str) {
        return countArgs(str, 2);
    }

    public static int countArgs(String str, int i) {
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(41);
        if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf2 < iIndexOf) {
            throw new IllegalArgumentException("No arguments");
        }
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = iIndexOf + 1; i3 < iIndexOf2; i3++) {
            char cCharAt = str.charAt(i3);
            if (z && cCharAt == ';') {
                z = false;
                z2 = false;
            } else if (!z && cCharAt == 'L') {
                i2++;
                z = true;
            } else if (cCharAt == '[') {
                z2 = true;
            } else if (!z) {
                if (z2) {
                    i2++;
                    z2 = false;
                } else {
                    i2 = (cCharAt == 'D' || cCharAt == 'J') ? i2 + i : i2 + 1;
                }
            }
        }
        return i2;
    }

    public static int countMatches(long[] jArr, IMatcher iMatcher) {
        int i = 0;
        for (long j : jArr) {
            if (iMatcher.matches(j)) {
                i++;
            }
        }
        return i;
    }

    public static int countBit16(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if ((i2 & 65536) != 0) {
                i++;
            }
        }
        return i;
    }

    public static int countBit16(long[] jArr) {
        int i = 0;
        for (long j : jArr) {
            if ((j & 65536) != 0) {
                i++;
            }
        }
        return i;
    }

    public static int countBit16(long[][] jArr) {
        int i = 0;
        for (long[] jArr2 : jArr) {
            for (long j : jArr2) {
                if ((j & 65536) != 0) {
                    i++;
                }
            }
        }
        return i;
    }

    public static int countMatches(long[][] jArr, IMatcher iMatcher) {
        int iCountMatches = 0;
        for (long[] jArr2 : jArr) {
            iCountMatches += countMatches(jArr2, iMatcher);
        }
        return iCountMatches;
    }
}
