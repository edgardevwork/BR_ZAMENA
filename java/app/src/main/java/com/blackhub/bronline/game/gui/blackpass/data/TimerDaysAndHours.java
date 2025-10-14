package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimerDaysAndHours.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class TimerDaysAndHours {
    public static final int $stable = 0;
    public final int days;
    public final int hours;

    /* JADX WARN: Illegal instructions before constructor call */
    public TimerDaysAndHours() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ TimerDaysAndHours copy$default(TimerDaysAndHours timerDaysAndHours, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = timerDaysAndHours.days;
        }
        if ((i3 & 2) != 0) {
            i2 = timerDaysAndHours.hours;
        }
        return timerDaysAndHours.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    @NotNull
    public final TimerDaysAndHours copy(int days, int hours) {
        return new TimerDaysAndHours(days, hours);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerDaysAndHours)) {
            return false;
        }
        TimerDaysAndHours timerDaysAndHours = (TimerDaysAndHours) other;
        return this.days == timerDaysAndHours.days && this.hours == timerDaysAndHours.hours;
    }

    public int hashCode() {
        return (Integer.hashCode(this.days) * 31) + Integer.hashCode(this.hours);
    }

    @NotNull
    public String toString() {
        return "TimerDaysAndHours(days=" + this.days + ", hours=" + this.hours + ")";
    }

    public TimerDaysAndHours(int i, int i2) {
        this.days = i;
        this.hours = i2;
    }

    public /* synthetic */ TimerDaysAndHours(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getDays() {
        return this.days;
    }

    public final int getHours() {
        return this.hours;
    }
}

