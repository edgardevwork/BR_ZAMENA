package com.sdkit.paylib.paylibpayment.impl.domain.network.response.applications;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.ApplicationPurchaseInfoResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseJson$$a;
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
public final class ApplicationPurchaseInfoJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5153f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), null};

    /* renamed from: a */
    public final Integer f5154a;

    /* renamed from: b */
    public final String f5155b;

    /* renamed from: c */
    public final String f5156c;

    /* renamed from: d */
    public final List f5157d;

    /* renamed from: e */
    public final PurchaseJson f5158e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/ApplicationPurchaseInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/ApplicationPurchaseInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ApplicationPurchaseInfoJson> serializer() {
            return ApplicationPurchaseInfoJson$$a.f5159a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ApplicationPurchaseInfoJson(int i, Integer num, String str, String str2, List list, PurchaseJson purchaseJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5154a = null;
        } else {
            this.f5154a = num;
        }
        if ((i & 2) == 0) {
            this.f5155b = null;
        } else {
            this.f5155b = str;
        }
        if ((i & 4) == 0) {
            this.f5156c = null;
        } else {
            this.f5156c = str2;
        }
        if ((i & 8) == 0) {
            this.f5157d = null;
        } else {
            this.f5157d = list;
        }
        if ((i & 16) == 0) {
            this.f5158e = null;
        } else {
            this.f5158e = purchaseJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public ApplicationPurchaseInfoResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5154a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5155b;
        String str2 = this.f5156c;
        List list = this.f5157d;
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
        PurchaseJson purchaseJson = this.f5158e;
        return new ApplicationPurchaseInfoResponse(meta, iIntValue, str, str2, arrayList, purchaseJson != null ? purchaseJson.m4536a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationPurchaseInfoJson)) {
            return false;
        }
        ApplicationPurchaseInfoJson applicationPurchaseInfoJson = (ApplicationPurchaseInfoJson) obj;
        return Intrinsics.areEqual(this.f5154a, applicationPurchaseInfoJson.f5154a) && Intrinsics.areEqual(this.f5155b, applicationPurchaseInfoJson.f5155b) && Intrinsics.areEqual(this.f5156c, applicationPurchaseInfoJson.f5156c) && Intrinsics.areEqual(this.f5157d, applicationPurchaseInfoJson.f5157d) && Intrinsics.areEqual(this.f5158e, applicationPurchaseInfoJson.f5158e);
    }

    public int hashCode() {
        Integer num = this.f5154a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5155b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5156c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5157d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PurchaseJson purchaseJson = this.f5158e;
        return iHashCode4 + (purchaseJson != null ? purchaseJson.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationPurchaseInfoJson(code=" + this.f5154a + ", errorMessage=" + this.f5155b + ", errorDescription=" + this.f5156c + ", errors=" + this.f5157d + ", purchase=" + this.f5158e + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4254a(ApplicationPurchaseInfoJson applicationPurchaseInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5153f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || applicationPurchaseInfoJson.f5154a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, applicationPurchaseInfoJson.f5154a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || applicationPurchaseInfoJson.f5155b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, applicationPurchaseInfoJson.f5155b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || applicationPurchaseInfoJson.f5156c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, applicationPurchaseInfoJson.f5156c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || applicationPurchaseInfoJson.f5157d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], applicationPurchaseInfoJson.f5157d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && applicationPurchaseInfoJson.f5158e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, PurchaseJson$$a.f5637a, applicationPurchaseInfoJson.f5158e);
    }
}
