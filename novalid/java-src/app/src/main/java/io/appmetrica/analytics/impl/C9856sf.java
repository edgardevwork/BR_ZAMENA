package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.sf */
/* loaded from: classes6.dex */
public final class C9856sf implements InterfaceC9023Kf {

    /* renamed from: a */
    public final /* synthetic */ C9906uf f9047a;

    public C9856sf(C9906uf c9906uf) {
        this.f9047a = c9906uf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9023Kf
    @WorkerThread
    /* renamed from: a */
    public final void mo5332a(@Nullable C8901Ff c8901Ff) {
        C9906uf c9906uf = this.f9047a;
        C9906uf.m6857a(c9906uf, c8901Ff, (InterfaceC9706mf) c9906uf.f9182e.getValue());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9023Kf
    @WorkerThread
    /* renamed from: a */
    public final void mo5333a(@NotNull Throwable th) {
        C9906uf c9906uf = this.f9047a;
        C9906uf.m6857a(c9906uf, null, (InterfaceC9706mf) c9906uf.f9182e.getValue());
    }
}
