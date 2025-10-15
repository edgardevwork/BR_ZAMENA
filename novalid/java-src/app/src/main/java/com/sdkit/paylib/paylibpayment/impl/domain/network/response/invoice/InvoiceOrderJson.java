package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrder;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderTaxSystem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceOrderJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: t */
    public static final KSerializer[] f5382t = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvoiceOrderBundleItemJson$$a.f5370a)};

    /* renamed from: a */
    public final String f5383a;

    /* renamed from: b */
    public final String f5384b;

    /* renamed from: c */
    public final String f5385c;

    /* renamed from: d */
    public final String f5386d;

    /* renamed from: e */
    public final long f5387e;

    /* renamed from: f */
    public final long f5388f;

    /* renamed from: g */
    public final String f5389g;

    /* renamed from: h */
    public final String f5390h;

    /* renamed from: i */
    public final String f5391i;

    /* renamed from: j */
    public final String f5392j;

    /* renamed from: k */
    public final String f5393k;

    /* renamed from: l */
    public final String f5394l;

    /* renamed from: m */
    public final InvoiceOrderTaxSystem f5395m;

    /* renamed from: n */
    public final String f5396n;

    /* renamed from: o */
    public final String f5397o;

    /* renamed from: p */
    public final String f5398p;

    /* renamed from: q */
    public final String f5399q;

    /* renamed from: r */
    public final String f5400r;

    /* renamed from: s */
    public final List f5401s;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceOrderJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceOrderJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceOrderJson> serializer() {
            return InvoiceOrderJson$$a.f5402a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceOrderJson(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, String str7, String str8, String str9, String str10, InvoiceOrderTaxSystem invoiceOrderTaxSystem, String str11, String str12, String str13, String str14, String str15, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (121 != (i & 121)) {
            PluginExceptionsKt.throwMissingFieldException(i, 121, InvoiceOrderJson$$a.f5402a.getDescriptor());
        }
        this.f5383a = str;
        if ((i & 2) == 0) {
            this.f5384b = null;
        } else {
            this.f5384b = str2;
        }
        if ((i & 4) == 0) {
            this.f5385c = null;
        } else {
            this.f5385c = str3;
        }
        this.f5386d = str4;
        this.f5387e = j;
        this.f5388f = j2;
        this.f5389g = str5;
        if ((i & 128) == 0) {
            this.f5390h = null;
        } else {
            this.f5390h = str6;
        }
        if ((i & 256) == 0) {
            this.f5391i = null;
        } else {
            this.f5391i = str7;
        }
        if ((i & 512) == 0) {
            this.f5392j = null;
        } else {
            this.f5392j = str8;
        }
        if ((i & 1024) == 0) {
            this.f5393k = null;
        } else {
            this.f5393k = str9;
        }
        if ((i & 2048) == 0) {
            this.f5394l = null;
        } else {
            this.f5394l = str10;
        }
        if ((i & 4096) == 0) {
            this.f5395m = null;
        } else {
            this.f5395m = invoiceOrderTaxSystem;
        }
        if ((i & 8192) == 0) {
            this.f5396n = null;
        } else {
            this.f5396n = str11;
        }
        if ((i & 16384) == 0) {
            this.f5397o = null;
        } else {
            this.f5397o = str12;
        }
        if ((32768 & i) == 0) {
            this.f5398p = null;
        } else {
            this.f5398p = str13;
        }
        if ((65536 & i) == 0) {
            this.f5399q = null;
        } else {
            this.f5399q = str14;
        }
        if ((131072 & i) == 0) {
            this.f5400r = null;
        } else {
            this.f5400r = str15;
        }
        if ((i & 262144) == 0) {
            this.f5401s = null;
        } else {
            this.f5401s = list;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4375a(InvoiceOrderJson invoiceOrderJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5382t;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, invoiceOrderJson.f5383a);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceOrderJson.f5384b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, invoiceOrderJson.f5384b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceOrderJson.f5385c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, invoiceOrderJson.f5385c);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, invoiceOrderJson.f5386d);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, invoiceOrderJson.f5387e);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, invoiceOrderJson.f5388f);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, invoiceOrderJson.f5389g);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invoiceOrderJson.f5390h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, invoiceOrderJson.f5390h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || invoiceOrderJson.f5391i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, invoiceOrderJson.f5391i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || invoiceOrderJson.f5392j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, invoiceOrderJson.f5392j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || invoiceOrderJson.f5393k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, invoiceOrderJson.f5393k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || invoiceOrderJson.f5394l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, invoiceOrderJson.f5394l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || invoiceOrderJson.f5395m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, C8575c.f5528a, invoiceOrderJson.f5395m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || invoiceOrderJson.f5396n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, invoiceOrderJson.f5396n);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || invoiceOrderJson.f5397o != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, invoiceOrderJson.f5397o);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || invoiceOrderJson.f5398p != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, invoiceOrderJson.f5398p);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || invoiceOrderJson.f5399q != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, invoiceOrderJson.f5399q);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || invoiceOrderJson.f5400r != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, invoiceOrderJson.f5400r);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && invoiceOrderJson.f5401s == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, kSerializerArr[18], invoiceOrderJson.f5401s);
    }

    /* renamed from: b */
    public InvoiceOrder m4377b() throws ParseException {
        String str;
        String str2 = this.f5383a;
        String str3 = this.f5384b;
        String str4 = this.f5385c;
        Locale locale = Locale.US;
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", locale).parse(this.f5386d);
        Intrinsics.checkNotNull(date, "null cannot be cast to non-null type java.util.Date");
        long j = this.f5387e;
        long j2 = this.f5388f;
        String str5 = this.f5389g;
        String str6 = this.f5390h;
        String str7 = this.f5391i;
        String str8 = this.f5392j;
        String str9 = this.f5393k;
        ArrayList arrayList = null;
        Date date2 = str9 != null ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", locale).parse(str9) : null;
        String str10 = this.f5394l;
        Date date3 = date2;
        Date date4 = str10 != null ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", locale).parse(str10) : null;
        InvoiceOrderTaxSystem invoiceOrderTaxSystem = this.f5395m;
        String str11 = this.f5396n;
        String str12 = this.f5397o;
        Date date5 = date4;
        String str13 = this.f5398p;
        String str14 = this.f5399q;
        String str15 = this.f5400r;
        List list = this.f5401s;
        if (list != null) {
            str = str11;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InvoiceOrderBundleItemJson) it.next()).m4367b());
            }
            arrayList = arrayList2;
        } else {
            str = str11;
        }
        return new InvoiceOrder(str2, str3, str4, date, j, j2, str5, str6, str7, str8, date3, date5, invoiceOrderTaxSystem, str, str12, str13, str14, str15, arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceOrderJson)) {
            return false;
        }
        InvoiceOrderJson invoiceOrderJson = (InvoiceOrderJson) obj;
        return Intrinsics.areEqual(this.f5383a, invoiceOrderJson.f5383a) && Intrinsics.areEqual(this.f5384b, invoiceOrderJson.f5384b) && Intrinsics.areEqual(this.f5385c, invoiceOrderJson.f5385c) && Intrinsics.areEqual(this.f5386d, invoiceOrderJson.f5386d) && this.f5387e == invoiceOrderJson.f5387e && this.f5388f == invoiceOrderJson.f5388f && Intrinsics.areEqual(this.f5389g, invoiceOrderJson.f5389g) && Intrinsics.areEqual(this.f5390h, invoiceOrderJson.f5390h) && Intrinsics.areEqual(this.f5391i, invoiceOrderJson.f5391i) && Intrinsics.areEqual(this.f5392j, invoiceOrderJson.f5392j) && Intrinsics.areEqual(this.f5393k, invoiceOrderJson.f5393k) && Intrinsics.areEqual(this.f5394l, invoiceOrderJson.f5394l) && this.f5395m == invoiceOrderJson.f5395m && Intrinsics.areEqual(this.f5396n, invoiceOrderJson.f5396n) && Intrinsics.areEqual(this.f5397o, invoiceOrderJson.f5397o) && Intrinsics.areEqual(this.f5398p, invoiceOrderJson.f5398p) && Intrinsics.areEqual(this.f5399q, invoiceOrderJson.f5399q) && Intrinsics.areEqual(this.f5400r, invoiceOrderJson.f5400r) && Intrinsics.areEqual(this.f5401s, invoiceOrderJson.f5401s);
    }

    public int hashCode() {
        int iHashCode = this.f5383a.hashCode() * 31;
        String str = this.f5384b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5385c;
        int iM1429a = C8031b.m1429a(this.f5389g, (Long.hashCode(this.f5388f) + ((Long.hashCode(this.f5387e) + C8031b.m1429a(this.f5386d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31)) * 31, 31);
        String str3 = this.f5390h;
        int iHashCode3 = (iM1429a + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5391i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5392j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5393k;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f5394l;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        InvoiceOrderTaxSystem invoiceOrderTaxSystem = this.f5395m;
        int iHashCode8 = (iHashCode7 + (invoiceOrderTaxSystem == null ? 0 : invoiceOrderTaxSystem.hashCode())) * 31;
        String str8 = this.f5396n;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f5397o;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f5398p;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f5399q;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f5400r;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List list = this.f5401s;
        return iHashCode13 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceOrderJson(orderId=" + this.f5383a + ", orderNumber=" + this.f5384b + ", purchaseId=" + this.f5385c + ", orderDate=" + this.f5386d + ", serviceId=" + this.f5387e + ", amount=" + this.f5388f + ", currency=" + this.f5389g + ", purpose=" + this.f5390h + ", description=" + this.f5391i + ", language=" + this.f5392j + ", expirationDate=" + this.f5393k + ", autocompletionDate=" + this.f5394l + ", taxSystem=" + this.f5395m + ", tradeName=" + this.f5396n + ", orgName=" + this.f5397o + ", orgInn=" + this.f5398p + ", visualName=" + this.f5399q + ", visualAmount=" + this.f5400r + ", bundle=" + this.f5401s + ')';
    }
}
