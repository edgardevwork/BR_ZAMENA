package com.blackhub.bronline.game.p019ui.calendar;

import android.graphics.Bitmap;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.p019ui.widget.block.item.CommonRewardItemKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselGridKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
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
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CalendarListGridAllRewards.kt */
@SourceDebugExtension({"SMAP\nCalendarListGridAllRewards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarListGridAllRewards.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarListGridAllRewardsKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,112:1\n87#2,6:113\n93#2:147\n97#2:152\n79#3,11:119\n92#3:151\n456#4,8:130\n464#4,3:144\n467#4,3:148\n3737#5,6:138\n*S KotlinDebug\n*F\n+ 1 CalendarListGridAllRewards.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarListGridAllRewardsKt\n*L\n46#1:113,6\n46#1:147\n46#1:152\n46#1:119,11\n46#1:151\n46#1:130,8\n46#1:144,3\n46#1:148,3\n46#1:138,6\n*E\n"})
/* loaded from: classes2.dex */
public final class CalendarListGridAllRewardsKt {
    public static final int COUNT_OF_COLUMNS = 7;
    public static final float WIDTH_FOR_GRID = 0.97f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CalendarListGridAllRewards(@NotNull final Modifier modifier, @NotNull final List<CommonRewardModel> list, @NotNull final String timerGetReward, @NotNull final Function2<? super Integer, ? super Bitmap, Unit> onItemClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(timerGetReward, "timerGetReward");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-62959804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-62959804, i, -1, "com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewards (CalendarListGridAllRewards.kt:41)");
        }
        final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration().provides(null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1868256864, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewardsKt$CalendarListGridAllRewards$1$1
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

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1868256864, i2, -1, "com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewards.<anonymous>.<anonymous> (CalendarListGridAllRewards.kt:51)");
                    }
                    Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), 0.97f);
                    GridCells.Fixed fixed = new GridCells.Fixed(7);
                    LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                    final List<CommonRewardModel> list2 = list;
                    final String str = timerGetReward;
                    final Function2<Integer, Bitmap, Unit> function2 = onItemClick;
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierFillMaxWidth, lazyGridState, null, false, null, null, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewardsKt$CalendarListGridAllRewards$1$1.1
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
                            int size = list2.size();
                            final List<CommonRewardModel> list3 = list2;
                            final String str2 = str;
                            final Function2<Integer, Bitmap, Unit> function22 = function2;
                            LazyGridScope.items$default(LazyVerticalGrid, size, null, null, null, ComposableLambdaKt.composableLambdaInstance(616199883, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewardsKt.CalendarListGridAllRewards.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                    invoke(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull LazyGridItemScope items, final int i3, @Nullable Composer composer3, int i4) {
                                    int i5;
                                    Intrinsics.checkNotNullParameter(items, "$this$items");
                                    if ((i4 & 112) == 0) {
                                        i5 = i4 | (composer3.changed(i3) ? 32 : 16);
                                    } else {
                                        i5 = i4;
                                    }
                                    if ((i5 & 721) != 144 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(616199883, i5, -1, "com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewards.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CalendarListGridAllRewards.kt:59)");
                                        }
                                        CommonRewardModel commonRewardModel = list3.get(i3);
                                        String str3 = str2;
                                        final Function2<Integer, Bitmap, Unit> function23 = function22;
                                        CommonRewardModel commonRewardModel2 = commonRewardModel;
                                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer3, 6), 7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._96wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._98wdp, composer3, 6));
                                        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer3, 6);
                                        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer3, 6);
                                        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer3, 6);
                                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                        TextAlign.Companion companion2 = TextAlign.INSTANCE;
                                        int iM13558getCentere0LSkKk = companion2.m13558getCentere0LSkKk();
                                        Offset.Companion companion3 = Offset.INSTANCE;
                                        int i6 = i5;
                                        TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, iM13558getCentere0LSkKk, companion3.m11115getZeroF1C5BW0(), 0.0f, null, composer3, 1600518, 34);
                                        TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg2 = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, 0L, companion2.m13558getCentere0LSkKk(), companion3.m11115getZeroF1C5BW0(), 0.0f, null, composer3, 1600518, 34);
                                        TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg3 = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, companion2.m13558getCentere0LSkKk(), companion3.m11115getZeroF1C5BW0(), 0.0f, null, composer3, 1600518, 34);
                                        String strEmpty = commonRewardModel2.isTimer() ? str3 : AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                        composer3.startReplaceableGroup(117422555);
                                        boolean zChanged = composer3.changed(function23) | ((i6 & 112) == 32);
                                        Object objRememberedValue = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewardsKt$CalendarListGridAllRewards$1$1$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                                                    invoke2(bitmap);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@Nullable Bitmap bitmap) {
                                                    function23.invoke(Integer.valueOf(i3), bitmap);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        composer3.endReplaceableGroup();
                                        CommonRewardItemKt.m15055CommonPrizeItemBFw8Yg(modifierM8158height3ABfNKs, fDimensionResource, commonRewardModel2, fDimensionResource2, fDimensionResource3, true, 0.0f, strEmpty, null, null, 0.0f, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, textStyleM14862montserratSemiBoldCustomSpcv9FZhg2, textStyleM14862montserratSemiBoldCustomSpcv9FZhg3, null, null, false, 0L, (Function1) objRememberedValue, composer3, 197120, 0, 247616);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), 14, null);
                        }
                    }, composer2, 0, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
        ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 1, null), lazyGridStateRememberLazyGridState, 7, 0.0f, 0.0f, null, Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), composerStartRestartGroup, 384, 56);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarListGridAllRewardsKt.CalendarListGridAllRewards.2
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
                    CalendarListGridAllRewardsKt.CalendarListGridAllRewards(modifier, list, timerGetReward, onItemClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

