package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d */
/* loaded from: classes6.dex */
public final class C9465d extends Thread {

    /* renamed from: a */
    public final AtomicBoolean f7883a = new AtomicBoolean(true);

    /* renamed from: b */
    public final /* synthetic */ C9490e f7884b;

    public C9465d(C9490e c9490e) {
        this.f7884b = c9490e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        while (!isInterrupted() && this.f7883a.get()) {
            this.f7884b.f7976e.set(false);
            C9490e c9490e = this.f7884b;
            c9490e.f7974c.postAtFrontOfQueue(c9490e.f7977f);
            int i = this.f7884b.f7973b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C9490e.f7970g);
                    if (this.f7884b.f7976e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f7884b.f7972a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9440c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f7884b.f7976e.get()) {
                try {
                    Thread.sleep(C9490e.f7970g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
