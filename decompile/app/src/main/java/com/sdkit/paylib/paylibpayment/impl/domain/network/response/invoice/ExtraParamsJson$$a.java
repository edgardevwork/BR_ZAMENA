package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final class ExtraParamsJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final ExtraParamsJson$$a f5238a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5239b;

    static {
        ExtraParamsJson$$a extraParamsJson$$a = new ExtraParamsJson$$a();
        f5238a = extraParamsJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.ExtraParamsJson", extraParamsJson$$a, 8);
        pluginGeneratedSerialDescriptor.addElement("sms_send_max_tries", false);
        pluginGeneratedSerialDescriptor.addElement("code_tries", false);
        pluginGeneratedSerialDescriptor.addElement("sms_send_again_interval", false);
        pluginGeneratedSerialDescriptor.addElement("sms_code_length", false);
        pluginGeneratedSerialDescriptor.addElement("verify_code_time", false);
        pluginGeneratedSerialDescriptor.addElement("sms_code_ttl", false);
        pluginGeneratedSerialDescriptor.addElement("sms_check_code_max_tries", false);
        pluginGeneratedSerialDescriptor.addElement("sms_tries", false);
        f5239b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ExtraParamsJson deserialize(Decoder decoder) {
        int i;
        int iDecodeIntElement;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 2);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor, 4);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 5);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 6);
            i = iDecodeIntElement2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 7);
            i2 = iDecodeIntElement7;
            i3 = iDecodeIntElement6;
            i4 = iDecodeIntElement5;
            i5 = 255;
            i6 = iDecodeIntElement4;
            i7 = iDecodeIntElement3;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int i8 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement13 = 0;
            int iDecodeIntElement14 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                        i8 |= 1;
                        continue;
                    case 1:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 1);
                        i8 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 2);
                        i8 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 3);
                        i8 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 5);
                        i8 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 6);
                        i8 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 7);
                        i8 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement8;
            iDecodeIntElement = iDecodeIntElement13;
            i2 = iDecodeIntElement14;
            i3 = iDecodeIntElement9;
            i4 = iDecodeIntElement10;
            i5 = i8;
            i6 = iDecodeIntElement11;
            i7 = iDecodeIntElement12;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new ExtraParamsJson(i5, i, i7, i6, i4, j, i3, i2, iDecodeIntElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, intSerializer, LongSerializer.INSTANCE, intSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5239b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, ExtraParamsJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        ExtraParamsJson.m4308a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
