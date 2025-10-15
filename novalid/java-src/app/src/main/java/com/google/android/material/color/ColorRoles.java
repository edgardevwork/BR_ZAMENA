package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* loaded from: classes4.dex */
public final class ColorRoles {
    public final int accent;
    public final int accentContainer;
    public final int onAccent;
    public final int onAccentContainer;

    public ColorRoles(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        this.accent = i;
        this.onAccent = i2;
        this.accentContainer = i3;
        this.onAccentContainer = i4;
    }

    @ColorInt
    public int getAccent() {
        return this.accent;
    }

    @ColorInt
    public int getOnAccent() {
        return this.onAccent;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
