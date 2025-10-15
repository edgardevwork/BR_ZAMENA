package io.ktor.util.date;

import com.google.gson.internal.bind.TypeAdapters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GMTDateParser.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001e"}, m7105d2 = {"Lio/ktor/util/date/GMTDateBuilder;", "", "()V", TypeAdapters.C786626.DAY_OF_MONTH, "", "getDayOfMonth", "()Ljava/lang/Integer;", "setDayOfMonth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "hours", "getHours", "setHours", "minutes", "getMinutes", "setMinutes", TypeAdapters.C786626.MONTH, "Lio/ktor/util/date/Month;", "getMonth", "()Lio/ktor/util/date/Month;", "setMonth", "(Lio/ktor/util/date/Month;)V", "seconds", "getSeconds", "setSeconds", TypeAdapters.C786626.YEAR, "getYear", "setYear", "build", "Lio/ktor/util/date/GMTDate;", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class GMTDateBuilder {

    @Nullable
    public Integer dayOfMonth;

    @Nullable
    public Integer hours;

    @Nullable
    public Integer minutes;
    public Month month;

    @Nullable
    public Integer seconds;

    @Nullable
    public Integer year;

    @Nullable
    public final Integer getSeconds() {
        return this.seconds;
    }

    public final void setSeconds(@Nullable Integer num) {
        this.seconds = num;
    }

    @Nullable
    public final Integer getMinutes() {
        return this.minutes;
    }

    public final void setMinutes(@Nullable Integer num) {
        this.minutes = num;
    }

    @Nullable
    public final Integer getHours() {
        return this.hours;
    }

    public final void setHours(@Nullable Integer num) {
        this.hours = num;
    }

    @Nullable
    public final Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final void setDayOfMonth(@Nullable Integer num) {
        this.dayOfMonth = num;
    }

    @NotNull
    public final Month getMonth() {
        Month month = this.month;
        if (month != null) {
            return month;
        }
        Intrinsics.throwUninitializedPropertyAccessException(TypeAdapters.C786626.MONTH);
        return null;
    }

    public final void setMonth(@NotNull Month month) {
        Intrinsics.checkNotNullParameter(month, "<set-?>");
        this.month = month;
    }

    @Nullable
    public final Integer getYear() {
        return this.year;
    }

    public final void setYear(@Nullable Integer num) {
        this.year = num;
    }

    @NotNull
    public final GMTDate build() {
        Integer num = this.seconds;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Integer num2 = this.minutes;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        Integer num3 = this.hours;
        Intrinsics.checkNotNull(num3);
        int iIntValue3 = num3.intValue();
        Integer num4 = this.dayOfMonth;
        Intrinsics.checkNotNull(num4);
        int iIntValue4 = num4.intValue();
        Month month = getMonth();
        Integer num5 = this.year;
        Intrinsics.checkNotNull(num5);
        return DateJvmKt.GMTDate(iIntValue, iIntValue2, iIntValue3, iIntValue4, month, num5.intValue());
    }
}
