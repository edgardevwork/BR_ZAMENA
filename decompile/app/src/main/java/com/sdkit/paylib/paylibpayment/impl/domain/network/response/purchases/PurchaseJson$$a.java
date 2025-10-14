package com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.ProductTypeJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.ProductTypeJson$$a;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class PurchaseJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final PurchaseJson$$a f5637a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5638b;

    static {
        PurchaseJson$$a purchaseJson$$a = new PurchaseJson$$a();
        f5637a = purchaseJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseJson", purchaseJson$$a, 13);
        pluginGeneratedSerialDescriptor.addElement("purchase_id", true);
        pluginGeneratedSerialDescriptor.addElement("product_id", true);
        pluginGeneratedSerialDescriptor.addElement("product_type", true);
        pluginGeneratedSerialDescriptor.addElement("invoice_id", true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("purchase_time", true);
        pluginGeneratedSerialDescriptor.addElement("order_id", true);
        pluginGeneratedSerialDescriptor.addElement("visual_amount", true);
        pluginGeneratedSerialDescriptor.addElement("amount", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.QUANTITY, true);
        pluginGeneratedSerialDescriptor.addElement("purchase_state", true);
        pluginGeneratedSerialDescriptor.addElement("developer_payload", true);
        f5638b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PurchaseJson deserialize(Decoder decoder) {
        Object obj;
        int i;
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object obj2;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object obj3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        Object objDecodeNullableSerializableElement13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, stringSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, ProductTypeJson$$a.f5578a, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, intSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, intSerializer, null);
            obj2 = objDecodeNullableSerializableElement14;
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, PurchaseStateJson$$a.f5650a, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, stringSerializer, null);
            i = 8191;
            obj = objDecodeNullableSerializableElement15;
        } else {
            int i6 = 12;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object obj4 = null;
            boolean z = true;
            int i7 = 0;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        objDecodeNullableSerializableElement12 = obj4;
                        obj3 = objDecodeNullableSerializableElement13;
                        z = false;
                        objDecodeNullableSerializableElement13 = obj3;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        obj4 = objDecodeNullableSerializableElement12;
                        i6 = 12;
                    case 0:
                        Object obj5 = obj4;
                        obj3 = objDecodeNullableSerializableElement13;
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, obj5);
                        i7 |= 1;
                        objDecodeNullableSerializableElement13 = obj3;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        obj4 = objDecodeNullableSerializableElement12;
                        i6 = 12;
                    case 1:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i7 |= 2;
                        objDecodeNullableSerializableElement20 = objDecodeNullableSerializableElement20;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 2:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, ProductTypeJson$$a.f5578a, objDecodeNullableSerializableElement23);
                        i7 |= 4;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                    case 3:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i7 |= 8;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i7 |= 16;
                        i6 = 12;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        i7 |= 32;
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i6 = 12;
                        i2 = 10;
                    case 6:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i7 |= 64;
                        i6 = 12;
                    case 7:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i7 |= 128;
                        i6 = 12;
                    case 8:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i5, IntSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i7 |= 256;
                        i6 = 12;
                    case 9:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i7 |= 512;
                        i6 = 12;
                    case 10:
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, IntSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i7 |= 1024;
                        i6 = 12;
                    case 11:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, PurchaseStateJson$$a.f5650a, objDecodeNullableSerializableElement16);
                        i7 |= 2048;
                        i6 = 12;
                    case 12:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i7 |= 4096;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj6 = obj4;
            Object obj7 = objDecodeNullableSerializableElement13;
            obj = objDecodeNullableSerializableElement16;
            i = i7;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement21;
            obj2 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement6 = obj6;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement9 = obj7;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement19;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new PurchaseJson(i, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement10, (ProductTypeJson) obj2, (String) objDecodeNullableSerializableElement7, (String) objDecodeNullableSerializableElement3, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement4, (Integer) objDecodeNullableSerializableElement11, (String) objDecodeNullableSerializableElement8, (Integer) objDecodeNullableSerializableElement5, (PurchaseStateJson) obj, (String) objDecodeNullableSerializableElement9, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(ProductTypeJson$$a.f5578a);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(PurchaseStateJson$$a.f5650a), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5638b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, PurchaseJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        PurchaseJson.m4535a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
