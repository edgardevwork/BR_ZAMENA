package com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards;

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

/* loaded from: classes8.dex */
public final class CardJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final CardJson$$a f5212a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f5213b;

    static {
        CardJson$$a cardJson$$a = new CardJson$$a();
        f5212a = cardJson$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.cards.CardJson", cardJson$$a, 15);
        pluginGeneratedSerialDescriptor.addElement("card_id", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("masked_pan", true);
        pluginGeneratedSerialDescriptor.addElement("expiry_date", true);
        pluginGeneratedSerialDescriptor.addElement("cardholder", true);
        pluginGeneratedSerialDescriptor.addElement("image", true);
        pluginGeneratedSerialDescriptor.addElement("payment_system", true);
        pluginGeneratedSerialDescriptor.addElement("payment_system_image", true);
        pluginGeneratedSerialDescriptor.addElement("paysys", true);
        pluginGeneratedSerialDescriptor.addElement("paysys_code", true);
        pluginGeneratedSerialDescriptor.addElement("paysys_image", true);
        pluginGeneratedSerialDescriptor.addElement("payment_way", true);
        pluginGeneratedSerialDescriptor.addElement("payment_way_code", true);
        pluginGeneratedSerialDescriptor.addElement("payment_way_logo", true);
        pluginGeneratedSerialDescriptor.addElement("bank_info", true);
        f5213b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CardJson deserialize(Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object obj;
        Object obj2;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object obj3;
        int i;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        Object objDecodeNullableSerializableElement10;
        Object objDecodeNullableSerializableElement11;
        Object objDecodeNullableSerializableElement12;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            Object objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, stringSerializer, null);
            Object objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
            Object objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, stringSerializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, stringSerializer, null);
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, stringSerializer, null);
            objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 9, stringSerializer, null);
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 10, stringSerializer, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 11, stringSerializer, null);
            obj = objDecodeNullableSerializableElement14;
            Object objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, stringSerializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, stringSerializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 14, CardBankInfoJson$$a.f5195a, null);
            i = 32767;
            obj2 = objDecodeNullableSerializableElement15;
            obj3 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement16;
        } else {
            int i6 = 14;
            boolean z = true;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            Object objDecodeNullableSerializableElement21 = null;
            objDecodeNullableSerializableElement = null;
            Object objDecodeNullableSerializableElement22 = null;
            Object objDecodeNullableSerializableElement23 = null;
            Object objDecodeNullableSerializableElement24 = null;
            Object objDecodeNullableSerializableElement25 = null;
            Object objDecodeNullableSerializableElement26 = null;
            Object objDecodeNullableSerializableElement27 = null;
            Object objDecodeNullableSerializableElement28 = null;
            Object objDecodeNullableSerializableElement29 = null;
            int i7 = 0;
            Object objDecodeNullableSerializableElement30 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        obj4 = objDecodeNullableSerializableElement30;
                        obj5 = objDecodeNullableSerializableElement17;
                        obj6 = objDecodeNullableSerializableElement28;
                        z = false;
                        objDecodeNullableSerializableElement17 = obj5;
                        objDecodeNullableSerializableElement30 = obj4;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                        objDecodeNullableSerializableElement28 = obj6;
                    case 0:
                        obj4 = objDecodeNullableSerializableElement30;
                        obj5 = objDecodeNullableSerializableElement17;
                        obj6 = objDecodeNullableSerializableElement28;
                        objDecodeNullableSerializableElement29 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, objDecodeNullableSerializableElement29);
                        i7 |= 1;
                        objDecodeNullableSerializableElement17 = obj5;
                        objDecodeNullableSerializableElement30 = obj4;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                        objDecodeNullableSerializableElement28 = obj6;
                    case 1:
                        i7 |= 2;
                        objDecodeNullableSerializableElement30 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement27 = objDecodeNullableSerializableElement27;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                        objDecodeNullableSerializableElement28 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, objDecodeNullableSerializableElement28);
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                    case 2:
                        obj7 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement27 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement27);
                        i7 |= 4;
                        objDecodeNullableSerializableElement17 = objDecodeNullableSerializableElement17;
                        objDecodeNullableSerializableElement30 = obj7;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 3:
                        obj7 = objDecodeNullableSerializableElement30;
                        objDecodeNullableSerializableElement26 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement26);
                        i7 |= 8;
                        objDecodeNullableSerializableElement30 = obj7;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 4:
                        objDecodeNullableSerializableElement25 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement25);
                        i7 |= 16;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 5:
                        objDecodeNullableSerializableElement24 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement24);
                        i7 |= 32;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 6:
                        objDecodeNullableSerializableElement23 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, StringSerializer.INSTANCE, objDecodeNullableSerializableElement23);
                        i7 |= 64;
                        i6 = 14;
                        i2 = 11;
                        i3 = 10;
                    case 7:
                        i7 |= 128;
                        objDecodeNullableSerializableElement22 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, StringSerializer.INSTANCE, objDecodeNullableSerializableElement22);
                        i6 = 14;
                        i2 = 11;
                    case 8:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i5, StringSerializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i7 |= 256;
                        i6 = 14;
                    case 9:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i4, StringSerializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i7 |= 512;
                        i6 = 14;
                    case 10:
                        objDecodeNullableSerializableElement21 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i3, StringSerializer.INSTANCE, objDecodeNullableSerializableElement21);
                        i7 |= 1024;
                        i6 = 14;
                    case 11:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i2, StringSerializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i7 |= 2048;
                        i6 = 14;
                    case 12:
                        objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 12, StringSerializer.INSTANCE, objDecodeNullableSerializableElement);
                        i7 |= 4096;
                        i6 = 14;
                    case 13:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 13, StringSerializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i7 |= 8192;
                        i6 = 14;
                    case 14:
                        objDecodeNullableSerializableElement30 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i6, CardBankInfoJson$$a.f5195a, objDecodeNullableSerializableElement30);
                        i7 |= 16384;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Object obj8 = objDecodeNullableSerializableElement17;
            obj = objDecodeNullableSerializableElement28;
            obj2 = objDecodeNullableSerializableElement27;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement22;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement30;
            obj3 = objDecodeNullableSerializableElement29;
            i = i7;
            objDecodeNullableSerializableElement4 = obj8;
            Object obj9 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement23;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement20;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement26;
            objDecodeNullableSerializableElement8 = obj9;
            Object obj10 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement24;
            objDecodeNullableSerializableElement10 = objDecodeNullableSerializableElement21;
            objDecodeNullableSerializableElement11 = objDecodeNullableSerializableElement25;
            objDecodeNullableSerializableElement12 = obj10;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new CardJson(i, (String) obj3, (String) obj, (String) obj2, (String) objDecodeNullableSerializableElement7, (String) objDecodeNullableSerializableElement11, (String) objDecodeNullableSerializableElement9, (String) objDecodeNullableSerializableElement5, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement8, (String) objDecodeNullableSerializableElement12, (String) objDecodeNullableSerializableElement10, (String) objDecodeNullableSerializableElement6, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement4, (CardBankInfoJson) objDecodeNullableSerializableElement3, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CardBankInfoJson$$a.f5195a)};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5213b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, CardJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        CardJson.m4286a(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
