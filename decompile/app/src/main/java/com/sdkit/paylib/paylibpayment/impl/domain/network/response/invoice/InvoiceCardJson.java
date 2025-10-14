package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceBankInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceCard;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceCardPaymentWay;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceCardJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final int f5283a;

    /* renamed from: b */
    public final String f5284b;

    /* renamed from: c */
    public final String f5285c;

    /* renamed from: d */
    public final String f5286d;

    /* renamed from: e */
    public final String f5287e;

    /* renamed from: f */
    public final String f5288f;

    /* renamed from: g */
    public final String f5289g;

    /* renamed from: h */
    public final String f5290h;

    /* renamed from: i */
    public final String f5291i;

    /* renamed from: j */
    public final String f5292j;

    /* renamed from: k */
    public final String f5293k;

    /* renamed from: l */
    public final String f5294l;

    /* renamed from: m */
    public final InvoiceCardPaymentWay f5295m;

    /* renamed from: n */
    public final String f5296n;

    /* renamed from: o */
    public final String f5297o;

    /* renamed from: p */
    public final InvoiceBankInfoJson f5298p;

    /* renamed from: q */
    public final Boolean f5299q;

    /* renamed from: r */
    public final InvoiceCardLoyaltyInfoJson f5300r;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceCardJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceCardJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceCardJson> serializer() {
            return InvoiceCardJson$$a.f5301a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceCardJson(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, InvoiceCardPaymentWay invoiceCardPaymentWay, String str12, String str13, InvoiceBankInfoJson invoiceBankInfoJson, Boolean bool, InvoiceCardLoyaltyInfoJson invoiceCardLoyaltyInfoJson, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InvoiceCardJson$$a.f5301a.getDescriptor());
        }
        this.f5283a = i2;
        if ((i & 2) == 0) {
            this.f5284b = null;
        } else {
            this.f5284b = str;
        }
        if ((i & 4) == 0) {
            this.f5285c = null;
        } else {
            this.f5285c = str2;
        }
        if ((i & 8) == 0) {
            this.f5286d = null;
        } else {
            this.f5286d = str3;
        }
        if ((i & 16) == 0) {
            this.f5287e = null;
        } else {
            this.f5287e = str4;
        }
        if ((i & 32) == 0) {
            this.f5288f = null;
        } else {
            this.f5288f = str5;
        }
        if ((i & 64) == 0) {
            this.f5289g = null;
        } else {
            this.f5289g = str6;
        }
        if ((i & 128) == 0) {
            this.f5290h = null;
        } else {
            this.f5290h = str7;
        }
        if ((i & 256) == 0) {
            this.f5291i = null;
        } else {
            this.f5291i = str8;
        }
        if ((i & 512) == 0) {
            this.f5292j = null;
        } else {
            this.f5292j = str9;
        }
        if ((i & 1024) == 0) {
            this.f5293k = null;
        } else {
            this.f5293k = str10;
        }
        if ((i & 2048) == 0) {
            this.f5294l = null;
        } else {
            this.f5294l = str11;
        }
        if ((i & 4096) == 0) {
            this.f5295m = null;
        } else {
            this.f5295m = invoiceCardPaymentWay;
        }
        if ((i & 8192) == 0) {
            this.f5296n = null;
        } else {
            this.f5296n = str12;
        }
        if ((i & 16384) == 0) {
            this.f5297o = null;
        } else {
            this.f5297o = str13;
        }
        if ((32768 & i) == 0) {
            this.f5298p = null;
        } else {
            this.f5298p = invoiceBankInfoJson;
        }
        if ((65536 & i) == 0) {
            this.f5299q = null;
        } else {
            this.f5299q = bool;
        }
        if ((i & 131072) == 0) {
            this.f5300r = null;
        } else {
            this.f5300r = invoiceCardLoyaltyInfoJson;
        }
    }

    /* renamed from: a */
    public InvoiceCard m4342a() {
        int i = this.f5283a;
        String str = this.f5284b;
        String str2 = this.f5285c;
        String str3 = this.f5286d;
        String str4 = this.f5287e;
        String str5 = this.f5288f;
        String str6 = this.f5289g;
        String str7 = this.f5290h;
        String str8 = this.f5291i;
        String str9 = this.f5292j;
        String str10 = this.f5293k;
        String str11 = this.f5294l;
        InvoiceCardPaymentWay invoiceCardPaymentWay = this.f5295m;
        String str12 = this.f5296n;
        String str13 = this.f5297o;
        InvoiceBankInfoJson invoiceBankInfoJson = this.f5298p;
        InvoiceBankInfo invoiceBankInfoM4338a = invoiceBankInfoJson != null ? invoiceBankInfoJson.m4338a() : null;
        Boolean bool = this.f5299q;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        InvoiceCardLoyaltyInfoJson invoiceCardLoyaltyInfoJson = this.f5300r;
        return new InvoiceCard(i, str, str2, str3, str4, str5, str6, str7, str9, str10, str11, str12, str13, invoiceCardPaymentWay, str8, invoiceBankInfoM4338a, zBooleanValue, invoiceCardLoyaltyInfoJson != null ? invoiceCardLoyaltyInfoJson.m4346a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceCardJson)) {
            return false;
        }
        InvoiceCardJson invoiceCardJson = (InvoiceCardJson) obj;
        return this.f5283a == invoiceCardJson.f5283a && Intrinsics.areEqual(this.f5284b, invoiceCardJson.f5284b) && Intrinsics.areEqual(this.f5285c, invoiceCardJson.f5285c) && Intrinsics.areEqual(this.f5286d, invoiceCardJson.f5286d) && Intrinsics.areEqual(this.f5287e, invoiceCardJson.f5287e) && Intrinsics.areEqual(this.f5288f, invoiceCardJson.f5288f) && Intrinsics.areEqual(this.f5289g, invoiceCardJson.f5289g) && Intrinsics.areEqual(this.f5290h, invoiceCardJson.f5290h) && Intrinsics.areEqual(this.f5291i, invoiceCardJson.f5291i) && Intrinsics.areEqual(this.f5292j, invoiceCardJson.f5292j) && Intrinsics.areEqual(this.f5293k, invoiceCardJson.f5293k) && Intrinsics.areEqual(this.f5294l, invoiceCardJson.f5294l) && this.f5295m == invoiceCardJson.f5295m && Intrinsics.areEqual(this.f5296n, invoiceCardJson.f5296n) && Intrinsics.areEqual(this.f5297o, invoiceCardJson.f5297o) && Intrinsics.areEqual(this.f5298p, invoiceCardJson.f5298p) && Intrinsics.areEqual(this.f5299q, invoiceCardJson.f5299q) && Intrinsics.areEqual(this.f5300r, invoiceCardJson.f5300r);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f5283a) * 31;
        String str = this.f5284b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5285c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5286d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5287e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5288f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5289g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5290h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5291i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f5292j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f5293k;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f5294l;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        InvoiceCardPaymentWay invoiceCardPaymentWay = this.f5295m;
        int iHashCode13 = (iHashCode12 + (invoiceCardPaymentWay == null ? 0 : invoiceCardPaymentWay.hashCode())) * 31;
        String str12 = this.f5296n;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f5297o;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        InvoiceBankInfoJson invoiceBankInfoJson = this.f5298p;
        int iHashCode16 = (iHashCode15 + (invoiceBankInfoJson == null ? 0 : invoiceBankInfoJson.hashCode())) * 31;
        Boolean bool = this.f5299q;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        InvoiceCardLoyaltyInfoJson invoiceCardLoyaltyInfoJson = this.f5300r;
        return iHashCode17 + (invoiceCardLoyaltyInfoJson != null ? invoiceCardLoyaltyInfoJson.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceCardJson(id=" + this.f5283a + ", name=" + this.f5284b + ", status=" + this.f5285c + ", maskedNumber=" + this.f5286d + ", expiryDate=" + this.f5287e + ", cardholder=" + this.f5288f + ", paymentSystem=" + this.f5289g + ", paymentSystemImage=" + this.f5290h + ", image=" + this.f5291i + ", paymentOperator=" + this.f5292j + ", paymentOperatorCode=" + this.f5293k + ", paymentOperatorImage=" + this.f5294l + ", paymentWay=" + this.f5295m + ", paymentWayName=" + this.f5296n + ", paymentWayLogo=" + this.f5297o + ", bankInfo=" + this.f5298p + ", loyaltyAvailability=" + this.f5299q + ", loyalty=" + this.f5300r + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4341a(InvoiceCardJson invoiceCardJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, invoiceCardJson.f5283a);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceCardJson.f5284b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceCardJson.f5284b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceCardJson.f5285c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceCardJson.f5285c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceCardJson.f5286d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, invoiceCardJson.f5286d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceCardJson.f5287e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, invoiceCardJson.f5287e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invoiceCardJson.f5288f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, invoiceCardJson.f5288f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invoiceCardJson.f5289g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invoiceCardJson.f5289g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invoiceCardJson.f5290h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, invoiceCardJson.f5290h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || invoiceCardJson.f5291i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, invoiceCardJson.f5291i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || invoiceCardJson.f5292j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, invoiceCardJson.f5292j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || invoiceCardJson.f5293k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, invoiceCardJson.f5293k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || invoiceCardJson.f5294l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, invoiceCardJson.f5294l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || invoiceCardJson.f5295m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, C8574b.f5526a, invoiceCardJson.f5295m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || invoiceCardJson.f5296n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, invoiceCardJson.f5296n);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || invoiceCardJson.f5297o != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, invoiceCardJson.f5297o);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || invoiceCardJson.f5298p != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, InvoiceBankInfoJson$$a.f5281a, invoiceCardJson.f5298p);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || invoiceCardJson.f5299q != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, invoiceCardJson.f5299q);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && invoiceCardJson.f5300r == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, InvoiceCardLoyaltyInfoJson$$a.f5314a, invoiceCardJson.f5300r);
    }
}
