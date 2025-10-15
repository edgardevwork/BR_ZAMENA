package com.sdkit.paylib.paylibpayment.api.network.entity.applications;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bF\u0010GJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u009e\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\t\u0010#\u001a\u00020\u0002HÖ\u0001J\t\u0010$\u001a\u00020\u000fHÖ\u0001J\u0013\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b6\u0010\nR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010*R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u0011R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010*R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010\u0011R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010*¨\u0006H"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/applications/Application;", "", "", "component1", "component2", "component3", "Landroid/net/Uri;", "component4", "", "component5", "()Ljava/lang/Boolean;", "component6", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;", "component7", "component8", "", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "productId", "applicationCode", "applicationName", "applicationImage", "isPaidApp", "purchasedStatus", "status", FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.PRICE, "visualPrice", "promoPrice", "visualPromoPrice", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sdkit/paylib/paylibpayment/api/network/entity/applications/Application;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "b", "getApplicationCode", "c", "getApplicationName", "d", "Landroid/net/Uri;", "getApplicationImage", "()Landroid/net/Uri;", "e", "Ljava/lang/Boolean;", "f", "getPurchasedStatus", "g", "Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;", "getStatus", "()Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;", "h", "getCurrency", "i", "Ljava/lang/Integer;", "getPrice", "j", "getVisualPrice", "k", "getPromoPrice", "l", "getVisualPromoPrice", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/ProductStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class Application {

    /* renamed from: a, reason: from kotlin metadata */
    public final String productId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String applicationCode;

    /* renamed from: c, reason: from kotlin metadata */
    public final String applicationName;

    /* renamed from: d, reason: from kotlin metadata */
    public final Uri applicationImage;

    /* renamed from: e, reason: from kotlin metadata */
    public final Boolean isPaidApp;

    /* renamed from: f, reason: from kotlin metadata */
    public final Boolean purchasedStatus;

    /* renamed from: g, reason: from kotlin metadata */
    public final ProductStatus status;

    /* renamed from: h, reason: from kotlin metadata */
    public final String currency;

    /* renamed from: i, reason: from kotlin metadata */
    public final Integer price;

    /* renamed from: j, reason: from kotlin metadata */
    public final String visualPrice;

    /* renamed from: k, reason: from kotlin metadata */
    public final Integer promoPrice;

    /* renamed from: l, reason: from kotlin metadata */
    public final String visualPromoPrice;

    public Application(String productId, String str, String str2, Uri uri, Boolean bool, Boolean bool2, ProductStatus productStatus, String str3, Integer num, String str4, Integer num2, String str5) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
        this.applicationCode = str;
        this.applicationName = str2;
        this.applicationImage = uri;
        this.isPaidApp = bool;
        this.purchasedStatus = bool2;
        this.status = productStatus;
        this.currency = str3;
        this.price = num;
        this.visualPrice = str4;
        this.promoPrice = num2;
        this.visualPromoPrice = str5;
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVisualPrice() {
        return this.visualPrice;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getPromoPrice() {
        return this.promoPrice;
    }

    /* renamed from: component12, reason: from getter */
    public final String getVisualPromoPrice() {
        return this.visualPromoPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationCode() {
        return this.applicationCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component4, reason: from getter */
    public final Uri getApplicationImage() {
        return this.applicationImage;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsPaidApp() {
        return this.isPaidApp;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getPurchasedStatus() {
        return this.purchasedStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final ProductStatus getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    public final Application copy(String productId, String applicationCode, String applicationName, Uri applicationImage, Boolean isPaidApp, Boolean purchasedStatus, ProductStatus status, String currency, Integer price, String visualPrice, Integer promoPrice, String visualPromoPrice) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new Application(productId, applicationCode, applicationName, applicationImage, isPaidApp, purchasedStatus, status, currency, price, visualPrice, promoPrice, visualPromoPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Application)) {
            return false;
        }
        Application application = (Application) other;
        return Intrinsics.areEqual(this.productId, application.productId) && Intrinsics.areEqual(this.applicationCode, application.applicationCode) && Intrinsics.areEqual(this.applicationName, application.applicationName) && Intrinsics.areEqual(this.applicationImage, application.applicationImage) && Intrinsics.areEqual(this.isPaidApp, application.isPaidApp) && Intrinsics.areEqual(this.purchasedStatus, application.purchasedStatus) && this.status == application.status && Intrinsics.areEqual(this.currency, application.currency) && Intrinsics.areEqual(this.price, application.price) && Intrinsics.areEqual(this.visualPrice, application.visualPrice) && Intrinsics.areEqual(this.promoPrice, application.promoPrice) && Intrinsics.areEqual(this.visualPromoPrice, application.visualPromoPrice);
    }

    public final String getApplicationCode() {
        return this.applicationCode;
    }

    public final Uri getApplicationImage() {
        return this.applicationImage;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Integer getPromoPrice() {
        return this.promoPrice;
    }

    public final Boolean getPurchasedStatus() {
        return this.purchasedStatus;
    }

    public final ProductStatus getStatus() {
        return this.status;
    }

    public final String getVisualPrice() {
        return this.visualPrice;
    }

    public final String getVisualPromoPrice() {
        return this.visualPromoPrice;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.applicationCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.applicationName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri = this.applicationImage;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        Boolean bool = this.isPaidApp;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.purchasedStatus;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ProductStatus productStatus = this.status;
        int iHashCode7 = (iHashCode6 + (productStatus == null ? 0 : productStatus.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.price;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.visualPrice;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.promoPrice;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.visualPromoPrice;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isPaidApp() {
        return this.isPaidApp;
    }

    public String toString() {
        return "Application(productId=" + this.productId + ", applicationCode=" + this.applicationCode + ", applicationName=" + this.applicationName + ", applicationImage=" + this.applicationImage + ", isPaidApp=" + this.isPaidApp + ", purchasedStatus=" + this.purchasedStatus + ", status=" + this.status + ", currency=" + this.currency + ", price=" + this.price + ", visualPrice=" + this.visualPrice + ", promoPrice=" + this.promoPrice + ", visualPromoPrice=" + this.visualPromoPrice + ')';
    }
}
