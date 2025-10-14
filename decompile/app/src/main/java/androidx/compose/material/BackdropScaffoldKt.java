package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.UiComposable;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BackdropScaffold.kt */
@Metadata(m7104d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\tH\u0003¢\u0006\u0002\u0010\u000b\u001aò\u0001\u0010\f\u001a\u00020\u00042\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001ae\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\t¢\u0006\u0002\b)2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0#2\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00040-¢\u0006\u0002\b\t¢\u0006\u0002\b)H\u0003¢\u0006\u0002\u0010/\u001a0\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u00103\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aE\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u00062\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020.092\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140#2\b\b\u0002\u0010;\u001a\u00020$H\u0007¢\u0006\u0002\u0010<\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006=²\u0006\n\u0010>\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020.X\u008a\u0084\u0002"}, m7105d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "BackLayerTransition", "", "target", "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "BackdropScaffold-BZszfkY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BackdropStack", "backLayer", "Landroidx/compose/ui/UiComposable;", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "snackbarHostState", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release", "alpha", "animationProgress"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,524:1\n25#2:525\n456#2,8:573\n464#2,3:587\n456#2,8:608\n464#2,3:622\n467#2,3:626\n456#2,8:648\n464#2,3:662\n467#2,3:666\n467#2,3:671\n1116#3,6:526\n1116#3,6:535\n1116#3,6:542\n1116#3,6:548\n1116#3,6:676\n74#4:532\n74#4:534\n74#4:554\n1#5:533\n646#6:541\n67#7,7:555\n74#7:590\n68#7,6:591\n74#7:625\n78#7:630\n68#7,6:631\n74#7:665\n78#7:670\n78#7:675\n79#8,11:562\n79#8,11:597\n92#8:629\n79#8,11:637\n92#8:669\n92#8:674\n3737#9,6:581\n3737#9,6:616\n3737#9,6:656\n81#10:682\n81#10:683\n154#11:684\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n174#1:525\n432#1:573,8\n432#1:587,3\n433#1:608,8\n433#1:622,3\n433#1:626,3\n441#1:648,8\n441#1:662,3\n441#1:666,3\n432#1:671,3\n174#1:526,6\n291#1:535,6\n396#1:542,6\n404#1:548,6\n460#1:676,6\n278#1:532\n279#1:534\n427#1:554\n390#1:541\n432#1:555,7\n432#1:590\n433#1:591,6\n433#1:625\n433#1:630\n441#1:631,6\n441#1:665\n441#1:670\n432#1:675\n432#1:562,11\n433#1:597,11\n433#1:629\n441#1:637,11\n441#1:669\n432#1:674\n432#1:581,6\n433#1:616,6\n441#1:656,6\n391#1:682\n424#1:683\n523#1:684\n*E\n"})
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = C2046Dp.m13666constructorimpl(20);

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@NotNull final BackdropValue backdropValue, @Nullable final AnimationSpec<Float> animationSpec, @Nullable final Function1<? super BackdropValue, Boolean> function1, @Nullable final SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-862178912);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull BackdropValue backdropValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:174)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m10957rememberSaveable(new Object[]{animationSpec, function1, snackbarHostState}, (Saver) BackdropScaffoldState.INSTANCE.Saver(animationSpec, function1, snackbarHostState), (String) null, (Function0) new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt.rememberBackdropScaffoldState.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BackdropScaffoldState invoke() {
                return new BackdropScaffoldState(backdropValue, animationSpec, function1, snackbarHostState);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return backdropScaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BackdropScaffold-BZszfkY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8781BackdropScaffoldBZszfkY(@NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @NotNull final Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Modifier modifier, @Nullable BackdropScaffoldState backdropScaffoldState, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, @Nullable Shape shape, float f3, long j3, long j4, long j5, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        final BackdropScaffoldState backdropScaffoldStateRememberBackdropScaffoldState;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Shape shape2;
        int i15;
        int i16;
        int i17;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32;
        int i18;
        boolean z5;
        int i19;
        int i20;
        int i21;
        int i22;
        final boolean z6;
        boolean z7;
        long jM8846getPrimary0d7_KjU;
        long jM8864contentColorForek8zF_U;
        float f4;
        Shape frontLayerShape;
        boolean z8;
        float f5;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U2;
        long j6;
        long frontLayerScrimColor;
        int i23;
        float f6;
        int i24;
        long j7;
        int i25;
        float f7;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M8871getLambda1$material_release;
        long j8;
        float f8;
        final float fMo7874toPx0680j_4;
        boolean zChanged;
        Object objRememberedValue;
        final float f9;
        final Shape shape3;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33;
        final long j9;
        final long j10;
        final boolean z9;
        final boolean z10;
        final long j11;
        boolean z11;
        float f10;
        final float f11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1397420093);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        int i26 = i3 & 8;
        if (i26 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            int i27 = 8192;
            if ((i & 57344) != 0) {
                backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState;
                i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(backdropScaffoldStateRememberBackdropScaffoldState)) ? 16384 : 8192;
            } else {
                backdropScaffoldStateRememberBackdropScaffoldState = backdropScaffoldState;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                z4 = z;
            } else {
                z4 = z;
                if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else {
                if ((i & 29360128) == 0) {
                    i8 = i7;
                    i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 234881024) == 0) {
                        i10 = i9;
                        i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i13 = i4 | 805306368;
                        i12 = i11;
                    } else {
                        if ((i & 1879048192) == 0) {
                            i12 = i11;
                            i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                        } else {
                            i12 = i11;
                        }
                        i13 = i4;
                    }
                    if ((i2 & 14) != 0) {
                        i14 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(j)) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    if ((i2 & 112) == 0) {
                        i14 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(j2)) ? 32 : 16;
                    }
                    if ((i2 & 896) != 0) {
                        shape2 = shape;
                        i14 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(shape2)) ? 256 : 128;
                    } else {
                        shape2 = shape;
                    }
                    int i28 = i14;
                    i15 = i3 & 8192;
                    if (i15 != 0) {
                        if ((i2 & 7168) == 0) {
                            i28 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                        }
                        if ((i2 & 57344) == 0) {
                            if ((i3 & 16384) == 0) {
                                i16 = i15;
                                if (composerStartRestartGroup.changed(j3)) {
                                    i27 = 16384;
                                }
                            } else {
                                i16 = i15;
                            }
                            i28 |= i27;
                        } else {
                            i16 = i15;
                        }
                        if ((i2 & 458752) == 0) {
                            i28 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
                        }
                        if ((i2 & 3670016) == 0) {
                            i28 |= ((i3 & 65536) == 0 && composerStartRestartGroup.changed(j5)) ? 1048576 : 524288;
                        }
                        i17 = i3 & 131072;
                        if (i17 != 0) {
                            i28 |= 12582912;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i2 & 29360128) == 0) {
                                i28 |= composerStartRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                            }
                        }
                        i18 = i28;
                        if ((i13 & 1533916891) != 306783378 || (i18 & 23967451) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier3 = i26 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i3 & 16) == 0) {
                                    z5 = true;
                                    i19 = i10;
                                    i20 = i12;
                                    int i29 = i8;
                                    i21 = i16;
                                    i22 = i29;
                                    i13 &= -57345;
                                    backdropScaffoldStateRememberBackdropScaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, composerStartRestartGroup, 6, 14);
                                } else {
                                    z5 = true;
                                    i19 = i10;
                                    i20 = i12;
                                    int i30 = i8;
                                    i21 = i16;
                                    i22 = i30;
                                }
                                boolean z12 = i5 == 0 ? z5 : z;
                                float fM8780getPeekHeightD9Ej5fM = i6 == 0 ? BackdropScaffoldDefaults.INSTANCE.m8780getPeekHeightD9Ej5fM() : f;
                                float fM8779getHeaderHeightD9Ej5fM = i22 == 0 ? BackdropScaffoldDefaults.INSTANCE.m8779getHeaderHeightD9Ej5fM() : f2;
                                z6 = i19 == 0 ? z5 : z2;
                                z7 = i20 == 0 ? z5 : z3;
                                if ((i3 & 1024) == 0) {
                                    i18 &= -15;
                                    jM8846getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8846getPrimary0d7_KjU();
                                } else {
                                    jM8846getPrimary0d7_KjU = j;
                                }
                                if ((i3 & 2048) == 0) {
                                    jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8846getPrimary0d7_KjU, composerStartRestartGroup, i18 & 14);
                                    i18 &= -113;
                                } else {
                                    jM8864contentColorForek8zF_U = j2;
                                }
                                int i31 = i18;
                                if ((i3 & 4096) == 0) {
                                    f4 = fM8779getHeaderHeightD9Ej5fM;
                                    frontLayerShape = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape(composerStartRestartGroup, 6);
                                    i31 &= -897;
                                } else {
                                    f4 = fM8779getHeaderHeightD9Ej5fM;
                                    frontLayerShape = shape;
                                }
                                float fM8778getFrontLayerElevationD9Ej5fM = i21 == 0 ? BackdropScaffoldDefaults.INSTANCE.m8778getFrontLayerElevationD9Ej5fM() : f3;
                                if ((i3 & 16384) == 0) {
                                    z8 = z12;
                                    i31 &= -57345;
                                    f5 = fM8780getPeekHeightD9Ej5fM;
                                    jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                } else {
                                    z8 = z12;
                                    f5 = fM8780getPeekHeightD9Ej5fM;
                                    jM8850getSurface0d7_KjU = j3;
                                }
                                if ((i3 & 32768) == 0) {
                                    jM8864contentColorForek8zF_U2 = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i31 >> 12) & 14);
                                    i31 &= -458753;
                                } else {
                                    jM8864contentColorForek8zF_U2 = j4;
                                }
                                if ((i3 & 65536) == 0) {
                                    j6 = jM8850getSurface0d7_KjU;
                                    frontLayerScrimColor = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor(composerStartRestartGroup, 6);
                                    i23 = (-3670017) & i31;
                                } else {
                                    j6 = jM8850getSurface0d7_KjU;
                                    frontLayerScrimColor = j5;
                                    i23 = i31;
                                }
                                if (i17 == 0) {
                                    i24 = i23;
                                    j7 = jM8864contentColorForek8zF_U2;
                                    modifier2 = modifier3;
                                    i25 = i13;
                                    f7 = f5;
                                    function3M8871getLambda1$material_release = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m8871getLambda1$material_release();
                                    j8 = jM8846getPrimary0d7_KjU;
                                    f6 = f4;
                                } else {
                                    f6 = f4;
                                    i24 = i23;
                                    j7 = jM8864contentColorForek8zF_U2;
                                    modifier2 = modifier3;
                                    i25 = i13;
                                    f7 = f5;
                                    function3M8871getLambda1$material_release = function3;
                                    j8 = jM8846getPrimary0d7_KjU;
                                }
                                f8 = fM8778getFrontLayerElevationD9Ej5fM;
                                z4 = z8;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                if ((i3 & 1024) != 0) {
                                    i18 &= -15;
                                }
                                if ((i3 & 2048) != 0) {
                                    i18 &= -113;
                                }
                                int i32 = i18;
                                if ((i3 & 4096) != 0) {
                                    i32 &= -897;
                                }
                                if ((i3 & 16384) != 0) {
                                    i32 &= -57345;
                                }
                                if ((i3 & 32768) != 0) {
                                    i32 &= -458753;
                                }
                                if ((i3 & 65536) != 0) {
                                    i32 &= -3670017;
                                }
                                f6 = f2;
                                z6 = z2;
                                j8 = j;
                                jM8864contentColorForek8zF_U = j2;
                                f8 = f3;
                                j6 = j3;
                                j7 = j4;
                                frontLayerScrimColor = j5;
                                function3M8871getLambda1$material_release = function3;
                                i24 = i32;
                                frontLayerShape = shape2;
                                i25 = i13;
                                f7 = f;
                                z7 = z3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1397420093, i25, i24, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:276)");
                            }
                            final float fMo7874toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f7);
                            fMo7874toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f6);
                            final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                                public final void invoke(@Nullable Composer composer2, int i33) {
                                    if ((i33 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1744778315, i33, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:281)");
                                        }
                                        if (z6) {
                                            composer2.startReplaceableGroup(-1017265285);
                                            Function2<Composer, Integer, Unit> function24 = function2;
                                            Function2<Composer, Integer, Unit> function25 = function22;
                                            composer2.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            function24.invoke(composer2, 0);
                                            function25.invoke(composer2, 0);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                        } else {
                                            composer2.startReplaceableGroup(-1017265173);
                                            BackdropScaffoldKt.BackLayerTransition(backdropScaffoldStateRememberBackdropScaffoldState.getTargetValue(), function2, function22, composer2, 0);
                                            composer2.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            });
                            int i33 = i24;
                            composerStartRestartGroup.startReplaceableGroup(-874716113);
                            zChanged = composerStartRestartGroup.changed(fMo7874toPx0680j_4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                        return Constraints.m13610boximpl(m8786invokeZezNO4M(constraints.getValue()));
                                    }

                                    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                                    public final long m8786invokeZezNO4M(long j12) {
                                        return ConstraintsKt.m13639offsetNN6EwU$default(Constraints.m13613copyZbe2FdA$default(j12, 0, 0, 0, 0, 10, null), 0, -MathKt__MathJVMKt.roundToInt(fMo7874toPx0680j_4), 1, null);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            final Function1 function1 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            final Modifier modifier4 = modifier2;
                            final boolean z13 = z7;
                            final boolean z14 = z4;
                            final BackdropScaffoldState backdropScaffoldState2 = backdropScaffoldStateRememberBackdropScaffoldState;
                            final Shape shape4 = frontLayerShape;
                            final long j12 = j6;
                            final long j13 = j7;
                            final float f12 = f8;
                            final float f13 = f6;
                            final float f14 = f7;
                            final long j14 = frontLayerScrimColor;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34 = function3M8871getLambda1$material_release;
                            int i34 = i33 << 6;
                            SurfaceKt.m9025SurfaceFjzlyU(null, null, j8, jM8864contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                                public final void invoke(@Nullable Composer composer2, int i35) {
                                    if ((i35 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1049909631, i35, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:299)");
                                        }
                                        composer2.startReplaceableGroup(773894976);
                                        composer2.startReplaceableGroup(-492369756);
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                        }
                                        composer2.endReplaceableGroup();
                                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                                        composer2.endReplaceableGroup();
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                                        Function2<Composer, Integer, Unit> function24 = composableLambda;
                                        Function1<Constraints, Constraints> function12 = function1;
                                        final float f15 = fMo7874toPx0680j_4;
                                        final boolean z15 = z13;
                                        final boolean z16 = z14;
                                        final BackdropScaffoldState backdropScaffoldState3 = backdropScaffoldState2;
                                        final float f16 = fMo7874toPx0680j_42;
                                        final Shape shape5 = shape4;
                                        final long j15 = j12;
                                        final long j16 = j13;
                                        final float f17 = f12;
                                        final float f18 = f13;
                                        final float f19 = f14;
                                        final Function2<Composer, Integer, Unit> function25 = function23;
                                        final long j17 = j14;
                                        final Function3<SnackbarHostState, Composer, Integer, Unit> function35 = function34;
                                        BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function24, function12, ComposableLambdaKt.composableLambda(composer2, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f20, Composer composer3, Integer num) {
                                                m8784invokejYbf7pk(constraints.getValue(), f20.floatValue(), composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                            public final void m8784invokejYbf7pk(long j18, float f20, @Nullable Composer composer3, int i36) {
                                                int i37;
                                                Modifier modifierNestedScroll$default;
                                                float fM13666constructorimpl;
                                                if ((i36 & 14) == 0) {
                                                    i37 = i36 | (composer3.changed(j18) ? 4 : 2);
                                                } else {
                                                    i37 = i36;
                                                }
                                                if ((i36 & 112) == 0) {
                                                    i37 |= composer3.changed(f20) ? 32 : 16;
                                                }
                                                if ((i37 & 731) != 146 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1800047509, i37, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:305)");
                                                    }
                                                    float fM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j18);
                                                    float fMin = fM13621getMaxHeightimpl - f15;
                                                    if (z15) {
                                                        fMin = Math.min(fMin, f20);
                                                    }
                                                    float f21 = fMin;
                                                    if (z16) {
                                                        modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState3.getNestedScrollConnection(), null, 2, null);
                                                    } else {
                                                        modifierNestedScroll$default = Modifier.INSTANCE;
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    Modifier modifierThen = companion.then(modifierNestedScroll$default);
                                                    BackdropScaffoldState backdropScaffoldState4 = backdropScaffoldState3;
                                                    Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.m7112to(Float.valueOf(f16), BackdropValue.Concealed), TuplesKt.m7112to(Float.valueOf(f21), BackdropValue.Revealed));
                                                    Modifier modifierM9035swipeablepPrIpRY = SwipeableKt.m9035swipeablepPrIpRY(modifierThen, backdropScaffoldState4, mapMapOf, Orientation.Vertical, (288 & 8) != 0 ? true : z16, (288 & 16) != 0 ? false : false, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : null, (288 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (288 & 256) != 0 ? SwipeableDefaults.INSTANCE.m9034getVelocityThresholdD9Ej5fM() : 0.0f);
                                                    final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState3;
                                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM9035swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                            if (backdropScaffoldState5.isConcealed()) {
                                                                final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* compiled from: BackdropScaffold.kt */
                                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                    @DebugMetadata(m7119c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", m7120f = "BackdropScaffold.kt", m7121i = {}, m7122l = {332}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name */
                                                                    /* loaded from: classes2.dex */
                                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                        public int label;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                            super(2, continuation);
                                                                            this.$scaffoldState = backdropScaffoldState;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        @NotNull
                                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                            return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                                this.label = 1;
                                                                                if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
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
                                                                        if (backdropScaffoldState6.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(backdropScaffoldState6, null), 3, null);
                                                                        }
                                                                        return Boolean.TRUE;
                                                                    }
                                                                }, 1, null);
                                                            } else {
                                                                final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                                                final CoroutineScope coroutineScope4 = coroutineScope2;
                                                                SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* compiled from: BackdropScaffold.kt */
                                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                    @DebugMetadata(m7119c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", m7120f = "BackdropScaffold.kt", m7121i = {}, m7122l = {338}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                    /* loaded from: classes2.dex */
                                                                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                        public int label;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                            super(2, continuation);
                                                                            this.$scaffoldState = backdropScaffoldState;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        @NotNull
                                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                            return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                                this.label = 1;
                                                                                if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
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
                                                                        if (backdropScaffoldState7.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState7, null), 3, null);
                                                                        }
                                                                        return Boolean.TRUE;
                                                                    }
                                                                }, 1, null);
                                                            }
                                                        }
                                                    }, 1, null);
                                                    composer3.startReplaceableGroup(-874714066);
                                                    boolean zChanged2 = composer3.changed(backdropScaffoldState3);
                                                    final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState3;
                                                    Object objRememberedValue3 = composer3.rememberedValue();
                                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                                return IntOffset.m13785boximpl(m8785invokeBjo55l4(density));
                                                            }

                                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                            public final long m8785invokeBjo55l4(@NotNull Density density) {
                                                                return IntOffsetKt.IntOffset(0, MathKt__MathJVMKt.roundToInt(backdropScaffoldState6.getOffset().getValue().floatValue()));
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                                                    Shape shape6 = shape5;
                                                    long j19 = j15;
                                                    long j20 = j16;
                                                    float f22 = f17;
                                                    final float f23 = f19;
                                                    final Function2<Composer, Integer, Unit> function26 = function25;
                                                    final long j21 = j17;
                                                    final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState3;
                                                    final boolean z17 = z16;
                                                    final CoroutineScope coroutineScope3 = coroutineScope;
                                                    SurfaceKt.m9025SurfaceFjzlyU(modifierThen2, shape6, j19, j20, null, f22, ComposableLambdaKt.composableLambda(composer3, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i38) {
                                                            if ((i38 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1065299503, i38, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:353)");
                                                                }
                                                                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                                Function2<Composer, Integer, Unit> function27 = function26;
                                                                long j22 = j21;
                                                                final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                                                final boolean z18 = z17;
                                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                composer4.startReplaceableGroup(733328855);
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                                                composer4.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer4.startReusableNode();
                                                                if (composer4.getInserting()) {
                                                                    composer4.createNode(constructor);
                                                                } else {
                                                                    composer4.useNode();
                                                                }
                                                                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                }
                                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                composer4.startReplaceableGroup(2058660585);
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                function27.invoke(composer4, 0);
                                                                BackdropScaffoldKt.m8782Scrim3JVO9M(j22, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                                        invoke2();
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* compiled from: BackdropScaffold.kt */
                                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                    @DebugMetadata(m7119c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", m7120f = "BackdropScaffold.kt", m7121i = {}, m7122l = {360}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1 */
                                                                    /* loaded from: classes2.dex */
                                                                    public static final class C10301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                        public int label;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public C10301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C10301> continuation) {
                                                                            super(2, continuation);
                                                                            this.$scaffoldState = backdropScaffoldState;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        @NotNull
                                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                            return new C10301(this.$scaffoldState, continuation);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        @Nullable
                                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                            return ((C10301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        @Nullable
                                                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                            int i = this.label;
                                                                            if (i == 0) {
                                                                                ResultKt.throwOnFailure(obj);
                                                                                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                                this.label = 1;
                                                                                if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
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

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2() {
                                                                        if (z18 && backdropScaffoldState8.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C10301(backdropScaffoldState8, null), 3, null);
                                                                        }
                                                                    }
                                                                }, backdropScaffoldState8.getTargetValue() == BackdropValue.Revealed, composer4, 0);
                                                                composer4.endReplaceableGroup();
                                                                composer4.endNode();
                                                                composer4.endReplaceableGroup();
                                                                composer4.endReplaceableGroup();
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 1572864, 16);
                                                    if (backdropScaffoldState3.isRevealed() && f21 == fM13621getMaxHeightimpl - f15) {
                                                        fM13666constructorimpl = f18;
                                                    } else {
                                                        fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                                    }
                                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM13666constructorimpl, 7, null);
                                                    Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                    Function3<SnackbarHostState, Composer, Integer, Unit> function36 = function35;
                                                    BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState3;
                                                    composer3.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 6);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    function36.invoke(backdropScaffoldState8.getSnackbarHostState(), composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 3120);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (i34 & 7168) | (i34 & 896) | 1572864, 51);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f9 = f6;
                            shape3 = frontLayerShape;
                            function33 = function3M8871getLambda1$material_release;
                            j9 = jM8864contentColorForek8zF_U;
                            j10 = frontLayerScrimColor;
                            z9 = z6;
                            z10 = z4;
                            j11 = j7;
                            z11 = z7;
                            f10 = f8;
                            f11 = f7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            f9 = f2;
                            j8 = j;
                            j9 = j2;
                            f10 = f3;
                            j6 = j3;
                            j11 = j4;
                            j10 = j5;
                            shape3 = shape2;
                            function33 = function32;
                            z10 = z4;
                            f11 = f;
                            z9 = z2;
                            z11 = z3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final boolean z15 = z11;
                            final long j15 = j8;
                            final float f15 = f10;
                            final long j16 = j6;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35 = function33;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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

                                public final void invoke(@Nullable Composer composer2, int i35) {
                                    BackdropScaffoldKt.m8781BackdropScaffoldBZszfkY(function2, function22, function23, modifier2, backdropScaffoldStateRememberBackdropScaffoldState, z10, f11, f9, z9, z15, j15, j9, shape3, f15, j16, j11, j10, function35, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i28 |= 3072;
                    if ((i2 & 57344) == 0) {
                    }
                    if ((i2 & 458752) == 0) {
                    }
                    if ((i2 & 3670016) == 0) {
                    }
                    i17 = i3 & 131072;
                    if (i17 != 0) {
                    }
                    i18 = i28;
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i26 == 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if ((i3 & 1024) == 0) {
                            }
                            if ((i3 & 2048) == 0) {
                            }
                            int i312 = i18;
                            if ((i3 & 4096) == 0) {
                            }
                            float fM8778getFrontLayerElevationD9Ej5fM2 = i21 == 0 ? BackdropScaffoldDefaults.INSTANCE.m8778getFrontLayerElevationD9Ej5fM() : f3;
                            if ((i3 & 16384) == 0) {
                            }
                            if ((i3 & 32768) == 0) {
                            }
                            if ((i3 & 65536) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            f8 = fM8778getFrontLayerElevationD9Ej5fM2;
                            z4 = z8;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float fMo7874toPx0680j_422 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f7);
                            fMo7874toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f6);
                            final Function2<? super Composer, ? super Integer, Unit> composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1744778315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
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
                                public final void invoke(@Nullable Composer composer2, int i332) {
                                    if ((i332 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1744778315, i332, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:281)");
                                        }
                                        if (z6) {
                                            composer2.startReplaceableGroup(-1017265285);
                                            Function2<Composer, Integer, Unit> function24 = function2;
                                            Function2<Composer, Integer, Unit> function25 = function22;
                                            composer2.startReplaceableGroup(-483455358);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            function24.invoke(composer2, 0);
                                            function25.invoke(composer2, 0);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                        } else {
                                            composer2.startReplaceableGroup(-1017265173);
                                            BackdropScaffoldKt.BackLayerTransition(backdropScaffoldStateRememberBackdropScaffoldState.getTargetValue(), function2, function22, composer2, 0);
                                            composer2.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            });
                            int i332 = i24;
                            composerStartRestartGroup.startReplaceableGroup(-874716113);
                            zChanged = composerStartRestartGroup.changed(fMo7874toPx0680j_4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                        return Constraints.m13610boximpl(m8786invokeZezNO4M(constraints.getValue()));
                                    }

                                    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
                                    public final long m8786invokeZezNO4M(long j122) {
                                        return ConstraintsKt.m13639offsetNN6EwU$default(Constraints.m13613copyZbe2FdA$default(j122, 0, 0, 0, 0, 10, null), 0, -MathKt__MathJVMKt.roundToInt(fMo7874toPx0680j_4), 1, null);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                final Function1<? super Constraints, Constraints> function12 = (Function1) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                final Modifier modifier42 = modifier2;
                                final boolean z132 = z7;
                                final boolean z142 = z4;
                                final BackdropScaffoldState backdropScaffoldState22 = backdropScaffoldStateRememberBackdropScaffoldState;
                                final Shape shape42 = frontLayerShape;
                                final long j122 = j6;
                                final long j132 = j7;
                                final float f122 = f8;
                                final float f132 = f6;
                                final float f142 = f7;
                                final long j142 = frontLayerScrimColor;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function342 = function3M8871getLambda1$material_release;
                                int i342 = i332 << 6;
                                SurfaceKt.m9025SurfaceFjzlyU(null, null, j8, jM8864contentColorForek8zF_U, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1049909631, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
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
                                    public final void invoke(@Nullable Composer composer2, int i35) {
                                        if ((i35 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1049909631, i35, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:299)");
                                            }
                                            composer2.startReplaceableGroup(773894976);
                                            composer2.startReplaceableGroup(-492369756);
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                                            }
                                            composer2.endReplaceableGroup();
                                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                                            composer2.endReplaceableGroup();
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier42, 0.0f, 1, null);
                                            Function2<Composer, Integer, Unit> function24 = composableLambda2;
                                            Function1<Constraints, Constraints> function122 = function12;
                                            final float f152 = fMo7874toPx0680j_4;
                                            final boolean z152 = z132;
                                            final boolean z16 = z142;
                                            final BackdropScaffoldState backdropScaffoldState3 = backdropScaffoldState22;
                                            final float f16 = fMo7874toPx0680j_422;
                                            final Shape shape5 = shape42;
                                            final long j152 = j122;
                                            final long j162 = j132;
                                            final float f17 = f122;
                                            final float f18 = f132;
                                            final float f19 = f142;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                                            final long j17 = j142;
                                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function352 = function342;
                                            BackdropScaffoldKt.BackdropStack(modifierFillMaxSize$default, function24, function122, ComposableLambdaKt.composableLambda(composer2, 1800047509, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f20, Composer composer3, Integer num) {
                                                    m8784invokejYbf7pk(constraints.getValue(), f20.floatValue(), composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                /* renamed from: invoke-jYbf7pk, reason: not valid java name */
                                                public final void m8784invokejYbf7pk(long j18, float f20, @Nullable Composer composer3, int i36) {
                                                    int i37;
                                                    Modifier modifierNestedScroll$default;
                                                    float fM13666constructorimpl;
                                                    if ((i36 & 14) == 0) {
                                                        i37 = i36 | (composer3.changed(j18) ? 4 : 2);
                                                    } else {
                                                        i37 = i36;
                                                    }
                                                    if ((i36 & 112) == 0) {
                                                        i37 |= composer3.changed(f20) ? 32 : 16;
                                                    }
                                                    if ((i37 & 731) != 146 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1800047509, i37, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:305)");
                                                        }
                                                        float fM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j18);
                                                        float fMin = fM13621getMaxHeightimpl - f152;
                                                        if (z152) {
                                                            fMin = Math.min(fMin, f20);
                                                        }
                                                        float f21 = fMin;
                                                        if (z16) {
                                                            modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.INSTANCE, backdropScaffoldState3.getNestedScrollConnection(), null, 2, null);
                                                        } else {
                                                            modifierNestedScroll$default = Modifier.INSTANCE;
                                                        }
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        Modifier modifierThen = companion.then(modifierNestedScroll$default);
                                                        BackdropScaffoldState backdropScaffoldState4 = backdropScaffoldState3;
                                                        Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.m7112to(Float.valueOf(f16), BackdropValue.Concealed), TuplesKt.m7112to(Float.valueOf(f21), BackdropValue.Revealed));
                                                        Modifier modifierM9035swipeablepPrIpRY = SwipeableKt.m9035swipeablepPrIpRY(modifierThen, backdropScaffoldState4, mapMapOf, Orientation.Vertical, (288 & 8) != 0 ? true : z16, (288 & 16) != 0 ? false : false, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : null, (288 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (288 & 256) != 0 ? SwipeableDefaults.INSTANCE.m9034getVelocityThresholdD9Ej5fM() : 0.0f);
                                                        final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState3;
                                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM9035swipeablepPrIpRY, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1
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
                                                                if (backdropScaffoldState5.isConcealed()) {
                                                                    final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                                                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                    SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                        @DebugMetadata(m7119c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1", m7120f = "BackdropScaffold.kt", m7121i = {}, m7122l = {332}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$1$1, reason: invalid class name */
                                                                        /* loaded from: classes2.dex */
                                                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            public int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            @NotNull
                                                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                                    this.label = 1;
                                                                                    if (backdropScaffoldState.reveal(this) == coroutine_suspended) {
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
                                                                            if (backdropScaffoldState6.getConfirmStateChange$material_release().invoke(BackdropValue.Revealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(backdropScaffoldState6, null), 3, null);
                                                                            }
                                                                            return Boolean.TRUE;
                                                                        }
                                                                    }, 1, null);
                                                                } else {
                                                                    final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState5;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope2;
                                                                    SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1.2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                        @DebugMetadata(m7119c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1", m7120f = "BackdropScaffold.kt", m7121i = {}, m7122l = {338}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$swipeable$1$2$1, reason: invalid class name */
                                                                        /* loaded from: classes2.dex */
                                                                        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            public int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            public AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation<? super AnonymousClass1> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            @NotNull
                                                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                return new AnonymousClass1(this.$scaffoldState, continuation);
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
                                                                                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                                    this.label = 1;
                                                                                    if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
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
                                                                            if (backdropScaffoldState7.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new AnonymousClass1(backdropScaffoldState7, null), 3, null);
                                                                            }
                                                                            return Boolean.TRUE;
                                                                        }
                                                                    }, 1, null);
                                                                }
                                                            }
                                                        }, 1, null);
                                                        composer3.startReplaceableGroup(-874714066);
                                                        boolean zChanged2 = composer3.changed(backdropScaffoldState3);
                                                        final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState3;
                                                        Object objRememberedValue3 = composer3.rememberedValue();
                                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue3 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$1$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                                    return IntOffset.m13785boximpl(m8785invokeBjo55l4(density));
                                                                }

                                                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                                public final long m8785invokeBjo55l4(@NotNull Density density) {
                                                                    return IntOffsetKt.IntOffset(0, MathKt__MathJVMKt.roundToInt(backdropScaffoldState6.getOffset().getValue().floatValue()));
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue3);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        Modifier modifierThen2 = OffsetKt.offset(companion, (Function1) objRememberedValue3).then(modifierSemantics$default);
                                                        Shape shape6 = shape5;
                                                        long j19 = j152;
                                                        long j20 = j162;
                                                        float f22 = f17;
                                                        final float f23 = f19;
                                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                                        final long j21 = j17;
                                                        final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState3;
                                                        final boolean z17 = z16;
                                                        final CoroutineScope coroutineScope3 = coroutineScope;
                                                        SurfaceKt.m9025SurfaceFjzlyU(modifierThen2, shape6, j19, j20, null, f22, ComposableLambdaKt.composableLambda(composer3, -1065299503, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.1.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                            @Composable
                                                            public final void invoke(@Nullable Composer composer4, int i38) {
                                                                if ((i38 & 11) != 2 || !composer4.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-1065299503, i38, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:353)");
                                                                    }
                                                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                                                    Function2<Composer, Integer, Unit> function27 = function26;
                                                                    long j22 = j21;
                                                                    final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState7;
                                                                    final boolean z18 = z17;
                                                                    final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                    composer4.startReplaceableGroup(733328855);
                                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
                                                                    composer4.startReplaceableGroup(-1323940314);
                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer4.startReusableNode();
                                                                    if (composer4.getInserting()) {
                                                                        composer4.createNode(constructor);
                                                                    } else {
                                                                        composer4.useNode();
                                                                    }
                                                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer4);
                                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                                    composer4.startReplaceableGroup(2058660585);
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    function27.invoke(composer4, 0);
                                                                    BackdropScaffoldKt.m8782Scrim3JVO9M(j22, new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                                                            invoke2();
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* compiled from: BackdropScaffold.kt */
                                                                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                                        @DebugMetadata(m7119c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", m7120f = "BackdropScaffold.kt", m7121i = {}, m7122l = {360}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                                        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1 */
                                                                        /* loaded from: classes2.dex */
                                                                        public static final class C10301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            public final /* synthetic */ BackdropScaffoldState $scaffoldState;
                                                                            public int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            public C10301(BackdropScaffoldState backdropScaffoldState, Continuation<? super C10301> continuation) {
                                                                                super(2, continuation);
                                                                                this.$scaffoldState = backdropScaffoldState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            @NotNull
                                                                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                                                return new C10301(this.$scaffoldState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            @Nullable
                                                                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                                                return ((C10301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            @Nullable
                                                                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                                                                                    this.label = 1;
                                                                                    if (backdropScaffoldState.conceal(this) == coroutine_suspended) {
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

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2() {
                                                                            if (z18 && backdropScaffoldState8.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new C10301(backdropScaffoldState8, null), 3, null);
                                                                            }
                                                                        }
                                                                    }, backdropScaffoldState8.getTargetValue() == BackdropValue.Revealed, composer4, 0);
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endNode();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }
                                                        }), composer3, 1572864, 16);
                                                        if (backdropScaffoldState3.isRevealed() && f21 == fM13621getMaxHeightimpl - f152) {
                                                            fM13666constructorimpl = f18;
                                                        } else {
                                                            fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                                        }
                                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM13666constructorimpl, 7, null);
                                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                        Function3<SnackbarHostState, Composer, Integer, Unit> function36 = function352;
                                                        BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState3;
                                                        composer3.startReplaceableGroup(733328855);
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 6);
                                                        composer3.startReplaceableGroup(-1323940314);
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                        if (!(composer3.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer3.startReusableNode();
                                                        if (composer3.getInserting()) {
                                                            composer3.createNode(constructor);
                                                        } else {
                                                            composer3.useNode();
                                                        }
                                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                        composer3.startReplaceableGroup(2058660585);
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        function36.invoke(backdropScaffoldState8.getSnackbarHostState(), composer3, 0);
                                                        composer3.endReplaceableGroup();
                                                        composer3.endNode();
                                                        composer3.endReplaceableGroup();
                                                        composer3.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }), composer2, 3120);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, (i342 & 7168) | (i342 & 896) | 1572864, 51);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f9 = f6;
                                shape3 = frontLayerShape;
                                function33 = function3M8871getLambda1$material_release;
                                j9 = jM8864contentColorForek8zF_U;
                                j10 = frontLayerScrimColor;
                                z9 = z6;
                                z10 = z4;
                                j11 = j7;
                                z11 = z7;
                                f10 = f8;
                                f11 = f7;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                if ((i2 & 14) != 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) != 0) {
                }
                int i282 = i14;
                i15 = i3 & 8192;
                if (i15 != 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                if ((i2 & 458752) == 0) {
                }
                if ((i2 & 3670016) == 0) {
                }
                i17 = i3 & 131072;
                if (i17 != 0) {
                }
                i18 = i282;
                if ((i13 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            if ((i2 & 14) != 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) != 0) {
            }
            int i2822 = i14;
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i17 = i3 & 131072;
            if (i17 != 0) {
            }
            i18 = i2822;
            if ((i13 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        int i272 = 8192;
        if ((i & 57344) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        if ((i2 & 14) != 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) != 0) {
        }
        int i28222 = i14;
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i17 = i3 & 131072;
        if (i17 != 0) {
        }
        i18 = i28222;
        if ((i13 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m8782Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifierPointerInput;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92141505);
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
                ComposerKt.traceEventStart(-92141505, i2, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:388)");
            }
            if (j != Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                if (z) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-874712345);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(function0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                } else {
                    modifierPointerInput = Modifier.INSTANCE;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierPointerInput);
                composerStartRestartGroup.startReplaceableGroup(-874712142);
                boolean zChanged = composerStartRestartGroup.changed(j) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
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
                            DrawScope.m11884drawRectnJ9OG0$default(drawScope, j, 0L, 0L, BackdropScaffoldKt.Scrim_3J_VO9M$lambda$4(stateAnimateFloatAsState), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
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
                    BackdropScaffoldKt.m8782Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BackLayerTransition(final BackdropValue backdropValue, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-950970976);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(backdropValue) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i3, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:420)");
            }
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            float fMo7874toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(AnimationSlideOffset);
            float f = 1;
            float fCoerceIn = RangesKt___RangesKt.coerceIn(BackLayerTransition$lambda$7(stateAnimateFloatAsState) - f, 0.0f, 1.0f);
            float fCoerceIn2 = RangesKt___RangesKt.coerceIn(f - BackLayerTransition$lambda$7(stateAnimateFloatAsState), 0.0f, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, fCoerceIn), 0.0f, 0.0f, fCoerceIn, 0.0f, (f - fCoerceIn) * fMo7874toPx0680j_4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM11501graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(ZIndexModifierKt.zIndex(companion, fCoerceIn2), 0.0f, 0.0f, fCoerceIn2, 0.0f, (f - fCoerceIn2) * (-fMo7874toPx0680j_4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131051, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackLayerTransition.2
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

                public final void invoke(@Nullable Composer composer2, int i4) {
                    BackdropScaffoldKt.BackLayerTransition(backdropValue, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    public static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super Constraints, Constraints> function1, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248995194);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i2, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:458)");
            }
            composerStartRestartGroup.startReplaceableGroup(-874710293);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(function2) | composerStartRestartGroup.changedInstance(function1) | composerStartRestartGroup.changedInstance(function4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m8787invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m8787invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, final long j) {
                        final Placeable placeableMo12610measureBRTryo0 = ((Measurable) CollectionsKt___CollectionsKt.first((List) subcomposeMeasureScope.subcompose(BackdropLayers.Back, function2))).mo12610measureBRTryo0(function1.invoke(Constraints.m13610boximpl(j)).getValue());
                        final float height = placeableMo12610measureBRTryo0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final Function4<Constraints, Float, Composer, Integer, Unit> function42 = function4;
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i3) {
                                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1222642649, i3, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:468)");
                                }
                                function42.invoke(Constraints.m13610boximpl(j), Float.valueOf(height), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.add(listSubcompose.get(i3).mo12610measureBRTryo0(j));
                        }
                        int iMax = Math.max(Constraints.m13624getMinWidthimpl(j), placeableMo12610measureBRTryo0.getWidth());
                        int iMax2 = Math.max(Constraints.m13623getMinHeightimpl(j), placeableMo12610measureBRTryo0.getHeight());
                        int size2 = arrayList.size();
                        int iMax3 = iMax2;
                        int iMax4 = iMax;
                        for (int i4 = 0; i4 < size2; i4++) {
                            Placeable placeable = (Placeable) arrayList.get(i4);
                            iMax4 = Math.max(iMax4, placeable.getWidth());
                            iMax3 = Math.max(iMax3, placeable.getHeight());
                        }
                        return MeasureScope.layout$default(subcomposeMeasureScope, iMax4, iMax3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, 0, 0.0f, 4, null);
                                List<Placeable> list = arrayList;
                                int size3 = list.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i5), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) objRememberedValue, composerStartRestartGroup, i2 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropStack.2
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

                public final void invoke(@Nullable Composer composer2, int i3) {
                    BackdropScaffoldKt.BackdropStack(modifier, function2, function1, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float BackLayerTransition$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }
}
