package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceOrderTaxSystem;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class InvoiceOrderJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final InvoiceOrderJson$$a f5402a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5403b;

    static {
        InvoiceOrderJson$$a invoiceOrderJson$$a = new InvoiceOrderJson$$a();
        f5402a = invoiceOrderJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoiceOrderJson", invoiceOrderJson$$a, 19);
        pluginGeneratedSerialDescriptor.addElement("order_id", false);
        pluginGeneratedSerialDescriptor.addElement("order_number", true);
        pluginGeneratedSerialDescriptor.addElement("purchase_id", true);
        pluginGeneratedSerialDescriptor.addElement("order_date", false);
        pluginGeneratedSerialDescriptor.addElement("service_id", false);
        pluginGeneratedSerialDescriptor.addElement("amount", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CURRENCY, false);
        pluginGeneratedSerialDescriptor.addElement("purpose", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("expiration_date", true);
        pluginGeneratedSerialDescriptor.addElement("autocompletion_date", true);
        pluginGeneratedSerialDescriptor.addElement("tax_system", true);
        pluginGeneratedSerialDescriptor.addElement("trade_name", true);
        pluginGeneratedSerialDescriptor.addElement("org_name", true);
        pluginGeneratedSerialDescriptor.addElement("org_inn", true);
        pluginGeneratedSerialDescriptor.addElement("visual_name", true);
        pluginGeneratedSerialDescriptor.addElement("visual_amount", true);
        pluginGeneratedSerialDescriptor.addElement("order_bundle", true);
        f5403b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceOrderJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        int i;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object obj;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        String str;
        String str2;
        String str3;
        long j;
        long j2;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object objDecodeNullableSerializableElement13;
        KSerializer[] kSerializerArr;
        Object obj2;
        Object objDecodeNullableSerializableElement14;
        Object objDecodeNullableSerializableElement15;
        Object objDecodeNullableSerializableElement16;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr2 = InvoiceOrderJson.f5382t;
        int i4 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor, 5);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 6);
            objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, stringSerializer, null);
            str = strDecodeStringElement;
            Object objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, C8575c.f5528a, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, stringSerializer, null);
            obj = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, stringSerializer, null);
            Object objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 15, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 16, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 17, stringSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 18, kSerializerArr2[18], null);
            str3 = strDecodeStringElement3;
            i = 524287;
            j2 = jDecodeLongElement2;
            str2 = strDecodeStringElement2;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement18;
            j = jDecodeLongElement;
        } else {
            int i5 = 18;
            boolean z = true;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            objDecodeNullableSerializableElement = null;
            objDecodeNullableSerializableElement2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            int i6 = 0;
            Object objDecodeNullableSerializableElement27 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        z = false;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                        objDecodeNullableSerializableElement16 = obj5;
                        i2 = 1;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        objDecodeNullableSerializableElement16 = obj5;
                        i2 = 2;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement16 = obj5;
                        i2 = 4;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        obj2 = objDecodeNullableSerializableElement19;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
                        i2 = 8;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor, 4);
                        obj2 = objDecodeNullableSerializableElement19;
                        i2 = 16;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor, 5);
                        obj2 = objDecodeNullableSerializableElement19;
                        i2 = 32;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        obj2 = objDecodeNullableSerializableElement19;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 6);
                        i2 = 64;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 7:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, obj5);
                        i2 = 128;
                        obj2 = objDecodeNullableSerializableElement19;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 8:
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, obj4);
                        i2 = 256;
                        objDecodeNullableSerializableElement14 = obj3;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement16 = obj5;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 9:
                        i2 = 512;
                        kSerializerArr = kSerializerArr2;
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, StringSerializer.INSTANCE, obj3);
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 10:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i2 = 1024;
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 11:
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i3 = 2048;
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i2 = i3;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 12:
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i3 = 4096;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, C8575c.f5528a, objDecodeNullableSerializableElement24);
                        i2 = i3;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 13:
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i3 = 8192;
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i2 = i3;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 14:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i2 = 16384;
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 15:
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i3 = 32768;
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 15, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i2 = i3;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 16:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 16, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i2 = 65536;
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 17:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 17, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i2 = 131072;
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    case 18:
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i5, kSerializerArr2[i5], objDecodeNullableSerializableElement27);
                        i2 = 262144;
                        kSerializerArr = kSerializerArr2;
                        obj2 = objDecodeNullableSerializableElement19;
                        objDecodeNullableSerializableElement14 = obj3;
                        objDecodeNullableSerializableElement15 = obj4;
                        objDecodeNullableSerializableElement16 = obj5;
                        i6 |= i2;
                        obj5 = objDecodeNullableSerializableElement16;
                        obj4 = objDecodeNullableSerializableElement15;
                        objDecodeNullableSerializableElement19 = obj2;
                        obj3 = objDecodeNullableSerializableElement14;
                        kSerializerArr2 = kSerializerArr;
                        i5 = 18;
                        i4 = 10;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj6 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement22;
            i = i6;
            objDecodeNullableSerializableElement6 = obj4;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement25;
            obj = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement8 = obj6;
            objDecodeNullableSerializableElement9 = obj3;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement12 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement13 = obj5;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InvoiceOrderJson(i, str, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement7, str2, j, j2, str3, (String) objDecodeNullableSerializableElement13, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement12, (InvoiceOrderTaxSystem) obj, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement5, (List) objDecodeNullableSerializableElement11, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = InvoiceOrderJson.f5382t;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(C8575c.f5528a);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable11 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable12 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable13 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable14 = BuiltinSerializersKt.getNullable(kSerializerArr[18]);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, nullable, nullable2, stringSerializer, longSerializer, longSerializer, stringSerializer, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, nullable11, nullable12, nullable13, nullable14};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5403b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceOrderJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InvoiceOrderJson.m4375a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
