package com.blackhub.bronline.game.p019ui.blackpass;

import android.annotation.SuppressLint;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.blackpass.data.PrizeObj;
import com.blackhub.bronline.game.gui.blackpass.data.PrizeState;
import com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassPrizeListViewModel;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselGridKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassPrizeListUi.kt */
@SourceDebugExtension({"SMAP\nBlackPassPrizeListUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassPrizeListUi.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassPrizeListUiKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,245:1\n1045#2:246\n154#3:247\n154#3:248\n154#3:249\n69#4,5:250\n74#4:283\n78#4:288\n79#5,11:255\n92#5:287\n456#6,8:266\n464#6,3:280\n467#6,3:284\n3737#7,6:274\n*S KotlinDebug\n*F\n+ 1 BlackPassPrizeListUi.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassPrizeListUiKt\n*L\n54#1:246\n83#1:247\n85#1:248\n86#1:249\n95#1:250,5\n95#1:283\n95#1:288\n95#1:255,11\n95#1:287\n95#1:266,8\n95#1:280,3\n95#1:284,3\n95#1:274,6\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassPrizeListUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackPassPrizeListUi(@Nullable Modifier modifier, @NotNull final BlackPassPrizeListViewModel viewModelWithState, @NotNull final DonateMainViewModel mainViewModel, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewModelWithState, "viewModelWithState");
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-272830761);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-272830761, i, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUi (BlackPassPrizeListUi.kt:51)");
        }
        BlackPassPrizeListUiContent(modifier, CollectionsKt___CollectionsKt.sortedWith(((PrizeState) FlowExtKt.collectAsStateWithLifecycle(viewModelWithState.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue()).getAllPrizes(), new Comparator() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUi$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((PrizeObj) t).getCurrentLevel()), Integer.valueOf(((PrizeObj) t2).getCurrentLevel()));
            }
        }), new Function1<PrizeObj, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt.BlackPassPrizeListUi.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PrizeObj prizeObj) {
                invoke2(prizeObj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PrizeObj it) {
                Intrinsics.checkNotNullParameter(it, "it");
                mainViewModel.clickPreviewPrize(it.getImageBitmap(), it.getPrizeTitle(), it.getId(), it.isPremium(), it.getTypeOfAward(), it.getFromInterface(), (64 & 64) != 0 ? -1 : 0, (64 & 128) != 0 ? CommonRarityEnum.COMMON : it.getRarityEnum());
            }
        }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt.BlackPassPrizeListUi.2
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
                viewModelWithState.closeDialog();
            }
        }, composerStartRestartGroup, (i & 14) | 64, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt.BlackPassPrizeListUi.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    BlackPassPrizeListUiKt.BlackPassPrizeListUi(modifier2, viewModelWithState, mainViewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlackPassPrizeListUiContent(@Nullable Modifier modifier, @Nullable List<PrizeObj> list, @Nullable Function1<? super PrizeObj, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super PrizeObj, Unit> function12;
        int i4;
        Function0<Unit> function02;
        Modifier modifier3;
        List<PrizeObj> listEmptyList;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Function1<? super PrizeObj, Unit> function13;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-811895955);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if (i6 != 2 || (i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    listEmptyList = i6 == 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
                    Function1<? super PrizeObj, Unit> function14 = i7 == 0 ? new Function1<PrizeObj, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt.BlackPassPrizeListUiContent.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull PrizeObj it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PrizeObj prizeObj) {
                            invoke2(prizeObj);
                            return Unit.INSTANCE;
                        }
                    } : function12;
                    Function0<Unit> function04 = i4 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt.BlackPassPrizeListUiContent.2
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
                        ComposerKt.traceEventStart(-811895955, i3, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiContent (BlackPassPrizeListUi.kt:79)");
                    }
                    final LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(4);
                    final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._86sdp, composerStartRestartGroup, 6);
                    float f = 2;
                    final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(f);
                    final float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(f);
                    final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6);
                    final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                    final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, 6);
                    final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composerStartRestartGroup, 6);
                    final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    final float f2 = 0.94f;
                    final int i8 = 5;
                    final Function0<Unit> function05 = function04;
                    final List<PrizeObj> list2 = listEmptyList;
                    final Function1<? super PrizeObj, Unit> function15 = function14;
                    SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize(Modifier.INSTANCE, 0.86f), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -618369138, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1
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
                        public final void invoke(@Nullable Composer composer2, int i9) {
                            if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-618369138, i9, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiContent.<anonymous>.<anonymous> (BlackPassPrizeListUi.kt:104)");
                                }
                                float f3 = fM13666constructorimpl;
                                float f4 = fM13666constructorimpl2;
                                float f5 = fM13666constructorimpl3;
                                final Function0<Unit> function06 = function05;
                                final float f6 = fDimensionResource2;
                                float f7 = fDimensionResource3;
                                float f8 = fDimensionResource4;
                                float f9 = f2;
                                int i10 = i8;
                                LazyGridState lazyGridState = lazyGridStateRememberLazyGridState;
                                float f10 = fDimensionResource5;
                                float f11 = fDimensionResource6;
                                final List<PrizeObj> list3 = list2;
                                final Function1<PrizeObj, Unit> function16 = function15;
                                final float f12 = fDimensionResource;
                                composer2.startReplaceableGroup(-483455358);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m7771backgroundbw27NRU$default(companion2, ColorResources_androidKt.colorResource(R.color.red, composer2, 6), null, 2, null), 0.0f, 1, null), f3);
                                String upperCase = StringResources_androidKt.stringResource(R.string.black_pass_prize_list_title, composer2, 6).toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                int iM13558getCentere0LSkKk = TextAlign.INSTANCE.m13558getCentere0LSkKk();
                                TextKt.m10024Text4IGK_g(upperCase, modifierM8123padding3ABfNKs, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(iM13558getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14870mullerBold23spOr18ssp67j0QOw(Color.INSTANCE.m11377getWhite0d7_KjU(), 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer2, 28038, 2), composer2, 0, 0, 65020);
                                NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, f4, 0.0f, 0.0f, 13, null), 0.0f, 1, null), f5), 0L, composer2, 6, 2);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                Alignment topEnd = companion3.getTopEnd();
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                Modifier modifierM8123padding3ABfNKs2 = PaddingKt.m8123padding3ABfNKs(companion2, f3);
                                composer2.startReplaceableGroup(1327034204);
                                boolean zChanged = composer2.changed(function06);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$1$1$1$1
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
                                            function06.invoke();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8123padding3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composer2, -1016324899, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$1$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i11) {
                                        if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1016324899, i11, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackPassPrizeListUi.kt:136)");
                                            }
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_baseline_close_24, composer3, 6), (String) null, SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, f6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 6, 3072, 4094);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor5);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(i10), SizeKt.fillMaxWidth(PaddingKt.m8126paddingqDBjuR0(companion2, f7, f7, f8, f7), f9), lazyGridState, null, false, null, null, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1
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
                                        final List<PrizeObj> list4 = list3;
                                        final Function1<PrizeObj, Unit> function17 = function16;
                                        final float f13 = f12;
                                        final C4896x1b833f17 c4896x1b833f17 = new Function1() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$invoke$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            @Nullable
                                            public final Void invoke(PrizeObj prizeObj) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((PrizeObj) obj);
                                            }
                                        };
                                        LazyVerticalGrid.items(list4.size(), null, null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$invoke$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            @Nullable
                                            public final Object invoke(int i11) {
                                                return c4896x1b833f17.invoke(list4.get(i11));
                                            }
                                        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$invoke$$inlined$items$default$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                                invoke(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @Composable
                                            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i11, @Nullable Composer composer3, int i12) {
                                                int i13;
                                                if ((i12 & 14) == 0) {
                                                    i13 = i12 | (composer3.changed(lazyGridItemScope) ? 4 : 2);
                                                } else {
                                                    i13 = i12;
                                                }
                                                if ((i12 & 112) == 0) {
                                                    i13 |= composer3.changed(i11) ? 32 : 16;
                                                }
                                                if ((i13 & 731) == 146 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(699646206, i13, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
                                                }
                                                final PrizeObj prizeObj = (PrizeObj) list4.get(i11);
                                                final Function1 function18 = function17;
                                                Function0<Unit> function07 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$1$1
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
                                                        function18.invoke(new PrizeObj(0, prizeObj.getImageBitmap(), 0, 0, 0, prizeObj.getPrizeTitle(), 0, 1, 0, prizeObj.getRarity(), 349, null));
                                                    }
                                                };
                                                final float f14 = f13;
                                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, function07, ComposableLambdaKt.composableLambda(composer3, -975856876, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$1$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-975856876, i14, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackPassPrizeListUi.kt:171)");
                                                            }
                                                            BlackPassPrizeItemUiKt.m14889BlackPassPrizeItemUi6a0pyJM(null, prizeObj, f14, composer4, 64, 1);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }), composer3, 0, 3072, UnixStat.PERM_MASK);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                    }
                                }, composer2, 0, 504);
                                ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid(SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, f10, 0.0f, f10, 5, null), f11), 0.0f, 1, null), lazyGridState, i10, 0.0f, 0.0f, null, null, composer2, 384, 120);
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
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 12582918, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function13 = function14;
                    function03 = function04;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    listEmptyList = list;
                    modifier3 = modifier2;
                    function13 = function12;
                    function03 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final List<PrizeObj> list3 = listEmptyList;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt.BlackPassPrizeListUiContent.4
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

                        public final void invoke(@Nullable Composer composer2, int i9) {
                            BlackPassPrizeListUiKt.BlackPassPrizeListUiContent(modifier4, list3, function13, function03, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if (i6 != 2) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final LazyGridState lazyGridStateRememberLazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                final float fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(4);
                final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._86sdp, composerStartRestartGroup, 6);
                float f3 = 2;
                final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(f3);
                final float fM13666constructorimpl32 = C2046Dp.m13666constructorimpl(f3);
                final float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6);
                final float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                final float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, 6);
                final float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composerStartRestartGroup, 6);
                final float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    final float f22 = 0.94f;
                    final int i82 = 5;
                    final Function0<Unit> function052 = function04;
                    final List<PrizeObj> list22 = listEmptyList;
                    final Function1<? super PrizeObj, Unit> function152 = function14;
                    SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize(Modifier.INSTANCE, 0.86f), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -618369138, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1
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
                        public final void invoke(@Nullable Composer composer2, int i9) {
                            if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-618369138, i9, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiContent.<anonymous>.<anonymous> (BlackPassPrizeListUi.kt:104)");
                                }
                                float f32 = fM13666constructorimpl4;
                                float f4 = fM13666constructorimpl22;
                                float f5 = fM13666constructorimpl32;
                                final Function0<Unit> function06 = function052;
                                final float f6 = fDimensionResource22;
                                float f7 = fDimensionResource32;
                                float f8 = fDimensionResource42;
                                float f9 = f22;
                                int i10 = i82;
                                LazyGridState lazyGridState = lazyGridStateRememberLazyGridState2;
                                float f10 = fDimensionResource52;
                                float f11 = fDimensionResource62;
                                final List<PrizeObj> list32 = list22;
                                final Function1<? super PrizeObj, Unit> function16 = function152;
                                final float f12 = fDimensionResource7;
                                composer2.startReplaceableGroup(-483455358);
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion22);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor22);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion22);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy22, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m7771backgroundbw27NRU$default(companion22, ColorResources_androidKt.colorResource(R.color.red, composer2, 6), null, 2, null), 0.0f, 1, null), f32);
                                String upperCase = StringResources_androidKt.stringResource(R.string.black_pass_prize_list_title, composer2, 6).toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                int iM13558getCentere0LSkKk = TextAlign.INSTANCE.m13558getCentere0LSkKk();
                                TextKt.m10024Text4IGK_g(upperCase, modifierM8123padding3ABfNKs, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(iM13558getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14870mullerBold23spOr18ssp67j0QOw(Color.INSTANCE.m11377getWhite0d7_KjU(), 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer2, 28038, 2), composer2, 0, 0, 65020);
                                NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(companion22, 0.0f, f4, 0.0f, 0.0f, 13, null), 0.0f, 1, null), f5), 0L, composer2, 6, 2);
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                                Alignment topEnd = companion3.getTopEnd();
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                Modifier modifierM8123padding3ABfNKs2 = PaddingKt.m8123padding3ABfNKs(companion22, f32);
                                composer2.startReplaceableGroup(1327034204);
                                boolean zChanged = composer2.changed(function06);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$1$1$1$1
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
                                            function06.invoke();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8123padding3ABfNKs2, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, ComposableLambdaKt.composableLambda(composer2, -1016324899, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$1$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i11) {
                                        if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1016324899, i11, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackPassPrizeListUi.kt:136)");
                                            }
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_baseline_close_24, composer3, 6), (String) null, SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, f6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 6, 3072, 4094);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion22);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor5);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                LazyGridDslKt.LazyVerticalGrid(new GridCells.Fixed(i10), SizeKt.fillMaxWidth(PaddingKt.m8126paddingqDBjuR0(companion22, f7, f7, f8, f7), f9), lazyGridState, null, false, null, null, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1
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
                                        final List list4 = list32;
                                        final Function1 function17 = function16;
                                        final float f13 = f12;
                                        final Function1 c4896x1b833f17 = new Function1() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$invoke$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            @Nullable
                                            public final Void invoke(PrizeObj prizeObj) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((PrizeObj) obj);
                                            }
                                        };
                                        LazyVerticalGrid.items(list4.size(), null, null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$invoke$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            @Nullable
                                            public final Object invoke(int i11) {
                                                return c4896x1b833f17.invoke(list4.get(i11));
                                            }
                                        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$invoke$$inlined$items$default$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                                invoke(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @Composable
                                            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i11, @Nullable Composer composer3, int i12) {
                                                int i13;
                                                if ((i12 & 14) == 0) {
                                                    i13 = i12 | (composer3.changed(lazyGridItemScope) ? 4 : 2);
                                                } else {
                                                    i13 = i12;
                                                }
                                                if ((i12 & 112) == 0) {
                                                    i13 |= composer3.changed(i11) ? 32 : 16;
                                                }
                                                if ((i13 & 731) == 146 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(699646206, i13, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
                                                }
                                                final PrizeObj prizeObj = (PrizeObj) list4.get(i11);
                                                final Function1<? super PrizeObj, Unit> function18 = function17;
                                                Function0<Unit> function07 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$1$1
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
                                                        function18.invoke(new PrizeObj(0, prizeObj.getImageBitmap(), 0, 0, 0, prizeObj.getPrizeTitle(), 0, 1, 0, prizeObj.getRarity(), 349, null));
                                                    }
                                                };
                                                final float f14 = f13;
                                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, function07, ComposableLambdaKt.composableLambda(composer3, -975856876, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$1$2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer4, int i14) {
                                                        if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-975856876, i14, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlackPassPrizeListUi.kt:171)");
                                                            }
                                                            BlackPassPrizeItemUiKt.m14889BlackPassPrizeItemUi6a0pyJM(null, prizeObj, f14, composer4, 64, 1);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }), composer3, 0, 3072, UnixStat.PERM_MASK);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                    }
                                }, composer2, 0, 504);
                                ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid(SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion22, 0.0f, f10, 0.0f, f10, 5, null), f11), 0.0f, 1, null), lazyGridState, i10, 0.0f, 0.0f, null, null, composer2, 384, 120);
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
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), composerStartRestartGroup, 12582918, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function13 = function14;
                    function03 = function04;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if (i6 != 2) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @FigmaLargePreview
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    public static final void PreviewBlackPassPrizeListUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(356520300);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(356520300, i, -1, "com.blackhub.bronline.game.ui.blackpass.PreviewBlackPassPrizeListUi (BlackPassPrizeListUi.kt:195)");
            }
            BlackPassPrizeListUiContent(null, CollectionsKt__CollectionsKt.listOf((Object[]) new PrizeObj[]{new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null), new PrizeObj(0, null, 1, 0, 0, "награда награда", 0, 0, 0, 0, 987, null)}), null, null, composerStartRestartGroup, 64, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt.PreviewBlackPassPrizeListUi.1
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
                    BlackPassPrizeListUiKt.PreviewBlackPassPrizeListUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

