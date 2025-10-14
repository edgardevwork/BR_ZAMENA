package com.blackhub.bronline.game.p019ui.blackpass;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
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
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.p019ui.blackpass.uiblock.BlackBassMainMenuBlockKt;
import com.blackhub.bronline.game.p019ui.blackpass.uiblock.BlackPassPresentsBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.main.CommonSeasonEndsBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.rating.CommonRatingBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.uiblock.CommonTasksKt;
import com.blackhub.bronline.game.p019ui.widget.progressbar.CommonProgressBarHorizontalKt;
import com.bless.client.R;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassMainUI.kt */
@SourceDebugExtension({"SMAP\nBlackPassMainUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainUI.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassMainUIKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,448:1\n68#2,6:449\n74#2:483\n67#2,7:560\n74#2:595\n78#2:606\n78#2:634\n79#3,11:455\n79#3,11:489\n79#3,11:520\n92#3:558\n79#3,11:567\n92#3:605\n92#3:628\n92#3:633\n456#4,8:466\n464#4,3:480\n456#4,8:500\n464#4,3:514\n456#4,8:531\n464#4,3:545\n467#4,3:555\n456#4,8:578\n464#4,3:592\n467#4,3:602\n467#4,3:625\n467#4,3:630\n3737#5,6:474\n3737#5,6:508\n3737#5,6:539\n3737#5,6:586\n75#6,5:484\n80#6:517\n84#6:629\n91#7,2:518\n93#7:548\n97#7:559\n1116#8,6:549\n1116#8,6:596\n1116#8,6:607\n1116#8,6:613\n1116#8,6:619\n*S KotlinDebug\n*F\n+ 1 BlackPassMainUI.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassMainUIKt\n*L\n105#1:449,6\n105#1:483\n163#1:560,7\n163#1:595\n163#1:606\n105#1:634\n105#1:455,11\n108#1:489,11\n118#1:520,11\n118#1:558\n163#1:567,11\n163#1:605\n108#1:628\n105#1:633\n105#1:466,8\n105#1:480,3\n108#1:500,8\n108#1:514,3\n118#1:531,8\n118#1:545,3\n118#1:555,3\n163#1:578,8\n163#1:592,3\n163#1:602,3\n108#1:625,3\n105#1:630,3\n105#1:474,6\n108#1:508,6\n118#1:539,6\n163#1:586,6\n108#1:484,5\n108#1:517\n108#1:629\n118#1:518,2\n118#1:548\n118#1:559\n158#1:549,6\n180#1:596,6\n233#1:607,6\n234#1:613,6\n235#1:619,6\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassMainUIKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BlackPassMainUI-poRtVFs, reason: not valid java name */
    public static final void m14888BlackPassMainUIpoRtVFs(@NotNull final String seasonTimerHeader, @NotNull final String seasonTimer, final int i, final int i2, final int i3, @Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, final long j, @NotNull final String seasonName, @ColorRes final int i4, @ColorRes final int i5, @ColorRes final int i6, @ColorRes final int i7, @ColorRes final int i8, @ColorRes final int i9, final int i10, @Nullable final Bitmap bitmap3, @Nullable final Bitmap bitmap4, @NotNull final VIPStateEnum vipState, final boolean z, @NotNull final List<RewardModel> rewardsList, @NotNull final List<CommonTaskModel> specialTasksList, @NotNull final List<CommonTaskModel> dailyTasksList, @NotNull final String weeklyTimer, final byte b, @Nullable final Bitmap bitmap5, @Nullable final Bitmap bitmap6, final int i11, @NotNull final List<CommonRatingModel> ratingList, @Nullable final Bitmap bitmap7, @Nullable final Bitmap bitmap8, @Nullable final Bitmap bitmap9, @NotNull final AnnotatedString premiumSubtitle, @NotNull final AnnotatedString premiumDeluxeSubtitle, @NotNull final String nameDeluxeCar, @Nullable final Bitmap bitmap10, @NotNull final String premiumPrice, @NotNull final String premiumDeluxePrice, final boolean z2, @NotNull final AnnotatedString bannerTitlePrize1, @NotNull final Function0<Unit> onButtonBuyPremiumClick, @NotNull final Function0<Unit> onButtonBuyPremiumDeluxeClick, @NotNull final Function0<Unit> onShowPrizesList, @NotNull final Function0<Unit> onRefreshRatingClick, @NotNull final Function1<? super Integer, Unit> onNavigationClick, @NotNull final Function2<? super CommonRewardModel, ? super Bitmap, Unit> onTopItemClick, @NotNull final Function2<? super CommonRewardModel, ? super Bitmap, Unit> onBottomItemClick, @NotNull final Function0<Unit> onPlusBtnClick, @NotNull final Function1<? super Byte, Unit> onSelectTaskCategory, @NotNull final Function1<? super CommonTaskModel, Unit> onTaskClick, @Nullable final Function1<? super CommonTaskModel, Unit> function1, @Nullable Composer composer, final int i12, final int i13, final int i14, final int i15, final int i16, final int i17) {
        Intrinsics.checkNotNullParameter(seasonTimerHeader, "seasonTimerHeader");
        Intrinsics.checkNotNullParameter(seasonTimer, "seasonTimer");
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(vipState, "vipState");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(specialTasksList, "specialTasksList");
        Intrinsics.checkNotNullParameter(dailyTasksList, "dailyTasksList");
        Intrinsics.checkNotNullParameter(weeklyTimer, "weeklyTimer");
        Intrinsics.checkNotNullParameter(ratingList, "ratingList");
        Intrinsics.checkNotNullParameter(premiumSubtitle, "premiumSubtitle");
        Intrinsics.checkNotNullParameter(premiumDeluxeSubtitle, "premiumDeluxeSubtitle");
        Intrinsics.checkNotNullParameter(nameDeluxeCar, "nameDeluxeCar");
        Intrinsics.checkNotNullParameter(premiumPrice, "premiumPrice");
        Intrinsics.checkNotNullParameter(premiumDeluxePrice, "premiumDeluxePrice");
        Intrinsics.checkNotNullParameter(bannerTitlePrize1, "bannerTitlePrize1");
        Intrinsics.checkNotNullParameter(onButtonBuyPremiumClick, "onButtonBuyPremiumClick");
        Intrinsics.checkNotNullParameter(onButtonBuyPremiumDeluxeClick, "onButtonBuyPremiumDeluxeClick");
        Intrinsics.checkNotNullParameter(onShowPrizesList, "onShowPrizesList");
        Intrinsics.checkNotNullParameter(onRefreshRatingClick, "onRefreshRatingClick");
        Intrinsics.checkNotNullParameter(onNavigationClick, "onNavigationClick");
        Intrinsics.checkNotNullParameter(onTopItemClick, "onTopItemClick");
        Intrinsics.checkNotNullParameter(onBottomItemClick, "onBottomItemClick");
        Intrinsics.checkNotNullParameter(onPlusBtnClick, "onPlusBtnClick");
        Intrinsics.checkNotNullParameter(onSelectTaskCategory, "onSelectTaskCategory");
        Intrinsics.checkNotNullParameter(onTaskClick, "onTaskClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500036297);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1500036297, i12, i13, "com.blackhub.bronline.game.ui.blackpass.BlackPassMainUI (BlackPassMainUI.kt:103)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 0.0f, 10, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
        if (i10 != 4) {
            composerStartRestartGroup.startReplaceableGroup(251755755);
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._33wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._28wdp, composerStartRestartGroup, 6), 2, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composerStartRestartGroup, 6));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonSeasonEndsBlockKt.m15061CommonSeasonEndsBlockeuL9pac(j, bitmap, seasonName, seasonTimer, seasonTimerHeader, composerStartRestartGroup, ((i12 >> 21) & 14) | 64 | ((i12 >> 18) & 896) | ((i12 << 6) & 7168) | ((i12 << 12) & 57344));
            CommonProgressBarHorizontalKt.m15100CommonProgressBarHorizontal6Ij7WKU(null, PrimitiveResources_androidKt.dimensionResource(R.dimen._240wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6), i2, String.valueOf(i), 0.0f, 0.0f, 0.0f, ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), null, null, null, i3, true, composerStartRestartGroup, i12 & 7168, (i12 & 57344) | ProfileVerifier.CompilationStatus.f342xf2722a21, 14561);
            composerStartRestartGroup.startReplaceableGroup(11734290);
            int i18 = (i16 & 57344) ^ CpioConstants.C_ISBLK;
            boolean z3 = (i18 > 16384 && composerStartRestartGroup.changed(onNavigationClick)) || (i16 & CpioConstants.C_ISBLK) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt$BlackPassMainUI$1$1$1$1$1
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

                    public final void invoke(int i19) {
                        onNavigationClick.invoke(Integer.valueOf(i19));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            int i19 = i13 << 3;
            BlackBassMainMenuBlockKt.BlackBassMainMenuBlock(i4, i5, i6, i7, i8, i9, function12, composerStartRestartGroup, ((i12 >> 27) & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Alignment center2 = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (i10 == 0) {
                composerStartRestartGroup.startReplaceableGroup(11734612);
                Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(11735346);
                boolean z4 = (i18 > 16384 && composerStartRestartGroup.changed(onNavigationClick)) || (i16 & CpioConstants.C_ISBLK) == 16384;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt$BlackPassMainUI$1$1$2$1$1
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
                            onNavigationClick.invoke(4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                int i20 = i13 >> 12;
                BlackPassPresentsBlockKt.BlackPassPresentsBlock(modifierM8125paddingVpY3zN4$default, bitmap3, bitmap4, bitmap2, vipState, z, rewardsList, i, function0, onTopItemClick, onBottomItemClick, onPlusBtnClick, composerStartRestartGroup, (i20 & 458752) | (57344 & i20) | 2101824 | ((i12 << 15) & 29360128) | (1879048192 & (i16 << 12)), (i16 >> 18) & 126, 0);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i10 == 1) {
                composerStartRestartGroup.startReplaceableGroup(11735781);
                int i21 = i16 >> 21;
                CommonTasksKt.CommonTasks(specialTasksList, dailyTasksList, b, bitmap8, bitmap5, bitmap6, weeklyTimer, true, false, false, function1, onSelectTaskCategory, onTaskClick, composerStartRestartGroup, ((i14 >> 6) & 896) | 12881992 | ((i14 << 9) & 3670016), (i17 & 14) | (i21 & 112) | (i21 & 896), 768);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (i10 == 3) {
                composerStartRestartGroup.startReplaceableGroup(11736682);
                CommonRatingBlockKt.CommonRatingBlock(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._228wdp, composerStartRestartGroup, 6)), i11, ratingList, bitmap7, true, null, onRefreshRatingClick, composerStartRestartGroup, ((i14 >> 18) & 112) | 29184 | ((i16 << 9) & 3670016), 32);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceableGroup(11737198);
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit4 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(251760645);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(251761286);
            boolean z5 = (((i16 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(onShowPrizesList)) || (i16 & 384) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt$BlackPassMainUI$1$1$3$1
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
                        onShowPrizesList.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(251761356);
            boolean z6 = (((i16 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(onButtonBuyPremiumClick)) || (i16 & 6) == 4;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt$BlackPassMainUI$1$1$4$1
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
                        onButtonBuyPremiumClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(251761439);
            boolean z7 = (((i16 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onButtonBuyPremiumDeluxeClick)) || (i16 & 48) == 32;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z7 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt$BlackPassMainUI$1$1$5$1
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
                        onButtonBuyPremiumDeluxeClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BlackPassSplitActivatePremiumKt.BlackPassSplitActivateBP(modifierFillMaxWidth$default, bitmap9, premiumSubtitle, premiumDeluxeSubtitle, nameDeluxeCar, bitmap10, premiumPrice, premiumDeluxePrice, z2, bannerTitlePrize1, function02, function03, (Function0) objRememberedValue5, composerStartRestartGroup, (i15 & 896) | 262214 | (i15 & 7168) | (57344 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (1879048192 & i15), 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt$BlackPassMainUI$2
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

                public final void invoke(@Nullable Composer composer2, int i22) {
                    BlackPassMainUIKt.m14888BlackPassMainUIpoRtVFs(seasonTimerHeader, seasonTimer, i, i2, i3, bitmap, bitmap2, j, seasonName, i4, i5, i6, i7, i8, i9, i10, bitmap3, bitmap4, vipState, z, rewardsList, specialTasksList, dailyTasksList, weeklyTimer, b, bitmap5, bitmap6, i11, ratingList, bitmap7, bitmap8, bitmap9, premiumSubtitle, premiumDeluxeSubtitle, nameDeluxeCar, bitmap10, premiumPrice, premiumDeluxePrice, z2, bannerTitlePrize1, onButtonBuyPremiumClick, onButtonBuyPremiumDeluxeClick, onShowPrizesList, onRefreshRatingClick, onNavigationClick, onTopItemClick, onBottomItemClick, onPlusBtnClick, onSelectTaskCategory, onTaskClick, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), RecomposeScopeImplKt.updateChangedFlags(i13), RecomposeScopeImplKt.updateChangedFlags(i14), RecomposeScopeImplKt.updateChangedFlags(i15), RecomposeScopeImplKt.updateChangedFlags(i16), RecomposeScopeImplKt.updateChangedFlags(i17));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void BlackPassMainUIPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1442089636);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442089636, i, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIPreview (BlackPassMainUI.kt:244)");
            }
            String strStringResource = StringResources_androidKt.stringResource(R.string.common_timer_title_1, composerStartRestartGroup, 6);
            String upperCase = "14 дн. 15ч.".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            long jM11366getBlack0d7_KjU = Color.INSTANCE.m11366getBlack0d7_KjU();
            VIPStateEnum vIPStateEnum = VIPStateEnum.STANDARD;
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RewardModel[]{new RewardModel(new CommonRewardModel(0, "reward 1", null, null, null, 0, 0, null, true, false, 0, null, null, false, false, null, 0, null, 261885, null), new CommonRewardModel(0, "reward 1", null, null, null, 0, 0, null, true, false, 0, CommonRewardState.NORM_RECEIVED, null, false, false, null, 0, null, 259837, null)), new RewardModel(new CommonRewardModel(0, "reward 2", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 2", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 3", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 3", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 4", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 4", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 5", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 5", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 6", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 6", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 7", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 7", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 8", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 8", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 9", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 9", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 10", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 10", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 11", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 11", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null))});
            List list = null;
            String str = "description";
            List list2 = null;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "description";
            int i2 = 6;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list3 = null;
            List list4 = null;
            List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTaskModel[]{new CommonTaskModel(false, 0, 0, "special 1", new AnnotatedString(str, null, list, 6, null), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 2", new AnnotatedString("description", list, list2, 6, null), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 3", new AnnotatedString(str2, list2, null, 6, defaultConstructorMarker), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 4", new AnnotatedString("description", list3, list4, i2, defaultConstructorMarker2), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 5", new AnnotatedString("description", list3, list4, i2, defaultConstructorMarker2), 999, 0, null, null, null, 0, 1991, null)});
            List list5 = null;
            String str3 = "description";
            List list6 = null;
            String str4 = "description";
            composer2 = composerStartRestartGroup;
            m14888BlackPassMainUIpoRtVFs(strStringResource, upperCase, 99, 10, 1000, null, null, jM11366getBlack0d7_KjU, "Путь к Вершине", R.color.white, R.color.transparent, R.color.white, R.color.transparent, R.color.black, R.color.white, 0, null, null, vIPStateEnum, true, listListOf, listListOf2, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTaskModel[]{new CommonTaskModel(false, 0, 0, "daily 1", new AnnotatedString(str3, null, list5, 6, 0 == true ? 1 : 0), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "daily 2", new AnnotatedString("description", list5, list6, 6, null), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "daily 3", new AnnotatedString(str4, list6, null, 6, defaultConstructorMarker), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "daily 4", new AnnotatedString("description", list3, list4, i2, defaultConstructorMarker2), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "daily 5", new AnnotatedString("description", list3, list4, i2, defaultConstructorMarker2), 999, 0, null, null, null, 0, 1991, null)}), "11 d 10 m", (byte) 1, null, null, 3, CollectionsKt__CollectionsKt.emptyList(), null, null, null, StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.black_pass_premium_subtitle_html, composerStartRestartGroup, 6)), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.black_pass_premium_deluxe_subtitle_html, composerStartRestartGroup, 6)), "BMW M4 GT3", null, "790BC", "1699BC", true, StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.banner_title_prize_1_html, composerStartRestartGroup, 6)), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.5
                public final void invoke(int i3) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonRewardModel commonRewardModel, @Nullable Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(commonRewardModel, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                    invoke2(commonRewardModel, bitmap);
                    return Unit.INSTANCE;
                }
            }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonRewardModel commonRewardModel, @Nullable Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(commonRewardModel, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                    invoke2(commonRewardModel, bitmap);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Byte, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.9
                public final void invoke(byte b) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                    invoke(b.byteValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonTaskModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
                    invoke2(commonTaskModel);
                    return Unit.INSTANCE;
                }
            }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonTaskModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
                    invoke2(commonTaskModel);
                    return Unit.INSTANCE;
                }
            }, composer2, 920350080, 920350134, 920349704, 115040310, 920350134, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassMainUIKt.BlackPassMainUIPreview.12
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
                    BlackPassMainUIKt.BlackPassMainUIPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

