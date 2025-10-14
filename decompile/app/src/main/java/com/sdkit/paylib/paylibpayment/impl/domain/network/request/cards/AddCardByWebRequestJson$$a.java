package com.sdkit.paylib.paylibpayment.impl.domain.network.request.cards;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final class AddCardByWebRequestJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final AddCardByWebRequestJson$$a f5086a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5087b;

    static {
        AddCardByWebRequestJson$$a addCardByWebRequestJson$$a = new AddCardByWebRequestJson$$a();
        f5086a = addCardByWebRequestJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.request.cards.AddCardByWebRequestJson", addCardByWebRequestJson$$a, 5);
        pluginGeneratedSerialDescriptor.addElement("device_info", false);
        pluginGeneratedSerialDescriptor.addElement("order_id", false);
        pluginGeneratedSerialDescriptor.addElement("code", true);
        pluginGeneratedSerialDescriptor.addElement("return_url", false);
        pluginGeneratedSerialDescriptor.addElement("fail_url", false);
        f5087b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AddCardByWebRequestJson deserialize(Decoder decoder) {
        int i;
        Object objDecodeSerializableElement;
        String str;
        String str2;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = AddCardByWebRequestJson.f5080f;
        Object objDecodeSerializableElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 4);
            i = 31;
            str2 = strDecodeStringElement4;
            str = strDecodeStringElement3;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], objDecodeSerializableElement2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 4);
                    i2 |= 16;
                }
            }
            i = i2;
            objDecodeSerializableElement = objDecodeSerializableElement2;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            strDecodeStringElement = strDecodeStringElement7;
            strDecodeStringElement2 = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new AddCardByWebRequestJson(i, (Map) objDecodeSerializableElement, str, str2, strDecodeStringElement, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{AddCardByWebRequestJson.f5080f[0], stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5087b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, AddCardByWebRequestJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        AddCardByWebRequestJson.m4202a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
