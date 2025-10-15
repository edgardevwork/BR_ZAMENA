package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceCardPaymentWay;
import com.sdkit.paylib.paylibutils.lib.C8610b;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.b */
/* loaded from: classes6.dex */
public final class C8574b implements KSerializer {

    /* renamed from: a */
    public static final C8574b f5526a = new C8574b();

    /* renamed from: b */
    public static final SerialDescriptor f5527b = SerialDescriptorsKt.PrimitiveSerialDescriptor("InvoiceCardPaymentWay", PrimitiveKind.STRING.INSTANCE);

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceCardPaymentWay deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        if (Intrinsics.areEqual(strDecodeString, "CARD")) {
            return InvoiceCardPaymentWay.CARD;
        }
        if (Intrinsics.areEqual(strDecodeString, "CARD_BINDING")) {
            return InvoiceCardPaymentWay.WEB;
        }
        if (Intrinsics.areEqual(strDecodeString, "mobile_dmr")) {
            return InvoiceCardPaymentWay.MOBILE;
        }
        if (Intrinsics.areEqual(strDecodeString, "sbp_dmr")) {
            return InvoiceCardPaymentWay.SBP;
        }
        if (Intrinsics.areEqual(strDecodeString, C8610b.f5886a.m4715b() + "PAY")) {
            return InvoiceCardPaymentWay.SBOLPAY;
        }
        if (Intrinsics.areEqual(strDecodeString, "tinkoff_pay")) {
            return InvoiceCardPaymentWay.TBANK;
        }
        if (Intrinsics.areEqual(strDecodeString, "")) {
            return null;
        }
        return InvoiceCardPaymentWay.UNDEFINED;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5527b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceCardPaymentWay invoiceCardPaymentWay) {
        String lowerCase;
        String strName;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (invoiceCardPaymentWay == null || (strName = invoiceCardPaymentWay.name()) == null) {
            lowerCase = null;
        } else {
            lowerCase = strName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        encoder.encodeString(lowerCase);
    }
}
