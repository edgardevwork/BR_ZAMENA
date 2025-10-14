package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Metadata(m7104d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0093\u0001\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a0\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010$\u001a\u00020\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a.\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150\fH\u0007\u001a\u0014\u0010-\u001a\u00020.2\n\u0010/\u001a\u0006\u0012\u0002\b\u000300H\u0002\u001a\u0093\u0001\u00101\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u0002022\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a>\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u00152\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a \u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0002H\u0002\u001a+\u0010?\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00150\fH\u0007¢\u0006\u0002\u0010@\u001a+\u0010A\u001a\u0002022\u0006\u0010(\u001a\u00020B2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00150\fH\u0007¢\u0006\u0002\u0010C\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D²\u0006\n\u0010E\u001a\u00020\u0002X\u008a\u0084\u0002"}, m7105d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomDrawerOpenFraction", "DrawerPositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "DrawerVelocityThreshold", "EndDrawerPadding", "BottomDrawer", "", "drawerContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "Landroidx/compose/material/BottomDrawerState;", "gesturesEnabled", "", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "scrimColor", "content", "Lkotlin/Function0;", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawerScrim", "color", "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "BottomDrawerState", "initialValue", "Landroidx/compose/material/BottomDrawerValue;", "density", "Landroidx/compose/ui/unit/Density;", "confirmStateChange", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "ModalDrawer", "Landroidx/compose/material/DrawerState;", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberBottomDrawerState", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "rememberDrawerState", "Landroidx/compose/material/DrawerValue;", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "material_release", "alpha"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,915:1\n1116#2,6:916\n1116#2,6:923\n1116#2,3:934\n1119#2,3:940\n1116#2,3:950\n1119#2,3:956\n1116#2,6:961\n1116#2,6:967\n1116#2,6:973\n1116#2,6:979\n1116#2,6:985\n1116#2,6:991\n74#3:922\n74#3:944\n487#4,4:929\n491#4,2:937\n495#4:943\n487#4,4:945\n491#4,2:953\n495#4:959\n25#5:933\n25#5:949\n487#6:939\n487#6:955\n646#7:960\n81#8:997\n154#9:998\n154#9:999\n154#9:1000\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n450#1:916,6\n468#1:923,6\n516#1:934,3\n516#1:940,3\n655#1:950,3\n655#1:956,3\n801#1:961,6\n804#1:967,6\n816#1:973,6\n832#1:979,6\n833#1:985,6\n845#1:991,6\n467#1:922\n651#1:944\n516#1:929,4\n516#1:937,2\n516#1:943\n655#1:945,4\n655#1:953,2\n655#1:959\n516#1:933\n655#1:949\n516#1:939\n655#1:955\n793#1:960\n794#1:997\n850#1:998\n851#1:999\n852#1:1000\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold;
    private static final float EndDrawerPadding;
    private static final float DrawerVelocityThreshold = C2046Dp.m13666constructorimpl(400);

    @NotNull
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* compiled from: Drawer.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomDrawerValue;", "invoke", "(Landroidx/compose/material/BottomDrawerValue;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawerState$1 */
    /* loaded from: classes2.dex */
    public static final class C10821 extends Lambda implements Function1<BottomDrawerValue, Boolean> {
        public static final C10821 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomDrawerValue bottomDrawerValue) {
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ BottomDrawerState BottomDrawerState$default(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = C10821.INSTANCE;
        }
        return BottomDrawerState(bottomDrawerValue, density, function1);
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState BottomDrawerState(@NotNull BottomDrawerValue bottomDrawerValue, @NotNull Density density, @NotNull Function1<? super BottomDrawerValue, Boolean> function1) {
        BottomDrawerState bottomDrawerState = new BottomDrawerState(bottomDrawerValue, function1);
        bottomDrawerState.setDensity$material_release(density);
        return bottomDrawerState;
    }

    /* compiled from: Drawer.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.DrawerKt$rememberDrawerState$1 */
    /* loaded from: classes2.dex */
    public static final class C10911 extends Lambda implements Function1<DrawerValue, Boolean> {
        public static final C10911 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DrawerValue drawerValue) {
            return Boolean.TRUE;
        }
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull final DrawerValue drawerValue, @Nullable final Function1<? super DrawerValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1435874229);
        if ((i2 & 2) != 0) {
            function1 = C10911.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:448)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        composer.startReplaceableGroup(1903586313);
        boolean zChanged = composer.changed(drawerValue) | composer.changedInstance(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<DrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final DrawerState invoke() {
                    return new DrawerState(drawerValue, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }

    /* compiled from: Drawer.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.DrawerKt$rememberBottomDrawerState$1 */
    /* loaded from: classes2.dex */
    public static final class C10901 extends Lambda implements Function1<BottomDrawerValue, Boolean> {
        public static final C10901 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomDrawerValue bottomDrawerValue) {
            return Boolean.TRUE;
        }
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomDrawerState rememberBottomDrawerState(@NotNull final BottomDrawerValue bottomDrawerValue, @Nullable final Function1<? super BottomDrawerValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-598115156);
        if ((i2 & 2) != 0) {
            function1 = C10901.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-598115156, i, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:465)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.INSTANCE.Saver(density, function1);
        composer.startReplaceableGroup(1903586922);
        boolean zChanged = composer.changed(bottomDrawerValue) | composer.changed(density) | composer.changedInstance(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<BottomDrawerState>() { // from class: androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final BottomDrawerState invoke() {
                    return DrawerKt.BottomDrawerState(bottomDrawerValue, density, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawer-Gs3lGvM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8895ModalDrawerGs3lGvM(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable DrawerState drawerState, boolean z, @Nullable Shape shape, float f, long j, long j2, long j3, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        Shape shape2;
        int i5;
        float f2;
        int i6;
        Modifier modifier3;
        DrawerState drawerStateRememberDrawerState;
        Shape large;
        float fM8892getElevationD9Ej5fM;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U;
        long scrimColor;
        int i7;
        long j4;
        Object objRememberedValue;
        final DrawerState drawerState3;
        final float f3;
        final boolean z3;
        final long j5;
        final long j6;
        final long j7;
        final Shape shape3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(1305806945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    int i10 = composerStartRestartGroup.changed(drawerState2) ? 256 : 128;
                    i3 |= i10;
                } else {
                    drawerState2 = drawerState;
                }
                i3 |= i10;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i11 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((458752 & i) == 0) {
                        f2 = f;
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            i8 = i3;
                            int i12 = composerStartRestartGroup.changed(j) ? 1048576 : 524288;
                            i6 = i8 | i12;
                        } else {
                            i8 = i3;
                        }
                        i6 = i8 | i12;
                    } else {
                        i6 = i3;
                    }
                    if ((i & 29360128) == 0) {
                        i6 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    }
                    if ((234881024 & i) == 0) {
                        i6 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(j3)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i2 & 512) == 0) {
                        i6 |= 805306368;
                    } else if ((1879048192 & i) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    }
                    if ((1533916891 & i6) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 4) == 0) {
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i6 &= -897;
                            } else {
                                drawerStateRememberDrawerState = drawerState2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) == 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i6 &= -57345;
                            } else {
                                large = shape2;
                            }
                            fM8892getElevationD9Ej5fM = i5 == 0 ? DrawerDefaults.INSTANCE.m8892getElevationD9Ej5fM() : f2;
                            if ((i2 & 64) == 0) {
                                jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                i6 &= -3670017;
                            } else {
                                jM8850getSurface0d7_KjU = j;
                            }
                            if ((i2 & 128) == 0) {
                                jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i6 >> 18) & 14);
                                i6 &= -29360129;
                            } else {
                                jM8864contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) == 0) {
                                i7 = i6 & (-234881025);
                                j4 = jM8864contentColorForek8zF_U;
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                scrimColor = j3;
                                i7 = i6;
                                j4 = jM8864contentColorForek8zF_U;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i6 &= -897;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i6 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i6 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i6 &= -234881025;
                            }
                            scrimColor = j3;
                            modifier3 = modifier2;
                            drawerStateRememberDrawerState = drawerState2;
                            large = shape2;
                            fM8892getElevationD9Ej5fM = f2;
                            i7 = i6;
                            jM8850getSurface0d7_KjU = j;
                            j4 = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1305806945, i7, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:514)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        final DrawerState drawerState4 = drawerStateRememberDrawerState;
                        final boolean z4 = z2;
                        final long j8 = scrimColor;
                        final Shape shape4 = large;
                        final long j9 = jM8850getSurface0d7_KjU;
                        final long j10 = j4;
                        final float f4 = fM8892getElevationD9Ej5fM;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 816674999, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i13) {
                                int i14;
                                if ((i13 & 14) == 0) {
                                    i14 = i13 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 91) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(816674999, i14, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:517)");
                                    }
                                    long jMo8059getConstraintsmsEJaDk = boxWithConstraintsScope.mo8059getConstraintsmsEJaDk();
                                    if (!Constraints.m13618getHasBoundedWidthimpl(jMo8059getConstraintsmsEJaDk)) {
                                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                                    }
                                    final float f5 = -Constraints.m13622getMaxWidthimpl(jMo8059getConstraintsmsEJaDk);
                                    final Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    composer2.startReplaceableGroup(1903589713);
                                    final float f6 = 0.0f;
                                    boolean zChanged = composer2.changed(drawerState4) | composer2.changed(density) | composer2.changed(f5) | composer2.changed(0.0f);
                                    final DrawerState drawerState5 = drawerState4;
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
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
                                                drawerState5.setDensity$material_release(density);
                                                final float f7 = f5;
                                                final float f8 = f6;
                                                AnchoredDraggableState.updateAnchors$default(drawerState5.getAnchoredDraggableState$material_release(), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        invoke2(draggableAnchorsConfig);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        draggableAnchorsConfig.m52at(DrawerValue.Closed, f7);
                                                        draggableAnchorsConfig.m52at(DrawerValue.Open, f8);
                                                    }
                                                }), null, 2, null);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    EffectsKt.SideEffect((Function0) objRememberedValue2, composer2, 0);
                                    boolean z5 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion, drawerState4.getAnchoredDraggableState$material_release(), Orientation.Horizontal, z4, z5, null, false, 48, null);
                                    final DrawerState drawerState6 = drawerState4;
                                    long j11 = j8;
                                    Shape shape5 = shape4;
                                    long j12 = j9;
                                    long j13 = j10;
                                    float f7 = f4;
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    final boolean z6 = z4;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(733328855);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    function22.invoke(composer2, 0);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    boolean zIsOpen = drawerState6.isOpen();
                                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
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
                                            if (z6 && drawerState6.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C10861(drawerState6, null), 3, null);
                                            }
                                        }

                                        /* compiled from: Drawer.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {556}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1 */
                                        /* loaded from: classes.dex */
                                        public static final class C10861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C10861(DrawerState drawerState, Continuation<? super C10861> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C10861(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C10861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                    };
                                    composer2.startReplaceableGroup(1903590842);
                                    boolean zChanged2 = composer2.changed(f5) | composer2.changed(0.0f) | composer2.changed(drawerState6);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        final float f8 = 0.0f;
                                        objRememberedValue3 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Float invoke() {
                                                return Float.valueOf(DrawerKt.calculateFraction(f5, f8, drawerState6.requireOffset$material_release()));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DrawerKt.m8896ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue3, j11, composer2, 0);
                                    final String strM9023getString4foXLRw = Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9020getNavigationMenuUdPEhr4(), composer2, 6);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    Modifier modifierM8175sizeInqDBjuR0 = SizeKt.m8175sizeInqDBjuR0(companion, density2.mo7871toDpu2uoSUM(Constraints.m13624getMinWidthimpl(jMo8059getConstraintsmsEJaDk)), density2.mo7871toDpu2uoSUM(Constraints.m13623getMinHeightimpl(jMo8059getConstraintsmsEJaDk)), density2.mo7871toDpu2uoSUM(Constraints.m13622getMaxWidthimpl(jMo8059getConstraintsmsEJaDk)), density2.mo7871toDpu2uoSUM(Constraints.m13621getMaxHeightimpl(jMo8059getConstraintsmsEJaDk)));
                                    composer2.startReplaceableGroup(1903591596);
                                    boolean zChanged3 = composer2.changed(drawerState6);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                                return IntOffset.m13785boximpl(m8902invokeBjo55l4(density3));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m8902invokeBjo55l4(@NotNull Density density3) {
                                                return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(drawerState6.requireOffset$material_release()), 0);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    SurfaceKt.m9025SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m8127paddingqDBjuR0$default(OffsetKt.offset(modifierM8175sizeInqDBjuR0, (Function1) objRememberedValue4), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9023getString4foXLRw);
                                            if (drawerState6.isOpen()) {
                                                final DrawerState drawerState7 = drawerState6;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    public final Boolean invoke() {
                                                        if (drawerState7.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }

                                                    /* compiled from: Drawer.kt */
                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                    @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {591}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name */
                                                    /* loaded from: classes.dex */
                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ DrawerState $drawerState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$drawerState, continuation);
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
                                                                DrawerState drawerState = this.$drawerState;
                                                                this.label = 1;
                                                                if (drawerState.close(this) == coroutine_suspended) {
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
                                                }, 1, null);
                                            }
                                        }
                                    }, 1, null), shape5, j12, j13, null, f7, ComposableLambdaKt.composableLambda(composer2, -1941234439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i15) {
                                            if ((i15 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1941234439, i15, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:600)");
                                            }
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                            composer3.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            function33.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 1572864, 16);
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
                        }), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        f3 = fM8892getElevationD9Ej5fM;
                        z3 = z2;
                        j5 = jM8850getSurface0d7_KjU;
                        j6 = j4;
                        j7 = scrimColor;
                        shape3 = large;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        drawerState3 = drawerState2;
                        z3 = z2;
                        shape3 = shape2;
                        f3 = f2;
                        j5 = j;
                        j6 = j2;
                        j7 = j3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$2
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

                            public final void invoke(@Nullable Composer composer2, int i13) {
                                DrawerKt.m8895ModalDrawerGs3lGvM(function3, modifier4, drawerState3, z3, shape3, f3, j5, j6, j7, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                f2 = f;
                if ((3670016 & i) != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((234881024 & i) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((1533916891 & i6) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if ((i2 & 256) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        final DrawerState drawerState42 = drawerStateRememberDrawerState;
                        final boolean z42 = z2;
                        final long j82 = scrimColor;
                        final Shape shape42 = large;
                        final long j92 = jM8850getSurface0d7_KjU;
                        final long j102 = j4;
                        final float f42 = fM8892getElevationD9Ej5fM;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 816674999, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i13) {
                                int i14;
                                if ((i13 & 14) == 0) {
                                    i14 = i13 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if ((i14 & 91) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(816674999, i14, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:517)");
                                    }
                                    long jMo8059getConstraintsmsEJaDk = boxWithConstraintsScope.mo8059getConstraintsmsEJaDk();
                                    if (!Constraints.m13618getHasBoundedWidthimpl(jMo8059getConstraintsmsEJaDk)) {
                                        throw new IllegalStateException("Drawer shouldn't have infinite width");
                                    }
                                    final float f5 = -Constraints.m13622getMaxWidthimpl(jMo8059getConstraintsmsEJaDk);
                                    final Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    composer2.startReplaceableGroup(1903589713);
                                    final float f6 = 0.0f;
                                    boolean zChanged = composer2.changed(drawerState42) | composer2.changed(density) | composer2.changed(f5) | composer2.changed(0.0f);
                                    final DrawerState drawerState5 = drawerState42;
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1
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
                                                drawerState5.setDensity$material_release(density);
                                                final float f7 = f5;
                                                final float f8 = f6;
                                                AnchoredDraggableState.updateAnchors$default(drawerState5.getAnchoredDraggableState$material_release(), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$1$1$anchors$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        invoke2(draggableAnchorsConfig);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        draggableAnchorsConfig.m52at(DrawerValue.Closed, f7);
                                                        draggableAnchorsConfig.m52at(DrawerValue.Open, f8);
                                                    }
                                                }), null, 2, null);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    EffectsKt.SideEffect((Function0) objRememberedValue2, composer2, 0);
                                    boolean z5 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion, drawerState42.getAnchoredDraggableState$material_release(), Orientation.Horizontal, z42, z5, null, false, 48, null);
                                    final DrawerState drawerState6 = drawerState42;
                                    long j11 = j82;
                                    Shape shape5 = shape42;
                                    long j12 = j92;
                                    long j13 = j102;
                                    float f7 = f42;
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    final boolean z6 = z42;
                                    final CoroutineScope coroutineScope22 = coroutineScope2;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(733328855);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    function22.invoke(composer2, 0);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    boolean zIsOpen = drawerState6.isOpen();
                                    Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
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
                                            if (z6 && drawerState6.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new C10861(drawerState6, null), 3, null);
                                            }
                                        }

                                        /* compiled from: Drawer.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {556}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1 */
                                        /* loaded from: classes.dex */
                                        public static final class C10861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ DrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C10861(DrawerState drawerState, Continuation<? super C10861> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C10861(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C10861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    DrawerState drawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (drawerState.close(this) == coroutine_suspended) {
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
                                    };
                                    composer2.startReplaceableGroup(1903590842);
                                    boolean zChanged2 = composer2.changed(f5) | composer2.changed(0.0f) | composer2.changed(drawerState6);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        final float f8 = 0.0f;
                                        objRememberedValue3 = new Function0<Float>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Float invoke() {
                                                return Float.valueOf(DrawerKt.calculateFraction(f5, f8, drawerState6.requireOffset$material_release()));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DrawerKt.m8896ScrimBx497Mc(zIsOpen, function0, (Function0) objRememberedValue3, j11, composer2, 0);
                                    final String strM9023getString4foXLRw = Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9020getNavigationMenuUdPEhr4(), composer2, 6);
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    Modifier modifierM8175sizeInqDBjuR0 = SizeKt.m8175sizeInqDBjuR0(companion, density2.mo7871toDpu2uoSUM(Constraints.m13624getMinWidthimpl(jMo8059getConstraintsmsEJaDk)), density2.mo7871toDpu2uoSUM(Constraints.m13623getMinHeightimpl(jMo8059getConstraintsmsEJaDk)), density2.mo7871toDpu2uoSUM(Constraints.m13622getMaxWidthimpl(jMo8059getConstraintsmsEJaDk)), density2.mo7871toDpu2uoSUM(Constraints.m13621getMaxHeightimpl(jMo8059getConstraintsmsEJaDk)));
                                    composer2.startReplaceableGroup(1903591596);
                                    boolean zChanged3 = composer2.changed(drawerState6);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                                return IntOffset.m13785boximpl(m8902invokeBjo55l4(density3));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m8902invokeBjo55l4(@NotNull Density density3) {
                                                return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(drawerState6.requireOffset$material_release()), 0);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    SurfaceKt.m9025SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m8127paddingqDBjuR0$default(OffsetKt.offset(modifierM8175sizeInqDBjuR0, (Function1) objRememberedValue4), 0.0f, 0.0f, DrawerKt.EndDrawerPadding, 0.0f, 11, null), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
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
                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9023getString4foXLRw);
                                            if (drawerState6.isOpen()) {
                                                final DrawerState drawerState7 = drawerState6;
                                                final CoroutineScope coroutineScope3 = coroutineScope22;
                                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    public final Boolean invoke() {
                                                        if (drawerState7.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(drawerState7, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }

                                                    /* compiled from: Drawer.kt */
                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                    @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {591}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1, reason: invalid class name */
                                                    /* loaded from: classes.dex */
                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ DrawerState $drawerState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$drawerState = drawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$drawerState, continuation);
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
                                                                DrawerState drawerState = this.$drawerState;
                                                                this.label = 1;
                                                                if (drawerState.close(this) == coroutine_suspended) {
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
                                                }, 1, null);
                                            }
                                        }
                                    }, 1, null), shape5, j12, j13, null, f7, ComposableLambdaKt.composableLambda(composer2, -1941234439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i15) {
                                            if ((i15 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1941234439, i15, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:600)");
                                            }
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                            composer3.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            function33.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 1572864, 16);
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
                        }), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        drawerState3 = drawerStateRememberDrawerState;
                        f3 = fM8892getElevationD9Ej5fM;
                        z3 = z2;
                        j5 = jM8850getSurface0d7_KjU;
                        j6 = j4;
                        j7 = scrimColor;
                        shape3 = large;
                        modifier4 = modifier3;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            f2 = f;
            if ((3670016 & i) != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((234881024 & i) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((1533916891 & i6) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        if ((3670016 & i) != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((234881024 & i) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((1533916891 & i6) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomDrawer-Gs3lGvM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8893BottomDrawerGs3lGvM(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable BottomDrawerState bottomDrawerState, boolean z, @Nullable Shape shape, float f, long j, long j2, long j3, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z2;
        Shape shape2;
        int i6;
        float f2;
        Modifier modifier3;
        final BottomDrawerState bottomDrawerStateRememberBottomDrawerState;
        Shape large;
        float fM8892getElevationD9Ej5fM;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U;
        long scrimColor;
        int i7;
        long j4;
        Object objRememberedValue;
        final BottomDrawerState bottomDrawerState2;
        final boolean z3;
        final long j5;
        final float f3;
        final long j6;
        final long j7;
        final Shape shape3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(625649286);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i9 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((458752 & i) == 0) {
                        f2 = f;
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    if ((i & 3670016) == 0) {
                        i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(j)) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    }
                    if ((234881024 & i) == 0) {
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(j3)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i2 & 512) == 0) {
                        i3 |= 805306368;
                    } else if ((1879048192 & i) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                    }
                    if (i4 == 4 || (1533916891 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                bottomDrawerStateRememberBottomDrawerState = rememberBottomDrawerState(BottomDrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                                i3 &= -897;
                            } else {
                                bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 16) == 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i3 &= -57345;
                            } else {
                                large = shape2;
                            }
                            fM8892getElevationD9Ej5fM = i6 == 0 ? DrawerDefaults.INSTANCE.m8892getElevationD9Ej5fM() : f2;
                            if ((i2 & 64) == 0) {
                                jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM8850getSurface0d7_KjU = j;
                            }
                            if ((i2 & 128) == 0) {
                                jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM8864contentColorForek8zF_U = j2;
                            }
                            if ((i2 & 256) == 0) {
                                i7 = i3 & (-234881025);
                                j4 = jM8864contentColorForek8zF_U;
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            } else {
                                scrimColor = j3;
                                i7 = i3;
                                j4 = jM8864contentColorForek8zF_U;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            scrimColor = j3;
                            i7 = i3;
                            modifier3 = modifier2;
                            large = shape2;
                            fM8892getElevationD9Ej5fM = f2;
                            bottomDrawerStateRememberBottomDrawerState = bottomDrawerState;
                            jM8850getSurface0d7_KjU = j;
                            j4 = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(625649286, i7, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:648)");
                        }
                        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1
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
                                bottomDrawerStateRememberBottomDrawerState.setDensity$material_release(density);
                            }
                        }, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        final boolean z4 = z2;
                        final BottomDrawerState bottomDrawerState3 = bottomDrawerStateRememberBottomDrawerState;
                        final long j8 = scrimColor;
                        final Shape shape4 = large;
                        final long j9 = jM8850getSurface0d7_KjU;
                        final long j10 = j4;
                        final float f4 = fM8892getElevationD9Ej5fM;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1220102512, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i10) {
                                int i11;
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1220102512, i11, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:657)");
                                    }
                                    final float fM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk());
                                    final boolean z5 = Constraints.m13622getMaxWidthimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk()) > Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk());
                                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM8176sizeInqDBjuR0$default = SizeKt.m8176sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density2.mo7871toDpu2uoSUM(Constraints.m13622getMaxWidthimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk())), density2.mo7871toDpu2uoSUM(Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk())), 3, null);
                                    Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion.then(z4 ? NestedScrollModifierKt.nestedScroll$default(companion, bottomDrawerState3.getNestedScrollConnection(), null, 2, null) : companion), bottomDrawerState3.getAnchoredDraggableState$material_release(), Orientation.Vertical, z4, composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl, null, false, 48, null);
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    long j11 = j8;
                                    final BottomDrawerState bottomDrawerState4 = bottomDrawerState3;
                                    Shape shape5 = shape4;
                                    long j12 = j9;
                                    long j13 = j10;
                                    float f5 = f4;
                                    final boolean z6 = z4;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer2, 0);
                                    DrawerKt.m8894BottomDrawerScrim3JVO9M(j11, new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$1
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
                                            if (z6 && bottomDrawerState4.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C10781(bottomDrawerState4, null), 3, null);
                                            }
                                        }

                                        /* compiled from: Drawer.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$BottomDrawer$2$1$1$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {692}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$2$1$1$1 */
                                        /* loaded from: classes.dex */
                                        public static final class C10781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ BottomDrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C10781(BottomDrawerState bottomDrawerState, Continuation<? super C10781> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = bottomDrawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C10781(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C10781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    BottomDrawerState bottomDrawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (bottomDrawerState.close(this) == coroutine_suspended) {
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
                                    }, bottomDrawerState4.getTargetValue() != BottomDrawerValue.Closed, composer2, 0);
                                    final String strM9023getString4foXLRw = Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9020getNavigationMenuUdPEhr4(), composer2, 6);
                                    SurfaceKt.m9025SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(modifierM8176sizeInqDBjuR0$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$2

                                        /* compiled from: Drawer.kt */
                                        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        /* loaded from: classes.dex */
                                        public /* synthetic */ class WhenMappings {
                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                            static {
                                                int[] iArr = new int[BottomDrawerValue.values().length];
                                                try {
                                                    iArr[BottomDrawerValue.Closed.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[BottomDrawerValue.Open.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
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
                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                            m8899invokeozmzZPI(intSize.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                        public final void m8899invokeozmzZPI(long j14) {
                                            BottomDrawerValue currentValue;
                                            final float fM13835getHeightimpl = IntSize.m13835getHeightimpl(j14);
                                            final float f6 = fM13621getMaxHeightimpl;
                                            final boolean z7 = z5;
                                            DraggableAnchors<BottomDrawerValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BottomDrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$2$newAnchors$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomDrawerValue> draggableAnchorsConfig) {
                                                    invoke2(draggableAnchorsConfig);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull DraggableAnchorsConfig<BottomDrawerValue> draggableAnchorsConfig) {
                                                    draggableAnchorsConfig.m52at(BottomDrawerValue.Closed, f6);
                                                    float f7 = f6 * 0.5f;
                                                    if (fM13835getHeightimpl > f7 || z7) {
                                                        draggableAnchorsConfig.m52at(BottomDrawerValue.Open, f7);
                                                    }
                                                    float f8 = fM13835getHeightimpl;
                                                    if (f8 > 0.0f) {
                                                        draggableAnchorsConfig.m52at(BottomDrawerValue.Expanded, Math.max(0.0f, f6 - f8));
                                                    }
                                                }
                                            });
                                            if (bottomDrawerState4.getAnchoredDraggableState$material_release().getAnchors().getSize() <= 0 && DraggableAnchors.hasAnchorFor(bottomDrawerState4.getCurrentValue())) {
                                                currentValue = bottomDrawerState4.getCurrentValue();
                                            } else {
                                                int i12 = WhenMappings.$EnumSwitchMapping$0[bottomDrawerState4.getTargetValue().ordinal()];
                                                if (i12 == 1) {
                                                    currentValue = BottomDrawerValue.Closed;
                                                } else if (i12 == 2 || i12 == 3) {
                                                    currentValue = BottomDrawerValue.Open;
                                                    if (!DraggableAnchors.hasAnchorFor(currentValue)) {
                                                        currentValue = BottomDrawerValue.Expanded;
                                                        if (!DraggableAnchors.hasAnchorFor(currentValue)) {
                                                            currentValue = BottomDrawerValue.Closed;
                                                        }
                                                    }
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                            bottomDrawerState4.getAnchoredDraggableState$material_release().updateAnchors(DraggableAnchors, currentValue);
                                        }
                                    }), new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$3
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                            return IntOffset.m13785boximpl(m8900invokeBjo55l4(density3));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m8900invokeBjo55l4(@NotNull Density density3) {
                                            return IntOffsetKt.IntOffset(0, MathKt__MathJVMKt.roundToInt(bottomDrawerState4.requireOffset$material_release()));
                                        }
                                    }), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4
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
                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9023getString4foXLRw);
                                            if (bottomDrawerState4.isOpen()) {
                                                final BottomDrawerState bottomDrawerState5 = bottomDrawerState4;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* compiled from: Drawer.kt */
                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                    @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$BottomDrawer$2$1$4$1$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {748}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4$1$1, reason: invalid class name */
                                                    /* loaded from: classes.dex */
                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ BottomDrawerState $drawerState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public AnonymousClass1(BottomDrawerState bottomDrawerState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$drawerState = bottomDrawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$drawerState, continuation);
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
                                                                BottomDrawerState bottomDrawerState = this.$drawerState;
                                                                this.label = 1;
                                                                if (bottomDrawerState.close(this) == coroutine_suspended) {
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

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    public final Boolean invoke() {
                                                        if (bottomDrawerState5.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(bottomDrawerState5, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            }
                                        }
                                    }, 1, null), shape5, j12, j13, null, f5, ComposableLambdaKt.composableLambda(composer2, 457750254, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i12) {
                                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(457750254, i12, -1, "androidx.compose.material.BottomDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:757)");
                                            }
                                            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                            composer3.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            function33.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 1572864, 16);
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
                        }), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        z3 = z2;
                        j5 = j4;
                        f3 = fM8892getElevationD9Ej5fM;
                        j6 = jM8850getSurface0d7_KjU;
                        j7 = scrimColor;
                        shape3 = large;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        bottomDrawerState2 = bottomDrawerState;
                        modifier4 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        f3 = f2;
                        j6 = j;
                        j5 = j2;
                        j7 = j3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$3
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

                            public final void invoke(@Nullable Composer composer2, int i10) {
                                DrawerKt.m8893BottomDrawerGs3lGvM(function3, modifier4, bottomDrawerState2, z3, shape3, f3, j6, j5, j7, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                f2 = f;
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((234881024 & i) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if (i4 == 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if ((i2 & 256) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        EffectsKt.SideEffect(new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1
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
                                bottomDrawerStateRememberBottomDrawerState.setDensity$material_release(density2);
                            }
                        }, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        final boolean z42 = z2;
                        final BottomDrawerState bottomDrawerState32 = bottomDrawerStateRememberBottomDrawerState;
                        final long j82 = scrimColor;
                        final Shape shape42 = large;
                        final long j92 = jM8850getSurface0d7_KjU;
                        final long j102 = j4;
                        final float f42 = fM8892getElevationD9Ej5fM;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1220102512, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                invoke(boxWithConstraintsScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer2, int i10) {
                                int i11;
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (composer2.changed(boxWithConstraintsScope) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1220102512, i11, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:657)");
                                    }
                                    final float fM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk());
                                    final boolean z5 = Constraints.m13622getMaxWidthimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk()) > Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk());
                                    Density density22 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierM8176sizeInqDBjuR0$default = SizeKt.m8176sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density22.mo7871toDpu2uoSUM(Constraints.m13622getMaxWidthimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk())), density22.mo7871toDpu2uoSUM(Constraints.m13621getMaxHeightimpl(boxWithConstraintsScope.mo8059getConstraintsmsEJaDk())), 3, null);
                                    Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion.then(z42 ? NestedScrollModifierKt.nestedScroll$default(companion, bottomDrawerState32.getNestedScrollConnection(), null, 2, null) : companion), bottomDrawerState32.getAnchoredDraggableState$material_release(), Orientation.Vertical, z42, composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl, null, false, 48, null);
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    long j11 = j82;
                                    final BottomDrawerState bottomDrawerState4 = bottomDrawerState32;
                                    Shape shape5 = shape42;
                                    long j12 = j92;
                                    long j13 = j102;
                                    float f5 = f42;
                                    final boolean z6 = z42;
                                    final CoroutineScope coroutineScope22 = coroutineScope2;
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAnchoredDraggable$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer2, 0);
                                    DrawerKt.m8894BottomDrawerScrim3JVO9M(j11, new Function0<Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$1
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
                                            if (z6 && bottomDrawerState4.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new C10781(bottomDrawerState4, null), 3, null);
                                            }
                                        }

                                        /* compiled from: Drawer.kt */
                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$BottomDrawer$2$1$1$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {692}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                        /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$2$1$1$1 */
                                        /* loaded from: classes.dex */
                                        public static final class C10781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            public final /* synthetic */ BottomDrawerState $drawerState;
                                            public int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C10781(BottomDrawerState bottomDrawerState, Continuation<? super C10781> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = bottomDrawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @NotNull
                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                return new C10781(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            @Nullable
                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                return ((C10781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            @Nullable
                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    BottomDrawerState bottomDrawerState = this.$drawerState;
                                                    this.label = 1;
                                                    if (bottomDrawerState.close(this) == coroutine_suspended) {
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
                                    }, bottomDrawerState4.getTargetValue() != BottomDrawerValue.Closed, composer2, 0);
                                    final String strM9023getString4foXLRw = Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9020getNavigationMenuUdPEhr4(), composer2, 6);
                                    SurfaceKt.m9025SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OffsetKt.offset(OnRemeasuredModifierKt.onSizeChanged(modifierM8176sizeInqDBjuR0$default, new Function1<IntSize, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$2

                                        /* compiled from: Drawer.kt */
                                        @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                        /* loaded from: classes.dex */
                                        public /* synthetic */ class WhenMappings {
                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                            static {
                                                int[] iArr = new int[BottomDrawerValue.values().length];
                                                try {
                                                    iArr[BottomDrawerValue.Closed.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[BottomDrawerValue.Open.ordinal()] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                                try {
                                                    iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
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
                                        public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                            m8899invokeozmzZPI(intSize.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                        public final void m8899invokeozmzZPI(long j14) {
                                            BottomDrawerValue currentValue;
                                            final float fM13835getHeightimpl = IntSize.m13835getHeightimpl(j14);
                                            final float f6 = fM13621getMaxHeightimpl;
                                            final boolean z7 = z5;
                                            DraggableAnchors<BottomDrawerValue> DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BottomDrawerValue>, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$2$newAnchors$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomDrawerValue> draggableAnchorsConfig) {
                                                    invoke2(draggableAnchorsConfig);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull DraggableAnchorsConfig<BottomDrawerValue> draggableAnchorsConfig) {
                                                    draggableAnchorsConfig.m52at(BottomDrawerValue.Closed, f6);
                                                    float f7 = f6 * 0.5f;
                                                    if (fM13835getHeightimpl > f7 || z7) {
                                                        draggableAnchorsConfig.m52at(BottomDrawerValue.Open, f7);
                                                    }
                                                    float f8 = fM13835getHeightimpl;
                                                    if (f8 > 0.0f) {
                                                        draggableAnchorsConfig.m52at(BottomDrawerValue.Expanded, Math.max(0.0f, f6 - f8));
                                                    }
                                                }
                                            });
                                            if (bottomDrawerState4.getAnchoredDraggableState$material_release().getAnchors().getSize() <= 0 && DraggableAnchors.hasAnchorFor(bottomDrawerState4.getCurrentValue())) {
                                                currentValue = bottomDrawerState4.getCurrentValue();
                                            } else {
                                                int i12 = WhenMappings.$EnumSwitchMapping$0[bottomDrawerState4.getTargetValue().ordinal()];
                                                if (i12 == 1) {
                                                    currentValue = BottomDrawerValue.Closed;
                                                } else if (i12 == 2 || i12 == 3) {
                                                    currentValue = BottomDrawerValue.Open;
                                                    if (!DraggableAnchors.hasAnchorFor(currentValue)) {
                                                        currentValue = BottomDrawerValue.Expanded;
                                                        if (!DraggableAnchors.hasAnchorFor(currentValue)) {
                                                            currentValue = BottomDrawerValue.Closed;
                                                        }
                                                    }
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                            bottomDrawerState4.getAnchoredDraggableState$material_release().updateAnchors(DraggableAnchors, currentValue);
                                        }
                                    }), new Function1<Density, IntOffset>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$3
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density3) {
                                            return IntOffset.m13785boximpl(m8900invokeBjo55l4(density3));
                                        }

                                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                        public final long m8900invokeBjo55l4(@NotNull Density density3) {
                                            return IntOffsetKt.IntOffset(0, MathKt__MathJVMKt.roundToInt(bottomDrawerState4.requireOffset$material_release()));
                                        }
                                    }), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4
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
                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM9023getString4foXLRw);
                                            if (bottomDrawerState4.isOpen()) {
                                                final BottomDrawerState bottomDrawerState5 = bottomDrawerState4;
                                                final CoroutineScope coroutineScope3 = coroutineScope22;
                                                SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* compiled from: Drawer.kt */
                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                    @DebugMetadata(m7119c = "androidx.compose.material.DrawerKt$BottomDrawer$2$1$4$1$1", m7120f = "Drawer.kt", m7121i = {}, m7122l = {748}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4$1$1, reason: invalid class name */
                                                    /* loaded from: classes.dex */
                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ BottomDrawerState $drawerState;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public AnonymousClass1(BottomDrawerState bottomDrawerState, Continuation<? super AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$drawerState = bottomDrawerState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new AnonymousClass1(this.$drawerState, continuation);
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
                                                                BottomDrawerState bottomDrawerState = this.$drawerState;
                                                                this.label = 1;
                                                                if (bottomDrawerState.close(this) == coroutine_suspended) {
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

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    public final Boolean invoke() {
                                                        if (bottomDrawerState5.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(bottomDrawerState5, null), 3, null);
                                                        }
                                                        return Boolean.TRUE;
                                                    }
                                                }, 1, null);
                                            }
                                        }
                                    }, 1, null), shape5, j12, j13, null, f5, ComposableLambdaKt.composableLambda(composer2, 457750254, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$2$1$5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i12) {
                                            if ((i12 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(457750254, i12, -1, "androidx.compose.material.BottomDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:757)");
                                            }
                                            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                            composer3.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            function33.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 1572864, 16);
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
                        }), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        bottomDrawerState2 = bottomDrawerStateRememberBottomDrawerState;
                        z3 = z2;
                        j5 = j4;
                        f3 = fM8892getElevationD9Ej5fM;
                        j6 = jM8850getSurface0d7_KjU;
                        j7 = scrimColor;
                        shape3 = large;
                        modifier4 = modifier3;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((234881024 & i) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if (i4 == 4) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((234881024 & i) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if (i4 == 4) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt___RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BottomDrawerScrim-3J-VO9M */
    public static final void m8894BottomDrawerScrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(-513067266);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-513067266, i2, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:791)");
            }
            if (j != Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                final String strM9023getString4foXLRw = Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9016getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
                if (z) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1903600934);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    composerStartRestartGroup.startReplaceableGroup(1903601060);
                    boolean zChanged = composerStartRestartGroup.changed(strM9023getString4foXLRw) | composerStartRestartGroup.changedInstance(function0);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9023getString4foXLRw);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return Boolean.TRUE;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                } else {
                    modifierSemantics = Modifier.INSTANCE;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
                composerStartRestartGroup.startReplaceableGroup(1903601349);
                boolean zChanged2 = composerStartRestartGroup.changed(j) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
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
                            DrawScope.m11884drawRectnJ9OG0$default(drawScope, j, 0L, 0L, DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$3(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    DrawerKt.m8894BottomDrawerScrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc */
    public static final void m8896ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function02, final long j, Composer composer, final int i) {
        int i2;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(1983403750);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:827)");
            }
            final String strM9023getString4foXLRw = Strings_androidKt.m9023getString4foXLRw(Strings.INSTANCE.m9016getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
            if (z) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1903601685);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(function0);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(1903601769);
                boolean zChanged = composerStartRestartGroup.changed(strM9023getString4foXLRw) | composerStartRestartGroup.changedInstance(function0);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
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
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9023getString4foXLRw);
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
            } else {
                modifierSemantics = Modifier.INSTANCE;
            }
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            composerStartRestartGroup.startReplaceableGroup(1903602010);
            boolean zChanged2 = composerStartRestartGroup.changed(j) | composerStartRestartGroup.changedInstance(function02);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
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
                        DrawScope.m11884drawRectnJ9OG0$default(drawScope, j, 0L, 0L, function02.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.DrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    DrawerKt.m8896ScrimBx497Mc(z, function0, function02, j, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(m7104d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0019*\u00020\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0018\u001a\u00020\u0019*\u00020\u0007H\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r*\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m7105d2 = {"androidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
    /* loaded from: classes3.dex */
    public static final class C10831 implements NestedScrollConnection {
        final /* synthetic */ AnchoredDraggableState<?> $state;

        @NotNull
        private final Orientation orientation = Orientation.Vertical;

        public C10831(AnchoredDraggableState<?> anchoredDraggableState) {
            this.$state = anchoredDraggableState;
        }

        @NotNull
        public final Orientation getOrientation() {
            return this.orientation;
        }

        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo7962onPreScrollOzD1aCk(long available, int source) {
            float fOffsetToFloat = offsetToFloat(available);
            if (fOffsetToFloat < 0.0f && NestedScrollSource.m12373equalsimpl0(source, NestedScrollSource.INSTANCE.m12378getDragWNlRxjI())) {
                return toOffset(this.$state.dispatchRawDelta(fOffsetToFloat));
            }
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }

        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo7961onPostScrollDzOQY0M(long consumed, long available, int source) {
            if (NestedScrollSource.m12373equalsimpl0(source, NestedScrollSource.INSTANCE.m12378getDragWNlRxjI())) {
                return toOffset(this.$state.dispatchRawDelta(offsetToFloat(available)));
            }
            return Offset.INSTANCE.m11115getZeroF1C5BW0();
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0013  */
        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* renamed from: onPreFling-QWom1Mo */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo8201onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) throws Throwable {
            C1085x425444c4 c1085x425444c4;
            if (continuation instanceof C1085x425444c4) {
                c1085x425444c4 = (C1085x425444c4) continuation;
                int i = c1085x425444c4.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1085x425444c4.label = i - Integer.MIN_VALUE;
                } else {
                    c1085x425444c4 = new C1085x425444c4(this, continuation);
                }
            }
            Object obj = c1085x425444c4.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c1085x425444c4.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                float fVelocityToFloat = velocityToFloat(j);
                float fRequireOffset = this.$state.requireOffset();
                if (fVelocityToFloat < 0.0f && fRequireOffset > this.$state.getAnchors().minAnchor()) {
                    AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                    c1085x425444c4.J$0 = j;
                    c1085x425444c4.label = 1;
                    if (anchoredDraggableState.settle(fVelocityToFloat, c1085x425444c4) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    j = Velocity.INSTANCE.m13912getZero9UxMQ8M();
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c1085x425444c4.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m13892boximpl(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
        @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* renamed from: onPostFling-RZ2iAVY */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo7960onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) throws Throwable {
            C1084x1c3b93eb c1084x1c3b93eb;
            if (continuation instanceof C1084x1c3b93eb) {
                c1084x1c3b93eb = (C1084x1c3b93eb) continuation;
                int i = c1084x1c3b93eb.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1084x1c3b93eb.label = i - Integer.MIN_VALUE;
                } else {
                    c1084x1c3b93eb = new C1084x1c3b93eb(this, continuation);
                }
            }
            Object obj = c1084x1c3b93eb.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c1084x1c3b93eb.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                float fVelocityToFloat = velocityToFloat(j2);
                c1084x1c3b93eb.J$0 = j2;
                c1084x1c3b93eb.label = 1;
                if (anchoredDraggableState.settle(fVelocityToFloat, c1084x1c3b93eb) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = c1084x1c3b93eb.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m13892boximpl(j2);
        }

        private final long toOffset(float f) {
            Orientation orientation = this.orientation;
            float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
            if (orientation != Orientation.Vertical) {
                f = 0.0f;
            }
            return androidx.compose.p003ui.geometry.OffsetKt.Offset(f2, f);
        }

        @JvmName(name = "velocityToFloat")
        private final float velocityToFloat(long j) {
            return this.orientation == Orientation.Horizontal ? Velocity.m13901getXimpl(j) : Velocity.m13902getYimpl(j);
        }

        @JvmName(name = "offsetToFloat")
        private final float offsetToFloat(long j) {
            return this.orientation == Orientation.Horizontal ? Offset.m11099getXimpl(j) : Offset.m11100getYimpl(j);
        }
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState) {
        return new C10831(anchoredDraggableState);
    }

    public static final float BottomDrawerScrim_3J_VO9M$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float f = 56;
        EndDrawerPadding = C2046Dp.m13666constructorimpl(f);
        DrawerPositionalThreshold = C2046Dp.m13666constructorimpl(f);
    }
}
