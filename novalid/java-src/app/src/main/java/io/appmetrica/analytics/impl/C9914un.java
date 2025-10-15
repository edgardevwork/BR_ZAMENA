package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.un */
/* loaded from: classes7.dex */
public final class C9914un extends SimpleThreadSafeToggle implements ApplicationStateObserver {
    public C9914un() {
        super(false, "[VisibleAppStateOnlyTrackingStatusToggle]");
        synchronized (this) {
            m6868a(C9676la.m6362h().m6367c().registerStickyObserver(this));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void m6868a(ApplicationState applicationState) {
        updateState(applicationState == ApplicationState.VISIBLE);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final synchronized void onApplicationStateChanged(@NotNull ApplicationState applicationState) {
        m6868a(applicationState);
    }
}
