package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Color;
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
import androidx.compose.p003ui.text.intl.Locale;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.C2732C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId22;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.OtherExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.BaseModel;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTasksServerModel;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.BlackPassMainUIState;
import com.blackhub.bronline.game.gui.blackpass.data.BPLastChanceItemModel;
import com.blackhub.bronline.game.gui.blackpass.data.RewardModel;
import com.blackhub.bronline.game.gui.blackpass.data.TimerDaysAndHours;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.blackhub.bronline.game.gui.holidayevents.model.HolidayEventsRatingServerModel;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassProperties;
import com.blackhub.bronline.game.model.remote.response.blackpass.LevelsInfo;
import com.blackhub.bronline.game.model.remote.response.blackpass.TasksInfo;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsAwardsDto;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BlackPassMainViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1001:1\n230#2,5:1002\n230#2,5:1007\n230#2,5:1014\n230#2,5:1019\n230#2,5:1024\n1855#3,2:1012\n1559#3:1029\n1590#3,4:1030\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel\n*L\n299#1:1002,5\n311#1:1007,5\n478#1:1014,5\n762#1:1019,5\n790#1:1024,5\n401#1:1012,2\n927#1:1029\n927#1:1030,4\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassMainViewModel extends BaseViewModel<BlackPassMainUIState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<Integer> _priceForBPLevel;

    @NotNull
    public final MutableStateFlow<Integer> _startLayout;

    @NotNull
    public final MutableStateFlow<CommonTaskModel> _taskPreviewItem;

    @NotNull
    public final MutableStateFlow<BlackPassMainUIState> _uiState;

    @NotNull
    public final BlackPassActionWithJSON actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final MutableSharedFlow<ItemForDialogConfirmation> mutableObjForDialogConfirmation;

    @NotNull
    public final MutableSharedFlow<ObjForResultDialog> mutableObjForDialogResult;

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> objForDialogConfirmation;

    @NotNull
    public final SharedFlow<ObjForResultDialog> objForDialogResult;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<CommonTaskModel> taskPreviewItem;

    @NotNull
    public final StateFlow<BlackPassMainUIState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public BlackPassMainViewModel(@NotNull BlackPassActionWithJSON actionWithJson, @NotNull StringResource stringResource, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJson = actionWithJson;
        this.stringResource = stringResource;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new BlackPassMainUIState(0, 0, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, 0, null, null, null, (byte) 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, -1, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        MutableSharedFlow<ItemForDialogConfirmation> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableObjForDialogConfirmation = mutableSharedFlowMutableSharedFlow$default;
        this.objForDialogConfirmation = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<ObjForResultDialog> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableObjForDialogResult = mutableSharedFlowMutableSharedFlow$default2;
        this.objForDialogResult = mutableSharedFlowMutableSharedFlow$default2;
        this._startLayout = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<CommonTaskModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._taskPreviewItem = MutableStateFlow;
        this.taskPreviewItem = FlowKt.asStateFlow(MutableStateFlow);
        this._priceForBPLevel = StateFlowKt.MutableStateFlow(150);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<BlackPassMainUIState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<BlackPassMainUIState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> getObjForDialogConfirmation() {
        return this.objForDialogConfirmation;
    }

    @NotNull
    public final SharedFlow<ObjForResultDialog> getObjForDialogResult() {
        return this.objForDialogResult;
    }

    @NotNull
    public final StateFlow<Integer> getStartLayout() {
        return FlowKt.asStateFlow(this._startLayout);
    }

    @NotNull
    public final StateFlow<CommonTaskModel> getTaskPreviewItem() {
        return this.taskPreviewItem;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        clearData();
        super.onCleared();
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initDataFromJson$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initDataFromJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n230#2,5:1002\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initDataFromJson$1\n*L\n144#1:1002,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initDataFromJson$1 */

    public static final class C37311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ BlackPassItems $blackPassItems;
        public final /* synthetic */ String $calendarSeasonColor;
        public int label;
        public final /* synthetic */ BlackPassMainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37311(BlackPassItems blackPassItems, BlackPassMainViewModel blackPassMainViewModel, String str, Continuation<? super C37311> continuation) {
            super(2, continuation);
            this.$blackPassItems = blackPassItems;
            this.this$0 = blackPassMainViewModel;
            this.$calendarSeasonColor = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37311(this.$blackPassItems, this.this$0, this.$calendarSeasonColor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<BlackPassProperties> bpProperties = this.$blackPassItems.getBpProperties();
            BlackPassProperties blackPassProperties = bpProperties != null ? (BlackPassProperties) CollectionsKt___CollectionsKt.getOrNull(bpProperties, 0) : null;
            this.this$0._priceForBPLevel.setValue(Boxing.boxInt(IntExtensionKt.getOrZero(blackPassProperties != null ? Boxing.boxInt(blackPassProperties.getLevelPrice()) : null)));
            int color = Color.parseColor(this.$calendarSeasonColor);
            MutableStateFlow<BlackPassMainUIState> mutableStateFlow = this.this$0.get_uiState();
            BlackPassItems blackPassItems = this.$blackPassItems;
            while (true) {
                BlackPassMainUIState value = mutableStateFlow.getValue();
                BlackPassMainUIState blackPassMainUIState = value;
                ArrayList<LevelsInfo> standardLevel = blackPassItems.getStandardLevel();
                int orZero = IntExtensionKt.getOrZero(standardLevel != null ? Boxing.boxInt(standardLevel.size()) : null);
                ArrayList<LevelsInfo> standardLevel2 = blackPassItems.getStandardLevel();
                ArrayList<LevelsInfo> premiumLevel = blackPassItems.getPremiumLevel();
                List tasks = blackPassItems.getTasks();
                if (tasks == null) {
                    tasks = CollectionsKt__CollectionsKt.emptyList();
                }
                BlackPassItems blackPassItems2 = blackPassItems;
                MutableStateFlow<BlackPassMainUIState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : orZero, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : color, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : blackPassProperties, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : standardLevel2, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : premiumLevel, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : tasks, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                blackPassItems = blackPassItems2;
            }
        }
    }

    public final void initDataFromJson(@NotNull BlackPassItems blackPassItems, @NotNull String calendarSeasonColor) {
        Intrinsics.checkNotNullParameter(blackPassItems, "blackPassItems");
        Intrinsics.checkNotNullParameter(calendarSeasonColor, "calendarSeasonColor");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37311(blackPassItems, this, calendarSeasonColor, null), 1, null);
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {271}, m7123m = "invokeSuspend", m7124n = {"properties", "seasonBg", "premiumBitmapImage", "seasonBitmapImage", "seasonBitmapImageForRewards", "rewardsList", "ratingBgImage", "dailyCategoryImageBitmap", "specialCategoryImageBitmap", "bpExpBitmap", "imgRubBitmap", "timerDaysAndHours", "vipState", "level", "valueOfExperience", "maxLevelExp"}, m7125s = {"L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$1", "I$2", "I$3"})
    @SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n230#2,5:1002\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$initInterface$1\n*L\n273#1:1002,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$initInterface$1 */

    public static final class C37321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
        public final /* synthetic */ int $premiumStatus;
        public final /* synthetic */ List<SkinsDTO> $skinsList;
        public final /* synthetic */ List<VehiclesDTO> $vehiclesList;
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
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37321(JSONObject jSONObject, List<BpRewardsAwardsDto> list, List<VehiclesDTO> list2, List<SkinsDTO> list3, int i, Continuation<? super C37321> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$listOfAwardsTypes = list;
            this.$vehiclesList = list2;
            this.$skinsList = list3;
            this.$premiumStatus = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassMainViewModel.this.new C37321(this.$json, this.$listOfAwardsTypes, this.$vehiclesList, this.$skinsList, this.$premiumStatus, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            TimerDaysAndHours timerDaysAndHours;
            BlackPassProperties blackPassProperties;
            Ref.ObjectRef objectRef2;
            BlackPassMainViewModel blackPassMainViewModel;
            int i;
            int i2;
            int i3;
            Ref.ObjectRef objectRef3;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            int i4;
            Ref.ObjectRef objectRef6;
            Ref.ObjectRef objectRef7;
            Ref.ObjectRef objectRef8;
            VIPStateEnum vIPStateEnum;
            Ref.ObjectRef objectRef9;
            Ref.ObjectRef objectRef10;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                BlackPassProperties bpProperties = BlackPassMainViewModel.this.get_uiState().getValue().getBpProperties();
                if (bpProperties != null) {
                    JSONObject jSONObject = this.$json;
                    BlackPassMainViewModel blackPassMainViewModel2 = BlackPassMainViewModel.this;
                    List<BpRewardsAwardsDto> list = this.$listOfAwardsTypes;
                    List<VehiclesDTO> list2 = this.$vehiclesList;
                    List<SkinsDTO> list3 = this.$skinsList;
                    int i6 = this.$premiumStatus;
                    Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef13 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef14 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef15 = new Ref.ObjectRef();
                    objectRef15.element = CollectionsKt__CollectionsKt.emptyList();
                    Ref.ObjectRef objectRef16 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef17 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef18 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef19 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef20 = new Ref.ObjectRef();
                    int iOptInt = jSONObject.optInt("lv");
                    int iOptInt2 = jSONObject.optInt("td");
                    TimerDaysAndHours timerDaysAndHours2 = new TimerDaysAndHours(iOptInt2 / 86400, (iOptInt2 % 86400) / 3600);
                    int iOptInt3 = jSONObject.optInt(BlackPassKeys.EC_GET_VALUE_OF_EXPERIENCE);
                    int levelExp = bpProperties.getLevelExp();
                    VIPStateEnum vIPStateEnumFromInt = VIPStateEnum.INSTANCE.fromInt(jSONObject.optInt("a"));
                    List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$1(objectRef13, blackPassMainViewModel2, bpProperties, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$2(objectRef14, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$3(objectRef11, blackPassMainViewModel2, bpProperties, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$4(objectRef12, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$5(objectRef17, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$6(objectRef18, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$7(objectRef19, blackPassMainViewModel2, list, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$8(objectRef15, blackPassMainViewModel2, vIPStateEnumFromInt, iOptInt, jSONObject, list2, list3, list, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$9(objectRef16, blackPassMainViewModel2, null), 1, null), ViewModelExtensionKt.asyncOnIO$default(blackPassMainViewModel2, null, new BlackPassMainViewModel$initInterface$1$1$deferredTasks$10(list, objectRef20, blackPassMainViewModel2, null), 1, null)});
                    this.L$0 = blackPassMainViewModel2;
                    this.L$1 = bpProperties;
                    objectRef = objectRef11;
                    this.L$2 = objectRef;
                    this.L$3 = objectRef12;
                    this.L$4 = objectRef13;
                    this.L$5 = objectRef14;
                    this.L$6 = objectRef15;
                    this.L$7 = objectRef16;
                    this.L$8 = objectRef17;
                    this.L$9 = objectRef18;
                    this.L$10 = objectRef19;
                    this.L$11 = objectRef20;
                    timerDaysAndHours = timerDaysAndHours2;
                    this.L$12 = timerDaysAndHours;
                    this.L$13 = vIPStateEnumFromInt;
                    this.I$0 = i6;
                    this.I$1 = iOptInt;
                    this.I$2 = iOptInt3;
                    this.I$3 = levelExp;
                    this.label = 1;
                    if (AwaitKt.awaitAll(listListOf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    blackPassProperties = bpProperties;
                    objectRef2 = objectRef12;
                    blackPassMainViewModel = blackPassMainViewModel2;
                    i = iOptInt;
                    i2 = levelExp;
                    i3 = i6;
                    objectRef3 = objectRef19;
                    objectRef4 = objectRef14;
                    objectRef5 = objectRef17;
                    i4 = iOptInt3;
                    objectRef6 = objectRef15;
                    objectRef7 = objectRef16;
                    objectRef8 = objectRef20;
                    vIPStateEnum = vIPStateEnumFromInt;
                    objectRef9 = objectRef13;
                    objectRef10 = objectRef18;
                }
                return Unit.INSTANCE;
            }
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = this.I$3;
            i4 = this.I$2;
            i = this.I$1;
            int i8 = this.I$0;
            vIPStateEnum = (VIPStateEnum) this.L$13;
            TimerDaysAndHours timerDaysAndHours3 = (TimerDaysAndHours) this.L$12;
            objectRef8 = (Ref.ObjectRef) this.L$11;
            objectRef3 = (Ref.ObjectRef) this.L$10;
            objectRef10 = (Ref.ObjectRef) this.L$9;
            objectRef5 = (Ref.ObjectRef) this.L$8;
            objectRef7 = (Ref.ObjectRef) this.L$7;
            objectRef6 = (Ref.ObjectRef) this.L$6;
            Ref.ObjectRef objectRef21 = (Ref.ObjectRef) this.L$5;
            Ref.ObjectRef objectRef22 = (Ref.ObjectRef) this.L$4;
            Ref.ObjectRef objectRef23 = (Ref.ObjectRef) this.L$3;
            i2 = i7;
            Ref.ObjectRef objectRef24 = (Ref.ObjectRef) this.L$2;
            blackPassProperties = (BlackPassProperties) this.L$1;
            blackPassMainViewModel = (BlackPassMainViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            i3 = i8;
            objectRef2 = objectRef23;
            objectRef9 = objectRef22;
            objectRef4 = objectRef21;
            timerDaysAndHours = timerDaysAndHours3;
            objectRef = objectRef24;
            MutableStateFlow<BlackPassMainUIState> mutableStateFlow = blackPassMainViewModel.get_uiState();
            int i9 = i3;
            while (true) {
                BlackPassMainUIState value = mutableStateFlow.getValue();
                BlackPassMainUIState blackPassMainUIState = value;
                Bitmap bitmap = (Bitmap) objectRef3.element;
                Bitmap bitmap2 = (Bitmap) objectRef7.element;
                Bitmap bitmap3 = (Bitmap) objectRef5.element;
                Bitmap bitmap4 = (Bitmap) objectRef10.element;
                String seasonName = blackPassProperties.getSeasonName();
                if (seasonName == null) {
                    seasonName = "";
                }
                BlackPassMainUIState blackPassMainUIStateCopy = blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : i, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : seasonName, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : (Bitmap) objectRef.element, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : timerDaysAndHours, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : i4, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : i2, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : (Bitmap) objectRef2.element, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : (Bitmap) objectRef9.element, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : (Bitmap) objectRef4.element, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : vIPStateEnum, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : (List) objectRef6.element, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : bitmap2, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : bitmap, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : bitmap4, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : bitmap3, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : (Bitmap) objectRef8.element, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : i9, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null);
                int i10 = i4;
                if (mutableStateFlow.compareAndSet(value, blackPassMainUIStateCopy)) {
                    break;
                }
                i4 = i10;
            }
            return Unit.INSTANCE;
        }
    }

    public final void initInterface(@NotNull JSONObject json, @NotNull List<VehiclesDTO> vehiclesList, @NotNull List<SkinsDTO> skinsList, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes, int premiumStatus) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(vehiclesList, "vehiclesList");
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37321(json, listOfAwardsTypes, vehiclesList, skinsList, premiumStatus, null), 1, null);
    }

    public final void onClickSelectLayout(int selectedLayout) {
        BlackPassMainUIState value;
        BlackPassMainUIState blackPassMainUIState;
        MutableStateFlow<BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            blackPassMainUIState = value;
        } while (!mutableStateFlow.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : selectedLayout, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null)));
    }

    public final void setStartLayout(int layout) {
        this._startLayout.setValue(Integer.valueOf(layout));
    }

    public final void setPremiumStatusSuccessfullyBought() {
        BlackPassMainUIState value;
        BlackPassMainUIState blackPassMainUIState;
        MutableStateFlow<BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            blackPassMainUIState = value;
        } while (!mutableStateFlow.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 1, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 2, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null)));
    }

    public final void requestInitData() throws JSONException {
        this.actionWithJson.requestInitData();
    }

    public static /* synthetic */ void showDialogConfirmation$default(BlackPassMainViewModel blackPassMainViewModel, Integer num, String str, int i, Integer num2, String str2, String str3, String str4, String str5, int i2, int i3, Object obj) {
        blackPassMainViewModel.showDialogConfirmation((i3 & 1) != 0 ? null : num, str, i, (i3 & 8) != 0 ? null : num2, str2, str3, str4, str5, i2);
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$showDialogConfirmation$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {340, 354}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$showDialogConfirmation$1 */

    public static final class C37361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $action;
        public final /* synthetic */ String $bodyMessage;
        public final /* synthetic */ String $caption;
        public final /* synthetic */ Integer $levels;
        public final /* synthetic */ int $price;
        public final /* synthetic */ String $priceText;
        public final /* synthetic */ Integer $taskId;
        public final /* synthetic */ String $textForButtonCancel;
        public final /* synthetic */ String $textForButtonOK;
        public int label;
        public final /* synthetic */ BlackPassMainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37361(int i, Integer num, BlackPassMainViewModel blackPassMainViewModel, int i2, String str, String str2, String str3, String str4, Integer num2, String str5, Continuation<? super C37361> continuation) {
            super(2, continuation);
            this.$action = i;
            this.$levels = num;
            this.this$0 = blackPassMainViewModel;
            this.$price = i2;
            this.$priceText = str;
            this.$caption = str2;
            this.$textForButtonOK = str3;
            this.$textForButtonCancel = str4;
            this.$taskId = num2;
            this.$bodyMessage = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37361(this.$action, this.$levels, this.this$0, this.$price, this.$priceText, this.$caption, this.$textForButtonOK, this.$textForButtonCancel, this.$taskId, this.$bodyMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strBpDialogConfirmationLastChanceBodyMessage;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$action != 0) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.mutableObjForDialogConfirmation;
                    ItemForDialogConfirmation itemForDialogConfirmation = new ItemForDialogConfirmation(this.$taskId, this.$bodyMessage, this.$price, this.$levels, this.$priceText, this.$caption, this.$textForButtonOK, this.$textForButtonCancel, null, Boxing.boxInt(this.$action));
                    this.label = 2;
                    if (mutableSharedFlow.emit(itemForDialogConfirmation, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Integer num = this.$levels;
                    if (num != null) {
                        BlackPassMainViewModel blackPassMainViewModel = this.this$0;
                        strBpDialogConfirmationLastChanceBodyMessage = blackPassMainViewModel.getStringResource().bpDialogConfirmationLastChanceBodyMessage(num.intValue());
                    } else {
                        strBpDialogConfirmationLastChanceBodyMessage = null;
                    }
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.mutableObjForDialogConfirmation;
                    if (strBpDialogConfirmationLastChanceBodyMessage == null) {
                        strBpDialogConfirmationLastChanceBodyMessage = "";
                    }
                    ItemForDialogConfirmation itemForDialogConfirmation2 = new ItemForDialogConfirmation(null, strBpDialogConfirmationLastChanceBodyMessage, this.$price, this.$levels, this.$priceText, this.$caption, this.$textForButtonOK, this.$textForButtonCancel, null, Boxing.boxInt(this.$action), 1, null);
                    this.label = 1;
                    if (mutableSharedFlow2.emit(itemForDialogConfirmation2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void showDialogConfirmation(@Nullable Integer taskId, @NotNull String bodyMessage, int price, @Nullable Integer levels, @NotNull String priceText, @NotNull String caption, @NotNull String textForButtonOK, @NotNull String textForButtonCancel, int action) {
        Intrinsics.checkNotNullParameter(bodyMessage, "bodyMessage");
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(textForButtonOK, "textForButtonOK");
        Intrinsics.checkNotNullParameter(textForButtonCancel, "textForButtonCancel");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37361(action, levels, this, price, priceText, caption, textForButtonOK, textForButtonCancel, taskId, bodyMessage, null), 3, null);
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$showDialogResult$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {380}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$showDialogResult$1 */

    public static final class C37371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $boldMessage;
        public final /* synthetic */ String $buttonOK;
        public final /* synthetic */ String $caption;
        public final /* synthetic */ int $currentAction;
        public final /* synthetic */ String $message;
        public final /* synthetic */ int $success;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37371(String str, int i, String str2, String str3, String str4, int i2, Continuation<? super C37371> continuation) {
            super(2, continuation);
            this.$message = str;
            this.$success = i;
            this.$boldMessage = str2;
            this.$caption = str3;
            this.$buttonOK = str4;
            this.$currentAction = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassMainViewModel.this.new C37371(this.$message, this.$success, this.$boldMessage, this.$caption, this.$buttonOK, this.$currentAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = BlackPassMainViewModel.this.mutableObjForDialogResult;
                ObjForResultDialog objForResultDialog = new ObjForResultDialog(this.$message, this.$success, this.$boldMessage, this.$caption, this.$buttonOK, this.$currentAction);
                this.label = 1;
                if (mutableSharedFlow.emit(objForResultDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void showDialogResult(@NotNull String message, int success, @NotNull String boldMessage, @NotNull String caption, @NotNull String buttonOK, int currentAction) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(boldMessage, "boldMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(buttonOK, "buttonOK");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37371(message, success, boldMessage, caption, buttonOK, currentAction, null), 3, null);
    }

    public final void customDialogConfirmationLevelUp(int levelsToBuy) throws JSONException {
        this.actionWithJson.confirmationLevelUp(levelsToBuy);
    }

    @NotNull
    public final List<BPLastChanceItemModel> gelListOfChanceItemView() {
        ArrayList arrayList = new ArrayList();
        int maxBpLevel = getUiState().getValue().getMaxBpLevel() - get_uiState().getValue().getBpLevel();
        Iterator<T> it = getStringResource().bpBoostListOfLevels().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            boolean z = iIntValue == 1 || iIntValue == 10;
            int i = iIntValue != 1 ? (iIntValue == 5 || iIntValue == 10) ? R.dimen._10wdp : R.dimen._20wdp : R.dimen._05wdp;
            if (iIntValue < maxBpLevel) {
                arrayList.add(new BPLastChanceItemModel(getStringResource().bpHeader(iIntValue), iIntValue, iIntValue * this._priceForBPLevel.getValue().intValue(), z, i));
            }
        }
        if (maxBpLevel >= 1) {
            arrayList.add(new BPLastChanceItemModel(getStringResource().bpHeaderMax(), maxBpLevel, maxBpLevel * this._priceForBPLevel.getValue().intValue(), true, R.dimen._30wdp));
        }
        return arrayList;
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$levelUp$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$levelUp$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n230#2,5:1002\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$levelUp$1\n*L\n454#1:1002,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$levelUp$1 */

    public static final class C37331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $bpLevel;
        public final /* synthetic */ int $valueOfExperience;
        public int label;
        public final /* synthetic */ BlackPassMainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37331(int i, int i2, BlackPassMainViewModel blackPassMainViewModel, Continuation<? super C37331> continuation) {
            super(2, continuation);
            this.$valueOfExperience = i;
            this.$bpLevel = i2;
            this.this$0 = blackPassMainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37331(this.$valueOfExperience, this.$bpLevel, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.$valueOfExperience;
            if (i == -1) {
                i = 0;
            }
            int bpLevel = this.$bpLevel;
            if (bpLevel == -1) {
                bpLevel = this.this$0.get_uiState().getValue().getBpLevel() + 1;
            }
            int i2 = bpLevel;
            List listUpdateRewardsList = this.this$0.updateRewardsList(i2 - 1);
            MutableStateFlow<BlackPassMainUIState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                BlackPassMainUIState value = mutableStateFlow.getValue();
                BlackPassMainUIState blackPassMainUIState = value;
                MutableStateFlow<BlackPassMainUIState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : i2, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : i, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : listUpdateRewardsList, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public static /* synthetic */ void levelUp$default(BlackPassMainViewModel blackPassMainViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        blackPassMainViewModel.levelUp(i, i2);
    }

    public final void levelUp(int valueOfExperience, int bpLevel) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37331(valueOfExperience, bpLevel, this, null), 1, null);
    }

    public final void sendShowCurrentLayout(int layoutId) throws JSONException {
        this.actionWithJson.showCurrentLayout(layoutId);
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$clearViewModel$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH, 471}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$clearViewModel$1 */

    public static final class C37291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C37291(Continuation<? super C37291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassMainViewModel.this.new C37291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = BlackPassMainViewModel.this.mutableObjForDialogConfirmation;
                this.label = 1;
                if (mutableSharedFlow.emit(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableSharedFlow mutableSharedFlow2 = BlackPassMainViewModel.this.mutableObjForDialogResult;
            this.label = 2;
            if (mutableSharedFlow2.emit(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearViewModel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C37291(null), 2, null);
    }

    public final void clearData() {
        Bitmap seasonBitmapImage = get_uiState().getValue().getSeasonBitmapImage();
        if (seasonBitmapImage != null) {
            seasonBitmapImage.recycle();
        }
        Bitmap seasonBg = get_uiState().getValue().getSeasonBg();
        if (seasonBg != null) {
            seasonBg.recycle();
        }
        MutableStateFlow<BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new BlackPassMainUIState(0, 0, 0, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, 0, null, null, null, (byte) 0, null, null, null, null, null, null, null, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, -1, 1023, null)));
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateAfterGetPrize$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateAfterGetPrize$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n1559#2:1002\n1590#2,4:1003\n230#3,5:1007\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateAfterGetPrize$1\n*L\n487#1:1002\n487#1:1003,4\n524#1:1007,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateAfterGetPrize$1 */

    public static final class C37381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ BlackPassMainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37381(JSONObject jSONObject, BlackPassMainViewModel blackPassMainViewModel, Continuation<? super C37381> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = blackPassMainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37381(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CommonRewardModel standardReward;
            CommonRewardModel premiumReward;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zIsOne = IntExtensionKt.isOne(Boxing.boxInt(this.$json.optInt("p")));
            int iOptInt = this.$json.optInt("id");
            int bpLevel = this.this$0.get_uiState().getValue().getBpLevel() - 1;
            List<RewardModel> rewardsList = this.this$0.get_uiState().getValue().getRewardsList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList, 10));
            int i = 0;
            for (Object obj2 : rewardsList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RewardModel rewardModelCopy = (RewardModel) obj2;
                if (i == bpLevel) {
                    if (!zIsOne && rewardModelCopy.getStandardReward().getRewardId() == iOptInt) {
                        CommonRewardModel standardReward2 = rewardModelCopy.getStandardReward();
                        standardReward = standardReward2.copy((262127 & 1) != 0 ? standardReward2.rewardId : 0, (262127 & 2) != 0 ? standardReward2.rewardName : null, (262127 & 4) != 0 ? standardReward2.rewardDescription : null, (262127 & 8) != 0 ? standardReward2.bottomText : null, (262127 & 16) != 0 ? standardReward2.image : null, (262127 & 32) != 0 ? standardReward2.typeId : 0, (262127 & 64) != 0 ? standardReward2.awardId : 0, (262127 & 128) != 0 ? standardReward2.imageNameFromCdn : null, (262127 & 256) != 0 ? standardReward2.isSuperReward : false, (262127 & 512) != 0 ? standardReward2.isNeedToShowLvl : false, (262127 & 1024) != 0 ? standardReward2.lvl : 0, (262127 & 2048) != 0 ? standardReward2.mainRewardState : CommonRewardState.NORM_RECEIVED, (262127 & 4096) != 0 ? standardReward2.bonusRewardState : null, (262127 & 8192) != 0 ? standardReward2.isCalendarReward : false, (262127 & 16384) != 0 ? standardReward2.isBpOrEventsReward : false, (262127 & 32768) != 0 ? standardReward2.rarityState : null, (262127 & 65536) != 0 ? standardReward2.fromList : 0, (262127 & 131072) != 0 ? standardReward2.imageModel : null);
                    } else {
                        standardReward = rewardModelCopy.getStandardReward();
                    }
                    if (zIsOne && rewardModelCopy.getPremiumReward().getRewardId() == iOptInt) {
                        CommonRewardModel premiumReward2 = rewardModelCopy.getPremiumReward();
                        premiumReward = premiumReward2.copy((262127 & 1) != 0 ? premiumReward2.rewardId : 0, (262127 & 2) != 0 ? premiumReward2.rewardName : null, (262127 & 4) != 0 ? premiumReward2.rewardDescription : null, (262127 & 8) != 0 ? premiumReward2.bottomText : null, (262127 & 16) != 0 ? premiumReward2.image : null, (262127 & 32) != 0 ? premiumReward2.typeId : 0, (262127 & 64) != 0 ? premiumReward2.awardId : 0, (262127 & 128) != 0 ? premiumReward2.imageNameFromCdn : null, (262127 & 256) != 0 ? premiumReward2.isSuperReward : false, (262127 & 512) != 0 ? premiumReward2.isNeedToShowLvl : false, (262127 & 1024) != 0 ? premiumReward2.lvl : 0, (262127 & 2048) != 0 ? premiumReward2.mainRewardState : CommonRewardState.NORM_RECEIVED, (262127 & 4096) != 0 ? premiumReward2.bonusRewardState : null, (262127 & 8192) != 0 ? premiumReward2.isCalendarReward : false, (262127 & 16384) != 0 ? premiumReward2.isBpOrEventsReward : false, (262127 & 32768) != 0 ? premiumReward2.rarityState : null, (262127 & 65536) != 0 ? premiumReward2.fromList : 0, (262127 & 131072) != 0 ? premiumReward2.imageModel : null);
                    } else {
                        premiumReward = rewardModelCopy.getPremiumReward();
                    }
                    rewardModelCopy = rewardModelCopy.copy(standardReward, premiumReward);
                }
                arrayList.add(rewardModelCopy);
                i = i2;
            }
            MutableStateFlow<BlackPassMainUIState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                BlackPassMainUIState value = mutableStateFlow.getValue();
                BlackPassMainUIState blackPassMainUIState = value;
                ArrayList arrayList2 = arrayList;
                if (mutableStateFlow.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : arrayList2, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null))) {
                    return Unit.INSTANCE;
                }
                arrayList = arrayList2;
            }
        }
    }

    public final void updateAfterGetPrize(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37381(json, this, null), 1, null);
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$getPrize$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$getPrize$1 */

    public static final class C37301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentLayout;
        public final /* synthetic */ int $id;
        public final /* synthetic */ int $isPremium;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37301(int i, int i2, int i3, Continuation<? super C37301> continuation) {
            super(2, continuation);
            this.$currentLayout = i;
            this.$id = i2;
            this.$isPremium = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassMainViewModel.this.new C37301(this.$currentLayout, this.$id, this.$isPremium, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BlackPassMainViewModel.this.actionWithJson.getPrize(this.$currentLayout, this.$id, this.$isPremium);
            return Unit.INSTANCE;
        }
    }

    public final void getPrize(int currentLayout, int id, int isPremium) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37301(currentLayout, id, isPremium, null), 1, null);
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JsonArrayExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonArrayExtensionKt\n+ 4 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 7 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n1#2:1002\n51#3,5:1003\n56#3,11:1017\n51#3,5:1044\n56#3,11:1058\n8#4,9:1008\n8#4,9:1049\n1855#5:1028\n1856#5:1036\n1045#5:1037\n1045#5:1038\n1559#5:1069\n1590#5,4:1070\n1099#6:1029\n928#6,6:1030\n230#7,5:1039\n230#7,5:1074\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1\n*L\n571#1:1003,5\n571#1:1017,11\n664#1:1044,5\n664#1:1058,11\n571#1:1008,9\n664#1:1049,9\n577#1:1028\n577#1:1036\n633#1:1037\n636#1:1038\n667#1:1069\n667#1:1070,4\n583#1:1029\n586#1:1030,6\n640#1:1039,5\n677#1:1074,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1 */

    public static final class C37391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<LevelsInfo> $bpRewards;
        public final /* synthetic */ int $currentLayout;
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
        public int label;
        public final /* synthetic */ BlackPassMainViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37391(int i, BlackPassMainViewModel blackPassMainViewModel, JSONObject jSONObject, List<LevelsInfo> list, List<BpRewardsAwardsDto> list2, Continuation<? super C37391> continuation) {
            super(2, continuation);
            this.$currentLayout = i;
            this.this$0 = blackPassMainViewModel;
            this.$json = jSONObject;
            this.$bpRewards = list;
            this.$listOfAwardsTypes = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C37391(this.$currentLayout, this.this$0, this.$json, this.$bpRewards, this.$listOfAwardsTypes, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x028d  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x02a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            String weeklyTimerForEndCategory;
            List<CommonTasksServerModel> arrayList;
            Object objFromJson;
            List sortedTaskList;
            List sortedTaskList2;
            MutableStateFlow<BlackPassMainUIState> mutableStateFlow;
            BlackPassMainUIState value;
            BlackPassMainUIState blackPassMainUIState;
            Object next;
            Integer numBoxInt;
            Integer num;
            int i2;
            ArrayList arrayList2;
            Object objFromJson2;
            List list;
            MutableStateFlow<BlackPassMainUIState> mutableStateFlow2;
            BlackPassMainUIState value2;
            BlackPassMainUIState blackPassMainUIState2;
            int i3 = 0;
            int i4 = 1;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i5 = this.$currentLayout;
            DefaultConstructorMarker defaultConstructorMarker = null;
            List listEmptyList = null;
            if (i5 == 1) {
                Ref.IntRef intRef = new Ref.IntRef();
                if (this.this$0.getUiState().getValue().getActivatePremiumCounter() > 0) {
                    intRef.element = this.this$0.getUiState().getValue().getActivatePremiumCounter() - 1;
                    i = 0;
                } else {
                    i = this.$currentLayout;
                }
                int iOptInt = this.$json.optInt("lv", this.this$0.getUiState().getValue().getBpLevel());
                int iOptInt2 = this.$json.optInt(BlackPassKeys.EC_GET_VALUE_OF_EXPERIENCE, this.this$0.getUiState().getValue().getValueOfExperience());
                Integer numBoxInt2 = Boxing.boxInt(this.$json.optInt("tm", -1));
                if (numBoxInt2.intValue() < 0) {
                    numBoxInt2 = null;
                }
                if (numBoxInt2 == null || (weeklyTimerForEndCategory = IntExtensionKt.formatDurationWithLocaleNoSecondsIfHoursMoreThanZero(numBoxInt2.intValue(), Locale.INSTANCE.getCurrent())) == null) {
                    weeklyTimerForEndCategory = this.this$0.get_uiState().getValue().getWeeklyTimerForEndCategory();
                }
                String str = weeklyTimerForEndCategory;
                JSONArray jSONArrayOptJSONArray = this.$json.optJSONArray("tk");
                if (jSONArrayOptJSONArray == null) {
                    arrayList = null;
                    if (arrayList == null) {
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    BlackPassMainViewModel blackPassMainViewModel = this.this$0;
                    while (r9.hasNext()) {
                    }
                    sortedTaskList = BlackPassMainViewModelKt.toSortedTaskList(CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                        }
                    })));
                    sortedTaskList2 = BlackPassMainViewModelKt.toSortedTaskList(CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                        }
                    })));
                    mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        blackPassMainUIState = value;
                    } while (!mutableStateFlow.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : iOptInt, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : i, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : iOptInt2, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : sortedTaskList2, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : sortedTaskList, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : str, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : intRef.element, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null)));
                } else {
                    try {
                        arrayList = new ArrayList();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i6 = 0; i6 < length; i6++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i6);
                            Intrinsics.checkNotNull(jSONObject);
                            try {
                                Gson gson = new Gson();
                                String string = jSONObject.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) CommonTasksServerModel.class);
                            } catch (Exception e) {
                                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                firebaseCrashlytics.log(e.toString());
                                firebaseCrashlytics.recordException(e);
                                objFromJson = null;
                            }
                            if (objFromJson != null) {
                                Boxing.boxBoolean(arrayList.add(objFromJson));
                            }
                        }
                    } catch (Exception e2) {
                        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics2.log(e2.toString());
                        firebaseCrashlytics2.recordException(e2);
                    }
                    if (arrayList == null) {
                        arrayList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    ArrayList arrayList32 = new ArrayList();
                    ArrayList arrayList42 = new ArrayList();
                    BlackPassMainViewModel blackPassMainViewModel2 = this.this$0;
                    for (CommonTasksServerModel commonTasksServerModel : arrayList) {
                        Iterator<T> it = blackPassMainViewModel2.get_uiState().getValue().getTasksFromJsonList().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = defaultConstructorMarker;
                                break;
                            }
                            next = it.next();
                            if (((TasksInfo) next).getId() == commonTasksServerModel.getId()) {
                                break;
                            }
                        }
                        TasksInfo tasksInfo = (TasksInfo) next;
                        if (tasksInfo != null) {
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(i3, i4, defaultConstructorMarker);
                            builder.append(tasksInfo.getRequirementDescription());
                            OtherExtensionKt.appendSpace(builder);
                            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null));
                            try {
                                builder.append(String.valueOf(commonTasksServerModel.getProgress()));
                                builder.append(blackPassMainViewModel2.getStringResource().getString(R.string.common_slash));
                                builder.append(String.valueOf(tasksInfo.getCount()));
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                int typeBtn = commonTasksServerModel.getStatus() == CommonTaskState.TRACK_STATE.getValue() ? tasksInfo.getTypeBtn() : 0;
                                if (tasksInfo.getTypeId() == 3) {
                                    BlackPassProperties bpProperties = blackPassMainViewModel2.getUiState().getValue().getBpProperties();
                                    if (bpProperties != null) {
                                        numBoxInt = Boxing.boxInt(bpProperties.getWeaklyTasksReward());
                                        num = numBoxInt;
                                    }
                                    num = null;
                                } else {
                                    BlackPassProperties bpProperties2 = blackPassMainViewModel2.getUiState().getValue().getBpProperties();
                                    if (bpProperties2 != null) {
                                        numBoxInt = Boxing.boxInt(bpProperties2.getDailyTasksReward());
                                        num = numBoxInt;
                                    }
                                    num = null;
                                }
                                CommonTaskModel commonTaskModel = new CommonTaskModel(IntExtensionKt.isOne(tasksInfo.getNotActive()), tasksInfo.getId(), tasksInfo.getTypeId(), tasksInfo.getDescription(), annotatedString, tasksInfo.getCount(), tasksInfo.getAward(), num, null, CommonTaskState.INSTANCE.fromInt(commonTasksServerModel.getStatus()), typeBtn, 256, null);
                                if (tasksInfo.getTypeId() == 3) {
                                    arrayList42.add(commonTaskModel);
                                } else {
                                    arrayList32.add(commonTaskModel);
                                }
                            } catch (Throwable th) {
                                builder.pop(iPushStyle);
                                throw th;
                            }
                        }
                        defaultConstructorMarker = null;
                    }
                    sortedTaskList = BlackPassMainViewModelKt.toSortedTaskList(CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.sortedWith(arrayList32, new Comparator() { // from class: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                        }
                    })));
                    sortedTaskList2 = BlackPassMainViewModelKt.toSortedTaskList(CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.sortedWith(arrayList42, new Comparator() { // from class: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$invokeSuspend$$inlined$sortedBy$2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CommonTaskModel) t).getStateOfTask().getValue()), Integer.valueOf(((CommonTaskModel) t2).getStateOfTask().getValue()));
                        }
                    })));
                    mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        blackPassMainUIState = value;
                    } while (!mutableStateFlow.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : iOptInt, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : i, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : iOptInt2, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : sortedTaskList2, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : sortedTaskList, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : str, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : intRef.element, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null)));
                }
            } else if (i5 == 3) {
                Ref.IntRef intRef2 = new Ref.IntRef();
                if (this.this$0.getUiState().getValue().getActivatePremiumCounter() > 0) {
                    intRef2.element = this.this$0.getUiState().getValue().getActivatePremiumCounter() - 1;
                    i2 = 0;
                } else {
                    i2 = this.$currentLayout;
                }
                int iOptInt3 = this.$json.optInt("m");
                JSONArray jSONArrayOptJSONArray2 = this.$json.optJSONArray("j");
                if (jSONArrayOptJSONArray2 == null) {
                    arrayList2 = null;
                    if (arrayList2 != null) {
                    }
                    if (listEmptyList == null) {
                    }
                    list = listEmptyList;
                    mutableStateFlow2 = this.this$0.get_uiState();
                    do {
                        value2 = mutableStateFlow2.getValue();
                        blackPassMainUIState2 = value2;
                    } while (!mutableStateFlow2.compareAndSet(value2, blackPassMainUIState2.copy(((-4293155) & 1) != 0 ? blackPassMainUIState2.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState2.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState2.selectedLayout : i2, ((-4293155) & 8) != 0 ? blackPassMainUIState2.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState2.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState2.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState2.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState2.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState2.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState2.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState2.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState2.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState2.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState2.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState2.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState2.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState2.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState2.myPlaceInRating : iOptInt3, ((-4293155) & 262144) != 0 ? blackPassMainUIState2.ratingList : list, ((-4293155) & 524288) != 0 ? blackPassMainUIState2.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState2.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState2.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState2.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState2.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState2.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState2.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState2.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState2.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState2.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState2.activatePremiumCounter : intRef2.element, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState2.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState2.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState2.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState2.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState2.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState2.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState2.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState2.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState2.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState2.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState2.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState2.imageDustBitmap : null)));
                } else {
                    try {
                        arrayList2 = new ArrayList();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i7 = 0; i7 < length2; i7++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i7);
                            Intrinsics.checkNotNull(jSONObject2);
                            try {
                                Gson gson2 = new Gson();
                                String string2 = jSONObject2.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                objFromJson2 = gson2.fromJson(StringsKt__StringsKt.trim((CharSequence) string2).toString(), (Class<Object>) HolidayEventsRatingServerModel.class);
                            } catch (Exception e3) {
                                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                                firebaseCrashlytics3.log(e3.toString());
                                firebaseCrashlytics3.recordException(e3);
                                objFromJson2 = null;
                            }
                            if (objFromJson2 != null) {
                                Boxing.boxBoolean(arrayList2.add(objFromJson2));
                            }
                        }
                    } catch (Exception e4) {
                        FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                        firebaseCrashlytics4.log(e4.toString());
                        firebaseCrashlytics4.recordException(e4);
                    }
                    if (arrayList2 != null) {
                        listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        for (Object obj2 : arrayList2) {
                            int i8 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            HolidayEventsRatingServerModel holidayEventsRatingServerModel = (HolidayEventsRatingServerModel) obj2;
                            listEmptyList.add(new CommonRatingModel(holidayEventsRatingServerModel.getNickname(), holidayEventsRatingServerModel.getPoints(), i8, null, null, 24, null));
                            i3 = i8;
                        }
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    list = listEmptyList;
                    mutableStateFlow2 = this.this$0.get_uiState();
                    do {
                        value2 = mutableStateFlow2.getValue();
                        blackPassMainUIState2 = value2;
                    } while (!mutableStateFlow2.compareAndSet(value2, blackPassMainUIState2.copy(((-4293155) & 1) != 0 ? blackPassMainUIState2.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState2.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState2.selectedLayout : i2, ((-4293155) & 8) != 0 ? blackPassMainUIState2.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState2.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState2.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState2.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState2.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState2.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState2.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState2.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState2.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState2.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState2.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState2.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState2.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState2.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState2.myPlaceInRating : iOptInt3, ((-4293155) & 262144) != 0 ? blackPassMainUIState2.ratingList : list, ((-4293155) & 524288) != 0 ? blackPassMainUIState2.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState2.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState2.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState2.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState2.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState2.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState2.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState2.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState2.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState2.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState2.activatePremiumCounter : intRef2.element, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState2.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState2.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState2.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState2.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState2.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState2.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState2.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState2.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState2.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState2.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState2.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState2.imageDustBitmap : null)));
                }
            } else if (i5 == 4) {
                BlackPassMainViewModel blackPassMainViewModel3 = this.this$0;
                ViewModelExtensionKt.launchOnIO$default(blackPassMainViewModel3, null, new AnonymousClass4(this.$json, blackPassMainViewModel3, this.$bpRewards, this.$listOfAwardsTypes, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BlackPassMainViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$4", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        @SourceDebugExtension({"SMAP\nBlackPassMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1001:1\n1#2:1002\n230#3,5:1003\n*S KotlinDebug\n*F\n+ 1 BlackPassMainViewModel.kt\ncom/blackhub/bronline/game/gui/blackpass/viewmodel/BlackPassMainViewModel$updateJson$1$4\n*L\n736#1:1003,5\n*E\n"})
        /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$updateJson$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ List<LevelsInfo> $bpRewards;
            public final /* synthetic */ JSONObject $json;
            public final /* synthetic */ List<BpRewardsAwardsDto> $listOfAwardsTypes;
            public int label;
            public final /* synthetic */ BlackPassMainViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(JSONObject jSONObject, BlackPassMainViewModel blackPassMainViewModel, List<LevelsInfo> list, List<BpRewardsAwardsDto> list2, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$json = jSONObject;
                this.this$0 = blackPassMainViewModel;
                this.$bpRewards = list;
                this.$listOfAwardsTypes = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass4(this.$json, this.this$0, this.$bpRewards, this.$listOfAwardsTypes, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                String string;
                Object next;
                List<String> imageList;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int iOptInt = this.$json.optInt("p");
                if (this.this$0.getUiState().getValue().getIsButtonBuyPremiumEnabled()) {
                    string = this.this$0.getStringResource().getString(R.string.common_string_with_bc, Boxing.boxInt(iOptInt));
                } else {
                    string = this.this$0.getStringResource().getString(R.string.common_bought);
                }
                int iOptInt2 = this.$json.optInt(BlackPassKeys.P_PREMIUM_DELUXE_PRICE);
                String string2 = this.this$0.getStringResource().getString(R.string.common_string_with_bc, UsefulKt.getPriceWithSpaces(Boxing.boxInt(iOptInt2)));
                List<LevelsInfo> list = this.$bpRewards;
                String str = null;
                LevelsInfo levelsInfo = list != null ? (LevelsInfo) CollectionsKt___CollectionsKt.first((List) list) : null;
                String str2 = (String) UtilsKt.buildTypeMerge(levelsInfo != null ? levelsInfo.getName() : null, levelsInfo != null ? levelsInfo.getNameStore() : null);
                String str3 = str2 == null ? "" : str2;
                Bitmap imgOfferSplit = this.this$0.getUiState().getValue().getImgOfferSplit();
                if (imgOfferSplit == null) {
                    imgOfferSplit = BitmapUtilsKt.getPngBitmapFromZip(this.this$0.application, PngConstantsId22.IMG_OFFER_SPLIT, ImageTypePathInCDNEnum.IMAGE);
                }
                Bitmap bitmap = imgOfferSplit;
                Bitmap imgDeluxeCar = this.this$0.getUiState().getValue().getImgDeluxeCar();
                if (imgDeluxeCar == null) {
                    imgDeluxeCar = BitmapUtilsKt.getPngBitmapFromZip(this.this$0.application, PngConstantsId22.IMG_SPLIT_DELUXE_CAR, ImageTypePathInCDNEnum.IMAGE);
                }
                Bitmap bitmap2 = imgDeluxeCar;
                AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.black_pass_premium_subtitle_html));
                AnnotatedString annotatedStringHtmlTextToAnnotatedString2 = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.black_pass_premium_deluxe_subtitle_html));
                AnnotatedString annotatedStringHtmlTextToAnnotatedString3 = StringExtensionKt.htmlTextToAnnotatedString(this.this$0.getStringResource().getString(R.string.banner_title_prize_1_html));
                Iterator<T> it = this.$listOfAwardsTypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((BpRewardsAwardsDto) next).getId() == 21) {
                        break;
                    }
                }
                BpRewardsAwardsDto bpRewardsAwardsDto = (BpRewardsAwardsDto) next;
                if (bpRewardsAwardsDto != null && (imageList = bpRewardsAwardsDto.getImageList()) != null) {
                    str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) imageList);
                }
                String str4 = str == null ? "" : str;
                Bitmap imageDustBitmap = this.this$0.getUiState().getValue().getImageDustBitmap();
                if (imageDustBitmap == null) {
                    imageDustBitmap = BitmapUtilsKt.getBitmapFromZip$default(this.this$0.application, str4, ImageTypePathInCDNEnum.ICON, 0.0f, 0.0f, 24, null);
                }
                Bitmap bitmap3 = imageDustBitmap;
                MutableStateFlow<BlackPassMainUIState> mutableStateFlow = this.this$0.get_uiState();
                while (true) {
                    BlackPassMainUIState value = mutableStateFlow.getValue();
                    BlackPassMainUIState blackPassMainUIState = value;
                    MutableStateFlow<BlackPassMainUIState> mutableStateFlow2 = mutableStateFlow;
                    if (mutableStateFlow2.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : iOptInt, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : string, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : iOptInt2, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : string2, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : bitmap, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : bitmap2, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : str3, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : annotatedStringHtmlTextToAnnotatedString, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : annotatedStringHtmlTextToAnnotatedString2, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : annotatedStringHtmlTextToAnnotatedString3, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : bitmap3))) {
                        return Unit.INSTANCE;
                    }
                    mutableStateFlow = mutableStateFlow2;
                }
            }
        }
    }

    public final void updateJson(@NotNull JSONObject json, int currentLayout, @Nullable List<LevelsInfo> bpRewards, @NotNull List<BpRewardsAwardsDto> listOfAwardsTypes) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(listOfAwardsTypes, "listOfAwardsTypes");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C37391(currentLayout, this, json, bpRewards, listOfAwardsTypes, null), 1, null);
    }

    public final void purchasePremium(int premiumId) throws JSONException {
        this.actionWithJson.purchasePremium(premiumId);
    }

    public final void onCategoryTaskClick(byte categoryId) {
        BlackPassMainUIState value;
        BlackPassMainUIState blackPassMainUIState;
        MutableStateFlow<BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            blackPassMainUIState = value;
        } while (!mutableStateFlow.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : 0, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : categoryId, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null)));
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$onTaskClick$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$onTaskClick$1 */

    public static final class C37341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CommonTaskModel $task;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37341(CommonTaskModel commonTaskModel, Continuation<? super C37341> continuation) {
            super(2, continuation);
            this.$task = commonTaskModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassMainViewModel.this.new C37341(this.$task, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BlackPassMainViewModel.this.actionWithJson.sendTaskPressed(this.$task.getId());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onTaskClick(@NotNull CommonTaskModel task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37341(task, null), 1, null);
    }

    /* compiled from: BlackPassMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$sendExchangeTask$1", m7120f = "BlackPassMainViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.blackpass.viewmodel.BlackPassMainViewModel$sendExchangeTask$1 */

    public static final class C37351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $taskId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37351(int i, Continuation<? super C37351> continuation) {
            super(2, continuation);
            this.$taskId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BlackPassMainViewModel.this.new C37351(this.$taskId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C37351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BlackPassMainViewModel.this.actionWithJson.exchangeTask(this.$taskId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendExchangeTask(int taskId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C37351(taskId, null), 1, null);
    }

    public final void onRefreshRatingClick() throws JSONException {
        this.actionWithJson.sendRefreshRating();
    }

    public final void onShowTaskDialog(@Nullable CommonTaskModel task) {
        this._taskPreviewItem.tryEmit(task);
    }

    public final void updateMyPosition(int myPlaceInRating) {
        BlackPassMainUIState value;
        BlackPassMainUIState blackPassMainUIState;
        MutableStateFlow<BlackPassMainUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            blackPassMainUIState = value;
        } while (!mutableStateFlow.compareAndSet(value, blackPassMainUIState.copy(((-4293155) & 1) != 0 ? blackPassMainUIState.bpLevel : 0, ((-4293155) & 2) != 0 ? blackPassMainUIState.maxBpLevel : 0, ((-4293155) & 4) != 0 ? blackPassMainUIState.selectedLayout : 0, ((-4293155) & 8) != 0 ? blackPassMainUIState.seasonName : null, ((-4293155) & 16) != 0 ? blackPassMainUIState.seasonBg : null, ((-4293155) & 32) != 0 ? blackPassMainUIState.seasonColor : 0, ((-4293155) & 64) != 0 ? blackPassMainUIState.timerDaysAndHours : null, ((-4293155) & 128) != 0 ? blackPassMainUIState.valueOfExperience : 0, ((-4293155) & 256) != 0 ? blackPassMainUIState.maxLevelExp : 0, ((-4293155) & 512) != 0 ? blackPassMainUIState.bpProperties : null, ((-4293155) & 1024) != 0 ? blackPassMainUIState.premiumBitmapImage : null, ((-4293155) & 2048) != 0 ? blackPassMainUIState.seasonBitmapImage : null, ((-4293155) & 4096) != 0 ? blackPassMainUIState.seasonBitmapImageForRewards : null, ((-4293155) & 8192) != 0 ? blackPassMainUIState.vipState : null, ((-4293155) & 16384) != 0 ? blackPassMainUIState.rewardsList : null, ((-4293155) & 32768) != 0 ? blackPassMainUIState.standardLevelArray : null, ((-4293155) & 65536) != 0 ? blackPassMainUIState.premiumLevelArray : null, ((-4293155) & 131072) != 0 ? blackPassMainUIState.myPlaceInRating : myPlaceInRating, ((-4293155) & 262144) != 0 ? blackPassMainUIState.ratingList : null, ((-4293155) & 524288) != 0 ? blackPassMainUIState.ratingBgImage : null, ((-4293155) & 1048576) != 0 ? blackPassMainUIState.bpExpBitmap : null, ((-4293155) & 2097152) != 0 ? blackPassMainUIState.selectedCategoryTask : (byte) 0, ((-4293155) & 4194304) != 0 ? blackPassMainUIState.tasksFromJsonList : null, ((-4293155) & 8388608) != 0 ? blackPassMainUIState.specialTasksList : null, ((-4293155) & 16777216) != 0 ? blackPassMainUIState.dailyTasksList : null, ((-4293155) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? blackPassMainUIState.specialCategoryImageBitmap : null, ((-4293155) & 67108864) != 0 ? blackPassMainUIState.dailyCategoryImageBitmap : null, ((-4293155) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? blackPassMainUIState.weeklyTimerForEndCategory : null, ((-4293155) & 268435456) != 0 ? blackPassMainUIState.imgRubBitmap : null, ((-4293155) & 536870912) != 0 ? blackPassMainUIState.activatePremiumCounter : 0, ((-4293155) & 1073741824) != 0 ? blackPassMainUIState.premiumStatus : 0, ((-4293155) & Integer.MIN_VALUE) != 0 ? blackPassMainUIState.premiumPriceInt : 0, (1023 & 1) != 0 ? blackPassMainUIState.premiumPrice : null, (1023 & 2) != 0 ? blackPassMainUIState.premiumDeluxePriceInt : 0, (1023 & 4) != 0 ? blackPassMainUIState.premiumDeluxePrice : null, (1023 & 8) != 0 ? blackPassMainUIState.imgOfferSplit : null, (1023 & 16) != 0 ? blackPassMainUIState.imgDeluxeCar : null, (1023 & 32) != 0 ? blackPassMainUIState.nameDeluxeCar : null, (1023 & 64) != 0 ? blackPassMainUIState.activatePremiumSubtitle : null, (1023 & 128) != 0 ? blackPassMainUIState.activatePremiumDeluxeSubtitle : null, (1023 & 256) != 0 ? blackPassMainUIState.bannerTitlePrize1 : null, (1023 & 512) != 0 ? blackPassMainUIState.imageDustBitmap : null)));
    }

    public final List<RewardModel> mapRewardsListFromJson(ArrayList<LevelsInfo> standardLevel, ArrayList<LevelsInfo> premiumLevel, boolean isWithVip, int bpLevel, boolean standardIsNotReceived, boolean premiumIsNotReceived, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        ArrayList arrayList = new ArrayList();
        int size = standardLevel.size();
        for (int i = 0; i < size; i++) {
            LevelsInfo levelsInfo = (LevelsInfo) CollectionsKt___CollectionsKt.getOrNull(standardLevel, i);
            if (levelsInfo == null) {
                levelsInfo = new LevelsInfo(0, null, null, null, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 65535, null);
            }
            CommonRewardModel commonRewardModelMapLevelsInfoToRewardModel = mapLevelsInfoToRewardModel(levelsInfo, true, bpLevel, i, standardIsNotReceived, vehiclesList, skinsList, listOfAwardsTypes);
            LevelsInfo levelsInfo2 = (LevelsInfo) CollectionsKt___CollectionsKt.getOrNull(premiumLevel, i);
            if (levelsInfo2 == null) {
                levelsInfo2 = new LevelsInfo(0, null, null, null, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 65535, null);
            }
            arrayList.add(new RewardModel(commonRewardModelMapLevelsInfoToRewardModel, mapLevelsInfoToRewardModel(levelsInfo2, isWithVip, bpLevel, i, premiumIsNotReceived, vehiclesList, skinsList, listOfAwardsTypes)));
        }
        return arrayList;
    }

    public final CommonRewardModel mapLevelsInfoToRewardModel(LevelsInfo levelInfo, boolean isWithVip, int bpLevel, int elementPos, boolean isNotReceived, List<VehiclesDTO> vehiclesList, List<SkinsDTO> skinsList, List<BpRewardsAwardsDto> listOfAwardsTypes) {
        boolean zIsOne = IntExtensionKt.isOne(Integer.valueOf(levelInfo.getTypeReward()));
        CommonRewardState commonRewardStateUpdateRewardState = updateRewardState(bpLevel, elementPos, isWithVip, isNotReceived);
        BaseModel baseModel = new BaseModel(levelInfo.getId(), levelInfo.getTypeId(), levelInfo.getAwardId(), levelInfo.getRenderId(), levelInfo.getName(), levelInfo.getNameStore());
        int id = levelInfo.getId();
        String str = (String) UtilsKt.buildTypeMerge(levelInfo.getName(), levelInfo.getNameStore());
        String str2 = str == null ? "" : str;
        String str3 = (String) UtilsKt.buildTypeMerge(levelInfo.getDescription(), levelInfo.getDescriptionStore());
        return new CommonRewardModel(id, str2, str3 == null ? "" : str3, getStringResource().getString(R.string.common_get), null, levelInfo.getTypeId(), levelInfo.getAwardId(), null, zIsOne, false, 0, commonRewardStateUpdateRewardState, null, false, true, CommonRarityEnum.INSTANCE.fromInt(levelInfo.getRarity()), 0, UtilsKt.setImageModel(baseModel, vehiclesList, skinsList, listOfAwardsTypes), 71312, null);
    }

    public final CommonRewardState updateRewardState(int bpLevel, int elementPos, boolean isWithVip, boolean isNotReceived) {
        int i = elementPos + 1;
        if (bpLevel > i) {
            if (isWithVip) {
                return CommonRewardState.NORM_RECEIVED;
            }
            return CommonRewardState.NORM_NOT_RECEIVED;
        }
        if (bpLevel != i) {
            return CommonRewardState.NORM_NOT_RECEIVED;
        }
        if (!isWithVip) {
            return CommonRewardState.NORM_NOT_RECEIVED;
        }
        if (isNotReceived) {
            return CommonRewardState.NORM_AVAILABLE;
        }
        return CommonRewardState.NORM_RECEIVED;
    }

    public final List<RewardModel> updateRewardsList(int posByLevel) {
        List<RewardModel> rewardsList = get_uiState().getValue().getRewardsList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(rewardsList, 10));
        int i = 0;
        for (Object obj : rewardsList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RewardModel rewardModelCopy = (RewardModel) obj;
            if (posByLevel <= i) {
                CommonRewardState commonRewardStateUpdateRewardState = updateRewardState(posByLevel, i, get_uiState().getValue().isActiveVip(), posByLevel == i);
                CommonRewardState commonRewardStateUpdateRewardState2 = updateRewardState(posByLevel, i, get_uiState().getValue().isActiveVip(), posByLevel == i);
                CommonRewardModel standardReward = rewardModelCopy.getStandardReward();
                CommonRewardModel commonRewardModelCopy = standardReward.copy((262127 & 1) != 0 ? standardReward.rewardId : 0, (262127 & 2) != 0 ? standardReward.rewardName : null, (262127 & 4) != 0 ? standardReward.rewardDescription : null, (262127 & 8) != 0 ? standardReward.bottomText : null, (262127 & 16) != 0 ? standardReward.image : null, (262127 & 32) != 0 ? standardReward.typeId : 0, (262127 & 64) != 0 ? standardReward.awardId : 0, (262127 & 128) != 0 ? standardReward.imageNameFromCdn : null, (262127 & 256) != 0 ? standardReward.isSuperReward : false, (262127 & 512) != 0 ? standardReward.isNeedToShowLvl : false, (262127 & 1024) != 0 ? standardReward.lvl : 0, (262127 & 2048) != 0 ? standardReward.mainRewardState : commonRewardStateUpdateRewardState, (262127 & 4096) != 0 ? standardReward.bonusRewardState : null, (262127 & 8192) != 0 ? standardReward.isCalendarReward : false, (262127 & 16384) != 0 ? standardReward.isBpOrEventsReward : false, (262127 & 32768) != 0 ? standardReward.rarityState : null, (262127 & 65536) != 0 ? standardReward.fromList : 0, (262127 & 131072) != 0 ? standardReward.imageModel : null);
                CommonRewardModel premiumReward = rewardModelCopy.getPremiumReward();
                rewardModelCopy = rewardModelCopy.copy(commonRewardModelCopy, premiumReward.copy((262127 & 1) != 0 ? premiumReward.rewardId : 0, (262127 & 2) != 0 ? premiumReward.rewardName : null, (262127 & 4) != 0 ? premiumReward.rewardDescription : null, (262127 & 8) != 0 ? premiumReward.bottomText : null, (262127 & 16) != 0 ? premiumReward.image : null, (262127 & 32) != 0 ? premiumReward.typeId : 0, (262127 & 64) != 0 ? premiumReward.awardId : 0, (262127 & 128) != 0 ? premiumReward.imageNameFromCdn : null, (262127 & 256) != 0 ? premiumReward.isSuperReward : false, (262127 & 512) != 0 ? premiumReward.isNeedToShowLvl : false, (262127 & 1024) != 0 ? premiumReward.lvl : 0, (262127 & 2048) != 0 ? premiumReward.mainRewardState : commonRewardStateUpdateRewardState2, (262127 & 4096) != 0 ? premiumReward.bonusRewardState : null, (262127 & 8192) != 0 ? premiumReward.isCalendarReward : false, (262127 & 16384) != 0 ? premiumReward.isBpOrEventsReward : false, (262127 & 32768) != 0 ? premiumReward.rarityState : null, (262127 & 65536) != 0 ? premiumReward.fromList : 0, (262127 & 131072) != 0 ? premiumReward.imageModel : null));
            }
            arrayList.add(rewardModelCopy);
            i = i2;
        }
        return arrayList;
    }

    public final void onButtonBuyPremiumClick() {
        showDialogConfirmation$default(this, null, getStringResource().getString(R.string.black_pass_activate_text_body), getUiState().getValue().getPremiumPriceInt(), null, getStringResource().getString(R.string.common_bc), getStringResource().getString(R.string.common_confirmation), getStringResource().getString(R.string.common_yes), getStringResource().getString(R.string.common_no), 3, 9, null);
    }

    public final void onButtonBuyPremiumDeluxeClick() {
        showDialogConfirmation$default(this, null, getStringResource().getString(R.string.black_pass_activate_text_body), getUiState().getValue().getPremiumDeluxePriceInt(), null, getStringResource().getString(R.string.common_bc), getStringResource().getString(R.string.common_confirmation), getStringResource().getString(R.string.common_yes), getStringResource().getString(R.string.common_no), 4, 9, null);
    }
}

