package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceDeliveryInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceDeliveryInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final InvoiceDeliveryAddressJson f5321a;

    /* renamed from: b */
    public final String f5322b;

    /* renamed from: c */
    public final String f5323c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceDeliveryInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceDeliveryInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceDeliveryInfoJson> serializer() {
            return InvoiceDeliveryInfoJson$$a.f5324a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceDeliveryInfoJson(int i, InvoiceDeliveryAddressJson invoiceDeliveryAddressJson, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5321a = null;
        } else {
            this.f5321a = invoiceDeliveryAddressJson;
        }
        if ((i & 2) == 0) {
            this.f5322b = null;
        } else {
            this.f5322b = str;
        }
        if ((i & 4) == 0) {
            this.f5323c = null;
        } else {
            this.f5323c = str2;
        }
    }

    /* renamed from: a */
    public InvoiceDeliveryInfo m4354a() {
        InvoiceDeliveryAddressJson invoiceDeliveryAddressJson = this.f5321a;
        return new InvoiceDeliveryInfo(invoiceDeliveryAddressJson != null ? invoiceDeliveryAddressJson.m4350a() : null, this.f5322b, this.f5323c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceDeliveryInfoJson)) {
            return false;
        }
        InvoiceDeliveryInfoJson invoiceDeliveryInfoJson = (InvoiceDeliveryInfoJson) obj;
        return Intrinsics.areEqual(this.f5321a, invoiceDeliveryInfoJson.f5321a) && Intrinsics.areEqual(this.f5322b, invoiceDeliveryInfoJson.f5322b) && Intrinsics.areEqual(this.f5323c, invoiceDeliveryInfoJson.f5323c);
    }

    public int hashCode() {
        InvoiceDeliveryAddressJson invoiceDeliveryAddressJson = this.f5321a;
        int iHashCode = (invoiceDeliveryAddressJson == null ? 0 : invoiceDeliveryAddressJson.hashCode()) * 31;
        String str = this.f5322b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5323c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceDeliveryInfoJson(address=");
        sb.append(this.f5321a);
        sb.append(", type=");
        sb.append(this.f5322b);
        sb.append(", description=");
        return C8032c.m1430a(sb, this.f5323c, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4353a(InvoiceDeliveryInfoJson invoiceDeliveryInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoiceDeliveryInfoJson.f5321a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvoiceDeliveryAddressJson$$a.f5319a, invoiceDeliveryInfoJson.f5321a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceDeliveryInfoJson.f5322b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceDeliveryInfoJson.f5322b);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && invoiceDeliveryInfoJson.f5323c == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceDeliveryInfoJson.f5323c);
    }
}
