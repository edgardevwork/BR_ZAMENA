package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceLoyalty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceCardLoyaltyInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5303a;

    /* renamed from: b */
    public final String f5304b;

    /* renamed from: c */
    public final Double f5305c;

    /* renamed from: d */
    public final Integer f5306d;

    /* renamed from: e */
    public final Integer f5307e;

    /* renamed from: f */
    public final Integer f5308f;

    /* renamed from: g */
    public final String f5309g;

    /* renamed from: h */
    public final String f5310h;

    /* renamed from: i */
    public final String f5311i;

    /* renamed from: j */
    public final String f5312j;

    /* renamed from: k */
    public final String f5313k;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceCardLoyaltyInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceCardLoyaltyInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceCardLoyaltyInfoJson> serializer() {
            return InvoiceCardLoyaltyInfoJson$$a.f5314a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceCardLoyaltyInfoJson(int i, String str, String str2, Double d, Integer num, Integer num2, Integer num3, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5303a = null;
        } else {
            this.f5303a = str;
        }
        if ((i & 2) == 0) {
            this.f5304b = null;
        } else {
            this.f5304b = str2;
        }
        if ((i & 4) == 0) {
            this.f5305c = null;
        } else {
            this.f5305c = d;
        }
        if ((i & 8) == 0) {
            this.f5306d = null;
        } else {
            this.f5306d = num;
        }
        if ((i & 16) == 0) {
            this.f5307e = null;
        } else {
            this.f5307e = num2;
        }
        if ((i & 32) == 0) {
            this.f5308f = null;
        } else {
            this.f5308f = num3;
        }
        if ((i & 64) == 0) {
            this.f5309g = null;
        } else {
            this.f5309g = str3;
        }
        if ((i & 128) == 0) {
            this.f5310h = null;
        } else {
            this.f5310h = str4;
        }
        if ((i & 256) == 0) {
            this.f5311i = null;
        } else {
            this.f5311i = str5;
        }
        if ((i & 512) == 0) {
            this.f5312j = null;
        } else {
            this.f5312j = str6;
        }
        if ((i & 1024) == 0) {
            this.f5313k = null;
        } else {
            this.f5313k = str7;
        }
    }

    /* renamed from: a */
    public InvoiceLoyalty m4346a() {
        String str = this.f5303a;
        String str2 = str == null ? "" : str;
        String str3 = this.f5304b;
        String str4 = str3 == null ? "" : str3;
        Double d = this.f5305c;
        double dDoubleValue = d != null ? d.doubleValue() : Double.NaN;
        Integer num = this.f5306d;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        Integer num2 = this.f5307e;
        Integer numValueOf2 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
        Integer num3 = this.f5308f;
        Integer numValueOf3 = Integer.valueOf(num3 != null ? num3.intValue() : 0);
        String str5 = this.f5309g;
        String str6 = str5 == null ? "" : str5;
        String str7 = this.f5310h;
        String str8 = str7 == null ? "" : str7;
        String str9 = this.f5311i;
        String str10 = str9 == null ? "" : str9;
        String str11 = this.f5312j;
        String str12 = str11 == null ? "" : str11;
        String str13 = this.f5313k;
        return new InvoiceLoyalty(str2, str4, dDoubleValue, numValueOf, numValueOf2, numValueOf3, str6, str8, str10, str12, str13 == null ? "" : str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceCardLoyaltyInfoJson)) {
            return false;
        }
        InvoiceCardLoyaltyInfoJson invoiceCardLoyaltyInfoJson = (InvoiceCardLoyaltyInfoJson) obj;
        return Intrinsics.areEqual(this.f5303a, invoiceCardLoyaltyInfoJson.f5303a) && Intrinsics.areEqual(this.f5304b, invoiceCardLoyaltyInfoJson.f5304b) && Intrinsics.areEqual((Object) this.f5305c, (Object) invoiceCardLoyaltyInfoJson.f5305c) && Intrinsics.areEqual(this.f5306d, invoiceCardLoyaltyInfoJson.f5306d) && Intrinsics.areEqual(this.f5307e, invoiceCardLoyaltyInfoJson.f5307e) && Intrinsics.areEqual(this.f5308f, invoiceCardLoyaltyInfoJson.f5308f) && Intrinsics.areEqual(this.f5309g, invoiceCardLoyaltyInfoJson.f5309g) && Intrinsics.areEqual(this.f5310h, invoiceCardLoyaltyInfoJson.f5310h) && Intrinsics.areEqual(this.f5311i, invoiceCardLoyaltyInfoJson.f5311i) && Intrinsics.areEqual(this.f5312j, invoiceCardLoyaltyInfoJson.f5312j) && Intrinsics.areEqual(this.f5313k, invoiceCardLoyaltyInfoJson.f5313k);
    }

    public int hashCode() {
        String str = this.f5303a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5304b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f5305c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f5306d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5307e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f5308f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f5309g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5310h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5311i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5312j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5313k;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceCardLoyaltyInfoJson(serviceCode=" + this.f5303a + ", serviceName=" + this.f5304b + ", changeRate=" + this.f5305c + ", balance=" + this.f5306d + ", minAmount=" + this.f5307e + ", maxAmount=" + this.f5308f + ", visualAmount=" + this.f5309g + ", action=" + this.f5310h + ", visualLabel=" + this.f5311i + ", actionMessage=" + this.f5312j + ", image=" + this.f5313k + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4345a(InvoiceCardLoyaltyInfoJson invoiceCardLoyaltyInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoiceCardLoyaltyInfoJson.f5303a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5303a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceCardLoyaltyInfoJson.f5304b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5304b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceCardLoyaltyInfoJson.f5305c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5305c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceCardLoyaltyInfoJson.f5306d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5306d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceCardLoyaltyInfoJson.f5307e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5307e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invoiceCardLoyaltyInfoJson.f5308f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5308f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invoiceCardLoyaltyInfoJson.f5309g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5309g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invoiceCardLoyaltyInfoJson.f5310h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5310h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || invoiceCardLoyaltyInfoJson.f5311i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5311i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || invoiceCardLoyaltyInfoJson.f5312j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5312j);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && invoiceCardLoyaltyInfoJson.f5313k == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, invoiceCardLoyaltyInfoJson.f5313k);
    }
}
