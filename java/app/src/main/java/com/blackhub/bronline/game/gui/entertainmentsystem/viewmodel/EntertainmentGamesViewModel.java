package com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequestKt;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentGameData;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.EntertainmentPlayersData;
import com.blackhub.bronline.game.gui.entertainmentsystem.data.NickAndTopPosAndGamePointerForCurrentPlayer;
import com.blackhub.bronline.game.gui.entertainmentsystem.network.EntertainmentSystemActionsWithJSON;
import com.blackhub.bronline.game.gui.entertainmentsystem.utils.EntertainmentConstants;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EntertainmentGamesViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class EntertainmentGamesViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final EntertainmentSystemActionsWithJSON actionWithJson;

    @NotNull
    public final SharedFlow<List<EntertainmentGameData>> allGames;

    @NotNull
    public final StateFlow<List<Integer>> allQueue;

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> allTopList;

    @NotNull
    public final StateFlow<EntertainmentGameData> clickedGame;
    public int counter;

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> currentPlayerTop;
    public boolean ifFillTop;

    @NotNull
    public final SharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> infoAboutCurrentPlayer;

    @NotNull
    public final StateFlow<Boolean> isVisibleButtonInfo;

    @NotNull
    public final MutableSharedFlow<List<EntertainmentGameData>> mutableAllGames;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableAllTopList;

    @NotNull
    public final MutableStateFlow<EntertainmentGameData> mutableClickedGame;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableCurrentPlayerTop;

    @NotNull
    public final MutableSharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> mutableInfoAboutCurrentPLayer;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsVisibleButtonInfo;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableQueue;

    @NotNull
    public final MutableStateFlow<Integer> mutableSavedGameIdForTop;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop0;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop1;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop2;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop3;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop4;

    @NotNull
    public final MutableStateFlow<List<EntertainmentPlayersData>> mutableTop5;

    @NotNull
    public final SharedFlow<Integer> updateGameStatusForID;

    @NotNull
    public final MutableSharedFlow<Integer> updateGameStatusForIDMutable;

    @Inject
    public EntertainmentGamesViewModel(@NotNull EntertainmentSystemActionsWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
        MutableSharedFlow<List<EntertainmentGameData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableAllGames = mutableSharedFlowMutableSharedFlow$default;
        this.allGames = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<List<Integer>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableQueue = MutableStateFlow;
        this.allQueue = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableIsVisibleButtonInfo = MutableStateFlow2;
        this.isVisibleButtonInfo = MutableStateFlow2;
        MutableStateFlow<EntertainmentGameData> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.mutableClickedGame = MutableStateFlow3;
        this.clickedGame = MutableStateFlow3;
        this.mutableSavedGameIdForTop = StateFlowKt.MutableStateFlow(null);
        this.mutableTop0 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop1 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop3 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop4 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableTop5 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        MutableStateFlow<List<EntertainmentPlayersData>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableAllTopList = MutableStateFlow4;
        this.allTopList = MutableStateFlow4;
        MutableSharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableInfoAboutCurrentPLayer = mutableSharedFlowMutableSharedFlow$default2;
        this.infoAboutCurrentPlayer = mutableSharedFlowMutableSharedFlow$default2;
        MutableStateFlow<List<EntertainmentPlayersData>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableCurrentPlayerTop = MutableStateFlow5;
        this.currentPlayerTop = MutableStateFlow5;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.updateGameStatusForIDMutable = mutableSharedFlowMutableSharedFlow$default3;
        this.updateGameStatusForID = mutableSharedFlowMutableSharedFlow$default3;
    }

    @NotNull
    public final SharedFlow<List<EntertainmentGameData>> getAllGames() {
        return this.allGames;
    }

    @NotNull
    public final StateFlow<List<Integer>> getAllQueue() {
        return this.allQueue;
    }

    @NotNull
    public final StateFlow<Boolean> isVisibleButtonInfo() {
        return this.isVisibleButtonInfo;
    }

    @NotNull
    public final StateFlow<EntertainmentGameData> getClickedGame() {
        return this.clickedGame;
    }

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> getAllTopList() {
        return this.allTopList;
    }

    @NotNull
    public final SharedFlow<NickAndTopPosAndGamePointerForCurrentPlayer> getInfoAboutCurrentPlayer() {
        return this.infoAboutCurrentPlayer;
    }

    @NotNull
    public final StateFlow<List<EntertainmentPlayersData>> getCurrentPlayerTop() {
        return this.currentPlayerTop;
    }

    @NotNull
    public final SharedFlow<Integer> getUpdateGameStatusForID() {
        return this.updateGameStatusForID;
    }

    /* compiled from: EntertainmentGamesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$onPacketIncoming$1", m7120f = "EntertainmentGamesViewModel.kt", m7121i = {0, 0}, m7122l = {122, 125}, m7123m = "invokeSuspend", m7124n = {"myTopPos", "myGamePointer"}, m7125s = {"L$0", "L$1"})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$onPacketIncoming$1 */

    public static final class C40131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ EntertainmentGamesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40131(JSONObject jSONObject, EntertainmentGamesViewModel entertainmentGamesViewModel, Continuation<? super C40131> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = entertainmentGamesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C40131(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x014b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            JSONArray jSONArrayOptJSONArray;
            JSONArray jSONArrayOptJSONArray2;
            NickAndTopPosAndGamePointerForCurrentPlayer nickAndTopPosAndGamePointerForCurrentPlayer;
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JSONArray jSONArrayOptJSONArray3 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_PLAYERS_PERIODICALLY);
                if (jSONArrayOptJSONArray3 != null) {
                    this.this$0.updateQueue(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_0);
                if (jSONArrayOptJSONArray4 != null) {
                    EntertainmentGamesViewModel entertainmentGamesViewModel = this.this$0;
                    entertainmentGamesViewModel.mutableTop0.setValue(entertainmentGamesViewModel.generateFinalTopList(JsonArrayExtensionKt.toMutableAnyList(jSONArrayOptJSONArray4), 0));
                    entertainmentGamesViewModel.startFillCheckerForTopList();
                }
                JSONArray jSONArrayOptJSONArray5 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_1);
                if (jSONArrayOptJSONArray5 != null) {
                    EntertainmentGamesViewModel entertainmentGamesViewModel2 = this.this$0;
                    entertainmentGamesViewModel2.mutableTop1.setValue(entertainmentGamesViewModel2.generateFinalTopList(JsonArrayExtensionKt.toMutableAnyList(jSONArrayOptJSONArray5), 1));
                    entertainmentGamesViewModel2.startFillCheckerForTopList();
                }
                JSONArray jSONArrayOptJSONArray6 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_2);
                if (jSONArrayOptJSONArray6 != null) {
                    EntertainmentGamesViewModel entertainmentGamesViewModel3 = this.this$0;
                    entertainmentGamesViewModel3.mutableTop2.setValue(entertainmentGamesViewModel3.generateFinalTopList(JsonArrayExtensionKt.toMutableAnyList(jSONArrayOptJSONArray6), 2));
                    entertainmentGamesViewModel3.startFillCheckerForTopList();
                }
                JSONArray jSONArrayOptJSONArray7 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_3);
                if (jSONArrayOptJSONArray7 != null) {
                    EntertainmentGamesViewModel entertainmentGamesViewModel4 = this.this$0;
                    entertainmentGamesViewModel4.mutableTop3.setValue(entertainmentGamesViewModel4.generateFinalTopList(JsonArrayExtensionKt.toMutableAnyList(jSONArrayOptJSONArray7), 3));
                    entertainmentGamesViewModel4.startFillCheckerForTopList();
                }
                JSONArray jSONArrayOptJSONArray8 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_4);
                if (jSONArrayOptJSONArray8 != null) {
                    EntertainmentGamesViewModel entertainmentGamesViewModel5 = this.this$0;
                    entertainmentGamesViewModel5.mutableTop4.setValue(entertainmentGamesViewModel5.generateFinalTopList(JsonArrayExtensionKt.toMutableAnyList(jSONArrayOptJSONArray8), 4));
                    entertainmentGamesViewModel5.startFillCheckerForTopList();
                }
                JSONArray jSONArrayOptJSONArray9 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_TOP_PLAYERS_5);
                if (jSONArrayOptJSONArray9 != null) {
                    EntertainmentGamesViewModel entertainmentGamesViewModel6 = this.this$0;
                    entertainmentGamesViewModel6.mutableTop5.setValue(entertainmentGamesViewModel6.generateFinalTopList(JsonArrayExtensionKt.toMutableAnyList(jSONArrayOptJSONArray9), 5));
                    entertainmentGamesViewModel6.startFillCheckerForTopList();
                }
                jSONArrayOptJSONArray = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_CURRENT_TOP_POSITION);
                jSONArrayOptJSONArray2 = this.$json.optJSONArray(EntertainmentConstants.KEY_GET_ARR_WITH_CURRENT_TOP_GAMES);
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.mutableInfoAboutCurrentPLayer;
                    this.L$0 = jSONArrayOptJSONArray;
                    this.L$1 = jSONArrayOptJSONArray2;
                    this.label = 1;
                    obj = FlowKt.first(mutableSharedFlow2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nickAndTopPosAndGamePointerForCurrentPlayer = (NickAndTopPosAndGamePointerForCurrentPlayer) obj;
                    Intrinsics.checkNotNull(jSONArrayOptJSONArray);
                    nickAndTopPosAndGamePointerForCurrentPlayer.setTopPos(JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray));
                    Intrinsics.checkNotNull(jSONArrayOptJSONArray2);
                    nickAndTopPosAndGamePointerForCurrentPlayer.setGamePointer(JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray2));
                    mutableSharedFlow = this.this$0.mutableInfoAboutCurrentPLayer;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (mutableSharedFlow.emit(nickAndTopPosAndGamePointerForCurrentPlayer, this) == coroutine_suspended) {
                    }
                }
            } else if (i == 1) {
                jSONArrayOptJSONArray2 = (JSONArray) this.L$1;
                jSONArrayOptJSONArray = (JSONArray) this.L$0;
                ResultKt.throwOnFailure(obj);
                nickAndTopPosAndGamePointerForCurrentPlayer = (NickAndTopPosAndGamePointerForCurrentPlayer) obj;
                Intrinsics.checkNotNull(jSONArrayOptJSONArray);
                nickAndTopPosAndGamePointerForCurrentPlayer.setTopPos(JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray));
                Intrinsics.checkNotNull(jSONArrayOptJSONArray2);
                nickAndTopPosAndGamePointerForCurrentPlayer.setGamePointer(JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray2));
                mutableSharedFlow = this.this$0.mutableInfoAboutCurrentPLayer;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (mutableSharedFlow.emit(nickAndTopPosAndGamePointerForCurrentPlayer, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.$json.optInt("t") == 1) {
                this.this$0.updateGameStatus(this.$json.optInt("g"));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C40131(json, this, null), 2, null);
    }

    public final void startFillCheckerForTopList() {
        int i = this.counter + 1;
        this.counter = i;
        if (i == 6) {
            this.ifFillTop = true;
        }
    }

    public final void updateQueue(JSONArray array) {
        this.mutableQueue.setValue(JsonArrayExtensionKt.toMutableIntList(array));
    }

    /* compiled from: EntertainmentGamesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$updateGameStatus$1", m7120f = "EntertainmentGamesViewModel.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_SPL}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$updateGameStatus$1 */

    public static final class C40161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $gameId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40161(int i, Continuation<? super C40161> continuation) {
            super(2, continuation);
            this.$gameId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EntertainmentGamesViewModel.this.new C40161(this.$gameId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = EntertainmentGamesViewModel.this.updateGameStatusForIDMutable;
                Integer numBoxInt = Boxing.boxInt(this.$gameId);
                this.label = 1;
                if (mutableSharedFlow.emit(numBoxInt, this) == coroutine_suspended) {
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

    public final void updateGameStatus(int gameId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40161(gameId, null), 3, null);
    }

    /* compiled from: EntertainmentGamesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$initGamesList$1", m7120f = "EntertainmentGamesViewModel.kt", m7121i = {0}, m7122l = {181}, m7123m = "invokeSuspend", m7124n = {"newQueue"}, m7125s = {"L$1"})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$initGamesList$1 */

    public static final class C40121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String[] $allDescriptions;
        public final /* synthetic */ String[] $allTitles;
        public final /* synthetic */ JSONArray $array;
        public final /* synthetic */ List<Integer> $resources;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ EntertainmentGamesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40121(JSONArray jSONArray, String[] strArr, String[] strArr2, List<Integer> list, EntertainmentGamesViewModel entertainmentGamesViewModel, Continuation<? super C40121> continuation) {
            super(2, continuation);
            this.$array = jSONArray;
            this.$allTitles = strArr;
            this.$allDescriptions = strArr2;
            this.$resources = list;
            this.this$0 = entertainmentGamesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C40121(this.$array, this.$allTitles, this.$allDescriptions, this.$resources, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            EntertainmentGamesViewModel entertainmentGamesViewModel;
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JSONArray jSONArray = this.$array;
                if (jSONArray != null) {
                    String[] strArr = this.$allTitles;
                    String[] strArr2 = this.$allDescriptions;
                    List<Integer> list2 = this.$resources;
                    EntertainmentGamesViewModel entertainmentGamesViewModel2 = this.this$0;
                    List<Integer> mutableIntList = JsonArrayExtensionKt.toMutableIntList(jSONArray);
                    if (mutableIntList.size() == strArr.length && mutableIntList.size() == strArr2.length && mutableIntList.size() == list2.size()) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = mutableIntList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            arrayList2.add(new EntertainmentGameData(i2, strArr[i2], list2.get(i2).intValue(), mutableIntList.get(i2).intValue(), 0, strArr2[i2], false, 64, null));
                            arrayList.add(Boxing.boxInt(0));
                        }
                        MutableSharedFlow mutableSharedFlow = entertainmentGamesViewModel2.mutableAllGames;
                        this.L$0 = entertainmentGamesViewModel2;
                        this.L$1 = arrayList;
                        this.label = 1;
                        if (mutableSharedFlow.emit(arrayList2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        entertainmentGamesViewModel = entertainmentGamesViewModel2;
                        list = arrayList;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$1;
            entertainmentGamesViewModel = (EntertainmentGamesViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            entertainmentGamesViewModel.mutableQueue.setValue(list);
            return Unit.INSTANCE;
        }
    }

    public final void initGamesList(@Nullable JSONArray array, @NotNull String[] allTitles, @NotNull String[] allDescriptions, @NotNull List<Integer> resources) {
        Intrinsics.checkNotNullParameter(allTitles, "allTitles");
        Intrinsics.checkNotNullParameter(allDescriptions, "allDescriptions");
        Intrinsics.checkNotNullParameter(resources, "resources");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C40121(array, allTitles, allDescriptions, resources, this, null), 2, null);
    }

    /* compiled from: EntertainmentGamesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$setPlayersNick$1", m7120f = "EntertainmentGamesViewModel.kt", m7121i = {}, m7122l = {192}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$setPlayersNick$1 */

    public static final class C40141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $nick;
        public int label;
        public final /* synthetic */ EntertainmentGamesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40141(String str, EntertainmentGamesViewModel entertainmentGamesViewModel, Continuation<? super C40141> continuation) {
            super(2, continuation);
            this.$nick = str;
            this.this$0 = entertainmentGamesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C40141(this.$nick, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$nick;
                if (str == null) {
                    str = "";
                }
                NickAndTopPosAndGamePointerForCurrentPlayer nickAndTopPosAndGamePointerForCurrentPlayer = new NickAndTopPosAndGamePointerForCurrentPlayer(str, CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
                MutableSharedFlow mutableSharedFlow = this.this$0.mutableInfoAboutCurrentPLayer;
                this.label = 1;
                if (mutableSharedFlow.emit(nickAndTopPosAndGamePointerForCurrentPlayer, this) == coroutine_suspended) {
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

    public final void setPlayersNick(@Nullable String nick) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40141(nick, this, null), 3, null);
    }

    public final void setVisibleButtonInfo(boolean isVisible) {
        MutableStateFlow<Boolean> mutableStateFlow = this.mutableIsVisibleButtonInfo;
        if (!isVisible || this.mutableClickedGame.getValue() == null) {
            isVisible = false;
        }
        mutableStateFlow.setValue(Boolean.valueOf(isVisible));
    }

    public final void checkCurrentGame(@NotNull EntertainmentGameData game) {
        Intrinsics.checkNotNullParameter(game, "game");
        this.mutableClickedGame.setValue(game);
    }

    public final void saveGameIdForTop(@Nullable Integer gameId) {
        this.mutableSavedGameIdForTop.setValue(gameId);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<EntertainmentPlayersData> generateFinalTopList(List<Object> listAny, int gameId) {
        int i;
        int i2;
        int i3;
        int i4;
        int iIntValue;
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        int i6 = 1;
        int i7 = 0;
        while (i7 < listAny.size()) {
            if (i5 == 1) {
                i = R.drawable.ic_top_1_left_bracket;
                i2 = R.drawable.ic_top_1_right_bracket;
            } else if (i5 == 2) {
                i = R.drawable.ic_top_2_left_bracket;
                i2 = R.drawable.ic_top_2_right_bracket;
            } else if (i5 != 3) {
                i3 = 0;
                i4 = 0;
                Object obj = listAny.get(i6);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) obj).intValue();
                if (iIntValue != 0) {
                    strValueOf = "-";
                } else {
                    strValueOf = String.valueOf(iIntValue);
                }
                String str = strValueOf;
                Object obj2 = listAny.get(i7);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(new EntertainmentPlayersData(i5, (String) obj2, gameId, str, i3, i4));
                i5++;
                i7 += 2;
                i6 += 2;
            } else {
                i = R.drawable.ic_top_3_left_bracket;
                i2 = R.drawable.ic_top_3_right_bracket;
            }
            i3 = i;
            i4 = i2;
            Object obj3 = listAny.get(i6);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            iIntValue = ((Integer) obj3).intValue();
            if (iIntValue != 0) {
            }
            String str2 = strValueOf;
            Object obj22 = listAny.get(i7);
            Intrinsics.checkNotNull(obj22, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(new EntertainmentPlayersData(i5, (String) obj22, gameId, str2, i3, i4));
            i5++;
            i7 += 2;
            i6 += 2;
        }
        return arrayList;
    }

    /* compiled from: EntertainmentGamesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$showCurrentGameTop$1", m7120f = "EntertainmentGamesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$showCurrentGameTop$1 */

    public static final class C40151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Integer $gameId;
        public int label;
        public final /* synthetic */ EntertainmentGamesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40151(Integer num, EntertainmentGamesViewModel entertainmentGamesViewModel, Continuation<? super C40151> continuation) {
            super(2, continuation);
            this.$gameId = num;
            this.this$0 = entertainmentGamesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C40151(this.$gameId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Integer num = this.$gameId;
            int iIntValue = (num == null && (num = (Integer) this.this$0.mutableSavedGameIdForTop.getValue()) == null) ? 0 : num.intValue();
            this.this$0.mutableAllTopList.setValue(iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? (List) this.this$0.mutableTop0.getValue() : (List) this.this$0.mutableTop5.getValue() : (List) this.this$0.mutableTop4.getValue() : (List) this.this$0.mutableTop3.getValue() : (List) this.this$0.mutableTop2.getValue() : (List) this.this$0.mutableTop1.getValue());
            this.this$0.createMyTopPos(Boxing.boxInt(iIntValue));
            return Unit.INSTANCE;
        }
    }

    public final void showCurrentGameTop(@Nullable Integer gameId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40151(gameId, this, null), 3, null);
    }

    /* compiled from: EntertainmentGamesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$createMyTopPos$1", m7120f = "EntertainmentGamesViewModel.kt", m7121i = {}, m7122l = {300}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.entertainmentsystem.viewmodel.EntertainmentGamesViewModel$createMyTopPos$1 */

    public static final class C40111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Integer $gameId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40111(Integer num, Continuation<? super C40111> continuation) {
            super(2, continuation);
            this.$gameId = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EntertainmentGamesViewModel.this.new C40111(this.$gameId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C40111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strValueOf;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = EntertainmentGamesViewModel.this.mutableInfoAboutCurrentPLayer;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            NickAndTopPosAndGamePointerForCurrentPlayer nickAndTopPosAndGamePointerForCurrentPlayer = (NickAndTopPosAndGamePointerForCurrentPlayer) obj;
            int iIntValue = this.$gameId == null ? 999 : nickAndTopPosAndGamePointerForCurrentPlayer.getTopPos().get(this.$gameId.intValue()).intValue();
            if (this.$gameId == null || nickAndTopPosAndGamePointerForCurrentPlayer.getGamePointer().get(this.$gameId.intValue()).intValue() == 0) {
                strValueOf = "-";
            } else {
                strValueOf = String.valueOf(nickAndTopPosAndGamePointerForCurrentPlayer.getGamePointer().get(this.$gameId.intValue()).intValue());
            }
            String str = strValueOf;
            MutableStateFlow mutableStateFlow = EntertainmentGamesViewModel.this.mutableCurrentPlayerTop;
            String nick = nickAndTopPosAndGamePointerForCurrentPlayer.getNick();
            Integer num = this.$gameId;
            mutableStateFlow.setValue(CollectionsKt__CollectionsJVMKt.listOf(new EntertainmentPlayersData(iIntValue, nick, num != null ? num.intValue() : 0, str, 0, 0)));
            return Unit.INSTANCE;
        }
    }

    public final void createMyTopPos(Integer gameId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C40111(gameId, null), 2, null);
    }

    public final void sendPressButton(int typeOfButton) throws JSONException {
        if (typeOfButton == 4) {
            if (this.ifFillTop) {
                return;
            }
            this.actionWithJson.sendPressButtonForEntertainmentSystem(typeOfButton);
            return;
        }
        this.actionWithJson.sendPressButtonForEntertainmentSystem(typeOfButton);
    }

    public final void sendGetLobby(int lobbiesNumber) throws JSONException {
        this.actionWithJson.sendGetLobby(lobbiesNumber);
    }

    public final void generateTopList() {
        EntertainmentGameData value = this.mutableClickedGame.getValue();
        Integer numValueOf = value != null ? Integer.valueOf(value.getId()) : null;
        createMyTopPos(numValueOf);
        showCurrentGameTop(numValueOf);
    }

    public final void clearInfo() {
        this.mutableAllTopList.setValue(CollectionsKt__CollectionsKt.emptyList());
    }
}

