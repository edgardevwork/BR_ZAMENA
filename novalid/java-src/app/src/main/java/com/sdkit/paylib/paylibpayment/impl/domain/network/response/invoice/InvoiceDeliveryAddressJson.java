package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceDeliveryAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceDeliveryAddressJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5316a;

    /* renamed from: b */
    public final String f5317b;

    /* renamed from: c */
    public final String f5318c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceDeliveryAddressJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceDeliveryAddressJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceDeliveryAddressJson> serializer() {
            return InvoiceDeliveryAddressJson$$a.f5319a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceDeliveryAddressJson(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5316a = null;
        } else {
            this.f5316a = str;
        }
        if ((i & 2) == 0) {
            this.f5317b = null;
        } else {
            this.f5317b = str2;
        }
        if ((i & 4) == 0) {
            this.f5318c = null;
        } else {
            this.f5318c = str3;
        }
    }

    /* renamed from: a */
    public InvoiceDeliveryAddress m4350a() {
        return new InvoiceDeliveryAddress(this.f5316a, this.f5317b, this.f5318c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceDeliveryAddressJson)) {
            return false;
        }
        InvoiceDeliveryAddressJson invoiceDeliveryAddressJson = (InvoiceDeliveryAddressJson) obj;
        return Intrinsics.areEqual(this.f5316a, invoiceDeliveryAddressJson.f5316a) && Intrinsics.areEqual(this.f5317b, invoiceDeliveryAddressJson.f5317b) && Intrinsics.areEqual(this.f5318c, invoiceDeliveryAddressJson.f5318c);
    }

    public int hashCode() {
        String str = this.f5316a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5317b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5318c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceDeliveryAddressJson(country=");
        sb.append(this.f5316a);
        sb.append(", city=");
        sb.append(this.f5317b);
        sb.append(", address=");
        return C8032c.m1430a(sb, this.f5318c, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4349a(InvoiceDeliveryAddressJson invoiceDeliveryAddressJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoiceDeliveryAddressJson.f5316a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, invoiceDeliveryAddressJson.f5316a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceDeliveryAddressJson.f5317b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceDeliveryAddressJson.f5317b);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && invoiceDeliveryAddressJson.f5318c == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceDeliveryAddressJson.f5318c);
    }
}
