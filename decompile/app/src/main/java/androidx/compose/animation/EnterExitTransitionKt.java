package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.TransformOrigin;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Metadata(m7104d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0000\u001a \u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010H\u0000\u001aQ\u0010\u0014\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001aQ\u0010!\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u0010\u0017\u001a\u00020\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00060\u001cH\u0007\u001aQ\u0010%\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u0010\u0017\u001a\u00020&2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a\"\u0010)\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u0002H\u0007\u001a\"\u0010+\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0002H\u0007\u001a6\u0010-\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a6\u00102\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aQ\u00106\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001aQ\u00109\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010:\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00060\u001cH\u0007\u001aQ\u0010;\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\b\b\u0002\u00107\u001a\u00020&2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2#\b\u0002\u0010<\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a;\u0010=\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\u001cH\u0007\u001a=\u0010?\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010@\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a=\u0010A\u001a\u00020\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a;\u0010C\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162!\u0010D\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\u001cH\u0007\u001a=\u0010E\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010F\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a=\u0010G\u001a\u00020\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162#\b\u0002\u0010H\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007\u001a/\u0010I\u001a\u00020J*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020PH\u0003¢\u0006\u0002\u0010Q\u001a/\u0010R\u001a\u00020S*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020PH\u0001¢\u0006\u0002\u0010T\u001a\u001f\u0010U\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0080\u0002\u001a\u001f\u0010U\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0010*\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0080\u0002\u001a\f\u0010V\u001a\u00020\"*\u00020\u0018H\u0002\u001a\f\u0010V\u001a\u00020\"*\u00020&H\u0002\u001a\u001f\u0010W\u001a\u00020\f*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010M\u001a\u00020\fH\u0001¢\u0006\u0002\u0010X\u001a\u001f\u0010Y\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010N\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010Z\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006[²\u0006\n\u0010\\\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010]\u001a\u00020\u0013X\u008a\u008e\u0002"}, m7105d2 = {"DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "DefaultOffsetAnimationSpec", "Landroidx/compose/ui/unit/IntOffset;", "DefaultSizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/TransformOrigin;", "Landroidx/compose/animation/core/AnimationVector2D;", "EnterTransition", "Landroidx/compose/animation/EnterTransition;", "key", "", "node", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "ExitTransition", "Landroidx/compose/animation/ExitTransition;", "expandHorizontally", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "expandFrom", "Landroidx/compose/ui/Alignment$Horizontal;", "clip", "", "initialWidth", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "fullWidth", "expandIn", "Landroidx/compose/ui/Alignment;", "initialSize", "fullSize", "expandVertically", "Landroidx/compose/ui/Alignment$Vertical;", "initialHeight", "fullHeight", "fadeIn", "initialAlpha", "fadeOut", "targetAlpha", "scaleIn", "initialScale", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleOut", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "shrinkHorizontally", "shrinkTowards", "targetWidth", "shrinkOut", "targetSize", "shrinkVertically", "targetHeight", "slideIn", "initialOffset", "slideInHorizontally", "initialOffsetX", "slideInVertically", "initialOffsetY", "slideOut", "targetOffset", "slideOutHorizontally", "targetOffsetX", "slideOutVertically", "targetOffsetY", "createGraphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "createModifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "get", "toAlignment", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "animation_release", "activeEnter", "activeExit"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1246:1\n25#2:1247\n25#2:1254\n25#2:1261\n36#2:1268\n36#2:1275\n25#2:1282\n25#2:1289\n1116#3,6:1248\n1116#3,6:1255\n1116#3,6:1262\n1116#3,6:1269\n1116#3,6:1276\n1116#3,6:1283\n1116#3,6:1290\n81#4:1296\n107#4,2:1297\n81#4:1299\n107#4,2:1300\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n865#1:1247\n870#1:1254\n876#1:1261\n900#1:1268\n920#1:1275\n953#1:1282\n959#1:1289\n865#1:1248,6\n870#1:1255,6\n876#1:1262,6\n900#1:1269,6\n920#1:1276,6\n953#1:1283,6\n959#1:1290,6\n900#1:1296\n900#1:1297,2\n920#1:1299\n920#1:1300,2\n*E\n"})
/* loaded from: classes3.dex */
public final class EnterExitTransitionKt {

    @NotNull
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new Function1<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m7637invoke__ExYCQ(transformOrigin.getPackedValue());
        }

        @NotNull
        /* renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m7637invoke__ExYCQ(long j) {
            return new AnimationVector2D(TransformOrigin.m11725getPivotFractionXimpl(j), TransformOrigin.m11726getPivotFractionYimpl(j));
        }
    }, new Function1<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m11717boximpl(m7638invokeLIALnN8(animationVector2D));
        }

        /* renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m7638invokeLIALnN8(@NotNull AnimationVector2D animationVector2D) {
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });

    @NotNull
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    @NotNull
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13785boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);

    @NotNull
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13785boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull Function1<? super IntSize, IntOffset> function1) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13785boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull Function1<? super IntSize, IntOffset> function1) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(function1, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default */
    public static /* synthetic */ EnterTransition m7634scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ();
        }
        return m7633scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    @Stable
    @NotNull
    /* renamed from: scaleIn-L8ZKh-E */
    public static final EnterTransition m7633scaleInL8ZKhE(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default */
    public static /* synthetic */ ExitTransition m7636scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ();
        }
        return m7635scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    @Stable
    @NotNull
    /* renamed from: scaleOut-L8ZKh-E */
    public static final ExitTransition m7635scaleOutL8ZKhE(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), false, null, 55, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C02931.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandIn$1 */
    /* loaded from: classes2.dex */
    public static final class C02931 extends Lambda implements Function1<IntSize, IntSize> {
        public static final C02931 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m13828boximpl(m7641invokemzRDjE0(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mzRDjE0 */
        public final long m7641invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment alignment, boolean z, @NotNull Function1<? super IntSize, IntSize> function1) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), null, false, null, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C02981.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1 */
    /* loaded from: classes2.dex */
    public static final class C02981 extends Lambda implements Function1<IntSize, IntSize> {
        public static final C02981 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m13828boximpl(m7644invokemzRDjE0(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mzRDjE0 */
        public final long m7644invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment alignment, boolean z, @NotNull Function1<? super IntSize, IntSize> function1) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, function1, finiteAnimationSpec, z), null, false, null, 59, null));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C02911.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1 */
    /* loaded from: classes2.dex */
    public static final class C02911 extends Lambda implements Function1<Integer, Integer> {
        public static final C02911 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2 */
    /* loaded from: classes2.dex */
    public static final class C02922 extends Lambda implements Function1<IntSize, IntSize> {
        public final /* synthetic */ Function1<Integer, Integer> $initialWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02922(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m13828boximpl(m7640invokemzRDjE0(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mzRDjE0 */
        public final long m7640invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), IntSize.m13835getHeightimpl(j));
        }
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Horizontal horizontal, boolean z, @NotNull Function1<? super Integer, Integer> function1) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            public final /* synthetic */ Function1<Integer, Integer> $initialWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02922(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m13828boximpl(m7640invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0 */
            public final long m7640invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), IntSize.m13835getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C02941.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1 */
    /* loaded from: classes2.dex */
    public static final class C02941 extends Lambda implements Function1<Integer, Integer> {
        public static final C02941 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2 */
    /* loaded from: classes2.dex */
    public static final class C02952 extends Lambda implements Function1<IntSize, IntSize> {
        public final /* synthetic */ Function1<Integer, Integer> $initialHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02952(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m13828boximpl(m7642invokemzRDjE0(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mzRDjE0 */
        public final long m7642invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(IntSize.m13836getWidthimpl(j), function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
        }
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Vertical vertical, boolean z, @NotNull Function1<? super Integer, Integer> function1) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            public final /* synthetic */ Function1<Integer, Integer> $initialHeight;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02952(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m13828boximpl(m7642invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0 */
            public final long m7642invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m13836getWidthimpl(j), function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C02961.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1 */
    /* loaded from: classes2.dex */
    public static final class C02961 extends Lambda implements Function1<Integer, Integer> {
        public static final C02961 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2 */
    /* loaded from: classes2.dex */
    public static final class C02972 extends Lambda implements Function1<IntSize, IntSize> {
        public final /* synthetic */ Function1<Integer, Integer> $targetWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02972(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m13828boximpl(m7643invokemzRDjE0(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mzRDjE0 */
        public final long m7643invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), IntSize.m13835getHeightimpl(j));
        }
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Horizontal horizontal, boolean z, @NotNull Function1<? super Integer, Integer> function1) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            public final /* synthetic */ Function1<Integer, Integer> $targetWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02972(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m13828boximpl(m7643invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0 */
            public final long m7643invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), IntSize.m13835getHeightimpl(j));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13828boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            function1 = C02991.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1 */
    /* loaded from: classes2.dex */
    public static final class C02991 extends Lambda implements Function1<Integer, Integer> {
        public static final C02991 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2 */
    /* loaded from: classes2.dex */
    public static final class C03002 extends Lambda implements Function1<IntSize, IntSize> {
        public final /* synthetic */ Function1<Integer, Integer> $targetHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03002(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m13828boximpl(m7645invokemzRDjE0(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mzRDjE0 */
        public final long m7645invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(IntSize.m13836getWidthimpl(j), function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
        }
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Vertical vertical, boolean z, @NotNull Function1<? super Integer, Integer> function1) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new Function1<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            public final /* synthetic */ Function1<Integer, Integer> $targetHeight;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03002(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m13828boximpl(m7645invokemzRDjE0(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mzRDjE0 */
            public final long m7645invokemzRDjE0(long j) {
                return IntSizeKt.IntSize(IntSize.m13836getWidthimpl(j), function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13785boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = C03011.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1 */
    /* loaded from: classes2.dex */
    public static final class C03011 extends Lambda implements Function1<Integer, Integer> {
        public static final C03011 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2 */
    /* loaded from: classes2.dex */
    public static final class C03022 extends Lambda implements Function1<IntSize, IntOffset> {
        public final /* synthetic */ Function1<Integer, Integer> $initialOffsetX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03022(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m13785boximpl(m7646invokemHKZG7I(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mHKZG7I */
        public final long m7646invokemHKZG7I(long j) {
            return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), 0);
        }
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull Function1<? super Integer, Integer> function1) {
        return slideIn(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            public final /* synthetic */ Function1<Integer, Integer> $initialOffsetX;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03022(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m13785boximpl(m7646invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I */
            public final long m7646invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13785boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = C03031.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1 */
    /* loaded from: classes2.dex */
    public static final class C03031 extends Lambda implements Function1<Integer, Integer> {
        public static final C03031 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2 */
    /* loaded from: classes2.dex */
    public static final class C03042 extends Lambda implements Function1<IntSize, IntOffset> {
        public final /* synthetic */ Function1<Integer, Integer> $initialOffsetY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03042(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m13785boximpl(m7647invokemHKZG7I(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mHKZG7I */
        public final long m7647invokemHKZG7I(long j) {
            return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
        }
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull Function1<? super Integer, Integer> function1) {
        return slideIn(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            public final /* synthetic */ Function1<Integer, Integer> $initialOffsetY;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03042(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m13785boximpl(m7647invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I */
            public final long m7647invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13785boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = C03051.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1 */
    /* loaded from: classes2.dex */
    public static final class C03051 extends Lambda implements Function1<Integer, Integer> {
        public static final C03051 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2 */
    /* loaded from: classes2.dex */
    public static final class C03062 extends Lambda implements Function1<IntSize, IntOffset> {
        public final /* synthetic */ Function1<Integer, Integer> $targetOffsetX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03062(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m13785boximpl(m7648invokemHKZG7I(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mHKZG7I */
        public final long m7648invokemHKZG7I(long j) {
            return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), 0);
        }
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull Function1<? super Integer, Integer> function1) {
        return slideOut(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            public final /* synthetic */ Function1<Integer, Integer> $targetOffsetX;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03062(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m13785boximpl(m7648invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I */
            public final long m7648invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(function1.invoke(Integer.valueOf(IntSize.m13836getWidthimpl(j))).intValue(), 0);
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13785boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function1 = C03071.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m7105d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1 */
    /* loaded from: classes2.dex */
    public static final class C03071 extends Lambda implements Function1<Integer, Integer> {
        public static final C03071 INSTANCE = ;

        @NotNull
        public final Integer invoke(int i) {
            return Integer.valueOf((-i) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2 */
    /* loaded from: classes2.dex */
    public static final class C03082 extends Lambda implements Function1<IntSize, IntOffset> {
        public final /* synthetic */ Function1<Integer, Integer> $targetOffsetY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03082(Function1<? super Integer, Integer> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
            return IntOffset.m13785boximpl(m7649invokemHKZG7I(intSize.getPackedValue()));
        }

        /* renamed from: invoke-mHKZG7I */
        public final long m7649invokemHKZG7I(long j) {
            return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
        }
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull Function1<? super Integer, Integer> function1) {
        return slideOut(finiteAnimationSpec, new Function1<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            public final /* synthetic */ Function1<Integer, Integer> $targetOffsetY;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03082(Function1<? super Integer, Integer> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m13785boximpl(m7649invokemHKZG7I(intSize.getPackedValue()));
            }

            /* renamed from: invoke-mHKZG7I */
            public final long m7649invokemHKZG7I(long j) {
                return IntOffsetKt.IntOffset(0, function1.invoke(Integer.valueOf(IntSize.m13835getHeightimpl(j))).intValue());
            }
        });
    }

    @NotNull
    public static final EnterTransition EnterTransition(@NotNull Object obj, @NotNull ModifierNodeElement<? extends Modifier.Node> modifierNodeElement) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, false, MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(obj, modifierNodeElement)), 31, null));
    }

    @NotNull
    public static final ExitTransition ExitTransition(@NotNull Object obj, @NotNull ModifierNodeElement<? extends Modifier.Node> modifierNodeElement) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, false, MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(obj, modifierNodeElement)), 31, null));
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(horizontal, companion.getStart()) ? companion.getCenterStart() : Intrinsics.areEqual(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return Intrinsics.areEqual(vertical, companion.getTop()) ? companion.getTopCenter() : Intrinsics.areEqual(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }

    @Nullable
    public static final ModifierNodeElement<? extends Modifier.Node> get(@NotNull EnterTransition enterTransition, @NotNull Object obj) {
        return enterTransition.getData().getEffectsMap().get(obj);
    }

    @Nullable
    public static final ModifierNodeElement<? extends Modifier.Node> get(@NotNull ExitTransition exitTransition, @NotNull Object obj) {
        return exitTransition.getData().getEffectsMap().get(obj);
    }

    @Composable
    @NotNull
    public static final Modifier createModifier(@NotNull Transition<EnterExitState> transition, @NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition, @NotNull String str, @Nullable Composer composer, int i) {
        int i2;
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation;
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2;
        ChangeSize changeSize;
        composer.startReplaceableGroup(914000546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(914000546, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:855)");
        }
        int i3 = i & 14;
        EnterTransition enterTransitionTrackActiveEnter = trackActiveEnter(transition, enterTransition, composer, i & 126);
        ExitTransition exitTransitionTrackActiveExit = trackActiveExit(transition, exitTransition, composer, ((i >> 3) & 112) | i3);
        boolean z = (enterTransitionTrackActiveEnter.getData().getSlide() == null && exitTransitionTrackActiveExit.getData().getSlide() == null) ? false : true;
        boolean z2 = (enterTransitionTrackActiveEnter.getData().getChangeSize() == null && exitTransitionTrackActiveExit.getData().getChangeSize() == null) ? false : true;
        composer.startReplaceableGroup(1657242209);
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation3 = null;
        if (z) {
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = str + " slide";
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            i2 = -492369756;
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) objRememberedValue, composer, i3 | 448, 0);
        } else {
            i2 = -492369756;
            deferredAnimationCreateDeferredAnimation = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1657242379);
        if (z2) {
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
            composer.startReplaceableGroup(i2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = str + " shrink/expand";
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) objRememberedValue2, composer, i3 | 448, 0);
        } else {
            deferredAnimationCreateDeferredAnimation2 = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1657242547);
        if (z2) {
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
            composer.startReplaceableGroup(i2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            deferredAnimationCreateDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (String) objRememberedValue3, composer, i3 | 448, 0);
        }
        composer.endReplaceableGroup();
        ChangeSize changeSize2 = enterTransitionTrackActiveEnter.getData().getChangeSize();
        Modifier modifierThen = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, !(((changeSize2 == null || changeSize2.getClip()) && ((changeSize = exitTransitionTrackActiveExit.getData().getChangeSize()) == null || changeSize.getClip()) && z2) ? false : true), null, 0L, 0L, 0, 126975, null).then(new EnterExitTransitionElement(transition, deferredAnimationCreateDeferredAnimation2, deferredAnimationCreateDeferredAnimation3, deferredAnimationCreateDeferredAnimation, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, createGraphicsLayerBlock(transition, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, str, composer, i & 7182)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }

    @Composable
    @NotNull
    public static final EnterTransition trackActiveEnter(@NotNull Transition<EnterExitState> transition, @NotNull EnterTransition enterTransition, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(21614502);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:894)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$4(mutableState).plus(enterTransition));
        }
        EnterTransition enterTransitionTrackActiveEnter$lambda$4 = trackActiveEnter$lambda$4(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterTransitionTrackActiveEnter$lambda$4;
    }

    @Composable
    @NotNull
    public static final ExitTransition trackActiveExit(@NotNull Transition<EnterExitState> transition, @NotNull ExitTransition exitTransition, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1363864804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:914)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$7(mutableState).plus(exitTransition));
        }
        ExitTransition exitTransitionTrackActiveExit$lambda$7 = trackActiveExit$lambda$7(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return exitTransitionTrackActiveExit$lambda$7;
    }

    @Composable
    private static final GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(final Transition<EnterExitState> transition, final EnterTransition enterTransition, final ExitTransition exitTransition, String str, Composer composer, int i) {
        final Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation;
        final Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2;
        composer.startReplaceableGroup(642253525);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(642253525, i, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:942)");
        }
        boolean z = (enterTransition.getData().getFade() == null && exitTransition.getData().getFade() == null) ? false : true;
        boolean z2 = (enterTransition.getData().getScale() == null && exitTransition.getData().getScale() == null) ? false : true;
        composer.startReplaceableGroup(-1158245383);
        if (z) {
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = str + " alpha";
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) objRememberedValue, composer, (i & 14) | 448, 0);
        } else {
            deferredAnimationCreateDeferredAnimation = null;
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-1158245186);
        if (z2) {
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = str + " scale";
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) objRememberedValue2, composer, (i & 14) | 448, 0);
        } else {
            deferredAnimationCreateDeferredAnimation2 = null;
        }
        composer.endReplaceableGroup();
        final Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation3 = z2 ? androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", composer, (i & 14) | 448, 0) : null;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = new GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.EnterExitTransitionKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
            public final Function1 init() {
                return EnterExitTransitionKt.createGraphicsLayerBlock$lambda$11(deferredAnimationCreateDeferredAnimation, deferredAnimationCreateDeferredAnimation2, transition, enterTransition, exitTransition, deferredAnimationCreateDeferredAnimation3);
            }
        };
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return graphicsLayerBlockForEnterExit;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Function1 createGraphicsLayerBlock$lambda$11(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, final EnterTransition enterTransition, final ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        final TransformOrigin transformOriginM11717boximpl;
        final State stateAnimate = deferredAnimation != null ? deferredAnimation.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                FiniteAnimationSpec<Float> animationSpec;
                FiniteAnimationSpec<Float> animationSpec2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Fade fade = enterTransition.getData().getFade();
                    return (fade == null || (animationSpec2 = fade.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : animationSpec2;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                }
                Fade fade2 = exitTransition.getData().getFade();
                return (fade2 == null || (animationSpec = fade2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : animationSpec;
            }
        }, new Function1<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2

            /* compiled from: EnterExitTransition.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* loaded from: classes3.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Float invoke(@NotNull EnterExitState enterExitState) {
                int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float alpha = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        Fade fade = enterTransition.getData().getFade();
                        if (fade != null) {
                            alpha = fade.getAlpha();
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Fade fade2 = exitTransition.getData().getFade();
                        if (fade2 != null) {
                            alpha = fade2.getAlpha();
                        }
                    }
                }
                return Float.valueOf(alpha);
            }
        }) : null;
        final State stateAnimate2 = deferredAnimation2 != null ? deferredAnimation2.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                FiniteAnimationSpec<Float> animationSpec;
                FiniteAnimationSpec<Float> animationSpec2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Scale scale = enterTransition.getData().getScale();
                    return (scale == null || (animationSpec2 = scale.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : animationSpec2;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    return EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                }
                Scale scale2 = exitTransition.getData().getScale();
                return (scale2 == null || (animationSpec = scale2.getAnimationSpec()) == null) ? EnterExitTransitionKt.DefaultAlphaAndScaleSpring : animationSpec;
            }
        }, new Function1<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$scale$2

            /* compiled from: EnterExitTransition.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* loaded from: classes3.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Float invoke(@NotNull EnterExitState enterExitState) {
                int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float scale = 1.0f;
                if (i != 1) {
                    if (i == 2) {
                        Scale scale2 = enterTransition.getData().getScale();
                        if (scale2 != null) {
                            scale = scale2.getScale();
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale3 = exitTransition.getData().getScale();
                        if (scale3 != null) {
                            scale = scale3.getScale();
                        }
                    }
                }
                return Float.valueOf(scale);
            }
        }) : null;
        if (transition.getCurrentState() == EnterExitState.PreEnter) {
            Scale scale = enterTransition.getData().getScale();
            transformOriginM11717boximpl = (scale == null && (scale = exitTransition.getData().getScale()) == null) ? null : TransformOrigin.m11717boximpl(scale.m7662getTransformOriginSzJe1aQ());
        } else {
            Scale scale2 = exitTransition.getData().getScale();
            if (scale2 != null || (scale2 = enterTransition.getData().getScale()) != null) {
                transformOriginM11717boximpl = TransformOrigin.m11717boximpl(scale2.m7662getTransformOriginSzJe1aQ());
            }
        }
        final State stateAnimate3 = deferredAnimation3 != null ? deferredAnimation3.animate(new Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final FiniteAnimationSpec<TransformOrigin> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
                return AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
        }, new Function1<EnterExitState, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2

            /* compiled from: EnterExitTransition.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
            /* renamed from: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2$WhenMappings */
            /* loaded from: classes3.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ TransformOrigin invoke(EnterExitState enterExitState) {
                return TransformOrigin.m11717boximpl(m7639invokeLIALnN8(enterExitState));
            }

            /* renamed from: invoke-LIALnN8, reason: not valid java name */
            public final long m7639invokeLIALnN8(@NotNull EnterExitState enterExitState) {
                TransformOrigin transformOriginM11717boximpl2;
                int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i != 1) {
                    transformOriginM11717boximpl2 = null;
                    if (i == 2) {
                        Scale scale3 = enterTransition.getData().getScale();
                        if (scale3 != null || (scale3 = exitTransition.getData().getScale()) != null) {
                            transformOriginM11717boximpl2 = TransformOrigin.m11717boximpl(scale3.m7662getTransformOriginSzJe1aQ());
                        }
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale4 = exitTransition.getData().getScale();
                        if (scale4 != null || (scale4 = enterTransition.getData().getScale()) != null) {
                            transformOriginM11717boximpl2 = TransformOrigin.m11717boximpl(scale4.m7662getTransformOriginSzJe1aQ());
                        }
                    }
                } else {
                    transformOriginM11717boximpl2 = transformOriginM11717boximpl;
                }
                if (transformOriginM11717boximpl2 != null) {
                    return transformOriginM11717boximpl2.getPackedValue();
                }
                return TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ();
            }
        }) : null;
        return new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$block$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                State<Float> state = stateAnimate;
                graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
                State<Float> state2 = stateAnimate2;
                graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
                State<Float> state3 = stateAnimate2;
                graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
                State<TransformOrigin> state4 = stateAnimate3;
                graphicsLayerScope.mo11533setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().getPackedValue() : TransformOrigin.INSTANCE.m11730getCenterSzJe1aQ());
            }
        };
    }

    private static final EnterTransition trackActiveEnter$lambda$4(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    private static final ExitTransition trackActiveExit$lambda$7(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }
}
