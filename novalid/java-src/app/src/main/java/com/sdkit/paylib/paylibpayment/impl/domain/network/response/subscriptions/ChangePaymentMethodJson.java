package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.subscriptions.ChangePaymentMethodResponse;
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
public final class ChangePaymentMethodJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5655f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), null};

    /* renamed from: a */
    public final Integer f5656a;

    /* renamed from: b */
    public final String f5657b;

    /* renamed from: c */
    public final String f5658c;

    /* renamed from: d */
    public final List f5659d;

    /* renamed from: e */
    public final ChangePaymentMethodPayloadJson f5660e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/ChangePaymentMethodJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/ChangePaymentMethodJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ChangePaymentMethodJson> serializer() {
            return ChangePaymentMethodJson$$a.f5661a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChangePaymentMethodJson(int i, Integer num, String str, String str2, List list, ChangePaymentMethodPayloadJson changePaymentMethodPayloadJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5656a = null;
        } else {
            this.f5656a = num;
        }
        if ((i & 2) == 0) {
            this.f5657b = null;
        } else {
            this.f5657b = str;
        }
        if ((i & 4) == 0) {
            this.f5658c = null;
        } else {
            this.f5658c = str2;
        }
        if ((i & 8) == 0) {
            this.f5659d = null;
        } else {
            this.f5659d = list;
        }
        if ((i & 16) == 0) {
            this.f5660e = null;
        } else {
            this.f5660e = changePaymentMethodPayloadJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public ChangePaymentMethodResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5656a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5657b;
        String str2 = this.f5658c;
        List list = this.f5659d;
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
        ChangePaymentMethodPayloadJson changePaymentMethodPayloadJson = this.f5660e;
        return new ChangePaymentMethodResponse(meta, iIntValue, str, str2, arrayList, changePaymentMethodPayloadJson != null ? changePaymentMethodPayloadJson.m4553a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePaymentMethodJson)) {
            return false;
        }
        ChangePaymentMethodJson changePaymentMethodJson = (ChangePaymentMethodJson) obj;
        return Intrinsics.areEqual(this.f5656a, changePaymentMethodJson.f5656a) && Intrinsics.areEqual(this.f5657b, changePaymentMethodJson.f5657b) && Intrinsics.areEqual(this.f5658c, changePaymentMethodJson.f5658c) && Intrinsics.areEqual(this.f5659d, changePaymentMethodJson.f5659d) && Intrinsics.areEqual(this.f5660e, changePaymentMethodJson.f5660e);
    }

    public int hashCode() {
        Integer num = this.f5656a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5657b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5658c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5659d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ChangePaymentMethodPayloadJson changePaymentMethodPayloadJson = this.f5660e;
        return iHashCode4 + (changePaymentMethodPayloadJson != null ? changePaymentMethodPayloadJson.hashCode() : 0);
    }

    public String toString() {
        return "ChangePaymentMethodJson(code=" + this.f5656a + ", errorMessage=" + this.f5657b + ", errorDescription=" + this.f5658c + ", errors=" + this.f5659d + ", payload=" + this.f5660e + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4547a(ChangePaymentMethodJson changePaymentMethodJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5655f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || changePaymentMethodJson.f5656a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, changePaymentMethodJson.f5656a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || changePaymentMethodJson.f5657b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, changePaymentMethodJson.f5657b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || changePaymentMethodJson.f5658c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, changePaymentMethodJson.f5658c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || changePaymentMethodJson.f5659d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], changePaymentMethodJson.f5659d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && changePaymentMethodJson.f5660e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ChangePaymentMethodPayloadJson$$a.f5665a, changePaymentMethodJson.f5660e);
    }
}
