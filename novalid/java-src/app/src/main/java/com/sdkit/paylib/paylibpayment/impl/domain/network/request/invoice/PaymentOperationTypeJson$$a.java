package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;

/* loaded from: classes8.dex */
public final class PaymentOperationTypeJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final PaymentOperationTypeJson$$a f5100a = new PaymentOperationTypeJson$$a();

    /* renamed from: b */
    public static final /* synthetic */ EnumDescriptor f5101b;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.PaymentOperationTypeJson", 5);
        enumDescriptor.addElement("binding", false);
        enumDescriptor.addElement("payment", false);
        enumDescriptor.addElement("prepare_payment", false);
        enumDescriptor.addElement("payment_loyalty_points", false);
        enumDescriptor.addElement("recurrent_loyalty_points", false);
        f5101b = enumDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaymentOperationTypeJson deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return PaymentOperationTypeJson.values()[decoder.decodeEnum(getDescriptor())];
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5101b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, PaymentOperationTypeJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeEnum(getDescriptor(), value.ordinal());
    }
}
