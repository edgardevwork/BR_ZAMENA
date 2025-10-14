package io.ktor.util.date;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

/* compiled from: Date.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002\u001a\"\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m7105d2 = {"minus", "Lio/ktor/util/date/GMTDate;", "milliseconds", "", "duration", "Lkotlin/time/Duration;", "minus-HG0u8IE", "(Lio/ktor/util/date/GMTDate;J)Lio/ktor/util/date/GMTDate;", "plus", "plus-HG0u8IE", "truncateToSeconds", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class DateKt {
    @NotNull
    public static final GMTDate plus(@NotNull GMTDate gMTDate, long j) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() + j));
    }

    @NotNull
    public static final GMTDate minus(@NotNull GMTDate gMTDate, long j) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return DateJvmKt.GMTDate(Long.valueOf(gMTDate.getTimestamp() - j));
    }

    @NotNull
    /* renamed from: plus-HG0u8IE */
    public static final GMTDate m15408plusHG0u8IE(@NotNull GMTDate plus, long j) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return DateJvmKt.GMTDate(Long.valueOf(plus.getTimestamp() + Duration.m17043getInWholeMillisecondsimpl(j)));
    }

    @NotNull
    /* renamed from: minus-HG0u8IE */
    public static final GMTDate m15407minusHG0u8IE(@NotNull GMTDate minus, long j) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        return DateJvmKt.GMTDate(Long.valueOf(minus.getTimestamp() - Duration.m17043getInWholeMillisecondsimpl(j)));
    }

    @NotNull
    public static final GMTDate truncateToSeconds(@NotNull GMTDate gMTDate) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        return DateJvmKt.GMTDate(gMTDate.getSeconds(), gMTDate.getMinutes(), gMTDate.getHours(), gMTDate.getDayOfMonth(), gMTDate.getMonth(), gMTDate.getYear());
    }
}
