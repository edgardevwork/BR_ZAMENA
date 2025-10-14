package androidx.compose.material;

import androidx.annotation.FloatRange;
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
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.layout.LayoutModifierKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
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
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a0\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aD\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a8\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aN\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a0\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a:\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a8\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aD\u00101\u001a\u00020\u001f2\b\b\u0001\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a6\u0010:\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a&\u0010B\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a6\u0010E\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010A\u001a>\u0010G\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a>\u0010J\u001a\u00020\u001f*\u00020;2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a.\u0010O\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\f\u0010R\u001a\u00020!*\u00020!H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006S²\u0006\n\u0010T\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\u0001X\u008a\u0084\u0002"}, m7105d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "progress", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "increaseSemanticsBounds", "material_release", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,619:1\n154#2:620\n154#2:650\n154#2:651\n1116#3,6:621\n1116#3,6:627\n74#4:633\n74#4:634\n75#5,7:635\n81#6:642\n81#6:643\n81#6:644\n81#6:645\n81#6:646\n81#6:647\n81#6:648\n81#6:649\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n57#1:620\n562#1:650\n566#1:651\n117#1:621,6\n197#1:627,6\n328#1:633\n366#1:634\n544#1:635,7\n148#1:642\n159#1:643\n170#1:644\n181#1:645\n372#1:646\n384#1:647\n395#1:648\n407#1:649\n*E\n"})
/* loaded from: classes2.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m8968getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = C2046Dp.m13666constructorimpl(240);
    private static final float CircularIndicatorDiameter = C2046Dp.m13666constructorimpl(40);

    @NotNull
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    @NotNull
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    @NotNull
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    @NotNull
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0168  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8975LinearProgressIndicator_5eSRE(@FloatRange(from = 0.0d, m9to = 1.0d) final float f, @Nullable Modifier modifier, long j, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long jM8846getPrimary0d7_KjU;
        long jM11339copywmQWz5c$default;
        int iM11692getButtKaPHkGw;
        Modifier modifier3;
        final float fCoerceIn;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-531984864);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 == 0) {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    jM8846getPrimary0d7_KjU = j;
                    int i6 = composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU) ? 256 : 128;
                    i4 |= i6;
                } else {
                    jM8846getPrimary0d7_KjU = j;
                }
                i4 |= i6;
            } else {
                jM8846getPrimary0d7_KjU = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    jM11339copywmQWz5c$default = j2;
                    int i7 = composerStartRestartGroup.changed(jM11339copywmQWz5c$default) ? 2048 : 1024;
                    i4 |= i7;
                } else {
                    jM11339copywmQWz5c$default = j2;
                }
                i4 |= i7;
            } else {
                jM11339copywmQWz5c$default = j2;
            }
            if ((57344 & i2) != 0) {
                if ((i3 & 16) == 0) {
                    iM11692getButtKaPHkGw = i;
                    int i8 = composerStartRestartGroup.changed(iM11692getButtKaPHkGw) ? 16384 : 8192;
                    i4 |= i8;
                } else {
                    iM11692getButtKaPHkGw = i;
                }
                i4 |= i8;
            } else {
                iM11692getButtKaPHkGw = i;
            }
            if ((46811 & i4) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                    }
                    if ((i3 & 8) != 0) {
                        jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(jM8846getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531984864, i4, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:109)");
                }
                fCoerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(increaseSemanticsBounds(modifier3), fCoerceIn, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(1842402998);
                zChanged = composerStartRestartGroup.changed(jM11339copywmQWz5c$default) | composerStartRestartGroup.changed(iM11692getButtKaPHkGw) | composerStartRestartGroup.changed(fCoerceIn) | composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final long j3 = jM11339copywmQWz5c$default;
                    final int i9 = iM11692getButtKaPHkGw;
                    final long j4 = jM8846getPrimary0d7_KjU;
                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
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
                            ProgressIndicatorKt.m8987drawLinearIndicatorBackgroundAZGd3zU(drawScope, j3, fM11165getHeightimpl, i9);
                            ProgressIndicatorKt.m8986drawLinearIndicatorqYKTg0g(drawScope, 0.0f, fCoerceIn, j4, fM11165getHeightimpl, i9);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM8174sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final long j5 = jM8846getPrimary0d7_KjU;
                final long j6 = jM11339copywmQWz5c$default;
                final int i10 = iM11692getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        ProgressIndicatorKt.m8975LinearProgressIndicator_5eSRE(f, modifier4, j5, j6, i10, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        if ((57344 & i2) != 0) {
        }
        if ((46811 & i4) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                fCoerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
                Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(increaseSemanticsBounds(modifier3), fCoerceIn, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(1842402998);
                zChanged = composerStartRestartGroup.changed(jM11339copywmQWz5c$default) | composerStartRestartGroup.changed(iM11692getButtKaPHkGw) | composerStartRestartGroup.changed(fCoerceIn) | composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    final long j32 = jM11339copywmQWz5c$default;
                    final int i92 = iM11692getButtKaPHkGw;
                    final long j42 = jM8846getPrimary0d7_KjU;
                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
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
                            ProgressIndicatorKt.m8987drawLinearIndicatorBackgroundAZGd3zU(drawScope, j32, fM11165getHeightimpl, i92);
                            ProgressIndicatorKt.m8986drawLinearIndicatorqYKTg0g(drawScope, 0.0f, fCoerceIn, j42, fM11165getHeightimpl, i92);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM8174sizeVpY3zN42, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8973LinearProgressIndicator2cYBFYY(@Nullable Modifier modifier, long j, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long jM8846getPrimary0d7_KjU;
        long jM11339copywmQWz5c$default;
        int i5;
        Modifier modifier3;
        int iM11692getButtKaPHkGw;
        final long j3;
        final int i6;
        final State<Float> stateAnimateFloat;
        final long j4;
        final State<Float> stateAnimateFloat2;
        final State<Float> stateAnimateFloat3;
        final State<Float> stateAnimateFloat4;
        Modifier modifierM8174sizeVpY3zN4;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier4;
        long j5;
        Modifier modifier5;
        final long j6;
        final int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501635280);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                jM8846getPrimary0d7_KjU = j;
                int i9 = composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU) ? 32 : 16;
                i4 |= i9;
            } else {
                jM8846getPrimary0d7_KjU = j;
            }
            i4 |= i9;
        } else {
            jM8846getPrimary0d7_KjU = j;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                jM11339copywmQWz5c$default = j2;
                int i10 = composerStartRestartGroup.changed(jM11339copywmQWz5c$default) ? 256 : 128;
                i4 |= i10;
            } else {
                jM11339copywmQWz5c$default = j2;
            }
            i4 |= i10;
        } else {
            jM11339copywmQWz5c$default = j2;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                int i11 = composerStartRestartGroup.changed(i5) ? 2048 : 1024;
                i4 |= i11;
            } else {
                i5 = i;
            }
            i4 |= i11;
        } else {
            i5 = i;
        }
        if ((i4 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(jM8846getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
                }
                j3 = jM11339copywmQWz5c$default;
                int i12 = i4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1501635280, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:142)");
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                        keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 750);
                    }
                }), null, 0L, 6, null);
                int i13 = InfiniteTransition.$stable;
                int i14 = InfiniteRepeatableSpec.$stable;
                i6 = iM11692getButtKaPHkGw;
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                j4 = jM8846getPrimary0d7_KjU;
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                        keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                        keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                        keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                        keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(increaseSemanticsBounds(modifier3)), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(1842406165);
                zChanged = composerStartRestartGroup.changed(j3) | composerStartRestartGroup.changed(i6) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changed(j4) | composerStartRestartGroup.changed(stateAnimateFloat3) | composerStartRestartGroup.changed(stateAnimateFloat4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    modifier4 = modifier3;
                    j5 = j4;
                    modifier5 = modifierM8174sizeVpY3zN4;
                    Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
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
                            ProgressIndicatorKt.m8987drawLinearIndicatorBackgroundAZGd3zU(drawScope, j3, fM11165getHeightimpl, i6);
                            if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2) > 0.0f) {
                                ProgressIndicatorKt.m8986drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2), j4, fM11165getHeightimpl, i6);
                            }
                            if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4) > 0.0f) {
                                ProgressIndicatorKt.m8986drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4), j4, fM11165getHeightimpl, i6);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                } else {
                    modifier4 = modifier3;
                    j5 = j4;
                    modifier5 = modifierM8174sizeVpY3zN4;
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifier5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = j3;
                i7 = i6;
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                modifier3 = modifier2;
            }
            iM11692getButtKaPHkGw = i5;
            j3 = jM11339copywmQWz5c$default;
            int i122 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                    keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                    keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 750);
                }
            }), null, 0L, 6, null);
            int i132 = InfiniteTransition.$stable;
            int i142 = InfiniteRepeatableSpec.$stable;
            i6 = iM11692getButtKaPHkGw;
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
            j4 = jM8846getPrimary0d7_KjU;
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                    keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                    keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                    keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                    keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
            stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                    keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                    keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
            modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(increaseSemanticsBounds(modifier3)), LinearIndicatorWidth, LinearIndicatorHeight);
            composerStartRestartGroup.startReplaceableGroup(1842406165);
            zChanged = composerStartRestartGroup.changed(j3) | composerStartRestartGroup.changed(i6) | composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changed(stateAnimateFloat2) | composerStartRestartGroup.changed(j4) | composerStartRestartGroup.changed(stateAnimateFloat3) | composerStartRestartGroup.changed(stateAnimateFloat4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                modifier4 = modifier3;
                j5 = j4;
                modifier5 = modifierM8174sizeVpY3zN4;
                Function1<DrawScope, Unit> function12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
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
                        ProgressIndicatorKt.m8987drawLinearIndicatorBackgroundAZGd3zU(drawScope, j3, fM11165getHeightimpl, i6);
                        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2) > 0.0f) {
                            ProgressIndicatorKt.m8986drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(stateAnimateFloat), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(stateAnimateFloat2), j4, fM11165getHeightimpl, i6);
                        }
                        if (ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3) - ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4) > 0.0f) {
                            ProgressIndicatorKt.m8986drawLinearIndicatorqYKTg0g(drawScope, ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(stateAnimateFloat3), ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(stateAnimateFloat4), j4, fM11165getHeightimpl, i6);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifier5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j6 = j3;
                i7 = i6;
                modifier2 = modifier4;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j5 = jM8846getPrimary0d7_KjU;
            j6 = jM11339copywmQWz5c$default;
            i7 = i5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier2;
            final long j7 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i15) {
                    ProgressIndicatorKt.m8973LinearProgressIndicator2cYBFYY(modifier6, j7, j6, i7, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m8976LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        Modifier modifier3;
        long jM8846getPrimary0d7_KjU;
        long jM11339copywmQWz5c$default;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-850309746);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                j3 = j;
                i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                        i3 &= -897;
                    } else {
                        jM8846getPrimary0d7_KjU = j3;
                    }
                    if ((i2 & 8) == 0) {
                        i3 &= -7169;
                        jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(jM8846getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850309746, i3, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:227)");
                    }
                    m8975LinearProgressIndicator_5eSRE(f, modifier3, jM8846getPrimary0d7_KjU, jM11339copywmQWz5c$default, StrokeCap.INSTANCE.m11692getButtKaPHkGw(), composerStartRestartGroup, i3 & 8190, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j3 = jM8846getPrimary0d7_KjU;
                    j5 = jM11339copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    jM8846getPrimary0d7_KjU = j3;
                }
                jM11339copywmQWz5c$default = j4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m8975LinearProgressIndicator_5eSRE(f, modifier3, jM8846getPrimary0d7_KjU, jM11339copywmQWz5c$default, StrokeCap.INSTANCE.m11692getButtKaPHkGw(), composerStartRestartGroup, i3 & 8190, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = jM8846getPrimary0d7_KjU;
                j5 = jM11339copywmQWz5c$default;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final long j6 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$5
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
                        ProgressIndicatorKt.m8976LinearProgressIndicatoreaDK9VM(f, modifier4, j6, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i3 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) == 0) {
                    jM11339copywmQWz5c$default = j4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m8975LinearProgressIndicator_5eSRE(f, modifier3, jM8846getPrimary0d7_KjU, jM11339copywmQWz5c$default, StrokeCap.INSTANCE.m11692getButtKaPHkGw(), composerStartRestartGroup, i3 & 8190, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = jM8846getPrimary0d7_KjU;
                j5 = jM11339copywmQWz5c$default;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m8974LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM8846getPrimary0d7_KjU;
        long jM11339copywmQWz5c$default;
        Modifier modifier3;
        long j3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-819397058);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            jM8846getPrimary0d7_KjU = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU)) ? 32 : 16;
        } else {
            jM8846getPrimary0d7_KjU = j;
        }
        if ((i & 896) == 0) {
            jM11339copywmQWz5c$default = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(jM11339copywmQWz5c$default)) ? 256 : 128;
        } else {
            jM11339copywmQWz5c$default = j2;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = jM8846getPrimary0d7_KjU;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(jM8846getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
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
            j3 = jM8846getPrimary0d7_KjU;
            long j4 = jM11339copywmQWz5c$default;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:241)");
            }
            m8973LinearProgressIndicator2cYBFYY(modifier3, j3, j4, StrokeCap.INSTANCE.m11692getButtKaPHkGw(), composerStartRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM11339copywmQWz5c$default = j4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final long j5 = j3;
            final long j6 = jM11339copywmQWz5c$default;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$6
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
                    ProgressIndicatorKt.m8974LinearProgressIndicatorRIQooxk(modifier4, j5, j6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m8986drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m8987drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m8986drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8969CircularProgressIndicatorDUhRLBM(@FloatRange(from = 0.0d, m9to = 1.0d) final float f, @Nullable Modifier modifier, long j, float f2, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long jM8846getPrimary0d7_KjU;
        int i5;
        float fM8968getStrokeWidthD9Ej5fM;
        int i6;
        long j3;
        int iM11692getButtKaPHkGw;
        long jM11375getTransparent0d7_KjU;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1746618448);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    jM8846getPrimary0d7_KjU = j;
                    int i8 = composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU) ? 256 : 128;
                    i4 |= i8;
                } else {
                    jM8846getPrimary0d7_KjU = j;
                }
                i4 |= i8;
            } else {
                jM8846getPrimary0d7_KjU = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    fM8968getStrokeWidthD9Ej5fM = f2;
                    i4 |= composerStartRestartGroup.changed(fM8968getStrokeWidthD9Ej5fM) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((57344 & i2) == 0) {
                        j3 = j2;
                        i4 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                    }
                    if ((458752 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            iM11692getButtKaPHkGw = i;
                            int i9 = composerStartRestartGroup.changed(iM11692getButtKaPHkGw) ? 131072 : 65536;
                            i4 |= i9;
                        } else {
                            iM11692getButtKaPHkGw = i;
                        }
                        i4 |= i9;
                    } else {
                        iM11692getButtKaPHkGw = i;
                    }
                    if ((374491 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                fM8968getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m8968getStrokeWidthD9Ej5fM();
                            }
                            jM11375getTransparent0d7_KjU = i6 == 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j3;
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                                iM11692getButtKaPHkGw = StrokeCap.INSTANCE.m11692getButtKaPHkGw();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            jM11375getTransparent0d7_KjU = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1746618448, i4, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:325)");
                        }
                        final float fCoerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
                        final Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(fM8968getStrokeWidthD9Ej5fM), 0.0f, iM11692getButtKaPHkGw, 0, null, 26, null);
                        final long j6 = jM11375getTransparent0d7_KjU;
                        final long j7 = jM8846getPrimary0d7_KjU;
                        CanvasKt.Canvas(SizeKt.m8172size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                                float f3 = fCoerceIn * 360.0f;
                                ProgressIndicatorKt.m8983drawCircularIndicatorBackgroundbw27NRU(drawScope, j6, stroke);
                                ProgressIndicatorKt.m8984drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, f3, j7, stroke);
                            }
                        }, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = jM8846getPrimary0d7_KjU;
                        j5 = jM11375getTransparent0d7_KjU;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j4 = jM8846getPrimary0d7_KjU;
                        j5 = j3;
                    }
                    final int i10 = iM11692getButtKaPHkGw;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final float f3 = fM8968getStrokeWidthD9Ej5fM;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                ProgressIndicatorKt.m8969CircularProgressIndicatorDUhRLBM(f, modifier3, j4, f3, j5, i10, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= CpioConstants.C_ISBLK;
                j3 = j2;
                if ((458752 & i2) != 0) {
                }
                if ((374491 & i4) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i3 & 32) != 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final float fCoerceIn2 = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
                        final Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(fM8968getStrokeWidthD9Ej5fM), 0.0f, iM11692getButtKaPHkGw, 0, null, 26, null);
                        final long j62 = jM11375getTransparent0d7_KjU;
                        final long j72 = jM8846getPrimary0d7_KjU;
                        CanvasKt.Canvas(SizeKt.m8172size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(modifier2, fCoerceIn2, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
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
                                float f32 = fCoerceIn2 * 360.0f;
                                ProgressIndicatorKt.m8983drawCircularIndicatorBackgroundbw27NRU(drawScope, j62, stroke2);
                                ProgressIndicatorKt.m8984drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, f32, j72, stroke2);
                            }
                        }, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j4 = jM8846getPrimary0d7_KjU;
                        j5 = jM11375getTransparent0d7_KjU;
                    }
                }
                final int i102 = iM11692getButtKaPHkGw;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fM8968getStrokeWidthD9Ej5fM = f2;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            j3 = j2;
            if ((458752 & i2) != 0) {
            }
            if ((374491 & i4) == 74898) {
            }
            final int i1022 = iM11692getButtKaPHkGw;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        fM8968getStrokeWidthD9Ej5fM = f2;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        j3 = j2;
        if ((458752 & i2) != 0) {
        }
        if ((374491 & i4) == 74898) {
        }
        final int i10222 = iM11692getButtKaPHkGw;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0274  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8970CircularProgressIndicatorLxG7B9w(@Nullable Modifier modifier, long j, float f, long j2, int i, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long jM8846getPrimary0d7_KjU;
        float fM8968getStrokeWidthD9Ej5fM;
        int i5;
        long jM11375getTransparent0d7_KjU;
        int i6;
        Modifier modifier3;
        int iM11694getSquareKaPHkGw;
        int i7;
        float f2;
        long j3;
        final long j4;
        final int i8;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1119119072);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i3 & 2) == 0) {
                jM8846getPrimary0d7_KjU = j;
                int i10 = composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU) ? 32 : 16;
                i4 |= i10;
            } else {
                jM8846getPrimary0d7_KjU = j;
            }
            i4 |= i10;
        } else {
            jM8846getPrimary0d7_KjU = j;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                fM8968getStrokeWidthD9Ej5fM = f;
                i4 |= composerStartRestartGroup.changed(fM8968getStrokeWidthD9Ej5fM) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    jM11375getTransparent0d7_KjU = j2;
                    i4 |= composerStartRestartGroup.changed(jM11375getTransparent0d7_KjU) ? 2048 : 1024;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        i6 = i;
                        int i12 = composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                        i4 |= i12;
                    } else {
                        i6 = i;
                    }
                    i4 |= i12;
                } else {
                    i6 = i;
                }
                if ((46811 & i4) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                        }
                        if (i11 != 0) {
                            fM8968getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m8968getStrokeWidthD9Ej5fM();
                        }
                        if (i5 != 0) {
                            jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
                        }
                        if ((i3 & 16) == 0) {
                            iM11694getSquareKaPHkGw = StrokeCap.INSTANCE.m11694getSquareKaPHkGw();
                            i7 = i4 & (-57345);
                            f2 = fM8968getStrokeWidthD9Ej5fM;
                            j3 = jM11375getTransparent0d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1119119072, i7, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:364)");
                        }
                        final Stroke stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f2), 0.0f, iM11694getSquareKaPHkGw, 0, null, 26, null);
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                        InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                        int i13 = InfiniteTransition.$stable;
                        int i14 = InfiniteRepeatableSpec.$stable;
                        final State stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, vectorConverter, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default, null, composerStartRestartGroup, i13 | 4528 | (i14 << 12), 16);
                        final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                        final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                                keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                                keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), 666);
                            }
                        }), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                        final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                                keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                                keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                            }
                        }), null, 0L, 6, null), null, composerStartRestartGroup, i13 | 432 | (i14 << 9), 8);
                        final long j6 = j3;
                        Modifier modifier4 = modifier3;
                        final float f3 = f2;
                        float f4 = f2;
                        long j7 = j3;
                        final long j8 = jM8846getPrimary0d7_KjU;
                        CanvasKt.Canvas(SizeKt.m8172size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                                ProgressIndicatorKt.m8983drawCircularIndicatorBackgroundbw27NRU(drawScope, j6, stroke);
                                ProgressIndicatorKt.m8985drawIndeterminateCircularIndicatorhrjfTZI(drawScope, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat3) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat), f3, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat2) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat3)), j8, stroke);
                            }
                        }, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        j4 = jM8846getPrimary0d7_KjU;
                        i8 = iM11694getSquareKaPHkGw;
                        fM8968getStrokeWidthD9Ej5fM = f4;
                        j5 = j7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        modifier3 = modifier2;
                    }
                    i7 = i4;
                    f2 = fM8968getStrokeWidthD9Ej5fM;
                    j3 = jM11375getTransparent0d7_KjU;
                    iM11694getSquareKaPHkGw = i6;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Stroke stroke2 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f2), 0.0f, iM11694getSquareKaPHkGw, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i132 = InfiniteTransition.$stable;
                    int i142 = InfiniteRepeatableSpec.$stable;
                    final State<Integer> stateAnimateValue2 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, vectorConverter2, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default2, null, composerStartRestartGroup, i132 | 4528 | (i142 << 12), 16);
                    final State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
                    final State<Float> stateAnimateFloat22 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
                    final State<Float> stateAnimateFloat32 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i132 | 432 | (i142 << 9), 8);
                    final long j62 = j3;
                    Modifier modifier42 = modifier3;
                    final float f32 = f2;
                    float f42 = f2;
                    long j72 = j3;
                    final long j82 = jM8846getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m8172size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                            ProgressIndicatorKt.m8983drawCircularIndicatorBackgroundbw27NRU(drawScope, j62, stroke2);
                            ProgressIndicatorKt.m8985drawIndeterminateCircularIndicatorhrjfTZI(drawScope, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat32) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue2) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat4), f32, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat22) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat32)), j82, stroke2);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                    j4 = jM8846getPrimary0d7_KjU;
                    i8 = iM11694getSquareKaPHkGw;
                    fM8968getStrokeWidthD9Ej5fM = f42;
                    j5 = j72;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j4 = jM8846getPrimary0d7_KjU;
                    j5 = jM11375getTransparent0d7_KjU;
                    i8 = i6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    final float f5 = fM8968getStrokeWidthD9Ej5fM;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            ProgressIndicatorKt.m8970CircularProgressIndicatorLxG7B9w(modifier5, j4, f5, j5, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 3072;
            jM11375getTransparent0d7_KjU = j2;
            if ((57344 & i2) == 0) {
            }
            if ((46811 & i4) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) == 0) {
                        i7 = i4;
                        f2 = fM8968getStrokeWidthD9Ej5fM;
                        j3 = jM11375getTransparent0d7_KjU;
                        iM11694getSquareKaPHkGw = i6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Stroke stroke22 = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f2), 0.0f, iM11694getSquareKaPHkGw, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition22 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    TwoWayConverter<Integer, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default22 = AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null);
                    int i1322 = InfiniteTransition.$stable;
                    int i1422 = InfiniteRepeatableSpec.$stable;
                    final State<Integer> stateAnimateValue22 = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition22, 0, 5, vectorConverter22, infiniteRepeatableSpecM7688infiniteRepeatable9IiC70o$default22, null, composerStartRestartGroup, i1322 | 4528 | (i1422 << 12), 16);
                    final State<Float> stateAnimateFloat42 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, BaseRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1332, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, i1322 | 432 | (i1422 << 9), 8);
                    final State<Float> stateAnimateFloat222 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i1322 | 432 | (i1422 << 9), 8);
                    final State<Float> stateAnimateFloat322 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition22, 0.0f, JumpRotationAngle, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(CircularProgressDrawable.ANIMATION_DURATION);
                            keyframesSpecConfig.using(keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.mo33at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, i1322 | 432 | (i1422 << 9), 8);
                    final long j622 = j3;
                    Modifier modifier422 = modifier3;
                    final float f322 = f2;
                    float f422 = f2;
                    long j722 = j3;
                    final long j822 = jM8846getPrimary0d7_KjU;
                    CanvasKt.Canvas(SizeKt.m8172size3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier3), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
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
                            ProgressIndicatorKt.m8983drawCircularIndicatorBackgroundbw27NRU(drawScope, j622, stroke22);
                            ProgressIndicatorKt.m8985drawIndeterminateCircularIndicatorhrjfTZI(drawScope, ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat322) + (((ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(stateAnimateValue22) * 216.0f) % 360.0f) - 90.0f) + ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(stateAnimateFloat42), f322, Math.abs(ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(stateAnimateFloat222) - ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(stateAnimateFloat322)), j822, stroke22);
                        }
                    }, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier422;
                    j4 = jM8846getPrimary0d7_KjU;
                    i8 = iM11694getSquareKaPHkGw;
                    fM8968getStrokeWidthD9Ej5fM = f422;
                    j5 = j722;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM8968getStrokeWidthD9Ej5fM = f;
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        jM11375getTransparent0d7_KjU = j2;
        if ((57344 & i2) == 0) {
        }
        if ((46811 & i4) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m8971CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM8846getPrimary0d7_KjU;
        int i4;
        float f3;
        Modifier modifier3;
        final float fM8968getStrokeWidthD9Ej5fM;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-409649739);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    jM8846getPrimary0d7_KjU = j;
                    int i6 = composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU) ? 256 : 128;
                    i3 |= i6;
                } else {
                    jM8846getPrimary0d7_KjU = j;
                }
                i3 |= i6;
            } else {
                jM8846getPrimary0d7_KjU = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    f3 = f2;
                    i3 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                }
                if ((i3 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j2 = jM8846getPrimary0d7_KjU;
                    fM8968getStrokeWidthD9Ej5fM = f3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                            i3 &= -897;
                        }
                        if (i4 == 0) {
                            fM8968getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m8968getStrokeWidthD9Ej5fM();
                            j2 = jM8846getPrimary0d7_KjU;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-409649739, i3, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:442)");
                        }
                        m8969CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM8968getStrokeWidthD9Ej5fM, Color.INSTANCE.m11375getTransparent0d7_KjU(), StrokeCap.INSTANCE.m11692getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
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
                    j2 = jM8846getPrimary0d7_KjU;
                    fM8968getStrokeWidthD9Ej5fM = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m8969CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM8968getStrokeWidthD9Ej5fM, Color.INSTANCE.m11375getTransparent0d7_KjU(), StrokeCap.INSTANCE.m11692getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final long j3 = j2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$5
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
                            ProgressIndicatorKt.m8971CircularProgressIndicatorMBs18nI(f, modifier4, j3, fM8968getStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            f3 = f2;
            if ((i3 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 == 0) {
                        j2 = jM8846getPrimary0d7_KjU;
                        fM8968getStrokeWidthD9Ej5fM = f3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m8969CircularProgressIndicatorDUhRLBM(f, modifier3, j2, fM8968getStrokeWidthD9Ej5fM, Color.INSTANCE.m11375getTransparent0d7_KjU(), StrokeCap.INSTANCE.m11692getButtKaPHkGw(), composerStartRestartGroup, (i3 & 14) | CpioConstants.C_ISBLK | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        f3 = f2;
        if ((i3 & 5851) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    @Composable
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m8972CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long jM8846getPrimary0d7_KjU;
        float f2;
        Modifier modifier3;
        float fM8968getStrokeWidthD9Ej5fM;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-392089979);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                jM8846getPrimary0d7_KjU = j;
                int i5 = composerStartRestartGroup.changed(jM8846getPrimary0d7_KjU) ? 32 : 16;
                i3 |= i5;
            } else {
                jM8846getPrimary0d7_KjU = j;
            }
            i3 |= i5;
        } else {
            jM8846getPrimary0d7_KjU = j;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                        i3 &= -113;
                    }
                    if (i6 == 0) {
                        fM8968getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m8968getStrokeWidthD9Ej5fM();
                    }
                    long j3 = jM8846getPrimary0d7_KjU;
                    int i7 = i3;
                    j2 = j3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-392089979, i7, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:457)");
                    }
                    m8970CircularProgressIndicatorLxG7B9w(modifier3, j2, fM8968getStrokeWidthD9Ej5fM, Color.INSTANCE.m11375getTransparent0d7_KjU(), StrokeCap.INSTANCE.m11694getSquareKaPHkGw(), composerStartRestartGroup, (i7 & 14) | 3072 | (i7 & 112) | (i7 & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = fM8968getStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    modifier3 = modifier2;
                }
                fM8968getStrokeWidthD9Ej5fM = f2;
                long j32 = jM8846getPrimary0d7_KjU;
                int i72 = i3;
                j2 = j32;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m8970CircularProgressIndicatorLxG7B9w(modifier3, j2, fM8968getStrokeWidthD9Ej5fM, Color.INSTANCE.m11375getTransparent0d7_KjU(), StrokeCap.INSTANCE.m11694getSquareKaPHkGw(), composerStartRestartGroup, (i72 & 14) | 3072 | (i72 & 112) | (i72 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = fM8968getStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j2 = jM8846getPrimary0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final long j4 = j2;
                final float f3 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$6
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
                        ProgressIndicatorKt.m8972CircularProgressIndicatoraMcp0Q(modifier4, j4, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 731) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i6 == 0) {
                    fM8968getStrokeWidthD9Ej5fM = f2;
                }
                long j322 = jM8846getPrimary0d7_KjU;
                int i722 = i3;
                j2 = j322;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m8970CircularProgressIndicatorLxG7B9w(modifier3, j2, fM8968getStrokeWidthD9Ej5fM, Color.INSTANCE.m11375getTransparent0d7_KjU(), StrokeCap.INSTANCE.m11694getSquareKaPHkGw(), composerStartRestartGroup, (i722 & 14) | 3072 | (i722 & 112) | (i722 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = fM8968getStrokeWidthD9Ej5fM;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m8982drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float fM11168getWidthimpl = Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc()) - (f3 * width);
        DrawScope.m11869drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.p003ui.geometry.SizeKt.Size(fM11168getWidthimpl, fM11168getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m8983drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m8982drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m8984drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m8982drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m8985drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m8982drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m11688equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m11692getButtKaPHkGw()) ? 0.0f : ((f2 / C2046Dp.m13666constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    @NotNull
    public static final Modifier increaseSemanticsBounds(@NotNull Modifier modifier) {
        final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(10);
        return PaddingKt.m8125paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.ProgressIndicatorKt.increaseSemanticsBounds.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m8988invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            @NotNull
            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m8988invoke3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
                final int iMo7868roundToPx0680j_4 = measureScope.mo7868roundToPx0680j_4(fM13666constructorimpl);
                int i = iMo7868roundToPx0680j_4 * 2;
                final Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(j, 0, i));
                return MeasureScope.layout$default(measureScope, placeableMo12610measureBRTryo0.getWidth(), placeableMo12610measureBRTryo0.getHeight() - i, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt.increaseSemanticsBounds.1.1
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
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt.increaseSemanticsBounds.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, fM13666constructorimpl, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }
}
