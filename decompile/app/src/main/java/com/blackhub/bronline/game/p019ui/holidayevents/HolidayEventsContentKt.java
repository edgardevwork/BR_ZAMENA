package com.blackhub.bronline.game.p019ui.holidayevents;

import android.graphics.Bitmap;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.VisualTransformation;
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
import androidx.media3.extractor.MpegAudioUtil;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.holidayevents.enums.HolidayEventsScreenEnum;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGainBlockData;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
import com.blackhub.bronline.game.p019ui.holidayevents.uiblock.HolidayEventsTopBlockKt;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.blackhub.bronline.game.p019ui.widget.block.main.CommonSeasonEndsBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt;
import com.blackhub.bronline.game.p019ui.widget.block.uiblock.CommonTasksKt;
import com.blackhub.bronline.game.p019ui.widget.dialog.CommonRewardDialogKt;
import com.blackhub.bronline.game.p019ui.widget.dialog.DialogCustomBlockKt;
import com.blackhub.bronline.game.p019ui.widget.progressbar.CommonProgressBarHorizontalKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsContent.kt */
@Metadata(m7104d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\u001aï\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\t2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\t2\u0006\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u000e2\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\t2\b\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u0010:\u001a\u00020\u00172\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\t2\u0006\u0010=\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u00172\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00010F28\u0010K\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(P\u0012\u0004\u0012\u00020\u00010L2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010F2!\u0010S\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\u00010T2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00010F2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(X\u0012\u0004\u0012\u00020\u00010T2!\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020\u00010T2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00010F2!\u0010]\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020\u00010T2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00010F2!\u0010a\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(b\u0012\u0004\u0012\u00020\u00010T2!\u0010c\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020\u00010T2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00010F2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00010F2!\u0010h\u001a\u001d\u0012\u0013\u0012\u001108¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(i\u0012\u0004\u0012\u00020\u00010TH\u0007ø\u0001\u0000¢\u0006\u0004\bj\u0010k\u001a\r\u0010l\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010m\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006n"}, m7105d2 = {"HolidayEventsContent", "", "backgroundBitmap", "Landroid/graphics/Bitmap;", "bpOfferImage", "offerImage", "treeImage", "lastChanceBitmap", "listOfButtons", "", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "currentScreen", "Lcom/blackhub/bronline/game/gui/holidayevents/enums/HolidayEventsScreenEnum;", "buttonPlayText", "", "listOfGames", "Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGameItemModel;", "rewardLevel", "gainLevel", "seasonIcon", "rewardsList", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "isTopListSelected", "", "rewardsBitmapImage", "gainBitmapImage", "holidayEventsGainBlockData", "Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGainBlockData;", "seasonCurrencyBitmap", "seasonColor", "Landroidx/compose/ui/graphics/Color;", "seasonColor2", "shadowColorForEventIcon", "seasonName", "", "seasonTimer", "seasonTimerHeader", "valueOfExperience", "maxExperience", "bcAmount", "Landroidx/compose/ui/text/AnnotatedString;", "isNeedToShowDialogBuyCurrency", "enteredTextBuyDarkEnergy", "textYouSpendBC", "textYouGetCurrency", "selectedCategoryId", "", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "specialTasksList", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "dailyTasksList", "isNeedToShowPreviewRewardDialog", "rewardItemForDialog", "myPlaceInRating", "ratingList", "Lcom/blackhub/bronline/game/core/utils/attachment/rating/CommonRatingModel;", "myRatingBgImage", "isNeedToShowTutorial", "tutorialAttachment", "Lcom/blackhub/bronline/game/core/utils/attachment/tutorial/CommonTutorialTextsWithImage;", "gameQueuePlayers", "isNeedToShowDialogWaitForPlayers", "isNeedToShowDialogNotEnoughBc", "isNeedToShowOfferImage", "isWithPremium", "isTopTasksHaveNotification", "isBottomTasksHaveNotification", "isNeedToShowLastChance", "onLastChanceClick", "Lkotlin/Function0;", "onClickGoToPurchaseBc", "onCloseDialogNotEnoughBc", "onCancelGameSearch", "onCloseTutorialClick", "onItemClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "bitmap", "onButtonGainLvlUp", "onPreviewDialogButtonClick", "onExpandButtonClick", "Lkotlin/Function1;", "isTopClicked", "onBuyDarkEnergyClick", "onTextEnteredInBuyDialog", "darkEnergy", "onGameClick", "gameItem", "onCloseDialogBuyCurrency", "onPlayClick", "onButtonChooseScreenClick", "button", "onClickPlusButton", "onCloseClick", "onSelectTaskCategory", "categoryId", "onTaskClick", "task", "onRefreshRatingClick", "onButtonBpOfferClick", "onInfoClick", "onRatingItemClick", "item", "HolidayEventsContent-F-bHTq8", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/util/List;Lcom/blackhub/bronline/game/gui/holidayevents/enums/HolidayEventsScreenEnum;ILjava/util/List;IILandroid/graphics/Bitmap;Ljava/util/List;ZLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGainBlockData;Landroid/graphics/Bitmap;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/ui/text/AnnotatedString;ZLjava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;BLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/util/List;Ljava/util/List;ZLcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;ILjava/util/List;Landroid/graphics/Bitmap;ZLjava/util/List;Ljava/lang/String;ZZZZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIIIII)V", "HolidayEventsContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class HolidayEventsContentKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: HolidayEventsContent-F-bHTq8, reason: not valid java name */
    public static final void m14980HolidayEventsContentFbHTq8(@Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, @Nullable final Bitmap bitmap3, @Nullable final Bitmap bitmap4, @Nullable final Bitmap bitmap5, @NotNull final List<CommonButtonCategory> listOfButtons, @NotNull final HolidayEventsScreenEnum currentScreen, @StringRes final int i, @NotNull final List<HolidayEventsGameItemModel> listOfGames, final int i2, final int i3, @Nullable final Bitmap bitmap6, @NotNull final List<CommonRewardModel> rewardsList, final boolean z, @Nullable final Bitmap bitmap7, @Nullable final Bitmap bitmap8, @NotNull final HolidayEventsGainBlockData holidayEventsGainBlockData, @Nullable final Bitmap bitmap9, final long j, final long j2, final long j3, @NotNull final String seasonName, @NotNull final String seasonTimer, @NotNull final String seasonTimerHeader, final int i4, final int i5, @NotNull final AnnotatedString bcAmount, final boolean z2, @NotNull final String enteredTextBuyDarkEnergy, @NotNull final AnnotatedString textYouSpendBC, @NotNull final AnnotatedString textYouGetCurrency, final byte b, @Nullable final Bitmap bitmap10, @Nullable final Bitmap bitmap11, @NotNull final List<CommonTaskModel> specialTasksList, @NotNull final List<CommonTaskModel> dailyTasksList, final boolean z3, @NotNull final CommonRewardModel rewardItemForDialog, final int i6, @NotNull final List<CommonRatingModel> ratingList, @Nullable final Bitmap bitmap12, final boolean z4, @NotNull final List<CommonTutorialTextsWithImage> tutorialAttachment, @NotNull final String gameQueuePlayers, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, @NotNull final Function0<Unit> onLastChanceClick, @NotNull final Function0<Unit> onClickGoToPurchaseBc, @NotNull final Function0<Unit> onCloseDialogNotEnoughBc, @NotNull final Function0<Unit> onCancelGameSearch, @NotNull final Function0<Unit> onCloseTutorialClick, @NotNull final Function2<? super Integer, ? super Bitmap, Unit> onItemClick, @NotNull final Function0<Unit> onButtonGainLvlUp, @NotNull final Function0<Unit> onPreviewDialogButtonClick, @NotNull final Function1<? super Boolean, Unit> onExpandButtonClick, @NotNull final Function0<Unit> onBuyDarkEnergyClick, @NotNull final Function1<? super String, Unit> onTextEnteredInBuyDialog, @NotNull final Function1<? super HolidayEventsGameItemModel, Unit> onGameClick, @NotNull final Function0<Unit> onCloseDialogBuyCurrency, @NotNull final Function0<Unit> onPlayClick, @NotNull final Function1<? super CommonButtonCategory, Unit> onButtonChooseScreenClick, @NotNull final Function0<Unit> onClickPlusButton, @NotNull final Function0<Unit> onCloseClick, @NotNull final Function1<? super Byte, Unit> onSelectTaskCategory, @NotNull final Function1<? super CommonTaskModel, Unit> onTaskClick, @NotNull final Function0<Unit> onRefreshRatingClick, @NotNull final Function0<Unit> onButtonBpOfferClick, @NotNull final Function0<Unit> onInfoClick, @NotNull final Function1<? super CommonRatingModel, Unit> onRatingItemClick, @Nullable Composer composer, final int i7, final int i8, final int i9, final int i10, final int i11, final int i12, final int i13, final int i14) {
        Intrinsics.checkNotNullParameter(listOfButtons, "listOfButtons");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(listOfGames, "listOfGames");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        Intrinsics.checkNotNullParameter(holidayEventsGainBlockData, "holidayEventsGainBlockData");
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        Intrinsics.checkNotNullParameter(seasonTimer, "seasonTimer");
        Intrinsics.checkNotNullParameter(seasonTimerHeader, "seasonTimerHeader");
        Intrinsics.checkNotNullParameter(bcAmount, "bcAmount");
        Intrinsics.checkNotNullParameter(enteredTextBuyDarkEnergy, "enteredTextBuyDarkEnergy");
        Intrinsics.checkNotNullParameter(textYouSpendBC, "textYouSpendBC");
        Intrinsics.checkNotNullParameter(textYouGetCurrency, "textYouGetCurrency");
        Intrinsics.checkNotNullParameter(specialTasksList, "specialTasksList");
        Intrinsics.checkNotNullParameter(dailyTasksList, "dailyTasksList");
        Intrinsics.checkNotNullParameter(rewardItemForDialog, "rewardItemForDialog");
        Intrinsics.checkNotNullParameter(ratingList, "ratingList");
        Intrinsics.checkNotNullParameter(tutorialAttachment, "tutorialAttachment");
        Intrinsics.checkNotNullParameter(gameQueuePlayers, "gameQueuePlayers");
        Intrinsics.checkNotNullParameter(onLastChanceClick, "onLastChanceClick");
        Intrinsics.checkNotNullParameter(onClickGoToPurchaseBc, "onClickGoToPurchaseBc");
        Intrinsics.checkNotNullParameter(onCloseDialogNotEnoughBc, "onCloseDialogNotEnoughBc");
        Intrinsics.checkNotNullParameter(onCancelGameSearch, "onCancelGameSearch");
        Intrinsics.checkNotNullParameter(onCloseTutorialClick, "onCloseTutorialClick");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onButtonGainLvlUp, "onButtonGainLvlUp");
        Intrinsics.checkNotNullParameter(onPreviewDialogButtonClick, "onPreviewDialogButtonClick");
        Intrinsics.checkNotNullParameter(onExpandButtonClick, "onExpandButtonClick");
        Intrinsics.checkNotNullParameter(onBuyDarkEnergyClick, "onBuyDarkEnergyClick");
        Intrinsics.checkNotNullParameter(onTextEnteredInBuyDialog, "onTextEnteredInBuyDialog");
        Intrinsics.checkNotNullParameter(onGameClick, "onGameClick");
        Intrinsics.checkNotNullParameter(onCloseDialogBuyCurrency, "onCloseDialogBuyCurrency");
        Intrinsics.checkNotNullParameter(onPlayClick, "onPlayClick");
        Intrinsics.checkNotNullParameter(onButtonChooseScreenClick, "onButtonChooseScreenClick");
        Intrinsics.checkNotNullParameter(onClickPlusButton, "onClickPlusButton");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onSelectTaskCategory, "onSelectTaskCategory");
        Intrinsics.checkNotNullParameter(onTaskClick, "onTaskClick");
        Intrinsics.checkNotNullParameter(onRefreshRatingClick, "onRefreshRatingClick");
        Intrinsics.checkNotNullParameter(onButtonBpOfferClick, "onButtonBpOfferClick");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onRatingItemClick, "onRatingItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(560175887);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(560175887, i7, i8, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent (HolidayEventsContent.kt:154)");
        }
        SurfaceKt.m9876SurfaceT9BRK9s(null, null, ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 451421652, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1

            /* compiled from: HolidayEventsContent.kt */
            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HolidayEventsScreenEnum.values().length];
                    try {
                        iArr[HolidayEventsScreenEnum.MAIN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HolidayEventsScreenEnum.GAMES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HolidayEventsScreenEnum.TASKS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[HolidayEventsScreenEnum.RATING.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
            public final void invoke(@Nullable Composer composer2, int i15) {
                Function0<Unit> function0;
                Composer composer3;
                boolean z12;
                if ((i15 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(451421652, i15, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous> (HolidayEventsContent.kt:158)");
                    }
                    Bitmap bitmap13 = bitmap;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap13, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer2, 3128, 116);
                    composer2.startReplaceableGroup(-457026595);
                    if (currentScreen == HolidayEventsScreenEnum.MAIN) {
                        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap4, SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), null, null, 0.0f, null, 0, composer2, 56, 124);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                    List<CommonButtonCategory> list = listOfButtons;
                    long j4 = j;
                    long j5 = j3;
                    AnnotatedString annotatedString = bcAmount;
                    Bitmap bitmap14 = bitmap9;
                    final Function0<Unit> function02 = onInfoClick;
                    final Function1<CommonButtonCategory, Unit> function1 = onButtonChooseScreenClick;
                    final Function0<Unit> function03 = onCloseClick;
                    final Function0<Unit> function04 = onClickPlusButton;
                    HolidayEventsScreenEnum holidayEventsScreenEnum = currentScreen;
                    int i16 = i2;
                    int i17 = i3;
                    Bitmap bitmap15 = bitmap6;
                    Bitmap bitmap16 = bitmap3;
                    boolean z13 = z;
                    Bitmap bitmap17 = bitmap8;
                    Bitmap bitmap18 = bitmap7;
                    HolidayEventsGainBlockData holidayEventsGainBlockData2 = holidayEventsGainBlockData;
                    boolean z14 = z7;
                    List<CommonRewardModel> list2 = rewardsList;
                    final Function1<Boolean, Unit> function12 = onExpandButtonClick;
                    final Function2<Integer, Bitmap, Unit> function2 = onItemClick;
                    final Function0<Unit> function05 = onButtonGainLvlUp;
                    int i18 = i;
                    List<HolidayEventsGameItemModel> list3 = listOfGames;
                    final Function1<HolidayEventsGameItemModel, Unit> function13 = onGameClick;
                    final Function0<Unit> function06 = onPlayClick;
                    List<CommonTaskModel> list4 = specialTasksList;
                    List<CommonTaskModel> list5 = dailyTasksList;
                    byte b2 = b;
                    Bitmap bitmap19 = bitmap10;
                    Bitmap bitmap20 = bitmap11;
                    String str = seasonTimer;
                    boolean z15 = z9;
                    boolean z16 = z10;
                    Function1<Byte, Unit> function14 = onSelectTaskCategory;
                    Function1<CommonTaskModel, Unit> function15 = onTaskClick;
                    int i19 = i6;
                    List<CommonRatingModel> list6 = ratingList;
                    Bitmap bitmap21 = bitmap12;
                    Function0<Unit> function07 = onRefreshRatingClick;
                    Function1<CommonRatingModel, Unit> function16 = onRatingItemClick;
                    int i20 = i4;
                    long j6 = j2;
                    int i21 = i5;
                    boolean z17 = z8;
                    String str2 = seasonName;
                    String str3 = seasonTimerHeader;
                    final Function0<Unit> function08 = onButtonBpOfferClick;
                    final Bitmap bitmap22 = bitmap2;
                    composer2.startReplaceableGroup(-483455358);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceAround, companion2.getStart(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(662707173);
                    boolean zChanged = composer2.changed(function02);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$1$1
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
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function09 = (Function0) objRememberedValue;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(662707072);
                    boolean zChanged2 = composer2.changed(function1);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<CommonButtonCategory, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory) {
                                invoke2(commonButtonCategory);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull CommonButtonCategory button) {
                                Intrinsics.checkNotNullParameter(button, "button");
                                function1.invoke(button);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function17 = (Function1) objRememberedValue2;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(662707282);
                    boolean zChanged3 = composer2.changed(function03);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$3$1
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
                                function03.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function010 = (Function0) objRememberedValue3;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(662707226);
                    boolean zChanged4 = composer2.changed(function04);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$4$1
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
                                function04.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    HolidayEventsTopBlockKt.m14989HolidayEventsTopBlockRakH_j8(list, j4, j5, annotatedString, bitmap14, function09, function17, function010, (Function0) objRememberedValue4, composer2, 32776);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer2, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._95wdp, composer2, 6)), 0.0f, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer2, 6)), companion2.getCenterStart());
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    CommonSeasonEndsBlockKt.m15061CommonSeasonEndsBlockeuL9pac(j4, bitmap15, str2, str, str3, composer2, 64);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    int i22 = iArr[holidayEventsScreenEnum.ordinal()];
                    if (i22 == 1) {
                        function0 = function04;
                        composer2.startReplaceableGroup(-912114769);
                        composer3 = composer2;
                        CommonProgressBarHorizontalKt.m15100CommonProgressBarHorizontal6Ij7WKU(boxScopeInstance.align(companion, companion2.getCenter()), PrimitiveResources_androidKt.dimensionResource(R.dimen._214wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer2, 6), i20, String.valueOf(i16), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer2, 6), 0.0f, 0.0f, j4, j6, j5, bitmap14, null, null, i21, false, composer2, 0, 196672, 12480);
                        ComposeExtensionKt.IfFalse(Boolean.valueOf(z17), ComposableLambdaKt.composableLambda(composer3, -2109265565, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$5$2
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
                            public final void invoke(@Nullable Composer composer4, int i23) {
                                if ((i23 & 11) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2109265565, i23, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HolidayEventsContent.kt:228)");
                                    }
                                    Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._183wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._81wdp, composer4, 6)), Alignment.INSTANCE.getCenterEnd());
                                    composer4.startReplaceableGroup(450556617);
                                    boolean zChanged5 = composer4.changed(function08);
                                    final Function0<Unit> function011 = function08;
                                    Object objRememberedValue5 = composer4.rememberedValue();
                                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$5$2$1$1
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
                                                function011.invoke();
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer4.endReplaceableGroup();
                                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap22, ClickableKt.m7805clickableXHw0xAI$default(modifierAlign2, false, null, null, (Function0) objRememberedValue5, 7, null), null, null, 0.0f, null, 0, composer4, 8, 124);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 48);
                        composer2.endReplaceableGroup();
                        Unit unit = Unit.INSTANCE;
                    } else if (i22 == 2) {
                        composer2.startReplaceableGroup(-912113256);
                        function0 = function04;
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.holiday_events_choose_game, composer2, 6), PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterEnd()), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer2, 6), 0.0f, 11, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wdp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65532);
                        composer2.endReplaceableGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composer3 = composer2;
                    } else {
                        composer2.startReplaceableGroup(-912112794);
                        composer2.endReplaceableGroup();
                        Unit unit3 = Unit.INSTANCE;
                        composer3 = composer2;
                        function0 = function04;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    int i23 = iArr[holidayEventsScreenEnum.ordinal()];
                    if (i23 == 1) {
                        z12 = true;
                        composer3.startReplaceableGroup(662710410);
                        composer3.startReplaceableGroup(662711208);
                        boolean zChanged5 = composer3.changed(function12);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z18) {
                                    function12.invoke(Boolean.valueOf(z18));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        Function1 function18 = (Function1) objRememberedValue5;
                        composer2.endReplaceableGroup();
                        composer3.startReplaceableGroup(662711359);
                        final Function0<Unit> function011 = function0;
                        boolean zChanged6 = composer3.changed(function011);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$7$1
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
                                    function011.invoke();
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        Function0 function012 = (Function0) objRememberedValue6;
                        composer2.endReplaceableGroup();
                        composer3.startReplaceableGroup(662711422);
                        boolean zChanged7 = composer3.changed(function2);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function2<Integer, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$8$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Bitmap bitmap23) {
                                    invoke(num.intValue(), bitmap23);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(int i24, @Nullable Bitmap bitmap23) {
                                    function2.invoke(Integer.valueOf(i24), bitmap23);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        Function2 function22 = (Function2) objRememberedValue7;
                        composer2.endReplaceableGroup();
                        composer3.startReplaceableGroup(662711515);
                        boolean zChanged8 = composer3.changed(function05);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$9$1
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
                                    function05.invoke();
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        composer2.endReplaceableGroup();
                        HolidayEventsMainKt.m14982HolidayEventsMain25RIiPk(i16, i17, bitmap15, bitmap16, z13, bitmap14, bitmap17, bitmap18, holidayEventsGainBlockData2, z14, j5, j4, list2, function18, function012, function22, (Function0) objRememberedValue8, composer2, 19141120, 512);
                        composer2.endReplaceableGroup();
                        Unit unit4 = Unit.INSTANCE;
                    } else if (i23 == 2) {
                        z12 = true;
                        composer3.startReplaceableGroup(662711652);
                        composer3.startReplaceableGroup(662711925);
                        boolean zChanged9 = composer3.changed(function13);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new Function1<HolidayEventsGameItemModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$10$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(HolidayEventsGameItemModel holidayEventsGameItemModel) {
                                    invoke2(holidayEventsGameItemModel);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull HolidayEventsGameItemModel gameItem) {
                                    Intrinsics.checkNotNullParameter(gameItem, "gameItem");
                                    function13.invoke(gameItem);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue9);
                        }
                        Function1 function19 = (Function1) objRememberedValue9;
                        composer2.endReplaceableGroup();
                        composer3.startReplaceableGroup(662711868);
                        boolean zChanged10 = composer3.changed(function06);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$1$11$1
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
                            composer3.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceableGroup();
                        HolidayEventsGamesKt.m14981HolidayEventsGamescf5BqRc(i18, list3, j4, function19, (Function0) objRememberedValue10, composer2, 64);
                        composer2.endReplaceableGroup();
                        Unit unit5 = Unit.INSTANCE;
                    } else if (i23 != 3) {
                        if (i23 == 4) {
                            composer3.startReplaceableGroup(662712999);
                            HolidayEventsRatingKt.HolidayEventsRating(i19, list6, bitmap21, function07, function16, composer2, MpegAudioUtil.SAMPLES_PER_FRAME_L3_V2);
                            composer2.endReplaceableGroup();
                            Unit unit6 = Unit.INSTANCE;
                        } else {
                            composer3.startReplaceableGroup(662713359);
                            composer2.endReplaceableGroup();
                            Unit unit7 = Unit.INSTANCE;
                        }
                        z12 = true;
                    } else {
                        composer3.startReplaceableGroup(662712075);
                        z12 = true;
                        CommonTasksKt.CommonTasks(list4, list5, b2, bitmap14, bitmap19, bitmap20, str, false, z15, z16, null, function14, function15, composer2, 299080, 6, 128);
                        composer2.endReplaceableGroup();
                        Unit unit8 = Unit.INSTANCE;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    boolean z18 = z12;
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    final Function0<Unit> function013 = onLastChanceClick;
                    final Bitmap bitmap23 = bitmap5;
                    ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer3, -53131092, z18, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1.2
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
                        public final void invoke(@Nullable Composer composer4, int i24) {
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-53131092, i24, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous> (HolidayEventsContent.kt:323)");
                                }
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                final Function0<Unit> function014 = function013;
                                Bitmap bitmap24 = bitmap23;
                                composer4.startReplaceableGroup(733328855);
                                Alignment.Companion companion5 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion5.getTopStart(), false, composer4, 0);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                Modifier modifierAlign2 = BoxScopeInstance.INSTANCE.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._81wdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._248wdp, composer4, 6)), companion5.getCenterEnd());
                                composer4.startReplaceableGroup(-912109245);
                                boolean zChanged11 = composer4.changed(function014);
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$2$1$1$1
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
                                            function014.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                composer4.endReplaceableGroup();
                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap24, ComposeExtensionKt.noRippleClickable$default(modifierAlign2, false, (Function0) objRememberedValue11, 1, null), null, ContentScale.INSTANCE.getFillBounds(), 0.0f, null, 0, composer4, 3080, 116);
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
                    }), composer3, 48);
                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                    final String str4 = enteredTextBuyDarkEnergy;
                    final Function0<Unit> function014 = onBuyDarkEnergyClick;
                    final Function0<Unit> function015 = onCloseDialogBuyCurrency;
                    final AnnotatedString annotatedString2 = textYouSpendBC;
                    final AnnotatedString annotatedString3 = textYouGetCurrency;
                    final Bitmap bitmap24 = bitmap9;
                    final Function1<String, Unit> function110 = onTextEnteredInBuyDialog;
                    ComposeExtensionKt.IfTrue(boolValueOf2, ComposableLambdaKt.composableLambda(composer3, -1378794461, z18, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                        public final void invoke(@Nullable Composer composer4, int i24) {
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1378794461, i24, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous> (HolidayEventsContent.kt:339)");
                                }
                                String strStringResource = StringResources_androidKt.stringResource(R.string.common_confirmation, composer4, 6);
                                boolean z19 = str4.length() > 0;
                                composer4.startReplaceableGroup(662714262);
                                boolean zChanged11 = composer4.changed(function014);
                                final Function0<Unit> function016 = function014;
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$3$1$1
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
                                            function016.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                Function0 function017 = (Function0) objRememberedValue11;
                                composer4.endReplaceableGroup();
                                composer4.startReplaceableGroup(662714328);
                                boolean zChanged12 = composer4.changed(function015);
                                final Function0<Unit> function018 = function015;
                                Object objRememberedValue12 = composer4.rememberedValue();
                                if (zChanged12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$3$2$1
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
                                            function018.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue12);
                                }
                                composer4.endReplaceableGroup();
                                final AnnotatedString annotatedString4 = annotatedString2;
                                final AnnotatedString annotatedString5 = annotatedString3;
                                final Bitmap bitmap25 = bitmap24;
                                final String str5 = str4;
                                final Function1<String, Unit> function111 = function110;
                                DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(null, 0, strStringResource, null, 0L, 0.0f, null, z19, null, null, null, 0L, 0L, 0.0f, 0.0f, null, null, function017, (Function0) objRememberedValue12, ComposableLambdaKt.composableLambda(composer4, -1375172724, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContent.1.3.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Type inference failed for: r13v13 */
                                    /* JADX WARN: Type inference failed for: r13v7 */
                                    /* JADX WARN: Type inference failed for: r13v8, types: [boolean, int] */
                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i25) {
                                        Modifier.Companion companion4;
                                        ?? r13;
                                        int i26;
                                        Modifier.Companion companion5;
                                        if ((i25 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1375172724, i25, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous>.<anonymous> (HolidayEventsContent.kt:346)");
                                            }
                                            Modifier.Companion companion6 = Modifier.INSTANCE;
                                            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._174wdp, composer5, 6));
                                            Alignment.Companion companion7 = Alignment.INSTANCE;
                                            Alignment.Horizontal centerHorizontally = companion7.getCenterHorizontally();
                                            Arrangement arrangement = Arrangement.INSTANCE;
                                            Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                                            AnnotatedString annotatedString6 = annotatedString4;
                                            AnnotatedString annotatedString7 = annotatedString5;
                                            Bitmap bitmap26 = bitmap25;
                                            String str6 = str5;
                                            final Function1<String, Unit> function112 = function111;
                                            composer5.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceEvenly, centerHorizontally, composer5, 54);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor4);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion8.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            String strStringResource2 = StringResources_androidKt.stringResource(R.string.holiday_events_buy_dark_energy_dialog_title, composer5, 6);
                                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                            TextAlign.Companion companion9 = TextAlign.INSTANCE;
                                            TextKt.m10024Text4IGK_g(strStringResource2, SizeKt.m8177width3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._349wdp, composer5, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wsp, 0L, companion9.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer5, 1572870, 58), composer5, 0, 0, 65532);
                                            Alignment.Horizontal centerHorizontally2 = companion7.getCenterHorizontally();
                                            composer5.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer5, 48);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion6);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor5);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy3, companion8.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion8.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                            }
                                            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            TextKt.m10025TextIbK3jfQ(annotatedString6, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, companion9.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer5, 12582918, 122), composer5, 0, 0, 131070);
                                            Alignment.Vertical centerVertically = companion7.getCenterVertically();
                                            composer5.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer5, 48);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap6 = composer5.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion6);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor6);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion8.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                            }
                                            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            TextKt.m10025TextIbK3jfQ(annotatedString7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, companion9.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer5, 12582918, 122), composer5, 0, 0, 131070);
                                            composer5.startReplaceableGroup(830248141);
                                            if (annotatedString7.length() > 0) {
                                                i26 = 6;
                                                companion4 = companion6;
                                                r13 = 0;
                                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, 6)), composer5, 0);
                                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap26, SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer5, 6)), null, null, 0.0f, null, 0, composer5, 8, 124);
                                            } else {
                                                companion4 = companion6;
                                                r13 = 0;
                                                i26 = 6;
                                            }
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            Modifier modifierM7784borderziNgDLE = BorderKt.m7784borderziNgDLE(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._349wdp, composer5, i26)), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer5, i26)), PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer5, i26), new SolidColor(ColorResources_androidKt.colorResource(R.color.white, composer5, i26), null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer5, i26)));
                                            composer5.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), r13, composer5, r13);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer5, r13);
                                            CompositionLocalMap currentCompositionLocalMap7 = composer5.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor7);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy3, companion8.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion8.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion8.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                                composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                            }
                                            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, Integer.valueOf((int) r13));
                                            composer5.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(boxScopeInstance2.align(companion4, companion7.getCenter()), 0.0f, 1, null);
                                            Modifier.Companion companion10 = companion4;
                                            TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._14wsp, 0L, companion9.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer5, 12582918, 122);
                                            SolidColor solidColor = new SolidColor(ColorResources_androidKt.colorResource(R.color.white, composer5, i26), null);
                                            KeyboardOptions keyboardOptionsM8424copyij11fho$default = KeyboardOptions.m8424copyij11fho$default(KeyboardOptions.INSTANCE.getDefault(), 0, false, KeyboardType.INSTANCE.m13392getNumberPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null);
                                            composer5.startReplaceableGroup(830249479);
                                            boolean zChanged13 = composer5.changed(function112);
                                            Object objRememberedValue13 = composer5.rememberedValue();
                                            if (zChanged13 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue13 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$3$3$1$2$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(String str7) {
                                                        invoke2(str7);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull String textValue) {
                                                        Intrinsics.checkNotNullParameter(textValue, "textValue");
                                                        function112.invoke(textValue);
                                                    }
                                                };
                                                composer5.updateRememberedValue(objRememberedValue13);
                                            }
                                            composer5.endReplaceableGroup();
                                            BasicTextFieldKt.BasicTextField(str6, (Function1<? super String, Unit>) objRememberedValue13, modifierFillMaxWidth$default2, false, false, textStyleM14811montserratBoldCustomSpIzzofJo, keyboardOptionsM8424copyij11fho$default, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer5, 0, 0, 49048);
                                            composer5.startReplaceableGroup(450565156);
                                            if (str6.length() == 0) {
                                                Modifier modifierAlign2 = boxScopeInstance2.align(SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null), companion7.getCenter());
                                                companion5 = companion10;
                                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.holiday_events_enter_summ, composer5, 6), modifierAlign2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14817montserratCustomWeightCustomSpqm9ESmE(R.dimen._12wsp, FontWeight.INSTANCE.getW300(), 0L, companion9.m13558getCentere0LSkKk(), 0L, 0.0f, null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), composer5, 100663350, 116), composer5, 0, 0, 65532);
                                            } else {
                                                companion5 = companion10;
                                            }
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer5, 6)), composer5, 0);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 0, 805306368, 130939);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 48);
                    Boolean boolValueOf3 = Boolean.valueOf(z6);
                    final String str5 = enteredTextBuyDarkEnergy;
                    final Function0<Unit> function016 = onClickGoToPurchaseBc;
                    final Function0<Unit> function017 = onCloseDialogNotEnoughBc;
                    ComposeExtensionKt.IfTrue(boolValueOf3, ComposableLambdaKt.composableLambda(composer3, 1555350052, z18, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1.4
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
                        public final void invoke(@Nullable Composer composer4, int i24) {
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1555350052, i24, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous> (HolidayEventsContent.kt:439)");
                                }
                                String strStringResource = StringResources_androidKt.stringResource(R.string.common_confirmation, composer4, 6);
                                boolean z19 = str5.length() > 0;
                                composer4.startReplaceableGroup(662719245);
                                boolean zChanged11 = composer4.changed(function016);
                                final Function0<Unit> function018 = function016;
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$4$1$1
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
                                            function018.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                Function0 function019 = (Function0) objRememberedValue11;
                                composer4.endReplaceableGroup();
                                composer4.startReplaceableGroup(662719312);
                                boolean zChanged12 = composer4.changed(function017);
                                final Function0<Unit> function020 = function017;
                                Object objRememberedValue12 = composer4.rememberedValue();
                                if (zChanged12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$4$2$1
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
                                            function020.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue12);
                                }
                                composer4.endReplaceableGroup();
                                DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(null, 0, strStringResource, null, 0L, 0.0f, null, z19, null, null, null, 0L, 0L, 0.0f, 0.0f, null, null, function019, (Function0) objRememberedValue12, ComposableSingletons$HolidayEventsContentKt.INSTANCE.m14979getLambda1$app_siteRelease(), composer4, 0, 805306368, 130939);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 48);
                    Boolean boolValueOf4 = Boolean.valueOf(z3);
                    final CommonRewardModel commonRewardModel = rewardItemForDialog;
                    final Function0<Unit> function018 = onPreviewDialogButtonClick;
                    ComposeExtensionKt.IfTrue(boolValueOf4, ComposableLambdaKt.composableLambda(composer3, 194527269, z18, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1.5
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
                        public final void invoke(@Nullable Composer composer4, int i24) {
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(194527269, i24, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous> (HolidayEventsContent.kt:464)");
                                }
                                CommonRewardModel commonRewardModel2 = commonRewardModel;
                                composer4.startReplaceableGroup(662720260);
                                boolean zChanged11 = composer4.changed(function018);
                                final Function0<Unit> function019 = function018;
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$5$1$1
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
                                            function019.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                composer4.endReplaceableGroup();
                                CommonRewardDialogKt.CommonRewardDialog(null, commonRewardModel2, (Function0) objRememberedValue11, composer4, 64, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 48);
                    Boolean boolValueOf5 = Boolean.valueOf(z4);
                    final List<CommonTutorialTextsWithImage> list7 = tutorialAttachment;
                    final Function0<Unit> function019 = onCloseTutorialClick;
                    ComposeExtensionKt.IfTrue(boolValueOf5, ComposableLambdaKt.composableLambda(composer3, -1166295514, z18, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1.6
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
                        public final void invoke(@Nullable Composer composer4, int i24) {
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1166295514, i24, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous> (HolidayEventsContent.kt:471)");
                                }
                                List<CommonTutorialTextsWithImage> list8 = list7;
                                int size = list8.size();
                                composer4.startReplaceableGroup(662720544);
                                boolean zChanged11 = composer4.changed(function019);
                                final Function0<Unit> function020 = function019;
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$6$1$1
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
                                            function020.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                composer4.endReplaceableGroup();
                                TutorialImageAndThreeTextsUiKt.TutorialWithImageAndThreeTextsUi(list8, size, (Function0) objRememberedValue11, composer4, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 48);
                    Boolean boolValueOf6 = Boolean.valueOf(z5);
                    final Function0<Unit> function020 = onCancelGameSearch;
                    final String str6 = gameQueuePlayers;
                    ComposeExtensionKt.IfTrue(boolValueOf6, ComposableLambdaKt.composableLambda(composer3, 1767848999, z18, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1.7
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
                        public final void invoke(@Nullable Composer composer4, int i24) {
                            if ((i24 & 11) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1767848999, i24, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous> (HolidayEventsContent.kt:480)");
                                }
                                String upperCase = StringResources_androidKt.stringResource(R.string.holiday_events_game_search_title, composer4, 6).toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                String strStringResource = StringResources_androidKt.stringResource(R.string.common_cancel, composer4, 6);
                                composer4.startReplaceableGroup(662720902);
                                boolean zChanged11 = composer4.changed(function020);
                                final Function0<Unit> function021 = function020;
                                Object objRememberedValue11 = composer4.rememberedValue();
                                if (zChanged11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$1$7$1$1
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
                                            function021.invoke();
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue11);
                                }
                                composer4.endReplaceableGroup();
                                final String str7 = str6;
                                DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(null, 0, upperCase, null, 0L, 0.0f, null, false, null, strStringResource, null, 0L, 0L, 0.0f, 0.0f, null, null, null, (Function0) objRememberedValue11, ComposableLambdaKt.composableLambda(composer4, 1771470736, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContent.1.7.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer5, int i25) {
                                        if ((i25 & 11) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1771470736, i25, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContent.<anonymous>.<anonymous>.<anonymous> (HolidayEventsContent.kt:486)");
                                            }
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._175wdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer5, 6));
                                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                            String str8 = str7;
                                            composer5.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer5, 48);
                                            composer5.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor4);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer5);
                                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer5)), composer5, 0);
                                            composer5.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer5, 6)), composer5, 0);
                                            LottieLoopKt.LottieLoop(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._43wdp, composer5, 6)), R.raw.loader_red, 0, composer5, 48, 4);
                                            String strStringResource2 = StringResources_androidKt.stringResource(R.string.halloween_wait_for_the_game_to_start_caps, composer5, 6);
                                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                            TextKt.m10024Text4IGK_g(strStringResource2, PaddingKt.m8125paddingVpY3zN4$default(companion4, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer5, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composer5, 12582918, 126), composer5, 0, 0, 65532);
                                            TextKt.m10024Text4IGK_g(str8, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wsp, 0L, 0, 0L, 0.0f, null, composer5, 1572870, 62), composer5, 0, 0, 65534);
                                            composer5.endReplaceableGroup();
                                            composer5.endNode();
                                            composer5.endReplaceableGroup();
                                            composer5.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }), composer4, 0, 805306368, 261627);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582912, 123);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt$HolidayEventsContent$2
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

                public final void invoke(@Nullable Composer composer2, int i15) {
                    HolidayEventsContentKt.m14980HolidayEventsContentFbHTq8(bitmap, bitmap2, bitmap3, bitmap4, bitmap5, listOfButtons, currentScreen, i, listOfGames, i2, i3, bitmap6, rewardsList, z, bitmap7, bitmap8, holidayEventsGainBlockData, bitmap9, j, j2, j3, seasonName, seasonTimer, seasonTimerHeader, i4, i5, bcAmount, z2, enteredTextBuyDarkEnergy, textYouSpendBC, textYouGetCurrency, b, bitmap10, bitmap11, specialTasksList, dailyTasksList, z3, rewardItemForDialog, i6, ratingList, bitmap12, z4, tutorialAttachment, gameQueuePlayers, z5, z6, z7, z8, z9, z10, z11, onLastChanceClick, onClickGoToPurchaseBc, onCloseDialogNotEnoughBc, onCancelGameSearch, onCloseTutorialClick, onItemClick, onButtonGainLvlUp, onPreviewDialogButtonClick, onExpandButtonClick, onBuyDarkEnergyClick, onTextEnteredInBuyDialog, onGameClick, onCloseDialogBuyCurrency, onPlayClick, onButtonChooseScreenClick, onClickPlusButton, onCloseClick, onSelectTaskCategory, onTaskClick, onRefreshRatingClick, onButtonBpOfferClick, onInfoClick, onRatingItemClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), RecomposeScopeImplKt.updateChangedFlags(i8), RecomposeScopeImplKt.updateChangedFlags(i9), RecomposeScopeImplKt.updateChangedFlags(i10), RecomposeScopeImplKt.updateChangedFlags(i11), RecomposeScopeImplKt.updateChangedFlags(i12), RecomposeScopeImplKt.updateChangedFlags(i13), RecomposeScopeImplKt.updateChangedFlags(i14));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void HolidayEventsContentPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1353558445);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1353558445, i, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentPreview (HolidayEventsContent.kt:520)");
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonButtonCategory[]{new CommonButtonCategory(0, null, null, false, false, null, null, 127, null), new CommonButtonCategory(0, null, null, true, false, null, null, 119, null), new CommonButtonCategory(0, null, null, false, false, null, null, 127, null)});
            HolidayEventsScreenEnum holidayEventsScreenEnum = HolidayEventsScreenEnum.MAIN;
            List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new HolidayEventsGameItemModel[]{new HolidayEventsGameItemModel(0, false, false, null, null, 31, null), new HolidayEventsGameItemModel(0, false, false, null, null, 31, null), new HolidayEventsGameItemModel(0, false, false, null, null, 31, null)});
            CommonRewardModel commonRewardModel = new CommonRewardModel(0, "1", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null);
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.LEGENDARY;
            CommonRewardModel commonRewardModel2 = new CommonRewardModel(0, "228", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null);
            CommonRewardModel commonRewardModel3 = new CommonRewardModel(0, "322", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null);
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.EPIC;
            List listListOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonRewardModel[]{commonRewardModel, commonRewardModel2, commonRewardModel3, new CommonRewardModel(0, "4", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum2, 0, null, 229373, null), new CommonRewardModel(0, YouTubePlayerBridge.ERROR_HTML_5_PLAYER, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, CommonRarityEnum.RARE, 0, null, 229373, null), new CommonRewardModel(0, "6", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum2, 0, null, 229373, null), new CommonRewardModel(0, "7", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null), new CommonRewardModel(0, "8", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, CommonRarityEnum.PRIZE, 0, null, 229373, null), new CommonRewardModel(0, "9", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262141, null), new CommonRewardModel(0, "10", null, null, null, 0, 0, null, false, false, 0, null, null, false, false, commonRarityEnum, 0, null, 229373, null)});
            HolidayEventsGainBlockData holidayEventsGainBlockData = new HolidayEventsGainBlockData("2000", "x 2.30", "2200", "x 2.32", "1 000 000 000 P", 0, 32, null);
            long jColorResource = ColorResources_androidKt.colorResource(R.color.purpur, composerStartRestartGroup, 6);
            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6);
            long jColorResource3 = ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6);
            String upperCase = "14 дн. 15ч.".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String strStringResource = StringResources_androidKt.stringResource(R.string.common_timer_title_1, composerStartRestartGroup, 6);
            List list = null;
            List list2 = null;
            String str = "212";
            AnnotatedString annotatedString = new AnnotatedString(str, list, list2, 6, null);
            String strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            Useful useful = Useful.INSTANCE;
            AnnotatedString annotatedString2 = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(StringResources_androidKt.stringResource(R.string.holiday_events_you_spend, new Object[]{12}, composerStartRestartGroup, 70)));
            AnnotatedString annotatedString3 = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(StringResources_androidKt.stringResource(R.string.holiday_events_you_get, new Object[]{12}, composerStartRestartGroup, 70)));
            List list3 = null;
            List list4 = null;
            String str2 = "description";
            CommonTaskModel commonTaskModel = new CommonTaskModel(false, 0, 0, "special 1", new AnnotatedString(str2, list3, list4, 6, null), 999, 0, null, null, null, 0, 1991, null);
            int i2 = 6;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List list5 = null;
            List list6 = null;
            CommonTaskModel commonTaskModel2 = new CommonTaskModel(false, 0, 0, "special 2", new AnnotatedString("description", list5, list6, i2, defaultConstructorMarker), 999, 0, null, null, null, 0, 1991, null);
            CommonTaskModel commonTaskModel3 = new CommonTaskModel(false, 0, 0, "special 3", new AnnotatedString("description", list5, list6, i2, defaultConstructorMarker), 999, 0, null, null, null, 0, 1991, null);
            int i3 = 6;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            List list7 = null;
            List list8 = null;
            List listListOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTaskModel[]{commonTaskModel, commonTaskModel2, commonTaskModel3, new CommonTaskModel(false, 0, 0, "special 4", new AnnotatedString("description", list7, list8, i3, defaultConstructorMarker2), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 5", new AnnotatedString("description", list7, list8, i3, defaultConstructorMarker2), 999, 0, null, null, null, 0, 1991, null)});
            List list9 = null;
            List list10 = null;
            String str3 = "description";
            CommonTaskModel commonTaskModel4 = new CommonTaskModel(false, 0, 0, "daily 1", new AnnotatedString(str3, list9, list10, 6, null), 999, 0, null, null, null, 0, 1991, null);
            int i4 = 6;
            DefaultConstructorMarker defaultConstructorMarker3 = null;
            List list11 = null;
            List list12 = null;
            CommonTaskModel commonTaskModel5 = new CommonTaskModel(false, 0, 0, "daily 2", new AnnotatedString("description", list11, list12, i4, defaultConstructorMarker3), 999, 0, null, null, null, 0, 1991, null);
            CommonTaskModel commonTaskModel6 = new CommonTaskModel(false, 0, 0, "daily 3", new AnnotatedString("description", list11, list12, i4, defaultConstructorMarker3), 999, 0, null, null, null, 0, 1991, null);
            int i5 = 6;
            DefaultConstructorMarker defaultConstructorMarker4 = null;
            List list13 = null;
            List list14 = null;
            String str4 = "qwew";
            composer2 = composerStartRestartGroup;
            m14980HolidayEventsContentFbHTq8(null, null, null, null, null, listListOf, holidayEventsScreenEnum, R.string.common_play, listListOf2, 2, 1, null, listListOf3, true, null, null, holidayEventsGainBlockData, null, jColorResource, jColorResource2, jColorResource3, "Новогодний драйв", upperCase, strStringResource, 322, 1000, annotatedString, false, strEmpty, annotatedString2, annotatedString3, (byte) 1, null, null, listListOf4, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTaskModel[]{commonTaskModel4, commonTaskModel5, commonTaskModel6, new CommonTaskModel(false, 0, 0, "daily 4", new AnnotatedString("description", list13, list14, i5, defaultConstructorMarker4), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "daily 5", new AnnotatedString("description", list13, list14, i5, defaultConstructorMarker4), 999, 0, null, null, null, 0, 1991, null)}), false, new CommonRewardModel(0, null, "322", null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262139, null), 111, CollectionsKt__CollectionsKt.emptyList(), null, false, CollectionsKt__CollectionsJVMKt.listOf(new CommonTutorialTextsWithImage(null, null, new AnnotatedString(str4, null, null, 6, null), null, null, null, 59, null)), StringResources_androidKt.stringResource(R.string.holiday_events_players_in_queue, new Object[]{282}, composerStartRestartGroup, 70), false, false, false, false, false, false, true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function2<Integer, Bitmap, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.6
                public final void invoke(int i6, @Nullable Bitmap bitmap) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Bitmap bitmap) {
                    invoke(num.intValue(), bitmap);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.9
                public final void invoke(boolean z) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                    invoke2(str5);
                    return Unit.INSTANCE;
                }
            }, new Function1<HolidayEventsGameItemModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.12
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HolidayEventsGameItemModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HolidayEventsGameItemModel holidayEventsGameItemModel) {
                    invoke2(holidayEventsGameItemModel);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.13
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.14
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CommonButtonCategory, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.15
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonButtonCategory it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory) {
                    invoke2(commonButtonCategory);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.16
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.17
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Byte, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.18
                public final void invoke(byte b) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
                    invoke(b.byteValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.19
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonTaskModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel7) {
                    invoke2(commonTaskModel7);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.20
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.21
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.22
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CommonRatingModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.23
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonRatingModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonRatingModel commonRatingModel) {
                    invoke2(commonRatingModel);
                    return Unit.INSTANCE;
                }
            }, composer2, 953970102, 12807734, 14377008, 924323248, 920347190, 920350134, 920350134, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsContentKt.HolidayEventsContentPreview.24
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i6) {
                    HolidayEventsContentKt.HolidayEventsContentPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
