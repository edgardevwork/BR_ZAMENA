package kotlinx.coroutines.tasks;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tasks.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a!\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7105d2 = {"asDeferred", "Lkotlinx/coroutines/Deferred;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/android/gms/tasks/Task;", "cancellationTokenSource", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "asDeferredImpl", "asTask", "await", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitImpl", "kotlinx-coroutines-play-services"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,167:1\n314#2,11:168\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n139#1:168,11\n*E\n"})
/* loaded from: classes6.dex */
public final class TasksKt {
    @NotNull
    public static final <T> Task<T> asTask(@NotNull Deferred<? extends T> deferred) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        deferred.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt.asTask.1
            public final /* synthetic */ TaskCompletionSource<T> $source;
            public final /* synthetic */ Deferred<T> $this_asTask;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C109261(Deferred<? extends T> deferred2, TaskCompletionSource<T> taskCompletionSource2) {
                super(1);
                deferred = deferred2;
                taskCompletionSource = taskCompletionSource2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@Nullable Throwable th) {
                if (th instanceof CancellationException) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
                if (completionExceptionOrNull == null) {
                    taskCompletionSource.setResult(deferred.getCompleted());
                    return;
                }
                TaskCompletionSource<T> taskCompletionSource2 = taskCompletionSource;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource2.setException(runtimeExecutionException);
            }
        });
        return taskCompletionSource2.getTask();
    }

    /* compiled from: Tasks.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: kotlinx.coroutines.tasks.TasksKt$asTask$1 */
    /* loaded from: classes7.dex */
    public static final class C109261 extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ TaskCompletionSource<T> $source;
        public final /* synthetic */ Deferred<T> $this_asTask;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C109261(Deferred<? extends T> deferred2, TaskCompletionSource<T> taskCompletionSource2) {
            super(1);
            deferred = deferred2;
            taskCompletionSource = taskCompletionSource2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) {
            if (th instanceof CancellationException) {
                cancellationTokenSource.cancel();
                return;
            }
            Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                taskCompletionSource.setResult(deferred.getCompleted());
                return;
            }
            TaskCompletionSource<T> taskCompletionSource2 = taskCompletionSource;
            Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
            if (runtimeExecutionException == null) {
                runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
            }
            taskCompletionSource2.setException(runtimeExecutionException);
        }
    }

    @NotNull
    public static final <T> Deferred<T> asDeferred(@NotNull Task<T> task) {
        return asDeferredImpl(task, null);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T> Deferred<T> asDeferred(@NotNull Task<T> task, @NotNull CancellationTokenSource cancellationTokenSource) {
        return asDeferredImpl(task, cancellationTokenSource);
    }

    public static final <T> Deferred<T> asDeferredImpl(Task<T> task, CancellationTokenSource cancellationTokenSource) {
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    Job.DefaultImpls.cancel$default((Job) completableDeferredCompletableDeferred$default, (CancellationException) null, 1, (Object) null);
                } else {
                    completableDeferredCompletableDeferred$default.complete(task.getResult());
                }
            } else {
                completableDeferredCompletableDeferred$default.completeExceptionally(exception);
            }
        } else {
            task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    TasksKt.asDeferredImpl$lambda$0(completableDeferredCompletableDeferred$default, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            completableDeferredCompletableDeferred$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.2
                public C109242() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke */
                public final void invoke2(@Nullable Throwable th) {
                    cancellationTokenSource.cancel();
                }
            });
        }
        return new Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt.asDeferredImpl.3
            public final /* synthetic */ CompletableDeferred<T> $$delegate_0;

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            @NotNull
            public ChildHandle attachChild(@NotNull ChildJob childJob) {
                return completableDeferred.attachChild(childJob);
            }

            @Override // kotlinx.coroutines.Deferred
            @Nullable
            public Object await(@NotNull Continuation<? super T> continuation) {
                return completableDeferred.await(continuation);
            }

            @Override // kotlinx.coroutines.Job
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public /* synthetic */ void cancel() {
                completableDeferred.cancel();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(@Nullable CancellationException cause) {
                completableDeferred.cancel(cause);
            }

            @Override // kotlinx.coroutines.Job
            @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public /* synthetic */ boolean cancel(Throwable cause) {
                return completableDeferred.cancel(cause);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
                return (R) completableDeferred.fold(initial, operation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            @Nullable
            public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
                return (E) completableDeferred.get(key);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            @NotNull
            public CancellationException getCancellationException() {
                return completableDeferred.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            @NotNull
            public Sequence<Job> getChildren() {
                return completableDeferred.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            public T getCompleted() {
                return completableDeferred.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            @ExperimentalCoroutinesApi
            @Nullable
            public Throwable getCompletionExceptionOrNull() {
                return completableDeferred.getCompletionExceptionOrNull();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            @NotNull
            public CoroutineContext.Key<?> getKey() {
                return completableDeferred.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            @NotNull
            public SelectClause1<T> getOnAwait() {
                return completableDeferred.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            @NotNull
            public SelectClause0 getOnJoin() {
                return completableDeferred.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            @Nullable
            public Job getParent() {
                return completableDeferred.getParent();
            }

            @Override // kotlinx.coroutines.Job
            @NotNull
            public DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> handler) {
                return completableDeferred.invokeOnCompletion(handler);
            }

            @Override // kotlinx.coroutines.Job
            @InternalCoroutinesApi
            @NotNull
            public DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
                return completableDeferred.invokeOnCompletion(onCancelling, invokeImmediately, handler);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return completableDeferred.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return completableDeferred.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return completableDeferred.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            @Nullable
            public Object join(@NotNull Continuation<? super Unit> continuation) {
                return completableDeferred.join(continuation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            @NotNull
            public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
                return completableDeferred.minusKey(key);
            }

            @Override // kotlin.coroutines.CoroutineContext
            @NotNull
            public CoroutineContext plus(@NotNull CoroutineContext context) {
                return completableDeferred.plus(context);
            }

            @Override // kotlinx.coroutines.Job
            @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
            @NotNull
            public Job plus(@NotNull Job other) {
                return completableDeferred.plus(other);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return completableDeferred.start();
            }

            public C109253(final CompletableDeferred<T> completableDeferredCompletableDeferred$default2) {
                completableDeferred = completableDeferredCompletableDeferred$default2;
            }
        };
    }

    public static final void asDeferredImpl$lambda$0(CompletableDeferred completableDeferred, Task task) {
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                Job.DefaultImpls.cancel$default((Job) completableDeferred, (CancellationException) null, 1, (Object) null);
                return;
            } else {
                completableDeferred.complete(task.getResult());
                return;
            }
        }
        completableDeferred.completeExceptionally(exception);
    }

    /* compiled from: Tasks.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: kotlinx.coroutines.tasks.TasksKt$asDeferredImpl$2 */
    /* loaded from: classes7.dex */
    public static final class C109242 extends Lambda implements Function1<Throwable, Unit> {
        public C109242() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@Nullable Throwable th) {
            cancellationTokenSource.cancel();
        }
    }

    /* compiled from: Tasks.kt */
    @Metadata(m7104d1 = {"\u0000\u0089\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0011\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0097\u0001J\u0011\u0010\u001f\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\"H\u0097\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0097\u0001J\u0019\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0096\u0001J6\u0010'\u001a\u0002H(\"\u0004\b\u0001\u0010(2\u0006\u0010)\u001a\u0002H(2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u0002H(\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u0002H(0+H\u0096\u0001¢\u0006\u0002\u0010-J(\u0010.\u001a\u0004\u0018\u0001H/\"\b\b\u0001\u0010/*\u00020,2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H/0\rH\u0096\u0003¢\u0006\u0002\u00100J\r\u00101\u001a\u00060%j\u0002`&H\u0097\u0001J\u000e\u00102\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0002\u00103J\u000b\u00104\u001a\u0004\u0018\u00010$H\u0097\u0001JB\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2'\u00109\u001a#\u0012\u0015\u0012\u0013\u0018\u00010$¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\"0:j\u0002`=H\u0097\u0001J2\u00105\u001a\u0002062'\u00109\u001a#\u0012\u0015\u0012\u0013\u0018\u00010$¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\"0:j\u0002`=H\u0096\u0001J\u0011\u0010>\u001a\u00020\"H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010 J\u0015\u0010?\u001a\u00020@2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0096\u0001J\u0011\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@H\u0096\u0003J\u0011\u0010A\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0004H\u0097\u0003J\t\u0010D\u001a\u00020\bH\u0096\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0012\u0010\u000b\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, m7105d2 = {"kotlinx/coroutines/tasks/TasksKt$asDeferredImpl$3", "Lkotlinx/coroutines/Deferred;", P2CompositeParser.ChildrenHandler.CHILDREN, "Lkotlin/sequences/Sequence;", "Lkotlinx/coroutines/Job;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onAwait", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", P2CompositeParser.ChildHandler.CHILD, "Lkotlinx/coroutines/ChildJob;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", ExifInterface.LONGITUDE_EAST, "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getCancellationException", "getCompleted", "()Ljava/lang/Object;", "getCompletionExceptionOrNull", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "plus", "context", "other", TtmlNode.START, "kotlinx-coroutines-play-services"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: kotlinx.coroutines.tasks.TasksKt$asDeferredImpl$3 */
    /* loaded from: classes5.dex */
    public static final class C109253<T> implements Deferred<T> {
        public final /* synthetic */ CompletableDeferred<T> $$delegate_0;

        @Override // kotlinx.coroutines.Job
        @InternalCoroutinesApi
        @NotNull
        public ChildHandle attachChild(@NotNull ChildJob childJob) {
            return completableDeferred.attachChild(childJob);
        }

        @Override // kotlinx.coroutines.Deferred
        @Nullable
        public Object await(@NotNull Continuation<? super T> continuation) {
            return completableDeferred.await(continuation);
        }

        @Override // kotlinx.coroutines.Job
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            completableDeferred.cancel();
        }

        @Override // kotlinx.coroutines.Job
        public void cancel(@Nullable CancellationException cause) {
            completableDeferred.cancel(cause);
        }

        @Override // kotlinx.coroutines.Job
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ boolean cancel(Throwable cause) {
            return completableDeferred.cancel(cause);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
            return (R) completableDeferred.fold(initial, operation);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @Nullable
        public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
            return (E) completableDeferred.get(key);
        }

        @Override // kotlinx.coroutines.Job
        @InternalCoroutinesApi
        @NotNull
        public CancellationException getCancellationException() {
            return completableDeferred.getCancellationException();
        }

        @Override // kotlinx.coroutines.Job
        @NotNull
        public Sequence<Job> getChildren() {
            return completableDeferred.getChildren();
        }

        @Override // kotlinx.coroutines.Deferred
        @ExperimentalCoroutinesApi
        public T getCompleted() {
            return completableDeferred.getCompleted();
        }

        @Override // kotlinx.coroutines.Deferred
        @ExperimentalCoroutinesApi
        @Nullable
        public Throwable getCompletionExceptionOrNull() {
            return completableDeferred.getCompletionExceptionOrNull();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        @NotNull
        public CoroutineContext.Key<?> getKey() {
            return completableDeferred.getKey();
        }

        @Override // kotlinx.coroutines.Deferred
        @NotNull
        public SelectClause1<T> getOnAwait() {
            return completableDeferred.getOnAwait();
        }

        @Override // kotlinx.coroutines.Job
        @NotNull
        public SelectClause0 getOnJoin() {
            return completableDeferred.getOnJoin();
        }

        @Override // kotlinx.coroutines.Job
        @Nullable
        public Job getParent() {
            return completableDeferred.getParent();
        }

        @Override // kotlinx.coroutines.Job
        @NotNull
        public DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> handler) {
            return completableDeferred.invokeOnCompletion(handler);
        }

        @Override // kotlinx.coroutines.Job
        @InternalCoroutinesApi
        @NotNull
        public DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
            return completableDeferred.invokeOnCompletion(onCancelling, invokeImmediately, handler);
        }

        @Override // kotlinx.coroutines.Job
        public boolean isActive() {
            return completableDeferred.isActive();
        }

        @Override // kotlinx.coroutines.Job
        public boolean isCancelled() {
            return completableDeferred.isCancelled();
        }

        @Override // kotlinx.coroutines.Job
        public boolean isCompleted() {
            return completableDeferred.isCompleted();
        }

        @Override // kotlinx.coroutines.Job
        @Nullable
        public Object join(@NotNull Continuation<? super Unit> continuation) {
            return completableDeferred.join(continuation);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
            return completableDeferred.minusKey(key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext plus(@NotNull CoroutineContext context) {
            return completableDeferred.plus(context);
        }

        @Override // kotlinx.coroutines.Job
        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public Job plus(@NotNull Job other) {
            return completableDeferred.plus(other);
        }

        @Override // kotlinx.coroutines.Job
        public boolean start() {
            return completableDeferred.start();
        }

        public C109253(final CompletableDeferred<T> completableDeferredCompletableDeferred$default2) {
            completableDeferred = completableDeferredCompletableDeferred$default2;
        }
    }

    @Nullable
    public static final <T> Object await(@NotNull Task<T> task, @NotNull Continuation<? super T> continuation) {
        return awaitImpl(task, null, continuation);
    }

    @ExperimentalCoroutinesApi
    @Nullable
    public static final <T> Object await(@NotNull Task<T> task, @NotNull CancellationTokenSource cancellationTokenSource, @NotNull Continuation<? super T> continuation) {
        return awaitImpl(task, cancellationTokenSource, continuation);
    }

    public static final <T> Object awaitImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) throws Exception {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    throw new CancellationException("Task " + task + " was cancelled normally.");
                }
                return task.getResult();
            }
            throw exception;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        task.addOnCompleteListener(DirectExecutor.INSTANCE, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<T> task2) {
                Exception exception2 = task2.getException();
                if (exception2 == null) {
                    if (task2.isCanceled()) {
                        CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                        return;
                    }
                    Continuation continuation2 = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m15699constructorimpl(task2.getResult()));
                    return;
                }
                Continuation continuation3 = cancellableContinuationImpl;
                Result.Companion companion2 = Result.INSTANCE;
                continuation3.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(exception2)));
            }
        });
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    cancellationTokenSource.cancel();
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
