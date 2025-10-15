package com.sdkit.paylib.paylibdomain.impl.sbp.entity;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final class KnownSbpPackages$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final KnownSbpPackages$$a f1477a;

    /* renamed from: b */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f1478b;

    static {
        KnownSbpPackages$$a knownSbpPackages$$a = new KnownSbpPackages$$a();
        f1477a = knownSbpPackages$$a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sdkit.paylib.paylibdomain.impl.sbp.entity.KnownSbpPackages", knownSbpPackages$$a, 1);
        pluginGeneratedSerialDescriptor.addElement("packages", false);
        f1478b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public KnownSbpPackages deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = KnownSbpPackages.f1475b;
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
        } else {
            boolean z = true;
            int i2 = 0;
            Object objDecodeSerializableElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], objDecodeSerializableElement2);
                    i2 = 1;
                }
            }
            objDecodeSerializableElement = objDecodeSerializableElement2;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new KnownSbpPackages(i, (List) objDecodeSerializableElement, null);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[]{KnownSbpPackages.f1475b[0]};
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f1478b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, KnownSbpPackages value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(descriptor, 0, KnownSbpPackages.f1475b[0], value.f1476a);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
