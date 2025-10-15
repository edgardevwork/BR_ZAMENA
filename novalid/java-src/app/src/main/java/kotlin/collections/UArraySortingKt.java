package kotlin.collections;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UArraySorting.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m7105d2 = {"partition", "", "array", "Lkotlin/UByteArray;", TtmlNode.LEFT, TtmlNode.RIGHT, "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c */
    public static final int m16155partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM15775getw2LRezQ = UByteArray.m15775getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = bM15775getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m15775getw2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m15775getw2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM15775getw2LRezQ2 = UByteArray.m15775getw2LRezQ(bArr, i);
                UByteArray.m15780setVurrAj0(bArr, i, UByteArray.m15775getw2LRezQ(bArr, i2));
                UByteArray.m15780setVurrAj0(bArr, i2, bM15775getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c */
    public static final void m16159quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM16155partition4UcCI2c = m16155partition4UcCI2c(bArr, i, i2);
        int i3 = iM16155partition4UcCI2c - 1;
        if (i < i3) {
            m16159quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM16155partition4UcCI2c < i2) {
            m16159quickSort4UcCI2c(bArr, iM16155partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o */
    public static final int m16156partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM16038getMh2AYeg = UShortArray.m16038getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM16038getMh2AYeg = UShortArray.m16038getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM16038getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM16038getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m16038getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM16038getMh2AYeg2 = UShortArray.m16038getMh2AYeg(sArr, i);
                UShortArray.m16043set01HTLdE(sArr, i, UShortArray.m16038getMh2AYeg(sArr, i2));
                UShortArray.m16043set01HTLdE(sArr, i2, sM16038getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o */
    public static final void m16160quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM16156partitionAa5vz7o = m16156partitionAa5vz7o(sArr, i, i2);
        int i3 = iM16156partitionAa5vz7o - 1;
        if (i < i3) {
            m16160quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM16156partitionAa5vz7o < i2) {
            m16160quickSortAa5vz7o(sArr, iM16156partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg */
    public static final int m16157partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM15854getpVg5ArA = UIntArray.m15854getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compare(UIntArray.m15854getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, iM15854getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i++;
            }
            while (Integer.compare(UIntArray.m15854getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, iM15854getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM15854getpVg5ArA2 = UIntArray.m15854getpVg5ArA(iArr, i);
                UIntArray.m15859setVXSXFK8(iArr, i, UIntArray.m15854getpVg5ArA(iArr, i2));
                UIntArray.m15859setVXSXFK8(iArr, i2, iM15854getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg */
    public static final void m16161quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM16157partitionoBK06Vg = m16157partitionoBK06Vg(iArr, i, i2);
        int i3 = iM16157partitionoBK06Vg - 1;
        if (i < i3) {
            m16161quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM16157partitionoBK06Vg < i2) {
            m16161quickSortoBK06Vg(iArr, iM16157partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4 */
    public static final int m16154partitionnroSd4(long[] jArr, int i, int i2) {
        long jM15933getsVKNKU = ULongArray.m15933getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compare(ULongArray.m15933getsVKNKU(jArr, i) ^ Long.MIN_VALUE, jM15933getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i++;
            }
            while (Long.compare(ULongArray.m15933getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, jM15933getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM15933getsVKNKU2 = ULongArray.m15933getsVKNKU(jArr, i);
                ULongArray.m15938setk8EXiF4(jArr, i, ULongArray.m15933getsVKNKU(jArr, i2));
                ULongArray.m15938setk8EXiF4(jArr, i2, jM15933getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4 */
    public static final void m16158quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM16154partitionnroSd4 = m16154partitionnroSd4(jArr, i, i2);
        int i3 = iM16154partitionnroSd4 - 1;
        if (i < i3) {
            m16158quickSortnroSd4(jArr, i, i3);
        }
        if (iM16154partitionnroSd4 < i2) {
            m16158quickSortnroSd4(jArr, iM16154partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c */
    public static final void m16163sortArray4UcCI2c(@NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m16159quickSort4UcCI2c(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o */
    public static final void m16164sortArrayAa5vz7o(@NotNull short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m16160quickSortAa5vz7o(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg */
    public static final void m16165sortArrayoBK06Vg(@NotNull int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m16161quickSortoBK06Vg(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4 */
    public static final void m16162sortArraynroSd4(@NotNull long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m16158quickSortnroSd4(array, i, i2 - 1);
    }
}
