package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.ChangePaymentMethodPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class ChangePaymentMethodPayloadJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5663a;

    /* renamed from: b */
    public final String f5664b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/ChangePaymentMethodPayloadJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/ChangePaymentMethodPayloadJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ChangePaymentMethodPayloadJson> serializer() {
            return ChangePaymentMethodPayloadJson$$a.f5665a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChangePaymentMethodPayloadJson(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5663a = null;
        } else {
            this.f5663a = str;
        }
        if ((i & 2) == 0) {
            this.f5664b = null;
        } else {
            this.f5664b = str2;
        }
    }

    /* renamed from: a */
    public ChangePaymentMethodPayload m4553a() {
        String str = this.f5663a;
        if (str == null) {
            throw new IllegalStateException("purchaseId не должен быть null");
        }
        String str2 = this.f5664b;
        if (str2 != null) {
            return new ChangePaymentMethodPayload(str, str2);
        }
        throw new IllegalStateException("invoiceId не должен быть null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePaymentMethodPayloadJson)) {
            return false;
        }
        ChangePaymentMethodPayloadJson changePaymentMethodPayloadJson = (ChangePaymentMethodPayloadJson) obj;
        return Intrinsics.areEqual(this.f5663a, changePaymentMethodPayloadJson.f5663a) && Intrinsics.areEqual(this.f5664b, changePaymentMethodPayloadJson.f5664b);
    }

    public int hashCode() {
        String str = this.f5663a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5664b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangePaymentMethodPayloadJson(purchaseId=");
        sb.append(this.f5663a);
        sb.append(", invoiceId=");
        return C8032c.m1430a(sb, this.f5664b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4552a(ChangePaymentMethodPayloadJson changePaymentMethodPayloadJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || changePaymentMethodPayloadJson.f5663a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, changePaymentMethodPayloadJson.f5663a);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && changePaymentMethodPayloadJson.f5664b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, changePaymentMethodPayloadJson.f5664b);
    }
}
