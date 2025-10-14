package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s5 */
/* loaded from: classes7.dex */
public final class RunnableC9846s5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9954wd f9036a;

    /* renamed from: b */
    public final /* synthetic */ C9871t5 f9037b;

    public RunnableC9846s5(C9871t5 c9871t5, InterfaceC9954wd interfaceC9954wd) {
        this.f9037b = c9871t5;
        this.f9036a = interfaceC9954wd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9037b) {
            try {
                C9871t5 c9871t5 = this.f9037b;
                Object obj = c9871t5.f9085a;
                if (obj == null) {
                    c9871t5.f9086b.add(this.f9036a);
                } else {
                    this.f9036a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
