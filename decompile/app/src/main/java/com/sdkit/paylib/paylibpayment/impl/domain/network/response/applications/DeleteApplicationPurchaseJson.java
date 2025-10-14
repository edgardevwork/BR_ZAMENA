package com.sdkit.paylib.paylibpayment.impl.domain.network.response.applications;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.applications.DeleteApplicationPurchaseResponse;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson$$a;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
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
public final class DeleteApplicationPurchaseJson implements InterfaceC8572a {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final KSerializer[] f5169e = {null, null, null, new ArrayListSerializer(DigitalShopErrorJson$$a.f5138a)};

    /* renamed from: a */
    public final Integer f5170a;

    /* renamed from: b */
    public final String f5171b;

    /* renamed from: c */
    public final String f5172c;

    /* renamed from: d */
    public final List f5173d;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/DeleteApplicationPurchaseJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/applications/DeleteApplicationPurchaseJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<DeleteApplicationPurchaseJson> serializer() {
            return DeleteApplicationPurchaseJson$$a.f5174a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeleteApplicationPurchaseJson(int i, Integer num, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5170a = null;
        } else {
            this.f5170a = num;
        }
        if ((i & 2) == 0) {
            this.f5171b = null;
        } else {
            this.f5171b = str;
        }
        if ((i & 4) == 0) {
            this.f5172c = null;
        } else {
            this.f5172c = str2;
        }
        if ((i & 8) == 0) {
            this.f5173d = null;
        } else {
            this.f5173d = list;
        }
    }

    @Override // com.sdkit.paylib.paylibpayment.impl.domain.network.response.InterfaceC8572a
    /* renamed from: b */
    public DeleteApplicationPurchaseResponse mo4249a(RequestMeta meta) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(meta, "meta");
        Integer num = this.f5170a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.f5171b;
        String str2 = this.f5172c;
        List list = this.f5173d;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((DigitalShopErrorJson) it.next()).m4238a());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new DeleteApplicationPurchaseResponse(meta, iIntValue, str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteApplicationPurchaseJson)) {
            return false;
        }
        DeleteApplicationPurchaseJson deleteApplicationPurchaseJson = (DeleteApplicationPurchaseJson) obj;
        return Intrinsics.areEqual(this.f5170a, deleteApplicationPurchaseJson.f5170a) && Intrinsics.areEqual(this.f5171b, deleteApplicationPurchaseJson.f5171b) && Intrinsics.areEqual(this.f5172c, deleteApplicationPurchaseJson.f5172c) && Intrinsics.areEqual(this.f5173d, deleteApplicationPurchaseJson.f5173d);
    }

    public int hashCode() {
        Integer num = this.f5170a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5171b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5172c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f5173d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteApplicationPurchaseJson(code=");
        sb.append(this.f5170a);
        sb.append(", errorMessage=");
        sb.append(this.f5171b);
        sb.append(", errorDescription=");
        sb.append(this.f5172c);
        sb.append(", errors=");
        return C8045g.m1489a(sb, this.f5173d, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4264a(DeleteApplicationPurchaseJson deleteApplicationPurchaseJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5169e;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deleteApplicationPurchaseJson.f5170a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, deleteApplicationPurchaseJson.f5170a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || deleteApplicationPurchaseJson.f5171b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, deleteApplicationPurchaseJson.f5171b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || deleteApplicationPurchaseJson.f5172c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, deleteApplicationPurchaseJson.f5172c);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && deleteApplicationPurchaseJson.f5173d == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], deleteApplicationPurchaseJson.f5173d);
    }
}
