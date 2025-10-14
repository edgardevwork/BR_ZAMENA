package com.sdkit.paylib.paylibpayment.impl.domain.network.response;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class DigitalShopErrorJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final DigitalShopErrorJson$$a f5138a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5139b;

    static {
        DigitalShopErrorJson$$a digitalShopErrorJson$$a = new DigitalShopErrorJson$$a();
        f5138a = digitalShopErrorJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.DigitalShopErrorJson", digitalShopErrorJson$$a, 3);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        f5139b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DigitalShopErrorJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        int i;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Object objDecodeNullableSerializableElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, stringSerializer, null);
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement5;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, objDecodeNullableSerializableElement);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                    i2 |= 4;
                }
            }
            i = i2;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement4;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new DigitalShopErrorJson(i, (String) objDecodeNullableSerializableElement3, (Integer) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5139b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, DigitalShopErrorJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        DigitalShopErrorJson.m4237a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
