package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;

/* loaded from: classes5.dex */
public final class InvoiceStatusJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoiceStatusJson$$a f5498a = new InvoiceStatusJson$$a();

    /* renamed from: b */
    public static final /* synthetic */ EnumDescriptor f5499b;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoiceStatusJson", 8);
        enumDescriptor.addElement("created", false);
        enumDescriptor.addElement("executed", false);
        enumDescriptor.addElement("cancelled", false);
        enumDescriptor.addElement("paid", false);
        enumDescriptor.addElement("confirmed", false);
        enumDescriptor.addElement("reversed", false);
        enumDescriptor.addElement("refunded", false);
        enumDescriptor.addElement("wait", false);
        f5499b = enumDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceStatusJson deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return InvoiceStatusJson.values()[decoder.decodeEnum(getDescriptor())];
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5499b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceStatusJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeEnum(getDescriptor(), value.ordinal());
    }
}
