package com.blackhub.bronline.game.p019ui.brsimbanner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.RotateKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.core.location.GpsStatusWrapper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerUIState;
import com.blackhub.bronline.game.gui.brsimbanner.BrSimBannerViewModel;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerCarModel;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItem;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItemForRowStateModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.CloseButtonWithGradientKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerGui.kt */
@SourceDebugExtension({"SMAP\nBrSimBannerGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrSimBannerGui.kt\ncom/blackhub/bronline/game/ui/brsimbanner/BrSimBannerGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,619:1\n81#2,11:620\n1116#3,6:631\n1116#3,6:637\n1116#3,6:643\n1116#3,3:654\n1119#3,3:660\n1116#3,6:664\n1116#3,6:670\n1116#3,6:676\n1116#3,6:682\n1116#3,6:688\n1116#3,6:694\n1116#3,6:700\n1116#3,6:706\n1116#3,6:712\n1116#3,6:718\n955#3,6:729\n1116#3,3:760\n1119#3,3:766\n487#4,4:649\n491#4,2:657\n495#4:663\n487#4,4:755\n491#4,2:763\n495#4:769\n25#5:653\n25#5:728\n25#5:759\n487#6:659\n487#6:765\n73#7,4:724\n77#7,20:735\n74#8:770\n74#8:771\n75#9:772\n108#9,2:773\n75#9:775\n108#9,2:776\n75#9:781\n108#9,2:782\n81#10:778\n107#10,2:779\n81#10:784\n107#10,2:785\n81#10:787\n81#10:788\n81#10:789\n107#10,2:790\n81#10:792\n107#10,2:793\n*S KotlinDebug\n*F\n+ 1 BrSimBannerGui.kt\ncom/blackhub/bronline/game/ui/brsimbanner/BrSimBannerGuiKt\n*L\n99#1:620,11\n103#1:631,6\n104#1:637,6\n105#1:643,6\n107#1:654,3\n107#1:660,3\n109#1:664,6\n110#1:670,6\n111#1:676,6\n112#1:682,6\n113#1:688,6\n115#1:694,6\n116#1:700,6\n118#1:706,6\n132#1:712,6\n206#1:718,6\n266#1:729,6\n608#1:760,3\n608#1:766,3\n107#1:649,4\n107#1:657,2\n107#1:663\n608#1:755,4\n608#1:763,2\n608#1:769\n107#1:653\n266#1:728\n608#1:759\n107#1:659\n608#1:765\n266#1:724,4\n266#1:735,20\n611#1:770\n613#1:771\n103#1:772\n103#1:773,2\n104#1:775\n104#1:776,2\n109#1:781\n109#1:782,2\n105#1:778\n105#1:779,2\n110#1:784\n110#1:785,2\n112#1:787\n113#1:788\n115#1:789\n115#1:790,2\n116#1:792\n116#1:793,2\n*E\n"})
/* loaded from: classes2.dex */
public final class BrSimBannerGuiKt {
    public static final float ANGLE_FOR_LEFT_ARROW = 270.0f;
    public static final float ANGLE_FOR_RIGHT_ARROW = 90.0f;
    public static final float BTN_CLOSE_PIVOT_FRACTION_X = 1.0f;
    public static final float BTN_CLOSE_PIVOT_FRACTION_Y = 0.5f;
    public static final int DELAY_200 = 200;
    public static final float HEIGHT_FOR_PAGER = 0.65f;
    public static final float HEIGHT_FOR_TITLE_TEXT = 0.13f;
    public static final int MAX_LINES_FOR_BUTTON_WATCH = 2;
    public static final float SIZE_FOR_ARROWS = 0.09f;
    public static final int TIME_SECONDS_FOR_CLOSE_BUTTON = 3;
    public static final int TIME_SECONDS_FOR_PAGER = 4;
    public static final float WIDTH_OF_BACKGROUND_DOTS = 0.58f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BrSimBannerGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        MutableState mutableState;
        Composer composerStartRestartGroup = composer.startRestartGroup(48803533);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(48803533, i, -1, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGui (BrSimBannerGui.kt:97)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(BrSimBannerViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final BrSimBannerViewModel brSimBannerViewModel = (BrSimBannerViewModel) viewModel;
            final BrSimBannerUIState brSimBannerUIState = (BrSimBannerUIState) FlowExtKt.collectAsStateWithLifecycle(brSimBannerViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
            if (!brSimBannerUIState.getBonusesList().isEmpty()) {
                composerStartRestartGroup.startReplaceableGroup(-776620319);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776620249);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776620182);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState2 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceableGroup();
                final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$pagerState$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Integer invoke() {
                        return Integer.valueOf(brSimBannerUIState.getBonusesList().size());
                    }
                }, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    objRememberedValue4 = compositionScopedCoroutineScopeCanceller;
                }
                composerStartRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue4).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776620001);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776619930);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new BrSimBannerCarModel(null, null, 3, null), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                final MutableState mutableState3 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776619844);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                final Animatable animatable = (Animatable) objRememberedValue7;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776619779);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(1.0f), 200), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                MutableState mutableState4 = (MutableState) objRememberedValue8;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776619692);
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(Float.valueOf(0.0f), 200), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                MutableState mutableState5 = (MutableState) objRememberedValue9;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776619611);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                MutableState mutableState6 = (MutableState) objRememberedValue10;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-776619545);
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                MutableState mutableState7 = (MutableState) objRememberedValue11;
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-776619480);
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == companion.getEmpty()) {
                    objRememberedValue12 = new BrSimBannerGuiKt$BrSimBannerGui$1$1(mutableIntState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 70);
                Boolean boolValueOf = Boolean.valueOf(BrSimBannerGui$lambda$7(mutableState2));
                composerStartRestartGroup.startReplaceableGroup(-776619033);
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == companion.getEmpty()) {
                    mutableState = mutableState2;
                    objRememberedValue13 = new BrSimBannerGuiKt$BrSimBannerGui$2$1(mutableState, mutableIntState2, mutableState6, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                } else {
                    mutableState = mutableState2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, 64);
                EffectsKt.LaunchedEffect(brSimBannerUIState.getCarPrizesList(), new C50363(brSimBannerUIState, mutableState3, null), composerStartRestartGroup, 72);
                EffectsKt.LaunchedEffect(Boolean.valueOf(BrSimBannerGui$lambda$21(mutableState6)), new C50374(animatable, pagerStateRememberPagerState, coroutineScope, brSimBannerUIState, mutableState7, mutableState5, mutableIntState2, mutableIntState3, mutableState3, mutableState4, null), composerStartRestartGroup, 64);
                Boolean boolValueOf2 = Boolean.valueOf(pagerStateRememberPagerState.isScrollInProgress());
                composerStartRestartGroup.startReplaceableGroup(-776616350);
                boolean zChanged = composerStartRestartGroup.changed(pagerStateRememberPagerState);
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue14 == companion.getEmpty()) {
                    objRememberedValue14 = new BrSimBannerGuiKt$BrSimBannerGui$5$1(pagerStateRememberPagerState, mutableIntState2, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 64);
                SurfaceKt.m9876SurfaceT9BRK9s(null, null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1332400637, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.BrSimBannerGui.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    public final void invoke(@Nullable Composer composer2, int i2) {
                        if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1332400637, i2, -1, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGui.<anonymous> (BrSimBannerGui.kt:217)");
                            }
                            List<BrSimBannerItem> bonusesList = brSimBannerUIState.getBonusesList();
                            boolean z = BrSimBannerGuiKt.BrSimBannerGui$lambda$1(mutableIntState) == 3;
                            AnnotatedString carName = BrSimBannerGuiKt.BrSimBannerGui$lambda$13(mutableState3).getCarName();
                            Bitmap carImage = BrSimBannerGuiKt.BrSimBannerGui$lambda$13(mutableState3).getCarImage();
                            Bitmap bgImage = brSimBannerUIState.getBgImage();
                            Bitmap simImage = brSimBannerUIState.getSimImage();
                            float fFloatValue = animatable.getValue().floatValue();
                            PagerState pagerState = pagerStateRememberPagerState;
                            CoroutineScope coroutineScope2 = coroutineScope;
                            final BrSimBannerViewModel brSimBannerViewModel2 = brSimBannerViewModel;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.BrSimBannerGui.6.1
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
                                    brSimBannerViewModel2.onClickWatchTariff();
                                }
                            };
                            final BrSimBannerViewModel brSimBannerViewModel3 = brSimBannerViewModel;
                            Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.BrSimBannerGui.6.2
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
                                    brSimBannerViewModel3.sendButtonPressed(3);
                                }
                            };
                            final BrSimBannerViewModel brSimBannerViewModel4 = brSimBannerViewModel;
                            BrSimBannerGuiKt.BrSimBannerContent(bonusesList, pagerState, coroutineScope2, z, carName, carImage, bgImage, simImage, fFloatValue, function0, function02, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.BrSimBannerGui.6.3
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
                                    brSimBannerViewModel4.sendButtonPressed(2);
                                }
                            }, composer2, 19137032, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 12583296, 123);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.BrSimBannerGui.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    BrSimBannerGuiKt.BrSimBannerGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void BrSimBannerGui$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void BrSimBannerGui$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void BrSimBannerGui$lambda$25(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: BrSimBannerGui.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$3", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$3 */
    public static final class C50363 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<BrSimBannerCarModel> $selectedCar$delegate;
        public final /* synthetic */ BrSimBannerUIState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50363(BrSimBannerUIState brSimBannerUIState, MutableState<BrSimBannerCarModel> mutableState, Continuation<? super C50363> continuation) {
            super(2, continuation);
            this.$state = brSimBannerUIState;
            this.$selectedCar$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50363(this.$state, this.$selectedCar$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50363) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.$state.getCarPrizesList().isEmpty()) {
                BrSimBannerGuiKt.BrSimBannerGui$lambda$14(this.$selectedCar$delegate, this.$state.getCarPrizesList().get(0));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BrSimBannerGui.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$4", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DF0, GpsStatusWrapper.QZSS_SVID_MIN}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$4 */
    public static final class C50374 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $buttonsAnimatedFloat;
        public final /* synthetic */ CoroutineScope $coroutineScope;
        public final /* synthetic */ MutableIntState $index$delegate;
        public final /* synthetic */ MutableState<Boolean> $isInitInterface$delegate;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ MutableState<BrSimBannerCarModel> $selectedCar$delegate;
        public final /* synthetic */ BrSimBannerUIState $state;
        public final /* synthetic */ MutableIntState $ticksForPager$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppear$delegate;
        public final /* synthetic */ MutableState<Pair<Float, Integer>> $valueForAppear2$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C50374(Animatable<Float, AnimationVector1D> animatable, PagerState pagerState, CoroutineScope coroutineScope, BrSimBannerUIState brSimBannerUIState, MutableState<Boolean> mutableState, MutableState<Pair<Float, Integer>> mutableState2, MutableIntState mutableIntState, MutableIntState mutableIntState2, MutableState<BrSimBannerCarModel> mutableState3, MutableState<Pair<Float, Integer>> mutableState4, Continuation<? super C50374> continuation) {
            super(2, continuation);
            this.$buttonsAnimatedFloat = animatable;
            this.$pagerState = pagerState;
            this.$coroutineScope = coroutineScope;
            this.$state = brSimBannerUIState;
            this.$isInitInterface$delegate = mutableState;
            this.$valueForAppear2$delegate = mutableState2;
            this.$ticksForPager$delegate = mutableIntState;
            this.$index$delegate = mutableIntState2;
            this.$selectedCar$delegate = mutableState3;
            this.$valueForAppear$delegate = mutableState4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C50374(this.$buttonsAnimatedFloat, this.$pagerState, this.$coroutineScope, this.$state, this.$isInitInterface$delegate, this.$valueForAppear2$delegate, this.$ticksForPager$delegate, this.$index$delegate, this.$selectedCar$delegate, this.$valueForAppear$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C50374) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (BrSimBannerGuiKt.BrSimBannerGui$lambda$24(this.$isInitInterface$delegate)) {
                    Animatable<Float, AnimationVector1D> animatable = this.$buttonsAnimatedFloat;
                    Object first = BrSimBannerGuiKt.BrSimBannerGui$lambda$19(this.$valueForAppear2$delegate).getFirst();
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(((Number) BrSimBannerGuiKt.BrSimBannerGui$lambda$19(this.$valueForAppear2$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, first, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (this.$pagerState.getCurrentPage() != 0) {
                    }
                    if (!this.$state.getCarPrizesList().isEmpty()) {
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                if (this.$pagerState.getCurrentPage() != 0) {
                    BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass1(this.$pagerState, this.$ticksForPager$delegate, null), 3, null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(this.$coroutineScope, null, null, new AnonymousClass2(this.$pagerState, this.$ticksForPager$delegate, null), 3, null);
                }
                if (!this.$state.getCarPrizesList().isEmpty()) {
                    MutableIntState mutableIntState = this.$index$delegate;
                    BrSimBannerGuiKt.BrSimBannerGui$lambda$11(mutableIntState, BrSimBannerGuiKt.BrSimBannerGui$lambda$10(mutableIntState) == CollectionsKt__CollectionsKt.getLastIndex(this.$state.getCarPrizesList()) ? 0 : BrSimBannerGuiKt.BrSimBannerGui$lambda$10(this.$index$delegate) + 1);
                    BrSimBannerGuiKt.BrSimBannerGui$lambda$14(this.$selectedCar$delegate, this.$state.getCarPrizesList().get(BrSimBannerGuiKt.BrSimBannerGui$lambda$10(this.$index$delegate)));
                    Animatable<Float, AnimationVector1D> animatable2 = this.$buttonsAnimatedFloat;
                    Object first2 = BrSimBannerGuiKt.BrSimBannerGui$lambda$17(this.$valueForAppear$delegate).getFirst();
                    TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(((Number) BrSimBannerGuiKt.BrSimBannerGui$lambda$17(this.$valueForAppear$delegate).getSecond()).intValue(), 0, EasingKt.getLinearEasing(), 2, null);
                    this.label = 2;
                    if (Animatable.animateTo$default(animatable2, first2, tweenSpecTween$default2, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BrSimBannerGuiKt.BrSimBannerGui$lambda$25(this.$isInitInterface$delegate, true);
            return Unit.INSTANCE;
        }

        /* compiled from: BrSimBannerGui.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$4$1", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {162}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PagerState $pagerState;
            public final /* synthetic */ MutableIntState $ticksForPager$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PagerState pagerState, MutableIntState mutableIntState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$pagerState = pagerState;
                this.$ticksForPager$delegate = mutableIntState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$pagerState, this.$ticksForPager$delegate, continuation);
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
                    PagerState pagerState = this.$pagerState;
                    SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.5f, 400.0f, null, 4, null);
                    this.label = 1;
                    if (PagerState.animateScrollToPage$default(pagerState, 1, 0.0f, springSpecSpring$default, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BrSimBannerGuiKt.BrSimBannerGui$lambda$5(this.$ticksForPager$delegate, 0);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: BrSimBannerGui.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$4$2", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {173}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerGui$4$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PagerState $pagerState;
            public final /* synthetic */ MutableIntState $ticksForPager$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PagerState pagerState, MutableIntState mutableIntState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$pagerState = pagerState;
                this.$ticksForPager$delegate = mutableIntState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$pagerState, this.$ticksForPager$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PagerState pagerState = this.$pagerState;
                    SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.5f, 400.0f, null, 4, null);
                    this.label = 1;
                    if (PagerState.animateScrollToPage$default(pagerState, 0, 0.0f, springSpecSpring$default, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                BrSimBannerGuiKt.BrSimBannerGui$lambda$5(this.$ticksForPager$delegate, 0);
                return Unit.INSTANCE;
            }
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BrSimBannerContent(final List<BrSimBannerItem> list, final PagerState pagerState, final CoroutineScope coroutineScope, final boolean z, final AnnotatedString annotatedString, final Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final float f, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i, final int i2) {
        final Composer composerStartRestartGroup = composer.startRestartGroup(661436273);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(661436273, i, i2, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerContent (BrSimBannerGui.kt:249)");
        }
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6);
        final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6);
        final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6);
        final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composerStartRestartGroup, 6);
        final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6);
        final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6);
        final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composerStartRestartGroup, 6);
        final float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(R.dimen._85wdp, composerStartRestartGroup, 6);
        final float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6);
        final float fDimensionResource11 = PrimitiveResources_androidKt.dimensionResource(R.dimen._186wdp, composerStartRestartGroup, 6);
        final float fDimensionResource12 = PrimitiveResources_androidKt.dimensionResource(R.dimen._196wdp, composerStartRestartGroup, 6);
        final float fDimensionResource13 = PrimitiveResources_androidKt.dimensionResource(R.dimen._202wdp, composerStartRestartGroup, 6);
        final float fDimensionResource14 = PrimitiveResources_androidKt.dimensionResource(R.dimen._360wdp, composerStartRestartGroup, 6);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-270267587);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Measurer();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Measurer measurer = (Measurer) objRememberedValue;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ConstraintLayoutScope();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composerStartRestartGroup, 4544);
        MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
        final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
        final int i3 = 6;
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$$inlined$ConstraintLayout$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
            }
        }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer2, int i4) {
                if (((i4 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    final ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent11 = constrainedLayoutReferencesCreateRefs.component11();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent12 = constrainedLayoutReferencesCreateRefs.component12();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent13 = constrainedLayoutReferencesCreateRefs.component13();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    ContentScale.Companion companion3 = ContentScale.INSTANCE;
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, modifierFillMaxSize$default2, null, companion3.getCrop(), 0.0f, null, 0, composer2, 3128, 116);
                    BoxKt.Box(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent3, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                            invoke2(constrainScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                            Dimension.Companion companion4 = Dimension.INSTANCE;
                            constrainAs.setHeight(companion4.getFillToConstraints());
                            constrainAs.setWidth(companion4.percent(0.58f));
                        }
                    }), composer2, 0);
                    composer2.startReplaceableGroup(-11951282);
                    boolean zChanged = composer2.changed(fDimensionResource3);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        final float f2 = fDimensionResource3;
                        objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f2, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                Dimension.Companion companion4 = Dimension.INSTANCE;
                                constrainAs.setWidth(companion4.getFillToConstraints());
                                constrainAs.setHeight(companion4.percent(0.13f));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4);
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(R.string.br_sim_banner_title, composer2, 6);
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    TextStyle textStyleM14772artegraSansExBlackItalicCustomSp2884n0o = typographyStyle.m14772artegraSansExBlackItalicCustomSp2884n0o(R.dimen._40wsp, 0L, companion6.m13558getCentere0LSkKk(), OffsetKt.Offset(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), composer2, 0), 0.0f), 0.0f, ColorResources_androidKt.colorResource(R.color.red, composer2, 6), composer2, 1572870, 18);
                    FontStyle.Companion companion7 = FontStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource, modifierFillMaxWidth$default, 0L, 0L, FontStyle.m13271boximpl(companion7.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14772artegraSansExBlackItalicCustomSp2884n0o, composer2, 48, 0, 65516);
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.br_sim_banner_title, composer2, 6), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0L, 0L, FontStyle.m13271boximpl(companion7.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14772artegraSansExBlackItalicCustomSp2884n0o(R.dimen._40wsp, 0L, companion6.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), composer2, 0)), ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), composer2, 0), 0L, composer2, 1572870, 34), composer2, 48, 0, 65516);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Boolean boolValueOf = Boolean.valueOf(z);
                    final float f3 = fDimensionResource5;
                    final Function0 function04 = function02;
                    ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer2, 130193764, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        public final void invoke(@Nullable Composer composer3, int i5) {
                            if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(130193764, i5, -1, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerContent.<anonymous>.<anonymous> (BrSimBannerGui.kt:340)");
                                }
                                ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent2;
                                composer3.startReplaceableGroup(720410924);
                                boolean zChanged2 = composer3.changed(constrainedLayoutReferenceComponent1) | composer3.changed(f3);
                                final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent1;
                                final float f4 = f3;
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$4$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference2.getTop(), f4, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs2 = constraintLayoutScope3.constrainAs(companion8, constrainedLayoutReference, (Function1) objRememberedValue5);
                                long jTransformOrigin = TransformOriginKt.TransformOrigin(1.0f, 0.5f);
                                composer3.startReplaceableGroup(720411335);
                                boolean zChanged3 = composer3.changed(function04);
                                final Function0<Unit> function05 = function04;
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$4$2$1
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
                                            function05.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceableGroup();
                                CloseButtonWithGradientKt.m15071CloseButtonWithGradientRYX2cs4(modifierConstrainAs2, R.drawable.ic_close_gradient_gray, jTransformOrigin, (Function0) objRememberedValue6, composer3, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ((i >> 9) & 14) | 48);
                    composer2.startReplaceableGroup(-11949016);
                    boolean zChanged2 = composer2.changed(constrainedLayoutReferenceComponent1) | composer2.changed(fDimensionResource4);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        final float f4 = fDimensionResource4;
                        objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f4, 0.0f, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    TextKt.m10025TextIbK3jfQ(StringResourceCompose.INSTANCE.purchaseSimCards(composer2, 6), constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue5), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14782artegraSansExtendedRegularCustomSpbl3sdaw(R.dimen._10wsp, 0L, companion6.m13563getStarte0LSkKk(), 0L, 0.0f, composer2, 196614, 26), composer2, 0, 0, 131068);
                    composer2.startReplaceableGroup(-11948611);
                    boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent4) | composer2.changed(constrainedLayoutReferenceComponent3) | composer2.changed(fDimensionResource7);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        final float f5 = fDimensionResource7;
                        objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getBottom(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent3.getStart(), f5, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent3.getEnd(), 0.0f, 0.0f, 6, null);
                                Dimension.Companion companion8 = Dimension.INSTANCE;
                                constrainAs.setWidth(companion8.getFillToConstraints());
                                constrainAs.setHeight(companion8.percent(0.65f));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue6);
                    Alignment center = companion4.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierConstrainAs2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BrSimBannerHorizontalPagerKt.BrSimBannerHorizontalPager(list, pagerState, composer2, (i & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-11948071);
                    boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent5);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$8$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent5.getStart(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent5.getTop(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent5.getBottom(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue7);
                    boolean canScrollBackward = pagerState.getCanScrollBackward();
                    final PagerState pagerState2 = pagerState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    Function0<Unit> function05 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* compiled from: BrSimBannerGui.kt */
                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$9$1", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {392}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                        /* renamed from: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$9$1 */
                        /* loaded from: classes2.dex */
                        public static final class C50341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ PagerState $pagerState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C50341(PagerState pagerState, Continuation<? super C50341> continuation) {
                                super(2, continuation);
                                this.$pagerState = pagerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C50341(this.$pagerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C50341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    PagerState pagerState = this.$pagerState;
                                    SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.5f, 400.0f, null, 4, null);
                                    this.label = 1;
                                    if (PagerState.animateScrollToPage$default(pagerState, 0, 0.0f, springSpecSpring$default, this, 2, null) == coroutine_suspended) {
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
                            if (pagerState2.getCurrentPage() != 0) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C50341(pagerState2, null), 3, null);
                            }
                        }
                    };
                    final PagerState pagerState3 = pagerState;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs3, null, canScrollBackward, null, true, false, false, false, null, 0, 0L, null, function05, ComposableLambdaKt.composableLambda(composer2, 867691021, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$10
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
                        public final void invoke(@Nullable Composer composer3, int i5) {
                            if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(867691021, i5, -1, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerContent.<anonymous>.<anonymous> (BrSimBannerGui.kt:402)");
                                }
                                Modifier modifierRotate = RotateKt.rotate(SizeKt.fillMaxSize(Modifier.INSTANCE, 0.09f), 270.0f);
                                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_arrow_up, composer3, 6);
                                composer3.startReplaceableGroup(720413476);
                                long jColorResource = pagerState3.getCurrentPage() == 0 ? ColorResources_androidKt.colorResource(R.color.white_25, composer3, 6) : Color.INSTANCE.m11377getWhite0d7_KjU();
                                composer3.endReplaceableGroup();
                                IconKt.m9496Iconww6aTOc(painterPainterResource, (String) null, modifierRotate, jColorResource, composer3, 440, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, CpioConstants.C_ISBLK, 3072, 4074);
                    composer2.startReplaceableGroup(-11946754);
                    boolean zChanged5 = composer2.changed(constrainedLayoutReferenceComponent5);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$11$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent5.getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent5.getTop(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent5.getBottom(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs4 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent7, (Function1) objRememberedValue8);
                    boolean canScrollForward = pagerState.getCanScrollForward();
                    final PagerState pagerState4 = pagerState;
                    final CoroutineScope coroutineScope3 = coroutineScope;
                    Function0<Unit> function06 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* compiled from: BrSimBannerGui.kt */
                        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$12$1", m7120f = "BrSimBannerGui.kt", m7121i = {}, m7122l = {424}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                        /* renamed from: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$12$1 */
                        /* loaded from: classes2.dex */
                        public static final class C50331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            public final /* synthetic */ PagerState $pagerState;
                            public int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C50331(PagerState pagerState, Continuation<? super C50331> continuation) {
                                super(2, continuation);
                                this.$pagerState = pagerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                return new C50331(this.$pagerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                return ((C50331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    PagerState pagerState = this.$pagerState;
                                    SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.5f, 400.0f, null, 4, null);
                                    this.label = 1;
                                    if (PagerState.animateScrollToPage$default(pagerState, 1, 0.0f, springSpecSpring$default, this, 2, null) == coroutine_suspended) {
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
                            if (pagerState4.getCurrentPage() != 1) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C50331(pagerState4, null), 3, null);
                            }
                        }
                    };
                    final PagerState pagerState5 = pagerState;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs4, null, canScrollForward, null, true, false, false, false, null, 0, 0L, null, function06, ComposableLambdaKt.composableLambda(composer2, -262758858, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$13
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        public final void invoke(@Nullable Composer composer3, int i5) {
                            if ((i5 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-262758858, i5, -1, "com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerContent.<anonymous>.<anonymous> (BrSimBannerGui.kt:433)");
                            }
                            ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                            Modifier.Companion companion8 = Modifier.INSTANCE;
                            ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent7;
                            composer3.startReplaceableGroup(720414632);
                            boolean zChanged6 = composer3.changed(constrainedLayoutReferenceComponent5);
                            final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent5;
                            Object objRememberedValue9 = composer3.rememberedValue();
                            if (zChanged6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$13$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference2.getEnd(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference2.getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference2.getBottom(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue9);
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierFillMaxSize = SizeKt.fillMaxSize(RotateKt.rotate(constraintLayoutScope3.constrainAs(companion8, constrainedLayoutReference, (Function1) objRememberedValue9), 90.0f), 0.09f);
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_arrow_up, composer3, 6);
                            composer3.startReplaceableGroup(720415027);
                            long jColorResource = pagerState5.getCurrentPage() == 1 ? ColorResources_androidKt.colorResource(R.color.white_25, composer3, 6) : Color.INSTANCE.m11377getWhite0d7_KjU();
                            composer3.endReplaceableGroup();
                            IconKt.m9496Iconww6aTOc(painterPainterResource, (String) null, modifierFillMaxSize, jColorResource, composer3, 56, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, CpioConstants.C_ISBLK, 3072, 4074);
                    composer2.startReplaceableGroup(-11945221);
                    boolean zChanged6 = composer2.changed(constrainedLayoutReferenceComponent4);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChanged6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$14$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent4.getStart(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceableGroup();
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.br_sim_banner_footnote, composer2, 6), PaddingKt.m8127paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent8, (Function1) objRememberedValue9), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer2, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._7wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 0, 65532);
                    composer2.startReplaceableGroup(-11944752);
                    boolean zChanged7 = composer2.changed(fDimensionResource2);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChanged7 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        final float f6 = fDimensionResource2;
                        objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$15$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f6, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs5 = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent11, (Function1) objRememberedValue10);
                    composer2.startReplaceableGroup(-11944561);
                    boolean z2 = (((i2 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(function03)) || (i2 & 48) == 32;
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (z2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        final Function0 function07 = function03;
                        objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$16$1
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
                                function07.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceableGroup();
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs5, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue11, ComposableSingletons$BrSimBannerGuiKt.INSTANCE.m14912getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                    composer2.startReplaceableGroup(-11944147);
                    boolean zChanged8 = composer2.changed(fDimensionResource10) | composer2.changed(fDimensionResource9) | composer2.changed(fDimensionResource12) | composer2.changed(fDimensionResource11);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (zChanged8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        final float f7 = fDimensionResource10;
                        final float f8 = fDimensionResource9;
                        final float f9 = fDimensionResource12;
                        final float f10 = fDimensionResource11;
                        objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$17$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f7, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f8, 0.0f, 4, null);
                                Dimension.Companion companion8 = Dimension.INSTANCE;
                                constrainAs.setWidth(companion8.m13972value0680j_4(f9));
                                constrainAs.setHeight(companion8.m13972value0680j_4(f10));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceableGroup();
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent9, (Function1) objRememberedValue12), null, companion3.getFillBounds(), 0.0f, null, 0, composer2, 3080, 116);
                    composer2.startReplaceableGroup(-11943677);
                    boolean zChanged9 = composer2.changed(fDimensionResource8) | composer2.changed(fDimensionResource6) | composer2.changed(fDimensionResource14) | composer2.changed(fDimensionResource13);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChanged9 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        final float f11 = fDimensionResource8;
                        final float f12 = fDimensionResource6;
                        final float f13 = fDimensionResource14;
                        final float f14 = fDimensionResource13;
                        objRememberedValue13 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$18$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f11, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f12, 0.0f, 4, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                Dimension.Companion companion8 = Dimension.INSTANCE;
                                constrainAs.setWidth(companion8.m13972value0680j_4(f13));
                                constrainAs.setHeight(companion8.m13972value0680j_4(f14));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue13);
                    }
                    composer2.endReplaceableGroup();
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, AlphaKt.alpha(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue13), f), null, companion3.getFillBounds(), 0.0f, null, 0, composer2, 3080, 116);
                    composer2.startReplaceableGroup(-11943155);
                    boolean zChanged10 = composer2.changed(constrainedLayoutReferenceComponent10) | composer2.changed(fDimensionResource) | composer2.changed(constrainedLayoutReferenceComponent13);
                    Object objRememberedValue14 = composer2.rememberedValue();
                    if (zChanged10 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        final float f15 = fDimensionResource;
                        objRememberedValue14 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$19$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent10.getBottom(), f15, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent13.getEnd(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue14);
                    }
                    composer2.endReplaceableGroup();
                    TextKt.m10025TextIbK3jfQ(annotatedString, AlphaKt.alpha(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent12, (Function1) objRememberedValue14), f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, (i >> 12) & 14, 0, 131068);
                    composer2.startReplaceableGroup(-11942638);
                    boolean zChanged11 = composer2.changed(constrainedLayoutReferenceComponent11) | composer2.changed(fDimensionResource2);
                    Object objRememberedValue15 = composer2.rememberedValue();
                    if (zChanged11 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        final float f16 = fDimensionResource2;
                        objRememberedValue15 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$20$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                invoke2(constrainScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent11.getTop(), f16, 0.0f, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue15);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent13, (Function1) objRememberedValue15), PrimitiveResources_androidKt.dimensionResource(R.dimen._214wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composer2, 6));
                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.br_sim_banner_watch_tariff, composer2, 6);
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122);
                    composer2.startReplaceableGroup(-11941968);
                    boolean z3 = (((i & 1879048192) ^ 805306368) > 536870912 && composerStartRestartGroup.changed(function0)) || (i & 805306368) == 536870912;
                    Object objRememberedValue16 = composer2.rememberedValue();
                    if (z3 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        final Function0 function08 = function0;
                        objRememberedValue16 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt$BrSimBannerContent$1$21$1
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
                                function08.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue16);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8174sizeVpY3zN4, null, strStringResource2, textStyleM14811montserratBoldCustomSpIzzofJo, 0.0f, 2, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue16, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 0, 0, 16777170);
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        function0Component2.invoke();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), measurePolicyComponent1, composerStartRestartGroup, 48, 0);
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.BrSimBannerContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    BrSimBannerGuiKt.BrSimBannerContent(list, pagerState, coroutineScope, z, annotatedString, bitmap, bitmap2, bitmap3, f, function0, function02, function03, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBrSimBannerGui(@Nullable Composer composer, final int i) throws Resources.NotFoundException {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(928166273);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(928166273, i, -1, "com.blackhub.bronline.game.ui.brsimbanner.PreviewBrSimBannerGui (BrSimBannerGui.kt:543)");
            }
            final List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItem[]{new BrSimBannerItem(StringResources_androidKt.stringResource(R.string.br_sim_banner_text_for_pager_1, composerStartRestartGroup, 6), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_1, composerStartRestartGroup, 6)), R.color.gray, R.drawable.ic_br_logo_no_white, 0.8f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_2, composerStartRestartGroup, 6)), R.color.gray, R.drawable.ic_youtube, 0.7f, 0.0f, 16, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_3, composerStartRestartGroup, 6)), R.color.gray, R.drawable.ic_twitch, 0.7f, 0.0f, 16, null)}), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_4, composerStartRestartGroup, 6)), R.color.yellow, R.drawable.vip_gold, 0.0f, 0.0f, 24, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_5, composerStartRestartGroup, 6)), R.color.light_blue, R.drawable.x2_cash, 1.5f, 0.0f, 16, null)})), new BrSimBannerItem(StringResources_androidKt.stringResource(R.string.br_sim_banner_text_for_pager_2, composerStartRestartGroup, 6), CollectionsKt__CollectionsKt.listOf((Object[]) new BrSimBannerItemForRowStateModel[]{new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_6, composerStartRestartGroup, 6)), R.color.yellow, R.drawable.vip_gold, 0.0f, 0.0f, 24, null), new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_7, composerStartRestartGroup, 6)), R.color.light_blue, R.drawable.ic_br_sim_banner_skin, 0.0f, 0.8f, 8, null)}), CollectionsKt__CollectionsJVMKt.listOf(new BrSimBannerItemForRowStateModel(StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.br_sim_banner_prize_8, composerStartRestartGroup, 6)), R.color.dark_orange, R.drawable.ic_br_sim_banner_car_for_month, 0.0f, 1.3f, 8, null)))});
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.PreviewBrSimBannerGui.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(listListOf.size());
                }
            }, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString("car name");
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Bitmap bitmap = BitmapUtilsKt.getBitmap(resources, R.drawable.ic_br_logo);
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            composer2 = composerStartRestartGroup;
            BrSimBannerContent(listListOf, pagerStateRememberPagerState, coroutineScope, false, annotatedStringHtmlTextToAnnotatedString, bitmap, null, BitmapUtilsKt.getBitmap(resources2, R.drawable.ic_br_logo), 0.5f, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.PreviewBrSimBannerGui.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.PreviewBrSimBannerGui.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.PreviewBrSimBannerGui.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 924585480, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.brsimbanner.BrSimBannerGuiKt.PreviewBrSimBannerGui.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) throws Resources.NotFoundException {
                    BrSimBannerGuiKt.PreviewBrSimBannerGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int BrSimBannerGui$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void BrSimBannerGui$lambda$5(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final boolean BrSimBannerGui$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final int BrSimBannerGui$lambda$10(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void BrSimBannerGui$lambda$11(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final BrSimBannerCarModel BrSimBannerGui$lambda$13(MutableState<BrSimBannerCarModel> mutableState) {
        return mutableState.getValue();
    }

    public static final void BrSimBannerGui$lambda$14(MutableState<BrSimBannerCarModel> mutableState, BrSimBannerCarModel brSimBannerCarModel) {
        mutableState.setValue(brSimBannerCarModel);
    }

    public static final Pair<Float, Integer> BrSimBannerGui$lambda$17(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final Pair<Float, Integer> BrSimBannerGui$lambda$19(MutableState<Pair<Float, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean BrSimBannerGui$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean BrSimBannerGui$lambda$24(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

