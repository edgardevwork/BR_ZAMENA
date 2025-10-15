package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.ConfirmPurchaseResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
public final class ConfirmPurchaseJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final KSerializer[] f5582e = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a)};

    /* renamed from: a */
    public final Integer f5583a;

    /* renamed from: b */
    public final String f5584b;

    /* renamed from: c */
    public final String f5585c;

    /* renamed from: d */
    public final List f5586d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/ConfirmPurchaseJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/ConfirmPurchaseJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ConfirmPurchaseJson> serializer() {
            return ConfirmPurchaseJson$$a.f5587a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConfirmPurchaseJson(int i, Integer num, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5583a = null;
        } else {
            this.f5583a = num;
        }
        if ((i & 2) == 0) {
            this.f5584b = null;
        } else {
            this.f5584b = str;
        }
        if ((i & 4) == 0) {
            this.f5585c = null;
        } else {
            this.f5585c = str2;
        }
        if ((i & 8) == 0) {
            this.f5586d = null;
        } else {
            this.f5586d = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public ConfirmPurchaseResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5583a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5584b;
        String str2 = this.f5585c;
        List list = this.f5586d;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DigitalShopErrorJson) it.next()).m4238a());
            }
        } else {
            arrayList = null;
        }
        return new ConfirmPurchaseResponse(meta, iIntValue, str, str2, arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmPurchaseJson)) {
            return false;
        }
        ConfirmPurchaseJson confirmPurchaseJson = (ConfirmPurchaseJson) obj;
        return Intrinsics.areEqual(this.f5583a, confirmPurchaseJson.f5583a) && Intrinsics.areEqual(this.f5584b, confirmPurchaseJson.f5584b) && Intrinsics.areEqual(this.f5585c, confirmPurchaseJson.f5585c) && Intrinsics.areEqual(this.f5586d, confirmPurchaseJson.f5586d);
    }

    public int hashCode() {
        Integer num = this.f5583a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5584b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5585c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5586d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConfirmPurchaseJson(code=");
        sb.append(this.f5583a);
        sb.append(", errorMessage=");
        sb.append(this.f5584b);
        sb.append(", errorDescription=");
        sb.append(this.f5585c);
        sb.append(", errors=");
        return C8045g.m1489a(sb, this.f5586d, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4506a(ConfirmPurchaseJson confirmPurchaseJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5582e;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || confirmPurchaseJson.f5583a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, confirmPurchaseJson.f5583a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || confirmPurchaseJson.f5584b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, confirmPurchaseJson.f5584b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || confirmPurchaseJson.f5585c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, confirmPurchaseJson.f5585c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && confirmPurchaseJson.f5586d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], confirmPurchaseJson.f5586d);
    }
}
