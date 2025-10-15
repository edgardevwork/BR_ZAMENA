package com.sdkit.paylib.paylibpayment.impl.domain.network.response.products;

import android.net.Uri;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.Product;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductStatus;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class ProductJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5542a;

    /* renamed from: b */
    public final ProductTypeJson f5543b;

    /* renamed from: c */
    public final ProductStatusJson f5544c;

    /* renamed from: d */
    public final String f5545d;

    /* renamed from: e */
    public final Integer f5546e;

    /* renamed from: f */
    public final String f5547f;

    /* renamed from: g */
    public final String f5548g;

    /* renamed from: h */
    public final String f5549h;

    /* renamed from: i */
    public final String f5550i;

    /* renamed from: j */
    public final String f5551j;

    /* renamed from: k */
    public final String f5552k;

    /* renamed from: l */
    public final ProductSubscriptionJson f5553l;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/products/ProductJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/products/ProductJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ProductJson> serializer() {
            return ProductJson$$a.f5554a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductJson(int i, String str, ProductTypeJson productTypeJson, ProductStatusJson productStatusJson, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, ProductSubscriptionJson productSubscriptionJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5542a = null;
        } else {
            this.f5542a = str;
        }
        if ((i & 2) == 0) {
            this.f5543b = null;
        } else {
            this.f5543b = productTypeJson;
        }
        if ((i & 4) == 0) {
            this.f5544c = null;
        } else {
            this.f5544c = productStatusJson;
        }
        if ((i & 8) == 0) {
            this.f5545d = null;
        } else {
            this.f5545d = str2;
        }
        if ((i & 16) == 0) {
            this.f5546e = null;
        } else {
            this.f5546e = num;
        }
        if ((i & 32) == 0) {
            this.f5547f = null;
        } else {
            this.f5547f = str3;
        }
        if ((i & 64) == 0) {
            this.f5548g = null;
        } else {
            this.f5548g = str4;
        }
        if ((i & 128) == 0) {
            this.f5549h = null;
        } else {
            this.f5549h = str5;
        }
        if ((i & 256) == 0) {
            this.f5550i = null;
        } else {
            this.f5550i = str6;
        }
        if ((i & 512) == 0) {
            this.f5551j = null;
        } else {
            this.f5551j = str7;
        }
        if ((i & 1024) == 0) {
            this.f5552k = null;
        } else {
            this.f5552k = str8;
        }
        if ((i & 2048) == 0) {
            this.f5553l = null;
        } else {
            this.f5553l = productSubscriptionJson;
        }
    }

    /* renamed from: a */
    public Product m4485a() {
        ProductStatus productStatusM4490c;
        String str = this.f5542a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ProductTypeJson productTypeJson = this.f5543b;
        ProductType productTypeM4501c = productTypeJson != null ? productTypeJson.m4501c() : null;
        ProductStatusJson productStatusJson = this.f5544c;
        if (productStatusJson == null || (productStatusM4490c = productStatusJson.m4490c()) == null) {
            productStatusM4490c = ProductStatus.INACTIVE;
        }
        ProductStatus productStatus = productStatusM4490c;
        String str3 = this.f5545d;
        Integer num = this.f5546e;
        String str4 = this.f5547f;
        String str5 = this.f5548g;
        String str6 = this.f5549h;
        String str7 = this.f5550i;
        String str8 = this.f5551j;
        Uri uri = str8 != null ? Uri.parse(str8) : null;
        String str9 = this.f5552k;
        Uri uri2 = str9 != null ? Uri.parse(str9) : null;
        ProductSubscriptionJson productSubscriptionJson = this.f5553l;
        return new Product(str2, productTypeM4501c, productStatus, str3, num, str4, str5, str6, str7, uri, uri2, productSubscriptionJson != null ? productSubscriptionJson.m4496a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductJson)) {
            return false;
        }
        ProductJson productJson = (ProductJson) obj;
        return Intrinsics.areEqual(this.f5542a, productJson.f5542a) && this.f5543b == productJson.f5543b && this.f5544c == productJson.f5544c && Intrinsics.areEqual(this.f5545d, productJson.f5545d) && Intrinsics.areEqual(this.f5546e, productJson.f5546e) && Intrinsics.areEqual(this.f5547f, productJson.f5547f) && Intrinsics.areEqual(this.f5548g, productJson.f5548g) && Intrinsics.areEqual(this.f5549h, productJson.f5549h) && Intrinsics.areEqual(this.f5550i, productJson.f5550i) && Intrinsics.areEqual(this.f5551j, productJson.f5551j) && Intrinsics.areEqual(this.f5552k, productJson.f5552k) && Intrinsics.areEqual(this.f5553l, productJson.f5553l);
    }

    public int hashCode() {
        String str = this.f5542a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ProductTypeJson productTypeJson = this.f5543b;
        int iHashCode2 = (iHashCode + (productTypeJson == null ? 0 : productTypeJson.hashCode())) * 31;
        ProductStatusJson productStatusJson = this.f5544c;
        int iHashCode3 = (iHashCode2 + (productStatusJson == null ? 0 : productStatusJson.hashCode())) * 31;
        String str2 = this.f5545d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f5546e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f5547f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5548g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5549h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5550i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5551j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5552k;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ProductSubscriptionJson productSubscriptionJson = this.f5553l;
        return iHashCode11 + (productSubscriptionJson != null ? productSubscriptionJson.hashCode() : 0);
    }

    public String toString() {
        return "ProductJson(productId=" + this.f5542a + ", productType=" + this.f5543b + ", productStatus=" + this.f5544c + ", priceLabel=" + this.f5545d + ", price=" + this.f5546e + ", currency=" + this.f5547f + ", language=" + this.f5548g + ", title=" + this.f5549h + ", description=" + this.f5550i + ", imageUrl=" + this.f5551j + ", promoImageUrl=" + this.f5552k + ", subscription=" + this.f5553l + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4484a(ProductJson productJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || productJson.f5542a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, productJson.f5542a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || productJson.f5543b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ProductTypeJson$$a.f5578a, productJson.f5543b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || productJson.f5544c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ProductStatusJson$$a.f5560a, productJson.f5544c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || productJson.f5545d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, productJson.f5545d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || productJson.f5546e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, productJson.f5546e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || productJson.f5547f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, productJson.f5547f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || productJson.f5548g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, productJson.f5548g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || productJson.f5549h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, productJson.f5549h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || productJson.f5550i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, productJson.f5550i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || productJson.f5551j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, productJson.f5551j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || productJson.f5552k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, productJson.f5552k);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && productJson.f5553l == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, ProductSubscriptionJson$$a.f5570a, productJson.f5553l);
    }
}
