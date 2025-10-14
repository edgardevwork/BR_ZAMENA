package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchaseInfoResponse;
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
public final class GetPurchaseInfoJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5608f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), null};

    /* renamed from: a */
    public final Integer f5609a;

    /* renamed from: b */
    public final String f5610b;

    /* renamed from: c */
    public final String f5611c;

    /* renamed from: d */
    public final List f5612d;

    /* renamed from: e */
    public final PurchaseJson f5613e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/GetPurchaseInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/GetPurchaseInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<GetPurchaseInfoJson> serializer() {
            return GetPurchaseInfoJson$$a.f5614a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetPurchaseInfoJson(int i, Integer num, String str, String str2, List list, PurchaseJson purchaseJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5609a = null;
        } else {
            this.f5609a = num;
        }
        if ((i & 2) == 0) {
            this.f5610b = null;
        } else {
            this.f5610b = str;
        }
        if ((i & 4) == 0) {
            this.f5611c = null;
        } else {
            this.f5611c = str2;
        }
        if ((i & 8) == 0) {
            this.f5612d = null;
        } else {
            this.f5612d = list;
        }
        if ((i & 16) == 0) {
            this.f5613e = null;
        } else {
            this.f5613e = purchaseJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public PurchaseInfoResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5609a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5610b;
        String str2 = this.f5611c;
        List list = this.f5612d;
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
        PurchaseJson purchaseJson = this.f5613e;
        return new PurchaseInfoResponse(meta, iIntValue, str, str2, arrayList, purchaseJson != null ? purchaseJson.m4536a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPurchaseInfoJson)) {
            return false;
        }
        GetPurchaseInfoJson getPurchaseInfoJson = (GetPurchaseInfoJson) obj;
        return Intrinsics.areEqual(this.f5609a, getPurchaseInfoJson.f5609a) && Intrinsics.areEqual(this.f5610b, getPurchaseInfoJson.f5610b) && Intrinsics.areEqual(this.f5611c, getPurchaseInfoJson.f5611c) && Intrinsics.areEqual(this.f5612d, getPurchaseInfoJson.f5612d) && Intrinsics.areEqual(this.f5613e, getPurchaseInfoJson.f5613e);
    }

    public int hashCode() {
        Integer num = this.f5609a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5610b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5611c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5612d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PurchaseJson purchaseJson = this.f5613e;
        return iHashCode4 + (purchaseJson != null ? purchaseJson.hashCode() : 0);
    }

    public String toString() {
        return "GetPurchaseInfoJson(code=" + this.f5609a + ", errorMessage=" + this.f5610b + ", errorDescription=" + this.f5611c + ", errors=" + this.f5612d + ", purchase=" + this.f5613e + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4525a(GetPurchaseInfoJson getPurchaseInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5608f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getPurchaseInfoJson.f5609a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, getPurchaseInfoJson.f5609a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getPurchaseInfoJson.f5610b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getPurchaseInfoJson.f5610b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getPurchaseInfoJson.f5611c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getPurchaseInfoJson.f5611c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getPurchaseInfoJson.f5612d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], getPurchaseInfoJson.f5612d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && getPurchaseInfoJson.f5613e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, PurchaseJson$$a.f5637a, getPurchaseInfoJson.f5613e);
    }
}
