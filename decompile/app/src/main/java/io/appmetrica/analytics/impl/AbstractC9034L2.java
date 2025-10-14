package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.L2 */
/* loaded from: classes6.dex */
public abstract class AbstractC9034L2 implements ModulePreferences {

    /* renamed from: a */
    public final InterfaceC10011yk f6918a;

    public AbstractC9034L2(@NotNull InterfaceC10011yk interfaceC10011yk) {
        this.f6918a = interfaceC10011yk;
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo5267a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z) {
        return ((AbstractC9454cd) this.f6918a).m5976c(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i) {
        return ((AbstractC9454cd) this.f6918a).m5973c(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j) {
        return ((AbstractC9454cd) this.f6918a).m5974c(mo5267a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((AbstractC9454cd) this.f6918a).m5975c(mo5267a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z) {
        AbstractC9454cd abstractC9454cd = (AbstractC9454cd) this.f6918a;
        ((AbstractC9780pe) ((InterfaceC10011yk) abstractC9454cd.m6647b(abstractC9454cd.mo5982f(mo5267a(str)), z))).m6648b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i) {
        AbstractC9454cd abstractC9454cd = (AbstractC9454cd) this.f6918a;
        ((AbstractC9780pe) ((InterfaceC10011yk) abstractC9454cd.m6644b(abstractC9454cd.mo5982f(str), i))).m6648b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j) {
        AbstractC9454cd abstractC9454cd = (AbstractC9454cd) this.f6918a;
        ((AbstractC9780pe) ((InterfaceC10011yk) abstractC9454cd.m6645b(abstractC9454cd.mo5982f(mo5267a(str)), j))).m6648b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        AbstractC9454cd abstractC9454cd = (AbstractC9454cd) this.f6918a;
        ((AbstractC9780pe) ((InterfaceC10011yk) abstractC9454cd.m6646b(abstractC9454cd.mo5982f(mo5267a(str)), str2))).m6648b();
    }
}
