package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TuningCollapseViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\nJ\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020,J\u000e\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nJ\u000e\u00105\u001a\u00020,2\u0006\u00101\u001a\u000202J\u0010\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u00108\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u00109\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010:\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010<\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u000e\u0010=\u001a\u00020,2\u0006\u00107\u001a\u00020\nJ\u0010\u0010>\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010?\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010@\u001a\u00020,2\u0006\u00107\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006A"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningCollapseViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "costCalculation", "Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;)V", "mutableCollapseBack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "mutableCollapseFront", "mutableCurrentCost", "mutableDepartureBackWheels", "mutableDepartureFrontWheels", "mutableFullClearance", "mutableGosCost", "mutableIndividualClearance", "mutableRadiusWheels", "mutableWidthFrontWheels", "mutableWithBackWheels", "newCollapseBack", "Lkotlinx/coroutines/flow/StateFlow;", "getNewCollapseBack", "()Lkotlinx/coroutines/flow/StateFlow;", "newCollapseFront", "getNewCollapseFront", "newCurrentCost", "getNewCurrentCost", "newDepartureBackWheels", "getNewDepartureBackWheels", "newDepartureFrontWheels", "getNewDepartureFrontWheels", "newFullClearance", "getNewFullClearance", "newIndividualClearance", "getNewIndividualClearance", "newRadiusWheels", "getNewRadiusWheels", "newWidthFrontWheels", "getNewWidthFrontWheels", "newWithBackWheels", "getNewWithBackWheels", "calculateTheCost", "", "currentSelector", "getCollapse", "getCollapseAfterReset", "initCollapse", "jsonObject", "Lorg/json/JSONObject;", "sendBuyCollapse", "valueOfCollapse", "setGosCost", "updateCollapseBack", "newValue", "updateCollapseFront", "updateDepartureBackWheels", "updateDepartureFrontWheels", "updateFullClearance", "updateIndividualClearance", "updateParamsForPreview", "updateRadiusWheels", "updateWidthFrontWheels", "updateWithBackWheels", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TuningCollapseViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;

    @NotNull
    public final MutableStateFlow<Integer> mutableCollapseBack;

    @NotNull
    public final MutableStateFlow<Integer> mutableCollapseFront;

    @NotNull
    public final MutableStateFlow<Integer> mutableCurrentCost;

    @NotNull
    public final MutableStateFlow<Integer> mutableDepartureBackWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableDepartureFrontWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableFullClearance;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<Integer> mutableIndividualClearance;

    @NotNull
    public final MutableStateFlow<Integer> mutableRadiusWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableWidthFrontWheels;

    @NotNull
    public final MutableStateFlow<Integer> mutableWithBackWheels;

    @NotNull
    public final StateFlow<Integer> newCollapseBack;

    @NotNull
    public final StateFlow<Integer> newCollapseFront;

    @NotNull
    public final StateFlow<Integer> newCurrentCost;

    @NotNull
    public final StateFlow<Integer> newDepartureBackWheels;

    @NotNull
    public final StateFlow<Integer> newDepartureFrontWheels;

    @NotNull
    public final StateFlow<Integer> newFullClearance;

    @NotNull
    public final StateFlow<Integer> newIndividualClearance;

    @NotNull
    public final StateFlow<Integer> newRadiusWheels;

    @NotNull
    public final StateFlow<Integer> newWidthFrontWheels;

    @NotNull
    public final StateFlow<Integer> newWithBackWheels;

    @Inject
    public TuningCollapseViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableCurrentCost = MutableStateFlow;
        this.newCurrentCost = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.mutableFullClearance = MutableStateFlow2;
        this.newFullClearance = MutableStateFlow2;
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this.mutableIndividualClearance = MutableStateFlow3;
        this.newIndividualClearance = MutableStateFlow3;
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this.mutableDepartureFrontWheels = MutableStateFlow4;
        this.newDepartureFrontWheels = MutableStateFlow4;
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0);
        this.mutableDepartureBackWheels = MutableStateFlow5;
        this.newDepartureBackWheels = MutableStateFlow5;
        MutableStateFlow<Integer> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0);
        this.mutableCollapseFront = MutableStateFlow6;
        this.newCollapseFront = MutableStateFlow6;
        MutableStateFlow<Integer> MutableStateFlow7 = StateFlowKt.MutableStateFlow(0);
        this.mutableCollapseBack = MutableStateFlow7;
        this.newCollapseBack = MutableStateFlow7;
        MutableStateFlow<Integer> MutableStateFlow8 = StateFlowKt.MutableStateFlow(0);
        this.mutableWidthFrontWheels = MutableStateFlow8;
        this.newWidthFrontWheels = MutableStateFlow8;
        MutableStateFlow<Integer> MutableStateFlow9 = StateFlowKt.MutableStateFlow(0);
        this.mutableWithBackWheels = MutableStateFlow9;
        this.newWithBackWheels = MutableStateFlow9;
        MutableStateFlow<Integer> MutableStateFlow10 = StateFlowKt.MutableStateFlow(0);
        this.mutableRadiusWheels = MutableStateFlow10;
        this.newRadiusWheels = MutableStateFlow10;
    }

    @NotNull
    public final StateFlow<Integer> getNewCurrentCost() {
        return this.newCurrentCost;
    }

    @NotNull
    public final StateFlow<Integer> getNewFullClearance() {
        return this.newFullClearance;
    }

    @NotNull
    public final StateFlow<Integer> getNewIndividualClearance() {
        return this.newIndividualClearance;
    }

    @NotNull
    public final StateFlow<Integer> getNewDepartureFrontWheels() {
        return this.newDepartureFrontWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewDepartureBackWheels() {
        return this.newDepartureBackWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewCollapseFront() {
        return this.newCollapseFront;
    }

    @NotNull
    public final StateFlow<Integer> getNewCollapseBack() {
        return this.newCollapseBack;
    }

    @NotNull
    public final StateFlow<Integer> getNewWidthFrontWheels() {
        return this.newWidthFrontWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewWithBackWheels() {
        return this.newWithBackWheels;
    }

    @NotNull
    public final StateFlow<Integer> getNewRadiusWheels() {
        return this.newRadiusWheels;
    }

    /* compiled from: TuningCollapseViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$initCollapse$1", m7120f = "TuningCollapseViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$initCollapse$1 */
    public static final class C46501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;
        public final /* synthetic */ TuningCollapseViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46501(JSONObject jSONObject, TuningCollapseViewModel tuningCollapseViewModel, Continuation<? super C46501> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.this$0 = tuningCollapseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C46501(this.$jsonObject, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                JSONArray jSONArrayOptJSONArray = this.$jsonObject.optJSONArray("u");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 9) {
                    MutableStateFlow mutableStateFlow = this.this$0.mutableFullClearance;
                    Object obj2 = jSONArrayOptJSONArray.get(0);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow.setValue((Integer) obj2);
                    MutableStateFlow mutableStateFlow2 = this.this$0.mutableIndividualClearance;
                    Object obj3 = jSONArrayOptJSONArray.get(1);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow2.setValue((Integer) obj3);
                    MutableStateFlow mutableStateFlow3 = this.this$0.mutableDepartureFrontWheels;
                    Object obj4 = jSONArrayOptJSONArray.get(2);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow3.setValue((Integer) obj4);
                    MutableStateFlow mutableStateFlow4 = this.this$0.mutableDepartureBackWheels;
                    Object obj5 = jSONArrayOptJSONArray.get(3);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow4.setValue((Integer) obj5);
                    MutableStateFlow mutableStateFlow5 = this.this$0.mutableCollapseFront;
                    Object obj6 = jSONArrayOptJSONArray.get(4);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow5.setValue((Integer) obj6);
                    MutableStateFlow mutableStateFlow6 = this.this$0.mutableCollapseBack;
                    Object obj7 = jSONArrayOptJSONArray.get(5);
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow6.setValue((Integer) obj7);
                    MutableStateFlow mutableStateFlow7 = this.this$0.mutableWidthFrontWheels;
                    Object obj8 = jSONArrayOptJSONArray.get(6);
                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow7.setValue((Integer) obj8);
                    MutableStateFlow mutableStateFlow8 = this.this$0.mutableWithBackWheels;
                    Object obj9 = jSONArrayOptJSONArray.get(7);
                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow8.setValue((Integer) obj9);
                    MutableStateFlow mutableStateFlow9 = this.this$0.mutableRadiusWheels;
                    Object obj10 = jSONArrayOptJSONArray.get(8);
                    Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Int");
                    mutableStateFlow9.setValue((Integer) obj10);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initCollapse(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C46501(jsonObject, this, null), 2, null);
    }

    public final void setGosCost(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.mutableGosCost.setValue(Integer.valueOf(jsonObject.optInt("j")));
    }

    /* compiled from: TuningCollapseViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$calculateTheCost$1", m7120f = "TuningCollapseViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$calculateTheCost$1 */
    public static final class C46481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentSelector;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46481(int i, Continuation<? super C46481> continuation) {
            super(2, continuation);
            this.$currentSelector = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningCollapseViewModel.this.new C46481(this.$currentSelector, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    TuningCollapseViewModel.this.mutableCurrentCost.setValue(Boxing.boxInt(TuningCollapseViewModel.this.costCalculation.setCost(this.$currentSelector, ((Number) TuningCollapseViewModel.this.mutableGosCost.getValue()).intValue())));
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void calculateTheCost(int currentSelector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C46481(currentSelector, null), 2, null);
    }

    public final void updateFullClearance(int newValue) {
        this.mutableFullClearance.setValue(Integer.valueOf(newValue));
    }

    public final void updateIndividualClearance(int newValue) {
        this.mutableIndividualClearance.setValue(Integer.valueOf(newValue));
    }

    public final void updateDepartureFrontWheels(int newValue) {
        this.mutableDepartureFrontWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateDepartureBackWheels(int newValue) {
        this.mutableDepartureBackWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateCollapseFront(int newValue) {
        this.mutableCollapseFront.setValue(Integer.valueOf(newValue));
    }

    public final void updateCollapseBack(int newValue) {
        this.mutableCollapseBack.setValue(Integer.valueOf(newValue));
    }

    public final void updateWidthFrontWheels(int newValue) {
        this.mutableWidthFrontWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateWithBackWheels(int newValue) {
        this.mutableWithBackWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateRadiusWheels(int newValue) {
        this.mutableRadiusWheels.setValue(Integer.valueOf(newValue));
    }

    public final void updateParamsForPreview(int newValue) throws JSONException {
        this.actionWithJson.putDetailOrCollapseToClient(24, newValue);
    }

    /* compiled from: TuningCollapseViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$getCollapseAfterReset$1", m7120f = "TuningCollapseViewModel.kt", m7121i = {}, m7122l = {MatroskaExtractor.ID_BLOCK}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningCollapseViewModel$getCollapseAfterReset$1 */
    public static final class C46491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46491(Continuation<? super C46491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningCollapseViewModel.this.new C46491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TuningCollapseViewModel.this.getCollapse();
            return Unit.INSTANCE;
        }
    }

    public final void getCollapseAfterReset() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C46491(null), 3, null);
    }

    public final void getCollapse() throws JSONException {
        this.actionWithJson.putPlayersActionToServer(28);
    }

    public final void sendBuyCollapse(int valueOfCollapse, int currentSelector) throws JSONException {
        this.actionWithJson.putIntegerDataWithSelectorIDToServer(12, valueOfCollapse, currentSelector);
        switch (currentSelector) {
            case 22:
                updateFullClearance(valueOfCollapse);
                break;
            case 23:
                updateIndividualClearance(valueOfCollapse);
                break;
            case 24:
                updateDepartureFrontWheels(valueOfCollapse);
                break;
            case 25:
                updateDepartureBackWheels(valueOfCollapse);
                break;
            case 26:
                updateCollapseFront(valueOfCollapse);
                break;
            case 27:
                updateCollapseBack(valueOfCollapse);
                break;
            case 28:
                updateWidthFrontWheels(valueOfCollapse);
                break;
            case 29:
                updateWithBackWheels(valueOfCollapse);
                break;
            case 30:
                updateRadiusWheels(valueOfCollapse);
                break;
        }
    }
}
