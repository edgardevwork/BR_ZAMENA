package com.sdkit.paylib.paylibpayment.impl.domain.network.request.purchases;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class ConfirmPurchaseRequestJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5126a;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/purchases/ConfirmPurchaseRequestJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/purchases/ConfirmPurchaseRequestJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<ConfirmPurchaseRequestJson> serializer() {
            return ConfirmPurchaseRequestJson$$a.f5127a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConfirmPurchaseRequestJson(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ConfirmPurchaseRequestJson$$a.f5127a.getDescriptor());
        }
        this.f5126a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmPurchaseRequestJson) && Intrinsics.areEqual(this.f5126a, ((ConfirmPurchaseRequestJson) obj).f5126a);
    }

    public int hashCode() {
        String str = this.f5126a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return C8032c.m1430a(new StringBuilder("ConfirmPurchaseRequestJson(developerPayload="), this.f5126a, ')');
    }

    public ConfirmPurchaseRequestJson(String str) {
        this.f5126a = str;
    }
}
