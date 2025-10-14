package com.blackhub.bronline.game.core.extension;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateExtension.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, m7105d2 = {"getStartOfTheDayByDate", "", "date", "Ljava/util/Calendar;", "getStartOfTheDayByTimestamp", "timestamp", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDateExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateExtension.kt\ncom/blackhub/bronline/game/core/extension/DateExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/* loaded from: classes2.dex */
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
