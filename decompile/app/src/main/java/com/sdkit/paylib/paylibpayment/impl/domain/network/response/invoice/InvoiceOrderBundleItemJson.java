package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderBundleItem;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderTaxType;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InvoiceOrderQuantityJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InvoiceOrderQuantityJson$$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceOrderBundleItemJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: q */
    public static final KSerializer[] f5353q = {null, null, new ArrayListSerializer(InvoiceParamJson$$a.f5406a), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* renamed from: a */
    public final int f5354a;

    /* renamed from: b */
    public final String f5355b;

    /* renamed from: c */
    public final List f5356c;

    /* renamed from: d */
    public final InvoiceOrderQuantityJson f5357d;

    /* renamed from: e */
    public final Integer f5358e;

    /* renamed from: f */
    public final String f5359f;

    /* renamed from: g */
    public final String f5360g;

    /* renamed from: h */
    public final Integer f5361h;

    /* renamed from: i */
    public final String f5362i;

    /* renamed from: j */
    public final Double f5363j;

    /* renamed from: k */
    public final String f5364k;

    /* renamed from: l */
    public final Double f5365l;

    /* renamed from: m */
    public final InvoiceOrderTaxType f5366m;

    /* renamed from: n */
    public final Integer f5367n;

    /* renamed from: o */
    public final String f5368o;

    /* renamed from: p */
    public final String f5369p;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceOrderBundleItemJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceOrderBundleItemJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceOrderBundleItemJson> serializer() {
            return InvoiceOrderBundleItemJson$$a.f5370a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceOrderBundleItemJson(int i, int i2, String str, List list, InvoiceOrderQuantityJson invoiceOrderQuantityJson, Integer num, String str2, String str3, Integer num2, String str4, Double d, String str5, Double d2, InvoiceOrderTaxType invoiceOrderTaxType, Integer num3, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InvoiceOrderBundleItemJson$$a.f5370a.getDescriptor());
        }
        this.f5354a = i2;
        this.f5355b = str;
        if ((i & 4) == 0) {
            this.f5356c = null;
        } else {
            this.f5356c = list;
        }
        if ((i & 8) == 0) {
            this.f5357d = null;
        } else {
            this.f5357d = invoiceOrderQuantityJson;
        }
        if ((i & 16) == 0) {
            this.f5358e = null;
        } else {
            this.f5358e = num;
        }
        if ((i & 32) == 0) {
            this.f5359f = null;
        } else {
            this.f5359f = str2;
        }
        if ((i & 64) == 0) {
            this.f5360g = null;
        } else {
            this.f5360g = str3;
        }
        if ((i & 128) == 0) {
            this.f5361h = null;
        } else {
            this.f5361h = num2;
        }
        if ((i & 256) == 0) {
            this.f5362i = null;
        } else {
            this.f5362i = str4;
        }
        if ((i & 512) == 0) {
            this.f5363j = null;
        } else {
            this.f5363j = d;
        }
        if ((i & 1024) == 0) {
            this.f5364k = null;
        } else {
            this.f5364k = str5;
        }
        if ((i & 2048) == 0) {
            this.f5365l = null;
        } else {
            this.f5365l = d2;
        }
        if ((i & 4096) == 0) {
            this.f5366m = null;
        } else {
            this.f5366m = invoiceOrderTaxType;
        }
        if ((i & 8192) == 0) {
            this.f5367n = null;
        } else {
            this.f5367n = num3;
        }
        if ((i & 16384) == 0) {
            this.f5368o = null;
        } else {
            this.f5368o = str6;
        }
        if ((i & 32768) == 0) {
            this.f5369p = null;
        } else {
            this.f5369p = str7;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4365a(InvoiceOrderBundleItemJson invoiceOrderBundleItemJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5353q;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, invoiceOrderBundleItemJson.f5354a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, invoiceOrderBundleItemJson.f5355b);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceOrderBundleItemJson.f5356c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], invoiceOrderBundleItemJson.f5356c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceOrderBundleItemJson.f5357d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvoiceOrderQuantityJson$$a.f5147a, invoiceOrderBundleItemJson.f5357d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceOrderBundleItemJson.f5358e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, invoiceOrderBundleItemJson.f5358e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invoiceOrderBundleItemJson.f5359f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, invoiceOrderBundleItemJson.f5359f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || invoiceOrderBundleItemJson.f5360g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invoiceOrderBundleItemJson.f5360g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || invoiceOrderBundleItemJson.f5361h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, invoiceOrderBundleItemJson.f5361h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || invoiceOrderBundleItemJson.f5362i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, invoiceOrderBundleItemJson.f5362i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || invoiceOrderBundleItemJson.f5363j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, DoubleSerializer.INSTANCE, invoiceOrderBundleItemJson.f5363j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || invoiceOrderBundleItemJson.f5364k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, invoiceOrderBundleItemJson.f5364k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || invoiceOrderBundleItemJson.f5365l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DoubleSerializer.INSTANCE, invoiceOrderBundleItemJson.f5365l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || invoiceOrderBundleItemJson.f5366m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, C8576d.f5530a, invoiceOrderBundleItemJson.f5366m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || invoiceOrderBundleItemJson.f5367n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, invoiceOrderBundleItemJson.f5367n);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || invoiceOrderBundleItemJson.f5368o != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, invoiceOrderBundleItemJson.f5368o);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && invoiceOrderBundleItemJson.f5369p == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, invoiceOrderBundleItemJson.f5369p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* renamed from: b */
    public InvoiceOrderBundleItem m4367b() {
        ArrayList arrayListEmptyList;
        int i = this.f5354a;
        String str = this.f5355b;
        List list = this.f5356c;
        if (list != null) {
            arrayListEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayListEmptyList.add(((InvoiceParamJson) it.next()).m4381a());
            }
        } else {
            arrayListEmptyList = null;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        InvoiceOrderQuantityJson invoiceOrderQuantityJson = this.f5357d;
        return new InvoiceOrderBundleItem(i, str, arrayListEmptyList, invoiceOrderQuantityJson != null ? invoiceOrderQuantityJson.m4246a() : null, this.f5358e, this.f5360g, this.f5361h, this.f5359f, this.f5362i, this.f5363j, this.f5364k, this.f5365l, this.f5366m, this.f5367n, this.f5368o, this.f5369p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceOrderBundleItemJson)) {
            return false;
        }
        InvoiceOrderBundleItemJson invoiceOrderBundleItemJson = (InvoiceOrderBundleItemJson) obj;
        return this.f5354a == invoiceOrderBundleItemJson.f5354a && Intrinsics.areEqual(this.f5355b, invoiceOrderBundleItemJson.f5355b) && Intrinsics.areEqual(this.f5356c, invoiceOrderBundleItemJson.f5356c) && Intrinsics.areEqual(this.f5357d, invoiceOrderBundleItemJson.f5357d) && Intrinsics.areEqual(this.f5358e, invoiceOrderBundleItemJson.f5358e) && Intrinsics.areEqual(this.f5359f, invoiceOrderBundleItemJson.f5359f) && Intrinsics.areEqual(this.f5360g, invoiceOrderBundleItemJson.f5360g) && Intrinsics.areEqual(this.f5361h, invoiceOrderBundleItemJson.f5361h) && Intrinsics.areEqual(this.f5362i, invoiceOrderBundleItemJson.f5362i) && Intrinsics.areEqual((Object) this.f5363j, (Object) invoiceOrderBundleItemJson.f5363j) && Intrinsics.areEqual(this.f5364k, invoiceOrderBundleItemJson.f5364k) && Intrinsics.areEqual((Object) this.f5365l, (Object) invoiceOrderBundleItemJson.f5365l) && this.f5366m == invoiceOrderBundleItemJson.f5366m && Intrinsics.areEqual(this.f5367n, invoiceOrderBundleItemJson.f5367n) && Intrinsics.areEqual(this.f5368o, invoiceOrderBundleItemJson.f5368o) && Intrinsics.areEqual(this.f5369p, invoiceOrderBundleItemJson.f5369p);
    }

    public int hashCode() {
        int iM1429a = C8031b.m1429a(this.f5355b, Integer.hashCode(this.f5354a) * 31, 31);
        List list = this.f5356c;
        int iHashCode = (iM1429a + (list == null ? 0 : list.hashCode())) * 31;
        InvoiceOrderQuantityJson invoiceOrderQuantityJson = this.f5357d;
        int iHashCode2 = (iHashCode + (invoiceOrderQuantityJson == null ? 0 : invoiceOrderQuantityJson.hashCode())) * 31;
        Integer num = this.f5358e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f5359f;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5360g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f5361h;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f5362i;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.f5363j;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.f5364k;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.f5365l;
        int iHashCode10 = (iHashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        InvoiceOrderTaxType invoiceOrderTaxType = this.f5366m;
        int iHashCode11 = (iHashCode10 + (invoiceOrderTaxType == null ? 0 : invoiceOrderTaxType.hashCode())) * 31;
        Integer num3 = this.f5367n;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.f5368o;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5369p;
        return iHashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "InvoiceOrderBundleItemJson(positionId=" + this.f5354a + ", name=" + this.f5355b + ", params=" + this.f5356c + ", quantity=" + this.f5357d + ", itemAmount=" + this.f5358e + ", currency=" + this.f5359f + ", itemCode=" + this.f5360g + ", itemPrice=" + this.f5361h + ", discountType=" + this.f5362i + ", discountValue=" + this.f5363j + ", interestType=" + this.f5364k + ", interestValue=" + this.f5365l + ", taxType=" + this.f5366m + ", taxSum=" + this.f5367n + ", itemCodeSmartPay=" + this.f5368o + ", image=" + this.f5369p + ')';
    }
}
