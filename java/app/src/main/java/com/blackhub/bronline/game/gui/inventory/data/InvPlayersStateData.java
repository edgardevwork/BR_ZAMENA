package com.blackhub.bronline.game.gui.inventory.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvPlayersStateData.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class InvPlayersStateData {
    public static final int $stable = 8;
    public int iconsRes;
    public int maxValueState;
    public int thisValueState;
    public int typeState;

    public static /* synthetic */ InvPlayersStateData copy$default(InvPlayersStateData invPlayersStateData, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = invPlayersStateData.typeState;
        }
        if ((i5 & 2) != 0) {
            i2 = invPlayersStateData.thisValueState;
        }
        if ((i5 & 4) != 0) {
            i3 = invPlayersStateData.maxValueState;
        }
        if ((i5 & 8) != 0) {
            i4 = invPlayersStateData.iconsRes;
        }
        return invPlayersStateData.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTypeState() {
        return this.typeState;
    }

    /* renamed from: component2, reason: from getter */
    public final int getThisValueState() {
        return this.thisValueState;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxValueState() {
        return this.maxValueState;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIconsRes() {
        return this.iconsRes;
    }

    @NotNull
    public final InvPlayersStateData copy(int typeState, int thisValueState, int maxValueState, @DrawableRes int iconsRes) {
        return new InvPlayersStateData(typeState, thisValueState, maxValueState, iconsRes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvPlayersStateData)) {
            return false;
        }
        InvPlayersStateData invPlayersStateData = (InvPlayersStateData) other;
        return this.typeState == invPlayersStateData.typeState && this.thisValueState == invPlayersStateData.thisValueState && this.maxValueState == invPlayersStateData.maxValueState && this.iconsRes == invPlayersStateData.iconsRes;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.typeState) * 31) + Integer.hashCode(this.thisValueState)) * 31) + Integer.hashCode(this.maxValueState)) * 31) + Integer.hashCode(this.iconsRes);
    }

    @NotNull
    public String toString() {
        return "InvPlayersStateData(typeState=" + this.typeState + ", thisValueState=" + this.thisValueState + ", maxValueState=" + this.maxValueState + ", iconsRes=" + this.iconsRes + ")";
    }

    public InvPlayersStateData(int i, int i2, int i3, @DrawableRes int i4) {
        this.typeState = i;
        this.thisValueState = i2;
        this.maxValueState = i3;
        this.iconsRes = i4;
    }

    public final int getTypeState() {
        return this.typeState;
    }

    public final void setTypeState(int i) {
        this.typeState = i;
    }

    public final int getThisValueState() {
        return this.thisValueState;
    }

    public final void setThisValueState(int i) {
        this.thisValueState = i;
    }

    public final int getMaxValueState() {
        return this.maxValueState;
    }

    public final void setMaxValueState(int i) {
        this.maxValueState = i;
    }

    public final int getIconsRes() {
        return this.iconsRes;
    }

    public final void setIconsRes(int i) {
        this.iconsRes = i;
    }
}

