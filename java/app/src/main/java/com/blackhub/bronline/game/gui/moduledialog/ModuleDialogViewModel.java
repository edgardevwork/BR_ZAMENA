package com.blackhub.bronline.game.gui.moduledialog;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.moduledialog.network.ModuleDialogActionsWithJson;
import com.blackhub.bronline.game.gui.rating.RatingConstants;
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

/* compiled from: ModuleDialogViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nModuleDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,98:1\n230#2,5:99\n230#2,5:104\n*S KotlinDebug\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel\n*L\n64#1:99,5\n87#1:104,5\n*E\n"})
/* loaded from: classes3.dex */
public final class ModuleDialogViewModel extends BaseViewModel<ModuleDialogUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<ModuleDialogUiState> _uiState;

    @NotNull
    public final ModuleDialogActionsWithJson actionsWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<ModuleDialogUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public ModuleDialogViewModel(@NotNull StringResource stringResource, @NotNull ModuleDialogActionsWithJson actionsWithJson, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionsWithJson, "actionsWithJson");
        Intrinsics.checkNotNullParameter(application, "application");
        this.stringResource = stringResource;
        this.actionsWithJson = actionsWithJson;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new ModuleDialogUiState(null, null, null, null, null, null, false, 127, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43751(null), 1, null);
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<ModuleDialogUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<ModuleDialogUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: ModuleDialogViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel$1", m7120f = "ModuleDialogViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nModuleDialogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,98:1\n230#2,5:99\n*S KotlinDebug\n*F\n+ 1 ModuleDialogViewModel.kt\ncom/blackhub/bronline/game/gui/moduledialog/ModuleDialogViewModel$1\n*L\n46#1:99,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C43751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43751(Continuation<? super C43751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ModuleDialogViewModel.this.new C43751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ModuleDialogUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapFromZip$default = BitmapUtilsKt.getBitmapFromZip$default(ModuleDialogViewModel.this.application, RatingConstants.COLLABORATION_AUTUMN_BG_IMAGE_NAME, ImageTypePathInCDNEnum.BACKGROUND, 0.0f, 0.0f, 24, null);
            MutableStateFlow<ModuleDialogUiState> mutableStateFlow = ModuleDialogViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ModuleDialogUiState.copy$default(value, null, null, null, null, null, bitmapFromZip$default, false, 95, null)));
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        parseDialogData(json);
    }

    public final void updateJson(@NotNull JSONObject json) {
        ModuleDialogUiState value;
        Intrinsics.checkNotNullParameter(json, "json");
        int iOptInt = json.optInt("s");
        if (iOptInt == 1) {
            parseDialogData(json);
            return;
        }
        if (iOptInt != 2) {
            return;
        }
        String strOptString = json.optString(ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        MutableStateFlow<ModuleDialogUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ModuleDialogUiState.copy$default(value, null, null, null, null, strOptString, null, false, 111, null)));
    }

    /* compiled from: ModuleDialogViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel$sendOnButtonClick$1", m7120f = "ModuleDialogViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.moduledialog.ModuleDialogViewModel$sendOnButtonClick$1 */
    /* loaded from: classes7.dex */
    public static final class C43761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $buttonId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43761(int i, Continuation<? super C43761> continuation) {
            super(2, continuation);
            this.$buttonId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ModuleDialogViewModel.this.new C43761(this.$buttonId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ModuleDialogViewModel.this.actionsWithJson.sendButtonClicked(this.$buttonId);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendOnButtonClick(int buttonId) {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43761(buttonId, null), 1, null);
    }

    public final void parseDialogData(JSONObject json) {
        String strOptString = json.optString("t");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = json.optString("d");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        AnnotatedString annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(strOptString2);
        String strOptString3 = json.optString("b1");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        String strOptString4 = json.optString("b2");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
        String strOptString5 = json.optString(ModuleDialogKeys.PLAYERS_IN_QUEUE_KEY);
        Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
        MutableStateFlow<ModuleDialogUiState> mutableStateFlow = get_uiState();
        while (true) {
            ModuleDialogUiState value = mutableStateFlow.getValue();
            String str = strOptString5;
            if (mutableStateFlow.compareAndSet(value, ModuleDialogUiState.copy$default(value, strOptString, annotatedStringHtmlTextToAnnotatedString, strOptString3, strOptString4, strOptString5, null, false, 96, null))) {
                return;
            } else {
                strOptString5 = str;
            }
        }
    }
}

