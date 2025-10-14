package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.kb */
/* loaded from: classes5.dex */
public final class RunnableC9652kb implements Runnable {

    /* renamed from: a */
    public final WeakReference f8510a;

    /* renamed from: b */
    public final WeakReference f8511b;

    public RunnableC9652kb(Handler handler, AbstractC9177R2 abstractC9177R2) {
        this.f8510a = new WeakReference(handler);
        this.f8511b = new WeakReference(abstractC9177R2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f8510a.get();
        AbstractC9177R2 abstractC9177R2 = (AbstractC9177R2) this.f8511b.get();
        if (handler == null || abstractC9177R2 == null) {
            return;
        }
        boolean z = !abstractC9177R2.f7186b.mo5630f();
        if (z) {
            PublicLogger publicLogger = abstractC9177R2.f7187c;
            Set set = AbstractC9875t9.f9105a;
            EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
            C9445c4 c9445c4 = new C9445c4("", "", 3, 0, publicLogger);
            C9145Ph c9145Ph = abstractC9177R2.f7192h;
            C9383Zg c9383Zg = abstractC9177R2.f7186b;
            c9145Ph.getClass();
            c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        }
        if (z) {
            C9627jb.m6310a(handler, abstractC9177R2, this);
        }
    }
}
