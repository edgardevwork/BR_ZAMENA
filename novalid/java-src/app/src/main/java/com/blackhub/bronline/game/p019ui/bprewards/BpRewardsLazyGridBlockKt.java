package com.blackhub.bronline.game.p019ui.bprewards;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsFilterStateEnum;
import com.blackhub.bronline.game.gui.bprewards.model.BpRewardsServerItemModel;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselGridKt;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BpRewardsLazyGridBlock.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¿\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2d\u0010\u000e\u001a`\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m7105d2 = {"BpRewardsLazyGridBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", IFramePlayerOptions.Builder.LIST, "", "Lcom/blackhub/bronline/game/gui/bprewards/model/BpRewardsServerItemModel;", "isButtonsEnabledState", "Landroidx/compose/runtime/MutableState;", "", "filterState", "", "renderSize", "emptyIconRes", "onItemClick", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "id", "typeOfClickedButton", "", "itemNameForDialog", "sprayPriceForDialog", "onItemsRequested", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/MutableState;IIILkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewBpRewardsLazyGridBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBpRewardsLazyGridBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BpRewardsLazyGridBlock.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsLazyGridBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,184:1\n1116#2,6:185\n1116#2,6:231\n68#3,6:191\n74#3:225\n78#3:230\n79#4,11:197\n92#4:229\n456#5,8:208\n464#5,3:222\n467#5,3:226\n3737#6,6:216\n*S KotlinDebug\n*F\n+ 1 BpRewardsLazyGridBlock.kt\ncom/blackhub/bronline/game/ui/bprewards/BpRewardsLazyGridBlockKt\n*L\n54#1:185,6\n177#1:231,6\n83#1:191,6\n83#1:225\n83#1:230\n83#1:197,11\n83#1:229\n83#1:208,8\n83#1:222,3\n83#1:226,3\n83#1:216,6\n*E\n"})
/* loaded from: classes2.dex */
public final class BpRewardsLazyGridBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BpRewardsLazyGridBlock(@Nullable Modifier modifier, @NotNull final List<BpRewardsServerItemModel> list, @NotNull final MutableState<Boolean> isButtonsEnabledState, final int i, final int i2, final int i3, @NotNull final Function4<? super Integer, ? super Integer, ? super String, ? super Integer, Unit> onItemClick, @NotNull final Function0<Unit> onItemsRequested, @Nullable Composer composer, final int i4, final int i5) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(isButtonsEnabledState, "isButtonsEnabledState");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onItemsRequested, "onItemsRequested");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1538443831);
        Modifier modifier2 = (i5 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538443831, i4, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlock (BpRewardsLazyGridBlock.kt:50)");
        }
        LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        composerStartRestartGroup.startReplaceableGroup(-1678882714);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Boolean.FALSE;
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
        composerStartRestartGroup.endReplaceableGroup();
        booleanRef.element = zBooleanValue;
        EffectsKt.LaunchedEffect(lazyGridStateRememberLazyGridState, new C49901(lazyGridStateRememberLazyGridState, booleanRef, onItemsRequested, null), composerStartRestartGroup, 64);
        EffectsKt.LaunchedEffect(Integer.valueOf(i), new C49912(list, lazyGridStateRememberLazyGridState, null), composerStartRestartGroup, 64 | ((i4 >> 9) & 14));
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
        Brush.Companion companion = Brush.INSTANCE;
        Modifier modifierBackground$default = BackgroundKt.background$default(BorderKt.m7782borderxT4_qwU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._748wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._287wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4), Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
        Modifier.Companion companion4 = Modifier.INSTANCE;
        final Modifier modifier3 = modifier2;
        LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(3), PaddingKt.m8124paddingVpY3zN4(boxScopeInstance.align(companion4, companion2.getCenter()), PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), lazyGridStateRememberLazyGridState, null, false, null, null, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt$BpRewardsLazyGridBlock$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                invoke2(lazyGridScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LazyGridScope LazyVerticalGrid) {
                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                int size = list.size();
                final List<BpRewardsServerItemModel> list2 = list;
                final int i6 = i2;
                final int i7 = i3;
                final MutableState<Boolean> mutableState = isButtonsEnabledState;
                final Function4<Integer, Integer, String, Integer, Unit> function4 = onItemClick;
                LazyGridScope.items$default(LazyVerticalGrid, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(-166747708, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt$BpRewardsLazyGridBlock$3$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyGridItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull LazyGridItemScope items, int i8, @Nullable Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(items, "$this$items");
                        if ((i9 & 112) == 0) {
                            i9 |= composer2.changed(i8) ? 32 : 16;
                        }
                        if ((i9 & 721) != 144 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-166747708, i9, -1, "com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlock.<anonymous>.<anonymous>.<anonymous> (BpRewardsLazyGridBlock.kt:104)");
                            }
                            BpRewardsListItemKt.BpRewardsListItem(null, list2.get(i8), i6, i7, mutableState, function4, composer2, 64, 1);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 14, null);
            }
        }, composerStartRestartGroup, 0, 504);
        composerStartRestartGroup.startReplaceableGroup(-1678880686);
        if (list.size() > 9) {
            ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid(boxScopeInstance.align(SizeKt.m8177width3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 11, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), companion2.getCenterEnd()), lazyGridStateRememberLazyGridState, 3, 0.0f, 0.0f, null, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 384, 56);
        }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt.BpRewardsLazyGridBlock.4
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
                    BpRewardsLazyGridBlockKt.BpRewardsLazyGridBlock(modifier3, list, isButtonsEnabledState, i, i2, i3, onItemClick, onItemsRequested, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                }
            });
        }
    }

    /* compiled from: BpRewardsLazyGridBlock.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt$BpRewardsLazyGridBlock$1", m7120f = "BpRewardsLazyGridBlock.kt", m7121i = {}, m7122l = {59}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt$BpRewardsLazyGridBlock$1 */
    public static final class C49901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Ref.BooleanRef $isScrollStateInited;
        public final /* synthetic */ Function0<Unit> $onItemsRequested;
        public final /* synthetic */ LazyGridState $scrollState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49901(LazyGridState lazyGridState, Ref.BooleanRef booleanRef, Function0<Unit> function0, Continuation<? super C49901> continuation) {
            super(2, continuation);
            this.$scrollState = lazyGridState;
            this.$isScrollStateInited = booleanRef;
            this.$onItemsRequested = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C49901(this.$scrollState, this.$isScrollStateInited, this.$onItemsRequested, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C49901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final LazyGridState lazyGridState = this.$scrollState;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt.BpRewardsLazyGridBlock.1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(lazyGridState.getCanScrollForward());
                    }
                }));
                final Ref.BooleanRef booleanRef = this.$isScrollStateInited;
                final Function0<Unit> function0 = this.$onItemsRequested;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt.BpRewardsLazyGridBlock.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    @Nullable
                    public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                        if (!z) {
                            Ref.BooleanRef booleanRef2 = booleanRef;
                            if (booleanRef2.element) {
                                function0.invoke();
                            } else {
                                booleanRef2.element = true;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BpRewardsLazyGridBlock.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt$BpRewardsLazyGridBlock$2", m7120f = "BpRewardsLazyGridBlock.kt", m7121i = {}, m7122l = {72}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt$BpRewardsLazyGridBlock$2 */
    public static final class C49912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<BpRewardsServerItemModel> $list;
        public final /* synthetic */ LazyGridState $scrollState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49912(List<BpRewardsServerItemModel> list, LazyGridState lazyGridState, Continuation<? super C49912> continuation) {
            super(2, continuation);
            this.$list = list;
            this.$scrollState = lazyGridState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C49912(this.$list, this.$scrollState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C49912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$list.size() > 0) {
                    LazyGridState lazyGridState = this.$scrollState;
                    this.label = 1;
                    if (LazyGridState.scrollToItem$default(lazyGridState, 0, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBpRewardsLazyGridBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-899901612);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-899901612, i, -1, "com.blackhub.bronline.game.ui.bprewards.PreviewBpRewardsLazyGridBlock (BpRewardsLazyGridBlock.kt:139)");
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BpRewardsServerItemModel[]{new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, "купон x2", 0, 0, null, null, 0, 0, null, 0, 0, false, "5 дней", null, null, 28669, null), new BpRewardsServerItemModel(0, null, 0, 0, null, null, 0, 0, null, 0, 0, true, null, null, null, 30719, null)});
            composerStartRestartGroup.startReplaceableGroup(-1469123789);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BpRewardsLazyGridBlock(null, listListOf, (MutableState) objRememberedValue, BpRewardsFilterStateEnum.ALL.getFilterState(), 0, R.drawable.ic_reward, new Function4<Integer, Integer, String, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt.PreviewBpRewardsLazyGridBlock.2
                public final void invoke(int i2, int i3, @Nullable String str, @Nullable Integer num) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, String str, Integer num3) {
                    invoke(num.intValue(), num2.intValue(), str, num3);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt.PreviewBpRewardsLazyGridBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 14380480, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bprewards.BpRewardsLazyGridBlockKt.PreviewBpRewardsLazyGridBlock.4
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
                    BpRewardsLazyGridBlockKt.PreviewBpRewardsLazyGridBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
