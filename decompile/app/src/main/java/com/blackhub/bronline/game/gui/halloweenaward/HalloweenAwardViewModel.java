package com.blackhub.bronline.game.gui.halloweenaward;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
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
import org.json.JSONObject;

/* compiled from: HalloweenAwardViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "sendType", "type", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHalloweenAwardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,55:1\n230#2,5:56\n*S KotlinDebug\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel\n*L\n34#1:56,5\n*E\n"})
/* loaded from: classes3.dex */
public final class HalloweenAwardViewModel extends BaseViewModel<HalloweenAwardUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<HalloweenAwardUiState> _uiState;

    @NotNull
    public final HalloweenAwardActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<HalloweenAwardUiState> uiState;

    @Inject
    public HalloweenAwardViewModel(@NotNull HalloweenAwardActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new HalloweenAwardUiState(null, 0, 0, 0, 0, 0, false, false, 255, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<HalloweenAwardUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<HalloweenAwardUiState> getUiState() {
        return this.uiState;
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = json.optString("n", AnyExtensionKt.empty(this));
        int iOptInt = json.optInt("p", 0);
        int iOptInt2 = json.optInt(HalloweenAwardKeys.HALLOWEEN_AWARD_MONEY_KEY, 0);
        int iOptInt3 = json.optInt(HalloweenAwardKeys.HALLOWEEN_AWARD_MONEY_BP_KEY, 0);
        int iOptInt4 = json.optInt("bs", 0);
        int iOptInt5 = json.optInt(HalloweenAwardKeys.HALLOWEEN_AWARD_XP_BP_KEY, 0);
        MutableStateFlow<HalloweenAwardUiState> mutableStateFlow = get_uiState();
        while (true) {
            HalloweenAwardUiState value = mutableStateFlow.getValue();
            HalloweenAwardUiState halloweenAwardUiState = value;
            Intrinsics.checkNotNull(strOptString);
            int i = iOptInt5;
            int i2 = iOptInt5;
            MutableStateFlow<HalloweenAwardUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, halloweenAwardUiState.copy((191 & 1) != 0 ? halloweenAwardUiState.titleText : strOptString, (191 & 2) != 0 ? halloweenAwardUiState.premium : iOptInt, (191 & 4) != 0 ? halloweenAwardUiState.money : iOptInt2, (191 & 8) != 0 ? halloweenAwardUiState.moneyBP : iOptInt3, (191 & 16) != 0 ? halloweenAwardUiState.scoreBP : iOptInt4, (191 & 32) != 0 ? halloweenAwardUiState.xpBP : i, (191 & 64) != 0 ? halloweenAwardUiState.isNeedClose : false, (191 & 128) != 0 ? halloweenAwardUiState.isBlockingLoading : false))) {
                return;
            }
            mutableStateFlow = mutableStateFlow2;
            iOptInt5 = i2;
        }
    }

    /* compiled from: HalloweenAwardViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardViewModel$sendType$1", m7120f = "HalloweenAwardViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nHalloweenAwardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel$sendType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,55:1\n230#2,5:56\n*S KotlinDebug\n*F\n+ 1 HalloweenAwardViewModel.kt\ncom/blackhub/bronline/game/gui/halloweenaward/HalloweenAwardViewModel$sendType$1\n*L\n50#1:56,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.halloweenaward.HalloweenAwardViewModel$sendType$1 */
    /* loaded from: classes2.dex */
    public static final class C41261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $type;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41261(int i, Continuation<? super C41261> continuation) {
            super(2, continuation);
            this.$type = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HalloweenAwardViewModel.this.new C41261(this.$type, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C41261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HalloweenAwardUiState value;
            HalloweenAwardUiState halloweenAwardUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HalloweenAwardViewModel.this.actionWithJSON.sendType(this.$type);
                HalloweenAwardViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<HalloweenAwardUiState> mutableStateFlow = HalloweenAwardViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    halloweenAwardUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, halloweenAwardUiState.copy((191 & 1) != 0 ? halloweenAwardUiState.titleText : null, (191 & 2) != 0 ? halloweenAwardUiState.premium : 0, (191 & 4) != 0 ? halloweenAwardUiState.money : 0, (191 & 8) != 0 ? halloweenAwardUiState.moneyBP : 0, (191 & 16) != 0 ? halloweenAwardUiState.scoreBP : 0, (191 & 32) != 0 ? halloweenAwardUiState.xpBP : 0, (191 & 64) != 0 ? halloweenAwardUiState.isNeedClose : true, (191 & 128) != 0 ? halloweenAwardUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendType(int type) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C41261(type, null), 1, null);
    }
}
