package ru.rustore.sdk.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TaskThreadHelper.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m7105d2 = {"Lru/rustore/sdk/core/tasks/TaskThreadHelper;", "", "()V", "executorService", "Ljava/util/concurrent/ExecutorService;", "getExecutorService", "()Ljava/util/concurrent/ExecutorService;", "executorService$delegate", "Lkotlin/Lazy;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class TaskThreadHelper {

    @NotNull
    public static final TaskThreadHelper INSTANCE = new TaskThreadHelper();

    /* renamed from: executorService$delegate, reason: from kotlin metadata */
    @NotNull
    public static final Lazy executorService = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorService>() { // from class: ru.rustore.sdk.core.tasks.TaskThreadHelper$executorService$2
        @Override // kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(1);
        }
    });

    /* renamed from: mainHandler$delegate, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mainHandler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: ru.rustore.sdk.core.tasks.TaskThreadHelper$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    @NotNull
    public final ExecutorService getExecutorService() {
        Object value = executorService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-executorService>(...)");
        return (ExecutorService) value;
    }

    @NotNull
    public final Handler getMainHandler() {
        return (Handler) mainHandler.getValue();
    }
}
