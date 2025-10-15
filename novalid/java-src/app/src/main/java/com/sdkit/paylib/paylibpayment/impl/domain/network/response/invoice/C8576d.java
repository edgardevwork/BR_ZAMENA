package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderTaxType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.d */
/* loaded from: classes6.dex */
public final class C8576d implements KSerializer {

    /* renamed from: a */
    public static final C8576d f5530a = new C8576d();

    /* renamed from: b */
    public static final SerialDescriptor f5531b = SerialDescriptorsKt.PrimitiveSerialDescriptor("InvoiceOrderTaxSystem", PrimitiveKind.INT.INSTANCE);

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceOrderTaxType deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        switch (decoder.decodeInt()) {
            case 0:
                return InvoiceOrderTaxType.WITHOUT_NDS;
            case 1:
                return InvoiceOrderTaxType.NSD_0;
            case 2:
                return InvoiceOrderTaxType.NDS_10;
            case 3:
                return InvoiceOrderTaxType.NDS_18;
            case 4:
                return InvoiceOrderTaxType.NDS_10_100;
            case 5:
                return InvoiceOrderTaxType.NDS_18_118;
            case 6:
                return InvoiceOrderTaxType.NDS_20;
            case 7:
                return InvoiceOrderTaxType.NDS_20_120;
            default:
                return InvoiceOrderTaxType.UNDEFINED;
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5531b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceOrderTaxType invoiceOrderTaxType) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (invoiceOrderTaxType == null) {
            invoiceOrderTaxType = InvoiceOrderTaxType.UNDEFINED;
        }
        encoder.encodeInt(invoiceOrderTaxType.ordinal());
    }
}
