package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceDeviceInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5326a;

    /* renamed from: b */
    public final String f5327b;

    /* renamed from: c */
    public final String f5328c;

    /* renamed from: d */
    public final String f5329d;

    /* renamed from: e */
    public final String f5330e;

    /* renamed from: f */
    public final String f5331f;

    /* renamed from: g */
    public final String f5332g;

    /* renamed from: h */
    public final String f5333h;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceDeviceInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceDeviceInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceDeviceInfoJson> serializer() {
            return InvoiceDeviceInfoJson$$a.f5334a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceDeviceInfoJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5326a = null;
        } else {
            this.f5326a = str;
        }
        if ((i & 2) == 0) {
            this.f5327b = null;
        } else {
            this.f5327b = str2;
        }
        if ((i & 4) == 0) {
            this.f5328c = null;
        } else {
            this.f5328c = str3;
        }
        if ((i & 8) == 0) {
            this.f5329d = null;
        } else {
            this.f5329d = str4;
        }
        if ((i & 16) == 0) {
            this.f5330e = null;
        } else {
            this.f5330e = str5;
        }
        if ((i & 32) == 0) {
            this.f5331f = null;
        } else {
            this.f5331f = str6;
        }
        if ((i & 64) == 0) {
            this.f5332g = null;
        } else {
            this.f5332g = str7;
        }
        if ((i & 128) == 0) {
            this.f5333h = null;
        } else {
            this.f5333h = str8;
        }
    }

    /* renamed from: a */
    public InvoiceDeviceInfo m4358a() {
        return new InvoiceDeviceInfo(this.f5326a, this.f5327b, this.f5328c, this.f5329d, this.f5330e, this.f5331f, this.f5332g, this.f5333h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceDeviceInfoJson)) {
            return false;
        }
        InvoiceDeviceInfoJson invoiceDeviceInfoJson = (InvoiceDeviceInfoJson) obj;
        return Intrinsics.areEqual(this.f5326a, invoiceDeviceInfoJson.f5326a) && Intrinsics.areEqual(this.f5327b, invoiceDeviceInfoJson.f5327b) && Intrinsics.areEqual(this.f5328c, invoiceDeviceInfoJson.f5328c) && Intrinsics.areEqual(this.f5329d, invoiceDeviceInfoJson.f5329d) && Intrinsics.areEqual(this.f5330e, invoiceDeviceInfoJson.f5330e) && Intrinsics.areEqual(this.f5331f, invoiceDeviceInfoJson.f5331f) && Intrinsics.areEqual(this.f5332g, invoiceDeviceInfoJson.f5332g) && Intrinsics.areEqual(this.f5333h, invoiceDeviceInfoJson.f5333h);
    }

    public int hashCode() {
        String str = this.f5326a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5327b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5328c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5329d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5330e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5331f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5332g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5333h;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceDeviceInfoJson(userChannel=");
        sb.append(this.f5326a);
        sb.append(", platformType=");
        sb.append(this.f5327b);
        sb.append(", platformVersion=");
        sb.append(this.f5328c);
        sb.append(", model=");
        sb.append(this.f5329d);
        sb.append(", manufacturer=");
        sb.append(this.f5330e);
        sb.append(", id=");
        sb.append(this.f5331f);
        sb.append(", surface=");
        sb.append(this.f5332g);
        sb.append(", surfaceVersion=");
        return C8032c.m1430a(sb, this.f5333h, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4357a(InvoiceDeviceInfoJson invoiceDeviceInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoiceDeviceInfoJson.f5326a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5326a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceDeviceInfoJson.f5327b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5327b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceDeviceInfoJson.f5328c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5328c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceDeviceInfoJson.f5329d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5329d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceDeviceInfoJson.f5330e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5330e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invoiceDeviceInfoJson.f5331f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5331f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invoiceDeviceInfoJson.f5332g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5332g);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && invoiceDeviceInfoJson.f5333h == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, invoiceDeviceInfoJson.f5333h);
    }
}
