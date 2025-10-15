package com.sdkit.paylib.paylibpayment.api.network.entity.products;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/network/entity/products/SubscriptionPeriodParsingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "(Ljava/lang/String;)V", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class SubscriptionPeriodParsingException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionPeriodParsingException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
