package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class SubscriptionsProductInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5734a;

    /* renamed from: b */
    public final String f5735b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsProductInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/subscriptions/SubscriptionsProductInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<SubscriptionsProductInfoJson> serializer() {
            return SubscriptionsProductInfoJson$$a.f5736a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SubscriptionsProductInfoJson(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5734a = null;
        } else {
            this.f5734a = str;
        }
        if ((i & 2) == 0) {
            this.f5735b = null;
        } else {
            this.f5735b = str2;
        }
    }

    /* renamed from: a */
    public final String m4599a() {
        return this.f5734a;
    }

    /* renamed from: b */
    public final String m4600b() {
        return this.f5735b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionsProductInfoJson)) {
            return false;
        }
        SubscriptionsProductInfoJson subscriptionsProductInfoJson = (SubscriptionsProductInfoJson) obj;
        return Intrinsics.areEqual(this.f5734a, subscriptionsProductInfoJson.f5734a) && Intrinsics.areEqual(this.f5735b, subscriptionsProductInfoJson.f5735b);
    }

    public int hashCode() {
        String str = this.f5734a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5735b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionsProductInfoJson(image=");
        sb.append(this.f5734a);
        sb.append(", imagePromo=");
        return C8032c.m1430a(sb, this.f5735b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4598a(SubscriptionsProductInfoJson subscriptionsProductInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subscriptionsProductInfoJson.f5734a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subscriptionsProductInfoJson.f5734a);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && subscriptionsProductInfoJson.f5735b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subscriptionsProductInfoJson.f5735b);
    }
}
