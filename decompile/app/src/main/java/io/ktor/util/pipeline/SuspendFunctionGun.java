package io.ktor.util.pipeline;

import androidx.core.net.MailTo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuspendFunctionGun.kt */
@Metadata(m7104d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B_\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012H\u0010\u0007\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f0\b¢\u0006\u0002\u0010\rJ\u0016\u0010\u001f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J\b\u0010 \u001a\u00020\u000bH\u0002J\u001b\u0010!\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u000bH\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\u0011\u0010(\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001e\u0010+\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u001aRP\u0010\u0007\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u00028\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m7105d2 = {"Lio/ktor/util/pipeline/SuspendFunctionGun;", "TSubject", "", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "initial", "context", "blocks", "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "continuation", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", FirebaseAnalytics.Param.INDEX, "", "lastSuspensionIndex", MailTo.SUBJECT, "getSubject", "()Ljava/lang/Object;", "setSubject", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "suspensions", "", "[Lkotlin/coroutines/Continuation;", "addContinuation", "discardLastRootContinuation", "execute", "execute$ktor_utils", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finish", "loop", "", "direct", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWith", "resumeRootWith", "result", "Lkotlin/Result;", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class SuspendFunctionGun<TSubject, TContext> extends PipelineContext<TSubject, TContext> {

    @NotNull
    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> blocks;

    @NotNull
    public final Continuation<Unit> continuation;
    public int index;
    public int lastSuspensionIndex;

    @NotNull
    public TSubject subject;

    @NotNull
    public final Continuation<TSubject>[] suspensions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendFunctionGun(@NotNull TSubject initial, @NotNull TContext context, @NotNull List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> blocks) {
        super(context);
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.continuation = new SuspendFunctionGun$continuation$1(this);
        this.subject = initial;
        this.suspensions = new Continuation[blocks.size()];
        this.lastSuspensionIndex = -1;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.continuation.get$context();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    @NotNull
    public TSubject getSubject() {
        return this.subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void setSubject(@NotNull TSubject tsubject) {
        Intrinsics.checkNotNullParameter(tsubject, "<set-?>");
        this.subject = tsubject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public void finish() {
        this.index = this.blocks.size();
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    @Nullable
    public Object proceed(@NotNull Continuation<? super TSubject> continuation) {
        Object coroutine_suspended;
        if (this.index == this.blocks.size()) {
            coroutine_suspended = getSubject();
        } else {
            addContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
            if (loop(true)) {
                discardLastRootContinuation();
                coroutine_suspended = getSubject();
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
        }
        if (coroutine_suspended == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    @Nullable
    public Object proceedWith(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        setSubject(tsubject);
        return proceed(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    @Nullable
    public Object execute$ktor_utils(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        this.index = 0;
        if (this.blocks.size() == 0) {
            return tsubject;
        }
        setSubject(tsubject);
        if (this.lastSuspensionIndex >= 0) {
            throw new IllegalStateException("Already started");
        }
        return proceed(continuation);
    }

    public final boolean loop(boolean direct) {
        int i;
        do {
            i = this.index;
            if (i == this.blocks.size()) {
                if (direct) {
                    return true;
                }
                Result.Companion companion = Result.INSTANCE;
                resumeRootWith(Result.m15699constructorimpl(getSubject()));
                return false;
            }
            this.index = i + 1;
            try {
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                resumeRootWith(Result.m15699constructorimpl(ResultKt.createFailure(th)));
                return false;
            }
        } while (this.blocks.get(i).invoke(this, getSubject(), this.continuation) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED());
        return false;
    }

    public final void resumeRootWith(Object result) {
        int i = this.lastSuspensionIndex;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume".toString());
        }
        Continuation<TSubject> continuation = this.suspensions[i];
        Intrinsics.checkNotNull(continuation);
        Continuation<TSubject>[] continuationArr = this.suspensions;
        int i2 = this.lastSuspensionIndex;
        this.lastSuspensionIndex = i2 - 1;
        continuationArr[i2] = null;
        if (!Result.m15705isFailureimpl(result)) {
            continuation.resumeWith(result);
            return;
        }
        Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(result);
        Intrinsics.checkNotNull(thM15702exceptionOrNullimpl);
        Throwable thRecoverStackTraceBridge = StackTraceRecoverKt.recoverStackTraceBridge(thM15702exceptionOrNullimpl, continuation);
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m15699constructorimpl(ResultKt.createFailure(thRecoverStackTraceBridge)));
    }

    public final void discardLastRootContinuation() {
        int i = this.lastSuspensionIndex;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation<TSubject>[] continuationArr = this.suspensions;
        this.lastSuspensionIndex = i - 1;
        continuationArr[i] = null;
    }

    public final void addContinuation(Continuation<? super TSubject> continuation) {
        Continuation<TSubject>[] continuationArr = this.suspensions;
        int i = this.lastSuspensionIndex + 1;
        this.lastSuspensionIndex = i;
        continuationArr[i] = continuation;
    }
}
