package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.mb */
/* loaded from: classes7.dex */
public final class C9702mb extends InterruptionSafeThread {

    /* renamed from: a */
    public final /* synthetic */ C9727nb f8647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9702mb(C9727nb c9727nb, String str) {
        super(str);
        this.f8647a = c9727nb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f8647a.f8722a) {
            C9727nb.m6505a(this.f8647a);
            this.f8647a.f8726e = true;
            this.f8647a.f8722a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f8647a.f8723b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f8647a.f8723b);
                this.f8647a.f8723b.clear();
            }
            if (map.size() > 0) {
                C9727nb.m6506a(this.f8647a, map);
                map.clear();
            }
        }
    }
}
