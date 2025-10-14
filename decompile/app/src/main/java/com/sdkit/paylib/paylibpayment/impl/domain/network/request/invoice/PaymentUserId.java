package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class PaymentUserId {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5113a;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/PaymentUserId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/PaymentUserId;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<PaymentUserId> serializer() {
            return PaymentUserId$$a.f5114a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentUserId(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PaymentUserId$$a.f5114a.getDescriptor());
        }
        this.f5113a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentUserId) && Intrinsics.areEqual(this.f5113a, ((PaymentUserId) obj).f5113a);
    }

    public int hashCode() {
        return this.f5113a.hashCode();
    }

    public String toString() {
        return C8032c.m1430a(new StringBuilder("PaymentUserId(userUid="), this.f5113a, ')');
    }

    public PaymentUserId(String userUid) {
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        this.f5113a = userUid;
    }
}
