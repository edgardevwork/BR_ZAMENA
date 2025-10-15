package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@StabilityInferred(parameters = 0)
@ExperimentalTransitionApi
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0017H\u0002J\u0018\u0010\u001d\u001a\u00020\u00172\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0010¢\u0006\u0002\b R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m7105d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animatedFraction", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "currentState", "getCurrentState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "fraction", "getFraction", "()F", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getTargetState", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/compose/animation/core/Transition;", "animateToCurrentState", "", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToTargetState", "seekToFraction", "snapToFraction", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionConfigured", "transitionConfigured$animation_core_release", "animation-core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 8;

    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedFraction;
    private final S currentState;

    @NotNull
    private final SnapshotStateObserver observer;
    private final S targetState;

    @Nullable
    private Transition<S> transition;

    /* compiled from: Transition.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.animation.core.SeekableTransitionState", m7120f = "Transition.kt", m7121i = {0}, m7122l = {228}, m7123m = "snapToFraction", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1 */
    /* loaded from: classes2.dex */
    public static final class C03321 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03321(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C03321> continuation) {
            super(continuation);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.snapToFraction(0.0f, this);
        }
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return this.targetState;
    }

    public SeekableTransitionState(S s, S s2) {
        super(null);
        this.targetState = s2;
        Animatable<Float, AnimationVector1D> animatableAnimatable$default = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        animatableAnimatable$default.updateBounds(Float.valueOf(0.0f), Float.valueOf(1.0f));
        this.animatedFraction = animatableAnimatable$default;
        this.observer = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState$observer$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                invoke2((Function0<Unit>) function0);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function0<Unit> function0) {
                function0.invoke();
            }
        });
        this.currentState = s;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return this.currentState;
    }

    @FloatRange(from = 0.0d, m9to = 1.0d)
    public final float getFraction() {
        return this.animatedFraction.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object snapToFraction(@FloatRange(from = 0.0d, m9to = 1.0d) float f, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C03321 c03321;
        SeekableTransitionState<S> seekableTransitionState;
        if (continuation instanceof C03321) {
            c03321 = (C03321) continuation;
            int i = c03321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03321.label = i - Integer.MIN_VALUE;
            } else {
                c03321 = new C03321(this, continuation);
            }
        }
        Object obj = c03321.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c03321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (0.0f > f || f > 1.0f) {
                throw new IllegalArgumentException(("Expecting fraction between 0 and 1. Got " + f).toString());
            }
            if (Intrinsics.areEqual(getCurrentState(), getTargetState())) {
                return Unit.INSTANCE;
            }
            Animatable<Float, AnimationVector1D> animatable = this.animatedFraction;
            Float fBoxFloat = Boxing.boxFloat(f);
            c03321.L$0 = this;
            c03321.label = 1;
            if (animatable.snapTo(fBoxFloat, c03321) == coroutine_suspended) {
                return coroutine_suspended;
            }
            seekableTransitionState = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            seekableTransitionState = (SeekableTransitionState) c03321.L$0;
            ResultKt.throwOnFailure(obj);
        }
        seekableTransitionState.seekToFraction();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateToTargetState$default(SeekableTransitionState seekableTransitionState, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = seekableTransitionState.animatedFraction.getDefaultSpringSpec$animation_core_release();
        }
        return seekableTransitionState.animateToTargetState(finiteAnimationSpec, continuation);
    }

    @Nullable
    public final Object animateToTargetState(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, @NotNull Continuation<? super Unit> continuation) {
        if (this.transition == null || Intrinsics.areEqual(getCurrentState(), getTargetState())) {
            return Unit.INSTANCE;
        }
        Object objAnimateTo$default = Animatable.animateTo$default(this.animatedFraction, Boxing.boxFloat(1.0f), finiteAnimationSpec, null, new Function1<Animatable<Float, AnimationVector1D>, Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState.animateToTargetState.2
            public final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animatable) {
                this.this$0.seekToFraction();
            }
        }, continuation, 4, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateToCurrentState$default(SeekableTransitionState seekableTransitionState, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = seekableTransitionState.animatedFraction.getDefaultSpringSpec$animation_core_release();
        }
        return seekableTransitionState.animateToCurrentState(finiteAnimationSpec, continuation);
    }

    @Nullable
    public final Object animateToCurrentState(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, @NotNull Continuation<? super Unit> continuation) {
        if (this.transition == null || Intrinsics.areEqual(getCurrentState(), getTargetState())) {
            return Unit.INSTANCE;
        }
        Object objAnimateTo$default = Animatable.animateTo$default(this.animatedFraction, Boxing.boxFloat(0.0f), finiteAnimationSpec, null, new Function1<Animatable<Float, AnimationVector1D>, Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState.animateToCurrentState.2
            public final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animatable) {
                this.this$0.seekToFraction();
            }
        }, continuation, 4, null);
        return objAnimateTo$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@NotNull Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (transition2 != null && !Intrinsics.areEqual(transition, transition2)) {
            throw new IllegalStateException(("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition).toString());
        }
        this.transition = transition;
        seekToFraction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        final Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        final Ref.LongRef longRef = new Ref.LongRef();
        this.observer.observeReads(Unit.INSTANCE, new Function1<Unit, Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState.seekToFraction.1
            public final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Unit unit) {
                this.this$0.seekToFraction();
            }
        }, new Function0<Unit>() { // from class: androidx.compose.animation.core.SeekableTransitionState.seekToFraction.2
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
                longRef.element = transition.getTotalDurationNanos();
            }
        });
        transition.seek(getCurrentState(), getTargetState(), MathKt__MathJVMKt.roundToLong(this.animatedFraction.getValue().floatValue() * longRef.element));
    }
}
