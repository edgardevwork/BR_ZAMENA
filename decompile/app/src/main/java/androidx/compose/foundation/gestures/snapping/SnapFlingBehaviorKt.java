package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(m7104d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001ak\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00120%H\u0082@¢\u0006\u0002\u0010)\u001as\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0!2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00120%H\u0082@¢\u0006\u0002\u0010.\u001ae\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001e2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d032!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00120%H\u0082@¢\u0006\u0002\u00104\u001a\u0014\u00105\u001a\u00020\b*\u00020\b2\u0006\u00106\u001a\u00020\bH\u0002\u001a(\u00107\u001a\u0002H8\"\u000e\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H809*\b\u0012\u0004\u0012\u0002H80:H\u0082\u0002¢\u0006\u0002\u0010;\u001a(\u0010<\u001a\u0002H8\"\u000e\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H809*\b\u0012\u0004\u0012\u0002H80:H\u0082\u0002¢\u0006\u0002\u0010;\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, m7105d2 = {"DEBUG", "", "MinFlingVelocityDp", "Landroidx/compose/ui/unit/Dp;", "getMinFlingVelocityDp", "()F", "F", "NoDistance", "", "NoVelocity", "calculateFinalOffset", "snappingOffset", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "lowerBound", "upperBound", "calculateFinalOffset-Fhqu1e0", "(IFF)F", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "animateDecay", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "targetOffset", "animationState", "Landroidx/compose/animation/core/AnimationState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "onAnimationStep", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "delta", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateWithTarget", "cancelOffset", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "approach", "initialTargetOffset", "initialVelocity", GlideExecutor.DEFAULT_ANIMATION_EXECUTOR_NAME, "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", "target", "component1", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "component2", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,538:1\n534#1,4:550\n534#1,4:554\n534#1,4:558\n74#2:539\n67#3,3:540\n66#3:543\n1116#4,6:544\n154#5:562\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n381#1:550,4\n425#1:554,4\n508#1:558,4\n286#1:539\n288#1:540,3\n288#1:543\n288#1:544,6\n494#1:562\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = C2046Dp.m13666constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m7120f = "SnapFlingBehavior.kt", m7121i = {0, 0, 0}, m7122l = {364}, m7123m = "animateDecay", m7124n = {"animationState", "previousValue", "targetOffset"}, m7125s = {"L$0", "L$1", "F$0"})
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 */
    public static final class C05221 extends ContinuationImpl {
        public float F$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C05221(Continuation<? super C05221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        }
    }

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m7120f = "SnapFlingBehavior.kt", m7121i = {0, 0, 0, 0}, m7122l = {HttpStatus.SC_CONFLICT}, m7123m = "animateWithTarget", m7124n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, m7125s = {"L$0", "L$1", "F$0", "F$1"})
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 */
    public static final class C05241 extends ContinuationImpl {
        public float F$0;
        public float F$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C05241(Continuation<? super C05241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehaviorKt.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    @Composable
    @ExperimentalFoundationApi
    @NotNull
    public static final SnapFlingBehavior rememberSnapFlingBehavior(@NotNull SnapLayoutInfoProvider snapLayoutInfoProvider, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-473984552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:284)");
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(snapLayoutInfoProvider) | composer.changed(decayAnimationSpecRememberSplineBasedDecay);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), decayAnimationSpecRememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object approach(ScrollScope scrollScope, float f, float f2, ApproachAnimation<Float, AnimationVector1D> approachAnimation, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        return approachAnimation.approachAnimation(scrollScope, Boxing.boxFloat(f), Boxing.boxFloat(f2), function1, continuation);
    }

    private static final <T extends Comparable<? super T>> T component1(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getEndInclusive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateDecay(final ScrollScope scrollScope, final float f, AnimationState<Float, AnimationVector1D> animationState, DecayAnimationSpec<Float> decayAnimationSpec, final Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) throws Throwable {
        C05221 c05221;
        Ref.FloatRef floatRef;
        if (continuation instanceof C05221) {
            c05221 = (C05221) continuation;
            int i = c05221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05221.label = i - Integer.MIN_VALUE;
            } else {
                c05221 = new C05221(continuation);
            }
        }
        Object obj = c05221.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c05221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                    if (Math.abs(animationScope.getValue().floatValue()) >= Math.abs(f)) {
                        float fCoerceToTarget = SnapFlingBehaviorKt.coerceToTarget(animationScope.getValue().floatValue(), f);
                        SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, scrollScope, function1, fCoerceToTarget - floatRef2.element);
                        animationScope.cancelAnimation();
                        floatRef2.element = fCoerceToTarget;
                        return;
                    }
                    SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, scrollScope, function1, animationScope.getValue().floatValue() - floatRef2.element);
                    floatRef2.element = animationScope.getValue().floatValue();
                }
            };
            c05221.L$0 = animationState;
            c05221.L$1 = floatRef2;
            c05221.F$0 = f;
            c05221.label = 1;
            if (SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z, function12, c05221) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = c05221.F$0;
            floatRef = (Ref.FloatRef) c05221.L$1;
            animationState = (AnimationState) c05221.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new AnimationResult(Boxing.boxFloat(f - floatRef.element), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, Function1<? super Float, Unit> function1, float f) {
        float fScrollBy = scrollScope.scrollBy(f);
        function1.invoke(Float.valueOf(fScrollBy));
        if (Math.abs(f - fScrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateWithTarget(final ScrollScope scrollScope, float f, final float f2, AnimationState<Float, AnimationVector1D> animationState, AnimationSpec<Float> animationSpec, final Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) throws Throwable {
        C05241 c05241;
        float f3;
        Ref.FloatRef floatRef;
        float f4;
        AnimationState<Float, AnimationVector1D> animationState2;
        if (continuation instanceof C05241) {
            c05241 = (C05241) continuation;
            int i = c05241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c05241.label = i - Integer.MIN_VALUE;
            } else {
                c05241 = new C05241(continuation);
            }
        }
        C05241 c052412 = c05241;
        Object obj = c052412.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c052412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            float fFloatValue = animationState.getVelocity().floatValue();
            Float fBoxFloat = Boxing.boxFloat(f);
            boolean z = animationState.getVelocity().floatValue() == 0.0f;
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animationScope) {
                    float fCoerceToTarget = SnapFlingBehaviorKt.coerceToTarget(animationScope.getValue().floatValue(), f2);
                    float f5 = fCoerceToTarget - floatRef2.element;
                    float fScrollBy = scrollScope.scrollBy(f5);
                    function1.invoke(Float.valueOf(fScrollBy));
                    if (Math.abs(f5 - fScrollBy) > 0.5f || fCoerceToTarget != animationScope.getValue().floatValue()) {
                        animationScope.cancelAnimation();
                    }
                    floatRef2.element += fScrollBy;
                }
            };
            c052412.L$0 = animationState;
            c052412.L$1 = floatRef2;
            f3 = f;
            c052412.F$0 = f3;
            c052412.F$1 = fFloatValue;
            c052412.label = 1;
            if (SuspendAnimationKt.animateTo(animationState, fBoxFloat, animationSpec, !z, function12, c052412) == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
            f4 = fFloatValue;
            animationState2 = animationState;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f4 = c052412.F$1;
            float f5 = c052412.F$0;
            floatRef = (Ref.FloatRef) c052412.L$1;
            AnimationState<Float, AnimationVector1D> animationState3 = (AnimationState) c052412.L$0;
            ResultKt.throwOnFailure(obj);
            f3 = f5;
            animationState2 = animationState3;
        }
        return new AnimationResult(Boxing.boxFloat(f3 - floatRef.element), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? RangesKt___RangesKt.coerceAtMost(f, f2) : RangesKt___RangesKt.coerceAtLeast(f, f2);
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m7998calculateFinalOffsetFhqu1e0(int i, float f, float f2) {
        FinalSnappingItem.Companion companion = FinalSnappingItem.INSTANCE;
        if (FinalSnappingItem.m7991equalsimpl0(i, companion.m7995getClosestItembbeMdSM())) {
            if (Math.abs(f2) <= Math.abs(f)) {
                f = f2;
            }
        } else if (!FinalSnappingItem.m7991equalsimpl0(i, companion.m7996getNextItembbeMdSM())) {
            if (!FinalSnappingItem.m7991equalsimpl0(i, companion.m7997getPreviousItembbeMdSM())) {
                f = 0.0f;
            }
        }
        if (calculateFinalOffset_Fhqu1e0$isValidDistance(f)) {
            return f;
        }
        return 0.0f;
    }
}
