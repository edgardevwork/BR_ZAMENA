package com.blackhub.bronline.game.p019ui.bprewards;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsServerItemModel;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsText;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowLeftBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsMainUI.kt */
@Metadata(m7104d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u001a÷\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2d\u0010\u001f\u001a`\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00040 2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0007¢\u0006\u0002\u0010.\u001a\r\u0010/\u001a\u00020\u0004H\u0003¢\u0006\u0002\u00100\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, m7105d2 = {"BOTTOM_LEFT_CORNER_RADIUS_FIRST", "", "BOTTOM_LEFT_CORNER_RADIUS_SECOND", "BpRewardsMainUI", "", "modifier", "Landroidx/compose/ui/Modifier;", "isBpRewardsScreen", "", "refreshButtonBitmap", "Landroid/graphics/Bitmap;", "annotatedText", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsText;", "listWithItems", "", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsServerItemModel;", "listOfAlarmsForButtons", "", "isTutorialEnabled", "filterState", "isButtonFilterBlocked", "isHasTanpin", "renderSize", "emptyIconRes", "imagesForFilterList", "Lcom/blackhub/bronline/game/ui/bprewards/BpRewardsFilterButtonImageItem;", "topHintsList", "", "bottomHintsList", "onItemsRequested", "Lkotlin/Function0;", "onItemClick", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "id", "typeOfClickedButton", "itemNameForDialog", "sprayPriceForDialog", "onStartFilterButtonPressed", "Lkotlin/Function1;", "onButtonCasesPressed", "onInfoClick", "onCloseInfoClick", "onButtonUpdateTanpinClicked", "onCloseClick", "(Landroidx/compose/ui/Modifier;ZLandroid/graphics/Bitmap;Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsText;Ljava/util/List;Ljava/util/List;ZIZZIILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;IIII)V", "PreviewBpRewardsMainUI", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBpRewardsMainUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsMainUI.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsMainUIKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,461:1\n1116#2,6:462\n*S KotlinDebug\n*F\n+ 1 BpRewardsMainUI.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsMainUIKt\n*L\n84#1:462,6\n*E\n"})
/* loaded from: classes2.dex */
public final class BpRewardsMainUIKt {
    public static final float BOTTOM_LEFT_CORNER_RADIUS_FIRST = 0.05f;
    public static final float BOTTOM_LEFT_CORNER_RADIUS_SECOND = 0.2f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BpRewardsMainUI(@Nullable Modifier modifier, final boolean z, @Nullable final Bitmap bitmap, @NotNull final BpRewardsText annotatedText, @NotNull final List<BpRewardsServerItemModel> listWithItems, @NotNull final List<Integer> listOfAlarmsForButtons, final boolean z2, final int i, final boolean z3, final boolean z4, final int i2, final int i3, @NotNull final List<BpRewardsFilterButtonImageItem> imagesForFilterList, @NotNull final List<String> topHintsList, @NotNull final List<String> bottomHintsList, @NotNull final Function0<Unit> onItemsRequested, @NotNull final Function4<? super Integer, ? super Integer, ? super String, ? super Integer, Unit> onItemClick, @NotNull final Function1<? super Integer, Unit> onStartFilterButtonPressed, @NotNull final Function0<Unit> onButtonCasesPressed, @NotNull final Function0<Unit> onInfoClick, @NotNull final Function0<Unit> onCloseInfoClick, @NotNull final Function0<Unit> onButtonUpdateTanpinClicked, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i4, final int i5, final int i6, final int i7) {
        Intrinsics.checkNotNullParameter(annotatedText, "annotatedText");
        Intrinsics.checkNotNullParameter(listWithItems, "listWithItems");
        Intrinsics.checkNotNullParameter(listOfAlarmsForButtons, "listOfAlarmsForButtons");
        Intrinsics.checkNotNullParameter(imagesForFilterList, "imagesForFilterList");
        Intrinsics.checkNotNullParameter(topHintsList, "topHintsList");
        Intrinsics.checkNotNullParameter(bottomHintsList, "bottomHintsList");
        Intrinsics.checkNotNullParameter(onItemsRequested, "onItemsRequested");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onStartFilterButtonPressed, "onStartFilterButtonPressed");
        Intrinsics.checkNotNullParameter(onButtonCasesPressed, "onButtonCasesPressed");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onCloseInfoClick, "onCloseInfoClick");
        Intrinsics.checkNotNullParameter(onButtonUpdateTanpinClicked, "onButtonUpdateTanpinClicked");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-397514683);
        Modifier modifier2 = (i7 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-397514683, i4, i5, "com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUI (BpRewardsMainUI.kt:82)");
        }
        composerStartRestartGroup.startReplaceableGroup(900592763);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6);
        final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composerStartRestartGroup, 6);
        final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6);
        final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6);
        Brush.Companion companion = Brush.INSTANCE;
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6);
        Color.Companion companion2 = Color.INSTANCE;
        final BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(fDimensionResource6, companion2.m11377getWhite0d7_KjU());
        final Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, companion2.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 754040608, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.BpRewardsMainUI.1
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
            public final void invoke(@Nullable Composer composer2, int i8) {
                int i9;
                if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(754040608, i8, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUI.<anonymous> (BpRewardsMainUI.kt:114)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_bp_rewards, composer2, 6), (String) null, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 25016, 104);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    final BpRewardsText bpRewardsText = annotatedText;
                    final boolean z5 = z;
                    final Brush brush = brushM11289horizontalGradient8A3gB4$default;
                    final float f = fDimensionResource;
                    final List<BpRewardsServerItemModel> list = listWithItems;
                    final MutableState<Boolean> mutableState2 = mutableState;
                    final int i10 = i;
                    final int i11 = i2;
                    int i12 = i3;
                    final Function4<Integer, Integer, String, Integer, Unit> function4 = onItemClick;
                    final Function0<Unit> function0 = onItemsRequested;
                    final boolean z6 = z4;
                    final boolean z7 = z2;
                    final float f2 = fDimensionResource2;
                    final Brush brush2 = brushM11297verticalGradient8A3gB4$default;
                    final RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    final BorderStroke borderStroke = borderStrokeM7798BorderStrokecXLIe8U;
                    final Function0<Unit> function02 = onInfoClick;
                    final Function0<Unit> function03 = onCloseClick;
                    final boolean z8 = z3;
                    final Bitmap bitmap2 = bitmap;
                    final Function0<Unit> function04 = onButtonUpdateTanpinClicked;
                    final float f3 = fDimensionResource3;
                    final Function0<Unit> function05 = onCloseInfoClick;
                    final float f4 = fDimensionResource5;
                    final float f5 = fDimensionResource4;
                    final List<String> list2 = topHintsList;
                    final List<String> list3 = bottomHintsList;
                    final Function0<Unit> function06 = onButtonCasesPressed;
                    final List<BpRewardsFilterButtonImageItem> list4 = imagesForFilterList;
                    final List<Integer> list5 = listOfAlarmsForButtons;
                    final Function1<Integer, Unit> function1 = onStartFilterButtonPressed;
                    composer2.startReplaceableGroup(-270267587);
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue2 == companion4.getEmpty()) {
                        objRememberedValue2 = new Measurer();
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final Measurer measurer = (Measurer) objRememberedValue2;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion4.getEmpty()) {
                        objRememberedValue3 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion4.getEmpty()) {
                        i9 = i12;
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    } else {
                        i9 = i12;
                    }
                    composer2.endReplaceableGroup();
                    Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue4, measurer, composer2, 4544);
                    MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                    final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                    final int i13 = 6;
                    final int i14 = i9;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$invoke$$inlined$ConstraintLayout$1
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
                    }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$invoke$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i15) {
                            if (((i15 & 11) ^ 2) != 0 || !composer3.getSkipping()) {
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
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent11 = constrainedLayoutReferencesCreateRefs.component11();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent12 = constrainedLayoutReferencesCreateRefs.component12();
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                composer3.startReplaceableGroup(-2115146171);
                                boolean zChanged = composer3.changed(constrainedLayoutReferenceComponent1);
                                Object objRememberedValue5 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$1$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue5);
                                }
                                composer3.endReplaceableGroup();
                                BoxKt.Box(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent9, (Function1) objRememberedValue5), PrimitiveResources_androidKt.dimensionResource(R.dimen._748wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._332wdp, composer3, 6)), composer3, 0);
                                AnnotatedString titleText = bpRewardsText.getTitleText();
                                TextStyle textStyleM14823montserratExtraBoldCustomSp5OKGny8 = TypographyStyle.INSTANCE.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, composer3, 1572870, 62);
                                composer3.startReplaceableGroup(-2115145610);
                                boolean zChanged2 = composer3.changed(constrainedLayoutReferenceComponent2) | composer3.changed(constrainedLayoutReferenceComponent9);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$2$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent2.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent9.getStart(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceableGroup();
                                TextKt.m10025TextIbK3jfQ(titleText, constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyleM14823montserratExtraBoldCustomSp5OKGny8, composer3, 0, 0, 131068);
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                final float f6 = f2;
                                final Brush brush3 = brush2;
                                final RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                                final BorderStroke borderStroke2 = borderStroke;
                                final Function0 function07 = function02;
                                ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer3, -1135977965, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    public final void invoke(@Nullable Composer composer4, int i16) {
                                        if ((i16 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1135977965, i16, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUI.<anonymous>.<anonymous>.<anonymous> (BpRewardsMainUI.kt:163)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent3;
                                        composer4.startReplaceableGroup(717278411);
                                        boolean zChanged3 = composer4.changed(constrainedLayoutReferenceComponent2) | composer4.changed(constrainedLayoutReferenceComponent1) | composer4.changed(f6);
                                        final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent2;
                                        final ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReferenceComponent1;
                                        final float f7 = f6;
                                        Object objRememberedValue7 = composer4.rememberedValue();
                                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$3$1$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference2.getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference2.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference3.getEnd(), f7, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue7);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(modifierM8172size3ABfNKs, constrainedLayoutReference, (Function1) objRememberedValue7);
                                        Brush brush4 = brush3;
                                        RoundedCornerShape roundedCornerShape3 = roundedCornerShape2;
                                        BorderStroke borderStroke3 = borderStroke2;
                                        composer4.startReplaceableGroup(717278834);
                                        boolean zChanged4 = composer4.changed(function07);
                                        final Function0<Unit> function08 = function07;
                                        Object objRememberedValue8 = composer4.rememberedValue();
                                        if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$3$2$1
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
                                            composer4.updateRememberedValue(objRememberedValue8);
                                        }
                                        composer4.endReplaceableGroup();
                                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierConstrainAs, null, 0L, 0L, 0.0f, brush4, roundedCornerShape3, borderStroke3, null, false, false, null, false, false, false, false, 0, null, (Function0) objRememberedValue8, ComposableSingletons$BpRewardsMainUIKt.INSTANCE.m14908getLambda1$app_siteRelease(), composer4, 0, 805306368, 261918);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._112wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer3, 6)), brush, null, 0.0f, 6, null);
                                composer3.startReplaceableGroup(-2115143982);
                                boolean zChanged3 = composer3.changed(f);
                                Object objRememberedValue7 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    final float f7 = f;
                                    objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$4$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f7, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue7);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierBackground$default, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue7);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(717279877);
                                boolean zChanged4 = composer3.changed(function03);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function08 = function03;
                                    objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$5$1$1
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
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                composer3.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue8, ComposableSingletons$BpRewardsMainUIKt.INSTANCE.m14909getLambda2$app_siteRelease(), composer3, 0, 3072, UnixStat.PERM_MASK);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(-2115143221);
                                boolean zChanged5 = composer3.changed(constrainedLayoutReferenceComponent9);
                                Object objRememberedValue9 = composer3.rememberedValue();
                                if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$6$1
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
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent9.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent9.getBottom(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue9);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs2 = constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue9);
                                List list6 = list;
                                MutableState mutableState3 = mutableState2;
                                int i16 = i10;
                                int i17 = i11;
                                int i18 = i14;
                                Function4 function42 = function4;
                                composer3.startReplaceableGroup(-2115142803);
                                boolean zChanged6 = composer3.changed(function0);
                                Object objRememberedValue10 = composer3.rememberedValue();
                                if (zChanged6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function09 = function0;
                                    objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$7$1
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
                                            function09.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue10);
                                }
                                composer3.endReplaceableGroup();
                                BpRewardsLazyGridBlockKt.BpRewardsLazyGridBlock(modifierConstrainAs2, list6, mutableState3, i16, i17, i18, function42, (Function0) objRememberedValue10, composer3, 448, 0);
                                Boolean boolValueOf2 = Boolean.valueOf(z6);
                                final boolean z9 = z7;
                                final boolean z10 = z8;
                                final Bitmap bitmap3 = bitmap2;
                                final MutableState mutableState4 = mutableState2;
                                final Function0 function010 = function04;
                                ComposeExtensionKt.IfTrue(boolValueOf2, ComposableLambdaKt.composableLambda(composer3, -561352836, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$8
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                        if ((i19 & 11) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-561352836, i19, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUI.<anonymous>.<anonymous>.<anonymous> (BpRewardsMainUI.kt:223)");
                                            }
                                            ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                                            Modifier.Companion companion7 = Modifier.INSTANCE;
                                            ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent10;
                                            composer4.startReplaceableGroup(717281006);
                                            boolean zChanged7 = composer4.changed(constrainedLayoutReferenceComponent9);
                                            final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent9;
                                            Object objRememberedValue11 = composer4.rememberedValue();
                                            if (zChanged7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$8$1$1
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
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference2.getTop(), 0.0f, 0.0f, 6, null);
                                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference2.getEnd(), 0.0f, 0.0f, 6, null);
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue11);
                                            }
                                            composer4.endReplaceableGroup();
                                            Modifier modifierConstrainAs3 = constraintLayoutScope3.constrainAs(companion7, constrainedLayoutReference, (Function1) objRememberedValue11);
                                            boolean z11 = (z9 || z10) ? false : true;
                                            Bitmap bitmap4 = bitmap3;
                                            MutableState<Boolean> mutableState5 = mutableState4;
                                            composer4.startReplaceableGroup(717281475);
                                            boolean zChanged8 = composer4.changed(function010);
                                            final Function0<Unit> function011 = function010;
                                            Object objRememberedValue12 = composer4.rememberedValue();
                                            if (zChanged8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$8$2$1
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
                                                        function011.invoke();
                                                    }
                                                };
                                                composer4.updateRememberedValue(objRememberedValue12);
                                            }
                                            composer4.endReplaceableGroup();
                                            BpRewardsFilterButtonItemKt.BpRewardsFilterButtonItem(modifierConstrainAs3, bitmap4, true, mutableState5, z11, 0.0f, 0, (Function0) objRememberedValue12, composer4, 1576384, 32);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 48);
                                Boolean boolValueOf3 = Boolean.valueOf(z7);
                                final float f8 = f3;
                                final Function0 function011 = function05;
                                final float f9 = f4;
                                final float f10 = f5;
                                final BpRewardsText bpRewardsText2 = bpRewardsText;
                                final List list7 = list2;
                                final List list8 = list3;
                                ComposeExtensionKt.IfTrue(boolValueOf3, ComposableLambdaKt.composableLambda(composer3, -1746428005, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                        if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1746428005, i19, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUI.<anonymous>.<anonymous>.<anonymous> (BpRewardsMainUI.kt:240)");
                                        }
                                        Modifier.Companion companion7 = Modifier.INSTANCE;
                                        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(companion7, 0.0f, 1, null), null, ColorResources_androidKt.colorResource(R.color.total_black_90, composer4, 6), 0L, 0.0f, 0.0f, null, ComposableSingletons$BpRewardsMainUIKt.INSTANCE.m14910getLambda3$app_siteRelease(), composer4, 12582918, 122);
                                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._194wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent7;
                                        composer4.startReplaceableGroup(717282074);
                                        boolean zChanged7 = composer4.changed(constrainedLayoutReferenceComponent4);
                                        final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent4;
                                        Object objRememberedValue11 = composer4.rememberedValue();
                                        if (zChanged7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$1$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference2.getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference2.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference2.getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceableGroup();
                                        Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                                        final BpRewardsText bpRewardsText3 = bpRewardsText2;
                                        CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope3.constrainAs(modifierM8158height3ABfNKs, constrainedLayoutReference, (Function1) objRememberedValue11), Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer4, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer4, 6))}), 0L, 0L, 0, 14, (Object) null), null, null, null, new float[]{0.05f, 0.2f}, centerStart, ComposableLambdaKt.composableLambda(composer4, 1131782811, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9.2
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer5, int i20) {
                                                if ((i20 & 11) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1131782811, i20, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BpRewardsMainUI.kt:266)");
                                                    }
                                                    TextKt.m10025TextIbK3jfQ(bpRewardsText3.getTutorialOpenCasesText(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, 0L, 0, 0L, 0.0f, composer5, 196614, 30), composer5, 0, 0, 131070);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }), composer4, 14417920, 28);
                                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                                        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._178wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReferenceComponent8;
                                        composer4.startReplaceableGroup(717283333);
                                        boolean zChanged8 = composer4.changed(f8);
                                        final float f11 = f8;
                                        Object objRememberedValue12 = composer4.rememberedValue();
                                        if (zChanged8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$3$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f11, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs3 = constraintLayoutScope4.constrainAs(modifierM8158height3ABfNKs2, constrainedLayoutReference3, (Function1) objRememberedValue12);
                                        String upperCase = StringResources_androidKt.stringResource(R.string.common_close, composer4, 6).toUpperCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wdp, 0L, 0, 0L, 0.0f, null, null, composer4, 12582918, 126);
                                        composer4.startReplaceableGroup(717283834);
                                        boolean zChanged9 = composer4.changed(function011);
                                        final Function0<Unit> function012 = function011;
                                        Object objRememberedValue13 = composer4.rememberedValue();
                                        if (zChanged9 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue13 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$4$1
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
                                                    function012.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue13);
                                        }
                                        composer4.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierConstrainAs3, null, upperCase, textStyleM14811montserratBoldCustomSpIzzofJo, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue13, composer4, 0, 0, 0, 16777202);
                                        ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                                        ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReferenceComponent11;
                                        composer4.startReplaceableGroup(717283991);
                                        boolean zChanged10 = composer4.changed(constrainedLayoutReferenceComponent5) | composer4.changed(f9);
                                        final ConstrainedLayoutReference constrainedLayoutReference5 = constrainedLayoutReferenceComponent5;
                                        final float f12 = f9;
                                        Object objRememberedValue14 = composer4.rememberedValue();
                                        if (zChanged10 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue14 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$5$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference5.getTop(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference5.getStart(), f12, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue14);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(constraintLayoutScope5.constrainAs(companion7, constrainedLayoutReference4, (Function1) objRememberedValue14), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composer4, 6));
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer4, 6));
                                        final List<String> list9 = list7;
                                        LazyDslKt.LazyRow(modifierM8158height3ABfNKs3, null, null, false, horizontalOrVerticalM8032spacedBy0680j_4, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9.6
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                                invoke2(lazyListScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull LazyListScope LazyRow) {
                                                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                                                final List<String> list10 = list9;
                                                final C5009x869be141 c5009x869be141 = new Function1() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$6$invoke$$inlined$items$default$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    @Nullable
                                                    public final Void invoke(String str) {
                                                        return null;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        return invoke((String) obj);
                                                    }
                                                };
                                                LazyRow.items(list10.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$6$invoke$$inlined$items$default$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                        return invoke(num.intValue());
                                                    }

                                                    @Nullable
                                                    public final Object invoke(int i20) {
                                                        return c5009x869be141.invoke(list10.get(i20));
                                                    }
                                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$6$invoke$$inlined$items$default$4
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(4);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function4
                                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer5, Integer num2) {
                                                        invoke(lazyItemScope, num.intValue(), composer5, num2.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @Composable
                                                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i20, @Nullable Composer composer5, int i21) {
                                                        int i22;
                                                        if ((i21 & 14) == 0) {
                                                            i22 = (composer5.changed(lazyItemScope) ? 4 : 2) | i21;
                                                        } else {
                                                            i22 = i21;
                                                        }
                                                        if ((i21 & 112) == 0) {
                                                            i22 |= composer5.changed(i20) ? 32 : 16;
                                                        }
                                                        if ((i22 & 731) == 146 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-632812321, i22, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                                        }
                                                        BpRewardsHintItemKt.BpRewardsHintItem(true, (String) list10.get(i20), composer5, 6, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                            }
                                        }, composer4, 0, MatroskaExtractor.ID_BLOCK_ADD_ID);
                                        ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope2;
                                        ConstrainedLayoutReference constrainedLayoutReference6 = constrainedLayoutReferenceComponent12;
                                        composer4.startReplaceableGroup(717284781);
                                        boolean zChanged11 = composer4.changed(constrainedLayoutReferenceComponent5) | composer4.changed(f10);
                                        final ConstrainedLayoutReference constrainedLayoutReference7 = constrainedLayoutReferenceComponent5;
                                        final float f13 = f10;
                                        Object objRememberedValue15 = composer4.rememberedValue();
                                        if (zChanged11 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue15 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$7$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference7.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference7.getStart(), C2046Dp.m13666constructorimpl(-f13), 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue15);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierM8158height3ABfNKs4 = SizeKt.m8158height3ABfNKs(constraintLayoutScope6.constrainAs(companion7, constrainedLayoutReference6, (Function1) objRememberedValue15), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composer4, 6));
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_42 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composer4, 6));
                                        final List<String> list10 = list8;
                                        LazyDslKt.LazyRow(modifierM8158height3ABfNKs4, null, null, false, horizontalOrVerticalM8032spacedBy0680j_42, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9.8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                                invoke2(lazyListScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull LazyListScope LazyRow) {
                                                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                                                final List<String> list11 = list10;
                                                final C5013x824b5943 c5013x824b5943 = new Function1() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$8$invoke$$inlined$items$default$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    @Nullable
                                                    public final Void invoke(String str) {
                                                        return null;
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        return invoke((String) obj);
                                                    }
                                                };
                                                LazyRow.items(list11.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$8$invoke$$inlined$items$default$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                        return invoke(num.intValue());
                                                    }

                                                    @Nullable
                                                    public final Object invoke(int i20) {
                                                        return c5013x824b5943.invoke(list11.get(i20));
                                                    }
                                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$9$8$invoke$$inlined$items$default$4
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(4);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function4
                                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer5, Integer num2) {
                                                        invoke(lazyItemScope, num.intValue(), composer5, num2.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @Composable
                                                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i20, @Nullable Composer composer5, int i21) {
                                                        int i22;
                                                        if ((i21 & 14) == 0) {
                                                            i22 = (composer5.changed(lazyItemScope) ? 4 : 2) | i21;
                                                        } else {
                                                            i22 = i21;
                                                        }
                                                        if ((i21 & 112) == 0) {
                                                            i22 |= composer5.changed(i20) ? 32 : 16;
                                                        }
                                                        if ((i22 & 731) == 146 && composer5.getSkipping()) {
                                                            composer5.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-632812321, i22, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                                        }
                                                        BpRewardsHintItemKt.BpRewardsHintItem(false, (String) list11.get(i20), composer5, 6, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                            }
                                        }, composer4, 0, MatroskaExtractor.ID_BLOCK_ADD_ID);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                Boolean boolValueOf4 = Boolean.valueOf(z5);
                                final float f11 = f2;
                                final boolean z11 = z7;
                                final Brush brush4 = brush2;
                                final RoundedCornerShape roundedCornerShape3 = roundedCornerShape;
                                final BorderStroke borderStroke3 = borderStroke;
                                final Function0 function012 = function06;
                                ComposeExtensionKt.IfTrue(boolValueOf4, ComposableLambdaKt.composableLambda(composer3, 1363464122, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$10
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    public final void invoke(@Nullable Composer composer4, int i19) {
                                        if ((i19 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1363464122, i19, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUI.<anonymous>.<anonymous>.<anonymous> (BpRewardsMainUI.kt:328)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer4, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceComponent4;
                                        composer4.startReplaceableGroup(717285707);
                                        boolean zChanged7 = composer4.changed(constrainedLayoutReferenceComponent2) | composer4.changed(constrainedLayoutReferenceComponent3) | composer4.changed(f11);
                                        final ConstrainedLayoutReference constrainedLayoutReference2 = constrainedLayoutReferenceComponent2;
                                        final ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReferenceComponent3;
                                        final float f12 = f11;
                                        Object objRememberedValue11 = composer4.rememberedValue();
                                        if (zChanged7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$10$1$1
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
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference2.getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference2.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference3.getEnd(), f12, 0.0f, 4, null);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceableGroup();
                                        Modifier modifierConstrainAs3 = constraintLayoutScope3.constrainAs(modifierM8172size3ABfNKs, constrainedLayoutReference, (Function1) objRememberedValue11);
                                        boolean z12 = !z11;
                                        Brush brush5 = brush4;
                                        RoundedCornerShape roundedCornerShape4 = roundedCornerShape3;
                                        BorderStroke borderStroke4 = borderStroke3;
                                        composer4.startReplaceableGroup(717286223);
                                        boolean zChanged8 = composer4.changed(function012);
                                        final Function0<Unit> function013 = function012;
                                        Object objRememberedValue12 = composer4.rememberedValue();
                                        if (zChanged8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$10$2$1
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
                                                    function013.invoke();
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer4.endReplaceableGroup();
                                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(modifierConstrainAs3, null, 0L, 0L, 0.0f, brush5, roundedCornerShape4, borderStroke4, null, false, z12, null, true, false, false, false, 0, null, (Function0) objRememberedValue12, ComposableSingletons$BpRewardsMainUIKt.INSTANCE.m14911getLambda4$app_siteRelease(), composer4, 0, 805306752, 256798);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                composer3.startReplaceableGroup(-2115136906);
                                boolean zChanged7 = composer3.changed(constrainedLayoutReferenceComponent9) | composer3.changed(constrainedLayoutReferenceComponent1);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (zChanged7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$11$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent9.getTop(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent1.getStart(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue11), PrimitiveResources_androidKt.dimensionResource(R.dimen._38wdp, composer3, 6));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = Arrangement.INSTANCE.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer3, 6));
                                final List list9 = list4;
                                final boolean z12 = z7;
                                final boolean z13 = z8;
                                final int i19 = i10;
                                final List list10 = list5;
                                final MutableState mutableState5 = mutableState2;
                                final Function1 function12 = function1;
                                LazyDslKt.LazyRow(modifierM8158height3ABfNKs, null, null, false, horizontalOrVerticalM8032spacedBy0680j_4, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$12
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                        invoke2(lazyListScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull LazyListScope LazyRow) {
                                        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                                        final List<BpRewardsFilterButtonImageItem> list11 = list9;
                                        final boolean z14 = z12;
                                        final boolean z15 = z13;
                                        final int i20 = i19;
                                        final List<Integer> list12 = list10;
                                        final MutableState<Boolean> mutableState6 = mutableState5;
                                        final Function1<Integer, Unit> function13 = function12;
                                        final C5005x7c2e2bf5 c5005x7c2e2bf5 = new Function1() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$12$invoke$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            @Nullable
                                            public final Void invoke(BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((BpRewardsFilterButtonImageItem) obj);
                                            }
                                        };
                                        LazyRow.items(list11.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$12$invoke$$inlined$items$default$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            @Nullable
                                            public final Object invoke(int i21) {
                                                return c5005x7c2e2bf5.invoke(list11.get(i21));
                                            }
                                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$12$invoke$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer4, Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer4, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @Composable
                                            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i21, @Nullable Composer composer4, int i22) {
                                                int i23;
                                                if ((i22 & 14) == 0) {
                                                    i23 = (composer4.changed(lazyItemScope) ? 4 : 2) | i22;
                                                } else {
                                                    i23 = i22;
                                                }
                                                if ((i22 & 112) == 0) {
                                                    i23 |= composer4.changed(i21) ? 32 : 16;
                                                }
                                                if ((i23 & 731) == 146 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-632812321, i23, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                                }
                                                final BpRewardsFilterButtonImageItem bpRewardsFilterButtonImageItem = (BpRewardsFilterButtonImageItem) list11.get(i21);
                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                Bitmap image = bpRewardsFilterButtonImageItem.getImage();
                                                boolean z16 = (z14 || z15) ? false : true;
                                                boolean z17 = i20 == bpRewardsFilterButtonImageItem.getId();
                                                Integer num = (Integer) CollectionsKt___CollectionsKt.getOrNull(list12, bpRewardsFilterButtonImageItem.getId() - 1);
                                                int iIntValue = num != null ? num.intValue() : 0;
                                                MutableState mutableState7 = mutableState6;
                                                final Function1 function14 = function13;
                                                BpRewardsFilterButtonItemKt.BpRewardsFilterButtonItem(companion7, image, z17, mutableState7, z16, 0.0f, iIntValue, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt$BpRewardsMainUI$1$1$12$1$1
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
                                                        function14.invoke(Integer.valueOf(bpRewardsFilterButtonImageItem.getId()));
                                                    }
                                                }, composer4, 3142, 32);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                    }
                                }, composer3, 0, MatroskaExtractor.ID_BLOCK_ADD_ID);
                                if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                    function0Component2.invoke();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), measurePolicyComponent1, composer2, 48, 0);
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12583296, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.BpRewardsMainUI.2
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

                public final void invoke(@Nullable Composer composer2, int i8) {
                    BpRewardsMainUIKt.BpRewardsMainUI(modifier3, z, bitmap, annotatedText, listWithItems, listOfAlarmsForButtons, z2, i, z3, z4, i2, i3, imagesForFilterList, topHintsList, bottomHintsList, onItemsRequested, onItemClick, onStartFilterButtonPressed, onButtonCasesPressed, onInfoClick, onCloseInfoClick, onButtonUpdateTanpinClicked, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBpRewardsMainUI(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-558359572);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558359572, i, -1, "com.blackhub.bronline.game.ui.bprewards.PreviewBpRewardsMainUI (BpRewardsMainUI.kt:384)");
            }
            String upperCase = StringResources_androidKt.stringResource(R.string.bp_rewards_title_text, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            BpRewardsText bpRewardsText = new BpRewardsText(StringExtensionKt.htmlTextToAnnotatedString(upperCase), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.bp_rewards_tutorial_btn_cases, composerStartRestartGroup, 6)));
            int filterState = BpRewardsFilterStateEnum.ALL.getFilterState();
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 0, 0, 0, 0, 1});
            List listListOf2 = CollectionsKt__CollectionsJVMKt.listOf(new BpRewardsServerItemModel(0, null, 0, 0, null, null, 0, 0, null, 0, 0, false, null, null, null, 32767, null));
            Color.Companion companion = Color.INSTANCE;
            composer2 = composerStartRestartGroup;
            BpRewardsMainUI(null, false, null, bpRewardsText, listListOf2, listListOf, false, filterState, false, true, 0, R.drawable.ic_reward, CollectionsKt__CollectionsKt.listOf((Object[]) new BpRewardsFilterButtonImageItem[]{new BpRewardsFilterButtonImageItem(1, null, companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(1, null, companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(1, null, companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(1, null, companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(1, null, companion.m11377getWhite0d7_KjU(), null), new BpRewardsFilterButtonImageItem(1, null, companion.m11377getWhite0d7_KjU(), null)}), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"text 1", "text 2", "text 3"}), CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"text 1", "text 2", "text 3"}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function4<Integer, Integer, String, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.2
                public final void invoke(int i2, int i3, @Nullable String str, @Nullable Integer num) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, String str, Integer num3) {
                    invoke(num.intValue(), num2.intValue(), str, num3);
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.3
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920355248, 920350262, 438, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsMainUIKt.PreviewBpRewardsMainUI.9
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
                    BpRewardsMainUIKt.PreviewBpRewardsMainUI(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
