package com.sdkit.paylib.paylibpayment.impl.domain.network.response.products;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class ProductJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final ProductJson$$a f5554a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5555b;

    static {
        ProductJson$$a productJson$$a = new ProductJson$$a();
        f5554a = productJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.ProductJson", productJson$$a, 12);
        pluginGeneratedSerialDescriptor.addElement("product_id", true);
        pluginGeneratedSerialDescriptor.addElement("product_type", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("visual_price", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.addElement("language", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        pluginGeneratedSerialDescriptor.addElement("image_promo", true);
        pluginGeneratedSerialDescriptor.addElement("subscription", true);
        f5555b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProductJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        int i;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object obj;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 8;
        Object objDecodeNullableSerializableElement12 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, ProductTypeJson$$a.f5578a, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, ProductStatusJson$$a.f5560a, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, stringSerializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, ProductSubscriptionJson$$a.f5570a, null);
            i = 4095;
            obj = objDecodeNullableSerializableElement13;
        } else {
            int i7 = 11;
            boolean z = true;
            int i8 = 0;
            Object objDecodeNullableSerializableElement14 = null;
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
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        objDecodeNullableSerializableElement24 = objDecodeNullableSerializableElement24;
                        i6 = 8;
                    case 0:
                        i8 |= 1;
                        objDecodeNullableSerializableElement19 = objDecodeNullableSerializableElement19;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                    case 1:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, ProductTypeJson$$a.f5578a, objDecodeNullableSerializableElement23);
                        i8 |= 2;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 8;
                    case 2:
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, ProductStatusJson$$a.f5560a, objDecodeNullableSerializableElement22);
                        i8 |= 4;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 3:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i8 |= 8;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i8 |= 16;
                        i7 = 11;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        i8 |= 32;
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i7 = 11;
                        i2 = 10;
                    case 6:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i8 |= 64;
                    case 7:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i8 |= 128;
                    case 8:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i8 |= 256;
                    case 9:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i8 |= 512;
                    case 10:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i8 |= 1024;
                    case 11:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i7, ProductSubscriptionJson$$a.f5570a, objDecodeNullableSerializableElement12);
                        i8 |= 2048;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement19;
            i = i8;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement12;
            Object obj2 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement17;
            obj = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement11 = obj2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new ProductJson(i, (String) obj, (ProductTypeJson) objDecodeNullableSerializableElement3, (ProductStatusJson) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement7, (Integer) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement11, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement, (ProductSubscriptionJson) objDecodeNullableSerializableElement6, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ProductTypeJson$$a.f5578a), BuiltinSerializersKt.getNullable(ProductStatusJson$$a.f5560a), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ProductSubscriptionJson$$a.f5570a)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5555b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, ProductJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        ProductJson.m4484a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
