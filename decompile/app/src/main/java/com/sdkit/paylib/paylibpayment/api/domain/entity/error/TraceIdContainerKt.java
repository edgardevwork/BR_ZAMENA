package com.sdkit.paylib.paylibpayment.api.domain.entity.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m7105d2 = {"fetchTraceId", "", "", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class TraceIdContainerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final String fetchTraceId(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof TraceIdContainer) {
            return ((TraceIdContainer) th).getTraceId();
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            return fetchTraceId(cause);
        }
        return null;
    }
}
