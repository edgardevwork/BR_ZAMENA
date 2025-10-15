package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.a4 */
/* loaded from: classes7.dex */
public final class C9395a4 implements InterfaceC9061M5 {

    /* renamed from: a */
    public final Context f7665a;

    /* renamed from: b */
    public final C9133P5 f7666b = new C9133P5(new C9991y0(), new C9796q5());

    /* renamed from: c */
    public final C9845s4 f7667c = new C9845s4(C9820r4.m6725i().m6729b(getContext()));

    public C9395a4(@NotNull Context context) {
        this.f7665a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f7667c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Context getContext() {
        return this.f7665a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9061M5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InterfaceC9109O5 getModuleAdRevenueContext() {
        return this.f7666b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f7666b;
    }
}
