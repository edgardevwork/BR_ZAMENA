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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class InvoiceAppliedLoyaltyJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoiceAppliedLoyaltyJson$$a f5275a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5276b;

    static {
        InvoiceAppliedLoyaltyJson$$a invoiceAppliedLoyaltyJson$$a = new InvoiceAppliedLoyaltyJson$$a();
        f5275a = invoiceAppliedLoyaltyJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoiceAppliedLoyaltyJson", invoiceAppliedLoyaltyJson$$a, 6);
        pluginGeneratedSerialDescriptor.addElement("service_code", false);
        pluginGeneratedSerialDescriptor.addElement("service_name", false);
        pluginGeneratedSerialDescriptor.addElement("change_rate", false);
        pluginGeneratedSerialDescriptor.addElement("payment_bonus", true);
        pluginGeneratedSerialDescriptor.addElement("award_bonus", true);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        f5276b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public InvoiceAppliedLoyaltyJson deserialize(Decoder decoder) {
        int i;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        String str;
        String str2;
        double d;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Object objDecodeNullableSerializableElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 2);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, intSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, intSerializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, null);
            str = strDecodeStringElement;
            i = 63;
            str2 = strDecodeStringElement2;
            d = dDecodeDoubleElement;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            double dDecodeDoubleElement2 = 0.0d;
            Object objDecodeNullableSerializableElement5 = null;
            Object objDecodeNullableSerializableElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, objDecodeNullableSerializableElement6);
                        i2 |= 8;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, objDecodeNullableSerializableElement5);
                        i2 |= 16;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement4);
                        i2 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement4;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement5;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement6;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            d = dDecodeDoubleElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InvoiceAppliedLoyaltyJson(i, str, str2, d, (Integer) objDecodeNullableSerializableElement3, (Integer) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, DoubleSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5276b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a */
    public void serialize(Encoder encoder, InvoiceAppliedLoyaltyJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InvoiceAppliedLoyaltyJson.m4333a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
