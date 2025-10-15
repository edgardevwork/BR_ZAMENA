package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.AvailablePaymentMethodType;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceBankInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceDeviceInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePaymentInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePaymentParams;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoicePaymentParamJson;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoicePaymentInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: w */
    public static final KSerializer[] f5408w = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvoicePaymentParamJson.Companion.serializer()), null, null, null, null, null, null};

    /* renamed from: a */
    public final String f5409a;

    /* renamed from: b */
    public final String f5410b;

    /* renamed from: c */
    public final String f5411c;

    /* renamed from: d */
    public final String f5412d;

    /* renamed from: e */
    public final String f5413e;

    /* renamed from: f */
    public final String f5414f;

    /* renamed from: g */
    public final String f5415g;

    /* renamed from: h */
    public final String f5416h;

    /* renamed from: i */
    public final String f5417i;

    /* renamed from: j */
    public final String f5418j;

    /* renamed from: k */
    public final String f5419k;

    /* renamed from: l */
    public final String f5420l;

    /* renamed from: m */
    public final String f5421m;

    /* renamed from: n */
    public final String f5422n;

    /* renamed from: o */
    public final String f5423o;

    /* renamed from: p */
    public final List f5424p;

    /* renamed from: q */
    public final String f5425q;

    /* renamed from: r */
    public final String f5426r;

    /* renamed from: s */
    public final String f5427s;

    /* renamed from: t */
    public final InvoiceBankInfoJson f5428t;

    /* renamed from: u */
    public final InvoiceDeviceInfoJson f5429u;

    /* renamed from: v */
    public final InvoiceAppliedLoyaltyJson f5430v;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoicePaymentInfoJson> serializer() {
            return InvoicePaymentInfoJson$$a.f5431a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoicePaymentInfoJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, String str16, String str17, String str18, InvoiceBankInfoJson invoiceBankInfoJson, InvoiceDeviceInfoJson invoiceDeviceInfoJson, InvoiceAppliedLoyaltyJson invoiceAppliedLoyaltyJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5409a = null;
        } else {
            this.f5409a = str;
        }
        if ((i & 2) == 0) {
            this.f5410b = null;
        } else {
            this.f5410b = str2;
        }
        if ((i & 4) == 0) {
            this.f5411c = null;
        } else {
            this.f5411c = str3;
        }
        if ((i & 8) == 0) {
            this.f5412d = null;
        } else {
            this.f5412d = str4;
        }
        if ((i & 16) == 0) {
            this.f5413e = null;
        } else {
            this.f5413e = str5;
        }
        if ((i & 32) == 0) {
            this.f5414f = null;
        } else {
            this.f5414f = str6;
        }
        if ((i & 64) == 0) {
            this.f5415g = null;
        } else {
            this.f5415g = str7;
        }
        if ((i & 128) == 0) {
            this.f5416h = null;
        } else {
            this.f5416h = str8;
        }
        if ((i & 256) == 0) {
            this.f5417i = null;
        } else {
            this.f5417i = str9;
        }
        if ((i & 512) == 0) {
            this.f5418j = null;
        } else {
            this.f5418j = str10;
        }
        if ((i & 1024) == 0) {
            this.f5419k = null;
        } else {
            this.f5419k = str11;
        }
        if ((i & 2048) == 0) {
            this.f5420l = null;
        } else {
            this.f5420l = str12;
        }
        if ((i & 4096) == 0) {
            this.f5421m = null;
        } else {
            this.f5421m = str13;
        }
        if ((i & 8192) == 0) {
            this.f5422n = null;
        } else {
            this.f5422n = str14;
        }
        if ((i & 16384) == 0) {
            this.f5423o = null;
        } else {
            this.f5423o = str15;
        }
        if ((32768 & i) == 0) {
            this.f5424p = null;
        } else {
            this.f5424p = list;
        }
        if ((65536 & i) == 0) {
            this.f5425q = null;
        } else {
            this.f5425q = str16;
        }
        if ((131072 & i) == 0) {
            this.f5426r = null;
        } else {
            this.f5426r = str17;
        }
        if ((262144 & i) == 0) {
            this.f5427s = null;
        } else {
            this.f5427s = str18;
        }
        if ((524288 & i) == 0) {
            this.f5428t = null;
        } else {
            this.f5428t = invoiceBankInfoJson;
        }
        if ((1048576 & i) == 0) {
            this.f5429u = null;
        } else {
            this.f5429u = invoiceDeviceInfoJson;
        }
        if ((i & 2097152) == 0) {
            this.f5430v = null;
        } else {
            this.f5430v = invoiceAppliedLoyaltyJson;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4384a(InvoicePaymentInfoJson invoicePaymentInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5408w;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoicePaymentInfoJson.f5409a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5409a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoicePaymentInfoJson.f5410b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5410b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoicePaymentInfoJson.f5411c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5411c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoicePaymentInfoJson.f5412d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5412d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoicePaymentInfoJson.f5413e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5413e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invoicePaymentInfoJson.f5414f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5414f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invoicePaymentInfoJson.f5415g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5415g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invoicePaymentInfoJson.f5416h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5416h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || invoicePaymentInfoJson.f5417i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5417i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || invoicePaymentInfoJson.f5418j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5418j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || invoicePaymentInfoJson.f5419k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5419k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || invoicePaymentInfoJson.f5420l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5420l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || invoicePaymentInfoJson.f5421m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5421m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || invoicePaymentInfoJson.f5422n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5422n);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || invoicePaymentInfoJson.f5423o != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5423o);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || invoicePaymentInfoJson.f5424p != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], invoicePaymentInfoJson.f5424p);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || invoicePaymentInfoJson.f5425q != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5425q);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || invoicePaymentInfoJson.f5426r != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5426r);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || invoicePaymentInfoJson.f5427s != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, invoicePaymentInfoJson.f5427s);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || invoicePaymentInfoJson.f5428t != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, InvoiceBankInfoJson$$a.f5281a, invoicePaymentInfoJson.f5428t);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || invoicePaymentInfoJson.f5429u != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, InvoiceDeviceInfoJson$$a.f5334a, invoicePaymentInfoJson.f5429u);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && invoicePaymentInfoJson.f5430v == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, InvoiceAppliedLoyaltyJson$$a.f5275a, invoicePaymentInfoJson.f5430v);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0161  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvoicePaymentInfo m4386b() {
        String str;
        String str2;
        AvailablePaymentMethodType availablePaymentMethodTypeM4391c;
        String strM4421a;
        String strM4430a;
        String strM4418a;
        String strM4424a;
        InvoicePaymentParamJson.PaymentSystemOrderId paymentSystemOrderId;
        InvoicePaymentParamJson.Deeplink deeplink;
        InvoicePaymentParamJson.PaymentUrl paymentUrl;
        InvoicePaymentParamJson.PaymentInstrumentValue paymentInstrumentValue;
        InvoicePaymentParamJson.PaymentType paymentType;
        InvoicePaymentInstrumentTypeJson invoicePaymentInstrumentTypeJsonM4427a;
        String str3 = this.f5409a;
        Date date = str3 != null ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.US).parse(str3) : null;
        String str4 = this.f5410b;
        String str5 = this.f5411c;
        String str6 = this.f5412d;
        String str7 = this.f5413e;
        String str8 = this.f5414f;
        String str9 = this.f5415g;
        String str10 = this.f5416h;
        String str11 = this.f5417i;
        String str12 = this.f5418j;
        String str13 = this.f5419k;
        String str14 = this.f5420l;
        String str15 = this.f5421m;
        String str16 = this.f5422n;
        String str17 = this.f5423o;
        List list = this.f5424p;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = str15;
                    str2 = str17;
                    paymentType = null;
                    break;
                }
                str2 = str17;
                InvoicePaymentParamJson invoicePaymentParamJson = (InvoicePaymentParamJson) it.next();
                str = str15;
                paymentType = invoicePaymentParamJson instanceof InvoicePaymentParamJson.PaymentType ? (InvoicePaymentParamJson.PaymentType) invoicePaymentParamJson : null;
                if (paymentType != null) {
                    break;
                }
                str15 = str;
                str17 = str2;
            }
            if (paymentType != null && (invoicePaymentInstrumentTypeJsonM4427a = paymentType.m4427a()) != null) {
                availablePaymentMethodTypeM4391c = invoicePaymentInstrumentTypeJsonM4427a.m4391c();
            }
            if (list == null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        paymentInstrumentValue = null;
                        break;
                    }
                    InvoicePaymentParamJson invoicePaymentParamJson2 = (InvoicePaymentParamJson) it2.next();
                    Iterator it3 = it2;
                    paymentInstrumentValue = invoicePaymentParamJson2 instanceof InvoicePaymentParamJson.PaymentInstrumentValue ? (InvoicePaymentParamJson.PaymentInstrumentValue) invoicePaymentParamJson2 : null;
                    if (paymentInstrumentValue != null) {
                        break;
                    }
                    it2 = it3;
                }
                strM4421a = paymentInstrumentValue != null ? paymentInstrumentValue.m4421a() : null;
            }
            if (list == null) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        paymentUrl = null;
                        break;
                    }
                    InvoicePaymentParamJson invoicePaymentParamJson3 = (InvoicePaymentParamJson) it4.next();
                    Iterator it5 = it4;
                    paymentUrl = invoicePaymentParamJson3 instanceof InvoicePaymentParamJson.PaymentUrl ? (InvoicePaymentParamJson.PaymentUrl) invoicePaymentParamJson3 : null;
                    if (paymentUrl != null) {
                        break;
                    }
                    it4 = it5;
                }
                strM4430a = paymentUrl != null ? paymentUrl.m4430a() : null;
            }
            if (list == null) {
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        deeplink = null;
                        break;
                    }
                    InvoicePaymentParamJson invoicePaymentParamJson4 = (InvoicePaymentParamJson) it6.next();
                    Iterator it7 = it6;
                    deeplink = invoicePaymentParamJson4 instanceof InvoicePaymentParamJson.Deeplink ? (InvoicePaymentParamJson.Deeplink) invoicePaymentParamJson4 : null;
                    if (deeplink != null) {
                        break;
                    }
                    it6 = it7;
                }
                strM4418a = deeplink != null ? deeplink.m4418a() : null;
            }
            if (list == null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        paymentSystemOrderId = null;
                        break;
                    }
                    InvoicePaymentParamJson invoicePaymentParamJson5 = (InvoicePaymentParamJson) it8.next();
                    paymentSystemOrderId = invoicePaymentParamJson5 instanceof InvoicePaymentParamJson.PaymentSystemOrderId ? (InvoicePaymentParamJson.PaymentSystemOrderId) invoicePaymentParamJson5 : null;
                    if (paymentSystemOrderId != null) {
                        break;
                    }
                }
                strM4424a = paymentSystemOrderId != null ? paymentSystemOrderId.m4424a() : null;
            }
            InvoicePaymentParams invoicePaymentParams = new InvoicePaymentParams(availablePaymentMethodTypeM4391c, strM4421a, strM4430a, strM4418a, strM4424a);
            String str18 = this.f5425q;
            String str19 = this.f5426r;
            String str20 = this.f5427s;
            InvoiceBankInfoJson invoiceBankInfoJson = this.f5428t;
            InvoiceBankInfo invoiceBankInfoM4338a = invoiceBankInfoJson == null ? invoiceBankInfoJson.m4338a() : null;
            InvoiceDeviceInfoJson invoiceDeviceInfoJson = this.f5429u;
            InvoiceDeviceInfo invoiceDeviceInfoM4358a = invoiceDeviceInfoJson == null ? invoiceDeviceInfoJson.m4358a() : null;
            InvoiceAppliedLoyaltyJson invoiceAppliedLoyaltyJson = this.f5430v;
            return new InvoicePaymentInfo(date, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str, str16, str2, invoicePaymentParams, str18, str19, str20, invoiceBankInfoM4338a, invoiceDeviceInfoM4358a, invoiceAppliedLoyaltyJson == null ? invoiceAppliedLoyaltyJson.m4334a() : null);
        }
        str = str15;
        str2 = str17;
        availablePaymentMethodTypeM4391c = null;
        if (list == null) {
        }
        if (list == null) {
        }
        if (list == null) {
        }
        if (list == null) {
        }
        InvoicePaymentParams invoicePaymentParams2 = new InvoicePaymentParams(availablePaymentMethodTypeM4391c, strM4421a, strM4430a, strM4418a, strM4424a);
        String str182 = this.f5425q;
        String str192 = this.f5426r;
        String str202 = this.f5427s;
        InvoiceBankInfoJson invoiceBankInfoJson2 = this.f5428t;
        if (invoiceBankInfoJson2 == null) {
        }
        InvoiceDeviceInfoJson invoiceDeviceInfoJson2 = this.f5429u;
        if (invoiceDeviceInfoJson2 == null) {
        }
        InvoiceAppliedLoyaltyJson invoiceAppliedLoyaltyJson2 = this.f5430v;
        return new InvoicePaymentInfo(date, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str, str16, str2, invoicePaymentParams2, str182, str192, str202, invoiceBankInfoM4338a, invoiceDeviceInfoM4358a, invoiceAppliedLoyaltyJson2 == null ? invoiceAppliedLoyaltyJson2.m4334a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoicePaymentInfoJson)) {
            return false;
        }
        InvoicePaymentInfoJson invoicePaymentInfoJson = (InvoicePaymentInfoJson) obj;
        return Intrinsics.areEqual(this.f5409a, invoicePaymentInfoJson.f5409a) && Intrinsics.areEqual(this.f5410b, invoicePaymentInfoJson.f5410b) && Intrinsics.areEqual(this.f5411c, invoicePaymentInfoJson.f5411c) && Intrinsics.areEqual(this.f5412d, invoicePaymentInfoJson.f5412d) && Intrinsics.areEqual(this.f5413e, invoicePaymentInfoJson.f5413e) && Intrinsics.areEqual(this.f5414f, invoicePaymentInfoJson.f5414f) && Intrinsics.areEqual(this.f5415g, invoicePaymentInfoJson.f5415g) && Intrinsics.areEqual(this.f5416h, invoicePaymentInfoJson.f5416h) && Intrinsics.areEqual(this.f5417i, invoicePaymentInfoJson.f5417i) && Intrinsics.areEqual(this.f5418j, invoicePaymentInfoJson.f5418j) && Intrinsics.areEqual(this.f5419k, invoicePaymentInfoJson.f5419k) && Intrinsics.areEqual(this.f5420l, invoicePaymentInfoJson.f5420l) && Intrinsics.areEqual(this.f5421m, invoicePaymentInfoJson.f5421m) && Intrinsics.areEqual(this.f5422n, invoicePaymentInfoJson.f5422n) && Intrinsics.areEqual(this.f5423o, invoicePaymentInfoJson.f5423o) && Intrinsics.areEqual(this.f5424p, invoicePaymentInfoJson.f5424p) && Intrinsics.areEqual(this.f5425q, invoicePaymentInfoJson.f5425q) && Intrinsics.areEqual(this.f5426r, invoicePaymentInfoJson.f5426r) && Intrinsics.areEqual(this.f5427s, invoicePaymentInfoJson.f5427s) && Intrinsics.areEqual(this.f5428t, invoicePaymentInfoJson.f5428t) && Intrinsics.areEqual(this.f5429u, invoicePaymentInfoJson.f5429u) && Intrinsics.areEqual(this.f5430v, invoicePaymentInfoJson.f5430v);
    }

    public int hashCode() {
        String str = this.f5409a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5410b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5411c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5412d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5413e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5414f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5415g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5416h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f5417i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f5418j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f5419k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f5420l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f5421m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f5422n;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f5423o;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List list = this.f5424p;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str16 = this.f5425q;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f5426r;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f5427s;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        InvoiceBankInfoJson invoiceBankInfoJson = this.f5428t;
        int iHashCode20 = (iHashCode19 + (invoiceBankInfoJson == null ? 0 : invoiceBankInfoJson.hashCode())) * 31;
        InvoiceDeviceInfoJson invoiceDeviceInfoJson = this.f5429u;
        int iHashCode21 = (iHashCode20 + (invoiceDeviceInfoJson == null ? 0 : invoiceDeviceInfoJson.hashCode())) * 31;
        InvoiceAppliedLoyaltyJson invoiceAppliedLoyaltyJson = this.f5430v;
        return iHashCode21 + (invoiceAppliedLoyaltyJson != null ? invoiceAppliedLoyaltyJson.hashCode() : 0);
    }

    public String toString() {
        return "InvoicePaymentInfoJson(paymentDate=" + this.f5409a + ", paymentId=" + this.f5410b + ", partnerClientId=" + this.f5411c + ", cardId=" + this.f5412d + ", name=" + this.f5413e + ", status=" + this.f5414f + ", maskedPan=" + this.f5415g + ", expirationDate=" + this.f5416h + ", cardholderName=" + this.f5417i + ", cardImage=" + this.f5418j + ", paymentSystem=" + this.f5419k + ", paymentSystemImage=" + this.f5420l + ", paymentOperator=" + this.f5421m + ", paymentOperatorCode=" + this.f5422n + ", paymentOperatorImage=" + this.f5423o + ", paymentParams=" + this.f5424p + ", paymentWay=" + this.f5425q + ", paymentWayCode=" + this.f5426r + ", paymentWayLogo=" + this.f5427s + ", bankInfo=" + this.f5428t + ", deviceInfo=" + this.f5429u + ", loyaltyInfo=" + this.f5430v + ')';
    }
}
