package com.blackhub.bronline.game.gui.menupausesettingandmap.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuPauseButtonObj.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/data/MenuPauseButtonObj;", "", "buttonId", "", "buttonName", "", "buttonIconRes", "(ILjava/lang/String;I)V", "getButtonIconRes", "()I", "getButtonId", "getButtonName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
