package com.blackhub.bronline.game.gui.taxiorder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.BaseViewModel;
import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.bless.client.R;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
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
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TaxiOrderViewModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ$\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%J\u0006\u0010'\u001a\u00020\u0017J\b\u0010(\u001a\u00020\u0017H\u0002J\u000e\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.2\u0006\u00100\u001a\u000201J \u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+H\u0002J\u000e\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020+J\u000e\u00108\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u00069"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel;", "Lcom/blackhub/bronline/game/common/BaseViewModel;", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderUiState;", "localNotification", "Lcom/blackhub/bronline/game/common/LocalNotification;", "stringResource", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "actionWithJSON", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderActionWithJSON;", "(Lcom/blackhub/bronline/game/common/LocalNotification;Lcom/blackhub/bronline/game/core/resources/StringResource;Lcom/blackhub/bronline/game/gui/taxiorder/TaxiOrderActionWithJSON;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getLocalNotification", "()Lcom/blackhub/bronline/game/common/LocalNotification;", "getStringResource", "()Lcom/blackhub/bronline/game/core/resources/StringResource;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeOrderSettings", "", "company", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiCompanyEnum;", "rate", "Lcom/blackhub/bronline/game/gui/taxiorder/TaxiRateEnum;", "isPaymentChanges", "", "closeMap", "closeScreen", "closeWaitingWindowAndDismissOrder", "extractPrices", "", "", "json", "Lorg/json/JSONObject;", "initJson", "openLocationMenu", "openMap", "orderTaxi", ClientCookie.COMMENT_ATTR, "", "selectAddressAndCountPrices", "coordinates", "Lcom/blackhub/bronline/game/gui/taxiorder/CoordinatesModel;", "selectAddressByMapAndCountPrices", "viewEdgeLength", "", "setOrderInfo", "name", "number", "auto", "showErrorMessage", ThrowableDeserializer.PROP_NAME_MESSAGE, "updateJson", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n230#2,5:310\n230#2,5:315\n230#2,5:320\n230#2,5:329\n230#2,5:334\n1549#3:325\n1620#3,3:326\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel\n*L\n141#1:310,5\n214#1:315,5\n251#1:320,5\n289#1:329,5\n299#1:334,5\n285#1:325\n285#1:326,3\n*E\n"})
/* loaded from: classes.dex */
public final class TaxiOrderViewModel extends BaseViewModel<TaxiOrderUiState> {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<TaxiOrderUiState> _uiState;

    @NotNull
    public final TaxiOrderActionWithJSON actionWithJSON;

    @NotNull
    public final LocalNotification localNotification;

    @NotNull
    public final StringResource stringResource;

    @NotNull
    public final StateFlow<TaxiOrderUiState> uiState;

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public LocalNotification getLocalNotification() {
        return this.localNotification;
    }

    @Override // com.blackhub.bronline.game.common.BaseProjectViewModel
    @NotNull
    public StringResource getStringResource() {
        return this.stringResource;
    }

