package com.blackhub.bronline.game.gui.donate.viewmodel;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.location.GpsStatusWrapper;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.donate.data.FragmentIDWithStatusOfReplay;
import com.blackhub.bronline.game.gui.donate.data.ItemForDialogConfirmation;
import com.blackhub.bronline.game.gui.donate.data.ObjForResultDialog;
import com.blackhub.bronline.game.gui.donate.data.PreviewPrize;
import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: DonateMainViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DonateMainViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableSharedFlow<PreviewPrize> _gettingPrize;

    @NotNull
    public final MutableSharedFlow<PreviewPrize> _previewPrize;

    @NotNull
    public final MutableStateFlow<Boolean> _showBoostLevelsHintBPView;

    @NotNull
    public final MutableStateFlow<Boolean> _showLastChanceBPBoostView;

    @NotNull
    public final DonateActionWithJSON actionWithJson;

    @NotNull
    public final StateFlow<Long> blockTimer;

    @NotNull
    public final MutableStateFlow<Long> blockTimerMutable;

    @NotNull
    public final SharedFlow<FragmentIDWithStatusOfReplay> fragmentID;

    @NotNull
    public final SharedFlow<PreviewPrize> gettingPrize;

    @NotNull
    public final StateFlow<Boolean> isShowingDialogConfirmation;

    @NotNull
    public final StateFlow<Boolean> isShowingInputCustomValueOfRublesDialog;

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> itemForDialogConfirmation;

    @NotNull
    public final SharedFlow<ObjForResultDialog> itemForDialogResult;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final MutableStateFlow<Integer> mutableCarPriceWithColor;

    @NotNull
    public final MutableStateFlow<Integer> mutableColorPrice;

    @NotNull
    public final MutableStateFlow<DonateItem> mutableCurrentItem;

    @NotNull
    public final MutableStateFlow<Integer> mutableCurrentPrice;

    @NotNull
    public final MutableSharedFlow<FragmentIDWithStatusOfReplay> mutableFragmentID;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsShowingDialogConfirmation;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsShowingInputCustomValueOfRublesDialog;

    @NotNull
    public final MutableSharedFlow<ItemForDialogConfirmation> mutableItemForDialogConfirmation;

    @NotNull
    public final MutableSharedFlow<ObjForResultDialog> mutableItemForDialogResult;

    @NotNull
    public final MutableStateFlow<Boolean> mutableTimeoutStatusDialogConfirmation;

    @NotNull
    public final MutableStateFlow<Integer> mutableValueOfCoins;

    @NotNull
    public final MutableStateFlow<Integer> mutableValueOfRubles;

    @NotNull
    public final StateFlow<Integer> newValueOfCoins;

    @NotNull
    public final StateFlow<Integer> newValueOfRubles;

    @NotNull
    public final SharedFlow<PreviewPrize> previewPrize;

    @NotNull
    public final StateFlow<Boolean> timeoutStatusDialogConfirmation;

    @Inject
    public DonateMainViewModel(@NotNull DonateActionWithJSON actionWithJson, @NotNull LocalNotification localNotification) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        this.actionWithJson = actionWithJson;
        this.localNotification = localNotification;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.mutableValueOfRubles = MutableStateFlow;
        this.newValueOfRubles = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.mutableValueOfCoins = MutableStateFlow2;
        this.newValueOfCoins = MutableStateFlow2;
        this.mutableCurrentItem = StateFlowKt.MutableStateFlow(new DonateItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, false, -1, null));
        this.mutableCurrentPrice = StateFlowKt.MutableStateFlow(0);
        this.mutableColorPrice = StateFlowKt.MutableStateFlow(0);
        this.mutableCarPriceWithColor = StateFlowKt.MutableStateFlow(0);
        MutableSharedFlow<ItemForDialogConfirmation> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableItemForDialogConfirmation = mutableSharedFlowMutableSharedFlow$default;
        this.itemForDialogConfirmation = mutableSharedFlowMutableSharedFlow$default;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.mutableTimeoutStatusDialogConfirmation = MutableStateFlow3;
        this.timeoutStatusDialogConfirmation = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.mutableIsShowingDialogConfirmation = MutableStateFlow4;
        this.isShowingDialogConfirmation = MutableStateFlow4;
        MutableSharedFlow<ObjForResultDialog> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableItemForDialogResult = mutableSharedFlowMutableSharedFlow$default2;
        this.itemForDialogResult = mutableSharedFlowMutableSharedFlow$default2;
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this.mutableIsShowingInputCustomValueOfRublesDialog = MutableStateFlow5;
        this.isShowingInputCustomValueOfRublesDialog = MutableStateFlow5;
        MutableSharedFlow<FragmentIDWithStatusOfReplay> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.mutableFragmentID = mutableSharedFlowMutableSharedFlow$default3;
        this.fragmentID = mutableSharedFlowMutableSharedFlow$default3;
        MutableStateFlow<Long> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0L);
        this.blockTimerMutable = MutableStateFlow6;
        this.blockTimer = MutableStateFlow6;
        this._showLastChanceBPBoostView = StateFlowKt.MutableStateFlow(bool);
        this._showBoostLevelsHintBPView = StateFlowKt.MutableStateFlow(bool);
        MutableSharedFlow<PreviewPrize> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._previewPrize = mutableSharedFlowMutableSharedFlow$default4;
        this.previewPrize = mutableSharedFlowMutableSharedFlow$default4;
        MutableSharedFlow<PreviewPrize> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._gettingPrize = mutableSharedFlowMutableSharedFlow$default5;
        this.gettingPrize = mutableSharedFlowMutableSharedFlow$default5;
    }

    @NotNull
    public final StateFlow<Integer> getNewValueOfRubles() {
        return this.newValueOfRubles;
    }

    @NotNull
    public final StateFlow<Integer> getNewValueOfCoins() {
        return this.newValueOfCoins;
    }

    @NotNull
    public final StateFlow<DonateItem> getCurrentItem() {
        return this.mutableCurrentItem;
    }

    @NotNull
    public final StateFlow<Integer> getCurrentPrice() {
        return this.mutableCurrentPrice;
    }

    @NotNull
    public final StateFlow<Integer> getColorPrice() {
        return this.mutableColorPrice;
    }

    @NotNull
    public final StateFlow<Integer> getCarPriceWithColor() {
        return this.mutableCarPriceWithColor;
    }

    @NotNull
    public final SharedFlow<ItemForDialogConfirmation> getItemForDialogConfirmation() {
        return this.itemForDialogConfirmation;
    }

    @NotNull
    public final StateFlow<Boolean> getTimeoutStatusDialogConfirmation() {
        return this.timeoutStatusDialogConfirmation;
    }

    @NotNull
    public final StateFlow<Boolean> isShowingDialogConfirmation() {
        return this.isShowingDialogConfirmation;
    }

    @NotNull
    public final SharedFlow<ObjForResultDialog> getItemForDialogResult() {
        return this.itemForDialogResult;
    }

    @NotNull
    public final StateFlow<Boolean> isShowingInputCustomValueOfRublesDialog() {
        return this.isShowingInputCustomValueOfRublesDialog;
    }

    @NotNull
    public final SharedFlow<FragmentIDWithStatusOfReplay> getFragmentID() {
        return this.fragmentID;
    }

    @NotNull
    public final StateFlow<Long> getBlockTimer() {
        return this.blockTimer;
    }

    @NotNull
    public final StateFlow<Boolean> getShowLastChanceBPBoostView() {
        return FlowKt.asStateFlow(this._showLastChanceBPBoostView);
    }

    @NotNull
    public final StateFlow<Boolean> getShowBoostLevelsHintBPView() {
        return FlowKt.asStateFlow(this._showBoostLevelsHintBPView);
    }

    public final void setShowBoostLevelsHintBPView(boolean value) {
        this._showBoostLevelsHintBPView.setValue(Boolean.valueOf(value));
    }

    public final void setShowLastChanceBPBoostView(boolean value) {
        this._showLastChanceBPBoostView.setValue(Boolean.valueOf(value));
    }

    @NotNull
    public final SharedFlow<PreviewPrize> getPreviewPrize() {
        return this.previewPrize;
    }

    @NotNull
    public final SharedFlow<PreviewPrize> getGettingPrize() {
        return this.gettingPrize;
    }

    public final void setValueOfRubles(int valueOfRubles) {
        this.mutableValueOfRubles.setValue(Integer.valueOf(valueOfRubles));
    }

    public final void setValueOfCoins(int valueOfCoins) {
        this.mutableValueOfCoins.setValue(Integer.valueOf(valueOfCoins));
    }

    public final void closeDialog() throws JSONException {
        this.actionWithJson.closeDialog();
    }

    public final void saveCurrentItem(@NotNull DonateItem item, int price) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mutableCurrentItem.setValue(item);
        Integer type = item.getType();
        if (type != null && type.intValue() == 7) {
            setCarColorPrice(price);
        }
        this.mutableCurrentPrice.setValue(Integer.valueOf(price));
    }

    /* compiled from: DonateMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$showDialogConfirmation$1", m7120f = "DonateMainViewModel.kt", m7121i = {}, m7122l = {128}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$showDialogConfirmation$1 */
    /* loaded from: classes3.dex */
    public static final class C39211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $bodyMessage;
        public final /* synthetic */ String $butNO;
        public final /* synthetic */ String $butOK;
        public final /* synthetic */ String $caption;
        public final /* synthetic */ Integer $carColor;
        public final /* synthetic */ int $price;
        public final /* synthetic */ String $priceText;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39211(String str, int i, String str2, String str3, String str4, String str5, Integer num, Continuation<? super C39211> continuation) {
            super(2, continuation);
            this.$bodyMessage = str;
            this.$price = i;
            this.$priceText = str2;
            this.$caption = str3;
            this.$butOK = str4;
            this.$butNO = str5;
            this.$carColor = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateMainViewModel.this.new C39211(this.$bodyMessage, this.$price, this.$priceText, this.$caption, this.$butOK, this.$butNO, this.$carColor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = DonateMainViewModel.this.mutableItemForDialogConfirmation;
                ItemForDialogConfirmation itemForDialogConfirmation = new ItemForDialogConfirmation(null, this.$bodyMessage, this.$price, null, this.$priceText, this.$caption, this.$butOK, this.$butNO, this.$carColor, null, 521, null);
                this.label = 1;
                if (mutableSharedFlow.emit(itemForDialogConfirmation, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DonateMainViewModel.this.showingDialogConfirmation(true);
            return Unit.INSTANCE;
        }
    }

    public final void showDialogConfirmation(@NotNull String bodyMessage, int price, @Nullable String priceText, @NotNull String caption, @NotNull String butOK, @NotNull String butNO, @Nullable Integer carColor) {
        Intrinsics.checkNotNullParameter(bodyMessage, "bodyMessage");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(butOK, "butOK");
        Intrinsics.checkNotNullParameter(butNO, "butNO");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39211(bodyMessage, price, priceText, caption, butOK, butNO, carColor, null), 3, null);
    }

    public final void startTimeoutForDialogConfirmation(boolean newStatus) {
        this.mutableTimeoutStatusDialogConfirmation.setValue(Boolean.valueOf(newStatus));
    }

    public final void closeTimeoutConfirmationDialog() {
        startTimeoutForDialogConfirmation(false);
    }

    public final void closeConfirmationDialog() {
        showingDialogConfirmation(false);
        this.mutableIsShowingInputCustomValueOfRublesDialog.setValue(Boolean.FALSE);
    }

    public final void showingDialogConfirmation(boolean newStatus) {
        this.mutableIsShowingDialogConfirmation.setValue(Boolean.valueOf(newStatus));
    }

    public final void confirmationBuySkinsOrMoneyOrAccessoriesOrServices() throws JSONException {
        DonateItem value = this.mutableCurrentItem.getValue();
        this.actionWithJson.buySkinsOrMoneyOrAccessoriesOrServices(this.mutableCurrentPrice.getValue().intValue(), value.getInternalId(), value.getCount());
        closeDialogIfItDoesntMeetTheCondition(value.getGameId());
    }

    public final void closeDialogIfItDoesntMeetTheCondition(Integer gameId) {
        if (gameId != null && gameId.intValue() != -20) {
            startTimeoutForDialogConfirmation(true);
        } else {
            closeConfirmationDialog();
            closeTimeoutConfirmationDialog();
        }
    }

    public final void confirmationBuyCar(int carColor) throws JSONException {
        DonateItem value = this.mutableCurrentItem.getValue();
        this.actionWithJson.buyCar(this.mutableCurrentPrice.getValue().intValue(), value.getInternalId(), carColor);
    }

    /* compiled from: DonateMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$showNewFragment$1", m7120f = "DonateMainViewModel.kt", m7121i = {}, m7122l = {GpsStatusWrapper.QZSS_SVID_MIN}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$showNewFragment$1 */
    /* loaded from: classes3.dex */
    public static final class C39221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $fragmentID;
        public final /* synthetic */ boolean $ifReplace;
        public final /* synthetic */ boolean $isOnlyLocalChange;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39221(int i, boolean z, boolean z2, Continuation<? super C39221> continuation) {
            super(2, continuation);
            this.$fragmentID = i;
            this.$ifReplace = z;
            this.$isOnlyLocalChange = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateMainViewModel.this.new C39221(this.$fragmentID, this.$ifReplace, this.$isOnlyLocalChange, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = DonateMainViewModel.this.mutableFragmentID;
                FragmentIDWithStatusOfReplay fragmentIDWithStatusOfReplay = new FragmentIDWithStatusOfReplay(this.$fragmentID, this.$ifReplace, this.$isOnlyLocalChange);
                this.label = 1;
                if (mutableSharedFlow.emit(fragmentIDWithStatusOfReplay, this) == coroutine_suspended) {
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
    }

    public static /* synthetic */ void showNewFragment$default(DonateMainViewModel donateMainViewModel, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        donateMainViewModel.showNewFragment(i, z, z2);
    }

    public final void showNewFragment(int fragmentID, boolean ifReplace, boolean isOnlyLocalChange) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39221(fragmentID, ifReplace, isOnlyLocalChange, null), 3, null);
    }

    public final void setCarColorPrice(int price) {
        int i = (int) ((price * 0.01f) + 5.0f);
        this.mutableColorPrice.setValue(Integer.valueOf(i));
        this.mutableCarPriceWithColor.setValue(Integer.valueOf(price + i));
    }

    /* compiled from: DonateMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$setObjForDialogResult$1", m7120f = "DonateMainViewModel.kt", m7121i = {}, m7122l = {213}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$setObjForDialogResult$1 */
    /* loaded from: classes3.dex */
    public static final class C39201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ObjForResultDialog $objForResultDialog;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39201(ObjForResultDialog objForResultDialog, Continuation<? super C39201> continuation) {
            super(2, continuation);
            this.$objForResultDialog = objForResultDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateMainViewModel.this.new C39201(this.$objForResultDialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = DonateMainViewModel.this.mutableItemForDialogResult;
                ObjForResultDialog objForResultDialog = new ObjForResultDialog(this.$objForResultDialog.getMessage(), this.$objForResultDialog.getSuccess(), this.$objForResultDialog.getBoldMessage(), this.$objForResultDialog.getCaption(), this.$objForResultDialog.getButtonOK(), this.$objForResultDialog.getCurrentAction());
                this.label = 1;
                if (mutableSharedFlow.emit(objForResultDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DonateMainViewModel.this.showingDialogConfirmation(true);
            return Unit.INSTANCE;
        }
    }

    public final void setObjForDialogResult(@NotNull ObjForResultDialog objForResultDialog) {
        Intrinsics.checkNotNullParameter(objForResultDialog, "objForResultDialog");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39201(objForResultDialog, null), 3, null);
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        this.localNotification.showErrorNotification(message);
    }

    public final void showLocalError(int keyT, @NotNull String title, @NotNull String body) throws JSONException {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        this.actionWithJson.showLocalError(keyT, title, body);
    }

    public final void openHeaderBoxes() throws JSONException {
        this.actionWithJson.openHeaderBoxes();
    }

    public final void showInputCustomValueOfRublesDialog() {
        this.mutableIsShowingInputCustomValueOfRublesDialog.setValue(Boolean.TRUE);
        showingDialogConfirmation(true);
    }

    public final void setClosedStatusForInputCustomValueOfRublesDialog() {
        this.mutableIsShowingInputCustomValueOfRublesDialog.setValue(Boolean.FALSE);
    }

    public final void sendCustomValueOfRubles(int newValue) throws JSONException {
        if (newValue != 0) {
            this.actionWithJson.sendCustomValueOfMoney(newValue);
        }
    }

    public final void setBLockTimer(long value) {
        this.blockTimerMutable.setValue(Long.valueOf(value));
    }

    /* compiled from: DonateMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$clickPreviewPrize$1", m7120f = "DonateMainViewModel.kt", m7121i = {}, m7122l = {BottomAppBarTopEdgeTreatment.ANGLE_UP}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$clickPreviewPrize$1 */
    /* loaded from: classes3.dex */
    public static final class C39181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $fromInterface;
        public final /* synthetic */ int $id;
        public final /* synthetic */ Bitmap $image;
        public final /* synthetic */ int $isPremium;
        public final /* synthetic */ String $name;
        public final /* synthetic */ CommonRarityEnum $rarity;
        public final /* synthetic */ int $typeOfAward;
        public final /* synthetic */ int $typeReward;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39181(Bitmap bitmap, String str, int i, int i2, int i3, int i4, int i5, CommonRarityEnum commonRarityEnum, Continuation<? super C39181> continuation) {
            super(2, continuation);
            this.$image = bitmap;
            this.$name = str;
            this.$id = i;
            this.$isPremium = i2;
            this.$typeOfAward = i3;
            this.$fromInterface = i4;
            this.$typeReward = i5;
            this.$rarity = commonRarityEnum;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateMainViewModel.this.new C39181(this.$image, this.$name, this.$id, this.$isPremium, this.$typeOfAward, this.$fromInterface, this.$typeReward, this.$rarity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = DonateMainViewModel.this._previewPrize;
                PreviewPrize previewPrize = new PreviewPrize(this.$image, this.$name, this.$id, this.$isPremium, this.$typeOfAward, this.$fromInterface, this.$typeReward == 1, this.$rarity);
                this.label = 1;
                if (mutableSharedFlow.emit(previewPrize, this) == coroutine_suspended) {
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
    }

    public final void clickPreviewPrize(@Nullable Bitmap image, @NotNull String name, int id, int isPremium, int typeOfAward, int fromInterface, int typeReward, @NotNull CommonRarityEnum rarity) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39181(image, name, id, isPremium, typeOfAward, fromInterface, typeReward, rarity, null), 1, null);
    }

    /* compiled from: DonateMainViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$closePreviewPrize$1", m7120f = "DonateMainViewModel.kt", m7121i = {}, m7122l = {287, 287}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel$closePreviewPrize$1 */
    /* loaded from: classes3.dex */
    public static final class C39191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C39191(Continuation<? super C39191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DonateMainViewModel.this.new C39191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C39191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MutableSharedFlow mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutableSharedFlow = DonateMainViewModel.this._gettingPrize;
                MutableSharedFlow mutableSharedFlow2 = DonateMainViewModel.this._previewPrize;
                this.L$0 = mutableSharedFlow;
                this.label = 1;
                obj = FlowKt.first(mutableSharedFlow2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                mutableSharedFlow = (MutableSharedFlow) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (mutableSharedFlow.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void closePreviewPrize() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C39191(null), 1, null);
    }
}

