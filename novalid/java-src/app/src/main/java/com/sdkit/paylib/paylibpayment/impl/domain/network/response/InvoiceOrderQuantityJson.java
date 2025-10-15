package com.sdkit.paylib.paylibpayment.impl.domain.network.response;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderQuantity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes8.dex */
public final class InvoiceOrderQuantityJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final double f5145a;

    /* renamed from: b */
    public final String f5146b;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/InvoiceOrderQuantityJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/InvoiceOrderQuantityJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoiceOrderQuantityJson> serializer() {
            return InvoiceOrderQuantityJson$$a.f5147a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoiceOrderQuantityJson(int i, double d, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InvoiceOrderQuantityJson$$a.f5147a.getDescriptor());
        }
        this.f5145a = d;
        this.f5146b = str;
    }

    /* renamed from: a */
    public InvoiceOrderQuantity m4246a() {
        return new InvoiceOrderQuantity(this.f5145a, this.f5146b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvoiceOrderQuantityJson)) {
            return false;
        }
        InvoiceOrderQuantityJson invoiceOrderQuantityJson = (InvoiceOrderQuantityJson) obj;
        return Double.compare(this.f5145a, invoiceOrderQuantityJson.f5145a) == 0 && Intrinsics.areEqual(this.f5146b, invoiceOrderQuantityJson.f5146b);
    }

    public int hashCode() {
        return this.f5146b.hashCode() + (Double.hashCode(this.f5145a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InvoiceOrderQuantityJson(value=");
        sb.append(this.f5145a);
        sb.append(", unit=");
        return C8032c.m1430a(sb, this.f5146b, ')');
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4245a(InvoiceOrderQuantityJson invoiceOrderQuantityJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeDoubleElement(serialDescriptor, 0, invoiceOrderQuantityJson.f5145a);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, invoiceOrderQuantityJson.f5146b);
    }
}
