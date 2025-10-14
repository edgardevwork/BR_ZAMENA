package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceDeliveryInfo;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceModel;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrder;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoicePurchaser;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class InvoiceOrderContainerJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: h */
    public static final KSerializer[] f5372h = {null, null, new ArrayListSerializer(InvoiceParamJson$$a.f5406a), null, null, null, null};

    /* renamed from: a */
    public final InvoicePurchaserJson f5373a;

    /* renamed from: b */
    public final InvoiceDeliveryInfoJson f5374b;

    /* renamed from: c */
    public final List f5375c;

    /* renamed from: d */
    public final InvoiceOrderJson f5376d;

    /* renamed from: e */
    public final Boolean f5377e;

    /* renamed from: f */
    public final Boolean f5378f;

    /* renamed from: g */
    public final String f5379g;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceOrderContainerJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceOrderContainerJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceOrderContainerJson> serializer() {
            return InvoiceOrderContainerJson$$a.f5380a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceOrderContainerJson(int i, InvoicePurchaserJson invoicePurchaserJson, InvoiceDeliveryInfoJson invoiceDeliveryInfoJson, List list, InvoiceOrderJson invoiceOrderJson, Boolean bool, Boolean bool2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5373a = null;
        } else {
            this.f5373a = invoicePurchaserJson;
        }
        if ((i & 2) == 0) {
            this.f5374b = null;
        } else {
            this.f5374b = invoiceDeliveryInfoJson;
        }
        if ((i & 4) == 0) {
            this.f5375c = null;
        } else {
            this.f5375c = list;
        }
        if ((i & 8) == 0) {
            this.f5376d = null;
        } else {
            this.f5376d = invoiceOrderJson;
        }
        if ((i & 16) == 0) {
            this.f5377e = null;
        } else {
            this.f5377e = bool;
        }
        if ((i & 32) == 0) {
            this.f5378f = null;
        } else {
            this.f5378f = bool2;
        }
        if ((i & 64) == 0) {
            this.f5379g = null;
        } else {
            this.f5379g = str;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4370a(InvoiceOrderContainerJson invoiceOrderContainerJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5372h;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || invoiceOrderContainerJson.f5373a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvoicePurchaserJson$$a.f5475a, invoiceOrderContainerJson.f5373a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || invoiceOrderContainerJson.f5374b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvoiceDeliveryInfoJson$$a.f5324a, invoiceOrderContainerJson.f5374b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || invoiceOrderContainerJson.f5375c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], invoiceOrderContainerJson.f5375c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || invoiceOrderContainerJson.f5376d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvoiceOrderJson$$a.f5402a, invoiceOrderContainerJson.f5376d);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || invoiceOrderContainerJson.f5377e != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, invoiceOrderContainerJson.f5377e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || invoiceOrderContainerJson.f5378f != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, invoiceOrderContainerJson.f5378f);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && invoiceOrderContainerJson.f5379g == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, invoiceOrderContainerJson.f5379g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* renamed from: b */
    public InvoiceModel m4372b() {
        ArrayList arrayList;
        InvoiceOrder invoiceOrderM4377b;
        InvoicePurchaserJson invoicePurchaserJson = this.f5373a;
        InvoicePurchaser invoicePurchaserM4436a = invoicePurchaserJson != null ? invoicePurchaserJson.m4436a() : null;
        InvoiceDeliveryInfoJson invoiceDeliveryInfoJson = this.f5374b;
        InvoiceDeliveryInfo invoiceDeliveryInfoM4354a = invoiceDeliveryInfoJson != null ? invoiceDeliveryInfoJson.m4354a() : null;
        List list = this.f5375c;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InvoiceParamJson) it.next()).m4381a());
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayListEmptyList = arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
        InvoiceOrderJson invoiceOrderJson = this.f5376d;
        if (invoiceOrderJson == null || (invoiceOrderM4377b = invoiceOrderJson.m4377b()) == null) {
            return null;
        }
        Boolean bool = this.f5377e;
        return new InvoiceModel(invoicePurchaserM4436a, invoiceDeliveryInfoM4354a, arrayListEmptyList, invoiceOrderM4377b, bool != null ? bool.booleanValue() : false, !Intrinsics.areEqual(this.f5378f, Boolean.TRUE), this.f5379g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceOrderContainerJson)) {
            return false;
        }
        InvoiceOrderContainerJson invoiceOrderContainerJson = (InvoiceOrderContainerJson) obj;
        return Intrinsics.areEqual(this.f5373a, invoiceOrderContainerJson.f5373a) && Intrinsics.areEqual(this.f5374b, invoiceOrderContainerJson.f5374b) && Intrinsics.areEqual(this.f5375c, invoiceOrderContainerJson.f5375c) && Intrinsics.areEqual(this.f5376d, invoiceOrderContainerJson.f5376d) && Intrinsics.areEqual(this.f5377e, invoiceOrderContainerJson.f5377e) && Intrinsics.areEqual(this.f5378f, invoiceOrderContainerJson.f5378f) && Intrinsics.areEqual(this.f5379g, invoiceOrderContainerJson.f5379g);
    }

    public int hashCode() {
        InvoicePurchaserJson invoicePurchaserJson = this.f5373a;
        int iHashCode = (invoicePurchaserJson == null ? 0 : invoicePurchaserJson.hashCode()) * 31;
        InvoiceDeliveryInfoJson invoiceDeliveryInfoJson = this.f5374b;
        int iHashCode2 = (iHashCode + (invoiceDeliveryInfoJson == null ? 0 : invoiceDeliveryInfoJson.hashCode())) * 31;
        List list = this.f5375c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        InvoiceOrderJson invoiceOrderJson = this.f5376d;
        int iHashCode4 = (iHashCode3 + (invoiceOrderJson == null ? 0 : invoiceOrderJson.hashCode())) * 31;
        Boolean bool = this.f5377e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f5378f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f5379g;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceOrderContainerJson(purchaser=");
        sb.append(this.f5373a);
        sb.append(", deliveryInfo=");
        sb.append(this.f5374b);
        sb.append(", invoiceParams=");
        sb.append(this.f5375c);
        sb.append(", order=");
        sb.append(this.f5376d);
        sb.append(", isSubscription=");
        sb.append(this.f5377e);
        sb.append(", noSaveBindings=");
        sb.append(this.f5378f);
        sb.append(", partnerClientId=");
        return C8032c.m1430a(sb, this.f5379g, ')');
    }
}
