package com.blackhub.bronline.game.p019ui.rateapp;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.rateapp.RateAppUiState;
import com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientAngle;
import com.blackhub.bronline.game.p019ui.widget.other.GradientOffsetKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RateAppGui.kt */
@SourceDebugExtension({"SMAP\nRateAppGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppGui.kt\ncom/blackhub/bronline/game/ui/rateapp/RateAppGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n1#1,307:1\n81#2,11:308\n*S KotlinDebug\n*F\n+ 1 RateAppGui.kt\ncom/blackhub/bronline/game/ui/rateapp/RateAppGuiKt\n*L\n57#1:308,11\n*E\n"})
/* loaded from: classes2.dex */
public final class RateAppGuiKt {
    public static final float HEIGHT_FOR_CLOSE_IC = 0.3f;
    public static final float HEIGHT_FOR_TITLE = 0.2f;
    public static final float SIZE_FOR_THUMBS_IC = 0.65f;
    public static final float TITLE_TEXT_SHADOW_BLUR = 7.0f;
    public static final float TITLE_TEXT_SHADOW_OFFSET_X = 10.2f;
    public static final float TITLE_TEXT_SHADOW_OFFSET_Y = 2.14f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RateAppGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1531100901);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1531100901, i, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppGui (RateAppGui.kt:54)");
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
            ViewModel viewModel = ViewModelKt.viewModel(RateAppViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final RateAppViewModel rateAppViewModel = (RateAppViewModel) viewModel;
            RateAppUiState rateAppUiState = (RateAppUiState) SnapshotStateKt.collectAsState(rateAppViewModel.getUiState(), null, composerStartRestartGroup, 8, 1).getValue();
            composer2 = composerStartRestartGroup;
            m15023RateAppContenthaDXOXw(PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(rateAppUiState.getHeightForButtonRatePlusShadow(), composerStartRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(rateAppUiState.getWidthForButtonRatePlusShadow(), composerStartRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(rateAppUiState.getPaddingForButtonRate(), composerStartRestartGroup, 0), rateAppUiState.getListOfCheckedStars(), rateAppUiState.isButtonEnabled(), rateAppUiState.isFiveStars(), PrimitiveResources_androidKt.dimensionResource(rateAppUiState.getHeightForItem(), composerStartRestartGroup, 0), new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.RateAppGui.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    rateAppViewModel.onButtonClick(z);
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.RateAppGui.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i2) {
                    rateAppViewModel.onStarClick(i2);
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.RateAppGui.3
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
                    rateAppViewModel.onCloseCLick();
                }
            }, composerStartRestartGroup, 262144, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.RateAppGui.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    RateAppGuiKt.RateAppGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: RateAppContent-haDXOXw, reason: not valid java name */
    public static final void m15023RateAppContenthaDXOXw(final float f, final float f2, final float f3, final float f4, final float f5, @NotNull final List<Boolean> listOfCheckedStars, final boolean z, final boolean z2, final float f6, @NotNull final Function1<? super Boolean, Unit> onButtonClick, @NotNull final Function1<? super Integer, Unit> onStarClick, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(listOfCheckedStars, "listOfCheckedStars");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Intrinsics.checkNotNullParameter(onStarClick, "onStarClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(990935461);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(990935461, i, i2, "com.blackhub.bronline.game.ui.rateapp.RateAppContent (RateAppGui.kt:92)");
        }
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6));
        Brush.Companion companion = Brush.INSTANCE;
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))});
        GradientAngle gradientAngle = GradientAngle.CW0;
        final Brush brushM11291linearGradientmHitzGk$default = Brush.Companion.m11291linearGradientmHitzGk$default(companion, listListOf, GradientOffsetKt.gradientOffset(gradientAngle).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle).m15094getEndF1C5BW0(), 0, 8, (Object) null);
        final Brush brushM11291linearGradientmHitzGk$default2 = Brush.Companion.m11291linearGradientmHitzGk$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), GradientOffsetKt.gradientOffset(gradientAngle).m15095getStartF1C5BW0(), GradientOffsetKt.gradientOffset(gradientAngle).m15094getEndF1C5BW0(), 0, 8, (Object) null);
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._48sdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._62sdp, composerStartRestartGroup, 6);
        FakeDialogKt.m15089FakeDialog3IgeMak(null, ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1297256497, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt$RateAppContent$1
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1297256497, i3, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppContent.<anonymous> (RateAppGui.kt:126)");
                    }
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment center = companion2.getCenter();
                    float f7 = f6;
                    RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    float f8 = f4;
                    boolean z3 = z2;
                    float f9 = f5;
                    float f10 = f3;
                    float f11 = f2;
                    float f12 = f;
                    Brush brush = brushM11291linearGradientmHitzGk$default2;
                    boolean z4 = z;
                    final Function1<Boolean, Unit> function1 = onButtonClick;
                    Brush brush2 = brushM11289horizontalGradient8A3gB4$default;
                    List<Boolean> list = listOfCheckedStars;
                    final Function1<Integer, Unit> function12 = onStarClick;
                    final Function0<Unit> function0 = onCloseClick;
                    float f13 = fDimensionResource2;
                    float f14 = fDimensionResource;
                    Brush brush3 = brushM11291linearGradientmHitzGk$default;
                    composer2.startReplaceableGroup(733328855);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion3, f7), PrimitiveResources_androidKt.dimensionResource(R.dimen._275sdp, composer2, 6)), roundedCornerShape);
                    Alignment center2 = companion2.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClip);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, f8, 7, null), ColorResources_androidKt.colorResource(R.color.black_80, composer2, 6), roundedCornerShape), PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer2, 6), roundedCornerShape);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion3);
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
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.2f), brush2, null, 0.0f, 6, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierAlign = boxScopeInstance.align(companion3, companion2.getCenter());
                    String strStringResource = StringResources_androidKt.stringResource(R.string.common_black_russia, composer2, 6);
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource, modifierAlign, 0L, 0L, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14822montserratExtraBold21spOr16ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), OffsetKt.Offset(10.2f, 2.14f), 7.0f, composer2, MatroskaExtractor.ID_CONTENT_ENCODINGS, 1), composer2, 0, 0, 65516);
                    Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composer2, 6), 0.0f, 11, null), companion2.getCenterEnd()), 0.3f);
                    composer2.startReplaceableGroup(230709632);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt$RateAppContent$1$1$1$1$1$1$1$1
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
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    ComposableSingletons$RateAppGuiKt composableSingletons$RateAppGuiKt = ComposableSingletons$RateAppGuiKt.INSTANCE;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierFillMaxHeight, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, composableSingletons$RateAppGuiKt.m15020getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                    BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion3, companion2.getBottomCenter()), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composer2, 6)), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer2, 6), null, 2, null), composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (z3) {
                        composer2.startReplaceableGroup(-2081182190);
                        composer2.startReplaceableGroup(-2081182084);
                        boolean zChanged2 = composer2.changed(function12);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt$RateAppContent$1$1$1$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                    invoke(num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i4) {
                                    function12.invoke(Integer.valueOf(i4));
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        RateAppFiveStarsUiKt.RateAppFiveStarsUi(list, (Function1) objRememberedValue2, composer2, 8);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-2081181989);
                        RateAppLikeOrDislikeUiKt.RateAppLikeOrDislikeUi(null, composer2, 0, 1);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (z3) {
                        composer2.startReplaceableGroup(1941001389);
                        Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(PaddingKt.m8123padding3ABfNKs(boxScopeInstance.align(companion3, companion2.getBottomCenter()), f9), f10, f11);
                        Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._117sdp, composer2, 6), f12);
                        TextStyle textStyleM14795montserratBold16spOr13ssp67j0QOw = typographyStyle.m14795montserratBold16spOr13ssp67j0QOw(0L, companion5.m13558getCentere0LSkKk(), Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer2, 24960, 9);
                        String upperCase = StringResources_androidKt.stringResource(R.string.common_rate, composer2, 6).toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        composer2.startReplaceableGroup(1941002452);
                        boolean zChanged3 = composer2.changed(function1);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt$RateAppContent$1$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.FALSE);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8174sizeVpY3zN4, modifierM8174sizeVpY3zN42, upperCase, textStyleM14795montserratBold16spOr13ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brush, null, null, 0.0f, 0.0f, z4, false, null, z4, false, false, null, (Function0) objRememberedValue3, composer2, 0, 0, 0, 15593456);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1941002523);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(boxScopeInstance.align(companion3, companion2.getBottomCenter()), f11), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
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
                        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), f13);
                        Modifier modifierM8174sizeVpY3zN43 = SizeKt.m8174sizeVpY3zN4(companion3, f14, f12);
                        composer2.startReplaceableGroup(-2132140299);
                        boolean zChanged4 = composer2.changed(function1);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt$RateAppContent$1$1$1$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.FALSE);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierM8177width3ABfNKs, modifierM8174sizeVpY3zN43, 0L, 0L, 0.0f, brush3, null, null, null, false, false, null, false, false, false, false, 0, null, (Function0) objRememberedValue4, composableSingletons$RateAppGuiKt.m15021getLambda2$app_siteRelease(), composer2, 0, 805306368, 262108);
                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), f13);
                        Modifier modifierM8174sizeVpY3zN44 = SizeKt.m8174sizeVpY3zN4(companion3, f14, f12);
                        composer2.startReplaceableGroup(-2132139273);
                        boolean zChanged5 = composer2.changed(function1);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt$RateAppContent$1$1$1$3$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    function1.invoke(Boolean.TRUE);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceableGroup();
                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierM8177width3ABfNKs2, modifierM8174sizeVpY3zN44, 0L, 0L, 0.0f, brush, null, null, null, true, false, null, false, false, false, false, 0, null, (Function0) objRememberedValue5, composableSingletons$RateAppGuiKt.m15022getLambda3$app_siteRelease(), composer2, 805306368, 805306368, 261596);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt$RateAppContent$2
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
                    RateAppGuiKt.m15023RateAppContenthaDXOXw(f, f2, f3, f4, f5, listOfCheckedStars, z, z2, f6, onButtonClick, onStarClick, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewRateAppContent(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1134341551);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1134341551, i, -1, "com.blackhub.bronline.game.ui.rateapp.PreviewRateAppContent (RateAppGui.kt:280)");
            }
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
            float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
            float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._117sdp, composerStartRestartGroup, 6);
            float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composerStartRestartGroup, 6);
            float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6);
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            composer2 = composerStartRestartGroup;
            m15023RateAppContenthaDXOXw(fDimensionResource, fDimensionResource2, fDimensionResource3, fDimensionResource4, fDimensionResource5, CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{bool, bool, bool2, bool2, bool2}), false, true, PrimitiveResources_androidKt.dimensionResource(R.dimen._141sdp, composerStartRestartGroup, 6), new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.PreviewRateAppContent.1
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool3) {
                    invoke(bool3.booleanValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.PreviewRateAppContent.2
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.PreviewRateAppContent.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 819658752, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppGuiKt.PreviewRateAppContent.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    RateAppGuiKt.PreviewRateAppContent(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

