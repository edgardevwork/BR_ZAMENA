package io.ktor.http;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import io.ktor.http.ContentRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RangesSpecifier.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u001c\u0010\u0016\u001a\u00020\u00122\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\bH\u0016J\u001f\u0010 \u001a\b\u0012\u0004\u0012\u0002H!0\u0005\"\u0004\b\u0000\u0010!*\u0004\u0018\u0001H!H\u0002¢\u0006\u0002\u0010\"R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006#"}, m7105d2 = {"Lio/ktor/http/RangesSpecifier;", "", P2MetadataParser.UnitHandler.UNIT, "Lio/ktor/http/RangeUnits;", "ranges", "", "Lio/ktor/http/ContentRange;", "(Lio/ktor/http/RangeUnits;Ljava/util/List;)V", "", "(Ljava/lang/String;Ljava/util/List;)V", "getRanges", "()Ljava/util/List;", "getUnit", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "isValid", "rangeUnitPredicate", "Lkotlin/Function1;", "merge", "Lkotlin/ranges/LongRange;", CacheFileMetadataIndex.COLUMN_LENGTH, "", "maxRangeCount", "mergeToSingle", "toString", "toList", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Ljava/util/List;", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRangesSpecifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RangesSpecifier.kt\nio/ktor/http/RangesSpecifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1#2:73\n2624#3,3:74\n2333#3,14:77\n1963#3,14:91\n*S KotlinDebug\n*F\n+ 1 RangesSpecifier.kt\nio/ktor/http/RangesSpecifier\n*L\n24#1:74,3\n62#1:77,14\n63#1:91,14\n*E\n"})
/* loaded from: classes6.dex */
public final /* data */ class RangesSpecifier {

    @NotNull
    public final List<ContentRange> ranges;

    @NotNull
    public final String unit;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RangesSpecifier copy$default(RangesSpecifier rangesSpecifier, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rangesSpecifier.unit;
        }
        if ((i & 2) != 0) {
            list = rangesSpecifier.ranges;
        }
        return rangesSpecifier.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    public final List<ContentRange> component2() {
        return this.ranges;
    }

    @NotNull
    public final RangesSpecifier copy(@NotNull String unit, @NotNull List<? extends ContentRange> ranges) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        return new RangesSpecifier(unit, ranges);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangesSpecifier)) {
            return false;
        }
        RangesSpecifier rangesSpecifier = (RangesSpecifier) other;
        return Intrinsics.areEqual(this.unit, rangesSpecifier.unit) && Intrinsics.areEqual(this.ranges, rangesSpecifier.ranges);
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + this.ranges.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RangesSpecifier(@NotNull String unit, @NotNull List<? extends ContentRange> ranges) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        this.unit = unit;
        this.ranges = ranges;
        if (!(!ranges.isEmpty())) {
            throw new IllegalArgumentException("It should be at least one range".toString());
        }
    }

    public /* synthetic */ RangesSpecifier(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RangeUnits.Bytes.getUnitToken() : str, (List<? extends ContentRange>) list);
    }

    @NotNull
    public final List<ContentRange> getRanges() {
        return this.ranges;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangesSpecifier(@NotNull RangeUnits unit, @NotNull List<? extends ContentRange> ranges) {
        this(unit.getUnitToken(), ranges);
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isValid$default(RangesSpecifier rangesSpecifier, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<String, Boolean>() { // from class: io.ktor.http.RangesSpecifier.isValid.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(it, RangeUnits.Bytes.getUnitToken()));
                }
            };
        }
        return rangesSpecifier.isValid(function1);
    }

    public final boolean isValid(@NotNull Function1<? super String, Boolean> rangeUnitPredicate) {
        Intrinsics.checkNotNullParameter(rangeUnitPredicate, "rangeUnitPredicate");
        if (rangeUnitPredicate.invoke(this.unit).booleanValue()) {
            List<ContentRange> list = this.ranges;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (ContentRange contentRange : list) {
                    if (contentRange instanceof ContentRange.Bounded) {
                        ContentRange.Bounded bounded = (ContentRange.Bounded) contentRange;
                        if (bounded.getFrom() < 0 || bounded.getTo() < bounded.getFrom()) {
                        }
                    } else if (!(contentRange instanceof ContentRange.TailFrom)) {
                        if (!(contentRange instanceof ContentRange.Suffix)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (((ContentRange.Suffix) contentRange).getLastCount() < 0) {
                        }
                    } else if (((ContentRange.TailFrom) contentRange).getFrom() < 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ List merge$default(RangesSpecifier rangesSpecifier, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 50;
        }
        return rangesSpecifier.merge(j, i);
    }

    @NotNull
    public final List<LongRange> merge(long length, int maxRangeCount) {
        if (this.ranges.size() > maxRangeCount) {
            return toList(mergeToSingle(length));
        }
        return merge(length);
    }

    @NotNull
    public final List<LongRange> merge(long length) {
        return RangesKt.mergeRangesKeepOrder(RangesKt.toLongRanges(this.ranges, length));
    }

    @Nullable
    public final LongRange mergeToSingle(long length) {
        Object next;
        List<LongRange> longRanges = RangesKt.toLongRanges(this.ranges, length);
        Object next2 = null;
        if (longRanges.isEmpty()) {
            return null;
        }
        List<LongRange> list = longRanges;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jLongValue = ((LongRange) next).getStart().longValue();
                do {
                    Object next3 = it.next();
                    long jLongValue2 = ((LongRange) next3).getStart().longValue();
                    if (jLongValue > jLongValue2) {
                        next = next3;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Intrinsics.checkNotNull(next);
        long jLongValue3 = ((LongRange) next).getStart().longValue();
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                long jLongValue4 = ((LongRange) next2).getEndInclusive().longValue();
                do {
                    Object next4 = it2.next();
                    long jLongValue5 = ((LongRange) next4).getEndInclusive().longValue();
                    if (jLongValue4 < jLongValue5) {
                        next2 = next4;
                        jLongValue4 = jLongValue5;
                    }
                } while (it2.hasNext());
            }
        }
        Intrinsics.checkNotNull(next2);
        return new LongRange(jLongValue3, RangesKt___RangesKt.coerceAtMost(((LongRange) next2).getEndInclusive().longValue(), length - 1));
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.ranges, ",", this.unit + '=', null, 0, null, null, 60, null);
    }

    public final <T> List<T> toList(T t) {
        return t == null ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(t);
    }
}
