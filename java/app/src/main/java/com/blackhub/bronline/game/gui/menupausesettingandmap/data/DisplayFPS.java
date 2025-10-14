package com.blackhub.bronline.game.gui.menupausesettingandmap.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DisplayFPS.kt */
@StabilityInferred(parameters = 0)
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

