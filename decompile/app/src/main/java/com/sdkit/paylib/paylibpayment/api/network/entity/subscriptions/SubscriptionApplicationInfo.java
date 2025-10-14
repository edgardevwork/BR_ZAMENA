package com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/subscriptions/SubscriptionApplicationInfo;", "", "", "component1", "component2", "component3", "code", "name", "image", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "b", "getName", "c", "getImage", SegmentConstantPool.INITSTRING, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final /* data */ class SubscriptionApplicationInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String code;

    /* renamed from: b, reason: from kotlin metadata */
    public final String name;

    /* renamed from: c, reason: from kotlin metadata */
    public final String image;

    public SubscriptionApplicationInfo(String str, String str2, String str3) {
        this.code = str;
        this.name = str2;
        this.image = str3;
    }

    public static /* synthetic */ SubscriptionApplicationInfo copy$default(SubscriptionApplicationInfo subscriptionApplicationInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionApplicationInfo.code;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionApplicationInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = subscriptionApplicationInfo.image;
        }
        return subscriptionApplicationInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final SubscriptionApplicationInfo copy(String code, String name, String image) {
        return new SubscriptionApplicationInfo(code, name, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionApplicationInfo)) {
            return false;
        }
        SubscriptionApplicationInfo subscriptionApplicationInfo = (SubscriptionApplicationInfo) other;
        return Intrinsics.areEqual(this.code, subscriptionApplicationInfo.code) && Intrinsics.areEqual(this.name, subscriptionApplicationInfo.name) && Intrinsics.areEqual(this.image, subscriptionApplicationInfo.image);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionApplicationInfo(code=");
        sb.append(this.code);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", image=");
        return C8032c.m1430a(sb, this.image, ')');
    }
}
