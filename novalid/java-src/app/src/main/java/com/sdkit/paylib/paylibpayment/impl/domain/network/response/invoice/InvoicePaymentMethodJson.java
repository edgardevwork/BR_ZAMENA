package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.AvailablePaymentMethod;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.AvailablePaymentMethodType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoicePaymentMethodJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final AvailablePaymentMethodType f5445a;

    /* renamed from: b */
    public final String f5446b;

    /* renamed from: c */
    public final String f5447c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentMethodJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentMethodJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoicePaymentMethodJson> serializer() {
            return InvoicePaymentMethodJson$$a.f5448a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoicePaymentMethodJson(int i, AvailablePaymentMethodType availablePaymentMethodType, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5445a = null;
        } else {
            this.f5445a = availablePaymentMethodType;
        }
        if ((i & 2) == 0) {
            this.f5446b = null;
        } else {
            this.f5446b = str;
        }
        if ((i & 4) == 0) {
            this.f5447c = null;
        } else {
            this.f5447c = str2;
        }
    }

    /* renamed from: a */
    public AvailablePaymentMethod m4397a() {
        return new AvailablePaymentMethod(this.f5445a, this.f5446b, this.f5447c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoicePaymentMethodJson)) {
            return false;
        }
        InvoicePaymentMethodJson invoicePaymentMethodJson = (InvoicePaymentMethodJson) obj;
        return this.f5445a == invoicePaymentMethodJson.f5445a && Intrinsics.areEqual(this.f5446b, invoicePaymentMethodJson.f5446b) && Intrinsics.areEqual(this.f5447c, invoicePaymentMethodJson.f5447c);
    }

    public int hashCode() {
        AvailablePaymentMethodType availablePaymentMethodType = this.f5445a;
        int iHashCode = (availablePaymentMethodType == null ? 0 : availablePaymentMethodType.hashCode()) * 31;
        String str = this.f5446b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5447c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoicePaymentMethodJson(type=");
        sb.append(this.f5445a);
        sb.append(", action=");
        sb.append(this.f5446b);
        sb.append(", disclaimer=");
        return C8032c.m1430a(sb, this.f5447c, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4396a(InvoicePaymentMethodJson invoicePaymentMethodJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoicePaymentMethodJson.f5445a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, C8573a.f5522a, invoicePaymentMethodJson.f5445a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoicePaymentMethodJson.f5446b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoicePaymentMethodJson.f5446b);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && invoicePaymentMethodJson.f5447c == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoicePaymentMethodJson.f5447c);
    }
}
