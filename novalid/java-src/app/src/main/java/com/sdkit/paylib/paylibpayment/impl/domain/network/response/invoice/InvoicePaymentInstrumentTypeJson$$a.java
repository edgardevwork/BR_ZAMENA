package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;

/* loaded from: classes5.dex */
public final class InvoicePaymentInstrumentTypeJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoicePaymentInstrumentTypeJson$$a f5441a = new InvoicePaymentInstrumentTypeJson$$a();

    /* renamed from: b */
    public static final /* synthetic */ EnumDescriptor f5442b;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoicePaymentInstrumentTypeJson", 6);
        enumDescriptor.addElement("card", false);
        enumDescriptor.addElement("mobile_b", false);
        enumDescriptor.addElement("new", false);
        enumDescriptor.addElement("tnk-pay", false);
        enumDescriptor.addElement("app2sbol", false);
        enumDescriptor.addElement("dmr_sbp", false);
        f5442b = enumDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoicePaymentInstrumentTypeJson deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return InvoicePaymentInstrumentTypeJson.values()[decoder.decodeEnum(getDescriptor())];
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5442b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoicePaymentInstrumentTypeJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeEnum(getDescriptor(), value.ordinal());
    }
}
