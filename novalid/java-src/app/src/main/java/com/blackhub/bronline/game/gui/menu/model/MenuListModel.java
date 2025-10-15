package com.blackhub.bronline.game.gui.menu.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuListModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menu/model/MenuListModel;", "", "id", "", "image", "text", "(III)V", "getId", "()I", "getImage", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
