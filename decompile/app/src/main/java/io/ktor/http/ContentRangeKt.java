package io.ktor.http;

import io.ktor.util.date.GMTDateParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentRange.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m7105d2 = {"contentRangeHeaderValue", "", P2MetadataParser.RequiredHandler.RANGE, "Lkotlin/ranges/LongRange;", "fullLength", "", P2MetadataParser.UnitHandler.UNIT, "Lio/ktor/http/RangeUnits;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;Lio/ktor/http/RangeUnits;)Ljava/lang/String;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ContentRangeKt {
    public static /* synthetic */ String contentRangeHeaderValue$default(LongRange longRange, Long l, RangeUnits rangeUnits, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            rangeUnits = RangeUnits.Bytes;
        }
        return contentRangeHeaderValue(longRange, l, rangeUnits);
    }

    @NotNull
    public static final String contentRangeHeaderValue(@Nullable LongRange longRange, @Nullable Long l, @NotNull RangeUnits unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return contentRangeHeaderValue(longRange, l, unit.getUnitToken());
    }

    public static /* synthetic */ String contentRangeHeaderValue$default(LongRange longRange, Long l, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        return contentRangeHeaderValue(longRange, l, str);
    }

    @NotNull
    public static final String contentRangeHeaderValue(@Nullable LongRange longRange, @Nullable Long l, @NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        StringBuilder sb = new StringBuilder();
        sb.append(unit);
        sb.append(" ");
        if (longRange != null) {
            sb.append(longRange.getStart().longValue());
            sb.append('-');
            sb.append(longRange.getEndInclusive().longValue());
        } else {
            sb.append(GMTDateParser.ANY);
        }
        sb.append('/');
        Object obj = l;
        if (l == null) {
            obj = "*";
        }
        sb.append(obj);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
