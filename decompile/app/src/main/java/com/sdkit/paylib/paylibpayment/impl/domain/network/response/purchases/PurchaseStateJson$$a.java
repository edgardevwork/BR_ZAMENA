package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;

/* loaded from: classes5.dex */
public final class PurchaseStateJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final PurchaseStateJson$$a f5650a = new PurchaseStateJson$$a();

    /* renamed from: b */
    public static final /* synthetic */ EnumDescriptor f5651b;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson", 9);
        enumDescriptor.addElement("created", false);
        enumDescriptor.addElement("invoice_created", false);
        enumDescriptor.addElement("confirmed", false);
        enumDescriptor.addElement("paid", false);
        enumDescriptor.addElement("paused", false);
        enumDescriptor.addElement("cancelled", false);
        enumDescriptor.addElement("consumed", false);
        enumDescriptor.addElement("closed", false);
        enumDescriptor.addElement("terminated", false);
        f5651b = enumDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PurchaseStateJson deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return PurchaseStateJson.values()[decoder.decodeEnum(getDescriptor())];
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5651b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, PurchaseStateJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeEnum(getDescriptor(), value.ordinal());
    }
}
