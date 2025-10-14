package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionInfoResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class SubscriptionInfoResponseJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5702f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), null};

    /* renamed from: a */
    public final Integer f5703a;

    /* renamed from: b */
    public final String f5704b;

    /* renamed from: c */
    public final String f5705c;

    /* renamed from: d */
    public final List f5706d;

    /* renamed from: e */
    public final SubscriptionInfoPayloadJson f5707e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionInfoResponseJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionInfoResponseJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionInfoResponseJson> serializer() {
            return SubscriptionInfoResponseJson$$a.f5708a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionInfoResponseJson(int i, Integer num, String str, String str2, List list, SubscriptionInfoPayloadJson subscriptionInfoPayloadJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5703a = null;
        } else {
            this.f5703a = num;
        }
        if ((i & 2) == 0) {
            this.f5704b = null;
        } else {
            this.f5704b = str;
        }
        if ((i & 4) == 0) {
            this.f5705c = null;
        } else {
            this.f5705c = str2;
        }
        if ((i & 8) == 0) {
            this.f5706d = null;
        } else {
            this.f5706d = list;
        }
        if ((i & 16) == 0) {
            this.f5707e = null;
        } else {
            this.f5707e = subscriptionInfoPayloadJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public SubscriptionInfoResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5703a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5704b;
        String str2 = this.f5705c;
        List list = this.f5706d;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((DigitalShopErrorJson) it.next()).m4238a());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        SubscriptionInfoPayloadJson subscriptionInfoPayloadJson = this.f5707e;
        return new SubscriptionInfoResponse(meta, iIntValue, str, str2, arrayList, subscriptionInfoPayloadJson != null ? subscriptionInfoPayloadJson.m4572a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionInfoResponseJson)) {
            return false;
        }
        SubscriptionInfoResponseJson subscriptionInfoResponseJson = (SubscriptionInfoResponseJson) obj;
        return Intrinsics.areEqual(this.f5703a, subscriptionInfoResponseJson.f5703a) && Intrinsics.areEqual(this.f5704b, subscriptionInfoResponseJson.f5704b) && Intrinsics.areEqual(this.f5705c, subscriptionInfoResponseJson.f5705c) && Intrinsics.areEqual(this.f5706d, subscriptionInfoResponseJson.f5706d) && Intrinsics.areEqual(this.f5707e, subscriptionInfoResponseJson.f5707e);
    }

    public int hashCode() {
        Integer num = this.f5703a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5704b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5705c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5706d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SubscriptionInfoPayloadJson subscriptionInfoPayloadJson = this.f5707e;
        return iHashCode4 + (subscriptionInfoPayloadJson != null ? subscriptionInfoPayloadJson.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionInfoResponseJson(code=" + this.f5703a + ", errorMessage=" + this.f5704b + ", errorDescription=" + this.f5705c + ", errors=" + this.f5706d + ", payload=" + this.f5707e + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4577a(SubscriptionInfoResponseJson subscriptionInfoResponseJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5702f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subscriptionInfoResponseJson.f5703a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, subscriptionInfoResponseJson.f5703a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subscriptionInfoResponseJson.f5704b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subscriptionInfoResponseJson.f5704b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subscriptionInfoResponseJson.f5705c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subscriptionInfoResponseJson.f5705c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subscriptionInfoResponseJson.f5706d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], subscriptionInfoResponseJson.f5706d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && subscriptionInfoResponseJson.f5707e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, SubscriptionInfoPayloadJson$$a.f5700a, subscriptionInfoResponseJson.f5707e);
    }
}
