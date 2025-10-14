package com.blackhub.bronline.game.p019ui.cases;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.DimenRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.cases.model.CaseReward;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseRewardCard.kt */
@SourceDebugExtension({"SMAP\nCaseRewardCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaseRewardCard.kt\ncom/blackhub/bronline/game/ui/cases/CaseRewardCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,435:1\n154#2:436\n1549#3:437\n1620#3,3:438\n74#4:441\n1116#5,6:442\n1116#5,6:448\n1116#5,6:454\n69#6,5:460\n74#6:493\n69#6,5:494\n74#6:527\n78#6:568\n78#6:613\n79#7,11:465\n79#7,11:499\n79#7,11:530\n92#7:562\n92#7:567\n79#7,11:575\n92#7:607\n92#7:612\n456#8,8:476\n464#8,3:490\n456#8,8:510\n464#8,3:524\n456#8,8:541\n464#8,3:555\n467#8,3:559\n467#8,3:564\n456#8,8:586\n464#8,3:600\n467#8,3:604\n467#8,3:609\n3737#9,6:484\n3737#9,6:518\n3737#9,6:549\n3737#9,6:594\n78#10,2:528\n80#10:558\n84#10:563\n74#10,6:569\n80#10:603\n84#10:608\n81#11:614\n107#11,2:615\n76#12:617\n109#12,2:618\n*S KotlinDebug\n*F\n+ 1 CaseRewardCard.kt\ncom/blackhub/bronline/game/ui/cases/CaseRewardCardKt\n*L\n90#1:436\n126#1:437\n126#1:438,3\n136#1:441\n137#1:442,6\n138#1:448,6\n187#1:454,6\n183#1:460,5\n183#1:493\n195#1:494,5\n195#1:527\n195#1:568\n183#1:613\n183#1:465,11\n195#1:499,11\n268#1:530,11\n268#1:562\n195#1:567\n298#1:575,11\n298#1:607\n183#1:612\n183#1:476,8\n183#1:490,3\n195#1:510,8\n195#1:524,3\n268#1:541,8\n268#1:555,3\n268#1:559,3\n195#1:564,3\n298#1:586,8\n298#1:600,3\n298#1:604,3\n183#1:609,3\n183#1:484,6\n195#1:518,6\n268#1:549,6\n298#1:594,6\n268#1:528,2\n268#1:558\n268#1:563\n298#1:569,6\n298#1:603\n298#1:608\n137#1:614\n137#1:615,2\n138#1:617\n138#1:618,2\n*E\n"})

public final class CaseRewardCardKt {
    public static final float SCALE_FOR_RENDER_IMAGES = 1.2f;

