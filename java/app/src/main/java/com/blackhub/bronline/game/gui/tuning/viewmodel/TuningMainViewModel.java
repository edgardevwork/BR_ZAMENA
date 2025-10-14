package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TuningMainViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TuningMainViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<Boolean> _isFromMainMenu;

    @NotNull
    public final MutableStateFlow<Boolean> _isHideBackToMainMenuButton;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final StateFlow<Boolean> isHideBackToMainMenuButton;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final MutableStateFlow<Integer> mutableCarId;

    @NotNull
    public final MutableStateFlow<String> mutableCarName;

    @NotNull
    public final MutableSharedFlow<Integer> mutableCurrentLayout;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIfVisibleRoot;

    @NotNull
    public final MutableStateFlow<Integer> mutablePlayerMoney;

    @NotNull
    public final StateFlow<String> newCarName;

    @NotNull
    public final SharedFlow<Integer> newCurrentLayout;

    @NotNull
    public final StateFlow<Boolean> newIfVisibleMainRoot;

    @NotNull
    public final StateFlow<Integer> newPlayerMoney;

    @Inject
    public TuningMainViewModel(@NotNull TuningActionWithJSON actionWithJson, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJson = actionWithJson;
        this.localNotification = localNotification;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutablePlayerMoney = MutableStateFlow;
        this.newPlayerMoney = MutableStateFlow;
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this.mutableCarName = MutableStateFlow2;
        this.newCarName = MutableStateFlow2;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableCurrentLayout = mutableSharedFlowMutableSharedFlow$default;
        this.newCurrentLayout = mutableSharedFlowMutableSharedFlow$default;
        this.mutableCarId = StateFlowKt.MutableStateFlow(0);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.mutableIfVisibleRoot = MutableStateFlow3;
        this.newIfVisibleMainRoot = MutableStateFlow3;
        Boolean bool = Boolean.FALSE;
        this._isFromMainMenu = StateFlowKt.MutableStateFlow(bool);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this._isHideBackToMainMenuButton = MutableStateFlow4;
        this.isHideBackToMainMenuButton = MutableStateFlow4;
    }

    @NotNull
    public final StateFlow<Integer> getNewPlayerMoney() {
        return this.newPlayerMoney;
    }

    @NotNull
    public final StateFlow<String> getNewCarName() {
        return this.newCarName;
    }

    @NotNull
    public final SharedFlow<Integer> getNewCurrentLayout() {
        return this.newCurrentLayout;
    }

    @NotNull
    public final StateFlow<Boolean> getNewIfVisibleMainRoot() {
        return this.newIfVisibleMainRoot;
    }

    @NotNull
    public final StateFlow<Boolean> isHideBackToMainMenuButton() {
        return this.isHideBackToMainMenuButton;
    }

    public final void getInitData(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lSetPlayerMoney(jsonObject.optInt("m"));
        MutableStateFlow<String> mutableStateFlow = this.mutableCarName;
        String strOptString = jsonObject.optString("n");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        mutableStateFlow.setValue(strOptString);
        this.mutableCarId.setValue(Integer.valueOf(jsonObject.optInt("s")));
    }

    public final void setPlayerMoney(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lSetPlayerMoney(jsonObject.optInt("m"));
    }

    public final void lSetPlayerMoney(int valueOfMoney) {
        this.mutablePlayerMoney.setValue(Integer.valueOf(valueOfMoney));
    }

    public final void updateInitStatusAfterBuy(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lPutActionToServer(19);
        lSetPlayerMoney(jsonObject.optInt("m"));
    }

    /* compiled from: TuningMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$saveCarStatusAfterReset$1", m7120f = "TuningMainViewModel.kt", m7121i = {}, m7122l = {80}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$saveCarStatusAfterReset$1 */

    public static final class C46831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46831(Continuation<? super C46831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningMainViewModel.this.new C46831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TuningMainViewModel.this.saveCarStatus();
            return Unit.INSTANCE;
        }
    }

    public final void saveCarStatusAfterReset() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C46831(null), 3, null);
    }

    public final void saveCarStatus() throws JSONException {
        lPutActionToServer(19);
    }

    public final void lPutActionToServer(int tKey) throws JSONException {
        this.actionWithJson.putPlayersActionToServer(tKey);
    }

    public final void clearCarStatus() throws JSONException {
        lPutActionToServer(18);
    }

    /* compiled from: TuningMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$setCurrentLayout$1", m7120f = "TuningMainViewModel.kt", m7121i = {}, m7122l = {100}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$setCurrentLayout$1 */

    public static final class C46841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $currentLayout;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46841(int i, Continuation<? super C46841> continuation) {
            super(2, continuation);
            this.$currentLayout = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningMainViewModel.this.new C46841(this.$currentLayout, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TuningMainViewModel tuningMainViewModel = TuningMainViewModel.this;
                    int i2 = this.$currentLayout;
                    this.label = 1;
                    if (tuningMainViewModel.lSetCurrentLayout(i2, this) == coroutine_suspended) {
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

    public final void setCurrentLayout(int currentLayout) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C46841(currentLayout, null), 2, null);
    }

    public final Object lSetCurrentLayout(int i, Continuation<? super Unit> continuation) {
        Object objEmit = this.mutableCurrentLayout.emit(Boxing.boxInt(i), continuation);
        return objEmit == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    public static /* synthetic */ void applyResetDetails$default(TuningMainViewModel tuningMainViewModel, int i, int i2, int i3, Object obj) throws JSONException {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        tuningMainViewModel.applyResetDetails(i, i2);
    }

    public final void applyResetDetails(int currentSelector, int typeOfDetail) throws JSONException {
        this.actionWithJson.putActionResetDetailsToServer(5, currentSelector, typeOfDetail);
    }

    public final void setVisibleMainRoot(boolean isVisible) {
        this.mutableIfVisibleRoot.setValue(Boolean.valueOf(isVisible));
    }

    public final void sendToClientCurrentSelector(int currentSelector) throws JSONException {
        this.actionWithJson.putSelectorToClient(21, currentSelector);
    }

    public final void updateInterfaceAfterBuyColor(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        lSetPlayerMoney(jsonObject.optInt("m"));
        lPutActionToServer(19);
        lPutActionToServer(20);
    }

    /* compiled from: TuningMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$updateInterfaceAfterResetColor$1", m7120f = "TuningMainViewModel.kt", m7121i = {}, m7122l = {138}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$updateInterfaceAfterResetColor$1 */

    public static final class C46851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46851(Continuation<? super C46851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningMainViewModel.this.new C46851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TuningMainViewModel.this.lPutActionToServer(19);
            TuningMainViewModel.this.lPutActionToServer(20);
            return Unit.INSTANCE;
        }
    }

    public final void updateInterfaceAfterResetColor() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C46851(null), 3, null);
    }

    /* compiled from: TuningMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$getInitObjects$1", m7120f = "TuningMainViewModel.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_SPL}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$getInitObjects$1 */

    public static final class C46821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46821(Continuation<? super C46821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningMainViewModel.this.new C46821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TuningMainViewModel.this.lPutActionToServer(20);
            TuningMainViewModel.this.lPutActionToServer(26);
            TuningMainViewModel.this.lPutActionToServer(28);
            return Unit.INSTANCE;
        }
    }

    public final void getInitObjects() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C46821(null), 3, null);
    }

    /* compiled from: TuningMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$clickBackToMainMenu$1", m7120f = "TuningMainViewModel.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DF6}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.tuning.viewmodel.TuningMainViewModel$clickBackToMainMenu$1 */

    public static final class C46811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C46811(Continuation<? super C46811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TuningMainViewModel.this.new C46811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C46811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TuningMainViewModel.this.lPutActionToServer(17);
                    TuningMainViewModel.this.lPutActionToServer(18);
                    TuningMainViewModel tuningMainViewModel = TuningMainViewModel.this;
                    this.label = 1;
                    if (tuningMainViewModel.lSetCurrentLayout(0, this) == coroutine_suspended) {
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

    public final void clickBackToMainMenu() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C46811(null), 2, null);
    }

    public final void startViewCar() throws JSONException {
        lPutActionToServer(27);
    }

    public final void closeViewCar() throws JSONException {
        lPutActionToServer(17);
    }

    public final void showGameWarning() throws JSONException {
        lPutActionToServer(4);
    }

    public final void closeInterface() throws JSONException {
        lPutActionToServer(18);
        lPutActionToServer(0);
    }

    public final void isViewFromMainMenu(boolean isMainMenu) {
        this._isFromMainMenu.setValue(Boolean.valueOf(isMainMenu));
    }

    public final void updateHideBackToMainMenuButton(boolean isHide) {
        MutableStateFlow<Boolean> mutableStateFlow = this._isHideBackToMainMenuButton;
        if (this._isFromMainMenu.getValue().booleanValue()) {
            isHide = true;
        }
        mutableStateFlow.setValue(Boolean.valueOf(isHide));
    }

    public final void showErrorNotification(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        this.localNotification.showErrorNotification(message);
    }
}

