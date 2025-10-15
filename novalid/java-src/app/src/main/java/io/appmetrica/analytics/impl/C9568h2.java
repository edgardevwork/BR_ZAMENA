package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.h2 */
/* loaded from: classes5.dex */
public final class C9568h2 {
    /* renamed from: a */
    public static final boolean m6198a(Throwable th) {
        return true;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC8846Da m6199a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull InterfaceC9185Ra interfaceC9185Ra) {
        return new C9311Wg(new C9258Ub(interfaceC9185Ra, appMetricaConfig), new InterfaceC9697m6() { // from class: io.appmetrica.analytics.impl.h2$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC9697m6
            /* renamed from: a */
            public final boolean mo6200a(Throwable th) {
                return C9568h2.m6198a(th);
            }
        }, appMetricaConfig.crashTransformer, new C9017K9(context));
    }
}
