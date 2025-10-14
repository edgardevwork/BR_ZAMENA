package com.blackhub.bronline.game.gui.electric.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentDraggableItem;
import com.blackhub.bronline.game.core.utils.draganddrop.enums.CurrentTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DataTargetArea;
import com.blackhub.bronline.game.core.utils.draganddrop.model.DragAndDropCallback;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.state.SumContactsUiState;
import com.blackhub.bronline.game.gui.electric.utils.ElectricConstants;
import com.bless.client.R;
import java.util.ArrayList;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SumContactsViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n230#2,5:327\n230#2,5:332\n230#2,5:337\n230#2,5:342\n230#2,5:347\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel\n*L\n208#1:322,5\n216#1:327,5\n224#1:332,5\n233#1:337,5\n241#1:342,5\n271#1:347,5\n*E\n"})

public final class SumContactsViewModel extends BaseViewModel<SumContactsUiState> implements ViewModelProvider.Factory {
    public static final int MAX_INT_IN_GAME = 9;
    public static final int MINUS_TEN = -10;
    public static final long WIN_DELAY = 300;

    @NotNull
    public final MutableStateFlow<SumContactsUiState> _uiState;

    @NotNull
    public final List<String> cartridgeBusyList;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final StateFlow<SumContactsUiState> uiState;
    public static final int $stable = 8;

    public final void onDarkClick() {
    }

