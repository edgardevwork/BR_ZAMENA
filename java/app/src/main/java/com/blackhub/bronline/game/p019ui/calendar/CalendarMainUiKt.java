package com.blackhub.bronline.game.p019ui.calendar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.p019ui.widget.block.item.CommonRewardItemKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.ColorKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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

/* compiled from: CalendarMainUi.kt */
@SourceDebugExtension({"SMAP\nCalendarMainUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarMainUi.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarMainUiKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,1406:1\n64#2:1407\n64#2:1408\n64#2:1409\n1116#3,6:1410\n1116#3,6:1416\n1116#3,6:1422\n1116#3,6:1428\n1116#3,6:1435\n1116#3,6:1441\n1116#3,6:1447\n1116#3,6:1453\n1116#3,6:1459\n74#4:1434\n81#5:1465\n107#5,2:1466\n81#5:1474\n81#5:1475\n107#5,2:1476\n81#5:1478\n107#5,2:1479\n81#5:1481\n107#5,2:1482\n81#5:1484\n107#5,2:1485\n81#5:1487\n75#6:1468\n108#6,2:1469\n75#6:1471\n108#6,2:1472\n*S KotlinDebug\n*F\n+ 1 CalendarMainUi.kt\ncom/blackhub/bronline/game/ui/calendar/CalendarMainUiKt\n*L\n206#1:1407\n207#1:1408\n208#1:1409\n216#1:1410,6\n217#1:1416,6\n218#1:1422,6\n220#1:1428,6\n229#1:1435,6\n230#1:1441,6\n232#1:1447,6\n233#1:1453,6\n235#1:1459,6\n226#1:1434\n216#1:1465\n216#1:1466,2\n220#1:1474\n229#1:1475\n229#1:1476,2\n230#1:1478\n230#1:1479,2\n232#1:1481\n232#1:1482,2\n233#1:1484\n233#1:1485,2\n235#1:1487\n217#1:1468\n217#1:1469,2\n218#1:1471\n218#1:1472,2\n*E\n"})
/* loaded from: classes2.dex */
public final class CalendarMainUiKt {
    public static final float ALPHA_BONUS_ITEMS_IS_MAIN_HINT = 0.1f;
    public static final float END_ARROW = 0.2f;
    public static final int MIN_DAYS_FOR_CHANGE_COLOR = 7;
    public static final float SCALE_X = 2.0f;
    public static final float SHADOW_ALFA = 0.5f;
    public static final float START_ARROW = 0.05f;

    public static final /* synthetic */ void access$BlockRewardList(Modifier modifier, String str, List list, boolean z, LazyListState lazyListState, LazyListState lazyListState2, Function3 function3, Composer composer, int i) {
        BlockRewardList(modifier, str, list, z, lazyListState, lazyListState2, function3, composer, i);
    }

    public static final /* synthetic */ String access$CalendarMainUi_DgHyVOg$lambda$10(State state) {
        return CalendarMainUi_DgHyVOg$lambda$10(state);
    }

    public static final /* synthetic */ Bitmap access$CalendarMainUi_DgHyVOg$lambda$12(MutableState mutableState) {
        return CalendarMainUi_DgHyVOg$lambda$12(mutableState);
    }

    public static final /* synthetic */ Bitmap access$CalendarMainUi_DgHyVOg$lambda$15(MutableState mutableState) {
        return CalendarMainUi_DgHyVOg$lambda$15(mutableState);
    }

    public static final /* synthetic */ Bitmap access$CalendarMainUi_DgHyVOg$lambda$18(MutableState mutableState) {
        return CalendarMainUi_DgHyVOg$lambda$18(mutableState);
    }

    public static final /* synthetic */ Bitmap access$CalendarMainUi_DgHyVOg$lambda$21(MutableState mutableState) {
        return CalendarMainUi_DgHyVOg$lambda$21(mutableState);
    }

