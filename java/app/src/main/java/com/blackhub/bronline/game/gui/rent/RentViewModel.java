package com.blackhub.bronline.game.gui.rent;

import androidx.compose.runtime.internal.StabilityInferred;
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

/* compiled from: RentViewModel.kt */
@StabilityInferred(parameters = 0)

public final class RentViewModel extends BaseViewModel<RentUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<RentUiState> _uiState;

    @NotNull
    public final RentActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<RentUiState> uiState;

    @Inject
    public RentViewModel(@NotNull RentActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new RentUiState(false, 1, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<RentUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<RentUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: RentViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rent.RentViewModel$onClickButtonWithId$1", m7120f = "RentViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.rent.RentViewModel$onClickButtonWithId$1 */
    /* loaded from: classes3.dex */
    public static final class C44791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44791(int i, Continuation<? super C44791> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RentViewModel.this.new C44791(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RentViewModel.this.actionWithJSON.sendOnClickButtonWithId(this.$buttonId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickButtonWithId(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C44791(buttonId, null), 1, null);
    }

    /* compiled from: RentViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rent.RentViewModel$closeInterface$1", m7120f = "RentViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentViewModel.kt\ncom/blackhub/bronline/game/gui/rent/RentViewModel$closeInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,35:1\n230#2,5:36\n*S KotlinDebug\n*F\n+ 1 RentViewModel.kt\ncom/blackhub/bronline/game/gui/rent/RentViewModel$closeInterface$1\n*L\n28#1:36,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rent.RentViewModel$closeInterface$1 */
    /* loaded from: classes3.dex */
    public static final class C44781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44781(Continuation<? super C44781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RentViewModel.this.new C44781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RentUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RentViewModel.this.actionWithJSON.sendCloseInterface();
                MutableStateFlow<RentUiState> mutableStateFlow = RentViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, value.copy(true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeInterface() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C44781(null), 1, null);
    }
}

