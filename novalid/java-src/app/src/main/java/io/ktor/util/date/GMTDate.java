package io.ktor.util.date;

import com.google.gson.internal.bind.TypeAdapters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Date.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001/BO\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010\u001e\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u00060"}, m7105d2 = {"Lio/ktor/util/date/GMTDate;", "", "seconds", "", "minutes", "hours", "dayOfWeek", "Lio/ktor/util/date/WeekDay;", TypeAdapters.C786626.DAY_OF_MONTH, "dayOfYear", TypeAdapters.C786626.MONTH, "Lio/ktor/util/date/Month;", TypeAdapters.C786626.YEAR, "timestamp", "", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)V", "getDayOfMonth", "()I", "getDayOfWeek", "()Lio/ktor/util/date/WeekDay;", "getDayOfYear", "getHours", "getMinutes", "getMonth", "()Lio/ktor/util/date/Month;", "getSeconds", "getTimestamp", "()J", "getYear", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "", "hashCode", "toString", "", "Companion", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GMTDate implements Comparable<GMTDate> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final GMTDate START = DateJvmKt.GMTDate(0L);
    public final int dayOfMonth;

    @NotNull
    public final WeekDay dayOfWeek;
    public final int dayOfYear;
    public final int hours;
    public final int minutes;

    @NotNull
    public final Month month;
    public final int seconds;
    public final long timestamp;
    public final int year;

    /* renamed from: component1, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Month getMonth() {
        return this.month;
    }

    /* renamed from: component8, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final GMTDate copy(int seconds, int minutes, int hours, @NotNull WeekDay dayOfWeek, int i, int dayOfYear, @NotNull Month month, int i2, long timestamp) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        return new GMTDate(seconds, minutes, hours, dayOfWeek, i, dayOfYear, month, i2, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) other;
        return this.seconds == gMTDate.seconds && this.minutes == gMTDate.minutes && this.hours == gMTDate.hours && this.dayOfWeek == gMTDate.dayOfWeek && this.dayOfMonth == gMTDate.dayOfMonth && this.dayOfYear == gMTDate.dayOfYear && this.month == gMTDate.month && this.year == gMTDate.year && this.timestamp == gMTDate.timestamp;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.seconds) * 31) + Integer.hashCode(this.minutes)) * 31) + Integer.hashCode(this.hours)) * 31) + this.dayOfWeek.hashCode()) * 31) + Integer.hashCode(this.dayOfMonth)) * 31) + Integer.hashCode(this.dayOfYear)) * 31) + this.month.hashCode()) * 31) + Integer.hashCode(this.year)) * 31) + Long.hashCode(this.timestamp);
    }

    @NotNull
    public String toString() {
        return "GMTDate(seconds=" + this.seconds + ", minutes=" + this.minutes + ", hours=" + this.hours + ", dayOfWeek=" + this.dayOfWeek + ", dayOfMonth=" + this.dayOfMonth + ", dayOfYear=" + this.dayOfYear + ", month=" + this.month + ", year=" + this.year + ", timestamp=" + this.timestamp + ')';
    }

    public GMTDate(int i, int i2, int i3, @NotNull WeekDay dayOfWeek, int i4, int i5, @NotNull Month month, int i6, long j) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(month, "month");
        this.seconds = i;
        this.minutes = i2;
        this.hours = i3;
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = i4;
        this.dayOfYear = i5;
        this.month = month;
        this.year = i6;
        this.timestamp = j;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final int getHours() {
        return this.hours;
    }

    @NotNull
    public final WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    @NotNull
    public final Month getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull GMTDate other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.timestamp, other.timestamp);
    }

    /* compiled from: Date.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/util/date/GMTDate$Companion;", "", "()V", "START", "Lio/ktor/util/date/GMTDate;", "getSTART", "()Lio/ktor/util/date/GMTDate;", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GMTDate getSTART() {
            return GMTDate.START;
        }
    }
}
