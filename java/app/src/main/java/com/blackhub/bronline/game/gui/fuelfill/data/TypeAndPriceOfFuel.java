package com.blackhub.bronline.game.gui.fuelfill.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeAndPriceOfFuel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class TypeAndPriceOfFuel {
    public static final int $stable = 8;
    public final int price;
    public boolean selected;

    @NotNull
    public final String type;

    public static /* synthetic */ TypeAndPriceOfFuel copy$default(TypeAndPriceOfFuel typeAndPriceOfFuel, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = typeAndPriceOfFuel.type;
        }
        if ((i2 & 2) != 0) {
            i = typeAndPriceOfFuel.price;
        }
        if ((i2 & 4) != 0) {
            z = typeAndPriceOfFuel.selected;
        }
        return typeAndPriceOfFuel.copy(str, i, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    public final TypeAndPriceOfFuel copy(@NotNull String type, int price, boolean selected) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new TypeAndPriceOfFuel(type, price, selected);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypeAndPriceOfFuel)) {
            return false;
        }
        TypeAndPriceOfFuel typeAndPriceOfFuel = (TypeAndPriceOfFuel) other;
        return Intrinsics.areEqual(this.type, typeAndPriceOfFuel.type) && this.price == typeAndPriceOfFuel.price && this.selected == typeAndPriceOfFuel.selected;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.price)) * 31) + Boolean.hashCode(this.selected);
    }

    @NotNull
    public String toString() {
        return "TypeAndPriceOfFuel(type=" + this.type + ", price=" + this.price + ", selected=" + this.selected + ")";
    }

    public TypeAndPriceOfFuel(@NotNull String type, int i, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.price = i;
        this.selected = z;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getPrice() {
        return this.price;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }
}

