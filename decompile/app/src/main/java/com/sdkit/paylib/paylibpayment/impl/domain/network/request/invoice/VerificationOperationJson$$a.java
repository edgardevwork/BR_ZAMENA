package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class VerificationOperationJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final VerificationOperationJson$$a f5119a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5120b;

    static {
        VerificationOperationJson$$a verificationOperationJson$$a = new VerificationOperationJson$$a();
        f5119a = verificationOperationJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.VerificationOperationJson", verificationOperationJson$$a, 3);
        pluginGeneratedSerialDescriptor.addElement("operation", false);
        pluginGeneratedSerialDescriptor.addElement("code", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        f5120b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VerificationOperationJson deserialize(Decoder decoder) {
        int i;
        Object objDecodeNullableSerializableElement;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Object objDecodeNullableSerializableElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, null);
            str = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                    i2 |= 4;
                }
            }
            i = i2;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new VerificationOperationJson(i, str, str2, (String) objDecodeNullableSerializableElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5120b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, VerificationOperationJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        VerificationOperationJson.m4222a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
