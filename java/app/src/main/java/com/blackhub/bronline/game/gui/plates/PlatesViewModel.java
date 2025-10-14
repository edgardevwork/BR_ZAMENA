package com.blackhub.bronline.game.gui.plates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: PlatesViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class PlatesViewModel extends BaseViewModel<PlatesUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<PlatesUiState> _uiState;

    @NotNull
    public final PlatesActionWithJSON actionWithJSON;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<PlatesUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public PlatesViewModel(@NotNull PlatesActionWithJSON actionWithJSON, @NotNull StringResource stringResource) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        this.actionWithJSON = actionWithJSON;
        this.stringResource = stringResource;
        this._uiState = StateFlowKt.MutableStateFlow(new PlatesUiState(0, null, null, null, 0, 0, 0, false, false, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<PlatesUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<PlatesUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: PlatesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$initCurrencyType$1", m7120f = "PlatesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$initCurrencyType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,140:1\n230#2,5:141\n*S KotlinDebug\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$initCurrencyType$1\n*L\n41#1:141,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.plates.PlatesViewModel$initCurrencyType$1 */
    /* loaded from: classes7.dex */
    public static final class C43941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ PlatesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43941(JSONObject jSONObject, PlatesViewModel platesViewModel, Continuation<? super C43941> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = platesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43941(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.$json.optInt("t") == 0;
            MutableStateFlow<PlatesUiState> mutableStateFlow = this.this$0.get_uiState();
            JSONObject jSONObject = this.$json;
            PlatesViewModel platesViewModel = this.this$0;
            while (true) {
                PlatesUiState value = mutableStateFlow.getValue();
                PlatesUiState platesUiState = value;
                PlatesViewModel platesViewModel2 = platesViewModel;
                JSONObject jSONObject2 = jSONObject;
                MutableStateFlow<PlatesUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, platesUiState.copy((918 & 1) != 0 ? platesUiState.countryId : 0, (918 & 2) != 0 ? platesUiState.plateNumber : null, (918 & 4) != 0 ? platesUiState.plateRegion : null, (918 & 8) != 0 ? platesUiState.hintMainText : platesViewModel.getStringResource().platesMainHint(), (918 & 16) != 0 ? platesUiState.currencyType : jSONObject.optInt("t"), (918 & 32) != 0 ? platesUiState.priceOfPurchasePlate : 0, (918 & 64) != 0 ? platesUiState.priceOfRefreshPlate : 0, (918 & 128) != 0 ? platesUiState.isNeedShowRefresh : z, (918 & 256) != 0 ? platesUiState.isNewPlateInfoFromServer : z, (918 & 512) != 0 ? platesUiState.isNeedClose : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                jSONObject = jSONObject2;
                platesViewModel = platesViewModel2;
            }
        }
    }

    public final void initCurrencyType(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43941(json, this, null), 1, null);
    }

    /* compiled from: PlatesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$onPacketIncoming$1", m7120f = "PlatesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$onPacketIncoming$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,140:1\n230#2,5:141\n230#2,5:146\n230#2,5:151\n*S KotlinDebug\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$onPacketIncoming$1\n*L\n56#1:141,5\n65#1:146,5\n73#1:151,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.plates.PlatesViewModel$onPacketIncoming$1 */
    /* loaded from: classes7.dex */
    public static final class C43971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ PlatesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43971(JSONObject jSONObject, PlatesViewModel platesViewModel, Continuation<? super C43971> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = platesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43971(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            PlatesUiState value;
            PlatesUiState platesUiState;
            PlatesUiState value2;
            PlatesUiState platesUiState2;
            String strOptString;
            PlatesUiState value3;
            PlatesUiState platesUiState3;
            String strOptString2;
            String strOptString3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("t");
            if (iOptInt == 0) {
                MutableStateFlow<PlatesUiState> mutableStateFlow = this.this$0.get_uiState();
                JSONObject jSONObject = this.$json;
                do {
                    value = mutableStateFlow.getValue();
                    platesUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, platesUiState.copy((918 & 1) != 0 ? platesUiState.countryId : 0, (918 & 2) != 0 ? platesUiState.plateNumber : null, (918 & 4) != 0 ? platesUiState.plateRegion : null, (918 & 8) != 0 ? platesUiState.hintMainText : null, (918 & 16) != 0 ? platesUiState.currencyType : 0, (918 & 32) != 0 ? platesUiState.priceOfPurchasePlate : jSONObject.optInt("p"), (918 & 64) != 0 ? platesUiState.priceOfRefreshPlate : jSONObject.optInt("pr"), (918 & 128) != 0 ? platesUiState.isNeedShowRefresh : false, (918 & 256) != 0 ? platesUiState.isNewPlateInfoFromServer : false, (918 & 512) != 0 ? platesUiState.isNeedClose : false)));
            } else if (iOptInt == 1) {
                MutableStateFlow<PlatesUiState> mutableStateFlow2 = this.this$0.get_uiState();
                JSONObject jSONObject2 = this.$json;
                do {
                    value2 = mutableStateFlow2.getValue();
                    platesUiState2 = value2;
                    strOptString = jSONObject2.optString("h");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                } while (!mutableStateFlow2.compareAndSet(value2, platesUiState2.copy((918 & 1) != 0 ? platesUiState2.countryId : 0, (918 & 2) != 0 ? platesUiState2.plateNumber : null, (918 & 4) != 0 ? platesUiState2.plateRegion : null, (918 & 8) != 0 ? platesUiState2.hintMainText : strOptString, (918 & 16) != 0 ? platesUiState2.currencyType : 0, (918 & 32) != 0 ? platesUiState2.priceOfPurchasePlate : 0, (918 & 64) != 0 ? platesUiState2.priceOfRefreshPlate : 0, (918 & 128) != 0 ? platesUiState2.isNeedShowRefresh : false, (918 & 256) != 0 ? platesUiState2.isNewPlateInfoFromServer : false, (918 & 512) != 0 ? platesUiState2.isNeedClose : false)));
            } else if (iOptInt == 2) {
                MutableStateFlow<PlatesUiState> mutableStateFlow3 = this.this$0.get_uiState();
                JSONObject jSONObject3 = this.$json;
                PlatesViewModel platesViewModel = this.this$0;
                do {
                    value3 = mutableStateFlow3.getValue();
                    platesUiState3 = value3;
                    strOptString2 = jSONObject3.optString("p");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                    strOptString3 = jSONObject3.optString("r");
                    Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                } while (!mutableStateFlow3.compareAndSet(value3, platesUiState3.copy((918 & 1) != 0 ? platesUiState3.countryId : 0, (918 & 2) != 0 ? platesUiState3.plateNumber : strOptString2, (918 & 4) != 0 ? platesUiState3.plateRegion : strOptString3, (918 & 8) != 0 ? platesUiState3.hintMainText : platesViewModel.getStringResource().platesMainHint(), (918 & 16) != 0 ? platesUiState3.currencyType : 0, (918 & 32) != 0 ? platesUiState3.priceOfPurchasePlate : 0, (918 & 64) != 0 ? platesUiState3.priceOfRefreshPlate : 0, (918 & 128) != 0 ? platesUiState3.isNeedShowRefresh : false, (918 & 256) != 0 ? platesUiState3.isNewPlateInfoFromServer : false, (918 & 512) != 0 ? platesUiState3.isNeedClose : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onPacketIncoming(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43971(json, this, null), 1, null);
    }

    /* compiled from: PlatesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$onClickButtonExit$1", m7120f = "PlatesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$onClickButtonExit$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,140:1\n230#2,5:141\n*S KotlinDebug\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$onClickButtonExit$1\n*L\n89#1:141,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.plates.PlatesViewModel$onClickButtonExit$1 */
    /* loaded from: classes7.dex */
    public static final class C43951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43951(Continuation<? super C43951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlatesViewModel.this.new C43951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            PlatesUiState value;
            PlatesUiState platesUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PlatesViewModel.this.actionWithJSON.sendButtonClick(0);
                MutableStateFlow<PlatesUiState> mutableStateFlow = PlatesViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    platesUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, platesUiState.copy((918 & 1) != 0 ? platesUiState.countryId : 0, (918 & 2) != 0 ? platesUiState.plateNumber : null, (918 & 4) != 0 ? platesUiState.plateRegion : null, (918 & 8) != 0 ? platesUiState.hintMainText : null, (918 & 16) != 0 ? platesUiState.currencyType : 0, (918 & 32) != 0 ? platesUiState.priceOfPurchasePlate : 0, (918 & 64) != 0 ? platesUiState.priceOfRefreshPlate : 0, (918 & 128) != 0 ? platesUiState.isNeedShowRefresh : false, (918 & 256) != 0 ? platesUiState.isNewPlateInfoFromServer : false, (918 & 512) != 0 ? platesUiState.isNeedClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickButtonExit() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43951(null), 1, null);
    }

    /* compiled from: PlatesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$onClickButtonRefresh$1", m7120f = "PlatesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.plates.PlatesViewModel$onClickButtonRefresh$1 */
    /* loaded from: classes7.dex */
    public static final class C43961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43961(Continuation<? super C43961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlatesViewModel.this.new C43961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PlatesViewModel.this.actionWithJSON.sendButtonClick(2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickButtonRefresh() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43961(null), 1, null);
    }

    /* compiled from: PlatesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$changeCountry$1", m7120f = "PlatesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$changeCountry$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,140:1\n230#2,5:141\n*S KotlinDebug\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$changeCountry$1\n*L\n107#1:141,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.plates.PlatesViewModel$changeCountry$1 */
    /* loaded from: classes7.dex */
    public static final class C43921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $countryId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43921(int i, Continuation<? super C43921> continuation) {
            super(2, continuation);
            this.$countryId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlatesViewModel.this.new C43921(this.$countryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PlatesViewModel.this.actionWithJSON.sendChangeCountry(this.$countryId);
                MutableStateFlow<PlatesUiState> mutableStateFlow = PlatesViewModel.this.get_uiState();
                PlatesViewModel platesViewModel = PlatesViewModel.this;
                int i = this.$countryId;
                while (true) {
                    PlatesUiState value = mutableStateFlow.getValue();
                    PlatesUiState platesUiState = value;
                    int i2 = i;
                    if (mutableStateFlow.compareAndSet(value, platesUiState.copy((918 & 1) != 0 ? platesUiState.countryId : i, (918 & 2) != 0 ? platesUiState.plateNumber : null, (918 & 4) != 0 ? platesUiState.plateRegion : null, (918 & 8) != 0 ? platesUiState.hintMainText : platesViewModel.getStringResource().platesMainHint(), (918 & 16) != 0 ? platesUiState.currencyType : 0, (918 & 32) != 0 ? platesUiState.priceOfPurchasePlate : 0, (918 & 64) != 0 ? platesUiState.priceOfRefreshPlate : 0, (918 & 128) != 0 ? platesUiState.isNeedShowRefresh : false, (918 & 256) != 0 ? platesUiState.isNewPlateInfoFromServer : false, (918 & 512) != 0 ? platesUiState.isNeedClose : false))) {
                        return Unit.INSTANCE;
                    }
                    i = i2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void changeCountry(int countryId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43921(countryId, null), 1, null);
    }

    /* compiled from: PlatesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$purchasePlate$1", m7120f = "PlatesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$purchasePlate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.plates.PlatesViewModel$purchasePlate$1 */
    /* loaded from: classes7.dex */
    public static final class C43981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $plateNumber;
        public final /* synthetic */ String $plateRegion;
        public int label;
        public final /* synthetic */ PlatesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43981(String str, PlatesViewModel platesViewModel, String str2, Continuation<? super C43981> continuation) {
            super(2, continuation);
            this.$plateRegion = str;
            this.this$0 = platesViewModel;
            this.$plateNumber = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43981(this.$plateRegion, this.this$0, this.$plateNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$plateRegion;
            if (str.length() == 0) {
                str = "tt";
            }
            this.this$0.actionWithJSON.sendPurchasePlate(this.$plateNumber, str);
            return Unit.INSTANCE;
        }
    }

    public final void purchasePlate(@NotNull String plateNumber, @NotNull String plateRegion) {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43981(plateRegion, this, plateNumber, null), 1, null);
    }

    /* compiled from: PlatesViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.plates.PlatesViewModel$changedText$1", m7120f = "PlatesViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPlatesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesViewModel.kt\ncom/blackhub/bronline/game/gui/plates/PlatesViewModel$changedText$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n1#2:141\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.plates.PlatesViewModel$changedText$1 */
    /* loaded from: classes7.dex */
    public static final class C43931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $plateNumber;
        public final /* synthetic */ String $plateRegion;
        public int label;
        public final /* synthetic */ PlatesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43931(String str, String str2, PlatesViewModel platesViewModel, Continuation<? super C43931> continuation) {
            super(2, continuation);
            this.$plateRegion = str;
            this.$plateNumber = str2;
            this.this$0 = platesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43931(this.$plateRegion, this.$plateNumber, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$plateRegion;
            if (str.length() == 0) {
                str = "tt";
            }
            if (this.$plateNumber.length() > 0) {
                this.this$0.actionWithJSON.sendChangedText(this.this$0.get_uiState().getValue().getCountryId(), this.$plateNumber, str);
            }
            return Unit.INSTANCE;
        }
    }

    public final void changedText(@NotNull String plateNumber, @NotNull String plateRegion) {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43931(plateRegion, plateNumber, this, null), 1, null);
    }
}

