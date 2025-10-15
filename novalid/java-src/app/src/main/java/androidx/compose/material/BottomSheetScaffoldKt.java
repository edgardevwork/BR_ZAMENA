package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.FabPosition;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
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
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
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
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.gui.inventory.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(m7104d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0093\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2'\u0010\r\u001a#\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001f¢\u0006\u0002\b H\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÞ\u0002\u0010#\u001a\u00020\b2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001f¢\u0006\u0002\b 2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020&2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010(¢\u0006\u0002\b\u001f2\u0019\b\u0002\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001f2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010(¢\u0006\u0002\b\u001f2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010.\u001a\u00020\u00012 \b\u0002\u0010/\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e¢\u0006\u0002\b\u001f¢\u0006\u0002\b 2\b\b\u0002\u00100\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\u00162\b\b\u0002\u00102\u001a\u00020\u00012\b\b\u0002\u00103\u001a\u00020\u00192\b\b\u0002\u00104\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u00020\u00192\b\b\u0002\u00106\u001a\u00020\u00192\b\b\u0002\u00107\u001a\u00020\u00192\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0080\u0002\u0010#\u001a\u00020\b2\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001f¢\u0006\u0002\b 2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020&2\u0015\b\u0002\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010(¢\u0006\u0002\b\u001f2\u0019\b\u0002\u0010)\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001f2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010(¢\u0006\u0002\b\u001f2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u00106\u001a\u00020\u00192\b\b\u0002\u00107\u001a\u00020\u00192\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001aÅ\u0001\u0010=\u001a\u00020\b2\u0013\u0010'\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010(¢\u0006\u0002\b\u001f2&\u0010>\u001a\"\u0012\u0013\u0012\u001108¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001f2&\u0010@\u001a\"\u0012\u0013\u0012\u00110A¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u001f2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010(¢\u0006\u0002\b\u001f2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\b0(¢\u0006\u0002\b\u001f2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0(2\u0006\u0010E\u001a\u00020\nH\u0003ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a4\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00142\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020D0K2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000eH\u0007\u001a \u0010H\u001a\u00020&2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020*H\u0007\u001a>\u0010Q\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00142\u0006\u0010R\u001a\u00020S2\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020D0K2\u0014\b\u0002\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000eH\u0007\u001a\u001c\u0010U\u001a\u00020V2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030W2\u0006\u0010X\u001a\u00020YH\u0002\u001a!\u0010Z\u001a\u00020&2\b\b\u0002\u0010O\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020*H\u0007¢\u0006\u0002\u0010[\u001a+\u0010Z\u001a\u00020&2\b\b\u0002\u0010M\u001a\u00020N2\b\b\u0002\u0010O\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020*H\u0007¢\u0006\u0002\u0010\\\u001a;\u0010]\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00142\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020D0K2\u0014\b\u0002\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u000eH\u0007¢\u0006\u0002\u0010^\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, m7105d2 = {"BottomSheetScaffoldPositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffoldVelocityThreshold", "BottomSheetScaffoldWithDrawerDeprecated", "", "FabSpacing", "BottomSheet", "", "state", "Landroidx/compose/material/BottomSheetState;", "sheetGesturesEnabled", "", "calculateAnchors", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "sheetSize", "Landroidx/compose/material/DraggableAnchors;", "Landroidx/compose/material/BottomSheetValue;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomSheet-0cLKjW4", "(Landroidx/compose/material/BottomSheetState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffold", "sheetContent", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffold-HnlDQGw", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffoldLayout", "body", "innerPadding", "bottomSheet", "", "layoutHeight", "sheetOffset", "", "sheetState", "BottomSheetScaffoldLayout-KCBPh4w", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILkotlin/jvm/functions/Function0;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "BottomSheetScaffoldState", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "drawerState", "Landroidx/compose/material/DrawerState;", "bottomSheetState", "snackbarHostState", "BottomSheetState", "density", "Landroidx/compose/ui/unit/Density;", "confirmValueChange", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,812:1\n74#2:813\n74#2:836\n74#2:843\n25#3:814\n50#3:821\n49#3:822\n25#3:829\n25#3:849\n1116#4,6:815\n1116#4,6:823\n1116#4,6:830\n1116#4,6:837\n1116#4,3:850\n1119#4,3:856\n1116#4,6:860\n1116#4,6:866\n1#5:844\n487#6,4:845\n491#6,2:853\n495#6:859\n487#7:855\n154#8:872\n154#8:873\n154#8:874\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n307#1:813\n455#1:836\n460#1:843\n348#1:814\n350#1:821\n350#1:822\n388#1:829\n613#1:849\n348#1:815,6\n350#1:823,6\n388#1:830,6\n456#1:837,6\n613#1:850,3\n613#1:856,3\n621#1:860,6\n688#1:866,6\n613#1:845,4\n613#1:853,2\n613#1:859\n613#1:855\n806#1:872\n807#1:873\n808#1:874\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {

    @NotNull
    private static final String BottomSheetScaffoldWithDrawerDeprecated = "BottomSheetScaffold with a drawer has been deprecated. To achieve the same functionality, wrap your BottomSheetScaffold in aModalDrawer. See BottomSheetScaffoldWithDrawerSample for more details.";
    private static final float FabSpacing = C2046Dp.m13666constructorimpl(16);
    private static final float BottomSheetScaffoldPositionalThreshold = C2046Dp.m13666constructorimpl(56);
    private static final float BottomSheetScaffoldVelocityThreshold = C2046Dp.m13666constructorimpl(125);

    public static /* synthetic */ BottomSheetState BottomSheetScaffoldState$default(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        return BottomSheetScaffoldState(bottomSheetValue, (AnimationSpec<Float>) animationSpec, (Function1<? super BottomSheetValue, Boolean>) function1);
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "BottomSheetScaffoldState(initialValue, animationSpec, confirmStateChange)", imports = {}))
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState BottomSheetScaffoldState(@NotNull BottomSheetValue bottomSheetValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> function1) {
        return new BottomSheetState(bottomSheetValue, animationSpec, function1);
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m7105d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomSheetValue;", "invoke", "(Landroidx/compose/material/BottomSheetValue;)Ljava/lang/Boolean;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetState$1 */
    public static final class C10531 extends Lambda implements Function1<BottomSheetValue, Boolean> {
        public static final C10531 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomSheetValue bottomSheetValue) {
            return Boolean.TRUE;
        }
    }

    public static /* synthetic */ BottomSheetState BottomSheetState$default(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = C10531.INSTANCE;
        }
        return BottomSheetState(bottomSheetValue, density, animationSpec, function1);
    }

    @Stable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState BottomSheetState(@NotNull BottomSheetValue bottomSheetValue, @NotNull Density density, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> function1) {
        BottomSheetState bottomSheetState = new BottomSheetState(bottomSheetValue, animationSpec, function1);
        bottomSheetState.setDensity$material_release(density);
        return bottomSheetState;
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1 */
    public static final class C10571 extends Lambda implements Function1<BottomSheetValue, Boolean> {
        public static final C10571 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomSheetValue bottomSheetValue) {
            return Boolean.TRUE;
        }
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState rememberBottomSheetState(@NotNull BottomSheetValue bottomSheetValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super BottomSheetValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1808153344);
        if ((i2 & 2) != 0) {
            animationSpec = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = C10571.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:305)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m10957rememberSaveable(new Object[]{animationSpec}, (Saver) BottomSheetState.INSTANCE.Saver(animationSpec, function1, density), (String) null, (Function0) new Function0<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt.rememberBottomSheetState.2
            public final /* synthetic */ AnimationSpec<Float> $animationSpec;
            public final /* synthetic */ Function1<BottomSheetValue, Boolean> $confirmStateChange;
            public final /* synthetic */ Density $density;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10582(Density density2, AnimationSpec<Float> animationSpec2, Function1<? super BottomSheetValue, Boolean> function12) {
                super(0);
                density = density2;
                animationSpec = animationSpec2;
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BottomSheetState invoke() {
                return BottomSheetScaffoldKt.BottomSheetState(bottomSheetValue, density, animationSpec, function1);
            }
        }, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetState;
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "Landroidx/compose/material/BottomSheetState;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2 */
    public static final class C10582 extends Lambda implements Function0<BottomSheetState> {
        public final /* synthetic */ AnimationSpec<Float> $animationSpec;
        public final /* synthetic */ Function1<BottomSheetValue, Boolean> $confirmStateChange;
        public final /* synthetic */ Density $density;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10582(Density density2, AnimationSpec<Float> animationSpec2, Function1<? super BottomSheetValue, Boolean> function12) {
            super(0);
            density = density2;
            animationSpec = animationSpec2;
            function1 = function12;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final BottomSheetState invoke() {
            return BottomSheetScaffoldKt.BottomSheetState(bottomSheetValue, density, animationSpec, function1);
        }
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable BottomSheetState bottomSheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1022285988);
        if ((i2 & 1) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
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
            ComposerKt.traceEventStart(-1022285988, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:348)");
        }
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = BottomSheetScaffoldWithDrawerDeprecated)
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetScaffoldState BottomSheetScaffoldState(@NotNull DrawerState drawerState, @NotNull BottomSheetState bottomSheetState, @NotNull SnackbarHostState snackbarHostState) {
        throw new IllegalStateException(BottomSheetScaffoldWithDrawerDeprecated.toString());
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = BottomSheetScaffoldWithDrawerDeprecated)
    @Composable
    @ExperimentalMaterialApi
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable DrawerState drawerState, @Nullable BottomSheetState bottomSheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1353009744);
        if ((i2 & 1) != 0) {
            DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1353009744, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:388)");
        }
        throw new IllegalStateException(BottomSheetScaffoldWithDrawerDeprecated.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:292:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:531:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: BottomSheetScaffold-HnlDQGw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8803BottomSheetScaffoldHnlDQGw(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Modifier modifier, @Nullable BottomSheetScaffoldState bottomSheetScaffoldState, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, int i, boolean z, @Nullable Shape shape, float f, long j, long j2, float f2, long j3, long j4, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        final BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M8872getLambda1$material_release;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int iM8923getEnd5ygKITE;
        Shape large;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U;
        float f3;
        int i14;
        long jM8839getBackground0d7_KjU;
        long jM8864contentColorForek8zF_U2;
        int i15;
        int i16;
        Function2<? super Composer, ? super Integer, Unit> function24;
        long j5;
        float f4;
        float f5;
        long j6;
        final Density density;
        boolean zChanged;
        Object objRememberedValue;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final float f6;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34;
        final BottomSheetScaffoldState bottomSheetScaffoldState2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final long j7;
        final long j8;
        final float f7;
        final Modifier modifier3;
        final Shape shape2;
        final boolean z3;
        final long j9;
        final int i17;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-423121424);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i18 = i4 & 2;
        if (i18 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i4 & 4) == 0) {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                    int i19 = composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState) ? 256 : 128;
                    i5 |= i19;
                } else {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
                }
                i5 |= i19;
            } else {
                bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
            }
            i6 = i4 & 8;
            int i20 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                int i21 = 8192;
                if (i7 != 0) {
                    i5 |= CpioConstants.C_ISBLK;
                } else if ((i2 & 57344) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i2 & 458752) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 234881024) == 0) {
                    i5 |= ((i4 & 256) == 0 && composerStartRestartGroup.changed(shape)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    i12 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(j)) ? 4 : 2);
                } else {
                    i12 = i3;
                }
                if ((i3 & 112) == 0) {
                    i12 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(j2)) ? 32 : 16;
                }
                int i22 = i12;
                i13 = i4 & 4096;
                if (i13 != 0) {
                    i22 |= 384;
                } else {
                    if ((i3 & 896) == 0) {
                        i22 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
                    }
                    if ((i3 & 7168) == 0) {
                        if ((i4 & 8192) == 0 && composerStartRestartGroup.changed(j3)) {
                            i20 = 2048;
                        }
                        i22 |= i20;
                    }
                    if ((i3 & 57344) == 0) {
                        if ((i4 & 16384) == 0 && composerStartRestartGroup.changed(j4)) {
                            i21 = 16384;
                        }
                        i22 |= i21;
                    }
                    if ((32768 & i4) != 0) {
                        if ((i3 & 458752) == 0) {
                            i22 |= composerStartRestartGroup.changedInstance(function33) ? 131072 : 65536;
                        }
                        if ((i5 & 1533916891) != 306783378 || (374491 & i22) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i18 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                }
                                Function2<? super Composer, ? super Integer, Unit> function27 = i6 == 0 ? null : function2;
                                function3M8872getLambda1$material_release = i7 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m8872getLambda1$material_release() : function32;
                                function23 = i8 == 0 ? null : function22;
                                iM8923getEnd5ygKITE = i9 == 0 ? FabPosition.INSTANCE.m8923getEnd5ygKITE() : i;
                                if (i10 != 0) {
                                    z2 = true;
                                }
                                if ((i4 & 256) == 0) {
                                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                    i5 &= -234881025;
                                } else {
                                    large = shape;
                                }
                                float fM8800getSheetElevationD9Ej5fM = i11 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m8800getSheetElevationD9Ej5fM() : f;
                                if ((i4 & 1024) == 0) {
                                    i22 &= -15;
                                    jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                } else {
                                    jM8850getSurface0d7_KjU = j;
                                }
                                float f8 = fM8800getSheetElevationD9Ej5fM;
                                if ((i4 & 2048) == 0) {
                                    jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, i22 & 14);
                                    i22 &= -113;
                                } else {
                                    jM8864contentColorForek8zF_U = j2;
                                }
                                float fM8801getSheetPeekHeightD9Ej5fM = i13 == 0 ? BottomSheetScaffoldDefaults.INSTANCE.m8801getSheetPeekHeightD9Ej5fM() : f2;
                                if ((i4 & 8192) == 0) {
                                    f3 = fM8801getSheetPeekHeightD9Ej5fM;
                                    i14 = i22 & (-7169);
                                    jM8839getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8839getBackground0d7_KjU();
                                } else {
                                    f3 = fM8801getSheetPeekHeightD9Ej5fM;
                                    i14 = i22;
                                    jM8839getBackground0d7_KjU = j3;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function28 = function27;
                                if ((i4 & 16384) == 0) {
                                    jM8864contentColorForek8zF_U2 = ColorsKt.m8864contentColorForek8zF_U(jM8839getBackground0d7_KjU, composerStartRestartGroup, (i14 >> 9) & 14);
                                    i14 &= -57345;
                                } else {
                                    jM8864contentColorForek8zF_U2 = j4;
                                }
                                i15 = i14;
                                i16 = i5;
                                function24 = function28;
                                j5 = jM8839getBackground0d7_KjU;
                                f4 = f8;
                                f5 = f3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                }
                                if ((i4 & 256) != 0) {
                                    i5 &= -234881025;
                                }
                                if ((i4 & 1024) != 0) {
                                    i22 &= -15;
                                }
                                if ((i4 & 2048) != 0) {
                                    i22 &= -113;
                                }
                                if ((i4 & 8192) != 0) {
                                    i22 &= -7169;
                                }
                                if ((i4 & 16384) != 0) {
                                    i22 &= -57345;
                                }
                                function24 = function2;
                                function3M8872getLambda1$material_release = function32;
                                function23 = function22;
                                iM8923getEnd5ygKITE = i;
                                large = shape;
                                jM8850getSurface0d7_KjU = j;
                                jM8864contentColorForek8zF_U = j2;
                                f5 = f2;
                                jM8864contentColorForek8zF_U2 = j4;
                                i15 = i22;
                                i16 = i5;
                                f4 = f;
                                j5 = j3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                j6 = j5;
                            } else {
                                j6 = j5;
                                ComposerKt.traceEventStart(-423121424, i16, i15, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:452)");
                            }
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(750835211);
                            zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState) | composerStartRestartGroup.changed(density);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$1
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
                                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().setDensity$material_release(density);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                            final float fMo7874toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f5);
                            final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            final Function2<? super Composer, ? super Integer, Unit> function29 = function24;
                            final Function2<? super Composer, ? super Integer, Unit> function210 = function23;
                            final float f9 = f5;
                            final int i23 = iM8923getEnd5ygKITE;
                            final boolean z4 = z2;
                            final Shape shape3 = large;
                            final float f10 = f4;
                            final long j11 = jM8850getSurface0d7_KjU;
                            final long j12 = jM8864contentColorForek8zF_U;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function35 = function3M8872getLambda1$material_release;
                            int i24 = i15 >> 3;
                            SurfaceKt.m9025SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j6, jM8864contentColorForek8zF_U2, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -131096268, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
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
                                public final void invoke(@Nullable Composer composer2, int i25) {
                                    if ((i25 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-131096268, i25, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:466)");
                                        }
                                        BottomSheetState bottomSheetState = bottomSheetScaffoldState3.getBottomSheetState();
                                        Function2<Composer, Integer, Unit> function211 = function29;
                                        Function3<PaddingValues, Composer, Integer, Unit> function36 = function33;
                                        final boolean z5 = z4;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                                        final float f11 = f9;
                                        final float f12 = fMo7874toPx0680j_4;
                                        final Shape shape4 = shape3;
                                        final float f13 = f10;
                                        final long j13 = j11;
                                        final long j14 = j12;
                                        final Function3<ColumnScope, Composer, Integer, Unit> function37 = function3;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1900337132, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer3, Integer num2) {
                                                invoke(num.intValue(), composer3, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(final int i26, @Nullable Composer composer3, int i27) {
                                                int i28;
                                                Modifier modifierNestedScroll$default;
                                                if ((i27 & 14) == 0) {
                                                    i28 = i27 | (composer3.changed(i26) ? 4 : 2);
                                                } else {
                                                    i28 = i27;
                                                }
                                                if ((i28 & 91) != 18 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1900337132, i28, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:470)");
                                                    }
                                                    composer3.startReplaceableGroup(-816851224);
                                                    if (z5) {
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = bottomSheetScaffoldState4.getBottomSheetState().getAnchoredDraggableState$material_release();
                                                        BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState4;
                                                        composer3.startReplaceableGroup(1157296644);
                                                        boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release);
                                                        Object objRememberedValue2 = composer3.rememberedValue();
                                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue2 = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState5.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                                                            composer3.updateRememberedValue(objRememberedValue2);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                                                    } else {
                                                        modifierNestedScroll$default = Modifier.INSTANCE;
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    BottomSheetState bottomSheetState2 = bottomSheetScaffoldState4.getBottomSheetState();
                                                    Modifier modifierM8163requiredHeightInVpY3zN4$default = SizeKt.m8163requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierNestedScroll$default, 0.0f, 1, null), f11, 0.0f, 2, null);
                                                    boolean z6 = z5;
                                                    composer3.startReplaceableGroup(750836511);
                                                    boolean zChanged3 = composer3.changed(i26) | composer3.changed(f12);
                                                    final float f14 = f12;
                                                    Object objRememberedValue3 = composer3.rememberedValue();
                                                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = new Function1<IntSize, DraggableAnchors<BottomSheetValue>>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ DraggableAnchors<BottomSheetValue> invoke(IntSize intSize) {
                                                                return m8809invokeozmzZPI(intSize.getPackedValue());
                                                            }

                                                            @NotNull
                                                            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                            public final DraggableAnchors<BottomSheetValue> m8809invokeozmzZPI(long j15) {
                                                                final float fM13835getHeightimpl = IntSize.m13835getHeightimpl(j15);
                                                                final int i29 = i26;
                                                                final float f15 = f14;
                                                                return AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1.1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                                                        invoke2(draggableAnchorsConfig);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(@NotNull DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                                                        draggableAnchorsConfig.m52at(BottomSheetValue.Collapsed, i29 - f15);
                                                                        float f16 = fM13835getHeightimpl;
                                                                        if (f16 <= 0.0f || f16 == f15) {
                                                                            return;
                                                                        }
                                                                        draggableAnchorsConfig.m52at(BottomSheetValue.Expanded, i29 - f16);
                                                                    }
                                                                });
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    BottomSheetScaffoldKt.m8802BottomSheet0cLKjW4(bottomSheetState2, z6, (Function1) objRememberedValue3, shape4, f13, j13, j14, modifierM8163requiredHeightInVpY3zN4$default, function37, composer3, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        });
                                        Function2<Composer, Integer, Unit> function212 = function210;
                                        final Function3<SnackbarHostState, Composer, Integer, Unit> function38 = function35;
                                        final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState3;
                                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1011922215, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2.2
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
                                            public final void invoke(@Nullable Composer composer3, int i26) {
                                                if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1011922215, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:505)");
                                                }
                                                function38.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        });
                                        float f14 = f9;
                                        int i26 = i23;
                                        composer2.startReplaceableGroup(750837492);
                                        boolean zChanged2 = composer2.changed(bottomSheetScaffoldState3);
                                        final BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState3;
                                        Object objRememberedValue2 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$3$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                public final Float invoke() {
                                                    return Float.valueOf(bottomSheetScaffoldState6.getBottomSheetState().requireOffset());
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        BottomSheetScaffoldKt.m8805BottomSheetScaffoldLayoutKCBPh4w(function211, function36, composableLambda, function212, composableLambda2, f14, i26, (Function0) objRememberedValue2, bottomSheetState, composer2, 24960);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, (i24 & 7168) | (i24 & 896) | 1572864, 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function25 = function24;
                            f6 = f5;
                            function34 = function3M8872getLambda1$material_release;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            function26 = function23;
                            j7 = jM8864contentColorForek8zF_U;
                            j8 = jM8864contentColorForek8zF_U2;
                            f7 = f4;
                            modifier3 = modifier2;
                            shape2 = large;
                            z3 = z2;
                            j9 = jM8850getSurface0d7_KjU;
                            i17 = iM8923getEnd5ygKITE;
                            j10 = j6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function25 = function2;
                            function34 = function32;
                            function26 = function22;
                            i17 = i;
                            j7 = j2;
                            f6 = f2;
                            j10 = j3;
                            j8 = j4;
                            modifier3 = modifier2;
                            bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                            z3 = z2;
                            shape2 = shape;
                            f7 = f;
                            j9 = j;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$3
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

                                public final void invoke(@Nullable Composer composer2, int i25) {
                                    BottomSheetScaffoldKt.m8803BottomSheetScaffoldHnlDQGw(function3, modifier3, bottomSheetScaffoldState2, function25, function34, function26, i17, z3, shape2, f7, j9, j7, f6, j10, j8, function33, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i22 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i18 != 0) {
                            }
                            if ((i4 & 4) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 != 0) {
                            }
                            if ((i4 & 256) == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if ((i4 & 1024) == 0) {
                            }
                            float f82 = fM8800getSheetElevationD9Ej5fM;
                            if ((i4 & 2048) == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if ((i4 & 8192) == 0) {
                            }
                            Function2<? super Composer, ? super Integer, Unit> function282 = function27;
                            if ((i4 & 16384) == 0) {
                            }
                            i15 = i14;
                            i16 = i5;
                            function24 = function282;
                            j5 = jM8839getBackground0d7_KjU;
                            f4 = f82;
                            f5 = f3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(750835211);
                            zChanged = composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState) | composerStartRestartGroup.changed(density);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$1
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
                                        bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().setDensity$material_release(density);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                final float fMo7874toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f5);
                                final BottomSheetScaffoldState bottomSheetScaffoldState32 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                final Function2<? super Composer, ? super Integer, Unit> function292 = function24;
                                final Function2<? super Composer, ? super Integer, Unit> function2102 = function23;
                                final float f92 = f5;
                                final int i232 = iM8923getEnd5ygKITE;
                                final boolean z42 = z2;
                                final Shape shape32 = large;
                                final float f102 = f4;
                                final long j112 = jM8850getSurface0d7_KjU;
                                final long j122 = jM8864contentColorForek8zF_U;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function352 = function3M8872getLambda1$material_release;
                                int i242 = i15 >> 3;
                                SurfaceKt.m9025SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, j6, jM8864contentColorForek8zF_U2, null, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -131096268, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
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
                                    public final void invoke(@Nullable Composer composer2, int i25) {
                                        if ((i25 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-131096268, i25, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:466)");
                                            }
                                            BottomSheetState bottomSheetState = bottomSheetScaffoldState32.getBottomSheetState();
                                            Function2<Composer, Integer, Unit> function211 = function292;
                                            Function3<PaddingValues, Composer, Integer, Unit> function36 = function33;
                                            final boolean z5 = z42;
                                            final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState32;
                                            final float f11 = f92;
                                            final float f12 = fMo7874toPx0680j_42;
                                            final Shape shape4 = shape32;
                                            final float f13 = f102;
                                            final long j13 = j112;
                                            final long j14 = j122;
                                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function37 = function3;
                                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1900337132, true, new Function3<Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer3, Integer num2) {
                                                    invoke(num.intValue(), composer3, num2.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(final int i26, @Nullable Composer composer3, int i27) {
                                                    int i28;
                                                    Modifier modifierNestedScroll$default;
                                                    if ((i27 & 14) == 0) {
                                                        i28 = i27 | (composer3.changed(i26) ? 4 : 2);
                                                    } else {
                                                        i28 = i27;
                                                    }
                                                    if ((i28 & 91) != 18 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1900337132, i28, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:470)");
                                                        }
                                                        composer3.startReplaceableGroup(-816851224);
                                                        if (z5) {
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = bottomSheetScaffoldState4.getBottomSheetState().getAnchoredDraggableState$material_release();
                                                            BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState4;
                                                            composer3.startReplaceableGroup(1157296644);
                                                            boolean zChanged2 = composer3.changed(anchoredDraggableState$material_release);
                                                            Object objRememberedValue2 = composer3.rememberedValue();
                                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue2 = BottomSheetScaffoldKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState5.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                                                                composer3.updateRememberedValue(objRememberedValue2);
                                                            }
                                                            composer3.endReplaceableGroup();
                                                            modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objRememberedValue2, null, 2, null);
                                                        } else {
                                                            modifierNestedScroll$default = Modifier.INSTANCE;
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        BottomSheetState bottomSheetState2 = bottomSheetScaffoldState4.getBottomSheetState();
                                                        Modifier modifierM8163requiredHeightInVpY3zN4$default = SizeKt.m8163requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierNestedScroll$default, 0.0f, 1, null), f11, 0.0f, 2, null);
                                                        boolean z6 = z5;
                                                        composer3.startReplaceableGroup(750836511);
                                                        boolean zChanged3 = composer3.changed(i26) | composer3.changed(f12);
                                                        final float f14 = f12;
                                                        Object objRememberedValue3 = composer3.rememberedValue();
                                                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue3 = new Function1<IntSize, DraggableAnchors<BottomSheetValue>>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ DraggableAnchors<BottomSheetValue> invoke(IntSize intSize) {
                                                                    return m8809invokeozmzZPI(intSize.getPackedValue());
                                                                }

                                                                @NotNull
                                                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                                public final DraggableAnchors<BottomSheetValue> m8809invokeozmzZPI(long j15) {
                                                                    final float fM13835getHeightimpl = IntSize.m13835getHeightimpl(j15);
                                                                    final int i29 = i26;
                                                                    final float f15 = f14;
                                                                    return AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$1$1$1.1
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                                                            invoke2(draggableAnchorsConfig);
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(@NotNull DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                                                            draggableAnchorsConfig.m52at(BottomSheetValue.Collapsed, i29 - f15);
                                                                            float f16 = fM13835getHeightimpl;
                                                                            if (f16 <= 0.0f || f16 == f15) {
                                                                                return;
                                                                            }
                                                                            draggableAnchorsConfig.m52at(BottomSheetValue.Expanded, i29 - f16);
                                                                        }
                                                                    });
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue3);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        BottomSheetScaffoldKt.m8802BottomSheet0cLKjW4(bottomSheetState2, z6, (Function1) objRememberedValue3, shape4, f13, j13, j14, modifierM8163requiredHeightInVpY3zN4$default, function37, composer3, 0, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            });
                                            Function2<Composer, Integer, Unit> function212 = function2102;
                                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function38 = function352;
                                            final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState32;
                                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1011922215, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2.2
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
                                                public final void invoke(@Nullable Composer composer3, int i26) {
                                                    if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1011922215, i26, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:505)");
                                                    }
                                                    function38.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer3, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            });
                                            float f14 = f92;
                                            int i26 = i232;
                                            composer2.startReplaceableGroup(750837492);
                                            boolean zChanged2 = composer2.changed(bottomSheetScaffoldState32);
                                            final BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState32;
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0<Float>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2$3$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    @NotNull
                                                    public final Float invoke() {
                                                        return Float.valueOf(bottomSheetScaffoldState6.getBottomSheetState().requireOffset());
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer2.endReplaceableGroup();
                                            BottomSheetScaffoldKt.m8805BottomSheetScaffoldLayoutKCBPh4w(function211, function36, composableLambda, function212, composableLambda2, f14, i26, (Function0) objRememberedValue2, bottomSheetState, composer2, 24960);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, (i242 & 7168) | (i242 & 896) | 1572864, 50);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function25 = function24;
                                f6 = f5;
                                function34 = function3M8872getLambda1$material_release;
                                bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                function26 = function23;
                                j7 = jM8864contentColorForek8zF_U;
                                j8 = jM8864contentColorForek8zF_U2;
                                f7 = f4;
                                modifier3 = modifier2;
                                shape2 = large;
                                z3 = z2;
                                j9 = jM8850getSurface0d7_KjU;
                                i17 = iM8923getEnd5ygKITE;
                                j10 = j6;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 7168) == 0) {
                }
                if ((i3 & 57344) == 0) {
                }
                if ((32768 & i4) != 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            int i212 = 8192;
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
            if ((i2 & 234881024) == 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            if ((i3 & 14) == 0) {
            }
            if ((i3 & 112) == 0) {
            }
            int i222 = i12;
            i13 = i4 & 4096;
            if (i13 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((32768 & i4) != 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        i6 = i4 & 8;
        int i202 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        int i2122 = 8192;
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
        if ((i2 & 234881024) == 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        if ((i3 & 14) == 0) {
        }
        if ((i3 & 112) == 0) {
        }
        int i2222 = i12;
        i13 = i4 & 4096;
        if (i13 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((32768 & i4) != 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = BottomSheetScaffoldWithDrawerDeprecated)
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: BottomSheetScaffold-bGncdBI */
    public static final void m8804BottomSheetScaffoldbGncdBI(@NotNull final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable final Modifier modifier, @Nullable final BottomSheetScaffoldState bottomSheetScaffoldState, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, @Nullable final Function2<? super Composer, ? super Integer, Unit> function22, final int i, final boolean z, @Nullable final Shape shape, final float f, final long j, final long j2, final float f2, @Nullable final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33, final boolean z2, @Nullable final Shape shape2, final float f3, final long j3, final long j4, final long j5, final long j6, final long j7, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function34, @Nullable Composer composer, final int i2, final int i3, final int i4, final int i5) {
        long jM8850getSurface0d7_KjU;
        int i6;
        int i7;
        int i8;
        long jM8850getSurface0d7_KjU2;
        long jM8839getBackground0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(46422755);
        if ((i3 & 14) == 0) {
            jM8850getSurface0d7_KjU = j;
            i6 = i3 | (((i5 & 1024) == 0 && composerStartRestartGroup.changed(jM8850getSurface0d7_KjU)) ? 4 : 2);
        } else {
            jM8850getSurface0d7_KjU = j;
            i6 = i3;
        }
        if ((i3 & 29360128) == 0) {
            i6 |= ((i5 & 131072) == 0 && composerStartRestartGroup.changed(j3)) ? 8388608 : 4194304;
        }
        if ((i4 & 14) == 0) {
            i7 = i4 | (((i5 & 1048576) == 0 && composerStartRestartGroup.changed(j6)) ? 4 : 2);
        } else {
            i7 = i4;
        }
        int i9 = i2 & 1;
        if (i9 != 0 || (20971531 & i6) != 4194306 || (i7 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if (i9 == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                i8 = i2;
                if ((i5 & 2) != 0) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                }
                if ((i5 & 4) != 0) {
                    rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i8 &= -897;
                }
                if ((i5 & 16) != 0) {
                    ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m8873getLambda2$material_release();
                }
                if ((i5 & 64) != 0) {
                    FabPosition.INSTANCE.m8923getEnd5ygKITE();
                }
                if ((i5 & 256) != 0) {
                    MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i8 &= -234881025;
                }
                if ((i5 & 512) != 0) {
                    BottomSheetScaffoldDefaults.INSTANCE.m8800getSheetElevationD9Ej5fM();
                }
                if ((i5 & 1024) != 0) {
                    jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                    i6 &= -15;
                }
                if ((i5 & 2048) != 0) {
                    ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, i6 & 14);
                    i6 &= -113;
                }
                if ((i5 & 4096) != 0) {
                    BottomSheetScaffoldDefaults.INSTANCE.m8801getSheetPeekHeightD9Ej5fM();
                }
                if ((i5 & 32768) != 0) {
                    MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i6 &= -458753;
                }
                if ((65536 & i5) != 0) {
                    DrawerDefaults.INSTANCE.m8892getElevationD9Ej5fM();
                }
                if ((i5 & 131072) != 0) {
                    jM8850getSurface0d7_KjU2 = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                    i6 &= -29360129;
                } else {
                    jM8850getSurface0d7_KjU2 = j3;
                }
                if ((i5 & 262144) != 0) {
                    ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU2, composerStartRestartGroup, (i6 >> 21) & 14);
                    i6 &= -234881025;
                }
                if ((524288 & i5) != 0) {
                    DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i6 = (-1879048193) & i6;
                }
                if ((1048576 & i5) != 0) {
                    jM8839getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8839getBackground0d7_KjU();
                    i7 &= -15;
                } else {
                    jM8839getBackground0d7_KjU = j6;
                }
                if ((2097152 & i5) != 0) {
                    ColorsKt.m8864contentColorForek8zF_U(jM8839getBackground0d7_KjU, composerStartRestartGroup, i7 & 14);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i8 = (i5 & 4) != 0 ? i2 & (-897) : i2;
                if ((i5 & 256) != 0) {
                    i8 &= -234881025;
                }
                if ((i5 & 1024) != 0) {
                    i6 &= -15;
                }
                if ((i5 & 2048) != 0) {
                    i6 &= -113;
                }
                if ((i5 & 32768) != 0) {
                    i6 &= -458753;
                }
                if ((i5 & 131072) != 0) {
                    i6 &= -29360129;
                }
                if ((262144 & i5) != 0) {
                    i6 &= -234881025;
                }
                if ((524288 & i5) != 0) {
                    i6 &= -1879048193;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(46422755, i8, i6, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:595)");
            }
            throw new IllegalStateException(BottomSheetScaffoldWithDrawerDeprecated.toString());
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$4
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
                    BottomSheetScaffoldKt.m8804BottomSheetScaffoldbGncdBI(function3, modifier, bottomSheetScaffoldState, function2, function32, function22, i, z, shape, f, j, j2, f2, function33, z2, shape2, f3, j3, j4, j5, j6, j7, function34, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheet-0cLKjW4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8802BottomSheet0cLKjW4(final BottomSheetState bottomSheetState, final boolean z, final Function1<? super IntSize, ? extends DraggableAnchors<BottomSheetValue>> function1, final Shape shape, final float f, final long j, final long j2, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1407045933);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(bottomSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    i3 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((57344 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((3670016 & i) == 0) {
                        i3 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    i4 = i2 & 128;
                    if (i4 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        i5 = (234881024 & i) == 0 ? composerStartRestartGroup.changedInstance(function3) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION : 100663296;
                        if ((191739611 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1407045933, i3, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:611)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modifier3, bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, false, 56, null);
                            composerStartRestartGroup.startReplaceableGroup(750843616);
                            zChangedInstance = composerStartRestartGroup.changedInstance(function1) | composerStartRestartGroup.changed(bottomSheetState);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1

                                    /* compiled from: BottomSheetScaffold.kt */
                                    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                    public /* synthetic */ class WhenMappings {
                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                        static {
                                            int[] iArr = new int[BottomSheetValue.values().length];
                                            try {
                                                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                                            } catch (NoSuchFieldError unused) {
                                            }
                                            try {
                                                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                                            } catch (NoSuchFieldError unused2) {
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
                                        m8808invokeozmzZPI(intSize.getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                    public final void m8808invokeozmzZPI(long j3) {
                                        BottomSheetValue bottomSheetValue;
                                        DraggableAnchors<BottomSheetValue> draggableAnchorsInvoke = function1.invoke(IntSize.m13828boximpl(j3));
                                        int i6 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getAnchoredDraggableState$material_release().getTargetValue().ordinal()];
                                        if (i6 == 1) {
                                            bottomSheetValue = BottomSheetValue.Collapsed;
                                        } else {
                                            if (i6 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            bottomSheetValue = BottomSheetValue.Expanded;
                                            if (!draggableAnchorsInvoke.hasAnchorFor(bottomSheetValue)) {
                                                bottomSheetValue = BottomSheetValue.Collapsed;
                                            }
                                        }
                                        bottomSheetState.getAnchoredDraggableState$material_release().updateAnchors(draggableAnchorsInvoke, bottomSheetValue);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i6 = i3 >> 9;
                            SurfaceKt.m9025SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default, (Function1) objRememberedValue2), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2
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
                                    if (bottomSheetState.getAnchoredDraggableState$material_release().getAnchors().getSize() > 1) {
                                        if (bottomSheetState.isCollapsed()) {
                                            final BottomSheetState bottomSheetState2 = bottomSheetState;
                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                @DebugMetadata(m7119c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {636}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1, reason: invalid class name */
                                                /* loaded from: classes2.dex */
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BottomSheetState $state;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BottomSheetState bottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$state, continuation);
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
                                                            BottomSheetState bottomSheetState = this.$state;
                                                            this.label = 1;
                                                            if (bottomSheetState.expand(this) == coroutine_suspended) {
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
                                                    if (bottomSheetState2.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(bottomSheetState2, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BottomSheetState bottomSheetState3 = bottomSheetState;
                                            final CoroutineScope coroutineScope3 = coroutineScope;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                @DebugMetadata(m7119c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {Constants.ID_TACKLE_2}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1, reason: invalid class name */
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BottomSheetState $state;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BottomSheetState bottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$state, continuation);
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
                                                            BottomSheetState bottomSheetState = this.$state;
                                                            this.label = 1;
                                                            if (bottomSheetState.collapse(this) == coroutine_suspended) {
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
                                                    if (bottomSheetState3.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(bottomSheetState3, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            }, 1, null), shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1944994153, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
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
                                    if ((i7 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1944994153, i7, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:653)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(-483455358);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 6) & 112) | 1572864 | (i6 & 896) | (i6 & 7168) | ((i3 << 3) & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$4
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
                                    BottomSheetScaffoldKt.m8802BottomSheet0cLKjW4(bottomSheetState, z, function1, shape, f, j, j2, modifier4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i5;
                    if ((191739611 & i3) != 38347922) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierAnchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(modifier3, bottomSheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, z, false, null, false, 56, null);
                        composerStartRestartGroup.startReplaceableGroup(750843616);
                        zChangedInstance = composerStartRestartGroup.changedInstance(function1) | composerStartRestartGroup.changed(bottomSheetState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1

                                /* compiled from: BottomSheetScaffold.kt */
                                @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[BottomSheetValue.values().length];
                                        try {
                                            iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
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
                                    m8808invokeozmzZPI(intSize.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                public final void m8808invokeozmzZPI(long j3) {
                                    BottomSheetValue bottomSheetValue;
                                    DraggableAnchors<BottomSheetValue> draggableAnchorsInvoke = function1.invoke(IntSize.m13828boximpl(j3));
                                    int i62 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState.getAnchoredDraggableState$material_release().getTargetValue().ordinal()];
                                    if (i62 == 1) {
                                        bottomSheetValue = BottomSheetValue.Collapsed;
                                    } else {
                                        if (i62 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bottomSheetValue = BottomSheetValue.Expanded;
                                        if (!draggableAnchorsInvoke.hasAnchorFor(bottomSheetValue)) {
                                            bottomSheetValue = BottomSheetValue.Collapsed;
                                        }
                                    }
                                    bottomSheetState.getAnchoredDraggableState$material_release().updateAnchors(draggableAnchorsInvoke, bottomSheetValue);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceableGroup();
                            int i62 = i3 >> 9;
                            SurfaceKt.m9025SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnRemeasuredModifierKt.onSizeChanged(modifierAnchoredDraggable$default2, (Function1) objRememberedValue2), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2
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
                                    if (bottomSheetState.getAnchoredDraggableState$material_release().getAnchors().getSize() > 1) {
                                        if (bottomSheetState.isCollapsed()) {
                                            final BottomSheetState bottomSheetState2 = bottomSheetState;
                                            final CoroutineScope coroutineScope22 = coroutineScope2;
                                            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                @DebugMetadata(m7119c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {636}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1, reason: invalid class name */
                                                /* loaded from: classes2.dex */
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BottomSheetState $state;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BottomSheetState bottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$state, continuation);
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
                                                            BottomSheetState bottomSheetState = this.$state;
                                                            this.label = 1;
                                                            if (bottomSheetState.expand(this) == coroutine_suspended) {
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
                                                    if (bottomSheetState2.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Expanded).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(bottomSheetState2, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BottomSheetState bottomSheetState3 = bottomSheetState;
                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* compiled from: BottomSheetScaffold.kt */
                                                @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                                @DebugMetadata(m7119c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1", m7120f = "BottomSheetScaffold.kt", m7121i = {}, m7122l = {Constants.ID_TACKLE_2}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                                /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1, reason: invalid class name */
                                                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    public final /* synthetic */ BottomSheetState $state;
                                                    public int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    public AnonymousClass1(BottomSheetState bottomSheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$state = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    @NotNull
                                                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$state, continuation);
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
                                                            BottomSheetState bottomSheetState = this.$state;
                                                            this.label = 1;
                                                            if (bottomSheetState.collapse(this) == coroutine_suspended) {
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
                                                    if (bottomSheetState3.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed).booleanValue()) {
                                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(bottomSheetState3, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            }, 1, null), shape, j, j2, null, f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1944994153, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
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
                                    if ((i7 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1944994153, i7, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:653)");
                                    }
                                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                    composer2.startReplaceableGroup(-483455358);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i3 >> 6) & 112) | 1572864 | (i62 & 896) | (i62 & 7168) | ((i3 << 3) & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                i4 = i2 & 128;
                if (i4 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i5;
                if ((191739611 & i3) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i4 = i2 & 128;
            if (i4 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i5;
            if ((191739611 & i3) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i5;
        if ((191739611 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w */
    public static final void m8805BottomSheetScaffoldLayoutKCBPh4w(final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function3<? super Integer, ? super Composer, ? super Integer, Unit> function32, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final float f, final int i, final Function0<Float> function0, final BottomSheetState bottomSheetState, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1621720523);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(bottomSheetState) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((191739611 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621720523, i3, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:686)");
            }
            composerStartRestartGroup.startReplaceableGroup(750846060);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(function32) | composerStartRestartGroup.changedInstance(function2) | composerStartRestartGroup.changedInstance(function3) | composerStartRestartGroup.changed(f) | composerStartRestartGroup.changedInstance(function22) | composerStartRestartGroup.changedInstance(function23) | composerStartRestartGroup.changedInstance(function0) | composerStartRestartGroup.changed(i) | composerStartRestartGroup.changed(bottomSheetState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function24 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m8810invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x016c  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
                    @NotNull
                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MeasureResult m8810invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        ArrayList arrayList;
                        final int height;
                        ArrayList arrayList2;
                        final int width;
                        final int height2;
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
                        final int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
                        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot = BottomSheetScaffoldLayoutSlot.Sheet;
                        final Function3<Integer, Composer, Integer, Unit> function33 = function32;
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot, ComposableLambdaKt.composableLambdaInstance(-170696743, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceables$1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i4) {
                                if ((i4 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-170696743, i4, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:693)");
                                }
                                function33.invoke(Integer.valueOf(iM13621getMaxHeightimpl), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList3 = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList3.add(listSubcompose.get(i4).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        Function2<Composer, Integer, Unit> function25 = function2;
                        if (function25 != null) {
                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, function25);
                            ArrayList arrayList4 = new ArrayList(listSubcompose2.size());
                            int size2 = listSubcompose2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                arrayList4.add(listSubcompose2.get(i5).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                            }
                            arrayList = arrayList4;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            height = 0;
                        } else {
                            if (arrayList.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList.get(0);
                                int height3 = ((Placeable) obj5).getHeight();
                                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                                if (1 <= lastIndex) {
                                    int i6 = 1;
                                    while (true) {
                                        Object obj6 = arrayList.get(i6);
                                        int height4 = ((Placeable) obj6).getHeight();
                                        if (height3 < height4) {
                                            obj5 = obj6;
                                            height3 = height4;
                                        }
                                        if (i6 == lastIndex) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                            Placeable placeable = (Placeable) obj5;
                            if (placeable != null) {
                                height = placeable.getHeight();
                            }
                        }
                        long jM13613copyZbe2FdA$default2 = Constraints.m13613copyZbe2FdA$default(jM13613copyZbe2FdA$default, 0, 0, 0, iM13621getMaxHeightimpl - height, 7, null);
                        BottomSheetScaffoldLayoutSlot bottomSheetScaffoldLayoutSlot2 = BottomSheetScaffoldLayoutSlot.Body;
                        final Function3<PaddingValues, Composer, Integer, Unit> function34 = function3;
                        final float f2 = f;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(bottomSheetScaffoldLayoutSlot2, ComposableLambdaKt.composableLambdaInstance(-389342674, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceables$1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i7) {
                                if ((i7 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-389342674, i7, -1, "androidx.compose.material.BottomSheetScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:704)");
                                }
                                function34.invoke(PaddingKt.m8120PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f2, 7, null), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        for (int i7 = 0; i7 < size3; i7++) {
                            arrayList5.add(listSubcompose3.get(i7).mo12610measureBRTryo0(jM13613copyZbe2FdA$default2));
                        }
                        Function2<Composer, Integer, Unit> function26 = function22;
                        if (function26 != null) {
                            List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Fab, function26);
                            ArrayList arrayList6 = new ArrayList(listSubcompose4.size());
                            int size4 = listSubcompose4.size();
                            for (int i8 = 0; i8 < size4; i8++) {
                                arrayList6.add(listSubcompose4.get(i8).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                            }
                            arrayList2 = arrayList6;
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 == null) {
                            width = 0;
                        } else {
                            if (arrayList2.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList2.get(0);
                                int width2 = ((Placeable) obj4).getWidth();
                                int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                if (1 <= lastIndex2) {
                                    int i9 = 1;
                                    while (true) {
                                        Object obj7 = arrayList2.get(i9);
                                        int width3 = ((Placeable) obj7).getWidth();
                                        if (width2 < width3) {
                                            width2 = width3;
                                            obj4 = obj7;
                                        }
                                        if (i9 == lastIndex2) {
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                            }
                            Placeable placeable2 = (Placeable) obj4;
                            if (placeable2 != null) {
                                width = placeable2.getWidth();
                            }
                        }
                        if (arrayList2 == null) {
                            height2 = 0;
                        } else {
                            if (arrayList2.isEmpty()) {
                                obj3 = null;
                            } else {
                                obj3 = arrayList2.get(0);
                                int height5 = ((Placeable) obj3).getHeight();
                                int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                                if (1 <= lastIndex3) {
                                    int i10 = height5;
                                    Object obj8 = obj3;
                                    int i11 = 1;
                                    while (true) {
                                        Object obj9 = arrayList2.get(i11);
                                        int height6 = ((Placeable) obj9).getHeight();
                                        if (i10 < height6) {
                                            i10 = height6;
                                            obj8 = obj9;
                                        }
                                        if (i11 == lastIndex3) {
                                            break;
                                        }
                                        i11++;
                                    }
                                    obj3 = obj8;
                                }
                            }
                            Placeable placeable3 = (Placeable) obj3;
                            if (placeable3 != null) {
                                height2 = placeable3.getHeight();
                            }
                        }
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, function23);
                        final ArrayList arrayList7 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i12 = 0; i12 < size5; i12++) {
                            arrayList7.add(listSubcompose5.get(i12).mo12610measureBRTryo0(jM13613copyZbe2FdA$default));
                        }
                        if (arrayList7.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList7.get(0);
                            int width4 = ((Placeable) obj).getWidth();
                            int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList7);
                            if (1 <= lastIndex4) {
                                int i13 = 1;
                                while (true) {
                                    Object obj10 = arrayList7.get(i13);
                                    int width5 = ((Placeable) obj10).getWidth();
                                    if (width4 < width5) {
                                        obj = obj10;
                                        width4 = width5;
                                    }
                                    if (i13 == lastIndex4) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj;
                        int width6 = placeable4 != null ? placeable4.getWidth() : 0;
                        if (arrayList7.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj11 = arrayList7.get(0);
                            int height7 = ((Placeable) obj11).getHeight();
                            int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList7);
                            int i14 = 1;
                            if (1 <= lastIndex5) {
                                while (true) {
                                    Object obj12 = arrayList7.get(i14);
                                    int height8 = ((Placeable) obj12).getHeight();
                                    if (height7 < height8) {
                                        height7 = height8;
                                        obj11 = obj12;
                                    }
                                    if (i14 == lastIndex5) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            obj2 = obj11;
                        }
                        Placeable placeable5 = (Placeable) obj2;
                        int height9 = placeable5 != null ? placeable5.getHeight() : 0;
                        final Function0<Float> function02 = function0;
                        final int i15 = i;
                        final float f3 = f;
                        final BottomSheetState bottomSheetState2 = bottomSheetState;
                        final ArrayList arrayList8 = arrayList2;
                        final int i16 = width6;
                        final int i17 = height9;
                        final ArrayList arrayList9 = arrayList;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, iM13621getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1

                            /* compiled from: BottomSheetScaffold.kt */
                            @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                            /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[BottomSheetValue.values().length];
                                    try {
                                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
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
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                int iMo7868roundToPx0680j_4;
                                int iMo7868roundToPx0680j_42;
                                int i18;
                                int iRoundToInt = MathKt__MathJVMKt.roundToInt(function02.invoke().floatValue());
                                int i19 = i15;
                                FabPosition.Companion companion = FabPosition.INSTANCE;
                                if (FabPosition.m8918equalsimpl0(i19, companion.m8924getStart5ygKITE())) {
                                    iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                                } else {
                                    iMo7868roundToPx0680j_4 = FabPosition.m8918equalsimpl0(i19, companion.m8922getCenter5ygKITE()) ? (iM13622getMaxWidthimpl - width) / 2 : (iM13622getMaxWidthimpl - width) - subcomposeMeasureScope.mo7868roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                                }
                                int i20 = iMo7868roundToPx0680j_4;
                                float fMo7874toPx0680j_4 = subcomposeMeasureScope.mo7874toPx0680j_4(f3);
                                int i21 = height2;
                                if (fMo7874toPx0680j_4 < i21 / 2) {
                                    iMo7868roundToPx0680j_42 = (iRoundToInt - i21) - subcomposeMeasureScope.mo7868roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
                                } else {
                                    iMo7868roundToPx0680j_42 = iRoundToInt - (i21 / 2);
                                }
                                int i22 = iMo7868roundToPx0680j_42;
                                int i23 = (iM13622getMaxWidthimpl - i16) / 2;
                                int i24 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState2.getCurrentValue().ordinal()];
                                if (i24 == 1) {
                                    i18 = i22 - i17;
                                } else {
                                    if (i24 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i18 = iM13621getMaxHeightimpl - i17;
                                }
                                int i25 = i18;
                                List<Placeable> list = arrayList5;
                                int i26 = height;
                                int size6 = list.size();
                                for (int i27 = 0; i27 < size6; i27++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i27), 0, i26, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList9;
                                if (list2 != null) {
                                    int size7 = list2.size();
                                    for (int i28 = 0; i28 < size7; i28++) {
                                        Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i28), 0, 0, 0.0f, 4, null);
                                    }
                                }
                                List<Placeable> list3 = arrayList3;
                                int size8 = list3.size();
                                for (int i29 = 0; i29 < size8; i29++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i29), 0, iRoundToInt, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList8;
                                if (list4 != null) {
                                    int size9 = list4.size();
                                    for (int i30 = 0; i30 < size9; i30++) {
                                        Placeable.PlacementScope.placeRelative$default(placementScope, list4.get(i30), i20, i22, 0.0f, 4, null);
                                    }
                                }
                                List<Placeable> list5 = arrayList7;
                                int size10 = list5.size();
                                for (int i31 = 0; i31 < size10; i31++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i31), i23, i25, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composer2.updateRememberedValue(function24);
                objRememberedValue = function24;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
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
                    BottomSheetScaffoldKt.m8805BottomSheetScaffoldLayoutKCBPh4w(function2, function3, function32, function22, function23, f, i, function0, bottomSheetState, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(m7104d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m7105d2 = {"androidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
    /* loaded from: classes3.dex */
    public static final class C10541 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        public C10541(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
            this.$state = anchoredDraggableState;
            this.$orientation = orientation;
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
            C1056xe2eca24b c1056xe2eca24b;
            if (continuation instanceof C1056xe2eca24b) {
                c1056xe2eca24b = (C1056xe2eca24b) continuation;
                int i = c1056xe2eca24b.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1056xe2eca24b.label = i - Integer.MIN_VALUE;
                } else {
                    c1056xe2eca24b = new C1056xe2eca24b(this, continuation);
                }
            }
            Object obj = c1056xe2eca24b.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c1056xe2eca24b.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                float fVelocityToFloat = velocityToFloat(j);
                float fRequireOffset = this.$state.requireOffset();
                if (fVelocityToFloat < 0.0f && fRequireOffset > this.$state.getAnchors().minAnchor()) {
                    AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                    c1056xe2eca24b.J$0 = j;
                    c1056xe2eca24b.label = 1;
                    if (anchoredDraggableState.settle(fVelocityToFloat, c1056xe2eca24b) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    j = Velocity.INSTANCE.m13912getZero9UxMQ8M();
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c1056xe2eca24b.J$0;
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
            C1055x8eaee744 c1055x8eaee744;
            if (continuation instanceof C1055x8eaee744) {
                c1055x8eaee744 = (C1055x8eaee744) continuation;
                int i = c1055x8eaee744.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1055x8eaee744.label = i - Integer.MIN_VALUE;
                } else {
                    c1055x8eaee744 = new C1055x8eaee744(this, continuation);
                }
            }
            Object obj = c1055x8eaee744.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c1055x8eaee744.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDraggableState<?> anchoredDraggableState = this.$state;
                float fVelocityToFloat = velocityToFloat(j2);
                c1055x8eaee744.J$0 = j2;
                c1055x8eaee744.label = 1;
                if (anchoredDraggableState.settle(fVelocityToFloat, c1055x8eaee744) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = c1055x8eaee744.J$0;
                ResultKt.throwOnFailure(obj);
            }
            return Velocity.m13892boximpl(j2);
        }

        private final long toOffset(float f) {
            Orientation orientation = this.$orientation;
            float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
            if (orientation != Orientation.Vertical) {
                f = 0.0f;
            }
            return OffsetKt.Offset(f2, f);
        }

        @JvmName(name = "velocityToFloat")
        private final float velocityToFloat(long j) {
            return this.$orientation == Orientation.Horizontal ? Velocity.m13901getXimpl(j) : Velocity.m13902getYimpl(j);
        }

        @JvmName(name = "offsetToFloat")
        private final float offsetToFloat(long j) {
            return this.$orientation == Orientation.Horizontal ? Offset.m11099getXimpl(j) : Offset.m11100getYimpl(j);
        }
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new C10541(anchoredDraggableState, orientation);
    }
}
