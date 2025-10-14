package com.sdkit.paylib.paylibplatform.impl.p040di;

import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m7105d2 = {"Lcom/sdkit/paylib/paylibplatform/impl/di/PaylibPlatformToolsFactory;", "", "()V", "create", "Lcom/sdkit/paylib/paylibplatform/api/di/PaylibPlatformTools;", "paylibPlatformDependencies", "Lcom/sdkit/paylib/paylibplatform/impl/di/PaylibPlatformDependencies;", "com-sdkit-assistant_paylib_platform"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class PaylibPlatformToolsFactory {
    public static final PaylibPlatformToolsFactory INSTANCE = new PaylibPlatformToolsFactory();

    @JvmStatic
    public static final PaylibPlatformTools create(PaylibPlatformDependencies paylibPlatformDependencies) {
        Intrinsics.checkNotNullParameter(paylibPlatformDependencies, "paylibPlatformDependencies");
        return InterfaceC8592b.f5795a.m4666a(paylibPlatformDependencies);
    }
}
