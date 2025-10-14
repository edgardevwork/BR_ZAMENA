package com.blackhub.bronline.game.p019ui.donate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.ProductDetails;
import com.google.android.datatransport.cct.CctTransportBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProductDetailsItem.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class ProductDetailsItem {
    public static final int $stable = 8;

    @NotNull
    public final DonateDepositCoinsItemModel model;

    @NotNull
    public final ProductDetails product;

    public static /* synthetic */ ProductDetailsItem copy$default(ProductDetailsItem productDetailsItem, ProductDetails productDetails, DonateDepositCoinsItemModel donateDepositCoinsItemModel, int i, Object obj) {
        if ((i & 1) != 0) {
            productDetails = productDetailsItem.product;
        }
        if ((i & 2) != 0) {
            donateDepositCoinsItemModel = productDetailsItem.model;
        }
        return productDetailsItem.copy(productDetails, donateDepositCoinsItemModel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductDetails getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DonateDepositCoinsItemModel getModel() {
        return this.model;
    }

    @NotNull
    public final ProductDetailsItem copy(@NotNull ProductDetails product, @NotNull DonateDepositCoinsItemModel model) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(model, "model");
        return new ProductDetailsItem(product, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailsItem)) {
            return false;
        }
        ProductDetailsItem productDetailsItem = (ProductDetailsItem) other;
        return Intrinsics.areEqual(this.product, productDetailsItem.product) && Intrinsics.areEqual(this.model, productDetailsItem.model);
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + this.model.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProductDetailsItem(product=" + this.product + ", model=" + this.model + ")";
    }

    public ProductDetailsItem(@NotNull ProductDetails product, @NotNull DonateDepositCoinsItemModel model) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(model, "model");
        this.product = product;
        this.model = model;
    }

    @NotNull
    public final ProductDetails getProduct() {
        return this.product;
    }

    @NotNull
    public final DonateDepositCoinsItemModel getModel() {
        return this.model;
    }
}

