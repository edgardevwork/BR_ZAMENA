package com.blackhub.bronline.game.p019ui.blackpass.lastchance;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.blackpass.data.BPLastChanceItemModel;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassLastChanceUI.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t26\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0002\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m7105d2 = {"CAROUSEL_MAX_PERCENTAGE", "", "CAROUSEL_MIN_PERCENTAGE", "BlackPassLastChanceContent", "", "listOfItems", "", "Lcom/blackhub/bronline/game/gui/blackpass/data/BPLastChanceItemModel;", "onExitClick", "Lkotlin/Function0;", "onBuyClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "levels", FirebaseAnalytics.Param.PRICE, "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BlackPassLastChanceUI", "donateMainViewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "blackPassMainViewModel", "Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;", "(Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;Lcom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel;Landroidx/compose/runtime/Composer;I)V", "PreviewTable6", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassLastChanceUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassLastChanceUI.kt\ncom/blackhub/bronline/game/ui/blackpass/lastchance/BlackPassLastChanceUIKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,203:1\n74#2,6:204\n80#2:238\n73#2,7:319\n80#2:354\n84#2:359\n84#2:369\n79#3,11:210\n79#3,11:245\n92#3:283\n79#3,11:290\n79#3,11:326\n92#3:358\n92#3:363\n92#3:368\n456#4,8:221\n464#4,3:235\n456#4,8:256\n464#4,3:270\n467#4,3:280\n456#4,8:301\n464#4,3:315\n456#4,8:337\n464#4,3:351\n467#4,3:355\n467#4,3:360\n467#4,3:365\n3737#5,6:229\n3737#5,6:264\n3737#5,6:309\n3737#5,6:345\n68#6,6:239\n74#6:273\n78#6:284\n69#6,5:285\n74#6:318\n78#6:364\n1116#7,6:274\n*S KotlinDebug\n*F\n+ 1 BlackPassLastChanceUI.kt\ncom/blackhub/bronline/game/ui/blackpass/lastchance/BlackPassLastChanceUIKt\n*L\n84#1:204,6\n84#1:238\n126#1:319,7\n126#1:354\n126#1:359\n84#1:369\n84#1:210,11\n90#1:245,11\n90#1:283\n121#1:290,11\n126#1:326,11\n126#1:358\n121#1:363\n84#1:368\n84#1:221,8\n84#1:235,3\n90#1:256,8\n90#1:270,3\n90#1:280,3\n121#1:301,8\n121#1:315,3\n126#1:337,8\n126#1:351,3\n126#1:355,3\n121#1:360,3\n84#1:365,3\n84#1:229,6\n90#1:264,6\n121#1:309,6\n126#1:345,6\n90#1:239,6\n90#1:273\n90#1:284\n121#1:285,5\n121#1:318\n121#1:364\n109#1:274,6\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassLastChanceUIKt {
    public static final float CAROUSEL_MAX_PERCENTAGE = 0.08f;
    public static final float CAROUSEL_MIN_PERCENTAGE = 0.04f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackPassLastChanceUI(@NotNull final DonateMainViewModel donateMainViewModel, @NotNull final BlackPassMainViewModel blackPassMainViewModel, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(donateMainViewModel, "donateMainViewModel");
        Intrinsics.checkNotNullParameter(blackPassMainViewModel, "blackPassMainViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1218399079);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1218399079, i, -1, "com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUI (BlackPassLastChanceUI.kt:46)");
        }
        final String strStringResource = StringResources_androidKt.stringResource(R.string.black_pass_action_level_up, composerStartRestartGroup, 6);
        final String strStringResource2 = StringResources_androidKt.stringResource(R.string.common_bc, composerStartRestartGroup, 6);
        final String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_confirmation, composerStartRestartGroup, 6);
        final String strStringResource4 = StringResources_androidKt.stringResource(R.string.common_apply, composerStartRestartGroup, 6);
        final String strStringResource5 = StringResources_androidKt.stringResource(R.string.common_cancel, composerStartRestartGroup, 6);
        BlackPassLastChanceContent(blackPassMainViewModel.gelListOfChanceItemView(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt.BlackPassLastChanceUI.1
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
                donateMainViewModel.setShowLastChanceBPBoostView(false);
            }
        }, new Function2<Integer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt.BlackPassLastChanceUI.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2, int i3) {
                BlackPassMainViewModel.showDialogConfirmation$default(blackPassMainViewModel, null, strStringResource, i3, Integer.valueOf(i2), strStringResource2, strStringResource3, strStringResource4, strStringResource5, 0, 1, null);
            }
        }, composerStartRestartGroup, 8, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt.BlackPassLastChanceUI.3
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
                    BlackPassLastChanceUIKt.BlackPassLastChanceUI(donateMainViewModel, blackPassMainViewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e5  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlackPassLastChanceContent(@Nullable List<BPLastChanceItemModel> list, @Nullable Function0<Unit> function0, @NotNull final Function2<? super Integer, ? super Integer, Unit> onBuyClick, @Nullable Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        final List<BPLastChanceItemModel> listEmptyList;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z;
        Object objRememberedValue;
        final Function0<Unit> function04;
        int currentCompositeKeyHash3;
        Composer composerM10870constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM10870constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBuyClick, "onBuyClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-576604953);
        int i4 = i2 & 1;
        int i5 = i4 != 0 ? i | 2 : i;
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                function02 = function0;
                i5 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i5 |= 384;
            } else if ((i & 896) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(onBuyClick) ? 256 : 128;
            }
            i3 = i5;
            if (i4 == 1 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                listEmptyList = i4 == 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
                Function0<Unit> function05 = i6 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt.BlackPassLastChanceContent.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                } : function02;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-576604953, i3, -1, "com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceContent (BlackPassLastChanceUI.kt:77)");
                }
                LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                SolidColor solidColor = new SolidColor(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6), null);
                SolidColor solidColor2 = new SolidColor(ColorResources_androidKt.colorResource(R.color.gray_white, composerStartRestartGroup, 6), null);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._320wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6), null, 2, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                function03 = function05;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM7771backgroundbw27NRU$default2 = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6), null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_last_chance, composerStartRestartGroup, 6), boxScopeInstance.align(AlignmentLineKt.m8007paddingFromBaselineVpY3zN4$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6), 0.0f, 2, null), companion2.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._20wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 65532);
                Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 0.0f, 11, null), companion2.getCenterEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6));
                composerStartRestartGroup.startReplaceableGroup(268002709);
                z = (i3 & 112) != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    function04 = function03;
                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt$BlackPassLastChanceContent$2$1$1$1
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
                            function04.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function04 = function03;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0<Unit> function06 = function04;
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableSingletons$BlackPassLastChanceUIKt.INSTANCE.m14896getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3072, 4094);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment center = companion2.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                LazyDslKt.LazyRow(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._258wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), lazyListStateRememberLazyListState, null, false, arrangement.getCenter(), null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt$BlackPassLastChanceContent$2$2$1$1
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
                        int size = listEmptyList.size();
                        final List<BPLastChanceItemModel> list2 = listEmptyList;
                        final Function2<Integer, Integer, Unit> function2 = onBuyClick;
                        LazyListScope.items$default(LazyRow, size, null, null, ComposableLambdaKt.composableLambdaInstance(-1297884283, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt$BlackPassLastChanceContent$2$2$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull LazyItemScope items, int i7, @Nullable Composer composer2, int i8) {
                                Intrinsics.checkNotNullParameter(items, "$this$items");
                                if ((i8 & 112) == 0) {
                                    i8 |= composer2.changed(i7) ? 32 : 16;
                                }
                                if ((i8 & 721) != 144 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1297884283, i8, -1, "com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackPassLastChanceUI.kt:134)");
                                    }
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), composer2, 0);
                                    BPLastChanceItemKt.BPLastChanceItem(null, list2.get(i7), function2, composer2, 0, 1);
                                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), 6, null);
                    }
                }, composerStartRestartGroup, CpioConstants.C_ISBLK, 236);
                SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                ScrollSilverThumbCarouselKt.ScrollSilverThumbCarousel(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._776wdp, composerStartRestartGroup, 6)), lazyListStateRememberLazyListState, 0.04f, 0.08f, solidColor2, solidColor, composerStartRestartGroup, 3456, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
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
                function02 = function06;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                listEmptyList = list;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final List<BPLastChanceItemModel> list2 = listEmptyList;
                final Function0<Unit> function07 = function02;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt.BlackPassLastChanceContent.3
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

                    public final void invoke(@Nullable Composer composer2, int i7) {
                        BlackPassLastChanceUIKt.BlackPassLastChanceContent(list2, function07, onBuyClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        function02 = function0;
        if ((i2 & 4) == 0) {
        }
        i3 = i5;
        if (i4 == 1) {
            if (i4 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            SolidColor solidColor3 = new SolidColor(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6), null);
            SolidColor solidColor22 = new SolidColor(ColorResources_androidKt.colorResource(R.color.gray_white, composerStartRestartGroup, 6), null);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierM7771backgroundbw27NRU$default3 = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._320wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6), null, 2, null);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally3 = companion22.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            function03 = function05;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally3, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM10870constructorimpl.getInserting()) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM7771backgroundbw27NRU$default22 = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6), null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default22);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl2.getInserting()) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_last_chance, composerStartRestartGroup, 6), boxScopeInstance2.align(AlignmentLineKt.m8007paddingFromBaselineVpY3zN4$default(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6), 0.0f, 2, null), companion22.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._20wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), composerStartRestartGroup, 0, 0, 65532);
                    Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(boxScopeInstance2.align(PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 0.0f, 11, null), companion22.getCenterEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6));
                    composerStartRestartGroup.startReplaceableGroup(268002709);
                    if ((i3 & 112) != 32) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        function04 = function03;
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt$BlackPassLastChanceContent$2$1$1$1
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
                                function04.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0<Unit> function062 = function04;
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableSingletons$BlackPassLastChanceUIKt.INSTANCE.m14896getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3072, 4094);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                        Alignment center2 = companion22.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl3.getInserting()) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            Alignment.Horizontal centerHorizontally22 = companion22.getCenterHorizontally();
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally22, composerStartRestartGroup, 48);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf42 = LayoutKt.modifierMaterializerOf(companion4);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl4.getInserting()) {
                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                function3ModifierMaterializerOf42.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                LazyDslKt.LazyRow(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._258wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), lazyListStateRememberLazyListState2, null, false, arrangement2.getCenter(), null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt$BlackPassLastChanceContent$2$2$1$1
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
                                        int size = listEmptyList.size();
                                        final List<BPLastChanceItemModel> list22 = listEmptyList;
                                        final Function2<? super Integer, ? super Integer, Unit> function2 = onBuyClick;
                                        LazyListScope.items$default(LazyRow, size, null, null, ComposableLambdaKt.composableLambdaInstance(-1297884283, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt$BlackPassLastChanceContent$2$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@NotNull LazyItemScope items, int i7, @Nullable Composer composer2, int i8) {
                                                Intrinsics.checkNotNullParameter(items, "$this$items");
                                                if ((i8 & 112) == 0) {
                                                    i8 |= composer2.changed(i7) ? 32 : 16;
                                                }
                                                if ((i8 & 721) != 144 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1297884283, i8, -1, "com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackPassLastChanceUI.kt:134)");
                                                    }
                                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion42, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), composer2, 0);
                                                    BPLastChanceItemKt.BPLastChanceItem(null, list22.get(i7), function2, composer2, 0, 1);
                                                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion42, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), composer2, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }), 6, null);
                                    }
                                }, composerStartRestartGroup, CpioConstants.C_ISBLK, 236);
                                SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                                ScrollSilverThumbCarouselKt.ScrollSilverThumbCarousel(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._776wdp, composerStartRestartGroup, 6)), lazyListStateRememberLazyListState2, 0.04f, 0.08f, solidColor22, solidColor3, composerStartRestartGroup, 3456, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function02 = function062;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewTable6(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(520516826);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(520516826, i, -1, "com.blackhub.bronline.game.ui.blackpass.lastchance.PreviewTable6 (BlackPassLastChanceUI.kt:159)");
            }
            FakeDialogKt.m15089FakeDialog3IgeMak(null, 0L, ComposableSingletons$BlackPassLastChanceUIKt.INSTANCE.m14897getLambda2$app_siteRelease(), composerStartRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.lastchance.BlackPassLastChanceUIKt.PreviewTable6.1
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
                    BlackPassLastChanceUIKt.PreviewTable6(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
