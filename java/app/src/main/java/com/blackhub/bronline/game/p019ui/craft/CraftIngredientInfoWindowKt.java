package com.blackhub.bronline.game.p019ui.craft;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftIngredientInfoWindow.kt */
@SourceDebugExtension({"SMAP\nCraftIngredientInfoWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftIngredientInfoWindow.kt\ncom/blackhub/bronline/game/ui/craft/CraftIngredientInfoWindowKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,77:1\n75#2,5:78\n80#2:111\n84#2:116\n79#3,11:83\n92#3:115\n456#4,8:94\n464#4,3:108\n467#4,3:112\n3737#5,6:102\n*S KotlinDebug\n*F\n+ 1 CraftIngredientInfoWindow.kt\ncom/blackhub/bronline/game/ui/craft/CraftIngredientInfoWindowKt\n*L\n29#1:78,5\n29#1:111\n29#1:116\n29#1:83,11\n29#1:115\n29#1:94,8\n29#1:108,3\n29#1:112,3\n29#1:102,6\n*E\n"})

public final class CraftIngredientInfoWindowKt {

    /* compiled from: CraftIngredientInfoWindow.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftIngredientInfoWindowKt$CraftIngredientInfoWindow$2 */
    /* loaded from: classes3.dex */
    public static final class C54102 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CraftIngredient $ingredient;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54102(CraftIngredient craftIngredient, int i, int i2) {
            super(2);
            craftIngredient = craftIngredient;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CraftIngredientInfoWindowKt.CraftIngredientInfoWindow(modifier, craftIngredient, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: CraftIngredientInfoWindow.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftIngredientInfoWindowKt$CraftIngredientInfoWindowPreview$1 */
    /* loaded from: classes3.dex */
    public static final class C54111 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54111(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CraftIngredientInfoWindowKt.CraftIngredientInfoWindowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftIngredientInfoWindow(@Nullable Modifier modifier, @NotNull CraftIngredient ingredient, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(ingredient, "ingredient");
        Composer composerStartRestartGroup = composer.startRestartGroup(2077987590);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2077987590, i, -1, "com.blackhub.bronline.game.ui.craft.CraftIngredientInfoWindow (CraftIngredientInfoWindow.kt:25)");
        }
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6));
        Modifier modifierM8123padding3ABfNKs = PaddingKt.m8123padding3ABfNKs(ClipKt.clip(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(modifier3, ColorResources_androidKt.colorResource(R.color.black_gray_blue_80, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4), roundedCornerShapeM8392RoundedCornerShape0680j_4), PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6));
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8123padding3ABfNKs);
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-2040587529);
        if (ingredient.getName().length() > 0) {
            modifier2 = modifier3;
            composer2 = composerStartRestartGroup;
            TextKt.m10024Text4IGK_g(ingredient.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._9wsp, ColorResources_androidKt.colorResource(ingredient.getBackgroundColor(), composerStartRestartGroup, 0), 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 124), composer2, 0, 0, 65534);
        } else {
            modifier2 = modifier3;
            composer2 = composerStartRestartGroup;
        }
        composer2.endReplaceableGroup();
        Composer composer4 = composer2;
        composer4.startReplaceableGroup(-1975214705);
        if (ingredient.getDescription().length() > 0) {
            composer3 = composer4;
            TextKt.m10024Text4IGK_g(ingredient.getDescription(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._9wsp, ColorResources_androidKt.colorResource(R.color.white, composer4, 6), 0, 0L, 0.0f, composer4, 196614, 28), composer3, 0, 0, 65534);
        } else {
            composer3 = composer4;
        }
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftIngredientInfoWindowKt.CraftIngredientInfoWindow.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ CraftIngredient $ingredient;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C54102(CraftIngredient ingredient2, int i3, int i22) {
                    super(2);
                    craftIngredient = ingredient2;
                    i = i3;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer5, int i3) {
                    CraftIngredientInfoWindowKt.CraftIngredientInfoWindow(modifier, craftIngredient, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftIngredientInfoWindowPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-381349688);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-381349688, i, -1, "com.blackhub.bronline.game.ui.craft.CraftIngredientInfoWindowPreview (CraftIngredientInfoWindow.kt:66)");
            }
            CraftIngredientInfoWindow(null, new CraftIngredient(0, CommonRarityEnum.EPIC, "Инструкция Костюм Егеря", "Помогут прикрутить\nнеприкрученное к чему\nугодно и когда угодно", null, 0, 0, 0, 0, false, false, 2033, null), composerStartRestartGroup, 64, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftIngredientInfoWindowKt.CraftIngredientInfoWindowPreview.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C54111(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CraftIngredientInfoWindowKt.CraftIngredientInfoWindowPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

