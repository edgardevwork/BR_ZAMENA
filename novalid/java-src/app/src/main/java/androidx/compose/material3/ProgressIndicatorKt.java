package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.layout.LayoutModifierKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProgressIndicator.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001aR\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a0\u0010%\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aD\u0010%\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a8\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aL\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00108\u001aH\u00109\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a0\u00109\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a:\u00109\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a8\u00109\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001aB\u00109\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010B\u001a6\u0010C\u001a\u00020&*\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a&\u0010K\u001a\u00020&*\u00020D2\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a6\u0010N\u001a\u00020&*\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010J\u001a>\u0010P\u001a\u00020&*\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a>\u0010S\u001a\u00020&*\u00020D2\u0006\u0010T\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a.\u0010X\u001a\u00020&*\u00020D2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0016\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0007\"\u0016\u0010\u0018\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010#\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u000e\u0010$\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, m7105d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "getCircularIndicatorDiameter", "()F", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "IncreaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "getLinearIndicatorHeight", "LinearIndicatorWidth", "getLinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "SemanticsBoundsPadding", "StartAngleOffset", "CircularProgressIndicator", "", "progress", "Lkotlin/Function0;", "modifier", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "trackColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-DUhRLBM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-_5eSR-E", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorTrack", "drawCircularIndicatorTrack-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorTrack", "drawLinearIndicatorTrack-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,703:1\n1116#2,6:704\n1116#2,6:710\n1116#2,6:716\n1116#2,6:722\n1116#2,6:728\n1116#2,6:734\n1116#2,6:741\n1116#2,6:747\n1116#2,6:754\n1116#2,6:760\n74#3:740\n74#3:753\n75#4,7:766\n92#4:775\n58#4:776\n154#5:773\n154#5:774\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n86#1:704,6\n90#1:710,6\n94#1:716,6\n176#1:722,6\n218#1:728,6\n354#1:734,6\n360#1:741,6\n364#1:747,6\n452#1:754,6\n493#1:760,6\n355#1:740\n397#1:753\n578#1:766,7\n649#1:775\n649#1:776\n300#1:773\n640#1:774\n*E\n"})
/* loaded from: classes2.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;

    @NotNull
    private static final CubicBezierEasing CircularEasing;
    private static final float CircularIndicatorDiameter;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;

    @NotNull
    private static final CubicBezierEasing FirstLineHeadEasing;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;

    @NotNull
    private static final CubicBezierEasing FirstLineTailEasing;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;

    @NotNull
    private static final Modifier IncreaseSemanticsBounds;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float LinearIndicatorHeight;
    private static final float LinearIndicatorWidth;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;

    @NotNull
    private static final CubicBezierEasing SecondLineHeadEasing;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;

    @NotNull
    private static final CubicBezierEasing SecondLineTailEasing;
    private static final float SemanticsBoundsPadding;
    private static final float StartAngleOffset = -90.0f;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x01c3: INVOKE (r2v1 ?? I:androidx.compose.runtime.Composer), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:719)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E */
    public static final void m9649LinearProgressIndicator_5eSRE(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x01c3: INVOKE (r2v1 ?? I:androidx.compose.runtime.Composer), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:719)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    /* JADX WARN: Removed duplicated region for block: B:163:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01f1 A[PHI: r10
  0x01f1: PHI (r10v18 long) = (r10v16 long), (r10v19 long) binds: [B:197:0x01ef, B:193:0x01e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LinearProgressIndicator-2cYBFYY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9646LinearProgressIndicator2cYBFYY(@Nullable Modifier modifier, long j, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long linearColor;
        long linearTrackColor;
        int i5;
        Modifier modifier3;
        int iM9640getLinearStrokeCapKaPHkGw;
        int i6;
        long j3;
        long j4;
        int i7;
        long j5;
        boolean z;
        boolean zChanged;
        Object objRememberedValue;
        final int i8;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-476865359);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            linearColor = j;
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        } else {
            linearColor = j;
        }
        if ((i2 & 384) == 0) {
            linearTrackColor = j2;
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        } else {
            linearTrackColor = j2;
        }
        int i10 = i3 & 8;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i10 == 0) {
                        iM9640getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m9640getLinearStrokeCapKaPHkGw();
                        i6 = i4;
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-476865359, i6, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:121)");
                    }
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                            keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 750);
                        }
                    }), null, 0L, 6, null);
                    int i11 = InfiniteTransition.$stable;
                    int i12 = InfiniteRepeatableSpec.$stable;
                    boolean z2 = true;
                    i7 = i6;
                    long j7 = j4;
                    final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i11 | 432 | (i12 << 9), 8);
                    final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                            keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 1183);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i11 | 432 | (i12 << 9), 8);
                    final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                            keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 1567);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i11 | 432 | (i12 << 9), 8);
                    final State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                            keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i11 | 432 | (i12 << 9), 8);
                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                    composerStartRestartGroup.startReplaceableGroup(-1348537245);
                    if (((i7 & 896) ^ 384) > 256) {
                        j5 = j7;
                        if (composerStartRestartGroup.changed(j5)) {
                            z = true;
                            boolean zChanged2 = z | ((i7 & 7168) != 2048) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changed(stateAnimateFloat2);
                            if ((((i7 & 112) ^ 48) > 32 || !composerStartRestartGroup.changed(j3)) && (i7 & 48) != 32) {
                                z2 = false;
                            }
                            zChanged = zChanged2 | z2 | composerStartRestartGroup.changed(stateAnimateFloat3) | composerStartRestartGroup.changed(stateAnimateFloat4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                final long j8 = j5;
                                final int i13 = iM9640getLinearStrokeCapKaPHkGw;
                                final long j9 = j3;
                                objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull DrawScope drawScope) {
                                        float fM11165getHeightimpl = Size.m11165getHeightimpl(drawScope.mo11889getSizeNHjbRc());
                                        ProgressIndicatorKt.m9661drawLinearIndicatorTrackAZGd3zU(drawScope, j8, fM11165getHeightimpl, i13);
                                        if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                            ProgressIndicatorKt.m9660drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j9, fM11165getHeightimpl, i13);
                                        }
                                        if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                            ProgressIndicatorKt.m9660drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j9, fM11165getHeightimpl, i13);
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM8174sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            linearColor = j3;
                            i8 = iM9640getLinearStrokeCapKaPHkGw;
                            j6 = j5;
                        }
                    } else {
                        j5 = j7;
                    }
                    if ((i7 & 384) != 256) {
                        z = false;
                    }
                    boolean zChanged22 = z | ((i7 & 7168) != 2048) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changed(stateAnimateFloat2);
                    if (((i7 & 112) ^ 48) > 32) {
                        z2 = false;
                        zChanged = zChanged22 | z2 | composerStartRestartGroup.changed(stateAnimateFloat3) | composerStartRestartGroup.changed(stateAnimateFloat4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            final long j82 = j5;
                            final int i132 = iM9640getLinearStrokeCapKaPHkGw;
                            final long j92 = j3;
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope drawScope) {
                                    float fM11165getHeightimpl = Size.m11165getHeightimpl(drawScope.mo11889getSizeNHjbRc());
                                    ProgressIndicatorKt.m9661drawLinearIndicatorTrackAZGd3zU(drawScope, j82, fM11165getHeightimpl, i132);
                                    if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                        ProgressIndicatorKt.m9660drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j92, fM11165getHeightimpl, i132);
                                    }
                                    if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                        ProgressIndicatorKt.m9660drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j92, fM11165getHeightimpl, i132);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM8174sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            linearColor = j3;
                            i8 = iM9640getLinearStrokeCapKaPHkGw;
                            j6 = j5;
                        }
                    } else {
                        z2 = false;
                        zChanged = zChanged22 | z2 | composerStartRestartGroup.changed(stateAnimateFloat3) | composerStartRestartGroup.changed(stateAnimateFloat4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier3 = modifier2;
                }
                j4 = linearTrackColor;
                iM9640getLinearStrokeCapKaPHkGw = i5;
                i6 = i4;
                j3 = linearColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 750);
                    }
                }), null, 0L, 6, null);
                int i112 = InfiniteTransition.$stable;
                int i122 = InfiniteRepeatableSpec.$stable;
                boolean z22 = true;
                i7 = i6;
                long j72 = j4;
                final State<Float> stateAnimateFloat5 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i112 | 432 | (i122 << 9), 8);
                final State<Float> stateAnimateFloat22 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 1183);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i112 | 432 | (i122 << 9), 8);
                final State<Float> stateAnimateFloat32 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 1567);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i112 | 432 | (i122 << 9), 8);
                final State<Float> stateAnimateFloat42 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i112 | 432 | (i122 << 9), 8);
                Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(-1348537245);
                if (((i7 & 896) ^ 384) > 256) {
                }
                if ((i7 & 384) != 256) {
                }
                boolean zChanged222 = z | ((i7 & 7168) != 2048) | composerStartRestartGroup.changed(stateAnimateFloat5) | composerStartRestartGroup.changed(stateAnimateFloat22);
                if (((i7 & 112) ^ 48) > 32) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j6 = linearTrackColor;
                i8 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final long j10 = linearColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i14) {
                        ProgressIndicatorKt.m9646LinearProgressIndicator2cYBFYY(modifier4, j10, j6, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        i5 = i;
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i3 & 2) != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i10 == 0) {
                    j4 = linearTrackColor;
                    iM9640getLinearStrokeCapKaPHkGw = i5;
                    i6 = i4;
                    j3 = linearColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition22 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default22 = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 750);
                    }
                }), null, 0L, 6, null);
                int i1122 = InfiniteTransition.$stable;
                int i1222 = InfiniteRepeatableSpec.$stable;
                boolean z222 = true;
                i7 = i6;
                long j722 = j4;
                final State<Float> stateAnimateFloat52 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default22, null, composerStartRestartGroup, i1122 | 432 | (i1222 << 9), 8);
                final State<Float> stateAnimateFloat222 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 1183);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i1122 | 432 | (i1222 << 9), 8);
                final State<Float> stateAnimateFloat322 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), 1567);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i1122 | 432 | (i1222 << 9), 8);
                final State<Float> stateAnimateFloat422 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                        keyframesSpecConfig.mo33at((Object) Float.valueOf(1.0f), LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i1122 | 432 | (i1222 << 9), 8);
                Modifier modifierM8174sizeVpY3zN422 = SizeKt.m8174sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(-1348537245);
                if (((i7 & 896) ^ 384) > 256) {
                }
                if ((i7 & 384) != 256) {
                }
                boolean zChanged2222 = z | ((i7 & 7168) != 2048) | composerStartRestartGroup.changed(stateAnimateFloat52) | composerStartRestartGroup.changed(stateAnimateFloat222);
                if (((i7 & 112) ^ 48) > 32) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9648LinearProgressIndicator_5eSRE(final float f, @Nullable Modifier modifier, long j, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long linearColor;
        long linearTrackColor;
        int i5;
        int i6;
        int iM9640getLinearStrokeCapKaPHkGw;
        long j3;
        long j4;
        boolean z;
        Object objRememberedValue;
        final int i7;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(905419617);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                linearColor = j;
                i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(linearColor)) ? 256 : 128;
            } else {
                linearColor = j;
            }
            if ((i2 & 3072) != 0) {
                linearTrackColor = j2;
                i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 2048 : 1024;
            } else {
                linearTrackColor = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                }
                if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    j5 = linearColor;
                    i7 = i6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 == 0) {
                            iM9640getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m9640getLinearStrokeCapKaPHkGw();
                            j3 = linearColor;
                            j4 = linearTrackColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1348535908);
                        z = (i4 & 14) == 4;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(f);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        m9649LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM9640getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i7 = iM9640getLinearStrokeCapKaPHkGw;
                        j5 = j3;
                        linearTrackColor = j4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                    }
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    iM9640getLinearStrokeCapKaPHkGw = i6;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1348535908);
                    if ((i4 & 14) == 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        m9649LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM9640getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i7 = iM9640getLinearStrokeCapKaPHkGw;
                        j5 = j3;
                        linearTrackColor = j4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final long j6 = linearTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i9) {
                            ProgressIndicatorKt.m9648LinearProgressIndicator_5eSRE(f, modifier3, j5, j6, i7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= CpioConstants.C_ISBLK;
            i6 = i;
            if ((i4 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 == 0) {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM9640getLinearStrokeCapKaPHkGw = i6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1348535908);
                    if ((i4 & 14) == 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: LinearProgressIndicator-eaDK9VM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m9650LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long linearColor;
        long j3;
        Modifier modifier3;
        long linearTrackColor;
        long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-372717133);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                linearColor = j;
                i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(linearColor)) ? 256 : 128;
            } else {
                linearColor = j;
            }
            if ((i & 3072) != 0) {
                j3 = j2;
                i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j2;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) == 0) {
                        i3 &= -7169;
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        j4 = linearColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-372717133, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:232)");
                    }
                    m9648LinearProgressIndicator_5eSRE(f, modifier3, j4, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m9640getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    linearColor = j4;
                    j5 = linearTrackColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                j4 = linearColor;
                linearTrackColor = j3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m9648LinearProgressIndicator_5eSRE(f, modifier3, j4, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m9640getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                linearColor = j4;
                j5 = linearTrackColor;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final long j6 = linearColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i5) {
                        ProgressIndicatorKt.m9650LinearProgressIndicatoreaDK9VM(f, modifier4, j6, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) == 0) {
                    j4 = linearColor;
                    linearTrackColor = j3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m9648LinearProgressIndicator_5eSRE(f, modifier3, j4, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m9640getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                linearColor = j4;
                j5 = linearTrackColor;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: LinearProgressIndicator-RIQooxk */
    public static final /* synthetic */ void m9647LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long linearColor;
        long linearTrackColor;
        Modifier modifier3;
        long j3;
        Composer composerStartRestartGroup = composer.startRestartGroup(585576195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            linearColor = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        } else {
            linearColor = j;
        }
        if ((i & 384) == 0) {
            linearTrackColor = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        } else {
            linearTrackColor = j2;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = linearColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
            }
            int i5 = i3;
            j3 = linearColor;
            long j4 = linearTrackColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:246)");
            }
            m9646LinearProgressIndicator2cYBFYY(modifier3, j3, j4, ProgressIndicatorDefaults.INSTANCE.m9640getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearTrackColor = j4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final long j5 = j3;
            final long j6 = linearTrackColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    ProgressIndicatorKt.m9647LinearProgressIndicatorRIQooxk(modifier4, j5, j6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* renamed from: drawLinearIndicator-qYKTg0g */
    public static final void m9660drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float fM11168getWidthimpl = Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc());
        float fM11165getHeightimpl = Size.m11165getHeightimpl(drawScope.mo11889getSizeNHjbRc());
        float f4 = 2;
        float f5 = fM11165getHeightimpl / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * fM11168getWidthimpl;
        float f7 = (z ? f2 : 1.0f - f) * fM11168getWidthimpl;
        if (StrokeCap.m11688equalsimpl0(i, StrokeCap.INSTANCE.m11692getButtKaPHkGw()) || fM11165getHeightimpl > fM11168getWidthimpl) {
            DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f6, f5), OffsetKt.Offset(f7, f5), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f8 = f3 / f4;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt__RangesKt.rangeTo(f8, fM11168getWidthimpl - f8);
        float fFloatValue = ((Number) RangesKt___RangesKt.coerceIn(Float.valueOf(f6), closedFloatingPointRangeRangeTo)).floatValue();
        float fFloatValue2 = ((Number) RangesKt___RangesKt.coerceIn(Float.valueOf(f7), closedFloatingPointRangeRangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fFloatValue, f5), OffsetKt.Offset(fFloatValue2, f5), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* renamed from: drawLinearIndicatorTrack-AZGd3zU */
    public static final void m9661drawLinearIndicatorTrackAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m9660drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9642CircularProgressIndicatorDUhRLBM(@NotNull final Function0<Float> function0, @Nullable Modifier modifier, long j, float f, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long circularColor;
        int i5;
        float fM9639getCircularStrokeWidthD9Ej5fM;
        long circularTrackColor;
        int i6;
        final int iM9637getCircularDeterminateStrokeCapKaPHkGw;
        boolean z;
        Object objRememberedValue;
        final Function0 function02;
        final Stroke stroke;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-761680467);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                circularColor = j;
                i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(circularColor)) ? 256 : 128;
            } else {
                circularColor = j;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    fM9639getCircularStrokeWidthD9Ej5fM = f;
                    i4 |= composerStartRestartGroup.changed(fM9639getCircularStrokeWidthD9Ej5fM) ? 2048 : 1024;
                }
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    circularTrackColor = j2;
                    i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(circularTrackColor)) ? 16384 : 8192;
                } else {
                    circularTrackColor = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    iM9637getCircularDeterminateStrokeCapKaPHkGw = i;
                } else {
                    iM9637getCircularDeterminateStrokeCapKaPHkGw = i;
                    if ((i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changed(iM9637getCircularDeterminateStrokeCapKaPHkGw) ? 131072 : 65536;
                    }
                }
                if ((i4 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM9639getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m9639getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i6 != 0) {
                            iM9637getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m9637getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821866314);
                    z = (i4 & 14) != 4;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(RangesKt___RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(fM9639getCircularStrokeWidthD9Ej5fM), 0.0f, iM9637getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    composerStartRestartGroup.startReplaceableGroup(821866535);
                    zChanged = composerStartRestartGroup.changed(function02);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function02.invoke().floatValue(), RangesKt__RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
                    composerStartRestartGroup.startReplaceableGroup(821866689);
                    zChanged2 = ((((i4 & 57344) ^ CpioConstants.C_ISBLK) <= 16384 && composerStartRestartGroup.changed(circularTrackColor)) || (i4 & CpioConstants.C_ISBLK) == 16384) | composerStartRestartGroup.changed(function02) | composerStartRestartGroup.changedInstance(stroke) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(circularColor)) || (i4 & 384) == 256);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final long j3 = circularTrackColor;
                        final long j4 = circularColor;
                        objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope drawScope) {
                                float fFloatValue = function02.invoke().floatValue() * 360.0f;
                                ProgressIndicatorKt.m9657drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                                ProgressIndicatorKt.m9658drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue, j4, stroke);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM8172size3ABfNKs, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                final long j5 = circularColor;
                final float f2 = fM9639getCircularStrokeWidthD9Ej5fM;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final long j6 = circularTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i8) {
                            ProgressIndicatorKt.m9642CircularProgressIndicatorDUhRLBM(function0, modifier3, j5, f2, j6, iM9637getCircularDeterminateStrokeCapKaPHkGw, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            fM9639getCircularStrokeWidthD9Ej5fM = f;
            if ((i2 & CpioConstants.C_ISBLK) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i4 & 74899) != 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceableGroup(821866314);
                    if ((i4 & 14) != 4) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final Float invoke() {
                                return Float.valueOf(RangesKt___RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        function02 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(fM9639getCircularStrokeWidthD9Ej5fM), 0.0f, iM9637getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                        composerStartRestartGroup.startReplaceableGroup(821866535);
                        zChanged = composerStartRestartGroup.changed(function02);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function02.invoke().floatValue(), RangesKt__RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
                            composerStartRestartGroup.startReplaceableGroup(821866689);
                            if (((i4 & 57344) ^ CpioConstants.C_ISBLK) <= 16384) {
                                if (((i4 & 896) ^ 384) > 256) {
                                    zChanged2 = ((((i4 & 57344) ^ CpioConstants.C_ISBLK) <= 16384 && composerStartRestartGroup.changed(circularTrackColor)) || (i4 & CpioConstants.C_ISBLK) == 16384) | composerStartRestartGroup.changed(function02) | composerStartRestartGroup.changedInstance(stroke) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(circularColor)) || (i4 & 384) == 256);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2) {
                                        final long j32 = circularTrackColor;
                                        final long j42 = circularColor;
                                        objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                                invoke2(drawScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull DrawScope drawScope) {
                                                float fFloatValue = function02.invoke().floatValue() * 360.0f;
                                                ProgressIndicatorKt.m9657drawCircularIndicatorTrackbw27NRU(drawScope, j32, stroke);
                                                ProgressIndicatorKt.m9658drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue, j42, stroke);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        CanvasKt.Canvas(modifierM8172size3ABfNKs2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                } else {
                                    zChanged2 = ((((i4 & 57344) ^ CpioConstants.C_ISBLK) <= 16384 && composerStartRestartGroup.changed(circularTrackColor)) || (i4 & CpioConstants.C_ISBLK) == 16384) | composerStartRestartGroup.changed(function02) | composerStartRestartGroup.changedInstance(stroke) | ((((i4 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(circularColor)) || (i4 & 384) == 256);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged2) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final long j52 = circularColor;
            final float f22 = fM9639getCircularStrokeWidthD9Ej5fM;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        fM9639getCircularStrokeWidthD9Ej5fM = f;
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i4 & 74899) != 74898) {
        }
        final long j522 = circularColor;
        final float f222 = fM9639getCircularStrokeWidthD9Ej5fM;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9643CircularProgressIndicatorLxG7B9w(@Nullable Modifier modifier, long j, float f, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long circularColor;
        float fM9639getCircularStrokeWidthD9Ej5fM;
        final long j3;
        int i5;
        int i6;
        Modifier modifier3;
        long circularTrackColor;
        int i7;
        long j4;
        float f2;
        int iM9638getCircularIndeterminateStrokeCapKaPHkGw;
        long j5;
        int i8;
        Modifier modifier4;
        int i9;
        Stroke stroke;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        final int i10;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-115871647);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            circularColor = j;
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(circularColor)) ? 32 : 16;
        } else {
            circularColor = j;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                fM9639getCircularStrokeWidthD9Ej5fM = f;
                i4 |= composerStartRestartGroup.changed(fM9639getCircularStrokeWidthD9Ej5fM) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i13 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    i4 |= i13;
                } else {
                    j3 = j2;
                }
                i4 |= i13;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                }
                if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -113;
                        }
                        if (i12 != 0) {
                            fM9639getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m9639getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 8) == 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            circularTrackColor = j3;
                        }
                        if (i5 == 0) {
                            i7 = i4;
                            j5 = circularTrackColor;
                            f2 = fM9639getCircularStrokeWidthD9Ej5fM;
                            iM9638getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m9638getCircularIndeterminateStrokeCapKaPHkGw();
                        } else {
                            i7 = i4;
                            j4 = circularColor;
                            long j7 = circularTrackColor;
                            f2 = fM9639getCircularStrokeWidthD9Ej5fM;
                            iM9638getCircularIndeterminateStrokeCapKaPHkGw = i6;
                            j5 = j7;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-115871647, i7, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                            }
                            Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f2), 0.0f, iM9638getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                            TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                            InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                            int i14 = InfiniteTransition.$stable;
                            int i15 = InfiniteRepeatableSpec.$stable;
                            boolean z3 = true;
                            i8 = i7;
                            final State stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i14 | 432 | (i15 << 12), 16);
                            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i14 | 432 | (i15 << 9), 8);
                            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    invoke2(keyframesSpecConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                                    keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                                    keyframesSpecConfig.mo33at((Object) Float.valueOf(290.0f), 666);
                                }
                            }), null, 0L, 6, null), null, composerStartRestartGroup, i14 | 432 | (i15 << 9), 8);
                            final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    invoke2(keyframesSpecConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                    keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                                    keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                                    keyframesSpecConfig.mo33at((Object) Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                                }
                            }), null, 0L, 6, null), null, composerStartRestartGroup, i14 | 432 | (i15 << 9), 8);
                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter);
                            composerStartRestartGroup.startReplaceableGroup(821870113);
                            j3 = j5;
                            if (((i8 & 7168) ^ 3072) > 2048 || !composerStartRestartGroup.changed(j3)) {
                                modifier4 = modifier3;
                                i9 = i8;
                                if ((i9 & 3072) != 2048) {
                                    stroke = stroke2;
                                    z = false;
                                }
                                int i16 = iM9638getCircularIndeterminateStrokeCapKaPHkGw;
                                boolean zChangedInstance = z | composerStartRestartGroup.changedInstance(stroke) | composerStartRestartGroup.changed(stateAnimateValue) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changed(stateAnimateFloat3) | composerStartRestartGroup.changed(stateAnimateFloat) | ((i9 & 896) == 256);
                                if ((((i9 & 112) ^ 48) <= 32 || !composerStartRestartGroup.changed(j4)) && (i9 & 48) != 32) {
                                    z3 = false;
                                }
                                z2 = zChangedInstance | z3;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final Stroke stroke3 = stroke;
                                    final float f3 = f2;
                                    final long j8 = j4;
                                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DrawScope drawScope) {
                                            ProgressIndicatorKt.m9657drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke3);
                                            ProgressIndicatorKt.m9659drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((stateAnimateValue.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + stateAnimateFloat.getValue().floatValue(), f3, Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue()), j8, stroke3);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                CanvasKt.Canvas(modifierM8172size3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i10 = i16;
                                j6 = j4;
                                modifier2 = modifier4;
                            } else {
                                modifier4 = modifier3;
                                i9 = i8;
                            }
                            z = true;
                            stroke = stroke2;
                            int i162 = iM9638getCircularIndeterminateStrokeCapKaPHkGw;
                            boolean zChangedInstance2 = z | composerStartRestartGroup.changedInstance(stroke) | composerStartRestartGroup.changed(stateAnimateValue) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changed(stateAnimateFloat3) | composerStartRestartGroup.changed(stateAnimateFloat) | ((i9 & 896) == 256);
                            if (((i9 & 112) ^ 48) <= 32) {
                                z3 = false;
                                z2 = zChangedInstance2 | z3;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z2) {
                                    final Stroke stroke32 = stroke;
                                    final float f32 = f2;
                                    final long j82 = j4;
                                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DrawScope drawScope) {
                                            ProgressIndicatorKt.m9657drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke32);
                                            ProgressIndicatorKt.m9659drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((stateAnimateValue.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + stateAnimateFloat.getValue().floatValue(), f32, Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue()), j82, stroke32);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    CanvasKt.Canvas(modifierM8172size3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    i10 = i162;
                                    j6 = j4;
                                    modifier2 = modifier4;
                                }
                            } else {
                                z3 = false;
                                z2 = zChangedInstance2 | z3;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z2) {
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        modifier3 = modifier2;
                        f2 = fM9639getCircularStrokeWidthD9Ej5fM;
                        iM9638getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j5 = j3;
                        i7 = i4;
                    }
                    j4 = circularColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Stroke stroke22 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f2), 0.0f, iM9638getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i142 = InfiniteTransition.$stable;
                    int i152 = InfiniteRepeatableSpec.$stable;
                    boolean z32 = true;
                    i8 = i7;
                    final State<Integer> stateAnimateValue2 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, vectorConverter2, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i142 | 432 | (i152 << 12), 16);
                    final State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i142 | 432 | (i152 << 9), 8);
                    final State<Float> stateAnimateFloat22 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo33at((Object) Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i142 | 432 | (i152 << 9), 8);
                    final State<Float> stateAnimateFloat32 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((Object) Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo33at((Object) Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i142 | 432 | (i152 << 9), 8);
                    Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter);
                    composerStartRestartGroup.startReplaceableGroup(821870113);
                    j3 = j5;
                    if (((i8 & 7168) ^ 3072) > 2048) {
                        modifier4 = modifier3;
                        i9 = i8;
                        if ((i9 & 3072) != 2048) {
                            z = true;
                            stroke = stroke22;
                        }
                        int i1622 = iM9638getCircularIndeterminateStrokeCapKaPHkGw;
                        boolean zChangedInstance22 = z | composerStartRestartGroup.changedInstance(stroke) | composerStartRestartGroup.changed(stateAnimateValue2) | composerStartRestartGroup.changed(stateAnimateFloat22) | composerStartRestartGroup.changed(stateAnimateFloat32) | composerStartRestartGroup.changed(stateAnimateFloat4) | ((i9 & 896) == 256);
                        if (((i9 & 112) ^ 48) <= 32) {
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j6 = circularColor;
                    f2 = fM9639getCircularStrokeWidthD9Ej5fM;
                    i10 = i6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    final float f4 = f2;
                    final long j9 = j3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i17) {
                            ProgressIndicatorKt.m9643CircularProgressIndicatorLxG7B9w(modifier5, j6, f4, j9, i10, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= CpioConstants.C_ISBLK;
            i6 = i;
            if ((i4 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 == 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i3 & 8) == 0) {
                    }
                    if (i5 == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM9639getCircularStrokeWidthD9Ej5fM = f;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9641CircularProgressIndicatorDUhRLBM(final float f, @Nullable Modifier modifier, long j, float f2, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long circularColor;
        int i5;
        float fM9639getCircularStrokeWidthD9Ej5fM;
        long circularTrackColor;
        int i6;
        int i7;
        int iM9637getCircularDeterminateStrokeCapKaPHkGw;
        int i8;
        float f3;
        long j3;
        boolean z;
        Object objRememberedValue;
        final long j4;
        final int i9;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1472321743);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    circularColor = j;
                    int i11 = composerStartRestartGroup.changed(circularColor) ? 256 : 128;
                    i4 |= i11;
                } else {
                    circularColor = j;
                }
                i4 |= i11;
            } else {
                circularColor = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    fM9639getCircularStrokeWidthD9Ej5fM = f2;
                    i4 |= composerStartRestartGroup.changed(fM9639getCircularStrokeWidthD9Ej5fM) ? 2048 : 1024;
                }
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    if ((i3 & 16) == 0) {
                        circularTrackColor = j2;
                        int i12 = composerStartRestartGroup.changed(circularTrackColor) ? 16384 : 8192;
                        i4 |= i12;
                    } else {
                        circularTrackColor = j2;
                    }
                    i4 |= i12;
                } else {
                    circularTrackColor = j2;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((196608 & i2) == 0) {
                        i7 = i;
                        i4 |= composerStartRestartGroup.changed(i7) ? 131072 : 65536;
                    }
                    if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                fM9639getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m9639getCircularStrokeWidthD9Ej5fM();
                            }
                            if ((i3 & 16) != 0) {
                                circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                                i4 &= -57345;
                            }
                            if (i6 == 0) {
                                iM9637getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m9637getCircularDeterminateStrokeCapKaPHkGw();
                                i8 = i4;
                                f3 = fM9639getCircularStrokeWidthD9Ej5fM;
                                j3 = circularTrackColor;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1472321743, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(821871588);
                            z = (i8 & 14) == 4;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Float invoke() {
                                        return Float.valueOf(f);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            m9642CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM9637getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i8 & 524272, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            circularTrackColor = j3;
                            j4 = circularColor;
                            i9 = iM9637getCircularDeterminateStrokeCapKaPHkGw;
                            f4 = f3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        i8 = i4;
                        f3 = fM9639getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM9637getCircularDeterminateStrokeCapKaPHkGw = i7;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(821871588);
                        if ((i8 & 14) == 4) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                            objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Float invoke() {
                                    return Float.valueOf(f);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            m9642CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM9637getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i8 & 524272, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            circularTrackColor = j3;
                            j4 = circularColor;
                            i9 = iM9637getCircularDeterminateStrokeCapKaPHkGw;
                            f4 = f3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j4 = circularColor;
                        f4 = fM9639getCircularStrokeWidthD9Ej5fM;
                        i9 = i7;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final long j5 = circularTrackColor;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i13) {
                                ProgressIndicatorKt.m9641CircularProgressIndicatorDUhRLBM(f, modifier3, j4, f4, j5, i9, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                i7 = i;
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i6 == 0) {
                            i8 = i4;
                            f3 = fM9639getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM9637getCircularDeterminateStrokeCapKaPHkGw = i7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(821871588);
                        if ((i8 & 14) == 4) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM9639getCircularStrokeWidthD9Ej5fM = f2;
            if ((i2 & CpioConstants.C_ISBLK) == 0) {
            }
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            i7 = i;
            if ((i4 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        fM9639getCircularStrokeWidthD9Ej5fM = f2;
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i;
        if ((i4 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: CircularProgressIndicator-MBs18nI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m9644CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long circularColor;
        int i4;
        float f3;
        Modifier modifier3;
        final float fM9639getCircularStrokeWidthD9Ej5fM;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(402841196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    circularColor = j;
                    int i6 = composerStartRestartGroup.changed(circularColor) ? 256 : 128;
                    i3 |= i6;
                } else {
                    circularColor = j;
                }
                i3 |= i6;
            } else {
                circularColor = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    f3 = f2;
                    i3 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j2 = circularColor;
                    fM9639getCircularStrokeWidthD9Ej5fM = f3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i3 &= -897;
                        }
                        if (i4 == 0) {
                            fM9639getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m9639getCircularStrokeWidthD9Ej5fM();
                            j2 = circularColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
                        }
                        ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                        m9641CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM9639getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults.m9637getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                    j2 = circularColor;
                    fM9639getCircularStrokeWidthD9Ej5fM = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults2 = ProgressIndicatorDefaults.INSTANCE;
                    m9641CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM9639getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults2.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults2.m9637getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final long j3 = j2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i7) {
                            ProgressIndicatorKt.m9644CircularProgressIndicatorMBs18nI(f, modifier4, j3, fM9639getCircularStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            f3 = f2;
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 == 0) {
                        j2 = circularColor;
                        fM9639getCircularStrokeWidthD9Ej5fM = f3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults22 = ProgressIndicatorDefaults.INSTANCE;
                    m9641CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM9639getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults22.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults22.m9637getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.f342xf2722a21 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        f3 = f2;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: CircularProgressIndicator-aM-cp0Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m9645CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long circularColor;
        float f2;
        Modifier modifier3;
        float fM9639getCircularStrokeWidthD9Ej5fM;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(947193756);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                circularColor = j;
                int i5 = composerStartRestartGroup.changed(circularColor) ? 32 : 16;
                i3 |= i5;
            } else {
                circularColor = j;
            }
            i3 |= i5;
        } else {
            circularColor = j;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -113;
                    }
                    if (i6 == 0) {
                        fM9639getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m9639getCircularStrokeWidthD9Ej5fM();
                    }
                    long j3 = circularColor;
                    int i7 = i3;
                    j2 = j3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(947193756, i7, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:523)");
                    }
                    ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                    m9643CircularProgressIndicatorLxG7B9w(modifier3, j2, fM9639getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults.m9638getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i7 & 14) | CpioConstants.C_ISBLK | (i7 & 112) | (i7 & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = fM9639getCircularStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    modifier3 = modifier2;
                }
                fM9639getCircularStrokeWidthD9Ej5fM = f2;
                long j32 = circularColor;
                int i72 = i3;
                j2 = j32;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProgressIndicatorDefaults progressIndicatorDefaults2 = ProgressIndicatorDefaults.INSTANCE;
                m9643CircularProgressIndicatorLxG7B9w(modifier3, j2, fM9639getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults2.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults2.m9638getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i72 & 14) | CpioConstants.C_ISBLK | (i72 & 112) | (i72 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = fM9639getCircularStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j2 = circularColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final long j4 = j2;
                final float f3 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i8) {
                        ProgressIndicatorKt.m9645CircularProgressIndicatoraMcp0Q(modifier4, j4, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i6 == 0) {
                    fM9639getCircularStrokeWidthD9Ej5fM = f2;
                }
                long j322 = circularColor;
                int i722 = i3;
                j2 = j322;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProgressIndicatorDefaults progressIndicatorDefaults22 = ProgressIndicatorDefaults.INSTANCE;
                m9643CircularProgressIndicatorLxG7B9w(modifier3, j2, fM9639getCircularStrokeWidthD9Ej5fM, progressIndicatorDefaults22.getCircularTrackColor(composerStartRestartGroup, 6), progressIndicatorDefaults22.m9638getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i722 & 14) | CpioConstants.C_ISBLK | (i722 & 112) | (i722 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = fM9639getCircularStrokeWidthD9Ej5fM;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c */
    private static final void m9656drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float fM11168getWidthimpl = Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc()) - (f3 * width);
        DrawScope.m11869drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.p003ui.geometry.SizeKt.Size(fM11168getWidthimpl, fM11168getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* renamed from: drawCircularIndicatorTrack-bw27NRU */
    public static final void m9657drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m9656drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* renamed from: drawDeterminateCircularIndicator-42QJj7c */
    public static final void m9658drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m9656drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI */
    public static final void m9659drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m9656drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m11688equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m11692getButtKaPHkGw()) ? 0.0f : ((f2 / C2046Dp.m13666constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    static {
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(10);
        SemanticsBoundsPadding = fM13666constructorimpl;
        IncreaseSemanticsBounds = PaddingKt.m8125paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m9662invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            @NotNull
            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m9662invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                final int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(ProgressIndicatorKt.SemanticsBoundsPadding);
                int i = iMo7868roundToPx0680j_4 * 2;
                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(j, 0, i));
                return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight() - i, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope.place$default(placementScope, placeableMo12610measureBRTryo0, 0, -iMo7868roundToPx0680j_4, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, fM13666constructorimpl, 1, null);
        LinearIndicatorWidth = C2046Dp.m13666constructorimpl(240);
        LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m10501getTrackHeightD9Ej5fM();
        CircularProgressIndicatorTokens circularProgressIndicatorTokens = CircularProgressIndicatorTokens.INSTANCE;
        CircularIndicatorDiameter = C2046Dp.m13666constructorimpl(circularProgressIndicatorTokens.m10235getSizeD9Ej5fM() - C2046Dp.m13666constructorimpl(circularProgressIndicatorTokens.m10234getActiveIndicatorWidthD9Ej5fM() * 2));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }
}
