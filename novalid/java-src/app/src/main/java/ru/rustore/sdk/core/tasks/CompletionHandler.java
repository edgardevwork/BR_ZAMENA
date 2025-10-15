package ru.rustore.sdk.core.tasks;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Task.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Lru/rustore/sdk/core/tasks/CompletionHandler;", "", "onCompletionListener", "Lru/rustore/sdk/core/tasks/OnCompletionListener;", "executor", "Ljava/util/concurrent/Executor;", "(Lru/rustore/sdk/core/tasks/OnCompletionListener;Ljava/util/concurrent/Executor;)V", "getExecutor", "()Ljava/util/concurrent/Executor;", "getOnCompletionListener", "()Lru/rustore/sdk/core/tasks/OnCompletionListener;", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class CompletionHandler {

    @Nullable
    public final Executor executor;

    @NotNull
    public final OnCompletionListener onCompletionListener;

    public CompletionHandler(@NotNull OnCompletionListener onCompletionListener, @Nullable Executor executor) {
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        this.onCompletionListener = onCompletionListener;
        this.executor = executor;
    }

    public /* synthetic */ CompletionHandler(OnCompletionListener onCompletionListener, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onCompletionListener, (i & 2) != 0 ? null : executor);
    }

    @NotNull
    public final OnCompletionListener getOnCompletionListener() {
        return this.onCompletionListener;
    }

    @Nullable
    public final Executor getExecutor() {
        return this.executor;
    }
}
