package com.sdkit.paylib.paylibpayment.impl.domain.network.request.purchases;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class CreatePurchaseRequestJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5129a;

    /* renamed from: b */
    public final String f5130b;

    /* renamed from: c */
    public final Integer f5131c;

    /* renamed from: d */
    public final String f5132d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/purchases/CreatePurchaseRequestJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/purchases/CreatePurchaseRequestJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<CreatePurchaseRequestJson> serializer() {
            return CreatePurchaseRequestJson$$a.f5133a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreatePurchaseRequestJson(int i, String str, String str2, Integer num, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CreatePurchaseRequestJson$$a.f5133a.getDescriptor());
        }
        this.f5129a = str;
        this.f5130b = str2;
        this.f5131c = num;
        this.f5132d = str3;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4234a(CreatePurchaseRequestJson createPurchaseRequestJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createPurchaseRequestJson.f5129a);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, createPurchaseRequestJson.f5130b);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, createPurchaseRequestJson.f5131c);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, createPurchaseRequestJson.f5132d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePurchaseRequestJson)) {
            return false;
        }
        CreatePurchaseRequestJson createPurchaseRequestJson = (CreatePurchaseRequestJson) obj;
        return Intrinsics.areEqual(this.f5129a, createPurchaseRequestJson.f5129a) && Intrinsics.areEqual(this.f5130b, createPurchaseRequestJson.f5130b) && Intrinsics.areEqual(this.f5131c, createPurchaseRequestJson.f5131c) && Intrinsics.areEqual(this.f5132d, createPurchaseRequestJson.f5132d);
    }

    public int hashCode() {
        int iHashCode = this.f5129a.hashCode() * 31;
        String str = this.f5130b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f5131c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f5132d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreatePurchaseRequestJson(productId=");
        sb.append(this.f5129a);
        sb.append(", orderId=");
        sb.append(this.f5130b);
        sb.append(", quantity=");
        sb.append(this.f5131c);
        sb.append(", developerPayload=");
        return C8032c.m1430a(sb, this.f5132d, ')');
    }

    public CreatePurchaseRequestJson(String productId, String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f5129a = productId;
        this.f5130b = str;
        this.f5131c = num;
        this.f5132d = str2;
    }
}
