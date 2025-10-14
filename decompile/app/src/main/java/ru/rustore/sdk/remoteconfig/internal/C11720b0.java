package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.b0 */
/* loaded from: classes5.dex */
public final class C11720b0 {

    /* renamed from: a */
    public final C11706V f10887a;

    /* renamed from: b */
    public final C11717a0 f10888b;

    /* renamed from: c */
    public final C11710X f10889c;

    public C11720b0(C11706V networkConfigDataSource, C11717a0 networkConfigMapper, C11710X networkConfigDtoMapper) {
        Intrinsics.checkNotNullParameter(networkConfigDataSource, "networkConfigDataSource");
        Intrinsics.checkNotNullParameter(networkConfigMapper, "networkConfigMapper");
        Intrinsics.checkNotNullParameter(networkConfigDtoMapper, "networkConfigDtoMapper");
        this.f10887a = networkConfigDataSource;
        this.f10888b = networkConfigMapper;
        this.f10889c = networkConfigDtoMapper;
    }
}
