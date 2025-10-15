package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.O0 */
/* loaded from: classes5.dex */
public final class C11694O0 {

    /* renamed from: a */
    public final C11688L0 f10837a;

    /* renamed from: b */
    public final C11736f0 f10838b;

    /* renamed from: c */
    public final C11690M0 f10839c;

    /* renamed from: d */
    public final Object f10840d;

    public C11694O0(C11688L0 cacheSource, C11736f0 persistableSource, C11690M0 mapper) {
        Intrinsics.checkNotNullParameter(cacheSource, "cacheSource");
        Intrinsics.checkNotNullParameter(persistableSource, "persistableSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f10837a = cacheSource;
        this.f10838b = persistableSource;
        this.f10839c = mapper;
        this.f10840d = new Object();
    }
}