    /* compiled from: CaseRewardCard.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonRarityEnum.values().length];
            try {
                iArr[CommonRarityEnum.PRIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRarityEnum.EPIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRarityEnum.RARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonRarityEnum.SPRAYED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CaseRewardCard-r0mSVAk, reason: not valid java name */
    public static final void m14925CaseRewardCardr0mSVAk(@Nullable Modifier modifier, @NotNull final CaseReward reward, int i, int i2, @Nullable CommonRarityEnum commonRarityEnum, @Nullable String str, float f, float f2, float f3, @DimenRes int i3, @DimenRes int i4, @Nullable Brush brush, final boolean z, boolean z2, boolean z3, boolean z4, @DimenRes int i5, @DimenRes int i6, @Nullable Function2<? super CaseReward, ? super Integer, Unit> function2, @Nullable Composer composer, final int i7, final int i8, final int i9) {
        CommonRarityEnum rarity;
        int i10;
        String str2;
        final float fDimensionResource;
        final float fDimensionResource2;
        int shadowWeight;
        int i11;
        Brush brushM11289horizontalGradient8A3gB4$default;
        int i12;
        boolean sprayed;
        Intrinsics.checkNotNullParameter(reward, "reward");
        Composer composerStartRestartGroup = composer.startRestartGroup(1025861867);
        Modifier modifier2 = (i9 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i13 = (i9 & 4) != 0 ? 73 : i;
        final int i14 = (i9 & 8) != 0 ? -1 : i2;
        if ((i9 & 16) != 0) {
            rarity = reward.getRarity();
            i10 = i7 & (-57345);
        } else {
            rarity = commonRarityEnum;
            i10 = i7;
        }
        if ((i9 & 32) != 0) {
            str2 = (String) UtilsKt.buildTypeMerge(reward.getRewardName(), reward.getRewardNameStore());
            if (str2 == null) {
                str2 = "";
            }
            i10 &= -458753;
        } else {
            str2 = str;
        }
        if ((i9 & 64) != 0) {
            fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composerStartRestartGroup, 6);
            i10 &= -3670017;
        } else {
            fDimensionResource = f;
        }
        if ((i9 & 128) != 0) {
            fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._103wdp, composerStartRestartGroup, 6);
            i10 &= -29360129;
        } else {
            fDimensionResource2 = f2;
        }
        float fM13666constructorimpl = (i9 & 256) != 0 ? C2046Dp.m13666constructorimpl(0) : f3;
        if ((i9 & 512) != 0) {
            shadowWeight = reward.getShadowWeight();
            i10 &= -1879048193;
        } else {
            shadowWeight = i3;
        }
        final int i15 = (i9 & 1024) != 0 ? R.dimen._6wdp : i4;
        if ((i9 & 2048) != 0) {
            i11 = i13;
            brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
            i12 = i8 & (-113);
        } else {
            i11 = i13;
            brushM11289horizontalGradient8A3gB4$default = brush;
            i12 = i8;
        }
        final String str3 = str2;
        boolean z5 = (i9 & 8192) != 0 ? true : z2;
        boolean z6 = (i9 & 16384) != 0 ? false : z3;
        if ((32768 & i9) != 0) {
            i12 &= -458753;
            sprayed = reward.getSprayed();
        } else {
            sprayed = z4;
        }
        int i16 = (65536 & i9) != 0 ? R.dimen._30wdp : i5;
        int i17 = (131072 & i9) != 0 ? R.dimen._25wdp : i6;
        final Function2<? super CaseReward, ? super Integer, Unit> function22 = (262144 & i9) != 0 ? new Function2<CaseReward, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$1
            public final void invoke(@NotNull CaseReward caseReward, int i18) {
                Intrinsics.checkNotNullParameter(caseReward, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward, Integer num) {
                invoke(caseReward, num.intValue());
                return Unit.INSTANCE;
            }
        } : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1025861867, i10, i12, "com.blackhub.bronline.game.ui.cases.CaseRewardCard (CaseRewardCard.kt:105)");
        }
        boolean zIsSelected = reward.isSelected();
        int bgColorTop = reward.getBgColorTop();
        int shadowColor = reward.getShadowColor();
        List<Integer> brushColors = reward.getBrushColors();
        final int checkBgColor = reward.getCheckBgColor();
        final int checkBorderColor = reward.getCheckBorderColor();
        final float checkTransparency = reward.getCheckTransparency();
        final float f4 = fM13666constructorimpl;
        float cardTransparency = reward.getCardTransparency();
        final CommonRarityEnum commonRarityEnum2 = rarity;
        int bgColorBottom = reward.getBgColorBottom();
        Brush.Companion companion = Brush.INSTANCE;
        final int i18 = shadowWeight;
        composerStartRestartGroup.startReplaceableGroup(2094484048);
        List<Integer> list = brushColors;
        int i19 = i10;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            arrayList.add(Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) it.next()).intValue(), composerStartRestartGroup, 0)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, arrayList, 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(bgColorTop, composerStartRestartGroup, 0)), Color.m11330boximpl(ColorResources_androidKt.colorResource(bgColorBottom, composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composerStartRestartGroup.startReplaceableGroup(2094484319);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(2094484387);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.2f);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(reward, new CaseRewardCardKt$CaseRewardCard$2(reward, z6, context, mutableState, mutableFloatState, null), composerStartRestartGroup, 72);
        Modifier modifierAlpha = AlphaKt.alpha(modifier2, cardTransparency);
        composerStartRestartGroup.startReplaceableGroup(2094485979);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(modifierAlpha, (MutableInteractionSource) objRememberedValue3, null, sprayed, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$4
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
                function22.invoke(reward, Integer.valueOf(i14));
            }
        }, 24, null);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment center = companion3.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
        final Function2<? super CaseReward, ? super Integer, Unit> function23 = function22;
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
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion5 = Modifier.INSTANCE;
        int i20 = i12 & 14;
        Modifier modifierBackground$default = BackgroundKt.background$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(ComposeExtensionKt.m14410shadowo6VuwKU(BorderKt.m7784borderziNgDLE(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion5, fDimensionResource2), fDimensionResource), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), brushM11289horizontalGradient8A3gB4$default, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i15, composerStartRestartGroup, i20))), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(shadowColor, composerStartRestartGroup, 0), (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(i18, composerStartRestartGroup, (i19 >> 27) & 14), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i15, composerStartRestartGroup, i20))), ColorResources_androidKt.colorResource(bgColorBottom, composerStartRestartGroup, 0), null, 2, null), brushM11297verticalGradient8A3gB4$default2, null, 0.0f, 6, null);
        Alignment center2 = companion3.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        final Brush brush2 = brushM11289horizontalGradient8A3gB4$default;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
        final int i21 = i14;
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
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        int i22 = WhenMappings.$EnumSwitchMapping$0[commonRarityEnum2.ordinal()];
        if (i22 == 1) {
            composerStartRestartGroup.startReplaceableGroup(1472624992);
            int i23 = i19 >> 15;
            int i24 = ((i19 >> 21) & 14) | 384 | (i23 & 112) | (i23 & 7168);
            int i25 = i12 >> 6;
            CaseRewardTriangleDecorationKt.m14926CaseRewardTriangleDecorationEGPIBPM(fDimensionResource2, fDimensionResource, 3, f4, i16, i17, composerStartRestartGroup, i24 | (57344 & i25) | (i25 & 458752), 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.reward_card_item_legendary_pattern, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
        } else if (i22 == 2) {
            composerStartRestartGroup.startReplaceableGroup(1472625586);
            int i26 = i19 >> 15;
            int i27 = ((i19 >> 21) & 14) | 384 | (i26 & 112) | (i26 & 7168);
            int i28 = i12 >> 6;
            CaseRewardTriangleDecorationKt.m14926CaseRewardTriangleDecorationEGPIBPM(fDimensionResource2, fDimensionResource, 3, f4, i16, i17, composerStartRestartGroup, i27 | (57344 & i28) | (i28 & 458752), 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.reward_card_item_legendary_pattern, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 124);
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit2 = Unit.INSTANCE;
        } else if (i22 == 3) {
            composerStartRestartGroup.startReplaceableGroup(1472626211);
            int i29 = i19 >> 15;
            int i30 = ((i19 >> 21) & 14) | 384 | (i29 & 112) | (i29 & 7168);
            int i31 = i12 >> 6;
            CaseRewardTriangleDecorationKt.m14926CaseRewardTriangleDecorationEGPIBPM(fDimensionResource2, fDimensionResource, 2, f4, i16, i17, composerStartRestartGroup, i30 | (57344 & i31) | (i31 & 458752), 0);
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit3 = Unit.INSTANCE;
        } else if (i22 == 4) {
            composerStartRestartGroup.startReplaceableGroup(1472626551);
            int i32 = i19 >> 15;
            int i33 = ((i19 >> 21) & 14) | 384 | (i32 & 112) | (i32 & 7168);
            int i34 = i12 >> 6;
            CaseRewardTriangleDecorationKt.m14926CaseRewardTriangleDecorationEGPIBPM(fDimensionResource2, fDimensionResource, 1, f4, i16, i17, composerStartRestartGroup, i33 | (57344 & i34) | (i34 & 458752), 0);
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit4 = Unit.INSTANCE;
        } else if (i22 == 5) {
            composerStartRestartGroup.startReplaceableGroup(1472626857);
            Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion5, fDimensionResource), fDimensionResource2), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 1, null);
            Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center3, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_dust, composerStartRestartGroup, 6), (String) null, OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8158height3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composerStartRestartGroup, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 1, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            TextKt.m10024Text4IGK_g(reward.getDustSprayedText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582966, 120), composerStartRestartGroup, 0, 0, 65534);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit5 = Unit.INSTANCE;
        } else {
            composerStartRestartGroup.startReplaceableGroup(1472628146);
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit6 = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion5, fDimensionResource), fDimensionResource2);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        final float f5 = fDimensionResource;
        final int i35 = i15;
        int i36 = ((i12 >> 6) & 14) | 48;
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -768442689, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$5$2$1
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
            public final void invoke(@Nullable Composer composer2, int i37) {
                if ((i37 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-768442689, i37, -1, "com.blackhub.bronline.game.ui.cases.CaseRewardCard.<anonymous>.<anonymous>.<anonymous> (CaseRewardCard.kt:303)");
                    }
                    TextKt.m10024Text4IGK_g(str3, SizeKt.wrapContentHeight$default(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, f5), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6)), brushM11297verticalGradient8A3gB4$default, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(i35, composer2, 0), PrimitiveResources_androidKt.dimensionResource(i35, composer2, 0), 0.0f, 0.0f, 12, null), 0.0f, 4, null), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(reward.getTitleTextSize(), Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582960, 120), composer2, 0, 0, 65532);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, i36);
        composerStartRestartGroup.startReplaceableGroup(-1327395410);
        if (z5 && !reward.isSprayedReward()) {
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(CaseRewardCard_r0mSVAk$lambda$2(mutableState), GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(companion5, fDimensionResource), 0.0f, 1, null), mutableFloatState.getFloatValue(), mutableFloatState.getFloatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null), null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, composerStartRestartGroup, 3080, 116);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ComposeExtensionKt.IfTrue(Boolean.valueOf(zIsSelected), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1013203127, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$5$3
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
            public final void invoke(@Nullable Composer composer2, int i37) {
                if ((i37 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1013203127, i37, -1, "com.blackhub.bronline.game.ui.cases.CaseRewardCard.<anonymous>.<anonymous> (CaseRewardCard.kt:340)");
                    }
                    BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, fDimensionResource), fDimensionResource2), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i15, composer2, 0))), ColorResources_androidKt.colorResource(R.color.total_black_70, composer2, 6), null, 2, null), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 48);
        Boolean boolValueOf = Boolean.valueOf(z);
        final int i37 = R.drawable.ic_check_main;
        final float f6 = fDimensionResource;
        final float f7 = fDimensionResource2;
        final int i38 = i15;
        final int i39 = R.drawable.ic_dust;
        ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 860931840, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$5$4
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
            public final void invoke(@Nullable Composer composer2, int i40) {
                if ((i40 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(860931840, i40, -1, "com.blackhub.bronline.game.ui.cases.CaseRewardCard.<anonymous>.<anonymous> (CaseRewardCard.kt:350)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierAlpha2 = AlphaKt.alpha(OffsetKt.m8084offsetVpY3zN4$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion6, f6), f7), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i38, composer2, 0))), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 1, null), checkTransparency);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion7.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical center4 = arrangement.getCenter();
                    CaseReward caseReward = reward;
                    int i41 = i39;
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center4, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierAlpha2);
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
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion8.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m10024Text4IGK_g(caseReward.getDustCountText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, Color.INSTANCE.m11377getWhite0d7_KjU(), TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582966, 120), composer2, 0, 0, 65534);
                    ImageKt.Image(PainterResources_androidKt.painterResource(i41, composer2, 6), (String) null, SizeKt.m8158height3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion6, f6), f7);
                    Arrangement.Vertical bottom = arrangement.getBottom();
                    Alignment.Horizontal end = companion7.getEnd();
                    int i42 = checkBgColor;
                    int i43 = checkBorderColor;
                    int i44 = i37;
                    float f8 = checkTransparency;
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(bottom, end, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy3, companion8.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion8.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6)), ColorResources_androidKt.colorResource(i42, composer2, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer2, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), ColorResources_androidKt.colorResource(i43, composer2, 0), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composer2, 6)));
                    Alignment center5 = companion7.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center5, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy3, companion8.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion8.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i44, composer2, 6), (String) null, AlphaKt.alpha(companion6, f8), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
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
        }), composerStartRestartGroup, i36);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i40 = i15;
            final Modifier modifier3 = modifier2;
            final int i41 = i11;
            final float f8 = fDimensionResource;
            final float f9 = fDimensionResource2;
            final boolean z7 = z5;
            final boolean z8 = z6;
            final boolean z9 = sprayed;
            final int i42 = i16;
            final int i43 = i17;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt$CaseRewardCard$6
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

                public final void invoke(@Nullable Composer composer2, int i44) {
                    CaseRewardCardKt.m14925CaseRewardCardr0mSVAk(modifier3, reward, i41, i21, commonRarityEnum2, str3, f8, f9, f4, i18, i40, brush2, z, z7, z8, z9, i42, i43, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), RecomposeScopeImplKt.updateChangedFlags(i8), i9);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CasesRewardCardPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694768616);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1694768616, i, -1, "com.blackhub.bronline.game.ui.cases.CasesRewardCardPreview (CaseRewardCard.kt:415)");
            }
            composer2 = composerStartRestartGroup;
            m14925CaseRewardCardr0mSVAk(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._123wdp, composerStartRestartGroup, 6)), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6))), new CaseReward(0, 0, "ТРАНСПОРТ FLANKER", null, "+100", "100", 0, null, CommonRarityEnum.RARE, true, false, false, 0, false, null, null, 0, 127179, null), 0, -1, null, null, 0.0f, 0.0f, 0.0f, 0, 0, null, false, false, false, false, 0, 0, new Function2<CaseReward, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt.CasesRewardCardPreview.1
                public final void invoke(@NotNull CaseReward caseReward, int i2) {
                    Intrinsics.checkNotNullParameter(caseReward, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CaseReward caseReward, Integer num) {
                    invoke(caseReward, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer2, 3136, 100663680, 258036);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.cases.CaseRewardCardKt.CasesRewardCardPreview.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    CaseRewardCardKt.CasesRewardCardPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap CaseRewardCard_r0mSVAk$lambda$2(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }
}

