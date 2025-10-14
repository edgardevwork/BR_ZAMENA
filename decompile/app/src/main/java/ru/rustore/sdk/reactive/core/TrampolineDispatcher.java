package ru.rustore.sdk.reactive.core;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TrampolineDispatcher.kt */
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lru/rustore/sdk/reactive/core/TrampolineDispatcher;", "Lru/rustore/sdk/reactive/core/Dispatcher;", "()V", "drainActive", "", "taskQueue", "Lkotlin/collections/ArrayDeque;", "Lkotlin/Function0;", "", "drain", "execute", "block", "executeDelayed", "Lru/rustore/sdk/reactive/core/Disposable;", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class TrampolineDispatcher implements Dispatcher {
    public static boolean drainActive;

    @NotNull
    public static final TrampolineDispatcher INSTANCE = new TrampolineDispatcher();

    @NotNull
    public static final ArrayDeque<Function0<Unit>> taskQueue = new ArrayDeque<>();

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    public void execute(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            taskQueue.addLast(block);
            Unit unit = Unit.INSTANCE;
        }
        drain();
    }

    @Override // ru.rustore.sdk.reactive.core.Dispatcher
    @NotNull
    public Disposable executeDelayed(long delay, @NotNull TimeUnit timeUnit, @NotNull Function0<Unit> block) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        timeUnit.sleep(delay);
        synchronized (this) {
            taskQueue.addLast(block);
            Unit unit = Unit.INSTANCE;
        }
        drain();
        return EmptyDisposable.INSTANCE;
    }

    public final void drain() {
        Function0<Unit> function0RemoveFirstOrNull;
        synchronized (this) {
            if (drainActive) {
                return;
            }
            drainActive = true;
            Unit unit = Unit.INSTANCE;
            while (true) {
                synchronized (this) {
                    function0RemoveFirstOrNull = taskQueue.removeFirstOrNull();
                    if (function0RemoveFirstOrNull == null) {
                        drainActive = false;
                        return;
                    }
                }
                function0RemoveFirstOrNull.invoke();
            }
        }
    }
}
