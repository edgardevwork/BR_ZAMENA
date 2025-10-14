package com.blackhub.bronline.game.gui.clicker;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.clicker.network.ClickerActionsWithJson;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ClickerViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ClickerViewModel extends BaseViewModel<ClickerUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ClickerUiState> _uiState;

    @NotNull
    public final ClickerActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;
    public boolean isStartGame;

    @NotNull
    public final StateFlow<ClickerUiState> uiState;

    @Inject
    public ClickerViewModel(@NotNull ClickerActionsWithJson actionsWithJson, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new ClickerUiState(0, 0L, 0, 0, null, null, null, null, null, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<ClickerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ClickerUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: ClickerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$initInterface$1", m7120f = "ClickerViewModel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {82}, m7123m = "invokeSuspend", m7124n = {"myNick", "opponentNick", "textDescription", "bgImageBitmap", "imgClickEffectBitmap", "valueOfPercentPerClick", "currentProgress", "totalTimer", "delayBitOpponentInMilliseconds"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "J$0"})
    @SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$initInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$initInterface$1\n*L\n84#1:205,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.clicker.ClickerViewModel$initInterface$1 */
    /* loaded from: classes.dex */
    public static final class C38361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $jsonObject;
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ ClickerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38361(JSONObject jSONObject, ClickerViewModel clickerViewModel, Continuation<? super C38361> continuation) {
            super(2, continuation);
            this.$jsonObject = jSONObject;
            this.this$0 = clickerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C38361(this.$jsonObject, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strOptString;
            String strOptString2;
            String strOptString3;
            long delayForBitOpponent;
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            int i;
            int i2;
            ClickerUiState value;
            ClickerUiState clickerUiState;
            int i3 = 2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                int iOptInt = this.$jsonObject.optInt("tm");
                strOptString = this.$jsonObject.optString("n");
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                strOptString2 = this.$jsonObject.optString("nt");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                strOptString3 = this.$jsonObject.optString(ClickerKeys.TEXT_DESCRIPTION_KEY);
                Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                delayForBitOpponent = this.this$0.getDelayForBitOpponent(this.$jsonObject.optDouble(ClickerKeys.OPPONENT_INTENSITY_KEY, 0.1d));
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                ClickerViewModel clickerViewModel = this.this$0;
                Deferred deferredAsyncOnIO$default = ViewModelExtensionKt.asyncOnIO$default(clickerViewModel, null, new ClickerViewModel$initInterface$1$deferredTasksForImages$1(objectRef, clickerViewModel, null), 1, null);
                ClickerViewModel clickerViewModel2 = this.this$0;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{deferredAsyncOnIO$default, ViewModelExtensionKt.asyncOnIO$default(clickerViewModel2, null, new ClickerViewModel$initInterface$1$deferredTasksForImages$2(objectRef2, clickerViewModel2, null), 1, null)});
                this.L$0 = strOptString;
                this.L$1 = strOptString2;
                this.L$2 = strOptString3;
                this.L$3 = objectRef;
                this.L$4 = objectRef2;
                this.I$0 = 2;
                this.I$1 = 50;
                this.I$2 = iOptInt;
                this.J$0 = delayForBitOpponent;
                this.label = 1;
                if (AwaitKt.awaitAll(listListOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = iOptInt;
                i2 = 50;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j = this.J$0;
                i = this.I$2;
                i2 = this.I$1;
                int i5 = this.I$0;
                Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.L$4;
                objectRef = (Ref.ObjectRef) this.L$3;
                strOptString3 = (String) this.L$2;
                strOptString2 = (String) this.L$1;
                strOptString = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef2 = objectRef3;
                i3 = i5;
                delayForBitOpponent = j;
            }
            MutableStateFlow<ClickerUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                clickerUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, clickerUiState.copy((511 & 1) != 0 ? clickerUiState.valueOfPercentPerClick : i3, (511 & 2) != 0 ? clickerUiState.delayBitOpponentInMilliseconds : delayForBitOpponent, (511 & 4) != 0 ? clickerUiState.currentProgress : i2, (511 & 8) != 0 ? clickerUiState.totalTimerInSeconds : i, (511 & 16) != 0 ? clickerUiState.myNick : strOptString, (511 & 32) != 0 ? clickerUiState.opponentNick : strOptString2, (511 & 64) != 0 ? clickerUiState.textDescription : strOptString3, (511 & 128) != 0 ? clickerUiState.bgImageBitmap : (Bitmap) objectRef.element, (511 & 256) != 0 ? clickerUiState.imgClickEffectBitmap : (Bitmap) objectRef2.element, (511 & 512) != 0 ? clickerUiState.isNeedToClose : false)));
            return Unit.INSTANCE;
        }
    }

    public final void initInterface(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38361(jsonObject, this, null), 1, null);
    }

    /* compiled from: ClickerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$onTapScreen$1", m7120f = "ClickerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$onTapScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n230#2,5:210\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$onTapScreen$1\n*L\n111#1:205,5\n118#1:210,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.clicker.ClickerViewModel$onTapScreen$1 */
    /* loaded from: classes.dex */
    public static final class C38371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38371(Continuation<? super C38371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ClickerViewModel.this.new C38371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ClickerUiState value;
            ClickerUiState clickerUiState;
            ClickerUiState value2;
            ClickerUiState clickerUiState2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int currentProgress = ClickerViewModel.this.getUiState().getValue().getCurrentProgress() + ClickerViewModel.this.getUiState().getValue().getValueOfPercentPerClick();
            if (!ClickerViewModel.this.isStartGame) {
                ClickerViewModel.this.startTapOpponent();
            }
            if (currentProgress >= 100) {
                ClickerViewModel.this.gameOver(2);
                MutableStateFlow<ClickerUiState> mutableStateFlow = ClickerViewModel.this.get_uiState();
                do {
                    value2 = mutableStateFlow.getValue();
                    clickerUiState2 = value2;
                } while (!mutableStateFlow.compareAndSet(value2, clickerUiState2.copy((511 & 1) != 0 ? clickerUiState2.valueOfPercentPerClick : 0, (511 & 2) != 0 ? clickerUiState2.delayBitOpponentInMilliseconds : 0L, (511 & 4) != 0 ? clickerUiState2.currentProgress : currentProgress, (511 & 8) != 0 ? clickerUiState2.totalTimerInSeconds : 0, (511 & 16) != 0 ? clickerUiState2.myNick : null, (511 & 32) != 0 ? clickerUiState2.opponentNick : null, (511 & 64) != 0 ? clickerUiState2.textDescription : null, (511 & 128) != 0 ? clickerUiState2.bgImageBitmap : null, (511 & 256) != 0 ? clickerUiState2.imgClickEffectBitmap : null, (511 & 512) != 0 ? clickerUiState2.isNeedToClose : true)));
            } else {
                MutableStateFlow<ClickerUiState> mutableStateFlow2 = ClickerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow2.getValue();
                    clickerUiState = value;
                } while (!mutableStateFlow2.compareAndSet(value, clickerUiState.copy((511 & 1) != 0 ? clickerUiState.valueOfPercentPerClick : 0, (511 & 2) != 0 ? clickerUiState.delayBitOpponentInMilliseconds : 0L, (511 & 4) != 0 ? clickerUiState.currentProgress : currentProgress, (511 & 8) != 0 ? clickerUiState.totalTimerInSeconds : 0, (511 & 16) != 0 ? clickerUiState.myNick : null, (511 & 32) != 0 ? clickerUiState.opponentNick : null, (511 & 64) != 0 ? clickerUiState.textDescription : null, (511 & 128) != 0 ? clickerUiState.bgImageBitmap : null, (511 & 256) != 0 ? clickerUiState.imgClickEffectBitmap : null, (511 & 512) != 0 ? clickerUiState.isNeedToClose : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onTapScreen() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38371(null), 1, null);
    }

    /* compiled from: ClickerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$closeInterface$1", m7120f = "ClickerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$closeInterface$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$closeInterface$1\n*L\n131#1:205,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.clicker.ClickerViewModel$closeInterface$1 */
    /* loaded from: classes.dex */
    public static final class C38331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38331(Continuation<? super C38331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ClickerViewModel.this.new C38331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ClickerUiState value;
            ClickerUiState clickerUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ClickerViewModel.this.actionsWithJson.sendCloseInterface();
                MutableStateFlow<ClickerUiState> mutableStateFlow = ClickerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    clickerUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, clickerUiState.copy((511 & 1) != 0 ? clickerUiState.valueOfPercentPerClick : 0, (511 & 2) != 0 ? clickerUiState.delayBitOpponentInMilliseconds : 0L, (511 & 4) != 0 ? clickerUiState.currentProgress : 0, (511 & 8) != 0 ? clickerUiState.totalTimerInSeconds : 0, (511 & 16) != 0 ? clickerUiState.myNick : null, (511 & 32) != 0 ? clickerUiState.opponentNick : null, (511 & 64) != 0 ? clickerUiState.textDescription : null, (511 & 128) != 0 ? clickerUiState.bgImageBitmap : null, (511 & 256) != 0 ? clickerUiState.imgClickEffectBitmap : null, (511 & 512) != 0 ? clickerUiState.isNeedToClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeInterface() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38331(null), 1, null);
    }

    /* compiled from: ClickerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$finishTimer$1", m7120f = "ClickerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$finishTimer$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$finishTimer$1\n*L\n146#1:205,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.clicker.ClickerViewModel$finishTimer$1 */
    /* loaded from: classes.dex */
    public static final class C38341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38341(Continuation<? super C38341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ClickerViewModel.this.new C38341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ClickerUiState value;
            ClickerUiState clickerUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ClickerViewModel.this.actionsWithJson.sendGameOverWithResult(ClickerViewModel.this.get_uiState().getValue().getCurrentProgress() >= 50 ? 2 : 1);
                MutableStateFlow<ClickerUiState> mutableStateFlow = ClickerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    clickerUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, clickerUiState.copy((511 & 1) != 0 ? clickerUiState.valueOfPercentPerClick : 0, (511 & 2) != 0 ? clickerUiState.delayBitOpponentInMilliseconds : 0L, (511 & 4) != 0 ? clickerUiState.currentProgress : 0, (511 & 8) != 0 ? clickerUiState.totalTimerInSeconds : 0, (511 & 16) != 0 ? clickerUiState.myNick : null, (511 & 32) != 0 ? clickerUiState.opponentNick : null, (511 & 64) != 0 ? clickerUiState.textDescription : null, (511 & 128) != 0 ? clickerUiState.bgImageBitmap : null, (511 & 256) != 0 ? clickerUiState.imgClickEffectBitmap : null, (511 & 512) != 0 ? clickerUiState.isNeedToClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void finishTimer() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38341(null), 1, null);
    }

    public final void startTapOpponent() {
        this.isStartGame = true;
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C38381(null), 1, null);
    }

    /* compiled from: ClickerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$startTapOpponent$1", m7120f = "ClickerViewModel.kt", m7121i = {}, m7122l = {159}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nClickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$startTapOpponent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,204:1\n230#2,5:205\n230#2,5:210\n*S KotlinDebug\n*F\n+ 1 ClickerViewModel.kt\ncom/blackhub/bronline/game/gui/clicker/ClickerViewModel$startTapOpponent$1\n*L\n165#1:205,5\n172#1:210,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.clicker.ClickerViewModel$startTapOpponent$1 */
    /* loaded from: classes.dex */
    public static final class C38381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C38381(Continuation<? super C38381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ClickerViewModel.this.new C38381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:12:0x0035). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                kotlin.ResultKt.throwOnFailure(r21)
                goto L35
            L11:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L19:
                kotlin.ResultKt.throwOnFailure(r21)
            L1c:
                com.blackhub.bronline.game.gui.clicker.ClickerViewModel r2 = com.blackhub.bronline.game.gui.clicker.ClickerViewModel.this
                kotlinx.coroutines.flow.StateFlow r2 = r2.getUiState()
                java.lang.Object r2 = r2.getValue()
                com.blackhub.bronline.game.gui.clicker.ClickerUiState r2 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r2
                long r4 = r2.getDelayBitOpponentInMilliseconds()
                r0.label = r3
                java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r4, r0)
                if (r2 != r1) goto L35
                return r1
            L35:
                com.blackhub.bronline.game.gui.clicker.ClickerViewModel r2 = com.blackhub.bronline.game.gui.clicker.ClickerViewModel.this
                kotlinx.coroutines.flow.StateFlow r2 = r2.getUiState()
                java.lang.Object r2 = r2.getValue()
                com.blackhub.bronline.game.gui.clicker.ClickerUiState r2 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r2
                int r2 = r2.getCurrentProgress()
                com.blackhub.bronline.game.gui.clicker.ClickerViewModel r4 = com.blackhub.bronline.game.gui.clicker.ClickerViewModel.this
                kotlinx.coroutines.flow.StateFlow r4 = r4.getUiState()
                java.lang.Object r4 = r4.getValue()
                com.blackhub.bronline.game.gui.clicker.ClickerUiState r4 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r4
                int r4 = r4.getValueOfPercentPerClick()
                int r2 = r2 - r4
                if (r2 > 0) goto L8d
                com.blackhub.bronline.game.gui.clicker.ClickerViewModel r4 = com.blackhub.bronline.game.gui.clicker.ClickerViewModel.this
                com.blackhub.bronline.game.gui.clicker.ClickerViewModel.access$gameOver(r4, r3)
                com.blackhub.bronline.game.gui.clicker.ClickerViewModel r4 = com.blackhub.bronline.game.gui.clicker.ClickerViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r4 = r4.get_uiState()
            L63:
                java.lang.Object r15 = r4.getValue()
                r5 = r15
                com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r5
                r17 = 507(0x1fb, float:7.1E-43)
                r18 = 0
                r6 = 0
                r7 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r19 = 1
                r9 = r2
                r3 = r15
                r15 = r16
                r16 = r19
                com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = com.blackhub.bronline.game.gui.clicker.ClickerUiState.copy$default(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                boolean r3 = r4.compareAndSet(r3, r5)
                if (r3 == 0) goto L8b
                goto Lb4
            L8b:
                r3 = 1
                goto L63
            L8d:
                com.blackhub.bronline.game.gui.clicker.ClickerViewModel r3 = com.blackhub.bronline.game.gui.clicker.ClickerViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r3 = r3.get_uiState()
            L93:
                java.lang.Object r4 = r3.getValue()
                r5 = r4
                com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = (com.blackhub.bronline.game.gui.clicker.ClickerUiState) r5
                r17 = 1019(0x3fb, float:1.428E-42)
                r18 = 0
                r6 = 0
                r7 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r9 = r2
                com.blackhub.bronline.game.gui.clicker.ClickerUiState r5 = com.blackhub.bronline.game.gui.clicker.ClickerUiState.copy$default(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                boolean r4 = r3.compareAndSet(r4, r5)
                if (r4 == 0) goto L93
            Lb4:
                r3 = 1
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.clicker.ClickerViewModel.C38381.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClickerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.clicker.ClickerViewModel$gameOver$1", m7120f = "ClickerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.clicker.ClickerViewModel$gameOver$1 */
    /* loaded from: classes.dex */
    public static final class C38351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $gameResult;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38351(int i, Continuation<? super C38351> continuation) {
            super(2, continuation);
            this.$gameResult = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ClickerViewModel.this.new C38351(this.$gameResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C38351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ClickerViewModel.this.actionsWithJson.sendGameOverWithResult(this.$gameResult);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void gameOver(int gameResult) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C38351(gameResult, null), 1, null);
    }

    public final long getDelayForBitOpponent(double intensityAiClickPerSeconds) {
        if (intensityAiClickPerSeconds < 0.1d) {
            intensityAiClickPerSeconds = 0.1d;
        }
        return 1000 / ((int) (intensityAiClickPerSeconds * 10));
    }
}

