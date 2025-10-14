package com.blackhub.bronline.game.gui.holidayevents;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.font.FontFamilyKt;
import androidx.compose.p003ui.text.font.FontKt;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.OtherExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FormatUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.BaseModel;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTasksServerModel;
import com.blackhub.bronline.game.gui.Useful;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.data.TimerDaysAndHours;
import com.blackhub.bronline.game.gui.holidayevents.enums.HolidayEventsScreenEnum;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGainBlockData;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsGameItemModel;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsRatingServerModel;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsResponse;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsEventLevel;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsLimitUpgrades;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsMiniGames;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsProperties;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsRatingRewards;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsSettings;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsTasks;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsTutorial;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: HolidayEventsViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0006\u0010\u001f\u001a\u00020\u001cH\u0002JM\u0010 \u001a\u0004\u0018\u00010\u00152\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020\u001c2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010%J:\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00172\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0017J\u0006\u00102\u001a\u00020'J\u000e\u00103\u001a\u00020'2\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u00020'J\u0006\u00107\u001a\u00020'J\u0006\u00108\u001a\u00020'J\u000e\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020'J\u0010\u0010=\u001a\u00020'2\b\b\u0002\u0010>\u001a\u00020\u001aJ\u0006\u0010?\u001a\u00020'J\u0006\u0010@\u001a\u00020'J\u0006\u0010A\u001a\u00020'J\u0006\u0010B\u001a\u00020'J\u000e\u0010C\u001a\u00020'2\u0006\u0010D\u001a\u00020\u001aJ\u000e\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020GJ\u0018\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020\u001c2\b\u0010J\u001a\u0004\u0018\u00010\u0015J\u0006\u0010K\u001a\u00020'J\u0006\u0010L\u001a\u00020'J\u0006\u0010M\u001a\u00020'J\u000e\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020'J\u0006\u0010R\u001a\u00020'J\u000e\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020'2\u0006\u0010W\u001a\u00020\u0018JJ\u0010X\u001a\u00020Y2\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u00172\b\b\u0002\u0010\\\u001a\u00020\u001c2\b\b\u0002\u0010]\u001a\u00020\u001c2\b\b\u0002\u0010^\u001a\u00020\u001c2\b\b\u0002\u0010_\u001a\u00020\u001a2\b\b\u0002\u0010`\u001a\u00020\u001aH\u0002J\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020G0\u00172\f\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u0017H\u0002J\u000e\u0010d\u001a\u00020'2\u0006\u0010(\u001a\u00020)R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsActionsWithJSON;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "application", "Landroid/app/Application;", "(Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsActionsWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Landroid/app/Application;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCategoryImage", "Landroid/graphics/Bitmap;", "objectImages", "", "", "isSpecial", "", "getMaxProgressOfProgressBar", "", "eventLevels", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsEventLevel;", "nextRewardLevel", "getTreeImage", "objectGrades", "rewardLevel", "oldRewardLevel", "treeImage", "(Ljava/util/List;ILjava/lang/Integer;Ljava/util/List;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "initJson", "", "jsonObject", "Lorg/json/JSONObject;", "holidayEventsJson", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;", "awardsJson", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsResponse;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "onButtonBpOfferClick", "onButtonChooseScreenClick", "button", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "onButtonGainLvlUp", "onBuyDarkEnergyClick", "onCancelGameSearch", "onCategoryTaskClick", "categoryId", "", "onClickGoToPurchaseBc", "onClickPlusButton", "isNeedToShowLastChance", "onCloseClick", "onCloseDialogBuyCurrency", "onCloseDialogNotEnoughBc", "onCloseTutorialClick", "onExpandButtonClick", "isTopClicked", "onGameClick", "gameItem", "Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGameItemModel;", "onItemClick", FirebaseAnalytics.Param.INDEX, "bitmap", "onLastChanceClick", "onPlayClick", "onPreviewDialogButtonClick", "onRatingItemClick", "item", "Lcom/blackhub/bronline/game/core/utils/attachment/rating/CommonRatingModel;", "onRefreshRatingClick", "onShowTutorialClick", "onTaskClick", "task", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "onTextEnteredInBuyDialog", "textValue", "parseGainBlockDataFromJSON", "Lcom/blackhub/bronline/game/gui/holidayevents/model/HolidayEventsGainBlockData;", "limitUpgrades", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsLimitUpgrades;", "currentGainLevel", "bpLimit", "bpMultiplier", "isWithPremium", "isUpdate", "parseListOfGames", "miniGames", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsMiniGames;", "updateJson", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1302:1\n230#2,5:1303\n230#2,5:1308\n230#2,5:1313\n230#2,5:1318\n230#2,5:1324\n230#2,5:1329\n230#2,5:1334\n230#2,5:1339\n230#2,5:1344\n1#3:1323\n1549#4:1349\n1620#4,3:1350\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel\n*L\n824#1:1303,5\n934#1:1308,5\n957#1:1313,5\n989#1:1318,5\n1040#1:1324,5\n1078#1:1329,5\n1106#1:1334,5\n1114#1:1339,5\n1128#1:1344,5\n1144#1:1349\n1144#1:1350,3\n*E\n"})
/* loaded from: classes3.dex */
public final class HolidayEventsViewModel extends BaseViewModel<HolidayEventsUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<HolidayEventsUiState> _uiState;

    @NotNull
    public final HolidayEventsActionsWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<HolidayEventsUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public HolidayEventsViewModel(@NotNull HolidayEventsActionsWithJSON actionWithJSON, @NotNull StringResource stringResource, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new HolidayEventsUiState(null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1073741823, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<HolidayEventsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<HolidayEventsUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$initJson$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m7122l = {376, 377, 378}, m7123m = "invokeSuspend", m7124n = {"currentScreenEnum", "properties", "seasonTimer", "seasonName", "backgroundBitmap", "lastChanceImage", "seasonIcon", "bpOfferImage", "offerImage", "seasonCurrencyBitmap", "gainBitmapImage", "rewardsBitmapImage", "treeImage", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "myRatingBgImage", "deferredListOfButtons", "rewardsList", "holidayEventsGainBlockData", "listOfGames", "deferredTutorialAttachment", "seasonTimerHeader", "rewardLevel", "gainLevel", "currentProgressOfProgressBar", "dailyCurrencyValue", "bcValue", "isWithPremium", "isNeedToShowLastChance", "seasonColor", "seasonColor2", "shadowColorForEventIcon", "offerCost", "offerValue", "maxProgressOfProgressBar", "buttonPlayText", "currentScreenEnum", "properties", "seasonTimer", "seasonName", "backgroundBitmap", "lastChanceImage", "seasonIcon", "bpOfferImage", "offerImage", "seasonCurrencyBitmap", "gainBitmapImage", "rewardsBitmapImage", "treeImage", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "myRatingBgImage", "rewardsList", "holidayEventsGainBlockData", "listOfGames", "deferredTutorialAttachment", "seasonTimerHeader", "rewardLevel", "gainLevel", "currentProgressOfProgressBar", "dailyCurrencyValue", "bcValue", "isWithPremium", "isNeedToShowLastChance", "seasonColor", "seasonColor2", "shadowColorForEventIcon", "offerCost", "offerValue", "maxProgressOfProgressBar", "buttonPlayText", "currentScreenEnum", "properties", "seasonTimer", "seasonName", "backgroundBitmap", "lastChanceImage", "seasonIcon", "bpOfferImage", "offerImage", "seasonCurrencyBitmap", "gainBitmapImage", "rewardsBitmapImage", "treeImage", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "myRatingBgImage", "rewardsList", "holidayEventsGainBlockData", "listOfGames", "seasonTimerHeader", "listOfButtons", "rewardLevel", "gainLevel", "currentProgressOfProgressBar", "dailyCurrencyValue", "bcValue", "isWithPremium", "isNeedToShowLastChance", "seasonColor", "seasonColor2", "shadowColorForEventIcon", "offerCost", "offerValue", "maxProgressOfProgressBar", "buttonPlayText"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "L$21", "I$0", "I$1", "I$2", "I$3", "I$4", "Z$0", "Z$1", "J$0", "J$1", "J$2", "I$5", "I$6", "I$7", "I$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "Z$0", "Z$1", "J$0", "J$1", "J$2", "I$5", "I$6", "I$7", "I$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "L$16", "L$17", "L$18", "L$19", "L$20", "I$0", "I$1", "I$2", "I$3", "I$4", "Z$0", "Z$1", "J$0", "J$1", "J$2", "I$5", "I$6", "I$7", "I$8"})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$initJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1#2:1303\n1559#3:1304\n1590#3,4:1305\n1549#3:1309\n1620#3,3:1310\n1549#3:1313\n1620#3,3:1314\n230#4,5:1317\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$initJson$1\n*L\n234#1:1304\n234#1:1305,4\n290#1:1309\n290#1:1310,3\n359#1:1313\n359#1:1314,3\n379#1:1317,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$initJson$1 */
    /* loaded from: classes2.dex */
    public static final class C41331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ BpRewardsResponse $awardsJson;
        public final /* synthetic */ HolidayEventsResponse $holidayEventsJson;
        public final /* synthetic */ JSONObject $jsonObject;
        public final /* synthetic */ List<SkinsDTO> $skinsList;
        public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public int I$8;
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$18;
        public Object L$19;
        public Object L$2;
        public Object L$20;
        public Object L$21;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public final /* synthetic */ HolidayEventsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41331(JSONObject jSONObject, HolidayEventsResponse holidayEventsResponse, HolidayEventsViewModel holidayEventsViewModel, BpRewardsResponse bpRewardsResponse, List<VehiclesDTO> list, List<SkinsDTO> list2, Continuation<? super C41331> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.$holidayEventsJson = holidayEventsResponse;
            this.this$0 = holidayEventsViewModel;
            this.$awardsJson = bpRewardsResponse;
            this.$vehiclesList = list;
            this.$skinsList = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41331(this.$jsonObject, this.$holidayEventsJson, this.this$0, this.$awardsJson, this.$vehiclesList, this.$skinsList, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0976 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0977  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0ac8 A[LOOP:0: B:86:0x09bd->B:90:0x0ac8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0ac5 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v138, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v42, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v91, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HolidayEventsProperties holidayEventsProperties;
            Ref.ObjectRef objectRef;
            Object next;
            Ref.ObjectRef objectRef2;
            Object next2;
            String str;
            String str2;
            Ref.ObjectRef objectRef3;
            boolean z;
            Object obj2;
            int i;
            int i2;
            long j;
            String str3;
            ArrayList arrayList;
            Collection collection;
            Ref.ObjectRef objectRef4;
            int i3;
            int i4;
            HolidayEventsGainBlockData holidayEventsGainBlockData;
            List list;
            int i5;
            Collection collection2;
            long j2;
            long j3;
            int i6;
            int i7;
            int i8;
            HolidayEventsScreenEnum holidayEventsScreenEnum;
            boolean z2;
            int i9;
            Ref.ObjectRef objectRef5;
            Ref.ObjectRef objectRef6;
            Ref.ObjectRef objectRef7;
            Ref.ObjectRef objectRef8;
            Ref.ObjectRef objectRef9;
            Ref.ObjectRef objectRef10;
            Ref.ObjectRef objectRef11;
            Ref.ObjectRef objectRef12;
            CommonRewardState commonRewardState;
            Object objAwaitAll;
            Object obj3;
            int i10;
            int i11;
            Ref.ObjectRef objectRef13;
            Ref.ObjectRef objectRef14;
            Ref.ObjectRef objectRef15;
            ArrayList arrayList2;
            HolidayEventsGainBlockData holidayEventsGainBlockData2;
            List list2;
            Collection collection3;
            String str4;
            int i12;
            int i13;
            int i14;
            int i15;
            boolean z3;
            HolidayEventsScreenEnum holidayEventsScreenEnum2;
            boolean z4;
            long j4;
            long j5;
            long j6;
            int i16;
            int i17;
            int i18;
            Object objAwaitAll2;
            Object obj4;
            List list3;
            int i19;
            String str5;
            HolidayEventsProperties holidayEventsProperties2;
            String str6;
            ArrayList arrayList3;
            HolidayEventsGainBlockData holidayEventsGainBlockData3;
            List list4;
            String str7;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            boolean z5;
            HolidayEventsScreenEnum holidayEventsScreenEnum3;
            boolean z6;
            long j7;
            long j8;
            long j9;
            int i25;
            int i26;
            int i27;
            Ref.ObjectRef objectRef16;
            Ref.ObjectRef objectRef17;
            Ref.ObjectRef objectRef18;
            Ref.ObjectRef objectRef19;
            Ref.ObjectRef objectRef20;
            Ref.ObjectRef objectRef21;
            Ref.ObjectRef objectRef22;
            Ref.ObjectRef objectRef23;
            Ref.ObjectRef objectRef24;
            Ref.ObjectRef objectRef25;
            Ref.ObjectRef objectRef26;
            List list5;
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow;
            HolidayEventsResponse holidayEventsResponse;
            HolidayEventsUiState value;
            HolidayEventsUiState holidayEventsUiStateM14505copyf2njTl4$default;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i28 = this.label;
            if (i28 == 0) {
                ResultKt.throwOnFailure(obj);
                int iOptInt = this.$jsonObject.optInt("d");
                int i29 = iOptInt + 1;
                int iOptInt2 = this.$jsonObject.optInt("a");
                int iOptInt3 = this.$jsonObject.optInt(HolidayEventsKeys.PROGRESS_VALUE_KEY);
                int iOptInt4 = this.$jsonObject.optInt("lc");
                int iOptInt5 = this.$jsonObject.optInt("bc");
                boolean zIsOne = IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt("p")));
                HolidayEventsScreenEnum holidayEventsScreenEnumFromInt = HolidayEventsScreenEnum.INSTANCE.fromInt(this.$jsonObject.optInt("l", HolidayEventsScreenEnum.MAIN.getValue()));
                boolean zIsOne2 = IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt(HolidayEventsKeys.IS_NEED_TO_SHOW_NOTIFICATION_ON_TASKS)));
                boolean zIsOne3 = IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt("la")));
                holidayEventsProperties = (HolidayEventsProperties) CollectionsKt___CollectionsKt.firstOrNull((List) this.$holidayEventsJson.getProperties());
                if (holidayEventsProperties == null) {
                    holidayEventsProperties = new HolidayEventsProperties(0, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, 0, 0, 65535, null);
                }
                TimerDaysAndHours timerDaysAndHoursConvertToDaysAndHours = FormatUtilsKt.convertToDaysAndHours(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.lastOrNull((List) holidayEventsProperties.getDates())));
                String string = this.this$0.getStringResource().getString(R.string.common_timer_title_2, Boxing.boxInt(timerDaysAndHoursConvertToDaysAndHours.getDays()), Boxing.boxInt(timerDaysAndHoursConvertToDaysAndHours.getHours()));
                long jColor = ColorKt.Color(Color.parseColor(holidayEventsProperties.getColor()));
                long jColor2 = ColorKt.Color(Color.parseColor(holidayEventsProperties.getColor2()));
                String name = holidayEventsProperties.getName();
                Ref.ObjectRef objectRef27 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef28 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef29 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef30 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef31 = new Ref.ObjectRef();
                int eventCurrencyId = holidayEventsProperties.getEventCurrencyId();
                objectRef = new Ref.ObjectRef();
                Iterator it = this.$awardsJson.getListOfAwardsTypes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Iterator it2 = it;
                    if (((BpRewardsAwardsDto) next).getId() == eventCurrencyId) {
                        break;
                    }
                    it = it2;
                }
                Ref.ObjectRef objectRef32 = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                HolidayEventsViewModel holidayEventsViewModel = this.this$0;
                Deferred deferredAsyncOnIO$default = ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$1(objectRef28, holidayEventsViewModel, holidayEventsProperties, null), 1, null);
                HolidayEventsViewModel holidayEventsViewModel2 = this.this$0;
                Deferred deferredAsyncOnIO$default2 = ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel2, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$2(objectRef27, holidayEventsViewModel2, holidayEventsProperties, null), 1, null);
                HolidayEventsViewModel holidayEventsViewModel3 = this.this$0;
                Deferred deferredAsyncOnIO$default3 = ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel3, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$3(objectRef29, holidayEventsViewModel3, holidayEventsProperties, null), 1, null);
                HolidayEventsViewModel holidayEventsViewModel4 = this.this$0;
                Deferred deferredAsyncOnIO$default4 = ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel4, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$4(objectRef30, holidayEventsViewModel4, holidayEventsProperties, null), 1, null);
                HolidayEventsViewModel holidayEventsViewModel5 = this.this$0;
                Deferred deferredAsyncOnIO$default5 = ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel5, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$5(objectRef31, holidayEventsViewModel5, holidayEventsProperties, null), 1, null);
                HolidayEventsViewModel holidayEventsViewModel6 = this.this$0;
                Deferred deferredAsyncOnIO$default6 = ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel6, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$6(objectRef, holidayEventsViewModel6, (BpRewardsAwardsDto) next, null), 1, null);
                HolidayEventsViewModel holidayEventsViewModel7 = this.this$0;
                Deferred deferredAsyncOnIO$default7 = ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel7, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$7(objectRef32, holidayEventsViewModel7, null), 1, null);
                HolidayEventsViewModel holidayEventsViewModel8 = this.this$0;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{deferredAsyncOnIO$default, deferredAsyncOnIO$default2, deferredAsyncOnIO$default3, deferredAsyncOnIO$default4, deferredAsyncOnIO$default5, deferredAsyncOnIO$default6, deferredAsyncOnIO$default7, ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel8, null, new HolidayEventsViewModel$initJson$1$deferredTasksForImages$8(objectRef2, holidayEventsViewModel8, null), 1, null)});
                int offerCost = holidayEventsProperties.getOfferCost();
                int offerValue = holidayEventsProperties.getOfferValue();
                Ref.ObjectRef objectRef33 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef34 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef35 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef36 = new Ref.ObjectRef();
                List<HolidayEventsSettings> settings = this.$holidayEventsJson.getSettings();
                HolidayEventsViewModel holidayEventsViewModel9 = this.this$0;
                Collection arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(settings, 10));
                Iterator it3 = settings.iterator();
                int i30 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    int i31 = i30 + 1;
                    if (i30 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    arrayList4.add(ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel9, null, new HolidayEventsViewModel$initJson$1$deferredListOfButtons$1$1((HolidayEventsSettings) next3, objectRef33, holidayEventsViewModel9, iOptInt, objectRef34, objectRef35, new Ref.BooleanRef(), zIsOne2, objectRef36, i30, null), 1, null));
                    it3 = it3;
                    i30 = i31;
                }
                boolean zIsOne4 = IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt("ln")));
                List<HolidayEventsEventLevel> eventLevels = this.$holidayEventsJson.getEventLevels();
                HolidayEventsViewModel holidayEventsViewModel10 = this.this$0;
                BpRewardsResponse bpRewardsResponse = this.$awardsJson;
                List<VehiclesDTO> list6 = this.$vehiclesList;
                List<SkinsDTO> list7 = this.$skinsList;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(eventLevels, 10));
                Iterator it4 = eventLevels.iterator();
                while (it4.hasNext()) {
                    HolidayEventsEventLevel holidayEventsEventLevel = (HolidayEventsEventLevel) it4.next();
                    if (iOptInt < holidayEventsEventLevel.getId()) {
                        commonRewardState = CommonRewardState.NORM_NOT_RECEIVED;
                    } else if (iOptInt == holidayEventsEventLevel.getId() && zIsOne4) {
                        commonRewardState = CommonRewardState.NORM_AVAILABLE;
                    } else {
                        commonRewardState = CommonRewardState.NORM_RECEIVED;
                    }
                    CommonRewardState commonRewardState2 = commonRewardState;
                    int id = holidayEventsEventLevel.getId();
                    boolean z7 = zIsOne4;
                    Iterator it5 = it4;
                    String str8 = (String) UtilsKt.buildTypeMerge(holidayEventsEventLevel.getName(), holidayEventsEventLevel.getNameStore());
                    String str9 = str8 == null ? "" : str8;
                    String str10 = (String) UtilsKt.buildTypeMerge(holidayEventsEventLevel.getDescription(), holidayEventsEventLevel.getDescriptionStore());
                    String str11 = str10 == null ? "" : str10;
                    String string2 = holidayEventsViewModel10.getStringResource().getString(R.string.common_get);
                    int typeId = holidayEventsEventLevel.getTypeId();
                    String imageName = holidayEventsEventLevel.getImageName();
                    boolean zIsOne5 = IntExtensionKt.isOne(holidayEventsEventLevel.getTypeReward());
                    CommonRarityEnum commonRarityEnumFromInt = CommonRarityEnum.INSTANCE.fromInt(holidayEventsEventLevel.getRarity());
                    int id2 = holidayEventsEventLevel.getId();
                    int typeId2 = holidayEventsEventLevel.getTypeId();
                    int internalId = holidayEventsEventLevel.getInternalId();
                    String imageName2 = holidayEventsEventLevel.getImageName();
                    arrayList5.add(new CommonRewardModel(id, str9, str11, string2, null, typeId, 0, imageName, zIsOne5, false, 0, commonRewardState2, null, false, true, commonRarityEnumFromInt, 0, UtilsKt.setImageModel(new BaseModel(id2, typeId2, internalId, imageName2 == null ? "" : imageName2, holidayEventsEventLevel.getName(), holidayEventsEventLevel.getNameStore()), list6, list7, bpRewardsResponse.getListOfAwardsTypes()), 71248, null));
                    zIsOne4 = z7;
                    it4 = it5;
                }
                int maxProgressOfProgressBar = this.this$0.getMaxProgressOfProgressBar(this.$holidayEventsJson.getEventLevels(), i29);
                HolidayEventsGainBlockData gainBlockDataFromJSON$default = HolidayEventsViewModel.parseGainBlockDataFromJSON$default(this.this$0, this.$holidayEventsJson.getLimitUpgrades(), iOptInt2, holidayEventsProperties.getBpLimit(), holidayEventsProperties.getBpMultiplier(), zIsOne, false, 32, null);
                List listOfGames = this.this$0.parseListOfGames(this.$holidayEventsJson.getMiniGames());
                Iterator it6 = listOfGames.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    if (((HolidayEventsGameItemModel) next2).isSelected()) {
                        break;
                    }
                }
                HolidayEventsGameItemModel holidayEventsGameItemModel = (HolidayEventsGameItemModel) next2;
                int i32 = (holidayEventsGameItemModel == null || !holidayEventsGameItemModel.isPlayable()) ? R.string.common_track : R.string.common_play;
                List<HolidayEventsTutorial> tutorial = this.$holidayEventsJson.getTutorial();
                HolidayEventsViewModel holidayEventsViewModel11 = this.this$0;
                Collection arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(tutorial, 10));
                Iterator it7 = tutorial.iterator();
                while (it7.hasNext()) {
                    arrayList6.add(ViewModelExtensionKt.asyncOnIO$default(holidayEventsViewModel11, null, new HolidayEventsViewModel$initJson$1$deferredTutorialAttachment$1$1(holidayEventsViewModel11, (HolidayEventsTutorial) it7.next(), null), 1, null));
                    it7 = it7;
                    i32 = i32;
                }
                int i33 = i32;
                String string3 = this.this$0.getStringResource().getString(R.string.common_timer_title_1);
                this.L$0 = holidayEventsScreenEnumFromInt;
                this.L$1 = holidayEventsProperties;
                str = string;
                this.L$2 = str;
                str2 = name;
                this.L$3 = str2;
                this.L$4 = objectRef27;
                this.L$5 = objectRef28;
                this.L$6 = objectRef29;
                this.L$7 = objectRef30;
                this.L$8 = objectRef31;
                this.L$9 = objectRef;
                objectRef3 = objectRef32;
                this.L$10 = objectRef3;
                this.L$11 = objectRef2;
                this.L$12 = objectRef33;
                this.L$13 = objectRef34;
                this.L$14 = objectRef35;
                this.L$15 = objectRef36;
                this.L$16 = arrayList4;
                this.L$17 = arrayList5;
                this.L$18 = gainBlockDataFromJSON$default;
                this.L$19 = listOfGames;
                this.L$20 = arrayList6;
                this.L$21 = string3;
                this.I$0 = iOptInt;
                this.I$1 = iOptInt2;
                this.I$2 = iOptInt3;
                this.I$3 = iOptInt4;
                this.I$4 = iOptInt5;
                this.Z$0 = zIsOne;
                this.Z$1 = zIsOne3;
                this.J$0 = jColor;
                this.J$1 = jColor2;
                this.J$2 = jColor;
                this.I$5 = offerCost;
                this.I$6 = offerValue;
                this.I$7 = maxProgressOfProgressBar;
                this.I$8 = i33;
                this.label = 1;
                if (AwaitKt.awaitAll(listListOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = zIsOne3;
                obj2 = coroutine_suspended;
                i = offerValue;
                i2 = maxProgressOfProgressBar;
                j = jColor2;
                str3 = string3;
                arrayList = arrayList5;
                collection = arrayList6;
                objectRef4 = objectRef33;
                i3 = i33;
                i4 = iOptInt;
                holidayEventsGainBlockData = gainBlockDataFromJSON$default;
                list = listOfGames;
                i5 = offerCost;
                collection2 = arrayList4;
                j2 = jColor;
                j3 = j2;
                i6 = iOptInt5;
                i7 = iOptInt4;
                i8 = iOptInt3;
                holidayEventsScreenEnum = holidayEventsScreenEnumFromInt;
                z2 = zIsOne;
                i9 = iOptInt2;
                objectRef5 = objectRef28;
                objectRef6 = objectRef36;
                objectRef7 = objectRef27;
                objectRef8 = objectRef29;
                objectRef9 = objectRef30;
                objectRef10 = objectRef31;
                objectRef11 = objectRef35;
                objectRef12 = objectRef34;
            } else if (i28 == 1) {
                int i34 = this.I$8;
                int i35 = this.I$7;
                int i36 = this.I$6;
                int i37 = this.I$5;
                long j10 = this.J$2;
                long j11 = this.J$1;
                long j12 = this.J$0;
                boolean z8 = this.Z$1;
                boolean z9 = this.Z$0;
                int i38 = this.I$4;
                int i39 = this.I$3;
                int i40 = this.I$2;
                int i41 = this.I$1;
                int i42 = this.I$0;
                String str12 = (String) this.L$21;
                Collection collection4 = (List) this.L$20;
                List list8 = (List) this.L$19;
                HolidayEventsGainBlockData holidayEventsGainBlockData4 = (HolidayEventsGainBlockData) this.L$18;
                ?? r1 = (List) this.L$17;
                Collection collection5 = (List) this.L$16;
                Ref.ObjectRef objectRef37 = (Ref.ObjectRef) this.L$15;
                Ref.ObjectRef objectRef38 = (Ref.ObjectRef) this.L$14;
                Ref.ObjectRef objectRef39 = (Ref.ObjectRef) this.L$13;
                Ref.ObjectRef objectRef40 = (Ref.ObjectRef) this.L$12;
                Ref.ObjectRef objectRef41 = (Ref.ObjectRef) this.L$11;
                Ref.ObjectRef objectRef42 = (Ref.ObjectRef) this.L$10;
                Ref.ObjectRef objectRef43 = (Ref.ObjectRef) this.L$9;
                Ref.ObjectRef objectRef44 = (Ref.ObjectRef) this.L$8;
                Ref.ObjectRef objectRef45 = (Ref.ObjectRef) this.L$7;
                Ref.ObjectRef objectRef46 = (Ref.ObjectRef) this.L$6;
                Ref.ObjectRef objectRef47 = (Ref.ObjectRef) this.L$5;
                Ref.ObjectRef objectRef48 = (Ref.ObjectRef) this.L$4;
                String str13 = (String) this.L$3;
                String str14 = (String) this.L$2;
                HolidayEventsProperties holidayEventsProperties3 = (HolidayEventsProperties) this.L$1;
                HolidayEventsScreenEnum holidayEventsScreenEnum4 = (HolidayEventsScreenEnum) this.L$0;
                ResultKt.throwOnFailure(obj);
                i6 = i38;
                i2 = i35;
                i = i36;
                i5 = i37;
                i7 = i39;
                j2 = j10;
                j = j11;
                j3 = j12;
                z = z8;
                z2 = z9;
                i3 = i34;
                i8 = i40;
                i9 = i41;
                i4 = i42;
                str3 = str12;
                collection = collection4;
                list = list8;
                holidayEventsGainBlockData = holidayEventsGainBlockData4;
                arrayList = r1;
                objectRef6 = objectRef37;
                objectRef11 = objectRef38;
                objectRef12 = objectRef39;
                objectRef4 = objectRef40;
                objectRef2 = objectRef41;
                objectRef3 = objectRef42;
                objectRef = objectRef43;
                objectRef10 = objectRef44;
                objectRef9 = objectRef45;
                objectRef8 = objectRef46;
                objectRef7 = objectRef48;
                str2 = str13;
                str = str14;
                holidayEventsProperties = holidayEventsProperties3;
                holidayEventsScreenEnum = holidayEventsScreenEnum4;
                obj2 = coroutine_suspended;
                collection2 = collection5;
                objectRef5 = objectRef47;
            } else if (i28 == 2) {
                int i43 = this.I$8;
                int i44 = this.I$7;
                int i45 = this.I$6;
                int i46 = this.I$5;
                long j13 = this.J$2;
                long j14 = this.J$1;
                long j15 = this.J$0;
                boolean z10 = this.Z$1;
                boolean z11 = this.Z$0;
                int i47 = this.I$4;
                int i48 = this.I$3;
                int i49 = this.I$2;
                int i50 = this.I$1;
                int i51 = this.I$0;
                String str15 = (String) this.L$20;
                collection3 = (List) this.L$19;
                List list9 = (List) this.L$18;
                HolidayEventsGainBlockData holidayEventsGainBlockData5 = (HolidayEventsGainBlockData) this.L$17;
                ?? r12 = (List) this.L$16;
                Ref.ObjectRef objectRef49 = (Ref.ObjectRef) this.L$15;
                Ref.ObjectRef objectRef50 = (Ref.ObjectRef) this.L$14;
                Ref.ObjectRef objectRef51 = (Ref.ObjectRef) this.L$13;
                Ref.ObjectRef objectRef52 = (Ref.ObjectRef) this.L$12;
                Ref.ObjectRef objectRef53 = (Ref.ObjectRef) this.L$11;
                Ref.ObjectRef objectRef54 = (Ref.ObjectRef) this.L$10;
                Ref.ObjectRef objectRef55 = (Ref.ObjectRef) this.L$9;
                Ref.ObjectRef objectRef56 = (Ref.ObjectRef) this.L$8;
                Ref.ObjectRef objectRef57 = (Ref.ObjectRef) this.L$7;
                Ref.ObjectRef objectRef58 = (Ref.ObjectRef) this.L$6;
                Ref.ObjectRef objectRef59 = (Ref.ObjectRef) this.L$5;
                Ref.ObjectRef objectRef60 = (Ref.ObjectRef) this.L$4;
                String str16 = (String) this.L$3;
                String str17 = (String) this.L$2;
                HolidayEventsProperties holidayEventsProperties4 = (HolidayEventsProperties) this.L$1;
                HolidayEventsScreenEnum holidayEventsScreenEnum5 = (HolidayEventsScreenEnum) this.L$0;
                ResultKt.throwOnFailure(obj);
                i17 = i44;
                i14 = i48;
                i10 = i45;
                i16 = i46;
                j6 = j13;
                j5 = j14;
                j4 = j15;
                z4 = z10;
                z3 = z11;
                i15 = i47;
                i18 = i43;
                i13 = i49;
                i12 = i50;
                i11 = i51;
                str4 = str15;
                list2 = list9;
                holidayEventsGainBlockData2 = holidayEventsGainBlockData5;
                arrayList2 = r12;
                objectRef15 = objectRef49;
                objectRef14 = objectRef50;
                objectRef13 = objectRef51;
                objectRef4 = objectRef52;
                objectRef2 = objectRef53;
                objectRef3 = objectRef54;
                objectRef = objectRef55;
                objectRef10 = objectRef56;
                objectRef9 = objectRef57;
                objectRef8 = objectRef58;
                objectRef7 = objectRef60;
                str2 = str16;
                str = str17;
                holidayEventsProperties = holidayEventsProperties4;
                holidayEventsScreenEnum2 = holidayEventsScreenEnum5;
                obj3 = coroutine_suspended;
                objectRef5 = objectRef59;
                objAwaitAll = obj;
                List list10 = (List) objAwaitAll;
                this.L$0 = holidayEventsScreenEnum2;
                this.L$1 = holidayEventsProperties;
                this.L$2 = str;
                this.L$3 = str2;
                this.L$4 = objectRef7;
                this.L$5 = objectRef5;
                this.L$6 = objectRef8;
                this.L$7 = objectRef9;
                this.L$8 = objectRef10;
                this.L$9 = objectRef;
                this.L$10 = objectRef3;
                this.L$11 = objectRef2;
                this.L$12 = objectRef4;
                this.L$13 = objectRef13;
                Ref.ObjectRef objectRef61 = objectRef13;
                Ref.ObjectRef objectRef62 = objectRef14;
                this.L$14 = objectRef62;
                Ref.ObjectRef objectRef63 = objectRef15;
                this.L$15 = objectRef63;
                ArrayList arrayList7 = arrayList2;
                this.L$16 = arrayList7;
                HolidayEventsGainBlockData holidayEventsGainBlockData6 = holidayEventsGainBlockData2;
                this.L$17 = holidayEventsGainBlockData6;
                List list11 = list2;
                this.L$18 = list11;
                String str18 = str4;
                this.L$19 = str18;
                this.L$20 = list10;
                int i52 = i11;
                this.I$0 = i52;
                int i53 = i12;
                this.I$1 = i53;
                int i54 = i13;
                this.I$2 = i54;
                int i55 = i14;
                this.I$3 = i55;
                int i56 = i15;
                this.I$4 = i56;
                boolean z12 = z3;
                this.Z$0 = z12;
                boolean z13 = z4;
                this.Z$1 = z13;
                HolidayEventsScreenEnum holidayEventsScreenEnum6 = holidayEventsScreenEnum2;
                long j16 = j4;
                this.J$0 = j16;
                long j17 = j5;
                this.J$1 = j17;
                long j18 = j6;
                this.J$2 = j18;
                int i57 = i16;
                this.I$5 = i57;
                int i58 = i10;
                this.I$6 = i58;
                int i59 = i17;
                this.I$7 = i59;
                int i60 = i18;
                this.I$8 = i60;
                this.label = 3;
                objAwaitAll2 = AwaitKt.awaitAll(collection3, this);
                obj4 = obj3;
                if (objAwaitAll2 != obj4) {
                    return obj4;
                }
                list3 = list10;
                i19 = i58;
                str5 = str;
                holidayEventsProperties2 = holidayEventsProperties;
                str6 = str2;
                arrayList3 = arrayList7;
                holidayEventsGainBlockData3 = holidayEventsGainBlockData6;
                list4 = list11;
                str7 = str18;
                i20 = i52;
                i21 = i53;
                i22 = i54;
                i23 = i55;
                i24 = i56;
                z5 = z12;
                holidayEventsScreenEnum3 = holidayEventsScreenEnum6;
                z6 = z13;
                j7 = j16;
                j8 = j17;
                j9 = j18;
                i25 = i57;
                i26 = i59;
                i27 = i60;
                objectRef16 = objectRef7;
                objectRef17 = objectRef9;
                objectRef18 = objectRef10;
                objectRef19 = objectRef2;
                objectRef20 = objectRef;
                objectRef21 = objectRef4;
                objectRef22 = objectRef63;
                objectRef23 = objectRef5;
                objectRef24 = objectRef8;
                objectRef25 = objectRef61;
                objectRef26 = objectRef62;
                list5 = (List) objAwaitAll2;
                mutableStateFlow = this.this$0.get_uiState();
                holidayEventsResponse = this.$holidayEventsJson;
                while (true) {
                    value = mutableStateFlow.getValue();
                    MutableStateFlow<HolidayEventsUiState> mutableStateFlow2 = mutableStateFlow;
                    Bitmap bitmap = (Bitmap) objectRef20.element;
                    List<HolidayEventsLimitUpgrades> limitUpgrades = holidayEventsResponse.getLimitUpgrades();
                    List<HolidayEventsEventLevel> eventLevels2 = holidayEventsResponse.getEventLevels();
                    List<HolidayEventsSettings> settings2 = holidayEventsResponse.getSettings();
                    Bitmap bitmap2 = (Bitmap) objectRef21.element;
                    Bitmap bitmap3 = (Bitmap) objectRef16.element;
                    Ref.ObjectRef objectRef64 = objectRef21;
                    Bitmap bitmap4 = (Bitmap) objectRef17.element;
                    Ref.ObjectRef objectRef65 = objectRef20;
                    Bitmap bitmap5 = (Bitmap) objectRef23.element;
                    Ref.ObjectRef objectRef66 = objectRef17;
                    Ref.ObjectRef objectRef67 = objectRef18;
                    HolidayEventsResponse holidayEventsResponse2 = holidayEventsResponse;
                    Ref.ObjectRef objectRef68 = objectRef22;
                    Ref.ObjectRef objectRef69 = objectRef26;
                    Ref.ObjectRef objectRef70 = objectRef25;
                    Ref.ObjectRef objectRef71 = objectRef19;
                    Ref.ObjectRef objectRef72 = objectRef3;
                    Ref.ObjectRef objectRef73 = objectRef24;
                    Ref.ObjectRef objectRef74 = objectRef23;
                    Ref.ObjectRef objectRef75 = objectRef16;
                    holidayEventsUiStateM14505copyf2njTl4$default = HolidayEventsUiState.m14505copyf2njTl4$default(value, bitmap3, bitmap4, (Bitmap) objectRef18.element, bitmap2, bitmap, bitmap5, i25, i19, i24, list4, list3, holidayEventsScreenEnum3, i27, holidayEventsResponse.getTasks(), (byte) 0, null, null, (Bitmap) objectRef25.element, (Bitmap) objectRef26.element, 0L, false, i20, i21, limitUpgrades, eventLevels2, settings2, (Bitmap) objectRef24.element, arrayList3, null, null, null, (Bitmap) objectRef19.element, (Bitmap) objectRef3.element, holidayEventsProperties2.getBpLimit(), holidayEventsProperties2.getBpMultiplier(), i23, holidayEventsGainBlockData3, null, j7, j8, j9, str6, str5, str7, i22, i26, 0, null, holidayEventsResponse.getRatingRewards(), (Bitmap) objectRef22.element, list5, null, z6, false, false, z5, false, false, false, false, false, false, 1880735744, 1063829536, null);
                    mutableStateFlow = mutableStateFlow2;
                    if (!mutableStateFlow.compareAndSet(value, holidayEventsUiStateM14505copyf2njTl4$default)) {
                    }
                    holidayEventsResponse = holidayEventsResponse2;
                    objectRef22 = objectRef68;
                    objectRef26 = objectRef69;
                    objectRef25 = objectRef70;
                    objectRef21 = objectRef64;
                    objectRef19 = objectRef71;
                    objectRef3 = objectRef72;
                    objectRef20 = objectRef65;
                    objectRef18 = objectRef67;
                    objectRef17 = objectRef66;
                    objectRef24 = objectRef73;
                    objectRef23 = objectRef74;
                    objectRef16 = objectRef75;
                }
            } else {
                if (i28 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i61 = this.I$8;
                int i62 = this.I$7;
                int i63 = this.I$6;
                int i64 = this.I$5;
                long j19 = this.J$2;
                long j20 = this.J$1;
                long j21 = this.J$0;
                boolean z14 = this.Z$1;
                boolean z15 = this.Z$0;
                int i65 = this.I$4;
                int i66 = this.I$3;
                int i67 = this.I$2;
                int i68 = this.I$1;
                int i69 = this.I$0;
                List list12 = (List) this.L$20;
                String str19 = (String) this.L$19;
                List list13 = (List) this.L$18;
                HolidayEventsGainBlockData holidayEventsGainBlockData7 = (HolidayEventsGainBlockData) this.L$17;
                ?? r13 = (List) this.L$16;
                Ref.ObjectRef objectRef76 = (Ref.ObjectRef) this.L$15;
                Ref.ObjectRef objectRef77 = (Ref.ObjectRef) this.L$14;
                Ref.ObjectRef objectRef78 = (Ref.ObjectRef) this.L$13;
                Ref.ObjectRef objectRef79 = (Ref.ObjectRef) this.L$12;
                Ref.ObjectRef objectRef80 = (Ref.ObjectRef) this.L$11;
                Ref.ObjectRef objectRef81 = (Ref.ObjectRef) this.L$10;
                Ref.ObjectRef objectRef82 = (Ref.ObjectRef) this.L$9;
                Ref.ObjectRef objectRef83 = (Ref.ObjectRef) this.L$8;
                Ref.ObjectRef objectRef84 = (Ref.ObjectRef) this.L$7;
                Ref.ObjectRef objectRef85 = (Ref.ObjectRef) this.L$6;
                Ref.ObjectRef objectRef86 = (Ref.ObjectRef) this.L$5;
                Ref.ObjectRef objectRef87 = (Ref.ObjectRef) this.L$4;
                String str20 = (String) this.L$3;
                String str21 = (String) this.L$2;
                HolidayEventsProperties holidayEventsProperties5 = (HolidayEventsProperties) this.L$1;
                HolidayEventsScreenEnum holidayEventsScreenEnum7 = (HolidayEventsScreenEnum) this.L$0;
                ResultKt.throwOnFailure(obj);
                holidayEventsScreenEnum3 = holidayEventsScreenEnum7;
                i26 = i62;
                i19 = i63;
                i25 = i64;
                j9 = j19;
                j8 = j20;
                j7 = j21;
                z6 = z14;
                z5 = z15;
                i24 = i65;
                i23 = i66;
                i22 = i67;
                i27 = i61;
                i21 = i68;
                i20 = i69;
                list3 = list12;
                str7 = str19;
                list4 = list13;
                holidayEventsGainBlockData3 = holidayEventsGainBlockData7;
                arrayList3 = r13;
                objectRef22 = objectRef76;
                objectRef26 = objectRef77;
                objectRef25 = objectRef78;
                objectRef21 = objectRef79;
                objectRef19 = objectRef80;
                objectRef3 = objectRef81;
                objectRef20 = objectRef82;
                objectRef18 = objectRef83;
                objectRef17 = objectRef84;
                objectRef24 = objectRef85;
                objectRef23 = objectRef86;
                objectRef16 = objectRef87;
                str6 = str20;
                str5 = str21;
                holidayEventsProperties2 = holidayEventsProperties5;
                objAwaitAll2 = obj;
                list5 = (List) objAwaitAll2;
                mutableStateFlow = this.this$0.get_uiState();
                holidayEventsResponse = this.$holidayEventsJson;
                while (true) {
                    value = mutableStateFlow.getValue();
                    MutableStateFlow<HolidayEventsUiState> mutableStateFlow22 = mutableStateFlow;
                    Bitmap bitmap6 = (Bitmap) objectRef20.element;
                    List<HolidayEventsLimitUpgrades> limitUpgrades2 = holidayEventsResponse.getLimitUpgrades();
                    List<HolidayEventsEventLevel> eventLevels22 = holidayEventsResponse.getEventLevels();
                    List<HolidayEventsSettings> settings22 = holidayEventsResponse.getSettings();
                    Bitmap bitmap22 = (Bitmap) objectRef21.element;
                    Bitmap bitmap32 = (Bitmap) objectRef16.element;
                    Ref.ObjectRef objectRef642 = objectRef21;
                    Bitmap bitmap42 = (Bitmap) objectRef17.element;
                    Ref.ObjectRef objectRef652 = objectRef20;
                    Bitmap bitmap52 = (Bitmap) objectRef23.element;
                    Ref.ObjectRef objectRef662 = objectRef17;
                    Ref.ObjectRef objectRef672 = objectRef18;
                    HolidayEventsResponse holidayEventsResponse22 = holidayEventsResponse;
                    Ref.ObjectRef objectRef682 = objectRef22;
                    Ref.ObjectRef objectRef692 = objectRef26;
                    Ref.ObjectRef objectRef702 = objectRef25;
                    Ref.ObjectRef objectRef712 = objectRef19;
                    Ref.ObjectRef objectRef722 = objectRef3;
                    Ref.ObjectRef objectRef732 = objectRef24;
                    Ref.ObjectRef objectRef742 = objectRef23;
                    Ref.ObjectRef objectRef752 = objectRef16;
                    holidayEventsUiStateM14505copyf2njTl4$default = HolidayEventsUiState.m14505copyf2njTl4$default(value, bitmap32, bitmap42, (Bitmap) objectRef18.element, bitmap22, bitmap6, bitmap52, i25, i19, i24, list4, list3, holidayEventsScreenEnum3, i27, holidayEventsResponse.getTasks(), (byte) 0, null, null, (Bitmap) objectRef25.element, (Bitmap) objectRef26.element, 0L, false, i20, i21, limitUpgrades2, eventLevels22, settings22, (Bitmap) objectRef24.element, arrayList3, null, null, null, (Bitmap) objectRef19.element, (Bitmap) objectRef3.element, holidayEventsProperties2.getBpLimit(), holidayEventsProperties2.getBpMultiplier(), i23, holidayEventsGainBlockData3, null, j7, j8, j9, str6, str5, str7, i22, i26, 0, null, holidayEventsResponse.getRatingRewards(), (Bitmap) objectRef22.element, list5, null, z6, false, false, z5, false, false, false, false, false, false, 1880735744, 1063829536, null);
                    mutableStateFlow = mutableStateFlow22;
                    if (!mutableStateFlow.compareAndSet(value, holidayEventsUiStateM14505copyf2njTl4$default)) {
                        return Unit.INSTANCE;
                    }
                    holidayEventsResponse = holidayEventsResponse22;
                    objectRef22 = objectRef682;
                    objectRef26 = objectRef692;
                    objectRef25 = objectRef702;
                    objectRef21 = objectRef642;
                    objectRef19 = objectRef712;
                    objectRef3 = objectRef722;
                    objectRef20 = objectRef652;
                    objectRef18 = objectRef672;
                    objectRef17 = objectRef662;
                    objectRef24 = objectRef732;
                    objectRef23 = objectRef742;
                    objectRef16 = objectRef752;
                }
            }
            this.L$0 = holidayEventsScreenEnum;
            this.L$1 = holidayEventsProperties;
            this.L$2 = str;
            this.L$3 = str2;
            this.L$4 = objectRef7;
            this.L$5 = objectRef5;
            this.L$6 = objectRef8;
            this.L$7 = objectRef9;
            this.L$8 = objectRef10;
            this.L$9 = objectRef;
            this.L$10 = objectRef3;
            this.L$11 = objectRef2;
            this.L$12 = objectRef4;
            this.L$13 = objectRef12;
            Ref.ObjectRef objectRef88 = objectRef12;
            Ref.ObjectRef objectRef89 = objectRef11;
            this.L$14 = objectRef89;
            Ref.ObjectRef objectRef90 = objectRef6;
            this.L$15 = objectRef90;
            ArrayList arrayList8 = arrayList;
            this.L$16 = arrayList8;
            HolidayEventsGainBlockData holidayEventsGainBlockData8 = holidayEventsGainBlockData;
            this.L$17 = holidayEventsGainBlockData8;
            List list14 = list;
            this.L$18 = list14;
            Collection collection6 = collection;
            this.L$19 = collection6;
            String str22 = str3;
            this.L$20 = str22;
            this.L$21 = null;
            int i70 = i4;
            this.I$0 = i70;
            int i71 = i9;
            this.I$1 = i71;
            int i72 = i8;
            this.I$2 = i72;
            int i73 = i7;
            this.I$3 = i73;
            int i74 = i6;
            this.I$4 = i74;
            boolean z16 = z2;
            this.Z$0 = z16;
            boolean z17 = z;
            this.Z$1 = z17;
            HolidayEventsScreenEnum holidayEventsScreenEnum8 = holidayEventsScreenEnum;
            long j22 = j3;
            this.J$0 = j22;
            long j23 = j;
            this.J$1 = j23;
            long j24 = j2;
            this.J$2 = j24;
            int i75 = i5;
            this.I$5 = i75;
            int i76 = i;
            this.I$6 = i76;
            int i77 = i2;
            this.I$7 = i77;
            int i78 = i3;
            this.I$8 = i78;
            this.label = 2;
            objAwaitAll = AwaitKt.awaitAll(collection2, this);
            Object obj5 = obj2;
            if (objAwaitAll == obj5) {
                return obj5;
            }
            obj3 = obj5;
            i10 = i76;
            i11 = i70;
            objectRef13 = objectRef88;
            objectRef14 = objectRef89;
            objectRef15 = objectRef90;
            arrayList2 = arrayList8;
            holidayEventsGainBlockData2 = holidayEventsGainBlockData8;
            list2 = list14;
            collection3 = collection6;
            str4 = str22;
            i12 = i71;
            i13 = i72;
            i14 = i73;
            i15 = i74;
            z3 = z16;
            holidayEventsScreenEnum2 = holidayEventsScreenEnum8;
            z4 = z17;
            j4 = j22;
            j5 = j23;
            j6 = j24;
            i16 = i75;
            i17 = i77;
            i18 = i78;
            List list102 = (List) objAwaitAll;
            this.L$0 = holidayEventsScreenEnum2;
            this.L$1 = holidayEventsProperties;
            this.L$2 = str;
            this.L$3 = str2;
            this.L$4 = objectRef7;
            this.L$5 = objectRef5;
            this.L$6 = objectRef8;
            this.L$7 = objectRef9;
            this.L$8 = objectRef10;
            this.L$9 = objectRef;
            this.L$10 = objectRef3;
            this.L$11 = objectRef2;
            this.L$12 = objectRef4;
            this.L$13 = objectRef13;
            Ref.ObjectRef objectRef612 = objectRef13;
            Ref.ObjectRef objectRef622 = objectRef14;
            this.L$14 = objectRef622;
            Ref.ObjectRef objectRef632 = objectRef15;
            this.L$15 = objectRef632;
            ArrayList arrayList72 = arrayList2;
            this.L$16 = arrayList72;
            HolidayEventsGainBlockData holidayEventsGainBlockData62 = holidayEventsGainBlockData2;
            this.L$17 = holidayEventsGainBlockData62;
            List list112 = list2;
            this.L$18 = list112;
            String str182 = str4;
            this.L$19 = str182;
            this.L$20 = list102;
            int i522 = i11;
            this.I$0 = i522;
            int i532 = i12;
            this.I$1 = i532;
            int i542 = i13;
            this.I$2 = i542;
            int i552 = i14;
            this.I$3 = i552;
            int i562 = i15;
            this.I$4 = i562;
            boolean z122 = z3;
            this.Z$0 = z122;
            boolean z132 = z4;
            this.Z$1 = z132;
            HolidayEventsScreenEnum holidayEventsScreenEnum62 = holidayEventsScreenEnum2;
            long j162 = j4;
            this.J$0 = j162;
            long j172 = j5;
            this.J$1 = j172;
            long j182 = j6;
            this.J$2 = j182;
            int i572 = i16;
            this.I$5 = i572;
            int i582 = i10;
            this.I$6 = i582;
            int i592 = i17;
            this.I$7 = i592;
            int i602 = i18;
            this.I$8 = i602;
            this.label = 3;
            objAwaitAll2 = AwaitKt.awaitAll(collection3, this);
            obj4 = obj3;
            if (objAwaitAll2 != obj4) {
            }
        }
    }

    public final void initJson(@NotNull JSONObject jsonObject, @NotNull HolidayEventsResponse holidayEventsJson, @NotNull BpRewardsResponse awardsJson, @NotNull List<SkinsDTO> skinsList, @NotNull List<VehiclesDTO> vehiclesList) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(holidayEventsJson, "holidayEventsJson");
        Intrinsics.checkNotNullParameter(awardsJson, "awardsJson");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41331(jsonObject, holidayEventsJson, this, awardsJson, vehiclesList, skinsList, null), 1, null);
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$updateJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 6 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,1302:1\n1#2:1303\n1549#3:1304\n1620#3,3:1305\n1549#3:1313\n1620#3,3:1314\n1559#3:1347\n1590#3,4:1348\n1549#3:1357\n1620#3,3:1358\n1855#3:1386\n1856#3:1394\n1747#3,3:1395\n1747#3,3:1398\n1549#3:1401\n1620#3,3:1402\n1045#3:1405\n1045#3:1406\n230#4,5:1308\n230#4,5:1317\n230#4,5:1352\n230#4,5:1407\n230#4,5:1412\n230#4,5:1417\n51#5,5:1322\n56#5,11:1336\n51#5,5:1361\n56#5,11:1375\n8#6,9:1327\n8#6,9:1366\n1099#7:1387\n928#7,6:1388\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$updateJson$1\n*L\n455#1:1304\n455#1:1305,3\n528#1:1313\n528#1:1314,3\n588#1:1347\n588#1:1348,4\n635#1:1357\n635#1:1358,3\n687#1:1386\n687#1:1394\n736#1:1395,3\n738#1:1398,3\n740#1:1401\n740#1:1402,3\n750#1:1405\n752#1:1406\n492#1:1308,5\n565#1:1317,5\n616#1:1352,5\n754#1:1407,5\n779#1:1412,5\n786#1:1417,5\n584#1:1322,5\n584#1:1336,11\n681#1:1361,5\n681#1:1375,11\n584#1:1327,9\n681#1:1366,9\n693#1:1387\n696#1:1388,6\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1 */
    /* loaded from: classes2.dex */
    public static final class C41481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;
        public final /* synthetic */ HolidayEventsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41481(JSONObject jSONObject, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super C41481> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.this$0 = holidayEventsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41481(this.$jsonObject, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:149:0x0425  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0441  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0576  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0578  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0597  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x0599  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x05d9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int currentProgressOfProgressBar;
            List<CommonRewardModel> rewardsList;
            Bitmap treeImage;
            HolidayEventsUiState value;
            Object obj2;
            CommonRewardState commonRewardState;
            int currentProgressOfProgressBar2;
            List<CommonRewardModel> rewardsList2;
            Bitmap treeImage2;
            HolidayEventsUiState value2;
            Object next;
            CommonRewardState commonRewardState2;
            HolidayEventsUiState value3;
            HolidayEventsUiState value4;
            List<CommonRewardModel> rewardsList3;
            Bitmap treeImage3;
            int currentProgressOfProgressBar3;
            List arrayList;
            Object objFromJson;
            ArrayList arrayList2;
            Iterator it;
            boolean z;
            boolean z2;
            ArrayList arrayList3;
            List listSortedWith;
            List listSortedWith2;
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow;
            HolidayEventsUiState value5;
            Object next2;
            Iterator it2;
            Object next3;
            CommonRewardState commonRewardState3;
            ArrayList arrayList4;
            Object objFromJson2;
            List list;
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow2;
            HolidayEventsUiState value6;
            Object next4;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$jsonObject.optInt("t");
            DefaultConstructorMarker defaultConstructorMarker = null;
            List listEmptyList = null;
            if (iOptInt == 1) {
                int rewardLevel = this.this$0.getUiState().getValue().getRewardLevel();
                int iOptInt2 = this.$jsonObject.optInt("d", -1);
                Integer numBoxInt = Boxing.boxInt(iOptInt2);
                if (numBoxInt.intValue() <= -1) {
                    numBoxInt = null;
                }
                int iIntValue = numBoxInt != null ? numBoxInt.intValue() : rewardLevel;
                boolean zIsOne = IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt("ln")));
                int maxProgressOfProgressBar$default = HolidayEventsViewModel.getMaxProgressOfProgressBar$default(this.this$0, null, iIntValue + 1, 1, null);
                Integer numBoxInt2 = Boxing.boxInt(this.$jsonObject.optInt(HolidayEventsKeys.PROGRESS_VALUE_KEY, -1));
                if (numBoxInt2.intValue() <= -1) {
                    numBoxInt2 = null;
                }
                if (numBoxInt2 != null) {
                    currentProgressOfProgressBar = numBoxInt2.intValue();
                } else {
                    currentProgressOfProgressBar = this.this$0.getUiState().getValue().getCurrentProgressOfProgressBar();
                }
                if (iOptInt2 > rewardLevel) {
                    List<CommonRewardModel> rewardsList4 = this.this$0.getUiState().getValue().getRewardsList();
                    rewardsList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList4, 10));
                    for (CommonRewardModel commonRewardModel : rewardsList4) {
                        if (iOptInt2 < commonRewardModel.getRewardId()) {
                            commonRewardState = CommonRewardState.NORM_NOT_RECEIVED;
                        } else if (iOptInt2 == commonRewardModel.getRewardId() && zIsOne) {
                            commonRewardState = CommonRewardState.NORM_AVAILABLE;
                        } else {
                            commonRewardState = CommonRewardState.NORM_RECEIVED;
                        }
                        rewardsList.add(commonRewardModel.copy((262127 & 1) != 0 ? commonRewardModel.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel.rewardName : null, (262127 & 4) != 0 ? commonRewardModel.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel.bottomText : null, (262127 & 16) != 0 ? commonRewardModel.image : null, (262127 & 32) != 0 ? commonRewardModel.typeId : 0, (262127 & 64) != 0 ? commonRewardModel.awardId : 0, (262127 & 128) != 0 ? commonRewardModel.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel.mainRewardState : commonRewardState, (262127 & 4096) != 0 ? commonRewardModel.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel.imageModel : null));
                    }
                } else {
                    rewardsList = this.this$0.getUiState().getValue().getRewardsList();
                }
                if (iOptInt2 > rewardLevel) {
                    Iterator<T> it3 = this.this$0.getUiState().getValue().getSettingsFromJson().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next5 = it3.next();
                        if (((HolidayEventsSettings) next5).getId() == HolidayEventsScreenEnum.MAIN.getValue()) {
                            obj2 = next5;
                            break;
                        }
                    }
                    HolidayEventsSettings holidayEventsSettings = (HolidayEventsSettings) obj2;
                    if (holidayEventsSettings == null) {
                        holidayEventsSettings = new HolidayEventsSettings(0, null, null, null, null, 31, null);
                    }
                    treeImage = this.this$0.getTreeImage(holidayEventsSettings.getObjectGrades(), iOptInt2, Boxing.boxInt(rewardLevel), holidayEventsSettings.getObjectImages(), this.this$0.getUiState().getValue().getTreeImage());
                } else {
                    treeImage = this.this$0.getUiState().getValue().getTreeImage();
                }
                MutableStateFlow<HolidayEventsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, treeImage, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, iIntValue, 0, null, null, null, null, rewardsList, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, currentProgressOfProgressBar, maxProgressOfProgressBar$default, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -136314889, 1073729535, null)));
            } else if (iOptInt == 2) {
                int iOptInt3 = this.$jsonObject.optInt("a", -1);
                if (iOptInt3 > 0) {
                    HolidayEventsGainBlockData gainBlockDataFromJSON$default = HolidayEventsViewModel.parseGainBlockDataFromJSON$default(this.this$0, null, iOptInt3, 0, 0, false, true, 29, null);
                    int rewardLevel2 = this.this$0.getUiState().getValue().getRewardLevel();
                    int iOptInt4 = this.$jsonObject.optInt("d", -1);
                    Integer numBoxInt3 = Boxing.boxInt(iOptInt4);
                    if (numBoxInt3.intValue() <= -1) {
                        numBoxInt3 = null;
                    }
                    int iIntValue2 = numBoxInt3 != null ? numBoxInt3.intValue() : rewardLevel2;
                    boolean zIsOne2 = IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt("ln")));
                    int maxProgressOfProgressBar$default2 = HolidayEventsViewModel.getMaxProgressOfProgressBar$default(this.this$0, null, iIntValue2 + 1, 1, null);
                    Integer numBoxInt4 = Boxing.boxInt(this.$jsonObject.optInt(HolidayEventsKeys.PROGRESS_VALUE_KEY, -1));
                    if (numBoxInt4.intValue() <= -1) {
                        numBoxInt4 = null;
                    }
                    if (numBoxInt4 != null) {
                        currentProgressOfProgressBar2 = numBoxInt4.intValue();
                    } else {
                        currentProgressOfProgressBar2 = this.this$0.getUiState().getValue().getCurrentProgressOfProgressBar();
                    }
                    if (iOptInt4 > rewardLevel2) {
                        List<CommonRewardModel> rewardsList5 = this.this$0.getUiState().getValue().getRewardsList();
                        rewardsList2 = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList5, 10));
                        for (CommonRewardModel commonRewardModel2 : rewardsList5) {
                            if (iOptInt4 < commonRewardModel2.getRewardId()) {
                                commonRewardState2 = CommonRewardState.NORM_NOT_RECEIVED;
                            } else if (iOptInt4 == commonRewardModel2.getRewardId() && zIsOne2) {
                                commonRewardState2 = CommonRewardState.NORM_AVAILABLE;
                            } else {
                                commonRewardState2 = CommonRewardState.NORM_RECEIVED;
                            }
                            rewardsList2.add(commonRewardModel2.copy((262127 & 1) != 0 ? commonRewardModel2.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel2.rewardName : null, (262127 & 4) != 0 ? commonRewardModel2.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel2.bottomText : null, (262127 & 16) != 0 ? commonRewardModel2.image : null, (262127 & 32) != 0 ? commonRewardModel2.typeId : 0, (262127 & 64) != 0 ? commonRewardModel2.awardId : 0, (262127 & 128) != 0 ? commonRewardModel2.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel2.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel2.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel2.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel2.mainRewardState : commonRewardState2, (262127 & 4096) != 0 ? commonRewardModel2.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel2.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel2.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel2.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel2.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel2.imageModel : null));
                        }
                    } else {
                        rewardsList2 = this.this$0.getUiState().getValue().getRewardsList();
                    }
                    List<CommonRewardModel> list2 = rewardsList2;
                    if (iOptInt4 > rewardLevel2) {
                        Iterator<T> it4 = this.this$0.getUiState().getValue().getSettingsFromJson().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                            if (((HolidayEventsSettings) next).getId() == HolidayEventsScreenEnum.MAIN.getValue()) {
                                break;
                            }
                        }
                        HolidayEventsSettings holidayEventsSettings2 = (HolidayEventsSettings) next;
                        if (holidayEventsSettings2 == null) {
                            holidayEventsSettings2 = new HolidayEventsSettings(0, null, null, null, null, 31, null);
                        }
                        treeImage2 = this.this$0.getTreeImage(holidayEventsSettings2.getObjectGrades(), iOptInt4, Boxing.boxInt(rewardLevel2), holidayEventsSettings2.getObjectImages(), this.this$0.getUiState().getValue().getTreeImage());
                    } else {
                        treeImage2 = this.this$0.getUiState().getValue().getTreeImage();
                    }
                    MutableStateFlow<HolidayEventsUiState> mutableStateFlow4 = this.this$0.get_uiState();
                    do {
                        value2 = mutableStateFlow4.getValue();
                    } while (!mutableStateFlow4.compareAndSet(value2, HolidayEventsUiState.m14505copyf2njTl4$default(value2, null, null, null, treeImage2, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, iIntValue2, iOptInt3, null, null, null, null, list2, null, null, null, null, null, 0, 0, 0, gainBlockDataFromJSON$default, null, 0L, 0L, 0L, null, null, null, currentProgressOfProgressBar2, maxProgressOfProgressBar$default2, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -140509193, 1073729519, null)));
                }
            } else if (iOptInt == 5) {
                int iOptInt5 = this.$jsonObject.optInt("b");
                if (iOptInt5 == HolidayEventsScreenEnum.RATING.getValue()) {
                    int iOptInt6 = this.$jsonObject.optInt("m");
                    JSONArray jSONArrayOptJSONArray = this.$jsonObject.optJSONArray("j");
                    if (jSONArrayOptJSONArray == null) {
                        arrayList4 = null;
                        List<HolidayEventsRatingRewards> ratingRewardsFromJson = this.this$0.getUiState().getValue().getRatingRewardsFromJson();
                        if (arrayList4 != null) {
                        }
                        if (listEmptyList == null) {
                        }
                        list = listEmptyList;
                        mutableStateFlow2 = this.this$0.get_uiState();
                        do {
                            value6 = mutableStateFlow2.getValue();
                        } while (!mutableStateFlow2.compareAndSet(value6, HolidayEventsUiState.m14505copyf2njTl4$default(value6, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, iOptInt6, list, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1073692671, null)));
                    } else {
                        try {
                            arrayList4 = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                                Intrinsics.checkNotNull(jSONObject);
                                try {
                                    Gson gson = new Gson();
                                    String string = jSONObject.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                    objFromJson2 = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) HolidayEventsRatingServerModel.class);
                                } catch (Exception e) {
                                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics.log(e.toString());
                                    firebaseCrashlytics.recordException(e);
                                    objFromJson2 = null;
                                }
                                if (objFromJson2 != null) {
                                    Boxing.boxBoolean(arrayList4.add(objFromJson2));
                                }
                            }
                        } catch (Exception e2) {
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics2.log(e2.toString());
                            firebaseCrashlytics2.recordException(e2);
                        }
                        List<HolidayEventsRatingRewards> ratingRewardsFromJson2 = this.this$0.getUiState().getValue().getRatingRewardsFromJson();
                        if (arrayList4 != null) {
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                            int i2 = 0;
                            for (Object obj3 : arrayList4) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                }
                                HolidayEventsRatingServerModel holidayEventsRatingServerModel = (HolidayEventsRatingServerModel) obj3;
                                Iterator<T> it5 = ratingRewardsFromJson2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        next4 = null;
                                        break;
                                    }
                                    next4 = it5.next();
                                    if (((HolidayEventsRatingRewards) next4).getId() == i3) {
                                        break;
                                    }
                                }
                                HolidayEventsRatingRewards holidayEventsRatingRewards = (HolidayEventsRatingRewards) next4;
                                ImageTypePathInCDNEnum actualPathByAwardId = ImageTypePathInCDNEnum.INSTANCE.getActualPathByAwardId(IntExtensionKt.getOrZero(holidayEventsRatingRewards != null ? Boxing.boxInt(holidayEventsRatingRewards.getTypeId()) : null), IntExtensionKt.getOrZero(holidayEventsRatingRewards != null ? Boxing.boxInt(holidayEventsRatingRewards.getInternalId()) : null));
                                String str = (String) UtilsKt.buildTypeMerge(holidayEventsRatingRewards != null ? holidayEventsRatingRewards.getName() : null, holidayEventsRatingRewards != null ? holidayEventsRatingRewards.getNameStore() : null);
                                String str2 = str == null ? "" : str;
                                String imageName = holidayEventsRatingRewards != null ? holidayEventsRatingRewards.getImageName() : null;
                                arrayList5.add(new CommonRatingModel(holidayEventsRatingServerModel.getNickname(), holidayEventsRatingServerModel.getPoints(), i3, new ImageModel(i3, null, imageName == null ? "" : imageName, str2, actualPathByAwardId), null, 16, null));
                                i2 = i3;
                            }
                            listEmptyList = arrayList5;
                        }
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        list = listEmptyList;
                        mutableStateFlow2 = this.this$0.get_uiState();
                        do {
                            value6 = mutableStateFlow2.getValue();
                        } while (!mutableStateFlow2.compareAndSet(value6, HolidayEventsUiState.m14505copyf2njTl4$default(value6, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, iOptInt6, list, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1073692671, null)));
                    }
                } else if (iOptInt5 == HolidayEventsScreenEnum.TASKS.getValue()) {
                    int rewardLevel3 = this.this$0.getUiState().getValue().getRewardLevel();
                    int iOptInt7 = this.$jsonObject.optInt("d", -1);
                    Integer numBoxInt5 = Boxing.boxInt(iOptInt7);
                    if (numBoxInt5.intValue() <= -1) {
                        numBoxInt5 = null;
                    }
                    int iIntValue3 = numBoxInt5 != null ? numBoxInt5.intValue() : rewardLevel3;
                    int i4 = iIntValue3 + 1;
                    boolean zIsOne3 = IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt("ln")));
                    if (iOptInt7 > rewardLevel3) {
                        List<CommonRewardModel> rewardsList6 = this.this$0.getUiState().getValue().getRewardsList();
                        rewardsList3 = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList6, 10));
                        for (CommonRewardModel commonRewardModel3 : rewardsList6) {
                            if (iOptInt7 < commonRewardModel3.getRewardId()) {
                                commonRewardState3 = CommonRewardState.NORM_NOT_RECEIVED;
                            } else if (iOptInt7 == commonRewardModel3.getRewardId() && zIsOne3) {
                                commonRewardState3 = CommonRewardState.NORM_AVAILABLE;
                            } else {
                                commonRewardState3 = CommonRewardState.NORM_RECEIVED;
                            }
                            rewardsList3.add(commonRewardModel3.copy((262127 & 1) != 0 ? commonRewardModel3.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel3.rewardName : null, (262127 & 4) != 0 ? commonRewardModel3.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel3.bottomText : null, (262127 & 16) != 0 ? commonRewardModel3.image : null, (262127 & 32) != 0 ? commonRewardModel3.typeId : 0, (262127 & 64) != 0 ? commonRewardModel3.awardId : 0, (262127 & 128) != 0 ? commonRewardModel3.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel3.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel3.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel3.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel3.mainRewardState : commonRewardState3, (262127 & 4096) != 0 ? commonRewardModel3.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel3.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel3.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel3.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel3.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel3.imageModel : null));
                        }
                    } else {
                        rewardsList3 = this.this$0.getUiState().getValue().getRewardsList();
                    }
                    List<CommonRewardModel> list3 = rewardsList3;
                    if (iOptInt7 > rewardLevel3) {
                        Iterator<T> it6 = this.this$0.getUiState().getValue().getSettingsFromJson().iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it6.next();
                            if (((HolidayEventsSettings) next3).getId() == HolidayEventsScreenEnum.MAIN.getValue()) {
                                break;
                            }
                        }
                        HolidayEventsSettings holidayEventsSettings3 = (HolidayEventsSettings) next3;
                        if (holidayEventsSettings3 == null) {
                            holidayEventsSettings3 = new HolidayEventsSettings(0, null, null, null, null, 31, null);
                        }
                        treeImage3 = this.this$0.getTreeImage(holidayEventsSettings3.getObjectGrades(), iOptInt7, Boxing.boxInt(rewardLevel3), holidayEventsSettings3.getObjectImages(), this.this$0.getUiState().getValue().getTreeImage());
                    } else {
                        treeImage3 = this.this$0.getUiState().getValue().getTreeImage();
                    }
                    Bitmap bitmap = treeImage3;
                    int maxProgressOfProgressBar$default3 = HolidayEventsViewModel.getMaxProgressOfProgressBar$default(this.this$0, null, i4, 1, null);
                    Integer numBoxInt6 = Boxing.boxInt(this.$jsonObject.optInt(HolidayEventsKeys.PROGRESS_VALUE_KEY, -1));
                    if (numBoxInt6.intValue() <= -1) {
                        numBoxInt6 = null;
                    }
                    if (numBoxInt6 != null) {
                        currentProgressOfProgressBar3 = numBoxInt6.intValue();
                    } else {
                        currentProgressOfProgressBar3 = this.this$0.getUiState().getValue().getCurrentProgressOfProgressBar();
                    }
                    int i5 = currentProgressOfProgressBar3;
                    JSONArray jSONArrayOptJSONArray2 = this.$jsonObject.optJSONArray("tk");
                    if (jSONArrayOptJSONArray2 == null) {
                        arrayList = null;
                        if (arrayList == null) {
                        }
                        ArrayList arrayList6 = new ArrayList();
                        arrayList2 = new ArrayList();
                        HolidayEventsViewModel holidayEventsViewModel = this.this$0;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        if (arrayList2.isEmpty()) {
                        }
                    } else {
                        try {
                            arrayList = new ArrayList();
                            int length2 = jSONArrayOptJSONArray2.length();
                            for (int i6 = 0; i6 < length2; i6++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i6);
                                Intrinsics.checkNotNull(jSONObject2);
                                try {
                                    Gson gson2 = new Gson();
                                    String string2 = jSONObject2.toString();
                                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                    objFromJson = gson2.fromJson(StringsKt__StringsKt.trim((CharSequence) string2).toString(), (Class<Object>) CommonTasksServerModel.class);
                                } catch (Exception e3) {
                                    FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                                    firebaseCrashlytics3.log(e3.toString());
                                    firebaseCrashlytics3.recordException(e3);
                                    objFromJson = null;
                                }
                                if (objFromJson != null) {
                                    Boxing.boxBoolean(arrayList.add(objFromJson));
                                }
                            }
                        } catch (Exception e4) {
                            FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                            firebaseCrashlytics4.log(e4.toString());
                            firebaseCrashlytics4.recordException(e4);
                        }
                        if (arrayList == null) {
                            arrayList = CollectionsKt__CollectionsKt.emptyList();
                        }
                        ArrayList arrayList62 = new ArrayList();
                        arrayList2 = new ArrayList();
                        HolidayEventsViewModel holidayEventsViewModel2 = this.this$0;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            CommonTasksServerModel commonTasksServerModel = (CommonTasksServerModel) it.next();
                            Iterator<T> it7 = holidayEventsViewModel2.getUiState().getValue().getTasksFromJson().iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    next2 = defaultConstructorMarker;
                                    break;
                                }
                                next2 = it7.next();
                                if (((HolidayEventsTasks) next2).getId() == commonTasksServerModel.getId()) {
                                    break;
                                }
                            }
                            HolidayEventsTasks holidayEventsTasks = (HolidayEventsTasks) next2;
                            if (holidayEventsTasks != null) {
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, defaultConstructorMarker);
                                builder.append(holidayEventsTasks.getRequirementDescription());
                                OtherExtensionKt.appendSpace(builder);
                                it2 = it;
                                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(String.valueOf(commonTasksServerModel.getProgress()));
                                    builder.append(holidayEventsViewModel2.getStringResource().getString(R.string.common_slash));
                                    builder.append(String.valueOf(holidayEventsTasks.getCount()));
                                    Unit unit = Unit.INSTANCE;
                                    builder.pop(iPushStyle);
                                    CommonTaskModel commonTaskModel = new CommonTaskModel(IntExtensionKt.isOne(holidayEventsTasks.getNotActive()), holidayEventsTasks.getId(), holidayEventsTasks.getTypeId(), holidayEventsTasks.getDescription(), builder.toAnnotatedString(), holidayEventsTasks.getCount(), holidayEventsTasks.getAward(), null, null, CommonTaskState.INSTANCE.fromInt(commonTasksServerModel.getStatus()), commonTasksServerModel.getStatus() == CommonTaskState.TRACK_STATE.getValue() ? holidayEventsTasks.getTypeBtn() : 0, 384, null);
                                    if (IntExtensionKt.isOne(Boxing.boxInt(holidayEventsTasks.getTypeId()))) {
                                        arrayList2.add(commonTaskModel);
                                    } else {
                                        arrayList62.add(commonTaskModel);
                                    }
                                } catch (Throwable th) {
                                    builder.pop(iPushStyle);
                                    throw th;
                                }
                            } else {
                                it2 = it;
                            }
                            it = it2;
                            defaultConstructorMarker = null;
                        }
                        if (arrayList2.isEmpty()) {
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                if (((CommonTaskModel) it8.next()).getStateOfTask() == CommonTaskState.GET_STATE) {
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                            if (!arrayList62.isEmpty()) {
                            }
                        } else {
                            z = false;
                            if (!arrayList62.isEmpty()) {
                                z2 = false;
                                List<CommonButtonCategory> listOfButtons = this.this$0.getUiState().getValue().getListOfButtons();
                                arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfButtons, 10));
                                for (CommonButtonCategory commonButtonCategoryCopy$default : listOfButtons) {
                                    if (commonButtonCategoryCopy$default.getCategoryId() == HolidayEventsScreenEnum.TASKS.getValue()) {
                                        commonButtonCategoryCopy$default = CommonButtonCategory.copy$default(commonButtonCategoryCopy$default, 0, null, null, false, z || z2, null, null, 111, null);
                                    }
                                    arrayList3.add(commonButtonCategoryCopy$default);
                                }
                                listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList62, new Comparator() { // from class: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                                    }
                                });
                                listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$2
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                                    }
                                });
                                mutableStateFlow = this.this$0.get_uiState();
                                do {
                                    value5 = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.compareAndSet(value5, HolidayEventsUiState.m14505copyf2njTl4$default(value5, null, null, null, bitmap, null, null, 0, 0, 0, null, arrayList3, null, 0, null, (byte) 0, listSortedWith2, listSortedWith, null, null, 0L, false, iIntValue3, 0, null, null, null, null, list3, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, i5, maxProgressOfProgressBar$default3, 0, null, null, null, null, null, false, z, z2, false, false, false, false, false, false, false, -136414217, 1067438079, null)));
                            } else {
                                Iterator it9 = arrayList62.iterator();
                                while (it9.hasNext()) {
                                    if (((CommonTaskModel) it9.next()).getStateOfTask() == CommonTaskState.GET_STATE) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                z2 = false;
                                List<CommonButtonCategory> listOfButtons2 = this.this$0.getUiState().getValue().getListOfButtons();
                                arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfButtons2, 10));
                                while (r8.hasNext()) {
                                }
                                listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList62, new Comparator() { // from class: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$1
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                                    }
                                });
                                listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$2
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                                    }
                                });
                                mutableStateFlow = this.this$0.get_uiState();
                                do {
                                    value5 = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.compareAndSet(value5, HolidayEventsUiState.m14505copyf2njTl4$default(value5, null, null, null, bitmap, null, null, 0, 0, 0, null, arrayList3, null, 0, null, (byte) 0, listSortedWith2, listSortedWith, null, null, 0L, false, iIntValue3, 0, null, null, null, null, list3, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, i5, maxProgressOfProgressBar$default3, 0, null, null, null, null, null, false, z, z2, false, false, false, false, false, false, false, -136414217, 1067438079, null)));
                            }
                        }
                    }
                } else if (iOptInt5 == HolidayEventsScreenEnum.GAMES.getValue()) {
                    int iOptInt8 = this.$jsonObject.optInt("m", -1);
                    if (iOptInt8 > -1) {
                        String string3 = this.this$0.getStringResource().getString(R.string.holiday_events_players_in_queue, Boxing.boxInt(iOptInt8));
                        MutableStateFlow<HolidayEventsUiState> mutableStateFlow5 = this.this$0.get_uiState();
                        do {
                            value4 = mutableStateFlow5.getValue();
                        } while (!mutableStateFlow5.compareAndSet(value4, HolidayEventsUiState.m14505copyf2njTl4$default(value4, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, string3, false, false, false, false, false, true, false, false, false, false, -1, 1039663103, null)));
                    } else {
                        MutableStateFlow<HolidayEventsUiState> mutableStateFlow6 = this.this$0.get_uiState();
                        do {
                            value3 = mutableStateFlow6.getValue();
                        } while (!mutableStateFlow6.compareAndSet(value3, HolidayEventsUiState.m14505copyf2njTl4$default(value3, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1040187391, null)));
                    }
                }
            } else if (iOptInt == 6) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(IntExtensionKt.isOne(Boxing.boxInt(this.$jsonObject.optInt("s"))));
                final HolidayEventsViewModel holidayEventsViewModel3 = this.this$0;
                BooleanExtensionKt.ifTrue(boolBoxBoolean, new Function0<Unit>() { // from class: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel.updateJson.1.8
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
                        List<CommonRewardModel> rewardsList7 = holidayEventsViewModel3.getUiState().getValue().getRewardsList();
                        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList7, 10));
                        for (CommonRewardModel commonRewardModelCopy : rewardsList7) {
                            if (commonRewardModelCopy.getMainRewardState() == CommonRewardState.NORM_AVAILABLE) {
                                commonRewardModelCopy = commonRewardModelCopy.copy((262127 & 1) != 0 ? commonRewardModelCopy.rewardId : 0, (262127 & 2) != 0 ? commonRewardModelCopy.rewardName : null, (262127 & 4) != 0 ? commonRewardModelCopy.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModelCopy.bottomText : null, (262127 & 16) != 0 ? commonRewardModelCopy.image : null, (262127 & 32) != 0 ? commonRewardModelCopy.typeId : 0, (262127 & 64) != 0 ? commonRewardModelCopy.awardId : 0, (262127 & 128) != 0 ? commonRewardModelCopy.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModelCopy.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModelCopy.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModelCopy.lvl : 0, (262127 & 2048) != 0 ? commonRewardModelCopy.mainRewardState : CommonRewardState.NORM_RECEIVED, (262127 & 4096) != 0 ? commonRewardModelCopy.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModelCopy.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModelCopy.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModelCopy.rarityState : null, (262127 & 65536) != 0 ? commonRewardModelCopy.fromList : 0, (262127 & 131072) != 0 ? commonRewardModelCopy.imageModel : null);
                            }
                            arrayList7.add(commonRewardModelCopy);
                        }
                        MutableStateFlow<HolidayEventsUiState> mutableStateFlow7 = holidayEventsViewModel3.get_uiState();
                        while (true) {
                            HolidayEventsUiState value7 = mutableStateFlow7.getValue();
                            ArrayList arrayList8 = arrayList7;
                            if (mutableStateFlow7.compareAndSet(value7, HolidayEventsUiState.m14505copyf2njTl4$default(value7, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, arrayList8, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -134217729, 1073741823, null))) {
                                return;
                            } else {
                                arrayList7 = arrayList8;
                            }
                        }
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41481(jsonObject, this, null), 1, null);
    }

    public final void onRatingItemClick(@NotNull CommonRatingModel item) {
        HolidayEventsUiState value;
        Intrinsics.checkNotNullParameter(item, "item");
        ImageModel rewardImageModel = item.getRewardImageModel();
        String name = rewardImageModel != null ? rewardImageModel.getName() : null;
        if (name == null) {
            name = "";
        }
        String str = name;
        ImageModel rewardImageModel2 = item.getRewardImageModel();
        if (rewardImageModel2 == null) {
            rewardImageModel2 = new ImageModel(0, null, null, null, null, 31, null);
        }
        CommonRewardModel commonRewardModel = new CommonRewardModel(0, str, null, null, item.getImageBitmap(), 0, 0, null, false, false, 0, null, null, false, false, null, 0, rewardImageModel2, 131053, null);
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, commonRewardModel, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, true, false, false, -1, 939524063, null)));
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onCancelGameSearch$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onCancelGameSearch$1 */
    /* loaded from: classes2.dex */
    public static final class C41381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41381(Continuation<? super C41381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendPlayPressed(-1);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCancelGameSearch() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41381(null), 1, null);
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onButtonBpOfferClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onButtonBpOfferClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41341(Continuation<? super C41341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendOnButtonBpOfferClick();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onButtonBpOfferClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41341(null), 1, null);
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onBuyDarkEnergyClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onBuyDarkEnergyClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n230#2,5:1303\n230#2,5:1308\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onBuyDarkEnergyClick$1\n*L\n852#1:1303,5\n860#1:1308,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onBuyDarkEnergyClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41371(Continuation<? super C41371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HolidayEventsUiState value;
            HolidayEventsUiState value2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HolidayEventsUiState value3 = HolidayEventsViewModel.this.getUiState().getValue();
            HolidayEventsViewModel holidayEventsViewModel = HolidayEventsViewModel.this;
            HolidayEventsUiState holidayEventsUiState = value3;
            int intOrZero = StringExtensionKt.toIntOrZero(holidayEventsUiState.getEnteredTextBuyDarkEnergy());
            if (holidayEventsUiState.getOfferCost() * intOrZero <= holidayEventsUiState.getBcValue()) {
                holidayEventsViewModel.actionWithJSON.sendBuyDarkEnergy(intOrZero);
                MutableStateFlow<HolidayEventsUiState> mutableStateFlow = holidayEventsViewModel.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 805306367, null)));
            } else {
                MutableStateFlow<HolidayEventsUiState> mutableStateFlow2 = holidayEventsViewModel.get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, HolidayEventsUiState.m14505copyf2njTl4$default(value2, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, true, false, false, false, false, false, -1, 788529151, null)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onBuyDarkEnergyClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41371(null), 1, null);
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onTextEnteredInBuyDialog$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTextEnteredInBuyDialog$1\n+ 2 CharSequence.kt\nandroidx/core/text/CharSequenceKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n28#2:1303\n230#3,5:1304\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTextEnteredInBuyDialog$1\n*L\n876#1:1303\n922#1:1304,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onTextEnteredInBuyDialog$1 */
    /* loaded from: classes2.dex */
    public static final class C41471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $textValue;
        public int label;
        public final /* synthetic */ HolidayEventsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41471(String str, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super C41471> continuation) {
            super(2, continuation);
            this.$textValue = str;
            this.this$0 = holidayEventsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41471(this.$textValue, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.compose.ui.text.AnnotatedString] */
        /* JADX WARN: Type inference failed for: r3v16, types: [T, androidx.compose.ui.text.AnnotatedString] */
        /* JADX WARN: Type inference failed for: r4v16, types: [T, androidx.compose.ui.text.AnnotatedString] */
        /* JADX WARN: Type inference failed for: r6v11, types: [T, androidx.compose.ui.text.AnnotatedString] */
        /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.text.AnnotatedString] */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, androidx.compose.ui.text.AnnotatedString] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strEmpty;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            List list = null;
            objectRef.element = new AnnotatedString(AnyExtensionKt.empty(stringCompanionObject), null, list, 6, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new AnnotatedString(AnyExtensionKt.empty(stringCompanionObject), list, null, 6, null);
            if (TextUtils.isDigitsOnly(this.$textValue)) {
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.$textValue);
                if (intOrNull != null) {
                    HolidayEventsViewModel holidayEventsViewModel = this.this$0;
                    int iIntValue = intOrNull.intValue();
                    if (iIntValue > 100) {
                        Useful useful = Useful.INSTANCE;
                        objectRef.element = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_spend, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferCost() * 100))));
                        objectRef2.element = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_get, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferValue() * 100))));
                        strEmpty = "100";
                    } else if (iIntValue < 1) {
                        strEmpty = AnyExtensionKt.empty(stringCompanionObject);
                    } else {
                        Useful useful2 = Useful.INSTANCE;
                        objectRef.element = ComposeExtensionKt.toAnnotatedString(useful2.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_spend, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferCost() * iIntValue))));
                        objectRef2.element = ComposeExtensionKt.toAnnotatedString(useful2.getTextWithHtmlStyles(holidayEventsViewModel.getStringResource().getString(R.string.holiday_events_you_get, Boxing.boxInt(holidayEventsViewModel.getUiState().getValue().getOfferValue() * iIntValue))));
                        strEmpty = String.valueOf(iIntValue);
                    }
                } else {
                    strEmpty = null;
                }
                if (strEmpty == null) {
                    strEmpty = "";
                }
            } else {
                strEmpty = AnyExtensionKt.empty(stringCompanionObject);
            }
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                HolidayEventsUiState value = mutableStateFlow.getValue();
                MutableStateFlow<HolidayEventsUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, strEmpty, (AnnotatedString) objectRef.element, (AnnotatedString) objectRef2.element, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1879048193, 1073741823, null))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void onTextEnteredInBuyDialog(@NotNull String textValue) {
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41471(textValue, this, null), 1, null);
    }

    public final void onExpandButtonClick(boolean isTopClicked) {
        HolidayEventsUiState value;
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, isTopClicked, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1048577, 1073741823, null)));
    }

    public static /* synthetic */ void onClickPlusButton$default(HolidayEventsViewModel holidayEventsViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = holidayEventsViewModel.getUiState().getValue().isNeedToShowLastChance();
        }
        holidayEventsViewModel.onClickPlusButton(z);
    }

    public final void onClickPlusButton(boolean isNeedToShowLastChance) {
        Useful useful = Useful.INSTANCE;
        AnnotatedString annotatedString = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(getStringResource().getString(R.string.holiday_events_you_spend, Integer.valueOf(getUiState().getValue().getOfferCost()))));
        AnnotatedString annotatedString2 = ComposeExtensionKt.toAnnotatedString(useful.getTextWithHtmlStyles(getStringResource().getString(R.string.holiday_events_you_get, Integer.valueOf(getUiState().getValue().getOfferValue()))));
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        while (true) {
            HolidayEventsUiState value = mutableStateFlow.getValue();
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, "1", annotatedString, annotatedString2, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, isNeedToShowLastChance, false, false, false, false, false, false, false, true, false, -1879048193, 804257791, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onButtonChooseScreenClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onButtonChooseScreenClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1549#2:1303\n1620#2,3:1304\n230#3,5:1307\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onButtonChooseScreenClick$1\n*L\n971#1:1303\n971#1:1304,3\n978#1:1307,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onButtonChooseScreenClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CommonButtonCategory $button;
        public int label;
        public final /* synthetic */ HolidayEventsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41351(CommonButtonCategory commonButtonCategory, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super C41351> continuation) {
            super(2, continuation);
            this.$button = commonButtonCategory;
            this.this$0 = holidayEventsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41351(this.$button, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HolidayEventsScreenEnum holidayEventsScreenEnumFromInt = HolidayEventsScreenEnum.INSTANCE.fromInt(this.$button.getCategoryId());
            List<CommonButtonCategory> listOfButtons = this.this$0.getUiState().getValue().getListOfButtons();
            CommonButtonCategory commonButtonCategory = this.$button;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfButtons, 10));
            for (CommonButtonCategory commonButtonCategory2 : listOfButtons) {
                arrayList.add(CommonButtonCategory.copy$default(commonButtonCategory2, 0, null, null, Intrinsics.areEqual(commonButtonCategory2, commonButtonCategory), false, null, null, 119, null));
            }
            this.this$0.actionWithJSON.sendScreenPressed(this.$button.getCategoryId());
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                HolidayEventsUiState value = mutableStateFlow.getValue();
                ArrayList arrayList2 = arrayList;
                if (mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, arrayList, holidayEventsScreenEnumFromInt, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -3073, 1073741823, null))) {
                    return Unit.INSTANCE;
                }
                arrayList = arrayList2;
            }
        }
    }

    public final void onButtonChooseScreenClick(@NotNull CommonButtonCategory button) {
        Intrinsics.checkNotNullParameter(button, "button");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41351(button, this, null), 1, null);
    }

    public final void onCloseDialogBuyCurrency() {
        HolidayEventsUiState value;
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 805306367, null)));
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onCloseClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onCloseClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n230#2,5:1303\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onCloseClick$1\n*L\n999#1:1303,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onCloseClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41401(Continuation<? super C41401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HolidayEventsUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<HolidayEventsUiState> mutableStateFlow = HolidayEventsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, true, -1, 536870911, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCloseClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41401(null), 1, null);
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onGameClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onGameClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1549#2:1303\n1620#2,3:1304\n230#3,5:1307\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onGameClick$1\n*L\n1010#1:1303\n1010#1:1304,3\n1021#1:1307,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onGameClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HolidayEventsGameItemModel $gameItem;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41411(HolidayEventsGameItemModel holidayEventsGameItemModel, Continuation<? super C41411> continuation) {
            super(2, continuation);
            this.$gameItem = holidayEventsGameItemModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41411(this.$gameItem, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<HolidayEventsGameItemModel> listOfGames = HolidayEventsViewModel.this.getUiState().getValue().getListOfGames();
            HolidayEventsGameItemModel holidayEventsGameItemModel = this.$gameItem;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfGames, 10));
            for (HolidayEventsGameItemModel holidayEventsGameItemModel2 : listOfGames) {
                arrayList.add(HolidayEventsGameItemModel.copy$default(holidayEventsGameItemModel2, 0, holidayEventsGameItemModel2.getId() == holidayEventsGameItemModel.getId(), false, null, null, 29, null));
            }
            int i = this.$gameItem.isPlayable() ? R.string.common_play : R.string.common_track;
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow = HolidayEventsViewModel.this.get_uiState();
            while (true) {
                HolidayEventsUiState value = mutableStateFlow.getValue();
                ArrayList arrayList2 = arrayList;
                if (mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, arrayList, null, null, i, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -4609, 1073741823, null))) {
                    return Unit.INSTANCE;
                }
                arrayList = arrayList2;
            }
        }
    }

    public final void onGameClick(@NotNull HolidayEventsGameItemModel gameItem) {
        Intrinsics.checkNotNullParameter(gameItem, "gameItem");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C41411(gameItem, null), 1, null);
    }

    public final void onPlayClick() {
        Object next;
        Iterator<T> it = getUiState().getValue().getListOfGames().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((HolidayEventsGameItemModel) next).isSelected()) {
                    break;
                }
            }
        }
        HolidayEventsGameItemModel holidayEventsGameItemModel = (HolidayEventsGameItemModel) next;
        Integer numValueOf = holidayEventsGameItemModel != null ? Integer.valueOf(holidayEventsGameItemModel.getId()) : null;
        if (numValueOf != null) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C41431(numValueOf, null), 1, null);
        }
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onPlayClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onPlayClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Integer $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41431(Integer num, Continuation<? super C41431> continuation) {
            super(2, continuation);
            this.$id = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41431(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendPlayPressed(this.$id.intValue());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCategoryTaskClick(byte categoryId) {
        HolidayEventsUiState value;
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, categoryId, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -16385, 1073741823, null)));
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onTaskClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTaskClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n1549#2:1303\n1620#2,3:1304\n230#3,5:1307\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onTaskClick$1\n*L\n1050#1:1303\n1050#1:1304,3\n1055#1:1307,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onTaskClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CommonTaskModel $task;
        public int label;
        public final /* synthetic */ HolidayEventsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41461(CommonTaskModel commonTaskModel, HolidayEventsViewModel holidayEventsViewModel, Continuation<? super C41461> continuation) {
            super(2, continuation);
            this.$task = commonTaskModel;
            this.this$0 = holidayEventsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C41461(this.$task, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$task.getButtonType() != 5) {
                this.this$0.actionWithJSON.sendTaskPressed(this.$task.getId());
            } else {
                List<CommonButtonCategory> listOfButtons = this.this$0.getUiState().getValue().getListOfButtons();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOfButtons, 10));
                for (CommonButtonCategory commonButtonCategory : listOfButtons) {
                    arrayList.add(CommonButtonCategory.copy$default(commonButtonCategory, 0, null, null, commonButtonCategory.getCategoryId() == HolidayEventsScreenEnum.GAMES.getValue(), false, null, null, 119, null));
                }
                MutableStateFlow<HolidayEventsUiState> mutableStateFlow = this.this$0.get_uiState();
                while (true) {
                    HolidayEventsUiState value = mutableStateFlow.getValue();
                    ArrayList arrayList2 = arrayList;
                    if (mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, arrayList, HolidayEventsScreenEnum.GAMES, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -3073, 1073741823, null))) {
                        break;
                    }
                    arrayList = arrayList2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onTaskClick(@NotNull CommonTaskModel task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41461(task, this, null), 1, null);
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onRefreshRatingClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onRefreshRatingClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41451(Continuation<? super C41451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendRefreshRating();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onRefreshRatingClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41451(null), 1, null);
    }

    public final void onItemClick(int index, @Nullable Bitmap bitmap) {
        CommonRewardModel commonRewardModel;
        HolidayEventsUiState value;
        CommonRewardModel commonRewardModel2 = (CommonRewardModel) CollectionsKt___CollectionsKt.getOrNull(getUiState().getValue().getRewardsList(), index);
        if (commonRewardModel2 == null || (commonRewardModel = commonRewardModel2.copy((262127 & 1) != 0 ? commonRewardModel2.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel2.rewardName : null, (262127 & 4) != 0 ? commonRewardModel2.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel2.bottomText : null, (262127 & 16) != 0 ? commonRewardModel2.image : bitmap, (262127 & 32) != 0 ? commonRewardModel2.typeId : 0, (262127 & 64) != 0 ? commonRewardModel2.awardId : 0, (262127 & 128) != 0 ? commonRewardModel2.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel2.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel2.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel2.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel2.mainRewardState : null, (262127 & 4096) != 0 ? commonRewardModel2.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel2.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel2.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel2.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel2.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel2.imageModel : null)) == null) {
            commonRewardModel = new CommonRewardModel(0, null, null, null, null, 0, 0, null, false, false, 0, null, null, false, false, null, 0, null, 262143, null);
        }
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, commonRewardModel, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, true, false, false, -1, 939524063, null)));
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onPreviewDialogButtonClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHolidayEventsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onPreviewDialogButtonClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1302:1\n230#2,5:1303\n*S KotlinDebug\n*F\n+ 1 HolidayEventsViewModel.kt\ncom/blackhub/bronline/game/gui/holidayevents/HolidayEventsViewModel$onPreviewDialogButtonClick$1\n*L\n1091#1:1303,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onPreviewDialogButtonClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41441(Continuation<? super C41441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HolidayEventsUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (HolidayEventsViewModel.this.getUiState().getValue().getRewardItemForDialog().getMainRewardState() == CommonRewardState.NORM_AVAILABLE) {
                HolidayEventsViewModel.this.actionWithJSON.sendButtonGetPressed();
            }
            MutableStateFlow<HolidayEventsUiState> mutableStateFlow = HolidayEventsViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 939524095, null)));
            return Unit.INSTANCE;
        }
    }

    public final void onPreviewDialogButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41441(null), 1, null);
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onButtonGainLvlUp$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onButtonGainLvlUp$1 */
    /* loaded from: classes2.dex */
    public static final class C41361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41361(Continuation<? super C41361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendButtonGainLvlUpPressed();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onButtonGainLvlUp() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41361(null), 1, null);
    }

    public final void onShowTutorialClick() {
        HolidayEventsUiState value;
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, true, false, false, false, -1, 1006632959, null)));
    }

    public final void onCloseTutorialClick() {
        HolidayEventsUiState value;
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1006632959, null)));
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onClickGoToPurchaseBc$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onClickGoToPurchaseBc$1 */
    /* loaded from: classes2.dex */
    public static final class C41391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41391(Continuation<? super C41391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendGoToPurchaseBc();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickGoToPurchaseBc() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41391(null), 1, null);
    }

    public final void onCloseDialogNotEnoughBc() {
        HolidayEventsUiState value;
        MutableStateFlow<HolidayEventsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HolidayEventsUiState.m14505copyf2njTl4$default(value, null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, null, (byte) 0, null, null, null, null, 0L, false, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0L, 0L, 0L, null, null, null, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, -1, 1056964607, null)));
    }

    /* compiled from: HolidayEventsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onLastChanceClick$1", m7120f = "HolidayEventsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.holidayevents.HolidayEventsViewModel$onLastChanceClick$1 */
    /* loaded from: classes2.dex */
    public static final class C41421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41421(Continuation<? super C41421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HolidayEventsViewModel.this.new C41421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HolidayEventsViewModel.this.actionWithJSON.sendLastChanceClicked();
                HolidayEventsViewModel.this.onClickPlusButton(false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onLastChanceClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41421(null), 1, null);
    }

    public final List<HolidayEventsGameItemModel> parseListOfGames(List<HolidayEventsMiniGames> miniGames) {
        List<HolidayEventsMiniGames> list = miniGames;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (HolidayEventsMiniGames holidayEventsMiniGames : list) {
            arrayList.add(new HolidayEventsGameItemModel(holidayEventsMiniGames.getId(), holidayEventsMiniGames.getId() == 1, IntExtensionKt.isOne(holidayEventsMiniGames.getPlayable()), holidayEventsMiniGames.getName(), BitmapUtilsKt.getBitmapFromZip$default(this.application, holidayEventsMiniGames.getImageName(), ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null)));
        }
        List<HolidayEventsGameItemModel> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        while (mutableList.size() < 4) {
            mutableList.add(new HolidayEventsGameItemModel(0, false, false, null, null, 31, null));
        }
        return mutableList;
    }

    public static /* synthetic */ HolidayEventsGainBlockData parseGainBlockDataFromJSON$default(HolidayEventsViewModel holidayEventsViewModel, List list, int i, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = holidayEventsViewModel.getUiState().getValue().getLimitUpgrades();
        }
        if ((i4 & 2) != 0) {
            i = holidayEventsViewModel.getUiState().getValue().getGainLevel();
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = holidayEventsViewModel.getUiState().getValue().getBpDailyLimit();
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = holidayEventsViewModel.getUiState().getValue().getBpDailyMultiplier();
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            z = holidayEventsViewModel.getUiState().getValue().isWithPremium();
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            z2 = false;
        }
        return holidayEventsViewModel.parseGainBlockDataFromJSON(list, i5, i6, i7, z3, z2);
    }

    public final HolidayEventsGainBlockData parseGainBlockDataFromJSON(List<HolidayEventsLimitUpgrades> limitUpgrades, int currentGainLevel, int bpLimit, int bpMultiplier, boolean isWithPremium, boolean isUpdate) {
        Object next;
        Object next2;
        int orZero;
        int orZero2;
        int i = currentGainLevel + 1;
        HolidayEventsGainBlockData holidayEventsGainBlockData = getUiState().getValue().getHolidayEventsGainBlockData();
        List<HolidayEventsLimitUpgrades> list = limitUpgrades;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((HolidayEventsLimitUpgrades) next).getId() == currentGainLevel) {
                break;
            }
        }
        HolidayEventsLimitUpgrades holidayEventsLimitUpgrades = (HolidayEventsLimitUpgrades) next;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((HolidayEventsLimitUpgrades) next2).getId() == i) {
                break;
            }
        }
        HolidayEventsLimitUpgrades holidayEventsLimitUpgrades2 = (HolidayEventsLimitUpgrades) next2;
        if (isWithPremium) {
            orZero = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades != null ? Integer.valueOf(holidayEventsLimitUpgrades.getLimitEventRes()) : null) + bpLimit;
        } else {
            orZero = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades != null ? Integer.valueOf(holidayEventsLimitUpgrades.getLimitEventRes()) : null);
        }
        if (isWithPremium) {
            orZero2 = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? Integer.valueOf(holidayEventsLimitUpgrades2.getLimitEventRes()) : null) + bpLimit;
        } else {
            orZero2 = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? Integer.valueOf(holidayEventsLimitUpgrades2.getLimitEventRes()) : null);
        }
        float orZero3 = FloatExtensionKt.getOrZero(holidayEventsLimitUpgrades != null ? Float.valueOf(holidayEventsLimitUpgrades.getMultEventRes()) : null) + (isWithPremium ? bpMultiplier : 0.0f);
        float orZero4 = FloatExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? Float.valueOf(holidayEventsLimitUpgrades2.getMultEventRes()) : null);
        float f = isWithPremium ? bpMultiplier : 0.0f;
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(getStringResource().getString(R.string.holiday_events_x, Float.valueOf(orZero3)), ',', '.', false, 4, (Object) null);
        String strReplace$default2 = StringsKt__StringsJVMKt.replace$default(getStringResource().getString(R.string.holiday_events_x, Float.valueOf(orZero4 + f)), ',', '.', false, 4, (Object) null);
        String string = getStringResource().getString(R.string.common_value_of_rubles_string, UsefulKt.getPriceWithSpaces(Integer.valueOf(IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? holidayEventsLimitUpgrades2.getCostSoft() : null))));
        int orZero5 = IntExtensionKt.getOrZero(holidayEventsLimitUpgrades2 != null ? holidayEventsLimitUpgrades2.getEventResGift() : null);
        if (!isUpdate) {
            return holidayEventsGainBlockData.copy(String.valueOf(orZero), strReplace$default, String.valueOf(orZero2), strReplace$default2, string, orZero5);
        }
        return holidayEventsGainBlockData.copy(String.valueOf(orZero), strReplace$default, String.valueOf(orZero2), strReplace$default2, string, orZero5);
    }

    public final Bitmap getCategoryImage(List<String> objectImages, boolean isSpecial) {
        String str;
        if (isSpecial) {
            str = (String) CollectionsKt___CollectionsKt.lastOrNull((List) objectImages);
        } else {
            str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) objectImages);
        }
        if (str == null) {
            str = "";
        }
        return BitmapUtilsKt.getBitmapFromZip$default(this.application, str, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
    }

    public final Bitmap getTreeImage(List<Integer> objectGrades, int rewardLevel, Integer oldRewardLevel, List<String> objectImages, Bitmap treeImage) {
        int i = 1;
        int orOne = IntExtensionKt.getOrOne(objectGrades != null ? (Integer) CollectionsKt___CollectionsKt.getOrNull(objectGrades, 1) : null);
        int orOne2 = IntExtensionKt.getOrOne(objectGrades != null ? (Integer) CollectionsKt___CollectionsKt.getOrNull(objectGrades, 2) : null);
        int i2 = (orOne > rewardLevel || rewardLevel >= orOne2) ? rewardLevel >= orOne2 ? 2 : 0 : 1;
        if (oldRewardLevel == null) {
            i = -1;
        } else if (!RangesKt___RangesKt.until(orOne, orOne2).contains(oldRewardLevel.intValue())) {
            i = oldRewardLevel.intValue() >= orOne2 ? 2 : 0;
        }
        if (i2 <= i) {
            return treeImage;
        }
        String str = (String) CollectionsKt___CollectionsKt.getOrNull(objectImages, i2);
        if (str == null) {
            str = "";
        }
        return BitmapUtilsKt.getBitmapFromZip$default(this.application, str, ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int getMaxProgressOfProgressBar$default(HolidayEventsViewModel holidayEventsViewModel, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = holidayEventsViewModel.getUiState().getValue().getEventLevels();
        }
        return holidayEventsViewModel.getMaxProgressOfProgressBar(list, i);
    }

    public final int getMaxProgressOfProgressBar(List<HolidayEventsEventLevel> eventLevels, int nextRewardLevel) {
        Object next;
        Iterator<T> it = eventLevels.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((HolidayEventsEventLevel) next).getId() == nextRewardLevel) {
                break;
            }
        }
        HolidayEventsEventLevel holidayEventsEventLevel = (HolidayEventsEventLevel) next;
        if (holidayEventsEventLevel != null) {
            return holidayEventsEventLevel.getCost();
        }
        HolidayEventsEventLevel holidayEventsEventLevel2 = (HolidayEventsEventLevel) CollectionsKt___CollectionsKt.lastOrNull((List) eventLevels);
        return IntExtensionKt.getOrOne(holidayEventsEventLevel2 != null ? Integer.valueOf(holidayEventsEventLevel2.getCost()) : null);
    }
}
