package com.sdkit.paylib.paylibnative.api.presentation;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006!"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibPurchaseParams;", "", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "productId", "orderId", FirebaseAnalytics.Param.QUANTITY, "developerPayload", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibPurchaseParams;", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "b", "getOrderId", "c", "Ljava/lang/Integer;", "getQuantity", "d", "getDeveloperPayload", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final /* data */ class PaylibPurchaseParams {

    /* renamed from: a, reason: from kotlin metadata */
    public final String productId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String orderId;

    /* renamed from: c, reason: from kotlin metadata */
    public final Integer quantity;

    /* renamed from: d, reason: from kotlin metadata */
    public final String developerPayload;

    public PaylibPurchaseParams(String productId, String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
        this.orderId = str;
        this.quantity = num;
        this.developerPayload = str2;
    }

    public static /* synthetic */ PaylibPurchaseParams copy$default(PaylibPurchaseParams paylibPurchaseParams, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paylibPurchaseParams.productId;
        }
        if ((i & 2) != 0) {
            str2 = paylibPurchaseParams.orderId;
        }
        if ((i & 4) != 0) {
            num = paylibPurchaseParams.quantity;
        }
        if ((i & 8) != 0) {
            str3 = paylibPurchaseParams.developerPayload;
        }
        return paylibPurchaseParams.copy(str, str2, num, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final PaylibPurchaseParams copy(String productId, String orderId, Integer quantity, String developerPayload) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new PaylibPurchaseParams(productId, orderId, quantity, developerPayload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaylibPurchaseParams)) {
            return false;
        }
        PaylibPurchaseParams paylibPurchaseParams = (PaylibPurchaseParams) other;
        return Intrinsics.areEqual(this.productId, paylibPurchaseParams.productId) && Intrinsics.areEqual(this.orderId, paylibPurchaseParams.orderId) && Intrinsics.areEqual(this.quantity, paylibPurchaseParams.quantity) && Intrinsics.areEqual(this.developerPayload, paylibPurchaseParams.developerPayload);
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.orderId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.quantity;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.developerPayload;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaylibPurchaseParams(productId=");
        sb.append(this.productId);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", quantity=");
        sb.append(this.quantity);
        sb.append(", developerPayload=");
        return C8032c.m1430a(sb, this.developerPayload, ')');
    }

    public /* synthetic */ PaylibPurchaseParams(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }
}
