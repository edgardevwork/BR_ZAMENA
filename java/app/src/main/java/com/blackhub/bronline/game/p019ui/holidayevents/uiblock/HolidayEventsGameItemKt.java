package com.blackhub.bronline.game.p019ui.holidayevents.uiblock;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
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

/* compiled from: HolidayEventsGameItem.kt */
@SourceDebugExtension({"SMAP\nHolidayEventsGameItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsGameItem.kt\ncom/blackhub/bronline/game/ui/holidayevents/uiblock/HolidayEventsGameItemKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,113:1\n68#2,6:114\n74#2:148\n78#2:153\n79#3,11:120\n92#3:152\n456#4,8:131\n464#4,3:145\n467#4,3:149\n3737#5,6:139\n*S KotlinDebug\n*F\n+ 1 HolidayEventsGameItem.kt\ncom/blackhub/bronline/game/ui/holidayevents/uiblock/HolidayEventsGameItemKt\n*L\n48#1:114,6\n48#1:148\n48#1:153\n48#1:120,11\n48#1:152\n48#1:131,8\n48#1:145,3\n48#1:149,3\n48#1:139,6\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsGameItemKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: HolidayEventsGameItem-iJQMabo, reason: not valid java name */
    public static final void m14986HolidayEventsGameItemiJQMabo(@NotNull final HolidayEventsGameItemModel gameItem, final long j, @NotNull final Function1<? super HolidayEventsGameItemModel, Unit> onGameClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(gameItem, "gameItem");
        Intrinsics.checkNotNullParameter(onGameClick, "onGameClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-399744025);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-399744025, i, -1, "com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItem (HolidayEventsGameItem.kt:37)");
        }
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6));
        final RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.m11339copywmQWz5c$default(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6), 0.5f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierNoRippleClickable = ComposeExtensionKt.noRippleClickable(BackgroundKt.background$default(BorderKt.m7782borderxT4_qwU(ClipKt.clip(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composerStartRestartGroup, 6)), roundedCornerShapeM8392RoundedCornerShape0680j_4), PrimitiveResources_androidKt.dimensionResource(gameItem.getBorderWidth(), composerStartRestartGroup, 0), j, roundedCornerShapeM8392RoundedCornerShape0680j_4), brushM11297verticalGradient8A3gB4$default, null, 0.0f, 6, null), gameItem.getId() != -1, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItemKt$HolidayEventsGameItem$1
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
                onGameClick.invoke(gameItem);
            }
        });
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable);
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
        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(gameItem.getGameImage(), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 56, 124);
        TextKt.m10024Text4IGK_g(gameItem.getGameName(), PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopCenter()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composerStartRestartGroup, 0, 0, 65532);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(gameItem.isSelected()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1801981253, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItemKt$HolidayEventsGameItem$2$1
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
                        ComposerKt.traceEventStart(1801981253, i2, -1, "com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItem.<anonymous>.<anonymous> (HolidayEventsGameItem.kt:75)");
                    }
                    BoxScope boxScope = boxScopeInstance;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer2, 6)), j, roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    Modifier modifierAlign = boxScope.align(modifierM7770backgroundbw27NRU, companion5.getBottomEnd());
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
                    IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_check_correct_white, composer2, 6), (String) null, BoxScopeInstance.INSTANCE.align(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer2, 6)), companion5.getCenter()), ColorResources_androidKt.colorResource(R.color.white, composer2, 6), composer2, 56, 0);
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
        }), composerStartRestartGroup, 48);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItemKt$HolidayEventsGameItem$3
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

                public final void invoke(@Nullable Composer composer2, int i2) {
                    HolidayEventsGameItemKt.m14986HolidayEventsGameItemiJQMabo(gameItem, j, onGameClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void HolidayEventsGameItemPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1771805590);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1771805590, i, -1, "com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItemPreview (HolidayEventsGameItem.kt:100)");
            }
            m14986HolidayEventsGameItemiJQMabo(new HolidayEventsGameItemModel(0, true, false, "Чебуречная", null, 4, null), ColorResources_androidKt.colorResource(R.color.purpur, composerStartRestartGroup, 6), new Function1<HolidayEventsGameItemModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItemKt.HolidayEventsGameItemPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HolidayEventsGameItemModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HolidayEventsGameItemModel holidayEventsGameItemModel) {
                    invoke2(holidayEventsGameItemModel);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.uiblock.HolidayEventsGameItemKt.HolidayEventsGameItemPreview.2
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
                    HolidayEventsGameItemKt.HolidayEventsGameItemPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

