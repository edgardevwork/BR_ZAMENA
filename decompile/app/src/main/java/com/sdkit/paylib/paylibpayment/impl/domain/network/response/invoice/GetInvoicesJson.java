package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.invoice.GetInvoicesResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.ErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class GetInvoicesJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final KSerializer[] f5257e = {new ArrayListSerializer(InvoiceJson$$a.f5351a), null, null, null};

    /* renamed from: a */
    public final List f5258a;

    /* renamed from: b */
    public final Integer f5259b;

    /* renamed from: c */
    public final Integer f5260c;

    /* renamed from: d */
    public final ErrorJson f5261d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/GetInvoicesJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/GetInvoicesJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<GetInvoicesJson> serializer() {
            return GetInvoicesJson$$a.f5262a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GetInvoicesJson(int i, List list, Integer num, Integer num2, ErrorJson errorJson, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5258a = null;
        } else {
            this.f5258a = list;
        }
        if ((i & 2) == 0) {
            this.f5259b = null;
        } else {
            this.f5259b = num;
        }
        if ((i & 4) == 0) {
            this.f5260c = null;
        } else {
            this.f5260c = num2;
        }
        if ((i & 8) == 0) {
            this.f5261d = null;
        } else {
            this.f5261d = errorJson;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public GetInvoicesResponse mo4249a(RequestMeta meta) {
        ?? EmptyList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        List list = this.f5258a;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EmptyList.add(((InvoiceJson) it.next()).m4362a());
            }
        } else {
            EmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list2 = EmptyList;
        Integer num = this.f5259b;
        Integer num2 = this.f5260c;
        ErrorJson errorJson = this.f5261d;
        return new GetInvoicesResponse(meta, list2, num, num2, errorJson != null ? errorJson.m4242a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetInvoicesJson)) {
            return false;
        }
        GetInvoicesJson getInvoicesJson = (GetInvoicesJson) obj;
        return Intrinsics.areEqual(this.f5258a, getInvoicesJson.f5258a) && Intrinsics.areEqual(this.f5259b, getInvoicesJson.f5259b) && Intrinsics.areEqual(this.f5260c, getInvoicesJson.f5260c) && Intrinsics.areEqual(this.f5261d, getInvoicesJson.f5261d);
    }

    public int hashCode() {
        List list = this.f5258a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f5259b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5260c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ErrorJson errorJson = this.f5261d;
        return iHashCode3 + (errorJson != null ? errorJson.hashCode() : 0);
    }

    public String toString() {
        return "GetInvoicesJson(invoices=" + this.f5258a + ", totalElements=" + this.f5259b + ", totalPages=" + this.f5260c + ", error=" + this.f5261d + ')';
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4324a(GetInvoicesJson getInvoicesJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5257e;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || getInvoicesJson.f5258a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], getInvoicesJson.f5258a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || getInvoicesJson.f5259b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, getInvoicesJson.f5259b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || getInvoicesJson.f5260c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, getInvoicesJson.f5260c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && getInvoicesJson.f5261d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ErrorJson$$a.f5143a, getInvoicesJson.f5261d);
    }
}
