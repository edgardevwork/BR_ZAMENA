package com.blackhub.bronline.game.gui.inventory.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvActionButtonsData.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class InvActionButtonsData {
    public static final int $stable = 8;
    public int iconsRes;

    @NotNull
    public String nameButton;
    public int typeMenu;

    public static /* synthetic */ InvActionButtonsData copy$default(InvActionButtonsData invActionButtonsData, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = invActionButtonsData.typeMenu;
        }
        if ((i3 & 2) != 0) {
            str = invActionButtonsData.nameButton;
        }
        if ((i3 & 4) != 0) {
            i2 = invActionButtonsData.iconsRes;
        }
        return invActionButtonsData.copy(i, str, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTypeMenu() {
        return this.typeMenu;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNameButton() {
        return this.nameButton;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIconsRes() {
        return this.iconsRes;
    }

    @NotNull
    public final InvActionButtonsData copy(int typeMenu, @NotNull String nameButton, @DrawableRes int iconsRes) {
        Intrinsics.checkNotNullParameter(nameButton, "nameButton");
        return new InvActionButtonsData(typeMenu, nameButton, iconsRes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvActionButtonsData)) {
            return false;
        }
        InvActionButtonsData invActionButtonsData = (InvActionButtonsData) other;
        return this.typeMenu == invActionButtonsData.typeMenu && Intrinsics.areEqual(this.nameButton, invActionButtonsData.nameButton) && this.iconsRes == invActionButtonsData.iconsRes;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.typeMenu) * 31) + this.nameButton.hashCode()) * 31) + Integer.hashCode(this.iconsRes);
    }

    @NotNull
    public String toString() {
        return "InvActionButtonsData(typeMenu=" + this.typeMenu + ", nameButton=" + this.nameButton + ", iconsRes=" + this.iconsRes + ")";
    }

    public InvActionButtonsData(int i, @NotNull String nameButton, @DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(nameButton, "nameButton");
        this.typeMenu = i;
        this.nameButton = nameButton;
        this.iconsRes = i2;
    }

    public final int getTypeMenu() {
        return this.typeMenu;
    }

    public final void setTypeMenu(int i) {
        this.typeMenu = i;
    }

    @NotNull
    public final String getNameButton() {
        return this.nameButton;
    }

    public final void setNameButton(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameButton = str;
    }

    public final int getIconsRes() {
        return this.iconsRes;
    }

    public final void setIconsRes(int i) {
        this.iconsRes = i;
    }
}

