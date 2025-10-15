package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.En */
/* loaded from: classes7.dex */
public final class C8884En implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Throwable f6559a;

    /* renamed from: b */
    public final /* synthetic */ String f6560b = "WebView interface setup failed because of an exception.";

    public C8884En(Throwable th) {
        this.f6559a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f6559a, this.f6560b, new Object[0]);
    }
}
