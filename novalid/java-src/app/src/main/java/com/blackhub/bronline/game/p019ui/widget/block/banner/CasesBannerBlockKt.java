package com.blackhub.bronline.game.p019ui.widget.block.banner;

import android.graphics.Bitmap;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerAttachment;
import com.blackhub.bronline.game.gui.cases.model.CasesBannerSelectedCase;
import com.blackhub.bronline.game.p019ui.cases.CaseRewardCardKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselScrollState;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.SliderVerticalScrollerKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBannerBlock.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"SCALE_RIGHT_IMAGE", "", "WIDTH", "CasesBannerBlock", "", "bannerAttachment", "Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;", "isShining", "", "isScrollVisible", "onClickToOpen", "Lkotlin/Function0;", "onClickToClose", "(Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerAttachment;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CasesBannerBlockPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CasesBannerBlockKt {
    public static final float SCALE_RIGHT_IMAGE = 1.2f;
    public static final float WIDTH = 0.53f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CasesBannerBlock(@NotNull final CasesBannerAttachment bannerAttachment, boolean z, boolean z2, @NotNull final Function0<Unit> onClickToOpen, @NotNull final Function0<Unit> onClickToClose, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(bannerAttachment, "bannerAttachment");
        Intrinsics.checkNotNullParameter(onClickToOpen, "onClickToOpen");
        Intrinsics.checkNotNullParameter(onClickToClose, "onClickToClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(1066229831);
        boolean z3 = (i2 & 2) != 0 ? true : z;
        boolean z4 = (i2 & 4) != 0 ? false : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1066229831, i, -1, "com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlock (CasesBannerBlock.kt:60)");
        }
        final CarouselScrollState carouselScrollStateRememberCarouselScrollState = ScrollKt.rememberCarouselScrollState(0, composerStartRestartGroup, 0, 1);
        Brush.Companion companion = Brush.INSTANCE;
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_90, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        long jColorResource = ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6);
        final int i3 = R.color.total_black;
        final int i4 = R.color.yellow;
        final boolean z5 = z3;
        final boolean z6 = z4;
        FakeDialogKt.m15089FakeDialog3IgeMak(null, jColorResource, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2137909051, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt.CasesBannerBlock.1
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
            public final void invoke(@Nullable Composer composer2, int i5) {
                char c;
                Composer composer3;
                int i6;
                Modifier.Companion companion2;
                int i7;
                Modifier.Companion companion3;
                Composer composer4;
                Composer composer5;
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2137909051, i5, -1, "com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlock.<anonymous> (CasesBannerBlock.kt:85)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Alignment center = companion5.getCenter();
                    int i8 = i3;
                    CasesBannerAttachment casesBannerAttachment = bannerAttachment;
                    final Function0<Unit> function0 = onClickToClose;
                    final Function0<Unit> function02 = onClickToOpen;
                    Brush brush = brushM11289horizontalGradient8A3gB4$default;
                    Brush brush2 = brushM11289horizontalGradient8A3gB4$default2;
                    boolean z7 = z5;
                    final int i9 = i4;
                    boolean z8 = z6;
                    final CarouselScrollState carouselScrollState = carouselScrollStateRememberCarouselScrollState;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._373wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._748wdp, composer2, 6)), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6))), ColorResources_androidKt.colorResource(i8, composer2, 6), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composer2, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)));
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(casesBannerAttachment.getBannerBgImage(), SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), null, ContentScale.INSTANCE.getFillHeight(), 0.0f, null, 0, composer2, 3128, 116);
                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(boxScopeInstance.align(PaddingKt.m8123padding3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer2, 6)), companion5.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer2, 6));
                    composer2.startReplaceableGroup(104124347);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt$CasesBannerBlock$1$1$1$1$1
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
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableSingletons$CasesBannerBlockKt.INSTANCE.m15048getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer2, 6), 4, null);
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    AnnotatedString title = casesBannerAttachment.getTitle();
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    Color.Companion companion7 = Color.INSTANCE;
                    long jM11377getWhite0d7_KjU = companion7.m11377getWhite0d7_KjU();
                    TextAlign.Companion companion8 = TextAlign.INSTANCE;
                    TextKt.m10025TextIbK3jfQ(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14816montserratBoldItalicCustomSpbl3sdaw(R.dimen._32wsp, jM11377getWhite0d7_KjU, companion8.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, 196662, 24), composer2, 0, 0, 131070);
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), 0.53f);
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween, companion5.getStart(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
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
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Alignment centerStart = companion5.getCenterStart();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion4);
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
                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._54wdp, composer2, 6)), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer2, 6)), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), brush2, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer2, 6))), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 11, null);
                    Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(center2, companion5.getStart(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyColumnMeasurePolicy3, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1339343373);
                    if (casesBannerAttachment.getCurrentCaseTitle().length() > 0) {
                        composer3 = composer2;
                        i6 = 6;
                        c = 5;
                        companion2 = companion4;
                        TextKt.m10025TextIbK3jfQ(StringExtensionKt.htmlTextToAnnotatedString(casesBannerAttachment.getCurrentCaseTitle()), PaddingKt.m8127paddingqDBjuR0$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wsp, companion7.m11377getWhite0d7_KjU(), companion8.m13563getStarte0LSkKk(), 0L, 0.0f, null, composer2, 1572918, 56), composer2, 0, 0, 131068);
                    } else {
                        c = R.dimen._100wdp;
                        composer3 = composer2;
                        i6 = 6;
                        companion2 = companion4;
                    }
                    composer2.endReplaceableGroup();
                    composer3.startReplaceableGroup(-1339342559);
                    if (casesBannerAttachment.getSelectedCase().getCaseNameTop().length() > 0) {
                        i7 = i6;
                        companion3 = companion2;
                        composer4 = composer2;
                        TextKt.m10025TextIbK3jfQ(StringExtensionKt.htmlTextToAnnotatedString(casesBannerAttachment.getSelectedCase().getCaseNameTop()), PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer4, i7), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, 0L, companion8.m13563getStarte0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122), composer2, 0, 0, 131068);
                    } else {
                        i7 = i6;
                        companion3 = companion2;
                        composer4 = composer3;
                    }
                    composer2.endReplaceableGroup();
                    composer4.startReplaceableGroup(2033668086);
                    if (casesBannerAttachment.getSelectedCase().getCaseNameBottom().length() > 0) {
                        Composer composer6 = composer4;
                        composer5 = composer6;
                        TextKt.m10025TextIbK3jfQ(StringExtensionKt.htmlTextToAnnotatedString(casesBannerAttachment.getSelectedCase().getCaseNameBottom()), PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer6, i7), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, 0L, companion8.m13563getStarte0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122), composer2, 0, 0, 131068);
                    } else {
                        composer5 = composer4;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z7), ComposableLambdaKt.composableLambda(composer5, -1219053631, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt$CasesBannerBlock$1$1$1$2$1$1$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                            invoke(composer7, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer7, int i10) {
                            if ((i10 & 11) != 2 || !composer7.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1219053631, i10, -1, "com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesBannerBlock.kt:200)");
                                }
                                BoxKt.Box(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer7, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer7, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer7, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(i9, composer7, 6), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer7, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer7, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), composer7, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer7.skipToGroupEnd();
                        }
                    }), composer5, 48);
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(casesBannerAttachment.getBannerCaseImage(), SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer5, i7)), null, null, 0.0f, null, 0, composer2, 8, 124);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Composer composer7 = composer5;
                    TextKt.m10024Text4IGK_g(casesBannerAttachment.getCongratulationText(), PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer7, i7), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._20wsp, companion7.m11377getWhite0d7_KjU(), companion8.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572918, 56), composer2, 0, 0, 65532);
                    Modifier.Companion companion9 = companion3;
                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen._55wdp, composer7, i7));
                    composer7.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer7, 0);
                    composer7.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor8 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer7.createNode(constructor8);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer7, 0);
                    composer7.startReplaceableGroup(2058660585);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z8), ComposableLambdaKt.composableLambda(composer7, 888860323, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt$CasesBannerBlock$1$1$1$2$1$1$2$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                            invoke(composer8, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer8, int i10) {
                            if ((i10 & 11) != 2 || !composer8.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(888860323, i10, -1, "com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CasesBannerBlock.kt:231)");
                                }
                                SliderVerticalScrollerKt.m15108SliderVerticalScrollermcqpVzo(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composer8, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer8, 6)), carouselScrollState, 0.0f, 0L, 0.0f, 0.0f, null, null, composer8, 0, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer8.skipToGroupEnd();
                        }
                    }), composer7, 48);
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion9, carouselScrollState, false, null, false, 14, null);
                    composer7.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion5.getStart(), composer7, 0);
                    composer7.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor9 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer7.createNode(constructor9);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyColumnMeasurePolicy4, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                        composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer7, 0);
                    composer7.startReplaceableGroup(2058660585);
                    TextKt.m10025TextIbK3jfQ(casesBannerAttachment.getDescription(), PaddingKt.m8127paddingqDBjuR0$default(companion9, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer7, i7), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14843montserratMediumCustomSpbl3sdaw(R.dimen._11wsp, companion7.m11377getWhite0d7_KjU(), companion8.m13563getStarte0LSkKk(), 0L, 0.0f, composer2, 196662, 24), composer2, 0, 0, 131068);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    boolean z9 = false;
                    TextKt.m10024Text4IGK_g(casesBannerAttachment.getCurrentPrizesText(), PaddingKt.m8127paddingqDBjuR0$default(companion9, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer7, i7), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._11wsp, companion7.m11377getWhite0d7_KjU(), companion8.m13563getStarte0LSkKk(), 0L, 0.0f, null, composer2, 1572918, 56), composer2, 0, 0, 65532);
                    composer7.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composer7, 0);
                    composer7.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor10 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(companion9);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer7.createNode(constructor10);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap10, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion6.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                        composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                    }
                    function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer7, 0);
                    composer7.startReplaceableGroup(2058660585);
                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion9, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer7, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer7, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._51wdp, composer7, 6));
                    composer7.startReplaceableGroup(-1811479024);
                    Iterator<T> it = casesBannerAttachment.getSelectedCase().getRewards().iterator();
                    while (it.hasNext()) {
                        CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifierM8158height3ABfNKs2, (CaseReward) it.next(), 75, 0, null, null, 0.0f, 0.0f, 0.0f, 0, 0, null, false, false, true, false, R.dimen._12wdp, R.dimen._19wdp, null, composer2, 448, 14377344, 274424);
                        z9 = false;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer7, 6), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer7, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._173wdp, composer7, 6));
                    String buttonText = casesBannerAttachment.getButtonText();
                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                    composer7.startReplaceableGroup(-1811477624);
                    boolean zChanged2 = composer7.changed(function02);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt$CasesBannerBlock$1$1$1$2$1$1$4$1
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
                        composer7.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8177width3ABfNKs, buttonText, textStyleM14811montserratBoldCustomSpIzzofJo, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue2, composer2, 0, 100663296, 0, 16515057);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer7, 6), 0.0f, 11, null);
                    Alignment bottomStart = Alignment.INSTANCE.getBottomStart();
                    composer7.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(bottomStart, false, composer7, 6);
                    composer7.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor11 = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default3);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer7.createNode(constructor11);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl11 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl11, measurePolicyRememberBoxMeasurePolicy4, companion11.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl11, currentCompositionLocalMap11, companion11.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = companion11.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                        composerM10870constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                        composerM10870constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                    }
                    function3ModifierMaterializerOf11.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer7, 0);
                    composer7.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(casesBannerAttachment.getBannerRightImage(), ScaleKt.scale(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer7, 6), 7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._307wdp, composer7, 6)), 1.2f), null, null, 0.0f, null, 0, composer2, 8, 124);
                    TextKt.m10025TextIbK3jfQ(casesBannerAttachment.getInstructionRight(), PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer7, 6), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle2.m14843montserratMediumCustomSpbl3sdaw(R.dimen._12wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, 196662, 24), composer2, 0, 0, 131068);
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
            final boolean z7 = z3;
            final boolean z8 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt.CasesBannerBlock.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    CasesBannerBlockKt.CasesBannerBlock(bannerAttachment, z7, z8, onClickToOpen, onClickToClose, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CasesBannerBlockPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1517597587);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1517597587, i, -1, "com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockPreview (CasesBannerBlock.kt:329)");
            }
            String upperCase = "Tanpin x Black Russia".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(upperCase);
            AnnotatedString annotatedStringHtmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString("На Tanpin ты найдешь <font color=#FFC700>эксклюзивные лимитированные предметы</font>,<br>которые сделают тебя звездой игры:<br>- Уникальные аксессуары<br>- Неповторимые образы персонажей<br>- Роскошные машины Приобретай предметы на Tanpin и мгновенно получай их на своего персонажа.<br>Самое главное — ты можешь продавать их в любой момент и зарабатывать реальные деньги!<br>Не упусти шанс превратить свое увлечение в источник дохода.<br>Регистрируйся на Tanpin сегодня и начни зарабатывать на своей страсти к игре!");
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.LEGENDARY;
            int i2 = 127179;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i3 = 0;
            int i4 = 0;
            String str = null;
            int i5 = 0;
            Bitmap bitmap = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            int i6 = 0;
            boolean z4 = false;
            CaseRenderAttachment caseRenderAttachment = null;
            String str2 = null;
            int i7 = 0;
            int i8 = 127179;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            int i9 = 0;
            int i10 = 0;
            String str3 = null;
            int i11 = 0;
            Bitmap bitmap2 = null;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i12 = 0;
            boolean z8 = false;
            CaseRenderAttachment caseRenderAttachment2 = null;
            String str4 = null;
            int i13 = 0;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Bitmap bitmap3 = null;
            Bitmap bitmap4 = null;
            Bitmap bitmap5 = null;
            String str8 = null;
            String str9 = "COLLECTION V1.0<br><font color=#1cbe0f>CYBER</font>";
            String str10 = "Играй и зарабатывай!";
            String str11 = "Уникальные предметы на Tanpin:";
            CasesBannerBlock(new CasesBannerAttachment(bitmap3, bitmap4, bitmap5, str9, str10, str11, annotatedStringHtmlTextToAnnotatedString, annotatedStringHtmlTextToAnnotatedString2, StringExtensionKt.htmlTextToAnnotatedString("Некоторые предметы имеют<br><font color=#FFC700>уникальные эффекты</font>"), str8, new CasesBannerSelectedCase(CollectionsKt__CollectionsKt.listOf((Object[]) new CaseReward[]{new CaseReward(i3, i4, "ТРАНСПОРТ FLANKER", str, "+100", "100", i5, bitmap, commonRarityEnum, z, z2, z3, i6, z4, caseRenderAttachment, str2, i7, i2, defaultConstructorMarker), new CaseReward(i9, i10, "ТРАНСПОРТ FLANKER", str3, "+100", "100", i11, bitmap2, commonRarityEnum, z5, z6, z7, i12, z8, caseRenderAttachment2, str4, i13, i8, defaultConstructorMarker2), new CaseReward(i3, i4, "ТРАНСПОРТ FLANKER", str, "+100", "100", i5, bitmap, CommonRarityEnum.EPIC, z, z2, z3, i6, z4, caseRenderAttachment, str2, i7, i2, defaultConstructorMarker), new CaseReward(i9, i10, "ТРАНСПОРТ FLANKER", str3, "+100", "100", i11, bitmap2, CommonRarityEnum.UNCOMMON, z5, z6, z7, i12, z8, caseRenderAttachment2, str4, i13, i8, defaultConstructorMarker2), new CaseReward(i3, i4, "ТРАНСПОРТ FLANKER", str, "+100", "100", i5, bitmap, CommonRarityEnum.RARE, z, z2, z3, i6, z4, caseRenderAttachment, str2, i7, i2, defaultConstructorMarker), new CaseReward(i9, i10, "ТРАНСПОРТ FLANKER", str3, "+100", "100", i11, bitmap2, CommonRarityEnum.COMMON, z5, z6, z7, i12, z8, caseRenderAttachment2, str4, i13, i8, defaultConstructorMarker2)}), str5, str6, str7, 14, null), 519, null), false, false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt.CasesBannerBlockPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt.CasesBannerBlockPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 27704, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.banner.CasesBannerBlockKt.CasesBannerBlockPreview.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i14) {
                    CasesBannerBlockKt.CasesBannerBlockPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
