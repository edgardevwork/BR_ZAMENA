package kotlin;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;

/* compiled from: UnsignedUtils.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000¨\u0006\u001d"}, m7105d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", "v1", ArtifactoryClientConfiguration.DEFAULT_NUGET_PROTOCOL, "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", TtmlNode.RUBY_BASE, "kotlin-stdlib"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@JvmName(name = "UnsignedKt")
/* loaded from: classes8.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final double uintToDouble(int i) {
        return (Integer.MAX_VALUE & i) + (((i >>> 31) << 30) * 2);
    }

    @PublishedApi
    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @PublishedApi
    public static final int uintCompare(int i, int i2) {
        return Intrinsics.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    public static final int ulongCompare(long j, long j2) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m16050uintDivideJ1ME1BU(int i, int i2) {
        return UInt.m15793constructorimpl((int) ((i & 4294967295L) / (i2 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m16051uintRemainderJ1ME1BU(int i, int i2) {
        return UInt.m15793constructorimpl((int) ((i & 4294967295L) % (i2 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m16052ulongDivideeb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? ULong.m15872constructorimpl(0L) : ULong.m15872constructorimpl(1L);
        }
        if (j >= 0) {
            return ULong.m15872constructorimpl(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return ULong.m15872constructorimpl(j3 + (Long.compare(ULong.m15872constructorimpl(j - (j3 * j2)) ^ Long.MIN_VALUE, ULong.m15872constructorimpl(j2) ^ Long.MIN_VALUE) < 0 ? 0 : 1));
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m16053ulongRemaindereb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? j : ULong.m15872constructorimpl(j - j2);
        }
        if (j >= 0) {
            return ULong.m15872constructorimpl(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (Long.compare(ULong.m15872constructorimpl(j3) ^ Long.MIN_VALUE, ULong.m15872constructorimpl(j2) ^ Long.MIN_VALUE) < 0) {
            j2 = 0;
        }
        return ULong.m15872constructorimpl(j3 - j2);
    }

    @PublishedApi
    public static final int doubleToUInt(double d) {
        if (Double.isNaN(d) || d <= uintToDouble(0)) {
            return 0;
        }
        if (d >= uintToDouble(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return UInt.m15793constructorimpl((int) d);
        }
        return UInt.m15793constructorimpl(UInt.m15793constructorimpl((int) (d - Integer.MAX_VALUE)) + UInt.m15793constructorimpl(Integer.MAX_VALUE));
    }

    @PublishedApi
    public static final long doubleToULong(double d) {
        if (Double.isNaN(d) || d <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d >= ulongToDouble(-1L)) {
            return -1L;
        }
        if (d < 9.223372036854776E18d) {
            return ULong.m15872constructorimpl((long) d);
        }
        return ULong.m15872constructorimpl(ULong.m15872constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @NotNull
    public static final String ulongToString(long j) {
        return ulongToString(j, 10);
    }

    @NotNull
    public static final String ulongToString(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt__CharJVMKt.checkRadix(i));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j4, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
