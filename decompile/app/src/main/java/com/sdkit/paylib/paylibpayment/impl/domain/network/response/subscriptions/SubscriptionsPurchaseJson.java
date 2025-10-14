package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscription;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson$$a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class SubscriptionsPurchaseJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5747a;

    /* renamed from: b */
    public final String f5748b;

    /* renamed from: c */
    public final String f5749c;

    /* renamed from: d */
    public final String f5750d;

    /* renamed from: e */
    public final String f5751e;

    /* renamed from: f */
    public final String f5752f;

    /* renamed from: g */
    public final String f5753g;

    /* renamed from: h */
    public final String f5754h;

    /* renamed from: i */
    public final String f5755i;

    /* renamed from: j */
    public final String f5756j;

    /* renamed from: k */
    public final String f5757k;

    /* renamed from: l */
    public final String f5758l;

    /* renamed from: m */
    public final Integer f5759m;

    /* renamed from: n */
    public final PurchaseStateJson f5760n;

    /* renamed from: o */
    public final SubscriptionsPurchaseDetailsJson f5761o;

    /* renamed from: p */
    public final ProductInfoJson f5762p;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPurchaseJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPurchaseJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionsPurchaseJson> serializer() {
            return SubscriptionsPurchaseJson$$a.f5763a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionsPurchaseJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, PurchaseStateJson purchaseStateJson, SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson, ProductInfoJson productInfoJson, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, SubscriptionsPurchaseJson$$a.f5763a.getDescriptor());
        }
        this.f5747a = str;
        this.f5748b = str2;
        this.f5749c = str3;
        this.f5750d = str4;
        this.f5751e = str5;
        this.f5752f = str6;
        if ((i & 64) == 0) {
            this.f5753g = null;
        } else {
            this.f5753g = str7;
        }
        if ((i & 128) == 0) {
            this.f5754h = null;
        } else {
            this.f5754h = str8;
        }
        if ((i & 256) == 0) {
            this.f5755i = null;
        } else {
            this.f5755i = str9;
        }
        if ((i & 512) == 0) {
            this.f5756j = null;
        } else {
            this.f5756j = str10;
        }
        if ((i & 1024) == 0) {
            this.f5757k = null;
        } else {
            this.f5757k = str11;
        }
        if ((i & 2048) == 0) {
            this.f5758l = null;
        } else {
            this.f5758l = str12;
        }
        if ((i & 4096) == 0) {
            this.f5759m = null;
        } else {
            this.f5759m = num;
        }
        if ((i & 8192) == 0) {
            this.f5760n = null;
        } else {
            this.f5760n = purchaseStateJson;
        }
        if ((i & 16384) == 0) {
            this.f5761o = null;
        } else {
            this.f5761o = subscriptionsPurchaseDetailsJson;
        }
        if ((i & 32768) == 0) {
            this.f5762p = null;
        } else {
            this.f5762p = productInfoJson;
        }
    }

    /* renamed from: a */
    public PurchaseSubscription m4610a() {
        String str;
        String str2;
        PurchaseState purchaseStateM4541c;
        String str3 = this.f5747a;
        String str4 = this.f5748b;
        String str5 = this.f5749c;
        String str6 = this.f5750d;
        String str7 = this.f5751e;
        String str8 = this.f5752f;
        String str9 = this.f5753g;
        String strM4562a = this.f5754h;
        if (strM4562a != null) {
            str = strM4562a;
        } else {
            ProductInfoJson productInfoJson = this.f5762p;
            if (productInfoJson != null) {
                strM4562a = productInfoJson.m4562a();
                str = strM4562a;
            } else {
                str = null;
            }
        }
        String strM4563b = this.f5755i;
        if (strM4563b != null) {
            str2 = strM4563b;
        } else {
            ProductInfoJson productInfoJson2 = this.f5762p;
            if (productInfoJson2 != null) {
                strM4563b = productInfoJson2.m4563b();
                str2 = strM4563b;
            } else {
                str2 = null;
            }
        }
        String str10 = this.f5756j;
        String str11 = this.f5757k;
        String str12 = this.f5758l;
        Integer num = this.f5759m;
        PurchaseStateJson purchaseStateJson = this.f5760n;
        if (purchaseStateJson == null || (purchaseStateM4541c = purchaseStateJson.m4541c()) == null) {
            throw new IllegalStateException("purchase_state cannot be null");
        }
        SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson = this.f5761o;
        return new PurchaseSubscription(str3, str4, str5, str6, str7, str8, str9, str, str2, str10, str11, str12, num, purchaseStateM4541c, subscriptionsPurchaseDetailsJson != null ? subscriptionsPurchaseDetailsJson.m4605b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionsPurchaseJson)) {
            return false;
        }
        SubscriptionsPurchaseJson subscriptionsPurchaseJson = (SubscriptionsPurchaseJson) obj;
        return Intrinsics.areEqual(this.f5747a, subscriptionsPurchaseJson.f5747a) && Intrinsics.areEqual(this.f5748b, subscriptionsPurchaseJson.f5748b) && Intrinsics.areEqual(this.f5749c, subscriptionsPurchaseJson.f5749c) && Intrinsics.areEqual(this.f5750d, subscriptionsPurchaseJson.f5750d) && Intrinsics.areEqual(this.f5751e, subscriptionsPurchaseJson.f5751e) && Intrinsics.areEqual(this.f5752f, subscriptionsPurchaseJson.f5752f) && Intrinsics.areEqual(this.f5753g, subscriptionsPurchaseJson.f5753g) && Intrinsics.areEqual(this.f5754h, subscriptionsPurchaseJson.f5754h) && Intrinsics.areEqual(this.f5755i, subscriptionsPurchaseJson.f5755i) && Intrinsics.areEqual(this.f5756j, subscriptionsPurchaseJson.f5756j) && Intrinsics.areEqual(this.f5757k, subscriptionsPurchaseJson.f5757k) && Intrinsics.areEqual(this.f5758l, subscriptionsPurchaseJson.f5758l) && Intrinsics.areEqual(this.f5759m, subscriptionsPurchaseJson.f5759m) && this.f5760n == subscriptionsPurchaseJson.f5760n && Intrinsics.areEqual(this.f5761o, subscriptionsPurchaseJson.f5761o) && Intrinsics.areEqual(this.f5762p, subscriptionsPurchaseJson.f5762p);
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.f5748b, this.f5747a.hashCode() * 31, 31);
        String str = this.f5749c;
        int iHashCode = (iM1429a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5750d;
        int iM1429a2 = C8031b.m1429a(this.f5752f, C8031b.m1429a(this.f5751e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.f5753g;
        int iHashCode2 = (iM1429a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5754h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5755i;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5756j;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5757k;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5758l;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f5759m;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        PurchaseStateJson purchaseStateJson = this.f5760n;
        int iHashCode9 = (iHashCode8 + (purchaseStateJson == null ? 0 : purchaseStateJson.hashCode())) * 31;
        SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson = this.f5761o;
        int iHashCode10 = (iHashCode9 + (subscriptionsPurchaseDetailsJson == null ? 0 : subscriptionsPurchaseDetailsJson.hashCode())) * 31;
        ProductInfoJson productInfoJson = this.f5762p;
        return iHashCode10 + (productInfoJson != null ? productInfoJson.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionsPurchaseJson(purchaseId=" + this.f5747a + ", applicationCode=" + this.f5748b + ", applicationName=" + this.f5749c + ", applicationImage=" + this.f5750d + ", productId=" + this.f5751e + ", name=" + this.f5752f + ", description=" + this.f5753g + ", image=" + this.f5754h + ", imagePromo=" + this.f5755i + ", visualAmount=" + this.f5756j + ", amount=" + this.f5757k + ", currency=" + this.f5758l + ", quantity=" + this.f5759m + ", purchaseState=" + this.f5760n + ", subscription=" + this.f5761o + ", productInfo=" + this.f5762p + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4609a(SubscriptionsPurchaseJson subscriptionsPurchaseJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, subscriptionsPurchaseJson.f5747a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, subscriptionsPurchaseJson.f5748b);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, subscriptionsPurchaseJson.f5749c);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, subscriptionsPurchaseJson.f5750d);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, subscriptionsPurchaseJson.f5751e);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, subscriptionsPurchaseJson.f5752f);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || subscriptionsPurchaseJson.f5753g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, subscriptionsPurchaseJson.f5753g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subscriptionsPurchaseJson.f5754h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, subscriptionsPurchaseJson.f5754h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || subscriptionsPurchaseJson.f5755i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, subscriptionsPurchaseJson.f5755i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subscriptionsPurchaseJson.f5756j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, subscriptionsPurchaseJson.f5756j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || subscriptionsPurchaseJson.f5757k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, subscriptionsPurchaseJson.f5757k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || subscriptionsPurchaseJson.f5758l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, subscriptionsPurchaseJson.f5758l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || subscriptionsPurchaseJson.f5759m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, subscriptionsPurchaseJson.f5759m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || subscriptionsPurchaseJson.f5760n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, PurchaseStateJson$$a.f5650a, subscriptionsPurchaseJson.f5760n);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || subscriptionsPurchaseJson.f5761o != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, SubscriptionsPurchaseDetailsJson$$a.f5745a, subscriptionsPurchaseJson.f5761o);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && subscriptionsPurchaseJson.f5762p == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, ProductInfoJson$$a.f5677a, subscriptionsPurchaseJson.f5762p);
    }
}
