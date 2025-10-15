package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.k5 */
/* loaded from: classes5.dex */
public final class C9646k5 {

    /* renamed from: a */
    public final String f8493a;

    public C9646k5(String str) {
        this.f8493a = str;
    }

    /* renamed from: a */
    public final PublicLogger m6326a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f8493a);
    }
}
