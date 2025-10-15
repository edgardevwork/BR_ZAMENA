package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.core.extension.DoubleExtensionKt;
import com.blackhub.bronline.game.core.extension.JsonArrayExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.tuning.CostCalculation;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.caverock.androidsvg.SVGParser;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
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

/* compiled from: TuningColorListViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010&\u001a\u00020\u0011H\u0002J\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002J\u0016\u0010\u001e\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\rJ&\u0010-\u001a\u00020)2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010,\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020)2\u0006\u0010,\u001a\u00020\rH\u0002J\u000e\u00100\u001a\u00020)2\u0006\u0010,\u001a\u00020\rJ\u000e\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0016\u00102\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u000e\u00103\u001a\u00020)2\u0006\u0010,\u001a\u00020\rJ\u0010\u00104\u001a\u00020)2\u0006\u00105\u001a\u00020\u0011H\u0002J\u0014\u00106\u001a\u00020)2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0016\u00108\u001a\u00020)2\u0006\u0010(\u001a\u00020\u00112\u0006\u00109\u001a\u00020\rJ\u000e\u0010:\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u001e\u0010;\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010,\u001a\u00020\rH\u0002J\u0010\u0010<\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0016\u0010=\u001a\u00020)2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0002J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002J\u0010\u0010@\u001a\u00020\u00112\u0006\u00109\u001a\u00020\rH\u0002J\u001e\u0010A\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010(\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u0006B"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningColorListViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "costCalculation", "Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;Lcom/blackhub/bronline/game/gui/tuning/CostCalculation;)V", "lColorItemsFromJson", "", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "mutableColorCost", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "mutableColorItems", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "mutableColorObjToBuy", "", "mutableGosCost", "mutableNewAndOldStartColor", "mutableStartColorItems", "mutableValueOfTransparency", "newAndOldStartColor", "Lkotlinx/coroutines/flow/StateFlow;", "getNewAndOldStartColor", "()Lkotlinx/coroutines/flow/StateFlow;", "newColorCost", "getNewColorCost", "newColorItems", "Lkotlinx/coroutines/flow/SharedFlow;", "getNewColorItems", "()Lkotlinx/coroutines/flow/SharedFlow;", "newStartColorItems", "getNewStartColorItems", "newValueOfTransparency", "getNewValueOfTransparency", "changeStartColor", "colorItemsFromJson", "hexColor", "getHexColor", SVGParser.CURRENTCOLOR, "", "jsonObject", "Lorg/json/JSONObject;", "currentSelector", "initColorItems", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initGosCost", "initInterface", "initStartColorItems", "resetColorItems", "sendApplyBuyReadyColor", "sendToClientPreviewColor", "finalColor", "setColorItemsFromJson", IFramePlayerOptions.Builder.LIST, "setColorObjToBuy", "valueOfTransparency", "setGosCost", "setStartColor", "setStartColors", "setValueOfTransparency", "startColorItems", "transformColor", "transformTransparency", "updateStartColor", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TuningColorListViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final CostCalculation costCalculation;

    @NotNull
    public List<CarColorItem> lColorItemsFromJson;

    @NotNull
    public final MutableStateFlow<Integer> mutableColorCost;

    @NotNull
    public final MutableSharedFlow<List<CarColorItem>> mutableColorItems;

    @NotNull
    public final MutableStateFlow<String> mutableColorObjToBuy;

    @NotNull
    public final MutableStateFlow<Integer> mutableGosCost;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableNewAndOldStartColor;

    @NotNull
    public final MutableStateFlow<List<String>> mutableStartColorItems;

    @NotNull
    public final MutableStateFlow<List<Integer>> mutableValueOfTransparency;

    @NotNull
    public final StateFlow<List<Integer>> newAndOldStartColor;

    @NotNull
    public final StateFlow<Integer> newColorCost;

    @NotNull
    public final SharedFlow<List<CarColorItem>> newColorItems;

    @NotNull
    public final StateFlow<List<String>> newStartColorItems;

    @NotNull
    public final StateFlow<List<Integer>> newValueOfTransparency;

    /* compiled from: TuningColorListViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel", m7120f = "TuningColorListViewModel.kt", m7121i = {0, 0, 0}, m7122l = {135}, m7123m = "initColorItems", m7124n = {"this", "oldStartColor", "newStartColor"}, m7125s = {"L$0", "I$0", "I$1"})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initColorItems$1 */
    /* loaded from: classes.dex */
    public static final class C46521 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C46521(Continuation<? super C46521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TuningColorListViewModel.this.initColorItems(null, 0, this);
        }
    }

    @Inject
    public TuningColorListViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull CostCalculation costCalculation) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(costCalculation, "costCalculation");
        this.actionWithJson = actionWithJson;
        this.costCalculation = costCalculation;
        this.lColorItemsFromJson = CollectionsKt__CollectionsKt.emptyList();
        this.mutableGosCost = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableColorCost = MutableStateFlow;
        this.newColorCost = MutableStateFlow;
        MutableStateFlow<List<String>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableStartColorItems = MutableStateFlow2;
        this.newStartColorItems = MutableStateFlow2;
        MutableSharedFlow<List<CarColorItem>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableColorItems = mutableSharedFlowMutableSharedFlow$default;
        this.newColorItems = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<List<Integer>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableNewAndOldStartColor = MutableStateFlow3;
        this.newAndOldStartColor = MutableStateFlow3;
        this.mutableColorObjToBuy = StateFlowKt.MutableStateFlow("");
        MutableStateFlow<List<Integer>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.mutableValueOfTransparency = MutableStateFlow4;
        this.newValueOfTransparency = MutableStateFlow4;
    }

    @NotNull
    public final StateFlow<Integer> getNewColorCost() {
        return this.newColorCost;
    }

    @NotNull
    public final StateFlow<List<String>> getNewStartColorItems() {
        return this.newStartColorItems;
    }

    @NotNull
    public final SharedFlow<List<CarColorItem>> getNewColorItems() {
        return this.newColorItems;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewAndOldStartColor() {
        return this.newAndOldStartColor;
    }

    @NotNull
    public final StateFlow<List<Integer>> getNewValueOfTransparency() {
        return this.newValueOfTransparency;
    }

    public final void setColorItemsFromJson(@NotNull List<CarColorItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.lColorItemsFromJson = list;
    }

    public final void setGosCost(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.mutableGosCost.setValue(Integer.valueOf(jsonObject.optInt("j")));
    }

    /* compiled from: TuningColorListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$getNewColorItems$1", m7120f = "TuningColorListViewModel.kt", m7121i = {}, m7122l = {90}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$getNewColorItems$1 */
    /* loaded from: classes2.dex */
    public static final class C46511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentSelector;
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46511(JSONObject jSONObject, int i, Continuation<? super C46511> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.$currentSelector = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningColorListViewModel.this.new C46511(this.$jsonObject, this.$currentSelector, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TuningColorListViewModel.this.setStartColors(this.$jsonObject);
                    TuningColorListViewModel tuningColorListViewModel = TuningColorListViewModel.this;
                    List list = tuningColorListViewModel.lColorItemsFromJson;
                    int i2 = this.$currentSelector;
                    this.label = 1;
                    if (tuningColorListViewModel.initColorItems(list, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void getNewColorItems(@NotNull JSONObject jsonObject, int currentSelector) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46511(jsonObject, currentSelector, null), 2, null);
    }

    /* compiled from: TuningColorListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initStartColorItems$1", m7120f = "TuningColorListViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initStartColorItems$1 */
    /* loaded from: classes2.dex */
    public static final class C46541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46541(JSONObject jSONObject, Continuation<? super C46541> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningColorListViewModel.this.new C46541(this.$jsonObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    TuningColorListViewModel.this.setStartColors(this.$jsonObject);
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initStartColorItems(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46541(jsonObject, null), 2, null);
    }

    public final void setStartColors(JSONObject jsonObject) throws JSONException {
        if (jsonObject.optJSONArray("a") != null) {
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("a");
            Intrinsics.checkNotNull(jSONArrayOptJSONArray);
            List<String> mutableStringList = JsonArrayExtensionKt.toMutableStringList(jSONArrayOptJSONArray);
            setValueOfTransparency(mutableStringList);
            this.mutableStartColorItems.setValue(mutableStringList);
        }
    }

    /* compiled from: TuningColorListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initInterface$1", m7120f = "TuningColorListViewModel.kt", m7121i = {}, m7122l = {119}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$initInterface$1 */
    /* loaded from: classes2.dex */
    public static final class C46531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentSelector;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46531(int i, Continuation<? super C46531> continuation) {
            super(2, continuation);
            this.$currentSelector = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningColorListViewModel.this.new C46531(this.$currentSelector, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TuningColorListViewModel.this.initGosCost(this.$currentSelector);
                    TuningColorListViewModel tuningColorListViewModel = TuningColorListViewModel.this;
                    List list = tuningColorListViewModel.lColorItemsFromJson;
                    int i2 = this.$currentSelector;
                    this.label = 1;
                    if (tuningColorListViewModel.initColorItems(list, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void initInterface(int currentSelector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46531(currentSelector, null), 2, null);
    }

    public final void initGosCost(int currentSelector) {
        this.mutableColorCost.setValue(Integer.valueOf(this.costCalculation.setCost(currentSelector, this.mutableGosCost.getValue().intValue())));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initColorItems(List<CarColorItem> list, int i, Continuation<? super Unit> continuation) throws Throwable {
        C46521 c46521;
        TuningColorListViewModel tuningColorListViewModel;
        int i2;
        int i3;
        if (continuation instanceof C46521) {
            c46521 = (C46521) continuation;
            int i4 = c46521.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c46521.label = i4 - Integer.MIN_VALUE;
            } else {
                c46521 = new C46521(continuation);
            }
        }
        Object obj = c46521.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c46521.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            if (list != null) {
                int iResetColorItems = resetColorItems(list);
                int startColor = setStartColor(list, i);
                MutableSharedFlow<List<CarColorItem>> mutableSharedFlow = this.mutableColorItems;
                c46521.L$0 = this;
                c46521.I$0 = iResetColorItems;
                c46521.I$1 = startColor;
                c46521.label = 1;
                if (mutableSharedFlow.emit(list, c46521) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tuningColorListViewModel = this;
                i2 = startColor;
                i3 = iResetColorItems;
            }
            return Unit.INSTANCE;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = c46521.I$1;
        i3 = c46521.I$0;
        tuningColorListViewModel = (TuningColorListViewModel) c46521.L$0;
        ResultKt.throwOnFailure(obj);
        tuningColorListViewModel.mutableNewAndOldStartColor.setValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i2), Boxing.boxInt(i3)}));
        return Unit.INSTANCE;
    }

    public final int resetColorItems(List<CarColorItem> colorItemsFromJson) {
        Object obj;
        Object next;
        List<CarColorItem> list = colorItemsFromJson;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CarColorItem) next).getSelected()) {
                break;
            }
        }
        CarColorItem carColorItem = (CarColorItem) next;
        if (carColorItem != null) {
            carColorItem.setSelected(false);
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((CarColorItem) next2).getStartColor()) {
                obj = next2;
                break;
            }
        }
        CarColorItem carColorItem2 = (CarColorItem) obj;
        if (carColorItem2 == null) {
            return -1;
        }
        carColorItem2.setStartColor(false);
        return colorItemsFromJson.indexOf(carColorItem2);
    }

    public final int setStartColor(List<CarColorItem> colorItemsFromJson, int currentSelector) {
        List<String> value = this.mutableStartColorItems.getValue();
        if (value.size() <= currentSelector) {
            return -1;
        }
        if (currentSelector == 0) {
            return updateStartColor(colorItemsFromJson, value.get(0));
        }
        if (currentSelector != 1) {
            if (currentSelector == 3) {
                return updateStartColor(colorItemsFromJson, value.get(2));
            }
            if (currentSelector == 4) {
                return updateStartColor(colorItemsFromJson, value.get(3));
            }
            if (currentSelector != 32) {
                switch (currentSelector) {
                    case 10:
                        return updateStartColor(colorItemsFromJson, value.get(4));
                    case 11:
                        return updateStartColor(colorItemsFromJson, value.get(5));
                    case 12:
                        return updateStartColor(colorItemsFromJson, value.get(6));
                    case 13:
                        return updateStartColor(colorItemsFromJson, value.get(7));
                    default:
                        return -1;
                }
            }
        }
        return updateStartColor(colorItemsFromJson, value.get(1));
    }

    public final int updateStartColor(List<CarColorItem> colorItemsFromJson, String currentColor) {
        return changeStartColor(colorItemsFromJson, getHexColor(currentColor));
    }

    public final String getHexColor(String currentColor) {
        int length = currentColor.length();
        if (length == 1) {
            currentColor = "000000";
        } else if (length == 3) {
            currentColor = currentColor + currentColor;
        } else if (length == 7) {
            currentColor = currentColor.substring(1);
            Intrinsics.checkNotNullExpressionValue(currentColor, "substring(...)");
        } else if (length == 8) {
            currentColor = currentColor.substring(2);
            Intrinsics.checkNotNullExpressionValue(currentColor, "substring(...)");
        }
        return "#" + (Intrinsics.areEqual(currentColor, "0") ? "000000" : currentColor);
    }

    public final int changeStartColor(List<CarColorItem> colorItemsFromJson, String hexColor) {
        Object next;
        if (!colorItemsFromJson.isEmpty()) {
            Iterator<T> it = colorItemsFromJson.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((CarColorItem) next).getColor(), hexColor)) {
                    break;
                }
            }
            CarColorItem carColorItem = (CarColorItem) next;
            if (carColorItem != null) {
                carColorItem.setStartColor(true);
                return colorItemsFromJson.indexOf(carColorItem);
            }
        }
        return -1;
    }

    public final void setValueOfTransparency(List<String> startColorItems) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        for (String str : startColorItems) {
            int length = str.length();
            int i = 0;
            if (length == 7) {
                String strSubstring2 = str.substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strSubstring = "0" + ((Object) strSubstring2);
            } else if (length == 8) {
                strSubstring = str.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = "00";
            }
            int iRoundToIntSafely = 100 - DoubleExtensionKt.roundToIntSafely(Double.valueOf(((Integer.valueOf(Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16))).doubleValue() - 96.0d) * 100.0d) / 159.0d).doubleValue());
            if (iRoundToIntSafely >= 0) {
                i = iRoundToIntSafely > 100 ? 100 : iRoundToIntSafely;
            }
            arrayList.add(Integer.valueOf(i));
        }
        this.mutableValueOfTransparency.setValue(arrayList);
    }

    /* compiled from: TuningColorListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$setColorObjToBuy$1", m7120f = "TuningColorListViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$setColorObjToBuy$1 */
    /* loaded from: classes2.dex */
    public static final class C46561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $currentColor;
        public final /* synthetic */ int $valueOfTransparency;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46561(int i, String str, Continuation<? super C46561> continuation) {
            super(2, continuation);
            this.$valueOfTransparency = i;
            this.$currentColor = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningColorListViewModel.this.new C46561(this.$valueOfTransparency, this.$currentColor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    String str = TuningColorListViewModel.this.transformTransparency(this.$valueOfTransparency) + TuningColorListViewModel.this.transformColor(this.$currentColor);
                    if (!Intrinsics.areEqual(this.$currentColor, "")) {
                        TuningColorListViewModel.this.sendToClientPreviewColor(str);
                        TuningColorListViewModel.this.mutableColorObjToBuy.setValue(str);
                    }
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setColorObjToBuy(@NotNull String currentColor, int valueOfTransparency) {
        Intrinsics.checkNotNullParameter(currentColor, "currentColor");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C46561(valueOfTransparency, currentColor, null), 3, null);
    }

    public final String transformTransparency(int valueOfTransparency) {
        if (valueOfTransparency != -1) {
            String hexString = Integer.toHexString(((valueOfTransparency * 159) / 100) + 96);
            Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = hexString.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (upperCase.length() != 1) {
                return upperCase;
            }
            return "0" + upperCase;
        }
        return TuningConstants.DEFAULT_TRANSPARENCY;
    }

    public final String transformColor(String currentColor) {
        if (!StringsKt__StringsJVMKt.startsWith$default(currentColor, "#", false, 2, null)) {
            return currentColor;
        }
        String strSubstring = currentColor.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void sendToClientPreviewColor(String finalColor) throws JSONException {
        this.actionWithJson.putColorToClient(23, finalColor);
    }

    /* compiled from: TuningColorListViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$sendApplyBuyReadyColor$1", m7120f = "TuningColorListViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningColorListViewModel$sendApplyBuyReadyColor$1 */
    /* loaded from: classes2.dex */
    public static final class C46551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentSelector;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46551(int i, Continuation<? super C46551> continuation) {
            super(2, continuation);
            this.$currentSelector = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningColorListViewModel.this.new C46551(this.$currentSelector, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    TuningColorListViewModel.this.actionWithJson.putColorDataWithSelectorIDToServer(1, (String) TuningColorListViewModel.this.mutableColorObjToBuy.getValue(), this.$currentSelector);
                } catch (Exception e) {
                    FirebaseCrashlytics.getInstance().recordException(e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendApplyBuyReadyColor(int currentSelector) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46551(currentSelector, null), 2, null);
    }
}
