package kotlin.internal;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UByte$$ExternalSyntheticBackport1;
import kotlin.UByte$$ExternalSyntheticBackport2;
import kotlin.UInt;
import kotlin.ULong;

/* compiled from: UProgressionUtil.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m7105d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", TtmlNode.START, "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    public static final int m16905differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iM7114m = UByte$$ExternalSyntheticBackport1.m7114m(i, i3);
        int iM7114m2 = UByte$$ExternalSyntheticBackport1.m7114m(i2, i3);
        int iCompare = Integer.compare(iM7114m ^ Integer.MIN_VALUE, iM7114m2 ^ Integer.MIN_VALUE);
        int iM15793constructorimpl = UInt.m15793constructorimpl(iM7114m - iM7114m2);
        return iCompare >= 0 ? iM15793constructorimpl : UInt.m15793constructorimpl(iM15793constructorimpl + i3);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    public static final long m16906differenceModulosambcqE(long j, long j2, long j3) {
        long jM7115m = UByte$$ExternalSyntheticBackport2.m7115m(j, j3);
        long jM7115m2 = UByte$$ExternalSyntheticBackport2.m7115m(j2, j3);
        int iCompare = Long.compare(jM7115m ^ Long.MIN_VALUE, jM7115m2 ^ Long.MIN_VALUE);
        long jM15872constructorimpl = ULong.m15872constructorimpl(jM7115m - jM7115m2);
        return iCompare >= 0 ? jM15872constructorimpl : ULong.m15872constructorimpl(jM15872constructorimpl + j3);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m16908getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) >= 0 ? i2 : UInt.m15793constructorimpl(i2 - m16905differenceModuloWZ9TVnA(i2, i, UInt.m15793constructorimpl(i3)));
        }
        if (i3 < 0) {
            return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) <= 0 ? i2 : UInt.m15793constructorimpl(i2 + m16905differenceModuloWZ9TVnA(i, i2, UInt.m15793constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m16907getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : ULong.m15872constructorimpl(j2 - m16906differenceModulosambcqE(j2, j, ULong.m15872constructorimpl(j3)));
        }
        if (j3 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : ULong.m15872constructorimpl(j2 + m16906differenceModulosambcqE(j, j2, ULong.m15872constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
