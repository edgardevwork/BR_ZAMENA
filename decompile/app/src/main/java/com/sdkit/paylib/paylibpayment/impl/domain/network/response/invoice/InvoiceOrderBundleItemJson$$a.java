package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderTaxType;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InvoiceOrderQuantityJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.InvoiceOrderQuantityJson$$a;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class InvoiceOrderBundleItemJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoiceOrderBundleItemJson$$a f5370a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5371b;

    static {
        InvoiceOrderBundleItemJson$$a invoiceOrderBundleItemJson$$a = new InvoiceOrderBundleItemJson$$a();
        f5370a = invoiceOrderBundleItemJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoiceOrderBundleItemJson", invoiceOrderBundleItemJson$$a, 16);
        pluginGeneratedSerialDescriptor.addElement("position_id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("item_params", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.QUANTITY, true);
        pluginGeneratedSerialDescriptor.addElement("item_amount", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.addElement("item_code", true);
        pluginGeneratedSerialDescriptor.addElement("item_price", true);
        pluginGeneratedSerialDescriptor.addElement("discount_type", true);
        pluginGeneratedSerialDescriptor.addElement("discount_value", true);
        pluginGeneratedSerialDescriptor.addElement("interest_type", true);
        pluginGeneratedSerialDescriptor.addElement("interest_value", true);
        pluginGeneratedSerialDescriptor.addElement("tax_type", true);
        pluginGeneratedSerialDescriptor.addElement("tax_sum", true);
        pluginGeneratedSerialDescriptor.addElement("item_code_sp", true);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        f5371b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceOrderBundleItemJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        int i;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object obj;
        int i2;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        String str;
        Object obj2;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = InvoiceOrderBundleItemJson.f5353q;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, kSerializerArr[2], null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InvoiceOrderQuantityJson$$a.f5147a, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, intSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, stringSerializer, null);
            obj2 = objDecodeNullableSerializableElement13;
            DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, doubleSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, doubleSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, C8576d.f5530a, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, intSerializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, stringSerializer, null);
            obj = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 15, stringSerializer, null);
            str = strDecodeStringElement;
            i = 65535;
            i2 = iDecodeIntElement;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
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
            String strDecodeStringElement2 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            objDecodeNullableSerializableElement = null;
            int i3 = 0;
            while (z) {
                KSerializer[] kSerializerArr2 = kSerializerArr;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj3 = objDecodeNullableSerializableElement18;
                        obj4 = objDecodeNullableSerializableElement26;
                        obj5 = objDecodeNullableSerializableElement15;
                        z = false;
                        objDecodeNullableSerializableElement15 = obj5;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement26 = obj4;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 0:
                        obj6 = objDecodeNullableSerializableElement16;
                        obj3 = objDecodeNullableSerializableElement18;
                        obj4 = objDecodeNullableSerializableElement26;
                        obj5 = objDecodeNullableSerializableElement15;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 0);
                        i3 |= 1;
                        objDecodeNullableSerializableElement16 = obj6;
                        objDecodeNullableSerializableElement15 = obj5;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement26 = obj4;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 1:
                        obj6 = objDecodeNullableSerializableElement16;
                        obj3 = objDecodeNullableSerializableElement18;
                        obj4 = objDecodeNullableSerializableElement26;
                        obj5 = objDecodeNullableSerializableElement15;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i3 |= 2;
                        objDecodeNullableSerializableElement16 = obj6;
                        objDecodeNullableSerializableElement15 = obj5;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement26 = obj4;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 2:
                        obj6 = objDecodeNullableSerializableElement16;
                        Object obj7 = objDecodeNullableSerializableElement18;
                        obj4 = objDecodeNullableSerializableElement26;
                        obj5 = objDecodeNullableSerializableElement15;
                        obj3 = obj7;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, kSerializerArr2[2], objDecodeNullableSerializableElement27);
                        i3 |= 4;
                        objDecodeNullableSerializableElement16 = obj6;
                        objDecodeNullableSerializableElement15 = obj5;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement26 = obj4;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 3:
                        i3 |= 8;
                        objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                        objDecodeNullableSerializableElement15 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement26 = objDecodeNullableSerializableElement26;
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InvoiceOrderQuantityJson$$a.f5147a, objDecodeNullableSerializableElement18);
                        kSerializerArr = kSerializerArr2;
                    case 4:
                        obj3 = objDecodeNullableSerializableElement18;
                        obj4 = objDecodeNullableSerializableElement26;
                        obj5 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i3 |= 16;
                        objDecodeNullableSerializableElement15 = obj5;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement26 = obj4;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 5:
                        i3 |= 32;
                        objDecodeNullableSerializableElement15 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement18 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        kSerializerArr = kSerializerArr2;
                    case 6:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i3 |= 64;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 7:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i3 |= 128;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 8:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i3 |= 256;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 9:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, DoubleSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i3 |= 512;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 10:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i3 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 11:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, DoubleSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i3 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 12:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, C8576d.f5530a, objDecodeNullableSerializableElement15);
                        i3 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 13:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, IntSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i3 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 14:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i3 |= 16384;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    case 15:
                        obj3 = objDecodeNullableSerializableElement18;
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 15, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i3 |= 32768;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement18 = obj3;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj8 = objDecodeNullableSerializableElement18;
            Object obj9 = objDecodeNullableSerializableElement26;
            Object obj10 = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement17;
            i = i3;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement16;
            obj = obj10;
            i2 = iDecodeIntElement2;
            objDecodeNullableSerializableElement7 = obj8;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement23;
            str = strDecodeStringElement2;
            obj2 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement11 = obj9;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement24;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InvoiceOrderBundleItemJson(i, i2, str, (List) obj2, (InvoiceOrderQuantityJson) objDecodeNullableSerializableElement7, (Integer) objDecodeNullableSerializableElement12, (String) objDecodeNullableSerializableElement11, (String) objDecodeNullableSerializableElement10, (Integer) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement8, (Double) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement4, (Double) objDecodeNullableSerializableElement3, (InvoiceOrderTaxType) obj, (Integer) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement6, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = InvoiceOrderBundleItemJson.f5353q;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[2]);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(InvoiceOrderQuantityJson$$a.f5147a);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(doubleSerializer), BuiltinSerializersKt.getNullable(C8576d.f5530a), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5371b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceOrderBundleItemJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InvoiceOrderBundleItemJson.m4365a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
