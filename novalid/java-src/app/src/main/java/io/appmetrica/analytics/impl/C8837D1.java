package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.D1 */
/* loaded from: classes7.dex */
public final class C8837D1 implements InterfaceC9842s1 {

    /* renamed from: a */
    public final ICommonExecutor f6441a;

    /* renamed from: b */
    public final InterfaceC9842s1 f6442b;

    /* renamed from: c */
    public boolean f6443c;

    public C8837D1(@NonNull InterfaceC9842s1 interfaceC9842s1) {
        this(C9676la.m6362h().m6384u().m6967b(), interfaceC9842s1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    /* renamed from: a */
    public final void mo5044a(Intent intent, int i) {
        this.f6441a.execute(new C9917v1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    /* renamed from: b */
    public final void mo5047b(Intent intent) {
        this.f6441a.execute(new C10017z1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    /* renamed from: c */
    public final void mo5048c(Intent intent) {
        this.f6441a.execute(new C9992y1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        this.f6441a.execute(new C9867t1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    public final synchronized void onCreate() {
        this.f6443c = true;
        this.f6441a.execute(new C9892u1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    public final void onDestroy() {
        this.f6441a.removeAll();
        synchronized (this) {
            this.f6443c = false;
        }
        this.f6442b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    public final void pauseUserSession(@NonNull Bundle bundle) {
        this.f6441a.execute(new C8812C1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    public final void reportData(int i, Bundle bundle) {
        this.f6441a.execute(new C8762A1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    public final void resumeUserSession(@NonNull Bundle bundle) {
        this.f6441a.execute(new C8787B1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    /* renamed from: a */
    public final void mo5045a(Intent intent, int i, int i2) {
        this.f6441a.execute(new C9942w1(this, intent, i, i2));
    }

    public C8837D1(IHandlerExecutor iHandlerExecutor, InterfaceC9842s1 interfaceC9842s1) {
        this.f6443c = false;
        this.f6441a = iHandlerExecutor;
        this.f6442b = interfaceC9842s1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    /* renamed from: a */
    public final void mo5043a(Intent intent) {
        this.f6441a.execute(new C9967x1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9842s1
    /* renamed from: a */
    public final void mo5046a(@NonNull InterfaceC9817r1 interfaceC9817r1) {
        this.f6442b.mo5046a(interfaceC9817r1);
    }
}
