package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

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
public final class InvoiceDeviceInfoJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoiceDeviceInfoJson$$a f5334a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5335b;

    static {
        InvoiceDeviceInfoJson$$a invoiceDeviceInfoJson$$a = new InvoiceDeviceInfoJson$$a();
        f5334a = invoiceDeviceInfoJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoiceDeviceInfoJson", invoiceDeviceInfoJson$$a, 8);
        pluginGeneratedSerialDescriptor.addElement("user_channel", true);
        pluginGeneratedSerialDescriptor.addElement("device_platform_type", true);
        pluginGeneratedSerialDescriptor.addElement("device_platform_version", true);
        pluginGeneratedSerialDescriptor.addElement("device_model", true);
        pluginGeneratedSerialDescriptor.addElement("device_manufacturer", true);
        pluginGeneratedSerialDescriptor.addElement("device_id", true);
        pluginGeneratedSerialDescriptor.addElement("surface", true);
        pluginGeneratedSerialDescriptor.addElement("surface_version", true);
        f5335b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public InvoiceDeviceInfoJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        int i;
        Object objDecodeNullableSerializableElement8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        Object objDecodeNullableSerializableElement9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, stringSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement10;
            i = 255;
        } else {
            boolean z = true;
            int i5 = 0;
            Object objDecodeNullableSerializableElement11 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement12 = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 0:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i5 |= 1;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                    case 1:
                        i5 |= 2;
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i2 = 7;
                        i3 = 6;
                    case 2:
                        objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement11);
                        i5 |= 4;
                    case 3:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i5 |= 8;
                    case 4:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i5 |= 16;
                    case 5:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i5 |= 32;
                    case 6:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i5 |= 64;
                    case 7:
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i5 |= 128;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement11;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement16;
            i = i5;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement9;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InvoiceDeviceInfoJson(i, (String) objDecodeNullableSerializableElement7, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement8, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5335b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a */
    public void serialize(Encoder encoder, InvoiceDeviceInfoJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InvoiceDeviceInfoJson.m4357a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
