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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class InvoiceOrderContainerJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoiceOrderContainerJson$$a f5380a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5381b;

    static {
        InvoiceOrderContainerJson$$a invoiceOrderContainerJson$$a = new InvoiceOrderContainerJson$$a();
        f5380a = invoiceOrderContainerJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoiceOrderContainerJson", invoiceOrderContainerJson$$a, 7);
        pluginGeneratedSerialDescriptor.addElement("purchaser", true);
        pluginGeneratedSerialDescriptor.addElement("delivery_info", true);
        pluginGeneratedSerialDescriptor.addElement("invoice_params", true);
        pluginGeneratedSerialDescriptor.addElement("order", true);
        pluginGeneratedSerialDescriptor.addElement("is_subscription", true);
        pluginGeneratedSerialDescriptor.addElement("no_save_bindings", true);
        pluginGeneratedSerialDescriptor.addElement("partner_client_id", true);
        f5381b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceOrderContainerJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        int i;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = InvoiceOrderContainerJson.f5372h;
        int i2 = 6;
        int i3 = 5;
        Object objDecodeNullableSerializableElement8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, InvoicePurchaserJson$$a.f5475a, null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, InvoiceDeliveryInfoJson$$a.f5324a, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, kSerializerArr[2], null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InvoiceOrderJson$$a.f5402a, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, booleanSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, booleanSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement9;
            i = 127;
        } else {
            boolean z = true;
            int i4 = 0;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement10 = null;
            Object objDecodeNullableSerializableElement11 = null;
            Object objDecodeNullableSerializableElement12 = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 5;
                    case 0:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, InvoicePurchaserJson$$a.f5475a, objDecodeNullableSerializableElement14);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                    case 1:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, InvoiceDeliveryInfoJson$$a.f5324a, objDecodeNullableSerializableElement);
                        i4 |= 2;
                        i2 = 6;
                    case 2:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, kSerializerArr[2], objDecodeNullableSerializableElement13);
                        i4 |= 4;
                    case 3:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InvoiceOrderJson$$a.f5402a, objDecodeNullableSerializableElement12);
                        i4 |= 8;
                    case 4:
                        objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement11);
                        i4 |= 16;
                    case 5:
                        objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, BooleanSerializer.INSTANCE, objDecodeNullableSerializableElement10);
                        i4 |= 32;
                    case 6:
                        objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement8);
                        i4 |= 64;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement8;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement10;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement11;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement13;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InvoiceOrderContainerJson(i, (InvoicePurchaserJson) objDecodeNullableSerializableElement2, (InvoiceDeliveryInfoJson) objDecodeNullableSerializableElement, (List) objDecodeNullableSerializableElement7, (InvoiceOrderJson) objDecodeNullableSerializableElement6, (Boolean) objDecodeNullableSerializableElement5, (Boolean) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement3, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = InvoiceOrderContainerJson.f5372h;
        KSerializer nullable = BuiltinSerializersKt.getNullable(InvoicePurchaserJson$$a.f5475a);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(InvoiceDeliveryInfoJson$$a.f5324a);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(kSerializerArr[2]);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(InvoiceOrderJson$$a.f5402a);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5381b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceOrderContainerJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InvoiceOrderContainerJson.m4370a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
