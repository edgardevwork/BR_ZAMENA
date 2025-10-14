package com.blackhub.bronline.game.gui.gasmangame.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.gasmangame.network.GasmanActionsWithJson;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanParentUIState;
import com.blackhub.bronline.game.gui.gasmangame.uistate.GasmanSizesItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GasmanParentViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGasmanParentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,107:1\n230#2,5:108\n230#2,5:113\n230#2,5:118\n230#2,5:123\n230#2,5:128\n230#2,5:133\n*S KotlinDebug\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel\n*L\n29#1:108,5\n37#1:113,5\n45#1:118,5\n53#1:123,5\n68#1:128,5\n76#1:133,5\n*E\n"})
/* loaded from: classes3.dex */
public final class GasmanParentViewModel extends BaseViewModel<GasmanParentUIState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<GasmanParentUIState> _uiState;

    @NotNull
    public final GasmanActionsWithJson actionsWithJson;

    @Inject
    public GasmanParentViewModel(@NotNull GasmanActionsWithJson actionsWithJson) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        this.actionsWithJson = actionsWithJson;
        this._uiState = StateFlowKt.MutableStateFlow(new GasmanParentUIState(false, 0, null, null, false, 0, null, 127, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<GasmanParentUIState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<GasmanParentUIState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    public final void setTubesSizes(int width) {
        MutableStateFlow<GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, null, null, false, 0, new GasmanSizesItem(width, 0, 0, 0, 0, 0, 0, 126, null), 63, null))) {
        }
    }

    public final void setCurrentFragmentNumber(int fragmentNumber) {
        MutableStateFlow<GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, null, null, false, fragmentNumber, null, 95, null))) {
        }
    }

    public final void setLoadingFragmentEnded(boolean value) {
        MutableStateFlow<GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), value, 0, null, null, false, 0, null, 126, null))) {
        }
    }

    public final void calculateGames() {
        MutableStateFlow<GasmanParentUIState> mutableStateFlow = get_uiState();
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.take(SequencesKt___SequencesKt.distinct(SequencesKt__SequencesKt.generateSequence(new Function0<Integer>() { // from class: com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel$calculateGames$1$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Integer invoke() {
                return Integer.valueOf(Random.INSTANCE.nextInt(1, 11));
            }
        })), 3)), null, false, 0, null, 122, null))) {
        }
    }

    public final void setResultOfGames(@Nullable JSONObject jsonObj) {
        GasmanParentUIState value;
        GasmanParentUIState value2;
        List<Integer> listEmptyList;
        JSONArray jSONArrayOptJSONArray = jsonObj != null ? jsonObj.optJSONArray("p") : null;
        MutableStateFlow<GasmanParentUIState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            value2 = get_uiState().getValue();
            if (jSONArrayOptJSONArray == null || (listEmptyList = JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray)) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
        } while (!mutableStateFlow.compareAndSet(value, GasmanParentUIState.copy$default(value2, false, 0, null, listEmptyList, false, 0, null, 119, null)));
    }

    public final void setNeedToShowDialog(@Nullable JSONObject jsonObj) {
        MutableStateFlow<GasmanParentUIState> mutableStateFlow = get_uiState();
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(get_uiState().getValue(), false, 0, null, null, jsonObj != null && jsonObj.optInt("i") == 1, 0, null, 111, null)));
    }

    /* compiled from: GasmanParentViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel$gasAnimated$1", m7120f = "GasmanParentViewModel.kt", m7121i = {}, m7122l = {85}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nGasmanParentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel$gasAnimated$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,107:1\n230#2,5:108\n*S KotlinDebug\n*F\n+ 1 GasmanParentViewModel.kt\ncom/blackhub/bronline/game/gui/gasmangame/viewmodel/GasmanParentViewModel$gasAnimated$1\n*L\n89#1:108,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel$gasAnimated$1 */

    public static final class C41111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41111(Continuation<? super C41111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GasmanParentViewModel.this.new C41111(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GasmanParentViewModel.this.actionsWithJson.sendGasAnimated();
            int quantityOfChecks = GasmanParentViewModel.this.get_uiState().getValue().getQuantityOfChecks();
            MutableStateFlow<GasmanParentUIState> mutableStateFlow = GasmanParentViewModel.this.get_uiState();
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), GasmanParentUIState.copy$default(GasmanParentViewModel.this.get_uiState().getValue(), false, quantityOfChecks + 1, null, null, false, 0, null, 125, null))) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void gasAnimated() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41111(null), 3, null);
    }

    /* compiled from: GasmanParentViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel$sendGameEnded$1", m7120f = "GasmanParentViewModel.kt", m7121i = {}, m7122l = {99}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.gasmangame.viewmodel.GasmanParentViewModel$sendGameEnded$1 */

    public static final class C41121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C41121(Continuation<? super C41121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GasmanParentViewModel.this.new C41121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GasmanParentViewModel.this.actionsWithJson.sendExit(3);
            return Unit.INSTANCE;
        }
    }

    public final void sendGameEnded() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41121(null), 3, null);
    }

    public final void sendButtonExitPressed() throws JSONException {
        this.actionsWithJson.sendExit(2);
    }
}

