package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceReceipt;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceReceiptStatus;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
public final class InvoiceReceiptJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final InvoiceReceiptStatus f5477a;

    /* renamed from: b */
    public final String f5478b;

    /* renamed from: c */
    public final String f5479c;

    /* renamed from: d */
    public final String f5480d;

    /* renamed from: e */
    public final String f5481e;

    /* renamed from: f */
    public final String f5482f;

    /* renamed from: g */
    public final String f5483g;

    /* renamed from: h */
    public final String f5484h;

    /* renamed from: i */
    public final String f5485i;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceReceiptJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceReceiptJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceReceiptJson> serializer() {
            return InvoiceReceiptJson$$a.f5486a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceReceiptJson(int i, InvoiceReceiptStatus invoiceReceiptStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (32 != (i & 32)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32, InvoiceReceiptJson$$a.f5486a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f5477a = null;
        } else {
            this.f5477a = invoiceReceiptStatus;
        }
        if ((i & 2) == 0) {
            this.f5478b = null;
        } else {
            this.f5478b = str;
        }
        if ((i & 4) == 0) {
            this.f5479c = null;
        } else {
            this.f5479c = str2;
        }
        if ((i & 8) == 0) {
            this.f5480d = null;
        } else {
            this.f5480d = str3;
        }
        if ((i & 16) == 0) {
            this.f5481e = null;
        } else {
            this.f5481e = str4;
        }
        this.f5482f = str5;
        if ((i & 64) == 0) {
            this.f5483g = null;
        } else {
            this.f5483g = str6;
        }
        if ((i & 128) == 0) {
            this.f5484h = null;
        } else {
            this.f5484h = str7;
        }
        if ((i & 256) == 0) {
            this.f5485i = null;
        } else {
            this.f5485i = str8;
        }
    }

    /* renamed from: a */
    public InvoiceReceipt m4440a() {
        InvoiceReceiptStatus invoiceReceiptStatus = this.f5477a;
        String str = this.f5478b;
        String str2 = this.f5479c;
        Date date = str2 != null ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(str2) : null;
        String str3 = this.f5480d;
        String str4 = this.f5481e;
        String str5 = this.f5482f;
        String str6 = this.f5483g;
        String str7 = this.f5484h;
        return new InvoiceReceipt(invoiceReceiptStatus, str, date, str3, str4, str5, str6, str7 != null ? Integer.valueOf(Integer.parseInt(str7)) : null, this.f5485i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceReceiptJson)) {
            return false;
        }
        InvoiceReceiptJson invoiceReceiptJson = (InvoiceReceiptJson) obj;
        return this.f5477a == invoiceReceiptJson.f5477a && Intrinsics.areEqual(this.f5478b, invoiceReceiptJson.f5478b) && Intrinsics.areEqual(this.f5479c, invoiceReceiptJson.f5479c) && Intrinsics.areEqual(this.f5480d, invoiceReceiptJson.f5480d) && Intrinsics.areEqual(this.f5481e, invoiceReceiptJson.f5481e) && Intrinsics.areEqual(this.f5482f, invoiceReceiptJson.f5482f) && Intrinsics.areEqual(this.f5483g, invoiceReceiptJson.f5483g) && Intrinsics.areEqual(this.f5484h, invoiceReceiptJson.f5484h) && Intrinsics.areEqual(this.f5485i, invoiceReceiptJson.f5485i);
    }

    public int hashCode() {
        InvoiceReceiptStatus invoiceReceiptStatus = this.f5477a;
        int iHashCode = (invoiceReceiptStatus == null ? 0 : invoiceReceiptStatus.hashCode()) * 31;
        String str = this.f5478b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5479c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5480d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5481e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5482f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5483g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5484h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5485i;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceReceiptJson(receiptStatus=");
        sb.append(this.f5477a);
        sb.append(", receiptId=");
        sb.append(this.f5478b);
        sb.append(", receiptDate=");
        sb.append(this.f5479c);
        sb.append(", receiptFiscalNumber=");
        sb.append(this.f5480d);
        sb.append(", ecrRegistrationNumber=");
        sb.append(this.f5481e);
        sb.append(", receiptFiscalNumberOfDocument=");
        sb.append(this.f5482f);
        sb.append(", receiptFiscalAttributeOfDocument=");
        sb.append(this.f5483g);
        sb.append(", totalSum=");
        sb.append(this.f5484h);
        sb.append(", receiptUrl=");
        return C8032c.m1430a(sb, this.f5485i, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4439a(InvoiceReceiptJson invoiceReceiptJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoiceReceiptJson.f5477a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, C8578f.f5532a, invoiceReceiptJson.f5477a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceReceiptJson.f5478b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceReceiptJson.f5478b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceReceiptJson.f5479c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceReceiptJson.f5479c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceReceiptJson.f5480d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, invoiceReceiptJson.f5480d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceReceiptJson.f5481e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, invoiceReceiptJson.f5481e);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, invoiceReceiptJson.f5482f);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invoiceReceiptJson.f5483g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, invoiceReceiptJson.f5483g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invoiceReceiptJson.f5484h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, invoiceReceiptJson.f5484h);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && invoiceReceiptJson.f5485i == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, invoiceReceiptJson.f5485i);
    }
}
