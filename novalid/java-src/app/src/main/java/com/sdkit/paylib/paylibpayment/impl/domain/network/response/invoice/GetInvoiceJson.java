package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePaymentInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceStatus;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoiceResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class GetInvoiceJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: o */
    public static final KSerializer[] f5240o = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvoiceCardJson$$a.f5301a), null, null, new ArrayListSerializer(InvoiceReceiptJson$$a.f5486a), null};

    /* renamed from: a */
    public final String f5241a;

    /* renamed from: b */
    public final String f5242b;

    /* renamed from: c */
    public final String f5243c;

    /* renamed from: d */
    public final String f5244d;

    /* renamed from: e */
    public final Integer f5245e;

    /* renamed from: f */
    public final String f5246f;

    /* renamed from: g */
    public final InvoiceStatusJson f5247g;

    /* renamed from: h */
    public final String f5248h;

    /* renamed from: i */
    public final InvoiceOrderContainerJson f5249i;

    /* renamed from: j */
    public final List f5250j;

    /* renamed from: k */
    public final InvoicePaymentMethodsContainerJson f5251k;

    /* renamed from: l */
    public final InvoicePaymentInfoJson f5252l;

    /* renamed from: m */
    public final List f5253m;

    /* renamed from: n */
    public final ErrorJson f5254n;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/GetInvoiceJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/GetInvoiceJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<GetInvoiceJson> serializer() {
            return GetInvoiceJson$$a.f5255a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetInvoiceJson(int i, String str, String str2, String str3, String str4, Integer num, String str5, InvoiceStatusJson invoiceStatusJson, String str6, InvoiceOrderContainerJson invoiceOrderContainerJson, List list, InvoicePaymentMethodsContainerJson invoicePaymentMethodsContainerJson, InvoicePaymentInfoJson invoicePaymentInfoJson, List list2, ErrorJson errorJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5241a = null;
        } else {
            this.f5241a = str;
        }
        if ((i & 2) == 0) {
            this.f5242b = null;
        } else {
            this.f5242b = str2;
        }
        if ((i & 4) == 0) {
            this.f5243c = null;
        } else {
            this.f5243c = str3;
        }
        if ((i & 8) == 0) {
            this.f5244d = null;
        } else {
            this.f5244d = str4;
        }
        if ((i & 16) == 0) {
            this.f5245e = null;
        } else {
            this.f5245e = num;
        }
        if ((i & 32) == 0) {
            this.f5246f = null;
        } else {
            this.f5246f = str5;
        }
        if ((i & 64) == 0) {
            this.f5247g = null;
        } else {
            this.f5247g = invoiceStatusJson;
        }
        if ((i & 128) == 0) {
            this.f5248h = null;
        } else {
            this.f5248h = str6;
        }
        if ((i & 256) == 0) {
            this.f5249i = null;
        } else {
            this.f5249i = invoiceOrderContainerJson;
        }
        if ((i & 512) == 0) {
            this.f5250j = null;
        } else {
            this.f5250j = list;
        }
        if ((i & 1024) == 0) {
            this.f5251k = null;
        } else {
            this.f5251k = invoicePaymentMethodsContainerJson;
        }
        if ((i & 2048) == 0) {
            this.f5252l = null;
        } else {
            this.f5252l = invoicePaymentInfoJson;
        }
        if ((i & 4096) == 0) {
            this.f5253m = null;
        } else {
            this.f5253m = list2;
        }
        if ((i & 8192) == 0) {
            this.f5254n = null;
        } else {
            this.f5254n = errorJson;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public GetInvoiceResponse mo4249a(RequestMeta meta) {
        InvoiceStatus invoiceStatusM4445c;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListEmptyList;
        List listM4402b;
        Intrinsics.checkNotNullParameter(meta, "meta");
        String str = this.f5241a;
        String str2 = this.f5242b;
        String str3 = this.f5243c;
        String str4 = this.f5244d;
        Integer num = this.f5245e;
        String str5 = this.f5246f;
        Date date = str5 != null ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX", Locale.US).parse(str5) : null;
        InvoiceStatusJson invoiceStatusJson = this.f5247g;
        if (invoiceStatusJson == null || (invoiceStatusM4445c = invoiceStatusJson.m4445c()) == null) {
            invoiceStatusM4445c = InvoiceStatus.CANCELLED;
        }
        InvoiceStatus invoiceStatus = invoiceStatusM4445c;
        String str6 = this.f5248h;
        InvoiceOrderContainerJson invoiceOrderContainerJson = this.f5249i;
        InvoiceModel invoiceModelM4372b = invoiceOrderContainerJson != null ? invoiceOrderContainerJson.m4372b() : null;
        List list = this.f5250j;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InvoiceCardJson) it.next()).m4342a());
            }
        } else {
            arrayList = null;
        }
        List listEmptyList = arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
        InvoicePaymentMethodsContainerJson invoicePaymentMethodsContainerJson = this.f5251k;
        if (invoicePaymentMethodsContainerJson == null || (listM4402b = invoicePaymentMethodsContainerJson.m4402b()) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM4402b, 10));
            Iterator it2 = listM4402b.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InvoicePaymentMethodJson) it2.next()).m4397a());
            }
        }
        ArrayList arrayListEmptyList2 = arrayList2 == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList2;
        InvoicePaymentInfoJson invoicePaymentInfoJson = this.f5252l;
        InvoicePaymentInfo invoicePaymentInfoM4386b = invoicePaymentInfoJson != null ? invoicePaymentInfoJson.m4386b() : null;
        List list2 = this.f5253m;
        if (list2 != null) {
            arrayListEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayListEmptyList.add(((InvoiceReceiptJson) it3.next()).m4440a());
            }
        } else {
            arrayListEmptyList = null;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        ErrorJson errorJson = this.f5254n;
        return new GetInvoiceResponse(str, str2, str3, str4, num, date, invoiceStatus, str6, invoiceModelM4372b, listEmptyList, arrayListEmptyList2, invoicePaymentInfoM4386b, arrayListEmptyList, meta, errorJson != null ? errorJson.m4242a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetInvoiceJson)) {
            return false;
        }
        GetInvoiceJson getInvoiceJson = (GetInvoiceJson) obj;
        return Intrinsics.areEqual(this.f5241a, getInvoiceJson.f5241a) && Intrinsics.areEqual(this.f5242b, getInvoiceJson.f5242b) && Intrinsics.areEqual(this.f5243c, getInvoiceJson.f5243c) && Intrinsics.areEqual(this.f5244d, getInvoiceJson.f5244d) && Intrinsics.areEqual(this.f5245e, getInvoiceJson.f5245e) && Intrinsics.areEqual(this.f5246f, getInvoiceJson.f5246f) && this.f5247g == getInvoiceJson.f5247g && Intrinsics.areEqual(this.f5248h, getInvoiceJson.f5248h) && Intrinsics.areEqual(this.f5249i, getInvoiceJson.f5249i) && Intrinsics.areEqual(this.f5250j, getInvoiceJson.f5250j) && Intrinsics.areEqual(this.f5251k, getInvoiceJson.f5251k) && Intrinsics.areEqual(this.f5252l, getInvoiceJson.f5252l) && Intrinsics.areEqual(this.f5253m, getInvoiceJson.f5253m) && Intrinsics.areEqual(this.f5254n, getInvoiceJson.f5254n);
    }

    public int hashCode() {
        String str = this.f5241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5242b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5243c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5244d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f5245e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f5246f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InvoiceStatusJson invoiceStatusJson = this.f5247g;
        int iHashCode7 = (iHashCode6 + (invoiceStatusJson == null ? 0 : invoiceStatusJson.hashCode())) * 31;
        String str6 = this.f5248h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        InvoiceOrderContainerJson invoiceOrderContainerJson = this.f5249i;
        int iHashCode9 = (iHashCode8 + (invoiceOrderContainerJson == null ? 0 : invoiceOrderContainerJson.hashCode())) * 31;
        List list = this.f5250j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        InvoicePaymentMethodsContainerJson invoicePaymentMethodsContainerJson = this.f5251k;
        int iHashCode11 = (iHashCode10 + (invoicePaymentMethodsContainerJson == null ? 0 : invoicePaymentMethodsContainerJson.hashCode())) * 31;
        InvoicePaymentInfoJson invoicePaymentInfoJson = this.f5252l;
        int iHashCode12 = (iHashCode11 + (invoicePaymentInfoJson == null ? 0 : invoicePaymentInfoJson.hashCode())) * 31;
        List list2 = this.f5253m;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ErrorJson errorJson = this.f5254n;
        return iHashCode13 + (errorJson != null ? errorJson.hashCode() : 0);
    }

    public String toString() {
        return "GetInvoiceJson(applicationCode=" + this.f5241a + ", applicationName=" + this.f5242b + ", ownerCode=" + this.f5243c + ", ownerName=" + this.f5244d + ", invoiceId=" + this.f5245e + ", invoiceDate=" + this.f5246f + ", invoiceStatus=" + this.f5247g + ", image=" + this.f5248h + ", invoiceOrderContainer=" + this.f5249i + ", cards=" + this.f5250j + ", paymentMethodsContainer=" + this.f5251k + ", paymentInfo=" + this.f5252l + ", receipts=" + this.f5253m + ", error=" + this.f5254n + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4319a(GetInvoiceJson getInvoiceJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5240o;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getInvoiceJson.f5241a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, getInvoiceJson.f5241a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getInvoiceJson.f5242b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, getInvoiceJson.f5242b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getInvoiceJson.f5243c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, getInvoiceJson.f5243c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || getInvoiceJson.f5244d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, getInvoiceJson.f5244d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || getInvoiceJson.f5245e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, getInvoiceJson.f5245e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || getInvoiceJson.f5246f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, getInvoiceJson.f5246f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || getInvoiceJson.f5247g != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, InvoiceStatusJson$$a.f5498a, getInvoiceJson.f5247g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || getInvoiceJson.f5248h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, getInvoiceJson.f5248h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || getInvoiceJson.f5249i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, InvoiceOrderContainerJson$$a.f5380a, getInvoiceJson.f5249i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || getInvoiceJson.f5250j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], getInvoiceJson.f5250j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || getInvoiceJson.f5251k != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, InvoicePaymentMethodsContainerJson$$a.f5452a, getInvoiceJson.f5251k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || getInvoiceJson.f5252l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, InvoicePaymentInfoJson$$a.f5431a, getInvoiceJson.f5252l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || getInvoiceJson.f5253m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], getInvoiceJson.f5253m);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && getInvoiceJson.f5254n == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, ErrorJson$$a.f5143a, getInvoiceJson.f5254n);
    }
}
