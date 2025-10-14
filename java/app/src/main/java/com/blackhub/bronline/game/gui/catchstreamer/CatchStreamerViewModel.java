package com.blackhub.bronline.game.gui.catchstreamer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
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
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CatchStreamerViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n230#2,5:180\n230#2,5:185\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel\n*L\n69#1:175,5\n75#1:180,5\n166#1:185,5\n*E\n"})
/* loaded from: classes3.dex */
public final class CatchStreamerViewModel extends BaseViewModel<CatchStreamerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CatchStreamerUiState> _uiState;

    @NotNull
    public final CatchStreamerActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StateFlow<CatchStreamerUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CatchStreamerViewModel(@NotNull LocalNotification localNotification, @NotNull CatchStreamerActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new CatchStreamerUiState(0, 0, 0, 0, 0, 0, 0, false, false, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<CatchStreamerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CatchStreamerUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$initScreen$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$initScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n230#2,5:180\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$initScreen$1\n*L\n40#1:175,5\n53#1:180,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$initScreen$1 */
    /* loaded from: classes.dex */
    public static final class C38161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ int $type;
        public int label;
        public final /* synthetic */ CatchStreamerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38161(int i, JSONObject jSONObject, CatchStreamerViewModel catchStreamerViewModel, Continuation<? super C38161> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$json = jSONObject;
            this.this$0 = catchStreamerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38161(this.$type, this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CatchStreamerUiState value;
            CatchStreamerUiState catchStreamerUiState;
            CatchStreamerUiState value2;
            CatchStreamerUiState catchStreamerUiState2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.$type;
            if (i == 1) {
                int iOptInt = this.$json.optInt(CatchStreamerKeys.PLAYERS_KEY, 0);
                MutableStateFlow<CatchStreamerUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    catchStreamerUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 1, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : iOptInt, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : 0, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false)));
            } else if (i == 2) {
                int iOptInt2 = this.$json.optInt(CatchStreamerKeys.DONATE_KEY, 0);
                int iOptInt3 = this.$json.optInt(CatchStreamerKeys.COST_KEY, 0);
                int iOptInt4 = this.$json.optInt(CatchStreamerKeys.GAMES_KEY, 0);
                MutableStateFlow<CatchStreamerUiState> mutableStateFlow2 = this.this$0.get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                    catchStreamerUiState2 = value2;
                } while (!mutableStateFlow2.compareAndSet(value2, catchStreamerUiState2.copy((479 & 1) != 0 ? catchStreamerUiState2.screen : 2, (479 & 2) != 0 ? catchStreamerUiState2.donate : iOptInt2, (479 & 4) != 0 ? catchStreamerUiState2.games : iOptInt4, (479 & 8) != 0 ? catchStreamerUiState2.currentCost : iOptInt3, (479 & 16) != 0 ? catchStreamerUiState2.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState2.selectCountTickets : 0, (479 & 64) != 0 ? catchStreamerUiState2.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState2.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState2.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState2.isBlockingLoading : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void initScreen(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38161(json.optInt("t", 0), json, this, null), 1, null);
    }

    public final void addBuyTicket() {
        CatchStreamerUiState value;
        CatchStreamerUiState catchStreamerUiState;
        MutableStateFlow<CatchStreamerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            catchStreamerUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 0, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : catchStreamerUiState.getSelectCountTickets() + 1, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false)));
    }

    public final void removeBuyTicket() {
        CatchStreamerUiState value;
        CatchStreamerUiState catchStreamerUiState;
        MutableStateFlow<CatchStreamerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            catchStreamerUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 0, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : catchStreamerUiState.getSelectCountTickets() - 1, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false)));
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$buyTickets$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$buyTickets$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$buyTickets$1\n*L\n83#1:175,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$buyTickets$1 */
    /* loaded from: classes.dex */
    public static final class C38141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $countTickets;
        public final /* synthetic */ String $emailOrSocial;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38141(String str, int i, Continuation<? super C38141> continuation) {
            super(2, continuation);
            this.$emailOrSocial = str;
            this.$countTickets = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CatchStreamerViewModel.this.new C38141(this.$emailOrSocial, this.$countTickets, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CatchStreamerUiState value;
            CatchStreamerUiState catchStreamerUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CatchStreamerViewModel.this.actionWithJSON.buyTickets(this.$emailOrSocial, this.$countTickets);
                MutableStateFlow<CatchStreamerUiState> mutableStateFlow = CatchStreamerViewModel.this.get_uiState();
                int i = this.$countTickets;
                do {
                    value = mutableStateFlow.getValue();
                    catchStreamerUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 0, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : i, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void buyTickets(@NotNull String emailOrSocial, int countTickets) {
        Intrinsics.checkNotNullParameter(emailOrSocial, "emailOrSocial");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38141(emailOrSocial, countTickets, null), 1, null);
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$getAnswer$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$getAnswer$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n230#2,5:180\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$getAnswer$1\n*L\n98#1:175,5\n112#1:180,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$getAnswer$1 */
    /* loaded from: classes.dex */
    public static final class C38151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ CatchStreamerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38151(JSONObject jSONObject, CatchStreamerViewModel catchStreamerViewModel, Continuation<? super C38151> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = catchStreamerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38151(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CatchStreamerUiState value;
            CatchStreamerUiState catchStreamerUiState;
            CatchStreamerUiState value2;
            CatchStreamerUiState catchStreamerUiState2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("t");
            if (iOptInt == 1) {
                int iOptInt2 = this.$json.optInt(CatchStreamerKeys.PLAYERS_KEY, 0);
                MutableStateFlow<CatchStreamerUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    catchStreamerUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 1, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : iOptInt2, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : 0, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false)));
            } else if (iOptInt == 2) {
                int iOptInt3 = this.$json.optInt("status", 0);
                int iOptInt4 = this.$json.optInt(CatchStreamerKeys.COUNT_KEY, 0);
                int iOptInt5 = this.$json.optInt(CatchStreamerKeys.DONATE_KEY, this.this$0.getUiState().getValue().getDonate());
                boolean z = iOptInt3 == 1;
                MutableStateFlow<CatchStreamerUiState> mutableStateFlow2 = this.this$0.get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                    catchStreamerUiState2 = value2;
                } while (!mutableStateFlow2.compareAndSet(value2, catchStreamerUiState2.copy((479 & 1) != 0 ? catchStreamerUiState2.screen : 2, (479 & 2) != 0 ? catchStreamerUiState2.donate : iOptInt5, (479 & 4) != 0 ? catchStreamerUiState2.games : 0, (479 & 8) != 0 ? catchStreamerUiState2.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState2.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState2.selectCountTickets : 0, (479 & 64) != 0 ? catchStreamerUiState2.countBuyTickets : iOptInt4, (479 & 128) != 0 ? catchStreamerUiState2.isPurchaseValid : z, (479 & 256) != 0 ? catchStreamerUiState2.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState2.isBlockingLoading : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void getAnswer(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38151(json, this, null), 1, null);
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$setCleanCountTicket$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$setCleanCountTicket$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$setCleanCountTicket$1\n*L\n128#1:175,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$setCleanCountTicket$1 */
    /* loaded from: classes.dex */
    public static final class C38211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38211(Continuation<? super C38211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CatchStreamerViewModel.this.new C38211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CatchStreamerUiState value;
            CatchStreamerUiState catchStreamerUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<CatchStreamerUiState> mutableStateFlow = CatchStreamerViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                catchStreamerUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 0, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : 1, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void setCleanCountTicket() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38211(null), 1, null);
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$sendClickGame$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$sendClickGame$1 */
    /* loaded from: classes.dex */
    public static final class C38181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38181(Continuation<? super C38181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CatchStreamerViewModel.this.new C38181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CatchStreamerViewModel.this.actionWithJSON.sendClickGame();
                CatchStreamerViewModel.this.sendCloseScreen(2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendClickGame() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38181(null), 1, null);
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$isParticipate$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$isParticipate$1 */
    /* loaded from: classes.dex */
    public static final class C38171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $isSuccess;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38171(int i, Continuation<? super C38171> continuation) {
            super(2, continuation);
            this.$isSuccess = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CatchStreamerViewModel.this.new C38171(this.$isSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CatchStreamerViewModel.this.actionWithJSON.sendIsParticipate(this.$isSuccess);
                CatchStreamerViewModel.this.sendCloseScreen(1);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void isParticipate(int isSuccess) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38171(isSuccess, null), 1, null);
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$sendClickParticipate$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$sendClickParticipate$1 */
    /* loaded from: classes.dex */
    public static final class C38191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38191(Continuation<? super C38191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CatchStreamerViewModel.this.new C38191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CatchStreamerViewModel.this.actionWithJSON.sendClickParticipate();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendClickParticipate() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38191(null), 1, null);
    }

    /* compiled from: CatchStreamerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$sendCloseScreen$1", m7120f = "CatchStreamerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCatchStreamerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,174:1\n230#2,5:175\n*S KotlinDebug\n*F\n+ 1 CatchStreamerViewModel.kt\ncom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerViewModel$sendCloseScreen$1\n*L\n159#1:175,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerViewModel$sendCloseScreen$1 */
    /* loaded from: classes.dex */
    public static final class C38201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $screen;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38201(int i, Continuation<? super C38201> continuation) {
            super(2, continuation);
            this.$screen = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CatchStreamerViewModel.this.new C38201(this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CatchStreamerUiState value;
            CatchStreamerUiState catchStreamerUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CatchStreamerViewModel.this.actionWithJSON.sendCloseScreen(this.$screen);
                MutableStateFlow<CatchStreamerUiState> mutableStateFlow = CatchStreamerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    catchStreamerUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 0, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : 0, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : true, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen(int screen) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38201(screen, null), 1, null);
    }

    public final void clearSellValid() {
        CatchStreamerUiState value;
        CatchStreamerUiState catchStreamerUiState;
        MutableStateFlow<CatchStreamerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            catchStreamerUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, catchStreamerUiState.copy((479 & 1) != 0 ? catchStreamerUiState.screen : 0, (479 & 2) != 0 ? catchStreamerUiState.donate : 0, (479 & 4) != 0 ? catchStreamerUiState.games : 0, (479 & 8) != 0 ? catchStreamerUiState.currentCost : 0, (479 & 16) != 0 ? catchStreamerUiState.countPlayers : 0, (479 & 32) != 0 ? catchStreamerUiState.selectCountTickets : 0, (479 & 64) != 0 ? catchStreamerUiState.countBuyTickets : 0, (479 & 128) != 0 ? catchStreamerUiState.isPurchaseValid : false, (479 & 256) != 0 ? catchStreamerUiState.isNeedClose : false, (479 & 512) != 0 ? catchStreamerUiState.isBlockingLoading : false)));
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }
}

