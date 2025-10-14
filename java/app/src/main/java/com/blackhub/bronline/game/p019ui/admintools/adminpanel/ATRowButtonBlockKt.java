package com.blackhub.bronline.game.p019ui.admintools.adminpanel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.admintools.model.ATButtonItem;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
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
import org.apache.ivy.ant.IvyBuildList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATRowButtonBlock.kt */
@SourceDebugExtension({"SMAP\nATRowButtonBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ATRowButtonBlock.kt\ncom/blackhub/bronline/game/ui/admintools/adminpanel/ATRowButtonBlockKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,176:1\n87#2,6:177\n93#2:211\n97#2:216\n79#3,11:183\n92#3:215\n456#4,8:194\n464#4,3:208\n467#4,3:212\n3737#5,6:202\n*S KotlinDebug\n*F\n+ 1 ATRowButtonBlock.kt\ncom/blackhub/bronline/game/ui/admintools/adminpanel/ATRowButtonBlockKt\n*L\n47#1:177,6\n47#1:211\n47#1:216\n47#1:183,11\n47#1:215\n47#1:194,8\n47#1:208,3\n47#1:212,3\n47#1:202,6\n*E\n"})
/* loaded from: classes.dex */
public final class ATRowButtonBlockKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ATRowButtonBlock(@Nullable Modifier modifier, @NotNull final List<ATButtonItem> buttonList, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2078885736);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2078885736, i, -1, "com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlock (ATRowButtonBlock.kt:37)");
        }
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
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
        final Modifier modifier3 = modifier2;
        LazyDslKt.LazyRow(null, null, null, false, null, companion.getCenterVertically(), null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt$ATRowButtonBlock$1$1
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
            public final void invoke2(@NotNull LazyListScope LazyRow) {
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                final List<ATButtonItem> list = buttonList;
                final Brush brush = brushM11297verticalGradient8A3gB4$default;
                final C4790x16502fea c4790x16502fea = new Function1() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt$ATRowButtonBlock$1$1$invoke$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Void invoke(ATButtonItem aTButtonItem) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((ATButtonItem) obj);
                    }
                };
                LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt$ATRowButtonBlock$1$1$invoke$$inlined$items$default$3
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
                        return c4790x16502fea.invoke(list.get(i3));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt$ATRowButtonBlock$1$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:55:0x0309  */
                    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
                    @Composable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i3, @Nullable Composer composer2, int i4) {
                        int i5;
                        int i6;
                        ATButtonItem aTButtonItem;
                        int i7;
                        if ((i4 & 14) == 0) {
                            i5 = i4 | (composer2.changed(lazyItemScope) ? 4 : 2);
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
                        final ATButtonItem aTButtonItem2 = (ATButtonItem) list.get(i3);
                        int id = aTButtonItem2.getId();
                        if (id != 1 && id != 2) {
                            if (id == 8) {
                                composer2.startReplaceableGroup(-672917887);
                                Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._64wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composer2, 6));
                                String text = aTButtonItem2.getText();
                                float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6), composer2, 0);
                                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122);
                                RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6));
                                BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer2, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
                                composer2.startReplaceableGroup(-672916799);
                                boolean zChanged = composer2.changed(aTButtonItem2);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt$ATRowButtonBlock$1$1$1$2$1
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
                                            aTButtonItem2.getOnItemClick().invoke();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, text, textStyleM14811montserratBoldCustomSpIzzofJo, 0.0f, 0, null, null, null, 0.0f, 0L, fM14409dpToPx8Feqmps, null, roundedCornerShapeM8392RoundedCornerShape0680j_4, borderStrokeM7798BorderStrokecXLIe8U, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue, composer2, 0, 0, 0, 16750578);
                                composer2.endReplaceableGroup();
                            } else if (id != 9) {
                                composer2.startReplaceableGroup(-672916645);
                                Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._64wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._37wdp, composer2, 6));
                                Integer imageRes = aTButtonItem2.getImageRes();
                                float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer2, 6);
                                String text2 = aTButtonItem2.getText();
                                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo2 = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122);
                                RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6));
                                BorderStroke borderStrokeM7798BorderStrokecXLIe8U2 = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer2, 6), Color.INSTANCE.m11377getWhite0d7_KjU());
                                C2046Dp c2046DpM13664boximpl = C2046Dp.m13664boximpl(fDimensionResource);
                                Brush brush2 = brush;
                                composer2.startReplaceableGroup(-672915410);
                                boolean zChanged2 = composer2.changed(aTButtonItem2);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt$ATRowButtonBlock$1$1$1$3$1
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
                                            aTButtonItem2.getOnItemClick().invoke();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, text2, textStyleM14811montserratBoldCustomSpIzzofJo2, 0.0f, 0, imageRes, c2046DpM13664boximpl, null, 0.0f, 0L, 0.0f, brush2, roundedCornerShapeM8392RoundedCornerShape0680j_42, borderStrokeM7798BorderStrokecXLIe8U2, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue2, composer2, 0, 100663296, 0, 16486194);
                                composer2.endReplaceableGroup();
                            } else {
                                i7 = 6;
                                i6 = R.dimen._5wdp;
                                aTButtonItem = aTButtonItem2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        i6 = R.dimen._5wdp;
                        aTButtonItem = aTButtonItem2;
                        i7 = 6;
                        composer2.startReplaceableGroup(-672919253);
                        Modifier modifierM8156defaultMinSizeVpY3zN43 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer2, i7), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._53wdp, composer2, i7), PrimitiveResources_androidKt.dimensionResource(R.dimen._26wdp, composer2, i7));
                        Integer imageRes2 = aTButtonItem.getImageRes();
                        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composer2, i7);
                        float fM14409dpToPx8Feqmps2 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, i7), composer2, 0);
                        final ATButtonItem aTButtonItem3 = aTButtonItem;
                        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo3 = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122);
                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i6, composer2, i7));
                        BorderStroke borderStrokeM7798BorderStrokecXLIe8U3 = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer2, i7), Color.INSTANCE.m11377getWhite0d7_KjU());
                        C2046Dp c2046DpM13664boximpl2 = C2046Dp.m13664boximpl(fDimensionResource2);
                        composer2.startReplaceableGroup(-672918068);
                        boolean zChanged3 = composer2.changed(aTButtonItem3);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt$ATRowButtonBlock$1$1$1$1$1
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
                                    aTButtonItem3.getOnItemClick().invoke();
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN43, null, null, textStyleM14811montserratBoldCustomSpIzzofJo3, 0.0f, 0, imageRes2, c2046DpM13664boximpl2, null, 0.0f, 0L, fM14409dpToPx8Feqmps2, null, roundedCornerShapeM8392RoundedCornerShape0680j_43, borderStrokeM7798BorderStrokecXLIe8U3, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue3, composer2, 0, 0, 0, 16750390);
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 223);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.ATRowButtonBlock.2
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
                    ATRowButtonBlockKt.ATRowButtonBlock(modifier3, buttonList, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewATRowButtonBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2142573701);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2142573701, i, -1, "com.blackhub.bronline.game.ui.admintools.adminpanel.PreviewATRowButtonBlock (ATRowButtonBlock.kt:135)");
            }
            ATRowButtonBlock(null, CollectionsKt__CollectionsKt.listOf((Object[]) new ATButtonItem[]{new ATButtonItem(3, "kick", Integer.valueOf(R.drawable.ic_kick), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.PreviewATRowButtonBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }), new ATButtonItem(4, IFramePlayerOptions.Builder.MUTE, Integer.valueOf(R.drawable.ic_mute), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.PreviewATRowButtonBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }), new ATButtonItem(5, "jail", Integer.valueOf(R.drawable.ic_jail), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.PreviewATRowButtonBlock.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }), new ATButtonItem(6, IvyBuildList.OnMissingDescriptor.WARN, Integer.valueOf(R.drawable.ic_warn), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.PreviewATRowButtonBlock.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }), new ATButtonItem(7, "slap", Integer.valueOf(R.drawable.ic_slap), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.PreviewATRowButtonBlock.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }), new ATButtonItem(8, "ban", null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.PreviewATRowButtonBlock.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, 4, null)}), composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.adminpanel.ATRowButtonBlockKt.PreviewATRowButtonBlock.7
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
                    ATRowButtonBlockKt.PreviewATRowButtonBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

