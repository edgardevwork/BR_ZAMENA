package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* renamed from: io.appmetrica.analytics.impl.fd */
/* loaded from: classes6.dex */
public final class C9529fd {

    /* renamed from: a */
    public final C9213Se f8118a;

    /* renamed from: b */
    public final NativeCrashClientModule f8119b;

    /* renamed from: c */
    public final C8786B0 f8120c;

    /* renamed from: d */
    public C8761A0 f8121d;

    public C9529fd(C9213Se c9213Se) {
        this.f8118a = c9213Se;
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f8119b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f8120c = new C8786B0();
    }
}
