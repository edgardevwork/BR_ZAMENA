package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Bc */
/* loaded from: classes7.dex */
public interface InterfaceC8798Bc extends InterfaceC9235Tc {
    @NotNull
    /* renamed from: a */
    List<ModuleServicesDatabase> mo4989a();

    @NotNull
    /* renamed from: b */
    /* synthetic */ Map mo4990b();

    @NotNull
    /* renamed from: c */
    /* synthetic */ Map mo4991c();

    @NotNull
    /* renamed from: d */
    List<Consumer<Location>> mo4992d();

    @Nullable
    /* renamed from: e */
    ModuleLocationSourcesServiceController mo4993e();

    @Nullable
    /* renamed from: f */
    Toggle mo4994f();

    @NotNull
    /* renamed from: g */
    /* synthetic */ List mo4995g();
}
