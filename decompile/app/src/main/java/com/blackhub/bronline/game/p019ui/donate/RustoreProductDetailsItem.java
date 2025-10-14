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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/donate/RustoreProductDetailsItem;", "", CctTransportBackend.KEY_PRODUCT, "Lru/rustore/sdk/billingclient/model/product/Product;", "model", "Lcom/blackhub/bronline/game/ui/donate/DonateDepositCoinsItemModel;", "(Lru/rustore/sdk/billingclient/model/product/Product;Lcom/blackhub/bronline/game/ui/donate/DonateDepositCoinsItemModel;)V", "getModel", "()Lcom/blackhub/bronline/game/ui/donate/DonateDepositCoinsItemModel;", "getProduct", "()Lru/rustore/sdk/billingclient/model/product/Product;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
