package com.blackhub.bronline.game.p019ui.halloweenaward;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.TwoColorVerticalBlockKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseOfferAwardWithoutBPBlock.kt */
/* loaded from: classes3.dex */
public final class PurchaseOfferAwardWithoutBPBlockKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PurchaseOfferAwardWithoutBPBlock(@Nullable Modifier modifier, @Nullable String str, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        final Modifier modifier3;
        final String strEmpty;
        Composer composerStartRestartGroup = composer.startRestartGroup(1559553126);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                str2 = str;
                int i5 = composerStartRestartGroup.changed(str2) ? 32 : 16;
                i3 |= i5;
            } else {
                str2 = str;
            }
            i3 |= i5;
        } else {
            str2 = str;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    modifier3 = modifier4;
                    strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1559553126, i3, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithoutBPBlock (PurchaseOfferAwardWithoutBPBlock.kt:29)");
                    }
                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen._221sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._69sdp, composerStartRestartGroup, 6));
                    Brush.Companion companion = Brush.INSTANCE;
                    TwoColorVerticalBlockKt.TwoColorVerticalBlock(modifierM8174sizeVpY3zN4, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), ComposableSingletons$PurchaseOfferAwardWithoutBPBlockKt.INSTANCE.m14978getLambda1$app_siteRelease(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 609476791, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithoutBPBlockKt.PurchaseOfferAwardWithoutBPBlock.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        public final void invoke(@Nullable Composer composer2, int i6) {
                            if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(609476791, i6, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithoutBPBlock.<anonymous> (PurchaseOfferAwardWithoutBPBlock.kt:57)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer2, 6), 0.0f, 0.0f, 13, null);
                                Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                String str3 = strEmpty;
                                composer2.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, centerVertically, composer2, 54);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                TextKt.m10024Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65534);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer2, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), 0.0f, 10, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ruble, composer2, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer2, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
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
                    }), composerStartRestartGroup, 27648, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    modifier3 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier3 = modifier2;
            }
            strEmpty = str2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen._221sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._69sdp, composerStartRestartGroup, 6));
            Brush.Companion companion2 = Brush.INSTANCE;
            TwoColorVerticalBlockKt.TwoColorVerticalBlock(modifierM8174sizeVpY3zN42, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m11289horizontalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), ComposableSingletons$PurchaseOfferAwardWithoutBPBlockKt.INSTANCE.m14978getLambda1$app_siteRelease(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 609476791, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithoutBPBlockKt.PurchaseOfferAwardWithoutBPBlock.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                public final void invoke(@Nullable Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(609476791, i6, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithoutBPBlock.<anonymous> (PurchaseOfferAwardWithoutBPBlock.kt:57)");
                        }
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion22, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer2, 6), 0.0f, 0.0f, 13, null);
                        Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        String str3 = strEmpty;
                        composer2.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m10024Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65534);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer2, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion22, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer2, 6), 0.0f, 10, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ruble, composer2, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion22, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer2, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
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
            }), composerStartRestartGroup, 27648, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            strEmpty = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithoutBPBlockKt.PurchaseOfferAwardWithoutBPBlock.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    PurchaseOfferAwardWithoutBPBlockKt.PurchaseOfferAwardWithoutBPBlock(modifier3, strEmpty, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void PreviewPurchaseOfferAwardWithoutBPBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-727241898);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-727241898, i, -1, "com.blackhub.bronline.game.ui.halloweenaward.PreviewPurchaseOfferAwardWithoutBPBlock (PurchaseOfferAwardWithoutBPBlock.kt:91)");
            }
            PurchaseOfferAwardWithoutBPBlock(null, "5000", composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithoutBPBlockKt.PreviewPurchaseOfferAwardWithoutBPBlock.1
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
                    PurchaseOfferAwardWithoutBPBlockKt.PreviewPurchaseOfferAwardWithoutBPBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

