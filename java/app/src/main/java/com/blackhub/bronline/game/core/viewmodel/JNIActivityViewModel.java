package com.blackhub.bronline.game.core.viewmodel;

import android.app.Application;
import android.content.Intent;
import androidx.annotation.RawRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C2732C;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.H263Reader;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.android.billingclient.api.ProductDetails;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.model.ConfigurationJsonModel;
import com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.BillingError;
import com.blackhub.bronline.game.core.utils.payment.BillingInfo;
import com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.gui.chooseserver.model.YoutuberAcc;
import com.blackhub.bronline.game.gui.donate.data.BillingItem;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.p019ui.donate.DonateDepositCoinsItemModel;
import com.blackhub.bronline.game.p019ui.donate.ProductDetailsItem;
import com.blackhub.bronline.game.p019ui.donate.RustoreProductDetailsItem;
import com.blackhub.bronline.launcher.database.PurchaseDatabase;
import com.blackhub.bronline.launcher.network.Api;
import com.blackhub.bronline.launcher.network.PaymentApi;
import com.blackhub.bronline.launcher.network.Server;
import com.blackhub.bronline.launcher.p021di.BackupUrlAPI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.apache.http.HttpStatus;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import ru.rustore.sdk.billingclient.RuStoreBillingClient;
import ru.rustore.sdk.billingclient.model.product.Product;
import ru.rustore.sdk.billingclient.usecase.ProductsUseCase;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.core.tasks.Task;

