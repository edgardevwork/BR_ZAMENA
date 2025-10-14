package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.CreatedPurchaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class CreatePurchaseInfoJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5589a;

    /* renamed from: b */
    public final String f5590b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/CreatePurchaseInfoJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/purchases/CreatePurchaseInfoJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<CreatePurchaseInfoJson> serializer() {
            return CreatePurchaseInfoJson$$a.f5591a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreatePurchaseInfoJson(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CreatePurchaseInfoJson$$a.f5591a.getDescriptor());
        }
        this.f5589a = str;
        if ((i & 2) == 0) {
            this.f5590b = null;
        } else {
            this.f5590b = str2;
        }
    }

    /* renamed from: a */
    public CreatedPurchaseInfo m4512a() {
        String str = this.f5589a;
        String str2 = this.f5590b;
        if (str2 == null) {
            str2 = "";
        }
        return new CreatedPurchaseInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePurchaseInfoJson)) {
            return false;
        }
        CreatePurchaseInfoJson createPurchaseInfoJson = (CreatePurchaseInfoJson) obj;
        return Intrinsics.areEqual(this.f5589a, createPurchaseInfoJson.f5589a) && Intrinsics.areEqual(this.f5590b, createPurchaseInfoJson.f5590b);
    }

    public int hashCode() {
        int iHashCode = this.f5589a.hashCode() * 31;
        String str = this.f5590b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreatePurchaseInfoJson(purchaseId=");
        sb.append(this.f5589a);
        sb.append(", invoiceId=");
        return C8032c.m1430a(sb, this.f5590b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4511a(CreatePurchaseInfoJson createPurchaseInfoJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createPurchaseInfoJson.f5589a);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && createPurchaseInfoJson.f5590b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, createPurchaseInfoJson.f5590b);
    }
}
