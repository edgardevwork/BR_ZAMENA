package com.blackhub.bronline.game.p019ui.rateapp;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* compiled from: RateAppLikeOrDislikeUi.kt */
@SourceDebugExtension({"SMAP\nRateAppLikeOrDislikeUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppLikeOrDislikeUi.kt\ncom/blackhub/bronline/game/ui/rateapp/RateAppLikeOrDislikeUiKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,110:1\n68#2,6:111\n74#2:145\n69#2,5:182\n74#2:215\n78#2:259\n78#2:269\n79#3,11:117\n79#3,11:152\n79#3,11:187\n79#3,11:221\n92#3:253\n92#3:258\n92#3:263\n92#3:268\n456#4,8:128\n464#4,3:142\n456#4,8:163\n464#4,3:177\n456#4,8:198\n464#4,3:212\n456#4,8:232\n464#4,3:246\n467#4,3:250\n467#4,3:255\n467#4,3:260\n467#4,3:265\n3737#5,6:136\n3737#5,6:171\n3737#5,6:206\n3737#5,6:240\n87#6,6:146\n93#6:180\n97#6:264\n64#7:181\n75#8,5:216\n80#8:249\n84#8:254\n*S KotlinDebug\n*F\n+ 1 RateAppLikeOrDislikeUi.kt\ncom/blackhub/bronline/game/ui/rateapp/RateAppLikeOrDislikeUiKt\n*L\n50#1:111,6\n50#1:145\n68#1:182,5\n68#1:215\n68#1:259\n50#1:269\n50#1:117,11\n54#1:152,11\n68#1:187,11\n76#1:221,11\n76#1:253\n68#1:258\n54#1:263\n50#1:268\n50#1:128,8\n50#1:142,3\n54#1:163,8\n54#1:177,3\n68#1:198,8\n68#1:212,3\n76#1:232,8\n76#1:246,3\n76#1:250,3\n68#1:255,3\n54#1:260,3\n50#1:265,3\n50#1:136,6\n54#1:171,6\n68#1:206,6\n76#1:240,6\n54#1:146,6\n54#1:180\n54#1:264\n73#1:181\n76#1:216,5\n76#1:249\n76#1:254\n*E\n"})

public final class RateAppLikeOrDislikeUiKt {
    public static final float HEIGHT_FOR_STARS_IMAGE = 0.45f;
    public static final float HEIGHT_FOR_TEXT = 0.8f;
    public static final float RADIAL_BRUSH_START_TRANSPARENT_COLOR = 0.9f;
    public static final float WEIGHT_FOR_BOX = 2.0f;
    public static final float WEIGHT_FOR_GIRLS_IMAGE = 1.25f;
    public static final float WIDTH_FOR_COLUMN = 0.9f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RateAppLikeOrDislikeUi(@Nullable Modifier modifier, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(178716810);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178716810, i3, -1, "com.blackhub.bronline.game.ui.rateapp.RateAppLikeOrDislikeUi (RateAppLikeOrDislikeUi.kt:40)");
            }
            Brush.Companion companion = Brush.INSTANCE;
            Float fValueOf = Float.valueOf(0.0f);
            Color.Companion companion2 = Color.INSTANCE;
            Brush brushM11294radialGradientP_VxKs$default = Brush.Companion.m11294radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.m7112to(fValueOf, Color.m11330boximpl(companion2.m11366getBlack0d7_KjU())), TuplesKt.m7112to(Float.valueOf(0.9f), Color.m11330boximpl(companion2.m11375getTransparent0d7_KjU()))}, 0L, 0.0f, 0, 14, (Object) null);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_woman, composerStartRestartGroup, 6), (String) null, OffsetKt.m8084offsetVpY3zN4$default(RowScope.weight$default(rowScopeInstance, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), 1.25f, false, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 0.0f, 2, null), companion3.getBottomCenter(), (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 3128, 112);
            Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(BackgroundKt.background$default(RowScope.weight$default(rowScopeInstance, SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), 2.0f, false, 2, null), brushM11294radialGradientP_VxKs$default, null, 0.0f, 6, null), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6)), 0.0f, 2, null);
            Alignment center = companion3.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion5, 0.9f);
            Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, companion3.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_five_stars, composerStartRestartGroup, 6), (String) null, SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(companion5, 0.45f), 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            Modifier modifier5 = modifier4;
            composer2 = composerStartRestartGroup;
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.rate_app_question_to_the_player, composerStartRestartGroup, 6), SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(companion5, 0.8f), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14825montserratExtraBoldItalic12spOr9ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), androidx.compose.p003ui.geometry.OffsetKt.Offset(1.0f, 1.0f), 1.0f, composerStartRestartGroup, MatroskaExtractor.ID_CONTENT_ENCODINGS, 1), composer2, 48, 0, 65532);
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
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppLikeOrDislikeUiKt.RateAppLikeOrDislikeUi.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i5) {
                    RateAppLikeOrDislikeUiKt.RateAppLikeOrDislikeUi(modifier3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = TsExtractor.TS_PACKET_SIZE, widthDp = 358)
    public static final void PreviewRateAppLikeOrDislikeUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1114250887);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1114250887, i, -1, "com.blackhub.bronline.game.ui.rateapp.PreviewRateAppLikeOrDislikeUi (RateAppLikeOrDislikeUi.kt:107)");
            }
            RateAppLikeOrDislikeUi(null, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.rateapp.RateAppLikeOrDislikeUiKt.PreviewRateAppLikeOrDislikeUi.1
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
                    RateAppLikeOrDislikeUiKt.PreviewRateAppLikeOrDislikeUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

