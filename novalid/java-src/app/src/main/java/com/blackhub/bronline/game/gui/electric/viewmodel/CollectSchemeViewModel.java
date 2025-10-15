package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.CollectSchemeUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.bless.client.R;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: CollectSchemeViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0006\u0010\u001b\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020\u0014J\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\u0014R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/electric/state/CollectSchemeUiState;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeColorTrafficLight", "", "closeHint", "closeInstruction", "initArgs", "screenArgs", "", "initPreferences", "onBgHintClick", "setColorTrafficLight", "colorTrafficLight", "Lcom/blackhub/bronline/game/gui/electric/enums/ColorTrafficLight;", "setWin", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "showHint", "startTimer", "turnOnHintThree", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCollectSchemeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n230#2,5:187\n230#2,5:192\n230#2,5:197\n230#2,5:202\n230#2,5:207\n230#2,5:212\n230#2,5:217\n230#2,5:222\n230#2,5:227\n*S KotlinDebug\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel\n*L\n86#1:187,5\n94#1:192,5\n106#1:197,5\n114#1:202,5\n122#1:207,5\n131#1:212,5\n139#1:217,5\n151#1:222,5\n179#1:227,5\n*E\n"})
/* loaded from: classes2.dex */
public final class CollectSchemeViewModel extends BaseViewModel<CollectSchemeUiState> implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<CollectSchemeUiState> _uiState;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<CollectSchemeUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public CollectSchemeViewModel(@NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new CollectSchemeUiState(null, null, false, false, false, 0, false, false, null, null, false, DoubleToDecimal.BQ_MASK, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<CollectSchemeUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<CollectSchemeUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: CollectSchemeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1", m7120f = "CollectSchemeViewModel.kt", m7121i = {}, m7122l = {51}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCollectSchemeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$changeColorTrafficLight$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n230#2,5:187\n*S KotlinDebug\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$changeColorTrafficLight$1\n*L\n46#1:187,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1 */
    /* loaded from: classes3.dex */
    public static final class C39681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39681(Continuation<? super C39681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CollectSchemeViewModel.this.new C39681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CollectSchemeUiState value;
            CollectSchemeUiState collectSchemeUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<CollectSchemeUiState> mutableStateFlow = CollectSchemeViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    collectSchemeUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : true)));
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CollectSchemeViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CollectSchemeViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1$2", m7120f = "CollectSchemeViewModel.kt", m7121i = {}, m7122l = {53, 55, 57}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$changeColorTrafficLight$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ CollectSchemeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CollectSchemeViewModel collectSchemeViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = collectSchemeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.setColorTrafficLight(ColorTrafficLight.RED);
                    this.label = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.this$0.setWin();
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.setColorTrafficLight(ColorTrafficLight.GREEN);
                        this.label = 3;
                        if (DelayKt.delay(500L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.this$0.setWin();
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.setColorTrafficLight(ColorTrafficLight.YELLOW);
                this.label = 2;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.this$0.setColorTrafficLight(ColorTrafficLight.GREEN);
                this.label = 3;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                }
                this.this$0.setWin();
                return Unit.INSTANCE;
            }
        }
    }

    public final void changeColorTrafficLight() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39681(null), 3, null);
    }

    /* compiled from: CollectSchemeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$initArgs$1", m7120f = "CollectSchemeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCollectSchemeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n96#2:187\n230#3,5:188\n*S KotlinDebug\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$initArgs$1\n*L\n66#1:187\n73#1:188,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$initArgs$1 */
    /* loaded from: classes3.dex */
    public static final class C39691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $screenArgs;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ CollectSchemeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39691(String str, CollectSchemeViewModel collectSchemeViewModel, Continuation<? super C39691> continuation) {
            super(2, continuation);
            this.$screenArgs = str;
            this.this$0 = collectSchemeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39691 c39691 = new C39691(this.$screenArgs, this.this$0, continuation);
            c39691.L$0 = obj;
            return c39691;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strEmpty;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Json.Companion companion = Json.INSTANCE;
            String str = this.$screenArgs;
            companion.getSerializersModule();
            List list = (List) companion.decodeFromString(new ArrayListSerializer(ElectricInstructionsAndHintsModel.INSTANCE.serializer()), str);
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (electricInstructionsAndHintsModel == null || (strEmpty = electricInstructionsAndHintsModel.getTextInstructions()) == null) {
                strEmpty = AnyExtensionKt.empty(coroutineScope);
            }
            List listListOf = CollectionsKt__CollectionsJVMKt.listOf(new GameInstructionsItem(R.drawable.img_instructions_collect_scheme, strEmpty));
            MutableStateFlow<CollectSchemeUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                CollectSchemeUiState value = mutableStateFlow.getValue();
                CollectSchemeUiState collectSchemeUiState = value;
                MutableStateFlow<CollectSchemeUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : list, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : listListOf, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : true, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39691(screenArgs, this, null), 1, null);
    }

    public final void onBgHintClick() {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        CollectSchemeUiState value2;
        CollectSchemeUiState collectSchemeUiState2;
        int countHint = get_uiState().getValue().getCountHint();
        if (countHint == 1) {
            MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                collectSchemeUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 2, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
            return;
        }
        if (countHint != 3) {
            return;
        }
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow2 = get_uiState();
        do {
            value2 = mutableStateFlow2.getValue();
            collectSchemeUiState2 = value2;
        } while (!mutableStateFlow2.compareAndSet(value2, collectSchemeUiState2.copy((1023 & 1) != 0 ? collectSchemeUiState2.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState2.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState2.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState2.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState2.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState2.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState2.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState2.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState2.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState2.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState2.isBlockingLoading : false)));
    }

    public final void turnOnHintThree() {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            collectSchemeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 3, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
    }

    public final void startTimer() {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            collectSchemeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : true, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
    }

    public final void closeInstruction() {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            collectSchemeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : getUiState().getValue().isFirstGame(), (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
    }

    public final void showHint() {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            collectSchemeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : true, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
    }

    public final void closeHint() {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            collectSchemeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    public final void setColorTrafficLight(ColorTrafficLight colorTrafficLight) {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            collectSchemeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : colorTrafficLight, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
    }

    /* compiled from: CollectSchemeViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$initPreferences$1", m7120f = "CollectSchemeViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nCollectSchemeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$initPreferences$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,186:1\n230#2,5:187\n*S KotlinDebug\n*F\n+ 1 CollectSchemeViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/CollectSchemeViewModel$initPreferences$1\n*L\n170#1:187,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.CollectSchemeViewModel$initPreferences$1 */
    /* loaded from: classes3.dex */
    public static final class C39701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39701(Continuation<? super C39701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CollectSchemeViewModel.this.new C39701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CollectSchemeUiState value;
            CollectSchemeUiState collectSchemeUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = false;
                if (PreferencesRepository.getInteger$default(CollectSchemeViewModel.this.preferencesRepository, ElectricConstants.COLLECT_SCHEME_PREFERENCES, 0, 2, null) == -1) {
                    z = true;
                    CollectSchemeViewModel.this.preferencesRepository.putInteger(ElectricConstants.COLLECT_SCHEME_PREFERENCES, 1);
                }
                MutableStateFlow<CollectSchemeUiState> mutableStateFlow = CollectSchemeViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    collectSchemeUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : z, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : null, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39701(null), 1, null);
    }

    public final void setWin() {
        CollectSchemeUiState value;
        CollectSchemeUiState collectSchemeUiState;
        MutableStateFlow<CollectSchemeUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            collectSchemeUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, collectSchemeUiState.copy((1023 & 1) != 0 ? collectSchemeUiState.instructionsAndHints : null, (1023 & 2) != 0 ? collectSchemeUiState.gameInstructionsItemList : null, (1023 & 4) != 0 ? collectSchemeUiState.isInstructionsShow : false, (1023 & 8) != 0 ? collectSchemeUiState.isHintShow : false, (1023 & 16) != 0 ? collectSchemeUiState.isHandShow : false, (1023 & 32) != 0 ? collectSchemeUiState.countHint : 0, (1023 & 64) != 0 ? collectSchemeUiState.isFirstGame : false, (1023 & 128) != 0 ? collectSchemeUiState.isTimerStart : false, (1023 & 256) != 0 ? collectSchemeUiState.isWin : Boolean.TRUE, (1023 & 512) != 0 ? collectSchemeUiState.colorTrafficLight : null, (1023 & 1024) != 0 ? collectSchemeUiState.isBlockingLoading : false)));
    }
}
