package io.ktor.util.pipeline;

import androidx.core.net.MailTo;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.util.KtorDsl;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugPipelineContext.kt */
@KtorDsl
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004Bg\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012H\u0010\u0006\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u0007\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001b\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0016J\u0011\u0010\u001e\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0019\u0010!\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000RP\u0010\u0006\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00028\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m7105d2 = {"Lio/ktor/util/pipeline/DebugPipelineContext;", "TSubject", "", "TContext", "Lio/ktor/util/pipeline/PipelineContext;", "context", "interceptors", "", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", MailTo.SUBJECT, "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", FirebaseAnalytics.Param.INDEX, "", "getSubject", "()Ljava/lang/Object;", "setSubject", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "execute", "initial", "execute$ktor_utils", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finish", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedLoop", "proceedWith", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class DebugPipelineContext<TSubject, TContext> extends PipelineContext<TSubject, TContext> {

    @NotNull
    public final CoroutineContext coroutineContext;
    public int index;

    @NotNull
    public final List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> interceptors;

    @NotNull
    public TSubject subject;

    /* compiled from: DebugPipelineContext.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.pipeline.DebugPipelineContext", m7120f = "DebugPipelineContext.kt", m7121i = {0}, m7122l = {80}, m7123m = "proceedLoop", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1 */
    /* loaded from: classes5.dex */
    public static final class C103771 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ DebugPipelineContext<TSubject, TContext> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103771(DebugPipelineContext<TSubject, TContext> debugPipelineContext, Continuation<? super C103771> continuation) {
            super(continuation);
            this.this$0 = debugPipelineContext;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.proceedLoop(this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugPipelineContext(@NotNull TContext context, @NotNull List<? extends Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object>> interceptors, @NotNull TSubject subject, @NotNull CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.interceptors = interceptors;
        this.coroutineContext = coroutineContext;
        this.subject = subject;
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
        this.index = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    @Nullable
    public Object proceedWith(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        setSubject(tsubject);
        return proceed(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    @Nullable
    public Object proceed(@NotNull Continuation<? super TSubject> continuation) {
        int i = this.index;
        if (i < 0) {
            return getSubject();
        }
        if (i >= this.interceptors.size()) {
            finish();
            return getSubject();
        }
        return proceedLoop(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    @Nullable
    public Object execute$ktor_utils(@NotNull TSubject tsubject, @NotNull Continuation<? super TSubject> continuation) {
        this.index = 0;
        setSubject(tsubject);
        return proceed(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object proceedLoop(Continuation<? super TSubject> continuation) throws Throwable {
        C103771 c103771;
        DebugPipelineContext<TSubject, TContext> debugPipelineContext;
        Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object> function3;
        TSubject subject;
        if (continuation instanceof C103771) {
            c103771 = (C103771) continuation;
            int i = c103771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103771.label = i - Integer.MIN_VALUE;
            } else {
                c103771 = new C103771(this, continuation);
            }
        }
        Object obj = c103771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c103771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            debugPipelineContext = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            debugPipelineContext = (DebugPipelineContext) c103771.L$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            int i3 = debugPipelineContext.index;
            if (i3 != -1) {
                List<Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object>> list = debugPipelineContext.interceptors;
                if (i3 >= list.size()) {
                    debugPipelineContext.finish();
                } else {
                    function3 = list.get(i3);
                    debugPipelineContext.index = i3 + 1;
                    Intrinsics.checkNotNull(function3, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                    subject = debugPipelineContext.getSubject();
                    c103771.L$0 = debugPipelineContext;
                    c103771.label = 1;
                }
            }
            return debugPipelineContext.getSubject();
        } while (function3.invoke(debugPipelineContext, subject, c103771) != coroutine_suspended);
        return coroutine_suspended;
    }
}
