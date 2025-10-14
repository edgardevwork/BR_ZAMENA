package com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice;

import com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.InvoicePaymentParamJson;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.domain.network.response.invoice.e */
/* loaded from: classes5.dex */
public final class C8577e extends JsonContentPolymorphicSerializer {
    public C8577e() {
        super(Reflection.getOrCreateKotlinClass(InvoicePaymentParamJson.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy selectDeserializer(JsonElement element) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(element).get((Object) "key");
        String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            switch (content.hashCode()) {
                case -2117026426:
                    if (content.equals("paysys_order_id")) {
                        return InvoicePaymentParamJson.PaymentSystemOrderId.Companion.m4425a();
                    }
                    break;
                case -1540049994:
                    if (content.equals("payment_url")) {
                        return InvoicePaymentParamJson.PaymentUrl.Companion.m4431a();
                    }
                    break;
                case -35501006:
                    if (content.equals("payment_instrument_value")) {
                        return InvoicePaymentParamJson.PaymentInstrumentValue.Companion.m4422a();
                    }
                    break;
                case -1181607:
                    if (content.equals("payment_instrument_type")) {
                        return InvoicePaymentParamJson.PaymentType.Companion.m4428a();
                    }
                    break;
                case 629233382:
                    if (content.equals("deeplink")) {
                        return InvoicePaymentParamJson.Deeplink.Companion.m4419a();
                    }
                    break;
            }
        }
        return InvoicePaymentParamJson.Unknown.Companion.m4434a();
    }
}
