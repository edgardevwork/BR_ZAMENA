package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.ChangeBulbUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeBulbViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fJ\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0019R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/ChangeBulbUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "bulbBusyList", "", "", "getBulbBusyList", "()Ljava/util/List;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "closeHint", "", "initArgs", "screenArgs", "initPreferences", "setBulbBrokeInvisible", "setBulbVisible", "countWin", "", "showHint", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n230#2,5:112\n230#2,5:117\n230#2,5:122\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel\n*L\n54#1:112,5\n76#1:117,5\n84#1:122,5\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeBulbViewModel extends BaseViewModel<ChangeBulbUiState> implements ViewModelProvider.Factory {
    public static final int COUNT_WIN = 2;

    @NotNull
    public final MutableStateFlow<ChangeBulbUiState> _uiState;

    @NotNull
    public final List<String> bulbBusyList;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<ChangeBulbUiState> uiState;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public ChangeBulbViewModel(@NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new ChangeBulbUiState(null, false, false, 0, false, false, false, null, 255, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.bulbBusyList = CollectionsKt__CollectionsKt.mutableListOf(ElectricConstants.BULB_BUSY);
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<ChangeBulbUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ChangeBulbUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final List<String> getBulbBusyList() {
        return this.bulbBusyList;
    }

    /* compiled from: ChangeBulbViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$setBulbBrokeInvisible$1", m7120f = "ChangeBulbViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$setBulbBrokeInvisible$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n230#2,5:112\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$setBulbBrokeInvisible$1\n*L\n43#1:112,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$setBulbBrokeInvisible$1 */
    /* loaded from: classes3.dex */
    public static final class C39671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39671(Continuation<? super C39671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChangeBulbViewModel.this.new C39671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChangeBulbUiState value;
            ChangeBulbUiState changeBulbUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChangeBulbViewModel.this.getBulbBusyList().remove(ElectricConstants.BULB_BUSY);
            MutableStateFlow<ChangeBulbUiState> mutableStateFlow = ChangeBulbViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                changeBulbUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, changeBulbUiState.copy((254 & 1) != 0 ? changeBulbUiState.instructionsAndHints : null, (254 & 2) != 0 ? changeBulbUiState.isHintShow : false, (254 & 4) != 0 ? changeBulbUiState.isHandShow : false, (254 & 8) != 0 ? changeBulbUiState.countHint : 2, (254 & 16) != 0 ? changeBulbUiState.isBulbBrokeVisible : false, (254 & 32) != 0 ? changeBulbUiState.isBulbFullVisible : false, (254 & 64) != 0 ? changeBulbUiState.isFirstGame : false, (254 & 128) != 0 ? changeBulbUiState.isWin : null)));
            return Unit.INSTANCE;
        }
    }

    public final void setBulbBrokeInvisible() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39671(null), 1, null);
    }

    public final void setBulbVisible(int countWin) {
        ChangeBulbUiState value;
        ChangeBulbUiState changeBulbUiState;
        boolean z = countWin == 2;
        MutableStateFlow<ChangeBulbUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            changeBulbUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, changeBulbUiState.copy((254 & 1) != 0 ? changeBulbUiState.instructionsAndHints : null, (254 & 2) != 0 ? changeBulbUiState.isHintShow : false, (254 & 4) != 0 ? changeBulbUiState.isHandShow : false, (254 & 8) != 0 ? changeBulbUiState.countHint : 0, (254 & 16) != 0 ? changeBulbUiState.isBulbBrokeVisible : !z, (254 & 32) != 0 ? changeBulbUiState.isBulbFullVisible : z, (254 & 64) != 0 ? changeBulbUiState.isFirstGame : false, (254 & 128) != 0 ? changeBulbUiState.isWin : Boolean.valueOf(z))));
    }

    /* compiled from: ChangeBulbViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$initArgs$1", m7120f = "ChangeBulbViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n96#2:112\n230#3,5:113\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initArgs$1\n*L\n66#1:112\n67#1:113,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$initArgs$1 */
    /* loaded from: classes3.dex */
    public static final class C39651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $screenArgs;
        public int label;
        public final /* synthetic */ ChangeBulbViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39651(String str, ChangeBulbViewModel changeBulbViewModel, Continuation<? super C39651> continuation) {
            super(2, continuation);
            this.$screenArgs = str;
            this.this$0 = changeBulbViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C39651(this.$screenArgs, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChangeBulbUiState value;
            ChangeBulbUiState changeBulbUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Json.Companion companion = Json.INSTANCE;
            String str = this.$screenArgs;
            companion.getSerializersModule();
            List list = (List) companion.decodeFromString(new ArrayListSerializer(ElectricInstructionsAndHintsModel.INSTANCE.serializer()), str);
            MutableStateFlow<ChangeBulbUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                changeBulbUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, changeBulbUiState.copy((254 & 1) != 0 ? changeBulbUiState.instructionsAndHints : list, (254 & 2) != 0 ? changeBulbUiState.isHintShow : false, (254 & 4) != 0 ? changeBulbUiState.isHandShow : false, (254 & 8) != 0 ? changeBulbUiState.countHint : 0, (254 & 16) != 0 ? changeBulbUiState.isBulbBrokeVisible : false, (254 & 32) != 0 ? changeBulbUiState.isBulbFullVisible : false, (254 & 64) != 0 ? changeBulbUiState.isFirstGame : false, (254 & 128) != 0 ? changeBulbUiState.isWin : null)));
            return Unit.INSTANCE;
        }
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39651(screenArgs, this, null), 1, null);
    }

    public final void showHint() {
        ChangeBulbUiState value;
        ChangeBulbUiState changeBulbUiState;
        MutableStateFlow<ChangeBulbUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            changeBulbUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, changeBulbUiState.copy((254 & 1) != 0 ? changeBulbUiState.instructionsAndHints : null, (254 & 2) != 0 ? changeBulbUiState.isHintShow : true, (254 & 4) != 0 ? changeBulbUiState.isHandShow : false, (254 & 8) != 0 ? changeBulbUiState.countHint : 0, (254 & 16) != 0 ? changeBulbUiState.isBulbBrokeVisible : false, (254 & 32) != 0 ? changeBulbUiState.isBulbFullVisible : false, (254 & 64) != 0 ? changeBulbUiState.isFirstGame : false, (254 & 128) != 0 ? changeBulbUiState.isWin : null)));
    }

    public final void closeHint() {
        ChangeBulbUiState value;
        ChangeBulbUiState changeBulbUiState;
        MutableStateFlow<ChangeBulbUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            changeBulbUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, changeBulbUiState.copy((254 & 1) != 0 ? changeBulbUiState.instructionsAndHints : null, (254 & 2) != 0 ? changeBulbUiState.isHintShow : false, (254 & 4) != 0 ? changeBulbUiState.isHandShow : false, (254 & 8) != 0 ? changeBulbUiState.countHint : 0, (254 & 16) != 0 ? changeBulbUiState.isBulbBrokeVisible : false, (254 & 32) != 0 ? changeBulbUiState.isBulbFullVisible : false, (254 & 64) != 0 ? changeBulbUiState.isFirstGame : false, (254 & 128) != 0 ? changeBulbUiState.isWin : null)));
    }

    /* compiled from: ChangeBulbViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$initPreferences$1", m7120f = "ChangeBulbViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChangeBulbViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initPreferences$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,111:1\n230#2,5:112\n*S KotlinDebug\n*F\n+ 1 ChangeBulbViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/ChangeBulbViewModel$initPreferences$1\n*L\n103#1:112,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.ChangeBulbViewModel$initPreferences$1 */
    /* loaded from: classes3.dex */
    public static final class C39661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39661(Continuation<? super C39661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChangeBulbViewModel.this.new C39661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ChangeBulbUiState value;
            ChangeBulbUiState changeBulbUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = false;
                if (PreferencesRepository.getInteger$default(ChangeBulbViewModel.this.preferencesRepository, ElectricConstants.CHANGE_BULB_PREFERENCES, 0, 2, null) == -1) {
                    z = true;
                    ChangeBulbViewModel.this.preferencesRepository.putInteger(ElectricConstants.CHANGE_BULB_PREFERENCES, 1);
                }
                MutableStateFlow<ChangeBulbUiState> mutableStateFlow = ChangeBulbViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    changeBulbUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, changeBulbUiState.copy((254 & 1) != 0 ? changeBulbUiState.instructionsAndHints : null, (254 & 2) != 0 ? changeBulbUiState.isHintShow : z, (254 & 4) != 0 ? changeBulbUiState.isHandShow : false, (254 & 8) != 0 ? changeBulbUiState.countHint : 0, (254 & 16) != 0 ? changeBulbUiState.isBulbBrokeVisible : false, (254 & 32) != 0 ? changeBulbUiState.isBulbFullVisible : false, (254 & 64) != 0 ? changeBulbUiState.isFirstGame : z, (254 & 128) != 0 ? changeBulbUiState.isWin : null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39661(null), 1, null);
    }
}
