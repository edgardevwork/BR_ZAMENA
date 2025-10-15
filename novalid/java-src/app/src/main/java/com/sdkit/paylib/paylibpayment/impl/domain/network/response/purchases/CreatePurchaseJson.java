package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.purchases.CreatePurchaseResponse;
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
public final class CreatePurchaseJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5593f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), null};

    /* renamed from: a */
    public final Integer f5594a;

    /* renamed from: b */
    public final String f5595b;

    /* renamed from: c */
    public final String f5596c;

    /* renamed from: d */
    public final List f5597d;

    /* renamed from: e */
    public final CreatePurchaseInfoJson f5598e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/CreatePurchaseJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/CreatePurchaseJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<CreatePurchaseJson> serializer() {
            return CreatePurchaseJson$$a.f5599a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreatePurchaseJson(int i, Integer num, String str, String str2, List list, CreatePurchaseInfoJson createPurchaseInfoJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5594a = null;
        } else {
            this.f5594a = num;
        }
        if ((i & 2) == 0) {
            this.f5595b = null;
        } else {
            this.f5595b = str;
        }
        if ((i & 4) == 0) {
            this.f5596c = null;
        } else {
            this.f5596c = str2;
        }
        if ((i & 8) == 0) {
            this.f5597d = null;
        } else {
            this.f5597d = list;
        }
        if ((i & 16) == 0) {
            this.f5598e = null;
        } else {
            this.f5598e = createPurchaseInfoJson;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public CreatePurchaseResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5594a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5595b;
        String str2 = this.f5596c;
        List list = this.f5597d;
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
        CreatePurchaseInfoJson createPurchaseInfoJson = this.f5598e;
        return new CreatePurchaseResponse(meta, iIntValue, str, str2, null, arrayList, createPurchaseInfoJson != null ? createPurchaseInfoJson.m4512a() : null, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePurchaseJson)) {
            return false;
        }
        CreatePurchaseJson createPurchaseJson = (CreatePurchaseJson) obj;
        return Intrinsics.areEqual(this.f5594a, createPurchaseJson.f5594a) && Intrinsics.areEqual(this.f5595b, createPurchaseJson.f5595b) && Intrinsics.areEqual(this.f5596c, createPurchaseJson.f5596c) && Intrinsics.areEqual(this.f5597d, createPurchaseJson.f5597d) && Intrinsics.areEqual(this.f5598e, createPurchaseJson.f5598e);
    }

    public int hashCode() {
        Integer num = this.f5594a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5595b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5596c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5597d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CreatePurchaseInfoJson createPurchaseInfoJson = this.f5598e;
        return iHashCode4 + (createPurchaseInfoJson != null ? createPurchaseInfoJson.hashCode() : 0);
    }

    public String toString() {
        return "CreatePurchaseJson(code=" + this.f5594a + ", errorMessage=" + this.f5595b + ", errorDescription=" + this.f5596c + ", errors=" + this.f5597d + ", createdPurchaseInfo=" + this.f5598e + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4515a(CreatePurchaseJson createPurchaseJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5593f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || createPurchaseJson.f5594a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, createPurchaseJson.f5594a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || createPurchaseJson.f5595b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, createPurchaseJson.f5595b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || createPurchaseJson.f5596c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, createPurchaseJson.f5596c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || createPurchaseJson.f5597d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], createPurchaseJson.f5597d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && createPurchaseJson.f5598e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CreatePurchaseInfoJson$$a.f5591a, createPurchaseJson.f5598e);
    }
}
