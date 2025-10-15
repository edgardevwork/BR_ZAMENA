package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.j0 */
/* loaded from: classes5.dex */
public final class C11744j0 {

    /* renamed from: a */
    public final C11736f0 f10938a;

    /* renamed from: b */
    public final C11713Y0 f10939b;

    /* renamed from: c */
    public final C11742i0 f10940c;

    /* renamed from: d */
    public final C11740h0 f10941d;

    public C11744j0(C11736f0 dataSource, C11713Y0 timeDataSource, C11742i0 mapper, C11740h0 factory) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(timeDataSource, "timeDataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f10938a = dataSource;
        this.f10939b = timeDataSource;
        this.f10940c = mapper;
        this.f10941d = factory;
    }
}
