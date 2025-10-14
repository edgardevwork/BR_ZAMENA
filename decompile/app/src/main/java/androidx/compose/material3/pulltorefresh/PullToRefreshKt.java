package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ShadowKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathFillType;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.SavedStateHandle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PullToRefresh.kt */
@Metadata(m7104d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002\u001a(\u0010\u0018\u001a\u00020\u00192\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a]\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00190%¢\u0006\u0002\b&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u001c2\b\b\u0002\u0010*\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a*\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u0002002\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001aH\u0007\u001a,\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020\u00042\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aF\u00106\u001a\u00020\u0019*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a>\u0010A\u001a\u00020\u0019*\u0002072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00162\u0006\u0010B\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000f\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\u0011\"\u0010\u0010\u0014\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E²\u0006\n\u0010F\u001a\u00020\u0002X\u008a\u0084\u0002"}, m7105d2 = {"AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "", "ArcRadius", "Landroidx/compose/ui/unit/Dp;", "F", "ArrowHeight", "ArrowWidth", "CrossfadeDurationMs", "", "DragMultiplier", "Elevation", "MaxAlpha", "MaxProgressArc", "MinAlpha", "SpinnerContainerSize", "getSpinnerContainerSize", "()F", "SpinnerSize", "getSpinnerSize", "StrokeWidth", "ArrowValues", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "progress", "CircularArrowProgressIndicator", "", "Lkotlin/Function0;", "color", "Landroidx/compose/ui/graphics/Color;", "CircularArrowProgressIndicator-RPmYEkk", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "PullToRefreshContainer", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "modifier", "Landroidx/compose/ui/Modifier;", "indicator", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "PullToRefreshContainer-wBJOh4Y", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "PullToRefreshState", "positionalThresholdPx", "initialRefreshing", "", "enabled", "rememberPullToRefreshState", "positionalThreshold", "rememberPullToRefreshState--orJrPs", "(FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", SavedStateHandle.VALUES, "strokeWidth", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "drawCircularIndicator", "arcBounds", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "material3_release", "targetAlpha"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n1116#2,6:559\n1116#2,6:567\n1116#2,6:573\n1116#2,6:579\n1116#2,6:585\n1116#2,6:591\n74#3:565\n1#4:566\n137#5,5:597\n262#5,11:602\n81#6:613\n164#7:614\n164#7:615\n154#7:616\n154#7:617\n154#7:618\n154#7:619\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n119#1:559,6\n262#1:567,6\n429#1:573,6\n431#1:579,6\n437#1:585,6\n442#1:591,6\n254#1:565\n529#1:597,5\n529#1:602,11\n431#1:613\n538#1:614\n539#1:615\n540#1:616\n541#1:617\n543#1:618\n544#1:619\n*E\n"})
/* loaded from: classes3.dex */
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = C2046Dp.m13666constructorimpl((float) 2.5d);
    private static final float ArcRadius = C2046Dp.m13666constructorimpl((float) 5.5d);
    private static final float SpinnerSize = C2046Dp.m13666constructorimpl(16);
    private static final float SpinnerContainerSize = C2046Dp.m13666constructorimpl(40);
    private static final float Elevation = ElevationTokens.INSTANCE.m10373getLevel2D9Ej5fM();
    private static final float ArrowWidth = C2046Dp.m13666constructorimpl(10);
    private static final float ArrowHeight = C2046Dp.m13666constructorimpl(5);

    @NotNull
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:138:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PullToRefreshContainer-wBJOh4Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10192PullToRefreshContainerwBJOh4Y(@NotNull final PullToRefreshState pullToRefreshState, @Nullable Modifier modifier, @Nullable Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function3, @Nullable Shape shape, long j, long j2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function3M10188getLambda1$material3_release;
        int i5;
        Shape shape2;
        long containerColor;
        long contentColor;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-801976958);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function3M10188getLambda1$material3_release = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function3M10188getLambda1$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        shape2 = shape;
                        i3 |= composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                    }
                    if ((i & CpioConstants.C_ISBLK) != 0) {
                        if ((i2 & 16) == 0) {
                            containerColor = j;
                            int i7 = composerStartRestartGroup.changed(containerColor) ? 16384 : 8192;
                            i3 |= i7;
                        } else {
                            containerColor = j;
                        }
                        i3 |= i7;
                    } else {
                        containerColor = j;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            contentColor = j2;
                            int i8 = composerStartRestartGroup.changed(contentColor) ? 131072 : 65536;
                            i3 |= i8;
                        } else {
                            contentColor = j2;
                        }
                        i3 |= i8;
                    } else {
                        contentColor = j2;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(751291370);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final State state = (State) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            final Modifier modifier3 = modifier2;
                            final Shape shape3 = shape2;
                            final long j3 = containerColor;
                            final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function32 = function3M10188getLambda1$material3_release;
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i9) {
                                    float fM13666constructorimpl;
                                    if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(935555266, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                        }
                                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(modifier3, PullToRefreshKt.getSpinnerContainerSize());
                                        composer2.startReplaceableGroup(-1737250521);
                                        boolean zChanged = composer2.changed(pullToRefreshState);
                                        final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                    invoke2(graphicsLayerScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                                                    graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m11165getHeightimpl(graphicsLayerScope.getSize()));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM8172size3ABfNKs, (Function1) objRememberedValue2);
                                        if (state.getValue().booleanValue()) {
                                            fM13666constructorimpl = PullToRefreshKt.Elevation;
                                        } else {
                                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                        }
                                        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ShadowKt.m11012shadows4CzXII$default(modifierGraphicsLayer, fM13666constructorimpl, shape3, true, 0L, 0L, 24, null), j3, shape3);
                                        Function3<PullToRefreshState, Composer, Integer, Unit> function33 = function32;
                                        PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function33.invoke(pullToRefreshState3, composer2, 0);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        } else {
                            if (i6 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function3M10188getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m10188getLambda1$material3_release();
                            }
                            if (i5 != 0) {
                                shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                            }
                            if ((i2 & 16) != 0) {
                                containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(751291370);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                                    }
                                });
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final State<Boolean> state2 = (State) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            final Modifier modifier32 = modifier2;
                            final Shape shape32 = shape2;
                            final long j32 = containerColor;
                            final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function322 = function3M10188getLambda1$material3_release;
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i9) {
                                    float fM13666constructorimpl;
                                    if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(935555266, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                        }
                                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(modifier32, PullToRefreshKt.getSpinnerContainerSize());
                                        composer2.startReplaceableGroup(-1737250521);
                                        boolean zChanged = composer2.changed(pullToRefreshState);
                                        final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                    invoke2(graphicsLayerScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                                                    graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m11165getHeightimpl(graphicsLayerScope.getSize()));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM8172size3ABfNKs, (Function1) objRememberedValue2);
                                        if (state2.getValue().booleanValue()) {
                                            fM13666constructorimpl = PullToRefreshKt.Elevation;
                                        } else {
                                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                        }
                                        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ShadowKt.m11012shadows4CzXII$default(modifierGraphicsLayer, fM13666constructorimpl, shape32, true, 0L, 0L, 24, null), j32, shape32);
                                        Function3<PullToRefreshState, Composer, Integer, Unit> function33 = function322;
                                        PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                        composer2.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                        composer2.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        function33.invoke(pullToRefreshState3, composer2, 0);
                                        composer2.endReplaceableGroup();
                                        composer2.endNode();
                                        composer2.endReplaceableGroup();
                                        composer2.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function33 = function3M10188getLambda1$material3_release;
                    final Shape shape4 = shape2;
                    final long j4 = contentColor;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        final long j5 = containerColor;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i9) {
                                PullToRefreshKt.m10192PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier4, function33, shape4, j5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                shape2 = shape;
                if ((i & CpioConstants.C_ISBLK) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i6 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if ((i2 & 32) != 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(751291370);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final State<Boolean> state22 = (State) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        final Modifier modifier322 = modifier2;
                        final Shape shape322 = shape2;
                        final long j322 = containerColor;
                        final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function3222 = function3M10188getLambda1$material3_release;
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i9) {
                                float fM13666constructorimpl;
                                if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(935555266, i9, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                    }
                                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(modifier322, PullToRefreshKt.getSpinnerContainerSize());
                                    composer2.startReplaceableGroup(-1737250521);
                                    boolean zChanged = composer2.changed(pullToRefreshState);
                                    final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                invoke2(graphicsLayerScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                                                graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m11165getHeightimpl(graphicsLayerScope.getSize()));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM8172size3ABfNKs, (Function1) objRememberedValue2);
                                    if (state22.getValue().booleanValue()) {
                                        fM13666constructorimpl = PullToRefreshKt.Elevation;
                                    } else {
                                        fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                    }
                                    Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ShadowKt.m11012shadows4CzXII$default(modifierGraphicsLayer, fM13666constructorimpl, shape322, true, 0L, 0L, 24, null), j322, shape322);
                                    Function3<PullToRefreshState, Composer, Integer, Unit> function332 = function3222;
                                    PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function332.invoke(pullToRefreshState3, composer2, 0);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
                final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function332 = function3M10188getLambda1$material3_release;
                final Shape shape42 = shape2;
                final long j42 = contentColor;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function3M10188getLambda1$material3_release = function3;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            shape2 = shape;
            if ((i & CpioConstants.C_ISBLK) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function3322 = function3M10188getLambda1$material3_release;
            final Shape shape422 = shape2;
            final long j422 = contentColor;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function3M10188getLambda1$material3_release = function3;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        shape2 = shape;
        if ((i & CpioConstants.C_ISBLK) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function33222 = function3M10188getLambda1$material3_release;
        final Shape shape4222 = shape2;
        final long j4222 = contentColor;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: rememberPullToRefreshState--orJrPs */
    public static final PullToRefreshState m10198rememberPullToRefreshStateorJrPs(float f, @Nullable final Function0<Boolean> function0, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1935213334);
        if ((i2 & 1) != 0) {
            f = PullToRefreshDefaults.INSTANCE.m10190getPositionalThresholdD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$rememberPullToRefreshState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1935213334, i, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:252)");
        }
        final float fMo7874toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f);
        Object[] objArr = {Float.valueOf(fMo7874toPx0680j_4), function0};
        Saver<PullToRefreshState, Boolean> Saver = PullToRefreshStateImpl.INSTANCE.Saver(fMo7874toPx0680j_4, function0);
        composer.startReplaceableGroup(804873447);
        boolean zChanged = ((((i & 112) ^ 48) > 32 && composer.changed(function0)) || (i & 48) == 32) | composer.changed(fMo7874toPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<PullToRefreshState>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$rememberPullToRefreshState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PullToRefreshState invoke() {
                    return new PullToRefreshStateImpl(false, fMo7874toPx0680j_4, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PullToRefreshState pullToRefreshState = (PullToRefreshState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pullToRefreshState;
    }

    /* compiled from: PullToRefresh.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshState$1 */
    public static final class C17331 extends Lambda implements Function0<Boolean> {
        public static final C17331 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ PullToRefreshState PullToRefreshState$default(float f, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = C17331.INSTANCE;
        }
        return PullToRefreshState(f, z, function0);
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final PullToRefreshState PullToRefreshState(float f, boolean z, @NotNull Function0<Boolean> function0) {
        return new PullToRefreshStateImpl(z, f, function0);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk */
    public static final void m10191CircularArrowProgressIndicatorRPmYEkk(final Function0<Float> function0, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:427)");
            }
            composerStartRestartGroup.startReplaceableGroup(-656076138);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo11233setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m11622getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-656075976);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Float invoke() {
                        return Float.valueOf(function0.invoke().floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$6((State) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-656075714);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
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
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function0.invoke().floatValue(), RangesKt__RangesKt.rangeTo(0.0f, 1.0f), 0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(SemanticsModifierKt.semantics(companion2, true, (Function1) objRememberedValue3), SpinnerSize);
            composerStartRestartGroup.startReplaceableGroup(-656075558);
            boolean zChanged = (i3 == 4) | composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                composer2 = composerStartRestartGroup;
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
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
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(function0.invoke().floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j2 = j;
                        Path path2 = path;
                        long jMo11888getCenterF1C5BW0 = drawScope.mo11888getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        drawContext.getTransform().mo11820rotateUv8p0NA(rotation, jMo11888getCenterF1C5BW0);
                        Rect rectM11138Rect3MmeM6k = RectKt.m11138Rect3MmeM6k(androidx.compose.p003ui.geometry.SizeKt.m11178getCenteruvyYCjk(drawScope.mo11889getSizeNHjbRc()), drawScope.mo7874toPx0680j_4(PullToRefreshKt.ArcRadius) + (drawScope.mo7874toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f));
                        PullToRefreshKt.m10197drawCircularIndicatorKzyDr3Q(drawScope, j2, fFloatValue, ArrowValues, rectM11138Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                        PullToRefreshKt.m10196drawArrowuDrxG_w(drawScope, path2, rectM11138Rect3MmeM6k, j2, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                        drawContext.getCanvas().restore();
                        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
                    }
                };
                composer2.updateRememberedValue(function1);
                objRememberedValue4 = function1;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM8172size3ABfNKs, (Function1) objRememberedValue4, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i4) {
                    PullToRefreshKt.m10191CircularArrowProgressIndicatorRPmYEkk(function0, j, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* renamed from: drawCircularIndicator-KzyDr3Q */
    public static final void m10197drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j, float f, ArrowValues arrowValues, Rect rect, float f2) {
        DrawScope.m11869drawArcyD3GUKo$default(drawScope, j, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m11134getTopLeftF1C5BW0(), rect.m11132getSizeNHjbRc(), f, new Stroke(drawScope.mo7874toPx0680j_4(f2), 0.0f, StrokeCap.INSTANCE.m11692getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
    }

    public static final ArrowValues ArrowValues(float f) {
        float fMax = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5) / 3;
        float fCoerceIn = RangesKt___RangesKt.coerceIn(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4))) * 0.5f;
        float f2 = 360;
        return new ArrowValues(fPow, fPow * f2, ((0.8f * fMax) + fPow) * f2, Math.min(1.0f, fMax));
    }

    /* renamed from: drawArrow-uDrxG_w */
    public static final void m10196drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j, float f, ArrowValues arrowValues, float f2) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f3 = ArrowWidth;
        path.lineTo((drawScope.mo7874toPx0680j_4(f3) * arrowValues.getScale()) / 2, drawScope.mo7874toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo7874toPx0680j_4(f3) * arrowValues.getScale(), 0.0f);
        path.mo11235translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m11099getXimpl(rect.m11129getCenterF1C5BW0())) - ((drawScope.mo7874toPx0680j_4(f3) * arrowValues.getScale()) / 2.0f), Offset.m11100getYimpl(rect.m11129getCenterF1C5BW0()) - drawScope.mo7874toPx0680j_4(f2)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo7874toPx0680j_4(f2);
        long jMo11888getCenterF1C5BW0 = drawScope.mo11888getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11814getSizeNHjbRc = drawContext.mo11814getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo11820rotateUv8p0NA(endAngle, jMo11888getCenterF1C5BW0);
        DrawScope.m11880drawPathLG529CI$default(drawScope, path, j, f, new Stroke(drawScope.mo7874toPx0680j_4(f2), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        drawContext.getCanvas().restore();
        drawContext.mo11815setSizeuvyYCjk(jMo11814getSizeNHjbRc);
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }
}
