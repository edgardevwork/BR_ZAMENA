package com.blackhub.bronline.game.core.extension;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateExtension.kt */
@SourceDebugExtension({"SMAP\nDateExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateExtension.kt\ncom/blackhub/bronline/game/core/extension/DateExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})

public final class DateExtensionKt {
    public static final long getStartOfTheDayByDate(@NotNull Calendar date) {
        Intrinsics.checkNotNullParameter(date, "date");
        date.set(11, 0);
        date.set(12, 0);
        date.set(13, 0);
        date.set(14, 1);
        return date.getTimeInMillis();
    }

    public static final long getStartOfTheDayByTimestamp(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Intrinsics.checkNotNullExpressionValue(calendar, "apply(...)");
        return getStartOfTheDayByDate(calendar);
    }
}

