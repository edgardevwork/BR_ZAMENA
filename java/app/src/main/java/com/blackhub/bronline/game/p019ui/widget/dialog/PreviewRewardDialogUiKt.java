package com.blackhub.bronline.game.p019ui.widget.dialog;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
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
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.utils.FallbackPainterResourceKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PreviewRewardDialogUi.kt */
@SourceDebugExtension({"SMAP\nPreviewRewardDialogUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewRewardDialogUi.kt\ncom/blackhub/bronline/game/ui/widget/dialog/PreviewRewardDialogUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n1116#2,6:224\n1116#2,6:230\n1116#2,6:236\n1116#2,6:242\n*S KotlinDebug\n*F\n+ 1 PreviewRewardDialogUi.kt\ncom/blackhub/bronline/game/ui/widget/dialog/PreviewRewardDialogUiKt\n*L\n59#1:224,6\n61#1:230,6\n72#1:236,6\n80#1:242,6\n*E\n"})
/* loaded from: classes3.dex */
public final class PreviewRewardDialogUiKt {

    /* compiled from: PreviewRewardDialogUi.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonRarityEnum.values().length];
            try {
                iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRarityEnum.EPIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRarityEnum.RARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRarityEnum.UNCOMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonRarityEnum.COMMON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PreviewRewardDialogUi(@NotNull final String rewardName, final int i, @NotNull final CommonRarityEnum rewardRarity, @Nullable final Bitmap bitmap, @ColorRes int i2, @NotNull final Function0<Unit> onClick, @Nullable Composer composer, final int i3, final int i4) {
        Pair pair;
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        Intrinsics.checkNotNullParameter(rewardRarity, "rewardRarity");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1257554425);
        int i5 = (i4 & 16) != 0 ? R.color.green : i2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1257554425, i3, -1, "com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUi (PreviewRewardDialogUi.kt:53)");
        }
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6);
        final String strCasesDialogPreviewBonusReward = StringResourceCompose.INSTANCE.casesDialogPreviewBonusReward(i, composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
        composerStartRestartGroup.startReplaceableGroup(27806617);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(27806680);
        boolean z = (((i3 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(rewardRarity)) || (i3 & 384) == 256;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue2 == companion.getEmpty()) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[rewardRarity.ordinal()];
            objRememberedValue2 = Integer.valueOf(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? R.color.black_30 : R.color.gray : R.color.dark_green : R.color.light_blue_80 : R.color.purple : R.color.yellow);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final int iIntValue = ((Number) objRememberedValue2).intValue();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(27807093);
        int i7 = (i3 & 112) ^ 48;
        boolean z2 = (i7 > 32 && composerStartRestartGroup.changed(i)) || (i3 & 48) == 32;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue3 == companion.getEmpty()) {
            if (i == 1) {
                pair = new Pair(Integer.valueOf(R.color.red), Integer.valueOf(R.color.red));
            } else if (i == 3) {
                pair = new Pair(Integer.valueOf(R.color.dark_medium_green), Integer.valueOf(R.color.dark_medium_green));
            } else {
                pair = new Pair(Integer.valueOf(R.color.yellow), Integer.valueOf(R.color.light_brown));
            }
            objRememberedValue3 = pair;
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        Pair pair2 = (Pair) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(27807405);
        boolean z3 = (i7 > 32 && composerStartRestartGroup.changed(i)) || (i3 & 48) == 32;
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = Integer.valueOf(i != 2 ? i != 3 ? R.string.cases_status_not_received : R.string.common_received : R.string.cases_status_available);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        final int iIntValue2 = ((Number) objRememberedValue4).intValue();
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) pair2.getFirst()).intValue(), composerStartRestartGroup, 0)), Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) pair2.getSecond()).intValue(), composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final int i8 = i5;
        FakeDialogKt.m15089FakeDialog3IgeMak(null, ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1443843451, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt.PreviewRewardDialogUi.1
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
            public final void invoke(@Nullable Composer composer2, int i9) {
                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1443843451, i9, -1, "com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUi.<anonymous> (PreviewRewardDialogUi.kt:94)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    composer2.startReplaceableGroup(-1474731748);
                    boolean zChanged = composer2.changed(onClick);
                    final Function0<Unit> function0 = onClick;
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt$PreviewRewardDialogUi$1$1$1
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
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(modifierFillMaxSize$default, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue5, 28, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment center = companion3.getCenter();
                    float f = fDimensionResource;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    final Function0<Unit> function02 = onClick;
                    Brush brush = brushM11297verticalGradient8A3gB4$default;
                    int i10 = iIntValue2;
                    String str = rewardName;
                    String str2 = strCasesDialogPreviewBonusReward;
                    int i11 = iIntValue;
                    final float f2 = fDimensionResource2;
                    Bitmap bitmap2 = bitmap;
                    int i12 = i;
                    final int i13 = i8;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Brush.Companion companion5 = Brush.INSTANCE;
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(BackgroundKt.background$default(companion2, Brush.Companion.m11297verticalGradient8A3gB4$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composer2, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._238wdp, composer2, 6));
                    composer2.startReplaceableGroup(-623703481);
                    boolean zChanged2 = composer2.changed(function02);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt$PreviewRewardDialogUi$1$2$1$1
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
                                function02.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierM7803clickableO2vRcR0$default2 = ClickableKt.m7803clickableO2vRcR0$default(modifierM8177width3ABfNKs, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue6, 28, null);
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default2);
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
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(BackgroundKt.background$default(companion2, brush, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12, null), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._49wdp, composer2, 6)), 0.0f, 1, null), null, false, 3, null);
                    String upperCase = StringResources_androidKt.stringResource(i10, composer2, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    TextKt.m10024Text4IGK_g(upperCase, modifierWrapContentHeight$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._21wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122), composer2, 0, 0, 65532);
                    TextKt.m10024Text4IGK_g(str, SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 1, null), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, 0, 0, 65532);
                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._137wdp, composer2, 6));
                    Alignment bottomEnd = companion3.getBottomEnd();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomEnd, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
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
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, SizeKt.fillMaxSize$default(BackgroundKt.background$default(companion2, Brush.Companion.m11297verticalGradient8A3gB4$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(i11, composer2, 0))}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2), 0.0f, 4, null), 0.0f, 1, null), null, null, 0.0f, null, 0, composer2, 8, 124);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(i12 == 1), ComposableSingletons$PreviewRewardDialogUiKt.INSTANCE.m15082getLambda1$app_siteRelease(), composer2, 48);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(i12 == 3), ComposableLambdaKt.composableLambda(composer2, -757933674, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt$PreviewRewardDialogUi$1$2$2$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-757933674, i14, -1, "com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PreviewRewardDialogUi.kt:181)");
                                }
                                IconKt.m9496Iconww6aTOc(FallbackPainterResourceKt.fallbackPainterResource(R.drawable.ic_check_correct, composer3, 6), (String) null, PaddingKt.m8123padding3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_70, composer3, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2)), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composer3, 6)), ColorResources_androidKt.colorResource(i13, composer3, 0), composer3, 56, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    TextKt.m10024Text4IGK_g(str2, SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 1, null), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, 6), companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 56), composer2, 0, 0, 65532);
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
        }), composerStartRestartGroup, 384, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i9 = i5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt.PreviewRewardDialogUi.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    PreviewRewardDialogUiKt.PreviewRewardDialogUi(rewardName, i, rewardRarity, bitmap, i9, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCasesGetRewardDialogUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1699493049);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1699493049, i, -1, "com.blackhub.bronline.game.ui.widget.dialog.PreviewCasesGetRewardDialogUi (PreviewRewardDialogUi.kt:214)");
            }
            PreviewRewardDialogUi("Дядя Степа", 2, CommonRarityEnum.COMMON, null, 0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt.PreviewCasesGetRewardDialogUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 200118, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.PreviewRewardDialogUiKt.PreviewCasesGetRewardDialogUi.2
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
                    PreviewRewardDialogUiKt.PreviewCasesGetRewardDialogUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

