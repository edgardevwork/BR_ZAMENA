package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.PurchasesResponse;
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
public final class GetPurchasesJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5616f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), new ArrayListSerializer(PurchaseJson$$a.f5637a)};

    /* renamed from: a */
    public final Integer f5617a;

    /* renamed from: b */
    public final String f5618b;

    /* renamed from: c */
    public final String f5619c;

    /* renamed from: d */
    public final List f5620d;

    /* renamed from: e */
    public final List f5621e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/GetPurchasesJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/GetPurchasesJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<GetPurchasesJson> serializer() {
            return GetPurchasesJson$$a.f5622a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetPurchasesJson(int i, Integer num, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5617a = null;
        } else {
            this.f5617a = num;
        }
        if ((i & 2) == 0) {
            this.f5618b = null;
        } else {
            this.f5618b = str;
        }
        if ((i & 4) == 0) {
            this.f5619c = null;
        } else {
            this.f5619c = str2;
        }
        if ((i & 8) == 0) {
            this.f5620d = null;
        } else {
            this.f5620d = list;
        }
        if ((i & 16) == 0) {
            this.f5621e = null;
        } else {
            this.f5621e = list2;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public PurchasesResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5617a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5618b;
        String str2 = this.f5619c;
        List list = this.f5620d;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DigitalShopErrorJson) it.next()).m4238a());
            }
        } else {
            arrayList = null;
        }
        List list2 = this.f5621e;
        if (list2 != null) {
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((PurchaseJson) it2.next()).m4536a());
            }
        }
        return new PurchasesResponse(meta, iIntValue, str, str2, arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPurchasesJson)) {
            return false;
        }
        GetPurchasesJson getPurchasesJson = (GetPurchasesJson) obj;
        return Intrinsics.areEqual(this.f5617a, getPurchasesJson.f5617a) && Intrinsics.areEqual(this.f5618b, getPurchasesJson.f5618b) && Intrinsics.areEqual(this.f5619c, getPurchasesJson.f5619c) && Intrinsics.areEqual(this.f5620d, getPurchasesJson.f5620d) && Intrinsics.areEqual(this.f5621e, getPurchasesJson.f5621e);
    }

    public int hashCode() {
        Integer num = this.f5617a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5618b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5619c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5620d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f5621e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetPurchasesJson(code=");
        sb.append(this.f5617a);
        sb.append(", errorMessage=");
        sb.append(this.f5618b);
        sb.append(", errorDescription=");
        sb.append(this.f5619c);
        sb.append(", errors=");
        sb.append(this.f5620d);
        sb.append(", purchases=");
        return C8045g.m1489a(sb, this.f5621e, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4530a(GetPurchasesJson getPurchasesJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5616f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getPurchasesJson.f5617a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, getPurchasesJson.f5617a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getPurchasesJson.f5618b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getPurchasesJson.f5618b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getPurchasesJson.f5619c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getPurchasesJson.f5619c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getPurchasesJson.f5620d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], getPurchasesJson.f5620d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && getPurchasesJson.f5621e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], getPurchasesJson.f5621e);
    }
}
