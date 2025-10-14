package ru.rustore.sdk.reactive.core;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\f"}, m7105d2 = {"Lru/rustore/sdk/reactive/core/Dispatcher;", "", "execute", "", "block", "Lkotlin/Function0;", "executeDelayed", "Lru/rustore/sdk/reactive/core/Disposable;", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public interface Dispatcher {
    void execute(@NotNull Function0<Unit> block);

    @NotNull
    Disposable executeDelayed(long delay, @NotNull TimeUnit timeUnit, @NotNull Function0<Unit> block);
}
