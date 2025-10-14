package com.blackhub.bronline.game.p019ui.blackpass.uiblock;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.p019ui.widget.block.item.CommonRewardWithProgressItemKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassPresentsBlock.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aë\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u001228\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u001428\u0010\u001a\u001a4\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\n\u0010!\u001a\u00020\u0010X\u008a\u0084\u0002"}, m7105d2 = {"BlackPassPresentsBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "standardBitmapImage", "Landroid/graphics/Bitmap;", "premiumBitmapImage", "seasonBitmapImage", "vipState", "Lcom/blackhub/bronline/game/gui/blackpass/enums/VIPStateEnum;", "isActiveVip", "", "rewardsList", "", "Lcom/blackhub/bronline/game/gui/blackpass/data/RewardModel;", "currentBpLevel", "", "onButtonGetVipClick", "Lkotlin/Function0;", "onTopItemClick", "Lkotlin/Function2;", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "Lkotlin/ParameterName;", "name", "topRewardModel", "bitmap", "onBottomItemClick", "bottomRewardModel", "onPlusBtnClick", "(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/blackhub/bronline/game/gui/blackpass/enums/VIPStateEnum;ZLjava/util/List;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PreviewBlackPassPresentsBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "scrollLevel"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassPresentsBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassPresentsBlock.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackPassPresentsBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,185:1\n1116#2,6:186\n1116#2,6:192\n87#3,6:198\n93#3:232\n97#3:360\n79#4,11:204\n79#4,11:240\n92#4:272\n79#4,11:281\n79#4,11:317\n92#4:349\n92#4:354\n92#4:359\n456#5,8:215\n464#5,3:229\n456#5,8:251\n464#5,3:265\n467#5,3:269\n456#5,8:292\n464#5,3:306\n456#5,8:328\n464#5,3:342\n467#5,3:346\n467#5,3:351\n467#5,3:356\n3737#6,6:223\n3737#6,6:259\n3737#6,6:300\n3737#6,6:336\n73#7,7:233\n80#7:268\n84#7:273\n73#7,7:310\n80#7:345\n84#7:350\n67#8,7:274\n74#8:309\n78#8:355\n81#9:361\n*S KotlinDebug\n*F\n+ 1 BlackPassPresentsBlock.kt\ncom/blackhub/bronline/game/ui/blackpass/uiblock/BlackPassPresentsBlockKt\n*L\n52#1:186,6\n57#1:192,6\n63#1:198,6\n63#1:232\n63#1:360\n63#1:204,11\n64#1:240,11\n64#1:272\n85#1:281,11\n86#1:317,11\n86#1:349\n85#1:354\n63#1:359\n63#1:215,8\n63#1:229,3\n64#1:251,8\n64#1:265,3\n64#1:269,3\n85#1:292,8\n85#1:306,3\n86#1:328,8\n86#1:342,3\n86#1:346,3\n85#1:351,3\n63#1:356,3\n63#1:223,6\n64#1:259,6\n85#1:300,6\n86#1:336,6\n64#1:233,7\n64#1:268\n64#1:273\n86#1:310,7\n86#1:345\n86#1:350\n85#1:274,7\n85#1:309\n85#1:355\n52#1:361\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassPresentsBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackPassPresentsBlock(@Nullable Modifier modifier, @Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, @Nullable final Bitmap bitmap3, @NotNull final VIPStateEnum vipState, final boolean z, @NotNull final List<RewardModel> rewardsList, final int i, @NotNull final Function0<Unit> onButtonGetVipClick, @NotNull final Function2<? super CommonRewardModel, ? super Bitmap, Unit> onTopItemClick, @NotNull final Function2<? super CommonRewardModel, ? super Bitmap, Unit> onBottomItemClick, @NotNull final Function0<Unit> onPlusBtnClick, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(vipState, "vipState");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(onButtonGetVipClick, "onButtonGetVipClick");
        Intrinsics.checkNotNullParameter(onTopItemClick, "onTopItemClick");
        Intrinsics.checkNotNullParameter(onBottomItemClick, "onBottomItemClick");
        Intrinsics.checkNotNullParameter(onPlusBtnClick, "onPlusBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(41547913);
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(41547913, i2, i3, "com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlock (BlackPassPresentsBlock.kt:48)");
        }
        LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        composerStartRestartGroup.startReplaceableGroup(834384710);
        boolean z2 = (((29360128 & i2) ^ 12582912) > 8388608 && composerStartRestartGroup.changed(i)) || (i2 & 12582912) == 8388608;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt$BlackPassPresentsBlock$scrollLevel$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(i - 1);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        Integer numValueOf = Integer.valueOf(BlackPassPresentsBlock$lambda$1(state));
        composerStartRestartGroup.startReplaceableGroup(834384847);
        boolean zChanged = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new BlackPassPresentsBlockKt$BlackPassPresentsBlock$1$1(lazyListStateRememberLazyListState, state, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
        int i5 = (i2 >> 6) & 896;
        BlackPassCategoryItemKt.m14898BlackPassCategoryItemZPw9REg(ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), bitmap2, vipState, false, z, onButtonGetVipClick, composerStartRestartGroup, i5 | 3136 | ((i2 >> 3) & 57344) | ((i2 >> 9) & 458752), 0);
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        BlackPassCategoryItemKt.m14898BlackPassCategoryItemZPw9REg(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6), bitmap, vipState, true, true, null, composerStartRestartGroup, i5 | 27712, 32);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion3);
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
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_rewards_list, composerStartRestartGroup, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composerStartRestartGroup, 6)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.gray_bg, composerStartRestartGroup, 6), null, 2, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        LazyDslKt.LazyRow(null, lazyListStateRememberLazyListState, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt$BlackPassPresentsBlock$2$2$2
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
                final List<RewardModel> list = rewardsList;
                final Bitmap bitmap4 = bitmap3;
                final int i6 = i;
                final Function0<Unit> function0 = onPlusBtnClick;
                final Function2<CommonRewardModel, Bitmap, Unit> function2 = onTopItemClick;
                final Function2<CommonRewardModel, Bitmap, Unit> function22 = onBottomItemClick;
                LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt$BlackPassPresentsBlock$2$2$2$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @Nullable
                    public final Object invoke(int i7) {
                        list.get(i7);
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt$BlackPassPresentsBlock$2$2$2$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i7, @Nullable Composer composer2, int i8) {
                        int i9;
                        if ((i8 & 14) == 0) {
                            i9 = i8 | (composer2.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i9 = i8;
                        }
                        if ((i8 & 112) == 0) {
                            i9 |= composer2.changed(i7) ? 32 : 16;
                        }
                        if ((i9 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i9, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        final RewardModel rewardModel = (RewardModel) list.get(i7);
                        CommonRewardModel premiumReward = rewardModel.getPremiumReward();
                        CommonRewardModel standardReward = rewardModel.getStandardReward();
                        int size = list.size();
                        Bitmap bitmap5 = bitmap4;
                        int i10 = i6;
                        Function0 function02 = function0;
                        final Function2 function23 = function2;
                        Function1<Bitmap, Unit> function1 = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt$BlackPassPresentsBlock$2$2$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap6) {
                                invoke2(bitmap6);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Bitmap bitmap6) {
                                function23.invoke(rewardModel.getPremiumReward(), bitmap6);
                            }
                        };
                        final Function2 function24 = function22;
                        CommonRewardWithProgressItemKt.m15058CommonPrizeWithProgressItemwn8IZOc(null, premiumReward, standardReward, bitmap5, i7, size, i10, true, 0.0f, function02, function1, new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt$BlackPassPresentsBlock$2$2$2$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap6) {
                                invoke2(bitmap6);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@Nullable Bitmap bitmap6) {
                                function24.invoke(rewardModel.getStandardReward(), bitmap6);
                            }
                        }, composer2, (((i9 & 126) << 9) & 57344) | 12587584, 0, 257);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, 0, 253);
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
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt.BlackPassPresentsBlock.3
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

                public final void invoke(@Nullable Composer composer2, int i6) {
                    BlackPassPresentsBlockKt.BlackPassPresentsBlock(modifier3, bitmap, bitmap2, bitmap3, vipState, z, rewardsList, i, onButtonGetVipClick, onTopItemClick, onBottomItemClick, onPlusBtnClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBlackPassPresentsBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-380465505);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-380465505, i, -1, "com.blackhub.bronline.game.ui.blackpass.uiblock.PreviewBlackPassPresentsBlock (BlackPassPresentsBlock.kt:127)");
            }
            BlackPassPresentsBlock(null, null, null, null, VIPStateEnum.STANDARD, true, CollectionsKt__CollectionsKt.listOf((Object[]) new RewardModel[]{new RewardModel(new CommonRewardModel(0, "reward 1", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 1", null, null, null, 0, 0, null, true, false, 0, null, null, false, false, null, 0, null, 261885, null)), new RewardModel(new CommonRewardModel(0, "reward 2", null, null, null, 0, 0, null, true, false, 0, null, null, false, false, null, 0, null, 261885, null), new CommonRewardModel(0, "reward 2", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 3", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 3", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 3", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 3", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null)), new RewardModel(new CommonRewardModel(0, "reward 4", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "reward 4", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null))}), 4, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt.PreviewBlackPassPresentsBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt.PreviewBlackPassPresentsBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonRewardModel commonRewardModel, @Nullable Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(commonRewardModel, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                    invoke2(commonRewardModel, bitmap);
                    return Unit.INSTANCE;
                }
            }, new Function2<CommonRewardModel, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt.PreviewBlackPassPresentsBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonRewardModel commonRewardModel, @Nullable Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(commonRewardModel, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonRewardModel commonRewardModel, Bitmap bitmap) {
                    invoke2(commonRewardModel, bitmap);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt.PreviewBlackPassPresentsBlock.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920874416, 54, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.uiblock.BlackPassPresentsBlockKt.PreviewBlackPassPresentsBlock.5
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
                    BlackPassPresentsBlockKt.PreviewBlackPassPresentsBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int BlackPassPresentsBlock$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }
}
