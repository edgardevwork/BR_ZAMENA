package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Ek */
/* loaded from: classes8.dex */
public final class C8881Ek implements InterfaceC9225T2 {

    /* renamed from: a */
    public final Context f6556a;

    public C8881Ek(@NotNull Context context) {
        this.f6556a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9225T2, io.appmetrica.analytics.impl.InterfaceC9762ol
    /* renamed from: a */
    public final void mo5082a(@NotNull C9637jl c9637jl) {
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p046io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @NotNull
    /* renamed from: a */
    public final Context m5120a() {
        return this.f6556a;
    }
}
