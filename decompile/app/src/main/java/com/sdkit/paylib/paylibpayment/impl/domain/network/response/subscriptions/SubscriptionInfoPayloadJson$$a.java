package com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.CardJson;
import com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.CardJson$$a;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class SubscriptionInfoPayloadJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final SubscriptionInfoPayloadJson$$a f5700a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5701b;

    static {
        SubscriptionInfoPayloadJson$$a subscriptionInfoPayloadJson$$a = new SubscriptionInfoPayloadJson$$a();
        f5700a = subscriptionInfoPayloadJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.subscriptions.SubscriptionInfoPayloadJson", subscriptionInfoPayloadJson$$a, 14);
        pluginGeneratedSerialDescriptor.addElement("purchase_id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("application_code", true);
        pluginGeneratedSerialDescriptor.addElement("application_name", true);
        pluginGeneratedSerialDescriptor.addElement("application_image", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("product_id", false);
        pluginGeneratedSerialDescriptor.addElement("visual_amount", true);
        pluginGeneratedSerialDescriptor.addElement("amount", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.addElement("purchase_state", true);
        pluginGeneratedSerialDescriptor.addElement("subscription", true);
        pluginGeneratedSerialDescriptor.addElement("payment_info", true);
        pluginGeneratedSerialDescriptor.addElement("product_info", true);
        f5701b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SubscriptionInfoPayloadJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Object obj;
        Object objDecodeNullableSerializableElement3;
        String str;
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        Object objDecodeNullableSerializableElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            Object objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            Object objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 6);
            Object objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            Object objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, stringSerializer, null);
            Object objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, stringSerializer, null);
            Object objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, PurchaseStateJson$$a.f5650a, null);
            Object objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, SubscriptionsPurchaseDetailsJson$$a.f5745a, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, CardJson$$a.f5212a, null);
            obj7 = objDecodeNullableSerializableElement11;
            strDecodeStringElement2 = strDecodeStringElement5;
            obj2 = objDecodeNullableSerializableElement7;
            strDecodeStringElement = strDecodeStringElement4;
            i = 16383;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement9;
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, SubscriptionsProductInfoJson$$a.f5736a, null);
            obj = objDecodeNullableSerializableElement8;
            obj3 = objDecodeNullableSerializableElement6;
            obj6 = objDecodeNullableSerializableElement12;
            str = strDecodeStringElement3;
            obj5 = objDecodeNullableSerializableElement10;
            obj4 = objDecodeNullableSerializableElement5;
        } else {
            int i6 = 13;
            int i7 = 0;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            objDecodeNullableSerializableElement2 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            String strDecodeStringElement6 = null;
            strDecodeStringElement = null;
            strDecodeStringElement2 = null;
            boolean z = true;
            Object objDecodeNullableSerializableElement20 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i6 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                        i7 |= 1;
                        i6 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 1:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i7 |= 2;
                        i6 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 2:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i7 |= 4;
                        i6 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 3:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i7 |= 8;
                        i6 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 4:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i7 |= 16;
                        i6 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i7 |= 32;
                        i6 = 13;
                        i2 = 11;
                        i3 = 10;
                    case 6:
                        c = 7;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 6);
                        i7 |= 64;
                        i6 = 13;
                    case 7:
                        c = 7;
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i7 |= 128;
                        i6 = 13;
                    case 8:
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement2);
                        i7 |= 256;
                        i6 = 13;
                    case 9:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i7 |= 512;
                        i6 = 13;
                    case 10:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, PurchaseStateJson$$a.f5650a, objDecodeNullableSerializableElement15);
                        i7 |= 1024;
                        i6 = 13;
                    case 11:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, SubscriptionsPurchaseDetailsJson$$a.f5745a, objDecodeNullableSerializableElement20);
                        i7 |= 2048;
                        i6 = 13;
                    case 12:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, CardJson$$a.f5212a, objDecodeNullableSerializableElement);
                        i7 |= 4096;
                        i6 = 13;
                    case 13:
                        objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i6, SubscriptionsProductInfoJson$$a.f5736a, objDecodeNullableSerializableElement4);
                        i7 |= 8192;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            obj = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement16;
            str = strDecodeStringElement6;
            int i8 = i7;
            obj2 = objDecodeNullableSerializableElement17;
            i = i8;
            obj3 = objDecodeNullableSerializableElement18;
            obj4 = objDecodeNullableSerializableElement19;
            Object obj8 = objDecodeNullableSerializableElement15;
            obj5 = objDecodeNullableSerializableElement14;
            obj6 = objDecodeNullableSerializableElement20;
            obj7 = obj8;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new SubscriptionInfoPayloadJson(i, str, strDecodeStringElement, (String) obj4, (String) obj3, (String) obj2, (String) objDecodeNullableSerializableElement3, strDecodeStringElement2, (String) obj, (String) objDecodeNullableSerializableElement2, (String) obj5, (PurchaseStateJson) obj7, (SubscriptionsPurchaseDetailsJson) obj6, (CardJson) objDecodeNullableSerializableElement, (SubscriptionsProductInfoJson) objDecodeNullableSerializableElement4, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(PurchaseStateJson$$a.f5650a), BuiltinSerializersKt.getNullable(SubscriptionsPurchaseDetailsJson$$a.f5745a), BuiltinSerializersKt.getNullable(CardJson$$a.f5212a), BuiltinSerializersKt.getNullable(SubscriptionsProductInfoJson$$a.f5736a)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5701b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, SubscriptionInfoPayloadJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        SubscriptionInfoPayloadJson.m4571a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
