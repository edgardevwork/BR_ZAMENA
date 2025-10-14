package com.blackhub.bronline.game.p019ui.gifts;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import com.blackhub.bronline.game.gui.gifts.model.GiftsPreviewItemModel;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselDefaults;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsPreviewItemBlock.kt */
@SourceDebugExtension({"SMAP\nGiftsPreviewItemBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsPreviewItemBlock.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsPreviewItemBlockKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,175:1\n73#2,7:176\n80#2:211\n74#2,6:212\n80#2:246\n84#2:291\n84#2:296\n79#3,11:183\n79#3,11:218\n79#3,11:253\n92#3:285\n92#3:290\n92#3:295\n456#4,8:194\n464#4,3:208\n456#4,8:229\n464#4,3:243\n456#4,8:264\n464#4,3:278\n467#4,3:282\n467#4,3:287\n467#4,3:292\n3737#5,6:202\n3737#5,6:237\n3737#5,6:272\n87#6,6:247\n93#6:281\n97#6:286\n*S KotlinDebug\n*F\n+ 1 GiftsPreviewItemBlock.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsPreviewItemBlockKt\n*L\n78#1:176,7\n78#1:211\n79#1:212,6\n79#1:246\n79#1:291\n78#1:296\n78#1:183,11\n79#1:218,11\n101#1:253,11\n101#1:285\n79#1:290\n78#1:295\n78#1:194,8\n78#1:208,3\n79#1:229,8\n79#1:243,3\n101#1:264,8\n101#1:278,3\n101#1:282,3\n79#1:287,3\n78#1:292,3\n78#1:202,6\n79#1:237,6\n101#1:272,6\n101#1:247,6\n101#1:281\n101#1:286\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsPreviewItemBlockKt {

    /* compiled from: GiftsPreviewItemBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt$GiftsPreviewItemBlock$1 */
    /* loaded from: classes.dex */
    public static final class C56191 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<GiftsPreviewItemModel> $allPrizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56191(List<GiftsPreviewItemModel> list, int i, int i2) {
            super(2);
            list = list;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsPreviewItemBlockKt.GiftsPreviewItemBlock(modifier, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: GiftsPreviewItemBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt$GiftsPreviewItemBlockContent$2 */
    /* loaded from: classes.dex */
    public static final class C56202 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<GiftsPreviewItemModel> $allPrizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56202(List<GiftsPreviewItemModel> list, int i, int i2) {
            super(2);
            list = list;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsPreviewItemBlockKt.GiftsPreviewItemBlockContent(modifier, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: GiftsPreviewItemBlock.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt$PreviewGiftsPreviewItemBlock$1 */
    /* loaded from: classes.dex */
    public static final class C56211 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56211(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsPreviewItemBlockKt.PreviewGiftsPreviewItemBlock(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void GiftsPreviewItemBlock(@Nullable Modifier modifier, @NotNull List<GiftsPreviewItemModel> allPrizes, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(allPrizes, "allPrizes");
        Composer composerStartRestartGroup = composer.startRestartGroup(1042381268);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1042381268, i, -1, "com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlock (GiftsPreviewItemBlock.kt:36)");
        }
        GiftsPreviewItemBlockContent(modifier, allPrizes, composerStartRestartGroup, (i & 14) | 64, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt.GiftsPreviewItemBlock.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ List<GiftsPreviewItemModel> $allPrizes;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C56191(List<GiftsPreviewItemModel> allPrizes2, int i3, int i22) {
                    super(2);
                    list = allPrizes2;
                    i = i3;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    GiftsPreviewItemBlockKt.GiftsPreviewItemBlock(modifier, list, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void GiftsPreviewItemBlockContent(@Nullable Modifier modifier, @NotNull final List<GiftsPreviewItemModel> allPrizes, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(allPrizes, "allPrizes");
        Composer composerStartRestartGroup = composer.startRestartGroup(296829257);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(296829257, i, -1, "com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockContent (GiftsPreviewItemBlock.kt:47)");
        }
        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._184sdp, composerStartRestartGroup, 6);
        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, 6);
        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6);
        float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
        float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, 6);
        float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
        float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        LazyListState lazyListState = new LazyListState(0, 0, 3, null);
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifier3 = modifier2;
        Modifier modifierM8160heightInVpY3zN4$default = SizeKt.m8160heightInVpY3zN4$default(BackgroundKt.background$default(modifier2, brushM11297verticalGradient8A3gB4$default, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource2), 0.0f, 4, null), 0.0f, fDimensionResource, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8160heightInVpY3zN4$default);
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(BackgroundKt.m7770backgroundbw27NRU(companion2, ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource2)), 0.0f, 1, null), 0.0f, fDimensionResource3, 1, null);
        String upperCase = StringResources_androidKt.stringResource(R.string.gift_purchase_title_preview_gifts, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        TextKt.m10024Text4IGK_g(upperCase, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14792montserratBold13spOr10ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
        Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(companion2, fDimensionResource4, fDimensionResource5);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
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
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        LazyDslKt.LazyColumn(SizeKt.fillMaxWidth(PaddingKt.m8125paddingVpY3zN4$default(companion2, fDimensionResource4, 0.0f, 2, null), 0.99f), lazyListState, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt$GiftsPreviewItemBlockContent$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                final List<GiftsPreviewItemModel> list = allPrizes;
                final C5615xef262933 c5615xef262933 = new Function1() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt$GiftsPreviewItemBlockContent$1$1$1$1$invoke$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Void invoke(GiftsPreviewItemModel giftsPreviewItemModel) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((GiftsPreviewItemModel) obj);
                    }
                };
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt$GiftsPreviewItemBlockContent$1$1$1$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @Nullable
                    public final Object invoke(int i3) {
                        return c5615xef262933.invoke(list.get(i3));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt$GiftsPreviewItemBlockContent$1$1$1$1$invoke$$inlined$items$default$4
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
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i3, @Nullable Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = (composer2.changed(lazyItemScope) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & 112) == 0) {
                            i5 |= composer2.changed(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        GiftsPreviewListItemKt.GiftsPreviewListItem(null, (GiftsPreviewItemModel) list.get(i3), composer2, 64, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, 0, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
        CarouselKt.Carousel(lazyListState, SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(companion2, fDimensionResource7), 0.0f, 1, null), 0.0f, 0.0f, CarouselDefaults.INSTANCE.colors(brushM11289horizontalGradient8A3gB4$default, null, brushM11289horizontalGradient8A3gB4$default2, null, composerStartRestartGroup, CpioConstants.C_ISBLK, 10), composerStartRestartGroup, 0, 12);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        BoxKt.Box(SizeKt.m8158height3ABfNKs(companion2, fDimensionResource6), composerStartRestartGroup, 0);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt.GiftsPreviewItemBlockContent.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ List<GiftsPreviewItemModel> $allPrizes;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C56202(final List<GiftsPreviewItemModel> allPrizes2, int i3, int i22) {
                    super(2);
                    list = allPrizes2;
                    i = i3;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    GiftsPreviewItemBlockKt.GiftsPreviewItemBlockContent(modifier, list, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "PreviewGiftsPreviewItemBlock")
    public static final void PreviewGiftsPreviewItemBlock(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-170181991);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-170181991, i, -1, "com.blackhub.bronline.game.ui.gifts.PreviewGiftsPreviewItemBlock (GiftsPreviewItemBlock.kt:137)");
            }
            GiftsPreviewItemBlockContent(null, CollectionsKt__CollectionsKt.listOf((Object[]) new GiftsPreviewItemModel[]{new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 1", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_2, "name 2", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_3, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_4, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_5, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 3", 1, null), new GiftsPreviewItemModel(null, R.drawable.ic_gift_style_1, "name 3", 1, null)}), composerStartRestartGroup, 64, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPreviewItemBlockKt.PreviewGiftsPreviewItemBlock.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C56211(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    GiftsPreviewItemBlockKt.PreviewGiftsPreviewItemBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

