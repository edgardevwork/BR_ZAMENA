package com.blackhub.bronline.game.gui.panelinfo;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.gui.panelinfo.model.PanelInfoContentModel;
import com.blackhub.bronline.game.gui.panelinfo.model.PanelInfoModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: PanelInfoViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class PanelInfoViewModel extends BaseViewModel<PanelInfoUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<PanelInfoUiState> _uiState;

    @NotNull
    public final PanelInfoActionWithJSON actionWithJSON;

    @NotNull
    public final Application application;

    @NotNull
    public final StateFlow<PanelInfoUiState> uiState;

    @Inject
    public PanelInfoViewModel(@NotNull PanelInfoActionWithJSON actionWithJSON, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        Intrinsics.checkNotNullParameter(application, "application");
        this.actionWithJSON = actionWithJSON;
        this.application = application;
        this._uiState = StateFlowKt.MutableStateFlow(new PanelInfoUiState(null, null, false, 7, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<PanelInfoUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<PanelInfoUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: PanelInfoViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel$initJson$1", m7120f = "PanelInfoViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPanelInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelInfoViewModel.kt\ncom/blackhub/bronline/game/gui/panelinfo/PanelInfoViewModel$initJson$1\n+ 2 JsonExtension.kt\ncom/blackhub/bronline/game/core/extension/JsonExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,58:1\n8#2,9:59\n1179#3,2:68\n1253#3,4:70\n230#4,5:74\n*S KotlinDebug\n*F\n+ 1 PanelInfoViewModel.kt\ncom/blackhub/bronline/game/gui/panelinfo/PanelInfoViewModel$initJson$1\n*L\n29#1:59,9\n31#1:68,2\n31#1:70,4\n40#1:74,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel$initJson$1 */
    /* loaded from: classes7.dex */
    public static final class C43811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ PanelInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43811(JSONObject jSONObject, PanelInfoViewModel panelInfoViewModel, Continuation<? super C43811> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = panelInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C43811(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objFromJson;
            PanelInfoUiState value;
            List<PanelInfoContentModel> allHints;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            JSONObject jSONObject = this.$json;
            Map mapEmptyMap = null;
            try {
                Gson gson = new Gson();
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                objFromJson = gson.fromJson(StringsKt__StringsKt.trim((CharSequence) string).toString(), (Class<Object>) PanelInfoModel.class);
            } catch (Exception e) {
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics.log(e.toString());
                firebaseCrashlytics.recordException(e);
                objFromJson = null;
            }
            PanelInfoModel panelInfoModel = (PanelInfoModel) objFromJson;
            if (panelInfoModel != null && (allHints = panelInfoModel.getAllHints()) != null) {
                List<PanelInfoContentModel> list = allHints;
                PanelInfoViewModel panelInfoViewModel = this.this$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
                for (PanelInfoContentModel panelInfoContentModel : list) {
                    Pair pairM7112to = TuplesKt.m7112to(panelInfoContentModel.getImageName(), BitmapUtilsKt.getBitmapFromZip$default(panelInfoViewModel.application, panelInfoContentModel.getImageName(), ImageTypePathInCDNEnum.IMAGE, 0.0f, 0.0f, 24, null));
                    linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
                }
                mapEmptyMap = linkedHashMap;
            }
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt__MapsKt.emptyMap();
            }
            if (panelInfoModel != null) {
                MutableStateFlow<PanelInfoUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, PanelInfoUiState.copy$default(value, mapEmptyMap, panelInfoModel, false, 4, null)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C43811(json, this, null), 1, null);
    }

    /* compiled from: PanelInfoViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel$sendCloseScreen$1", m7120f = "PanelInfoViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPanelInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanelInfoViewModel.kt\ncom/blackhub/bronline/game/gui/panelinfo/PanelInfoViewModel$sendCloseScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,58:1\n230#2,5:59\n*S KotlinDebug\n*F\n+ 1 PanelInfoViewModel.kt\ncom/blackhub/bronline/game/gui/panelinfo/PanelInfoViewModel$sendCloseScreen$1\n*L\n53#1:59,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.panelinfo.PanelInfoViewModel$sendCloseScreen$1 */
    /* loaded from: classes7.dex */
    public static final class C43821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43821(Continuation<? super C43821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PanelInfoViewModel.this.new C43821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            PanelInfoUiState value;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PanelInfoViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<PanelInfoUiState> mutableStateFlow = PanelInfoViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, PanelInfoUiState.copy$default(value, null, null, true, 3, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendCloseScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C43821(null), 1, null);
    }
}

