package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceBankInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceBankInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5277a;

    /* renamed from: b */
    public final String f5278b;

    /* renamed from: c */
    public final String f5279c;

    /* renamed from: d */
    public final String f5280d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceBankInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceBankInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceBankInfoJson> serializer() {
            return InvoiceBankInfoJson$$a.f5281a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceBankInfoJson(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5277a = null;
        } else {
            this.f5277a = str;
        }
        if ((i & 2) == 0) {
            this.f5278b = null;
        } else {
            this.f5278b = str2;
        }
        if ((i & 4) == 0) {
            this.f5279c = null;
        } else {
            this.f5279c = str3;
        }
        if ((i & 8) == 0) {
            this.f5280d = null;
        } else {
            this.f5280d = str4;
        }
    }

    /* renamed from: a */
    public InvoiceBankInfo m4338a() {
        String str = this.f5277a;
        if (str == null) {
            str = "";
        }
        return new InvoiceBankInfo(str, this.f5278b, this.f5279c, this.f5280d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceBankInfoJson)) {
            return false;
        }
        InvoiceBankInfoJson invoiceBankInfoJson = (InvoiceBankInfoJson) obj;
        return Intrinsics.areEqual(this.f5277a, invoiceBankInfoJson.f5277a) && Intrinsics.areEqual(this.f5278b, invoiceBankInfoJson.f5278b) && Intrinsics.areEqual(this.f5279c, invoiceBankInfoJson.f5279c) && Intrinsics.areEqual(this.f5280d, invoiceBankInfoJson.f5280d);
    }

    public int hashCode() {
        String str = this.f5277a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5278b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5279c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5280d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceBankInfoJson(name=");
        sb.append(this.f5277a);
        sb.append(", countryCode=");
        sb.append(this.f5278b);
        sb.append(", countryName=");
        sb.append(this.f5279c);
        sb.append(", image=");
        return C8032c.m1430a(sb, this.f5280d, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4337a(InvoiceBankInfoJson invoiceBankInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoiceBankInfoJson.f5277a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, invoiceBankInfoJson.f5277a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceBankInfoJson.f5278b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceBankInfoJson.f5278b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceBankInfoJson.f5279c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceBankInfoJson.f5279c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && invoiceBankInfoJson.f5280d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, invoiceBankInfoJson.f5280d);
    }
}
