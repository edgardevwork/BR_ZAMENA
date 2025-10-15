package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p003ui.MotionDurationScale;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scrollable.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0096@¢\u0006\u0002\u0010\u0015R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "motionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "getFlingDecay", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "setFlingDecay", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "lastAnimationCycleCount", "", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "performFling", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class DefaultFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;

    @NotNull
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;

    @NotNull
    private final MotionDurationScale motionDurationScale;

    public DefaultFlingBehavior(@NotNull DecayAnimationSpec<Float> decayAnimationSpec, @NotNull MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    @NotNull
    public final DecayAnimationSpec<Float> getFlingDecay() {
        return this.flingDecay;
    }

    public final void setFlingDecay(@NotNull DecayAnimationSpec<Float> decayAnimationSpec) {
        this.flingDecay = decayAnimationSpec;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void setLastAnimationCycleCount(int i) {
        this.lastAnimationCycleCount = i;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope, float f, @NotNull Continuation<? super Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return BuildersKt.withContext(this.motionDurationScale, new C04452(f, this, scrollScope, null), continuation);
    }

    /* compiled from: Scrollable.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m7120f = "Scrollable.kt", m7121i = {0, 0}, m7122l = {965}, m7123m = "invokeSuspend", m7124n = {"velocityLeft", "animationState"}, m7125s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 */
    /* loaded from: classes3.dex */
    public static final class C04452 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
        public final /* synthetic */ float $initialVelocity;
        public final /* synthetic */ ScrollScope $this_performFling;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04452(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation<? super C04452> continuation) {
            super(2, continuation);
            this.$initialVelocity = f;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04452(this.$initialVelocity, this.this$0, this.$this_performFling, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Float> continuation) {
            return ((C04452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            float f;
            Ref.FloatRef floatRef;
            AnimationState animationState;
            DecayAnimationSpec<Float> flingDecay;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (Math.abs(this.$initialVelocity) > 1.0f) {
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = this.$initialVelocity;
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                    try {
                        flingDecay = this.this$0.getFlingDecay();
                        anonymousClass1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                            public final /* synthetic */ ScrollScope $this_performFling;
                            public final /* synthetic */ Ref.FloatRef $velocityLeft;
                            public final /* synthetic */ DefaultFlingBehavior this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(ScrollScope scrollScope, Ref.FloatRef floatRef22, DefaultFlingBehavior defaultFlingBehavior) {
                                super(1);
                                scrollScope = scrollScope;
                                floatRef = floatRef22;
                                defaultFlingBehavior = defaultFlingBehavior;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                invoke2(animationScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke */
                            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                                float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
                                float fScrollBy = scrollScope.scrollBy(fFloatValue);
                                floatRef.element = animationScope.getValue().floatValue();
                                floatRef.element = animationScope.getVelocity().floatValue();
                                if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                                    animationScope.cancelAnimation();
                                }
                                DefaultFlingBehavior defaultFlingBehavior = defaultFlingBehavior;
                                defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
                            }
                        };
                        this.L$0 = floatRef22;
                        this.L$1 = animationStateAnimationState$default;
                        this.label = 1;
                    } catch (CancellationException unused) {
                        floatRef = floatRef22;
                        animationState = animationStateAnimationState$default;
                        floatRef.element = ((Number) animationState.getVelocity()).floatValue();
                        f = floatRef.element;
                        return Boxing.boxFloat(f);
                    }
                    if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, flingDecay, false, anonymousClass1, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef22;
                    f = floatRef.element;
                } else {
                    f = this.$initialVelocity;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.L$1;
                floatRef = (Ref.FloatRef) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused2) {
                    floatRef.element = ((Number) animationState.getVelocity()).floatValue();
                    f = floatRef.element;
                    return Boxing.boxFloat(f);
                }
                f = floatRef.element;
            }
            return Boxing.boxFloat(f);
        }

        /* compiled from: Scrollable.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2$1 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
            public final /* synthetic */ ScrollScope $this_performFling;
            public final /* synthetic */ Ref.FloatRef $velocityLeft;
            public final /* synthetic */ DefaultFlingBehavior this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ScrollScope scrollScope, Ref.FloatRef floatRef22, DefaultFlingBehavior defaultFlingBehavior) {
                super(1);
                scrollScope = scrollScope;
                floatRef = floatRef22;
                defaultFlingBehavior = defaultFlingBehavior;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
                float fScrollBy = scrollScope.scrollBy(fFloatValue);
                floatRef.element = animationScope.getValue().floatValue();
                floatRef.element = animationScope.getVelocity().floatValue();
                if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                    animationScope.cancelAnimation();
                }
                DefaultFlingBehavior defaultFlingBehavior = defaultFlingBehavior;
                defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
            }
        }
    }
}
