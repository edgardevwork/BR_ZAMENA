package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material.FabPosition;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.UiComposable;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scaffold.kt */
@Metadata(m7104d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¨\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u001d¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0006\u0010!\u001a\u00020\"2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a§\u0002\u0010&\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a2\u0013\b\u0002\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a2\u0019\b\u0002\u0010+\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00140\u001d¢\u0006\u0002\b\u001a2\u0013\b\u0002\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010.\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\t2 \b\u0002\u00100\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001d¢\u0006\u0002\b\u001a¢\u0006\u0002\b22\b\b\u0002\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010;\u001a\u0002082\b\b\u0002\u0010<\u001a\u0002082\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u001d¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u009f\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a2\u0013\b\u0002\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a2\u0019\b\u0002\u0010+\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00140\u001d¢\u0006\u0002\b\u001a2\u0013\b\u0002\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a2\b\b\u0002\u0010.\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\t2 \b\u0002\u00100\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001d¢\u0006\u0002\b\u001a¢\u0006\u0002\b22\b\b\u0002\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010;\u001a\u0002082\b\b\u0002\u0010<\u001a\u0002082\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u001d¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a¨\u0001\u0010A\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u001d¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0006\u0010!\u001a\u00020\"2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0003ø\u0001\u0000¢\u0006\u0004\bB\u0010%\u001a¨\u0001\u0010C\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u001d¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0006\u0010!\u001a\u00020\"2\u0016\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0003ø\u0001\u0000¢\u0006\u0004\bD\u0010%\u001a!\u0010E\u001a\u00020*2\b\b\u0002\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020,H\u0007¢\u0006\u0002\u0010I\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"1\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, m7105d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "<set-?>", "", "ScaffoldSubcomposeInMeasureFix", "getScaffoldSubcomposeInMeasureFix$annotations", "()V", "getScaffoldSubcomposeInMeasureFix", "()Z", "setScaffoldSubcomposeInMeasureFix", "(Z)V", "ScaffoldSubcomposeInMeasureFix$delegate", "Landroidx/compose/runtime/MutableState;", "LegacyScaffoldLayout", "", "isFabDocked", "fabPosition", "Landroidx/compose/material/FabPosition;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "snackbar", "fab", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "bottomBar", "LegacyScaffoldLayout-i1QSOvI", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Scaffold", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "isFloatingActionButtonDocked", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Scaffold-u4IkXBM", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "ScaffoldLayout-i1QSOvI", "ScaffoldLayoutWithMeasureFix", "ScaffoldLayoutWithMeasureFix-i1QSOvI", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,818:1\n25#2:819\n25#2:826\n36#2:833\n1116#3,6:820\n1116#3,6:827\n1116#3,6:834\n1116#3,6:844\n1116#3,6:850\n154#4:840\n154#4:856\n81#5:841\n107#5,2:842\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n76#1:819\n77#1:826\n206#1:833\n76#1:820,6\n77#1:827,6\n206#1:834,6\n451#1:844,6\n629#1:850,6\n335#1:840\n815#1:856\n383#1:841\n383#1:842,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ScaffoldKt {

    @NotNull
    private static final MutableState ScaffoldSubcomposeInMeasureFix$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    @NotNull
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = C2046Dp.m13666constructorimpl(16);

    @ExperimentalMaterialApi
    public static /* synthetic */ void getScaffoldSubcomposeInMeasureFix$annotations() {
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1569641925);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
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
            ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:341:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:629:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Scaffold-u4IkXBM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8992Scaffoldu4IkXBM(@NotNull final WindowInsets windowInsets, @Nullable Modifier modifier, @Nullable ScaffoldState scaffoldState, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, @Nullable Shape shape, float f, long j, long j2, long j3, long j4, long j5, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        ScaffoldState scaffoldStateRememberScaffoldState;
        Function2<? super Composer, ? super Integer, Unit> function2M8874getLambda1$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M8875getLambda2$material_release;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M8876getLambda3$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M8877getLambda4$material_release;
        int iM8923getEnd5ygKITE;
        boolean z3;
        Shape large;
        float fM8892getElevationD9Ej5fM;
        Shape shape2;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U;
        long j6;
        int i18;
        long scrimColor;
        long jM8839getBackground0d7_KjU;
        int i19;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        long j7;
        long jM8864contentColorForek8zF_U2;
        long j8;
        int i20;
        final Modifier modifier3;
        boolean z4;
        Shape shape3;
        Shape shape4;
        boolean zChanged;
        Object objRememberedValue;
        boolean z5;
        final ScaffoldState scaffoldState2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final float f2;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final long j13;
        final Shape shape5;
        final boolean z6;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final int i21;
        final boolean z7;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function36;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1288630565);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(windowInsets) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i22 = i4 & 2;
        if (i22 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                i5 |= ((i4 & 4) == 0 && composerStartRestartGroup.changed(scaffoldState)) ? 256 : 128;
            }
            i6 = i4 & 8;
            int i23 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                int i24 = 8192;
                if (i7 != 0) {
                    i5 |= CpioConstants.C_ISBLK;
                } else if ((i2 & 57344) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i2 & 458752) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                    i11 = i;
                } else {
                    i11 = i;
                    if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changed(i11) ? 8388608 : 4194304;
                    }
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                }
                i14 = i4 & 1024;
                if (i14 != 0) {
                    i15 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i15 = i3 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
                } else {
                    i15 = i3;
                }
                if ((i3 & 112) == 0) {
                    i15 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                }
                int i25 = i15;
                i16 = i4 & 4096;
                if (i16 == 0) {
                    if ((i3 & 896) == 0) {
                        i25 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                    }
                    if ((i3 & 7168) != 0) {
                        i17 = i16;
                        if ((i4 & 8192) == 0 && composerStartRestartGroup.changed(j)) {
                            i23 = 2048;
                        }
                        i25 |= i23;
                    } else {
                        i17 = i16;
                    }
                    if ((i3 & 57344) == 0) {
                        if ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j2)) {
                            i24 = 16384;
                        }
                        i25 |= i24;
                    }
                    if ((i3 & 458752) == 0) {
                        i25 |= ((i4 & 32768) == 0 && composerStartRestartGroup.changed(j3)) ? 131072 : 65536;
                    }
                    if ((i3 & 3670016) == 0) {
                        i25 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(j4)) ? 1048576 : 524288;
                    }
                    if ((i3 & 29360128) == 0) {
                        i25 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(j5)) ? 8388608 : 4194304;
                    }
                    if ((i4 & 262144) == 0) {
                        i25 |= 100663296;
                    } else if ((i3 & 234881024) == 0) {
                        i25 |= composerStartRestartGroup.changedInstance(function33) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i5 & 1533916891) == 306783378 || (191739611 & i25) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i22 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i4 & 4) == 0) {
                                modifier2 = modifier4;
                                scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i5 &= -897;
                            } else {
                                modifier2 = modifier4;
                                scaffoldStateRememberScaffoldState = scaffoldState;
                            }
                            function2M8874getLambda1$material_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8874getLambda1$material_release() : function2;
                            function2M8875getLambda2$material_release = i7 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8875getLambda2$material_release() : function22;
                            function3M8876getLambda3$material_release = i8 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8876getLambda3$material_release() : function3;
                            function2M8877getLambda4$material_release = i9 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8877getLambda4$material_release() : function23;
                            iM8923getEnd5ygKITE = i10 == 0 ? FabPosition.INSTANCE.m8923getEnd5ygKITE() : i;
                            boolean z8 = i12 == 0 ? false : z;
                            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37 = i13 == 0 ? null : function32;
                            z3 = i14 == 0 ? true : z2;
                            int i26 = i5;
                            boolean z9 = z8;
                            if ((i4 & 2048) == 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i25 &= -113;
                            } else {
                                large = shape;
                            }
                            fM8892getElevationD9Ej5fM = i17 == 0 ? DrawerDefaults.INSTANCE.m8892getElevationD9Ej5fM() : f;
                            if ((i4 & 8192) == 0) {
                                shape2 = large;
                                jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                i25 &= -7169;
                            } else {
                                shape2 = large;
                                jM8850getSurface0d7_KjU = j;
                            }
                            Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = function37;
                            if ((i4 & 16384) == 0) {
                                jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 9) & 14);
                                i25 &= -57345;
                            } else {
                                jM8864contentColorForek8zF_U = j2;
                            }
                            if ((32768 & i4) == 0) {
                                j6 = jM8850getSurface0d7_KjU;
                                i18 = 6;
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i25 &= -458753;
                            } else {
                                j6 = jM8850getSurface0d7_KjU;
                                i18 = 6;
                                scrimColor = j3;
                            }
                            long j14 = scrimColor;
                            if ((i4 & 65536) == 0) {
                                jM8839getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i18).m8839getBackground0d7_KjU();
                                i25 = (-3670017) & i25;
                            } else {
                                jM8839getBackground0d7_KjU = j4;
                            }
                            if ((i4 & 131072) == 0) {
                                i19 = i26;
                                function34 = function38;
                                j8 = jM8839getBackground0d7_KjU;
                                i20 = i25 & (-29360129);
                                jM8864contentColorForek8zF_U2 = ColorsKt.m8864contentColorForek8zF_U(jM8839getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 18) & 14);
                                modifier3 = modifier2;
                                z4 = z9;
                                shape3 = shape2;
                                j7 = j14;
                            } else {
                                i19 = i26;
                                function34 = function38;
                                j7 = j14;
                                jM8864contentColorForek8zF_U2 = j5;
                                j8 = jM8839getBackground0d7_KjU;
                                i20 = i25;
                                modifier3 = modifier2;
                                z4 = z9;
                                shape3 = shape2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 2048) != 0) {
                                i25 &= -113;
                            }
                            if ((i4 & 8192) != 0) {
                                i25 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i25 &= -57345;
                            }
                            if ((32768 & i4) != 0) {
                                i25 &= -458753;
                            }
                            if ((i4 & 65536) != 0) {
                                i25 &= -3670017;
                            }
                            if ((i4 & 131072) != 0) {
                                i25 &= -29360129;
                            }
                            scaffoldStateRememberScaffoldState = scaffoldState;
                            function2M8874getLambda1$material_release = function2;
                            function2M8875getLambda2$material_release = function22;
                            function2M8877getLambda4$material_release = function23;
                            z4 = z;
                            function34 = function32;
                            z3 = z2;
                            fM8892getElevationD9Ej5fM = f;
                            j6 = j;
                            jM8864contentColorForek8zF_U = j2;
                            j7 = j3;
                            j8 = j4;
                            jM8864contentColorForek8zF_U2 = j5;
                            i19 = i5;
                            i20 = i25;
                            iM8923getEnd5ygKITE = i11;
                            modifier3 = modifier;
                            function3M8876getLambda3$material_release = function3;
                            shape3 = shape;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            shape4 = shape3;
                        } else {
                            shape4 = shape3;
                            ComposerKt.traceEventStart(-1288630565, i19, i20, "androidx.compose.material.Scaffold (Scaffold.kt:204)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(windowInsets);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new MutableWindowInsets(windowInsets);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
                        final long j15 = j8;
                        final long j16 = jM8864contentColorForek8zF_U2;
                        final boolean z10 = z4;
                        final int i27 = iM8923getEnd5ygKITE;
                        final Function2<? super Composer, ? super Integer, Unit> function27 = function2M8874getLambda1$material_release;
                        final Function2<? super Composer, ? super Integer, Unit> function28 = function2M8877getLambda4$material_release;
                        final Function2<? super Composer, ? super Integer, Unit> function29 = function2M8875getLambda2$material_release;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function39 = function3M8876getLambda3$material_release;
                        final ScaffoldState scaffoldState3 = scaffoldStateRememberScaffoldState;
                        final ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -219833176, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier5, Composer composer2, Integer num) {
                                invoke(modifier5, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull Modifier modifier5, @Nullable Composer composer2, int i28) {
                                int i29;
                                if ((i28 & 14) == 0) {
                                    i29 = i28 | (composer2.changed(modifier5) ? 4 : 2);
                                } else {
                                    i29 = i28;
                                }
                                if ((i29 & 91) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-219833176, i29, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:209)");
                                    }
                                    composer2.startReplaceableGroup(188860046);
                                    boolean zChanged2 = composer2.changed(mutableWindowInsets) | composer2.changed(windowInsets);
                                    final MutableWindowInsets mutableWindowInsets2 = mutableWindowInsets;
                                    final WindowInsets windowInsets2 = windowInsets;
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                invoke2(windowInsets3);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull WindowInsets windowInsets3) {
                                                mutableWindowInsets2.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierOnConsumedWindowInsetsChanged = WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier5, (Function1) objRememberedValue2);
                                    long j17 = j15;
                                    long j18 = j16;
                                    final boolean z11 = z10;
                                    final int i30 = i27;
                                    final Function2<Composer, Integer, Unit> function210 = function27;
                                    final Function3<PaddingValues, Composer, Integer, Unit> function310 = function33;
                                    final Function2<Composer, Integer, Unit> function211 = function28;
                                    final MutableWindowInsets mutableWindowInsets3 = mutableWindowInsets;
                                    final Function2<Composer, Integer, Unit> function212 = function29;
                                    final Function3<SnackbarHostState, Composer, Integer, Unit> function311 = function39;
                                    final ScaffoldState scaffoldState4 = scaffoldState3;
                                    SurfaceKt.m9025SurfaceFjzlyU(modifierOnConsumedWindowInsetsChanged, null, j17, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1772955108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                        public final void invoke(@Nullable Composer composer3, int i31) {
                                            if ((i31 & 11) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1772955108, i31, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:218)");
                                                }
                                                boolean z12 = z11;
                                                int i32 = i30;
                                                Function2<Composer, Integer, Unit> function213 = function210;
                                                Function3<PaddingValues, Composer, Integer, Unit> function312 = function310;
                                                final Function3<SnackbarHostState, Composer, Integer, Unit> function313 = function311;
                                                final ScaffoldState scaffoldState5 = scaffoldState4;
                                                ScaffoldKt.m8993ScaffoldLayouti1QSOvI(z12, i32, function213, function312, ComposableLambdaKt.composableLambda(composer3, 433906483, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                    public final void invoke(@Nullable Composer composer4, int i33) {
                                                        if ((i33 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(433906483, i33, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:225)");
                                                        }
                                                        function313.invoke(scaffoldState5.getSnackbarHostState(), composer4, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), function211, mutableWindowInsets3, function212, composer3, CpioConstants.C_ISBLK);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 1572864, 50);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        });
                        if (function34 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-1013846315);
                            z5 = z4;
                            int i28 = i20 << 9;
                            DrawerKt.m8895ModalDrawerGs3lGvM(function34, modifier3, scaffoldStateRememberScaffoldState.getDrawerState(), z3, shape4, fM8892getElevationD9Ej5fM, j6, jM8864contentColorForek8zF_U, j7, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1409196448, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                                public final void invoke(@Nullable Composer composer2, int i29) {
                                    if ((i29 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1409196448, i29, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:244)");
                                    }
                                    composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i19 >> 27) & 14) | 805306368 | (i19 & 112) | (i28 & 7168) | (i28 & 57344) | (i28 & 458752) | (i28 & 3670016) | (i28 & 29360128) | (i28 & 234881024), 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            z5 = z4;
                            composerStartRestartGroup.startReplaceableGroup(-1013845806);
                            composableLambda.invoke(modifier3, composerStartRestartGroup, Integer.valueOf(((i19 >> 3) & 14) | 48));
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function24 = function2M8875getLambda2$material_release;
                        function25 = function2M8877getLambda4$material_release;
                        f2 = fM8892getElevationD9Ej5fM;
                        j9 = jM8864contentColorForek8zF_U;
                        j10 = j6;
                        j11 = j7;
                        j12 = j8;
                        j13 = jM8864contentColorForek8zF_U2;
                        shape5 = shape4;
                        z6 = z5;
                        int i29 = iM8923getEnd5ygKITE;
                        function35 = function34;
                        function26 = function2M8874getLambda1$material_release;
                        i21 = i29;
                        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function310 = function3M8876getLambda3$material_release;
                        z7 = z3;
                        function36 = function310;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scaffoldState2 = scaffoldState;
                        function26 = function2;
                        function24 = function22;
                        function36 = function3;
                        function25 = function23;
                        z6 = z;
                        function35 = function32;
                        shape5 = shape;
                        f2 = f;
                        j10 = j;
                        j9 = j2;
                        j11 = j3;
                        j12 = j4;
                        j13 = j5;
                        i21 = i11;
                        z7 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                            public final void invoke(@Nullable Composer composer2, int i30) {
                                ScaffoldKt.m8992Scaffoldu4IkXBM(windowInsets, modifier3, scaffoldState2, function26, function24, function36, function25, i21, z6, function35, z7, shape5, f2, j10, j9, j11, j12, j13, function33, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                i25 |= 384;
                if ((i3 & 7168) != 0) {
                }
                if ((i3 & 57344) == 0) {
                }
                if ((i3 & 458752) == 0) {
                }
                if ((i3 & 3670016) == 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i4 & 262144) == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i22 == 0) {
                        }
                        if ((i4 & 4) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        int i262 = i5;
                        boolean z92 = z8;
                        if ((i4 & 2048) == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if ((i4 & 8192) == 0) {
                        }
                        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function382 = function37;
                        if ((i4 & 16384) == 0) {
                        }
                        if ((32768 & i4) == 0) {
                        }
                        long j142 = scrimColor;
                        if ((i4 & 65536) == 0) {
                        }
                        if ((i4 & 131072) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(windowInsets);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new MutableWindowInsets(windowInsets);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            final MutableWindowInsets mutableWindowInsets2 = (MutableWindowInsets) objRememberedValue;
                            final long j152 = j8;
                            final long j162 = jM8864contentColorForek8zF_U2;
                            final boolean z102 = z4;
                            final int i272 = iM8923getEnd5ygKITE;
                            final Function2<? super Composer, ? super Integer, Unit> function272 = function2M8874getLambda1$material_release;
                            final Function2<? super Composer, ? super Integer, Unit> function282 = function2M8877getLambda4$material_release;
                            final Function2<? super Composer, ? super Integer, Unit> function292 = function2M8875getLambda2$material_release;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function392 = function3M8876getLambda3$material_release;
                            final ScaffoldState scaffoldState32 = scaffoldStateRememberScaffoldState;
                            final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -219833176, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier5, Composer composer2, Integer num) {
                                    invoke(modifier5, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull Modifier modifier5, @Nullable Composer composer2, int i282) {
                                    int i292;
                                    if ((i282 & 14) == 0) {
                                        i292 = i282 | (composer2.changed(modifier5) ? 4 : 2);
                                    } else {
                                        i292 = i282;
                                    }
                                    if ((i292 & 91) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-219833176, i292, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:209)");
                                        }
                                        composer2.startReplaceableGroup(188860046);
                                        boolean zChanged2 = composer2.changed(mutableWindowInsets2) | composer2.changed(windowInsets);
                                        final MutableWindowInsets mutableWindowInsets22 = mutableWindowInsets2;
                                        final WindowInsets windowInsets2 = windowInsets;
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets3) {
                                                    invoke2(windowInsets3);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull WindowInsets windowInsets3) {
                                                    mutableWindowInsets22.setInsets(WindowInsetsKt.exclude(windowInsets2, windowInsets3));
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        Modifier modifierOnConsumedWindowInsetsChanged = WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier5, (Function1) objRememberedValue2);
                                        long j17 = j152;
                                        long j18 = j162;
                                        final boolean z11 = z102;
                                        final int i30 = i272;
                                        final Function2<? super Composer, ? super Integer, Unit> function210 = function272;
                                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3102 = function33;
                                        final Function2<? super Composer, ? super Integer, Unit> function211 = function282;
                                        final MutableWindowInsets mutableWindowInsets3 = mutableWindowInsets2;
                                        final Function2<? super Composer, ? super Integer, Unit> function212 = function292;
                                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function311 = function392;
                                        final ScaffoldState scaffoldState4 = scaffoldState32;
                                        SurfaceKt.m9025SurfaceFjzlyU(modifierOnConsumedWindowInsetsChanged, null, j17, j18, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1772955108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                            public final void invoke(@Nullable Composer composer3, int i31) {
                                                if ((i31 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1772955108, i31, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:218)");
                                                    }
                                                    boolean z12 = z11;
                                                    int i32 = i30;
                                                    Function2<Composer, Integer, Unit> function213 = function210;
                                                    Function3<PaddingValues, Composer, Integer, Unit> function312 = function3102;
                                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function313 = function311;
                                                    final ScaffoldState scaffoldState5 = scaffoldState4;
                                                    ScaffoldKt.m8993ScaffoldLayouti1QSOvI(z12, i32, function213, function312, ComposableLambdaKt.composableLambda(composer3, 433906483, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                        public final void invoke(@Nullable Composer composer4, int i33) {
                                                            if ((i33 & 11) == 2 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(433906483, i33, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:225)");
                                                            }
                                                            function313.invoke(scaffoldState5.getSnackbarHostState(), composer4, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }), function211, mutableWindowInsets3, function212, composer3, CpioConstants.C_ISBLK);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }), composer2, 1572864, 50);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            });
                            if (function34 == null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            scaffoldState2 = scaffoldStateRememberScaffoldState;
                            function24 = function2M8875getLambda2$material_release;
                            function25 = function2M8877getLambda4$material_release;
                            f2 = fM8892getElevationD9Ej5fM;
                            j9 = jM8864contentColorForek8zF_U;
                            j10 = j6;
                            j11 = j7;
                            j12 = j8;
                            j13 = jM8864contentColorForek8zF_U2;
                            shape5 = shape4;
                            z6 = z5;
                            int i292 = iM8923getEnd5ygKITE;
                            function35 = function34;
                            function26 = function2M8874getLambda1$material_release;
                            i21 = i292;
                            Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3102 = function3M8876getLambda3$material_release;
                            z7 = z3;
                            function36 = function3102;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i4 & 16;
            int i242 = 8192;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            if ((i3 & 112) == 0) {
            }
            int i252 = i15;
            i16 = i4 & 4096;
            if (i16 == 0) {
            }
            if ((i3 & 7168) != 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i4 & 262144) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 896) == 0) {
        }
        i6 = i4 & 8;
        int i232 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2422 = 8192;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        if ((i3 & 112) == 0) {
        }
        int i2522 = i15;
        i16 = i4 & 4096;
        if (i16 == 0) {
        }
        if ((i3 & 7168) != 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i4 & 262144) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:334:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:593:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Scaffold-27mzLpw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8991Scaffold27mzLpw(@Nullable Modifier modifier, @Nullable ScaffoldState scaffoldState, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, boolean z2, @Nullable Shape shape, float f, long j, long j2, long j3, long j4, long j5, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier modifier2;
        ScaffoldState scaffoldStateRememberScaffoldState;
        Function2<? super Composer, ? super Integer, Unit> function2M8878getLambda5$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M8879getLambda6$material_release;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M8880getLambda7$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M8881getLambda8$material_release;
        int iM8923getEnd5ygKITE;
        boolean z4;
        final Shape large;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34;
        boolean z5;
        int i16;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U;
        long j6;
        int i17;
        long scrimColor;
        long jM8839getBackground0d7_KjU;
        boolean z6;
        long jM8864contentColorForek8zF_U2;
        long j7;
        int i18;
        int i19;
        long j8;
        long j9;
        long j10;
        final Modifier modifier3;
        final ScaffoldState scaffoldState2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function35;
        float f2;
        Composer composer2;
        final long j11;
        long j12;
        final long j13;
        final long j14;
        final long j15;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function36;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final int i20;
        final float f3;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function37;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1037492569);
        int i21 = i4 & 1;
        if (i21 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            i5 |= ((i4 & 2) == 0 && composerStartRestartGroup.changed(scaffoldState)) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                function24 = function2;
                i5 |= composerStartRestartGroup.changedInstance(function24) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                int i23 = 8192;
                if (i7 != 0) {
                    i5 |= CpioConstants.C_ISBLK;
                } else if ((i2 & 57344) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i2 & 458752) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                    i10 = i;
                } else {
                    i10 = i;
                    if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changed(i10) ? 1048576 : 524288;
                    }
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                    i5 |= 12582912;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                    }
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function32) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    i14 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= composerStartRestartGroup.changed(f) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    i14 |= ((i4 & 4096) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
                }
                if ((i3 & 7168) == 0) {
                    i14 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(j2)) ? 2048 : 1024;
                }
                if ((i3 & 57344) == 0) {
                    if ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j3)) {
                        i23 = 16384;
                    }
                    i14 |= i23;
                }
                if ((i3 & 458752) == 0) {
                    i14 |= ((i4 & 32768) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
                }
                if ((i3 & 3670016) == 0) {
                    i14 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(j5)) ? 1048576 : 524288;
                }
                if ((i4 & 131072) != 0) {
                    i14 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    i14 |= composerStartRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
                }
                if ((i5 & 1533916891) != 306783378 || (i14 & 23967451) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i21 == 0 ? Modifier.INSTANCE : modifier;
                        if ((i4 & 2) == 0) {
                            modifier2 = modifier4;
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            modifier2 = modifier4;
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        function2M8878getLambda5$material_release = i22 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8878getLambda5$material_release() : function24;
                        function2M8879getLambda6$material_release = i6 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8879getLambda6$material_release() : function22;
                        function3M8880getLambda7$material_release = i7 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8880getLambda7$material_release() : function3;
                        function2M8881getLambda8$material_release = i8 == 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m8881getLambda8$material_release() : function23;
                        iM8923getEnd5ygKITE = i9 == 0 ? FabPosition.INSTANCE.m8923getEnd5ygKITE() : i;
                        z4 = i11 == 0 ? false : z3;
                        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function38 = i12 == 0 ? null : function32;
                        boolean z9 = i13 == 0 ? true : z2;
                        ScaffoldState scaffoldState3 = scaffoldStateRememberScaffoldState;
                        if ((i4 & 1024) == 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i14 &= -15;
                        } else {
                            large = shape;
                        }
                        int i24 = i14;
                        float fM8892getElevationD9Ej5fM = i15 == 0 ? DrawerDefaults.INSTANCE.m8892getElevationD9Ej5fM() : f;
                        if ((i4 & 4096) == 0) {
                            function34 = function38;
                            boolean z10 = z9;
                            i16 = i24 & (-897);
                            jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                            z5 = z10;
                        } else {
                            function34 = function38;
                            z5 = z9;
                            i16 = i24;
                            jM8850getSurface0d7_KjU = j;
                        }
                        float f4 = fM8892getElevationD9Ej5fM;
                        if ((i4 & 8192) == 0) {
                            jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i16 >> 6) & 14);
                            i16 &= -7169;
                        } else {
                            jM8864contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) == 0) {
                            j6 = jM8850getSurface0d7_KjU;
                            i17 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i16 &= -57345;
                        } else {
                            j6 = jM8850getSurface0d7_KjU;
                            i17 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) == 0) {
                            jM8839getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i17).m8839getBackground0d7_KjU();
                            i16 &= -458753;
                        } else {
                            jM8839getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) == 0) {
                            z6 = z5;
                            j7 = jM8839getBackground0d7_KjU;
                            i18 = i16 & (-3670017);
                            i19 = i5;
                            j8 = jM8864contentColorForek8zF_U;
                            j9 = j6;
                            j10 = scrimColor;
                            jM8864contentColorForek8zF_U2 = ColorsKt.m8864contentColorForek8zF_U(jM8839getBackground0d7_KjU, composerStartRestartGroup, (i16 >> 15) & 14);
                        } else {
                            z6 = z5;
                            jM8864contentColorForek8zF_U2 = j5;
                            j7 = jM8839getBackground0d7_KjU;
                            i18 = i16;
                            i19 = i5;
                            j8 = jM8864contentColorForek8zF_U;
                            j9 = j6;
                            j10 = scrimColor;
                        }
                        modifier3 = modifier2;
                        scaffoldState2 = scaffoldState3;
                        function35 = function34;
                        f2 = f4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i4 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i4 & 1024) != 0) {
                            i14 &= -15;
                        }
                        int i25 = i14;
                        if ((i4 & 4096) != 0) {
                            i25 &= -897;
                        }
                        if ((i4 & 8192) != 0) {
                            i25 &= -7169;
                        }
                        if ((i4 & 16384) != 0) {
                            i25 &= -57345;
                        }
                        if ((32768 & i4) != 0) {
                            i25 &= -458753;
                        }
                        if ((i4 & 65536) != 0) {
                            i25 &= -3670017;
                        }
                        scaffoldState2 = scaffoldState;
                        function2M8879getLambda6$material_release = function22;
                        function2M8881getLambda8$material_release = function23;
                        function35 = function32;
                        z6 = z2;
                        j9 = j;
                        j8 = j2;
                        j10 = j3;
                        j7 = j4;
                        jM8864contentColorForek8zF_U2 = j5;
                        i18 = i25;
                        i19 = i5;
                        z4 = z3;
                        function2M8878getLambda5$material_release = function24;
                        modifier3 = modifier;
                        large = shape;
                        f2 = f;
                        iM8923getEnd5ygKITE = i10;
                        function3M8880getLambda7$material_release = function3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        composer2 = composerStartRestartGroup;
                    } else {
                        composer2 = composerStartRestartGroup;
                        ComposerKt.traceEventStart(1037492569, i19, i18, "androidx.compose.material.Scaffold (Scaffold.kt:332)");
                    }
                    int i26 = i18 << 3;
                    m8992Scaffoldu4IkXBM(WindowInsetsKt.m8197WindowInsetsa9UjIt4$default(C2046Dp.m13666constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier3, scaffoldState2, function2M8878getLambda5$material_release, function2M8879getLambda6$material_release, function3M8880getLambda7$material_release, function2M8881getLambda8$material_release, iM8923getEnd5ygKITE, z4, function35, z6, large, f2, j9, j8, j10, j7, jM8864contentColorForek8zF_U2, function33, composer2, (i19 << 3) & 2147483632, ((i19 >> 27) & 14) | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128) | (i26 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j11 = j9;
                    j12 = j8;
                    j13 = j10;
                    j14 = j7;
                    j15 = jM8864contentColorForek8zF_U2;
                    Function2<? super Composer, ? super Integer, Unit> function28 = function2M8881getLambda8$material_release;
                    function36 = function35;
                    function25 = function2M8878getLambda5$material_release;
                    function26 = function28;
                    boolean z11 = z4;
                    z7 = z6;
                    function27 = function2M8879getLambda6$material_release;
                    i20 = iM8923getEnd5ygKITE;
                    f3 = f2;
                    function37 = function3M8880getLambda7$material_release;
                    z8 = z11;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    scaffoldState2 = scaffoldState;
                    function27 = function22;
                    function37 = function3;
                    function26 = function23;
                    function36 = function32;
                    z7 = z2;
                    j11 = j;
                    j12 = j2;
                    j13 = j3;
                    j14 = j4;
                    j15 = j5;
                    composer2 = composerStartRestartGroup;
                    i20 = i10;
                    z8 = z3;
                    function25 = function24;
                    large = shape;
                    f3 = f;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j16 = j12;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
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

                        public final void invoke(@Nullable Composer composer3, int i27) {
                            ScaffoldKt.m8991Scaffold27mzLpw(modifier3, scaffoldState2, function25, function27, function37, function26, i20, z8, function36, z7, large, f3, j11, j16, j13, j14, j15, function33, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            i7 = i4 & 16;
            int i232 = 8192;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i21 == 0) {
                    }
                    if ((i4 & 2) == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    ScaffoldState scaffoldState32 = scaffoldStateRememberScaffoldState;
                    if ((i4 & 1024) == 0) {
                    }
                    int i242 = i14;
                    if (i15 == 0) {
                    }
                    if ((i4 & 4096) == 0) {
                    }
                    float f42 = fM8892getElevationD9Ej5fM;
                    if ((i4 & 8192) == 0) {
                    }
                    if ((i4 & 16384) == 0) {
                    }
                    if ((32768 & i4) == 0) {
                    }
                    if ((i4 & 65536) == 0) {
                    }
                    modifier3 = modifier2;
                    scaffoldState2 = scaffoldState32;
                    function35 = function34;
                    f2 = f42;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i262 = i18 << 3;
                    m8992Scaffoldu4IkXBM(WindowInsetsKt.m8197WindowInsetsa9UjIt4$default(C2046Dp.m13666constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null), modifier3, scaffoldState2, function2M8878getLambda5$material_release, function2M8879getLambda6$material_release, function3M8880getLambda7$material_release, function2M8881getLambda8$material_release, iM8923getEnd5ygKITE, z4, function35, z6, large, f2, j9, j8, j10, j7, jM8864contentColorForek8zF_U2, function33, composer2, (i19 << 3) & 2147483632, ((i19 >> 27) & 14) | (i262 & 112) | (i262 & 896) | (i262 & 7168) | (i262 & 57344) | (i262 & 458752) | (i262 & 3670016) | (i262 & 29360128) | (i262 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j11 = j9;
                    j12 = j8;
                    j13 = j10;
                    j14 = j7;
                    j15 = jM8864contentColorForek8zF_U2;
                    Function2<? super Composer, ? super Integer, Unit> function282 = function2M8881getLambda8$material_release;
                    function36 = function35;
                    function25 = function2M8878getLambda5$material_release;
                    function26 = function282;
                    boolean z112 = z4;
                    z7 = z6;
                    function27 = function2M8879getLambda6$material_release;
                    i20 = iM8923getEnd5ygKITE;
                    f3 = f2;
                    function37 = function3M8880getLambda7$material_release;
                    z8 = z112;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function24 = function2;
        i6 = i4 & 8;
        if (i6 != 0) {
        }
        i7 = i4 & 16;
        int i2322 = 8192;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalMaterialApi
    public static final boolean getScaffoldSubcomposeInMeasureFix() {
        return ((Boolean) ScaffoldSubcomposeInMeasureFix$delegate.getValue()).booleanValue();
    }

    @ExperimentalMaterialApi
    public static final void setScaffoldSubcomposeInMeasureFix(boolean z) {
        ScaffoldSubcomposeInMeasureFix$delegate.setValue(Boolean.valueOf(z));
    }

    @Composable
    @UiComposable
    /* renamed from: ScaffoldLayout-i1QSOvI */
    public static final void m8993ScaffoldLayouti1QSOvI(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-468424875);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468424875, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:409)");
            }
            if (getScaffoldSubcomposeInMeasureFix()) {
                composerStartRestartGroup.startReplaceableGroup(-2103098080);
                m8994ScaffoldLayoutWithMeasureFixi1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composerStartRestartGroup, i3 & 33554430);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2103097736);
                m8990LegacyScaffoldLayouti1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composerStartRestartGroup, i3 & 33554430);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1
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
                    ScaffoldKt.m8993ScaffoldLayouti1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @Composable
    @UiComposable
    /* renamed from: ScaffoldLayoutWithMeasureFix-i1QSOvI */
    public static final void m8994ScaffoldLayoutWithMeasureFixi1QSOvI(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1285900760);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1285900760, i3, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix (Scaffold.kt:449)");
            }
            composerStartRestartGroup.startReplaceableGroup(188870142);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(function2) | composerStartRestartGroup.changedInstance(function22) | composerStartRestartGroup.changed(windowInsets) | composerStartRestartGroup.changedInstance(function23) | composerStartRestartGroup.changed(i) | composerStartRestartGroup.changed(z) | composerStartRestartGroup.changedInstance(function24) | composerStartRestartGroup.changedInstance(function3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function25 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m8999invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:92:0x022c  */
                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MeasureResult m8999invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        Object obj;
                        Object obj2;
                        final FabPlacement fabPlacement;
                        Object obj3;
                        final Integer numValueOf;
                        final int i4;
                        int iIntValue;
                        int iIntValue2;
                        int iMo7868roundToPx0680j_4;
                        int height;
                        Object obj4;
                        Object obj5;
                        int iMo7868roundToPx0680j_42;
                        int iMo7868roundToPx0680j_43;
                        int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
                        final int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
                        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        final ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            arrayList.add(listSubcompose.get(i5).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                int i6 = 1;
                                while (true) {
                                    Object obj6 = arrayList.get(i6);
                                    int height3 = ((Placeable) obj6).getHeight();
                                    if (height2 < height3) {
                                        obj = obj6;
                                        height2 = height3;
                                    }
                                    if (i6 == lastIndex) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height4 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets2 = windowInsets;
                        final ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            arrayList2.add(listSubcompose2.get(i7).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(jM13613copyZbe2FdA$default, (-windowInsets2.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope))));
                        }
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex2) {
                                Object obj7 = obj2;
                                int i8 = height5;
                                int i9 = 1;
                                while (true) {
                                    Object obj8 = arrayList2.get(i9);
                                    int height6 = ((Placeable) obj8).getHeight();
                                    if (i8 < height6) {
                                        obj7 = obj8;
                                        i8 = height6;
                                    }
                                    if (i9 == lastIndex2) {
                                        break;
                                    }
                                    i9++;
                                }
                                obj2 = obj7;
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function23);
                        WindowInsets windowInsets3 = windowInsets;
                        final ArrayList arrayList3 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        int i10 = 0;
                        while (i10 < size3) {
                            arrayList3.add(listSubcompose3.get(i10).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(jM13613copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope))));
                            i10++;
                            windowInsets3 = windowInsets3;
                            listSubcompose3 = listSubcompose3;
                        }
                        if (!arrayList3.isEmpty()) {
                            if (arrayList3.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList3.get(0);
                                int width = ((Placeable) obj4).getWidth();
                                int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex3) {
                                    int i11 = width;
                                    int i12 = 1;
                                    while (true) {
                                        Object obj9 = arrayList3.get(i12);
                                        int width2 = ((Placeable) obj9).getWidth();
                                        if (i11 < width2) {
                                            obj4 = obj9;
                                            i11 = width2;
                                        }
                                        if (i12 == lastIndex3) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            }
                            Placeable placeable3 = (Placeable) obj4;
                            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                            if (arrayList3.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList3.get(0);
                                int height8 = ((Placeable) obj5).getHeight();
                                int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                if (1 <= lastIndex4) {
                                    Object obj10 = obj5;
                                    int i13 = height8;
                                    int i14 = 1;
                                    while (true) {
                                        Object obj11 = arrayList3.get(i14);
                                        int height9 = ((Placeable) obj11).getHeight();
                                        if (i13 < height9) {
                                            obj10 = obj11;
                                            i13 = height9;
                                        }
                                        if (i14 == lastIndex4) {
                                            break;
                                        }
                                        i14++;
                                    }
                                    obj5 = obj10;
                                }
                            }
                            Placeable placeable4 = (Placeable) obj5;
                            int height10 = placeable4 != null ? placeable4.getHeight() : 0;
                            if (width3 != 0 && height10 != 0) {
                                int i15 = i;
                                FabPosition.Companion companion = FabPosition.INSTANCE;
                                if (FabPosition.m8918equalsimpl0(i15, companion.m8924getStart5ygKITE())) {
                                    if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                        iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        fabPlacement = new FabPlacement(z, iMo7868roundToPx0680j_42, width3, height10);
                                    } else {
                                        iMo7868roundToPx0680j_43 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        iMo7868roundToPx0680j_42 = (iM13622getMaxWidthimpl - iMo7868roundToPx0680j_43) - width3;
                                        fabPlacement = new FabPlacement(z, iMo7868roundToPx0680j_42, width3, height10);
                                    }
                                } else {
                                    if (FabPosition.m8918equalsimpl0(i15, companion.m8923getEnd5ygKITE())) {
                                        if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                            iMo7868roundToPx0680j_43 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                            iMo7868roundToPx0680j_42 = (iM13622getMaxWidthimpl - iMo7868roundToPx0680j_43) - width3;
                                        } else {
                                            iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        }
                                    } else {
                                        iMo7868roundToPx0680j_42 = (iM13622getMaxWidthimpl - width3) / 2;
                                    }
                                    fabPlacement = new FabPlacement(z, iMo7868roundToPx0680j_42, width3, height10);
                                }
                            }
                        } else {
                            fabPlacement = null;
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function26 = function24;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-1617485343, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bottomBarPlaceables$1
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
                            public final void invoke(@Nullable Composer composer3, int i16) {
                                if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1617485343, i16, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:535)");
                                    }
                                    CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(fabPlacement), function26, composer3, ProvidedValue.$stable);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }));
                        final ArrayList arrayList4 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i16 = 0; i16 < size4; i16++) {
                            arrayList4.add(listSubcompose4.get(i16).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        if (arrayList4.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int height11 = ((Placeable) obj3).getHeight();
                            int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex5) {
                                int i17 = 1;
                                while (true) {
                                    Object obj12 = arrayList4.get(i17);
                                    int height12 = ((Placeable) obj12).getHeight();
                                    if (height11 < height12) {
                                        height11 = height12;
                                        obj3 = obj12;
                                    }
                                    if (i17 == lastIndex5) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                        }
                        Placeable placeable5 = (Placeable) obj3;
                        Integer numValueOf2 = placeable5 != null ? Integer.valueOf(placeable5.getHeight()) : null;
                        if (fabPlacement != null) {
                            WindowInsets windowInsets4 = windowInsets;
                            boolean z2 = z;
                            if (numValueOf2 == null) {
                                height = fabPlacement.getHeight() + subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets4.getBottom(subcomposeMeasureScope);
                            } else {
                                if (z2) {
                                    iIntValue2 = numValueOf2.intValue();
                                    iMo7868roundToPx0680j_4 = fabPlacement.getHeight() / 2;
                                } else {
                                    iIntValue2 = numValueOf2.intValue() + fabPlacement.getHeight();
                                    iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                height = iMo7868roundToPx0680j_4 + iIntValue2;
                            }
                            numValueOf = Integer.valueOf(height);
                        } else {
                            numValueOf = null;
                        }
                        if (height7 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : windowInsets.getBottom(subcomposeMeasureScope);
                            }
                            i4 = height7 + iIntValue;
                        } else {
                            i4 = 0;
                        }
                        int i18 = iM13621getMaxHeightimpl - height4;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets5 = windowInsets;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        final Integer num = numValueOf2;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-914494158, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                invoke(composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i19) {
                                float fM13666constructorimpl;
                                float bottom;
                                Integer num2;
                                if ((i19 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-914494158, i19, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:569)");
                                    }
                                    PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope);
                                    if (arrayList.isEmpty()) {
                                        fM13666constructorimpl = paddingValuesAsPaddingValues.getTop();
                                    } else {
                                        fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                    }
                                    if (arrayList4.isEmpty() || (num2 = num) == null) {
                                        bottom = paddingValuesAsPaddingValues.getBottom();
                                    } else {
                                        bottom = subcomposeMeasureScope.mo7871toDpu2uoSUM(num2.intValue());
                                    }
                                    function32.invoke(PaddingKt.m8119PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), fM13666constructorimpl, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), bottom), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i19 = 0; i19 < size5; i19++) {
                            arrayList5.add(listSubcompose5.get(i19).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(jM13613copyZbe2FdA$default, 0, 0, 0, i18, 7, null)));
                        }
                        final Integer num2 = numValueOf2;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, iM13621getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1.1
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
                                List<Placeable> list = arrayList5;
                                int i20 = height4;
                                int size6 = list.size();
                                for (int i21 = 0; i21 < size6; i21++) {
                                    Placeable.PlacementScope.place$default(placementScope, list.get(i21), 0, i20, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList;
                                int size7 = list2.size();
                                for (int i22 = 0; i22 < size7; i22++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i22), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList2;
                                int i23 = iM13621getMaxHeightimpl;
                                int i24 = i4;
                                int size8 = list3.size();
                                for (int i25 = 0; i25 < size8; i25++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i25), 0, i23 - i24, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList4;
                                int i26 = iM13621getMaxHeightimpl;
                                Integer num3 = num2;
                                int size9 = list4.size();
                                for (int i27 = 0; i27 < size9; i27++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i27), 0, i26 - (num3 != null ? num3.intValue() : 0), 0.0f, 4, null);
                                }
                                List<Placeable> list5 = arrayList3;
                                FabPlacement fabPlacement3 = fabPlacement2;
                                int i28 = iM13621getMaxHeightimpl;
                                Integer num4 = numValueOf;
                                int size10 = list5.size();
                                for (int i29 = 0; i29 < size10; i29++) {
                                    Placeable.PlacementScope.place$default(placementScope, list5.get(i29), fabPlacement3 != null ? fabPlacement3.getLeft() : 0, i28 - (num4 != null ? num4.intValue() : 0), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(function25);
                objRememberedValue = function25;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$2
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

                public final void invoke(@Nullable Composer composer3, int i4) {
                    ScaffoldKt.m8994ScaffoldLayoutWithMeasureFixi1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @Composable
    @UiComposable
    /* renamed from: LegacyScaffoldLayout-i1QSOvI */
    public static final void m8990LegacyScaffoldLayouti1QSOvI(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(141059468);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141059468, i3, -1, "androidx.compose.material.LegacyScaffoldLayout (Scaffold.kt:627)");
            }
            composerStartRestartGroup.startReplaceableGroup(188877366);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(function2) | composerStartRestartGroup.changedInstance(function22) | composerStartRestartGroup.changed(windowInsets) | composerStartRestartGroup.changedInstance(function23) | composerStartRestartGroup.changed(i) | composerStartRestartGroup.changed(z) | composerStartRestartGroup.changedInstance(function24) | composerStartRestartGroup.changedInstance(function3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function25 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m8998invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m8998invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
                        final int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
                        final long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function26 = function2;
                        final Function2<Composer, Integer, Unit> function27 = function22;
                        final Function2<Composer, Integer, Unit> function28 = function23;
                        final int i4 = i;
                        final boolean z2 = z;
                        final WindowInsets windowInsets2 = windowInsets;
                        final Function2<Composer, Integer, Unit> function29 = function24;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, iM13621getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1.1
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

                            /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                Object obj;
                                Object obj2;
                                final FabPlacement fabPlacement;
                                int i5;
                                Object obj3;
                                Integer numValueOf;
                                int i6;
                                int iIntValue;
                                int iIntValue2;
                                Object obj4;
                                Object obj5;
                                int iMo7868roundToPx0680j_4;
                                int i7;
                                int iMo7868roundToPx0680j_42;
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function26);
                                long j2 = jM13613copyZbe2FdA$default;
                                final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    arrayList.add(listSubcompose.get(i8).mo12610measureBRTryo0(j2));
                                }
                                if (arrayList.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = arrayList.get(0);
                                    int height = ((Placeable) obj).getHeight();
                                    int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                    if (1 <= lastIndex) {
                                        int i9 = 1;
                                        while (true) {
                                            Object obj6 = arrayList.get(i9);
                                            int height2 = ((Placeable) obj6).getHeight();
                                            if (height < height2) {
                                                obj = obj6;
                                                height = height2;
                                            }
                                            if (i9 == lastIndex) {
                                                break;
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable = (Placeable) obj;
                                int height3 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function27);
                                WindowInsets windowInsets3 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                long j3 = jM13613copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                                int size2 = listSubcompose2.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    arrayList2.add(listSubcompose2.get(i10).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(j3, (-windowInsets3.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope2))));
                                }
                                if (arrayList2.isEmpty()) {
                                    obj2 = null;
                                } else {
                                    obj2 = arrayList2.get(0);
                                    int height4 = ((Placeable) obj2).getHeight();
                                    int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex2) {
                                        int i11 = 1;
                                        while (true) {
                                            Object obj7 = arrayList2.get(i11);
                                            int height5 = ((Placeable) obj7).getHeight();
                                            if (height4 < height5) {
                                                obj2 = obj7;
                                                height4 = height5;
                                            }
                                            if (i11 == lastIndex2) {
                                                break;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable2 = (Placeable) obj2;
                                int height6 = placeable2 != null ? placeable2.getHeight() : 0;
                                List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function28);
                                WindowInsets windowInsets4 = windowInsets2;
                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                long j4 = jM13613copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList(listSubcompose3.size());
                                int size3 = listSubcompose3.size();
                                int i12 = 0;
                                while (i12 < size3) {
                                    arrayList3.add(listSubcompose3.get(i12).mo12610measureBRTryo0(ConstraintsKt.m13638offsetNN6EwU(j4, (-windowInsets4.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope3.getLayoutDirection())) - windowInsets4.getRight(subcomposeMeasureScope3, subcomposeMeasureScope3.getLayoutDirection()), -windowInsets4.getBottom(subcomposeMeasureScope3))));
                                    i12++;
                                    windowInsets4 = windowInsets4;
                                    listSubcompose3 = listSubcompose3;
                                }
                                if (!arrayList3.isEmpty()) {
                                    if (arrayList3.isEmpty()) {
                                        obj4 = null;
                                    } else {
                                        obj4 = arrayList3.get(0);
                                        int width = ((Placeable) obj4).getWidth();
                                        int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex3) {
                                            int i13 = 1;
                                            while (true) {
                                                Object obj8 = arrayList3.get(i13);
                                                int width2 = ((Placeable) obj8).getWidth();
                                                if (width < width2) {
                                                    obj4 = obj8;
                                                    width = width2;
                                                }
                                                if (i13 == lastIndex3) {
                                                    break;
                                                } else {
                                                    i13++;
                                                }
                                            }
                                        }
                                    }
                                    Placeable placeable3 = (Placeable) obj4;
                                    int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                                    if (arrayList3.isEmpty()) {
                                        obj5 = null;
                                    } else {
                                        obj5 = arrayList3.get(0);
                                        int height7 = ((Placeable) obj5).getHeight();
                                        int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex4) {
                                            int i14 = 1;
                                            while (true) {
                                                Object obj9 = arrayList3.get(i14);
                                                int height8 = ((Placeable) obj9).getHeight();
                                                if (height7 < height8) {
                                                    obj5 = obj9;
                                                    height7 = height8;
                                                }
                                                if (i14 == lastIndex4) {
                                                    break;
                                                } else {
                                                    i14++;
                                                }
                                            }
                                        }
                                    }
                                    Placeable placeable4 = (Placeable) obj5;
                                    int height9 = placeable4 != null ? placeable4.getHeight() : 0;
                                    if (width3 != 0 && height9 != 0) {
                                        int i15 = i4;
                                        FabPosition.Companion companion = FabPosition.INSTANCE;
                                        if (FabPosition.m8918equalsimpl0(i15, companion.m8924getStart5ygKITE())) {
                                            if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                                iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                                fabPlacement = new FabPlacement(z2, iMo7868roundToPx0680j_4, width3, height9);
                                            } else {
                                                i7 = iM13622getMaxWidthimpl;
                                                iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                                iMo7868roundToPx0680j_4 = (i7 - iMo7868roundToPx0680j_42) - width3;
                                                fabPlacement = new FabPlacement(z2, iMo7868roundToPx0680j_4, width3, height9);
                                            }
                                        } else {
                                            if (FabPosition.m8918equalsimpl0(i15, companion.m8923getEnd5ygKITE())) {
                                                if (subcomposeMeasureScope.getLayoutDirection() != LayoutDirection.Ltr) {
                                                    iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                                } else {
                                                    i7 = iM13622getMaxWidthimpl;
                                                    iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                                    iMo7868roundToPx0680j_4 = (i7 - iMo7868roundToPx0680j_42) - width3;
                                                }
                                            } else {
                                                iMo7868roundToPx0680j_4 = (iM13622getMaxWidthimpl - width3) / 2;
                                            }
                                            fabPlacement = new FabPlacement(z2, iMo7868roundToPx0680j_4, width3, height9);
                                        }
                                    }
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2<Composer, Integer, Unit> function210 = function29;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope4.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-252607998, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1$1$bottomBarPlaceables$1
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
                                    public final void invoke(@Nullable Composer composer3, int i16) {
                                        if ((i16 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-252607998, i16, -1, "androidx.compose.material.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:714)");
                                            }
                                            CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(fabPlacement), function210, composer3, ProvidedValue.$stable);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }));
                                long j5 = jM13613copyZbe2FdA$default;
                                final ArrayList arrayList4 = new ArrayList(listSubcompose4.size());
                                int size4 = listSubcompose4.size();
                                for (int i16 = 0; i16 < size4; i16++) {
                                    arrayList4.add(listSubcompose4.get(i16).mo12610measureBRTryo0(j5));
                                }
                                if (arrayList4.isEmpty()) {
                                    obj3 = null;
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                    obj3 = arrayList4.get(0);
                                    int height10 = ((Placeable) obj3).getHeight();
                                    int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                                    if (1 <= lastIndex5) {
                                        int i17 = height10;
                                        int i18 = 1;
                                        while (true) {
                                            Object obj10 = arrayList4.get(i18);
                                            int height11 = ((Placeable) obj10).getHeight();
                                            if (i17 < height11) {
                                                obj3 = obj10;
                                                i17 = height11;
                                            }
                                            if (i18 == lastIndex5) {
                                                break;
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                Placeable placeable5 = (Placeable) obj3;
                                Integer numValueOf2 = placeable5 != null ? Integer.valueOf(placeable5.getHeight()) : null;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope5 = subcomposeMeasureScope;
                                    WindowInsets windowInsets5 = windowInsets2;
                                    boolean z3 = z2;
                                    if (numValueOf2 == null) {
                                        iIntValue2 = fabPlacement.getHeight() + subcomposeMeasureScope5.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing) + windowInsets5.getBottom(subcomposeMeasureScope5);
                                    } else if (!z3) {
                                        iIntValue2 = numValueOf2.intValue() + fabPlacement.getHeight() + subcomposeMeasureScope5.mo7868roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    } else {
                                        iIntValue2 = numValueOf2.intValue() + (fabPlacement.getHeight() / 2);
                                    }
                                    numValueOf = Integer.valueOf(iIntValue2);
                                } else {
                                    numValueOf = null;
                                }
                                if (height6 != 0) {
                                    if (numValueOf != null) {
                                        iIntValue = numValueOf.intValue();
                                    } else {
                                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : windowInsets2.getBottom(subcomposeMeasureScope);
                                    }
                                    i6 = height6 + iIntValue;
                                } else {
                                    i6 = i5;
                                }
                                int i19 = iM13621getMaxHeightimpl - height3;
                                final SubcomposeMeasureScope subcomposeMeasureScope6 = subcomposeMeasureScope;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final WindowInsets windowInsets6 = windowInsets2;
                                final Function3<PaddingValues, Composer, Integer, Unit> function33 = function32;
                                FabPlacement fabPlacement2 = fabPlacement;
                                final Integer num = numValueOf2;
                                ArrayList arrayList5 = arrayList3;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope6.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(230985361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1$1$bodyContentPlaceables$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                        invoke(composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i20) {
                                        float fM13666constructorimpl;
                                        float bottom;
                                        Integer num2;
                                        if ((i20 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(230985361, i20, -1, "androidx.compose.material.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:748)");
                                            }
                                            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets6, subcomposeMeasureScope6);
                                            if (arrayList.isEmpty()) {
                                                fM13666constructorimpl = paddingValuesAsPaddingValues.getTop();
                                            } else {
                                                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                                            }
                                            if (arrayList4.isEmpty() || (num2 = num) == null) {
                                                bottom = paddingValuesAsPaddingValues.getBottom();
                                            } else {
                                                bottom = subcomposeMeasureScope6.mo7871toDpu2uoSUM(num2.intValue());
                                            }
                                            function33.invoke(PaddingKt.m8119PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope6.getLayoutDirection()), fM13666constructorimpl, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope6.getLayoutDirection()), bottom), composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }));
                                long j6 = jM13613copyZbe2FdA$default;
                                ArrayList arrayList6 = new ArrayList(listSubcompose5.size());
                                int size5 = listSubcompose5.size();
                                for (int i20 = 0; i20 < size5; i20++) {
                                    arrayList6.add(listSubcompose5.get(i20).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j6, 0, 0, 0, i19, 7, null)));
                                }
                                int size6 = arrayList6.size();
                                for (int i21 = 0; i21 < size6; i21++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList6.get(i21), 0, height3, 0.0f, 4, null);
                                }
                                int size7 = arrayList.size();
                                for (int i22 = 0; i22 < size7; i22++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList.get(i22), 0, 0, 0.0f, 4, null);
                                }
                                int i23 = iM13621getMaxHeightimpl;
                                int size8 = arrayList2.size();
                                for (int i24 = 0; i24 < size8; i24++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList2.get(i24), 0, i23 - i6, 0.0f, 4, null);
                                }
                                int i25 = iM13621getMaxHeightimpl;
                                int size9 = arrayList4.size();
                                for (int i26 = 0; i26 < size9; i26++) {
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList4.get(i26), 0, i25 - (numValueOf2 != null ? numValueOf2.intValue() : 0), 0.0f, 4, null);
                                }
                                int i27 = iM13621getMaxHeightimpl;
                                int size10 = arrayList5.size();
                                int i28 = 0;
                                while (i28 < size10) {
                                    ArrayList arrayList7 = arrayList5;
                                    Placeable.PlacementScope.place$default(placementScope, (Placeable) arrayList7.get(i28), fabPlacement2 != null ? fabPlacement2.getLeft() : 0, i27 - (numValueOf != null ? numValueOf.intValue() : 0), 0.0f, 4, null);
                                    i28++;
                                    arrayList5 = arrayList7;
                                }
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(function25);
                objRememberedValue = function25;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$2
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

                public final void invoke(@Nullable Composer composer3, int i4) {
                    ScaffoldKt.m8990LegacyScaffoldLayouti1QSOvI(z, i, function2, function3, function22, function23, windowInsets, function24, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
