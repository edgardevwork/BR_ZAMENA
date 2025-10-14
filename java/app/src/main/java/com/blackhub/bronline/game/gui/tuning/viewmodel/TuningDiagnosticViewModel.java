package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.data.TuningDetailDiagnosticItemObj;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
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

/* compiled from: TuningDiagnosticViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TuningDiagnosticViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;

    @NotNull
    public List<TuningDetailDiagnosticItemObj> finalListWithItems;

    @NotNull
    public final MutableStateFlow<Integer> mutableCostOfDiagnostic;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<Integer> mutablePosForUpdateItem;

    @NotNull
    public final MutableStateFlow<Boolean> mutableStatusOfApplyRepair;

    @NotNull
    public final MutableStateFlow<Integer> mutableStatusOfDiagnostic;

    @NotNull
    public final MutableSharedFlow<List<TuningDetailDiagnosticItemObj>> mutableValueOfStates;

    @NotNull
    public final StateFlow<Integer> newCostOfDiagnostic;

    @NotNull
    public final SharedFlow<Integer> newPosForUpdateItem;

    @NotNull
    public final StateFlow<Boolean> newStatusOfApplyRepair;

    @NotNull
    public final StateFlow<Integer> newStatusOfDiagnostic;

    @NotNull
    public final SharedFlow<List<TuningDetailDiagnosticItemObj>> newValueOfStates;

    /* compiled from: TuningDiagnosticViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel", m7120f = "TuningDiagnosticViewModel.kt", m7121i = {0, 0}, m7122l = {229}, m7123m = "changeStatusOfDiagnostic", m7124n = {"this", "newStatus"}, m7125s = {"L$0", "I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$changeStatusOfDiagnostic$1 */
    /* loaded from: classes.dex */
    public static final class C46771 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C46771(Continuation<? super C46771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningDiagnosticViewModel.this.changeStatusOfDiagnostic(0, this);
        }
    }

    @Inject
    public TuningDiagnosticViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableStatusOfDiagnostic = MutableStateFlow;
        this.newStatusOfDiagnostic = MutableStateFlow;
        MutableSharedFlow<List<TuningDetailDiagnosticItemObj>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableValueOfStates = mutableSharedFlowMutableSharedFlow$default;
        this.newValueOfStates = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(-1);
        this.mutablePosForUpdateItem = MutableStateFlow2;
        this.newPosForUpdateItem = MutableStateFlow2;
        this.finalListWithItems = CollectionsKt__CollectionsKt.emptyList();
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.mutableCostOfDiagnostic = MutableStateFlow3;
        this.newCostOfDiagnostic = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableStatusOfApplyRepair = MutableStateFlow4;
        this.newStatusOfApplyRepair = MutableStateFlow4;
    }

    @NotNull
    public final StateFlow<Integer> getNewStatusOfDiagnostic() {
        return this.newStatusOfDiagnostic;
    }

    @NotNull
    public final SharedFlow<List<TuningDetailDiagnosticItemObj>> getNewValueOfStates() {
        return this.newValueOfStates;
    }

    @NotNull
    public final SharedFlow<Integer> getNewPosForUpdateItem() {
        return this.newPosForUpdateItem;
    }

    @NotNull
    public final StateFlow<Integer> getNewCostOfDiagnostic() {
        return this.newCostOfDiagnostic;
    }

    @NotNull
    public final StateFlow<Boolean> getNewStatusOfApplyRepair() {
        return this.newStatusOfApplyRepair;
    }

    /* compiled from: TuningDiagnosticViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$initDiagnostic$1", m7120f = "TuningDiagnosticViewModel.kt", m7121i = {0}, m7122l = {194}, m7123m = "invokeSuspend", m7124n = {"gosCost"}, m7125s = {"I$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$initDiagnostic$1 */

    public static final class C46781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int I$0;
        public int label;
        public final /* synthetic */ TuningDiagnosticViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46781(JSONObject jSONObject, TuningDiagnosticViewModel tuningDiagnosticViewModel, Continuation<? super C46781> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.this$0 = tuningDiagnosticViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46781(this.$jsonObject, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                int iOptInt = this.$jsonObject.optInt("j");
                JSONArray jSONArrayOptJSONArray = this.$jsonObject.optJSONArray("d");
                List<Integer> mutableIntList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null;
                if (mutableIntList != null) {
                    int size = mutableIntList.size();
                    if (size == 3) {
                        this.this$0.finalListWithItems = CollectionsKt__CollectionsKt.mutableListOf(new TuningDetailDiagnosticItemObj(0, "Электродвигатель", "t_electro_engine_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 1.0d, 0), mutableIntList.get(0).intValue()), new TuningDetailDiagnosticItemObj(1, "Подвеска", "t_suspension_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 0.005d, 2000), mutableIntList.get(1).intValue()), new TuningDetailDiagnosticItemObj(2, "Аккумулятор", "t_battery_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 0.5d, 0), mutableIntList.get(2).intValue()));
                    } else if (size == 7) {
                        this.this$0.finalListWithItems = CollectionsKt__CollectionsKt.mutableListOf(new TuningDetailDiagnosticItemObj(0, "Двигатель", "t_engine_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 1.0d, 0), mutableIntList.get(0).intValue()), new TuningDetailDiagnosticItemObj(1, "Воздушный фильтр", "t_air_filter_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 0.005d, 2000), mutableIntList.get(1).intValue()), new TuningDetailDiagnosticItemObj(2, "Топливная система", "t_fuel_system_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 0.5d, 0), mutableIntList.get(2).intValue()), new TuningDetailDiagnosticItemObj(3, "Трансмиссия", "t_transmission_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 1.0d, 0), mutableIntList.get(3).intValue()), new TuningDetailDiagnosticItemObj(4, "Подвеска", "t_suspension_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 0.5d, 0), mutableIntList.get(4).intValue()), new TuningDetailDiagnosticItemObj(5, "Свечи зажигания", "t_spark_plug_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 0.005d, 500), mutableIntList.get(5).intValue()), new TuningDetailDiagnosticItemObj(6, "Аккумулятор", "t_battery_engine_icon", this.this$0.costCalculation.getFinalCost(iOptInt, 0.005d, 5000), mutableIntList.get(5).intValue()));
                    }
                    MutableSharedFlow mutableSharedFlow = this.this$0.mutableValueOfStates;
                    List list = this.this$0.finalListWithItems;
                    this.I$0 = iOptInt;
                    this.label = 1;
                    if (mutableSharedFlow.emit(list, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = iOptInt;
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            this.this$0.mutableGosCost.setValue(Boxing.boxInt(i));
            this.this$0.mutableCostOfDiagnostic.setValue(Boxing.boxInt(this.this$0.costCalculation.getFinalCost(i, 0.005d, 2000)));
            return Unit.INSTANCE;
        }
    }

    public final void initDiagnostic(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46781(jsonObject, this, null), 2, null);
    }

    /* compiled from: TuningDiagnosticViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1", m7120f = "TuningDiagnosticViewModel.kt", m7121i = {0}, m7122l = {213, 218, 221}, m7123m = "invokeSuspend", m7124n = {"finalListJson"}, m7125s = {"L$0"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$updateDetailStatesAfterDiagnostic$1 */

    public static final class C46801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public Object L$0;
        public int label;
        public final /* synthetic */ TuningDiagnosticViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46801(JSONObject jSONObject, TuningDiagnosticViewModel tuningDiagnosticViewModel, Continuation<? super C46801> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.this$0 = tuningDiagnosticViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46801(this.$jsonObject, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List<Integer> mutableIntList;
            TuningDiagnosticViewModel tuningDiagnosticViewModel;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JSONArray jSONArrayOptJSONArray = this.$jsonObject.optJSONArray("d");
                mutableIntList = jSONArrayOptJSONArray != null ? JsonArrayExtensionKt.toMutableIntList(jSONArrayOptJSONArray) : null;
                MutableSharedFlow mutableSharedFlow = this.this$0.mutableValueOfStates;
                this.L$0 = mutableIntList;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    tuningDiagnosticViewModel = this.this$0;
                    this.L$0 = null;
                    this.label = 3;
                    if (tuningDiagnosticViewModel.changeStatusOfDiagnostic(1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                mutableIntList = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (mutableIntList != null && mutableIntList.size() == list.size()) {
                int size = mutableIntList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((TuningDetailDiagnosticItemObj) list.get(i2)).setValueState(mutableIntList.get(i2).intValue());
                }
                MutableSharedFlow mutableSharedFlow2 = this.this$0.mutableValueOfStates;
                this.L$0 = null;
                this.label = 2;
                if (mutableSharedFlow2.emit(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            tuningDiagnosticViewModel = this.this$0;
            this.L$0 = null;
            this.label = 3;
            if (tuningDiagnosticViewModel.changeStatusOfDiagnostic(1, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateDetailStatesAfterDiagnostic(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46801(jsonObject, this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object changeStatusOfDiagnostic(int i, Continuation<? super Unit> continuation) throws Throwable {
        C46771 c46771;
        TuningDiagnosticViewModel tuningDiagnosticViewModel;
        if (continuation instanceof C46771) {
            c46771 = (C46771) continuation;
            int i2 = c46771.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c46771.label = i2 - Integer.MIN_VALUE;
            } else {
                c46771 = new C46771(continuation);
            }
        }
        Object obj = c46771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c46771.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c46771.L$0 = this;
            c46771.I$0 = i;
            c46771.label = 1;
            if (DelayKt.delay(TuningConstants.DELAY_AFTER_DIAGNOSTIC, c46771) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tuningDiagnosticViewModel = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c46771.I$0;
            tuningDiagnosticViewModel = (TuningDiagnosticViewModel) c46771.L$0;
            ResultKt.throwOnFailure(obj);
        }
        tuningDiagnosticViewModel.mutableStatusOfDiagnostic.setValue(Boxing.boxInt(i));
        return Unit.INSTANCE;
    }

    /* compiled from: TuningDiagnosticViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$repairDetail$1", m7120f = "TuningDiagnosticViewModel.kt", m7121i = {}, m7122l = {236, 239}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningDiagnosticViewModel$repairDetail$1 */

    public static final class C46791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $position;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46791(int i, Continuation<? super C46791> continuation) {
            super(2, continuation);
            this.$position = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningDiagnosticViewModel.this.new C46791(this.$position, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = TuningDiagnosticViewModel.this.mutableValueOfStates;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TuningDiagnosticViewModel.this.mutablePosForUpdateItem.setValue(Boxing.boxInt(this.$position));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            ((TuningDetailDiagnosticItemObj) list.get(this.$position)).setValueState(100);
            MutableSharedFlow mutableSharedFlow2 = TuningDiagnosticViewModel.this.mutableValueOfStates;
            this.label = 2;
            if (mutableSharedFlow2.emit(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            TuningDiagnosticViewModel.this.mutablePosForUpdateItem.setValue(Boxing.boxInt(this.$position));
            return Unit.INSTANCE;
        }
    }

    public final void repairDetail(int position) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C46791(position, null), 2, null);
    }

    public final void sendRepairDetailForCheck(int itemId) throws JSONException {
        this.actionWithJson.putIntegerDataToServer(9, itemId);
    }

    public final void sendRepairDetailForBuy(int itemId) throws JSONException {
        this.actionWithJson.putIntegerDataToServer(8, itemId);
    }

    public final void sendApplyDiagnostic() throws JSONException {
        this.actionWithJson.putPlayersActionToServer(6);
    }

    public final void setStatusOfApplyRepair(boolean newStatus) {
        this.mutableStatusOfApplyRepair.setValue(Boolean.valueOf(newStatus));
    }
}

