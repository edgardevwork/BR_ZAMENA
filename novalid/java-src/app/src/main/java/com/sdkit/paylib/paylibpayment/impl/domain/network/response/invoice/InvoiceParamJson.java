package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes6.dex */
public final class InvoiceParamJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f5404a;

    /* renamed from: b */
    public final String f5405b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceParamJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoiceParamJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceParamJson> serializer() {
            return InvoiceParamJson$$a.f5406a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceParamJson(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InvoiceParamJson$$a.f5406a.getDescriptor());
        }
        this.f5404a = str;
        this.f5405b = str2;
    }

    /* renamed from: a */
    public InvoiceParam m4381a() {
        return new InvoiceParam(this.f5404a, this.f5405b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceParamJson)) {
            return false;
        }
        InvoiceParamJson invoiceParamJson = (InvoiceParamJson) obj;
        return Intrinsics.areEqual(this.f5404a, invoiceParamJson.f5404a) && Intrinsics.areEqual(this.f5405b, invoiceParamJson.f5405b);
    }

    public int hashCode() {
        return this.f5405b.hashCode() + (this.f5404a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceParamJson(key=");
        sb.append(this.f5404a);
        sb.append(", value=");
        return C8032c.m1430a(sb, this.f5405b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4380a(InvoiceParamJson invoiceParamJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, invoiceParamJson.f5404a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, invoiceParamJson.f5405b);
    }
}
