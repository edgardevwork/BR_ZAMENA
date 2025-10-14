package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.SubscriptionsResponse;
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
public final class GetSubscriptionsJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5667f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), null};

    /* renamed from: a */
    public final Integer f5668a;

    /* renamed from: b */
    public final String f5669b;

    /* renamed from: c */
    public final String f5670c;

    /* renamed from: d */
    public final List f5671d;

    /* renamed from: e */
    public final SubscriptionsPayloadJson f5672e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/GetSubscriptionsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/GetSubscriptionsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<GetSubscriptionsJson> serializer() {
            return GetSubscriptionsJson$$a.f5673a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetSubscriptionsJson(int i, Integer num, String str, String str2, List list, SubscriptionsPayloadJson subscriptionsPayloadJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5668a = null;
        } else {
            this.f5668a = num;
        }
        if ((i & 2) == 0) {
            this.f5669b = null;
        } else {
            this.f5669b = str;
        }
        if ((i & 4) == 0) {
            this.f5670c = null;
        } else {
            this.f5670c = str2;
        }
        if ((i & 8) == 0) {
            this.f5671d = null;
        } else {
            this.f5671d = list;
        }
        if ((i & 16) == 0) {
            this.f5672e = null;
        } else {
            this.f5672e = subscriptionsPayloadJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public SubscriptionsResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5668a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5669b;
        String str2 = this.f5670c;
        List list = this.f5671d;
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
        SubscriptionsPayloadJson subscriptionsPayloadJson = this.f5672e;
        return new SubscriptionsResponse(meta, iIntValue, str, str2, arrayList, subscriptionsPayloadJson != null ? subscriptionsPayloadJson.m4588b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSubscriptionsJson)) {
            return false;
        }
        GetSubscriptionsJson getSubscriptionsJson = (GetSubscriptionsJson) obj;
        return Intrinsics.areEqual(this.f5668a, getSubscriptionsJson.f5668a) && Intrinsics.areEqual(this.f5669b, getSubscriptionsJson.f5669b) && Intrinsics.areEqual(this.f5670c, getSubscriptionsJson.f5670c) && Intrinsics.areEqual(this.f5671d, getSubscriptionsJson.f5671d) && Intrinsics.areEqual(this.f5672e, getSubscriptionsJson.f5672e);
    }

    public int hashCode() {
        Integer num = this.f5668a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5669b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5670c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5671d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SubscriptionsPayloadJson subscriptionsPayloadJson = this.f5672e;
        return iHashCode4 + (subscriptionsPayloadJson != null ? subscriptionsPayloadJson.hashCode() : 0);
    }

    public String toString() {
        return "GetSubscriptionsJson(code=" + this.f5668a + ", errorMessage=" + this.f5669b + ", errorDescription=" + this.f5670c + ", errors=" + this.f5671d + ", payload=" + this.f5672e + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4556a(GetSubscriptionsJson getSubscriptionsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5667f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getSubscriptionsJson.f5668a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, getSubscriptionsJson.f5668a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getSubscriptionsJson.f5669b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getSubscriptionsJson.f5669b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getSubscriptionsJson.f5670c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getSubscriptionsJson.f5670c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getSubscriptionsJson.f5671d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], getSubscriptionsJson.f5671d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && getSubscriptionsJson.f5672e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, SubscriptionsPayloadJson$$a.f5721a, getSubscriptionsJson.f5672e);
    }
}
