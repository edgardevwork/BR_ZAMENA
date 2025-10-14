package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.f0 */
/* loaded from: classes6.dex */
public final class C9516f0 {

    /* renamed from: a */
    public final HashMap f8042a = new HashMap();

    /* renamed from: a */
    public final synchronized C9491e0 m6077a(C9396a5 c9396a5, PublicLogger publicLogger, C9755oe c9755oe) {
        C9491e0 c9491e0;
        c9491e0 = (C9491e0) this.f8042a.get(c9396a5.toString());
        if (c9491e0 == null) {
            C9466d0 c9466d0M6598d = c9755oe.m6598d();
            c9491e0 = new C9491e0(c9466d0M6598d.f7885a, c9466d0M6598d.f7886b, new C9936vk(publicLogger, "[App Environment]"));
            this.f8042a.put(c9396a5.toString(), c9491e0);
        }
        return c9491e0;
    }

    /* renamed from: a */
    public final synchronized void m6078a(C9466d0 c9466d0, C9755oe c9755oe) {
        c9755oe.m6594a(c9466d0).m6648b();
    }
}
