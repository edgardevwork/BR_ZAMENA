package com.blackhub.bronline.game.p019ui.taxiorder;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
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
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.taxiorder.TaxiCompanyEnum;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiCompanyButton.kt */
@SourceDebugExtension({"SMAP\nTaxiCompanyButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiCompanyButton.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiCompanyButtonKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n*S KotlinDebug\n*F\n+ 1 TaxiCompanyButton.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiCompanyButtonKt\n*L\n37#1:125\n37#1:126,3\n*E\n"})
/* loaded from: classes2.dex */
public final class TaxiCompanyButtonKt {

    /* compiled from: TaxiCompanyButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt$TaxiCompanyButton$3 */
    /* loaded from: classes7.dex */
    public static final class C60523 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ List<Integer> $buttonBrushColors;
        public final /* synthetic */ int $buttonPainter;
        public final /* synthetic */ TaxiCompanyEnum $company;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60523(int i, List<Integer> list, TaxiCompanyEnum taxiCompanyEnum, Function0<Unit> function0, int i2) {
            super(2);
            i = i;
            list = list;
            taxiCompanyEnum = taxiCompanyEnum;
            function0 = function0;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TaxiCompanyButtonKt.TaxiCompanyButton(i, list, taxiCompanyEnum, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: TaxiCompanyButton.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt$TaxiCompanyButtonPreview$2 */
    /* loaded from: classes8.dex */
    public static final class C60542 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60542(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            TaxiCompanyButtonKt.TaxiCompanyButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaxiCompanyButton(int i, @NotNull List<Integer> buttonBrushColors, @NotNull TaxiCompanyEnum company, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(buttonBrushColors, "buttonBrushColors");
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1252673001);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1252673001, i2, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButton (TaxiCompanyButton.kt:32)");
        }
        String strStringResource = StringResources_androidKt.stringResource(company.getCompanyNameResId(), composerStartRestartGroup, 0);
        Brush.Companion companion = Brush.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1397949082);
        List<Integer> list = buttonBrushColors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) it.next()).intValue(), composerStartRestartGroup, 0)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 2, null), null, true, null, true, false, false, false, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6)), 0, 0L, onClick, C60501.INSTANCE, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039152986, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt.TaxiCompanyButton.2
            public final /* synthetic */ Brush $buttonBrush;
            public final /* synthetic */ int $buttonPainter;
            public final /* synthetic */ String $companyName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C60512(int i3, String strStringResource2, Brush brush) {
                super(2);
                i = i3;
                str = strStringResource2;
                brush = brush;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1039152986, i3, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButton.<anonymous> (TaxiCompanyButton.kt:49)");
                    }
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    TaxiCompanyEnum taxiCompanyEnum = taxiCompanyEnum;
                    int i4 = i;
                    String str = str;
                    Brush brush = brush;
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Alignment center = companion2.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (!taxiCompanyEnum.getIsFastestOrDemanded()) {
                        composer2.startReplaceableGroup(-1073639292);
                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._146wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._67wdp, composer2, 6));
                        Alignment bottomStart = companion2.getBottomStart();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomStart, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
                        BoxKt.Box(BackgroundKt.background$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._135wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._54wdp, composer2, 6)), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), 7, null), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), 0.0f, 4, null), composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-1073638343);
                        ImageKt.Image(PainterResources_androidKt.painterResource(i4, composer2, 0), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._146wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._67wdp, composer2, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        composer2.endReplaceableGroup();
                    }
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(str, OffsetKt.m8083offsetVpY3zN4(companion3, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer2, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._14wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 0, 65532);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(taxiCompanyEnum.getDescriptionId(), composer2, 0), OffsetKt.m8084offsetVpY3zN4$default(companion3, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6)), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._11wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 0, 65532);
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
        }), composerStartRestartGroup, 12607872, ((i2 >> 6) & 112) | 3456, 1642);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt.TaxiCompanyButton.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ List<Integer> $buttonBrushColors;
                public final /* synthetic */ int $buttonPainter;
                public final /* synthetic */ TaxiCompanyEnum $company;
                public final /* synthetic */ Function0<Unit> $onClick;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C60523(int i3, List<Integer> buttonBrushColors2, TaxiCompanyEnum company2, Function0<Unit> onClick2, int i22) {
                    super(2);
                    i = i3;
                    list = buttonBrushColors2;
                    taxiCompanyEnum = company2;
                    function0 = onClick2;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    TaxiCompanyButtonKt.TaxiCompanyButton(i, list, taxiCompanyEnum, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: TaxiCompanyButton.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt$TaxiCompanyButton$1 */
    /* loaded from: classes7.dex */
    public static final class C60501 extends Lambda implements Function0<Unit> {
        public static final C60501 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: TaxiCompanyButton.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nTaxiCompanyButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiCompanyButton.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiCompanyButtonKt$TaxiCompanyButton$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,124:1\n73#2,7:125\n80#2:160\n84#2:245\n79#3,11:132\n79#3,11:166\n79#3,11:200\n92#3:232\n92#3:238\n92#3:244\n456#4,8:143\n464#4,3:157\n456#4,8:177\n464#4,3:191\n456#4,8:211\n464#4,3:225\n467#4,3:229\n467#4,3:235\n467#4,3:241\n3737#5,6:151\n3737#5,6:185\n3737#5,6:219\n69#6,5:161\n74#6:194\n69#6,5:195\n74#6:228\n78#6:233\n78#6:239\n64#7:234\n64#7:240\n*S KotlinDebug\n*F\n+ 1 TaxiCompanyButton.kt\ncom/blackhub/bronline/game/ui/taxiorder/TaxiCompanyButtonKt$TaxiCompanyButton$2\n*L\n50#1:125,7\n50#1:160\n50#1:245\n50#1:132,11\n53#1:166,11\n58#1:200,11\n58#1:232\n53#1:238\n50#1:244\n50#1:143,8\n50#1:157,3\n53#1:177,8\n53#1:191,3\n58#1:211,8\n58#1:225,3\n58#1:229,3\n53#1:235,3\n50#1:241,3\n50#1:151,6\n53#1:185,6\n58#1:219,6\n53#1:161,5\n53#1:194\n58#1:195,5\n58#1:228\n58#1:233\n53#1:239\n93#1:234\n104#1:240\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt$TaxiCompanyButton$2 */
    /* loaded from: classes7.dex */
    public static final class C60512 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Brush $buttonBrush;
        public final /* synthetic */ int $buttonPainter;
        public final /* synthetic */ String $companyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60512(int i3, String strStringResource2, Brush brush) {
            super(2);
            i = i3;
            str = strStringResource2;
            brush = brush;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i3) {
            if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1039152986, i3, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButton.<anonymous> (TaxiCompanyButton.kt:49)");
                }
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                TaxiCompanyEnum taxiCompanyEnum = taxiCompanyEnum;
                int i4 = i;
                String str = str;
                Brush brush = brush;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Alignment center = companion2.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (!taxiCompanyEnum.getIsFastestOrDemanded()) {
                    composer2.startReplaceableGroup(-1073639292);
                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._146wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._67wdp, composer2, 6));
                    Alignment bottomStart = companion2.getBottomStart();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomStart, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
                    BoxKt.Box(BackgroundKt.background$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._135wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._54wdp, composer2, 6)), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), 7, null), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6)), 0.0f, 4, null), composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1073638343);
                    ImageKt.Image(PainterResources_androidKt.painterResource(i4, composer2, 0), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._146wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._67wdp, composer2, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                }
                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                TextKt.m10024Text4IGK_g(str, OffsetKt.m8083offsetVpY3zN4(companion3, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer2, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._14wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 0, 65532);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(taxiCompanyEnum.getDescriptionId(), composer2, 0), OffsetKt.m8084offsetVpY3zN4$default(companion3, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6)), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14873mullerBoldCustomSpbl3sdaw(R.dimen._11wsp, 0L, 0, 0L, 0.0f, composer2, 196614, 30), composer2, 0, 0, 65532);
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
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void TaxiCompanyButtonPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1022069676);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1022069676, i, -1, "com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonPreview (TaxiCompanyButton.kt:111)");
            }
            TaxiCompanyButton(R.drawable.ic_taxi_element_active, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.red), Integer.valueOf(R.color.orange)}), TaxiCompanyEnum.YANDEX_TAXI, C60531.INSTANCE, composerStartRestartGroup, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt.TaxiCompanyButtonPreview.2
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C60542(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    TaxiCompanyButtonKt.TaxiCompanyButtonPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: TaxiCompanyButton.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.taxiorder.TaxiCompanyButtonKt$TaxiCompanyButtonPreview$1 */
    /* loaded from: classes8.dex */
    public static final class C60531 extends Lambda implements Function0<Unit> {
        public static final C60531 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}

