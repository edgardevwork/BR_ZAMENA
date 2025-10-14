package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Pager.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JY\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "BeyondBoundsPageCount", "", "LowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getLowVelocityAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "lowVelocityAnimationSpec", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "snapVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "snapPositionalThreshold", "flingBehavior-PfoAEA0", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,967:1\n74#2:968\n83#3,3:969\n1116#4,6:972\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n354#1:968\n355#1:969,3\n355#1:972,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PagerDefaults {
    public static final int BeyondBoundsPageCount = 0;

    @NotNull
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    @NotNull
    private static final AnimationSpec<Float> LowVelocityAnimationSpec = AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null);
    public static final int $stable = 8;

    private PagerDefaults() {
    }

    @Composable
    @NotNull
    public final SnapFlingBehavior flingBehavior(@NotNull PagerState pagerState, @Nullable PagerSnapDistance pagerSnapDistance, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable AnimationSpec<Float> animationSpec2, @FloatRange(from = 0.0d, m9to = 1.0d) float f, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-194065136);
        PagerSnapDistance pagerSnapDistanceAtMost = (i2 & 2) != 0 ? PagerSnapDistance.INSTANCE.atMost(1) : pagerSnapDistance;
        AnimationSpec<Float> animationSpec3 = (i2 & 4) != 0 ? LowVelocityAnimationSpec : animationSpec;
        DecayAnimationSpec<Float> decayAnimationSpecRememberSplineBasedDecay = (i2 & 8) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        AnimationSpec<Float> animationSpecSpring$default = (i2 & 16) != 0 ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : animationSpec2;
        float f2 = (i2 & 32) != 0 ? 0.5f : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-194065136, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:348)");
        }
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f2).toString());
        }
        Object[] objArr = {pagerState, animationSpec3, decayAnimationSpecRememberSplineBasedDecay, animationSpecSpring$default, pagerSnapDistanceAtMost, (Density) composer.consume(CompositionLocalsKt.getLocalDensity())};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i3 = 0; i3 < 6; i3++) {
            zChanged |= composer.changed(objArr[i3]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            SnapFlingBehavior snapFlingBehavior = new SnapFlingBehavior(PagerKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistanceAtMost, decayAnimationSpecRememberSplineBasedDecay, f2), animationSpec3, decayAnimationSpecRememberSplineBasedDecay, animationSpecSpring$default);
            composer.updateRememberedValue(snapFlingBehavior);
            objRememberedValue = snapFlingBehavior;
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior2;
    }

    @NotNull
    public final AnimationSpec<Float> getLowVelocityAnimationSpec() {
        return LowVelocityAnimationSpec;
    }

    @Deprecated(message = "Please use the overload without snapVelocityThreshold. For Pagerthe functionalities provided by snapVelocityThreshold were already being provided byother APIS.")
    @Composable
    @NotNull
    /* renamed from: flingBehavior-PfoAEA0, reason: not valid java name */
    public final SnapFlingBehavior m8349flingBehaviorPfoAEA0(@NotNull PagerState pagerState, @Nullable PagerSnapDistance pagerSnapDistance, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable AnimationSpec<Float> animationSpec2, float f, float f2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-705378306);
        PagerSnapDistance pagerSnapDistanceAtMost = (i2 & 2) != 0 ? PagerSnapDistance.INSTANCE.atMost(1) : pagerSnapDistance;
        AnimationSpec<Float> animationSpecTween$default = (i2 & 4) != 0 ? AnimationSpecKt.tween$default(500, 0, EasingKt.getLinearEasing(), 2, null) : animationSpec;
        DecayAnimationSpec<Float> decayAnimationSpecRememberSplineBasedDecay = (i2 & 8) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        AnimationSpec<Float> animationSpecSpring$default = (i2 & 16) != 0 ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : animationSpec2;
        if ((i2 & 32) != 0) {
            SnapFlingBehaviorKt.getMinFlingVelocityDp();
        }
        float f3 = (i2 & 64) != 0 ? 0.5f : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-705378306, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:470)");
        }
        SnapFlingBehavior snapFlingBehaviorFlingBehavior = flingBehavior(pagerState, pagerSnapDistanceAtMost, animationSpecTween$default, decayAnimationSpecRememberSplineBasedDecay, animationSpecSpring$default, f3, composer, (i & 14) | 2134528 | (i & 112) | ((i >> 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehaviorFlingBehavior;
    }

    @NotNull
    public final NestedScrollConnection pageNestedScrollConnection(@NotNull PagerState state, @NotNull Orientation orientation) {
        return new DefaultPagerNestedScrollConnection(state, orientation);
    }
}
