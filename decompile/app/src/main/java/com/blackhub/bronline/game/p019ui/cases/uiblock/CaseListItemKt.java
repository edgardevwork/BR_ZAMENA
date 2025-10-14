package com.blackhub.bronline.game.p019ui.cases.uiblock;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.ContentScale;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.cases.model.Case;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseListItem.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a3\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m7105d2 = {"ALPHA_IS_NOT_SELECTED", "", "CASE_SELECT_ANIMATION_MILLIS", "", "CaseListItem", "", "case", "Lcom/blackhub/bronline/game/gui/cases/model/Case;", "isSelected", "", "isAllowedTouch", "onSelect", "Lkotlin/Function0;", "(Lcom/blackhub/bronline/game/gui/cases/model/Case;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CaseListItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "bgColor", "borderColor", "bgAlpha", "valueFontSize", "animatedCaseSize", "Landroidx/compose/ui/unit/Dp;"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCaseListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaseListItem.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CaseListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,266:1\n1116#2,6:267\n1116#2,6:273\n1116#2,6:279\n1116#2,6:285\n1116#2,6:291\n1116#2,6:297\n87#3,6:303\n93#3:337\n97#3:540\n79#4,11:309\n79#4,11:344\n79#4,11:378\n92#4:410\n79#4,11:417\n92#4:449\n79#4,11:456\n92#4:488\n92#4:493\n79#4,11:502\n92#4:534\n92#4:539\n456#5,8:320\n464#5,3:334\n456#5,8:355\n464#5,3:369\n456#5,8:389\n464#5,3:403\n467#5,3:407\n456#5,8:428\n464#5,3:442\n467#5,3:446\n456#5,8:467\n464#5,3:481\n467#5,3:485\n467#5,3:490\n456#5,8:513\n464#5,3:527\n467#5,3:531\n467#5,3:536\n3737#6,6:328\n3737#6,6:363\n3737#6,6:397\n3737#6,6:436\n3737#6,6:475\n3737#6,6:521\n68#7,6:338\n74#7:372\n69#7,5:373\n74#7:406\n78#7:411\n69#7,5:412\n74#7:445\n78#7:450\n78#7:494\n67#7,7:495\n74#7:530\n78#7:535\n75#8,5:451\n80#8:484\n84#8:489\n81#9:541\n81#9:542\n81#9:543\n81#9:544\n81#9:545\n*S KotlinDebug\n*F\n+ 1 CaseListItem.kt\ncom/blackhub/bronline/game/ui/cases/uiblock/CaseListItemKt\n*L\n62#1:267,6\n67#1:273,6\n72#1:279,6\n77#1:285,6\n98#1:291,6\n100#1:297,6\n92#1:303,6\n92#1:337\n92#1:540\n92#1:309,11\n105#1:344,11\n128#1:378,11\n128#1:410\n156#1:417,11\n156#1:449\n185#1:456,11\n185#1:488\n105#1:493\n233#1:502,11\n233#1:534\n92#1:539\n92#1:320,8\n92#1:334,3\n105#1:355,8\n105#1:369,3\n128#1:389,8\n128#1:403,3\n128#1:407,3\n156#1:428,8\n156#1:442,3\n156#1:446,3\n185#1:467,8\n185#1:481,3\n185#1:485,3\n105#1:490,3\n233#1:513,8\n233#1:527,3\n233#1:531,3\n92#1:536,3\n92#1:328,6\n105#1:363,6\n128#1:397,6\n156#1:436,6\n185#1:475,6\n233#1:521,6\n105#1:338,6\n105#1:372\n128#1:373,5\n128#1:406\n128#1:411\n156#1:412,5\n156#1:445\n156#1:450\n105#1:494\n233#1:495,7\n233#1:530\n233#1:535\n185#1:451,5\n185#1:484\n185#1:489\n62#1:541\n67#1:542\n72#1:543\n77#1:544\n83#1:545\n*E\n"})
/* loaded from: classes2.dex */
public final class CaseListItemKt {
    public static final float ALPHA_IS_NOT_SELECTED = 0.7f;
    public static final int CASE_SELECT_ANIMATION_MILLIS = 300;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CaseListItem(@NotNull final Case r53, final boolean z, final boolean z2, @NotNull final Function0<Unit> onSelect, @Nullable Composer composer, final int i) {
        float fDimensionResource;
        Modifier.Companion companion;
        int i2;
        Intrinsics.checkNotNullParameter(r53, "case");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer composerStartRestartGroup = composer.startRestartGroup(-296734348);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-296734348, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.CaseListItem (CaseListItem.kt:54)");
        }
        composerStartRestartGroup.startReplaceableGroup(1784444966);
        int i3 = (i & 112) ^ 48;
        boolean z3 = (i3 > 32 && composerStartRestartGroup.changed(z)) || (i & 48) == 32;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt$CaseListItem$bgColor$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z ? R.color.black_50 : R.color.dark_gray_30);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1784445124);
        boolean z4 = (i3 > 32 && composerStartRestartGroup.changed(z)) || (i & 48) == 32;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt$CaseListItem$borderColor$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z ? R.color.white : R.color.transparent);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        State state2 = (State) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1784445274);
        boolean z5 = (i3 > 32 && composerStartRestartGroup.changed(z)) || (i & 48) == 32;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt$CaseListItem$bgAlpha$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(z ? 1.0f : 0.7f);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        State state3 = (State) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1784445428);
        boolean z6 = (i3 > 32 && composerStartRestartGroup.changed(z)) || (i & 48) == 32;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt$CaseListItem$valueFontSize$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z ? R.dimen._10wsp : R.dimen._8wsp);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        State state4 = (State) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        if (z) {
            composerStartRestartGroup.startReplaceableGroup(1784445637);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1784445701);
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
        }
        State<C2046Dp> stateM7677animateDpAsStateAjpBEmI = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(fDimensionResource, AnimationSpecKt.tween$default(300, 0, null, 6, null), AnyExtensionKt.empty(new String()), null, composerStartRestartGroup, 48, 8);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierAlpha = AlphaKt.alpha(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 7, null), CaseListItem$lambda$5(state3));
        composerStartRestartGroup.startReplaceableGroup(1784446088);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1784446184);
        boolean z7 = (((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(onSelect)) || (i & 3072) == 2048;
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (z7 || objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt$CaseListItem$2$1
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
                    onSelect.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(modifierAlpha, mutableInteractionSource, null, z2, null, null, (Function0) objRememberedValue6, 24, null);
        Alignment.Companion companion4 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion4.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(companion2, CaseListItem$lambda$8(stateM7677animateDpAsStateAjpBEmI)), ColorResources_androidKt.colorResource(CaseListItem$lambda$1(state), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(CaseListItem$lambda$3(state2), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6)));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(r53.getImageBitmap(), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, ContentScale.INSTANCE.getFillHeight(), 0.0f, null, 0, composerStartRestartGroup, 3128, 116);
        int type = r53.getType();
        if (type == 1) {
            composerStartRestartGroup.startReplaceableGroup(-873568141);
            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6));
            Alignment topStart = companion4.getTopStart();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topStart, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            String strStringResource = StringResources_androidKt.stringResource(R.string.cases_sale_text, composerStartRestartGroup, 6);
            companion = companion2;
            TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._6wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120);
            Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6));
            long jColorResource = ColorResources_androidKt.colorResource(R.color.dark_medium_green, composerStartRestartGroup, 6);
            i2 = R.dimen._1wdp;
            TextKt.m10024Text4IGK_g(strStringResource, PaddingKt.m8125paddingVpY3zN4$default(BackgroundKt.m7770backgroundbw27NRU(modifierM8177width3ABfNKs2, jColorResource, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 0.0f, 10, null)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
        } else if (type == 2) {
            composerStartRestartGroup.startReplaceableGroup(-873566740);
            Modifier modifierM8177width3ABfNKs3 = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composerStartRestartGroup, 6));
            Alignment bottomStart = companion4.getBottomStart();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(bottomStart, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs3);
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
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_limited_text, composerStartRestartGroup, 6), PaddingKt.m8125paddingVpY3zN4$default(BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 3, null)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._6wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120), composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit2 = Unit.INSTANCE;
            companion = companion2;
            i2 = R.dimen._1wdp;
        } else if (type == 3) {
            composerStartRestartGroup.startReplaceableGroup(-873565348);
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, companion4.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
            if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.cases_sale_text, composerStartRestartGroup, 6);
            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
            Color.Companion companion6 = Color.INSTANCE;
            long jM11377getWhite0d7_KjU = companion6.m11377getWhite0d7_KjU();
            TextAlign.Companion companion7 = TextAlign.INSTANCE;
            TextKt.m10024Text4IGK_g(strStringResource2, PaddingKt.m8125paddingVpY3zN4$default(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.dark_medium_green, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 0.0f, 10, null)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._6wsp, jM11377getWhite0d7_KjU, companion7.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120), composerStartRestartGroup, 0, 0, 65532);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.cases_limited_text, composerStartRestartGroup, 6), PaddingKt.m8125paddingVpY3zN4$default(BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 3, null)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._6wsp, companion6.m11377getWhite0d7_KjU(), companion7.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120), composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit3 = Unit.INSTANCE;
            companion = companion2;
            i2 = R.dimen._1wdp;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-873563022);
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit4 = Unit.INSTANCE;
            companion = companion2;
            i2 = R.dimen._1wdp;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor6);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        int i4 = i2;
        TextKt.m10024Text4IGK_g(String.valueOf(r53.getCount()), PaddingKt.m8124paddingVpY3zN4(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8157defaultMinSizeVpY3zN4$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6), 0.0f, 2, null), ColorResources_androidKt.colorResource(CaseListItem$lambda$1(state), composerStartRestartGroup, 0), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(i4, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(i4, composerStartRestartGroup, 6), 0.0f, 9, null)), PrimitiveResources_androidKt.dimensionResource(i4, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(i4, composerStartRestartGroup, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(CaseListItem$lambda$7(state4), Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582960, 120), composerStartRestartGroup, 0, 0, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt.CaseListItem.4
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
                    CaseListItemKt.CaseListItem(r53, z, z2, onSelect, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CaseListItemPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(366169654);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(366169654, i, -1, "com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemPreview (CaseListItem.kt:261)");
            }
            CaseListItem(new Case(0, null, null, null, 0, false, 3, null, null, null, 0, false, null, null, 0, null, 65470, null), false, true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt.CaseListItemPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.uiblock.CaseListItemKt.CaseListItemPreview.2
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
                    CaseListItemKt.CaseListItemPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int CaseListItem$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final int CaseListItem$lambda$3(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final float CaseListItem$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final int CaseListItem$lambda$7(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final float CaseListItem$lambda$8(State<C2046Dp> state) {
        return state.getValue().m13680unboximpl();
    }
}
