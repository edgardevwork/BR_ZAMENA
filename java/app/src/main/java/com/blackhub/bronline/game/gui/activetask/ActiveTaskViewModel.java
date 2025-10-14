package com.blackhub.bronline.game.gui.activetask;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.constants.NativeConstants;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
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
import org.json.JSONObject;

/* compiled from: ActiveTaskViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nActiveTaskViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,136:1\n230#2,5:137\n230#2,5:142\n*S KotlinDebug\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel\n*L\n117#1:137,5\n123#1:142,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ActiveTaskViewModel extends BaseViewModel<ActiveTaskUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ActiveTaskUiState> _uiState;

    @NotNull
    public final ActiveTaskActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<ActiveTaskUiState> uiState;

    @Inject
    public ActiveTaskViewModel(@NotNull ActiveTaskActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new ActiveTaskUiState(0, null, null, null, null, 0, false, false, false, 511, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<ActiveTaskUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ActiveTaskUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: ActiveTaskViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$initJson$1", m7120f = "ActiveTaskViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nActiveTaskViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,136:1\n230#2,5:137\n*S KotlinDebug\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$initJson$1\n*L\n48#1:137,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$initJson$1 */

    public static final class C36911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ ActiveTaskViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36911(JSONObject jSONObject, ActiveTaskViewModel activeTaskViewModel, Continuation<? super C36911> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = activeTaskViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C36911(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ActiveTaskEnum activeTaskEnum;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("t");
            int iOptInt2 = this.$json.optInt("m");
            String strOptString = this.$json.optString("h");
            String strOptString2 = this.$json.optString("s");
            int iOptInt3 = this.$json.optInt("tm", -1);
            String strOptString3 = this.$json.optString("b");
            if (iOptInt == 1) {
                activeTaskEnum = ActiveTaskEnum.ACTIVE_TASK;
            } else if (iOptInt == 2) {
                activeTaskEnum = ActiveTaskEnum.ACTIVE_HINT_WITH_BUTTON;
            } else {
                activeTaskEnum = ActiveTaskEnum.NONE;
            }
            MutableStateFlow<ActiveTaskUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                ActiveTaskUiState value = mutableStateFlow.getValue();
                ActiveTaskUiState activeTaskUiState = value;
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                Intrinsics.checkNotNull(strOptString3);
                MutableStateFlow<ActiveTaskUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, activeTaskUiState.copy((448 & 1) != 0 ? activeTaskUiState.hintNumber : iOptInt2, (448 & 2) != 0 ? activeTaskUiState.hintScreen : activeTaskEnum, (448 & 4) != 0 ? activeTaskUiState.hintTitle : strOptString, (448 & 8) != 0 ? activeTaskUiState.hintDesc : strOptString2, (448 & 16) != 0 ? activeTaskUiState.btnText : strOptString3, (448 & 32) != 0 ? activeTaskUiState.hintTime : iOptInt3, (448 & 64) != 0 ? activeTaskUiState.isInterfaceVisible : false, (448 & 128) != 0 ? activeTaskUiState.isNeedClose : false, (448 & 256) != 0 ? activeTaskUiState.isBlockingLoading : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C36911(json, this, null), 1, null);
    }

    /* compiled from: ActiveTaskViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$updateJson$1", m7120f = "ActiveTaskViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nActiveTaskViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$updateJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,136:1\n230#2,5:137\n230#2,5:142\n230#2,5:147\n*S KotlinDebug\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$updateJson$1\n*L\n70#1:137,5\n78#1:142,5\n92#1:147,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$updateJson$1 */

    public static final class C36951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ ActiveTaskViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36951(JSONObject jSONObject, ActiveTaskViewModel activeTaskViewModel, Continuation<? super C36951> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = activeTaskViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C36951(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ActiveTaskEnum activeTaskEnum;
            ActiveTaskUiState value;
            ActiveTaskUiState activeTaskUiState;
            ActiveTaskUiState value2;
            ActiveTaskUiState activeTaskUiState2;
            ActiveTaskUiState value3;
            ActiveTaskUiState activeTaskUiState3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
            int iOptInt2 = this.$json.optInt("t");
            int iOptInt3 = this.$json.optInt("m");
            String strOptString = this.$json.optString("s");
            if (IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt))) {
                int iOptInt4 = this.$json.optInt(NativeConstants.ACTION_WITH_NATIVE_KEYBOARD);
                if (iOptInt4 == 1) {
                    MutableStateFlow<ActiveTaskUiState> mutableStateFlow = this.this$0.get_uiState();
                    do {
                        value2 = mutableStateFlow.getValue();
                        activeTaskUiState2 = value2;
                    } while (!mutableStateFlow.compareAndSet(value2, activeTaskUiState2.copy((448 & 1) != 0 ? activeTaskUiState2.hintNumber : 0, (448 & 2) != 0 ? activeTaskUiState2.hintScreen : null, (448 & 4) != 0 ? activeTaskUiState2.hintTitle : null, (448 & 8) != 0 ? activeTaskUiState2.hintDesc : null, (448 & 16) != 0 ? activeTaskUiState2.btnText : null, (448 & 32) != 0 ? activeTaskUiState2.hintTime : 0, (448 & 64) != 0 ? activeTaskUiState2.isInterfaceVisible : false, (448 & 128) != 0 ? activeTaskUiState2.isNeedClose : false, (448 & 256) != 0 ? activeTaskUiState2.isBlockingLoading : false)));
                } else if (iOptInt4 == 9) {
                    MutableStateFlow<ActiveTaskUiState> mutableStateFlow2 = this.this$0.get_uiState();
                    do {
                        value3 = mutableStateFlow2.getValue();
                        activeTaskUiState3 = value3;
                    } while (!mutableStateFlow2.compareAndSet(value3, activeTaskUiState3.copy((448 & 1) != 0 ? activeTaskUiState3.hintNumber : 0, (448 & 2) != 0 ? activeTaskUiState3.hintScreen : null, (448 & 4) != 0 ? activeTaskUiState3.hintTitle : null, (448 & 8) != 0 ? activeTaskUiState3.hintDesc : null, (448 & 16) != 0 ? activeTaskUiState3.btnText : null, (448 & 32) != 0 ? activeTaskUiState3.hintTime : 0, (448 & 64) != 0 ? activeTaskUiState3.isInterfaceVisible : true, (448 & 128) != 0 ? activeTaskUiState3.isNeedClose : false, (448 & 256) != 0 ? activeTaskUiState3.isBlockingLoading : false)));
                }
            } else if (IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt2))) {
                if (iOptInt2 == 1) {
                    activeTaskEnum = ActiveTaskEnum.ACTIVE_TASK;
                } else if (iOptInt2 == 2) {
                    activeTaskEnum = ActiveTaskEnum.ACTIVE_HINT_WITH_BUTTON;
                } else {
                    activeTaskEnum = ActiveTaskEnum.NONE;
                }
                MutableStateFlow<ActiveTaskUiState> mutableStateFlow3 = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow3.getValue();
                    activeTaskUiState = value;
                    Intrinsics.checkNotNull(strOptString);
                } while (!mutableStateFlow3.compareAndSet(value, activeTaskUiState.copy((448 & 1) != 0 ? activeTaskUiState.hintNumber : iOptInt3, (448 & 2) != 0 ? activeTaskUiState.hintScreen : activeTaskEnum, (448 & 4) != 0 ? activeTaskUiState.hintTitle : null, (448 & 8) != 0 ? activeTaskUiState.hintDesc : strOptString, (448 & 16) != 0 ? activeTaskUiState.btnText : null, (448 & 32) != 0 ? activeTaskUiState.hintTime : 0, (448 & 64) != 0 ? activeTaskUiState.isInterfaceVisible : false, (448 & 128) != 0 ? activeTaskUiState.isNeedClose : false, (448 & 256) != 0 ? activeTaskUiState.isBlockingLoading : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C36951(json, this, null), 1, null);
    }

    /* compiled from: ActiveTaskViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$sendClickId$1", m7120f = "ActiveTaskViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$sendClickId$1 */

    public static final class C36931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $id;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36931(int i, Continuation<? super C36931> continuation) {
            super(2, continuation);
            this.$id = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ActiveTaskViewModel.this.new C36931(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ActiveTaskViewModel.this.actionWithJSON.sendClickId(this.$id);
                ActiveTaskViewModel.this.sendCloseScreen();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendClickId(int id) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C36931(id, null), 1, null);
    }

    /* compiled from: ActiveTaskViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$onEndOfTime$1", m7120f = "ActiveTaskViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$onEndOfTime$1 */

    public static final class C36921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C36921(Continuation<? super C36921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ActiveTaskViewModel.this.new C36921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ActiveTaskViewModel.this.actionWithJSON.sendEndOfTime();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onEndOfTime() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C36921(null), 1, null);
    }

    public final void hideInterface() {
        ActiveTaskUiState value;
        ActiveTaskUiState activeTaskUiState;
        MutableStateFlow<ActiveTaskUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            activeTaskUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, activeTaskUiState.copy((448 & 1) != 0 ? activeTaskUiState.hintNumber : 0, (448 & 2) != 0 ? activeTaskUiState.hintScreen : null, (448 & 4) != 0 ? activeTaskUiState.hintTitle : null, (448 & 8) != 0 ? activeTaskUiState.hintDesc : null, (448 & 16) != 0 ? activeTaskUiState.btnText : null, (448 & 32) != 0 ? activeTaskUiState.hintTime : 0, (448 & 64) != 0 ? activeTaskUiState.isInterfaceVisible : false, (448 & 128) != 0 ? activeTaskUiState.isNeedClose : false, (448 & 256) != 0 ? activeTaskUiState.isBlockingLoading : false)));
    }

    public final void showInterface() {
        ActiveTaskUiState value;
        ActiveTaskUiState activeTaskUiState;
        MutableStateFlow<ActiveTaskUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            activeTaskUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, activeTaskUiState.copy((448 & 1) != 0 ? activeTaskUiState.hintNumber : 0, (448 & 2) != 0 ? activeTaskUiState.hintScreen : null, (448 & 4) != 0 ? activeTaskUiState.hintTitle : null, (448 & 8) != 0 ? activeTaskUiState.hintDesc : null, (448 & 16) != 0 ? activeTaskUiState.btnText : null, (448 & 32) != 0 ? activeTaskUiState.hintTime : 0, (448 & 64) != 0 ? activeTaskUiState.isInterfaceVisible : true, (448 & 128) != 0 ? activeTaskUiState.isNeedClose : false, (448 & 256) != 0 ? activeTaskUiState.isBlockingLoading : false)));
    }

    /* compiled from: ActiveTaskViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$sendCloseScreen$1", m7120f = "ActiveTaskViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nActiveTaskViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,136:1\n230#2,5:137\n*S KotlinDebug\n*F\n+ 1 ActiveTaskViewModel.kt\ncom/blackhub/bronline/game/gui/activetask/ActiveTaskViewModel$sendCloseScreen$1\n*L\n131#1:137,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.activetask.ActiveTaskViewModel$sendCloseScreen$1 */

    public static final class C36941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C36941(Continuation<? super C36941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ActiveTaskViewModel.this.new C36941(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ActiveTaskUiState value;
            ActiveTaskUiState activeTaskUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ActiveTaskViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<ActiveTaskUiState> mutableStateFlow = ActiveTaskViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    activeTaskUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, activeTaskUiState.copy((448 & 1) != 0 ? activeTaskUiState.hintNumber : 0, (448 & 2) != 0 ? activeTaskUiState.hintScreen : null, (448 & 4) != 0 ? activeTaskUiState.hintTitle : null, (448 & 8) != 0 ? activeTaskUiState.hintDesc : null, (448 & 16) != 0 ? activeTaskUiState.btnText : null, (448 & 32) != 0 ? activeTaskUiState.hintTime : 0, (448 & 64) != 0 ? activeTaskUiState.isInterfaceVisible : false, (448 & 128) != 0 ? activeTaskUiState.isNeedClose : true, (448 & 256) != 0 ? activeTaskUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C36941(null), 1, null);
    }
}

