package com.blackhub.bronline.game.gui.blackpass.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimerDaysAndHours.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/data/TimerDaysAndHours;", "", "days", "", "hours", "(II)V", "getDays", "()I", "getHours", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
