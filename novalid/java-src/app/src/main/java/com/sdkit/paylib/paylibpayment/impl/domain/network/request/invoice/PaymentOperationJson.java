package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class PaymentOperationJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final PaymentOperationTypeJson f5088a;

    /* renamed from: b */
    public final String f5089b;

    /* renamed from: c */
    public final String f5090c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/PaymentOperationJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/PaymentOperationJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<PaymentOperationJson> serializer() {
            return PaymentOperationJson$$a.f5091a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentOperationJson(int i, PaymentOperationTypeJson paymentOperationTypeJson, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PaymentOperationJson$$a.f5091a.getDescriptor());
        }
        this.f5088a = paymentOperationTypeJson;
        this.f5089b = str;
        this.f5090c = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4206a(PaymentOperationJson paymentOperationJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, PaymentOperationTypeJson$$a.f5100a, paymentOperationJson.f5088a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, paymentOperationJson.f5089b);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, paymentOperationJson.f5090c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOperationJson)) {
            return false;
        }
        PaymentOperationJson paymentOperationJson = (PaymentOperationJson) obj;
        return this.f5088a == paymentOperationJson.f5088a && Intrinsics.areEqual(this.f5089b, paymentOperationJson.f5089b) && Intrinsics.areEqual(this.f5090c, paymentOperationJson.f5090c);
    }

    public int hashCode() {
        return this.f5090c.hashCode() + C8031b.m1429a(this.f5089b, this.f5088a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentOperationJson(operation=");
        sb.append(this.f5088a);
        sb.append(", code=");
        sb.append(this.f5089b);
        sb.append(", value=");
        return C8032c.m1430a(sb, this.f5090c, ')');
    }

    public PaymentOperationJson(PaymentOperationTypeJson operation, String code, String value) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5088a = operation;
        this.f5089b = code;
        this.f5090c = value;
    }
}
