package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.metrics.internal.S */
/* loaded from: classes7.dex */
public final class C11600S {

    /* renamed from: a */
    public final C11611b0 f10644a;

    /* renamed from: b */
    public final C11585C f10645b;

    /* renamed from: c */
    public final C11597O f10646c;

    /* renamed from: d */
    public final C11617e0 f10647d;

    public C11600S(C11611b0 userIdDataSource, C11585C packageNameDataSource, C11597O remoteMetricsEventDataSource, C11617e0 versionNameDataSource) {
        Intrinsics.checkNotNullParameter(userIdDataSource, "userIdDataSource");
        Intrinsics.checkNotNullParameter(packageNameDataSource, "packageNameDataSource");
        Intrinsics.checkNotNullParameter(remoteMetricsEventDataSource, "remoteMetricsEventDataSource");
        Intrinsics.checkNotNullParameter(versionNameDataSource, "versionNameDataSource");
        this.f10644a = userIdDataSource;
        this.f10645b = packageNameDataSource;
        this.f10646c = remoteMetricsEventDataSource;
        this.f10647d = versionNameDataSource;
    }
}
