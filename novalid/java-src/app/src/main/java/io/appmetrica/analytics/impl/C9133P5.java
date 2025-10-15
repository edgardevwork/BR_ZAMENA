package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.P5 */
/* loaded from: classes8.dex */
public final class C9133P5 implements InterfaceC9109O5 {

    /* renamed from: a */
    public final ModuleAdRevenueReporter f7082a;

    /* renamed from: b */
    public final C9796q5 f7083b;

    public C9133P5(@NotNull ModuleAdRevenueReporter moduleAdRevenueReporter, @NotNull C9796q5 c9796q5) {
        this.f7082a = moduleAdRevenueReporter;
        this.f7083b = c9796q5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9109O5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final C9796q5 getAdRevenueProcessorsHolder() {
        return this.f7083b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9109O5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final ModuleAdRevenueReporter getAdRevenueReporter() {
        return this.f7082a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f7083b;
    }
}
