package com.blackhub.bronline.game.p019ui.donate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.datatransport.cct.CctTransportBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.model.product.Product;

/* compiled from: RustoreProductDetailsItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class RustoreProductDetailsItem {
    public static final int $stable = 8;

    @NotNull
    public final DonateDepositCoinsItemModel model;

    @NotNull
    public final Product product;

    public static /* synthetic */ RustoreProductDetailsItem copy$default(RustoreProductDetailsItem rustoreProductDetailsItem, Product product, DonateDepositCoinsItemModel donateDepositCoinsItemModel, int i, Object obj) {
        if ((i & 1) != 0) {
            product = rustoreProductDetailsItem.product;
        }
        if ((i & 2) != 0) {
            donateDepositCoinsItemModel = rustoreProductDetailsItem.model;
        }
        return rustoreProductDetailsItem.copy(product, donateDepositCoinsItemModel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DonateDepositCoinsItemModel getModel() {
        return this.model;
    }

    @NotNull
    public final RustoreProductDetailsItem copy(@NotNull Product product, @NotNull DonateDepositCoinsItemModel model) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(model, "model");
        return new RustoreProductDetailsItem(product, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RustoreProductDetailsItem)) {
            return false;
        }
        RustoreProductDetailsItem rustoreProductDetailsItem = (RustoreProductDetailsItem) other;
        return Intrinsics.areEqual(this.product, rustoreProductDetailsItem.product) && Intrinsics.areEqual(this.model, rustoreProductDetailsItem.model);
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + this.model.hashCode();
    }

    @NotNull
    public String toString() {
        return "RustoreProductDetailsItem(product=" + this.product + ", model=" + this.model + ")";
    }

    public RustoreProductDetailsItem(@NotNull Product product, @NotNull DonateDepositCoinsItemModel model) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(model, "model");
        this.product = product;
        this.model = model;
    }

    @NotNull
    public final Product getProduct() {
        return this.product;
    }

    @NotNull
    public final DonateDepositCoinsItemModel getModel() {
        return this.model;
    }
}

