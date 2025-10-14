package com.sdkit.paylib.paylibnative.p033ui.core.common;

import com.sdkit.paylib.paylibpayment.api.network.response.RequestMeta;
import com.sdkit.paylib.paylibpayment.api.network.response.ResponseWithCode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.core.common.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8136a {
    /* renamed from: a */
    public static final GmarktError m2021a(ResponseWithCode responseWithCode, String debugMessage) {
        Intrinsics.checkNotNullParameter(responseWithCode, "<this>");
        Intrinsics.checkNotNullParameter(debugMessage, "debugMessage");
        int code = responseWithCode.getCode();
        String errorMessage = responseWithCode.getErrorMessage();
        String errorDescription = responseWithCode.getErrorDescription();
        RequestMeta meta = responseWithCode.getMeta();
        return new GmarktError(code, errorMessage, errorDescription, meta != null ? meta.getTraceId() : null, debugMessage);
    }
}
