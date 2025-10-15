package com.blackhub.bronline.game.gui.minigameshelper;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: MiniGamesHelperViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperUiState;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperWithJSON;", "(Lcom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initJson", "", "json", "Lorg/json/JSONObject;", "onCloseButtonClick", "onEndOfTime", "onHitLine", "isHit", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class MiniGamesHelperViewModel extends BaseViewModel<MiniGamesHelperUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<MiniGamesHelperUiState> _uiState;

    @NotNull
    public final MiniGamesHelperWithJSON actionWithJSON;

    @NotNull
    public final StateFlow<MiniGamesHelperUiState> uiState;

    @Inject
    public MiniGamesHelperViewModel(@NotNull MiniGamesHelperWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new MiniGamesHelperUiState(null, null, null, null, 0, 0, 0, null, 0, 0L, 0, false, false, 8191, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<MiniGamesHelperUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<MiniGamesHelperUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: MiniGamesHelperViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$initJson$1", m7120f = "MiniGamesHelperViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMiniGamesHelperViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$initJson$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,175:1\n230#2,5:176\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$initJson$1\n*L\n118#1:176,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$initJson$1 */
    /* loaded from: classes7.dex */
    public static final class C43701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ MiniGamesHelperViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43701(JSONObject jSONObject, MiniGamesHelperViewModel miniGamesHelperViewModel, Continuation<? super C43701> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = miniGamesHelperViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43701(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MiniGamesHelperEnum miniGamesHelperEnum;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("g");
            if (AnyExtensionKt.isNotNull(Boxing.boxInt(iOptInt))) {
                if (iOptInt == 0) {
                    miniGamesHelperEnum = MiniGamesHelperEnum.SCREEN_PRIZE;
                } else if (iOptInt == 1) {
                    miniGamesHelperEnum = MiniGamesHelperEnum.SCREEN_UNTIE;
                } else if (iOptInt == 2) {
                    miniGamesHelperEnum = MiniGamesHelperEnum.SCREEN_FINGER;
                } else {
                    miniGamesHelperEnum = MiniGamesHelperEnum.NONE;
                }
                String strOptString = this.$json.optString("h");
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                int iOptInt2 = this.$json.optInt("s");
                String strOptString2 = this.$json.optString("n");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                int iOptInt3 = this.$json.optInt("r", -1);
                float fOptDouble = (float) this.$json.optDouble(MiniGamesHelperKeys.ROT_X_KEY);
                float fOptDouble2 = (float) this.$json.optDouble(MiniGamesHelperKeys.ROT_Y_KEY);
                float fOptDouble3 = (float) this.$json.optDouble(MiniGamesHelperKeys.ROT_Z_KEY);
                float fOptDouble4 = (float) this.$json.optDouble("z");
                if (strOptString2.length() > 0 && !Intrinsics.areEqual(strOptString2, "null") && iOptInt3 != -1) {
                    GameRender.getInstance().RequestRender(iOptInt2, 0, iOptInt3, 0, 0, fOptDouble, fOptDouble2, fOptDouble3, fOptDouble4, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$initJson$1$$ExternalSyntheticLambda0
                        @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                        public final void OnRenderComplete(int i, Bitmap bitmap) {
                            objectRef.element = bitmap;
                        }
                    });
                }
                String strOptString3 = this.$json.optString("m");
                int iOptInt4 = this.$json.optInt(MiniGamesHelperKeys.CURRENT_PROGRESS_BAR_STATUS_KEY);
                int iOptInt5 = this.$json.optInt(MiniGamesHelperKeys.MAX_VALUE_KEY);
                int i = IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt5)) ? iOptInt5 : 100;
                int iOptInt6 = this.$json.optInt(MiniGamesHelperKeys.MAX_BAR_PROGRESS_KEY);
                int i2 = IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt6)) ? iOptInt6 : 100;
                String strOptString4 = this.$json.optString(MiniGamesHelperKeys.PROGRESS_BAR_TITLE_KEY);
                int iOptInt7 = this.$json.optInt(MiniGamesHelperKeys.TICK_KEY);
                if (!IntExtensionKt.isNotZero(Boxing.boxInt(iOptInt7))) {
                    iOptInt7 = 10;
                }
                int i3 = iOptInt7;
                long jOptInt = this.$json.optInt(MiniGamesHelperKeys.TIMER_KEY);
                if (jOptInt == 0) {
                    jOptInt = 50;
                }
                long j = jOptInt;
                int iNextInt = 2 + Random.INSTANCE.nextInt(5);
                boolean zIsZero = IntExtensionKt.isZero(Boxing.boxInt(this.$json.optInt("x")));
                MutableStateFlow<MiniGamesHelperUiState> mutableStateFlow = this.this$0.get_uiState();
                while (true) {
                    MiniGamesHelperUiState value = mutableStateFlow.getValue();
                    MiniGamesHelperUiState miniGamesHelperUiState = value;
                    Intrinsics.checkNotNull(strOptString);
                    Bitmap bitmap = (Bitmap) objectRef.element;
                    Intrinsics.checkNotNull(strOptString3);
                    Intrinsics.checkNotNull(strOptString4);
                    MiniGamesHelperEnum miniGamesHelperEnum2 = miniGamesHelperEnum;
                    MutableStateFlow<MiniGamesHelperUiState> mutableStateFlow2 = mutableStateFlow;
                    Ref.ObjectRef objectRef2 = objectRef;
                    if (mutableStateFlow2.compareAndSet(value, miniGamesHelperUiState.copy((4096 & 1) != 0 ? miniGamesHelperUiState.helperType : miniGamesHelperEnum, (4096 & 2) != 0 ? miniGamesHelperUiState.prizeHeader : strOptString, (4096 & 4) != 0 ? miniGamesHelperUiState.prizeImage : bitmap, (4096 & 8) != 0 ? miniGamesHelperUiState.congratulatoryText : strOptString3, (4096 & 16) != 0 ? miniGamesHelperUiState.currentProgressBarStatus : iOptInt4, (4096 & 32) != 0 ? miniGamesHelperUiState.maxValue : i, (4096 & 64) != 0 ? miniGamesHelperUiState.maxProgressBarValue : i2, (4096 & 128) != 0 ? miniGamesHelperUiState.progressBarTitle : strOptString4, (4096 & 256) != 0 ? miniGamesHelperUiState.tick : i3, (4096 & 512) != 0 ? miniGamesHelperUiState.timer : j, (4096 & 1024) != 0 ? miniGamesHelperUiState.randomNum : iNextInt, (4096 & 2048) != 0 ? miniGamesHelperUiState.isNeedToShowClose : zIsZero, (4096 & 4096) != 0 ? miniGamesHelperUiState.isNeedClose : false))) {
                        break;
                    }
                    miniGamesHelperEnum = miniGamesHelperEnum2;
                    mutableStateFlow = mutableStateFlow2;
                    objectRef = objectRef2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43701(json, this, null), 1, null);
    }

    /* compiled from: MiniGamesHelperViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$onCloseButtonClick$1", m7120f = "MiniGamesHelperViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMiniGamesHelperViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onCloseButtonClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,175:1\n230#2,5:176\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onCloseButtonClick$1\n*L\n146#1:176,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$onCloseButtonClick$1 */
    /* loaded from: classes7.dex */
    public static final class C43711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43711(Continuation<? super C43711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MiniGamesHelperViewModel.this.new C43711(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MiniGamesHelperUiState value;
            MiniGamesHelperUiState miniGamesHelperUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MiniGamesHelperWithJSON miniGamesHelperWithJSON = MiniGamesHelperViewModel.this.actionWithJSON;
                MiniGamesHelperViewModel miniGamesHelperViewModel = MiniGamesHelperViewModel.this;
                miniGamesHelperWithJSON.sendCloseScreen();
                if (miniGamesHelperViewModel.get_uiState().getValue().getHelperType() == MiniGamesHelperEnum.SCREEN_UNTIE) {
                    miniGamesHelperWithJSON.sendIfUntieScreen();
                }
                MutableStateFlow<MiniGamesHelperUiState> mutableStateFlow = MiniGamesHelperViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    miniGamesHelperUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, miniGamesHelperUiState.copy((4096 & 1) != 0 ? miniGamesHelperUiState.helperType : null, (4096 & 2) != 0 ? miniGamesHelperUiState.prizeHeader : null, (4096 & 4) != 0 ? miniGamesHelperUiState.prizeImage : null, (4096 & 8) != 0 ? miniGamesHelperUiState.congratulatoryText : null, (4096 & 16) != 0 ? miniGamesHelperUiState.currentProgressBarStatus : 0, (4096 & 32) != 0 ? miniGamesHelperUiState.maxValue : 0, (4096 & 64) != 0 ? miniGamesHelperUiState.maxProgressBarValue : 0, (4096 & 128) != 0 ? miniGamesHelperUiState.progressBarTitle : null, (4096 & 256) != 0 ? miniGamesHelperUiState.tick : 0, (4096 & 512) != 0 ? miniGamesHelperUiState.timer : 0L, (4096 & 1024) != 0 ? miniGamesHelperUiState.randomNum : 0, (4096 & 2048) != 0 ? miniGamesHelperUiState.isNeedToShowClose : false, (4096 & 4096) != 0 ? miniGamesHelperUiState.isNeedClose : true)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onCloseButtonClick() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43711(null), 1, null);
    }

    /* compiled from: MiniGamesHelperViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$onEndOfTime$1", m7120f = "MiniGamesHelperViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMiniGamesHelperViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onEndOfTime$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,175:1\n230#2,5:176\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onEndOfTime$1\n*L\n157#1:176,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$onEndOfTime$1 */
    /* loaded from: classes7.dex */
    public static final class C43721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43721(Continuation<? super C43721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MiniGamesHelperViewModel.this.new C43721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MiniGamesHelperUiState value;
            MiniGamesHelperUiState miniGamesHelperUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MiniGamesHelperViewModel.this.actionWithJSON.sendEndOfTime();
            MutableStateFlow<MiniGamesHelperUiState> mutableStateFlow = MiniGamesHelperViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                miniGamesHelperUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, miniGamesHelperUiState.copy((4096 & 1) != 0 ? miniGamesHelperUiState.helperType : null, (4096 & 2) != 0 ? miniGamesHelperUiState.prizeHeader : null, (4096 & 4) != 0 ? miniGamesHelperUiState.prizeImage : null, (4096 & 8) != 0 ? miniGamesHelperUiState.congratulatoryText : null, (4096 & 16) != 0 ? miniGamesHelperUiState.currentProgressBarStatus : 0, (4096 & 32) != 0 ? miniGamesHelperUiState.maxValue : 0, (4096 & 64) != 0 ? miniGamesHelperUiState.maxProgressBarValue : 0, (4096 & 128) != 0 ? miniGamesHelperUiState.progressBarTitle : null, (4096 & 256) != 0 ? miniGamesHelperUiState.tick : 0, (4096 & 512) != 0 ? miniGamesHelperUiState.timer : 0L, (4096 & 1024) != 0 ? miniGamesHelperUiState.randomNum : 0, (4096 & 2048) != 0 ? miniGamesHelperUiState.isNeedToShowClose : false, (4096 & 4096) != 0 ? miniGamesHelperUiState.isNeedClose : true)));
            return Unit.INSTANCE;
        }
    }

    public final void onEndOfTime() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43721(null), 1, null);
    }

    /* compiled from: MiniGamesHelperViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$onHitLine$1", m7120f = "MiniGamesHelperViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nMiniGamesHelperViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onHitLine$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,175:1\n230#2,5:176\n*S KotlinDebug\n*F\n+ 1 MiniGamesHelperViewModel.kt\ncom/blackhub/bronline/game/gui/minigameshelper/MiniGamesHelperViewModel$onHitLine$1\n*L\n172#1:176,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.minigameshelper.MiniGamesHelperViewModel$onHitLine$1 */
    /* loaded from: classes7.dex */
    public static final class C43731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isHit;
        public int label;
        public final /* synthetic */ MiniGamesHelperViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43731(boolean z, MiniGamesHelperViewModel miniGamesHelperViewModel, Continuation<? super C43731> continuation) {
            super(2, continuation);
            this.$isHit = z;
            this.this$0 = miniGamesHelperViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43731(this.$isHit, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MiniGamesHelperUiState value;
            MiniGamesHelperUiState miniGamesHelperUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$isHit) {
                this.this$0.actionWithJSON.sendLineHit();
            } else {
                this.this$0.actionWithJSON.sendLineNotHit();
            }
            this.this$0.actionWithJSON.sendCloseScreen();
            MutableStateFlow<MiniGamesHelperUiState> mutableStateFlow = this.this$0.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                miniGamesHelperUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, miniGamesHelperUiState.copy((4096 & 1) != 0 ? miniGamesHelperUiState.helperType : null, (4096 & 2) != 0 ? miniGamesHelperUiState.prizeHeader : null, (4096 & 4) != 0 ? miniGamesHelperUiState.prizeImage : null, (4096 & 8) != 0 ? miniGamesHelperUiState.congratulatoryText : null, (4096 & 16) != 0 ? miniGamesHelperUiState.currentProgressBarStatus : 0, (4096 & 32) != 0 ? miniGamesHelperUiState.maxValue : 0, (4096 & 64) != 0 ? miniGamesHelperUiState.maxProgressBarValue : 0, (4096 & 128) != 0 ? miniGamesHelperUiState.progressBarTitle : null, (4096 & 256) != 0 ? miniGamesHelperUiState.tick : 0, (4096 & 512) != 0 ? miniGamesHelperUiState.timer : 0L, (4096 & 1024) != 0 ? miniGamesHelperUiState.randomNum : 0, (4096 & 2048) != 0 ? miniGamesHelperUiState.isNeedToShowClose : false, (4096 & 4096) != 0 ? miniGamesHelperUiState.isNeedClose : true)));
            return Unit.INSTANCE;
        }
    }

    public final void onHitLine(boolean isHit) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43731(isHit, this, null), 1, null);
    }
}
