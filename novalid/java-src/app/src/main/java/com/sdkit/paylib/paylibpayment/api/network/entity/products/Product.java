package com.sdkit.paylib.paylibpayment.api.network.entity.products;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bK\u0010LJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u009c\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001J\u0013\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010+R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u000bR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010+R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010+R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u0010)\u001a\u0004\b@\u0010+R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u0019\u0010 \u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006M"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/Product;", "", "", "component1", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;", "component2", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "Landroid/net/Uri;", "component10", "component11", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductSubscription;", "component12", "productId", "productType", "productStatus", "priceLabel", FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.CURRENCY, "language", "title", "description", "imageUrl", "promoImageUrl", "subscription", "copy", "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductSubscription;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/Product;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "b", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;", "getProductType", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;", "c", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;", "getProductStatus", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;", "d", "getPriceLabel", "e", "Ljava/lang/Integer;", "getPrice", "f", "getCurrency", "g", "getLanguage", "h", "getTitle", "i", "getDescription", "j", "Landroid/net/Uri;", "getImageUrl", "()Landroid/net/Uri;", "k", "getPromoImageUrl", "l", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductSubscription;", "getSubscription", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductSubscription;", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductType;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductSubscription;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Product {

    /* renamed from: a, reason: from kotlin metadata */
    public final String productId;

    /* renamed from: b, reason: from kotlin metadata */
    public final ProductType productType;

    /* renamed from: c, reason: from kotlin metadata */
    public final ProductStatus productStatus;

    /* renamed from: d, reason: from kotlin metadata */
    public final String priceLabel;

    /* renamed from: e, reason: from kotlin metadata */
    public final Integer price;

    /* renamed from: f, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: g, reason: from kotlin metadata */
    public final String language;

    /* renamed from: h, reason: from kotlin metadata */
    public final String title;

    /* renamed from: i, reason: from kotlin metadata */
    public final String description;

    /* renamed from: j, reason: from kotlin metadata */
    public final Uri imageUrl;

    /* renamed from: k, reason: from kotlin metadata */
    public final Uri promoImageUrl;

    /* renamed from: l, reason: from kotlin metadata */
    public final ProductSubscription subscription;

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

    public /* synthetic */ Product(String str, ProductType productType, ProductStatus productStatus, String str2, Integer num, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, ProductSubscription productSubscription, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : productType, productStatus, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : uri, (i & 1024) != 0 ? null : uri2, (i & 2048) != 0 ? null : productSubscription);
    }
}
