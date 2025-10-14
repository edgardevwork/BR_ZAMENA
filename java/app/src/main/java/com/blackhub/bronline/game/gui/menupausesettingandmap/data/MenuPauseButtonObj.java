package com.blackhub.bronline.game.gui.menupausesettingandmap.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuPauseButtonObj.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class MenuPauseButtonObj {
    public static final int $stable = 0;
    public final int buttonIconRes;
    public final int buttonId;

    @NotNull
    public final String buttonName;

    public static /* synthetic */ MenuPauseButtonObj copy$default(MenuPauseButtonObj menuPauseButtonObj, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = menuPauseButtonObj.buttonId;
        }
        if ((i3 & 2) != 0) {
            str = menuPauseButtonObj.buttonName;
        }
        if ((i3 & 4) != 0) {
            i2 = menuPauseButtonObj.buttonIconRes;
        }
        return menuPauseButtonObj.copy(i, str, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getButtonId() {
        return this.buttonId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getButtonIconRes() {
        return this.buttonIconRes;
    }

    @NotNull
    public final MenuPauseButtonObj copy(int buttonId, @NotNull String buttonName, @DrawableRes int buttonIconRes) {
        Intrinsics.checkNotNullParameter(buttonName, "buttonName");
        return new MenuPauseButtonObj(buttonId, buttonName, buttonIconRes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuPauseButtonObj)) {
            return false;
        }
        MenuPauseButtonObj menuPauseButtonObj = (MenuPauseButtonObj) other;
        return this.buttonId == menuPauseButtonObj.buttonId && Intrinsics.areEqual(this.buttonName, menuPauseButtonObj.buttonName) && this.buttonIconRes == menuPauseButtonObj.buttonIconRes;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.buttonId) * 31) + this.buttonName.hashCode()) * 31) + Integer.hashCode(this.buttonIconRes);
    }

    @NotNull
    public String toString() {
        return "MenuPauseButtonObj(buttonId=" + this.buttonId + ", buttonName=" + this.buttonName + ", buttonIconRes=" + this.buttonIconRes + ")";
    }

    public MenuPauseButtonObj(int i, @NotNull String buttonName, @DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(buttonName, "buttonName");
        this.buttonId = i;
        this.buttonName = buttonName;
        this.buttonIconRes = i2;
    }

    public final int getButtonId() {
        return this.buttonId;
    }

    @NotNull
    public final String getButtonName() {
        return this.buttonName;
    }

    public final int getButtonIconRes() {
        return this.buttonIconRes;
    }
}

