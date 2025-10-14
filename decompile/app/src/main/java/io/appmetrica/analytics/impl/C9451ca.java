package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;

/* renamed from: io.appmetrica.analytics.impl.ca */
/* loaded from: classes6.dex */
public final class C9451ca {

    /* renamed from: d */
    public static final C9451ca f7840d = new C9451ca();

    /* renamed from: a */
    public final C9331Xc f7841a = new C9331Xc();

    /* renamed from: b */
    public final ServiceComponentsInitializer f7842b = AbstractC9785pj.m6652a();

    /* renamed from: c */
    public boolean f7843c = false;

    /* renamed from: a */
    public final void m5960a(Context context) {
        C9676la.m6361a(context);
        this.f7842b.onCreate(context);
        this.f7841a.getClass();
        for (String str : C9676la.f8552C.f8573s.m5060a()) {
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                C9676la.f8552C.m6376m().m5083a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C10035zj(C9676la.m6362h().m6363A().m7012b()).m6896a(context);
        C9676la.f8552C.m6377n().m5808a();
    }

    /* renamed from: b */
    public final void m5961b(Context context) {
        if (this.f7843c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f7843c) {
                    m5960a(context);
                    this.f7843c = true;
                }
            } finally {
            }
        }
    }
}
