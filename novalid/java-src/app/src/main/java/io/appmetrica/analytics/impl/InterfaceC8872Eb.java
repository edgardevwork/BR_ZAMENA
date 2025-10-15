package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Eb */
/* loaded from: classes7.dex */
public interface InterfaceC8872Eb extends LocationServiceApi {
    /* renamed from: a */
    void mo5112a(@NotNull Object obj);

    /* renamed from: a */
    void mo5113a(boolean z);

    /* renamed from: b */
    void mo5114b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @Nullable
    Location getLocation();

    void init();
}
