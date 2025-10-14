package com.sdkit.paylib.paylibpayment.impl.domain.network.response.products;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.GeneratedSerializer;

/* loaded from: classes5.dex */
public final class ProductStatusJson$$a implements GeneratedSerializer {

    /* renamed from: a */
    public static final ProductStatusJson$$a f5560a = new ProductStatusJson$$a();

    /* renamed from: b */
    public static final /* synthetic */ EnumDescriptor f5561b;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sdkit.paylib.paylibpayment.impl.domain.network.response.products.ProductStatusJson", 2);
        enumDescriptor.addElement(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, false);
        enumDescriptor.addElement("inactive", false);
        f5561b = enumDescriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ProductStatusJson deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ProductStatusJson.values()[decoder.decodeEnum(getDescriptor())];
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5561b;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, ProductStatusJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeEnum(getDescriptor(), value.ordinal());
    }
}