    public static final /* synthetic */ String access$CalendarMainUi_DgHyVOg$lambda$24(State state) {
        return CalendarMainUi_DgHyVOg$lambda$24(state);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CalendarMainUi-DgHyVOg, reason: not valid java name */
    public static final void m14915CalendarMainUiDgHyVOg(@Nullable Modifier modifier, @NotNull final String titleSeason, final long j, final long j2, final long j3, @NotNull final String bgSeasonCalendarBitmapName, @NotNull final String icSeasonCalendarBitmapName, @NotNull final String bgComeBackSeasonCalendarBitmapName, @NotNull final String icComeBackSeasonCalendarBitmapName, @NotNull final String comeBackSubtitle, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, @DrawableRes final int i8, final boolean z, @NotNull final List<CommonRewardModel> standardRewards, @NotNull final List<CommonRewardModel> bonusRewards, @NotNull final CommonRewardModel lastReward, final boolean z2, final boolean z3, float f, final boolean z4, final int i9, final int i10, @NotNull final CalendarScreenType selectedPage, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, @NotNull final Function1<? super CalendarScreenType, Unit> onTopSwitchButtonsClick, @NotNull final Function1<? super String, Unit> onRewardSecondsChange, @NotNull final Function0<Unit> onCloseInterfaceClick, @NotNull final Function0<Unit> onBlackPassCLick, @NotNull final Function0<Unit> onInfoMainListClick, @NotNull final Function0<Unit> onAllRewardsClick, @NotNull final Function0<Unit> onInfoBonusListClick, @NotNull final Function3<? super Integer, ? super Boolean, ? super Bitmap, Unit> onItemClick, @NotNull final Function0<Unit> onCloseHintClick, @Nullable Composer composer, final int i11, final int i12, final int i13, final int i14, final int i15, final int i16, final int i17) {
        float f2;
        float f3;
        int i18;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objMutableStateOf$default;
        Object objDerivedStateOf;
        Intrinsics.checkNotNullParameter(titleSeason, "titleSeason");
        Intrinsics.checkNotNullParameter(bgSeasonCalendarBitmapName, "bgSeasonCalendarBitmapName");
        Intrinsics.checkNotNullParameter(icSeasonCalendarBitmapName, "icSeasonCalendarBitmapName");
        Intrinsics.checkNotNullParameter(bgComeBackSeasonCalendarBitmapName, "bgComeBackSeasonCalendarBitmapName");
        Intrinsics.checkNotNullParameter(icComeBackSeasonCalendarBitmapName, "icComeBackSeasonCalendarBitmapName");
        Intrinsics.checkNotNullParameter(comeBackSubtitle, "comeBackSubtitle");
        Intrinsics.checkNotNullParameter(standardRewards, "standardRewards");
        Intrinsics.checkNotNullParameter(bonusRewards, "bonusRewards");
        Intrinsics.checkNotNullParameter(lastReward, "lastReward");
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        Intrinsics.checkNotNullParameter(onTopSwitchButtonsClick, "onTopSwitchButtonsClick");
        Intrinsics.checkNotNullParameter(onRewardSecondsChange, "onRewardSecondsChange");
        Intrinsics.checkNotNullParameter(onCloseInterfaceClick, "onCloseInterfaceClick");
        Intrinsics.checkNotNullParameter(onBlackPassCLick, "onBlackPassCLick");
        Intrinsics.checkNotNullParameter(onInfoMainListClick, "onInfoMainListClick");
        Intrinsics.checkNotNullParameter(onAllRewardsClick, "onAllRewardsClick");
        Intrinsics.checkNotNullParameter(onInfoBonusListClick, "onInfoBonusListClick");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onCloseHintClick, "onCloseHintClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-732918016);
        Modifier modifier2 = (i16 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i16 & 16777216) != 0) {
            f2 = z2 ? 0.1f : 1.0f;
        } else {
            f2 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-732918016, i11, i12, "com.blackhub.bronline.game.ui.calendar.CalendarMainUi (CalendarMainUi.kt:157)");
        }
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        final TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, j2, 0, 0L, 0.0f, null, null, composerStartRestartGroup, ((i11 >> 6) & 112) | 12582918, 124);
        TextAlign.Companion companion = TextAlign.INSTANCE;
        final TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, companion.m13558getCentere0LSkKk(), 0L, 0.0f, null, composerStartRestartGroup, 1572870, 58);
        final TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg2 = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wsp, 0L, companion.m13558getCentere0LSkKk(), 0L, 0.0f, null, composerStartRestartGroup, 1572870, 58);
        final TextStyle textStyleM14823montserratExtraBoldCustomSp5OKGny8 = typographyStyle.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._13wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62);
        final TextStyle textStyleM14823montserratExtraBoldCustomSp5OKGny82 = typographyStyle.m14823montserratExtraBoldCustomSp5OKGny8(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62);
        final long defaultColor = ColorKt.getDefaultColor();
        final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._310wdp, composerStartRestartGroup, 6);
        final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._748wdp, composerStartRestartGroup, 6);
        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._184wdp, composerStartRestartGroup, 6);
        final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._96wdp, composerStartRestartGroup, 6);
        final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6);
        final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6);
        final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6);
        final float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6);
        final float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fDimensionResource11 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fDimensionResource12 = PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6);
        final float fDimensionResource13 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6);
        final float fDimensionResource14 = PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6);
        final float fDimensionResource15 = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6);
        final float fDimensionResource16 = PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composerStartRestartGroup, 6);
        final float fDimensionResource17 = PrimitiveResources_androidKt.dimensionResource(R.dimen._40wdp, composerStartRestartGroup, 6);
        final float fDimensionResource18 = PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composerStartRestartGroup, 6);
        final float fDimensionResource19 = PrimitiveResources_androidKt.dimensionResource(R.dimen._54wdp, composerStartRestartGroup, 6);
        final float fDimensionResource20 = PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composerStartRestartGroup, 6);
        final float fDimensionResource21 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6);
        final float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6);
        final float fDimensionResource23 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6);
        final float fDimensionResource24 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6);
        final float fM13666constructorimpl = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6));
        final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6));
        final float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6));
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6));
        final RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        composerStartRestartGroup.startReplaceableGroup(818852629);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(818852688);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(i3);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(818852762);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(i4);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        int intValue = mutableIntState.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(818852841);
        boolean zChanged = composerStartRestartGroup.changed(intValue);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<String>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$secondsNewDayText$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return IntExtensionKt.parseTimeToStringHMS(mutableIntState.getIntValue());
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        final State state = (State) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final Resources resources = context.getResources();
        composerStartRestartGroup.startReplaceableGroup(818853063);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion2.getEmpty()) {
            f3 = fDimensionResource3;
            i18 = 2;
            snapshotMutationPolicy = null;
            objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
        } else {
            f3 = fDimensionResource3;
            i18 = 2;
            snapshotMutationPolicy = null;
            objMutableStateOf$default = objRememberedValue5;
        }
        final MutableState mutableState2 = (MutableState) objMutableStateOf$default;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(818853140);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i18, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(818853217);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i18, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        final MutableState mutableState4 = (MutableState) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(818853302);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i18, snapshotMutationPolicy);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        final MutableState mutableState5 = (MutableState) objRememberedValue8;
        composerStartRestartGroup.endReplaceableGroup();
        int intValue2 = mutableIntState2.getIntValue();
        composerStartRestartGroup.startReplaceableGroup(818853375);
        boolean zChanged2 = composerStartRestartGroup.changed(intValue2);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue9 == companion2.getEmpty()) {
            objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0<String>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$secondsRewardText$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    if (z5) {
                        return resources.getString(R.string.calendar_reward_finished_season);
                    }
                    if (z6) {
                        return resources.getString(R.string.calendar_reward_all_received);
                    }
                    if (IntExtensionKt.isZero(Integer.valueOf(mutableIntState2.getIntValue()))) {
                        return resources.getString(R.string.calendar_reward_received);
                    }
                    return IntExtensionKt.parseTimeToStringWithFormat(mutableIntState2.getIntValue());
                }
            });
            composerStartRestartGroup.updateRememberedValue(objDerivedStateOf);
        } else {
            objDerivedStateOf = objRememberedValue9;
        }
        final State state2 = (State) objDerivedStateOf;
        composerStartRestartGroup.endReplaceableGroup();
        String strCalendarMainUi_DgHyVOg$lambda$24 = CalendarMainUi_DgHyVOg$lambda$24(state2);
        Intrinsics.checkNotNullExpressionValue(strCalendarMainUi_DgHyVOg$lambda$24, "CalendarMainUi_DgHyVOg$lambda$24(...)");
        onRewardSecondsChange.invoke(strCalendarMainUi_DgHyVOg$lambda$24);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new CalendarMainUiKt$CalendarMainUi$1(z7, lazyListStateRememberLazyListState, i9, lazyListStateRememberLazyListState2, i10, mutableState, mutableIntState, mutableIntState2, context, bgSeasonCalendarBitmapName, mutableState2, icSeasonCalendarBitmapName, mutableState3, bgComeBackSeasonCalendarBitmapName, mutableState4, icComeBackSeasonCalendarBitmapName, mutableState5, null), composerStartRestartGroup, 70);
        final Modifier modifier3 = modifier2;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
        long jColorResource = ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6);
        final int i19 = R.dimen._9wsp;
        final float f4 = f3;
        final float f5 = f2;
        FakeDialogKt.m15089FakeDialog3IgeMak(modifierFillMaxSize$default, jColorResource, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -98369652, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$2
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
            public final void invoke(@Nullable Composer composer2, int i20) {
                if ((i20 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-98369652, i20, -1, "com.blackhub.bronline.game.ui.calendar.CalendarMainUi.<anonymous> (CalendarMainUi.kt:313)");
                    }
                    final boolean z10 = z7;
                    final float f6 = fDimensionResource2;
                    final float f7 = fDimensionResource;
                    final RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    final CalendarScreenType calendarScreenType = selectedPage;
                    final RoundedCornerShape roundedCornerShape2 = roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default;
                    final Function0<Unit> function0 = onCloseInterfaceClick;
                    final float f8 = fM13666constructorimpl;
                    final float f9 = fM13666constructorimpl2;
                    final float f10 = fDimensionResource21;
                    final float f11 = fDimensionResource8;
                    final float f12 = fDimensionResource7;
                    final float f13 = f4;
                    final CommonRewardModel commonRewardModel = lastReward;
                    final String str = comeBackSubtitle;
                    final TextStyle textStyle = textStyleM14862montserratSemiBoldCustomSpcv9FZhg2;
                    final TextStyle textStyle2 = textStyleM14862montserratSemiBoldCustomSpcv9FZhg;
                    final float f14 = fDimensionResource6;
                    final float f15 = fM13666constructorimpl3;
                    final float f16 = fDimensionResource23;
                    final float f17 = fDimensionResource24;
                    final float f18 = fDimensionResource9;
                    final float f19 = fDimensionResource4;
                    final List<CommonRewardModel> list = standardRewards;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final LazyListState lazyListState2 = lazyListStateRememberLazyListState2;
                    final Function3<Integer, Boolean, Bitmap, Unit> function3 = onItemClick;
                    final float f20 = fDimensionResource18;
                    final List<CommonRewardModel> list2 = bonusRewards;
                    final boolean z11 = z4;
                    final boolean z12 = z2;
                    final float f21 = fDimensionResource11;
                    final long j4 = defaultColor;
                    final float f22 = fDimensionResource5;
                    final int i21 = i;
                    final int i22 = i2;
                    final long j5 = j3;
                    final TextStyle textStyle3 = textStyleM14811montserratBoldCustomSpIzzofJo;
                    final float f23 = fDimensionResource14;
                    final float f24 = fDimensionResource19;
                    final int i23 = i5;
                    final float f25 = fDimensionResource20;
                    final boolean z13 = z3;
                    final float f26 = f5;
                    final int i24 = i6;
                    final int i25 = i7;
                    final int i26 = i8;
                    final boolean z14 = z8;
                    final boolean z15 = z9;
                    final Function1<CalendarScreenType, Unit> function1 = onTopSwitchButtonsClick;
                    final MutableState<Bitmap> mutableState6 = mutableState2;
                    final MutableState<Bitmap> mutableState7 = mutableState4;
                    final float f27 = fDimensionResource16;
                    final float f28 = fDimensionResource15;
                    final float f29 = fDimensionResource13;
                    final long j6 = j;
                    final String str2 = titleSeason;
                    final TextStyle textStyle4 = textStyleM14823montserratExtraBoldCustomSp5OKGny82;
                    final float f30 = fDimensionResource10;
                    final MutableState<Bitmap> mutableState8 = mutableState3;
                    final MutableState<Bitmap> mutableState9 = mutableState5;
                    final float f31 = fDimensionResource12;
                    final Function0<Unit> function02 = onInfoMainListClick;
                    final Function0<Unit> function03 = onAllRewardsClick;
                    final State<String> state3 = state2;
                    final Function0<Unit> function04 = onInfoBonusListClick;
                    final boolean z16 = z;
                    final float f32 = fDimensionResource17;
                    final TextStyle textStyle5 = textStyleM14823montserratExtraBoldCustomSp5OKGny8;
                    final Function0<Unit> function05 = onBlackPassCLick;
                    final State<String> state4 = state;
                    final int i27 = i19;
                    final float f33 = fDimensionResource22;
                    final Function0<Unit> function06 = onCloseHintClick;
                    composer2.startReplaceableGroup(-270267587);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue10 == companion4.getEmpty()) {
                        objRememberedValue10 = new Measurer();
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceableGroup();
                    final Measurer measurer = (Measurer) objRememberedValue10;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (objRememberedValue11 == companion4.getEmpty()) {
                        objRememberedValue11 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue11;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (objRememberedValue12 == companion4.getEmpty()) {
                        objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceableGroup();
                    Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue12, measurer, composer2, 4544);
                    MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                    final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                    final int i28 = 0;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$2$invoke$$inlined$ConstraintLayout$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                        }
                    }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$2$invoke$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v121 ??, still in use, count: 1, list:
                              (r1v121 ?? I:java.lang.Object) from 0x0adb: INVOKE (r121v0 ?? I:androidx.compose.runtime.Composer), (r1v121 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1939)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                            */
                        @androidx.compose.runtime.Composable
                        public final void invoke(
                        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v121 ??, still in use, count: 1, list:
                              (r1v121 ?? I:java.lang.Object) from 0x0adb: INVOKE (r121v0 ?? I:androidx.compose.runtime.Composer), (r1v121 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1939)
                            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                            */
                        /*  JADX ERROR: Method generation error
                            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r121v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:309)
                            */
                    }), measurePolicyComponent1, composer2, 48, 0);
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f6 = f2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$CalendarMainUi$3
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

                public final void invoke(@Nullable Composer composer2, int i20) {
                    CalendarMainUiKt.m14915CalendarMainUiDgHyVOg(modifier3, titleSeason, j, j2, j3, bgSeasonCalendarBitmapName, icSeasonCalendarBitmapName, bgComeBackSeasonCalendarBitmapName, icComeBackSeasonCalendarBitmapName, comeBackSubtitle, i, i2, i3, i4, i5, i6, i7, i8, z, standardRewards, bonusRewards, lastReward, z2, z3, f6, z4, i9, i10, selectedPage, z5, z6, z7, z8, z9, onTopSwitchButtonsClick, onRewardSecondsChange, onCloseInterfaceClick, onBlackPassCLick, onInfoMainListClick, onAllRewardsClick, onInfoBonusListClick, onItemClick, onCloseHintClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12), RecomposeScopeImplKt.updateChangedFlags(i13), RecomposeScopeImplKt.updateChangedFlags(i14), RecomposeScopeImplKt.updateChangedFlags(i15), i16, i17);
                }
            });
        }
    }

    public static final void CalendarMainUi_DgHyVOg$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlockRewardList(final Modifier modifier, final String str, final List<CommonRewardModel> list, final boolean z, final LazyListState lazyListState, final LazyListState lazyListState2, final Function3<? super Integer, ? super Boolean, ? super Bitmap, Unit> function3, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(182111578);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182111578, i, -1, "com.blackhub.bronline.game.ui.calendar.BlockRewardList (CalendarMainUi.kt:1183)");
        }
        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6);
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource);
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        final TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126);
        final TextStyle textStyleM14811montserratBoldCustomSpIzzofJo2 = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126);
        LazyDslKt.LazyRow(PaddingKt.m8125paddingVpY3zN4$default(BackgroundKt.background$default(BorderKt.m7782borderxT4_qwU(PaddingKt.m8127paddingqDBjuR0$default(modifier, fDimensionResource, 0.0f, fDimensionResource, 0.0f, 10, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.darker_gray_blue, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4), brushM11297verticalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6), 0.0f, 2, null), z ? lazyListState : lazyListState2, null, false, null, Alignment.INSTANCE.getCenterVertically(), null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.BlockRewardList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                final List<CommonRewardModel> list2 = list;
                final String str2 = str;
                final TextStyle textStyle = textStyleM14811montserratBoldCustomSpIzzofJo;
                final TextStyle textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo2;
                final Function3<Integer, Boolean, Bitmap, Unit> function32 = function3;
                final boolean z2 = z;
                LazyRow.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$BlockRewardList$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    @Nullable
                    public final Object invoke(int i2) {
                        list2.get(i2);
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$BlockRewardList$1$invoke$$inlined$itemsIndexed$default$3
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
                    public final void invoke(@NotNull LazyItemScope lazyItemScope, final int i2, @Nullable Composer composer2, int i3) {
                        int i4;
                        float fDimensionResource2;
                        float fDimensionResource3;
                        float fDimensionResource4;
                        float fDimensionResource5;
                        float fDimensionResource6;
                        if ((i3 & 14) == 0) {
                            i4 = i3 | (composer2.changed(lazyItemScope) ? 4 : 2);
                        } else {
                            i4 = i3;
                        }
                        if ((i3 & 112) == 0) {
                            i4 |= composer2.changed(i2) ? 32 : 16;
                        }
                        if ((i4 & 731) == 146 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        CommonRewardModel commonRewardModel = (CommonRewardModel) list2.get(i2);
                        if (commonRewardModel.isSuperReward()) {
                            composer2.startReplaceableGroup(1792967094);
                            fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._90wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1792967154);
                            fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._72wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        if (commonRewardModel.isSuperReward()) {
                            composer2.startReplaceableGroup(1792967271);
                            fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1792967331);
                            fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        float f = fDimensionResource3;
                        if (commonRewardModel.isSuperReward()) {
                            composer2.startReplaceableGroup(1792967451);
                            fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1792967511);
                            fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        float f2 = fDimensionResource4;
                        if (commonRewardModel.isSuperReward()) {
                            composer2.startReplaceableGroup(1792967624);
                            fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._86wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1792967684);
                            fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._69wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        if (commonRewardModel.isSuperReward()) {
                            composer2.startReplaceableGroup(1792967802);
                            fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._80wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(1792967862);
                            fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._63wdp, composer2, 6);
                            composer2.endReplaceableGroup();
                        }
                        float f3 = fDimensionResource6;
                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, fDimensionResource5), fDimensionResource2);
                        String strEmpty = commonRewardModel.isTimer() ? str2 : AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                        TextStyle textStyle3 = textStyle;
                        TextStyle textStyle4 = textStyle2;
                        composer2.startReplaceableGroup(1792968518);
                        boolean zChanged = ((((i4 & 112) ^ 48) > 32 && composer2.changed(i2)) || (i4 & 48) == 32) | composer2.changed(function32) | composer2.changed(z2);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function3 function33 = function32;
                            final boolean z3 = z2;
                            objRememberedValue = new Function1<Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt$BlockRewardList$1$1$1$1
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
                                    function33.invoke(Integer.valueOf(i2), Boolean.valueOf(z3), bitmap);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CommonRewardItemKt.m15055CommonPrizeItemBFw8Yg(modifierM8158height3ABfNKs, f3, commonRewardModel, f, f2, false, 0.0f, strEmpty, null, null, 0.0f, textStyle3, null, textStyle4, null, null, false, 0L, (Function1) objRememberedValue, composer2, 197120, 0, 251712);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f342xf2722a21, 220);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.BlockRewardList.2
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
                    CalendarMainUiKt.BlockRewardList(modifier, str, list, z, lazyListState, lazyListState2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCalendarMainUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(83473224);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(83473224, i, -1, "com.blackhub.bronline.game.ui.calendar.PreviewCalendarMainUi (CalendarMainUi.kt:1253)");
            }
            Color.Companion companion = Color.INSTANCE;
            long jM11374getRed0d7_KjU = companion.m11374getRed0d7_KjU();
            long jM11377getWhite0d7_KjU = companion.m11377getWhite0d7_KjU();
            long jM11374getRed0d7_KjU2 = companion.m11374getRed0d7_KjU();
            CommonRewardModel commonRewardModel = new CommonRewardModel(0, null, "ПРАВА В + 100 000Р + СТАНДАРТНЫЙ КЕЙС + ЧЕБУРЕК", null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262139, null);
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.COMMON;
            CommonRewardModel commonRewardModel2 = new CommonRewardModel(0, "ноч. жизньes", null, "получено", null, 0, 0, null, false, false, 0, CommonRewardState.NORM_NOT_RECEIVED, null, false, false, commonRarityEnum, 0, null, 227061, null);
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.UNCOMMON;
            CommonRewardModel commonRewardModel3 = new CommonRewardModel(0, "ноч. жизнь", null, "14:59", null, 0, 0, null, true, true, 4, CommonRewardState.NORM_TIMER, null, false, false, commonRarityEnum2, 0, null, 225525, null);
            CommonRarityEnum commonRarityEnum3 = CommonRarityEnum.RARE;
            CommonRewardModel commonRewardModel4 = new CommonRewardModel(0, "10.000 Р", null, "день 3", null, 0, 0, null, false, false, 0, CommonRewardState.NORM_AVAILABLE, null, false, false, commonRarityEnum3, 0, null, 227061, null);
            CommonRarityEnum commonRarityEnum4 = CommonRarityEnum.EPIC;
            CommonRewardModel commonRewardModel5 = new CommonRewardModel(0, "скин бабуси", null, "день 4", null, 0, 0, null, false, false, 0, CommonRewardState.NORM_RECEIVED, null, false, false, commonRarityEnum4, 0, null, 227061, null);
            CommonRarityEnum commonRarityEnum5 = CommonRarityEnum.LEGENDARY;
            CommonRewardModel commonRewardModel6 = new CommonRewardModel(0, "аксессуар", null, "день 5", null, 0, 0, null, false, false, 0, CommonRewardState.EPIC_NOT_RECEIVED_LOW_LEVEL, null, false, false, commonRarityEnum5, 0, null, 227061, null);
            CommonRewardState commonRewardState = CommonRewardState.EPIC_NOT_RECEIVED_NORW_LEVEL;
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonRewardModel[]{commonRewardModel2, commonRewardModel3, commonRewardModel4, commonRewardModel5, commonRewardModel6, new CommonRewardModel(0, "бронзовый", null, "день 6", null, 0, 0, null, false, false, 0, commonRewardState, null, false, false, commonRarityEnum, 0, null, 227061, null), new CommonRewardModel(0, "бронзовый", null, "день 7", null, 0, 0, null, false, false, 0, commonRewardState, null, false, false, commonRarityEnum2, 0, null, 227061, null), new CommonRewardModel(0, "бронзовый", null, "день 8", null, 0, 0, null, false, false, 0, commonRewardState, null, false, false, commonRarityEnum3, 0, null, 227061, null), new CommonRewardModel(0, "бронзовый", null, "день 9", null, 0, 0, null, false, false, 0, commonRewardState, null, false, false, commonRarityEnum4, 0, null, 227061, null), new CommonRewardModel(5, "бронзовый", null, "день 10", null, 0, 0, null, false, false, 0, commonRewardState, null, false, false, commonRarityEnum5, 0, null, 227060, null)});
            CommonRewardModel commonRewardModel7 = new CommonRewardModel(0, "10 BC", null, "получено", null, 0, 0, null, false, false, 0, null, CalendarBonusRewardState.AVAILABLE_LOW_LEVEL, false, false, null, 0, null, 257781, null);
            CalendarBonusRewardState calendarBonusRewardState = CalendarBonusRewardState.NOT_RECEIVED;
            m14915CalendarMainUiDgHyVOg(null, "bla bla bla 2024", jM11374getRed0d7_KjU, jM11377getWhite0d7_KjU, jM11374getRed0d7_KjU2, "nameOfImage.PNG", "nameOfImage.PNG", "nameOfImage.PNG", "nameOfImage.PNG", "ПРАВА В + 100 000Р + СТАНДАРТНЫЙ КЕЙС + ЧЕБУРЕК", 10, 60, 20, 100, 100, 2, 101, R.drawable.ic_check_correct, true, listListOf, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonRewardModel[]{commonRewardModel7, new CommonRewardModel(0, "СЕРЕБРЯНЫЙ", null, "5 подряд", null, 0, 0, null, false, true, 4, null, calendarBonusRewardState, false, false, null, 0, null, 256245, null), new CommonRewardModel(0, "бронзовый", null, "14:59", null, 0, 0, null, false, true, 4, null, calendarBonusRewardState, false, false, null, 0, null, 256245, null), new CommonRewardModel(0, "бронзовый", null, "14:59", null, 0, 0, null, false, true, 4, null, CalendarBonusRewardState.AVAILABLE_NORM_LEVEL, false, false, null, 0, null, 256245, null)}), commonRewardModel, false, false, 0.0f, true, 0, 0, CalendarScreenType.COME_BACK, false, false, true, false, true, new Function1<CalendarScreenType, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CalendarScreenType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CalendarScreenType calendarScreenType) {
                    invoke2(calendarScreenType);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function3<Integer, Boolean, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.8
                public final void invoke(int i2, boolean z, @Nullable Bitmap bitmap) {
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool, Bitmap bitmap) {
                    invoke(num.intValue(), bool.booleanValue(), bitmap);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 920350128, 1188785590, 920325576, 920350134, 438, 16777217, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.calendar.CalendarMainUiKt.PreviewCalendarMainUi.10
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
                    CalendarMainUiKt.PreviewCalendarMainUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean CalendarMainUi_DgHyVOg$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final String CalendarMainUi_DgHyVOg$lambda$10(State<String> state) {
        return state.getValue();
    }

    public static final Bitmap CalendarMainUi_DgHyVOg$lambda$12(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final Bitmap CalendarMainUi_DgHyVOg$lambda$15(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final Bitmap CalendarMainUi_DgHyVOg$lambda$18(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final Bitmap CalendarMainUi_DgHyVOg$lambda$21(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final String CalendarMainUi_DgHyVOg$lambda$24(State<String> state) {
        return state.getValue();
    }
}

