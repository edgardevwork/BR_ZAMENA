package com.blackhub.bronline.game.gui.fuelfill.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeAndPriceOfFuel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fuelfill/data/TypeAndPriceOfFuel;", "", "type", "", FirebaseAnalytics.Param.PRICE, "", "selected", "", "(Ljava/lang/String;IZ)V", "getPrice", "()I", "getSelected", "()Z", "setSelected", "(Z)V", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
