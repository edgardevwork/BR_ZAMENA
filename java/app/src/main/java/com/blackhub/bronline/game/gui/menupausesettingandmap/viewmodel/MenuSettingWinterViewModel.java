package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.state.MenuWinterUiState;
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

/* compiled from: MenuSettingWinterViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMenuSettingWinterViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSettingWinterViewModel.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,95:1\n230#2,5:96\n230#2,5:101\n230#2,5:106\n*S KotlinDebug\n*F\n+ 1 MenuSettingWinterViewModel.kt\ncom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingWinterViewModel\n*L\n69#1:96,5\n80#1:101,5\n89#1:106,5\n*E\n"})
/* loaded from: classes3.dex */
public final class MenuSettingWinterViewModel extends BaseViewModel<MenuWinterUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MenuWinterUiState> _uiState;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<MenuWinterUiState> uiState;

    @Inject
    public MenuSettingWinterViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new MenuWinterUiState(0, false, false, false, 15, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<MenuWinterUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MenuWinterUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: MenuSettingWinterViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel$initialParameters$1", m7120f = "MenuSettingWinterViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingWinterViewModel$initialParameters$1 */
    /* loaded from: classes7.dex */
    public static final class C43671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43671(Continuation<? super C43671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuSettingWinterViewModel.this.new C43671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (PreferencesRepository.getInteger$default(MenuSettingWinterViewModel.this.preferencesRepository, NewMenuConstants.IS_INIT_SETTING_WINTER, 0, 2, null) == -1) {
                    MenuSettingWinterViewModel.this.setDefaultParameters();
                } else {
                    MenuSettingWinterViewModel menuSettingWinterViewModel = MenuSettingWinterViewModel.this;
                    menuSettingWinterViewModel.updateParams(menuSettingWinterViewModel.preferencesRepository.getInteger(NewMenuConstants.SNOW_INTENSITY, 2), MenuSettingWinterViewModel.this.preferencesRepository.getInteger(NewMenuConstants.WINTER_SLIP, 0) == 1);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void initialParameters() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43671(null), 1, null);
    }

    public final void setDefaultParameters() {
        PreferencesRepository preferencesRepository = this.preferencesRepository;
        preferencesRepository.putInteger(NewMenuConstants.SNOW_INTENSITY, 2);
        preferencesRepository.putInteger(NewMenuConstants.WINTER_SLIP, 0);
        setInitFlag();
        updateParams(2, false);
    }

    public final void setInitFlag() {
        this.preferencesRepository.putInteger(NewMenuConstants.IS_INIT_SETTING_WINTER, 1);
    }

    public final void sendNewSettingParameter(@NotNull String currentSettingKey, int newParameter) {
        Intrinsics.checkNotNullParameter(currentSettingKey, "currentSettingKey");
        this.preferencesRepository.putInteger(currentSettingKey, newParameter);
    }

    public final void setSnowIntensity(int snowIntensityValue) {
        MenuWinterUiState value;
        MutableStateFlow<MenuWinterUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuWinterUiState.copy$default(value, snowIntensityValue, false, false, false, 14, null)));
    }

    public final void updateParams(int snowIntensityValue, boolean isWinterSlip) {
        MenuWinterUiState value;
        MutableStateFlow<MenuWinterUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuWinterUiState.copy$default(value, snowIntensityValue, isWinterSlip, false, false, 12, null)));
    }

    public final void setWinterSlip(boolean isWinterSlip) {
        MenuWinterUiState value;
        MutableStateFlow<MenuWinterUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MenuWinterUiState.copy$default(value, 0, isWinterSlip, false, false, 13, null)));
    }
}

