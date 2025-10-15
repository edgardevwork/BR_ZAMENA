package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.c2 */
/* loaded from: classes8.dex */
public final class C9443c2 implements AppSetIdProvider {

    /* renamed from: a */
    public final Context f7805a;

    /* renamed from: b */
    public final IAppSetIdRetriever f7806b;

    /* renamed from: c */
    public volatile AppSetId f7807c;

    /* renamed from: d */
    public CountDownLatch f7808d;

    /* renamed from: e */
    public final long f7809e;

    /* renamed from: f */
    public final C9418b2 f7810f;

    @VisibleForTesting
    public C9443c2(@NotNull Context context, @NotNull IAppSetIdRetriever iAppSetIdRetriever) {
        this.f7805a = context;
        this.f7806b = iAppSetIdRetriever;
        this.f7808d = new CountDownLatch(1);
        this.f7809e = 20L;
        this.f7810f = new C9418b2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @WorkerThread
    @NotNull
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f7807c == null) {
            try {
                this.f7808d = new CountDownLatch(1);
                this.f7806b.retrieveAppSetId(this.f7805a, this.f7810f);
                this.f7808d.await(this.f7809e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f7807c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f7807c = appSetId;
        }
        return appSetId;
    }

    public C9443c2(@NotNull Context context) {
        this(context, AbstractC9468d2.m6000a());
    }
}
