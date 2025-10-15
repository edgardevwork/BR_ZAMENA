package ru.rustore.sdk.billingclient.model.product;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009a\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\nHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u0006;"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/product/Product;", "", "productId", "", "productType", "Lru/rustore/sdk/billingclient/model/product/ProductType;", "productStatus", "Lru/rustore/sdk/billingclient/model/product/ProductStatus;", "priceLabel", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.CURRENCY, "language", "title", "description", "imageUrl", "Landroid/net/Uri;", "promoImageUrl", "subscription", "Lru/rustore/sdk/billingclient/model/product/ProductSubscription;", "(Ljava/lang/String;Lru/rustore/sdk/billingclient/model/product/ProductType;Lru/rustore/sdk/billingclient/model/product/ProductStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Lru/rustore/sdk/billingclient/model/product/ProductSubscription;)V", "getCurrency", "()Ljava/lang/String;", "getDescription", "getImageUrl", "()Landroid/net/Uri;", "getLanguage", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPriceLabel", "getProductId", "getProductStatus", "()Lru/rustore/sdk/billingclient/model/product/ProductStatus;", "getProductType", "()Lru/rustore/sdk/billingclient/model/product/ProductType;", "getPromoImageUrl", "getSubscription", "()Lru/rustore/sdk/billingclient/model/product/ProductSubscription;", "getTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lru/rustore/sdk/billingclient/model/product/ProductType;Lru/rustore/sdk/billingclient/model/product/ProductStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Lru/rustore/sdk/billingclient/model/product/ProductSubscription;)Lru/rustore/sdk/billingclient/model/product/Product;", "equals", "", "other", "hashCode", "toString", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Product {
    private final String currency;
    private final String description;
    private final Uri imageUrl;
    private final String language;
    private final Integer price;
    private final String priceLabel;
    private final String productId;
    private final ProductStatus productStatus;
    private final ProductType productType;
    private final Uri promoImageUrl;
    private final ProductSubscription subscription;
    private final String title;

    public Product(String productId, ProductType productType, ProductStatus productStatus, String str, Integer num, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, ProductSubscription productSubscription) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productStatus, "productStatus");
        this.productId = productId;
        this.productType = productType;
        this.productStatus = productStatus;
        this.priceLabel = str;
        this.price = num;
        this.currency = str2;
        this.language = str3;
        this.title = str4;
        this.description = str5;
        this.imageUrl = uri;
        this.promoImageUrl = uri2;
        this.subscription = productSubscription;
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component10, reason: from getter */
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final Uri getPromoImageUrl() {
        return this.promoImageUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final ProductSubscription getSubscription() {
        return this.subscription;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductType getProductType() {
        return this.productType;
    }

    /* renamed from: component3, reason: from getter */
    public final ProductStatus getProductStatus() {
        return this.productStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPriceLabel() {
        return this.priceLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final Product copy(String productId, ProductType productType, ProductStatus productStatus, String priceLabel, Integer price, String currency, String language, String title, String description, Uri imageUrl, Uri promoImageUrl, ProductSubscription subscription) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productStatus, "productStatus");
        return new Product(productId, productType, productStatus, priceLabel, price, currency, language, title, description, imageUrl, promoImageUrl, subscription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return Intrinsics.areEqual(this.productId, product.productId) && this.productType == product.productType && this.productStatus == product.productStatus && Intrinsics.areEqual(this.priceLabel, product.priceLabel) && Intrinsics.areEqual(this.price, product.price) && Intrinsics.areEqual(this.currency, product.currency) && Intrinsics.areEqual(this.language, product.language) && Intrinsics.areEqual(this.title, product.title) && Intrinsics.areEqual(this.description, product.description) && Intrinsics.areEqual(this.imageUrl, product.imageUrl) && Intrinsics.areEqual(this.promoImageUrl, product.promoImageUrl) && Intrinsics.areEqual(this.subscription, product.subscription);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final ProductStatus getProductStatus() {
        return this.productStatus;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public final Uri getPromoImageUrl() {
        return this.promoImageUrl;
    }

    public final ProductSubscription getSubscription() {
        return this.subscription;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        ProductType productType = this.productType;
        int iHashCode2 = (this.productStatus.hashCode() + ((iHashCode + (productType == null ? 0 : productType.hashCode())) * 31)) * 31;
        String str = this.priceLabel;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.price;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Uri uri = this.imageUrl;
        int iHashCode9 = (iHashCode8 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.promoImageUrl;
        int iHashCode10 = (iHashCode9 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        ProductSubscription productSubscription = this.subscription;
        return iHashCode10 + (productSubscription != null ? productSubscription.hashCode() : 0);
    }

    public String toString() {
        return "Product(productId=" + this.productId + ", productType=" + this.productType + ", productStatus=" + this.productStatus + ", priceLabel=" + this.priceLabel + ", price=" + this.price + ", currency=" + this.currency + ", language=" + this.language + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", promoImageUrl=" + this.promoImageUrl + ", subscription=" + this.subscription + ')';
    }
}
