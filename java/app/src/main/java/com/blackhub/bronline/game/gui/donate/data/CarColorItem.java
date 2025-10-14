package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CarColorItem.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class CarColorItem {
    public static final int $stable = 8;

    @SerializedName("color")
    @NotNull
    public final String color;

    @SerializedName("gameColor")
    public final int gameColor;

    @SerializedName("id")
    public final int id;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    public final int price;
    public boolean selected;
    public boolean startColor;

    public static /* synthetic */ CarColorItem copy$default(CarColorItem carColorItem, int i, int i2, int i3, String str, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = carColorItem.id;
        }
        if ((i4 & 2) != 0) {
            i2 = carColorItem.gameColor;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = carColorItem.price;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = carColorItem.color;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            z = carColorItem.selected;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = carColorItem.startColor;
        }
        return carColorItem.copy(i, i5, i6, str2, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getGameColor() {
        return this.gameColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getStartColor() {
        return this.startColor;
    }

    @NotNull
    public final CarColorItem copy(int id, int gameColor, int price, @NotNull String color, boolean selected, boolean startColor) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new CarColorItem(id, gameColor, price, color, selected, startColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarColorItem)) {
            return false;
        }
        CarColorItem carColorItem = (CarColorItem) other;
        return this.id == carColorItem.id && this.gameColor == carColorItem.gameColor && this.price == carColorItem.price && Intrinsics.areEqual(this.color, carColorItem.color) && this.selected == carColorItem.selected && this.startColor == carColorItem.startColor;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.gameColor)) * 31) + Integer.hashCode(this.price)) * 31) + this.color.hashCode()) * 31) + Boolean.hashCode(this.selected)) * 31) + Boolean.hashCode(this.startColor);
    }

    @NotNull
    public String toString() {
        return "CarColorItem(id=" + this.id + ", gameColor=" + this.gameColor + ", price=" + this.price + ", color=" + this.color + ", selected=" + this.selected + ", startColor=" + this.startColor + ")";
    }

    public CarColorItem(int i, int i2, int i3, @NotNull String color, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.id = i;
        this.gameColor = i2;
        this.price = i3;
        this.color = color;
        this.selected = z;
        this.startColor = z2;
    }

    public /* synthetic */ CarColorItem(int i, int i2, int i3, String str, boolean z, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? false : z2);
    }

    public final int getId() {
        return this.id;
    }

    public final int getGameColor() {
        return this.gameColor;
    }

    public final int getPrice() {
        return this.price;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final boolean getStartColor() {
        return this.startColor;
    }

    public final void setStartColor(boolean z) {
        this.startColor = z;
    }
}

