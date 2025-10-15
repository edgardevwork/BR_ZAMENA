package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.F */
/* loaded from: classes7.dex */
public final class C8885F implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f6561a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9360Yh f6562b;

    /* renamed from: c */
    public final /* synthetic */ C8910G f6563c;

    public C8885F(C8910G c8910g, Context context, InterfaceC9360Yh interfaceC9360Yh) {
        this.f6563c = c8910g;
        this.f6561a = context;
        this.f6562b = interfaceC9360Yh;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f6563c.f6635a.mo5042a(this.f6561a, this.f6562b);
    }
}
