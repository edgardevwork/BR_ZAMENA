package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.network.entity.cards.Card;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscriptionDetails;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.PurchaseSubscriptionInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.SubscriptionApplicationInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.SubscriptionProductInfo;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.CardJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.CardJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson$$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class SubscriptionInfoPayloadJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5686a;

    /* renamed from: b */
    public final String f5687b;

    /* renamed from: c */
    public final String f5688c;

    /* renamed from: d */
    public final String f5689d;

    /* renamed from: e */
    public final String f5690e;

    /* renamed from: f */
    public final String f5691f;

    /* renamed from: g */
    public final String f5692g;

    /* renamed from: h */
    public final String f5693h;

    /* renamed from: i */
    public final String f5694i;

    /* renamed from: j */
    public final String f5695j;

    /* renamed from: k */
    public final PurchaseStateJson f5696k;

    /* renamed from: l */
    public final SubscriptionsPurchaseDetailsJson f5697l;

    /* renamed from: m */
    public final CardJson f5698m;

    /* renamed from: n */
    public final SubscriptionsProductInfoJson f5699n;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionInfoPayloadJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionInfoPayloadJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionInfoPayloadJson> serializer() {
            return SubscriptionInfoPayloadJson$$a.f5700a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionInfoPayloadJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PurchaseStateJson purchaseStateJson, SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson, CardJson cardJson, SubscriptionsProductInfoJson subscriptionsProductInfoJson, SerializationConstructorMarker serializationConstructorMarker) {
        if (67 != (i & 67)) {
            PluginExceptionsKt.throwMissingFieldException(i, 67, SubscriptionInfoPayloadJson$$a.f5700a.getDescriptor());
        }
        this.f5686a = str;
        this.f5687b = str2;
        if ((i & 4) == 0) {
            this.f5688c = null;
        } else {
            this.f5688c = str3;
        }
        if ((i & 8) == 0) {
            this.f5689d = null;
        } else {
            this.f5689d = str4;
        }
        if ((i & 16) == 0) {
            this.f5690e = null;
        } else {
            this.f5690e = str5;
        }
        if ((i & 32) == 0) {
            this.f5691f = null;
        } else {
            this.f5691f = str6;
        }
        this.f5692g = str7;
        if ((i & 128) == 0) {
            this.f5693h = null;
        } else {
            this.f5693h = str8;
        }
        if ((i & 256) == 0) {
            this.f5694i = null;
        } else {
            this.f5694i = str9;
        }
        if ((i & 512) == 0) {
            this.f5695j = null;
        } else {
            this.f5695j = str10;
        }
        if ((i & 1024) == 0) {
            this.f5696k = null;
        } else {
            this.f5696k = purchaseStateJson;
        }
        if ((i & 2048) == 0) {
            this.f5697l = null;
        } else {
            this.f5697l = subscriptionsPurchaseDetailsJson;
        }
        if ((i & 4096) == 0) {
            this.f5698m = null;
        } else {
            this.f5698m = cardJson;
        }
        if ((i & 8192) == 0) {
            this.f5699n = null;
        } else {
            this.f5699n = subscriptionsProductInfoJson;
        }
    }

    /* renamed from: a */
    public PurchaseSubscriptionInfo m4572a() {
        PurchaseState purchaseStateM4541c;
        List listM4606c;
        String str = this.f5686a;
        String str2 = this.f5687b;
        String str3 = this.f5691f;
        String str4 = this.f5693h;
        String str5 = this.f5694i;
        String str6 = this.f5695j;
        PurchaseStateJson purchaseStateJson = this.f5696k;
        if (purchaseStateJson == null || (purchaseStateM4541c = purchaseStateJson.m4541c()) == null) {
            throw new IllegalStateException("purchase_state cannot be null");
        }
        SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson = this.f5697l;
        ArrayList arrayList = null;
        PurchaseSubscriptionDetails purchaseSubscriptionDetailsM4605b = subscriptionsPurchaseDetailsJson != null ? subscriptionsPurchaseDetailsJson.m4605b() : null;
        CardJson cardJson = this.f5698m;
        Card cardM4287a = cardJson != null ? cardJson.m4287a() : null;
        SubscriptionProductInfo subscriptionProductInfoM4574c = m4574c();
        SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson2 = this.f5697l;
        if (subscriptionsPurchaseDetailsJson2 != null && (listM4606c = subscriptionsPurchaseDetailsJson2.m4606c()) != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM4606c, 10));
            Iterator it = listM4606c.iterator();
            while (it.hasNext()) {
                arrayList.add(((SubscriptionTariffPlansJson) it.next()).m4583a());
            }
        }
        return new PurchaseSubscriptionInfo(str, str2, str3, str4, str5, str6, purchaseStateM4541c, purchaseSubscriptionDetailsM4605b, arrayList, cardM4287a, subscriptionProductInfoM4574c, m4573b());
    }

    /* renamed from: b */
    public final SubscriptionApplicationInfo m4573b() {
        return new SubscriptionApplicationInfo(this.f5688c, this.f5689d, this.f5690e);
    }

    /* renamed from: c */
    public final SubscriptionProductInfo m4574c() {
        String str = this.f5692g;
        SubscriptionsProductInfoJson subscriptionsProductInfoJson = this.f5699n;
        String strM4599a = subscriptionsProductInfoJson != null ? subscriptionsProductInfoJson.m4599a() : null;
        SubscriptionsProductInfoJson subscriptionsProductInfoJson2 = this.f5699n;
        return new SubscriptionProductInfo(str, strM4599a, subscriptionsProductInfoJson2 != null ? subscriptionsProductInfoJson2.m4600b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionInfoPayloadJson)) {
            return false;
        }
        SubscriptionInfoPayloadJson subscriptionInfoPayloadJson = (SubscriptionInfoPayloadJson) obj;
        return Intrinsics.areEqual(this.f5686a, subscriptionInfoPayloadJson.f5686a) && Intrinsics.areEqual(this.f5687b, subscriptionInfoPayloadJson.f5687b) && Intrinsics.areEqual(this.f5688c, subscriptionInfoPayloadJson.f5688c) && Intrinsics.areEqual(this.f5689d, subscriptionInfoPayloadJson.f5689d) && Intrinsics.areEqual(this.f5690e, subscriptionInfoPayloadJson.f5690e) && Intrinsics.areEqual(this.f5691f, subscriptionInfoPayloadJson.f5691f) && Intrinsics.areEqual(this.f5692g, subscriptionInfoPayloadJson.f5692g) && Intrinsics.areEqual(this.f5693h, subscriptionInfoPayloadJson.f5693h) && Intrinsics.areEqual(this.f5694i, subscriptionInfoPayloadJson.f5694i) && Intrinsics.areEqual(this.f5695j, subscriptionInfoPayloadJson.f5695j) && this.f5696k == subscriptionInfoPayloadJson.f5696k && Intrinsics.areEqual(this.f5697l, subscriptionInfoPayloadJson.f5697l) && Intrinsics.areEqual(this.f5698m, subscriptionInfoPayloadJson.f5698m) && Intrinsics.areEqual(this.f5699n, subscriptionInfoPayloadJson.f5699n);
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.f5687b, this.f5686a.hashCode() * 31, 31);
        String str = this.f5688c;
        int iHashCode = (iM1429a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5689d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5690e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5691f;
        int iM1429a2 = C8031b.m1429a(this.f5692g, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.f5693h;
        int iHashCode4 = (iM1429a2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5694i;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5695j;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PurchaseStateJson purchaseStateJson = this.f5696k;
        int iHashCode7 = (iHashCode6 + (purchaseStateJson == null ? 0 : purchaseStateJson.hashCode())) * 31;
        SubscriptionsPurchaseDetailsJson subscriptionsPurchaseDetailsJson = this.f5697l;
        int iHashCode8 = (iHashCode7 + (subscriptionsPurchaseDetailsJson == null ? 0 : subscriptionsPurchaseDetailsJson.hashCode())) * 31;
        CardJson cardJson = this.f5698m;
        int iHashCode9 = (iHashCode8 + (cardJson == null ? 0 : cardJson.hashCode())) * 31;
        SubscriptionsProductInfoJson subscriptionsProductInfoJson = this.f5699n;
        return iHashCode9 + (subscriptionsProductInfoJson != null ? subscriptionsProductInfoJson.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionInfoPayloadJson(purchaseId=" + this.f5686a + ", name=" + this.f5687b + ", applicationCode=" + this.f5688c + ", applicationName=" + this.f5689d + ", applicationImage=" + this.f5690e + ", description=" + this.f5691f + ", productId=" + this.f5692g + ", visualAmount=" + this.f5693h + ", amount=" + this.f5694i + ", currency=" + this.f5695j + ", purchaseState=" + this.f5696k + ", subscription=" + this.f5697l + ", paymentInfo=" + this.f5698m + ", productInfo=" + this.f5699n + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4571a(SubscriptionInfoPayloadJson subscriptionInfoPayloadJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, subscriptionInfoPayloadJson.f5686a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, subscriptionInfoPayloadJson.f5687b);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subscriptionInfoPayloadJson.f5688c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subscriptionInfoPayloadJson.f5688c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subscriptionInfoPayloadJson.f5689d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, subscriptionInfoPayloadJson.f5689d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subscriptionInfoPayloadJson.f5690e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subscriptionInfoPayloadJson.f5690e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subscriptionInfoPayloadJson.f5691f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subscriptionInfoPayloadJson.f5691f);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, subscriptionInfoPayloadJson.f5692g);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subscriptionInfoPayloadJson.f5693h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, subscriptionInfoPayloadJson.f5693h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || subscriptionInfoPayloadJson.f5694i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, subscriptionInfoPayloadJson.f5694i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subscriptionInfoPayloadJson.f5695j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, subscriptionInfoPayloadJson.f5695j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || subscriptionInfoPayloadJson.f5696k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, PurchaseStateJson$$a.f5650a, subscriptionInfoPayloadJson.f5696k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || subscriptionInfoPayloadJson.f5697l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, SubscriptionsPurchaseDetailsJson$$a.f5745a, subscriptionInfoPayloadJson.f5697l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || subscriptionInfoPayloadJson.f5698m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, CardJson$$a.f5212a, subscriptionInfoPayloadJson.f5698m);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && subscriptionInfoPayloadJson.f5699n == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, SubscriptionsProductInfoJson$$a.f5736a, subscriptionInfoPayloadJson.f5699n);
    }
}
