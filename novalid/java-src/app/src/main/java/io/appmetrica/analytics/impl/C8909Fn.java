package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.Fn */
/* loaded from: classes8.dex */
public final class C8909Fn {

    /* renamed from: a */
    public final ArrayList f6633a = new ArrayList();

    /* renamed from: b */
    public PublicLogger f6634b;

    /* renamed from: a */
    public final synchronized void m5205a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f6634b;
            if (publicLogger == null) {
                this.f6633a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
