package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.jf */
/* loaded from: classes5.dex */
public final class RunnableC9631jf implements Runnable {

    /* renamed from: a */
    public final File f8440a;

    /* renamed from: b */
    public final Function f8441b;

    /* renamed from: c */
    public final Consumer f8442c;

    /* renamed from: d */
    public final Consumer f8443d;

    public RunnableC9631jf(File file, Function function, Consumer consumer, Consumer consumer2) {
        this.f8440a = file;
        this.f8441b = function;
        this.f8442c = consumer;
        this.f8443d = consumer2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8440a.exists()) {
            try {
                Object objApply = this.f8441b.apply(this.f8440a);
                if (objApply != null) {
                    this.f8443d.consume(objApply);
                }
            } catch (Throwable unused) {
            }
            this.f8442c.consume(this.f8440a);
        }
    }
}
