package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class ProductInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5675a;

    /* renamed from: b */
    public final String f5676b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/ProductInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/ProductInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ProductInfoJson> serializer() {
            return ProductInfoJson$$a.f5677a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductInfoJson(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5675a = null;
        } else {
            this.f5675a = str;
        }
        if ((i & 2) == 0) {
            this.f5676b = null;
        } else {
            this.f5676b = str2;
        }
    }

    /* renamed from: a */
    public final String m4562a() {
        return this.f5675a;
    }

    /* renamed from: b */
    public final String m4563b() {
        return this.f5676b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfoJson)) {
            return false;
        }
        ProductInfoJson productInfoJson = (ProductInfoJson) obj;
        return Intrinsics.areEqual(this.f5675a, productInfoJson.f5675a) && Intrinsics.areEqual(this.f5676b, productInfoJson.f5676b);
    }

    public int hashCode() {
        String str = this.f5675a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5676b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductInfoJson(image=");
        sb.append(this.f5675a);
        sb.append(", imagePromo=");
        return C8032c.m1430a(sb, this.f5676b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4561a(ProductInfoJson productInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || productInfoJson.f5675a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, productInfoJson.f5675a);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && productInfoJson.f5676b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, productInfoJson.f5676b);
    }
}
