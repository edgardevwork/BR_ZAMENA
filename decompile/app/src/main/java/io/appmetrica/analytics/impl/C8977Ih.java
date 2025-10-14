package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Ih */
/* loaded from: classes8.dex */
public final class C8977Ih {

    /* renamed from: a */
    public final HashMap f6788a = new HashMap();

    /* renamed from: b */
    public final C9816r0 f6789b;

    public C8977Ih(C9816r0 c9816r0) {
        this.f6789b = c9816r0;
    }

    /* renamed from: a */
    public static C8977Ih m5275a() {
        return AbstractC8953Hh.f6725a;
    }

    /* renamed from: a */
    public final C8778Ah m5276a(Context context, String str) {
        C8778Ah c8778Ah = (C8778Ah) this.f6788a.get(str);
        if (c8778Ah == null) {
            synchronized (this.f6788a) {
                try {
                    c8778Ah = (C8778Ah) this.f6788a.get(str);
                    if (c8778Ah == null) {
                        IHandlerExecutor iHandlerExecutorM6201a = C9820r4.m6725i().f8968c.m6201a();
                        this.f6789b.getClass();
                        if (C9791q0.f8913e == null) {
                            ((C9975x9) iHandlerExecutorM6201a).f9301b.post(new RunnableC8928Gh(this, context));
                        }
                        c8778Ah = new C8778Ah(context.getApplicationContext(), str, new C9816r0());
                        this.f6788a.put(str, c8778Ah);
                        c8778Ah.m4966c(str);
                    }
                } finally {
                }
            }
        }
        return c8778Ah;
    }
}
