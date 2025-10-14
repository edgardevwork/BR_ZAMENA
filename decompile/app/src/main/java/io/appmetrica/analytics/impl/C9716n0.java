package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.n0 */
/* loaded from: classes6.dex */
public final class C9716n0 implements InterfaceC10026za {

    /* renamed from: a */
    public final Handler f8690a;

    /* renamed from: b */
    public final IHandlerExecutor f8691b;

    /* renamed from: c */
    public final C9870t4 f8692c;

    public C9716n0() {
        IHandlerExecutor iHandlerExecutorM6201a = C9820r4.m6725i().m6732e().m6201a();
        this.f8691b = iHandlerExecutorM6201a;
        this.f8690a = iHandlerExecutorM6201a.getHandler();
        this.f8692c = new C9870t4();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    /* renamed from: a */
    public final void mo6320a(@Nullable AppMetricaConfig appMetricaConfig, @NonNull InterfaceC9185Ra interfaceC9185Ra) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NonNull
    /* renamed from: b */
    public final Handler mo6321b() {
        return this.f8690a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NonNull
    /* renamed from: c */
    public final C9248U1 mo6322c() {
        return new C9248U1();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NonNull
    /* renamed from: d */
    public final C9552gb mo6323d() {
        return new C9552gb();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.f8691b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC10026za
    @NonNull
    /* renamed from: a */
    public final C9870t4 mo6319a() {
        return this.f8692c;
    }
}
