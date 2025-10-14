package com.blackhub.bronline.game.gui.taxirating;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
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

/* compiled from: TaxiRatingViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTaxiRatingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiRatingViewModel.kt\ncom/blackhub/bronline/game/gui/taxirating/TaxiRatingViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,53:1\n230#2,5:54\n230#2,5:59\n*S KotlinDebug\n*F\n+ 1 TaxiRatingViewModel.kt\ncom/blackhub/bronline/game/gui/taxirating/TaxiRatingViewModel\n*L\n22#1:54,5\n31#1:59,5\n*E\n"})
/* loaded from: classes.dex */
public final class TaxiRatingViewModel extends BaseViewModel<TaxiRatingUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TaxiRatingUiState> _uiState;

    @NotNull
    public final TaxiRatingActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<TaxiRatingUiState> uiState;

    @Inject
    public TaxiRatingViewModel(@NotNull TaxiRatingActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new TaxiRatingUiState(0, false, 0, 0, false, 31, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<TaxiRatingUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TaxiRatingUiState> getUiState() {
        return this.uiState;
    }

    public final void onClickSelectRate(int rate) {
        TaxiRatingUiState value;
        MutableStateFlow<TaxiRatingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, TaxiRatingUiState.copy$default(value, 0, true, rate, 0, false, 25, null)));
    }

    public final void onClickSelectTips(int tips) {
        TaxiRatingUiState value;
        MutableStateFlow<TaxiRatingUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, TaxiRatingUiState.copy$default(value, 0, false, 0, tips, false, 23, null)));
    }

    /* compiled from: TaxiRatingViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxirating.TaxiRatingViewModel$onClickConfirm$1", m7120f = "TaxiRatingViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiRatingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiRatingViewModel.kt\ncom/blackhub/bronline/game/gui/taxirating/TaxiRatingViewModel$onClickConfirm$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,53:1\n230#2,5:54\n*S KotlinDebug\n*F\n+ 1 TaxiRatingViewModel.kt\ncom/blackhub/bronline/game/gui/taxirating/TaxiRatingViewModel$onClickConfirm$1\n*L\n45#1:54,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxirating.TaxiRatingViewModel$onClickConfirm$1 */
    /* loaded from: classes3.dex */
    public static final class C45541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45541(Continuation<? super C45541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiRatingViewModel.this.new C45541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TaxiRatingUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TaxiRatingViewModel.this.actionWithJSON.sendInfo(TaxiRatingViewModel.this.getUiState().getValue().getSelectedRate(), TaxiRatingViewModel.this.getUiState().getValue().getSelectedTip());
            TaxiRatingViewModel.this.actionWithJSON.sendCloseScreen();
            MutableStateFlow<TaxiRatingUiState> mutableStateFlow = TaxiRatingViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, TaxiRatingUiState.copy$default(value, 0, false, 0, 0, true, 15, null)));
            return Unit.INSTANCE;
        }
    }

    public final void onClickConfirm() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45541(null), 1, null);
    }
}

