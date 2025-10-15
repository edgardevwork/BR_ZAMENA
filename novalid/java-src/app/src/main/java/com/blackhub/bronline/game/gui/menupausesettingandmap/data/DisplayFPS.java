package com.blackhub.bronline.game.gui.menupausesettingandmap.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisplayFPS.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/data/DisplayFPS;", "", "maxFPS", "", "currentFPS", "(II)V", "getCurrentFPS", "()I", "setCurrentFPS", "(I)V", "getMaxFPS", "setMaxFPS", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisplayFPS {
    public static final int $stable = 8;
    public int currentFPS;
    public int maxFPS;

    public static /* synthetic */ DisplayFPS copy$default(DisplayFPS displayFPS, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = displayFPS.maxFPS;
        }
        if ((i3 & 2) != 0) {
            i2 = displayFPS.currentFPS;
        }
        return displayFPS.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxFPS() {
        return this.maxFPS;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentFPS() {
        return this.currentFPS;
    }

    @NotNull
    public final DisplayFPS copy(int maxFPS, int currentFPS) {
        return new DisplayFPS(maxFPS, currentFPS);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayFPS)) {
            return false;
        }
        DisplayFPS displayFPS = (DisplayFPS) other;
        return this.maxFPS == displayFPS.maxFPS && this.currentFPS == displayFPS.currentFPS;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxFPS) * 31) + Integer.hashCode(this.currentFPS);
    }

    @NotNull
    public String toString() {
        return "DisplayFPS(maxFPS=" + this.maxFPS + ", currentFPS=" + this.currentFPS + ")";
    }

    public DisplayFPS(int i, int i2) {
        this.maxFPS = i;
        this.currentFPS = i2;
    }

    public final int getMaxFPS() {
        return this.maxFPS;
    }

    public final void setMaxFPS(int i) {
        this.maxFPS = i;
    }

    public final int getCurrentFPS() {
        return this.currentFPS;
    }

    public final void setCurrentFPS(int i) {
        this.currentFPS = i;
    }
}
