package com.blackhub.bronline.game.gui.fishing;

import android.graphics.Bitmap;
import android.os.CountDownTimer;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.fishing.data.FishingBaitObj;
import com.blackhub.bronline.game.gui.fishing.data.FishingGsonParseObj;
import com.blackhub.bronline.game.gui.fishing.data.enums.AudioType;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FishingViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n230#2,5:395\n230#2,5:400\n230#2,5:405\n230#2,5:410\n230#2,5:416\n230#2,5:421\n230#2,5:426\n230#2,5:431\n1#3:415\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel\n*L\n97#1:395,5\n118#1:400,5\n179#1:405,5\n187#1:410,5\n294#1:416,5\n301#1:421,5\n308#1:426,5\n362#1:431,5\n*E\n"})

public final class FishingViewModel extends BaseViewModel<FishingUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<FishingUiState> _uiState;

    @NotNull
    public final FishingActionWithJSON actionWithJSON;
    public boolean isStartedGenerates;

    @NotNull
    public final MutableStateFlow<List<InvItems>> localInvItems;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @Nullable
    public CountDownTimer timerBaitDescription;

    @Nullable
    public CountDownTimer timerTackleDescription;

    @NotNull
    public final StateFlow<FishingUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public FishingViewModel(@NotNull LocalNotification localNotification, @NotNull StringResource stringResource, @NotNull FishingActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.stringResource = stringResource;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new FishingUiState(0, 0.0f, 0L, 0, 0, 0.0f, 0, null, null, null, 0, null, false, false, false, false, false, false, false, 524287, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.localInvItems = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<FishingUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<FishingUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: FishingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$hookAFish$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$hookAFish$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n230#2,5:395\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$hookAFish$1\n*L\n76#1:395,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$hookAFish$1 */
    public static final class C40461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $offsetState;
        public int label;
        public final /* synthetic */ FishingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40461(boolean z, FishingViewModel fishingViewModel, Continuation<? super C40461> continuation) {
            super(2, continuation);
            this.$offsetState = z;
            this.this$0 = fishingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C40461(this.$offsetState, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FishingUiState value;
            FishingUiState fishingUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$offsetState) {
                this.this$0.startWindowWithProgress();
                this.this$0.actionWithJSON.sendInfoToServer(1);
            } else {
                this.this$0.actionWithJSON.fishingResult(0);
                MutableStateFlow<FishingUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    fishingUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : true, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void hookAFish(boolean offsetState) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C40461(offsetState, this, null), 1, null);
    }

    public final void pullTheFish() {
        FishingUiState value;
        FishingUiState fishingUiState;
        float progressRotate = get_uiState().getValue().getProgressRotate() + 10.799999f;
        boolean z = progressRotate < 40.0f || progressRotate > 145.0f;
        if (z) {
            ViewModelExtensionKt.launchOnIO$default(this, null, new C40501(null), 1, null);
        }
        if (progressRotate >= 180.0f) {
            progressRotate = 180.0f;
        }
        MutableStateFlow<FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            fishingUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : progressRotate, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : z, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
    }

    /* compiled from: FishingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$pullTheFish$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$pullTheFish$1 */
    public static final class C40501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40501(Continuation<? super C40501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FishingViewModel.this.new C40501(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FishingViewModel.this.actionWithJSON.fishingResult(0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void stopAllGeneratesAndTimers() {
        CountDownTimer countDownTimer = this.timerBaitDescription;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timerBaitDescription = null;
        CountDownTimer countDownTimer2 = this.timerTackleDescription;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        this.timerTackleDescription = null;
    }

    public final void closeInterfaceIfNullableJson(@NotNull String errorMessage) throws JSONException {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        showErrorMessage(errorMessage);
        closeInterface();
    }

    public final void closeInterface() {
        FishingUiState value;
        FishingUiState fishingUiState;
        MutableStateFlow<FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            fishingUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : true, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
    }

    /* compiled from: FishingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$closeIfYouLoser$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$closeIfYouLoser$1 */
    public static final class C40451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40451(Continuation<? super C40451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FishingViewModel.this.new C40451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FishingViewModel.this.actionWithJSON.fishingResult(0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeIfYouLoser() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C40451(null), 1, null);
        closeInterface();
    }

    public final void clickBaitDescription() {
        if (get_uiState().getValue().isShowBaitDescription()) {
            CountDownTimer countDownTimer = this.timerBaitDescription;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            isShowBaitDescription(false);
            return;
        }
        isShowBaitDescription(true);
        if (this.timerBaitDescription == null) {
            this.timerBaitDescription = new CountDownTimer() { // from class: com.blackhub.bronline.game.gui.fishing.FishingViewModel.clickBaitDescription.1
                @Override // android.os.CountDownTimer
                public void onTick(long milliseconds) {
                }

                {
                    super(5000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    FishingViewModel.this.isShowBaitDescription(false);
                }
            };
        }
        CountDownTimer countDownTimer2 = this.timerBaitDescription;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
    }

    public final void clickTackleDescription() {
        if (get_uiState().getValue().isShowTackleDescription()) {
            CountDownTimer countDownTimer = this.timerTackleDescription;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            isShowTackleDescription(false);
            return;
        }
        isShowTackleDescription(true);
        if (this.timerTackleDescription == null) {
            this.timerTackleDescription = new CountDownTimer() { // from class: com.blackhub.bronline.game.gui.fishing.FishingViewModel.clickTackleDescription.1
                @Override // android.os.CountDownTimer
                public void onTick(long milliseconds) {
                }

                {
                    super(5000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    FishingViewModel.this.isShowTackleDescription(false);
                }
            };
        }
        CountDownTimer countDownTimer2 = this.timerTackleDescription;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
    }

    public final void refreshPlayer() {
        FishingUiState value;
        FishingUiState fishingUiState;
        MutableStateFlow<FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            fishingUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
    }

    public final void startAudioIfStartFishing() {
        FishingUiState value;
        FishingUiState fishingUiState;
        MutableStateFlow<FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            fishingUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : AudioType.FISHING_FISH_BIT, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : true, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
    }

    /* compiled from: FishingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$initFishingObjects$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$initFishingObjects$1\n+ 2 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n8#2,9:395\n230#3,5:404\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$initFishingObjects$1\n*L\n198#1:395,9\n206#1:404,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$initFishingObjects$1 */
    public static final class C40471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<InvItems> $invItems;
        public final /* synthetic */ JSONObject $json;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40471(List<InvItems> list, JSONObject jSONObject, Continuation<? super C40471> continuation) {
            super(2, continuation);
            this.$invItems = list;
            this.$json = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FishingViewModel.this.new C40471(this.$invItems, this.$json, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objFromJson;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FishingViewModel.this.localInvItems.setValue(this.$invItems);
                JSONObject jSONObject = this.$json;
                try {
                    Gson gson = new Gson();
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) FishingGsonParseObj.class);
                } catch (Exception e) {
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    firebaseCrashlytics.log(e.toString());
                    firebaseCrashlytics.recordException(e);
                    objFromJson = null;
                }
                FishingGsonParseObj fishingGsonParseObj = (FishingGsonParseObj) objFromJson;
                if (fishingGsonParseObj != null && IntExtensionKt.isNotZero(Boxing.boxInt(fishingGsonParseObj.getProgressTime()))) {
                    int progressTime = (int) (100 / (fishingGsonParseObj.getProgressTime() / 100));
                    float speed = fishingGsonParseObj.getSpeed() * 1.8f;
                    FishingViewModel.this.checkAndRender(fishingGsonParseObj, this.$invItems);
                    MutableStateFlow<FishingUiState> mutableStateFlow = FishingViewModel.this.get_uiState();
                    while (true) {
                        FishingUiState value = mutableStateFlow.getValue();
                        FishingUiState fishingUiState = value;
                        long fishingTime = fishingGsonParseObj.getFishingTime();
                        int progressTime2 = fishingGsonParseObj.getProgressTime();
                        FishingGsonParseObj fishingGsonParseObj2 = fishingGsonParseObj;
                        MutableStateFlow<FishingUiState> mutableStateFlow2 = mutableStateFlow;
                        if (mutableStateFlow2.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 1, (458751 & 2) != 0 ? fishingUiState.fishFallStep : speed, (458751 & 4) != 0 ? fishingUiState.fishingTimer : fishingTime, (458751 & 8) != 0 ? fishingUiState.progressTimer : progressTime2, (458751 & 16) != 0 ? fishingUiState.progressStep : progressTime, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : true, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false))) {
                            break;
                        }
                        mutableStateFlow = mutableStateFlow2;
                        fishingGsonParseObj = fishingGsonParseObj2;
                    }
                } else {
                    FishingViewModel fishingViewModel = FishingViewModel.this;
                    fishingViewModel.closeInterfaceIfNullableJson(fishingViewModel.getStringResource().errorWithCode(3));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initFishingObjects(@NotNull JSONObject json, @NotNull List<InvItems> invItems) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(invItems, "invItems");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C40471(invItems, json, null), 1, null);
    }

    public final void checkAndRender(FishingGsonParseObj fishingObj, List<InvItems> invItems) {
        Object next;
        Object next2;
        FishingBaitObj bait = fishingObj.getBait();
        Object obj = null;
        if (bait != null && bait.getImageType() == 1) {
            Iterator<T> it = invItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (((InvItems) next2).getModelid() == bait.getModelId()) {
                        break;
                    }
                }
            }
            InvItems invItems2 = (InvItems) next2;
            if (invItems2 != null) {
                renderObjectAndUpdateState(bait, 0, invItems2);
            }
        }
        FishingBaitObj tackle = fishingObj.getTackle();
        if (tackle != null && tackle.getImageType() == 1) {
            Iterator<T> it2 = invItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((InvItems) next).getModelid() == tackle.getModelId()) {
                        break;
                    }
                }
            }
            InvItems invItems3 = (InvItems) next;
            if (invItems3 != null) {
                renderObjectAndUpdateState(tackle, 1, invItems3);
            }
        }
        FishingBaitObj fish = fishingObj.getFish();
        if (fish.getImageType() == 1) {
            Iterator<T> it3 = invItems.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((InvItems) next3).getModelid() == fish.getModelId()) {
                    obj = next3;
                    break;
                }
            }
            InvItems invItems4 = (InvItems) obj;
            if (invItems4 != null) {
                renderObjectAndUpdateState(fish, 2, invItems4);
            }
        }
    }

    public final void renderObjectAndUpdateState(final FishingBaitObj fishingBaitObj, final int typeOfObject, InvItems objectFromInv) {
        GameRender.getInstance().RequestRender(0, objectFromInv.getId(), objectFromInv.getModelid(), 3, 3, 20.0f, 180.0f, 45.0f, 0.78f, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.fishing.FishingViewModel$$ExternalSyntheticLambda0
            @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
            public final void OnRenderComplete(int i, Bitmap bitmap) {
                FishingViewModel.renderObjectAndUpdateState$lambda$13(fishingBaitObj, this, typeOfObject, i, bitmap);
            }
        });
    }

    public static final void renderObjectAndUpdateState$lambda$13(FishingBaitObj fishingBaitObj, FishingViewModel this$0, int i, int i2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(fishingBaitObj, "$fishingBaitObj");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bitmap);
        fishingBaitObj.setBitmapRender(AndroidImageBitmap_androidKt.asImageBitmap(bitmap));
        this$0.updateStateAfterRender(fishingBaitObj, i);
    }

    public final void updateStateAfterRender(FishingBaitObj fishingBaitObj, int typeOfObject) {
        FishingUiState value;
        FishingUiState fishingUiState;
        FishingUiState value2;
        FishingUiState fishingUiState2;
        FishingUiState value3;
        FishingUiState fishingUiState3;
        if (typeOfObject == 0) {
            MutableStateFlow<FishingUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                fishingUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : fishingBaitObj, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
            return;
        }
        if (typeOfObject == 1) {
            MutableStateFlow<FishingUiState> mutableStateFlow2 = get_uiState();
            do {
                value2 = mutableStateFlow2.getValue();
                fishingUiState2 = value2;
            } while (!mutableStateFlow2.compareAndSet(value2, fishingUiState2.copy((458751 & 1) != 0 ? fishingUiState2.screen : 0, (458751 & 2) != 0 ? fishingUiState2.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState2.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState2.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState2.progressStep : 0, (458751 & 32) != 0 ? fishingUiState2.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState2.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState2.baitObj : null, (458751 & 256) != 0 ? fishingUiState2.tackleObj : fishingBaitObj, (458751 & 512) != 0 ? fishingUiState2.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState2.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState2.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState2.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState2.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState2.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState2.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState2.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState2.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState2.isShowTackleDescription : false)));
            return;
        }
        if (typeOfObject != 2) {
            return;
        }
        MutableStateFlow<FishingUiState> mutableStateFlow3 = get_uiState();
        do {
            value3 = mutableStateFlow3.getValue();
            fishingUiState3 = value3;
        } while (!mutableStateFlow3.compareAndSet(value3, fishingUiState3.copy((458751 & 1) != 0 ? fishingUiState3.screen : 0, (458751 & 2) != 0 ? fishingUiState3.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState3.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState3.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState3.progressStep : 0, (458751 & 32) != 0 ? fishingUiState3.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState3.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState3.baitObj : null, (458751 & 256) != 0 ? fishingUiState3.tackleObj : null, (458751 & 512) != 0 ? fishingUiState3.fishingObj : fishingBaitObj, (458751 & 1024) != 0 ? fishingUiState3.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState3.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState3.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState3.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState3.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState3.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState3.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState3.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState3.isShowTackleDescription : false)));
    }

    public final void startWindowWithProgress() {
        FishingUiState value;
        FishingUiState fishingUiState;
        this.isStartedGenerates = true;
        ViewModelExtensionKt.launchOnMain$default(this, null, new C40511(null), 1, null);
        MutableStateFlow<FishingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            fishingUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 1, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : true, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
    }

    /* compiled from: FishingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$startWindowWithProgress$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {321}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$startWindowWithProgress$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n230#2,5:395\n230#2,5:400\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$startWindowWithProgress$1\n*L\n342#1:395,5\n351#1:400,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$startWindowWithProgress$1 */
    public static final class C40511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C40511(Continuation<? super C40511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FishingViewModel.this.new C40511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:14:0x002f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FishingUiState value;
            FishingUiState fishingUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (FishingViewModel.this.isStartedGenerates) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                float progressRotate = FishingViewModel.this.get_uiState().getValue().getProgressRotate() - FishingViewModel.this.get_uiState().getValue().getFishFallStep();
                int i3 = progressRotate >= 40.0f ? i2 : 0;
                if (i3 != 0) {
                    FishingViewModel fishingViewModel = FishingViewModel.this;
                    ViewModelExtensionKt.launchOnIO$default(fishingViewModel, null, new AnonymousClass1(fishingViewModel, null), i2, null);
                    FishingViewModel.this.isStartedGenerates = false;
                }
                if (progressRotate <= 0.0f) {
                    progressRotate = 0.0f;
                }
                int newLinearProgress = FishingViewModel.this.get_uiState().getValue().getNewLinearProgress();
                if (newLinearProgress < 100) {
                    FishingViewModel.this.stopAllGeneratesAndTimers();
                    FishingViewModel.this.actionWithJSON.fishingResult(i2);
                    FishingViewModel.this.isStartedGenerates = false;
                    MutableStateFlow<FishingUiState> mutableStateFlow = FishingViewModel.this.get_uiState();
                    do {
                        value = mutableStateFlow.getValue();
                        fishingUiState = value;
                    } while (!mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 3, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : newLinearProgress, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : true, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : true, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false)));
                } else {
                    MutableStateFlow<FishingUiState> mutableStateFlow2 = FishingViewModel.this.get_uiState();
                    while (true) {
                        FishingUiState value2 = mutableStateFlow2.getValue();
                        FishingUiState fishingUiState2 = value2;
                        int i4 = newLinearProgress;
                        if (mutableStateFlow2.compareAndSet(value2, fishingUiState2.copy((458751 & 1) != 0 ? fishingUiState2.screen : 0, (458751 & 2) != 0 ? fishingUiState2.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState2.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState2.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState2.progressStep : 0, (458751 & 32) != 0 ? fishingUiState2.progressRotate : progressRotate, (458751 & 64) != 0 ? fishingUiState2.currentProgress : i4, (458751 & 128) != 0 ? fishingUiState2.baitObj : null, (458751 & 256) != 0 ? fishingUiState2.tackleObj : null, (458751 & 512) != 0 ? fishingUiState2.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState2.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState2.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState2.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState2.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState2.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState2.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState2.isNeedClose : i3, (458751 & 131072) != 0 ? fishingUiState2.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState2.isShowTackleDescription : false))) {
                            break;
                        }
                        newLinearProgress = i4;
                    }
                }
                i2 = 1;
                if (FishingViewModel.this.isStartedGenerates) {
                    this.label = i2;
                    if (DelayKt.delay(100L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    float progressRotate2 = FishingViewModel.this.get_uiState().getValue().getProgressRotate() - FishingViewModel.this.get_uiState().getValue().getFishFallStep();
                    if (progressRotate2 >= 40.0f) {
                    }
                    if (i3 != 0) {
                    }
                    if (progressRotate2 <= 0.0f) {
                    }
                    int newLinearProgress2 = FishingViewModel.this.get_uiState().getValue().getNewLinearProgress();
                    if (newLinearProgress2 < 100) {
                    }
                    i2 = 1;
                    if (FishingViewModel.this.isStartedGenerates) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* compiled from: FishingViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$startWindowWithProgress$1$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$startWindowWithProgress$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ FishingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FishingViewModel fishingViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = fishingViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.actionWithJSON.fishingResult(0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void showErrorMessage(String message) throws JSONException {
        getLocalNotification().showErrorNotification(message);
    }

    /* compiled from: FishingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$isShowBaitDescription$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$isShowBaitDescription$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n230#2,5:395\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$isShowBaitDescription$1\n*L\n377#1:395,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$isShowBaitDescription$1 */
    public static final class C40481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isShowing;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40481(boolean z, Continuation<? super C40481> continuation) {
            super(2, continuation);
            this.$isShowing = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FishingViewModel.this.new C40481(this.$isShowing, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<FishingUiState> mutableStateFlow = FishingViewModel.this.get_uiState();
            boolean z = this.$isShowing;
            while (true) {
                FishingUiState value = mutableStateFlow.getValue();
                FishingUiState fishingUiState = value;
                boolean z2 = z;
                if (mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : z2, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : false))) {
                    return Unit.INSTANCE;
                }
                z = z2;
            }
        }
    }

    public final void isShowBaitDescription(boolean isShowing) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C40481(isShowing, null), 1, null);
    }

    /* compiled from: FishingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.fishing.FishingViewModel$isShowTackleDescription$1", m7120f = "FishingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFishingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$isShowTackleDescription$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,394:1\n230#2,5:395\n*S KotlinDebug\n*F\n+ 1 FishingViewModel.kt\ncom/blackhub/bronline/game/gui/fishing/FishingViewModel$isShowTackleDescription$1\n*L\n387#1:395,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.fishing.FishingViewModel$isShowTackleDescription$1 */
    public static final class C40491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isShowing;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40491(boolean z, Continuation<? super C40491> continuation) {
            super(2, continuation);
            this.$isShowing = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FishingViewModel.this.new C40491(this.$isShowing, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<FishingUiState> mutableStateFlow = FishingViewModel.this.get_uiState();
            boolean z = this.$isShowing;
            while (true) {
                FishingUiState value = mutableStateFlow.getValue();
                FishingUiState fishingUiState = value;
                boolean z2 = z;
                if (mutableStateFlow.compareAndSet(value, fishingUiState.copy((458751 & 1) != 0 ? fishingUiState.screen : 0, (458751 & 2) != 0 ? fishingUiState.fishFallStep : 0.0f, (458751 & 4) != 0 ? fishingUiState.fishingTimer : 0L, (458751 & 8) != 0 ? fishingUiState.progressTimer : 0, (458751 & 16) != 0 ? fishingUiState.progressStep : 0, (458751 & 32) != 0 ? fishingUiState.progressRotate : 0.0f, (458751 & 64) != 0 ? fishingUiState.currentProgress : 0, (458751 & 128) != 0 ? fishingUiState.baitObj : null, (458751 & 256) != 0 ? fishingUiState.tackleObj : null, (458751 & 512) != 0 ? fishingUiState.fishingObj : null, (458751 & 1024) != 0 ? fishingUiState.currentOffsetState : 0, (458751 & 2048) != 0 ? fishingUiState.fishingAudioType : null, (458751 & 4096) != 0 ? fishingUiState.isNeedNullableMediaPlayer : false, (458751 & 8192) != 0 ? fishingUiState.isNeedPlaySound : false, (458751 & 16384) != 0 ? fishingUiState.isHideFloat : false, (458751 & 32768) != 0 ? fishingUiState.isHideProgress : false, (458751 & 65536) != 0 ? fishingUiState.isNeedClose : false, (458751 & 131072) != 0 ? fishingUiState.isShowBaitDescription : false, (458751 & 262144) != 0 ? fishingUiState.isShowTackleDescription : z2))) {
                    return Unit.INSTANCE;
                }
                z = z2;
            }
        }
    }

    public final void isShowTackleDescription(boolean isShowing) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C40491(isShowing, null), 1, null);
    }
}

