package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import java.util.List;
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

/* loaded from: classes5.dex */
public final class InvoicePaymentMethodsContainerJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoicePaymentMethodsContainerJson$$a f5452a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5453b;

    static {
        InvoicePaymentMethodsContainerJson$$a invoicePaymentMethodsContainerJson$$a = new InvoicePaymentMethodsContainerJson$$a();
        f5452a = invoicePaymentMethodsContainerJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoicePaymentMethodsContainerJson", invoicePaymentMethodsContainerJson$$a, 1);
        pluginGeneratedSerialDescriptor.addElement("methods", true);
        f5453b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoicePaymentMethodsContainerJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = InvoicePaymentMethodsContainerJson.f5450b;
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, kSerializerArr[0], null);
        } else {
            boolean z = true;
            int i2 = 0;
            Object objDecodeNullableSerializableElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, kSerializerArr[0], objDecodeNullableSerializableElement2);
                    i2 = 1;
                }
            }
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InvoicePaymentMethodsContainerJson(i, (List) objDecodeNullableSerializableElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(InvoicePaymentMethodsContainerJson.f5450b[0])};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5453b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoicePaymentMethodsContainerJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InvoicePaymentMethodsContainerJson.m4400a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