/* compiled from: JNIActivityViewModel.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nJNIActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1087:1\n48#2,4:1088\n1549#3:1092\n1620#3,3:1093\n1549#3:1096\n1620#3,3:1097\n1549#3:1105\n1620#3,3:1106\n1855#3,2:1109\n1855#3,2:1111\n1603#3,9:1113\n1855#3:1122\n1856#3:1124\n1612#3:1125\n1045#3:1126\n230#4,5:1100\n1#5:1123\n*S KotlinDebug\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel\n*L\n124#1:1088,4\n630#1:1092\n630#1:1093,3\n638#1:1096\n638#1:1097,3\n666#1:1105\n666#1:1106,3\n946#1:1109,2\n965#1:1111,2\n670#1:1113,9\n670#1:1122\n670#1:1124\n670#1:1125\n693#1:1126\n645#1:1100,5\n670#1:1123\n*E\n"})
/* loaded from: classes2.dex */
public final class JNIActivityViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final MutableLiveData<Integer> _audioFile;

    @NotNull
    public final MutableStateFlow<ConfigurationJsonModel> _configurationJsons;

    @NotNull
    public final MutableStateFlow<Integer> _counterOfRequests;

    @NotNull
    public final MutableStateFlow<Boolean> _isFailedRequest;

    @NotNull
    public final MutableStateFlow<Boolean> _isNeedRestart;

    @NotNull
    public final MutableLiveData<Boolean> _isNeedToShowReview;

    @NotNull
    public final MutableStateFlow<List<ProductDetailsItem>> _productDetailsState;

    @NotNull
    public final MutableStateFlow<List<RustoreProductDetailsItem>> _rustoreProductDetailsState;

    @NotNull
    public final MutableLiveData<List<Server>> _servers;

    @NotNull
    public MutableStateFlow<Integer> _totalSizeOfRequests;

    @NotNull
    public final MutableLiveData<List<Server>> _updatedServers;

    @NotNull
    public final MutableLiveData<List<YoutuberAcc>> _youtubersList;

    @NotNull
    public final JNIActivityActionWithJSON actionWithJson;

    @NotNull
    public final Application application;

    @NotNull
    public final LiveData<Integer> audioFileId;

    @NotNull
    public final Api backupResponse;

    @NotNull
    public final PaymentApi billingAPI;

    @NotNull
    public final BillingClientWrapper billingClientWrapper;

    @NotNull
    public CalendarScreenType calendarSavedPage;

    @NotNull
    public final MediatorLiveData<Pair<List<Server>, List<YoutuberAcc>>> combinedServers;

    @NotNull
    public final CoroutineExceptionHandler coroutineExceptionHandler;
    public int countOfBillingErrors;

    @NotNull
    public final StateFlow<Integer> counterOfRequests;

    @NotNull
    public final StateFlow<Boolean> isFailedRequest;

    @NotNull
    public final StateFlow<Boolean> isNeedRestart;

    @NotNull
    public final Api mainResponse;

    @NotNull
    public final StateFlow<List<ProductDetailsItem>> productDetailsState;

    @NotNull
    public final PurchaseDatabase purchaseDatabase;

    @NotNull
    public final RustoreBillingClientWrapper rustoreBillingClientWrapper;

    @NotNull
    public final StateFlow<List<RustoreProductDetailsItem>> rustoreProductDetailsState;

    @NotNull
    public final StateFlow<Integer> totalSizeOfRequests;

    @NotNull
    public final LiveData<List<Server>> updatedServers;

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel", m7120f = "JNIActivityViewModel.kt", m7121i = {0, 0, 1, 1, 2, 2}, m7122l = {806, 833, 834}, m7123m = "newRequest", m7124n = {"this", "paymentRequest", "this", "paymentRequest", "this", "paymentRequest"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$newRequest$1 */
    /* loaded from: classes3.dex */
    public static final class C35641 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C35641(Continuation<? super C35641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JNIActivityViewModel.this.newRequest(null, this);
        }
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel", m7120f = "JNIActivityViewModel.kt", m7121i = {0, 0, 1, 1, 2, 2}, m7122l = {874, TypedValues.Custom.TYPE_STRING, TypedValues.Custom.TYPE_BOOLEAN}, m7123m = "newRustoreRequest", m7124n = {"this", "paymentRequest", "this", "paymentRequest", "this", "paymentRequest"}, m7125s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$newRustoreRequest$1 */
    /* loaded from: classes3.dex */
    public static final class C35651 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C35651(Continuation<? super C35651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JNIActivityViewModel.this.newRustoreRequest(null, this);
        }
    }

    @NotNull
    public final BillingClientWrapper getBillingClientWrapper() {
        return this.billingClientWrapper;
    }

    @NotNull
    public final RustoreBillingClientWrapper getRustoreBillingClientWrapper() {
        return this.rustoreBillingClientWrapper;
    }

    @Inject
    public JNIActivityViewModel(@NotNull Application application, @NotNull Api mainResponse, @BackupUrlAPI @NotNull Api backupResponse, @NotNull PaymentApi billingAPI, @NotNull BillingClientWrapper billingClientWrapper, @NotNull RustoreBillingClientWrapper rustoreBillingClientWrapper, @NotNull JNIActivityActionWithJSON actionWithJson, @NotNull PurchaseDatabase purchaseDatabase) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(mainResponse, "mainResponse");
        Intrinsics.checkNotNullParameter(backupResponse, "backupResponse");
        Intrinsics.checkNotNullParameter(billingAPI, "billingAPI");
        Intrinsics.checkNotNullParameter(billingClientWrapper, "billingClientWrapper");
        Intrinsics.checkNotNullParameter(rustoreBillingClientWrapper, "rustoreBillingClientWrapper");
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        Intrinsics.checkNotNullParameter(purchaseDatabase, "purchaseDatabase");
        this.application = application;
        this.mainResponse = mainResponse;
        this.backupResponse = backupResponse;
        this.billingAPI = billingAPI;
        this.billingClientWrapper = billingClientWrapper;
        this.rustoreBillingClientWrapper = rustoreBillingClientWrapper;
        this.actionWithJson = actionWithJson;
        this.purchaseDatabase = purchaseDatabase;
        MutableLiveData<List<Server>> mutableLiveData = new MutableLiveData<>();
        this._servers = mutableLiveData;
        MutableLiveData<List<YoutuberAcc>> mutableLiveData2 = new MutableLiveData<>();
        this._youtubersList = mutableLiveData2;
        MutableLiveData<List<Server>> mutableLiveData3 = new MutableLiveData<>();
        this._updatedServers = mutableLiveData3;
        this.updatedServers = mutableLiveData3;
        final MediatorLiveData<Pair<List<Server>, List<YoutuberAcc>>> mediatorLiveData = new MediatorLiveData<>();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mediatorLiveData.addSource(mutableLiveData, new JNIActivityViewModelKt$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends Server>, Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$combinedServers$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list) {
                invoke2((List<Server>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Server> list) {
                objectRef.element = list;
                mediatorLiveData.setValue(new Pair<>(list, objectRef2.element));
            }
        }));
        mediatorLiveData.addSource(mutableLiveData2, new JNIActivityViewModelKt$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends YoutuberAcc>, Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$combinedServers$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends YoutuberAcc> list) {
                invoke2((List<YoutuberAcc>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<YoutuberAcc> list) {
                objectRef2.element = list;
                mediatorLiveData.setValue(new Pair<>(objectRef.element, list));
            }
        }));
        this.combinedServers = mediatorLiveData;
        this._configurationJsons = StateFlowKt.MutableStateFlow(new ConfigurationJsonModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null));
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>(0);
        this._audioFile = mutableLiveData4;
        this.audioFileId = mutableLiveData4;
        Boolean bool = Boolean.FALSE;
        this._isNeedToShowReview = new MutableLiveData<>(bool);
        this.coroutineExceptionHandler = new C3559xd6cdf0c2(CoroutineExceptionHandler.INSTANCE);
        MutableStateFlow<List<ProductDetailsItem>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this._productDetailsState = MutableStateFlow;
        this.productDetailsState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<RustoreProductDetailsItem>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this._rustoreProductDetailsState = MutableStateFlow2;
        this.rustoreProductDetailsState = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(0);
        this._totalSizeOfRequests = MutableStateFlow3;
        this.totalSizeOfRequests = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0);
        this._counterOfRequests = MutableStateFlow4;
        this.counterOfRequests = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(bool);
        this._isFailedRequest = MutableStateFlow5;
        this.isFailedRequest = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(bool);
        this._isNeedRestart = MutableStateFlow6;
        this.isNeedRestart = FlowKt.asStateFlow(MutableStateFlow6);
        this.calendarSavedPage = CalendarScreenType.NONE;
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C35601(null), 1, null);
        requestServersJson();
    }

    @NotNull
    public final LiveData<List<Server>> getUpdatedServers() {
        return this.updatedServers;
    }

    @NotNull
    public final MediatorLiveData<Pair<List<Server>, List<YoutuberAcc>>> getCombinedServers() {
        return this.combinedServers;
    }

    @NotNull
    public final StateFlow<ConfigurationJsonModel> getConfigurationJsons() {
        return FlowKt.asStateFlow(this._configurationJsons);
    }

    @NotNull
    public final LiveData<Integer> getAudioFileId() {
        return this.audioFileId;
    }

    @NotNull
    public final LiveData<Boolean> isNeedToShowReview() {
        return this._isNeedToShowReview;
    }

    @NotNull
    public final StateFlow<List<ProductDetailsItem>> getProductDetailsState() {
        return this.productDetailsState;
    }

    @NotNull
    public final StateFlow<List<RustoreProductDetailsItem>> getRustoreProductDetailsState() {
        return this.rustoreProductDetailsState;
    }

    @NotNull
    public final StateFlow<Integer> getTotalSizeOfRequests() {
        return this.totalSizeOfRequests;
    }

    @NotNull
    public final StateFlow<Integer> getCounterOfRequests() {
        return this.counterOfRequests;
    }

    @NotNull
    public final StateFlow<Boolean> isFailedRequest() {
        return this.isFailedRequest;
    }

    @NotNull
    public final StateFlow<Boolean> isNeedRestart() {
        return this.isNeedRestart;
    }

    @NotNull
    public final CalendarScreenType getCalendarSavedPage() {
        return this.calendarSavedPage;
    }

    public final void setCalendarSavedPage(@NotNull CalendarScreenType calendarScreenType) {
        Intrinsics.checkNotNullParameter(calendarScreenType, "<set-?>");
        this.calendarSavedPage = calendarScreenType;
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {155, 160, MatroskaExtractor.ID_BLOCK_ADDITIONAL}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1 */
    /* loaded from: classes3.dex */
    public static final class C35601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C35601(Continuation<? super C35601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return JNIActivityViewModel.this.new C35601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C35601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = JNIActivityViewModel.this._totalSizeOfRequests;
                Integer numBoxInt = Boxing.boxInt(32);
                this.label = 1;
                if (mutableStateFlow.emit(numBoxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "unconfirmedPaymentRequest", "", "Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1$1 */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ JNIActivityViewModel this$0;

            public AnonymousClass1(JNIActivityViewModel jNIActivityViewModel) {
                this.this$0 = jNIActivityViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<BillingPurchaseRequest>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<BillingPurchaseRequest> list, @NotNull Continuation<? super Unit> continuation) {
                Object objStartPurchases = this.this$0.startPurchases(list, continuation);
                return objStartPurchases == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStartPurchases : Unit.INSTANCE;
            }
        }

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "unconfirmedPaymentRequest", "", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/model/RustoreBillingPurchaseRequest;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$1$2 */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ JNIActivityViewModel this$0;

            public AnonymousClass2(JNIActivityViewModel jNIActivityViewModel) {
                this.this$0 = jNIActivityViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<RustoreBillingPurchaseRequest>) obj, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull List<RustoreBillingPurchaseRequest> list, @NotNull Continuation<? super Unit> continuation) {
                UtilsKt.crashlyticsLog("unconfirmedPayment collect " + list + " ");
                Object objStartRustorePurchases = this.this$0.startRustorePurchases(list, continuation);
                return objStartRustorePurchases == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStartRustorePurchases : Unit.INSTANCE;
            }
        }
    }

    public final void onNativeInitFinish() {
        updateProgress();
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {181}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1 */
    public static final class C36881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C36881(Continuation<? super C36881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return JNIActivityViewModel.this.new C36881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m7105d2 = {"<anonymous>", "", "body", "", "Lcom/blackhub/bronline/launcher/network/Server;", "countOfErrors", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$3 */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends Lambda implements Function2<List<? extends Server>, Integer, Unit> {
            public AnonymousClass3() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list, Integer num) {
                invoke((List<Server>) list, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull List<Server> body, int i) {
                Intrinsics.checkNotNullParameter(body, "body");
                jNIActivityViewModel._servers.postValue(body);
                jNIActivityViewModel.requestJson(i);
            }
        }

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$4 */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass4 extends Lambda implements Function0<Unit> {
            public AnonymousClass4() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                jNIActivityViewModel.showErrorDialogForRestart();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JNIActivityViewModel jNIActivityViewModel = JNIActivityViewModel.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(jNIActivityViewModel, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(JNIActivityViewModel.this, null);
                AnonymousClass3 anonymousClass3 = new Function2<List<? extends Server>, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.requestServersJson.1.3
                    public AnonymousClass3() {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Server> list, Integer num) {
                        invoke((List<Server>) list, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull List<Server> body, int i2) {
                        Intrinsics.checkNotNullParameter(body, "body");
                        jNIActivityViewModel._servers.postValue(body);
                        jNIActivityViewModel.requestJson(i2);
                    }
                };
                AnonymousClass4 anonymousClass4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.requestServersJson.1.4
                    public AnonymousClass4() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke */
                    public final void invoke2() {
                        jNIActivityViewModel.showErrorDialogForRestart();
                    }
                };
                this.label = 1;
                if (JNIActivityViewModel.fetchData$default(jNIActivityViewModel, anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, 0, 0, 0, 0L, this, 240, null) == coroutine_suspended) {
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

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lcom/blackhub/bronline/launcher/network/Server;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$1", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {H263Reader.START_CODE_VALUE_VOP}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Response<List<? extends Server>>>, Object> {
            public int label;
            public final /* synthetic */ JNIActivityViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(JNIActivityViewModel jNIActivityViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = jNIActivityViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Response<List<? extends Server>>> continuation) {
                return invoke2((Continuation<? super Response<List<Server>>>) continuation);
            }

            @Nullable
            /* renamed from: invoke */
            public final Object invoke2(@Nullable Continuation<? super Response<List<Server>>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Api api = this.this$0.mainResponse;
                    this.label = 1;
                    obj = api.servers(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* compiled from: JNIActivityViewModel.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lcom/blackhub/bronline/launcher/network/Server;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$2", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {MatroskaExtractor.ID_CUE_TRACK_POSITIONS}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestServersJson$1$2 */
        public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Response<List<? extends Server>>>, Object> {
            public int label;
            public final /* synthetic */ JNIActivityViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(JNIActivityViewModel jNIActivityViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(1, continuation);
                this.this$0 = jNIActivityViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Response<List<? extends Server>>> continuation) {
                return invoke2((Continuation<? super Response<List<Server>>>) continuation);
            }

            @Nullable
            /* renamed from: invoke */
            public final Object invoke2(@Nullable Continuation<? super Response<List<Server>>> continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Api api = this.this$0.backupResponse;
                    this.label = 1;
                    obj = api.servers(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }
    }

    public final void requestServersJson() {
        ViewModelExtensionKt.launchOnIO$default(this, null, new C36881(null), 1, null);
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1", m7120f = "JNIActivityViewModel.kt", m7121i = {0}, m7122l = {567, 568}, m7123m = "invokeSuspend", m7124n = {"deferredTasks"}, m7125s = {"L$0"})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$requestJson$1 */
    public static final class C35671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $countOfErrors;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35671(int i, Continuation<? super C35671> continuation) {
            super(2, continuation);
            this.$countOfErrors = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return JNIActivityViewModel.this.new C35671(this.$countOfErrors, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C35671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i;
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                JNIActivityViewModel jNIActivityViewModel = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel, null, new JNIActivityViewModel$requestJson$1$deferredTasks$1(jNIActivityViewModel, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel2 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default2 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel2, null, new JNIActivityViewModel$requestJson$1$deferredTasks$2(jNIActivityViewModel2, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel3 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default3 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel3, null, new JNIActivityViewModel$requestJson$1$deferredTasks$3(jNIActivityViewModel3, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel4 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default4 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel4, null, new JNIActivityViewModel$requestJson$1$deferredTasks$4(jNIActivityViewModel4, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel5 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default5 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel5, null, new JNIActivityViewModel$requestJson$1$deferredTasks$5(jNIActivityViewModel5, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel6 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default6 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel6, null, new JNIActivityViewModel$requestJson$1$deferredTasks$6(jNIActivityViewModel6, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel7 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default7 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel7, null, new JNIActivityViewModel$requestJson$1$deferredTasks$7(jNIActivityViewModel7, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel8 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default8 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel8, null, new JNIActivityViewModel$requestJson$1$deferredTasks$8(jNIActivityViewModel8, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel9 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default9 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel9, null, new JNIActivityViewModel$requestJson$1$deferredTasks$9(jNIActivityViewModel9, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel10 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default10 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel10, null, new JNIActivityViewModel$requestJson$1$deferredTasks$10(jNIActivityViewModel10, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel11 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default11 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel11, null, new JNIActivityViewModel$requestJson$1$deferredTasks$11(jNIActivityViewModel11, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel12 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default12 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel12, null, new JNIActivityViewModel$requestJson$1$deferredTasks$12(jNIActivityViewModel12, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel13 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default13 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel13, null, new JNIActivityViewModel$requestJson$1$deferredTasks$13(jNIActivityViewModel13, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel14 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default14 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel14, null, new JNIActivityViewModel$requestJson$1$deferredTasks$14(jNIActivityViewModel14, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel15 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default15 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel15, null, new JNIActivityViewModel$requestJson$1$deferredTasks$15(jNIActivityViewModel15, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel16 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default16 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel16, null, new JNIActivityViewModel$requestJson$1$deferredTasks$16(jNIActivityViewModel16, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel17 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default17 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel17, null, new JNIActivityViewModel$requestJson$1$deferredTasks$17(jNIActivityViewModel17, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel18 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default18 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel18, null, new JNIActivityViewModel$requestJson$1$deferredTasks$18(jNIActivityViewModel18, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel19 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default19 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel19, null, new JNIActivityViewModel$requestJson$1$deferredTasks$19(jNIActivityViewModel19, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel20 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default20 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel20, null, new JNIActivityViewModel$requestJson$1$deferredTasks$20(jNIActivityViewModel20, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel21 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default21 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel21, null, new JNIActivityViewModel$requestJson$1$deferredTasks$21(jNIActivityViewModel21, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel22 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default22 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel22, null, new JNIActivityViewModel$requestJson$1$deferredTasks$22(jNIActivityViewModel22, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel23 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default23 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel23, null, new JNIActivityViewModel$requestJson$1$deferredTasks$23(jNIActivityViewModel23, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel24 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default24 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel24, null, new JNIActivityViewModel$requestJson$1$deferredTasks$24(jNIActivityViewModel24, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel25 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default25 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel25, null, new JNIActivityViewModel$requestJson$1$deferredTasks$25(jNIActivityViewModel25, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel26 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default26 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel26, null, new JNIActivityViewModel$requestJson$1$deferredTasks$26(jNIActivityViewModel26, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel27 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default27 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel27, null, new JNIActivityViewModel$requestJson$1$deferredTasks$27(jNIActivityViewModel27, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel28 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default28 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel28, null, new JNIActivityViewModel$requestJson$1$deferredTasks$28(jNIActivityViewModel28, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel29 = JNIActivityViewModel.this;
                Deferred deferredAsyncOnIO$default29 = ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel29, null, new JNIActivityViewModel$requestJson$1$deferredTasks$29(jNIActivityViewModel29, this.$countOfErrors, null), 1, null);
                JNIActivityViewModel jNIActivityViewModel30 = JNIActivityViewModel.this;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{deferredAsyncOnIO$default, deferredAsyncOnIO$default2, deferredAsyncOnIO$default3, deferredAsyncOnIO$default4, deferredAsyncOnIO$default5, deferredAsyncOnIO$default6, deferredAsyncOnIO$default7, deferredAsyncOnIO$default8, deferredAsyncOnIO$default9, deferredAsyncOnIO$default10, deferredAsyncOnIO$default11, deferredAsyncOnIO$default12, deferredAsyncOnIO$default13, deferredAsyncOnIO$default14, deferredAsyncOnIO$default15, deferredAsyncOnIO$default16, deferredAsyncOnIO$default17, deferredAsyncOnIO$default18, deferredAsyncOnIO$default19, deferredAsyncOnIO$default20, deferredAsyncOnIO$default21, deferredAsyncOnIO$default22, deferredAsyncOnIO$default23, deferredAsyncOnIO$default24, deferredAsyncOnIO$default25, deferredAsyncOnIO$default26, deferredAsyncOnIO$default27, deferredAsyncOnIO$default28, deferredAsyncOnIO$default29, ViewModelExtensionKt.asyncOnIO$default(jNIActivityViewModel30, null, new JNIActivityViewModel$requestJson$1$deferredTasks$30(jNIActivityViewModel30, this.$countOfErrors, null), 1, null)});
                MutableStateFlow mutableStateFlow = JNIActivityViewModel.this._totalSizeOfRequests;
                i = 2;
                Integer numBoxInt = Boxing.boxInt(listListOf.size() + 2);
                this.L$0 = listListOf;
                this.label = 1;
                Object objEmit = mutableStateFlow.emit(numBoxInt, this);
                coroutine_suspended = coroutine_suspended;
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = listListOf;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = 2;
            }
            this.L$0 = null;
            this.label = i;
            if (AwaitKt.awaitAll(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void requestJson(int countOfErrors) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.coroutineExceptionHandler, null, new C35671(countOfErrors, null), 2, null);
    }

    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.rustoreBillingClientWrapper.onNewIntent(intent);
    }

    public final void getRustoreBillingPurchases() {
        this.rustoreBillingClientWrapper.getRustoreBillingPurchases(this.application);
    }

    public final void setUpdatedServers(@NotNull List<Server> servers) {
        Intrinsics.checkNotNullParameter(servers, "servers");
        this._updatedServers.setValue(servers);
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$onSaveBillingData$1", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$onSaveBillingData$1 */
    /* loaded from: classes3.dex */
    public static final class C35661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C35661(Continuation<? super C35661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return JNIActivityViewModel.this.new C35661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C35661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                JNIActivityViewModel.this.countOfBillingErrors = 0;
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onSaveBillingData() {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C35661(null), 1, null);
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$connectPurchases$1", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$connectPurchases$1 */
    /* loaded from: classes3.dex */
    public static final class C35611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isNeedToShowDonatePackage;
        public final /* synthetic */ boolean $isWithDouble;
        public int label;
        public final /* synthetic */ JNIActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35611(boolean z, boolean z2, JNIActivityViewModel jNIActivityViewModel, Continuation<? super C35611> continuation) {
            super(2, continuation);
            this.$isWithDouble = z;
            this.$isNeedToShowDonatePackage = z2;
            this.this$0 = jNIActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C35611(this.$isWithDouble, this.$isNeedToShowDonatePackage, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C35611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UtilsKt.crashlyticsLog("connectPurchases, buildVariant site isWithDouble=" + this.$isWithDouble + ", isNeedToShowDonatePackage=" + this.$isNeedToShowDonatePackage, LogTagConstants.MARKET_BILLING_TAG);
            if (UtilsKt.isMarketBuildVariant() && this.$isNeedToShowDonatePackage) {
                this.this$0.displayProducts(this.$isWithDouble);
            }
            if (UtilsKt.isRustoreBuildVariant() && this.$isNeedToShowDonatePackage) {
                this.this$0.displayRustoreProducts(this.$isWithDouble);
            }
            return Unit.INSTANCE;
        }
    }

    public final void connectPurchases(boolean isWithDouble, boolean isNeedToShowDonatePackage) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C35611(isWithDouble, isNeedToShowDonatePackage, this, null), 1, null);
    }

    public final void getRustoreBillingPurchasesWithoutRequirementAuthorization() {
        this.rustoreBillingClientWrapper.getRustoreBillingPurchasesWithoutRequirementAuthorization(this.application);
    }

    public final void reconnectPurchases() {
        this.billingClientWrapper.initBillingClient();
    }

    public final void clearTuneItemStatus() {
        List<TuneObj> tuneObjItemsFromJson = this._configurationJsons.getValue().getTuneObjItemsFromJson();
        List<TuneVinylsObj> tuneVinylsObjFromJson = getConfigurationJsons().getValue().getTuneVinylsObjFromJson();
        List<TuneObj> list = tuneObjItemsFromJson;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TuneObj tuneObj : list) {
            arrayList.add(tuneObj.copy((255 & 1) != 0 ? tuneObj.id : 0, (255 & 2) != 0 ? tuneObj.type : 0, (255 & 4) != 0 ? tuneObj.selector : 0, (255 & 8) != 0 ? tuneObj.tuneId : 0, (255 & 16) != 0 ? tuneObj.name : null, (255 & 32) != 0 ? tuneObj.imageId : null, (255 & 64) != 0 ? tuneObj.currency : 0, (255 & 128) != 0 ? tuneObj.def : 0, (255 & 256) != 0 ? tuneObj.cost : 0, (255 & 512) != 0 ? tuneObj.thisLocation : 0, (255 & 1024) != 0 ? tuneObj.isChecked : false));
        }
        List<TuneVinylsObj> list2 = tuneVinylsObjFromJson;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TuneVinylsObj tuneVinylsObj : list2) {
            tuneVinylsObj.setSelected(false);
            tuneVinylsObj.setStartVinyl(false);
            arrayList2.add(tuneVinylsObj);
        }
        MutableStateFlow<ConfigurationJsonModel> mutableStateFlow = this._configurationJsons;
        while (true) {
            ConfigurationJsonModel value = mutableStateFlow.getValue();
            ConfigurationJsonModel configurationJsonModel = value;
            ArrayList arrayList3 = arrayList;
            if (mutableStateFlow.compareAndSet(value, configurationJsonModel.copy((402653183 & 1) != 0 ? configurationJsonModel.invItemsFromJson : null, (402653183 & 2) != 0 ? configurationJsonModel.skinsFromJson : null, (402653183 & 4) != 0 ? configurationJsonModel.vehiclesFromJson : null, (402653183 & 8) != 0 ? configurationJsonModel.socialInteractionsFromJson : null, (402653183 & 16) != 0 ? configurationJsonModel.familySystemListFromJson : null, (402653183 & 32) != 0 ? configurationJsonModel.calendarModel : null, (402653183 & 64) != 0 ? configurationJsonModel.bpRewardsModel : null, (402653183 & 128) != 0 ? configurationJsonModel.craftItemsModel : null, (402653183 & 256) != 0 ? configurationJsonModel.craftCategoriesModel : null, (402653183 & 512) != 0 ? configurationJsonModel.craftCategoriesFilterModel : null, (402653183 & 1024) != 0 ? configurationJsonModel.marketplaceCategoriesFilterModel : null, (402653183 & 2048) != 0 ? configurationJsonModel.marketplaceDeliveryFilterModel : null, (402653183 & 4096) != 0 ? configurationJsonModel.tanpinBannerModel : null, (402653183 & 8192) != 0 ? configurationJsonModel.videoPlayerModel : null, (402653183 & 16384) != 0 ? configurationJsonModel.marketplaceConfigurationViewModel : null, (402653183 & 32768) != 0 ? configurationJsonModel.holidayEvents : null, (402653183 & 65536) != 0 ? configurationJsonModel.casesModel : null, (402653183 & 131072) != 0 ? configurationJsonModel.buttonConfig : null, (402653183 & 262144) != 0 ? configurationJsonModel.fractionDocuments : null, (402653183 & 524288) != 0 ? configurationJsonModel.fractionShopList : null, (402653183 & 1048576) != 0 ? configurationJsonModel.fractionQuestsObj : null, (402653183 & 2097152) != 0 ? configurationJsonModel.productDetailsState : null, (402653183 & 4194304) != 0 ? configurationJsonModel.donateItemsFromJson : null, (402653183 & 8388608) != 0 ? configurationJsonModel.carColorItems : null, (402653183 & 16777216) != 0 ? configurationJsonModel.blackPassItemsFromJson : null, (402653183 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? configurationJsonModel.smiListFromJson : null, (402653183 & 67108864) != 0 ? configurationJsonModel.smiEditorBodyFromJson : null, (402653183 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? configurationJsonModel.tuneObjItemsFromJson : arrayList3, (402653183 & 268435456) != 0 ? configurationJsonModel.tuneGuiScreensFromJsonObj : null, (402653183 & 536870912) != 0 ? configurationJsonModel.tuneVinylsObjFromJson : arrayList2))) {
                return;
            } else {
                arrayList = arrayList3;
            }
        }
    }

    public final void turnOnTheSound(@RawRes int soundId) {
        this._audioFile.setValue(Integer.valueOf(soundId));
    }

    public final void turnOffTheSound() {
        this._audioFile.setValue(0);
    }

    public final void showReview() {
        this._isNeedToShowReview.setValue(Boolean.TRUE);
    }

    public final void displayRustoreProducts(final boolean isWithDouble) {
        ProductsUseCase products;
        Task<List<Product>> products2;
        Task<List<Product>> taskAddOnSuccessListener;
        List<BillingItem> billingObj = BillingInfo.INSTANCE.getBillingObj();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(billingObj, 10));
        Iterator<T> it = billingObj.iterator();
        while (it.hasNext()) {
            arrayList.add(((BillingItem) it.next()).getProductId());
        }
        RuStoreBillingClient billingClient = this.rustoreBillingClientWrapper.getBillingClient();
        if (billingClient == null || (products = billingClient.getProducts()) == null || (products2 = products.getProducts(arrayList)) == null || (taskAddOnSuccessListener = products2.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                JNIActivityViewModel.displayRustoreProducts$lambda$11(this.f$0, isWithDouble, (List) obj);
            }
        })) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                JNIActivityViewModel.displayRustoreProducts$lambda$12(th);
            }
        });
    }

    public static final void displayRustoreProducts$lambda$11(JNIActivityViewModel this$0, boolean z, List products) {
        RustoreProductDetailsItem rustoreProductDetailsItem;
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(products, "products");
        List<BillingItem> billingObj = BillingInfo.INSTANCE.getBillingObj();
        ArrayList arrayList = new ArrayList();
        for (BillingItem billingItem : billingObj) {
            Iterator it = products.iterator();
            while (true) {
                rustoreProductDetailsItem = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(billingItem.getProductId(), ((Product) next).getProductId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Product product = (Product) next;
            if (product != null) {
                int iActualPrice = billingItem.actualPrice(z);
                String strValueOfSale = billingItem.valueOfSale(z);
                boolean z2 = billingItem.getOldPrice() != iActualPrice;
                String title = product.getTitle();
                String str = title == null ? "" : title;
                String priceLabel = product.getPriceLabel();
                String str2 = priceLabel == null ? "" : priceLabel;
                String description = product.getDescription();
                rustoreProductDetailsItem = new RustoreProductDetailsItem(product, new DonateDepositCoinsItemModel(str, str2, description == null ? "" : description, billingItem.getOldPrice(), iActualPrice, z2, strValueOfSale));
            }
            if (rustoreProductDetailsItem != null) {
                arrayList.add(rustoreProductDetailsItem);
            }
        }
        this$0._rustoreProductDetailsState.tryEmit(CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$displayRustoreProducts$lambda$11$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((RustoreProductDetailsItem) t).getProduct().getPrice(), ((RustoreProductDetailsItem) t2).getProduct().getPrice());
            }
        }));
    }

    public static final void displayRustoreProducts$lambda$12(Throwable thowable) {
        Intrinsics.checkNotNullParameter(thowable, "thowable");
        UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.displayProducts, " + thowable, LogTagConstants.MARKET_BILLING_TAG);
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, m7105d2 = {"com/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel$displayProducts$1", "Lcom/blackhub/bronline/game/core/utils/payment/OnQueryProductsListener;", "onFailure", "", "billingError", "Lcom/blackhub/bronline/game/core/utils/payment/BillingError;", "onSuccess", "products", "", "Lcom/android/billingclient/api/ProductDetails;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$displayProducts$1 */
    public static final class C35621 implements OnQueryProductsListener {
        public final /* synthetic */ boolean $isWithDouble;

        public C35621(boolean z) {
            z = z;
        }

        @Override // com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener
        public void onSuccess(@NotNull List<ProductDetails> products) {
            Intrinsics.checkNotNullParameter(products, "products");
            JNIActivityViewModel.this.setProductDetails(products, z);
        }

        @Override // com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener
        public void onFailure(@NotNull BillingError billingError) {
            Intrinsics.checkNotNullParameter(billingError, "billingError");
            UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.displayProducts, responseCode=" + billingError.getResponseCode() + ", message=" + billingError.getDebugMessage(), LogTagConstants.MARKET_BILLING_TAG);
        }
    }

    public final void displayProducts(boolean isWithDouble) {
        this.billingClientWrapper.queryProducts(new OnQueryProductsListener() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel.displayProducts.1
            public final /* synthetic */ boolean $isWithDouble;

            public C35621(boolean isWithDouble2) {
                z = isWithDouble2;
            }

            @Override // com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener
            public void onSuccess(@NotNull List<ProductDetails> products) {
                Intrinsics.checkNotNullParameter(products, "products");
                JNIActivityViewModel.this.setProductDetails(products, z);
            }

            @Override // com.blackhub.bronline.game.core.utils.payment.OnQueryProductsListener
            public void onFailure(@NotNull BillingError billingError) {
                Intrinsics.checkNotNullParameter(billingError, "billingError");
                UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.displayProducts, responseCode=" + billingError.getResponseCode() + ", message=" + billingError.getDebugMessage(), LogTagConstants.MARKET_BILLING_TAG);
            }
        });
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$setProductDetails$1", m7120f = "JNIActivityViewModel.kt", m7121i = {}, m7122l = {743}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nJNIActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel$setProductDetails$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1087:1\n1549#2:1088\n1620#2,2:1089\n288#2,2:1091\n1622#2:1093\n1045#2:1094\n*S KotlinDebug\n*F\n+ 1 JNIActivityViewModel.kt\ncom/blackhub/bronline/game/core/viewmodel/JNIActivityViewModel$setProductDetails$1\n*L\n722#1:1088\n722#1:1089,2\n724#1:1091,2\n722#1:1093\n742#1:1094\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$setProductDetails$1 */
    public static final class C36891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isWithDouble;
        public final /* synthetic */ List<ProductDetails> $products;
        public int label;
        public final /* synthetic */ JNIActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36891(List<ProductDetails> list, JNIActivityViewModel jNIActivityViewModel, boolean z, Continuation<? super C36891> continuation) {
            super(2, continuation);
            this.$products = list;
            this.this$0 = jNIActivityViewModel;
            this.$isWithDouble = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C36891(this.$products, this.this$0, this.$isWithDouble, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C36891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object next;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<ProductDetails> list = this.$products;
                boolean z = this.$isWithDouble;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (ProductDetails productDetails : list) {
                    Iterator<T> it = BillingInfo.INSTANCE.getBillingObj().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((BillingItem) next).getProductId(), productDetails.getProductId())) {
                            break;
                        }
                    }
                    BillingItem billingItem = (BillingItem) next;
                    if (billingItem == null) {
                        billingItem = new BillingItem(null, 0, 0, null, 0, 31, null);
                    }
                    int iActualPrice = billingItem.actualPrice(z);
                    String strValueOfSale = billingItem.valueOfSale(z);
                    boolean z2 = billingItem.getOldPrice() != iActualPrice;
                    String name = productDetails.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    String formattedPrice = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getFormattedPrice() : null;
                    if (formattedPrice == null) {
                        formattedPrice = "";
                    }
                    String description = productDetails.getDescription();
                    Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
                    arrayList.add(new ProductDetailsItem(productDetails, new DonateDepositCoinsItemModel(name, formattedPrice, description, billingItem.getOldPrice(), iActualPrice, z2, strValueOfSale)));
                }
                List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$setProductDetails$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ProductDetailsItem) t).getModel().getOldPrice()), Integer.valueOf(((ProductDetailsItem) t2).getModel().getOldPrice()));
                    }
                });
                MutableStateFlow mutableStateFlow = this.this$0._productDetailsState;
                this.label = 1;
                if (mutableStateFlow.emit(listSortedWith, this) == coroutine_suspended) {
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

    public final void setProductDetails(List<ProductDetails> products, boolean isWithDouble) {
        ViewModelExtensionKt.launchOnDefault$default(this, null, new C36891(products, this, isWithDouble, null), 1, null);
    }

    public final Object startPurchases(List<BillingPurchaseRequest> list, Continuation<? super Unit> continuation) {
        Object objNewRequest;
        BillingPurchaseRequest billingPurchaseRequest = (BillingPurchaseRequest) CollectionsKt___CollectionsKt.firstOrNull((List) list);
        return (billingPurchaseRequest == null || (objNewRequest = newRequest(getActualProductDetail(billingPurchaseRequest), continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objNewRequest;
    }

    public final Object startRustorePurchases(List<RustoreBillingPurchaseRequest> list, Continuation<? super Unit> continuation) {
        Object objNewRustoreRequest;
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest = (RustoreBillingPurchaseRequest) CollectionsKt___CollectionsKt.firstOrNull((List) list);
        return (rustoreBillingPurchaseRequest == null || (objNewRustoreRequest = newRustoreRequest(getActualRustoreProductDetail(rustoreBillingPurchaseRequest), continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objNewRustoreRequest;
    }

    public final BillingPurchaseRequest getActualProductDetail(BillingPurchaseRequest purchaseRequest) {
        Object next;
        List<BillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseDao().getAllPurchases();
        Iterator<T> it = allPurchases.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((BillingPurchaseRequest) next).getSystemPaymentId(), purchaseRequest.getSystemPaymentId())) {
                break;
            }
        }
        BillingPurchaseRequest billingPurchaseRequest = (BillingPurchaseRequest) next;
        UtilsKt.crashlyticsLog("funName=getActualProductDetail, oldDatabase.size=" + allPurchases.size() + ", purchaseFromDb=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
        return billingPurchaseRequest == null ? purchaseRequest : billingPurchaseRequest;
    }

    public final RustoreBillingPurchaseRequest getActualRustoreProductDetail(RustoreBillingPurchaseRequest purchaseRequest) {
        Object next;
        List<RustoreBillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseRustoreDao().getAllPurchases();
        Iterator<T> it = allPurchases.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((RustoreBillingPurchaseRequest) next).getPurchaseId(), purchaseRequest.getPurchaseId())) {
                break;
            }
        }
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest = (RustoreBillingPurchaseRequest) next;
        UtilsKt.crashlyticsLog("funName=getActualProductDetail, oldDatabase.size=" + allPurchases.size() + ", purchaseFromDb=" + rustoreBillingPurchaseRequest, LogTagConstants.RUSTORE_BILLING_TAG);
        return rustoreBillingPurchaseRequest == null ? purchaseRequest : rustoreBillingPurchaseRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9 A[Catch: Exception -> 0x0058, UnknownHostException -> 0x005c, TryCatch #4 {UnknownHostException -> 0x005c, Exception -> 0x0058, blocks: (B:100:0x0053, B:142:0x0138, B:107:0x0068, B:121:0x00a1, B:123:0x00a9, B:124:0x00c6, B:126:0x00cc, B:128:0x00d2, B:130:0x0100, B:135:0x010d, B:136:0x011a, B:138:0x0121, B:139:0x0129), top: B:153:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00c6 A[Catch: Exception -> 0x0058, UnknownHostException -> 0x005c, TryCatch #4 {UnknownHostException -> 0x005c, Exception -> 0x0058, blocks: (B:100:0x0053, B:142:0x0138, B:107:0x0068, B:121:0x00a1, B:123:0x00a9, B:124:0x00c6, B:126:0x00cc, B:128:0x00d2, B:130:0x0100, B:135:0x010d, B:136:0x011a, B:138:0x0121, B:139:0x0129), top: B:153:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object newRequest(BillingPurchaseRequest billingPurchaseRequest, Continuation<? super Unit> continuation) throws Throwable {
        C35641 c35641;
        JNIActivityViewModel jNIActivityViewModel;
        JNIActivityViewModel jNIActivityViewModel2;
        Response response;
        int iCode;
        if (continuation instanceof C35641) {
            c35641 = (C35641) continuation;
            int i = c35641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35641.label = i - Integer.MIN_VALUE;
            } else {
                c35641 = new C35641(continuation);
            }
        }
        Object objSendBillingPostRequest = c35641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c35641.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(objSendBillingPostRequest);
                try {
                    if (IntExtensionKt.isZero(Boxing.boxInt(billingPurchaseRequest.getAccountId()))) {
                        billingPurchaseRequest.setAccountId(Preferences.getInteger(this.application, Preferences.USER_ACCOUNT_ID));
                    }
                    PaymentApi paymentApi = this.billingAPI;
                    c35641.L$0 = this;
                    c35641.L$1 = billingPurchaseRequest;
                    c35641.label = 1;
                    objSendBillingPostRequest = paymentApi.sendBillingPostRequest(billingPurchaseRequest, c35641);
                    if (objSendBillingPostRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jNIActivityViewModel2 = this;
                    response = (Response) objSendBillingPostRequest;
                    if (!response.isSuccessful()) {
                    }
                } catch (UnknownHostException e) {
                    e = e;
                    jNIActivityViewModel = this;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, UnknownHostException=" + e + ", paymentRequest=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    e = e2;
                    jNIActivityViewModel = this;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, Exception=" + e + ", paymentRequest=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                }
            } else if (r2 == 1) {
                billingPurchaseRequest = (BillingPurchaseRequest) c35641.L$1;
                jNIActivityViewModel2 = (JNIActivityViewModel) c35641.L$0;
                ResultKt.throwOnFailure(objSendBillingPostRequest);
                response = (Response) objSendBillingPostRequest;
                if (!response.isSuccessful()) {
                    jNIActivityViewModel2.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsLog("funName=JNIActivityViewModel.newRequest, response.isSuccessful, paymentRequest=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel2.billingClientWrapper.deleteRequestAfterSuccessOrError();
                } else {
                    ResponseBody responseBodyErrorBody = response.errorBody();
                    String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, errorBody=" + strString + ", code=" + response.code() + ", paymentRequest=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
                    if (response.code() == 408 || (500 <= (iCode = response.code()) && iCode < 600)) {
                        int i2 = jNIActivityViewModel2.countOfBillingErrors + 1;
                        jNIActivityViewModel2.countOfBillingErrors = i2;
                        if (i2 >= 3) {
                            jNIActivityViewModel2.countOfBillingErrors = 0;
                            jNIActivityViewModel2.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                        } else {
                            c35641.L$0 = jNIActivityViewModel2;
                            c35641.L$1 = billingPurchaseRequest;
                            c35641.label = 2;
                            if (DelayKt.delay(30000L, c35641) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c35641.L$0 = jNIActivityViewModel2;
                            c35641.L$1 = billingPurchaseRequest;
                            c35641.label = 3;
                            if (jNIActivityViewModel2.newRequest(billingPurchaseRequest, c35641) == coroutine_suspended) {
                            }
                        }
                    } else {
                        jNIActivityViewModel2.countOfBillingErrors = 0;
                        jNIActivityViewModel2.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                        jNIActivityViewModel2.billingClientWrapper.deleteRequestAfterSuccessOrError();
                    }
                }
            } else if (r2 == 2) {
                billingPurchaseRequest = (BillingPurchaseRequest) c35641.L$1;
                jNIActivityViewModel2 = (JNIActivityViewModel) c35641.L$0;
                ResultKt.throwOnFailure(objSendBillingPostRequest);
                c35641.L$0 = jNIActivityViewModel2;
                c35641.L$1 = billingPurchaseRequest;
                c35641.label = 3;
                if (jNIActivityViewModel2.newRequest(billingPurchaseRequest, c35641) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                billingPurchaseRequest = (BillingPurchaseRequest) c35641.L$1;
                jNIActivityViewModel = (JNIActivityViewModel) c35641.L$0;
                try {
                    ResultKt.throwOnFailure(objSendBillingPostRequest);
                } catch (UnknownHostException e3) {
                    e = e3;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, UnknownHostException=" + e + ", paymentRequest=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                } catch (Exception e4) {
                    e = e4;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, Exception=" + e + ", paymentRequest=" + billingPurchaseRequest, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                }
            }
        } catch (UnknownHostException e5) {
            e = e5;
            jNIActivityViewModel = r2;
        } catch (Exception e6) {
            e = e6;
            jNIActivityViewModel = r2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00b1 A[Catch: Exception -> 0x005e, UnknownHostException -> 0x0062, TRY_ENTER, TryCatch #5 {UnknownHostException -> 0x0062, Exception -> 0x005e, blocks: (B:97:0x0059, B:136:0x0170, B:104:0x006e, B:118:0x00a7, B:121:0x00b1, B:122:0x00e8, B:124:0x011a, B:129:0x0127, B:130:0x014e, B:132:0x0155, B:133:0x0160), top: B:145:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e8 A[Catch: Exception -> 0x005e, UnknownHostException -> 0x0062, TryCatch #5 {UnknownHostException -> 0x0062, Exception -> 0x005e, blocks: (B:97:0x0059, B:136:0x0170, B:104:0x006e, B:118:0x00a7, B:121:0x00b1, B:122:0x00e8, B:124:0x011a, B:129:0x0127, B:130:0x014e, B:132:0x0155, B:133:0x0160), top: B:145:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object newRustoreRequest(RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest, Continuation<? super Unit> continuation) throws Throwable {
        C35651 c35651;
        JNIActivityViewModel jNIActivityViewModel;
        JNIActivityViewModel jNIActivityViewModel2;
        Response response;
        int iCode;
        RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest2 = rustoreBillingPurchaseRequest;
        if (continuation instanceof C35651) {
            c35651 = (C35651) continuation;
            int i = c35651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c35651.label = i - Integer.MIN_VALUE;
            } else {
                c35651 = new C35651(continuation);
            }
        }
        Object objSendRustoreBillingPostRequest = c35651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = c35651.label;
        try {
            if (r5 == 0) {
                ResultKt.throwOnFailure(objSendRustoreBillingPostRequest);
                try {
                    if (IntExtensionKt.isZero(Boxing.boxInt(rustoreBillingPurchaseRequest.getAccountId()))) {
                        rustoreBillingPurchaseRequest2.setAccountId(Preferences.getInteger(this.application, Preferences.USER_ACCOUNT_ID));
                    }
                    PaymentApi paymentApi = this.billingAPI;
                    c35651.L$0 = this;
                    c35651.L$1 = rustoreBillingPurchaseRequest2;
                    c35651.label = 1;
                    objSendRustoreBillingPostRequest = paymentApi.sendRustoreBillingPostRequest(rustoreBillingPurchaseRequest2, c35651);
                    if (objSendRustoreBillingPostRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jNIActivityViewModel2 = this;
                    response = (Response) objSendRustoreBillingPostRequest;
                    if (!response.isSuccessful()) {
                    }
                } catch (UnknownHostException e) {
                    e = e;
                    jNIActivityViewModel = this;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, UnknownHostException=" + e + ", paymentRequest=" + rustoreBillingPurchaseRequest2, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    e = e2;
                    jNIActivityViewModel = this;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, Exception=" + e + ", paymentRequest=" + rustoreBillingPurchaseRequest2, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                }
            } else if (r5 == 1) {
                rustoreBillingPurchaseRequest2 = (RustoreBillingPurchaseRequest) c35651.L$1;
                jNIActivityViewModel2 = (JNIActivityViewModel) c35651.L$0;
                ResultKt.throwOnFailure(objSendRustoreBillingPostRequest);
                response = (Response) objSendRustoreBillingPostRequest;
                if (!response.isSuccessful()) {
                    jNIActivityViewModel2.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsLog("funName=JNIActivityViewModel.newRequest, response.isSuccessful, paymentRequest=" + rustoreBillingPurchaseRequest2, LogTagConstants.RUSTORE_BILLING_TAG);
                    jNIActivityViewModel2.rustoreBillingClientWrapper.deleteRequestAfterSuccessOrError(rustoreBillingPurchaseRequest2.getPurchaseId());
                    jNIActivityViewModel2.purchaseDatabase.purchaseRustoreDao().deletePurchaseByToken(rustoreBillingPurchaseRequest2.getPurchaseId());
                    jNIActivityViewModel2.rustoreBillingClientWrapper.confirmPurchase(rustoreBillingPurchaseRequest2.getPurchaseId());
                } else {
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, errorBody=" + response.errorBody() + ", code=" + response.code() + ", paymentRequest=" + rustoreBillingPurchaseRequest2, LogTagConstants.RUSTORE_BILLING_TAG);
                    if (response.code() == 408 || (500 <= (iCode = response.code()) && iCode < 600)) {
                        int i2 = jNIActivityViewModel2.countOfBillingErrors + 1;
                        jNIActivityViewModel2.countOfBillingErrors = i2;
                        if (i2 >= 3) {
                            jNIActivityViewModel2.countOfBillingErrors = 0;
                            jNIActivityViewModel2.updateRustorePurchaseDatabase();
                            jNIActivityViewModel2.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                        } else {
                            c35651.L$0 = jNIActivityViewModel2;
                            c35651.L$1 = rustoreBillingPurchaseRequest2;
                            c35651.label = 2;
                            if (DelayKt.delay(30000L, c35651) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c35651.L$0 = jNIActivityViewModel2;
                            c35651.L$1 = rustoreBillingPurchaseRequest2;
                            c35651.label = 3;
                            if (jNIActivityViewModel2.newRustoreRequest(rustoreBillingPurchaseRequest2, c35651) == coroutine_suspended) {
                            }
                        }
                    } else {
                        jNIActivityViewModel2.countOfBillingErrors = 0;
                        jNIActivityViewModel2.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                        jNIActivityViewModel2.rustoreBillingClientWrapper.deleteRequestAfterSuccessOrError(rustoreBillingPurchaseRequest2.getPurchaseId());
                        jNIActivityViewModel2.purchaseDatabase.purchaseRustoreDao().deletePurchaseByToken(rustoreBillingPurchaseRequest2.getPurchaseId());
                        jNIActivityViewModel2.rustoreBillingClientWrapper.deletePurchase(rustoreBillingPurchaseRequest2.getPurchaseId());
                    }
                }
            } else if (r5 == 2) {
                rustoreBillingPurchaseRequest2 = (RustoreBillingPurchaseRequest) c35651.L$1;
                jNIActivityViewModel2 = (JNIActivityViewModel) c35651.L$0;
                ResultKt.throwOnFailure(objSendRustoreBillingPostRequest);
                c35651.L$0 = jNIActivityViewModel2;
                c35651.L$1 = rustoreBillingPurchaseRequest2;
                c35651.label = 3;
                if (jNIActivityViewModel2.newRustoreRequest(rustoreBillingPurchaseRequest2, c35651) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rustoreBillingPurchaseRequest2 = (RustoreBillingPurchaseRequest) c35651.L$1;
                jNIActivityViewModel = (JNIActivityViewModel) c35651.L$0;
                try {
                    ResultKt.throwOnFailure(objSendRustoreBillingPostRequest);
                } catch (UnknownHostException e3) {
                    e = e3;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, UnknownHostException=" + e + ", paymentRequest=" + rustoreBillingPurchaseRequest2, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                } catch (Exception e4) {
                    e = e4;
                    jNIActivityViewModel.countOfBillingErrors = 0;
                    UtilsKt.crashlyticsRecordNewException("funName=JNIActivityViewModel.newRequest, Exception=" + e + ", paymentRequest=" + rustoreBillingPurchaseRequest2, LogTagConstants.MARKET_BILLING_TAG);
                    jNIActivityViewModel.actionWithJson.isNeedInformingServerAndOpenErrorDialog();
                    return Unit.INSTANCE;
                }
            }
        } catch (UnknownHostException e5) {
            e = e5;
            jNIActivityViewModel = r5;
        } catch (Exception e6) {
            e = e6;
            jNIActivityViewModel = r5;
        }
        return Unit.INSTANCE;
    }

    public final void updatePurchaseDatabase() {
        Object next;
        List<BillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseDao().getAllPurchases();
        ArrayList arrayList = new ArrayList();
        for (BillingPurchaseRequest billingPurchaseRequest : this.billingClientWrapper.getUnconfirmedPayment().getValue()) {
            Iterator<T> it = allPurchases.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((BillingPurchaseRequest) next).getSystemPaymentId(), billingPurchaseRequest.getSystemPaymentId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BillingPurchaseRequest billingPurchaseRequest2 = (BillingPurchaseRequest) next;
            if (billingPurchaseRequest2 == null) {
                arrayList.add(billingPurchaseRequest);
            } else {
                arrayList.add(billingPurchaseRequest2);
            }
        }
        UtilsKt.crashlyticsLog("funName=updatePurchaseDatabase: size=" + arrayList.size());
        this.purchaseDatabase.purchaseDao().insertAll(arrayList);
    }

    public final void updateRustorePurchaseDatabase() {
        Object next;
        List<RustoreBillingPurchaseRequest> allPurchases = this.purchaseDatabase.purchaseRustoreDao().getAllPurchases();
        ArrayList arrayList = new ArrayList();
        for (RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest : this.rustoreBillingClientWrapper.getUnconfirmedPayment().getValue()) {
            Iterator<T> it = allPurchases.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((RustoreBillingPurchaseRequest) next).getPurchaseId(), rustoreBillingPurchaseRequest.getPurchaseId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            RustoreBillingPurchaseRequest rustoreBillingPurchaseRequest2 = (RustoreBillingPurchaseRequest) next;
            if (rustoreBillingPurchaseRequest2 == null) {
                arrayList.add(rustoreBillingPurchaseRequest);
            } else {
                arrayList.add(rustoreBillingPurchaseRequest2);
            }
        }
        UtilsKt.crashlyticsLog("funName=updateRustorePurchaseDatabase: size=" + arrayList.size());
        this.purchaseDatabase.purchaseRustoreDao().insertAll(arrayList);
    }

    /* compiled from: JNIActivityViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$fetchData$2 */
    public static final class C35632 extends Lambda implements Function0<Unit> {
        public static final C35632 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object fetchData$default(JNIActivityViewModel jNIActivityViewModel, Function1 function1, Function1 function12, Function2 function2, Function0 function0, int i, int i2, int i3, long j, Continuation continuation, int i4, Object obj) {
        return jNIActivityViewModel.fetchData(function1, function12, function2, (i4 & 8) != 0 ? C35632.INSTANCE : function0, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? 3 : i2, (i4 & 64) != 0 ? 6 : i3, (i4 & 128) != 0 ? 3000L : j, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e1 A[PHI: r1 r2 r3 r4 r5 r6 r8 r10 r11 r12 r13 r14 r15
  0x01e1: PHI (r1v10 com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$fetchData$retry$1) = 
  (r1v13 com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$fetchData$retry$1)
  (r1v2 com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel$fetchData$retry$1)
 binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r2v4 java.lang.Object) = (r2v6 java.lang.Object), (r2v0 java.lang.Object) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r3v4 int) = (r3v7 int), (r3v17 int) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r4v4 int) = (r4v8 int), (r4v18 int) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r5v4 int) = (r5v7 int), (r5v17 int) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r6v4 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object>) = 
  (r6v8 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object>)
  (r6v19 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object>)
 binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r8v3 long) = (r8v5 long), (r8v12 long) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r10v3 int) = (r10v7 int), (r10v19 int) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r11v3 retrofit2.Response) = (r11v8 retrofit2.Response), (r11v21 retrofit2.Response) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r12v3 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r12v7 kotlin.jvm.functions.Function0<kotlin.Unit>), (r12v20 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r13v3 com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel) = 
  (r13v7 com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel)
  (r13v21 com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel)
 binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r14v3 kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit>) = 
  (r14v7 kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit>)
  (r14v20 kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit>)
 binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]
  0x01e1: PHI (r15v2 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object>) = 
  (r15v4 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object>)
  (r15v9 kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object>)
 binds: [B:127:0x01b1, B:92:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0015  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x022e -> B:137:0x023e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object fetchData$retry(int i, int i2, Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Function1<? super Continuation<? super Response<T>>, ? extends Object> function12, Function2<? super T, ? super Integer, Unit> function2, JNIActivityViewModel jNIActivityViewModel, long j, int i3, Function0<Unit> function0, int i4, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        JNIActivityViewModel$fetchData$retry$1 jNIActivityViewModel$fetchData$retry$1;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function13;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function14;
        Function2<? super T, ? super Integer, Unit> function22;
        JNIActivityViewModel jNIActivityViewModel2;
        Function0<Unit> function02;
        long j2;
        Response responseError;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function15;
        Function2<? super T, ? super Integer, Unit> function23;
        JNIActivityViewModel jNIActivityViewModel3;
        Function0<Unit> function03;
        Response response;
        int i5;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function16;
        Function0<Unit> function04;
        int i6;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function17;
        JNIActivityViewModel$fetchData$retry$1 jNIActivityViewModel$fetchData$retry$12;
        int i7;
        int i8;
        Function2<? super T, ? super Integer, Unit> function24;
        Function1<? super Continuation<? super Response<T>>, ? extends Object> function18;
        JNIActivityViewModel jNIActivityViewModel4;
        ?? r13;
        if (continuation instanceof JNIActivityViewModel$fetchData$retry$1) {
            jNIActivityViewModel$fetchData$retry$1 = (JNIActivityViewModel$fetchData$retry$1) continuation;
            int i9 = jNIActivityViewModel$fetchData$retry$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                jNIActivityViewModel$fetchData$retry$1.label = i9 - Integer.MIN_VALUE;
            } else {
                jNIActivityViewModel$fetchData$retry$1 = new JNIActivityViewModel$fetchData$retry$1(continuation);
            }
        }
        Object objInvoke = jNIActivityViewModel$fetchData$retry$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = jNIActivityViewModel$fetchData$retry$1.label;
        int i11 = 4;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i10 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            function18 = function1;
            function17 = function12;
            function24 = function2;
            jNIActivityViewModel4 = jNIActivityViewModel;
            j2 = j;
            i8 = i3;
            function04 = function0;
            i6 = i4;
            r13 = z;
            jNIActivityViewModel$fetchData$retry$12 = jNIActivityViewModel$fetchData$retry$1;
            i7 = i2;
            if (r13 != 0) {
            }
            JNIActivityViewModel jNIActivityViewModel5 = jNIActivityViewModel4;
            i13 = i7;
            jNIActivityViewModel$fetchData$retry$1 = jNIActivityViewModel$fetchData$retry$12;
            function13 = function18;
            i10 = r13;
            function14 = function17;
            i11 = i6;
            function22 = function24;
            i12 = i8;
            function02 = function04;
            jNIActivityViewModel2 = jNIActivityViewModel5;
            responseError = Response.error(405, ResponseBody.INSTANCE.create(e.toString(), MediaType.INSTANCE.get("application/json")));
            jNIActivityViewModel$fetchData$retry$1 = jNIActivityViewModel$fetchData$retry$1;
            function15 = function14;
            jNIActivityViewModel3 = jNIActivityViewModel2;
            response = responseError;
            Function0<Unit> function05 = function02;
            i5 = i13;
            function16 = function13;
            function23 = function22;
            function03 = function05;
            Object obj = (Object) response.body();
            if (!response.isSuccessful()) {
            }
            if (jNIActivityViewModel3._isFailedRequest.getValue().booleanValue()) {
            }
            i = 1;
            int i15 = i11 + 1;
            UtilsKt.crashlyticsRecordNewException("ERROR " + response.raw() + " countOfErrors " + i15 + " " + function15);
            jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
            jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
            jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
            jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
            jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
            jNIActivityViewModel$fetchData$retry$1.L$5 = null;
            jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
            jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
            jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
            jNIActivityViewModel$fetchData$retry$1.I$2 = i10;
            jNIActivityViewModel$fetchData$retry$1.I$3 = i15;
            jNIActivityViewModel$fetchData$retry$1.label = 4;
            if (DelayKt.delay(j2, jNIActivityViewModel$fetchData$retry$1) == coroutine_suspended) {
            }
        } else if (i10 == 1) {
            i10 = jNIActivityViewModel$fetchData$retry$1.I$3;
            i11 = jNIActivityViewModel$fetchData$retry$1.I$2;
            i12 = jNIActivityViewModel$fetchData$retry$1.I$1;
            j2 = jNIActivityViewModel$fetchData$retry$1.J$0;
            i13 = jNIActivityViewModel$fetchData$retry$1.I$0;
            function02 = (Function0) jNIActivityViewModel$fetchData$retry$1.L$4;
            jNIActivityViewModel2 = (JNIActivityViewModel) jNIActivityViewModel$fetchData$retry$1.L$3;
            function22 = (Function2) jNIActivityViewModel$fetchData$retry$1.L$2;
            function14 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$1;
            function13 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            responseError = (Response) objInvoke;
            function15 = function14;
            jNIActivityViewModel3 = jNIActivityViewModel2;
            response = responseError;
            Function0<Unit> function052 = function02;
            i5 = i13;
            function16 = function13;
            function23 = function22;
            function03 = function052;
            Object obj2 = (Object) response.body();
            if (!response.isSuccessful()) {
            }
            if (jNIActivityViewModel3._isFailedRequest.getValue().booleanValue()) {
            }
            i = 1;
            int i152 = i11 + 1;
            UtilsKt.crashlyticsRecordNewException("ERROR " + response.raw() + " countOfErrors " + i152 + " " + function15);
            jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
            jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
            jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
            jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
            jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
            jNIActivityViewModel$fetchData$retry$1.L$5 = null;
            jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
            jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
            jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
            jNIActivityViewModel$fetchData$retry$1.I$2 = i10;
            jNIActivityViewModel$fetchData$retry$1.I$3 = i152;
            jNIActivityViewModel$fetchData$retry$1.label = 4;
            if (DelayKt.delay(j2, jNIActivityViewModel$fetchData$retry$1) == coroutine_suspended) {
            }
        } else if (i10 == 2) {
            i10 = jNIActivityViewModel$fetchData$retry$1.I$3;
            i11 = jNIActivityViewModel$fetchData$retry$1.I$2;
            i12 = jNIActivityViewModel$fetchData$retry$1.I$1;
            j2 = jNIActivityViewModel$fetchData$retry$1.J$0;
            i13 = jNIActivityViewModel$fetchData$retry$1.I$0;
            function02 = (Function0) jNIActivityViewModel$fetchData$retry$1.L$4;
            jNIActivityViewModel2 = (JNIActivityViewModel) jNIActivityViewModel$fetchData$retry$1.L$3;
            function22 = (Function2) jNIActivityViewModel$fetchData$retry$1.L$2;
            function14 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$1;
            function13 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            responseError = (Response) objInvoke;
            function15 = function14;
            jNIActivityViewModel3 = jNIActivityViewModel2;
            response = responseError;
            Function0<Unit> function0522 = function02;
            i5 = i13;
            function16 = function13;
            function23 = function22;
            function03 = function0522;
            Object obj22 = (Object) response.body();
            if (!response.isSuccessful()) {
            }
            if (jNIActivityViewModel3._isFailedRequest.getValue().booleanValue()) {
            }
            i = 1;
            int i1522 = i11 + 1;
            UtilsKt.crashlyticsRecordNewException("ERROR " + response.raw() + " countOfErrors " + i1522 + " " + function15);
            jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
            jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
            jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
            jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
            jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
            jNIActivityViewModel$fetchData$retry$1.L$5 = null;
            jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
            jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
            jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
            jNIActivityViewModel$fetchData$retry$1.I$2 = i10;
            jNIActivityViewModel$fetchData$retry$1.I$3 = i1522;
            jNIActivityViewModel$fetchData$retry$1.label = 4;
            if (DelayKt.delay(j2, jNIActivityViewModel$fetchData$retry$1) == coroutine_suspended) {
            }
        } else if (i10 == 3) {
            i10 = jNIActivityViewModel$fetchData$retry$1.I$3;
            i11 = jNIActivityViewModel$fetchData$retry$1.I$2;
            i12 = jNIActivityViewModel$fetchData$retry$1.I$1;
            j2 = jNIActivityViewModel$fetchData$retry$1.J$0;
            i5 = jNIActivityViewModel$fetchData$retry$1.I$0;
            response = (Response) jNIActivityViewModel$fetchData$retry$1.L$5;
            function03 = (Function0) jNIActivityViewModel$fetchData$retry$1.L$4;
            jNIActivityViewModel3 = (JNIActivityViewModel) jNIActivityViewModel$fetchData$retry$1.L$3;
            function23 = (Function2) jNIActivityViewModel$fetchData$retry$1.L$2;
            function15 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$1;
            function16 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            i = 1;
            int i15222 = i11 + 1;
            UtilsKt.crashlyticsRecordNewException("ERROR " + response.raw() + " countOfErrors " + i15222 + " " + function15);
            jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
            jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
            jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
            jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
            jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
            jNIActivityViewModel$fetchData$retry$1.L$5 = null;
            jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
            jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
            jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
            jNIActivityViewModel$fetchData$retry$1.I$2 = i10;
            jNIActivityViewModel$fetchData$retry$1.I$3 = i15222;
            jNIActivityViewModel$fetchData$retry$1.label = 4;
            if (DelayKt.delay(j2, jNIActivityViewModel$fetchData$retry$1) == coroutine_suspended) {
            }
        } else {
            if (i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = jNIActivityViewModel$fetchData$retry$1.I$3;
            int i17 = jNIActivityViewModel$fetchData$retry$1.I$2;
            int i18 = jNIActivityViewModel$fetchData$retry$1.I$1;
            long j3 = jNIActivityViewModel$fetchData$retry$1.J$0;
            int i19 = jNIActivityViewModel$fetchData$retry$1.I$0;
            Function0<Unit> function06 = (Function0) jNIActivityViewModel$fetchData$retry$1.L$4;
            JNIActivityViewModel jNIActivityViewModel6 = (JNIActivityViewModel) jNIActivityViewModel$fetchData$retry$1.L$3;
            Function2<? super T, ? super Integer, Unit> function25 = (Function2) jNIActivityViewModel$fetchData$retry$1.L$2;
            function17 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$1;
            Function1<? super Continuation<? super Response<T>>, ? extends Object> function19 = (Function1) jNIActivityViewModel$fetchData$retry$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            int i20 = 1;
            jNIActivityViewModel4 = jNIActivityViewModel6;
            jNIActivityViewModel$fetchData$retry$12 = jNIActivityViewModel$fetchData$retry$1;
            i7 = i19;
            i6 = i16;
            function18 = function19;
            function24 = function25;
            int i21 = i17;
            i8 = i18;
            j2 = j3;
            function04 = function06;
            if (i6 < i7) {
                i14 = i20;
                r13 = i21;
            } else {
                if (i6 >= i8) {
                    function04.invoke();
                    return Unit.INSTANCE;
                }
                i14 = i20;
                r13 = i14;
            }
            if (r13 != 0) {
                try {
                } catch (Exception e2) {
                    e = e2;
                }
                jNIActivityViewModel$fetchData$retry$12.L$0 = function18;
                jNIActivityViewModel$fetchData$retry$12.L$1 = function17;
                jNIActivityViewModel$fetchData$retry$12.L$2 = function24;
                jNIActivityViewModel$fetchData$retry$12.L$3 = jNIActivityViewModel4;
                jNIActivityViewModel$fetchData$retry$12.L$4 = function04;
                jNIActivityViewModel$fetchData$retry$12.I$0 = i7;
                jNIActivityViewModel$fetchData$retry$12.J$0 = j2;
                jNIActivityViewModel$fetchData$retry$12.I$1 = i8;
                jNIActivityViewModel$fetchData$retry$12.I$2 = i6;
                jNIActivityViewModel$fetchData$retry$12.I$3 = r13;
                jNIActivityViewModel$fetchData$retry$12.label = i14;
                objInvoke = function18.invoke(jNIActivityViewModel$fetchData$retry$12);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                JNIActivityViewModel jNIActivityViewModel7 = jNIActivityViewModel4;
                i13 = i7;
                jNIActivityViewModel$fetchData$retry$1 = jNIActivityViewModel$fetchData$retry$12;
                function13 = function18;
                i10 = r13;
                function14 = function17;
                i11 = i6;
                function22 = function24;
                i12 = i8;
                function02 = function04;
                jNIActivityViewModel2 = jNIActivityViewModel7;
                responseError = (Response) objInvoke;
                function15 = function14;
                jNIActivityViewModel3 = jNIActivityViewModel2;
                response = responseError;
                Function0<Unit> function05222 = function02;
                i5 = i13;
                function16 = function13;
                function23 = function22;
                function03 = function05222;
                Object obj222 = (Object) response.body();
                if (!response.isSuccessful() && obj222 != null) {
                    function23.invoke(obj222, Boxing.boxInt(i11));
                    jNIActivityViewModel3.updateProgress();
                    return Unit.INSTANCE;
                }
                if (jNIActivityViewModel3._isFailedRequest.getValue().booleanValue()) {
                    MutableStateFlow<Boolean> mutableStateFlow = jNIActivityViewModel3._isFailedRequest;
                    Object obj3 = coroutine_suspended;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
                    jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
                    jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
                    jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
                    jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
                    jNIActivityViewModel$fetchData$retry$1.L$5 = response;
                    jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
                    jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
                    jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
                    jNIActivityViewModel$fetchData$retry$1.I$2 = i11;
                    jNIActivityViewModel$fetchData$retry$1.I$3 = i10;
                    jNIActivityViewModel$fetchData$retry$1.label = 3;
                    Object objEmit = mutableStateFlow.emit(boolBoxBoolean, jNIActivityViewModel$fetchData$retry$1);
                    coroutine_suspended = obj3;
                    if (objEmit == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                i20 = 1;
                int i152222 = i11 + 1;
                UtilsKt.crashlyticsRecordNewException("ERROR " + response.raw() + " countOfErrors " + i152222 + " " + function15);
                jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
                jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
                jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
                jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
                jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
                jNIActivityViewModel$fetchData$retry$1.L$5 = null;
                jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
                jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
                jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
                jNIActivityViewModel$fetchData$retry$1.I$2 = i10;
                jNIActivityViewModel$fetchData$retry$1.I$3 = i152222;
                jNIActivityViewModel$fetchData$retry$1.label = 4;
                if (DelayKt.delay(j2, jNIActivityViewModel$fetchData$retry$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function04 = function03;
                i6 = i152222;
                function17 = function15;
                Function2<? super T, ? super Integer, Unit> function26 = function23;
                jNIActivityViewModel$fetchData$retry$12 = jNIActivityViewModel$fetchData$retry$1;
                i7 = i5;
                i8 = i12;
                function24 = function26;
                JNIActivityViewModel jNIActivityViewModel8 = jNIActivityViewModel3;
                i21 = i10;
                function18 = function16;
                jNIActivityViewModel4 = jNIActivityViewModel8;
                if (i6 < i7) {
                }
                if (r13 != 0) {
                    try {
                    } catch (Exception e3) {
                        e = e3;
                    }
                    jNIActivityViewModel$fetchData$retry$12.L$0 = function18;
                    jNIActivityViewModel$fetchData$retry$12.L$1 = function17;
                    jNIActivityViewModel$fetchData$retry$12.L$2 = function24;
                    jNIActivityViewModel$fetchData$retry$12.L$3 = jNIActivityViewModel4;
                    jNIActivityViewModel$fetchData$retry$12.L$4 = function04;
                    jNIActivityViewModel$fetchData$retry$12.I$0 = i7;
                    jNIActivityViewModel$fetchData$retry$12.J$0 = j2;
                    jNIActivityViewModel$fetchData$retry$12.I$1 = i8;
                    jNIActivityViewModel$fetchData$retry$12.I$2 = i6;
                    jNIActivityViewModel$fetchData$retry$12.I$3 = r13;
                    jNIActivityViewModel$fetchData$retry$12.label = 2;
                    objInvoke = function17.invoke(jNIActivityViewModel$fetchData$retry$12);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    JNIActivityViewModel jNIActivityViewModel9 = jNIActivityViewModel4;
                    i13 = i7;
                    jNIActivityViewModel$fetchData$retry$1 = jNIActivityViewModel$fetchData$retry$12;
                    function13 = function18;
                    i10 = r13;
                    function14 = function17;
                    i11 = i6;
                    function22 = function24;
                    i12 = i8;
                    function02 = function04;
                    jNIActivityViewModel2 = jNIActivityViewModel9;
                    responseError = (Response) objInvoke;
                    function15 = function14;
                    jNIActivityViewModel3 = jNIActivityViewModel2;
                    response = responseError;
                    Function0<Unit> function052222 = function02;
                    i5 = i13;
                    function16 = function13;
                    function23 = function22;
                    function03 = function052222;
                    Object obj2222 = (Object) response.body();
                    if (!response.isSuccessful()) {
                    }
                    if (jNIActivityViewModel3._isFailedRequest.getValue().booleanValue()) {
                    }
                    i20 = 1;
                    int i1522222 = i11 + 1;
                    UtilsKt.crashlyticsRecordNewException("ERROR " + response.raw() + " countOfErrors " + i1522222 + " " + function15);
                    jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
                    jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
                    jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
                    jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
                    jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
                    jNIActivityViewModel$fetchData$retry$1.L$5 = null;
                    jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
                    jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
                    jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
                    jNIActivityViewModel$fetchData$retry$1.I$2 = i10;
                    jNIActivityViewModel$fetchData$retry$1.I$3 = i1522222;
                    jNIActivityViewModel$fetchData$retry$1.label = 4;
                    if (DelayKt.delay(j2, jNIActivityViewModel$fetchData$retry$1) == coroutine_suspended) {
                    }
                }
            }
            JNIActivityViewModel jNIActivityViewModel52 = jNIActivityViewModel4;
            i13 = i7;
            jNIActivityViewModel$fetchData$retry$1 = jNIActivityViewModel$fetchData$retry$12;
            function13 = function18;
            i10 = r13;
            function14 = function17;
            i11 = i6;
            function22 = function24;
            i12 = i8;
            function02 = function04;
            jNIActivityViewModel2 = jNIActivityViewModel52;
            responseError = Response.error(405, ResponseBody.INSTANCE.create(e.toString(), MediaType.INSTANCE.get("application/json")));
            jNIActivityViewModel$fetchData$retry$1 = jNIActivityViewModel$fetchData$retry$1;
            function15 = function14;
            jNIActivityViewModel3 = jNIActivityViewModel2;
            response = responseError;
            Function0<Unit> function0522222 = function02;
            i5 = i13;
            function16 = function13;
            function23 = function22;
            function03 = function0522222;
            Object obj22222 = (Object) response.body();
            if (!response.isSuccessful()) {
            }
            if (jNIActivityViewModel3._isFailedRequest.getValue().booleanValue()) {
            }
            i20 = 1;
            int i15222222 = i11 + 1;
            UtilsKt.crashlyticsRecordNewException("ERROR " + response.raw() + " countOfErrors " + i15222222 + " " + function15);
            jNIActivityViewModel$fetchData$retry$1.L$0 = function16;
            jNIActivityViewModel$fetchData$retry$1.L$1 = function15;
            jNIActivityViewModel$fetchData$retry$1.L$2 = function23;
            jNIActivityViewModel$fetchData$retry$1.L$3 = jNIActivityViewModel3;
            jNIActivityViewModel$fetchData$retry$1.L$4 = function03;
            jNIActivityViewModel$fetchData$retry$1.L$5 = null;
            jNIActivityViewModel$fetchData$retry$1.I$0 = i5;
            jNIActivityViewModel$fetchData$retry$1.J$0 = j2;
            jNIActivityViewModel$fetchData$retry$1.I$1 = i12;
            jNIActivityViewModel$fetchData$retry$1.I$2 = i10;
            jNIActivityViewModel$fetchData$retry$1.I$3 = i15222222;
            jNIActivityViewModel$fetchData$retry$1.label = 4;
            if (DelayKt.delay(j2, jNIActivityViewModel$fetchData$retry$1) == coroutine_suspended) {
            }
        }
    }

    public static /* synthetic */ Object fetchData$retry$default(int i, int i2, Function1 function1, Function1 function12, Function2 function2, JNIActivityViewModel jNIActivityViewModel, long j, int i3, Function0 function0, int i4, boolean z, Continuation continuation, int i5, Object obj) {
        boolean z2;
        int i6 = (i5 & 512) != 0 ? i : i4;
        if ((i5 & 1024) != 0) {
            z2 = i >= i2;
        } else {
            z2 = z;
        }
        return fetchData$retry(i, i2, function1, function12, function2, jNIActivityViewModel, j, i3, function0, i6, z2, continuation);
    }

    public final <T> Object fetchData(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Function1<? super Continuation<? super Response<T>>, ? extends Object> function12, Function2<? super T, ? super Integer, Unit> function2, Function0<Unit> function0, int i, int i2, int i3, long j, Continuation<? super Unit> continuation) {
        Object objFetchData$retry$default = fetchData$retry$default(i, i2, function12, function1, function2, this, j, i3, function0, 0, false, continuation, 1536, null);
        return objFetchData$retry$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFetchData$retry$default : Unit.INSTANCE;
    }

    public final List<Server> addTestServers(List<Server> body) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(body);
        Float fValueOf = Float.valueOf(72.73f);
        Float fValueOf2 = Float.valueOf(408.9f);
        arrayList.add(new Server("80.66.82.19", "7030", "1000", "1000", "38383D", false, fValueOf, fValueOf2, "1424", "Test Server P3 (PreProd/ST)", "Test Server P3 (PreProd/ST)", "Test Server P3 (PreProd/ST)", "80.66.82.19", 202));
        arrayList.add(new Server("80.66.82.19", "7040", "1000", "1000", "38383D", false, fValueOf, fValueOf2, "1424", "Test Server P4 (PreProd/ST)", "Test Server P4 (PreProd/ST)", "Test Server P4 (PreProd/ST)", "80.66.82.19", 203));
        arrayList.add(new Server("80.66.82.19", "7010", "1000", "1000", "38383D", false, fValueOf, fValueOf2, "1424", "Test Server P1 (Review)", "Test Server P1 (Review)", "Test Server P1 (Review)", "80.66.82.19", 200));
        arrayList.add(new Server("80.66.82.19", "7020", "1000", "1000", "38383D", false, fValueOf, fValueOf2, "1424", "Test Server P2 (Prod)", "Test Server P2 (Prod)", "Test Server P2 (Prod)", "80.66.82.19", 201));
        arrayList.add(new Server("51.159.125.199", "7777", "1000", "1000", "0000ee", false, fValueOf, fValueOf2, "1424", "Test Server-Core", "Test Server-Core", "Test Server-Core", "80.66.82.19", null, 8192, null));
        arrayList.add(new Server("5.188.118.53", "7710", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server D1", "Test Server D1", "Test Server D1", "80.66.82.19", Integer.valueOf(HttpStatus.SC_RESET_CONTENT)));
        arrayList.add(new Server("5.188.118.53", "7720", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server D2", "Test Server D2", "Test Server D2", "80.66.82.19", 206));
        arrayList.add(new Server("5.188.118.53", "7810", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server estranossa-1", "Test Server estranossa-1", "Test Server estranossa-1", "80.66.82.19", 207));
        arrayList.add(new Server("5.188.118.53", "7815", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server estranossa-2", "Test Server estranossa-2", "Test Server estranossa-2", "80.66.82.19", 208));
        arrayList.add(new Server("5.188.118.53", "7820", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server tokie-1", "Test Server tokie-1", "Test Server tokie-1", "80.66.82.19", Integer.valueOf(Cea708Decoder.CueInfoBuilder.HORIZONTAL_SIZE)));
        arrayList.add(new Server("5.188.118.53", "7825", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server tokie-2", "Test Server tokie-2", "Test Server tokie-2", "80.66.82.19", 210));
        arrayList.add(new Server("5.188.118.53", "7830", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server baton-1", "Test Server baton-1", "Test Server baton-1", "80.66.82.19", 211));
        arrayList.add(new Server("5.188.118.53", "7835", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server baton-2", "Test Server baton-2", "Test Server baton-2", "80.66.82.19", 212));
        arrayList.add(new Server("5.188.118.53", "7840", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server ihn1fi-1", "Test Server ihn1fi-1", "Test Server ihn1fi-1", "80.66.82.19", 213));
        arrayList.add(new Server("5.188.118.53", "7845", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server ihn1fi-2", "Test Server ihn1fi-2", "Test Server ihn1fi-2", "80.66.82.19", 214));
        arrayList.add(new Server("5.188.118.53", "7850", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server mazer-1", "Test Server mazer-1", "Test Server mazer-1", "80.66.82.19", Integer.valueOf(MatroskaExtractor.ID_TRACK_NUMBER)));
        arrayList.add(new Server("5.188.118.53", "7855", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server mazer-2", "Test Server mazer-2", "Test Server mazer-2", "80.66.82.19", 216));
        arrayList.add(new Server("5.188.118.53", "7860", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server bury-1", "Test Server bury-1", "Test Server bury-1", "80.66.82.19", 217));
        arrayList.add(new Server("5.188.118.53", "7865", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server bury-2", "Test Server bury-2", "Test Server bury-2", "80.66.82.19", 218));
        arrayList.add(new Server("5.188.118.53", "7870", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server frankcompton-1", "Test Server frankcompton-1", "Test Server frankcompton-1", "80.66.82.19", 219));
        arrayList.add(new Server("5.188.118.53", "7875", "1000", "1000", "000000", false, fValueOf, fValueOf2, "1424", "Test Server frankcompton-2", "Test Server frankcompton-2", "Test Server frankcompton-2", "80.66.82.19", 220));
        return arrayList;
    }

    public final void updateProgress() {
        MutableStateFlow<Integer> mutableStateFlow = this._counterOfRequests;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
    }

    public final void showErrorDialogForRestart() {
        this._isNeedRestart.setValue(Boolean.TRUE);
    }

    public final void saveCalendarPage(@NotNull CalendarScreenType selectedPage) {
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        this.calendarSavedPage = selectedPage;
    }
}

