package com.blackhub.bronline.game.gui.inventory.data;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InvActionButtonsData.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/data/InvActionButtonsData;", "", "typeMenu", "", "nameButton", "", "iconsRes", "(ILjava/lang/String;I)V", "getIconsRes", "()I", "setIconsRes", "(I)V", "getNameButton", "()Ljava/lang/String;", "setNameButton", "(Ljava/lang/String;)V", "getTypeMenu", "setTypeMenu", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
