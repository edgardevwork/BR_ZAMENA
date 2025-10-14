package com.sdkit.paylib.paylibpayment.impl.domain.network.response.products;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductSubscription;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod;
import com.sdkit.paylib.paylibpayment.impl.domain.network.utils.C8586c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class ProductSubscriptionJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5564a;

    /* renamed from: b */
    public final String f5565b;

    /* renamed from: c */
    public final String f5566c;

    /* renamed from: d */
    public final String f5567d;

    /* renamed from: e */
    public final String f5568e;

    /* renamed from: f */
    public final String f5569f;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/products/ProductSubscriptionJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/products/ProductSubscriptionJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ProductSubscriptionJson> serializer() {
            return ProductSubscriptionJson$$a.f5570a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductSubscriptionJson(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5564a = null;
        } else {
            this.f5564a = str;
        }
        if ((i & 2) == 0) {
            this.f5565b = null;
        } else {
            this.f5565b = str2;
        }
        if ((i & 4) == 0) {
            this.f5566c = null;
        } else {
            this.f5566c = str3;
        }
        if ((i & 8) == 0) {
            this.f5567d = null;
        } else {
            this.f5567d = str4;
        }
        if ((i & 16) == 0) {
            this.f5568e = null;
        } else {
            this.f5568e = str5;
        }
        if ((i & 32) == 0) {
            this.f5569f = null;
        } else {
            this.f5569f = str6;
        }
    }

    /* renamed from: a */
    public ProductSubscription m4496a() {
        String str = this.f5564a;
        SubscriptionPeriod subscriptionPeriodM4653b = str != null ? C8586c.f5787a.m4653b(str) : null;
        String str2 = this.f5565b;
        SubscriptionPeriod subscriptionPeriodM4653b2 = str2 != null ? C8586c.f5787a.m4653b(str2) : null;
        String str3 = this.f5566c;
        SubscriptionPeriod subscriptionPeriodM4653b3 = str3 != null ? C8586c.f5787a.m4653b(str3) : null;
        String str4 = this.f5567d;
        String str5 = this.f5568e;
        String str6 = this.f5569f;
        return new ProductSubscription(subscriptionPeriodM4653b, subscriptionPeriodM4653b2, subscriptionPeriodM4653b3, str4, str5, str6 != null ? C8586c.f5787a.m4653b(str6) : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSubscriptionJson)) {
            return false;
        }
        ProductSubscriptionJson productSubscriptionJson = (ProductSubscriptionJson) obj;
        return Intrinsics.areEqual(this.f5564a, productSubscriptionJson.f5564a) && Intrinsics.areEqual(this.f5565b, productSubscriptionJson.f5565b) && Intrinsics.areEqual(this.f5566c, productSubscriptionJson.f5566c) && Intrinsics.areEqual(this.f5567d, productSubscriptionJson.f5567d) && Intrinsics.areEqual(this.f5568e, productSubscriptionJson.f5568e) && Intrinsics.areEqual(this.f5569f, productSubscriptionJson.f5569f);
    }

    public int hashCode() {
        String str = this.f5564a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5565b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5566c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5567d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5568e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5569f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProductSubscriptionJson(subscriptionPeriod=");
        sb.append(this.f5564a);
        sb.append(", freeTrialPeriod=");
        sb.append(this.f5565b);
        sb.append(", gracePeriod=");
        sb.append(this.f5566c);
        sb.append(", introductoryPrice=");
        sb.append(this.f5567d);
        sb.append(", introductoryPriceAmount=");
        sb.append(this.f5568e);
        sb.append(", introductoryPricePeriod=");
        return C8032c.m1430a(sb, this.f5569f, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4495a(ProductSubscriptionJson productSubscriptionJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || productSubscriptionJson.f5564a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, productSubscriptionJson.f5564a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || productSubscriptionJson.f5565b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, productSubscriptionJson.f5565b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || productSubscriptionJson.f5566c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, productSubscriptionJson.f5566c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || productSubscriptionJson.f5567d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, productSubscriptionJson.f5567d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || productSubscriptionJson.f5568e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, productSubscriptionJson.f5568e);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && productSubscriptionJson.f5569f == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, productSubscriptionJson.f5569f);
    }
}
