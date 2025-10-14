package androidx.compose.material3;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tooltip.kt */
@Stable
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "()Z", "isVisible", "job", "Lkotlinx/coroutines/CancellableContinuation;", "", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/compose/animation/core/MutableTransitionState;", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "dismiss", "onDispose", "show", "mutatePriority", "Landroidx/compose/foundation/MutatePriority;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TooltipStateImpl implements TooltipState {
    public final boolean isPersistent;

    @Nullable
    public CancellableContinuation<? super Unit> job;

    @NotNull
    public final MutatorMutex mutatorMutex;

    @NotNull
    public final MutableTransitionState<Boolean> transition;

    public TooltipStateImpl(boolean z, boolean z2, @NotNull MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.transition = new MutableTransitionState<>(Boolean.valueOf(z));
    }

    @Override // androidx.compose.material3.BasicTooltipState
    /* renamed from: isPersistent, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.TooltipState
    @NotNull
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.BasicTooltipState
    /* renamed from: isVisible */
    public boolean getIsVisible() {
        return getTransition().getCurrentState().booleanValue() || getTransition().getTargetState().booleanValue();
    }

    @Override // androidx.compose.material3.BasicTooltipState
    @Nullable
    public Object show(@NotNull MutatePriority mutatePriority, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate = this.mutatorMutex.mutate(mutatePriority, new C17122(new TooltipStateImpl$show$cancellableShow$1(this, null), null), continuation);
        return objMutate == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    /* compiled from: Tooltip.kt */
    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.material3.TooltipStateImpl$show$2", m7120f = "Tooltip.kt", m7121i = {}, m7122l = {590, 592}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2 */
    /* loaded from: classes2.dex */
    public static final class C17122 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> $cancellableShow;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C17122(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C17122> continuation) {
            super(1, continuation);
            this.$cancellableShow = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return TooltipStateImpl.this.new C17122(this.$cancellableShow, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C17122) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (TooltipStateImpl.this.getIsPersistent()) {
                        Function1<Continuation<? super Unit>, Object> function1 = this.$cancellableShow;
                        this.label = 1;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellableShow, null);
                        this.label = 2;
                        if (TimeoutKt.withTimeout(1500L, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                TooltipStateImpl.this.dismiss();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                TooltipStateImpl.this.dismiss();
                throw th;
            }
        }

        /* compiled from: Tooltip.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "androidx.compose.material3.TooltipStateImpl$show$2$1", m7120f = "Tooltip.kt", m7121i = {}, m7122l = {593}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Continuation<? super Unit>, Object> $cancellableShow;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cancellableShow = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$cancellableShow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super Unit>, Object> function1 = this.$cancellableShow;
                    this.label = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void dismiss() {
        getTransition().setTargetState(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void onDispose() {
        CancellableContinuation<? super Unit> cancellableContinuation = this.job;
        if (cancellableContinuation != null) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
        }
    }
}