    @Inject
    public TaxiOrderViewModel(@NotNull LocalNotification localNotification, @NotNull StringResource stringResource, @NotNull TaxiOrderActionWithJSON actionWithJSON) {
        Intrinsics.checkNotNullParameter(localNotification, "localNotification");
        Intrinsics.checkNotNullParameter(stringResource, "stringResource");
        Intrinsics.checkNotNullParameter(actionWithJSON, "actionWithJSON");
        this.localNotification = localNotification;
        this.stringResource = stringResource;
        this.actionWithJSON = actionWithJSON;
        this._uiState = StateFlowKt.MutableStateFlow(new TaxiOrderUiState(null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 2097151, null));
        this.uiState = FlowKt.asStateFlow(get_uiState());
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public MutableStateFlow<TaxiOrderUiState> get_uiState() {
        return this._uiState;
    }

    @Override // com.blackhub.bronline.game.common.BaseViewModel
    @NotNull
    public StateFlow<TaxiOrderUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: TaxiOrderViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$initJson$1", m7120f = "TaxiOrderViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$initJson$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n1855#2,2:310\n230#3,5:312\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$initJson$1\n*L\n65#1:310,2\n76#1:312,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$initJson$1 */
    /* loaded from: classes3.dex */
    public static final class C45481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ TaxiOrderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45481(JSONObject jSONObject, TaxiOrderViewModel taxiOrderViewModel, Continuation<? super C45481> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = taxiOrderViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C45481(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String strOptString = this.$json.optString("pl");
            CoordinatesModel coordinatesModel = new CoordinatesModel(this.$json.optDouble("x", 0.0d), this.$json.optDouble("y", 0.0d));
            List listExtractPrices = this.this$0.extractPrices(this.$json);
            int iOptInt = this.$json.optInt("f");
            int iOptInt2 = this.$json.optInt("s");
            int iOptInt3 = this.$json.optInt("m");
            int iOptInt4 = this.$json.optInt("ca");
            for (TaxiCompanyEnum taxiCompanyEnum : TaxiCompanyEnum.getEntries()) {
                if (iOptInt == taxiCompanyEnum.getIndex()) {
                    taxiCompanyEnum.setFastestOrDemanded(true);
                    taxiCompanyEnum.setDescriptionId(R.string.taxi_the_fastest);
                }
                if (iOptInt2 == taxiCompanyEnum.getIndex()) {
                    taxiCompanyEnum.setFastestOrDemanded(true);
                    taxiCompanyEnum.setDescriptionId(R.string.taxi_increased_demand);
                }
            }
            MutableStateFlow<TaxiOrderUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                TaxiOrderUiState value = mutableStateFlow.getValue();
                TaxiOrderUiState taxiOrderUiState = value;
                Intrinsics.checkNotNull(strOptString);
                MutableStateFlow<TaxiOrderUiState> mutableStateFlow2 = mutableStateFlow;
                int i = iOptInt2;
                int i2 = iOptInt;
                if (mutableStateFlow2.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : strOptString, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : iOptInt3, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : iOptInt4, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : Boxing.boxInt(iOptInt), (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : Boxing.boxInt(iOptInt2), (1966079 & 32) != 0 ? taxiOrderUiState.prices : listExtractPrices, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : coordinatesModel, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false))) {
                    return Unit.INSTANCE;
                }
                mutableStateFlow = mutableStateFlow2;
                iOptInt2 = i;
                iOptInt = i2;
            }
        }
    }

    public final void initJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C45481(json, this, null), 1, null);
    }

    /* compiled from: TaxiOrderViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$updateJson$1", m7120f = "TaxiOrderViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$updateJson$1 */
    /* loaded from: classes3.dex */
    public static final class C45521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ JSONObject $json;
        public int label;
        public final /* synthetic */ TaxiOrderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45521(JSONObject jSONObject, TaxiOrderViewModel taxiOrderViewModel, Continuation<? super C45521> continuation) {
            super(2, continuation);
            this.$json = jSONObject;
            this.this$0 = taxiOrderViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C45521(this.$json, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int iOptInt = this.$json.optInt("t", -2);
            if (iOptInt == 0) {
                String strOptString = this.$json.optString("n");
                String strOptString2 = this.$json.optString(TaxiOrderKeys.NUMBER_KEY);
                String strOptString3 = this.$json.optString("a");
                TaxiOrderViewModel taxiOrderViewModel = this.this$0;
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                Intrinsics.checkNotNull(strOptString3);
                taxiOrderViewModel.setOrderInfo(strOptString, strOptString2, strOptString3);
            } else if (iOptInt == 1) {
                this.this$0.openMap();
            } else if (iOptInt == 2) {
                this.this$0.selectAddressAndCountPrices(new CoordinatesModel(this.$json.optDouble("x"), this.$json.optDouble("y")));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateJson(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C45521(json, this, null), 1, null);
    }

    /* compiled from: TaxiOrderViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$closeScreen$1", m7120f = "TaxiOrderViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$closeScreen$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n230#2,5:310\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$closeScreen$1\n*L\n120#1:310,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$closeScreen$1 */
    /* loaded from: classes3.dex */
    public static final class C45461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45461(Continuation<? super C45461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiOrderViewModel.this.new C45461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TaxiOrderUiState value;
            TaxiOrderUiState taxiOrderUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiOrderViewModel.this.actionWithJSON.sendCloseScreen();
                MutableStateFlow<TaxiOrderUiState> mutableStateFlow = TaxiOrderViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    taxiOrderUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : null, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : true, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeScreen() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45461(null), 1, null);
    }

    public final void showErrorMessage(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        getLocalNotification().showErrorNotification(message);
        closeScreen();
    }

    /* compiled from: TaxiOrderViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$openLocationMenu$1", m7120f = "TaxiOrderViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$openLocationMenu$1 */
    /* loaded from: classes3.dex */
    public static final class C45491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45491(Continuation<? super C45491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiOrderViewModel.this.new C45491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiOrderViewModel.this.actionWithJSON.openLocationMenu();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void openLocationMenu() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45491(null), 1, null);
    }

    public final void closeMap() {
        TaxiOrderUiState value;
        TaxiOrderUiState taxiOrderUiState;
        MutableStateFlow<TaxiOrderUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            taxiOrderUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : null, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false)));
    }

    /* compiled from: TaxiOrderViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$closeWaitingWindowAndDismissOrder$1", m7120f = "TaxiOrderViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$closeWaitingWindowAndDismissOrder$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n230#2,5:310\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$closeWaitingWindowAndDismissOrder$1\n*L\n153#1:310,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$closeWaitingWindowAndDismissOrder$1 */
    /* loaded from: classes3.dex */
    public static final class C45471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C45471(Continuation<? super C45471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiOrderViewModel.this.new C45471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            TaxiOrderUiState value;
            TaxiOrderUiState taxiOrderUiState;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                TaxiOrderViewModel.this.actionWithJSON.dismissOrder();
                MutableStateFlow<TaxiOrderUiState> mutableStateFlow = TaxiOrderViewModel.this.get_uiState();
                do {
                    value = mutableStateFlow.getValue();
                    taxiOrderUiState = value;
                } while (!mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : null, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void closeWaitingWindowAndDismissOrder() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45471(null), 1, null);
    }

    /* compiled from: TaxiOrderViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$selectAddressByMapAndCountPrices$1", m7120f = "TaxiOrderViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$selectAddressByMapAndCountPrices$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n1549#2:310\n1620#2,3:311\n230#3,5:314\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$selectAddressByMapAndCountPrices$1\n*L\n185#1:310\n185#1:311,3\n189#1:314,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$selectAddressByMapAndCountPrices$1 */
    /* loaded from: classes3.dex */
    public static final class C45511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ CoordinatesModel $coordinates;
        public final /* synthetic */ float $viewEdgeLength;
        public int label;
        public final /* synthetic */ TaxiOrderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45511(CoordinatesModel coordinatesModel, float f, TaxiOrderViewModel taxiOrderViewModel, Continuation<? super C45511> continuation) {
            super(2, continuation);
            this.$coordinates = coordinatesModel;
            this.$viewEdgeLength = f;
            this.this$0 = taxiOrderViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C45511(this.$coordinates, this.$viewEdgeLength, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            float x = (float) this.$coordinates.getX();
            float y = (float) this.$coordinates.getY();
            float f = this.$viewEdgeLength;
            float f2 = (y - (f / 2.0f)) * (7000.0f / f);
            double d = (x - (f / 2.0f)) * (7000.0f / f);
            double d2 = f2;
            CoordinatesModel coordinatesModel = new CoordinatesModel(d, d2);
            double dSqrt = Math.sqrt(Math.pow(d - this.this$0.getUiState().getValue().getCoordinatesCurrent().getX(), 2.0d) + Math.pow(d2 - this.this$0.getUiState().getValue().getCoordinatesCurrent().getY(), 2.0d)) / 1000.0f;
            List<Integer> prices = this.this$0.getUiState().getValue().getPrices();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(prices, 10));
            Iterator<T> it = prices.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxInt((((int) dSqrt) + 3) * ((Number) it.next()).intValue()));
            }
            MutableStateFlow<TaxiOrderUiState> mutableStateFlow = this.this$0.get_uiState();
            while (true) {
                TaxiOrderUiState value = mutableStateFlow.getValue();
                TaxiOrderUiState taxiOrderUiState = value;
                ArrayList arrayList2 = arrayList;
                CoordinatesModel coordinatesModel2 = coordinatesModel;
                if (mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : arrayList, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : coordinatesModel, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : true, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false))) {
                    return Unit.INSTANCE;
                }
                arrayList = arrayList2;
                coordinatesModel = coordinatesModel2;
            }
        }
    }

    public final void selectAddressByMapAndCountPrices(@NotNull CoordinatesModel coordinates, float viewEdgeLength) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C45511(coordinates, viewEdgeLength, this, null), 1, null);
    }

    public static /* synthetic */ void changeOrderSettings$default(TaxiOrderViewModel taxiOrderViewModel, TaxiCompanyEnum taxiCompanyEnum, TaxiRateEnum taxiRateEnum, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            taxiCompanyEnum = taxiOrderViewModel.getUiState().getValue().getSelectedCompany();
        }
        if ((i & 2) != 0) {
            taxiRateEnum = taxiOrderViewModel.getUiState().getValue().getSelectedRate();
        }
        if ((i & 4) != 0) {
            z = false;
        }
        taxiOrderViewModel.changeOrderSettings(taxiCompanyEnum, taxiRateEnum, z);
    }

    public final void changeOrderSettings(@NotNull TaxiCompanyEnum company, @NotNull TaxiRateEnum rate, boolean isPaymentChanges) {
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(rate, "rate");
        TaxiPaymentEnum selectedPayment = getUiState().getValue().getSelectedPayment();
        if (isPaymentChanges) {
            TaxiPaymentEnum taxiPaymentEnum = TaxiPaymentEnum.CASH;
            selectedPayment = selectedPayment == taxiPaymentEnum ? TaxiPaymentEnum.CARD : taxiPaymentEnum;
        }
        MutableStateFlow<TaxiOrderUiState> mutableStateFlow = get_uiState();
        while (true) {
            TaxiOrderUiState value = mutableStateFlow.getValue();
            TaxiOrderUiState taxiOrderUiState = value;
            MutableStateFlow<TaxiOrderUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : null, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : company, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : rate, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : selectedPayment, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    /* compiled from: TaxiOrderViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$orderTaxi$1", m7120f = "TaxiOrderViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nTaxiOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$orderTaxi$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,309:1\n230#2,5:310\n*S KotlinDebug\n*F\n+ 1 TaxiOrderViewModel.kt\ncom/blackhub/bronline/game/gui/taxiorder/TaxiOrderViewModel$orderTaxi$1\n*L\n240#1:310,5\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.gui.taxiorder.TaxiOrderViewModel$orderTaxi$1 */
    /* loaded from: classes3.dex */
    public static final class C45501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $comment;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45501(String str, Continuation<? super C45501> continuation) {
            super(2, continuation);
            this.$comment = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TaxiOrderViewModel.this.new C45501(this.$comment, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C45501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TaxiOrderViewModel.this.actionWithJSON.orderTaxi(new TaxiOrderData(TaxiOrderViewModel.this.getUiState().getValue().getCoordinates().getX(), TaxiOrderViewModel.this.getUiState().getValue().getCoordinates().getY(), TaxiOrderViewModel.this.getUiState().getValue().getSelectedCompany().getIndex(), TaxiOrderViewModel.this.getUiState().getValue().getSelectedPayment().getIndex(), TaxiOrderViewModel.this.getUiState().getValue().getSelectedRate().getIndex(), this.$comment, TaxiOrderViewModel.this.getUiState().getValue().getPrices().get((TaxiOrderViewModel.this.getUiState().getValue().getSelectedCompany().getIndex() * 3) + TaxiOrderViewModel.this.getUiState().getValue().getSelectedRate().getIndex()).intValue()));
            MutableStateFlow<TaxiOrderUiState> mutableStateFlow = TaxiOrderViewModel.this.get_uiState();
            String str = this.$comment;
            while (true) {
                TaxiOrderUiState value = mutableStateFlow.getValue();
                TaxiOrderUiState taxiOrderUiState = value;
                String str2 = str;
                if (mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : null, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : str, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : true, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false))) {
                    return Unit.INSTANCE;
                }
                str = str2;
            }
        }
    }

    public final void orderTaxi(@NotNull String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        ViewModelExtensionKt.launchOnIO$default(this, null, new C45501(comment, null), 1, null);
    }

    public final void openMap() {
        TaxiOrderUiState value;
        TaxiOrderUiState taxiOrderUiState;
        MutableStateFlow<TaxiOrderUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            taxiOrderUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : null, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : true, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false)));
    }

    public final List<Integer> extractPrices(JSONObject json) {
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("p");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
            }
        }
        return arrayList;
    }

    public final void selectAddressAndCountPrices(CoordinatesModel coordinates) {
        double dSqrt = Math.sqrt(Math.pow(((float) coordinates.getX()) - getUiState().getValue().getCoordinatesCurrent().getX(), 2.0d) + Math.pow(((float) coordinates.getY()) - getUiState().getValue().getCoordinatesCurrent().getY(), 2.0d)) / 1000.0f;
        List<Integer> prices = getUiState().getValue().getPrices();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(prices, 10));
        Iterator<T> it = prices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((((int) dSqrt) + 3) * ((Number) it.next()).intValue()));
        }
        MutableStateFlow<TaxiOrderUiState> mutableStateFlow = get_uiState();
        while (true) {
            TaxiOrderUiState value = mutableStateFlow.getValue();
            TaxiOrderUiState taxiOrderUiState = value;
            ArrayList arrayList2 = arrayList;
            if (mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : arrayList, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : coordinates, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : null, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : null, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : null, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : true, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : false))) {
                return;
            } else {
                arrayList = arrayList2;
            }
        }
    }

    public final void setOrderInfo(String name, String number, String auto) {
        TaxiOrderUiState value;
        TaxiOrderUiState taxiOrderUiState;
        MutableStateFlow<TaxiOrderUiState> mutableStateFlow = get_uiState();
        do {
            value = mutableStateFlow.getValue();
            taxiOrderUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, taxiOrderUiState.copy((1966079 & 1) != 0 ? taxiOrderUiState.placeName : null, (1966079 & 2) != 0 ? taxiOrderUiState.moneyCash : 0, (1966079 & 4) != 0 ? taxiOrderUiState.moneyCard : 0, (1966079 & 8) != 0 ? taxiOrderUiState.fastestIndex : null, (1966079 & 16) != 0 ? taxiOrderUiState.demandedIndex : null, (1966079 & 32) != 0 ? taxiOrderUiState.prices : null, (1966079 & 64) != 0 ? taxiOrderUiState.coordinatesCurrent : null, (1966079 & 128) != 0 ? taxiOrderUiState.coordinates : null, (1966079 & 256) != 0 ? taxiOrderUiState.selectedCompany : null, (1966079 & 512) != 0 ? taxiOrderUiState.selectedRate : null, (1966079 & 1024) != 0 ? taxiOrderUiState.selectedPayment : null, (1966079 & 2048) != 0 ? taxiOrderUiState.comment : null, (1966079 & 4096) != 0 ? taxiOrderUiState.driverName : name, (1966079 & 8192) != 0 ? taxiOrderUiState.driverNumber : number, (1966079 & 16384) != 0 ? taxiOrderUiState.driverAuto : auto, (1966079 & 32768) != 0 ? taxiOrderUiState.isAddressSelected : false, (1966079 & 65536) != 0 ? taxiOrderUiState.isMapOpened : false, (1966079 & 131072) != 0 ? taxiOrderUiState.isNeedClose : false, (1966079 & 262144) != 0 ? taxiOrderUiState.isPointSelected : false, (1966079 & 524288) != 0 ? taxiOrderUiState.isWaitingWindowOpened : false, (1966079 & 1048576) != 0 ? taxiOrderUiState.isOrderWindowVisible : true)));
    }
}
