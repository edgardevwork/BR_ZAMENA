package org.apache.commons.compress.compressors.bzip2;

import java.util.Arrays;
import java.util.BitSet;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

/* loaded from: classes6.dex */
public class BlockSort {
    public static final int CLEARMASK = -2097153;
    public static final int DEPTH_THRESH = 10;
    public static final int FALLBACK_QSORT_SMALL_THRESH = 10;
    public static final int FALLBACK_QSORT_STACK_SIZE = 100;
    public static final int FTAB_LENGTH = 65537;
    public static final int QSORT_STACK_SIZE = 1000;
    public static final int SETMASK = 2097152;
    public static final int SMALL_THRESH = 20;
    public static final int WORK_FACTOR = 30;
    public int[] eclass;
    public boolean firstAttempt;
    public final int[] ftab;
    public final boolean[] mainSort_bigDone;
    public final int[] mainSort_copy;
    public final int[] mainSort_runningOrder;
    public final char[] quadrant;
    public final int[] stack_dd;
    public final int[] stack_hh;
    public final int[] stack_ll;
    public int workDone;
    public int workLimit;
    public static final int STACK_SIZE = Math.max(1000, 100);
    public static final int[] INCS = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161, 2391484};

    public static int med3(int i, int i2, int i3) {
        if (i < i2) {
            if (i2 >= i3) {
                if (i >= i3) {
                    return i;
                }
                return i3;
            }
            return i2;
        }
        if (i2 <= i3) {
            if (i <= i3) {
                return i;
            }
            return i3;
        }
        return i2;
    }

    public BlockSort(BZip2CompressorOutputStream.Data data) {
        int i = STACK_SIZE;
        this.stack_ll = new int[i];
        this.stack_hh = new int[i];
        this.stack_dd = new int[1000];
        this.mainSort_runningOrder = new int[256];
        this.mainSort_copy = new int[256];
        this.mainSort_bigDone = new boolean[256];
        this.ftab = new int[FTAB_LENGTH];
        this.quadrant = data.sfmap;
    }

    public void blockSort(BZip2CompressorOutputStream.Data data, int i) {
        this.workLimit = i * 30;
        this.workDone = 0;
        this.firstAttempt = true;
        if (i + 1 < 10000) {
            fallbackSort(data, i);
        } else {
            mainSort(data, i);
            if (this.firstAttempt && this.workDone > this.workLimit) {
                fallbackSort(data, i);
            }
        }
        int[] iArr = data.fmap;
        data.origPtr = -1;
        for (int i2 = 0; i2 <= i; i2++) {
            if (iArr[i2] == 0) {
                data.origPtr = i2;
                return;
            }
        }
    }

    public final void fallbackSort(BZip2CompressorOutputStream.Data data, int i) {
        byte[] bArr = data.block;
        int i2 = i + 1;
        bArr[0] = bArr[i2];
        fallbackSort(data.fmap, bArr, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            data.fmap[i3] = r2[i3] - 1;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int[] iArr = data.fmap;
            if (iArr[i4] == -1) {
                iArr[i4] = i;
                return;
            }
        }
    }

    public final void fallbackSimpleSort(int[] iArr, int[] iArr2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 - i > 3) {
            for (int i3 = i2 - 4; i3 >= i; i3--) {
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                int i6 = i3 + 4;
                while (i6 <= i2) {
                    int i7 = iArr[i6];
                    if (i5 > iArr2[i7]) {
                        iArr[i6 - 4] = i7;
                        i6 += 4;
                    }
                }
                iArr[i6 - 4] = i4;
            }
        }
        for (int i8 = i2 - 1; i8 >= i; i8--) {
            int i9 = iArr[i8];
            int i10 = iArr2[i9];
            int i11 = i8 + 1;
            while (i11 <= i2) {
                int i12 = iArr[i11];
                if (i10 > iArr2[i12]) {
                    iArr[i11 - 1] = i12;
                    i11++;
                }
            }
            iArr[i11 - 1] = i9;
        }
    }

    public final void fswap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public final void fvswap(int[] iArr, int i, int i2, int i3) {
        while (i3 > 0) {
            fswap(iArr, i, i2);
            i++;
            i2++;
            i3--;
        }
    }

    public final void fpush(int i, int i2, int i3) {
        this.stack_ll[i] = i2;
        this.stack_hh[i] = i3;
    }

    public final int[] fpop(int i) {
        return new int[]{this.stack_ll[i], this.stack_hh[i]};
    }

    public final void fallbackQSort3(int[] iArr, int[] iArr2, int i, int i2) {
        int i3;
        boolean z;
        int[] iArr3 = iArr2;
        char c = 0;
        fpush(0, i, i2);
        long j = 0;
        int i4 = 1;
        long j2 = 0;
        int i5 = 1;
        while (i5 > 0) {
            int i6 = i5 - 1;
            int[] iArrFpop = fpop(i6);
            int i7 = iArrFpop[c];
            int i8 = iArrFpop[i4];
            if (i8 - i7 < 10) {
                fallbackSimpleSort(iArr, iArr3, i7, i8);
                i5 = i6;
            } else {
                j2 = ((j2 * 7621) + 1) % 32768;
                long j3 = j2 % 3;
                if (j3 == j) {
                    i3 = iArr3[iArr[i7]];
                } else if (j3 == 1) {
                    i3 = iArr3[iArr[(i7 + i8) >>> i4]];
                } else {
                    i3 = iArr3[iArr[i8]];
                }
                long j4 = i3;
                int i9 = i8;
                int i10 = i9;
                int i11 = i7;
                int i12 = i11;
                while (true) {
                    if (i12 <= i9) {
                        int i13 = iArr3[iArr[i12]] - ((int) j4);
                        if (i13 == 0) {
                            fswap(iArr, i12, i11);
                            i11++;
                            i12++;
                        } else {
                            if (i13 <= 0) {
                                z = true;
                                i12++;
                            }
                            iArr3 = iArr2;
                        }
                    }
                    while (i12 <= i9) {
                        int i14 = iArr3[iArr[i9]] - ((int) j4);
                        if (i14 == 0) {
                            fswap(iArr, i9, i10);
                            i10--;
                        } else if (i14 < 0) {
                            break;
                        }
                        i9--;
                        iArr3 = iArr2;
                    }
                    if (i12 > i9) {
                        break;
                    }
                    z = true;
                    fswap(iArr, i12, i9);
                    i12++;
                    i9--;
                    iArr3 = iArr2;
                }
                if (i10 < i11) {
                    iArr3 = iArr2;
                    i5 = i6;
                    c = 0;
                    j = 0;
                    i4 = 1;
                } else {
                    int iMin = Math.min(i11 - i7, i12 - i11);
                    fvswap(iArr, i7, i12 - iMin, iMin);
                    int i15 = i8 - i10;
                    int i16 = i10 - i9;
                    int iMin2 = Math.min(i15, i16);
                    fvswap(iArr, i9 + 1, (i8 - iMin2) + 1, iMin2);
                    int i17 = ((i12 + i7) - i11) - 1;
                    int i18 = (i8 - i16) + 1;
                    if (i17 - i7 > i8 - i18) {
                        fpush(i6, i7, i17);
                        fpush(i5, i18, i8);
                        i5++;
                    } else {
                        fpush(i6, i18, i8);
                        fpush(i5, i7, i17);
                        i5++;
                    }
                    iArr3 = iArr2;
                    i4 = 1;
                    c = 0;
                    j = 0;
                }
            }
        }
    }

    public final int[] getEclass() {
        if (this.eclass == null) {
            this.eclass = new int[this.quadrant.length / 2];
        }
        return this.eclass;
    }

    public final void fallbackSort(int[] iArr, byte[] bArr, int i) {
        int i2;
        int[] iArr2 = new int[257];
        int[] eclass = getEclass();
        for (int i3 = 0; i3 < i; i3++) {
            eclass[i3] = 0;
        }
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i4] & 255;
            iArr2[i5] = iArr2[i5] + 1;
        }
        for (int i6 = 1; i6 < 257; i6++) {
            iArr2[i6] = iArr2[i6] + iArr2[i6 - 1];
        }
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = bArr[i7] & 255;
            int i9 = iArr2[i8] - 1;
            iArr2[i8] = i9;
            iArr[i9] = i7;
        }
        BitSet bitSet = new BitSet(i + 64);
        for (int i10 = 0; i10 < 256; i10++) {
            bitSet.set(iArr2[i10]);
        }
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = (i11 * 2) + i;
            bitSet.set(i12);
            bitSet.clear(i12 + 1);
        }
        int i13 = 1;
        do {
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                if (bitSet.get(i15)) {
                    i14 = i15;
                }
                int i16 = iArr[i15] - i13;
                if (i16 < 0) {
                    i16 += i;
                }
                eclass[i16] = i14;
            }
            int iNextSetBit = -1;
            i2 = 0;
            while (true) {
                int iNextClearBit = bitSet.nextClearBit(iNextSetBit + 1);
                int i17 = iNextClearBit - 1;
                if (i17 >= i || (iNextSetBit = bitSet.nextSetBit(iNextClearBit + 1) - 1) >= i) {
                    break;
                }
                if (iNextSetBit > i17) {
                    i2 += (iNextSetBit - i17) + 1;
                    fallbackQSort3(iArr, eclass, i17, iNextSetBit);
                    int i18 = -1;
                    while (i17 <= iNextSetBit) {
                        int i19 = eclass[iArr[i17]];
                        if (i18 != i19) {
                            bitSet.set(i17);
                            i18 = i19;
                        }
                        i17++;
                    }
                }
            }
            i13 *= 2;
            if (i13 > i) {
                return;
            }
        } while (i2 != 0);
    }

    public final boolean mainSimpleSort(BZip2CompressorOutputStream.Data data, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = (i2 - i) + 1;
        if (i10 < 2) {
            return this.firstAttempt && this.workDone > this.workLimit;
        }
        int i11 = 0;
        while (INCS[i11] < i10) {
            i11++;
        }
        int[] iArr = data.fmap;
        char[] cArr = this.quadrant;
        byte[] bArr = data.block;
        int i12 = i4 + 1;
        boolean z = this.firstAttempt;
        int i13 = this.workLimit;
        int i14 = this.workDone;
        loop1: while (true) {
            i11--;
            if (i11 < 0) {
                break;
            }
            int i15 = INCS[i11];
            int i16 = i + i15;
            int i17 = i16 - 1;
            while (i16 <= i2) {
                int i18 = 3;
                while (i16 <= i2) {
                    int i19 = i18 - 1;
                    if (i19 < 0) {
                        break;
                    }
                    int i20 = iArr[i16];
                    int i21 = i20 + i3;
                    int i22 = i16;
                    boolean z2 = false;
                    int i23 = 0;
                    while (true) {
                        if (z2) {
                            iArr[i22] = i23;
                            i9 = i22 - i15;
                            if (i9 <= i17) {
                                i8 = i11;
                                i6 = i15;
                                i5 = i17;
                                i7 = i19;
                                break;
                            }
                            i22 = i9;
                        } else {
                            z2 = true;
                        }
                        int i24 = iArr[i22 - i15];
                        int i25 = i24 + i3;
                        byte b = bArr[i25 + 1];
                        byte b2 = bArr[i21 + 1];
                        if (b != b2) {
                            i8 = i11;
                            i6 = i15;
                            i5 = i17;
                            i7 = i19;
                            if ((b & 255) <= (b2 & 255)) {
                                break;
                            }
                            i23 = i24;
                            i11 = i8;
                            i19 = i7;
                            i15 = i6;
                            i17 = i5;
                        } else {
                            byte b3 = bArr[i25 + 2];
                            byte b4 = bArr[i21 + 2];
                            if (b3 != b4) {
                                i8 = i11;
                                i6 = i15;
                                i5 = i17;
                                i7 = i19;
                                if ((b3 & 255) <= (b4 & 255)) {
                                    break;
                                }
                                i23 = i24;
                                i11 = i8;
                                i19 = i7;
                                i15 = i6;
                                i17 = i5;
                            } else {
                                byte b5 = bArr[i25 + 3];
                                byte b6 = bArr[i21 + 3];
                                if (b5 != b6) {
                                    i8 = i11;
                                    i6 = i15;
                                    i5 = i17;
                                    i7 = i19;
                                    if ((b5 & 255) <= (b6 & 255)) {
                                        break;
                                    }
                                    i23 = i24;
                                    i11 = i8;
                                    i19 = i7;
                                    i15 = i6;
                                    i17 = i5;
                                } else {
                                    byte b7 = bArr[i25 + 4];
                                    byte b8 = bArr[i21 + 4];
                                    if (b7 != b8) {
                                        i8 = i11;
                                        i6 = i15;
                                        i5 = i17;
                                        i7 = i19;
                                        if ((b7 & 255) <= (b8 & 255)) {
                                            break;
                                        }
                                        i23 = i24;
                                        i11 = i8;
                                        i19 = i7;
                                        i15 = i6;
                                        i17 = i5;
                                    } else {
                                        byte b9 = bArr[i25 + 5];
                                        byte b10 = bArr[i21 + 5];
                                        if (b9 != b10) {
                                            i8 = i11;
                                            i6 = i15;
                                            i5 = i17;
                                            i7 = i19;
                                            if ((b9 & 255) <= (b10 & 255)) {
                                                break;
                                            }
                                            i23 = i24;
                                            i11 = i8;
                                            i19 = i7;
                                            i15 = i6;
                                            i17 = i5;
                                        } else {
                                            int i26 = i25 + 6;
                                            byte b11 = bArr[i26];
                                            int i27 = i21 + 6;
                                            i8 = i11;
                                            byte b12 = bArr[i27];
                                            if (b11 != b12) {
                                                i6 = i15;
                                                i5 = i17;
                                                i7 = i19;
                                                if ((b11 & 255) <= (b12 & 255)) {
                                                    break;
                                                }
                                                i23 = i24;
                                                i11 = i8;
                                                i19 = i7;
                                                i15 = i6;
                                                i17 = i5;
                                            } else {
                                                int i28 = i4;
                                                while (true) {
                                                    if (i28 <= 0) {
                                                        i6 = i15;
                                                        i5 = i17;
                                                        i7 = i19;
                                                        break;
                                                    }
                                                    int i29 = i28 - 4;
                                                    int i30 = i26 + 1;
                                                    byte b13 = bArr[i30];
                                                    int i31 = i27 + 1;
                                                    i6 = i15;
                                                    byte b14 = bArr[i31];
                                                    if (b13 != b14) {
                                                        i5 = i17;
                                                        i7 = i19;
                                                        if ((b13 & 255) <= (b14 & 255)) {
                                                            break;
                                                        }
                                                    } else {
                                                        char c = cArr[i26];
                                                        char c2 = cArr[i27];
                                                        if (c != c2) {
                                                            i5 = i17;
                                                            i7 = i19;
                                                            if (c <= c2) {
                                                                break;
                                                            }
                                                        } else {
                                                            int i32 = i26 + 2;
                                                            byte b15 = bArr[i32];
                                                            int i33 = i27 + 2;
                                                            i5 = i17;
                                                            byte b16 = bArr[i33];
                                                            if (b15 != b16) {
                                                                i7 = i19;
                                                                if ((b15 & 255) <= (b16 & 255)) {
                                                                    break;
                                                                }
                                                            } else {
                                                                char c3 = cArr[i30];
                                                                char c4 = cArr[i31];
                                                                if (c3 != c4) {
                                                                    i7 = i19;
                                                                    if (c3 <= c4) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    int i34 = i26 + 3;
                                                                    byte b17 = bArr[i34];
                                                                    int i35 = i27 + 3;
                                                                    i7 = i19;
                                                                    byte b18 = bArr[i35];
                                                                    if (b17 != b18) {
                                                                        if ((b17 & 255) <= (b18 & 255)) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        char c5 = cArr[i32];
                                                                        char c6 = cArr[i33];
                                                                        if (c5 != c6) {
                                                                            if (c5 <= c6) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            int i36 = i26 + 4;
                                                                            byte b19 = bArr[i36];
                                                                            i27 += 4;
                                                                            byte b20 = bArr[i27];
                                                                            if (b19 != b20) {
                                                                                if ((b19 & 255) <= (b20 & 255)) {
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                char c7 = cArr[i34];
                                                                                char c8 = cArr[i35];
                                                                                if (c7 != c8) {
                                                                                    if (c7 <= c8) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    if (i36 >= i12) {
                                                                                        i36 -= i12;
                                                                                    }
                                                                                    i26 = i36;
                                                                                    if (i27 >= i12) {
                                                                                        i27 -= i12;
                                                                                    }
                                                                                    i14++;
                                                                                    i28 = i29;
                                                                                    i19 = i7;
                                                                                    i15 = i6;
                                                                                    i17 = i5;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i23 = i24;
                                                i11 = i8;
                                                i19 = i7;
                                                i15 = i6;
                                                i17 = i5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i9 = i22;
                    iArr[i9] = i20;
                    i16++;
                    i11 = i8;
                    i18 = i7;
                    i15 = i6;
                    i17 = i5;
                }
                int i37 = i11;
                int i38 = i15;
                int i39 = i17;
                if (z && i16 <= i2 && i14 > i13) {
                    break loop1;
                }
                i11 = i37;
                i15 = i38;
                i17 = i39;
            }
        }
        this.workDone = i14;
        return z && i14 > i13;
    }

    public static void vswap(int[] iArr, int i, int i2, int i3) {
        int i4 = i3 + i;
        while (i < i4) {
            int i5 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i5;
            i2++;
            i++;
        }
    }

    public final void mainQSort3(BZip2CompressorOutputStream.Data data, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int[] iArr = this.stack_ll;
        int[] iArr2 = this.stack_hh;
        int[] iArr3 = this.stack_dd;
        int[] iArr4 = data.fmap;
        byte[] bArr = data.block;
        iArr[0] = i;
        iArr2[0] = i2;
        iArr3[0] = i3;
        boolean z2 = true;
        int i7 = 1;
        while (true) {
            int i8 = i7 - 1;
            if (i8 < 0) {
                return;
            }
            int i9 = iArr[i8];
            int i10 = iArr2[i8];
            int i11 = iArr3[i8];
            if (i10 - i9 < 20 || i11 > 10) {
                z = z2;
                if (mainSimpleSort(data, i9, i10, i11, i4)) {
                    return;
                } else {
                    i7 = i8;
                }
            } else {
                int i12 = i11 + 1;
                int iMed3 = med3(bArr[iArr4[i9] + i12] & 255, bArr[iArr4[i10] + i12] & 255, bArr[iArr4[(i9 + i10) >>> 1] + i12] & 255);
                int i13 = i9;
                int i14 = i13;
                int i15 = i10;
                int i16 = i15;
                while (true) {
                    if (i14 <= i15) {
                        int i17 = iArr4[i14];
                        int i18 = (bArr[i17 + i12] & 255) - iMed3;
                        if (i18 == 0) {
                            iArr4[i14] = iArr4[i13];
                            iArr4[i13] = i17;
                            i13++;
                            i14++;
                        } else if (i18 < 0) {
                            i14++;
                        }
                    }
                    i5 = i16;
                    while (true) {
                        if (i14 > i15) {
                            i6 = i7;
                            break;
                        }
                        int i19 = iArr4[i15];
                        i6 = i7;
                        int i20 = (bArr[i19 + i12] & 255) - iMed3;
                        if (i20 != 0) {
                            if (i20 <= 0) {
                                break;
                            } else {
                                i15--;
                            }
                        } else {
                            iArr4[i15] = iArr4[i5];
                            iArr4[i5] = i19;
                            i5--;
                            i15--;
                        }
                        i7 = i6;
                    }
                    if (i14 > i15) {
                        break;
                    }
                    int i21 = iArr4[i14];
                    iArr4[i14] = iArr4[i15];
                    iArr4[i15] = i21;
                    i7 = i6;
                    i16 = i5;
                    i15--;
                    i14++;
                }
                if (i5 < i13) {
                    iArr[i8] = i9;
                    iArr2[i8] = i10;
                    iArr3[i8] = i12;
                    i7 = i6;
                    z = true;
                } else {
                    int iMin = Math.min(i13 - i9, i14 - i13);
                    vswap(iArr4, i9, i14 - iMin, iMin);
                    int i22 = i10 - i5;
                    int i23 = i5 - i15;
                    int iMin2 = Math.min(i22, i23);
                    z = true;
                    vswap(iArr4, i14, (i10 - iMin2) + 1, iMin2);
                    int i24 = (i14 + i9) - i13;
                    int i25 = i10 - i23;
                    iArr[i8] = i9;
                    iArr2[i8] = i24 - 1;
                    iArr3[i8] = i11;
                    iArr[i6] = i24;
                    iArr2[i6] = i25;
                    iArr3[i6] = i12;
                    int i26 = i6 + 1;
                    iArr[i26] = i25 + 1;
                    iArr2[i26] = i10;
                    iArr3[i26] = i11;
                    i7 = i6 + 2;
                }
            }
            z2 = z;
        }
    }

    public final void mainSort(BZip2CompressorOutputStream.Data data, int i) {
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr2 = this.mainSort_runningOrder;
        int[] iArr3 = this.mainSort_copy;
        boolean[] zArr = this.mainSort_bigDone;
        int[] iArr4 = this.ftab;
        byte[] bArr = data.block;
        int[] iArr5 = data.fmap;
        char[] cArr = this.quadrant;
        int i7 = this.workLimit;
        boolean z = this.firstAttempt;
        int i8 = 0;
        Arrays.fill(iArr4, 0);
        for (int i9 = 0; i9 < 20; i9++) {
            bArr[i + i9 + 2] = bArr[(i9 % (i + 1)) + 1];
        }
        int i10 = i + 21;
        while (true) {
            i10--;
            if (i10 < 0) {
                break;
            } else {
                cArr[i10] = 0;
            }
        }
        int i11 = i + 1;
        byte b = bArr[i11];
        bArr[0] = b;
        int i12 = 255;
        int i13 = b & 255;
        while (i8 <= i) {
            i8++;
            int i14 = bArr[i8] & 255;
            int i15 = (i13 << 8) + i14;
            iArr4[i15] = iArr4[i15] + 1;
            i13 = i14;
        }
        for (int i16 = 1; i16 <= 65536; i16++) {
            iArr4[i16] = iArr4[i16] + iArr4[i16 - 1];
        }
        boolean z2 = true;
        int i17 = bArr[1] & 255;
        int i18 = 0;
        while (i18 < i) {
            int i19 = bArr[i18 + 2] & 255;
            int i20 = (i17 << 8) + i19;
            int i21 = iArr4[i20] - 1;
            iArr4[i20] = i21;
            iArr5[i21] = i18;
            i18++;
            i17 = i19;
            z2 = true;
        }
        int i22 = ((bArr[i11] & 255) << 8) + (bArr[z2 ? 1 : 0] & 255);
        int i23 = iArr4[i22] - 1;
        iArr4[i22] = i23;
        iArr5[i23] = i;
        int i24 = 256;
        while (true) {
            i24--;
            if (i24 < 0) {
                break;
            }
            zArr[i24] = false;
            iArr2[i24] = i24;
        }
        int i25 = 364;
        while (i25 != 1) {
            i25 /= 3;
            int i26 = i25;
            while (i26 <= i12) {
                int i27 = iArr2[i26];
                int i28 = iArr4[(i27 + 1) << 8] - iArr4[i27 << 8];
                int i29 = i25 - 1;
                int i30 = iArr2[i26 - i25];
                int i31 = i26;
                while (true) {
                    i6 = i7;
                    if (iArr4[(i30 + 1) << 8] - iArr4[i30 << 8] <= i28) {
                        break;
                    }
                    iArr2[i31] = i30;
                    int i32 = i31 - i25;
                    if (i32 <= i29) {
                        i31 = i32;
                        break;
                    } else {
                        i30 = iArr2[i32 - i25];
                        i31 = i32;
                        i7 = i6;
                    }
                }
                iArr2[i31] = i27;
                i26++;
                i7 = i6;
                i12 = 255;
            }
        }
        int i33 = i7;
        int i34 = 0;
        while (i34 <= i12) {
            int i35 = iArr2[i34];
            int i36 = 0;
            while (i36 <= i12) {
                int i37 = (i35 << 8) + i36;
                int i38 = iArr4[i37];
                if ((i38 & 2097152) != 2097152) {
                    int i39 = i38 & CLEARMASK;
                    int i40 = (iArr4[i37 + 1] & CLEARMASK) - 1;
                    if (i40 > i39) {
                        i5 = 2097152;
                        i2 = i36;
                        iArr = iArr2;
                        i3 = i33;
                        i4 = i34;
                        mainQSort3(data, i39, i40, 2, i);
                        if (z && this.workDone > i3) {
                            return;
                        }
                    } else {
                        i5 = 2097152;
                        i2 = i36;
                        iArr = iArr2;
                        i3 = i33;
                        i4 = i34;
                    }
                    iArr4[i37] = i38 | i5;
                } else {
                    i2 = i36;
                    iArr = iArr2;
                    i3 = i33;
                    i4 = i34;
                }
                i36 = i2 + 1;
                i33 = i3;
                i34 = i4;
                iArr2 = iArr;
                i12 = 255;
            }
            int[] iArr6 = iArr2;
            int i41 = i33;
            int i42 = i34;
            int i43 = 0;
            for (int i44 = i12; i43 <= i44; i44 = 255) {
                iArr3[i43] = iArr4[(i43 << 8) + i35] & CLEARMASK;
                i43++;
            }
            int i45 = i35 << 8;
            int i46 = iArr4[i45] & CLEARMASK;
            int i47 = (i35 + 1) << 8;
            int i48 = iArr4[i47] & CLEARMASK;
            while (i46 < i48) {
                int i49 = iArr5[i46];
                int i50 = i48;
                int i51 = bArr[i49] & 255;
                if (!zArr[i51]) {
                    iArr5[iArr3[i51]] = i49 == 0 ? i : i49 - 1;
                    iArr3[i51] = iArr3[i51] + 1;
                }
                i46++;
                i48 = i50;
            }
            int i52 = 256;
            while (true) {
                i52--;
                if (i52 < 0) {
                    break;
                }
                int i53 = (i52 << 8) + i35;
                iArr4[i53] = iArr4[i53] | 2097152;
            }
            zArr[i35] = true;
            if (i42 < 255) {
                int i54 = iArr4[i45] & CLEARMASK;
                int i55 = ((-2097153) & iArr4[i47]) - i54;
                int i56 = 0;
                while ((i55 >> i56) > 65534) {
                    i56++;
                }
                int i57 = 0;
                while (i57 < i55) {
                    int i58 = iArr5[i54 + i57];
                    char c = (char) (i57 >> i56);
                    cArr[i58] = c;
                    int i59 = i54;
                    if (i58 < 20) {
                        cArr[i58 + i + 1] = c;
                    }
                    i57++;
                    i54 = i59;
                }
            }
            i34 = i42 + 1;
            i33 = i41;
            iArr2 = iArr6;
            i12 = 255;
        }
    }
}
