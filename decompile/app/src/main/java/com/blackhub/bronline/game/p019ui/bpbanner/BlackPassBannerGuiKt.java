package com.blackhub.bronline.game.p019ui.bpbanner;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.PainterModifierKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
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
import androidx.compose.p003ui.text.AnnotatedStringKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.common.sensormanager.SensorDataManager;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.core.utils.attachment.RenderAttachment;
import com.blackhub.bronline.game.gui.blackpassbanner.BlackPassBannerUiState;
import com.blackhub.bronline.game.gui.blackpassbanner.viewmodel.BlackPassBannerViewModel;
import com.blackhub.bronline.game.p019ui.bpbanner.uiblock.BlackPassRewardItemKt;
import com.blackhub.bronline.game.p019ui.widget.button.CloseButtonWithGradientKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassBannerGui.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001az\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\fX\u008a\u0084\u0002"}, m7105d2 = {"BTN_CLOSE_PIVOT_FRACTION_X", "", "BTN_CLOSE_PIVOT_FRACTION_Y", "SCALE_X_FOR_BG", "SHADOW_OFFSET", "THREE_SECONDS", "", "BlackPassBannerContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "showBtnClose", "", "offsetX", "title", "", "leftImage", "Landroid/graphics/Bitmap;", "rightImage", "seasonColor", "Landroidx/compose/ui/graphics/Color;", "deluxeRewards", "", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "onGetClick", "Lkotlin/Function0;", "onCloseClick", "BlackPassBannerContent-ueL0Wzs", "(Landroidx/compose/ui/Modifier;ZFLjava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;JLjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BlackPassBannerContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "BlackPassBannerGui", "app_siteRelease", "ticks", "offX", "visible"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassBannerGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassBannerGui.kt\ncom/blackhub/bronline/game/ui/bpbanner/BlackPassBannerGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,479:1\n81#2,11:480\n74#3:491\n487#4,4:492\n491#4,2:500\n495#4:506\n25#5:496\n25#5:535\n1116#6,3:497\n1119#6,3:503\n1116#6,6:507\n1116#6,6:513\n1116#6,6:519\n1116#6,6:525\n955#6,6:536\n487#7:502\n73#8,4:531\n77#8,20:542\n75#9:562\n108#9,2:563\n76#10:565\n109#10,2:566\n81#11:568\n*S KotlinDebug\n*F\n+ 1 BlackPassBannerGui.kt\ncom/blackhub/bronline/game/ui/bpbanner/BlackPassBannerGuiKt\n*L\n95#1:480,11\n98#1:491\n99#1:492,4\n99#1:500,2\n99#1:506\n99#1:496\n227#1:535\n99#1:497,3\n99#1:503,3\n100#1:507,6\n101#1:513,6\n105#1:519,6\n111#1:525,6\n227#1:536,6\n99#1:502\n227#1:531,4\n227#1:542,20\n100#1:562\n100#1:563,2\n101#1:565\n101#1:566,2\n105#1:568\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassBannerGuiKt {
    public static final float BTN_CLOSE_PIVOT_FRACTION_X = 1.0f;
    public static final float BTN_CLOSE_PIVOT_FRACTION_Y = 0.5f;
    public static final float SCALE_X_FOR_BG = 1.1f;
    public static final float SHADOW_OFFSET = 2.0f;
    public static final int THREE_SECONDS = 3;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackPassBannerGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1820802880);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820802880, i, -1, "com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGui (BlackPassBannerGui.kt:93)");
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
            ViewModel viewModel = ViewModelKt.viewModel(BlackPassBannerViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final BlackPassBannerViewModel blackPassBannerViewModel = (BlackPassBannerViewModel) viewModel;
            final BlackPassBannerUiState blackPassBannerUiState = (BlackPassBannerUiState) SnapshotStateKt.collectAsState(blackPassBannerViewModel.getUiState(), null, composerStartRestartGroup, 8, 1).getValue();
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
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
            composerStartRestartGroup.startReplaceableGroup(-1027184558);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1027184501);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            final float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
            Bitmap leftImage = blackPassBannerUiState.getLeftImage();
            Bitmap rightImage = blackPassBannerUiState.getRightImage();
            composerStartRestartGroup.startReplaceableGroup(-1027184366);
            boolean zChanged = composerStartRestartGroup.changed(leftImage) | composerStartRestartGroup.changed(rightImage);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerGui$visible$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(AnyExtensionKt.isNotNull(blackPassBannerUiState.getLeftImage()) && AnyExtensionKt.isNotNull(blackPassBannerUiState.getRightImage()));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final State state = (State) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            final long jColor = ColorKt.Color(blackPassBannerUiState.getSeasonColor());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1027184153);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new BlackPassBannerGuiKt$BlackPassBannerGui$1$1(mutableIntState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 70);
            EffectsKt.DisposableEffect(unit, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerGui.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final SensorDataManager sensorDataManager = new SensorDataManager(context);
                    final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BlackPassBannerGuiKt$BlackPassBannerGui$2$job$1(sensorDataManager, fM14409dpToPx8Feqmps, mutableFloatState, null), 3, null);
                    return new DisposableEffectResult() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerGui$2$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            sensorDataManager.cancel();
                            Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
                        }
                    };
                }
            }, composerStartRestartGroup, 6);
            SurfaceKt.m9876SurfaceT9BRK9s(null, null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -808319483, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerGui.3
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
                            ComposerKt.traceEventStart(-808319483, i2, -1, "com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGui.<anonymous> (BlackPassBannerGui.kt:144)");
                        }
                        boolean zBlackPassBannerGui$lambda$7 = BlackPassBannerGuiKt.BlackPassBannerGui$lambda$7(state);
                        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
                        ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
                        final BlackPassBannerUiState blackPassBannerUiState2 = blackPassBannerUiState;
                        final long j = jColor;
                        final MutableFloatState mutableFloatState2 = mutableFloatState;
                        final MutableIntState mutableIntState2 = mutableIntState;
                        final BlackPassBannerViewModel blackPassBannerViewModel2 = blackPassBannerViewModel;
                        AnimatedVisibilityKt.AnimatedVisibility(zBlackPassBannerGui$lambda$7, (Modifier) null, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, ComposableLambdaKt.composableLambda(composer2, -1373045539, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerGui.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i3) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1373045539, i3, -1, "com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGui.<anonymous>.<anonymous> (BlackPassBannerGui.kt:149)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(ScaleKt.scale(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), 1.1f, 1.1f), 0.0f, 0.0f, 0.0f, -BlackPassBannerGuiKt.BlackPassBannerGui$lambda$4(mutableFloatState2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131063, null);
                                BlackPassBannerUiState blackPassBannerUiState3 = blackPassBannerUiState2;
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(blackPassBannerUiState3.getBgImage(), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer3, 3128, 116);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                boolean z = BlackPassBannerGuiKt.BlackPassBannerGui$lambda$1(mutableIntState2) == 3;
                                float fBlackPassBannerGui$lambda$4 = BlackPassBannerGuiKt.BlackPassBannerGui$lambda$4(mutableFloatState2);
                                String bannerTitle = blackPassBannerUiState2.getBannerTitle();
                                if (bannerTitle == null) {
                                    bannerTitle = "";
                                }
                                String str = bannerTitle;
                                Bitmap leftImage2 = blackPassBannerUiState2.getLeftImage();
                                Bitmap rightImage2 = blackPassBannerUiState2.getRightImage();
                                long j2 = j;
                                List<ImageModel> prizesAttachment = blackPassBannerUiState2.getPrizesAttachment();
                                final BlackPassBannerViewModel blackPassBannerViewModel3 = blackPassBannerViewModel2;
                                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerGui.3.1.2
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
                                        blackPassBannerViewModel3.sendButtonClicked(1);
                                    }
                                };
                                final BlackPassBannerViewModel blackPassBannerViewModel4 = blackPassBannerViewModel2;
                                BlackPassBannerGuiKt.m14902BlackPassBannerContentueL0Wzs(companion2, z, fBlackPassBannerGui$lambda$4, str, leftImage2, rightImage2, j2, prizesAttachment, function0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerGui.3.1.3
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
                                        blackPassBannerViewModel4.sendButtonClicked(0);
                                    }
                                }, composer3, 17072134, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, 12583296, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerGui.4
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
                    BlackPassBannerGuiKt.BlackPassBannerGui(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BlackPassBannerContent-ueL0Wzs, reason: not valid java name */
    public static final void m14902BlackPassBannerContentueL0Wzs(@Nullable Modifier modifier, final boolean z, final float f, @NotNull final String title, @Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, final long j, @NotNull final List<ImageModel> deluxeRewards, @NotNull final Function0<Unit> onGetClick, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deluxeRewards, "deluxeRewards");
        Intrinsics.checkNotNullParameter(onGetClick, "onGetClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        final Composer composerStartRestartGroup = composer.startRestartGroup(-879395315);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-879395315, i, -1, "com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerContent (BlackPassBannerGui.kt:211)");
        }
        final Brush brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(j), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0L, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._240wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0), 0, 10, (Object) null);
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._458wdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._258wdp, composerStartRestartGroup, 6);
        final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6);
        final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6);
        final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6);
        final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composerStartRestartGroup, 6);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
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
        final int i3 = 0;
        final Modifier modifier3 = modifier2;
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent-ueL0Wzs$$inlined$ConstraintLayout$1
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
        }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent-ueL0Wzs$$inlined$ConstraintLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r15v1 */
            /* JADX WARN: Type inference failed for: r15v14 */
            /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
            @Composable
            public final void invoke(@Nullable Composer composer2, int i4) {
                ConstrainedLayoutReference constrainedLayoutReference;
                int i5;
                ?? r15;
                if (((i4 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                    composer2.startReplaceableGroup(-1976225492);
                    if (z) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composer2.startReplaceableGroup(-1976225353);
                        boolean zChanged = composer2.changed(fDimensionResource5);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            final float f2 = fDimensionResource5;
                            objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$1$1
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
                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue4);
                        long jTransformOrigin = TransformOriginKt.TransformOrigin(1.0f, 0.5f);
                        composer2.startReplaceableGroup(-1976224921);
                        boolean z2 = (((i & 1879048192) ^ 805306368) > 536870912 && composerStartRestartGroup.changed(onCloseClick)) || (i & 805306368) == 536870912;
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (z2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            final Function0 function0 = onCloseClick;
                            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$2$1
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
                                    function0.invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceableGroup();
                        i5 = helpersHashCode;
                        r15 = 0;
                        constrainedLayoutReference = constrainedLayoutReferenceComponent5;
                        CloseButtonWithGradientKt.m15071CloseButtonWithGradientRYX2cs4(modifierConstrainAs, R.drawable.ic_close_gradient_gray, jTransformOrigin, (Function0) objRememberedValue5, composer2, 48, 0);
                    } else {
                        constrainedLayoutReference = constrainedLayoutReferenceComponent5;
                        i5 = helpersHashCode;
                        r15 = 0;
                    }
                    composer2.endReplaceableGroup();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer2.startReplaceableGroup(-1976224791);
                    boolean zChanged2 = composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(fDimensionResource4);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        final float f3 = fDimensionResource4;
                        objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$3$1
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
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent2.getTop(), f3, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue6);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, r15);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, Integer.valueOf((int) r15));
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), r15, composer2, r15);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r15);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, Integer.valueOf((int) r15));
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextStyle textStyleM14772artegraSansExBlackItalicCustomSp2884n0o = typographyStyle.m14772artegraSansExBlackItalicCustomSp2884n0o(R.dimen._34wsp, 0L, 0, OffsetKt.Offset(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), composer2, r15), 0.0f), 0.0f, j, composer2, ((i >> 3) & 458752) | 1572870, 22);
                    FontStyle.Companion companion6 = FontStyle.INSTANCE;
                    int i6 = i5;
                    TextKt.m10024Text4IGK_g(title, (Modifier) null, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14772artegraSansExBlackItalicCustomSp2884n0o, composer2, (i >> 9) & 14, 0, 65518);
                    TextKt.m10024Text4IGK_g(title, (Modifier) null, 0L, 0L, FontStyle.m13271boximpl(companion6.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14772artegraSansExBlackItalicCustomSp2884n0o(R.dimen._34wsp, 0L, 0, OffsetKt.Offset(0.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), composer2, 0)), ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer2, 6), composer2, 0), 0L, composer2, 1572870, 38), composer2, (i >> 9) & 14, 0, 65518);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                    TextKt.m10025TextIbK3jfQ(stringResourceCompose.m14395bpBannerSubTitleek8zF_U(j, composer2, ((i >> 18) & 14) | 48), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14773artegraSansExBoldCustomSpbl3sdaw(R.dimen._10wsp, 0L, 0, OffsetKt.Offset(2.0f, 2.0f), 0.0f, composer2, 199686, 22), composer2, 0, 0, 131070);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._248wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._470wdp, composer2, 6));
                    composer2.startReplaceableGroup(-1976222827);
                    boolean zChanged3 = composer2.changed(fDimensionResource4);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        final float f4 = fDimensionResource4;
                        objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$5$1
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
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f4, 0.0f, 4, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs3 = constraintLayoutScope2.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue7);
                    Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierConstrainAs3);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._47wdp, composer2, 6)), brushM11293radialGradientP_VxKs$default, null, 0.0f, 6, null);
                    Alignment center = companion4.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    String strStringResource = StringResources_androidKt.stringResource(R.string.banner_new_season, composer2, 6);
                    TextAlign.Companion companion7 = TextAlign.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14777artegraSansExExtraBoldCustomSpuQo3GSw(R.dimen._24wsp, 0L, companion7.m13558getCentere0LSkKk(), 0L, 0.0f, 0L, 0L, composer2, 12582918, 122), composer2, 0, 0, 65534);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._201wdp, composer2, 6));
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.bg_black_pass_dots, composer2, 6);
                    ContentScale.Companion companion8 = ContentScale.INSTANCE;
                    Modifier modifierPaint$default = PainterModifierKt.paint$default(modifierM8158height3ABfNKs, painterPainterResource, false, null, companion8.getFillBounds(), 0.0f, ColorFilter.INSTANCE.m11384tintxETnrds(ColorResources_androidKt.colorResource(R.color.total_black_70, composer2, 6), BlendMode.INSTANCE.m11282getSrcOver0nO6VwU()), 22, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierPaint$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally3 = companion4.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally3, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    TextKt.m10025TextIbK3jfQ(stringResourceCompose.bpBannerBuyBlackPassPremium(composer2, 6), PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14779artegraSansExMediumCustomSp_ILoA(R.dimen._10wsp, 0L, companion7.m13558getCentere0LSkKk(), 0L, 0.0f, TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._15wsp, composer2, 6)), composer2, 1572870, 26), composer2, 0, 0, 131068);
                    TextKt.m10025TextIbK3jfQ(AnnotatedStringKt.toUpperCase$default(stringResourceCompose.bpBannerMoreRewardInPremiumDeluxe(composer2, 6), null, 1, null), PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 0.0f, 13, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, typographyStyle.m14782artegraSansExtendedRegularCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 3072, 122876);
                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), 0.0f, 8, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer2, 6));
                    StaggeredGridCells.Fixed fixed = new StaggeredGridCells.Fixed(deluxeRewards.size());
                    final List list = deluxeRewards;
                    LazyStaggeredGridDslKt.m8310LazyVerticalStaggeredGridzadm560(fixed, modifierM8158height3ABfNKs2, null, null, false, 0.0f, null, null, false, new Function1<LazyStaggeredGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$6$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridScope lazyStaggeredGridScope) {
                            invoke2(lazyStaggeredGridScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull LazyStaggeredGridScope LazyVerticalStaggeredGrid) {
                            Intrinsics.checkNotNullParameter(LazyVerticalStaggeredGrid, "$this$LazyVerticalStaggeredGrid");
                            final List<ImageModel> list2 = list;
                            LazyVerticalStaggeredGrid.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$6$2$1$1$invoke$$inlined$items$default$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                @Nullable
                                public final Object invoke(int i7) {
                                    list2.get(i7);
                                    return null;
                                }
                            }, null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$6$2$1$1$invoke$$inlined$items$default$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(lazyStaggeredGridItemScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                @Composable
                                public final void invoke(@NotNull LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i7, @Nullable Composer composer3, int i8) {
                                    int i9;
                                    if ((i8 & 14) == 0) {
                                        i9 = (composer3.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i8;
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i8 & 112) == 0) {
                                        i9 |= composer3.changed(i7) ? 32 : 16;
                                    }
                                    if ((i9 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-886456479, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:342)");
                                    }
                                    BlackPassRewardItemKt.BlackPassRewardItem((ImageModel) list2.get(i7), composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                    }, composer2, 0, 508);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1976219263);
                    boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent2);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$7$1
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
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getBottom(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent2.getEnd(), 0.0f, 0.0f, 6, null);
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent2.getBottom(), 0.0f, 0.0f, 6, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue8), fDimensionResource3), PrimitiveResources_androidKt.dimensionResource(R.dimen._214wdp, composer2, 6));
                    String upperCase = StringResources_androidKt.stringResource(R.string.banner_button_show_prices, composer2, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                    Brush brushM11293radialGradientP_VxKs$default2 = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6))}), 0L, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._150wdp, composer2, 6), composer2, 0), 0, 10, (Object) null);
                    composer2.startReplaceableGroup(-1976218458);
                    boolean z3 = (((i & 234881024) ^ 100663296) > 67108864 && composerStartRestartGroup.changed(onGetClick)) || (i & 100663296) == 67108864;
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (z3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        final Function0 function02 = onGetClick;
                        objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$8$1
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
                                function02.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8177width3ABfNKs2, null, upperCase, textStyleM14811montserratBoldCustomSpIzzofJo, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11293radialGradientP_VxKs$default2, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue9, composer2, 0, 0, 0, 16773106);
                    composer2.startReplaceableGroup(-1976218349);
                    boolean zChanged5 = composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(fDimensionResource);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        final float f5 = fDimensionResource;
                        objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$9$1
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
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getTop(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                constrainAs.setHeight(Dimension.INSTANCE.m13972value0680j_4(f5));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(androidx.compose.foundation.layout.OffsetKt.m8081absoluteOffsetVpY3zN4(constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue10), C2046Dp.m13666constructorimpl(-fDimensionResource6), C2046Dp.m13666constructorimpl(-fDimensionResource6)), 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131063, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor7 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, null, null, companion8.getFillHeight(), 0.0f, null, 0, composer2, 3080, 118);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1976217703);
                    boolean zChanged6 = composer2.changed(constrainedLayoutReferenceComponent2) | composer2.changed(fDimensionResource) | composer2.changed(fDimensionResource2);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChanged6 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        final float f6 = fDimensionResource;
                        final float f7 = fDimensionResource2;
                        objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$11$1
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
                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent2.getTop(), 0.0f, 0.0f, 6, null);
                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                Dimension.Companion companion9 = Dimension.INSTANCE;
                                constrainAs.setHeight(companion9.m13972value0680j_4(f6));
                                constrainAs.setWidth(companion9.m13972value0680j_4(f7));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierConstrainAs4 = constraintLayoutScope2.constrainAs(companion3, constrainedLayoutReference, (Function1) objRememberedValue11);
                    float f8 = fDimensionResource6;
                    Modifier modifierM11501graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(androidx.compose.foundation.layout.OffsetKt.m8081absoluteOffsetVpY3zN4(modifierConstrainAs4, f8, C2046Dp.m13666constructorimpl(-f8)), 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131063, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor8 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM11501graphicsLayerAp8cVGQ$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor8);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRememberBoxMeasurePolicy5, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, null, null, companion8.getFillHeight(), 0.0f, null, 0, composer2, 3080, 118);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != i6) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$2
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
                    BlackPassBannerGuiKt.m14902BlackPassBannerContentueL0Wzs(modifier3, z, f, title, bitmap, bitmap2, j, deluxeRewards, onGetClick, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void BlackPassBannerContentPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1725396432);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1725396432, i, -1, "com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerContentPreview (BlackPassBannerGui.kt:453)");
            }
            int i2 = 23;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i3 = 0;
            RenderAttachment renderAttachment = null;
            String str = null;
            ImageTypePathInCDNEnum imageTypePathInCDNEnum = null;
            int i4 = 23;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            int i5 = 0;
            RenderAttachment renderAttachment2 = null;
            String str2 = null;
            ImageTypePathInCDNEnum imageTypePathInCDNEnum2 = null;
            composer2 = composerStartRestartGroup;
            m14902BlackPassBannerContentueL0Wzs(null, true, 0.0f, "", null, null, ColorResources_androidKt.colorResource(R.color.light_blue, composerStartRestartGroup, 6), CollectionsKt__CollectionsKt.listOf((Object[]) new ImageModel[]{new ImageModel(i3, renderAttachment, str, "reward 1 reward reward reward ", imageTypePathInCDNEnum, i2, defaultConstructorMarker), new ImageModel(i5, renderAttachment2, str2, "reward 1", imageTypePathInCDNEnum2, i4, defaultConstructorMarker2), new ImageModel(i3, renderAttachment, str, "reward 1", imageTypePathInCDNEnum, i2, defaultConstructorMarker), new ImageModel(i5, renderAttachment2, str2, "reward 1", imageTypePathInCDNEnum2, i4, defaultConstructorMarker2)}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerContentPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerContentPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 906194352, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt.BlackPassBannerContentPreview.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i6) {
                    BlackPassBannerGuiKt.BlackPassBannerContentPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int BlackPassBannerGui$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final float BlackPassBannerGui$lambda$4(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    public static final boolean BlackPassBannerGui$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
