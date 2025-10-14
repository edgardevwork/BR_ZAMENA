package com.blackhub.bronline.game.gui.electric.viewmodel;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ListExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.FindProblemUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: FindProblemViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n230#2,5:532\n230#2,5:537\n230#2,5:542\n230#2,5:547\n230#2,5:552\n230#2,5:557\n230#2,5:562\n230#2,5:567\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel\n*L\n336#1:527,5\n345#1:532,5\n354#1:537,5\n374#1:542,5\n383#1:547,5\n431#1:552,5\n440#1:557,5\n448#1:562,5\n488#1:567,5\n*E\n"})
/* loaded from: classes2.dex */
public final class FindProblemViewModel extends BaseViewModel<FindProblemUiState> implements ViewModelProvider.Factory {
    public static final int COUNT_RANDOM_MAX = 3;
    public static final long LOADER_MILLIS = 1000;
    public static final double MAX_RANDOM_OHM = 9.99d;
    public static final int NUMBER_COUNT = 4;

    @NotNull
    public static final String OHM_ZERO = "0.00";

    @NotNull
    public final MutableStateFlow<FindProblemUiState> _uiState;

    @NotNull
    public final List<String> fuseBusyList;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final List<String> randomOhmForPointList;

    @NotNull
    public final List<String> randomOhmForTargetList;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<FindProblemUiState> uiState;
    public static final int $stable = 8;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Inject
    public FindProblemViewModel(@NotNull StringResource stringResource, @NotNull LocalNotification localNotification, @NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.stringResource = stringResource;
        this.localNotification = localNotification;
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new FindProblemUiState(null, null, null, false, false, false, 0, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.fuseBusyList = CollectionsKt__CollectionsKt.mutableListOf(ElectricConstants.FUSE_BUSY_ONE, ElectricConstants.FUSE_BUSY_TWO, ElectricConstants.FUSE_BUSY_THREE, ElectricConstants.FUSE_BUSY_FOUR);
        this.randomOhmForPointList = new ArrayList();
        this.randomOhmForTargetList = new ArrayList();
        setClearStateAndCreateRandomList();
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<FindProblemUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<FindProblemUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final List<String> getFuseBusyList() {
        return this.fuseBusyList;
    }

    @NotNull
    public final List<String> getRandomOhmForPointList() {
        return this.randomOhmForPointList;
    }

    @NotNull
    public final List<String> getRandomOhmForTargetList() {
        return this.randomOhmForTargetList;
    }

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$initArgs$1", m7120f = "FindProblemViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n96#2:527\n230#3,5:528\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$initArgs$1\n*L\n89#1:527\n100#1:528,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$initArgs$1 */
    /* loaded from: classes3.dex */
    public static final class C39751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $levelCounter;
        public final /* synthetic */ String $screenArgs;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ FindProblemViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39751(String str, FindProblemViewModel findProblemViewModel, int i, Continuation<? super C39751> continuation) {
            super(2, continuation);
            this.$screenArgs = str;
            this.this$0 = findProblemViewModel;
            this.$levelCounter = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39751 c39751 = new C39751(this.$screenArgs, this.this$0, this.$levelCounter, continuation);
            c39751.L$0 = obj;
            return c39751;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String strEmpty;
            String strEmpty2;
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
            GameInstructionsItem gameInstructionsItem = new GameInstructionsItem(R.drawable.img_instructions_find_problem, strEmpty);
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel2 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.lastOrNull(list);
            if (electricInstructionsAndHintsModel2 == null || (strEmpty2 = electricInstructionsAndHintsModel2.getTextInstructions()) == null) {
                strEmpty2 = AnyExtensionKt.empty(coroutineScope);
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new GameInstructionsItem[]{gameInstructionsItem, new GameInstructionsItem(R.drawable.img_instructions_change_bulb, strEmpty2)});
            MutableStateFlow<FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
            String str2 = this.$screenArgs;
            int i = this.$levelCounter;
            while (true) {
                FindProblemUiState value = mutableStateFlow.getValue();
                FindProblemUiState findProblemUiState = value;
                int i2 = i;
                String str3 = str2;
                MutableStateFlow<FindProblemUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : str2, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : list, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : listListOf, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : i == 1, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                i = i2;
                str2 = str3;
            }
        }
    }

    public final void initArgs(@NotNull String screenArgs, int levelCounter) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39751(screenArgs, this, levelCounter, null), 1, null);
    }

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$setFuseGrayInvisible$1", m7120f = "FindProblemViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$setFuseGrayInvisible$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n230#2,5:532\n230#2,5:537\n230#2,5:542\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$setFuseGrayInvisible$1\n*L\n115#1:527,5\n123#1:532,5\n131#1:537,5\n139#1:542,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$setFuseGrayInvisible$1 */
    /* loaded from: classes3.dex */
    public static final class C39811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CurrentTargetArea $currentTargetArea;
        public int label;
        public final /* synthetic */ FindProblemViewModel this$0;

        /* compiled from: FindProblemViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$setFuseGrayInvisible$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CurrentTargetArea.values().length];
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_ONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_TWO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_THREE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_FOUR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39811(CurrentTargetArea currentTargetArea, FindProblemViewModel findProblemViewModel, Continuation<? super C39811> continuation) {
            super(2, continuation);
            this.$currentTargetArea = currentTargetArea;
            this.this$0 = findProblemViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C39811(this.$currentTargetArea, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FindProblemUiState value;
            FindProblemUiState findProblemUiState;
            FindProblemUiState value2;
            FindProblemUiState findProblemUiState2;
            FindProblemUiState value3;
            FindProblemUiState findProblemUiState3;
            FindProblemUiState value4;
            FindProblemUiState findProblemUiState4;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[this.$currentTargetArea.ordinal()];
            if (i == 1) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    findProblemUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
            } else if (i == 2) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow2 = this.this$0.get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                    findProblemUiState2 = value2;
                } while (!mutableStateFlow2.compareAndSet(value2, findProblemUiState2.copy(((-16) & 1) != 0 ? findProblemUiState2.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState2.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState2.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState2.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState2.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState2.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState2.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState2.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState2.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState2.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState2.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState2.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState2.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState2.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState2.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState2.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState2.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState2.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState2.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState2.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState2.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState2.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState2.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState2.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState2.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState2.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState2.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState2.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState2.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState2.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState2.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState2.isBlockingLoading : false)));
            } else if (i == 3) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow3 = this.this$0.get_uiState();
                do {
                    value3 = mutableStateFlow3.getValue();
                    findProblemUiState3 = value3;
                } while (!mutableStateFlow3.compareAndSet(value3, findProblemUiState3.copy(((-16) & 1) != 0 ? findProblemUiState3.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState3.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState3.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState3.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState3.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState3.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState3.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState3.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState3.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState3.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState3.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState3.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState3.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState3.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState3.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState3.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState3.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState3.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState3.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState3.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState3.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState3.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState3.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState3.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState3.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState3.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState3.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState3.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState3.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState3.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState3.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState3.isBlockingLoading : false)));
            } else if (i == 4) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow4 = this.this$0.get_uiState();
                do {
                    value4 = mutableStateFlow4.getValue();
                    findProblemUiState4 = value4;
                } while (!mutableStateFlow4.compareAndSet(value4, findProblemUiState4.copy(((-16) & 1) != 0 ? findProblemUiState4.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState4.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState4.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState4.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState4.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState4.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState4.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState4.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState4.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState4.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState4.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState4.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState4.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState4.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState4.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState4.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState4.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState4.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState4.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState4.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState4.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState4.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState4.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState4.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState4.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState4.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState4.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState4.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState4.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState4.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState4.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState4.isBlockingLoading : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setFuseGrayInvisible(@NotNull CurrentTargetArea currentTargetArea) {
        Intrinsics.checkNotNullParameter(currentTargetArea, "currentTargetArea");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39811(currentTargetArea, this, null), 1, null);
    }

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$isTargetOnArea$1", m7120f = "FindProblemViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$isTargetOnArea$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n230#2,5:532\n230#2,5:537\n230#2,5:542\n230#2,5:547\n230#2,5:552\n230#2,5:557\n230#2,5:562\n230#2,5:567\n230#2,5:572\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$isTargetOnArea$1\n*L\n160#1:527,5\n186#1:532,5\n205#1:537,5\n224#1:542,5\n243#1:547,5\n261#1:552,5\n285#1:557,5\n296#1:562,5\n306#1:567,5\n316#1:572,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$isTargetOnArea$1 */
    /* loaded from: classes3.dex */
    public static final class C39771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ DragAndDropCallback $dragAndDropCallback;
        public int label;
        public final /* synthetic */ FindProblemViewModel this$0;

        /* compiled from: FindProblemViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$isTargetOnArea$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[CurrentTargetArea.values().length];
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_ONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_TWO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_THREE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FOUR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_ONE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_TWO.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_THREE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[CurrentTargetArea.TARGET_AREA_FUSE_FOUR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CurrentDraggableItem.values().length];
                try {
                    iArr2[CurrentDraggableItem.PROBE_BLACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[CurrentDraggableItem.PROBE_RED.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[CurrentDraggableItem.ELEMENT_TWO.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39771(DragAndDropCallback dragAndDropCallback, FindProblemViewModel findProblemViewModel, Continuation<? super C39771> continuation) {
            super(2, continuation);
            this.$dragAndDropCallback = dragAndDropCallback;
            this.this$0 = findProblemViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C39771(this.$dragAndDropCallback, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CurrentTargetArea currentTargetArea;
            int i;
            FindProblemUiState value;
            FindProblemUiState findProblemUiState;
            boolean onTarget;
            String innerData;
            FindProblemUiState value2;
            FindProblemUiState findProblemUiState2;
            boolean onTarget2;
            String innerData2;
            FindProblemUiState value3;
            FindProblemUiState findProblemUiState3;
            boolean onTarget3;
            String innerData3;
            FindProblemUiState value4;
            FindProblemUiState findProblemUiState4;
            boolean onTarget4;
            String innerData4;
            FindProblemUiState value5;
            FindProblemUiState findProblemUiState5;
            boolean onTarget5;
            DataTargetArea dataTargetArea;
            String innerData5;
            FindProblemUiState value6;
            FindProblemUiState findProblemUiState6;
            FindProblemUiState value7;
            FindProblemUiState findProblemUiState7;
            FindProblemUiState value8;
            FindProblemUiState findProblemUiState8;
            FindProblemUiState value9;
            FindProblemUiState findProblemUiState9;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$1[this.$dragAndDropCallback.getCurrentDraggableItem().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    boolean zIsHintShow = (this.$dragAndDropCallback.getOnTarget() && this.this$0.get_uiState().getValue().isHintShow() && this.this$0.get_uiState().getValue().getCountHint() == 7) ? false : this.this$0.get_uiState().getValue().isHintShow();
                    DataTargetArea dataTargetArea2 = this.$dragAndDropCallback.getDataTargetArea();
                    currentTargetArea = dataTargetArea2 != null ? dataTargetArea2.getCurrentTargetArea() : null;
                    i = currentTargetArea != null ? WhenMappings.$EnumSwitchMapping$0[currentTargetArea.ordinal()] : -1;
                    if (i == 1) {
                        int countHint = (this.$dragAndDropCallback.getOnTarget() && this.this$0.get_uiState().getValue().getCountHint() == 3) ? 4 : this.this$0.get_uiState().getValue().getCountHint();
                        MutableStateFlow<FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
                        DragAndDropCallback dragAndDropCallback = this.$dragAndDropCallback;
                        FindProblemViewModel findProblemViewModel = this.this$0;
                        do {
                            value = mutableStateFlow.getValue();
                            findProblemUiState = value;
                            onTarget = dragAndDropCallback.getOnTarget();
                            innerData = dragAndDropCallback.getDataTargetArea().getInnerData();
                        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : zIsHintShow, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : countHint, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : innerData == null ? FindProblemViewModel.OHM_ZERO : innerData, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : onTarget, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : !dragAndDropCallback.getOnTarget() && findProblemViewModel.get_uiState().getValue().isFuseGrayOneVisible(), ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
                    } else if (i == 2) {
                        int countHint2 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                        MutableStateFlow<FindProblemUiState> mutableStateFlow2 = this.this$0.get_uiState();
                        DragAndDropCallback dragAndDropCallback2 = this.$dragAndDropCallback;
                        FindProblemViewModel findProblemViewModel2 = this.this$0;
                        do {
                            value2 = mutableStateFlow2.getValue();
                            findProblemUiState2 = value2;
                            onTarget2 = dragAndDropCallback2.getOnTarget();
                            innerData2 = dragAndDropCallback2.getDataTargetArea().getInnerData();
                        } while (!mutableStateFlow2.compareAndSet(value2, findProblemUiState2.copy(((-16) & 1) != 0 ? findProblemUiState2.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState2.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState2.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState2.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState2.isHintShow : zIsHintShow, ((-16) & 32) != 0 ? findProblemUiState2.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState2.countHint : countHint2, ((-16) & 128) != 0 ? findProblemUiState2.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState2.textOhmOnMultimeter : innerData2 == null ? FindProblemViewModel.OHM_ZERO : innerData2, ((-16) & 512) != 0 ? findProblemUiState2.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState2.probeRedOnTarget : onTarget2, ((-16) & 2048) != 0 ? findProblemUiState2.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState2.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState2.isFuseRedTwoWithProbeVisible : !dragAndDropCallback2.getOnTarget() && findProblemViewModel2.get_uiState().getValue().isFuseGrayTwoVisible(), ((-16) & 16384) != 0 ? findProblemUiState2.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState2.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState2.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState2.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState2.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState2.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState2.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState2.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState2.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState2.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState2.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState2.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState2.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState2.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState2.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState2.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState2.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState2.isBlockingLoading : false)));
                    } else if (i == 3) {
                        int countHint3 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                        MutableStateFlow<FindProblemUiState> mutableStateFlow3 = this.this$0.get_uiState();
                        DragAndDropCallback dragAndDropCallback3 = this.$dragAndDropCallback;
                        FindProblemViewModel findProblemViewModel3 = this.this$0;
                        do {
                            value3 = mutableStateFlow3.getValue();
                            findProblemUiState3 = value3;
                            onTarget3 = dragAndDropCallback3.getOnTarget();
                            innerData3 = dragAndDropCallback3.getDataTargetArea().getInnerData();
                        } while (!mutableStateFlow3.compareAndSet(value3, findProblemUiState3.copy(((-16) & 1) != 0 ? findProblemUiState3.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState3.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState3.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState3.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState3.isHintShow : zIsHintShow, ((-16) & 32) != 0 ? findProblemUiState3.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState3.countHint : countHint3, ((-16) & 128) != 0 ? findProblemUiState3.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState3.textOhmOnMultimeter : innerData3 == null ? FindProblemViewModel.OHM_ZERO : innerData3, ((-16) & 512) != 0 ? findProblemUiState3.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState3.probeRedOnTarget : onTarget3, ((-16) & 2048) != 0 ? findProblemUiState3.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState3.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState3.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState3.isFuseRedThreeWithProbeVisible : !dragAndDropCallback3.getOnTarget() && findProblemViewModel3.get_uiState().getValue().isFuseGrayThreeVisible(), ((-16) & 32768) != 0 ? findProblemUiState3.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState3.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState3.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState3.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState3.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState3.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState3.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState3.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState3.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState3.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState3.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState3.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState3.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState3.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState3.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState3.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState3.isBlockingLoading : false)));
                    } else if (i == 4) {
                        int countHint4 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                        MutableStateFlow<FindProblemUiState> mutableStateFlow4 = this.this$0.get_uiState();
                        DragAndDropCallback dragAndDropCallback4 = this.$dragAndDropCallback;
                        FindProblemViewModel findProblemViewModel4 = this.this$0;
                        do {
                            value4 = mutableStateFlow4.getValue();
                            findProblemUiState4 = value4;
                            onTarget4 = dragAndDropCallback4.getOnTarget();
                            innerData4 = dragAndDropCallback4.getDataTargetArea().getInnerData();
                        } while (!mutableStateFlow4.compareAndSet(value4, findProblemUiState4.copy(((-16) & 1) != 0 ? findProblemUiState4.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState4.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState4.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState4.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState4.isHintShow : zIsHintShow, ((-16) & 32) != 0 ? findProblemUiState4.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState4.countHint : countHint4, ((-16) & 128) != 0 ? findProblemUiState4.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState4.textOhmOnMultimeter : innerData4 == null ? FindProblemViewModel.OHM_ZERO : innerData4, ((-16) & 512) != 0 ? findProblemUiState4.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState4.probeRedOnTarget : onTarget4, ((-16) & 2048) != 0 ? findProblemUiState4.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState4.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState4.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState4.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState4.isFuseRedFourWithProbeVisible : !dragAndDropCallback4.getOnTarget() && findProblemViewModel4.get_uiState().getValue().isFuseGrayFourVisible(), ((-16) & 65536) != 0 ? findProblemUiState4.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState4.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState4.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState4.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState4.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState4.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState4.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState4.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState4.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState4.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState4.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState4.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState4.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState4.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState4.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState4.isBlockingLoading : false)));
                    } else {
                        int countHint5 = this.$dragAndDropCallback.getOnTarget() ? 7 : this.this$0.get_uiState().getValue().getCountHint();
                        MutableStateFlow<FindProblemUiState> mutableStateFlow5 = this.this$0.get_uiState();
                        DragAndDropCallback dragAndDropCallback5 = this.$dragAndDropCallback;
                        do {
                            value5 = mutableStateFlow5.getValue();
                            findProblemUiState5 = value5;
                            onTarget5 = dragAndDropCallback5.getOnTarget();
                            dataTargetArea = dragAndDropCallback5.getDataTargetArea();
                        } while (!mutableStateFlow5.compareAndSet(value5, findProblemUiState5.copy(((-16) & 1) != 0 ? findProblemUiState5.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState5.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState5.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState5.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState5.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState5.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState5.countHint : countHint5, ((-16) & 128) != 0 ? findProblemUiState5.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState5.textOhmOnMultimeter : (dataTargetArea == null || (innerData5 = dataTargetArea.getInnerData()) == null) ? FindProblemViewModel.OHM_ZERO : innerData5, ((-16) & 512) != 0 ? findProblemUiState5.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState5.probeRedOnTarget : onTarget5, ((-16) & 2048) != 0 ? findProblemUiState5.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState5.isFuseRedOneWithProbeVisible : !dragAndDropCallback5.getOnTarget(), ((-16) & 8192) != 0 ? findProblemUiState5.isFuseRedTwoWithProbeVisible : !dragAndDropCallback5.getOnTarget(), ((-16) & 16384) != 0 ? findProblemUiState5.isFuseRedThreeWithProbeVisible : !dragAndDropCallback5.getOnTarget(), ((-16) & 32768) != 0 ? findProblemUiState5.isFuseRedFourWithProbeVisible : !dragAndDropCallback5.getOnTarget(), ((-16) & 65536) != 0 ? findProblemUiState5.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState5.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState5.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState5.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState5.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState5.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState5.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState5.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState5.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState5.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState5.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState5.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState5.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState5.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState5.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState5.isBlockingLoading : false)));
                    }
                } else if (i2 == 3 && this.$dragAndDropCallback.getOnTarget()) {
                    if (this.this$0.getRandomOhmForTargetList().contains(this.this$0.get_uiState().getValue().getTextMultimeter())) {
                        this.this$0.getRandomOhmForTargetList().remove(this.this$0.get_uiState().getValue().getTextMultimeter());
                    }
                    DataTargetArea dataTargetArea3 = this.$dragAndDropCallback.getDataTargetArea();
                    currentTargetArea = dataTargetArea3 != null ? dataTargetArea3.getCurrentTargetArea() : null;
                    i = currentTargetArea != null ? WhenMappings.$EnumSwitchMapping$0[currentTargetArea.ordinal()] : -1;
                    if (i != 5) {
                        if (i != 6) {
                            if (i == 7) {
                                if (this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                                    MutableStateFlow<FindProblemUiState> mutableStateFlow6 = this.this$0.get_uiState();
                                    do {
                                        value8 = mutableStateFlow6.getValue();
                                        findProblemUiState8 = value8;
                                    } while (!mutableStateFlow6.compareAndSet(value8, findProblemUiState8.copy(((-16) & 1) != 0 ? findProblemUiState8.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState8.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState8.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState8.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState8.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState8.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState8.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState8.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState8.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState8.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState8.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState8.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState8.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState8.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState8.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState8.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState8.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState8.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState8.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState8.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState8.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState8.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState8.isFuseFillThree : true, ((-16) & 8388608) != 0 ? findProblemUiState8.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState8.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState8.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState8.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState8.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState8.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState8.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState8.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState8.isBlockingLoading : false)));
                                }
                            } else if (i == 8 && this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                                MutableStateFlow<FindProblemUiState> mutableStateFlow7 = this.this$0.get_uiState();
                                do {
                                    value9 = mutableStateFlow7.getValue();
                                    findProblemUiState9 = value9;
                                } while (!mutableStateFlow7.compareAndSet(value9, findProblemUiState9.copy(((-16) & 1) != 0 ? findProblemUiState9.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState9.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState9.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState9.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState9.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState9.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState9.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState9.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState9.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState9.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState9.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState9.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState9.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState9.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState9.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState9.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState9.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState9.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState9.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState9.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState9.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState9.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState9.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState9.isFuseFillFour : true, ((-16) & 16777216) != 0 ? findProblemUiState9.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState9.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState9.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState9.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState9.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState9.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState9.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState9.isBlockingLoading : false)));
                            }
                        } else if (this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                            MutableStateFlow<FindProblemUiState> mutableStateFlow8 = this.this$0.get_uiState();
                            do {
                                value7 = mutableStateFlow8.getValue();
                                findProblemUiState7 = value7;
                            } while (!mutableStateFlow8.compareAndSet(value7, findProblemUiState7.copy(((-16) & 1) != 0 ? findProblemUiState7.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState7.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState7.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState7.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState7.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState7.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState7.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState7.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState7.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState7.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState7.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState7.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState7.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState7.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState7.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState7.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState7.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState7.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState7.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState7.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState7.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState7.isFuseFillTwo : true, ((-16) & 4194304) != 0 ? findProblemUiState7.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState7.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState7.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState7.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState7.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState7.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState7.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState7.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState7.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState7.isBlockingLoading : false)));
                        }
                    } else if (this.this$0.get_uiState().getValue().getProbeBlackOnTarget() && this.this$0.get_uiState().getValue().getProbeRedOnTarget()) {
                        MutableStateFlow<FindProblemUiState> mutableStateFlow9 = this.this$0.get_uiState();
                        do {
                            value6 = mutableStateFlow9.getValue();
                            findProblemUiState6 = value6;
                        } while (!mutableStateFlow9.compareAndSet(value6, findProblemUiState6.copy(((-16) & 1) != 0 ? findProblemUiState6.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState6.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState6.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState6.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState6.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState6.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState6.countHint : 7, ((-16) & 128) != 0 ? findProblemUiState6.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState6.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState6.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState6.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState6.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState6.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState6.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState6.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState6.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState6.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState6.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState6.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState6.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState6.isFuseFillOne : true, ((-16) & 2097152) != 0 ? findProblemUiState6.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState6.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState6.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState6.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState6.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState6.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState6.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState6.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState6.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState6.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState6.isBlockingLoading : false)));
                    }
                }
            } else {
                int countHint6 = this.$dragAndDropCallback.getOnTarget() ? 3 : this.this$0.get_uiState().getValue().getCountHint();
                MutableStateFlow<FindProblemUiState> mutableStateFlow10 = this.this$0.get_uiState();
                DragAndDropCallback dragAndDropCallback6 = this.$dragAndDropCallback;
                while (true) {
                    FindProblemUiState value10 = mutableStateFlow10.getValue();
                    FindProblemUiState findProblemUiState10 = value10;
                    DragAndDropCallback dragAndDropCallback7 = dragAndDropCallback6;
                    if (mutableStateFlow10.compareAndSet(value10, findProblemUiState10.copy(((-16) & 1) != 0 ? findProblemUiState10.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState10.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState10.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState10.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState10.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState10.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState10.countHint : countHint6, ((-16) & 128) != 0 ? findProblemUiState10.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState10.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState10.probeBlackOnTarget : dragAndDropCallback6.getOnTarget(), ((-16) & 1024) != 0 ? findProblemUiState10.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState10.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState10.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState10.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState10.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState10.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState10.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState10.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState10.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState10.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState10.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState10.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState10.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState10.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState10.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState10.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState10.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState10.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState10.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState10.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState10.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState10.isBlockingLoading : false))) {
                        break;
                    }
                    dragAndDropCallback6 = dragAndDropCallback7;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void isTargetOnArea(@NotNull DragAndDropCallback dragAndDropCallback) {
        Intrinsics.checkNotNullParameter(dragAndDropCallback, "dragAndDropCallback");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39771(dragAndDropCallback, this, null), 1, null);
    }

    public final void changeMultimeterVisible(boolean visible) {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            findProblemUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 2, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : visible, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
    }

    public final void setHintEight() {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            findProblemUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 8, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
    }

    public final void selectNextGame() {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        if (get_uiState().getValue().isMultimeterVisible()) {
            MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                findProblemUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : true)));
            ViewModelExtensionKt.launchOnDefault$default(this, null, new C39792(null), 1, null);
            return;
        }
        showErrorMessage(getStringResource().findProblemMultimeterIsNotVisible());
    }

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$selectNextGame$2", m7120f = "FindProblemViewModel.kt", m7121i = {}, m7122l = {360}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$selectNextGame$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$selectNextGame$2\n*L\n361#1:527,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$selectNextGame$2 */
    /* loaded from: classes3.dex */
    public static final class C39792 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39792(Continuation<? super C39792> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindProblemViewModel.this.new C39792(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FindProblemUiState value;
            FindProblemUiState findProblemUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableStateFlow<FindProblemUiState> mutableStateFlow = FindProblemViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                findProblemUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : true, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void setWin(boolean isWin) {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            findProblemUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : isWin, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
    }

    public final void onDarkClick() {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        if (get_uiState().getValue().getCountHint() == 4) {
            MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                findProblemUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 5, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
        }
    }

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$onFuseGrayClick$1", m7120f = "FindProblemViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$onFuseGrayClick$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n230#2,5:532\n230#2,5:537\n230#2,5:542\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$onFuseGrayClick$1\n*L\n395#1:527,5\n404#1:532,5\n412#1:537,5\n420#1:542,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$onFuseGrayClick$1 */
    /* loaded from: classes3.dex */
    public static final class C39781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $number;
        public int label;
        public final /* synthetic */ FindProblemViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39781(int i, FindProblemViewModel findProblemViewModel, Continuation<? super C39781> continuation) {
            super(2, continuation);
            this.$number = i;
            this.this$0 = findProblemViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C39781(this.$number, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FindProblemUiState value;
            FindProblemUiState findProblemUiState;
            FindProblemUiState value2;
            FindProblemUiState findProblemUiState2;
            FindProblemUiState value3;
            FindProblemUiState findProblemUiState3;
            FindProblemUiState value4;
            FindProblemUiState findProblemUiState4;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.$number;
            if (i == 1) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow = this.this$0.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    findProblemUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 6, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
            } else if (i == 2) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow2 = this.this$0.get_uiState();
                do {
                    value2 = mutableStateFlow2.getValue();
                    findProblemUiState2 = value2;
                } while (!mutableStateFlow2.compareAndSet(value2, findProblemUiState2.copy(((-16) & 1) != 0 ? findProblemUiState2.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState2.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState2.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState2.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState2.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState2.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState2.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState2.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState2.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState2.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState2.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState2.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState2.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState2.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState2.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState2.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState2.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState2.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState2.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState2.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState2.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState2.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState2.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState2.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState2.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState2.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState2.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState2.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState2.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState2.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState2.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState2.isBlockingLoading : false)));
            } else if (i == 3) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow3 = this.this$0.get_uiState();
                do {
                    value3 = mutableStateFlow3.getValue();
                    findProblemUiState3 = value3;
                } while (!mutableStateFlow3.compareAndSet(value3, findProblemUiState3.copy(((-16) & 1) != 0 ? findProblemUiState3.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState3.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState3.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState3.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState3.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState3.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState3.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState3.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState3.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState3.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState3.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState3.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState3.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState3.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState3.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState3.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState3.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState3.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState3.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState3.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState3.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState3.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState3.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState3.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState3.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState3.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState3.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState3.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState3.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState3.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState3.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState3.isBlockingLoading : false)));
            } else if (i == 4) {
                MutableStateFlow<FindProblemUiState> mutableStateFlow4 = this.this$0.get_uiState();
                do {
                    value4 = mutableStateFlow4.getValue();
                    findProblemUiState4 = value4;
                } while (!mutableStateFlow4.compareAndSet(value4, findProblemUiState4.copy(((-16) & 1) != 0 ? findProblemUiState4.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState4.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState4.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState4.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState4.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState4.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState4.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState4.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState4.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState4.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState4.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState4.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState4.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState4.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState4.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState4.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState4.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState4.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState4.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState4.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState4.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState4.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState4.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState4.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState4.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState4.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState4.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState4.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState4.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState4.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState4.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState4.isBlockingLoading : false)));
            }
            return Unit.INSTANCE;
        }
    }

    public final void onFuseGrayClick(int number) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39781(number, this, null), 1, null);
    }

    public final void closeInstruction() {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            findProblemUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : getUiState().getValue().isFirstGame(), ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
    }

    public final void showHint() {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            findProblemUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : true, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
    }

    public final void closeHint() {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            findProblemUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
    }

    public final void showErrorMessageForBulb() {
        showErrorMessage(getStringResource().findProblemEarly());
    }

    public final void showErrorMessageForFuse() {
        showErrorMessage(getStringResource().findProblemFuseRanOut());
    }

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$initPreferences$1", m7120f = "FindProblemViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$initPreferences$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$initPreferences$1\n*L\n479#1:527,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$initPreferences$1 */
    /* loaded from: classes3.dex */
    public static final class C39761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39761(Continuation<? super C39761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindProblemViewModel.this.new C39761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FindProblemUiState value;
            FindProblemUiState findProblemUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = false;
                if (PreferencesRepository.getInteger$default(FindProblemViewModel.this.preferencesRepository, ElectricConstants.FIND_PROBLEM_PREFERENCES, 0, 2, null) == -1) {
                    z = true;
                    FindProblemViewModel.this.preferencesRepository.putInteger(ElectricConstants.FIND_PROBLEM_PREFERENCES, 1);
                }
                MutableStateFlow<FindProblemUiState> mutableStateFlow = FindProblemViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    findProblemUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : z, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39761(null), 1, null);
    }

    public final void setClearStateAndCreateRandomList() {
        FindProblemUiState value;
        FindProblemUiState findProblemUiState;
        MutableStateFlow<FindProblemUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            findProblemUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : true)));
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39802(null), 1, null);
    }

    /* compiled from: FindProblemViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$setClearStateAndCreateRandomList$2", m7120f = "FindProblemViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nFindProblemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$setClearStateAndCreateRandomList$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,526:1\n230#2,5:527\n*S KotlinDebug\n*F\n+ 1 FindProblemViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/FindProblemViewModel$setClearStateAndCreateRandomList$2\n*L\n497#1:527,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel$setClearStateAndCreateRandomList$2 */
    /* loaded from: classes3.dex */
    public static final class C39802 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39802(Continuation<? super C39802> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindProblemViewModel.this.new C39802(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            FindProblemUiState value;
            FindProblemUiState findProblemUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FindProblemViewModel.this.createRandomOhm();
                FindProblemViewModel.this.setRandomOhmForTarget();
                MutableStateFlow<FindProblemUiState> mutableStateFlow = FindProblemViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    findProblemUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, findProblemUiState.copy(((-16) & 1) != 0 ? findProblemUiState.screenArgs : null, ((-16) & 2) != 0 ? findProblemUiState.instructionsAndHints : null, ((-16) & 4) != 0 ? findProblemUiState.gameInstructionsItemList : null, ((-16) & 8) != 0 ? findProblemUiState.isInstructionsShow : false, ((-16) & 16) != 0 ? findProblemUiState.isHintShow : false, ((-16) & 32) != 0 ? findProblemUiState.isHandShow : false, ((-16) & 64) != 0 ? findProblemUiState.countHint : 0, ((-16) & 128) != 0 ? findProblemUiState.textOhmOnTable : null, ((-16) & 256) != 0 ? findProblemUiState.textOhmOnMultimeter : null, ((-16) & 512) != 0 ? findProblemUiState.probeBlackOnTarget : false, ((-16) & 1024) != 0 ? findProblemUiState.probeRedOnTarget : false, ((-16) & 2048) != 0 ? findProblemUiState.isMultimeterVisible : false, ((-16) & 4096) != 0 ? findProblemUiState.isFuseRedOneWithProbeVisible : false, ((-16) & 8192) != 0 ? findProblemUiState.isFuseRedTwoWithProbeVisible : false, ((-16) & 16384) != 0 ? findProblemUiState.isFuseRedThreeWithProbeVisible : false, ((-16) & 32768) != 0 ? findProblemUiState.isFuseRedFourWithProbeVisible : false, ((-16) & 65536) != 0 ? findProblemUiState.isFuseGrayOneVisible : false, ((-16) & 131072) != 0 ? findProblemUiState.isFuseGrayTwoVisible : false, ((-16) & 262144) != 0 ? findProblemUiState.isFuseGrayThreeVisible : false, ((-16) & 524288) != 0 ? findProblemUiState.isFuseGrayFourVisible : false, ((-16) & 1048576) != 0 ? findProblemUiState.isFuseFillOne : false, ((-16) & 2097152) != 0 ? findProblemUiState.isFuseFillTwo : false, ((-16) & 4194304) != 0 ? findProblemUiState.isFuseFillThree : false, ((-16) & 8388608) != 0 ? findProblemUiState.isFuseFillFour : false, ((-16) & 16777216) != 0 ? findProblemUiState.isElementTwoOneHasListener : false, ((-16) & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? findProblemUiState.isElementTwoTwoHasListener : false, ((-16) & 67108864) != 0 ? findProblemUiState.isElementTwoThreeHasListener : false, ((-16) & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? findProblemUiState.isElementTwoFourHasListener : false, ((-16) & 268435456) != 0 ? findProblemUiState.isFirstGame : false, ((-16) & 536870912) != 0 ? findProblemUiState.isNextGame : false, ((-16) & 1073741824) != 0 ? findProblemUiState.isWin : false, ((-16) & Integer.MIN_VALUE) != 0 ? findProblemUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @SuppressLint({"DefaultLocale"})
    public final void createRandomOhm() {
        for (int i = 0; i < 4; i++) {
            double dNextDouble = Random.INSTANCE.nextDouble(0.0d, 9.99d);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dNextDouble)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            this.randomOhmForPointList.add(str);
        }
        if (ListExtensionKt.isHasDuplicates(this.randomOhmForPointList)) {
            this.randomOhmForPointList.clear();
            createRandomOhm();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRandomOhmForTarget() {
        int iRandom = RangesKt___RangesKt.random(new IntRange(1, 3), Random.INSTANCE);
        List<String> list = this.randomOhmForTargetList;
        list.add(CollectionsKt___CollectionsKt.first((List) this.randomOhmForPointList));
        List listShuffled = CollectionsKt__CollectionsJVMKt.shuffled(CollectionsKt___CollectionsKt.drop(this.randomOhmForPointList, 1));
        if (iRandom >= 2) {
            list.addAll(CollectionsKt___CollectionsKt.take(listShuffled, iRandom - 1));
        }
    }
}

