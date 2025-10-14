package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePurchaser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoicePurchaserJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5472a;

    /* renamed from: b */
    public final String f5473b;

    /* renamed from: c */
    public final String f5474c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePurchaserJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePurchaserJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoicePurchaserJson> serializer() {
            return InvoicePurchaserJson$$a.f5475a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoicePurchaserJson(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5472a = null;
        } else {
            this.f5472a = str;
        }
        if ((i & 2) == 0) {
            this.f5473b = null;
        } else {
            this.f5473b = str2;
        }
        if ((i & 4) == 0) {
            this.f5474c = null;
        } else {
            this.f5474c = str3;
        }
    }

    /* renamed from: a */
    public InvoicePurchaser m4436a() {
        return new InvoicePurchaser(this.f5472a, this.f5473b, this.f5474c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoicePurchaserJson)) {
            return false;
        }
        InvoicePurchaserJson invoicePurchaserJson = (InvoicePurchaserJson) obj;
        return Intrinsics.areEqual(this.f5472a, invoicePurchaserJson.f5472a) && Intrinsics.areEqual(this.f5473b, invoicePurchaserJson.f5473b) && Intrinsics.areEqual(this.f5474c, invoicePurchaserJson.f5474c);
    }

    public int hashCode() {
        String str = this.f5472a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5473b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5474c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoicePurchaserJson(email=");
        sb.append(this.f5472a);
        sb.append(", phone=");
        sb.append(this.f5473b);
        sb.append(", contact=");
        return C8032c.m1430a(sb, this.f5474c, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4435a(InvoicePurchaserJson invoicePurchaserJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoicePurchaserJson.f5472a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, invoicePurchaserJson.f5472a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoicePurchaserJson.f5473b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoicePurchaserJson.f5473b);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && invoicePurchaserJson.f5474c == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoicePurchaserJson.f5474c);
    }
}
