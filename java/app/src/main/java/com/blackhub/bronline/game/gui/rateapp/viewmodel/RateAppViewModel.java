package com.blackhub.bronline.game.gui.rateapp.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.rateapp.RateAppAnalyticsKeys;
import com.blackhub.bronline.game.gui.rateapp.RateAppUiState;
import com.blackhub.bronline.game.gui.rateapp.analytics.RateAppAnalytics;
import com.blackhub.bronline.game.gui.rateapp.network.RateAppActionWithJson;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RateAppViewModel.kt */
@StabilityInferred(parameters = 0)

public final class RateAppViewModel extends BaseViewModel<RateAppUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<RateAppUiState> _uiState;

    @NotNull
    public final RateAppActionWithJson actionsWithJson;

    @NotNull
    public final RateAppAnalytics rateAppAnalytics;

    @Inject
    public RateAppViewModel(@NotNull RateAppActionWithJson actionsWithJson, @NotNull RateAppAnalytics rateAppAnalytics) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(rateAppAnalytics, "rateAppAnalytics");
        this.actionsWithJson = actionsWithJson;
        this.rateAppAnalytics = rateAppAnalytics;
        this._uiState = StateFlowKt.MutableStateFlow(new RateAppUiState(null, 0, 0, false, false, false, false, 127, null));
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<RateAppUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<RateAppUiState> getUiState() {
        return FlowKt.asStateFlow(get_uiState());
    }

    /* compiled from: RateAppViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$initJson$1", m7120f = "RateAppViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRateAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,145:1\n230#2,5:146\n*S KotlinDebug\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$initJson$1\n*L\n42#1:146,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$initJson$1 */
    /* loaded from: classes7.dex */
    public static final class C44041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ RateAppViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44041(JSONObject jSONObject, RateAppViewModel rateAppViewModel, Continuation<? super C44041> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = rateAppViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C44041(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RateAppUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.$json.optInt("t") == 2;
            int iOptInt = this.$json.optInt("st");
            boolean z2 = !z;
            MutableStateFlow<RateAppUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, RateAppUiState.copy$default(value, null, 0, iOptInt, z, z2, false, false, 99, null)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C44041(json, this, null), 1, null);
    }

    /* compiled from: RateAppViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onButtonClick$1", m7120f = "RateAppViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRateAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onButtonClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,145:1\n230#2,5:146\n230#2,5:151\n230#2,5:156\n*S KotlinDebug\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onButtonClick$1\n*L\n65#1:146,5\n72#1:151,5\n87#1:156,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onButtonClick$1 */
    /* loaded from: classes7.dex */
    public static final class C44051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isLike;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44051(boolean z, Continuation<? super C44051> continuation) {
            super(2, continuation);
            this.$isLike = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RateAppViewModel.this.new C44051(this.$isLike, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RateAppUiState value;
            RateAppUiState value2;
            RateAppUiState value3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (RateAppViewModel.this.getUiState().getValue().isFiveStars()) {
                RateAppViewModel.this.rateAppAnalytics.sendAnalyticsStarPressed(RateAppViewModel.this.getUiState().getValue().getStarChecked(), RateAppViewModel.this.getUiState().getValue().getCategoryDescription());
                RateAppViewModel.this.actionsWithJson.sendButtonPressed(2, RateAppViewModel.this.getUiState().getValue().getStarChecked());
                if (RateAppViewModel.this.getUiState().getValue().getStarChecked() == 5) {
                    MutableStateFlow<RateAppUiState> mutableStateFlow = RateAppViewModel.this.get_uiState();
                    do {
                        value3 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value3, RateAppUiState.copy$default(value3, null, 0, 0, false, false, true, true, 31, null)));
                } else {
                    MutableStateFlow<RateAppUiState> mutableStateFlow2 = RateAppViewModel.this.get_uiState();
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, RateAppUiState.copy$default(value2, null, 0, 0, false, false, false, true, 63, null)));
                }
            } else {
                boolean z = this.$isLike;
                int i = z ? 1 : 2;
                RateAppViewModel.this.sendAnalyticsLikeDislikePressed(z);
                RateAppViewModel.this.actionsWithJson.sendButtonPressed(1, i);
                MutableStateFlow<RateAppUiState> mutableStateFlow3 = RateAppViewModel.this.get_uiState();
                boolean z2 = this.$isLike;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value, RateAppUiState.copy$default(value, null, 0, 0, false, false, z2, true, 31, null)));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void onButtonClick$default(RateAppViewModel rateAppViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        rateAppViewModel.onButtonClick(z);
    }

    public final void onButtonClick(boolean isLike) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C44051(isLike, null), 1, null);
    }

    /* compiled from: RateAppViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onCloseCLick$1", m7120f = "RateAppViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRateAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onCloseCLick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,145:1\n230#2,5:146\n*S KotlinDebug\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onCloseCLick$1\n*L\n108#1:146,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onCloseCLick$1 */
    /* loaded from: classes7.dex */
    public static final class C44061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C44061(Continuation<? super C44061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RateAppViewModel.this.new C44061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RateAppUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (RateAppViewModel.this.getUiState().getValue().isFiveStars()) {
                RateAppViewModel.this.actionsWithJson.sendButtonClosePressed();
            } else {
                RateAppViewModel.this.sendAnalyticsLikeDislikePressed(false);
                RateAppViewModel.this.actionsWithJson.sendButtonPressed(1, 2);
            }
            MutableStateFlow<RateAppUiState> mutableStateFlow = RateAppViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, RateAppUiState.copy$default(value, null, 0, 0, false, false, false, true, 63, null)));
            return Unit.INSTANCE;
        }
    }

    public final void onCloseCLick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C44061(null), 1, null);
    }

    /* compiled from: RateAppViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onStarClick$1", m7120f = "RateAppViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nRateAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onStarClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,145:1\n1#2:146\n230#3,5:147\n*S KotlinDebug\n*F\n+ 1 RateAppViewModel.kt\ncom/blackhub/bronline/game/gui/rateapp/viewmodel/RateAppViewModel$onStarClick$1\n*L\n124#1:147,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.rateapp.viewmodel.RateAppViewModel$onStarClick$1 */
    /* loaded from: classes7.dex */
    public static final class C44071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $index;
        public int label;
        public final /* synthetic */ RateAppViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44071(int i, RateAppViewModel rateAppViewModel, Continuation<? super C44071> continuation) {
            super(2, continuation);
            this.$index = i;
            this.this$0 = rateAppViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C44071(this.$index, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C44071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RateAppUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                arrayList.add(Boxing.boxBoolean(false));
            }
            for (int i2 = 0; i2 < 6; i2++) {
                if (i2 <= this.$index) {
                    arrayList.set(i2, Boxing.boxBoolean(true));
                }
            }
            MutableStateFlow<RateAppUiState> mutableStateFlow = this.this$0.get_uiState();
            int i3 = this.$index;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, RateAppUiState.copy$default(value, arrayList, i3 + 1, 0, false, true, false, false, 108, null)));
            return Unit.INSTANCE;
        }
    }

    public final void onStarClick(int index) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C44071(index, this, null), 1, null);
    }

    public final void sendAnalyticsLikeDislikePressed(boolean isLike) throws JSONException {
        this.rateAppAnalytics.sendAnalyticsLikeDislikePressed(isLike ? RateAppAnalyticsKeys.RATE_APP_lIKE_VALUE : RateAppAnalyticsKeys.RATE_APP_DISlIKE_VALUE, getUiState().getValue().getCategoryDescription());
    }
}

