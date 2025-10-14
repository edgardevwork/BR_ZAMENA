package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class VerificationOperationsListJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final KSerializer[] f5121b = {new ArrayListSerializer(VerificationOperationJson$$a.f5119a)};

    /* renamed from: a */
    public final List f5122a;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/VerificationOperationsListJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/request/invoice/VerificationOperationsListJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<VerificationOperationsListJson> serializer() {
            return VerificationOperationsListJson$$a.f5123a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ VerificationOperationsListJson(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, VerificationOperationsListJson$$a.f5123a.getDescriptor());
        }
        this.f5122a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerificationOperationsListJson) && Intrinsics.areEqual(this.f5122a, ((VerificationOperationsListJson) obj).f5122a);
    }

    public int hashCode() {
        return this.f5122a.hashCode();
    }

    public String toString() {
        return C8045g.m1489a(new StringBuilder("VerificationOperationsListJson(operations="), this.f5122a, ')');
    }

    public VerificationOperationsListJson(List operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        this.f5122a = operations;
    }
}
