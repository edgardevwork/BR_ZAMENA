package com.blackhub.bronline.game.p019ui.taxiorder;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiOrderInfo.kt */
@SourceDebugExtension({"SMAP\nTaxiOrderInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderInfo.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiOrderInfoKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,130:1\n69#2,5:131\n74#2:164\n78#2:216\n79#3,11:136\n79#3,11:171\n92#3:210\n92#3:215\n456#4,8:147\n464#4,3:161\n456#4,8:182\n464#4,3:196\n467#4,3:207\n467#4,3:212\n3737#5,6:155\n3737#5,6:190\n74#6,6:165\n80#6:199\n84#6:211\n1116#7,6:200\n64#8:206\n*S KotlinDebug\n*F\n+ 1 TaxiOrderInfo.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiOrderInfoKt\n*L\n46#1:131,5\n46#1:164\n46#1:216\n46#1:136,11\n52#1:171,11\n52#1:210\n46#1:215\n46#1:147,8\n46#1:161,3\n52#1:182,8\n52#1:196,3\n52#1:207,3\n46#1:212,3\n46#1:155,6\n52#1:190,6\n52#1:165,6\n52#1:199\n52#1:211\n74#1:200,6\n91#1:206\n*E\n"})

public final class TaxiOrderInfoKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaxiOrderInfo(@NotNull final String name, @NotNull final String number, @NotNull final String auto, @NotNull final Function0<Unit> onDismiss, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(auto, "auto");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1094388597);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(name) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(number) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(auto) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1094388597, i2, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiOrderInfo (TaxiOrderInfo.kt:37)");
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(StringResources_androidKt.stringResource(R.string.taxi_info_about_order, composerStartRestartGroup, 6), Arrays.copyOf(new Object[]{name, number, auto}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM7805clickableXHw0xAI$default = ClickableKt.m7805clickableXHw0xAI$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), false, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderInfoKt.TaxiOrderInfo.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 6, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment center = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7805clickableXHw0xAI$default);
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
            Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._225wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black_80, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)));
            Alignment.Horizontal end = companion2.getEnd();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_close_gradient, composerStartRestartGroup, 6);
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composerStartRestartGroup, 6), 0.0f, 9, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(1880561497);
            boolean z = (i2 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderInfoKt$TaxiOrderInfo$2$1$1$1
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
                        onDismiss.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m7805clickableXHw0xAI$default(modifierM8158height3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            String strStringResource = StringResources_androidKt.stringResource(R.string.taxi_car_found, composer2, 6);
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            Color.Companion companion4 = Color.INSTANCE;
            TextKt.m10024Text4IGK_g(strStringResource, OffsetKt.m8084offsetVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), 7, null), 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14783defaultFontWithoutFontFamilyiJQMabo(R.dimen._12wsp, companion4.m11377getWhite0d7_KjU(), composer2, 438, 0), composer2, 0, 0, 65020);
            NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)), 0L, composer2, 0, 2);
            TextKt.m10024Text4IGK_g(str, SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._125wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer2, 6), 0.0f, 0.0f, 12, null), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, companion4.m11377getWhite0d7_KjU(), 0, 0L, 0.0f, composer2, 196662, 28), composer2, 0, 0, 65532);
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
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderInfoKt.TaxiOrderInfo.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i3) {
                    TaxiOrderInfoKt.TaxiOrderInfo(name, number, auto, onDismiss, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void TaxiOrderInfoPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(812826490);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(812826490, i, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiOrderInfoPreview (TaxiOrderInfo.kt:121)");
            }
            TaxiOrderInfo("Elena", "0", "Audi", new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderInfoKt.TaxiOrderInfoPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiOrderInfoKt.TaxiOrderInfoPreview.2
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
                    TaxiOrderInfoKt.TaxiOrderInfoPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

