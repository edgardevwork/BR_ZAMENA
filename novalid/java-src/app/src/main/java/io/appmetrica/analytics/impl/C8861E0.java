package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.E0 */
/* loaded from: classes6.dex */
public final class C8861E0 {

    /* renamed from: a */
    public final IHandlerExecutor f6507a = C9820r4.m6725i().m6732e().m6201a();

    /* renamed from: b */
    public final C9816r0 f6508b;

    /* renamed from: c */
    public final C9605ie f6509c;

    /* renamed from: d */
    public final C9680le f6510d;

    public C8861E0() {
        C9816r0 c9816r0 = new C9816r0();
        this.f6508b = c9816r0;
        this.f6509c = new C9605ie(c9816r0);
        this.f6510d = new C9680le();
    }

    /* renamed from: a */
    public final void m5092a(final PluginErrorDetails pluginErrorDetails) {
        C9605ie c9605ie = this.f6509c;
        c9605ie.f8362a.mo5086a(null);
        c9605ie.f8363b.mo5086a(pluginErrorDetails);
        C9680le c9680le = this.f6510d;
        Intrinsics.checkNotNull(pluginErrorDetails);
        c9680le.getClass();
        this.f6507a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.E0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C8861E0.m5089a(this.f$0, pluginErrorDetails);
            }
        });
    }

    /* renamed from: a */
    public final void m5093a(final PluginErrorDetails pluginErrorDetails, final String str) {
        C9605ie c9605ie = this.f6509c;
        c9605ie.f8362a.mo5086a(null);
        c9605ie.f8363b.mo5086a(pluginErrorDetails);
        if (c9605ie.f8365d.mo5086a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f8908a) {
            C9680le c9680le = this.f6510d;
            Intrinsics.checkNotNull(pluginErrorDetails);
            c9680le.getClass();
            this.f6507a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.E0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C8861E0.m5090a(this.f$0, pluginErrorDetails, str);
                }
            });
        }
    }

    /* renamed from: a */
    public final void m5094a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        C9605ie c9605ie = this.f6509c;
        c9605ie.f8362a.mo5086a(null);
        c9605ie.f8364c.mo5086a(str);
        C9680le c9680le = this.f6510d;
        Intrinsics.checkNotNull(str);
        c9680le.getClass();
        this.f6507a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.E0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C8861E0.m5091a(this.f$0, str, str2, pluginErrorDetails);
            }
        });
    }

    /* renamed from: a */
    public static final void m5090a(C8861E0 c8861e0, PluginErrorDetails pluginErrorDetails, String str) {
        c8861e0.f6508b.getClass();
        C9791q0 c9791q0 = C9791q0.f8913e;
        Intrinsics.checkNotNull(c9791q0);
        C9378Zb c9378ZbMo4949j = c9791q0.m6687k().mo4949j();
        Intrinsics.checkNotNull(c9378ZbMo4949j);
        c9378ZbMo4949j.f7631a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    /* renamed from: a */
    public static final void m5091a(C8861E0 c8861e0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        c8861e0.f6508b.getClass();
        C9791q0 c9791q0 = C9791q0.f8913e;
        Intrinsics.checkNotNull(c9791q0);
        C9378Zb c9378ZbMo4949j = c9791q0.m6687k().mo4949j();
        Intrinsics.checkNotNull(c9378ZbMo4949j);
        c9378ZbMo4949j.f7631a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    /* renamed from: a */
    public static final void m5089a(C8861E0 c8861e0, PluginErrorDetails pluginErrorDetails) {
        c8861e0.f6508b.getClass();
        C9791q0 c9791q0 = C9791q0.f8913e;
        Intrinsics.checkNotNull(c9791q0);
        C9378Zb c9378ZbMo4949j = c9791q0.m6687k().mo4949j();
        Intrinsics.checkNotNull(c9378ZbMo4949j);
        c9378ZbMo4949j.f7631a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
