package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.purchases.PurchaseStateJson$$a;
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
public final class SubscriptionsPurchaseJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final SubscriptionsPurchaseJson$$a f5763a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5764b;

    static {
        SubscriptionsPurchaseJson$$a subscriptionsPurchaseJson$$a = new SubscriptionsPurchaseJson$$a();
        f5763a = subscriptionsPurchaseJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions.SubscriptionsPurchaseJson", subscriptionsPurchaseJson$$a, 16);
        pluginGeneratedSerialDescriptor.addElement("purchase_id", false);
        pluginGeneratedSerialDescriptor.addElement("application_code", false);
        pluginGeneratedSerialDescriptor.addElement("application_name", false);
        pluginGeneratedSerialDescriptor.addElement("application_image", false);
        pluginGeneratedSerialDescriptor.addElement("product_id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        pluginGeneratedSerialDescriptor.addElement("image_promo", true);
        pluginGeneratedSerialDescriptor.addElement("visual_amount", true);
        pluginGeneratedSerialDescriptor.addElement("amount", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.QUANTITY, true);
        pluginGeneratedSerialDescriptor.addElement("purchase_state", true);
        pluginGeneratedSerialDescriptor.addElement("subscription", true);
        pluginGeneratedSerialDescriptor.addElement("product_info", true);
        f5764b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SubscriptionsPurchaseJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        String str;
        Object objDecodeNullableSerializableElement12;
        String str2;
        String str3;
        int i;
        String str4;
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 5);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, PurchaseStateJson$$a.f5650a, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, SubscriptionsPurchaseDetailsJson$$a.f5745a, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 15, ProductInfoJson$$a.f5677a, null);
            str = strDecodeStringElement2;
            str2 = strDecodeStringElement4;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement13;
            str4 = strDecodeStringElement3;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement14;
            str3 = strDecodeStringElement;
            i = 65535;
        } else {
            boolean z = true;
            String strDecodeStringElement5 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement22 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement23 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i2 = 0;
            objDecodeNullableSerializableElement3 = null;
            while (true) {
                String str5 = strDecodeStringElement5;
                if (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            obj2 = objDecodeNullableSerializableElement15;
                            obj3 = objDecodeNullableSerializableElement16;
                            z = false;
                            objDecodeNullableSerializableElement16 = obj3;
                            objDecodeNullableSerializableElement15 = obj2;
                            strDecodeStringElement5 = str5;
                        case 0:
                            i2 |= 1;
                            objDecodeNullableSerializableElement16 = objDecodeNullableSerializableElement16;
                            strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                            objDecodeNullableSerializableElement15 = objDecodeNullableSerializableElement15;
                        case 1:
                            obj2 = objDecodeNullableSerializableElement15;
                            obj3 = objDecodeNullableSerializableElement16;
                            strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                            i2 |= 2;
                            objDecodeNullableSerializableElement16 = obj3;
                            objDecodeNullableSerializableElement15 = obj2;
                            strDecodeStringElement5 = str5;
                        case 2:
                            obj2 = objDecodeNullableSerializableElement15;
                            i2 |= 4;
                            objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                            objDecodeNullableSerializableElement15 = obj2;
                            strDecodeStringElement5 = str5;
                        case 3:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement15);
                            i2 |= 8;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 4:
                            obj = objDecodeNullableSerializableElement16;
                            strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 4);
                            i2 |= 16;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 5:
                            obj = objDecodeNullableSerializableElement16;
                            strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 5);
                            i2 |= 32;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 6:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                            i2 |= 64;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 7:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                            i2 |= 128;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 8:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                            i2 |= 256;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 9:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                            i2 |= 512;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 10:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                            i2 |= 1024;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 11:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, StringSerializer.INSTANCE, objDecodeNullableSerializableElement3);
                            i2 |= 2048;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 12:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                            i2 |= 4096;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 13:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, PurchaseStateJson$$a.f5650a, objDecodeNullableSerializableElement19);
                            i2 |= 8192;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 14:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, SubscriptionsPurchaseDetailsJson$$a.f5745a, objDecodeNullableSerializableElement18);
                            i2 |= 16384;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        case 15:
                            obj = objDecodeNullableSerializableElement16;
                            objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 15, ProductInfoJson$$a.f5677a, objDecodeNullableSerializableElement17);
                            i2 |= 32768;
                            strDecodeStringElement5 = str5;
                            objDecodeNullableSerializableElement16 = obj;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    Object obj4 = objDecodeNullableSerializableElement15;
                    objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement16;
                    objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement17;
                    objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement18;
                    objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement19;
                    objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement20;
                    objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement21;
                    objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement22;
                    objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement23;
                    str = strDecodeStringElement6;
                    objDecodeNullableSerializableElement12 = obj4;
                    str2 = strDecodeStringElement8;
                    str3 = str5;
                    i = i2;
                    str4 = strDecodeStringElement7;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new SubscriptionsPurchaseJson(i, str3, str, (String) objDecodeNullableSerializableElement4, (String) objDecodeNullableSerializableElement12, str4, str2, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement11, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement3, (Integer) objDecodeNullableSerializableElement2, (PurchaseStateJson) objDecodeNullableSerializableElement7, (SubscriptionsPurchaseDetailsJson) objDecodeNullableSerializableElement6, (ProductInfoJson) objDecodeNullableSerializableElement5, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(PurchaseStateJson$$a.f5650a), BuiltinSerializersKt.getNullable(SubscriptionsPurchaseDetailsJson$$a.f5745a), BuiltinSerializersKt.getNullable(ProductInfoJson$$a.f5677a)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5764b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, SubscriptionsPurchaseJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        SubscriptionsPurchaseJson.m4609a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
