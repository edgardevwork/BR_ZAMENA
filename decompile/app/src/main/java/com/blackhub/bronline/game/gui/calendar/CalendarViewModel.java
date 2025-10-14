package com.blackhub.bronline.game.gui.calendar;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.core.utils.attachment.RenderAttachment;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.gui.calendar.network.CalendarActionWithJSON;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarPropertiesDto;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarResponse;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarRewardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CalendarViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015Jl\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001bH\u0082@¢\u0006\u0002\u0010)J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200H\u0002J\u001e\u00101\u001a\u00020\u00172\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u00103\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0002JH\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001b2\u0006\u00109\u001a\u00020:J\b\u0010;\u001a\u00020\u0015H\u0014J\u0006\u0010<\u001a\u00020\u0015J\u0006\u0010=\u001a\u00020\u0015J \u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\u001f2\b\u0010A\u001a\u0004\u0018\u00010BJ\u000e\u0010C\u001a\u00020\u00152\u0006\u00105\u001a\u000206J\u0006\u0010D\u001a\u00020\u0015J\u000e\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u001fJ\u000e\u0010G\u001a\u00020\u00152\u0006\u0010H\u001a\u00020:J:\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001bH\u0002J\u000e\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020+R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006N"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/calendar/CalendarViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/calendar/CalendarUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/calendar/network/CalendarActionWithJSON;", "stringResources", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "(Lcom/blackhub/bronline/game/gui/calendar/network/CalendarActionWithJSON;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/common/LocalNotification;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "buttonClick", "", "buttonId", "", "closeAllRewards", "closeHint", "convertJsonArrayToRewards", "", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "level", "isMainRewards", "", "intArray", "rewards", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarRewardsDto;", "vehiclesList", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "skinsList", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "listOfAwardsTypes", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsAwardsDto;", "(IZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActualBottomText", "", "initBottomText", "mainRewardState", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardState;", "bonusRewardState", "Lcom/blackhub/bronline/game/gui/calendar/model/CalendarBonusRewardState;", "getLastScrollIndexAndFindLastOpenedReward", "allRewards", "getRewardPosWithTimer", "initInterface", "json", "Lorg/json/JSONObject;", "calendarInfo", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarResponse;", "savedPage", "Lcom/blackhub/bronline/game/gui/calendar/model/CalendarScreenType;", "onCleared", "onCloseClicked", "onDialogButtonClick", "onItemClick", FirebaseAnalytics.Param.INDEX, "isFromMainList", "bitmap", "Landroid/graphics/Bitmap;", "onPacketIncoming", "onShowAllRewardsClick", "onTutorialCLick", "isMainList", "selectPage", "selectedPage", "setImageModel", "Lcom/blackhub/bronline/game/core/utils/attachment/ImageModel;", "reward", "showErrorNotification", ThrowableDeserializer.PROP_NAME_MESSAGE, "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1855#2,2:900\n1855#2,2:902\n1559#2:934\n1590#2,4:935\n350#2,7:939\n350#2,7:946\n378#2,7:953\n378#2,7:960\n230#3,5:904\n230#3,5:909\n230#3,5:914\n230#3,5:919\n230#3,5:924\n230#3,5:929\n1#4:967\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel\n*L\n99#1:900,2\n102#1:902,2\n649#1:934\n649#1:935,4\n758#1:939,7\n770#1:946,7\n777#1:953,7\n789#1:960,7\n497#1:904,5\n504#1:909,5\n510#1:914,5\n587#1:919,5\n627#1:924,5\n633#1:929,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CalendarViewModel extends BaseViewModel<CalendarUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CalendarUiState> _uiState;

    @NotNull
    public final CalendarActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResources;

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommonRewardState.values().length];
            try {
                iArr[CommonRewardState.EPIC_NOT_RECEIVED_LOW_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRewardState.EPIC_TIMER_LOW_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommonRewardState.EPIC_RECEIVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CalendarBonusRewardState.values().length];
            try {
                iArr2[CalendarBonusRewardState.AVAILABLE_LOW_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CalendarBonusRewardState.NOT_RECEIVED_LOW_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CalendarBonusRewardState.RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CalendarBonusRewardState.AVAILABLE_NORM_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel", m7120f = "CalendarViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {703}, m7123m = "convertJsonArrayToRewards", m7124n = {"this", "intArray", "vehiclesList", "skinsList", "listOfAwardsTypes", "destination$iv$iv", "reward", "rarityState", "mainRewardState", "bonusRewardState", "finalBottomText", "level", "isMainRewards", "index$iv$iv", "fromList", "isNeedToShowLvl"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "Z$0", "I$1", "I$2", "I$3"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$convertJsonArrayToRewards$1 */
    public static final class C37861 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C37861(Continuation<? super C37861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CalendarViewModel.this.convertJsonArrayToRewards(0, false, null, null, null, null, null, this);
        }
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CalendarViewModel(@NotNull CalendarActionWithJSON actionWithJSON, @NotNull StringResource stringResources, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResources, "stringResources");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJSON = actionWithJSON;
        this.stringResources = stringResources;
        this.localNotification = localNotification;
        this._uiState = StateFlowKt.MutableStateFlow(new CalendarUiState(false, null, null, null, null, null, null, 0L, 0L, 0L, false, false, null, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, -1, 131071, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<CalendarUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CalendarUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Bitmap image = get_uiState().getValue().getItemForPreviewDialog().getImage();
        if (image != null) {
            image.recycle();
        }
        Iterator<T> it = get_uiState().getValue().getMainRewardsList().iterator();
        while (it.hasNext()) {
            Bitmap image2 = ((CommonRewardModel) it.next()).getImage();
            if (image2 != null) {
                image2.recycle();
            }
        }
        Iterator<T> it2 = get_uiState().getValue().getBonusRewardsList().iterator();
        while (it2.hasNext()) {
            Bitmap image3 = ((CommonRewardModel) it2.next()).getImage();
            if (image3 != null) {
                image3.recycle();
            }
        }
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1", m7120f = "CalendarViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {MatroskaExtractor.ID_CUE_CLUSTER_POSITION}, m7123m = "invokeSuspend", m7124n = {"seasonName", "comebackSeasonName", "bgOfEventBitmapName", "icOfEventBitmapName", "comeBackSubtitle", "bgComeBackCalendarName", "icComeBackCalendarName", "rewardPosWithTimer", "mainRewards", "comeBackMainRewards", "lastOpenedMainReward", "lastOpenedComeBackMainReward", "bonusRewards", "comeBackBonusRewards", "lastOpenedBonusReward", "lastOpenedComeBackBonusReward", "seasonColor", "textSeasonFirstColor", "textSeasonSecondColor", "totalDaysMain", "totalDaysComeBack", "isShowingNewSeasonBpState", "isShowingTutorialState", "daysForEndSeasonMain", "daysForEndSeasonComeBack", "secondsForNewDay", "secondsForReward", "isAllRewardsReceived", "mainDaysGame", "comeBackDaysGame", "minLevel", "currentLevel", "isFinishedSeason"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$15", "J$0", "J$1", "J$2", "I$0", "I$1", "Z$0", "Z$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "I$8", "I$9", "I$10", "Z$2"})
    @SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$initInterface$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n1747#2,3:900\n1747#2,3:903\n1747#2,3:906\n1747#2,3:909\n230#3,5:912\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$initInterface$1\n*L\n243#1:900,3\n245#1:903,3\n249#1:906,3\n251#1:909,3\n271#1:912,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$initInterface$1 */
    /* loaded from: classes.dex */
    public static final class C37881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CalendarResponse $calendarInfo;
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
        public final /* synthetic */ CalendarScreenType $savedPage;
        public final /* synthetic */ List<SkinsDTO> $skinsList;
        public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
        public int I$0;
        public int I$1;
        public int I$10;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public int I$8;
        public int I$9;
        public long J$0;
        public long J$1;
        public long J$2;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public int label;
        public final /* synthetic */ CalendarViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37881(CalendarResponse calendarResponse, JSONObject jSONObject, CalendarScreenType calendarScreenType, CalendarViewModel calendarViewModel, List<VehiclesDTO> list, List<SkinsDTO> list2, List<BpRewardsAwardsDto> list3, Continuation<? super C37881> continuation) {
            super(2, continuation);
            this.$calendarInfo = calendarResponse;
            this.$json = jSONObject;
            this.$savedPage = calendarScreenType;
            this.this$0 = calendarViewModel;
            this.$vehiclesList = list;
            this.$skinsList = list2;
            this.$listOfAwardsTypes = list3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C37881 c37881 = new C37881(this.$calendarInfo, this.$json, this.$savedPage, this.this$0, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, continuation);
            c37881.L$0 = obj;
            return c37881;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x04b2  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x04bc  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x051d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0527  */
        /* JADX WARN: Type inference failed for: r5v23, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v25, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v4, types: [T, java.util.List] */
        /* JADX WARN: Type inference failed for: r8v1, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            int i;
            Ref.ObjectRef objectRef3;
            String str;
            Ref.IntRef intRef;
            String str2;
            Ref.ObjectRef objectRef4;
            Ref.IntRef intRef2;
            String str3;
            Ref.IntRef intRef3;
            int i2;
            Ref.IntRef intRef4;
            boolean z;
            boolean z2;
            int i3;
            boolean z3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            long j;
            long j2;
            long j3;
            String str4;
            String str5;
            int i11;
            String str6;
            String str7;
            Ref.IntRef intRef5;
            String str8;
            boolean z4;
            boolean z5;
            boolean z6;
            Iterable iterable;
            Iterator it;
            Iterable iterable2;
            Iterator it2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CalendarPropertiesDto properties = this.$calendarInfo.getProperties();
                List list = (List) UtilsKt.buildTypeMerge(this.$calendarInfo.getMainDays(), this.$calendarInfo.getMainDaysStore());
                List list2 = (List) UtilsKt.buildTypeMerge(this.$calendarInfo.getBonusDays(), this.$calendarInfo.getBonusDaysStore());
                List<CalendarRewardsDto> comeBackMainDays = this.$calendarInfo.getComeBackMainDays();
                List<CalendarRewardsDto> comeBackBonusDays = this.$calendarInfo.getComeBackBonusDays();
                long jColor = ColorKt.Color(Color.parseColor(properties.getSeasonColor()));
                long jColor2 = ColorKt.Color(Color.parseColor(properties.getDaysColorOne()));
                long jColor3 = ColorKt.Color(Color.parseColor(properties.getDaysColorTwo()));
                String seasonName = properties.getSeasonName();
                String returnName = properties.getReturnName();
                int seasonDays = properties.getSeasonDays();
                int returnDays = properties.getReturnDays();
                String bgSeasonCalendar = properties.getBgSeasonCalendar();
                String icSeasonCalendar = properties.getIcSeasonCalendar();
                String returnSubtitle = properties.getReturnSubtitle();
                String bgComeBackCalendar = properties.getBgComeBackCalendar();
                String icComeBackCalendar = properties.getIcComeBackCalendar();
                boolean zIsOne = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("bn")));
                boolean zIsOne2 = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("i")));
                JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("ml");
                List<Integer> mutableIntList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null;
                if (mutableIntList == null) {
                    mutableIntList = CollectionsKt__CollectionsKt.emptyList();
                }
                JSONArray jSONArrayOptJSONArray2 = this.$json.optJSONArray(CalendarKeys.COME_BACK_STATUS_MAIN_REWARDS_KEY);
                List<Integer> mutableIntList2 = jSONArrayOptJSONArray2 != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray2) : null;
                int iOptInt = this.$json.optInt("d");
                int iOptInt2 = this.$json.optInt(CalendarKeys.COME_BACK_DAYS_FOR_END_SEASON_KEY);
                int iOptInt3 = this.$json.optInt(CalendarKeys.SECONDS_FOR_NEW_DAY_KEY);
                int iOptInt4 = this.$json.optInt("tp");
                int i13 = iOptInt4 == -1 ? 1 : 0;
                int iOptInt5 = this.$json.optInt(CalendarKeys.DAYS_GAME_KEY);
                int iOptInt6 = this.$json.optInt(CalendarKeys.COME_BACK_DAYS_GAME_KEY);
                int iOptInt7 = this.$json.optInt("pl");
                int iOptInt8 = this.$json.optInt("lv");
                boolean zIsZero = IntExtensionKt.isZero(Boxing.boxInt(iOptInt));
                Ref.IntRef intRef6 = new Ref.IntRef();
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                objectRef5.element = CollectionsKt__CollectionsKt.emptyList();
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef6.element = CollectionsKt__CollectionsKt.emptyList();
                Ref.IntRef intRef7 = new Ref.IntRef();
                Ref.IntRef intRef8 = new Ref.IntRef();
                Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                objectRef7.element = CollectionsKt__CollectionsKt.emptyList();
                Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                objectRef8.element = CollectionsKt__CollectionsKt.emptyList();
                Ref.IntRef intRef9 = new Ref.IntRef();
                Ref.IntRef intRef10 = new Ref.IntRef();
                int i14 = i13;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$1(intRef6, this.this$0, mutableIntList, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$2(objectRef5, this.this$0, iOptInt7, mutableIntList, list, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, intRef7, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$3(objectRef6, mutableIntList2, intRef8, this.this$0, iOptInt7, comeBackMainDays, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$4(objectRef7, this.this$0, iOptInt7, this.$json, list2, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, intRef9, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CalendarViewModel$initInterface$1$deferredTasks$5(objectRef8, this.$json, intRef10, this.this$0, iOptInt7, comeBackBonusDays, this.$vehiclesList, this.$skinsList, this.$listOfAwardsTypes, null), 3, null)});
                this.L$0 = seasonName;
                this.L$1 = returnName;
                this.L$2 = bgSeasonCalendar;
                this.L$3 = icSeasonCalendar;
                this.L$4 = returnSubtitle;
                this.L$5 = bgComeBackCalendar;
                this.L$6 = icComeBackCalendar;
                this.L$7 = intRef6;
                this.L$8 = objectRef5;
                objectRef = objectRef6;
                this.L$9 = objectRef;
                this.L$10 = intRef7;
                this.L$11 = intRef8;
                objectRef2 = objectRef7;
                this.L$12 = objectRef2;
                this.L$13 = objectRef8;
                this.L$14 = intRef9;
                this.L$15 = intRef10;
                this.J$0 = jColor;
                this.J$1 = jColor2;
                this.J$2 = jColor3;
                this.I$0 = seasonDays;
                this.I$1 = returnDays;
                this.Z$0 = zIsOne;
                this.Z$1 = zIsOne2;
                this.I$2 = iOptInt;
                this.I$3 = iOptInt2;
                this.I$4 = iOptInt3;
                this.I$5 = iOptInt4;
                this.I$6 = i14;
                this.I$7 = iOptInt5;
                this.I$8 = iOptInt6;
                this.I$9 = iOptInt7;
                this.I$10 = iOptInt8;
                this.Z$2 = zIsZero;
                this.label = 1;
                if (AwaitKt.awaitAll(listListOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = returnDays;
                objectRef3 = objectRef8;
                str = icComeBackCalendar;
                intRef = intRef6;
                str2 = returnSubtitle;
                objectRef4 = objectRef5;
                intRef2 = intRef7;
                str3 = bgComeBackCalendar;
                intRef3 = intRef10;
                i2 = iOptInt7;
                intRef4 = intRef9;
                z = zIsOne;
                z2 = zIsOne2;
                i3 = i14;
                z3 = zIsZero;
                i4 = iOptInt;
                i5 = iOptInt2;
                i6 = iOptInt3;
                i7 = iOptInt4;
                i8 = iOptInt5;
                i9 = iOptInt6;
                i10 = iOptInt8;
                j = jColor3;
                j2 = jColor2;
                j3 = jColor;
                str4 = icSeasonCalendar;
                str5 = bgSeasonCalendar;
                i11 = seasonDays;
                str6 = returnName;
                str7 = seasonName;
                intRef5 = intRef8;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z7 = this.Z$2;
                int i15 = this.I$10;
                int i16 = this.I$9;
                int i17 = this.I$8;
                int i18 = this.I$7;
                int i19 = this.I$6;
                int i20 = this.I$5;
                int i21 = this.I$4;
                int i22 = this.I$3;
                int i23 = this.I$2;
                boolean z8 = this.Z$1;
                boolean z9 = this.Z$0;
                int i24 = this.I$1;
                int i25 = this.I$0;
                long j4 = this.J$2;
                long j5 = this.J$1;
                long j6 = this.J$0;
                intRef3 = (Ref.IntRef) this.L$15;
                Ref.IntRef intRef11 = (Ref.IntRef) this.L$14;
                objectRef3 = (Ref.ObjectRef) this.L$13;
                Ref.ObjectRef objectRef9 = (Ref.ObjectRef) this.L$12;
                Ref.IntRef intRef12 = (Ref.IntRef) this.L$11;
                Ref.IntRef intRef13 = (Ref.IntRef) this.L$10;
                Ref.ObjectRef objectRef10 = (Ref.ObjectRef) this.L$9;
                Ref.ObjectRef objectRef11 = (Ref.ObjectRef) this.L$8;
                Ref.IntRef intRef14 = (Ref.IntRef) this.L$7;
                String str9 = (String) this.L$6;
                String str10 = (String) this.L$5;
                String str11 = (String) this.L$4;
                String str12 = (String) this.L$3;
                String str13 = (String) this.L$2;
                String str14 = (String) this.L$1;
                String str15 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                i10 = i15;
                i2 = i16;
                i9 = i17;
                i8 = i18;
                i3 = i19;
                i7 = i20;
                i6 = i21;
                i5 = i22;
                i4 = i23;
                z2 = z8;
                z = z9;
                i = i24;
                z3 = z7;
                i11 = i25;
                j = j4;
                j2 = j5;
                j3 = j6;
                intRef4 = intRef11;
                objectRef2 = objectRef9;
                intRef5 = intRef12;
                intRef2 = intRef13;
                objectRef = objectRef10;
                intRef = intRef14;
                str = str9;
                str3 = str10;
                str2 = str11;
                str4 = str12;
                str5 = str13;
                str6 = str14;
                str7 = str15;
                objectRef4 = objectRef11;
            }
            Iterable iterable3 = (Iterable) objectRef4.element;
            String str16 = str3;
            if ((iterable3 instanceof Collection) && ((Collection) iterable3).isEmpty()) {
                str8 = str4;
                iterable2 = (Iterable) objectRef2.element;
                if (iterable2 instanceof Collection) {
                    it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                    }
                    z4 = false;
                }
            } else {
                Iterator it3 = iterable3.iterator();
                while (it3.hasNext()) {
                    CommonRewardModel commonRewardModel = (CommonRewardModel) it3.next();
                    Iterator it4 = it3;
                    str8 = str4;
                    if (commonRewardModel.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || commonRewardModel.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL) {
                        break;
                    }
                    it3 = it4;
                    str4 = str8;
                }
                str8 = str4;
                iterable2 = (Iterable) objectRef2.element;
                if ((iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((CommonRewardModel) it2.next()).getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_NORM_LEVEL) {
                            z4 = true;
                        }
                    }
                }
                z4 = false;
            }
            Iterable iterable4 = (Iterable) objectRef.element;
            if ((iterable4 instanceof Collection) && ((Collection) iterable4).isEmpty()) {
                z5 = z4;
                iterable = (Iterable) objectRef3.element;
                if (iterable instanceof Collection) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                    }
                    z6 = false;
                }
            } else {
                Iterator it5 = iterable4.iterator();
                while (it5.hasNext()) {
                    CommonRewardModel commonRewardModel2 = (CommonRewardModel) it5.next();
                    Iterator it6 = it5;
                    z5 = z4;
                    if (commonRewardModel2.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || commonRewardModel2.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL) {
                        break;
                    }
                    it5 = it6;
                    z4 = z5;
                }
                z5 = z4;
                iterable = (Iterable) objectRef3.element;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((CommonRewardModel) it.next()).getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_NORM_LEVEL) {
                            z6 = true;
                        }
                    }
                }
                z6 = false;
            }
            boolean z10 = (((Collection) objectRef.element).isEmpty() ^ true) && (((Collection) objectRef3.element).isEmpty() ^ true);
            CalendarScreenType calendarScreenType = this.$savedPage;
            boolean z11 = z6;
            if (calendarScreenType == CalendarScreenType.NONE) {
                if (z10) {
                    calendarScreenType = CalendarScreenType.COME_BACK;
                } else {
                    calendarScreenType = CalendarScreenType.MAIN;
                }
            } else if (!z10) {
                calendarScreenType = CalendarScreenType.MAIN;
            }
            MutableStateFlow<CalendarUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                CalendarUiState value = mutableStateFlow.getValue();
                CalendarUiState calendarUiState = value;
                Ref.IntRef intRef15 = intRef;
                Ref.ObjectRef objectRef12 = objectRef4;
                Ref.ObjectRef objectRef13 = objectRef3;
                Ref.IntRef intRef16 = intRef5;
                if (mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : true, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : str7, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : str6, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : str5, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : str8, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : str16, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : str, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : j3, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : j2, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : j, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : i4, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : i5, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : i6, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : i7, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : i2, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : i10, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : i8, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : i9, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : intRef.element, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : str2, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : i11, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : i, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : calendarScreenType, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : (List) objectRef4.element, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : (List) objectRef2.element, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : (List) objectRef.element, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : (List) objectRef3.element, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : intRef2.element, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : intRef4.element, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : intRef5.element, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : intRef3.element, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : z10, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : z5, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : z11, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : z3, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : i3 != 0, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : z, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : z, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : z2, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : z2, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false))) {
                    return Unit.INSTANCE;
                }
                intRef = intRef15;
                objectRef4 = objectRef12;
                objectRef3 = objectRef13;
                intRef5 = intRef16;
            }
        }
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull CalendarResponse calendarInfo, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, @NotNull CalendarScreenType savedPage) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(calendarInfo, "calendarInfo");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        Intrinsics.checkNotNullParameter(savedPage, "savedPage");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37881(calendarInfo, json, savedPage, this, vehiclesList, skinsList, listOfAwardsTypes, null), 1, null);
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onPacketIncoming$1", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onPacketIncoming$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n1559#2:900\n1590#2,4:901\n1747#2,3:905\n1747#2,3:908\n1559#2:916\n1590#2,4:917\n1747#2,3:921\n1559#2:929\n1590#2,4:930\n1559#2:934\n1590#2,4:935\n1747#2,3:939\n1747#2,3:942\n230#3,5:911\n230#3,5:924\n230#3,5:945\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onPacketIncoming$1\n*L\n331#1:900\n331#1:901,4\n346#1:905,3\n348#1:908,3\n360#1:916\n360#1:917,4\n379#1:921,3\n401#1:929\n401#1:930,4\n419#1:934\n419#1:935,4\n437#1:939,3\n444#1:942,3\n350#1:911,5\n383#1:924,5\n448#1:945,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onPacketIncoming$1 */
    /* loaded from: classes.dex */
    public static final class C37921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ CalendarViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37921(JSONObject jSONObject, CalendarViewModel calendarViewModel, Continuation<? super C37921> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = calendarViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37921(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:124:0x0415 A[LOOP:6: B:121:0x039c->B:124:0x0415, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x04e2  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x04ec  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0575 A[EDGE_INSN: B:179:0x0575->B:157:0x0575 BREAK  A[LOOP:6: B:121:0x039c->B:124:0x0415], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01d8  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0214 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0245  */
        /* JADX WARN: Type inference failed for: r14v5, types: [T, java.util.ArrayList, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r15v8, types: [T, java.util.ArrayList, java.util.Collection] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List<CommonRewardModel> bonusRewardsList;
            Iterator<T> it;
            MutableStateFlow<CalendarUiState> mutableStateFlow;
            CalendarUiState value;
            CalendarUiState calendarUiState;
            boolean z;
            MutableStateFlow<CalendarUiState> mutableStateFlow2;
            CalendarUiState value2;
            CalendarUiState calendarUiState2;
            ArrayList arrayList;
            boolean z2;
            List<CommonRewardModel> comeBackBonusRewardsList;
            List<CommonRewardModel> list;
            Iterator<T> it2;
            boolean z3;
            boolean z4;
            MutableStateFlow<CalendarUiState> mutableStateFlow3;
            CalendarUiState value3;
            CalendarUiState calendarUiState3;
            List<CommonRewardModel> comeBackBonusRewardsList2;
            List<CommonRewardModel> list2;
            List<CommonRewardModel> comeBackMainRewardsList;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("ml");
            List<Integer> mutableIntList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null;
            if (mutableIntList == null) {
                mutableIntList = CollectionsKt__CollectionsKt.emptyList();
            }
            JSONArray jSONArrayOptJSONArray2 = this.$json.optJSONArray("bl");
            List<Integer> mutableIntList2 = jSONArrayOptJSONArray2 != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray2) : null;
            if (mutableIntList2 == null) {
                mutableIntList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            int iOptInt = this.$json.optInt("t");
            boolean z5 = false;
            if (iOptInt == 1) {
                List<CommonRewardModel> mainRewardsList = this.this$0.get_uiState().getValue().getMainRewardsList();
                CalendarViewModel calendarViewModel = this.this$0;
                ArrayList<CommonRewardModel> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mainRewardsList, 10));
                int i = 0;
                for (Object obj2 : mainRewardsList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    CommonRewardModel commonRewardModel = (CommonRewardModel) obj2;
                    CommonRewardState commonRewardStateFromInt = CommonRewardState.INSTANCE.fromInt(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(mutableIntList, i)));
                    arrayList2.add(commonRewardModel.copy((262127 & 1) != 0 ? commonRewardModel.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel.rewardName : null, (262127 & 4) != 0 ? commonRewardModel.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel.bottomText : CalendarViewModel.getActualBottomText$default(calendarViewModel, commonRewardModel.getBottomText(), commonRewardStateFromInt, null, 4, null), (262127 & 16) != 0 ? commonRewardModel.image : null, (262127 & 32) != 0 ? commonRewardModel.typeId : 0, (262127 & 64) != 0 ? commonRewardModel.awardId : 0, (262127 & 128) != 0 ? commonRewardModel.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel.mainRewardState : commonRewardStateFromInt, (262127 & 4096) != 0 ? commonRewardModel.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel.imageModel : null));
                    i = i2;
                }
                if (arrayList2.isEmpty()) {
                    bonusRewardsList = this.this$0.getUiState().getValue().getBonusRewardsList();
                    if ((bonusRewardsList instanceof Collection) || !bonusRewardsList.isEmpty()) {
                        it = bonusRewardsList.iterator();
                        while (it.hasNext()) {
                            if (((CommonRewardModel) it.next()).getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_NORM_LEVEL) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                    mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        calendarUiState = value;
                    } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : arrayList2, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : z5, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
                } else {
                    for (CommonRewardModel commonRewardModel2 : arrayList2) {
                        if (commonRewardModel2.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || commonRewardModel2.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL) {
                            break;
                        }
                    }
                    bonusRewardsList = this.this$0.getUiState().getValue().getBonusRewardsList();
                    if (bonusRewardsList instanceof Collection) {
                        it = bonusRewardsList.iterator();
                        while (it.hasNext()) {
                        }
                        mutableStateFlow = this.this$0.get_uiState();
                        do {
                            value = mutableStateFlow.getValue();
                            calendarUiState = value;
                        } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : arrayList2, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : z5, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
                    }
                }
            } else if (iOptInt == 3) {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                List<CommonRewardModel> bonusRewardsList2 = this.this$0.get_uiState().getValue().getBonusRewardsList();
                CalendarViewModel calendarViewModel2 = this.this$0;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(bonusRewardsList2, 10));
                int i3 = 0;
                for (Object obj3 : bonusRewardsList2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    CommonRewardModel commonRewardModel3 = (CommonRewardModel) obj3;
                    CalendarBonusRewardState calendarBonusRewardStateFromInt = CalendarBonusRewardState.INSTANCE.fromInt(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(mutableIntList2, i3)));
                    if (calendarBonusRewardStateFromInt == CalendarBonusRewardState.AVAILABLE_NORM_LEVEL) {
                        booleanRef.element = true;
                    }
                    arrayList3.add(commonRewardModel3.copy((262127 & 1) != 0 ? commonRewardModel3.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel3.rewardName : null, (262127 & 4) != 0 ? commonRewardModel3.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel3.bottomText : CalendarViewModel.getActualBottomText$default(calendarViewModel2, commonRewardModel3.getBottomText(), null, calendarBonusRewardStateFromInt, 2, null), (262127 & 16) != 0 ? commonRewardModel3.image : null, (262127 & 32) != 0 ? commonRewardModel3.typeId : 0, (262127 & 64) != 0 ? commonRewardModel3.awardId : 0, (262127 & 128) != 0 ? commonRewardModel3.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel3.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel3.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel3.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel3.mainRewardState : null, (262127 & 4096) != 0 ? commonRewardModel3.bonusRewardState : calendarBonusRewardStateFromInt, (262127 & 8192) != 0 ? commonRewardModel3.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel3.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel3.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel3.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel3.imageModel : null));
                    i3 = i4;
                }
                if (booleanRef.element) {
                    z = true;
                    mutableStateFlow2 = this.this$0.get_uiState();
                    while (true) {
                        value2 = mutableStateFlow2.getValue();
                        calendarUiState2 = value2;
                        arrayList = arrayList3;
                        if (!mutableStateFlow2.compareAndSet(value2, calendarUiState2.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState2.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState2.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState2.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState2.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState2.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState2.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState2.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState2.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState2.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState2.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState2.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState2.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState2.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState2.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState2.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState2.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState2.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState2.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState2.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState2.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState2.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState2.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState2.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState2.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState2.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState2.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState2.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState2.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState2.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState2.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState2.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState2.bonusRewardsList : arrayList, (126975 & 1) != 0 ? calendarUiState2.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState2.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState2.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState2.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState2.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState2.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState2.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState2.isNeedToShowNotificationMain : z, (126975 & 256) != 0 ? calendarUiState2.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState2.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState2.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState2.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState2.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState2.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState2.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState2.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState2.isNeedClose : false))) {
                        }
                        arrayList3 = arrayList;
                    }
                } else {
                    List<CommonRewardModel> mainRewardsList2 = this.this$0.getUiState().getValue().getMainRewardsList();
                    if (!(mainRewardsList2 instanceof Collection) || !mainRewardsList2.isEmpty()) {
                        for (CommonRewardModel commonRewardModel4 : mainRewardsList2) {
                            if (commonRewardModel4.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || commonRewardModel4.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    mutableStateFlow2 = this.this$0.get_uiState();
                    while (true) {
                        value2 = mutableStateFlow2.getValue();
                        calendarUiState2 = value2;
                        arrayList = arrayList3;
                        if (!mutableStateFlow2.compareAndSet(value2, calendarUiState2.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState2.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState2.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState2.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState2.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState2.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState2.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState2.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState2.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState2.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState2.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState2.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState2.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState2.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState2.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState2.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState2.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState2.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState2.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState2.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState2.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState2.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState2.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState2.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState2.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState2.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState2.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState2.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState2.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState2.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState2.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState2.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState2.bonusRewardsList : arrayList, (126975 & 1) != 0 ? calendarUiState2.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState2.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState2.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState2.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState2.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState2.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState2.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState2.isNeedToShowNotificationMain : z, (126975 & 256) != 0 ? calendarUiState2.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState2.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState2.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState2.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState2.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState2.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState2.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState2.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState2.isNeedClose : false))) {
                            break;
                        }
                        arrayList3 = arrayList;
                    }
                }
            } else if (iOptInt == 4) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                JSONArray jSONArrayOptJSONArray3 = this.$json.optJSONArray(CalendarKeys.COME_BACK_STATUS_MAIN_REWARDS_KEY);
                List<Integer> mutableIntList3 = jSONArrayOptJSONArray3 != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray3) : null;
                JSONArray jSONArrayOptJSONArray4 = this.$json.optJSONArray(CalendarKeys.COME_BACK_STATUS_BONUS_REWARDS_KEY);
                List<Integer> mutableIntList4 = jSONArrayOptJSONArray4 != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray4) : null;
                if (mutableIntList3 != null) {
                    CalendarViewModel calendarViewModel3 = this.this$0;
                    List<CommonRewardModel> comeBackMainRewardsList2 = calendarViewModel3.getUiState().getValue().getComeBackMainRewardsList();
                    ?? arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(comeBackMainRewardsList2, 10));
                    int i5 = 0;
                    for (Object obj4 : comeBackMainRewardsList2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CommonRewardModel commonRewardModel5 = (CommonRewardModel) obj4;
                        CommonRewardState commonRewardStateFromInt2 = CommonRewardState.INSTANCE.fromInt(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(mutableIntList3, i5)));
                        arrayList4.add(commonRewardModel5.copy((262127 & 1) != 0 ? commonRewardModel5.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel5.rewardName : null, (262127 & 4) != 0 ? commonRewardModel5.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel5.bottomText : CalendarViewModel.getActualBottomText$default(calendarViewModel3, commonRewardModel5.getBottomText(), commonRewardStateFromInt2, null, 4, null), (262127 & 16) != 0 ? commonRewardModel5.image : null, (262127 & 32) != 0 ? commonRewardModel5.typeId : 0, (262127 & 64) != 0 ? commonRewardModel5.awardId : 0, (262127 & 128) != 0 ? commonRewardModel5.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel5.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel5.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel5.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel5.mainRewardState : commonRewardStateFromInt2, (262127 & 4096) != 0 ? commonRewardModel5.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel5.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel5.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel5.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel5.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel5.imageModel : null));
                        i5 = i6;
                    }
                    objectRef.element = arrayList4;
                    Unit unit = Unit.INSTANCE;
                }
                if (mutableIntList4 != null) {
                    CalendarViewModel calendarViewModel4 = this.this$0;
                    List<CommonRewardModel> comeBackBonusRewardsList3 = calendarViewModel4.getUiState().getValue().getComeBackBonusRewardsList();
                    ?? arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(comeBackBonusRewardsList3, 10));
                    int i7 = 0;
                    for (Object obj5 : comeBackBonusRewardsList3) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        CommonRewardModel commonRewardModel6 = (CommonRewardModel) obj5;
                        CalendarBonusRewardState calendarBonusRewardStateFromInt2 = CalendarBonusRewardState.INSTANCE.fromInt(IntExtensionKt.getOrZero((Integer) CollectionsKt___CollectionsKt.getOrNull(mutableIntList4, i7)));
                        arrayList5.add(commonRewardModel6.copy((262127 & 1) != 0 ? commonRewardModel6.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel6.rewardName : null, (262127 & 4) != 0 ? commonRewardModel6.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel6.bottomText : CalendarViewModel.getActualBottomText$default(calendarViewModel4, commonRewardModel6.getBottomText(), null, calendarBonusRewardStateFromInt2, 2, null), (262127 & 16) != 0 ? commonRewardModel6.image : null, (262127 & 32) != 0 ? commonRewardModel6.typeId : 0, (262127 & 64) != 0 ? commonRewardModel6.awardId : 0, (262127 & 128) != 0 ? commonRewardModel6.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel6.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel6.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel6.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel6.mainRewardState : null, (262127 & 4096) != 0 ? commonRewardModel6.bonusRewardState : calendarBonusRewardStateFromInt2, (262127 & 8192) != 0 ? commonRewardModel6.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel6.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel6.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel6.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel6.imageModel : null));
                        i7 = i8;
                    }
                    objectRef2.element = arrayList5;
                    Unit unit2 = Unit.INSTANCE;
                }
                List<CommonRewardModel> comeBackMainRewardsList3 = (List) objectRef.element;
                if (comeBackMainRewardsList3 == null) {
                    comeBackMainRewardsList3 = this.this$0.getUiState().getValue().getComeBackMainRewardsList();
                }
                List<CommonRewardModel> list3 = comeBackMainRewardsList3;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    z2 = false;
                    comeBackBonusRewardsList = (List) objectRef2.element;
                    if (comeBackBonusRewardsList == null) {
                    }
                    list = comeBackBonusRewardsList;
                    if (list instanceof Collection) {
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                        }
                        z3 = false;
                        if (z2) {
                        }
                    }
                } else {
                    for (CommonRewardModel commonRewardModel7 : list3) {
                        if (commonRewardModel7.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || commonRewardModel7.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL) {
                            z2 = true;
                            break;
                        }
                    }
                    z2 = false;
                    comeBackBonusRewardsList = (List) objectRef2.element;
                    if (comeBackBonusRewardsList == null) {
                        comeBackBonusRewardsList = this.this$0.getUiState().getValue().getComeBackBonusRewardsList();
                    }
                    list = comeBackBonusRewardsList;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((CommonRewardModel) it2.next()).getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_NORM_LEVEL) {
                                z3 = true;
                                break;
                            }
                        }
                        z3 = false;
                        z4 = z2 || z3;
                        mutableStateFlow3 = this.this$0.get_uiState();
                        CalendarViewModel calendarViewModel5 = this.this$0;
                        do {
                            value3 = mutableStateFlow3.getValue();
                            calendarUiState3 = value3;
                            comeBackBonusRewardsList2 = (List) objectRef2.element;
                            if (comeBackBonusRewardsList2 == null) {
                                comeBackBonusRewardsList2 = calendarViewModel5.getUiState().getValue().getComeBackBonusRewardsList();
                            }
                            list2 = comeBackBonusRewardsList2;
                            comeBackMainRewardsList = (List) objectRef.element;
                            if (comeBackMainRewardsList == null) {
                                comeBackMainRewardsList = calendarViewModel5.getUiState().getValue().getComeBackMainRewardsList();
                            }
                        } while (!mutableStateFlow3.compareAndSet(value3, calendarUiState3.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState3.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState3.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState3.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState3.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState3.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState3.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState3.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState3.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState3.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState3.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState3.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState3.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState3.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState3.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState3.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState3.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState3.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState3.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState3.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState3.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState3.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState3.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState3.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState3.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState3.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState3.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState3.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState3.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState3.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState3.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState3.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState3.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState3.comeBackMainRewardsList : comeBackMainRewardsList, (126975 & 2) != 0 ? calendarUiState3.comeBackBonusRewardsList : list2, (126975 & 4) != 0 ? calendarUiState3.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState3.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState3.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState3.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState3.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState3.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState3.isNeedToShowNotificationComeBack : z4, (126975 & 512) != 0 ? calendarUiState3.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState3.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState3.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState3.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState3.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState3.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState3.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState3.isNeedClose : false)));
                    } else {
                        z3 = false;
                        if (z2) {
                            mutableStateFlow3 = this.this$0.get_uiState();
                            CalendarViewModel calendarViewModel52 = this.this$0;
                            do {
                                value3 = mutableStateFlow3.getValue();
                                calendarUiState3 = value3;
                                comeBackBonusRewardsList2 = (List) objectRef2.element;
                                if (comeBackBonusRewardsList2 == null) {
                                }
                                list2 = comeBackBonusRewardsList2;
                                comeBackMainRewardsList = (List) objectRef.element;
                                if (comeBackMainRewardsList == null) {
                                }
                            } while (!mutableStateFlow3.compareAndSet(value3, calendarUiState3.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState3.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState3.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState3.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState3.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState3.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState3.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState3.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState3.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState3.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState3.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState3.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState3.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState3.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState3.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState3.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState3.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState3.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState3.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState3.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState3.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState3.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState3.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState3.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState3.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState3.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState3.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState3.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState3.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState3.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState3.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState3.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState3.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState3.comeBackMainRewardsList : comeBackMainRewardsList, (126975 & 2) != 0 ? calendarUiState3.comeBackBonusRewardsList : list2, (126975 & 4) != 0 ? calendarUiState3.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState3.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState3.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState3.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState3.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState3.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState3.isNeedToShowNotificationComeBack : z4, (126975 & 512) != 0 ? calendarUiState3.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState3.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState3.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState3.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState3.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState3.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState3.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState3.isNeedClose : false)));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37921(json, this, null), 1, null);
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onDialogButtonClick$1", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onDialogButtonClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n230#2,5:900\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onDialogButtonClick$1\n*L\n490#1:900,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onDialogButtonClick$1 */
    /* loaded from: classes.dex */
    public static final class C37901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37901(Continuation<? super C37901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CalendarViewModel.this.new C37901(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CalendarUiState value;
            CalendarUiState calendarUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int posItemForPreviewDialog = CalendarViewModel.this.get_uiState().getValue().getPosItemForPreviewDialog();
            boolean zIsNeedGetReward = CalendarViewModel.this.get_uiState().getValue().isNeedGetReward();
            int rewardList = CalendarViewModel.this.get_uiState().getValue().getRewardList();
            boolean z = CalendarViewModel.this.get_uiState().getValue().getItemForPreviewDialog().getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL || CalendarViewModel.this.get_uiState().getValue().getItemForPreviewDialog().getBonusRewardState() == CalendarBonusRewardState.AVAILABLE_LOW_LEVEL;
            int i = CalendarViewModel.this.getUiState().getValue().getSelectedPage() == CalendarScreenType.MAIN ? 2 : 4;
            if (zIsNeedGetReward) {
                CalendarViewModel.this.actionWithJSON.getReward(i, posItemForPreviewDialog, rewardList);
            } else if (z) {
                CalendarViewModel.this.getLocalNotification().showErrorNotification(CalendarViewModel.this.stringResources.getString(R.string.calendar_hint_need_lvl_to_get_reward, Boxing.boxInt(CalendarViewModel.this.get_uiState().getValue().getMinRewardLevel())));
            }
            MutableStateFlow<CalendarUiState> mutableStateFlow = CalendarViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                calendarUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void onDialogButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37901(null), 1, null);
    }

    public final void onShowAllRewardsClick() {
        CalendarUiState value;
        CalendarUiState calendarUiState;
        MutableStateFlow<CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            calendarUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : true, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
    }

    public final void onTutorialCLick(boolean isMainList) {
        CalendarUiState value;
        CalendarUiState calendarUiState;
        CalendarUiState value2;
        CalendarUiState calendarUiState2;
        if (isMainList) {
            MutableStateFlow<CalendarUiState> mutableStateFlow = get_uiState();
            do {
                value2 = mutableStateFlow.getValue();
                calendarUiState2 = value2;
            } while (!mutableStateFlow.compareAndSet(value2, calendarUiState2.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState2.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState2.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState2.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState2.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState2.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState2.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState2.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState2.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState2.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState2.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState2.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState2.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState2.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState2.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState2.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState2.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState2.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState2.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState2.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState2.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState2.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState2.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState2.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState2.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState2.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState2.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState2.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState2.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState2.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState2.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState2.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState2.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState2.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState2.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState2.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState2.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState2.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState2.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState2.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState2.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState2.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState2.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState2.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState2.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState2.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState2.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState2.isShowingMainTutorial : true, (126975 & 32768) != 0 ? calendarUiState2.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState2.isNeedClose : false)));
            return;
        }
        MutableStateFlow<CalendarUiState> mutableStateFlow2 = get_uiState();
        do {
            value = mutableStateFlow2.getValue();
            calendarUiState = value;
        } while (!mutableStateFlow2.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : true, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onItemClick$1", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onItemClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n230#2,5:900\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onItemClick$1\n*L\n540#1:900,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onItemClick$1 */
    /* loaded from: classes.dex */
    public static final class C37911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Bitmap $bitmap;
        public final /* synthetic */ int $index;
        public final /* synthetic */ boolean $isFromMainList;
        public int label;

        /* compiled from: CalendarViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onItemClick$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[CalendarBonusRewardState.values().length];
                try {
                    iArr[CalendarBonusRewardState.AVAILABLE_NORM_LEVEL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CommonRewardState.values().length];
                try {
                    iArr2[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37911(boolean z, int i, Bitmap bitmap, Continuation<? super C37911> continuation) {
            super(2, continuation);
            this.$isFromMainList = z;
            this.$index = i;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CalendarViewModel.this.new C37911(this.$isFromMainList, this.$index, this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0173 A[LOOP:0: B:25:0x00bd->B:28:0x0173, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x017b A[EDGE_INSN: B:35:0x017b->B:29:0x017b BREAK  A[LOOP:0: B:25:0x00bd->B:28:0x0173], SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CommonRewardModel commonRewardModel;
            boolean z;
            MutableStateFlow<CalendarUiState> mutableStateFlow;
            CalendarUiState value;
            CalendarUiState calendarUiState;
            int i;
            Bitmap bitmap;
            MutableStateFlow<CalendarUiState> mutableStateFlow2;
            CommonRewardModel commonRewardModel2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (CalendarViewModel.this.getUiState().getValue().getSelectedPage() == CalendarScreenType.MAIN) {
                commonRewardModel = this.$isFromMainList ? (CommonRewardModel) CollectionsKt___CollectionsKt.getOrNull(CalendarViewModel.this.getUiState().getValue().getMainRewardsList(), this.$index) : (CommonRewardModel) CollectionsKt___CollectionsKt.getOrNull(CalendarViewModel.this.getUiState().getValue().getBonusRewardsList(), this.$index);
            } else {
                commonRewardModel = this.$isFromMainList ? (CommonRewardModel) CollectionsKt___CollectionsKt.getOrNull(CalendarViewModel.this.getUiState().getValue().getComeBackMainRewardsList(), this.$index) : (CommonRewardModel) CollectionsKt___CollectionsKt.getOrNull(CalendarViewModel.this.getUiState().getValue().getComeBackBonusRewardsList(), this.$index);
            }
            if (commonRewardModel != null) {
                CalendarViewModel calendarViewModel = CalendarViewModel.this;
                Bitmap bitmap2 = this.$bitmap;
                int i2 = this.$index;
                int i3 = WhenMappings.$EnumSwitchMapping$1[commonRewardModel.getMainRewardState().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    z = true;
                    mutableStateFlow = calendarViewModel.get_uiState();
                    while (true) {
                        value = mutableStateFlow.getValue();
                        calendarUiState = value;
                        i = i2;
                        bitmap = bitmap2;
                        mutableStateFlow2 = mutableStateFlow;
                        commonRewardModel2 = commonRewardModel;
                        if (!mutableStateFlow2.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : true, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : commonRewardModel2.copy((262127 & 1) != 0 ? commonRewardModel2.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel2.rewardName : null, (262127 & 4) != 0 ? commonRewardModel2.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel2.bottomText : null, (262127 & 16) != 0 ? commonRewardModel2.image : bitmap, (262127 & 32) != 0 ? commonRewardModel2.typeId : 0, (262127 & 64) != 0 ? commonRewardModel2.awardId : 0, (262127 & 128) != 0 ? commonRewardModel2.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel2.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel2.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel2.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel2.mainRewardState : null, (262127 & 4096) != 0 ? commonRewardModel2.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel2.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel2.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel2.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel2.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel2.imageModel : null), ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : i, ((-1) & 16384) != 0 ? calendarUiState.rewardList : commonRewardModel.getFromList(), ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : z, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false))) {
                            break;
                        }
                        mutableStateFlow = mutableStateFlow2;
                        i2 = i;
                        bitmap2 = bitmap;
                    }
                } else {
                    if (WhenMappings.$EnumSwitchMapping$0[commonRewardModel.getBonusRewardState().ordinal()] != 1) {
                        z = false;
                    }
                    mutableStateFlow = calendarViewModel.get_uiState();
                    while (true) {
                        value = mutableStateFlow.getValue();
                        calendarUiState = value;
                        i = i2;
                        bitmap = bitmap2;
                        mutableStateFlow2 = mutableStateFlow;
                        commonRewardModel2 = commonRewardModel;
                        if (!mutableStateFlow2.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : true, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : commonRewardModel2.copy((262127 & 1) != 0 ? commonRewardModel2.rewardId : 0, (262127 & 2) != 0 ? commonRewardModel2.rewardName : null, (262127 & 4) != 0 ? commonRewardModel2.rewardDescription : null, (262127 & 8) != 0 ? commonRewardModel2.bottomText : null, (262127 & 16) != 0 ? commonRewardModel2.image : bitmap, (262127 & 32) != 0 ? commonRewardModel2.typeId : 0, (262127 & 64) != 0 ? commonRewardModel2.awardId : 0, (262127 & 128) != 0 ? commonRewardModel2.imageNameFromCdn : null, (262127 & 256) != 0 ? commonRewardModel2.isSuperReward : false, (262127 & 512) != 0 ? commonRewardModel2.isNeedToShowLvl : false, (262127 & 1024) != 0 ? commonRewardModel2.lvl : 0, (262127 & 2048) != 0 ? commonRewardModel2.mainRewardState : null, (262127 & 4096) != 0 ? commonRewardModel2.bonusRewardState : null, (262127 & 8192) != 0 ? commonRewardModel2.isCalendarReward : false, (262127 & 16384) != 0 ? commonRewardModel2.isBpOrEventsReward : false, (262127 & 32768) != 0 ? commonRewardModel2.rarityState : null, (262127 & 65536) != 0 ? commonRewardModel2.fromList : 0, (262127 & 131072) != 0 ? commonRewardModel2.imageModel : null), ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : i, ((-1) & 16384) != 0 ? calendarUiState.rewardList : commonRewardModel.getFromList(), ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : z, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false))) {
                        }
                        mutableStateFlow = mutableStateFlow2;
                        i2 = i;
                        bitmap2 = bitmap;
                    }
                }
            }
            if (commonRewardModel == null) {
                UtilsKt.crashlyticsRecordNewException("_uiState.value.mainRewards.size=" + CalendarViewModel.this.get_uiState().getValue().getMainRewardsList().size() + ", index=" + this.$index);
                CalendarViewModel.this.getLocalNotification().showErrorNotification(CalendarViewModel.this.stringResources.errorWithCode(1));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onItemClick(int index, boolean isFromMainList, @Nullable Bitmap bitmap) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37911(isFromMainList, index, bitmap, null), 1, null);
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onCloseClicked$1", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onCloseClicked$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n230#2,5:900\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$onCloseClicked$1\n*L\n566#1:900,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$onCloseClicked$1 */
    /* loaded from: classes.dex */
    public static final class C37891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37891(Continuation<? super C37891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CalendarViewModel.this.new C37891(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CalendarUiState value;
            CalendarUiState calendarUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CalendarViewModel.this.actionWithJSON.onClickButton(2);
                MutableStateFlow<CalendarUiState> mutableStateFlow = CalendarViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    calendarUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCloseClicked() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37891(null), 1, null);
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$buttonClick$1", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$buttonClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n230#2,5:900\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$buttonClick$1\n*L\n577#1:900,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$buttonClick$1 */
    /* loaded from: classes.dex */
    public static final class C37841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37841(int i, Continuation<? super C37841> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CalendarViewModel.this.new C37841(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CalendarUiState value;
            CalendarUiState calendarUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CalendarViewModel.this.actionWithJSON.onClickButton(this.$buttonId);
                if (this.$buttonId == 1 && CalendarViewModel.this.get_uiState().getValue().isNeedShowingBpLottieAnimation()) {
                    MutableStateFlow<CalendarUiState> mutableStateFlow = CalendarViewModel.this.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        calendarUiState = value;
                    } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void buttonClick(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37841(buttonId, null), 1, null);
    }

    public final void closeAllRewards() {
        CalendarUiState value;
        CalendarUiState calendarUiState;
        MutableStateFlow<CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            calendarUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
    }

    /* compiled from: CalendarViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.calendar.CalendarViewModel$closeHint$1", m7120f = "CalendarViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCalendarViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$closeHint$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,899:1\n230#2,5:900\n230#2,5:905\n230#2,5:910\n*S KotlinDebug\n*F\n+ 1 CalendarViewModel.kt\ncom/blackhub/bronline/game/gui/calendar/CalendarViewModel$closeHint$1\n*L\n598#1:900,5\n605#1:905,5\n614#1:910,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.calendar.CalendarViewModel$closeHint$1 */
    /* loaded from: classes.dex */
    public static final class C37851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37851(Continuation<? super C37851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CalendarViewModel.this.new C37851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CalendarUiState value;
            CalendarUiState calendarUiState;
            CalendarUiState value2;
            CalendarUiState calendarUiState2;
            CalendarUiState value3;
            CalendarUiState calendarUiState3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (CalendarViewModel.this.get_uiState().getValue().isShowingTutorial()) {
                if (CalendarViewModel.this.get_uiState().getValue().isShowingMainTutorial()) {
                    MutableStateFlow<CalendarUiState> mutableStateFlow = CalendarViewModel.this.get_uiState();
                    do {
                        value3 = mutableStateFlow.getValue();
                        calendarUiState3 = value3;
                    } while (!mutableStateFlow.compareAndSet(value3, calendarUiState3.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState3.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState3.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState3.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState3.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState3.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState3.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState3.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState3.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState3.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState3.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState3.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState3.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState3.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState3.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState3.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState3.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState3.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState3.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState3.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState3.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState3.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState3.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState3.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState3.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState3.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState3.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState3.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState3.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState3.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState3.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState3.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState3.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState3.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState3.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState3.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState3.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState3.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState3.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState3.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState3.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState3.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState3.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState3.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState3.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState3.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState3.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState3.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState3.isShowingBonusTutorial : true, (126975 & 65536) != 0 ? calendarUiState3.isNeedClose : false)));
                } else if (CalendarViewModel.this.get_uiState().getValue().isShowingBonusTutorial()) {
                    MutableStateFlow<CalendarUiState> mutableStateFlow2 = CalendarViewModel.this.get_uiState();
                    do {
                        value2 = mutableStateFlow2.getValue();
                        calendarUiState2 = value2;
                    } while (!mutableStateFlow2.compareAndSet(value2, calendarUiState2.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState2.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState2.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState2.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState2.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState2.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState2.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState2.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState2.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState2.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState2.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState2.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState2.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState2.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState2.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState2.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState2.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState2.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState2.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState2.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState2.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState2.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState2.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState2.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState2.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState2.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState2.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState2.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState2.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState2.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState2.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState2.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState2.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState2.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState2.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState2.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState2.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState2.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState2.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState2.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState2.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState2.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState2.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState2.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState2.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState2.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState2.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState2.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState2.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState2.isNeedClose : false)));
                }
            } else {
                MutableStateFlow<CalendarUiState> mutableStateFlow3 = CalendarViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow3.getValue();
                    calendarUiState = value;
                } while (!mutableStateFlow3.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void closeHint() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37851(null), 1, null);
    }

    public final void showErrorNotification(@NotNull String message) throws JSONException {
        CalendarUiState value;
        CalendarUiState calendarUiState;
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
        MutableStateFlow<CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            calendarUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : null, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : true)));
    }

    public final void selectPage(@NotNull CalendarScreenType selectedPage) {
        CalendarUiState value;
        CalendarUiState calendarUiState;
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        MutableStateFlow<CalendarUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            calendarUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, calendarUiState.m14442copySbi3iaU(((-1) & 1) != 0 ? calendarUiState.isInitInterface : false, ((-1) & 2) != 0 ? calendarUiState.nameOfEvent : null, ((-1) & 4) != 0 ? calendarUiState.nameOfComebackEvent : null, ((-1) & 8) != 0 ? calendarUiState.bgOfEventBitmapName : null, ((-1) & 16) != 0 ? calendarUiState.icOfEventBitmapName : null, ((-1) & 32) != 0 ? calendarUiState.bgComeBackEventBitmapName : null, ((-1) & 64) != 0 ? calendarUiState.icComeBackEventBitmapName : null, ((-1) & 128) != 0 ? calendarUiState.colorOfEvent : 0L, ((-1) & 256) != 0 ? calendarUiState.textSeasonFirstColor : 0L, ((-1) & 512) != 0 ? calendarUiState.textSeasonSecondColor : 0L, ((-1) & 1024) != 0 ? calendarUiState.isNeedShowAllRewards : false, ((-1) & 2048) != 0 ? calendarUiState.isNeedShowRewardDialog : false, ((-1) & 4096) != 0 ? calendarUiState.itemForPreviewDialog : null, ((-1) & 8192) != 0 ? calendarUiState.posItemForPreviewDialog : 0, ((-1) & 16384) != 0 ? calendarUiState.rewardList : 0, ((-1) & 32768) != 0 ? calendarUiState.isNeedGetReward : false, ((-1) & 65536) != 0 ? calendarUiState.daysForEndSeasonMain : 0, ((-1) & 131072) != 0 ? calendarUiState.daysForEndSeasonComeBack : 0, ((-1) & 262144) != 0 ? calendarUiState.secondsForNewDay : 0, ((-1) & 524288) != 0 ? calendarUiState.secondsForReward : 0, ((-1) & 1048576) != 0 ? calendarUiState.minRewardLevel : 0, ((-1) & 2097152) != 0 ? calendarUiState.currentLevel : 0, ((-1) & 4194304) != 0 ? calendarUiState.minComeBackRewardLevel : 0, ((-1) & 8388608) != 0 ? calendarUiState.mainDaysGame : 0, ((-1) & 16777216) != 0 ? calendarUiState.comeBackDaysGame : 0, ((-1) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? calendarUiState.rewardIndexWithTimer : 0, ((-1) & 67108864) != 0 ? calendarUiState.comeBackSubtitle : null, ((-1) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? calendarUiState.totalDaysMain : 0, ((-1) & 268435456) != 0 ? calendarUiState.totalDaysComeBack : 0, ((-1) & 536870912) != 0 ? calendarUiState.selectedPage : selectedPage, ((-1) & 1073741824) != 0 ? calendarUiState.mainRewardsList : null, ((-1) & Integer.MIN_VALUE) != 0 ? calendarUiState.bonusRewardsList : null, (126975 & 1) != 0 ? calendarUiState.comeBackMainRewardsList : null, (126975 & 2) != 0 ? calendarUiState.comeBackBonusRewardsList : null, (126975 & 4) != 0 ? calendarUiState.lastOpenedMainReward : 0, (126975 & 8) != 0 ? calendarUiState.lastOpenedBonusReward : 0, (126975 & 16) != 0 ? calendarUiState.lastOpenedComeBackMainReward : 0, (126975 & 32) != 0 ? calendarUiState.lastOpenedComeBackBonusReward : 0, (126975 & 64) != 0 ? calendarUiState.isNeedToShowComebackButton : false, (126975 & 128) != 0 ? calendarUiState.isNeedToShowNotificationMain : false, (126975 & 256) != 0 ? calendarUiState.isNeedToShowNotificationComeBack : false, (126975 & 512) != 0 ? calendarUiState.isFinishedSeason : false, (126975 & 1024) != 0 ? calendarUiState.isAllRewardsReceived : false, (126975 & 2048) != 0 ? calendarUiState.isShowingNewSeasonBp : false, (126975 & 4096) != 0 ? calendarUiState.isNeedShowingBpLottieAnimation : false, (126975 & 8192) != 0 ? calendarUiState.isShowingTutorial : false, (126975 & 16384) != 0 ? calendarUiState.isShowingMainTutorial : false, (126975 & 32768) != 0 ? calendarUiState.isShowingBonusTutorial : false, (126975 & 65536) != 0 ? calendarUiState.isNeedClose : false)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01d1 -> B:58:0x01ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object convertJsonArrayToRewards(int i, boolean z, List<Integer> list, List<CalendarRewardsDto> list2, List<VehiclesDTO> list3, List<SkinsDTO> list4, List<BpRewardsAwardsDto> list5, Continuation<? super List<CommonRewardModel>> continuation) throws Throwable {
        C37861 c37861;
        CalendarViewModel calendarViewModel;
        List<VehiclesDTO> list6;
        List<SkinsDTO> list7;
        List<BpRewardsAwardsDto> list8;
        Iterator it;
        C37861 c378612;
        ArrayList arrayList;
        int i2;
        int i3;
        boolean z2;
        List<Integer> list9;
        String strCalendarDescriptionBonusReward;
        CommonRewardState commonRewardStateFromInt;
        int i4;
        CalendarBonusRewardState calendarBonusRewardStateFromInt;
        int i5;
        if (continuation instanceof C37861) {
            c37861 = (C37861) continuation;
            int i6 = c37861.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c37861.label = i6 - Integer.MIN_VALUE;
            } else {
                c37861 = new C37861(continuation);
            }
        }
        Object objAwait = c37861.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c37861.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (list2 != null) {
                List<CalendarRewardsDto> list10 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                calendarViewModel = this;
                list6 = list3;
                list7 = list4;
                list8 = list5;
                it = list10.iterator();
                c378612 = c37861;
                arrayList = arrayList2;
                i2 = 0;
                i3 = i;
                z2 = z;
                list9 = list;
                if (it.hasNext()) {
                }
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i8 = c37861.I$3;
        int i9 = c37861.I$2;
        int i10 = c37861.I$1;
        boolean z3 = c37861.Z$0;
        int i11 = c37861.I$0;
        ?? r11 = (Collection) c37861.L$13;
        CalendarRewardsDto calendarRewardsDto = (CalendarRewardsDto) c37861.L$12;
        String str = (String) c37861.L$11;
        CalendarBonusRewardState calendarBonusRewardState = (CalendarBonusRewardState) c37861.L$10;
        CommonRewardState commonRewardState = (CommonRewardState) c37861.L$9;
        CommonRarityEnum commonRarityEnum = (CommonRarityEnum) c37861.L$8;
        CalendarRewardsDto calendarRewardsDto2 = (CalendarRewardsDto) c37861.L$7;
        Iterator it2 = (Iterator) c37861.L$6;
        ?? r2 = (Collection) c37861.L$5;
        List<BpRewardsAwardsDto> list11 = (List) c37861.L$4;
        List<SkinsDTO> list12 = (List) c37861.L$3;
        List<VehiclesDTO> list13 = (List) c37861.L$2;
        List<Integer> list14 = (List) c37861.L$1;
        CalendarViewModel calendarViewModel2 = (CalendarViewModel) c37861.L$0;
        ResultKt.throwOnFailure(objAwait);
        CommonRarityEnum commonRarityEnum2 = commonRarityEnum;
        int i12 = i9;
        String str2 = str;
        CalendarBonusRewardState calendarBonusRewardState2 = calendarBonusRewardState;
        CommonRewardState commonRewardState2 = commonRewardState;
        ArrayList arrayList3 = r2;
        List<BpRewardsAwardsDto> list15 = list11;
        list7 = list12;
        int i13 = i10;
        ArrayList arrayList4 = r11;
        Iterator it3 = it2;
        C37861 c378613 = c37861;
        Object obj = coroutine_suspended;
        CalendarRewardsDto calendarRewardsDto3 = calendarRewardsDto;
        List<VehiclesDTO> list16 = list13;
        CalendarViewModel calendarViewModel3 = calendarViewModel2;
        list9 = list14;
        calendarRewardsDto3.setImageModel((ImageModel) objAwait);
        int orZero = IntExtensionKt.getOrZero(calendarRewardsDto2.getId());
        List<Integer> list17 = list9;
        String str3 = (String) UtilsKt.buildTypeMerge(calendarRewardsDto2.getName(), calendarRewardsDto2.getNameStore());
        String str4 = str3 != null ? "" : str3;
        String str5 = (String) UtilsKt.buildTypeMerge(calendarRewardsDto2.getDescription(), calendarRewardsDto2.getDescriptionStore());
        arrayList4.add(new CommonRewardModel(orZero, str4, str5 != null ? "" : str5, str2, null, IntExtensionKt.getOrZero(calendarRewardsDto2.getTypeId()), IntExtensionKt.getOrZero(calendarRewardsDto2.getAwardId()), calendarRewardsDto2.getImageName(), IntExtensionKt.isOne(calendarRewardsDto2.getTypeReward()), i8 == 0, i11, commonRewardState2, calendarBonusRewardState2, false, false, commonRarityEnum2, i12, calendarRewardsDto2.getImageModel(), 24592, null));
        list9 = list17;
        list6 = list16;
        list8 = list15;
        c378612 = c378613;
        z2 = z3;
        i3 = i11;
        it = it3;
        calendarViewModel = calendarViewModel3;
        i2 = i13;
        arrayList = arrayList3;
        coroutine_suspended = obj;
        if (it.hasNext()) {
            Object next = it.next();
            int i14 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CalendarRewardsDto calendarRewardsDto4 = (CalendarRewardsDto) next;
            Integer num = (Integer) CollectionsKt___CollectionsKt.getOrNull(list9, i2);
            int iIntValue = num != null ? num.intValue() : -1;
            if (z2) {
                strCalendarDescriptionBonusReward = calendarViewModel.stringResources.calendarDescriptionMainReward(IntExtensionKt.getOrZero(calendarRewardsDto4.getId()));
            } else {
                strCalendarDescriptionBonusReward = calendarViewModel.stringResources.calendarDescriptionBonusReward(IntExtensionKt.getOrZero(calendarRewardsDto4.getId()));
            }
            Object obj2 = coroutine_suspended;
            CommonRarityEnum commonRarityEnumFromInt = CommonRarityEnum.INSTANCE.fromInt(IntExtensionKt.getOrZero(calendarRewardsDto4.getRarity()));
            if (z2) {
                commonRewardStateFromInt = CommonRewardState.INSTANCE.fromInt(iIntValue);
            } else {
                commonRewardStateFromInt = CommonRewardState.NONE;
            }
            if (!z2) {
                i4 = i14;
                calendarBonusRewardStateFromInt = CalendarBonusRewardState.INSTANCE.fromInt(iIntValue);
            } else {
                i4 = i14;
                calendarBonusRewardStateFromInt = CalendarBonusRewardState.NONE;
            }
            String actualBottomText = calendarViewModel.getActualBottomText(strCalendarDescriptionBonusReward, commonRewardStateFromInt, calendarBonusRewardStateFromInt);
            int i15 = i3;
            int i16 = z2 ? 1 : 2;
            if (z2) {
                int i17 = WhenMappings.$EnumSwitchMapping$0[CommonRewardState.INSTANCE.fromInt(iIntValue).ordinal()];
                i5 = (i17 == 1 || i17 == 2 || i17 == 3) ? 1 : 0;
            } else {
                int i18 = WhenMappings.$EnumSwitchMapping$1[CalendarBonusRewardState.INSTANCE.fromInt(iIntValue).ordinal()];
                if (i18 == 1 || i18 == 2) {
                }
            }
            int i19 = i5;
            boolean z4 = z2;
            Deferred deferredAsyncOnDefault$default = ViewModelExtensionKt.asyncOnDefault$default(calendarViewModel, null, new C3787x2d4c39ac(calendarViewModel, calendarRewardsDto4, list6, list7, list8, null), 1, null);
            c378612.L$0 = calendarViewModel;
            c378612.L$1 = list9;
            c378612.L$2 = list6;
            c378612.L$3 = list7;
            c378612.L$4 = list8;
            c378612.L$5 = arrayList;
            c378612.L$6 = it;
            c378612.L$7 = calendarRewardsDto4;
            c378612.L$8 = commonRarityEnumFromInt;
            c378612.L$9 = commonRewardStateFromInt;
            c378612.L$10 = calendarBonusRewardStateFromInt;
            c378612.L$11 = actualBottomText;
            c378612.L$12 = calendarRewardsDto4;
            c378612.L$13 = arrayList;
            c378612.I$0 = i15;
            c378612.Z$0 = z4;
            c378612.I$1 = i4;
            c378612.I$2 = i16;
            c378612.I$3 = i19;
            c378612.label = 1;
            objAwait = deferredAsyncOnDefault$default.await(c378612);
            if (objAwait == obj2) {
                return obj2;
            }
            obj = obj2;
            commonRarityEnum2 = commonRarityEnumFromInt;
            list16 = list6;
            calendarRewardsDto3 = calendarRewardsDto4;
            calendarBonusRewardState2 = calendarBonusRewardStateFromInt;
            commonRewardState2 = commonRewardStateFromInt;
            i13 = i4;
            i12 = i16;
            i8 = i19;
            arrayList3 = arrayList;
            str2 = actualBottomText;
            arrayList4 = arrayList3;
            it3 = it;
            c378613 = c378612;
            calendarViewModel3 = calendarViewModel;
            z3 = z4;
            i11 = i15;
            list15 = list8;
            calendarRewardsDto2 = calendarRewardsDto3;
            calendarRewardsDto3.setImageModel((ImageModel) objAwait);
            int orZero2 = IntExtensionKt.getOrZero(calendarRewardsDto2.getId());
            List<Integer> list172 = list9;
            String str32 = (String) UtilsKt.buildTypeMerge(calendarRewardsDto2.getName(), calendarRewardsDto2.getNameStore());
            if (str32 != null) {
            }
            String str52 = (String) UtilsKt.buildTypeMerge(calendarRewardsDto2.getDescription(), calendarRewardsDto2.getDescriptionStore());
            arrayList4.add(new CommonRewardModel(orZero2, str4, str52 != null ? "" : str52, str2, null, IntExtensionKt.getOrZero(calendarRewardsDto2.getTypeId()), IntExtensionKt.getOrZero(calendarRewardsDto2.getAwardId()), calendarRewardsDto2.getImageName(), IntExtensionKt.isOne(calendarRewardsDto2.getTypeReward()), i8 == 0, i11, commonRewardState2, calendarBonusRewardState2, false, false, commonRarityEnum2, i12, calendarRewardsDto2.getImageModel(), 24592, null));
            list9 = list172;
            list6 = list16;
            list8 = list15;
            c378612 = c378613;
            z2 = z3;
            i3 = i11;
            it = it3;
            calendarViewModel = calendarViewModel3;
            i2 = i13;
            arrayList = arrayList3;
            coroutine_suspended = obj;
            if (it.hasNext()) {
                ArrayList arrayList5 = arrayList;
                if (arrayList5 != null) {
                    return arrayList5;
                }
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
    }

    public static /* synthetic */ String getActualBottomText$default(CalendarViewModel calendarViewModel, String str, CommonRewardState commonRewardState, CalendarBonusRewardState calendarBonusRewardState, int i, Object obj) {
        if ((i & 2) != 0) {
            commonRewardState = CommonRewardState.NONE;
        }
        if ((i & 4) != 0) {
            calendarBonusRewardState = CalendarBonusRewardState.NONE;
        }
        return calendarViewModel.getActualBottomText(str, commonRewardState, calendarBonusRewardState);
    }

    public final String getActualBottomText(String initBottomText, CommonRewardState mainRewardState, CalendarBonusRewardState bonusRewardState) {
        int i = WhenMappings.$EnumSwitchMapping$0[mainRewardState.ordinal()];
        if (i != 3) {
            if (i == 4 || i == 5) {
                return this.stringResources.calendarBottomTextIsReceived();
            }
            if (i != 6 && i != 7) {
                int i2 = WhenMappings.$EnumSwitchMapping$1[bonusRewardState.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3) {
                        return this.stringResources.calendarBottomTextIsReceived();
                    }
                    if (i2 != 4) {
                        return initBottomText;
                    }
                }
                return this.stringResources.calendarBottomTextIsAvailable();
            }
        }
        return this.stringResources.calendarBottomTextIsAvailable();
    }

    public final ImageModel setImageModel(CalendarRewardsDto reward, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Object next;
        List<String> imageList;
        Object next2;
        String imageName;
        Object next3;
        List<String> imageList2;
        Object next4;
        String imageName2;
        String name;
        Integer typeId = reward.getTypeId();
        String str = null;
        str = null;
        String str2 = null;
        str = null;
        if (typeId != null && typeId.intValue() == 11) {
            Iterator<T> it = skinsList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it.next();
                if (Intrinsics.areEqual(((SkinsDTO) next4).getModelId(), reward.getAwardId())) {
                    break;
                }
            }
            SkinsDTO skinsDTO = (SkinsDTO) next4;
            String str3 = ((skinsDTO == null || (imageName2 = skinsDTO.getImageName()) == null) && (imageName2 = reward.getImageName()) == null) ? "" : imageName2;
            return new ImageModel(IntExtensionKt.getOrZero(reward.getId()), str3.length() <= 0 ? new RenderAttachment(0, IntExtensionKt.getOrZero(reward.getId()), IntExtensionKt.getOrZero(reward.getAwardId()), 3, 0.78f, 20.0f, 180.0f, 45.0f) : null, str3, ((skinsDTO == null || (name = skinsDTO.getName()) == null) && (name = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore())) == null) ? "" : name, AnyExtensionKt.isNotNull(skinsDTO) ? ImageTypePathInCDNEnum.SKIN : ImageTypePathInCDNEnum.ACCESSORY);
        }
        if ((typeId != null && typeId.intValue() == 4) || (typeId != null && typeId.intValue() == 9)) {
            Integer typeId2 = reward.getTypeId();
            ImageTypePathInCDNEnum imageTypePathInCDNEnum = (typeId2 != null && typeId2.intValue() == 4) ? ImageTypePathInCDNEnum.IMAGE : ImageTypePathInCDNEnum.ICON;
            Iterator<T> it2 = listOfAwardsTypes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
                int id = ((BpRewardsAwardsDto) next3).getId();
                Integer typeId3 = reward.getTypeId();
                if (typeId3 != null && id == typeId3.intValue()) {
                    break;
                }
            }
            BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) next3;
            if (bpRewardsAwardsDto != null && (imageList2 = bpRewardsAwardsDto.getImageList()) != null) {
                str2 = (String) CollectionsKt___CollectionsKt.getOrNull(imageList2, IntExtensionKt.getOrOne(reward.getAwardId()) - 1);
            }
            String str4 = str2 == null ? "" : str2;
            int orZero = IntExtensionKt.getOrZero(reward.getId());
            String str5 = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore());
            return new ImageModel(orZero, null, str4, str5 == null ? "" : str5, imageTypePathInCDNEnum, 2, null);
        }
        if (typeId != null && typeId.intValue() == 5) {
            Iterator<T> it3 = vehiclesList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (Intrinsics.areEqual(((VehiclesDTO) next2).getModelId(), reward.getAwardId())) {
                    break;
                }
            }
            VehiclesDTO vehiclesDTO = (VehiclesDTO) next2;
            int orZero2 = IntExtensionKt.getOrZero(reward.getId());
            String str6 = ((vehiclesDTO == null || (imageName = vehiclesDTO.getImageName()) == null) && (imageName = reward.getImageName()) == null) ? "" : imageName;
            String str7 = (String) UtilsKt.buildTypeMerge(vehiclesDTO != null ? vehiclesDTO.getName() : null, vehiclesDTO != null ? vehiclesDTO.getNameStore() : null);
            return new ImageModel(orZero2, null, str6, str7 == null ? "" : str7, ImageTypePathInCDNEnum.VEHICLE, 2, null);
        }
        if (typeId != null && typeId.intValue() == -1) {
            int orZero3 = IntExtensionKt.getOrZero(reward.getId());
            String imageName3 = reward.getImageName();
            String str8 = imageName3 == null ? "" : imageName3;
            String str9 = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore());
            return new ImageModel(orZero3, null, str8, str9 == null ? "" : str9, ImageTypePathInCDNEnum.IMAGE, 2, null);
        }
        Iterator<T> it4 = listOfAwardsTypes.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
            int id2 = ((BpRewardsAwardsDto) next).getId();
            Integer typeId4 = reward.getTypeId();
            if (typeId4 != null && id2 == typeId4.intValue()) {
                break;
            }
        }
        BpRewardsAwardsDto bpRewardsAwardsDto2 = (BpRewardsAwardsDto) next;
        if (bpRewardsAwardsDto2 != null && (imageList = bpRewardsAwardsDto2.getImageList()) != null) {
            str = (String) CollectionsKt___CollectionsKt.getOrNull(imageList, 0);
        }
        String str10 = str == null ? "" : str;
        int orZero4 = IntExtensionKt.getOrZero(reward.getId());
        String str11 = (String) UtilsKt.buildTypeMerge(reward.getName(), reward.getNameStore());
        return new ImageModel(orZero4, null, str10, str11 == null ? "" : str11, ImageTypePathInCDNEnum.ICON, 2, null);
    }

    public final int getRewardPosWithTimer(List<Integer> intArray) {
        Iterator<Integer> it = intArray.iterator();
        int i = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            CommonRewardState.Companion companion = CommonRewardState.INSTANCE;
            if (companion.fromInt(iIntValue) == CommonRewardState.NORM_TIMER || companion.fromInt(iIntValue) == CommonRewardState.EPIC_TIMER_NORM_LEVEL || companion.fromInt(iIntValue) == CommonRewardState.EPIC_TIMER_LOW_LEVEL) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int getLastScrollIndexAndFindLastOpenedReward(List<CommonRewardModel> allRewards, boolean isMainRewards) {
        int iNextIndex = -1;
        if (isMainRewards) {
            Iterator<CommonRewardModel> it = allRewards.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                CommonRewardModel next = it.next();
                if (next.getMainRewardState() == CommonRewardState.NORM_AVAILABLE || next.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL || next.getMainRewardState() == CommonRewardState.EPIC_AVAILABLE_LOW_LEVEL) {
                    break;
                }
                i++;
            }
            if (i < 0) {
                ListIterator<CommonRewardModel> listIterator = allRewards.listIterator(allRewards.size());
                while (listIterator.hasPrevious()) {
                    CommonRewardModel commonRewardModelPrevious = listIterator.previous();
                    if (commonRewardModelPrevious.getMainRewardState() == CommonRewardState.NORM_RECEIVED || commonRewardModelPrevious.getMainRewardState() == CommonRewardState.EPIC_RECEIVED) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                i = iNextIndex;
            }
            if (i < 0) {
                return 0;
            }
            return i;
        }
        ListIterator<CommonRewardModel> listIterator2 = allRewards.listIterator(allRewards.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            }
            if (listIterator2.previous().getBonusRewardState() == CalendarBonusRewardState.RECEIVED) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        if (iNextIndex < 0) {
            return 0;
        }
        return iNextIndex;
    }
}
