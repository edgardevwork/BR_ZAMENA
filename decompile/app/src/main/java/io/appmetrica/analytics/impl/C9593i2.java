package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.i2 */
/* loaded from: classes8.dex */
public final class C9593i2 implements InterfaceC10010yj, ApplicationStateProvider {

    /* renamed from: a */
    public final HashSet f8325a = new HashSet();

    /* renamed from: b */
    public final HashSet f8326b = new HashSet();

    /* renamed from: c */
    public volatile ApplicationState f8327c = ApplicationState.UNKNOWN;

    /* renamed from: d */
    public final CopyOnWriteArraySet f8328d = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void m6269a(int i) {
        this.f8325a.remove(Integer.valueOf(i));
        m6268a();
    }

    /* renamed from: b */
    public final void m6270b(int i) {
        this.f8326b.add(Integer.valueOf(i));
        this.f8325a.remove(Integer.valueOf(i));
        m6268a();
    }

    /* renamed from: c */
    public final void m6271c(int i) {
        this.f8325a.add(Integer.valueOf(i));
        this.f8326b.remove(Integer.valueOf(i));
        m6268a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f8327c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final void onCreate() {
        m6268a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10010yj
    public final void onDestroy() {
        if (this.f8327c == ApplicationState.VISIBLE) {
            this.f8327c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(@Nullable ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f8328d.add(applicationStateObserver);
        }
        return this.f8327c;
    }

    /* renamed from: a */
    public final void m6268a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f8325a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f8326b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f8327c != applicationState) {
            this.f8327c = applicationState;
            Iterator it = this.f8328d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f8327c);
            }
        }
    }
}
