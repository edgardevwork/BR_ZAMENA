package ru.rustore.sdk.appupdate;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.rustore.sdk.appupdate.a0 */
/* loaded from: classes6.dex */
public final class C11367a0 {

    /* renamed from: a */
    @NotNull
    public final C11369b0 f10073a;

    /* renamed from: b */
    @NotNull
    public final C11371c0 f10074b;

    /* renamed from: c */
    @NotNull
    public final C11373d0 f10075c;

    public C11367a0(@NotNull C11369b0 sdkNameDataSource, @NotNull C11371c0 sdkTypeDataSource, @NotNull C11373d0 sdkVersionDataSource) {
        Intrinsics.checkNotNullParameter(sdkNameDataSource, "sdkNameDataSource");
        Intrinsics.checkNotNullParameter(sdkTypeDataSource, "sdkTypeDataSource");
        Intrinsics.checkNotNullParameter(sdkVersionDataSource, "sdkVersionDataSource");
        this.f10073a = sdkNameDataSource;
        this.f10074b = sdkTypeDataSource;
        this.f10075c = sdkVersionDataSource;
    }
}
