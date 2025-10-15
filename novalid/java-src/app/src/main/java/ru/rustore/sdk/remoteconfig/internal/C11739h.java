package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.h */
/* loaded from: classes5.dex */
public final class C11739h {

    /* renamed from: a */
    public final C11719b f10931a;

    /* renamed from: b */
    public final C11706V f10932b;

    /* renamed from: c */
    public final C11710X f10933c;

    /* renamed from: d */
    public final C11729d f10934d;

    /* renamed from: e */
    public final Object f10935e;

    public C11739h(C11719b actualConfigCacheDataSource, C11706V networkConfigDataSource, C11710X networkConfigDtoMapper, C11729d actualConfigDtoMapper) {
        Intrinsics.checkNotNullParameter(actualConfigCacheDataSource, "actualConfigCacheDataSource");
        Intrinsics.checkNotNullParameter(networkConfigDataSource, "networkConfigDataSource");
        Intrinsics.checkNotNullParameter(networkConfigDtoMapper, "networkConfigDtoMapper");
        Intrinsics.checkNotNullParameter(actualConfigDtoMapper, "actualConfigDtoMapper");
        this.f10931a = actualConfigCacheDataSource;
        this.f10932b = networkConfigDataSource;
        this.f10933c = networkConfigDtoMapper;
        this.f10934d = actualConfigDtoMapper;
        this.f10935e = new Object();
    }
}
