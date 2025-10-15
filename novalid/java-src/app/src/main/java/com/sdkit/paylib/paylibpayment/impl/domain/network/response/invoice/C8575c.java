package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderTaxSystem;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.c */
/* loaded from: classes6.dex */
public final class C8575c implements KSerializer {

    /* renamed from: a */
    public static final C8575c f5528a = new C8575c();

    /* renamed from: b */
    public static final SerialDescriptor f5529b = SerialDescriptorsKt.PrimitiveSerialDescriptor("InvoiceOrderTaxSystem", PrimitiveKind.INT.INSTANCE);

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceOrderTaxSystem deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iDecodeInt = decoder.decodeInt();
        return iDecodeInt != 0 ? iDecodeInt != 1 ? iDecodeInt != 2 ? iDecodeInt != 3 ? iDecodeInt != 4 ? iDecodeInt != 5 ? InvoiceOrderTaxSystem.UNDEFINED : InvoiceOrderTaxSystem.PATENT : InvoiceOrderTaxSystem.SINGLE_TAX_2 : InvoiceOrderTaxSystem.SINGLE_TAX_1 : InvoiceOrderTaxSystem.SIMPLIFIED_2 : InvoiceOrderTaxSystem.SIMPLIFIED_1 : InvoiceOrderTaxSystem.GENERAL;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5529b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceOrderTaxSystem invoiceOrderTaxSystem) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (invoiceOrderTaxSystem == null) {
            invoiceOrderTaxSystem = InvoiceOrderTaxSystem.UNDEFINED;
        }
        encoder.encodeInt(invoiceOrderTaxSystem.ordinal());
    }
}
