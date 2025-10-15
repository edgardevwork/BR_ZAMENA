package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.Invoice;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5336a;

    /* renamed from: b */
    public final String f5337b;

    /* renamed from: c */
    public final String f5338c;

    /* renamed from: d */
    public final InvoiceStatusJson f5339d;

    /* renamed from: e */
    public final String f5340e;

    /* renamed from: f */
    public final String f5341f;

    /* renamed from: g */
    public final String f5342g;

    /* renamed from: h */
    public final String f5343h;

    /* renamed from: i */
    public final String f5344i;

    /* renamed from: j */
    public final String f5345j;

    /* renamed from: k */
    public final String f5346k;

    /* renamed from: l */
    public final String f5347l;

    /* renamed from: m */
    public final String f5348m;

    /* renamed from: n */
    public final String f5349n;

    /* renamed from: o */
    public final InvoicePaymentInfoJson f5350o;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceJson> serializer() {
            return InvoiceJson$$a.f5351a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceJson(int i, String str, String str2, String str3, InvoiceStatusJson invoiceStatusJson, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, InvoicePaymentInfoJson invoicePaymentInfoJson, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InvoiceJson$$a.f5351a.getDescriptor());
        }
        this.f5336a = str;
        if ((i & 2) == 0) {
            this.f5337b = null;
        } else {
            this.f5337b = str2;
        }
        if ((i & 4) == 0) {
            this.f5338c = null;
        } else {
            this.f5338c = str3;
        }
        if ((i & 8) == 0) {
            this.f5339d = null;
        } else {
            this.f5339d = invoiceStatusJson;
        }
        if ((i & 16) == 0) {
            this.f5340e = null;
        } else {
            this.f5340e = str4;
        }
        if ((i & 32) == 0) {
            this.f5341f = null;
        } else {
            this.f5341f = str5;
        }
        if ((i & 64) == 0) {
            this.f5342g = null;
        } else {
            this.f5342g = str6;
        }
        if ((i & 128) == 0) {
            this.f5343h = null;
        } else {
            this.f5343h = str7;
        }
        if ((i & 256) == 0) {
            this.f5344i = null;
        } else {
            this.f5344i = str8;
        }
        if ((i & 512) == 0) {
            this.f5345j = null;
        } else {
            this.f5345j = str9;
        }
        if ((i & 1024) == 0) {
            this.f5346k = null;
        } else {
            this.f5346k = str10;
        }
        if ((i & 2048) == 0) {
            this.f5347l = null;
        } else {
            this.f5347l = str11;
        }
        if ((i & 4096) == 0) {
            this.f5348m = null;
        } else {
            this.f5348m = str12;
        }
        if ((i & 8192) == 0) {
            this.f5349n = null;
        } else {
            this.f5349n = str13;
        }
        if ((i & 16384) == 0) {
            this.f5350o = null;
        } else {
            this.f5350o = invoicePaymentInfoJson;
        }
    }

    /* renamed from: a */
    public Invoice m4362a() {
        InvoiceStatus invoiceStatusM4445c;
        String str = this.f5336a;
        String str2 = this.f5337b;
        String str3 = this.f5338c;
        InvoiceStatusJson invoiceStatusJson = this.f5339d;
        if (invoiceStatusJson == null || (invoiceStatusM4445c = invoiceStatusJson.m4445c()) == null) {
            invoiceStatusM4445c = InvoiceStatus.CANCELLED;
        }
        InvoiceStatus invoiceStatus = invoiceStatusM4445c;
        String str4 = this.f5340e;
        String str5 = this.f5341f;
        String str6 = this.f5342g;
        String str7 = this.f5343h;
        String str8 = this.f5344i;
        String str9 = this.f5345j;
        String str10 = this.f5346k;
        String str11 = this.f5347l;
        String str12 = this.f5348m;
        String str13 = this.f5349n;
        InvoicePaymentInfoJson invoicePaymentInfoJson = this.f5350o;
        return new Invoice(str, str2, str3, invoiceStatus, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, invoicePaymentInfoJson != null ? invoicePaymentInfoJson.m4386b() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceJson)) {
            return false;
        }
        InvoiceJson invoiceJson = (InvoiceJson) obj;
        return Intrinsics.areEqual(this.f5336a, invoiceJson.f5336a) && Intrinsics.areEqual(this.f5337b, invoiceJson.f5337b) && Intrinsics.areEqual(this.f5338c, invoiceJson.f5338c) && this.f5339d == invoiceJson.f5339d && Intrinsics.areEqual(this.f5340e, invoiceJson.f5340e) && Intrinsics.areEqual(this.f5341f, invoiceJson.f5341f) && Intrinsics.areEqual(this.f5342g, invoiceJson.f5342g) && Intrinsics.areEqual(this.f5343h, invoiceJson.f5343h) && Intrinsics.areEqual(this.f5344i, invoiceJson.f5344i) && Intrinsics.areEqual(this.f5345j, invoiceJson.f5345j) && Intrinsics.areEqual(this.f5346k, invoiceJson.f5346k) && Intrinsics.areEqual(this.f5347l, invoiceJson.f5347l) && Intrinsics.areEqual(this.f5348m, invoiceJson.f5348m) && Intrinsics.areEqual(this.f5349n, invoiceJson.f5349n) && Intrinsics.areEqual(this.f5350o, invoiceJson.f5350o);
    }

    public int hashCode() {
        int iHashCode = this.f5336a.hashCode() * 31;
        String str = this.f5337b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5338c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        InvoiceStatusJson invoiceStatusJson = this.f5339d;
        int iHashCode4 = (iHashCode3 + (invoiceStatusJson == null ? 0 : invoiceStatusJson.hashCode())) * 31;
        String str3 = this.f5340e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5341f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5342g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5343h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5344i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5345j;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f5346k;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f5347l;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f5348m;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f5349n;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        InvoicePaymentInfoJson invoicePaymentInfoJson = this.f5350o;
        return iHashCode14 + (invoicePaymentInfoJson != null ? invoicePaymentInfoJson.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceJson(id=" + this.f5336a + ", image=" + this.f5337b + ", date=" + this.f5338c + ", status=" + this.f5339d + ", orderNumber=" + this.f5340e + ", currency=" + this.f5341f + ", description=" + this.f5342g + ", language=" + this.f5343h + ", organizationName=" + this.f5344i + ", organizationInn=" + this.f5345j + ", trademarks=" + this.f5346k + ", tradeName=" + this.f5347l + ", visualName=" + this.f5348m + ", visualAmount=" + this.f5349n + ", paymentInfo=" + this.f5350o + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4361a(InvoiceJson invoiceJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, invoiceJson.f5336a);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceJson.f5337b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceJson.f5337b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceJson.f5338c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceJson.f5338c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceJson.f5339d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvoiceStatusJson$$a.f5498a, invoiceJson.f5339d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceJson.f5340e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, invoiceJson.f5340e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invoiceJson.f5341f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, invoiceJson.f5341f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invoiceJson.f5342g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invoiceJson.f5342g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invoiceJson.f5343h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, invoiceJson.f5343h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || invoiceJson.f5344i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, invoiceJson.f5344i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || invoiceJson.f5345j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, invoiceJson.f5345j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || invoiceJson.f5346k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, invoiceJson.f5346k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || invoiceJson.f5347l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, invoiceJson.f5347l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || invoiceJson.f5348m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, invoiceJson.f5348m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || invoiceJson.f5349n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, invoiceJson.f5349n);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && invoiceJson.f5350o == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, InvoicePaymentInfoJson$$a.f5431a, invoiceJson.f5350o);
    }
}
