package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.w0 */
/* loaded from: classes5.dex */
public final class C11770w0 {

    /* renamed from: a */
    public final C11772x0 f10980a;

    /* renamed from: b */
    public final C11774y0 f10981b;

    /* renamed from: c */
    public final C11776z0 f10982c;

    public C11770w0(C11772x0 sdkNameDataSource, C11774y0 sdkTypeDataSource, C11776z0 sdkVersionDataSource) {
        Intrinsics.checkNotNullParameter(sdkNameDataSource, "sdkNameDataSource");
        Intrinsics.checkNotNullParameter(sdkTypeDataSource, "sdkTypeDataSource");
        Intrinsics.checkNotNullParameter(sdkVersionDataSource, "sdkVersionDataSource");
        this.f10980a = sdkNameDataSource;
        this.f10981b = sdkTypeDataSource;
        this.f10982c = sdkVersionDataSource;
    }
}
