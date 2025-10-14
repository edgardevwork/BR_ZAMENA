package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Hc */
/* loaded from: classes7.dex */
public final class C8948Hc implements ModuleEventServiceHandlerContext {

    /* renamed from: a */
    public final ModulePreferences f6715a;

    /* renamed from: b */
    public final ModulePreferences f6716b;

    /* renamed from: c */
    public final ModuleEventServiceHandlerReporter f6717c;

    public C8948Hc(@NotNull ModulePreferences modulePreferences, @NotNull ModulePreferences modulePreferences2, @NotNull ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.f6715a = modulePreferences;
        this.f6716b = modulePreferences2;
        this.f6717c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.f6717c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getLegacyModulePreferences() {
        return this.f6716b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getModulePreferences() {
        return this.f6715a;
    }
}
