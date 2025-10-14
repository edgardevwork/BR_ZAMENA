package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.ok */
/* loaded from: classes6.dex */
public final class C9761ok implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        String simOperator = ((TelephonyManager) obj).getSimOperator();
        String strSubstring = !TextUtils.isEmpty(simOperator) ? simOperator.substring(3) : null;
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }
}
