package com.blackhub.bronline.game.gui.videoplayer;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse;
import com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponseKt;
import com.blackhub.bronline.launcher.App;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: VideoPlayerViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n230#2,5:124\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel\n*L\n81#1:119,5\n100#1:124,5\n*E\n"})
/* loaded from: classes.dex */
public final class VideoPlayerViewModel extends BaseViewModel<VideoPlayerUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<VideoPlayerUiState> _uiState;

    @NotNull
    public final VideoPlayerActionWithJson actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<VideoPlayerUiState> uiState;

    @Inject
    public VideoPlayerViewModel(@NotNull VideoPlayerActionWithJson actionWithJSON, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new VideoPlayerUiState(null, null, false, 0L, false, 31, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<VideoPlayerUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<VideoPlayerUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: VideoPlayerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$init$1", m7120f = "VideoPlayerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$init$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$init$1\n*L\n45#1:119,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$init$1 */

    public static final class C47211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public final /* synthetic */ PlayerResponse $playerResponse;
        public int label;
        public final /* synthetic */ VideoPlayerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47211(JSONObject jSONObject, PlayerResponse playerResponse, VideoPlayerViewModel videoPlayerViewModel, Continuation<? super C47211> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.$playerResponse = playerResponse;
            this.this$0 = videoPlayerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C47211(this.$json, this.$playerResponse, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            VideoPlayerTypeScreen videoPlayerTypeScreen;
            VideoPlayerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strOptString = this.$json.optString(VideoPlayerKeys.VIDEO_URL_KEY);
            if (this.$json.optInt("t") == 1) {
                videoPlayerTypeScreen = VideoPlayerTypeScreen.MODAL_WINDOW;
            } else {
                videoPlayerTypeScreen = VideoPlayerTypeScreen.PLAYER;
            }
            PlayerResponse playerResponse = this.$playerResponse;
            Application application = this.this$0.application;
            Intrinsics.checkNotNull(strOptString);
            VideoConfiguration videoConfiguration = PlayerResponseKt.toVideoConfiguration(playerResponse, application, strOptString);
            long skipButtonTime = (long) (this.$playerResponse.getSkipButtonTime() * 1000.0f);
            MutableStateFlow<VideoPlayerUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, videoPlayerTypeScreen, videoConfiguration, false, skipButtonTime, false, 20, null)));
            return Unit.INSTANCE;
        }
    }

    public final void init(@NotNull JSONObject json, @NotNull PlayerResponse playerResponse) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(playerResponse, "playerResponse");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47211(json, playerResponse, this, null), 1, null);
    }

    /* compiled from: VideoPlayerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onClickConfirmInModalWindow$1", m7120f = "VideoPlayerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onClickConfirmInModalWindow$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onClickConfirmInModalWindow$1\n*L\n59#1:119,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onClickConfirmInModalWindow$1 */

    public static final class C47221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47221(Continuation<? super C47221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VideoPlayerViewModel.this.new C47221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            VideoPlayerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                VideoPlayerViewModel.this.actionWithJSON.sendConfirmInModalWindow();
                MutableStateFlow<VideoPlayerUiState> mutableStateFlow = VideoPlayerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, VideoPlayerTypeScreen.PLAYER, null, false, 0L, false, 30, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickConfirmInModalWindow() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47221(null), 1, null);
    }

    /* compiled from: VideoPlayerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onClickDismissInModalWindow$1", m7120f = "VideoPlayerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onClickDismissInModalWindow$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onClickDismissInModalWindow$1\n*L\n72#1:119,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onClickDismissInModalWindow$1 */

    public static final class C47231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47231(Continuation<? super C47231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VideoPlayerViewModel.this.new C47231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            VideoPlayerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                VideoPlayerViewModel.this.actionWithJSON.sendDismissInModalWindow();
                VideoPlayerViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<VideoPlayerUiState> mutableStateFlow = VideoPlayerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, null, null, false, 0L, true, 15, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onClickDismissInModalWindow() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C47231(null), 1, null);
    }

    public final void onScreenClick() {
        VideoPlayerUiState value;
        MutableStateFlow<VideoPlayerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, null, null, true, 0L, false, 27, null)));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47252(null), 1, null);
    }

    /* compiled from: VideoPlayerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onScreenClick$2", m7120f = "VideoPlayerViewModel.kt", m7121i = {}, m7122l = {87}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onScreenClick$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onScreenClick$2\n*L\n89#1:119,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onScreenClick$2 */

    public static final class C47252 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47252(Continuation<? super C47252> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VideoPlayerViewModel.this.new C47252(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            VideoPlayerUiState value;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long skipButtonTime = VideoPlayerViewModel.this.getUiState().getValue().getSkipButtonTime();
                this.label = 1;
                if (DelayKt.delay(skipButtonTime, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (App.INSTANCE.isAppOpen()) {
                MutableStateFlow<VideoPlayerUiState> mutableStateFlow = VideoPlayerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, null, null, false, 0L, false, 27, null)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onResumeApp() {
        VideoPlayerUiState value;
        MutableStateFlow<VideoPlayerUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, null, null, false, 0L, false, 27, null)));
    }

    /* compiled from: VideoPlayerViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onCloseScreen$1", m7120f = "VideoPlayerViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nVideoPlayerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,118:1\n230#2,5:119\n*S KotlinDebug\n*F\n+ 1 VideoPlayerViewModel.kt\ncom/blackhub/bronline/game/gui/videoplayer/VideoPlayerViewModel$onCloseScreen$1\n*L\n111#1:119,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.videoplayer.VideoPlayerViewModel$onCloseScreen$1 */

    public static final class C47241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C47241(Continuation<? super C47241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VideoPlayerViewModel.this.new C47241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            VideoPlayerUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                VideoPlayerViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<VideoPlayerUiState> mutableStateFlow = VideoPlayerViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, VideoPlayerUiState.copy$default(value, null, null, false, 0L, true, 15, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCloseScreen() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C47241(null), 1, null);
    }
}

