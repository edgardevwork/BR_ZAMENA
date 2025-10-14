package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.RaiseChargeUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.bless.client.R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RaiseChargeViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n230#2,5:149\n230#2,5:154\n230#2,5:159\n230#2,5:164\n230#2,5:169\n230#2,5:174\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel\n*L\n41#1:149,5\n86#1:154,5\n94#1:159,5\n102#1:164,5\n111#1:169,5\n119#1:174,5\n*E\n"})

public final class RaiseChargeViewModel extends BaseViewModel<RaiseChargeUiState> implements ViewModelProvider.Factory {
    public static final int NEGATIVE_NUMBER = -10;
    public static final int NUMBER_ONE = 1;
    public static final long SET_WIN_DELAY = 500;

    @NotNull
    public final MutableStateFlow<RaiseChargeUiState> _uiState;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<RaiseChargeUiState> uiState;
    public static final int $stable = 8;

    @Inject
    public RaiseChargeViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new RaiseChargeUiState(null, null, false, false, false, 0, false, null, 0, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<RaiseChargeUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<RaiseChargeUiState> getUiState() {
        return this.uiState;
    }

    public final void raiseCount() {
        RaiseChargeUiState value;
        RaiseChargeUiState raiseChargeUiState;
        MutableStateFlow<RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            raiseChargeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : false, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 3, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : get_uiState().getValue().getCount() + 1)));
    }

    /* compiled from: RaiseChargeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$setWin$1", m7120f = "RaiseChargeViewModel.kt", m7121i = {}, m7122l = {51}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$setWin$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n230#2,5:149\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$setWin$1\n*L\n52#1:149,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$setWin$1 */
    /* loaded from: classes3.dex */
    public static final class C39851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isWin;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39851(boolean z, Continuation<? super C39851> continuation) {
            super(2, continuation);
            this.$isWin = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RaiseChargeViewModel.this.new C39851(this.$isWin, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RaiseChargeUiState value;
            RaiseChargeUiState raiseChargeUiState;
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
            MutableStateFlow<RaiseChargeUiState> mutableStateFlow = RaiseChargeViewModel.this.get_uiState();
            boolean z = this.$isWin;
            do {
                value = mutableStateFlow.getValue();
                raiseChargeUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : false, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 0, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : Boxing.boxBoolean(z), (504 & 256) != 0 ? raiseChargeUiState.count : -10)));
            return Unit.INSTANCE;
        }
    }

    public final void setWin(boolean isWin) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39851(isWin, null), 1, null);
    }

    /* compiled from: RaiseChargeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$initArgs$1", m7120f = "RaiseChargeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n96#2:149\n230#3,5:150\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initArgs$1\n*L\n65#1:149\n75#1:150,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$initArgs$1 */
    /* loaded from: classes3.dex */
    public static final class C39821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $screenArgs;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ RaiseChargeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39821(String str, RaiseChargeViewModel raiseChargeViewModel, Continuation<? super C39821> continuation) {
            super(2, continuation);
            this.$screenArgs = str;
            this.this$0 = raiseChargeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39821 c39821 = new C39821(this.$screenArgs, this.this$0, continuation);
            c39821.L$0 = obj;
            return c39821;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List listEmptyList;
            String strEmpty;
            RaiseChargeUiState value;
            RaiseChargeUiState raiseChargeUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            try {
                Json.Companion companion = Json.INSTANCE;
                String str = this.$screenArgs;
                companion.getSerializersModule();
                listEmptyList = (List) companion.decodeFromString(new ArrayListSerializer(ElectricInstructionsAndHintsModel.INSTANCE.serializer()), str);
            } catch (Exception unused) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull(listEmptyList);
            if (electricInstructionsAndHintsModel == null || (strEmpty = electricInstructionsAndHintsModel.getTextInstructions()) == null) {
                strEmpty = AnyExtensionKt.empty(coroutineScope);
            }
            List listListOf = CollectionsKt__CollectionsJVMKt.listOf(new GameInstructionsItem(R.drawable.img_instructions_raise_charge, strEmpty));
            MutableStateFlow<RaiseChargeUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                raiseChargeUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : listEmptyList, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : listListOf, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : true, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : false, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 0, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : 0)));
            return Unit.INSTANCE;
        }
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39821(screenArgs, this, null), 1, null);
    }

    public final void setTwoHint() {
        RaiseChargeUiState value;
        RaiseChargeUiState raiseChargeUiState;
        MutableStateFlow<RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            raiseChargeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : false, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 2, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : 0)));
    }

    public final void hideHand() {
        RaiseChargeUiState value;
        RaiseChargeUiState raiseChargeUiState;
        MutableStateFlow<RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            raiseChargeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : false, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 0, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : 0)));
    }

    public final void closeInstruction() {
        RaiseChargeUiState value;
        RaiseChargeUiState raiseChargeUiState;
        MutableStateFlow<RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            raiseChargeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : getUiState().getValue().isFirstGame(), (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 0, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : 0)));
    }

    public final void showHint() {
        RaiseChargeUiState value;
        RaiseChargeUiState raiseChargeUiState;
        MutableStateFlow<RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            raiseChargeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : true, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 0, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : 0)));
    }

    public final void closeHint() {
        RaiseChargeUiState value;
        RaiseChargeUiState raiseChargeUiState;
        MutableStateFlow<RaiseChargeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            raiseChargeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : false, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 0, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : false, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : 0)));
    }

    /* compiled from: RaiseChargeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$resetData$1", m7120f = "RaiseChargeViewModel.kt", m7121i = {}, m7122l = {128}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$resetData$1 */
    /* loaded from: classes3.dex */
    public static final class C39841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39841(Continuation<? super C39841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RaiseChargeViewModel.this.new C39841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<RaiseChargeUiState> mutableStateFlow = RaiseChargeViewModel.this.get_uiState();
                RaiseChargeUiState raiseChargeUiState = new RaiseChargeUiState(null, null, false, false, false, 0, false, null, 0, 511, null);
                this.label = 1;
                if (mutableStateFlow.emit(raiseChargeUiState, this) == coroutine_suspended) {
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

    public final void resetData() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39841(null), 1, null);
    }

    /* compiled from: RaiseChargeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$initPreferences$1", m7120f = "RaiseChargeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRaiseChargeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initPreferences$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,148:1\n230#2,5:149\n*S KotlinDebug\n*F\n+ 1 RaiseChargeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/RaiseChargeViewModel$initPreferences$1\n*L\n141#1:149,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.RaiseChargeViewModel$initPreferences$1 */
    /* loaded from: classes3.dex */
    public static final class C39831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39831(Continuation<? super C39831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RaiseChargeViewModel.this.new C39831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RaiseChargeUiState value;
            RaiseChargeUiState raiseChargeUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = false;
                if (PreferencesRepository.getInteger$default(RaiseChargeViewModel.this.preferencesRepository, ElectricConstants.RAISE_CHARGE_PREFERENCES, 0, 2, null) == -1) {
                    z = true;
                    RaiseChargeViewModel.this.preferencesRepository.putInteger(ElectricConstants.RAISE_CHARGE_PREFERENCES, 1);
                }
                MutableStateFlow<RaiseChargeUiState> mutableStateFlow = RaiseChargeViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    raiseChargeUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, raiseChargeUiState.copy((504 & 1) != 0 ? raiseChargeUiState.instructionsAndHints : null, (504 & 2) != 0 ? raiseChargeUiState.gameInstructionsItemList : null, (504 & 4) != 0 ? raiseChargeUiState.isInstructionsShow : false, (504 & 8) != 0 ? raiseChargeUiState.isHintShow : false, (504 & 16) != 0 ? raiseChargeUiState.isHandShow : false, (504 & 32) != 0 ? raiseChargeUiState.countHint : 0, (504 & 64) != 0 ? raiseChargeUiState.isFirstGame : z, (504 & 128) != 0 ? raiseChargeUiState.isWin : null, (504 & 256) != 0 ? raiseChargeUiState.count : 0)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39831(null), 1, null);
    }
}

