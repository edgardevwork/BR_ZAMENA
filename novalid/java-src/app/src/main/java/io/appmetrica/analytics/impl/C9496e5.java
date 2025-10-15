package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.e5 */
/* loaded from: classes8.dex */
public final class C9496e5 extends AbstractC9471d5 {
    public C9496e5(@NotNull C9571h5 c9571h5) {
        super(c9571h5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9471d5
    /* renamed from: b */
    public final boolean mo6004b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9471d5
    /* renamed from: c */
    public final void mo6005c() {
        C9755oe c9755oe = this.f7893a.f8230c;
        try {
            C9411ak c9411ak = new C9411ak(c9755oe, "background");
            Long lM5912a = c9411ak.f7740c.m5912a(C9411ak.f7732d);
            if (lM5912a != null) {
                c9411ak.m5865a(C9411ak.f7732d, Long.valueOf(TimeUnit.SECONDS.toMillis(lM5912a.longValue())));
            }
            Long lM5912a2 = c9411ak.f7740c.m5912a(C9411ak.f7733e);
            if (lM5912a2 != null) {
                c9411ak.m5865a(C9411ak.f7733e, Long.valueOf(TimeUnit.SECONDS.toMillis(lM5912a2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            C9411ak c9411ak2 = new C9411ak(c9755oe, "foreground");
            Long lM5912a3 = c9411ak2.f7740c.m5912a(C9411ak.f7732d);
            if (lM5912a3 != null) {
                c9411ak2.m5865a(C9411ak.f7732d, Long.valueOf(TimeUnit.SECONDS.toMillis(lM5912a3.longValue())));
            }
            Long lM5912a4 = c9411ak2.f7740c.m5912a(C9411ak.f7733e);
            if (lM5912a4 != null) {
                c9411ak2.m5865a(C9411ak.f7733e, Long.valueOf(TimeUnit.SECONDS.toMillis(lM5912a4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
