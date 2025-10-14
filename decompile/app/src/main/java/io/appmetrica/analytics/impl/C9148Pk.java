package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Pk */
/* loaded from: classes5.dex */
public final class C9148Pk extends HashMap {
    public C9148Pk() {
        put(EnumC9100Nk.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(EnumC9100Nk.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(EnumC9100Nk.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
