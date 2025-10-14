package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionProductInfo;", "", "", "component1", "component2", "component3", "productId", "image", "imagePromo", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "b", "getImage", "c", "getImagePromo", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class SubscriptionProductInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String productId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String image;

    /* renamed from: c, reason: from kotlin metadata */
    public final String imagePromo;

    public SubscriptionProductInfo(String productId, String str, String str2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.productId = productId;
        this.image = str;
        this.imagePromo = str2;
    }

    public static /* synthetic */ SubscriptionProductInfo copy$default(SubscriptionProductInfo subscriptionProductInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionProductInfo.productId;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionProductInfo.image;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionProductInfo.imagePromo;
        }
        return subscriptionProductInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImagePromo() {
        return this.imagePromo;
    }

    public final SubscriptionProductInfo copy(String productId, String image, String imagePromo) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new SubscriptionProductInfo(productId, image, imagePromo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionProductInfo)) {
            return false;
        }
        SubscriptionProductInfo subscriptionProductInfo = (SubscriptionProductInfo) other;
        return Intrinsics.areEqual(this.productId, subscriptionProductInfo.productId) && Intrinsics.areEqual(this.image, subscriptionProductInfo.image) && Intrinsics.areEqual(this.imagePromo, subscriptionProductInfo.imagePromo);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImagePromo() {
        return this.imagePromo;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.image;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imagePromo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionProductInfo(productId=");
        sb.append(this.productId);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", imagePromo=");
        return C8032c.m1430a(sb, this.imagePromo, ')');
    }
}
