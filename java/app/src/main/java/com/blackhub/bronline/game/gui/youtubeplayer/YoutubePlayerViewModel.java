package com.blackhub.bronline.game.gui.youtubeplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.constants.Other;
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

/* compiled from: YoutubePlayerViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYoutubePlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,63:1\n230#2,5:64\n*S KotlinDebug\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel\n*L\n45#1:64,5\n*E\n"})
/* loaded from: classes.dex */
public final class YoutubePlayerViewModel extends BaseViewModel<YoutubePlayerUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<YoutubePlayerUiState> _uiState;

    @NotNull
    public final YoutubePlayerActionWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<YoutubePlayerUiState> uiState;

    @Inject
    public YoutubePlayerViewModel(@NotNull YoutubePlayerActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new YoutubePlayerUiState(null, 0, false, false, 15, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<YoutubePlayerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<YoutubePlayerUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: YoutubePlayerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerViewModel$init$1", m7120f = "YoutubePlayerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nYoutubePlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel$init$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,63:1\n230#2,5:64\n*S KotlinDebug\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel$init$1\n*L\n30#1:64,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerViewModel$init$1 */

    public static final class C47331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ YoutubePlayerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47331(JSONObject jSONObject, YoutubePlayerViewModel youtubePlayerViewModel, Continuation<? super C47331> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = youtubePlayerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C47331(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            YoutubePlayerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$json.optInt("o", 0) == 1) {
                String strOptString = this.$json.optString("url", Other.FALLBACK);
                MutableStateFlow<YoutubePlayerUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    Intrinsics.checkNotNull(strOptString);
                } while (!mutableStateFlow.compareAndSet(value, YoutubePlayerUiState.copy$default(value, strOptString, 0, false, false, 14, null)));
            } else {
                YoutubePlayerViewModel youtubePlayerViewModel = this.this$0;
                YoutubePlayerViewModel.sendCloseScreen$default(youtubePlayerViewModel, youtubePlayerViewModel.get_uiState().getValue().getTime(), false, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void init(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47331(json, this, null), 1, null);
    }

    public final void saveTime(int time) {
        YoutubePlayerUiState value;
        MutableStateFlow<YoutubePlayerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, YoutubePlayerUiState.copy$default(value, null, time, false, false, 13, null)));
    }

    /* compiled from: YoutubePlayerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerViewModel$sendCloseScreen$1", m7120f = "YoutubePlayerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nYoutubePlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,63:1\n230#2,5:64\n*S KotlinDebug\n*F\n+ 1 YoutubePlayerViewModel.kt\ncom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerViewModel$sendCloseScreen$1\n*L\n55#1:64,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.youtubeplayer.YoutubePlayerViewModel$sendCloseScreen$1 */

    public static final class C47341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isDestroyEnable;
        public final /* synthetic */ int $time;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47341(int i, boolean z, Continuation<? super C47341> continuation) {
            super(2, continuation);
            this.$time = i;
            this.$isDestroyEnable = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return YoutubePlayerViewModel.this.new C47341(this.$time, this.$isDestroyEnable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            YoutubePlayerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                YoutubePlayerViewModel.this.actionWithJSON.sendCloseScreen(this.$time);
                MutableStateFlow<YoutubePlayerUiState> mutableStateFlow = YoutubePlayerViewModel.this.get_uiState();
                boolean z = this.$isDestroyEnable;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, YoutubePlayerUiState.copy$default(value, null, 0, z, true, 3, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ void sendCloseScreen$default(YoutubePlayerViewModel youtubePlayerViewModel, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        youtubePlayerViewModel.sendCloseScreen(i, z);
    }

    public final void sendCloseScreen(int time, boolean isDestroyEnable) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47341(time, isDestroyEnable, null), 1, null);
    }
}

