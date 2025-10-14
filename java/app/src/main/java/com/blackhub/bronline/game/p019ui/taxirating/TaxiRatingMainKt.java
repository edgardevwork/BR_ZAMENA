package com.blackhub.bronline.game.p019ui.taxirating;

import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.vector.ImageVector;
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
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaxiRatingMain.kt */
@SourceDebugExtension({"SMAP\nTaxiRatingMain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiRatingMain.kt\ncom/blackhub/bronline/game/ui/taxirating/TaxiRatingMainKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,313:1\n1116#2,6:314\n*S KotlinDebug\n*F\n+ 1 TaxiRatingMain.kt\ncom/blackhub/bronline/game/ui/taxirating/TaxiRatingMainKt\n*L\n73#1:314,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TaxiRatingMainKt {
    public static final float WIDTH = 0.98f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TaxiRatingMain(final boolean z, @ColorRes final int i, @ColorRes final int i2, @ColorRes final int i3, @ColorRes final int i4, @ColorRes final int i5, @ColorRes final int i6, @ColorRes final int i7, @ColorRes final int i8, @NotNull final Function1<? super Integer, Unit> onRateStarClick, @NotNull final Function1<? super Integer, Unit> onTipsClick, @NotNull final Function0<Unit> onOkBtnClick, @Nullable Composer composer, final int i9, final int i10) {
        int i11;
        int i12;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onRateStarClick, "onRateStarClick");
        Intrinsics.checkNotNullParameter(onTipsClick, "onTipsClick");
        Intrinsics.checkNotNullParameter(onOkBtnClick, "onOkBtnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1491588485);
        if ((i9 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i9 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i9 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
        }
        if ((57344 & i9) == 0) {
            i11 |= composerStartRestartGroup.changed(i4) ? 16384 : 8192;
        }
        if ((i9 & 458752) == 0) {
            i11 |= composerStartRestartGroup.changed(i5) ? 131072 : 65536;
        }
        if ((i9 & 3670016) == 0) {
            i11 |= composerStartRestartGroup.changed(i6) ? 1048576 : 524288;
        }
        if ((i9 & 29360128) == 0) {
            i11 |= composerStartRestartGroup.changed(i7) ? 8388608 : 4194304;
        }
        if ((i9 & 234881024) == 0) {
            i11 |= composerStartRestartGroup.changed(i8) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i9 & 1879048192) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onRateStarClick) ? 536870912 : 268435456;
        }
        if ((i10 & 14) == 0) {
            i12 = i10 | (composerStartRestartGroup.changedInstance(onTipsClick) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onOkBtnClick) ? 32 : 16;
        }
        if ((1533916891 & i11) != 306783378 || (i12 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1491588485, i11, i12, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingMain (TaxiRatingMain.kt:63)");
            }
            final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(688915728);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            FakeDialogKt.m15089FakeDialog3IgeMak(null, ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composer2, 2138129, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt.TaxiRatingMain.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                public final void invoke(@Nullable Composer composer3, int i13) {
                    if ((i13 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2138129, i13, -1, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingMain.<anonymous> (TaxiRatingMain.kt:77)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment center = companion.getCenter();
                        boolean z2 = z;
                        final Function0<Unit> function0 = onOkBtnClick;
                        int i14 = i;
                        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        final Function1<Integer, Unit> function1 = onRateStarClick;
                        int i15 = i2;
                        int i16 = i3;
                        int i17 = i4;
                        int i18 = i5;
                        final Function1<Integer, Unit> function12 = onTipsClick;
                        final RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                        final int i19 = i6;
                        final int i20 = i7;
                        final int i21 = i8;
                        final Brush brush = brushM11289horizontalGradient8A3gB4$default;
                        composer3.startReplaceableGroup(733328855);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._315wdp, composer3, 6)), ColorResources_androidKt.colorResource(R.color.black_80, composer3, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer3, 6)));
                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                        composer3.startReplaceableGroup(-483455358);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.taxi_rating_title, composer3, 6), PaddingKt.m8124paddingVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer3, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14783defaultFontWithoutFontFamilyiJQMabo(R.dimen._15wdp, 0L, composer3, 390, 2), composer3, 0, 0, 65020);
                        composer3.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Icons icons = Icons.INSTANCE;
                        ImageVector star = StarKt.getStar(icons.getDefault());
                        long jColorResource = ColorResources_androidKt.colorResource(i14, composer3, 0);
                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6));
                        composer3.startReplaceableGroup(-1266208493);
                        boolean zChanged = composer3.changed(function1);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$1$1$1
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
                                    function1.invoke(1);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        IconKt.m9497Iconww6aTOc(star, (String) null, ClickableKt.m7803clickableO2vRcR0$default(modifierM8172size3ABfNKs, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue2, 28, null), jColorResource, composer3, 48, 0);
                        ImageVector star2 = StarKt.getStar(icons.getDefault());
                        long jColorResource2 = ColorResources_androidKt.colorResource(i15, composer3, 0);
                        Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6));
                        composer3.startReplaceableGroup(-1266207867);
                        boolean zChanged2 = composer3.changed(function1);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$1$2$1
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
                                    function1.invoke(2);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        IconKt.m9497Iconww6aTOc(star2, (String) null, ClickableKt.m7803clickableO2vRcR0$default(modifierM8172size3ABfNKs2, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue3, 28, null), jColorResource2, composer3, 48, 0);
                        ImageVector star3 = StarKt.getStar(icons.getDefault());
                        long jColorResource3 = ColorResources_androidKt.colorResource(i16, composer3, 0);
                        Modifier modifierM8172size3ABfNKs3 = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6));
                        composer3.startReplaceableGroup(-1266207239);
                        boolean zChanged3 = composer3.changed(function1);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$1$3$1
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
                                    function1.invoke(3);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        IconKt.m9497Iconww6aTOc(star3, (String) null, ClickableKt.m7803clickableO2vRcR0$default(modifierM8172size3ABfNKs3, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue4, 28, null), jColorResource3, composer3, 48, 0);
                        ImageVector star4 = StarKt.getStar(icons.getDefault());
                        long jColorResource4 = ColorResources_androidKt.colorResource(i17, composer3, 0);
                        Modifier modifierM8172size3ABfNKs4 = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6));
                        composer3.startReplaceableGroup(-1266206610);
                        boolean zChanged4 = composer3.changed(function1);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$1$4$1
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
                                    function1.invoke(4);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        IconKt.m9497Iconww6aTOc(star4, (String) null, ClickableKt.m7803clickableO2vRcR0$default(modifierM8172size3ABfNKs4, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue5, 28, null), jColorResource4, composer3, 48, 0);
                        ImageVector star5 = StarKt.getStar(icons.getDefault());
                        long jColorResource5 = ColorResources_androidKt.colorResource(i18, composer3, 0);
                        Modifier modifierM8172size3ABfNKs5 = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer3, 6));
                        composer3.startReplaceableGroup(-1266205982);
                        boolean zChanged5 = composer3.changed(function1);
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$1$5$1
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
                                    function1.invoke(5);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        composer3.endReplaceableGroup();
                        IconKt.m9497Iconww6aTOc(star5, (String) null, ClickableKt.m7803clickableO2vRcR0$default(modifierM8172size3ABfNKs5, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue6, 28, null), jColorResource5, composer3, 48, 0);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.fillMaxWidth(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer3, 6)), 0.98f), 0L, composer3, 0, 2);
                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 7, null);
                        composer3.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1266205322);
                        boolean zChanged6 = composer3.changed(function12);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$2$1$1
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
                                    function12.invoke(70);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        composer3.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue7, ComposableLambdaKt.composableLambda(composer3, 1358945783, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$2$2
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
                            public final void invoke(@Nullable Composer composer4, int i22) {
                                if ((i22 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1358945783, i22, -1, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaxiRatingMain.kt:184)");
                                    }
                                    Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer4, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._80wdp, composer4, 6)), ColorResources_androidKt.colorResource(R.color.darker_gray, composer4, 6), roundedCornerShape), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6), ColorResources_androidKt.colorResource(i19, composer4, 0), roundedCornerShape);
                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                    composer4.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor5);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.taxi_rating_tips_1, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composer4, 196614, 30), composer4, 0, 0, 65534);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 0, 3072, UnixStat.PERM_MASK);
                        composer3.startReplaceableGroup(-1266203891);
                        boolean zChanged7 = composer3.changed(function12);
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (zChanged7 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$2$3$1
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
                                    function12.invoke(100);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        composer3.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue8, ComposableLambdaKt.composableLambda(composer3, 465936814, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$2$4
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
                            public final void invoke(@Nullable Composer composer4, int i22) {
                                if ((i22 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(465936814, i22, -1, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaxiRatingMain.kt:212)");
                                    }
                                    Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer4, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._80wdp, composer4, 6)), ColorResources_androidKt.colorResource(R.color.darker_gray, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer4, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6), ColorResources_androidKt.colorResource(i20, composer4, 0), roundedCornerShape);
                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                    composer4.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor5);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.taxi_rating_tips_2, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composer4, 196614, 30), composer4, 0, 0, 65534);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 0, 3072, UnixStat.PERM_MASK);
                        composer3.startReplaceableGroup(-1266202411);
                        boolean zChanged8 = composer3.changed(function12);
                        Object objRememberedValue9 = composer3.rememberedValue();
                        if (zChanged8 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$2$5$1
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
                                    function12.invoke(1000);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue9);
                        }
                        composer3.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue9, ComposableLambdaKt.composableLambda(composer3, -444942929, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$2$6
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
                            public final void invoke(@Nullable Composer composer4, int i22) {
                                if ((i22 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-444942929, i22, -1, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingMain.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaxiRatingMain.kt:240)");
                                    }
                                    Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer4, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._80wdp, composer4, 6)), ColorResources_androidKt.colorResource(R.color.darker_gray, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer4, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6), ColorResources_androidKt.colorResource(i21, composer4, 0), roundedCornerShape);
                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                    composer4.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor5);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.taxi_rating_tips_3, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composer4, 196614, 30), composer4, 0, 0, 65534);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 0, 3072, UnixStat.PERM_MASK);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-1701436509);
                        boolean zChanged9 = composer3.changed(function0);
                        Object objRememberedValue10 = composer3.rememberedValue();
                        if (zChanged9 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$3$1
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
                                    function0.invoke();
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue10);
                        }
                        composer3.endReplaceableGroup();
                        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, z2, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue10, ComposableLambdaKt.composableLambda(composer3, 1559209500, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt$TaxiRatingMain$1$1$1$4
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
                            public final void invoke(@Nullable Composer composer4, int i22) {
                                if ((i22 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1559209500, i22, -1, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingMain.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaxiRatingMain.kt:270)");
                                    }
                                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer4, 6), 7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer4, 6)), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer4, 6)), 0.0f, 4, null);
                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                    composer4.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor5);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    String upperCase = StringResources_androidKt.stringResource(R.string.common_ok, composer4, 6).toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    TextKt.m10024Text4IGK_g(upperCase, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14873mullerBoldCustomSpbl3sdaw(R.dimen._15wsp, 0L, 0, 0L, 0.0f, composer4, 196614, 30), composer4, 0, 0, 65534);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 0, 3072, 4091);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 384, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt.TaxiRatingMain.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i13) {
                    TaxiRatingMainKt.TaxiRatingMain(z, i, i2, i3, i4, i5, i6, i7, i8, onRateStarClick, onTipsClick, onOkBtnClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), RecomposeScopeImplKt.updateChangedFlags(i10));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void TaxiRatingMainPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-422894685);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-422894685, i, -1, "com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainPreview (TaxiRatingMain.kt:297)");
            }
            TaxiRatingMain(false, R.color.orange, R.color.orange, R.color.orange, R.color.darker_gray, R.color.darker_gray, R.color.transparent, R.color.transparent, R.color.orange, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt.TaxiRatingMainPreview.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt.TaxiRatingMainPreview.2
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt.TaxiRatingMainPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350134, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.taxirating.TaxiRatingMainKt.TaxiRatingMainPreview.4
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
                    TaxiRatingMainKt.TaxiRatingMainPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

