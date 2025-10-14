package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimerHoursAndMinutes.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class TimerHoursAndMinutes {
    public static final int $stable = 8;
    public int hours;
    public int minutes;

    /* JADX WARN: Illegal instructions before constructor call */
    public TimerHoursAndMinutes() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ TimerHoursAndMinutes copy$default(TimerHoursAndMinutes timerHoursAndMinutes, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = timerHoursAndMinutes.hours;
        }
        if ((i3 & 2) != 0) {
            i2 = timerHoursAndMinutes.minutes;
        }
        return timerHoursAndMinutes.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    @NotNull
    public final TimerHoursAndMinutes copy(int hours, int minutes) {
        return new TimerHoursAndMinutes(hours, minutes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerHoursAndMinutes)) {
            return false;
        }
        TimerHoursAndMinutes timerHoursAndMinutes = (TimerHoursAndMinutes) other;
        return this.hours == timerHoursAndMinutes.hours && this.minutes == timerHoursAndMinutes.minutes;
    }

    public int hashCode() {
        return (Integer.hashCode(this.hours) * 31) + Integer.hashCode(this.minutes);
    }

    @NotNull
    public String toString() {
        return "TimerHoursAndMinutes(hours=" + this.hours + ", minutes=" + this.minutes + ")";
    }

    public TimerHoursAndMinutes(int i, int i2) {
        this.hours = i;
        this.minutes = i2;
    }

    public /* synthetic */ TimerHoursAndMinutes(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getHours() {
        return this.hours;
    }

    public final void setHours(int i) {
        this.hours = i;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final void setMinutes(int i) {
        this.minutes = i;
    }
}

