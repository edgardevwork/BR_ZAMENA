package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* renamed from: io.appmetrica.analytics.impl.Xc */
/* loaded from: classes6.dex */
public final class C9331Xc {
    /* renamed from: a */
    public static void m5748a() {
        for (String str : C9820r4.m6725i().f8978m.m5060a()) {
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                C9820r4.m6725i().m6737k().f8801b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
    }
}
