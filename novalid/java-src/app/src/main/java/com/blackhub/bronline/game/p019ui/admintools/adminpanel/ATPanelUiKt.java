package com.blackhub.bronline.game.p019ui.admintools.adminpanel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
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
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.admintools.model.ATButtonItem;
import com.blackhub.bronline.game.gui.admintools.model.ATPlayerInfoItemModel;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATPanelUi.kt */
@Metadata(m7104d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aÝ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m7105d2 = {"ATPanelUi", "", "modifier", "Landroidx/compose/ui/Modifier;", "playerId", "", "playerName", "", "playerInfoList", "", "Lcom/blackhub/bronline/game/gui/admintools/model/ATPlayerInfoItemModel;", "onStatisticClick", "Lkotlin/Function0;", "onCreateFormClick", "onUpdatePlayerClick", "onExitClick", "onPreviousClick", "onKickClick", "onMuteClick", "onJailClick", "onWarnClick", "onSlapClick", "onBanClick", "onNextClick", "(Landroidx/compose/ui/Modifier;ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PreviewATPanelUi", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nATPanelUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ATPanelUi.kt\ncom/blackhub/bronline/game/ui/admintools/adminpanel/ATPanelUiKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,228:1\n68#2,6:229\n74#2:263\n78#2:350\n79#3,11:235\n79#3,11:266\n92#3:298\n79#3,11:306\n92#3:344\n92#3:349\n456#4,8:246\n464#4,3:260\n456#4,8:277\n464#4,3:291\n467#4,3:295\n456#4,8:317\n464#4,3:331\n467#4,3:341\n467#4,3:346\n3737#5,6:254\n3737#5,6:285\n3737#5,6:325\n78#6,2:264\n80#6:294\n84#6:299\n74#6,6:300\n80#6:334\n84#6:345\n1116#7,6:335\n*S KotlinDebug\n*F\n+ 1 ATPanelUi.kt\ncom/blackhub/bronline/game/ui/admintools/adminpanel/ATPanelUiKt\n*L\n61#1:229,6\n61#1:263\n61#1:350\n61#1:235,11\n62#1:266,11\n62#1:298\n125#1:306,11\n125#1:344\n61#1:349\n61#1:246,8\n61#1:260,3\n62#1:277,8\n62#1:291,3\n62#1:295,3\n125#1:317,8\n125#1:331,3\n125#1:341,3\n61#1:346,3\n61#1:254,6\n62#1:285,6\n125#1:325,6\n62#1:264,2\n62#1:294\n62#1:299\n125#1:300,6\n125#1:334\n125#1:345\n160#1:335,6\n*E\n"})
/* loaded from: classes.dex */
public final class ATPanelUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ATPanelUi(@Nullable Modifier modifier, final int i, @NotNull final String playerName, @NotNull final List<ATPlayerInfoItemModel> playerInfoList, @NotNull final Function0<Unit> onStatisticClick, @NotNull final Function0<Unit> onCreateFormClick, @NotNull final Function0<Unit> onUpdatePlayerClick, @NotNull final Function0<Unit> onExitClick, @NotNull final Function0<Unit> onPreviousClick, @NotNull final Function0<Unit> onKickClick, @NotNull final Function0<Unit> onMuteClick, @NotNull final Function0<Unit> onJailClick, @NotNull final Function0<Unit> onWarnClick, @NotNull final Function0<Unit> onSlapClick, @NotNull final Function0<Unit> onBanClick, @NotNull final Function0<Unit> onNextClick, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerInfoList, "playerInfoList");
        Intrinsics.checkNotNullParameter(onStatisticClick, "onStatisticClick");
        Intrinsics.checkNotNullParameter(onCreateFormClick, "onCreateFormClick");
        Intrinsics.checkNotNullParameter(onUpdatePlayerClick, "onUpdatePlayerClick");
        Intrinsics.checkNotNullParameter(onExitClick, "onExitClick");
        Intrinsics.checkNotNullParameter(onPreviousClick, "onPreviousClick");
        Intrinsics.checkNotNullParameter(onKickClick, "onKickClick");
        Intrinsics.checkNotNullParameter(onMuteClick, "onMuteClick");
        Intrinsics.checkNotNullParameter(onJailClick, "onJailClick");
        Intrinsics.checkNotNullParameter(onWarnClick, "onWarnClick");
        Intrinsics.checkNotNullParameter(onSlapClick, "onSlapClick");
        Intrinsics.checkNotNullParameter(onBanClick, "onBanClick");
        Intrinsics.checkNotNullParameter(onNextClick, "onNextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1896212930);
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896212930, i2, i3, "com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUi (ATPanelUi.kt:52)");
        }
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Modifier modifier3 = modifier2;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getBottomCenter()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6), 7, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6));
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i5 = i2 >> 9;
        ATRowPlayerKt.ATRowPlayer(null, i, playerName, onUpdatePlayerClick, onExitClick, composerStartRestartGroup, (i2 & 1008) | (i5 & 7168) | (i5 & 57344), 1);
        ATRowButtonBlockKt.ATRowButtonBlock(null, CollectionsKt__CollectionsKt.listOf((Object[]) new ATButtonItem[]{new ATButtonItem(2, null, Integer.valueOf(R.drawable.ic_single_arrow_left), onPreviousClick, 2, null), new ATButtonItem(3, StringResources_androidKt.stringResource(R.string.admin_tools_kick, composerStartRestartGroup, 6), Integer.valueOf(R.drawable.ic_kick), onKickClick), new ATButtonItem(4, StringResources_androidKt.stringResource(R.string.admin_tools_mute, composerStartRestartGroup, 6), Integer.valueOf(R.drawable.ic_mute), onMuteClick), new ATButtonItem(5, StringResources_androidKt.stringResource(R.string.admin_tools_jail, composerStartRestartGroup, 6), Integer.valueOf(R.drawable.ic_jail), onJailClick), new ATButtonItem(6, StringResources_androidKt.stringResource(R.string.admin_tools_warn, composerStartRestartGroup, 6), Integer.valueOf(R.drawable.ic_warn), onWarnClick), new ATButtonItem(7, StringResources_androidKt.stringResource(R.string.admin_tools_slap, composerStartRestartGroup, 6), Integer.valueOf(R.drawable.ic_slap), onSlapClick), new ATButtonItem(8, StringResources_androidKt.stringResource(R.string.admin_tools_ban, composerStartRestartGroup, 6), null, onBanClick, 4, null), new ATButtonItem(9, null, Integer.valueOf(R.drawable.ic_single_arrow_right), onNextClick, 2, null)}), composerStartRestartGroup, 0, 1);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getTopEnd()), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composerStartRestartGroup, 6), 0.0f, 9, null);
        Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ATInfoPlayerBlockKt.ATInfoPlayerBlock(null, playerInfoList, onStatisticClick, composerStartRestartGroup, ((i2 >> 6) & 896) | 64, 1);
        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._105wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composerStartRestartGroup, 6));
        String strStringResource = StringResources_androidKt.stringResource(R.string.admin_tools_create_a_form, composerStartRestartGroup, 6);
        TextStyle textStyleM14843montserratMediumCustomSpbl3sdaw = TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._6wsp, 0L, TextAlign.INSTANCE.m13563getStarte0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26);
        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6);
        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6);
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
        Integer numValueOf = Integer.valueOf(R.drawable.ic_player_info_create_form);
        C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(fDimensionResource2);
        composerStartRestartGroup.startReplaceableGroup(-734748881);
        boolean z = (((458752 & i2) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) > 131072 && composerStartRestartGroup.changed(onCreateFormClick)) || (i2 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 131072;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt$ATPanelUi$1$2$1$1
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
                    onCreateFormClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, strStringResource, textStyleM14843montserratMediumCustomSpbl3sdaw, fDimensionResource, 0, numValueOf, c2046DpM13664boximpl, null, 0.0f, 0L, 0.0f, brushM11297verticalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue, composerStartRestartGroup, 1572864, 100663296, 0, 16486178);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.ATPanelUi.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    ATPanelUiKt.ATPanelUi(modifier3, i, playerName, playerInfoList, onStatisticClick, onCreateFormClick, onUpdatePlayerClick, onExitClick, onPreviousClick, onKickClick, onMuteClick, onJailClick, onWarnClick, onSlapClick, onBanClick, onNextClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewATPanelUi(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-208274131);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208274131, i, -1, "com.blackhub.bronline.game.ui.admintools.adminpanel.PreviewATPanelUi (ATPanelUi.kt:168)");
            }
            composer2 = composerStartRestartGroup;
            ATPanelUi(null, 7777, "CoolNickname_Nick1000", CollectionsKt__CollectionsKt.listOf((Object[]) new ATPlayerInfoItemModel[]{new ATPlayerInfoItemModel(1, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_level, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(2, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_hp, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(3, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_armor, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(4, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_speed, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(5, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_ping, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(6, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_money, composerStartRestartGroup, 6), 1234567890), new ATPlayerInfoItemModel(7, StringResources_androidKt.stringResource(R.string.common_transport, composerStartRestartGroup, 6), 100), new ATPlayerInfoItemModel(8, StringResources_androidKt.stringResource(R.string.admin_tools_player_info_transport_strength, composerStartRestartGroup, 6), 100)}), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.12
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920347056, 224694, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATPanelUiKt.PreviewATPanelUi.13
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
                    ATPanelUiKt.PreviewATPanelUi(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
