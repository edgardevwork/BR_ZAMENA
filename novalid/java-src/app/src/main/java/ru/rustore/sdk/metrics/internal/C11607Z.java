package ru.rustore.sdk.metrics.internal;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Disposable;

/* renamed from: ru.rustore.sdk.metrics.internal.Z */
/* loaded from: classes7.dex */
public final class C11607Z implements Dispatcher {

    /* renamed from: a */
    public final ScheduledThreadPoolExecutor f10662a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: ru.rustore.sdk.metrics.internal.Z$a */
    public static final class a implements Disposable {

        /* renamed from: a */
        public final AtomicBoolean f10663a = new AtomicBoolean();

        /* renamed from: b */
        public final /* synthetic */ ScheduledFuture<?> f10664b;

        public a(ScheduledFuture<?> scheduledFuture) {
            this.f10664b = scheduledFuture;
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        public final void dispose() {
            if (this.f10663a.compareAndSet(false, true)) {
                this.f10664b.cancel(false);
            }
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        /* renamed from: isDisposed */
        public final boolean getDisposed() {
            return this.f10663a.get();
        }
    }

    /* renamed from: a */
    public static final void m7494a(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke();
    }

    /* renamed from: b */
    public static final void m7495b(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    public final void execute(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f10662a.submit(new Runnable() { // from class: ru.rustore.sdk.metrics.internal.Z$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11607Z.m7494a(block);
            }
        });
    }

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    public final Disposable executeDelayed(long j, TimeUnit timeUnit, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(this.f10662a.schedule(new Runnable() { // from class: ru.rustore.sdk.metrics.internal.Z$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11607Z.m7495b(block);
            }
        }, j, timeUnit));
    }
}
