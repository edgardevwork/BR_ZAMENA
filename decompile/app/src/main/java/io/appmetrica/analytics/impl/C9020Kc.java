package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Kc */
/* loaded from: classes6.dex */
public final class C9020Kc implements ModuleSelfReporter {

    /* renamed from: a */
    public final C9610ij f6884a = AbstractC9742o1.m6565a();

    /* renamed from: b */
    public final int f6885b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable Throwable th) {
        C9610ij c9610ij = this.f6884a;
        c9610ij.getClass();
        c9610ij.m6292a(new C8978Ii(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str) {
        C9610ij c9610ij = this.f6884a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f6885b).withName(str).build();
        c9610ij.getClass();
        c9610ij.m6292a(new C9337Xi(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable String str2) {
        this.f6884a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        C9610ij c9610ij = this.f6884a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f6885b).withName(str).withAttributes(map).build();
        c9610ij.getClass();
        c9610ij.m6292a(new C9337Xi(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable String str2) {
        C9610ij c9610ij = this.f6884a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f6885b).withName(str).withValue(str2).build();
        c9610ij.getClass();
        c9610ij.m6292a(new C9337Xi(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i, @NotNull String str, @Nullable String str2) {
        C9610ij c9610ij = this.f6884a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i).withName(str).withValue(str2).build();
        c9610ij.getClass();
        c9610ij.m6292a(new C9337Xi(moduleEventBuild));
    }
}
