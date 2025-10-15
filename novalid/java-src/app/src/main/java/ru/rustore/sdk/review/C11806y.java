package ru.rustore.sdk.review;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.review.y */
/* loaded from: classes5.dex */
public final class C11806y {

    /* renamed from: a */
    public final C11807z f11044a;

    /* renamed from: b */
    public final C11777A f11045b;

    /* renamed from: c */
    public final C11778B f11046c;

    public C11806y(C11807z sdkNameDataSource, C11777A sdkTypeDataSource, C11778B sdkVersionDataSource) {
        Intrinsics.checkNotNullParameter(sdkNameDataSource, "sdkNameDataSource");
        Intrinsics.checkNotNullParameter(sdkTypeDataSource, "sdkTypeDataSource");
        Intrinsics.checkNotNullParameter(sdkVersionDataSource, "sdkVersionDataSource");
        this.f11044a = sdkNameDataSource;
        this.f11045b = sdkTypeDataSource;
        this.f11046c = sdkVersionDataSource;
    }
}
