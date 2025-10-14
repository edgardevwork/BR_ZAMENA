package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.u5 */
/* loaded from: classes7.dex */
public final class C9896u5 {

    /* renamed from: a */
    public final PublicLogger f9162a;

    public C9896u5(String str) {
        this.f9162a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    /* renamed from: a */
    public final int m6851a(int i) {
        if (i < 100) {
            this.f9162a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: " + i + ". Default value (100) will be used", new Object[0]);
            return 100;
        }
        if (i <= 10000) {
            return i;
        }
        this.f9162a.warning("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: " + i + ". Default value (10000) will be used", new Object[0]);
        return 10000;
    }
}
