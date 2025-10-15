package ru.rustore.sdk.core.util;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadUtils.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m7105d2 = {"asCoroutineDispatcherOrMain", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "sdk-public-core_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ThreadUtilsKt {
    @NotNull
    public static final CoroutineDispatcher asCoroutineDispatcherOrMain(@Nullable Executor executor) {
        CoroutineDispatcher coroutineDispatcherFrom;
        return (executor == null || (coroutineDispatcherFrom = ExecutorsKt.from(executor)) == null) ? Dispatchers.getMain() : coroutineDispatcherFrom;
    }
}
