package ru.rustore.sdk.core.tasks;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.ivy.osgi.p063p2.P2MetadataParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jfrog.build.extractor.clientConfiguration.ClientProperties;

/* compiled from: Task.kt */
@Metadata(m7104d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002,-B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0014J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0017\u001a\u00020\u0014J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u000b\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0015\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010'J\u0010\u0010%\u001a\u00020!2\u0006\u0010(\u001a\u00020$H\u0002J\u001c\u0010)\u001a\u00020!*\u0004\u0018\u00010\u000f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020!0+H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m7105d2 = {"Lru/rustore/sdk/core/tasks/Task;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "completionHandlers", "", "Lru/rustore/sdk/core/tasks/CompletionHandler;", "listenerHandlers", "Lru/rustore/sdk/core/tasks/ListenerHandler;", "taskResult", "Lkotlin/Result;", "addCompletionListener", "onCompletionListener", "Lru/rustore/sdk/core/tasks/OnCompletionListener;", "executor", "Ljava/util/concurrent/Executor;", "addListener", "onSuccess", "Lru/rustore/sdk/core/tasks/OnSuccessListener;", "onFailure", "Lru/rustore/sdk/core/tasks/OnFailureListener;", "addOnCompletionListener", "addOnFailureListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnSuccessListener", "await", "()Ljava/lang/Object;", ClientProperties.PROP_TIMEOUT, "", P2MetadataParser.UnitHandler.UNIT, "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "cancel", "", "notifyCompletionListeners", "cause", "", "setTaskResult", "data", "(Ljava/lang/Object;)V", "error", "runWithFallbackToMain", "block", "Lkotlin/Function0;", "Companion", "TaskResultProvider", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class Task<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final List<CompletionHandler> completionHandlers;

    @NotNull
    public final List<ListenerHandler<T>> listenerHandlers;

    @Nullable
    public volatile Result<? extends T> taskResult;

    public /* synthetic */ Task(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public Task() {
        this.listenerHandlers = new ArrayList();
        this.completionHandlers = new ArrayList();
    }

    public final T await() {
        return await(Long.MIN_VALUE, TimeUnit.SECONDS);
    }

    public final T await(long j, @NotNull TimeUnit timeUnit) throws Throwable {
        Intrinsics.checkNotNullParameter(timeUnit, "unit");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.taskResult != null) {
            countDownLatch.countDown();
        } else {
            addCompletionListener(new OnCompletionListener() { // from class: ru.rustore.sdk.core.tasks.Task$$ExternalSyntheticLambda2
                @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
                public final void onComplete(Throwable th) {
                    Task.await$lambda$0(countDownLatch, th);
                }
            }, TaskThreadHelper.INSTANCE.getExecutorService());
        }
        if (j == Long.MIN_VALUE) {
            countDownLatch.await();
        } else {
            countDownLatch.await(j, timeUnit);
        }
        Result<? extends T> result = this.taskResult;
        if (result == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        T t = (T) result.getValue();
        ResultKt.throwOnFailure(t);
        return t;
    }

    public static final void await$lambda$0(CountDownLatch countDownLatch, Throwable th) {
        Intrinsics.checkNotNullParameter(countDownLatch, "$countDownLatch");
        countDownLatch.countDown();
    }

    public final void cancel() {
        setTaskResult((Throwable) new TaskCancellationException());
    }

    @NotNull
    public final Task<T> addOnCompletionListener(@NotNull OnCompletionListener onCompletionListener) {
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        return addCompletionListener$default(this, onCompletionListener, null, 2, null);
    }

    @NotNull
    public final Task<T> addOnCompletionListener(@NotNull Executor executor, @NotNull OnCompletionListener onCompletionListener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        return addCompletionListener(onCompletionListener, executor);
    }

    @NotNull
    public final Task<T> addOnSuccessListener(@NotNull OnSuccessListener<T> onSuccessListener) {
        Intrinsics.checkNotNullParameter(onSuccessListener, "listener");
        return addListener(onSuccessListener, null, null);
    }

    @NotNull
    public final Task<T> addOnSuccessListener(@NotNull Executor executor, @NotNull OnSuccessListener<T> onSuccessListener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(onSuccessListener, "listener");
        return addListener(onSuccessListener, null, executor);
    }

    @NotNull
    public final Task<T> addOnFailureListener(@NotNull OnFailureListener onFailureListener) {
        Intrinsics.checkNotNullParameter(onFailureListener, "listener");
        return addListener(null, onFailureListener, null);
    }

    @NotNull
    public final Task<T> addOnFailureListener(@NotNull Executor executor, @NotNull OnFailureListener onFailureListener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(onFailureListener, "listener");
        return addListener(null, onFailureListener, executor);
    }

    public final void setTaskResult(final T data) {
        synchronized (this) {
            if (this.taskResult != null) {
                return;
            }
            Result.Companion companion = Result.INSTANCE;
            this.taskResult = Result.m15698boximpl(Result.m15699constructorimpl(data));
            TaskKt.forEachWithDeletion(this.listenerHandlers, new Function1<ListenerHandler<T>, Unit>(this) { // from class: ru.rustore.sdk.core.tasks.Task$setTaskResult$1$1
                public final /* synthetic */ Task<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((ListenerHandler) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(ListenerHandler<T> listenerHandler) {
                    Intrinsics.checkNotNullParameter(listenerHandler, "listenerHandler");
                    final OnSuccessListener<T> onSuccess = listenerHandler.getOnSuccess();
                    if (onSuccess != null) {
                        Task<T> task = this.this$0;
                        Executor executor = listenerHandler.getExecutor();
                        final T t = data;
                        task.runWithFallbackToMain(executor, new Function0<Unit>() { // from class: ru.rustore.sdk.core.tasks.Task$setTaskResult$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                onSuccess.onSuccess(t);
                            }
                        });
                    }
                }
            });
            notifyCompletionListeners(null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setTaskResult(final Throwable error) {
        synchronized (this) {
            if (this.taskResult != null) {
                return;
            }
            Result.Companion companion = Result.INSTANCE;
            this.taskResult = Result.m15698boximpl(Result.m15699constructorimpl(ResultKt.createFailure(error)));
            TaskKt.forEachWithDeletion(this.listenerHandlers, new Function1<ListenerHandler<T>, Unit>(this) { // from class: ru.rustore.sdk.core.tasks.Task$setTaskResult$2$1
                public final /* synthetic */ Task<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke((ListenerHandler) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(ListenerHandler<T> listener) {
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    final OnFailureListener onFailure = listener.getOnFailure();
                    if (onFailure != null) {
                        Task<T> task = this.this$0;
                        Executor executor = listener.getExecutor();
                        final Throwable th = error;
                        task.runWithFallbackToMain(executor, new Function0<Unit>() { // from class: ru.rustore.sdk.core.tasks.Task$setTaskResult$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                onFailure.onFailure(th);
                            }
                        });
                    }
                }
            });
            notifyCompletionListeners(error);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* compiled from: Task.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "completionListenerHandler", "Lru/rustore/sdk/core/tasks/CompletionHandler;", "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.core.tasks.Task$notifyCompletionListeners$1 */
    /* loaded from: classes5.dex */
    public static final class C115691 extends Lambda implements Function1<CompletionHandler, Unit> {
        public final /* synthetic */ Throwable $cause;
        public final /* synthetic */ Task<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115691(Task<T> task, Throwable th) {
            super(1);
            this.this$0 = task;
            th = th;
        }

        /* compiled from: Task.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
        /* renamed from: ru.rustore.sdk.core.tasks.Task$notifyCompletionListeners$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Throwable $cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Throwable th) {
                super(0);
                th = th;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                completionHandler.getOnCompletionListener().onComplete(th);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CompletionHandler completionHandler) {
            invoke2(completionHandler);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(CompletionHandler completionListenerHandler) {
            Intrinsics.checkNotNullParameter(completionListenerHandler, "completionListenerHandler");
            this.this$0.runWithFallbackToMain(completionListenerHandler.getExecutor(), new Function0<Unit>() { // from class: ru.rustore.sdk.core.tasks.Task.notifyCompletionListeners.1.1
                public final /* synthetic */ Throwable $cause;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Throwable th) {
                    super(0);
                    th = th;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    completionHandler.getOnCompletionListener().onComplete(th);
                }
            });
        }
    }

    public final void notifyCompletionListeners(Throwable cause) {
        TaskKt.forEachWithDeletion(this.completionHandlers, new Function1<CompletionHandler, Unit>(this) { // from class: ru.rustore.sdk.core.tasks.Task.notifyCompletionListeners.1
            public final /* synthetic */ Throwable $cause;
            public final /* synthetic */ Task<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C115691(Task<T> this, Throwable cause2) {
                super(1);
                this.this$0 = this;
                th = cause2;
            }

            /* compiled from: Task.kt */
            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
            /* renamed from: ru.rustore.sdk.core.tasks.Task$notifyCompletionListeners$1$1 */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                public final /* synthetic */ Throwable $cause;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Throwable th) {
                    super(0);
                    th = th;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2() {
                    completionHandler.getOnCompletionListener().onComplete(th);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CompletionHandler completionHandler) {
                invoke2(completionHandler);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(CompletionHandler completionListenerHandler) {
                Intrinsics.checkNotNullParameter(completionListenerHandler, "completionListenerHandler");
                this.this$0.runWithFallbackToMain(completionListenerHandler.getExecutor(), new Function0<Unit>() { // from class: ru.rustore.sdk.core.tasks.Task.notifyCompletionListeners.1.1
                    public final /* synthetic */ Throwable $cause;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(Throwable th) {
                        super(0);
                        th = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        completionHandler.getOnCompletionListener().onComplete(th);
                    }
                });
            }
        });
    }

    public static /* synthetic */ Task addCompletionListener$default(Task task, OnCompletionListener onCompletionListener, Executor executor, int i, Object obj) {
        if ((i & 2) != 0) {
            executor = null;
        }
        return task.addCompletionListener(onCompletionListener, executor);
    }

    public final Task<T> addCompletionListener(final OnCompletionListener onCompletionListener, Executor executor) {
        synchronized (this) {
            try {
                Result<? extends T> result = this.taskResult;
                if (result == null) {
                    this.completionHandlers.add(new CompletionHandler(onCompletionListener, executor));
                } else {
                    final Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(result.getValue());
                    runWithFallbackToMain(executor, new Function0<Unit>() { // from class: ru.rustore.sdk.core.tasks.Task$addCompletionListener$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onCompletionListener.onComplete(thM15702exceptionOrNullimpl);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task addListener$default(Task task, OnSuccessListener onSuccessListener, OnFailureListener onFailureListener, Executor executor, int i, Object obj) {
        if ((i & 1) != 0) {
            onSuccessListener = null;
        }
        if ((i & 2) != 0) {
            onFailureListener = null;
        }
        if ((i & 4) != 0) {
            executor = null;
        }
        return task.addListener(onSuccessListener, onFailureListener, executor);
    }

    public final Task<T> addListener(final OnSuccessListener<T> onSuccess, final OnFailureListener onFailure, Executor executor) {
        synchronized (this) {
            try {
                Result<? extends T> result = this.taskResult;
                if (result == null) {
                    this.listenerHandlers.add(new ListenerHandler<>(onSuccess, onFailure, executor));
                } else {
                    final Object value = result.getValue();
                    if (Result.m15705isFailureimpl(value)) {
                        value = null;
                    }
                    final Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(result.getValue());
                    if (value != null && onSuccess != null) {
                        runWithFallbackToMain(executor, new Function0<Unit>() { // from class: ru.rustore.sdk.core.tasks.Task$addListener$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                onSuccess.onSuccess(value);
                            }
                        });
                    }
                    if (thM15702exceptionOrNullimpl != null && onFailure != null) {
                        runWithFallbackToMain(executor, new Function0<Unit>() { // from class: ru.rustore.sdk.core.tasks.Task$addListener$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                onFailure.onFailure(thM15702exceptionOrNullimpl);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public static final void runWithFallbackToMain$lambda$5(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void runWithFallbackToMain(Executor executor, final Function0<Unit> function0) {
        if (executor != null) {
            executor.execute(new Runnable() { // from class: ru.rustore.sdk.core.tasks.Task$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Task.runWithFallbackToMain$lambda$5(function0);
                }
            });
        } else {
            TaskThreadHelper.INSTANCE.getMainHandler().post(new Runnable() { // from class: ru.rustore.sdk.core.tasks.Task$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Task.runWithFallbackToMain$lambda$6(function0);
                }
            });
        }
    }

    public static final void runWithFallbackToMain$lambda$6(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* compiled from: Task.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0013\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, m7105d2 = {"Lru/rustore/sdk/core/tasks/Task$TaskResultProvider;", "", "(Lru/rustore/sdk/core/tasks/Task;)V", "setTaskErrorResult", "", "error", "", "setTaskSuccessResult", "data", "(Ljava/lang/Object;)V", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public final class TaskResultProvider {
        public TaskResultProvider() {
        }

        public final void setTaskSuccessResult(T data) {
            Task.this.setTaskResult((Task<T>) data);
        }

        public final void setTaskErrorResult(@NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Task.this.setTaskResult(error);
        }
    }

    /* compiled from: Task.kt */
    @Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u000e\u0012\f0\u0007R\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u0006J5\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062!\u0010\b\u001a\u001d\u0012\u000e\u0012\f0\u0007R\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¨\u0006\f"}, m7105d2 = {"Lru/rustore/sdk/core/tasks/Task$Companion;", "", "()V", "create", "Lkotlin/Pair;", "Lru/rustore/sdk/core/tasks/Task;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/core/tasks/Task$TaskResultProvider;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final <T> Task<T> create(@NotNull Function1<? super Task<T>.TaskResultProvider, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Task<T> task = new Task<>(null);
            block.invoke(task.new TaskResultProvider());
            return task;
        }

        @NotNull
        public final <T> Pair<Task<T>, Task<T>.TaskResultProvider> create() {
            Task task = new Task(null);
            return TuplesKt.m7112to(task, new TaskResultProvider());
        }
    }
}
