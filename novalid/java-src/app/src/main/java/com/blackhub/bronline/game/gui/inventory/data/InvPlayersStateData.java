package com.blackhub.bronline.game.gui.inventory.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvPlayersStateData.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/data/InvPlayersStateData;", "", "typeState", "", "thisValueState", "maxValueState", "iconsRes", "(IIII)V", "getIconsRes", "()I", "setIconsRes", "(I)V", "getMaxValueState", "setMaxValueState", "getThisValueState", "setThisValueState", "getTypeState", "setTypeState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
