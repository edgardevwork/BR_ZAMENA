package com.blackhub.bronline.game.gui.menu.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuListModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class MenuListModel {
    public static final int $stable = 0;
    public final int id;
    public final int image;
    public final int text;

    public static /* synthetic */ MenuListModel copy$default(MenuListModel menuListModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = menuListModel.id;
        }
        if ((i4 & 2) != 0) {
            i2 = menuListModel.image;
        }
        if ((i4 & 4) != 0) {
            i3 = menuListModel.text;
        }
        return menuListModel.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final int getText() {
        return this.text;
    }

    @NotNull
    public final MenuListModel copy(int id, @DrawableRes int image, @StringRes int text) {
        return new MenuListModel(id, image, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuListModel)) {
            return false;
        }
        MenuListModel menuListModel = (MenuListModel) other;
        return this.id == menuListModel.id && this.image == menuListModel.image && this.text == menuListModel.text;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.image)) * 31) + Integer.hashCode(this.text);
    }

    @NotNull
    public String toString() {
        return "MenuListModel(id=" + this.id + ", image=" + this.image + ", text=" + this.text + ")";
    }

    public MenuListModel(int i, @DrawableRes int i2, @StringRes int i3) {
        this.id = i;
        this.image = i2;
        this.text = i3;
    }

    public final int getId() {
        return this.id;
    }

    public final int getImage() {
        return this.image;
    }

    public final int getText() {
        return this.text;
    }
}

