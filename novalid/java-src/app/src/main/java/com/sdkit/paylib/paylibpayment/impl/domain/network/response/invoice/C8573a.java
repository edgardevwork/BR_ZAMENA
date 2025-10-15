package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.AvailablePaymentMethodType;
import com.sdkit.paylib.paylibutils.lib.C8610b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.a */
/* loaded from: classes6.dex */
public final class C8573a implements KSerializer {

    /* renamed from: a */
    public static final C8573a f5522a = new C8573a();

    /* renamed from: b */
    public static final Map f5523b;

    /* renamed from: c */
    public static final Map f5524c;

    /* renamed from: d */
    public static final SerialDescriptor f5525d;

    static {
        Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.m7112to("app2sbol", AvailablePaymentMethodType.SBOLPAY_DEEPLINK), TuplesKt.m7112to("card", AvailablePaymentMethodType.CARD), TuplesKt.m7112to("mobile_b", AvailablePaymentMethodType.MOBILE), TuplesKt.m7112to("new", AvailablePaymentMethodType.NEW), TuplesKt.m7112to("tinkoff_p", AvailablePaymentMethodType.TPAY), TuplesKt.m7112to(C8610b.f5886a.m4714a() + "pay", AvailablePaymentMethodType.SBOLPAY), TuplesKt.m7112to("sbp", AvailablePaymentMethodType.SBP));
        f5523b = mapMapOf;
        List<Pair> list = MapsKt___MapsKt.toList(mapMapOf);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (Pair pair : list) {
            Pair pairM7112to = TuplesKt.m7112to(pair.getSecond(), pair.getFirst());
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        f5524c = linkedHashMap;
        f5525d = SerialDescriptorsKt.PrimitiveSerialDescriptor("AvailablePaymentMethodType", PrimitiveKind.STRING.INSTANCE);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public AvailablePaymentMethodType deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (AvailablePaymentMethodType) f5523b.get(decoder.decodeString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5525d;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a */
    public void serialize(Encoder encoder, AvailablePaymentMethodType availablePaymentMethodType) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        String str = (String) f5524c.get(availablePaymentMethodType);
        if (str != null) {
            encoder.encodeString(str);
        }
    }
}
