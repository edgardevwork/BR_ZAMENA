package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.google.firebase.analytics.FirebaseAnalytics;
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
public final class InvoiceJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoiceJson$$a f5351a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5352b;

    static {
        InvoiceJson$$a invoiceJson$$a = new InvoiceJson$$a();
        f5351a = invoiceJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoiceJson", invoiceJson$$a, 15);
        pluginGeneratedSerialDescriptor.addElement("invoice_id", false);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        pluginGeneratedSerialDescriptor.addElement("invoice_date", true);
        pluginGeneratedSerialDescriptor.addElement("invoice_status", true);
        pluginGeneratedSerialDescriptor.addElement("order_number", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("org_name", true);
        pluginGeneratedSerialDescriptor.addElement("org_inn", true);
        pluginGeneratedSerialDescriptor.addElement("trademarks", true);
        pluginGeneratedSerialDescriptor.addElement("trade_name", true);
        pluginGeneratedSerialDescriptor.addElement("visual_name", true);
        pluginGeneratedSerialDescriptor.addElement("visual_amount", true);
        pluginGeneratedSerialDescriptor.addElement("payment_info", true);
        f5352b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceJson deserialize(Decoder decoder) {
        Object obj;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        String str;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object objDecodeNullableSerializableElement13;
        int i;
        Object obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InvoiceStatusJson$$a.f5498a, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, stringSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, stringSerializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, stringSerializer, null);
            obj = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, InvoicePaymentInfoJson$$a.f5431a, null);
            i = 32767;
            str = strDecodeStringElement;
        } else {
            int i5 = 14;
            boolean z = true;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            String strDecodeStringElement2 = null;
            int i6 = 0;
            Object objDecodeNullableSerializableElement28 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj2 = objDecodeNullableSerializableElement15;
                        z = false;
                        objDecodeNullableSerializableElement15 = obj2;
                        i5 = 14;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 0:
                        obj2 = objDecodeNullableSerializableElement15;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                        i6 |= 1;
                        objDecodeNullableSerializableElement15 = obj2;
                        i5 = 14;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 1:
                        obj2 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i6 |= 2;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement15 = obj2;
                        i5 = 14;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        obj2 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i6 |= 4;
                        objDecodeNullableSerializableElement22 = objDecodeNullableSerializableElement22;
                        objDecodeNullableSerializableElement15 = obj2;
                        i5 = 14;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 3:
                        obj2 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InvoiceStatusJson$$a.f5498a, objDecodeNullableSerializableElement25);
                        i6 |= 8;
                        objDecodeNullableSerializableElement15 = obj2;
                        i5 = 14;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 4:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i6 |= 16;
                        i5 = 14;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 5:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i6 |= 32;
                        i5 = 14;
                        i2 = 10;
                        i3 = 9;
                    case 6:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i6 |= 64;
                        i5 = 14;
                        i2 = 10;
                    case 7:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i6 |= 128;
                        i5 = 14;
                    case 8:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i6 |= 256;
                        i5 = 14;
                    case 9:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i6 |= 512;
                        i5 = 14;
                    case 10:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i6 |= 1024;
                        i5 = 14;
                    case 11:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i6 |= 2048;
                        i5 = 14;
                    case 12:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i6 |= 4096;
                        i5 = 14;
                    case 13:
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        i6 |= 8192;
                        i5 = 14;
                    case 14:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i5, InvoicePaymentInfoJson$$a.f5431a, objDecodeNullableSerializableElement16);
                        i6 |= 16384;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj3 = objDecodeNullableSerializableElement15;
            obj = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement28;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement6 = obj3;
            str = strDecodeStringElement2;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement13 = objDecodeNullableSerializableElement26;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InvoiceJson(i, str, (String) obj, (String) objDecodeNullableSerializableElement13, (InvoiceStatusJson) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement7, (String) objDecodeNullableSerializableElement11, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement12, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement, (InvoicePaymentInfoJson) objDecodeNullableSerializableElement2, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(InvoiceStatusJson$$a.f5498a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(InvoicePaymentInfoJson$$a.f5431a)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5352b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InvoiceJson.m4361a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
