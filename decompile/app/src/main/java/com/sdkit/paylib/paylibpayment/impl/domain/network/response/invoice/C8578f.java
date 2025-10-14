package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.api.network.entity.invoice.InvoiceReceiptStatus;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.f */
/* loaded from: classes6.dex */
public final class C8578f implements KSerializer {

    /* renamed from: a */
    public static final C8578f f5532a = new C8578f();

    /* renamed from: b */
    public static final SerialDescriptor f5533b = SerialDescriptorsKt.PrimitiveSerialDescriptor("InvoiceCardPaymentWay", PrimitiveKind.STRING.INSTANCE);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InvoiceReceiptStatus deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        switch (strDecodeString.hashCode()) {
            case -609524692:
                if (strDecodeString.equals("Ошибка возврата")) {
                    return InvoiceReceiptStatus.REFUND_ERROR;
                }
                break;
            case -343910709:
                if (strDecodeString.equals("Доставлен платёж")) {
                    return InvoiceReceiptStatus.PAYMENT_DELIVERED;
                }
                break;
            case 0:
                if (strDecodeString.equals("")) {
                    return null;
                }
                break;
            case 65118650:
                if (strDecodeString.equals("Ошибка платежа")) {
                    return InvoiceReceiptStatus.PAYMENT_ERROR;
                }
                break;
            case 553128593:
                if (strDecodeString.equals("Отправлен платёж")) {
                    return InvoiceReceiptStatus.PAYMENT_SENT;
                }
                break;
            case 1095338529:
                if (strDecodeString.equals("Доставлен возврат")) {
                    return InvoiceReceiptStatus.REFUND_DELIVERED;
                }
                break;
            case 1992377831:
                if (strDecodeString.equals("Отправлен возврат")) {
                    return InvoiceReceiptStatus.REFUND_SENT;
                }
                break;
        }
        return InvoiceReceiptStatus.UNDEFINED;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f5533b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, InvoiceReceiptStatus invoiceReceiptStatus) {
        String lowerCase;
        String strName;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (invoiceReceiptStatus == null || (strName = invoiceReceiptStatus.name()) == null) {
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
