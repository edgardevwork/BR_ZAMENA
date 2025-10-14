package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.v5 */
/* loaded from: classes5.dex */
public abstract class AbstractC9921v5 implements InterfaceC9934vi {

    /* renamed from: a */
    public BaseRequestConfig f9211a;

    /* renamed from: b */
    public final BaseRequestConfig.RequestConfigLoader f9212b;

    /* renamed from: c */
    public C9157Q5 f9213c;

    public AbstractC9921v5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, C9157Q5> requestConfigLoader, @NonNull C9637jl c9637jl, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f9212b = requestConfigLoader;
        C9676la.m6362h().m6382s().m6924a(this);
        m6881a(new C9157Q5(c9637jl, C9676la.m6362h().m6382s(), C9676la.m6362h().m6379p(), argumentsMerger));
    }

    /* renamed from: a */
    public final synchronized void m6881a(@NonNull C9157Q5 c9157q5) {
        this.f9213c = c9157q5;
    }

    @NonNull
    @VisibleForTesting(otherwise = 4)
    /* renamed from: b */
    public final synchronized ArgumentsMerger<Object, Object> m6883b() {
        return (ArgumentsMerger) this.f9213c.componentArguments;
    }

    @NonNull
    /* renamed from: c */
    public final synchronized C9637jl m6884c() {
        return this.f9213c.f7143a;
    }

    /* renamed from: d */
    public final void m6885d() {
        synchronized (this) {
            this.f9211a = null;
        }
    }

    /* renamed from: e */
    public final synchronized void m6886e() {
        this.f9211a = null;
    }

    /* renamed from: a */
    public synchronized void mo5408a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.f9213c.componentArguments).compareWithOtherArguments(obj)) {
            m6881a(new C9157Q5(m6884c(), C9676la.f8552C.m6382s(), C9676la.f8552C.m6379p(), (ArgumentsMerger) ((ArgumentsMerger) this.f9213c.componentArguments).mergeFrom(obj)));
            m6886e();
        }
    }

    /* renamed from: a */
    public final synchronized void m6882a(@NonNull C9637jl c9637jl) {
        m6881a(new C9157Q5(c9637jl, C9676la.f8552C.m6382s(), C9676la.f8552C.m6379p(), m6883b()));
        m6886e();
    }

    @NonNull
    /* renamed from: a */
    public final synchronized BaseRequestConfig m6880a() {
        try {
            if (this.f9211a == null) {
                this.f9211a = this.f9212b.load(this.f9213c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9211a;
    }
}
