package ru.rustore.sdk.core.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.core.tasks.Task;

/* compiled from: TaskCoroutineExtensions.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"toSuspendResult", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "Lru/rustore/sdk/core/tasks/Task;", "(Lru/rustore/sdk/core/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk-public-core_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class TaskCoroutineExtensionsKt {

    /* compiled from: TaskCoroutineExtensions.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt", m7120f = "TaskCoroutineExtensions.kt", m7121i = {0, 0}, m7122l = {36}, m7123m = "toSuspendResult", m7124n = {"$this$toSuspendResult", "executor"}, m7125s = {"L$0", "L$1"})
    /* renamed from: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$1 */
    /* loaded from: classes5.dex */
    public static final class C115761<T> extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C115761(Continuation<? super C115761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object suspendResult = TaskCoroutineExtensionsKt.toSuspendResult(null, this);
            return suspendResult == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? suspendResult : Result.m15698boximpl(suspendResult);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object toSuspendResult(@NotNull final Task<T> task, @NotNull Continuation<? super Result<? extends T>> continuation) throws Throwable {
        C115761 c115761;
        if (continuation instanceof C115761) {
            c115761 = (C115761) continuation;
            int i = c115761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c115761.label = i - Integer.MIN_VALUE;
            } else {
                c115761 = new C115761(continuation);
            }
        }
        Object result = c115761.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c115761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) c115761.get$context().get(CoroutineDispatcher.INSTANCE);
            Executor executorAsExecutor = coroutineDispatcher != null ? ExecutorsKt.asExecutor(coroutineDispatcher) : null;
            c115761.L$0 = task;
            c115761.L$1 = executorAsExecutor;
            c115761.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c115761), 1);
            cancellableContinuationImpl.initCancellability();
            if (executorAsExecutor == null) {
                task.addOnSuccessListener(new OnSuccessListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$1
                    @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                    public final void onSuccess(T t) {
                        CancellableContinuation<Result<? extends T>> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        CancellableContinuationExtKt.resumeIfActive(cancellableContinuation, Result.m15698boximpl(Result.m15699constructorimpl(t)));
                    }
                });
                task.addOnFailureListener(new OnFailureListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$2
                    @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                    public final void onFailure(Throwable throwable) {
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        CancellableContinuation<Result<? extends T>> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        CancellableContinuationExtKt.resumeIfActive(cancellableContinuation, Result.m15698boximpl(Result.m15699constructorimpl(ResultKt.createFailure(throwable))));
                    }
                });
            } else {
                task.addOnSuccessListener(executorAsExecutor, new OnSuccessListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$3
                    @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                    public final void onSuccess(T t) {
                        CancellableContinuation<Result<? extends T>> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        CancellableContinuationExtKt.resumeIfActive(cancellableContinuation, Result.m15698boximpl(Result.m15699constructorimpl(t)));
                    }
                });
                task.addOnFailureListener(executorAsExecutor, new OnFailureListener() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$4
                    @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                    public final void onFailure(Throwable throwable) {
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        CancellableContinuation<Result<? extends T>> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        CancellableContinuationExtKt.resumeIfActive(cancellableContinuation, Result.m15698boximpl(Result.m15699constructorimpl(ResultKt.createFailure(throwable))));
                    }
                });
            }
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: ru.rustore.sdk.core.util.TaskCoroutineExtensionsKt$toSuspendResult$2$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    task.cancel();
                }
            });
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c115761);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(result);
        }
        return ((Result) result).getValue();
    }
}
