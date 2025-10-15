package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibpayment.api.network.entity.subscriptions.SubscriptionsPayload;
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

/* loaded from: classes6.dex */
public final class SubscriptionsPayloadJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    public static final KSerializer[] f5717d = {new ArrayListSerializer(SubscriptionsPurchaseJson$$a.f5763a), null, null};

    /* renamed from: a */
    public final List f5718a;

    /* renamed from: b */
    public final Integer f5719b;

    /* renamed from: c */
    public final Integer f5720c;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPayloadJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsPayloadJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionsPayloadJson> serializer() {
            return SubscriptionsPayloadJson$$a.f5721a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionsPayloadJson(int i, List list, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5718a = null;
        } else {
            this.f5718a = list;
        }
        if ((i & 2) == 0) {
            this.f5719b = null;
        } else {
            this.f5719b = num;
        }
        if ((i & 4) == 0) {
            this.f5720c = null;
        } else {
            this.f5720c = num2;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4586a(SubscriptionsPayloadJson subscriptionsPayloadJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5717d;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subscriptionsPayloadJson.f5718a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], subscriptionsPayloadJson.f5718a);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subscriptionsPayloadJson.f5719b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, subscriptionsPayloadJson.f5719b);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && subscriptionsPayloadJson.f5720c == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, subscriptionsPayloadJson.f5720c);
    }

    /* renamed from: b */
    public SubscriptionsPayload m4588b() {
        ArrayList arrayList;
        List list = this.f5718a;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SubscriptionsPurchaseJson) it.next()).m4610a());
            }
        } else {
            arrayList = null;
        }
        return new SubscriptionsPayload(arrayList, this.f5719b, this.f5720c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionsPayloadJson)) {
            return false;
        }
        SubscriptionsPayloadJson subscriptionsPayloadJson = (SubscriptionsPayloadJson) obj;
        return Intrinsics.areEqual(this.f5718a, subscriptionsPayloadJson.f5718a) && Intrinsics.areEqual(this.f5719b, subscriptionsPayloadJson.f5719b) && Intrinsics.areEqual(this.f5720c, subscriptionsPayloadJson.f5720c);
    }

    public int hashCode() {
        List list = this.f5718a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f5719b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5720c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionsPayloadJson(purchases=" + this.f5718a + ", totalPages=" + this.f5719b + ", totalElements=" + this.f5720c + ')';
    }
}
