package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.w9 */
/* loaded from: classes5.dex */
public final class C9950w9 implements ExecutorProvider {

    /* renamed from: a */
    public final C9985xj f9252a;

    /* renamed from: b */
    public final IHandlerExecutor f9253b;

    public C9950w9() {
        C9985xj c9985xjM6384u = C9676la.m6362h().m6384u();
        this.f9252a = c9985xjM6384u;
        this.f9253b = c9985xjM6384u.m6968c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f9252a.m6966a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + ThreadFactoryC9479dd.f7951a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.f9253b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        C9985xj c9985xj = this.f9252a;
        if (c9985xj.f9322f == null) {
            synchronized (c9985xj) {
                try {
                    if (c9985xj.f9322f == null) {
                        c9985xj.f9317a.getClass();
                        HandlerThreadC9353Ya handlerThreadC9353YaM6959a = C9975x9.m6959a("IAA-SIO");
                        c9985xj.f9322f = new C9975x9(handlerThreadC9353YaM6959a, handlerThreadC9353YaM6959a.getLooper(), new Handler(handlerThreadC9353YaM6959a.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c9985xj.f9322f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        return this.f9252a.m6971f();
    }
}