    @Inject
    public SumContactsViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new SumContactsUiState(null, null, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, null, false, 4194303, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
        this.cartridgeBusyList = new ArrayList();
        randomNumbers();
        initPreferences();
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<SumContactsUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<SumContactsUiState> getUiState() {
        return this.uiState;
    }

    @NotNull
    public final List<String> getCartridgeBusyList() {
        return this.cartridgeBusyList;
    }

    /* compiled from: SumContactsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$isTargetOnArea$1", m7120f = "SumContactsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$isTargetOnArea$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n230#2,5:327\n230#2,5:332\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$isTargetOnArea$1\n*L\n87#1:322,5\n117#1:327,5\n147#1:332,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$isTargetOnArea$1 */
    /* loaded from: classes3.dex */
    public static final class C39881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ DragAndDropCallback $dragAndDropCallback;
        public int label;
        public final /* synthetic */ SumContactsViewModel this$0;

        /* compiled from: SumContactsViewModel.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$isTargetOnArea$1$WhenMappings */
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
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CurrentDraggableItem.values().length];
                try {
                    iArr2[CurrentDraggableItem.ELEMENT_BULB.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39881(DragAndDropCallback dragAndDropCallback, SumContactsViewModel sumContactsViewModel, Continuation<? super C39881> continuation) {
            super(2, continuation);
            this.$dragAndDropCallback = dragAndDropCallback;
            this.this$0 = sumContactsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C39881(this.$dragAndDropCallback, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int countError;
            int countError2;
            int countError3;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int innerData = (this.$dragAndDropCallback.getDataDragAndDrop() == null || !this.$dragAndDropCallback.getOnTarget()) ? -10 : this.$dragAndDropCallback.getDataDragAndDrop().getInnerData();
            SumContactsUiState value = this.this$0.getUiState().getValue();
            if (WhenMappings.$EnumSwitchMapping$1[this.$dragAndDropCallback.getCurrentDraggableItem().ordinal()] == 1) {
                DataTargetArea dataTargetArea = this.$dragAndDropCallback.getDataTargetArea();
                CurrentTargetArea currentTargetArea = dataTargetArea != null ? dataTargetArea.getCurrentTargetArea() : null;
                int i = currentTargetArea == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currentTargetArea.ordinal()];
                if (i == 1) {
                    boolean z = value.getTextTwo() + innerData == value.getSumOne();
                    boolean z2 = value.getTextThree() + innerData == value.getSumTwo();
                    if (innerData != -10 && ((value.getTextTwo() != -10 && !z) || (value.getTextThree() != -10 && !z2))) {
                        countError = this.this$0.get_uiState().getValue().getCountError() + 1;
                    } else {
                        countError = this.this$0.get_uiState().getValue().getCountError();
                    }
                    boolean zIsHintShow = (this.$dragAndDropCallback.getOnTarget() || !this.this$0.get_uiState().getValue().isNeedHintClose()) ? this.this$0.get_uiState().getValue().isHintShow() : false;
                    MutableStateFlow<SumContactsUiState> mutableStateFlow = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback = this.$dragAndDropCallback;
                    while (true) {
                        SumContactsUiState value2 = mutableStateFlow.getValue();
                        SumContactsUiState sumContactsUiState = value2;
                        DragAndDropCallback dragAndDropCallback2 = dragAndDropCallback;
                        MutableStateFlow<SumContactsUiState> mutableStateFlow2 = mutableStateFlow;
                        if (mutableStateFlow2.compareAndSet(value2, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : zIsHintShow, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : innerData, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : countError, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : dragAndDropCallback.getOnTarget(), (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false))) {
                            break;
                        }
                        mutableStateFlow = mutableStateFlow2;
                        dragAndDropCallback = dragAndDropCallback2;
                    }
                } else if (i == 2) {
                    boolean z3 = value.getTextTwo() + innerData == value.getSumOne();
                    boolean z4 = value.getTextTwo() + innerData == value.getSumThree();
                    if (innerData != -10 && ((value.getTextOne() != -10 && !z3) || (value.getTextThree() != -10 && !z4))) {
                        countError2 = this.this$0.get_uiState().getValue().getCountError() + 1;
                    } else {
                        countError2 = this.this$0.get_uiState().getValue().getCountError();
                    }
                    int i2 = countError2;
                    boolean zIsHintShow2 = (this.$dragAndDropCallback.getOnTarget() || !this.this$0.get_uiState().getValue().isNeedHintClose()) ? this.this$0.get_uiState().getValue().isHintShow() : false;
                    MutableStateFlow<SumContactsUiState> mutableStateFlow3 = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback3 = this.$dragAndDropCallback;
                    while (true) {
                        SumContactsUiState value3 = mutableStateFlow3.getValue();
                        SumContactsUiState sumContactsUiState2 = value3;
                        DragAndDropCallback dragAndDropCallback4 = dragAndDropCallback3;
                        if (mutableStateFlow3.compareAndSet(value3, sumContactsUiState2.copy((4194296 & 1) != 0 ? sumContactsUiState2.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState2.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState2.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState2.isHintShow : zIsHintShow2, (4194296 & 16) != 0 ? sumContactsUiState2.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState2.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState2.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState2.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState2.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState2.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState2.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState2.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState2.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState2.textTwo : innerData, (4194296 & 16384) != 0 ? sumContactsUiState2.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState2.countError : i2, (4194296 & 65536) != 0 ? sumContactsUiState2.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState2.isBulbTwoOnTarget : dragAndDropCallback3.getOnTarget(), (4194296 & 262144) != 0 ? sumContactsUiState2.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState2.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState2.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState2.isBlockingLoading : false))) {
                            break;
                        }
                        dragAndDropCallback3 = dragAndDropCallback4;
                    }
                } else if (i == 3) {
                    boolean z5 = value.getTextOne() + innerData == value.getSumTwo();
                    boolean z6 = value.getTextTwo() + innerData == value.getSumThree();
                    if (innerData != -10 && ((value.getTextOne() != -10 && !z5) || (value.getTextTwo() != -10 && !z6))) {
                        countError3 = this.this$0.get_uiState().getValue().getCountError() + 1;
                    } else {
                        countError3 = this.this$0.get_uiState().getValue().getCountError();
                    }
                    int i3 = countError3;
                    boolean zIsHintShow3 = (this.$dragAndDropCallback.getOnTarget() || !this.this$0.get_uiState().getValue().isNeedHintClose()) ? this.this$0.get_uiState().getValue().isHintShow() : false;
                    MutableStateFlow<SumContactsUiState> mutableStateFlow4 = this.this$0.get_uiState();
                    DragAndDropCallback dragAndDropCallback5 = this.$dragAndDropCallback;
                    while (true) {
                        SumContactsUiState value4 = mutableStateFlow4.getValue();
                        SumContactsUiState sumContactsUiState3 = value4;
                        DragAndDropCallback dragAndDropCallback6 = dragAndDropCallback5;
                        if (mutableStateFlow4.compareAndSet(value4, sumContactsUiState3.copy((4194296 & 1) != 0 ? sumContactsUiState3.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState3.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState3.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState3.isHintShow : zIsHintShow3, (4194296 & 16) != 0 ? sumContactsUiState3.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState3.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState3.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState3.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState3.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState3.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState3.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState3.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState3.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState3.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState3.textThree : innerData, (4194296 & 32768) != 0 ? sumContactsUiState3.countError : i3, (4194296 & 65536) != 0 ? sumContactsUiState3.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState3.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState3.isBulbThreeOnTarget : dragAndDropCallback5.getOnTarget(), (4194296 & 524288) != 0 ? sumContactsUiState3.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState3.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState3.isBlockingLoading : false))) {
                            break;
                        }
                        dragAndDropCallback5 = dragAndDropCallback6;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void isTargetOnArea(@NotNull DragAndDropCallback dragAndDropCallback) {
        Intrinsics.checkNotNullParameter(dragAndDropCallback, "dragAndDropCallback");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39881(dragAndDropCallback, this, null), 1, null);
    }

    /* compiled from: SumContactsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$setWin$1", m7120f = "SumContactsViewModel.kt", m7121i = {}, m7122l = {168}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$setWin$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$setWin$1\n*L\n169#1:322,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$setWin$1 */
    /* loaded from: classes3.dex */
    public static final class C39901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isWin;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39901(boolean z, Continuation<? super C39901> continuation) {
            super(2, continuation);
            this.$isWin = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SumContactsViewModel.this.new C39901(this.$isWin, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SumContactsUiState value;
            SumContactsUiState sumContactsUiState;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableStateFlow<SumContactsUiState> mutableStateFlow = SumContactsViewModel.this.get_uiState();
            boolean z = this.$isWin;
            do {
                value = mutableStateFlow.getValue();
                sumContactsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : Boxing.boxBoolean(z), (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }

    public final void setWin(boolean isWin) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39901(isWin, null), 1, null);
    }

    /* compiled from: SumContactsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$initArgs$1", m7120f = "SumContactsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$initArgs$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n96#2:322\n230#3,5:323\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$initArgs$1\n*L\n180#1:322\n187#1:323,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$initArgs$1 */
    /* loaded from: classes3.dex */
    public static final class C39861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $screenArgs;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SumContactsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39861(String str, SumContactsViewModel sumContactsViewModel, Continuation<? super C39861> continuation) {
            super(2, continuation);
            this.$screenArgs = str;
            this.this$0 = sumContactsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39861 c39861 = new C39861(this.$screenArgs, this.this$0, continuation);
            c39861.L$0 = obj;
            return c39861;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            List listListOf = CollectionsKt__CollectionsJVMKt.listOf(new GameInstructionsItem(R.drawable.img_instructions_sum_contacts, strEmpty));
            MutableStateFlow<SumContactsUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                SumContactsUiState value = mutableStateFlow.getValue();
                SumContactsUiState sumContactsUiState = value;
                MutableStateFlow<SumContactsUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : list, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : listListOf, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : true, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void initArgs(@NotNull String screenArgs) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39861(screenArgs, this, null), 1, null);
    }

    public final void setHintTwo() {
        SumContactsUiState value;
        SumContactsUiState sumContactsUiState;
        MutableStateFlow<SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            sumContactsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 2, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
    }

    public final void setHintThree() {
        SumContactsUiState value;
        SumContactsUiState sumContactsUiState;
        MutableStateFlow<SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            sumContactsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 3, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
    }

    public final void closeInstruction() {
        SumContactsUiState value;
        SumContactsUiState sumContactsUiState;
        MutableStateFlow<SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            sumContactsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : getUiState().getValue().isFirstGame(), (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
    }

    public final void showHint() {
        SumContactsUiState value;
        SumContactsUiState sumContactsUiState;
        MutableStateFlow<SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            sumContactsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : true, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
    }

    public final void closeHint() {
        SumContactsUiState value;
        SumContactsUiState sumContactsUiState;
        MutableStateFlow<SumContactsUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            sumContactsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
    }

    /* compiled from: SumContactsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$initPreferences$1", m7120f = "SumContactsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$initPreferences$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$initPreferences$1\n*L\n261#1:322,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$initPreferences$1 */
    /* loaded from: classes3.dex */
    public static final class C39871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39871(Continuation<? super C39871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SumContactsViewModel.this.new C39871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SumContactsUiState value;
            SumContactsUiState sumContactsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = false;
                if (PreferencesRepository.getInteger$default(SumContactsViewModel.this.preferencesRepository, ElectricConstants.SUM_CONTACTS_PREFERENCES, 0, 2, null) == -1) {
                    z = true;
                    SumContactsViewModel.this.preferencesRepository.putInteger(ElectricConstants.SUM_CONTACTS_PREFERENCES, 1);
                }
                MutableStateFlow<SumContactsUiState> mutableStateFlow = SumContactsViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    sumContactsUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : z, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void initPreferences() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39871(null), 1, null);
    }

    public final void randomNumbers() {
        SumContactsUiState value;
        SumContactsUiState sumContactsUiState;
        if (!get_uiState().getValue().isBlockingLoading()) {
            MutableStateFlow<SumContactsUiState> mutableStateFlow = get_uiState();
            do {
                value = mutableStateFlow.getValue();
                sumContactsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : 0, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : 0, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : 0, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : 0, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : 0, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : 0, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : true)));
        }
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39892(null), 1, null);
    }

    /* compiled from: SumContactsViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$randomNumbers$2", m7120f = "SumContactsViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nSumContactsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$randomNumbers$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,321:1\n230#2,5:322\n*S KotlinDebug\n*F\n+ 1 SumContactsViewModel.kt\ncom/blackhub/bronline/game/gui/electric/viewmodel/SumContactsViewModel$randomNumbers$2\n*L\n308#1:322,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.electric.viewmodel.SumContactsViewModel$randomNumbers$2 */
    /* loaded from: classes3.dex */
    public static final class C39892 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C39892(Continuation<? super C39892> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SumContactsViewModel.this.new C39892(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SumContactsUiState value;
            SumContactsUiState sumContactsUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Ref.IntRef intRef3 = new Ref.IntRef();
            boolean z = false;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (z) {
                    break;
                }
                IntRange intRange = new IntRange(1, 9);
                Random.Companion companion = Random.INSTANCE;
                intRef.element = RangesKt___RangesKt.random(intRange, companion);
                int iRandom = RangesKt___RangesKt.random(new IntRange(1, intRef.element), companion);
                int i4 = intRef.element - iRandom;
                int iRandom2 = RangesKt___RangesKt.random(new IntRange(i4, 9), companion);
                intRef2.element = iRandom2;
                int i5 = iRandom2 - i4;
                int i6 = iRandom + i5;
                intRef3.element = i6;
                if (iRandom == i4 || iRandom == i5 || i4 == i5 || iRandom == 0 || i4 == 0 || i5 == 0 || i6 > 9 || intRef.element - iRandom <= 0) {
                    z2 = false;
                }
                i = iRandom;
                z = z2;
                i3 = i5;
                i2 = i4;
            }
            List listShuffled = CollectionsKt__CollectionsJVMKt.shuffled(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(i), Boxing.boxInt(i2), Boxing.boxInt(i3)}));
            Integer num = (Integer) CollectionsKt___CollectionsKt.getOrNull(listShuffled, 0);
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) CollectionsKt___CollectionsKt.getOrNull(listShuffled, 1);
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = (Integer) CollectionsKt___CollectionsKt.getOrNull(listShuffled, 2);
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            MutableStateFlow<SumContactsUiState> mutableStateFlow = SumContactsViewModel.this.get_uiState();
            do {
                value = mutableStateFlow.getValue();
                sumContactsUiState = value;
            } while (!mutableStateFlow.compareAndSet(value, sumContactsUiState.copy((4194296 & 1) != 0 ? sumContactsUiState.instructionsAndHints : null, (4194296 & 2) != 0 ? sumContactsUiState.gameInstructionsItemList : null, (4194296 & 4) != 0 ? sumContactsUiState.isInstructionsShow : false, (4194296 & 8) != 0 ? sumContactsUiState.isHintShow : false, (4194296 & 16) != 0 ? sumContactsUiState.isHandShow : false, (4194296 & 32) != 0 ? sumContactsUiState.countHint : 0, (4194296 & 64) != 0 ? sumContactsUiState.sumOne : intRef.element, (4194296 & 128) != 0 ? sumContactsUiState.sumTwo : intRef3.element, (4194296 & 256) != 0 ? sumContactsUiState.sumThree : intRef2.element, (4194296 & 512) != 0 ? sumContactsUiState.bulbTextOne : iIntValue, (4194296 & 1024) != 0 ? sumContactsUiState.bulbTextTwo : iIntValue2, (4194296 & 2048) != 0 ? sumContactsUiState.bulbTextThree : iIntValue3, (4194296 & 4096) != 0 ? sumContactsUiState.textOne : 0, (4194296 & 8192) != 0 ? sumContactsUiState.textTwo : 0, (4194296 & 16384) != 0 ? sumContactsUiState.textThree : 0, (4194296 & 32768) != 0 ? sumContactsUiState.countError : 0, (4194296 & 65536) != 0 ? sumContactsUiState.isBulbOneOnTarget : false, (4194296 & 131072) != 0 ? sumContactsUiState.isBulbTwoOnTarget : false, (4194296 & 262144) != 0 ? sumContactsUiState.isBulbThreeOnTarget : false, (4194296 & 524288) != 0 ? sumContactsUiState.isFirstGame : false, (4194296 & 1048576) != 0 ? sumContactsUiState.isWin : null, (4194296 & 2097152) != 0 ? sumContactsUiState.isBlockingLoading : false)));
            return Unit.INSTANCE;
        }
    }
}

