package com.sdkit.paylib.paylibpayment.impl.domain.network.response.products;

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

/* loaded from: classes5.dex */
public final class ProductSubscriptionJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final ProductSubscriptionJson$$a f5570a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5571b;

    static {
        ProductSubscriptionJson$$a productSubscriptionJson$$a = new ProductSubscriptionJson$$a();
        f5570a = productSubscriptionJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.ProductSubscriptionJson", productSubscriptionJson$$a, 6);
        pluginGeneratedSerialDescriptor.addElement("subscription_period", true);
        pluginGeneratedSerialDescriptor.addElement("free_trial_period", true);
        pluginGeneratedSerialDescriptor.addElement("grace_period", true);
        pluginGeneratedSerialDescriptor.addElement("introductory_price", true);
        pluginGeneratedSerialDescriptor.addElement("introductory_price_amount", true);
        pluginGeneratedSerialDescriptor.addElement("introductory_price_period", true);
        f5571b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProductSubscriptionJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        int i;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i2 = 5;
        Object objDecodeNullableSerializableElement7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement8;
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            Object objDecodeNullableSerializableElement9 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement10 = null;
            Object objDecodeNullableSerializableElement11 = null;
            Object objDecodeNullableSerializableElement12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement11);
                        i3 |= 2;
                    case 2:
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                        i3 |= 4;
                    case 3:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i3 |= 8;
                    case 4:
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i3 |= 16;
                    case 5:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement10;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement11;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement12;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new ProductSubscriptionJson(i, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5571b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, ProductSubscriptionJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        ProductSubscriptionJson.m4495a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
