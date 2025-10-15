package com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice;

import java.util.List;
import java.util.Map;
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
public final class PaymentRequestJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final PaymentRequestJson$$a f5111a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5112b;

    static {
        PaymentRequestJson$$a paymentRequestJson$$a = new PaymentRequestJson$$a();
        f5111a = paymentRequestJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.request.invoice.PaymentRequestJson", paymentRequestJson$$a, 7);
        pluginGeneratedSerialDescriptor.addElement("user_id", true);
        pluginGeneratedSerialDescriptor.addElement("device_info", false);
        pluginGeneratedSerialDescriptor.addElement("operations", false);
        pluginGeneratedSerialDescriptor.addElement("return_deeplink", true);
        pluginGeneratedSerialDescriptor.addElement("return_url", true);
        pluginGeneratedSerialDescriptor.addElement("success_url", true);
        pluginGeneratedSerialDescriptor.addElement("fail_url", true);
        f5112b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PaymentRequestJson deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        int i;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeSerializableElement2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = PaymentRequestJson.f5103h;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        Object objDecodeNullableSerializableElement6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, PaymentUserId$$a.f5114a, null);
            Object objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, kSerializerArr[2], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeSerializableElement = objDecodeSerializableElement3;
            i = 127;
        } else {
            boolean z = true;
            int i5 = 0;
            objDecodeSerializableElement = null;
            Object objDecodeNullableSerializableElement7 = null;
            Object objDecodeNullableSerializableElement8 = null;
            Object objDecodeNullableSerializableElement9 = null;
            Object objDecodeSerializableElement4 = null;
            Object objDecodeNullableSerializableElement10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 5;
                        i4 = 3;
                    case 0:
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, PaymentUserId$$a.f5114a, objDecodeNullableSerializableElement10);
                        i5 |= 1;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                    case 1:
                        objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], objDecodeSerializableElement);
                        i5 |= 2;
                        i2 = 6;
                    case 2:
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 2, kSerializerArr[2], objDecodeSerializableElement4);
                        i5 |= 4;
                    case 3:
                        objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement9);
                        i5 |= 8;
                    case 4:
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i5 |= 16;
                    case 5:
                        objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement7);
                        i5 |= 32;
                    case 6:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i5 |= 64;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement10;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement6;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement7;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement8;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement9;
            objDecodeSerializableElement2 = objDecodeSerializableElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new PaymentRequestJson(i, (PaymentUserId) objDecodeNullableSerializableElement, (Map) objDecodeSerializableElement, (List) objDecodeSerializableElement2, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = PaymentRequestJson.f5103h;
        KSerializer nullable = BuiltinSerializersKt.getNullable(PaymentUserId$$a.f5114a);
        KSerializer kSerializer = kSerializerArr[1];
        KSerializer kSerializer2 = kSerializerArr[2];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, kSerializer, kSerializer2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5112b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, PaymentRequestJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        PaymentRequestJson.m4215a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
