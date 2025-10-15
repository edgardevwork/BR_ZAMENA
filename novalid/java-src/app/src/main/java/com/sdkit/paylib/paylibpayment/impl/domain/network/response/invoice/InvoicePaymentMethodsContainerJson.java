package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibdomain.impl.deeplink.C8045g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* loaded from: classes6.dex */
public final class InvoicePaymentMethodsContainerJson {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final KSerializer[] f5450b = {new ArrayListSerializer(InvoicePaymentMethodJson$$a.f5448a)};

    /* renamed from: a */
    public final List f5451a;

    @Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentMethodsContainerJson$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sdkit/paylib/paylibpayment/impl/domain/network/response/invoice/InvoicePaymentMethodsContainerJson;", "com-sdkit-assistant_paylib_payment"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InvoicePaymentMethodsContainerJson> serializer() {
            return InvoicePaymentMethodsContainerJson$$a.f5452a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InvoicePaymentMethodsContainerJson(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.f5451a = null;
        } else {
            this.f5451a = list;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4400a(InvoicePaymentMethodsContainerJson invoicePaymentMethodsContainerJson, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f5450b;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && invoicePaymentMethodsContainerJson.f5451a == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], invoicePaymentMethodsContainerJson.f5451a);
    }

    /* renamed from: b */
    public final List m4402b() {
        return this.f5451a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvoicePaymentMethodsContainerJson) && Intrinsics.areEqual(this.f5451a, ((InvoicePaymentMethodsContainerJson) obj).f5451a);
    }

    public int hashCode() {
        List list = this.f5451a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return C8045g.m1489a(new StringBuilder("InvoicePaymentMethodsContainerJson(methods="), this.f5451a, ')');
    }
}
