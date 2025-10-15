package ru.rustore.sdk.core.tasks;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.tasks.Task;

/* compiled from: TaskHelper.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bJ?\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m7105d2 = {"Lru/rustore/sdk/core/tasks/TaskHelper;", "", "()V", "forException", "Lru/rustore/sdk/core/tasks/Task;", ExifInterface.GPS_DIRECTION_TRUE, "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "wrap", "taskDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "task", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;)Lru/rustore/sdk/core/tasks/Task;", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class TaskHelper {

    @NotNull
    public static final TaskHelper INSTANCE = new TaskHelper();

    public static /* synthetic */ Task wrap$default(TaskHelper taskHelper, CoroutineDispatcher coroutineDispatcher, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getDefault();
        }
        return taskHelper.wrap(coroutineDispatcher, function1);
    }

    /* compiled from: TaskHelper.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u001b0\u0003R\u0017\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00070\u0004H\n¢\u0006\u0002\b\b"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/core/tasks/Task$TaskResultProvider;", "Lru/rustore/sdk/core/tasks/Task;", "Lkotlin/ParameterName;", "name", "value", "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.core.tasks.TaskHelper$wrap$1 */
    /* loaded from: classes5.dex */
    public static final class C115731 extends Lambda implements Function1<Task<T>.TaskResultProvider, Unit> {
        public final /* synthetic */ Function1<Continuation<? super T>, Object> $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115731(Function1<? super Continuation<? super T>, ? extends Object> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((Task.TaskResultProvider) obj);
            return Unit.INSTANCE;
        }

        /* compiled from: TaskHelper.kt */
        @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "ru.rustore.sdk.core.tasks.TaskHelper$wrap$1$1", m7120f = "TaskHelper.kt", m7121i = {}, m7122l = {20}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: ru.rustore.sdk.core.tasks.TaskHelper$wrap$1$1 */
        /* loaded from: classes8.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Continuation<? super T>, Object> $task;
            public final /* synthetic */ Task<T>.TaskResultProvider $this_create;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Task<T>.TaskResultProvider taskResultProvider, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_create = taskResultProvider;
                this.$task = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_create, this.$task, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM15699constructorimpl;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function1<Continuation<? super T>, Object> function1 = this.$task;
                        Result.Companion companion = Result.INSTANCE;
                        this.label = 1;
                        obj = function1.invoke(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM15699constructorimpl = Result.m15699constructorimpl(obj);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                }
                Task<T>.TaskResultProvider taskResultProvider = this.$this_create;
                if (Result.m15706isSuccessimpl(objM15699constructorimpl)) {
                    taskResultProvider.setTaskSuccessResult(objM15699constructorimpl);
                }
                Task<T>.TaskResultProvider taskResultProvider2 = this.$this_create;
                Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
                if (thM15702exceptionOrNullimpl != null) {
                    taskResultProvider2.setTaskErrorResult(thM15702exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Task<T>.TaskResultProvider create) {
            Intrinsics.checkNotNullParameter(create, "$this$create");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(create, function1, null), 3, null);
        }
    }

    @NotNull
    public final <T> Task<T> wrap(@NotNull CoroutineDispatcher taskDispatcher, @NotNull Function1<? super Continuation<? super T>, ? extends Object> task) {
        Intrinsics.checkNotNullParameter(taskDispatcher, "taskDispatcher");
        Intrinsics.checkNotNullParameter(task, "task");
        final CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(taskDispatcher.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));
        Task<T> taskCreate = Task.INSTANCE.create(new Function1<Task<T>.TaskResultProvider, Unit>() { // from class: ru.rustore.sdk.core.tasks.TaskHelper.wrap.1
            public final /* synthetic */ Function1<Continuation<? super T>, Object> $task;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C115731(Function1<? super Continuation<? super T>, ? extends Object> task2) {
                super(1);
                function1 = task2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((Task.TaskResultProvider) obj);
                return Unit.INSTANCE;
            }

            /* compiled from: TaskHelper.kt */
            @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
            @DebugMetadata(m7119c = "ru.rustore.sdk.core.tasks.TaskHelper$wrap$1$1", m7120f = "TaskHelper.kt", m7121i = {}, m7122l = {20}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
            /* renamed from: ru.rustore.sdk.core.tasks.TaskHelper$wrap$1$1 */
            /* loaded from: classes8.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ Function1<Continuation<? super T>, Object> $task;
                public final /* synthetic */ Task<T>.TaskResultProvider $this_create;
                public /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(Task<T>.TaskResultProvider taskResultProvider, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$this_create = taskResultProvider;
                    this.$task = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_create, this.$task, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM15699constructorimpl;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Function1<Continuation<? super T>, Object> function1 = this.$task;
                            Result.Companion companion = Result.INSTANCE;
                            this.label = 1;
                            obj = function1.invoke(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        objM15699constructorimpl = Result.m15699constructorimpl(obj);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                    }
                    Task<T>.TaskResultProvider taskResultProvider = this.$this_create;
                    if (Result.m15706isSuccessimpl(objM15699constructorimpl)) {
                        taskResultProvider.setTaskSuccessResult(objM15699constructorimpl);
                    }
                    Task<T>.TaskResultProvider taskResultProvider2 = this.$this_create;
                    Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
                    if (thM15702exceptionOrNullimpl != null) {
                        taskResultProvider2.setTaskErrorResult(thM15702exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
            }

            public final void invoke(Task<T>.TaskResultProvider create) {
                Intrinsics.checkNotNullParameter(create, "$this$create");
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(create, function1, null), 3, null);
            }
        });
        taskCreate.addOnCompletionListener(new OnCompletionListener() { // from class: ru.rustore.sdk.core.tasks.TaskHelper$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnCompletionListener
            public final void onComplete(Throwable th) {
                TaskHelper.wrap$lambda$1$lambda$0(CoroutineScope, th);
            }
        });
        return taskCreate;
    }

    public static final void wrap$lambda$1$lambda$0(CoroutineScope coroutineScope, Throwable th) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        if (th instanceof TaskCancellationException) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
    }

    /* compiled from: TaskHelper.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f0\u0003R\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/core/tasks/Task$TaskResultProvider;", "Lru/rustore/sdk/core/tasks/Task;", "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.core.tasks.TaskHelper$forException$1 */
    /* loaded from: classes5.dex */
    public static final class C115721 extends Lambda implements Function1<Task<T>.TaskResultProvider, Unit> {
        public final /* synthetic */ Exception $exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115721(Exception exc) {
            super(1);
            exc = exc;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((Task.TaskResultProvider) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Task<T>.TaskResultProvider create) {
            Intrinsics.checkNotNullParameter(create, "$this$create");
            create.setTaskErrorResult(exc);
        }
    }

    @NotNull
    public final <T> Task<T> forException(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return Task.INSTANCE.create(new Function1<Task<T>.TaskResultProvider, Unit>() { // from class: ru.rustore.sdk.core.tasks.TaskHelper.forException.1
            public final /* synthetic */ Exception $exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C115721(Exception exception2) {
                super(1);
                exc = exception2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((Task.TaskResultProvider) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Task<T>.TaskResultProvider create) {
                Intrinsics.checkNotNullParameter(create, "$this$create");
                create.setTaskErrorResult(exc);
            }
        });
    }
}
