package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(m7104d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u008a\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aÀ\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052&\u0010#\u001a\"\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052&\u0010'\u001a\"\u0012\u0013\u0012\u00110(¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00162\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a¶\u0001\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020-2'\u00102\u001a#\u0012\u0013\u0012\u001103¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(4\u0012\n\u0012\b\u0012\u0004\u0012\u000206050\u00032\u0006\u00107\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0003ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a!\u0010>\u001a\u00020\n2\b\b\u0002\u0010?\u001a\u00020-2\b\b\u0002\u0010@\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010A\u001a7\u0010B\u001a\u00020-2\b\b\u0002\u0010C\u001a\u0002062\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0002\u0010E\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, m7105d2 = {"BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material3/BottomSheetScaffoldState;", "sheetPeekHeight", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetContainerColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "sheetDragHandle", "Lkotlin/Function0;", "sheetSwipeEnabled", "", "topBar", "snackbarHost", "Landroidx/compose/material3/SnackbarHostState;", "containerColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-sdMYb0k", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffoldLayout", "body", "Lkotlin/ParameterName;", "name", "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "", "sheetState", "Landroidx/compose/material3/SheetState;", "BottomSheetScaffoldLayout-PxNyym8", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "StandardBottomSheet", "state", "calculateAnchors", "Landroidx/compose/ui/unit/IntSize;", "sheetSize", "Landroidx/compose/material3/DraggableAnchors;", "Landroidx/compose/material3/SheetValue;", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-XcniZvE", "(Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function1;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rememberBottomSheetScaffoldState", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "rememberStandardBottomSheetState", "initialValue", "confirmValueChange", "skipHiddenState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,386:1\n74#2:387\n74#2:433\n1116#3,6:388\n1116#3,6:394\n1116#3,6:400\n1116#3,3:411\n1119#3,3:417\n1116#3,6:421\n1116#3,6:427\n1116#3,6:434\n1116#3,6:440\n487#4,4:406\n491#4,2:414\n495#4:420\n25#5:410\n487#6:416\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n120#1:387\n335#1:433\n131#1:388,6\n191#1:394,6\n193#1:400,6\n233#1:411,3\n233#1:417,3\n243#1:421,6\n256#1:427,6\n336#1:434,6\n339#1:440,6\n233#1:406,4\n233#1:414,2\n233#1:420\n233#1:410\n233#1:416\n*E\n"})
/* loaded from: classes3.dex */
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9150BottomSheetScaffoldsdMYb0k(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, @Nullable Shape shape, long j, long j2, float f3, float f4, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, long j3, long j4, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
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
        BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
        float fM9148getSheetMaxWidthD9Ej5fM;
        Modifier modifier2;
        int i15;
        Shape expandedShape;
        int i16;
        long containerColor;
        long jM9292contentColorForek8zF_U;
        float fM9147getElevationD9Ej5fM;
        float f5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        long surface;
        long jM9292contentColorForek8zF_U2;
        long j5;
        int i17;
        int i18;
        final BottomSheetScaffoldState bottomSheetScaffoldState2;
        float f6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z2;
        float f7;
        boolean z3;
        Object objRememberedValue;
        final BottomSheetScaffoldState bottomSheetScaffoldState3;
        final float f8;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35;
        final float f9;
        final Shape shape2;
        final float f10;
        final Modifier modifier3;
        final long j6;
        final long j7;
        final long j8;
        final float f11;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1523924135);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(bottomSheetScaffoldState)) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                int i20 = 8192;
                if (i6 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                    }
                    if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(shape)) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(j)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        i7 = i5;
                        i4 |= ((i3 & 128) == 0 && composerStartRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    } else {
                        i7 = i5;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(f3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changed(f4) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i11 = i2 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i11 |= composerStartRestartGroup.changed(z) ? 32 : 16;
                    }
                    int i21 = i11;
                    i13 = i3 & 4096;
                    if (i13 == 0) {
                        i21 |= 384;
                    } else {
                        if ((i2 & 384) == 0) {
                            i21 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
                        }
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i21 |= 3072;
                        } else {
                            if ((i2 & 3072) == 0) {
                                i21 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
                            }
                            if ((i2 & CpioConstants.C_ISBLK) == 0) {
                                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(j3)) {
                                    i20 = 16384;
                                }
                                i21 |= i20;
                            }
                            if ((196608 & i2) == 0) {
                                i21 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
                            }
                            if ((i3 & 65536) != 0) {
                                if ((i2 & 1572864) == 0) {
                                    i21 |= composerStartRestartGroup.changedInstance(function33) ? 1048576 : 524288;
                                }
                                if ((i4 & 306783379) != 306783378 || (599187 & i21) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier4 = i19 == 0 ? Modifier.INSTANCE : modifier;
                                        if ((i3 & 4) == 0) {
                                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                            i4 &= -897;
                                        } else {
                                            bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                                        }
                                        float fM9149getSheetPeekHeightD9Ej5fM = i7 == 0 ? BottomSheetDefaults.INSTANCE.m9149getSheetPeekHeightD9Ej5fM() : f;
                                        fM9148getSheetMaxWidthD9Ej5fM = i6 == 0 ? BottomSheetDefaults.INSTANCE.m9148getSheetMaxWidthD9Ej5fM() : f2;
                                        if ((i3 & 32) == 0) {
                                            modifier2 = modifier4;
                                            i15 = 6;
                                            expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                            i4 &= -458753;
                                        } else {
                                            modifier2 = modifier4;
                                            i15 = 6;
                                            expandedShape = shape;
                                        }
                                        BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                        if ((i3 & 64) == 0) {
                                            i16 = i4 & (-3670017);
                                            containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i15);
                                        } else {
                                            i16 = i4;
                                            containerColor = j;
                                        }
                                        float f12 = fM9149getSheetPeekHeightD9Ej5fM;
                                        if ((i3 & 128) == 0) {
                                            jM9292contentColorForek8zF_U = ColorSchemeKt.m9292contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i16 >> 18) & 14);
                                            i16 &= -29360129;
                                        } else {
                                            jM9292contentColorForek8zF_U = j2;
                                        }
                                        fM9147getElevationD9Ej5fM = i8 == 0 ? BottomSheetDefaults.INSTANCE.m9147getElevationD9Ej5fM() : f3;
                                        float fM9147getElevationD9Ej5fM2 = i9 == 0 ? BottomSheetDefaults.INSTANCE.m9147getElevationD9Ej5fM() : f4;
                                        Function2<? super Composer, ? super Integer, Unit> function2M9314getLambda1$material3_release = i10 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m9314getLambda1$material3_release() : function2;
                                        boolean z5 = i12 == 0 ? true : z;
                                        Function2<? super Composer, ? super Integer, Unit> function28 = i13 == 0 ? null : function22;
                                        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M9315getLambda2$material3_release = i14 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m9315getLambda2$material3_release() : function32;
                                        if ((i3 & 16384) == 0) {
                                            f5 = fM9147getElevationD9Ej5fM2;
                                            i21 &= -57345;
                                            function23 = function2M9314getLambda1$material3_release;
                                            surface = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).getSurface();
                                        } else {
                                            f5 = fM9147getElevationD9Ej5fM2;
                                            function23 = function2M9314getLambda1$material3_release;
                                            surface = j3;
                                        }
                                        if ((i3 & 32768) == 0) {
                                            i17 = i21 & (-458753);
                                            i18 = i16;
                                            jM9292contentColorForek8zF_U2 = ColorSchemeKt.m9292contentColorForek8zF_U(surface, composerStartRestartGroup, (i21 >> 12) & 14);
                                            function24 = function23;
                                            j5 = surface;
                                            function34 = function3M9315getLambda2$material3_release;
                                            bottomSheetScaffoldState2 = bottomSheetScaffoldState4;
                                            f6 = f12;
                                        } else {
                                            jM9292contentColorForek8zF_U2 = j4;
                                            j5 = surface;
                                            i17 = i21;
                                            i18 = i16;
                                            bottomSheetScaffoldState2 = bottomSheetScaffoldState4;
                                            f6 = f12;
                                            function24 = function23;
                                            function34 = function3M9315getLambda2$material3_release;
                                        }
                                        function25 = function28;
                                        z2 = z5;
                                        f7 = f5;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 4) != 0) {
                                            i4 &= -897;
                                        }
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        if ((i3 & 16384) != 0) {
                                            i21 &= -57345;
                                        }
                                        if ((i3 & 32768) != 0) {
                                            i21 &= -458753;
                                        }
                                        modifier2 = modifier;
                                        bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                                        f6 = f;
                                        fM9148getSheetMaxWidthD9Ej5fM = f2;
                                        expandedShape = shape;
                                        jM9292contentColorForek8zF_U = j2;
                                        fM9147getElevationD9Ej5fM = f3;
                                        f7 = f4;
                                        z2 = z;
                                        function25 = function22;
                                        function34 = function32;
                                        j5 = j3;
                                        jM9292contentColorForek8zF_U2 = j4;
                                        i18 = i4;
                                        i17 = i21;
                                        containerColor = j;
                                        function24 = function2;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1523924135, i18, i17, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:118)");
                                    }
                                    final int iMo7868roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7868roundToPx0680j_4(f6);
                                    SheetState bottomSheetState = bottomSheetScaffoldState2.getBottomSheetState();
                                    final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState2;
                                    final float f13 = f6;
                                    final float f14 = fM9148getSheetMaxWidthD9Ej5fM;
                                    final boolean z6 = z2;
                                    final Shape shape3 = expandedShape;
                                    final long j10 = containerColor;
                                    final long j11 = jM9292contentColorForek8zF_U;
                                    final float f15 = fM9147getElevationD9Ej5fM;
                                    final float f16 = f7;
                                    final Function2<? super Composer, ? super Integer, Unit> function29 = function24;
                                    float f17 = f7;
                                    z3 = true;
                                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -680109608, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer2, Integer num2) {
                                            invoke(num.intValue(), composer2, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(final int i22, @Nullable Composer composer2, int i23) {
                                            int i24;
                                            if ((i23 & 6) == 0) {
                                                i24 = i23 | (composer2.changed(i22) ? 4 : 2);
                                            } else {
                                                i24 = i23;
                                            }
                                            if ((i24 & 19) != 18 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-680109608, i24, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:135)");
                                                }
                                                SheetState bottomSheetState2 = bottomSheetScaffoldState5.getBottomSheetState();
                                                composer2.startReplaceableGroup(1237684821);
                                                boolean zChanged = ((i24 & 14) == 4) | composer2.changed(bottomSheetScaffoldState5) | composer2.changed(iMo7868roundToPx0680j_4);
                                                final BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState5;
                                                final int i25 = iMo7868roundToPx0680j_4;
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function1<IntSize, DraggableAnchors<SheetValue>>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ DraggableAnchors<SheetValue> invoke(IntSize intSize) {
                                                            return m9155invokeozmzZPI(intSize.getPackedValue());
                                                        }

                                                        @NotNull
                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                        public final DraggableAnchors<SheetValue> m9155invokeozmzZPI(long j12) {
                                                            final int iM13835getHeightimpl = IntSize.m13835getHeightimpl(j12);
                                                            final BottomSheetScaffoldState bottomSheetScaffoldState7 = bottomSheetScaffoldState6;
                                                            final int i26 = i22;
                                                            final int i27 = i25;
                                                            return AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                                    invoke2(draggableAnchorsConfig);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(@NotNull DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                                    if (!bottomSheetScaffoldState7.getBottomSheetState().getSkipPartiallyExpanded()) {
                                                                        draggableAnchorsConfig.m96at(SheetValue.PartiallyExpanded, i26 - i27);
                                                                    }
                                                                    if (iM13835getHeightimpl != i27) {
                                                                        draggableAnchorsConfig.m96at(SheetValue.Expanded, Math.max(i26 - r0, 0));
                                                                    }
                                                                    if (bottomSheetScaffoldState7.getBottomSheetState().getSkipHiddenState()) {
                                                                        return;
                                                                    }
                                                                    draggableAnchorsConfig.m96at(SheetValue.Hidden, i26);
                                                                }
                                                            });
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer2.endReplaceableGroup();
                                                BottomSheetScaffoldKt.m9152StandardBottomSheetXcniZvE(bottomSheetState2, (Function1) objRememberedValue2, f13, f14, z6, shape3, j10, j11, f15, f16, function29, function3, composer2, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    });
                                    long j12 = containerColor;
                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 88659390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2
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
                                        public final void invoke(@Nullable Composer composer2, int i22) {
                                            if ((i22 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(88659390, i22, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:127)");
                                            }
                                            function34.invoke(bottomSheetScaffoldState2.getSnackbarHostState(), composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    composerStartRestartGroup.startReplaceableGroup(-1567544379);
                                    if ((((i18 & 896) ^ 384) > 256 || !composerStartRestartGroup.changed(bottomSheetScaffoldState2)) && (i18 & 384) != 256) {
                                        z3 = false;
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Float invoke() {
                                                return Float.valueOf(bottomSheetScaffoldState2.getBottomSheetState().requireOffset());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i22 = ((i18 >> 3) & 14) | 27648 | ((i17 >> 3) & 112) | ((i17 >> 12) & 896) | ((i18 << 6) & 458752);
                                    int i23 = i17 << 12;
                                    m9151BottomSheetScaffoldLayoutPxNyym8(modifier2, function25, function33, composableLambda, composableLambda2, f6, function0, bottomSheetState, j5, jM9292contentColorForek8zF_U2, composerStartRestartGroup, i22 | (234881024 & i23) | (i23 & 1879048192));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                    f8 = f6;
                                    function26 = function24;
                                    z4 = z2;
                                    function27 = function25;
                                    function35 = function34;
                                    f9 = fM9147getElevationD9Ej5fM;
                                    shape2 = expandedShape;
                                    f10 = fM9148getSheetMaxWidthD9Ej5fM;
                                    modifier3 = modifier2;
                                    j6 = jM9292contentColorForek8zF_U;
                                    j7 = j5;
                                    j8 = jM9292contentColorForek8zF_U2;
                                    f11 = f17;
                                    j9 = j12;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    bottomSheetScaffoldState3 = bottomSheetScaffoldState;
                                    f8 = f;
                                    f10 = f2;
                                    shape2 = shape;
                                    j9 = j;
                                    j6 = j2;
                                    f9 = f3;
                                    f11 = f4;
                                    function26 = function2;
                                    z4 = z;
                                    function27 = function22;
                                    function35 = function32;
                                    j7 = j3;
                                    j8 = j4;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4
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

                                        public final void invoke(@Nullable Composer composer2, int i24) {
                                            BottomSheetScaffoldKt.m9150BottomSheetScaffoldsdMYb0k(function3, modifier3, bottomSheetScaffoldState3, f8, f10, shape2, j9, j6, f9, f11, function26, z4, function27, function35, j7, j8, function33, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i21 |= 1572864;
                            if ((i4 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i19 == 0) {
                                    }
                                    if ((i3 & 4) == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if ((i3 & 32) == 0) {
                                    }
                                    BottomSheetScaffoldState bottomSheetScaffoldState42 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                    if ((i3 & 64) == 0) {
                                    }
                                    float f122 = fM9149getSheetPeekHeightD9Ej5fM;
                                    if ((i3 & 128) == 0) {
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
                                    if ((i3 & 16384) == 0) {
                                    }
                                    if ((i3 & 32768) == 0) {
                                    }
                                    function25 = function28;
                                    z2 = z5;
                                    f7 = f5;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    final int iMo7868roundToPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7868roundToPx0680j_4(f6);
                                    SheetState bottomSheetState2 = bottomSheetScaffoldState2.getBottomSheetState();
                                    final BottomSheetScaffoldState bottomSheetScaffoldState52 = bottomSheetScaffoldState2;
                                    final float f132 = f6;
                                    final float f142 = fM9148getSheetMaxWidthD9Ej5fM;
                                    final boolean z62 = z2;
                                    final Shape shape32 = expandedShape;
                                    final long j102 = containerColor;
                                    final long j112 = jM9292contentColorForek8zF_U;
                                    final float f152 = fM9147getElevationD9Ej5fM;
                                    final float f162 = f7;
                                    final Function2<? super Composer, ? super Integer, Unit> function292 = function24;
                                    float f172 = f7;
                                    z3 = true;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -680109608, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer2, Integer num2) {
                                            invoke(num.intValue(), composer2, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(final int i222, @Nullable Composer composer2, int i232) {
                                            int i24;
                                            if ((i232 & 6) == 0) {
                                                i24 = i232 | (composer2.changed(i222) ? 4 : 2);
                                            } else {
                                                i24 = i232;
                                            }
                                            if ((i24 & 19) != 18 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-680109608, i24, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:135)");
                                                }
                                                SheetState bottomSheetState22 = bottomSheetScaffoldState52.getBottomSheetState();
                                                composer2.startReplaceableGroup(1237684821);
                                                boolean zChanged = ((i24 & 14) == 4) | composer2.changed(bottomSheetScaffoldState52) | composer2.changed(iMo7868roundToPx0680j_42);
                                                final BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState52;
                                                final int i25 = iMo7868roundToPx0680j_42;
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function1<IntSize, DraggableAnchors<SheetValue>>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ DraggableAnchors<SheetValue> invoke(IntSize intSize) {
                                                            return m9155invokeozmzZPI(intSize.getPackedValue());
                                                        }

                                                        @NotNull
                                                        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                        public final DraggableAnchors<SheetValue> m9155invokeozmzZPI(long j122) {
                                                            final int iM13835getHeightimpl = IntSize.m13835getHeightimpl(j122);
                                                            final BottomSheetScaffoldState bottomSheetScaffoldState7 = bottomSheetScaffoldState6;
                                                            final int i26 = i222;
                                                            final int i27 = i25;
                                                            return AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                                    invoke2(draggableAnchorsConfig);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(@NotNull DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                                    if (!bottomSheetScaffoldState7.getBottomSheetState().getSkipPartiallyExpanded()) {
                                                                        draggableAnchorsConfig.m96at(SheetValue.PartiallyExpanded, i26 - i27);
                                                                    }
                                                                    if (iM13835getHeightimpl != i27) {
                                                                        draggableAnchorsConfig.m96at(SheetValue.Expanded, Math.max(i26 - r0, 0));
                                                                    }
                                                                    if (bottomSheetScaffoldState7.getBottomSheetState().getSkipHiddenState()) {
                                                                        return;
                                                                    }
                                                                    draggableAnchorsConfig.m96at(SheetValue.Hidden, i26);
                                                                }
                                                            });
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer2.endReplaceableGroup();
                                                BottomSheetScaffoldKt.m9152StandardBottomSheetXcniZvE(bottomSheetState22, (Function1) objRememberedValue2, f132, f142, z62, shape32, j102, j112, f152, f162, function292, function3, composer2, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    });
                                    long j122 = containerColor;
                                    ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 88659390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2
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
                                        public final void invoke(@Nullable Composer composer2, int i222) {
                                            if ((i222 & 3) == 2 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(88659390, i222, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:127)");
                                            }
                                            function34.invoke(bottomSheetScaffoldState2.getSnackbarHostState(), composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    composerStartRestartGroup.startReplaceableGroup(-1567544379);
                                    if (((i18 & 896) ^ 384) > 256) {
                                        z3 = false;
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z3) {
                                            objRememberedValue = new Function0<Float>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Float invoke() {
                                                    return Float.valueOf(bottomSheetScaffoldState2.getBottomSheetState().requireOffset());
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            Function0 function02 = (Function0) objRememberedValue;
                                            composerStartRestartGroup.endReplaceableGroup();
                                            int i222 = ((i18 >> 3) & 14) | 27648 | ((i17 >> 3) & 112) | ((i17 >> 12) & 896) | ((i18 << 6) & 458752);
                                            int i232 = i17 << 12;
                                            m9151BottomSheetScaffoldLayoutPxNyym8(modifier2, function25, function33, composableLambda3, composableLambda22, f6, function02, bottomSheetState2, j5, jM9292contentColorForek8zF_U2, composerStartRestartGroup, i222 | (234881024 & i232) | (i232 & 1879048192));
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                            f8 = f6;
                                            function26 = function24;
                                            z4 = z2;
                                            function27 = function25;
                                            function35 = function34;
                                            f9 = fM9147getElevationD9Ej5fM;
                                            shape2 = expandedShape;
                                            f10 = fM9148getSheetMaxWidthD9Ej5fM;
                                            modifier3 = modifier2;
                                            j6 = jM9292contentColorForek8zF_U;
                                            j7 = j5;
                                            j8 = jM9292contentColorForek8zF_U2;
                                            f11 = f172;
                                            j9 = j122;
                                        }
                                    } else {
                                        z3 = false;
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z3) {
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i2 & CpioConstants.C_ISBLK) == 0) {
                        }
                        if ((196608 & i2) == 0) {
                        }
                        if ((i3 & 65536) != 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    }
                    if ((196608 & i2) == 0) {
                    }
                    if ((i3 & 65536) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                int i212 = i11;
                i13 = i3 & 4096;
                if (i13 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                }
                if ((196608 & i2) == 0) {
                }
                if ((i3 & 65536) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            int i202 = 8192;
            if (i6 != 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            int i2122 = i11;
            i13 = i3 & 4096;
            if (i13 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i2 & CpioConstants.C_ISBLK) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((i3 & 65536) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        int i2022 = 8192;
        if (i6 != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        int i21222 = i11;
        i13 = i3 & 4096;
        if (i13 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((i3 & 65536) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable SheetState sheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1474606134);
        if ((i2 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(667326536);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:191)");
        }
        composer.startReplaceableGroup(667326610);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(sheetState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(snackbarHostState)) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberStandardBottomSheetState(@Nullable SheetValue sheetValue, @Nullable Function1<? super SheetValue, Boolean> function1, boolean z, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(678511581);
        if ((i2 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i2 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull SheetValue sheetValue3) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:214)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, function12, sheetValue2, z2, composer, (i & 112) | 6 | ((i << 6) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetStateRememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: StandardBottomSheet-XcniZvE, reason: not valid java name */
    public static final void m9152StandardBottomSheetXcniZvE(final SheetState sheetState, final Function1<? super IntSize, ? extends DraggableAnchors<SheetValue>> function1, final float f, final float f2, final boolean z, final Shape shape, final long j, final long j2, final float f3, final float f4, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(424459667);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(f3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(f4) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(424459667, i3, i5, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:231)");
            }
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Orientation orientation = Orientation.Vertical;
            Modifier modifierM8163requiredHeightInVpY3zN4$default = SizeKt.m8163requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m8179widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, f2, 1, null), 0.0f, 1, null), f, 0.0f, 2, null);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState.getAnchoredDraggableState$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1603483798);
            boolean zChanged = composerStartRestartGroup.changed(anchoredDraggableState$material3_release);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new Function1<Float, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                        invoke(f5.floatValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: BottomSheetScaffold.kt */
                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                    @DebugMetadata(m7119c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {247}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$1 */
                    /* loaded from: classes.dex */
                    public static final class C13351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ float $it;
                        public final /* synthetic */ SheetState $state;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C13351(SheetState sheetState, float f, Continuation<? super C13351> continuation) {
                            super(2, continuation);
                            this.$state = sheetState;
                            this.$it = f;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C13351(this.$state, this.$it, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C13351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                SheetState sheetState = this.$state;
                                float f = this.$it;
                                this.label = 1;
                                if (sheetState.settle$material3_release(f, this) == coroutine_suspended) {
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

                    public final void invoke(float f5) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C13351(sheetState, f5, null), 3, null);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(NestedScrollModifierKt.nestedScroll$default(modifierM8163requiredHeightInVpY3zN4$default, (NestedScrollConnection) objRememberedValue2, null, 2, null), sheetState.getAnchoredDraggableState$material3_release(), orientation, z, false, null, 24, null);
            composerStartRestartGroup.startReplaceableGroup(1603484353);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1

                    /* compiled from: BottomSheetScaffold.kt */
                    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                    /* loaded from: classes3.dex */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m9157invokeozmzZPI(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m9157invokeozmzZPI(long j3) {
                        SheetValue sheetValue;
                        DraggableAnchors<SheetValue> draggableAnchorsInvoke = function1.invoke(IntSize.m13828boximpl(j3));
                        int i6 = WhenMappings.$EnumSwitchMapping$0[sheetState.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                        if (i6 == 1 || i6 == 2) {
                            sheetValue = SheetValue.PartiallyExpanded;
                        } else {
                            if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            sheetValue = SheetValue.Expanded;
                            if (!draggableAnchorsInvoke.hasAnchorFor(sheetValue)) {
                                sheetValue = SheetValue.PartiallyExpanded;
                            }
                        }
                        sheetState.getAnchoredDraggableState$material3_release().updateAnchors(draggableAnchorsInvoke, sheetValue);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i6 = i3 >> 12;
            SurfaceKt.m9876SurfaceT9BRK9s(OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, (Function1) objRememberedValue3), shape, j, j2, f3, f4, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1070542936, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
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
                public final void invoke(@Nullable Composer composer2, int i7) {
                    if ((i7 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1070542936, i7, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:271)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function22 = function2;
                        final SheetState sheetState2 = sheetState;
                        final boolean z3 = z;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        composer2.startReplaceableGroup(-483455358);
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-176229282);
                        if (function22 != null) {
                            Strings.Companion companion5 = Strings.INSTANCE;
                            final String strM9866getStringNWtq28 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                            final String strM9866getStringNWtq282 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                            final String strM9866getStringNWtq283 = Strings_androidKt.m9866getStringNWtq28(Strings.m9797constructorimpl(C1551R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                            Modifier modifierAlign = columnScopeInstance.align(companion2, companion3.getCenterHorizontally());
                            composer2.startReplaceableGroup(-176228795);
                            boolean zChanged2 = composer2.changed(sheetState2) | composer2.changed(z3) | composer2.changed(strM9866getStringNWtq283) | composer2.changedInstance(coroutineScope2) | composer2.changed(strM9866getStringNWtq28) | composer2.changed(strM9866getStringNWtq282);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1
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
                                        final SheetState sheetState3 = sheetState2;
                                        boolean z4 = z3;
                                        String str = strM9866getStringNWtq283;
                                        String str2 = strM9866getStringNWtq28;
                                        String str3 = strM9866getStringNWtq282;
                                        final CoroutineScope coroutineScope3 = coroutineScope2;
                                        if (sheetState3.getAnchoredDraggableState$material3_release().getAnchors().getSize() <= 1 || !z4) {
                                            return;
                                        }
                                        SheetValue currentValue = sheetState3.getCurrentValue();
                                        SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                        if (currentValue == sheetValue) {
                                            if (sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* compiled from: BottomSheetScaffold.kt */
                                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                    @DebugMetadata(m7119c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {289}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1$1 */
                                                    /* loaded from: classes.dex */
                                                    public static final class C13361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        public final /* synthetic */ SheetState $this_with;
                                                        public int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        public C13361(SheetState sheetState, Continuation<? super C13361> continuation) {
                                                            super(2, continuation);
                                                            this.$this_with = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            return new C13361(this.$this_with, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        @Nullable
                                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                            return ((C13361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        @Nullable
                                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                SheetState sheetState = this.$this_with;
                                                                this.label = 1;
                                                                if (sheetState.expand(this) == coroutine_suspended) {
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
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C13361(sheetState3, null), 3, null);
                                                        return Boolean.TRUE;
                                                    }
                                                });
                                            }
                                        } else if (sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue).booleanValue()) {
                                            SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                @DebugMetadata(m7119c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {298}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2$1 */
                                                /* loaded from: classes.dex */
                                                public static final class C13371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ SheetState $this_with;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public C13371(SheetState sheetState, Continuation<? super C13371> continuation) {
                                                        super(2, continuation);
                                                        this.$this_with = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new C13371(this.$this_with, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    @Nullable
                                                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                        return ((C13371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @Nullable
                                                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            SheetState sheetState = this.$this_with;
                                                            this.label = 1;
                                                            if (sheetState.partialExpand(this) == coroutine_suspended) {
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
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C13371(sheetState3, null), 3, null);
                                                    return Boolean.TRUE;
                                                }
                                            });
                                        }
                                        if (sheetState3.getSkipHiddenState()) {
                                            return;
                                        }
                                        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* compiled from: BottomSheetScaffold.kt */
                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            @DebugMetadata(m7119c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {304}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3$1 */
                                            /* loaded from: classes.dex */
                                            public static final class C13381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ SheetState $this_with;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C13381(SheetState sheetState, Continuation<? super C13381> continuation) {
                                                    super(2, continuation);
                                                    this.$this_with = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C13381(this.$this_with, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C13381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        SheetState sheetState = this.$this_with;
                                                        this.label = 1;
                                                        if (sheetState.hide(this) == coroutine_suspended) {
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
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C13381(sheetState3, null), 3, null);
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (Function1) objRememberedValue4);
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierSemantics);
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
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function22.invoke(composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                        }
                        composer2.endReplaceableGroup();
                        function32.invoke(columnScopeInstance, composer2, 6);
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
            }), composerStartRestartGroup, (i6 & 112) | 12582912 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$4
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

                public final void invoke(@Nullable Composer composer2, int i7) {
                    BottomSheetScaffoldKt.m9152StandardBottomSheetXcniZvE(sheetState, function1, f, f2, z, shape, j, j2, f3, f4, function2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_]]")
    /* renamed from: BottomSheetScaffoldLayout-PxNyym8, reason: not valid java name */
    public static final void m9151BottomSheetScaffoldLayoutPxNyym8(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, final Function2<? super Composer, ? super Integer, Unit> function22, final float f, final Function0<Float> function0, final SheetState sheetState, final long j, final long j2, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1120561936);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function32) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120561936, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:332)");
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceableGroup(-99158096);
            int i4 = 29360128 & i2;
            boolean zChanged = (i4 == 8388608) | composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1
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
                        sheetState.setDensity$material3_release(density);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-99158030);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((234881024 & i2) == 67108864) | ((1879048192 & i2) == 536870912) | ((i2 & 896) == 256) | ((458752 & i2) == 131072) | ((57344 & i2) == 16384) | ((i2 & 3670016) == 1048576) | (i4 == 8388608);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i3 = 1;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function23 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m9156invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m9156invoke0kLqBqw(@NotNull SubcomposeMeasureScope subcomposeMeasureScope, long j3) {
                        final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j3);
                        final int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j3);
                        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j3, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final Function3<Integer, Composer, Integer, Unit> function33 = function32;
                        final Placeable placeableMo12610measureBRTryo0 = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(-1192048628, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$sheetPlaceable$1
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
                            public final void invoke(@Nullable Composer composer2, int i5) {
                                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1192048628, i5, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:344)");
                                }
                                function33.invoke(Integer.valueOf(iM13621getMaxHeightimpl), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })).get(0).mo12610measureBRTryo0(jM13613copyZbe2FdA$default);
                        final Function2<Composer, Integer, Unit> function24 = function2;
                        final Placeable placeableMo12610measureBRTryo02 = function24 != null ? subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(-873203005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$topBarPlaceable$1$1
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
                            public final void invoke(@Nullable Composer composer2, int i5) {
                                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-873203005, i5, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:348)");
                                }
                                function24.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })).get(0).mo12610measureBRTryo0(jM13613copyZbe2FdA$default) : null;
                        int height = placeableMo12610measureBRTryo02 != null ? placeableMo12610measureBRTryo02.getHeight() : 0;
                        long jM13613copyZbe2FdA$default2 = Constraints.m13613copyZbe2FdA$default(jM13613copyZbe2FdA$default, 0, 0, 0, iM13621getMaxHeightimpl - height, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final Modifier modifier2 = modifier;
                        final long j4 = j;
                        final long j5 = j2;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function3;
                        final float f2 = f;
                        final int i5 = height;
                        final Placeable placeableMo12610measureBRTryo03 = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(-1459220575, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$bodyPlaceable$1
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
                            public final void invoke(@Nullable Composer composer2, int i6) {
                                if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1459220575, i6, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:355)");
                                    }
                                    Modifier modifier3 = modifier2;
                                    long j6 = j4;
                                    long j7 = j5;
                                    final Function3<PaddingValues, Composer, Integer, Unit> function35 = function34;
                                    final float f3 = f2;
                                    SurfaceKt.m9876SurfaceT9BRK9s(modifier3, null, j6, j7, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, 1725620860, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$bodyPlaceable$1.1
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
                                        public final void invoke(@Nullable Composer composer3, int i7) {
                                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1725620860, i7, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:359)");
                                            }
                                            function35.invoke(PaddingKt.m8120PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f3, 7, null), composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), composer2, 12582912, 114);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        })).get(0).mo12610measureBRTryo0(jM13613copyZbe2FdA$default2);
                        final Placeable placeableMo12610measureBRTryo04 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, function22).get(0).mo12610measureBRTryo0(jM13613copyZbe2FdA$default);
                        final Function0<Float> function02 = function0;
                        final SheetState sheetState2 = sheetState;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, iM13621getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

                            /* compiled from: BottomSheetScaffold.kt */
                            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                            /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
                            /* loaded from: classes3.dex */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[SheetValue.values().length];
                                    try {
                                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[SheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[SheetValue.Hidden.ordinal()] = 3;
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
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                int height2;
                                int iRoundToInt = MathKt__MathJVMKt.roundToInt(function02.invoke().floatValue());
                                int iMax = Integer.max(0, (iM13622getMaxWidthimpl - placeableMo12610measureBRTryo0.getWidth()) / 2);
                                int width = (iM13622getMaxWidthimpl - placeableMo12610measureBRTryo04.getWidth()) / 2;
                                int i6 = WhenMappings.$EnumSwitchMapping$0[sheetState2.getCurrentValue().ordinal()];
                                if (i6 == 1) {
                                    height2 = iRoundToInt - placeableMo12610measureBRTryo04.getHeight();
                                } else {
                                    if (i6 != 2 && i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    height2 = iM13621getMaxHeightimpl - placeableMo12610measureBRTryo04.getHeight();
                                }
                                int i7 = height2;
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo03, 0, i5, 0.0f, 4, null);
                                Placeable placeable = placeableMo12610measureBRTryo02;
                                if (placeable != null) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, iMax, iRoundToInt, 0.0f, 4, null);
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo04, width, i7, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function23);
                objRememberedValue2 = function23;
            } else {
                i3 = 1;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue2, composerStartRestartGroup, 0, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    BottomSheetScaffoldKt.m9151BottomSheetScaffoldLayoutPxNyym8(modifier, function2, function3, function32, function22, f, function0, sheetState, j, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
