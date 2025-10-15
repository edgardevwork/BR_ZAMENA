package com.sdkit.paylib.paylibpayment.impl.domain.network.response.products;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.products.ProductsResponse;
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
public final class GetProductsJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final KSerializer[] f5534f = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a), new ArrayListSerializer(ProductJson$$a.f5554a)};

    /* renamed from: a */
    public final Integer f5535a;

    /* renamed from: b */
    public final String f5536b;

    /* renamed from: c */
    public final String f5537c;

    /* renamed from: d */
    public final List f5538d;

    /* renamed from: e */
    public final List f5539e;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/products/GetProductsJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/products/GetProductsJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<GetProductsJson> serializer() {
            return GetProductsJson$$a.f5540a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetProductsJson(int i, Integer num, String str, String str2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5535a = null;
        } else {
            this.f5535a = num;
        }
        if ((i & 2) == 0) {
            this.f5536b = null;
        } else {
            this.f5536b = str;
        }
        if ((i & 4) == 0) {
            this.f5537c = null;
        } else {
            this.f5537c = str2;
        }
        if ((i & 8) == 0) {
            this.f5538d = null;
        } else {
            this.f5538d = list;
        }
        if ((i & 16) == 0) {
            this.f5539e = null;
        } else {
            this.f5539e = list2;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public ProductsResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5535a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5536b;
        String str2 = this.f5537c;
        List list = this.f5538d;
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
        List list2 = this.f5539e;
        if (list2 != null) {
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ProductJson) it2.next()).m4485a());
            }
        }
        return new ProductsResponse(meta, iIntValue, str, str2, arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetProductsJson)) {
            return false;
        }
        GetProductsJson getProductsJson = (GetProductsJson) obj;
        return Intrinsics.areEqual(this.f5535a, getProductsJson.f5535a) && Intrinsics.areEqual(this.f5536b, getProductsJson.f5536b) && Intrinsics.areEqual(this.f5537c, getProductsJson.f5537c) && Intrinsics.areEqual(this.f5538d, getProductsJson.f5538d) && Intrinsics.areEqual(this.f5539e, getProductsJson.f5539e);
    }

    public int hashCode() {
        Integer num = this.f5535a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5536b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5537c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5538d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f5539e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetProductsJson(code=");
        sb.append(this.f5535a);
        sb.append(", errorMessage=");
        sb.append(this.f5536b);
        sb.append(", errorDescription=");
        sb.append(this.f5537c);
        sb.append(", errors=");
        sb.append(this.f5538d);
        sb.append(", products=");
        return C8045g.m1489a(sb, this.f5539e, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4479a(GetProductsJson getProductsJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5534f;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getProductsJson.f5535a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, getProductsJson.f5535a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getProductsJson.f5536b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getProductsJson.f5536b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getProductsJson.f5537c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getProductsJson.f5537c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getProductsJson.f5538d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], getProductsJson.f5538d);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && getProductsJson.f5539e == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], getProductsJson.f5539e);
    }
}
