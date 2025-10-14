package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionDefaultResponse;
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
public final class SubscriptionDefaultResponseJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final KSerializer[] f5679e = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a)};

    /* renamed from: a */
    public final Integer f5680a;

    /* renamed from: b */
    public final String f5681b;

    /* renamed from: c */
    public final String f5682c;

    /* renamed from: d */
    public final List f5683d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionDefaultResponseJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionDefaultResponseJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionDefaultResponseJson> serializer() {
            return SubscriptionDefaultResponseJson$$a.f5684a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionDefaultResponseJson(int i, Integer num, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5680a = null;
        } else {
            this.f5680a = num;
        }
        if ((i & 2) == 0) {
            this.f5681b = null;
        } else {
            this.f5681b = str;
        }
        if ((i & 4) == 0) {
            this.f5682c = null;
        } else {
            this.f5682c = str2;
        }
        if ((i & 8) == 0) {
            this.f5683d = null;
        } else {
            this.f5683d = list;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public SubscriptionDefaultResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5680a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5681b;
        String str2 = this.f5682c;
        List list = this.f5683d;
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
        return new SubscriptionDefaultResponse(meta, iIntValue, str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionDefaultResponseJson)) {
            return false;
        }
        SubscriptionDefaultResponseJson subscriptionDefaultResponseJson = (SubscriptionDefaultResponseJson) obj;
        return Intrinsics.areEqual(this.f5680a, subscriptionDefaultResponseJson.f5680a) && Intrinsics.areEqual(this.f5681b, subscriptionDefaultResponseJson.f5681b) && Intrinsics.areEqual(this.f5682c, subscriptionDefaultResponseJson.f5682c) && Intrinsics.areEqual(this.f5683d, subscriptionDefaultResponseJson.f5683d);
    }

    public int hashCode() {
        Integer num = this.f5680a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5681b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5682c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5683d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionDefaultResponseJson(code=");
        sb.append(this.f5680a);
        sb.append(", errorMessage=");
        sb.append(this.f5681b);
        sb.append(", errorDescription=");
        sb.append(this.f5682c);
        sb.append(", errors=");
        return C8045g.m1489a(sb, this.f5683d, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4566a(SubscriptionDefaultResponseJson subscriptionDefaultResponseJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5679e;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subscriptionDefaultResponseJson.f5680a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, subscriptionDefaultResponseJson.f5680a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subscriptionDefaultResponseJson.f5681b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subscriptionDefaultResponseJson.f5681b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subscriptionDefaultResponseJson.f5682c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subscriptionDefaultResponseJson.f5682c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && subscriptionDefaultResponseJson.f5683d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], subscriptionDefaultResponseJson.f5683d);
    }
}
