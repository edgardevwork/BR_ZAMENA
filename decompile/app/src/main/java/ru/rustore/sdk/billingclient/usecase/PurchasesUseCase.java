package ru.rustore.sdk.billingclient.usecase;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResult;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultCase;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultCasePayload;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultPayment;
import com.sdkit.paylib.paylibnative.api.entity.PaylibResultUnknown;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibPurchaseParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.impl.analytics.C11405a;
import ru.rustore.sdk.billingclient.impl.analytics.C11407c;
import ru.rustore.sdk.billingclient.impl.analytics.C11408d;
import ru.rustore.sdk.billingclient.impl.analytics.C11409e;
import ru.rustore.sdk.billingclient.impl.analytics.C11410f;
import ru.rustore.sdk.billingclient.impl.analytics.C11411g;
import ru.rustore.sdk.billingclient.impl.analytics.C11413i;
import ru.rustore.sdk.billingclient.impl.data.converter.C11422b;
import ru.rustore.sdk.billingclient.impl.data.repository.C11474b;
import ru.rustore.sdk.billingclient.impl.data.repository.C11481i;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11501a;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11502b;
import ru.rustore.sdk.billingclient.impl.domain.model.C11510g;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11514a;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11519f;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11524k;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.billingclient.impl.utils.InterfaceC11549a;
import ru.rustore.sdk.billingclient.model.purchase.PaymentResult;
import ru.rustore.sdk.billingclient.model.purchase.Purchase;
import ru.rustore.sdk.billingclient.model.purchase.PurchaseAvailabilityResult;
import ru.rustore.sdk.billingclient.utils.AuthorizedWrapper;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.core.tasks.TaskHelper;
import ru.rustore.sdk.reactive.single.SingleSubscribeKt;
import ru.rustore.sdk.user.profile.model.UserProfile;

@Metadata(m7104d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0019¢\u0006\u0004\b!\u0010\u001cJ\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b%\u0010$J)\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\"\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010+\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, m7105d2 = {"Lru/rustore/sdk/billingclient/usecase/PurchasesUseCase;", "", "Lcom/sdkit/paylib/paylibdomain/api/purchases/PurchasesInteractor;", "purchasesInteractor", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeRouter;", "paylibNativeRouter", SegmentConstantPool.INITSTRING, "(Lcom/sdkit/paylib/paylibdomain/api/purchases/PurchasesInteractor;Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeRouter;)V", "", "productId", "orderId", "", FirebaseAnalytics.Param.QUANTITY, "developerPayload", "", "purchaseProductInternal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;", "", UserProfile.KEY_USER_ID, "updateWithSubscriptionToken", "(Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;Ljava/lang/Long;)Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;", "updatedPaymentResult", "sendPaymentResultAnalytics", "(Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;)V", "Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;", "checkPurchasesAvailability", "()Lru/rustore/sdk/core/tasks/Task;", "purchaseProduct", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/rustore/sdk/core/tasks/Task;", "", "Lru/rustore/sdk/billingclient/model/purchase/Purchase;", "getPurchases", "purchaseId", "getPurchaseInfo", "(Ljava/lang/String;)Lru/rustore/sdk/core/tasks/Task;", "deletePurchase", "confirmPurchase", "(Ljava/lang/String;Ljava/lang/String;)Lru/rustore/sdk/core/tasks/Task;", "Lcom/sdkit/paylib/paylibdomain/api/purchases/PurchasesInteractor;", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeRouter;", "Lru/rustore/sdk/billingclient/impl/domain/interactor/b;", "isPurchasesAvailableInteractor", "()Lru/rustore/sdk/billingclient/impl/domain/interactor/b;", "Lru/rustore/sdk/billingclient/impl/domain/usecase/k;", "getGetUserIdUseCase", "()Lru/rustore/sdk/billingclient/impl/domain/usecase/k;", "getUserIdUseCase", "Lru/rustore/sdk/billingclient/impl/domain/usecase/f;", "getGetSandboxInfoUseCase", "()Lru/rustore/sdk/billingclient/impl/domain/usecase/f;", "getSandboxInfoUseCase", "Lru/rustore/sdk/billingclient/impl/analytics/a;", "getBillingAnalytics", "()Lru/rustore/sdk/billingclient/impl/analytics/a;", "billingAnalytics", "Lru/rustore/sdk/billingclient/impl/data/repository/i;", "getPendingPurchaseRepository", "()Lru/rustore/sdk/billingclient/impl/data/repository/i;", "pendingPurchaseRepository", "Lru/rustore/sdk/billingclient/impl/domain/usecase/a;", "getClearWebAuthorizationInfoUseCase", "()Lru/rustore/sdk/billingclient/impl/domain/usecase/a;", "clearWebAuthorizationInfoUseCase", "Lru/rustore/sdk/billingclient/impl/utils/a;", "getDispatcher", "()Lru/rustore/sdk/billingclient/impl/utils/a;", "dispatcher", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes7.dex */
public final class PurchasesUseCase {
    public final PaylibNativeRouter paylibNativeRouter;
    public final PurchasesInteractor purchasesInteractor;

    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lru/rustore/sdk/billingclient/model/purchase/PurchaseAvailabilityResult;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$checkPurchasesAvailability$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {72}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$checkPurchasesAvailability$1 */
    /* loaded from: classes8.dex */
    public static final class C115581 extends SuspendLambda implements Function1<Continuation<? super PurchaseAvailabilityResult>, Object> {
        public int label;

        public C115581(Continuation<? super C115581> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PurchasesUseCase.this.new C115581(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11502b c11502bIsPurchasesAvailableInteractor = PurchasesUseCase.this.isPurchasesAvailableInteractor();
                this.label = 1;
                obj = BuildersKt.withContext(c11502bIsPurchasesAvailableInteractor.f10477d.mo7479a(), new C11501a(c11502bIsPurchasesAvailableInteractor, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PurchaseAvailabilityResult purchaseAvailabilityResult = (PurchaseAvailabilityResult) obj;
            if (purchaseAvailabilityResult instanceof PurchaseAvailabilityResult.Unavailable) {
                C11405a billingAnalytics = PurchasesUseCase.this.getBillingAnalytics();
                RuStoreException error = ((PurchaseAvailabilityResult.Unavailable) purchaseAvailabilityResult).getCause();
                billingAnalytics.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
                mapCreateMapBuilder.putAll((Map) billingAnalytics.f10166g.getValue());
                mapCreateMapBuilder.put("error_name", error.getClass().getSimpleName());
                SingleSubscribeKt.subscribe$default(billingAnalytics.f10160a.m7454a(new C11413i("payCheckPurchasesAvailability", MapsKt__MapsJVMKt.build(mapCreateMapBuilder)), billingAnalytics.m7440a()), null, C11411g.f10175a, 1, null);
            }
            return purchaseAvailabilityResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PurchaseAvailabilityResult> continuation) {
            return ((C115581) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$confirmPurchase$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {173, 180}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$confirmPurchase$1 */
    /* loaded from: classes8.dex */
    public static final class C115591 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $developerPayload;
        public final /* synthetic */ String $purchaseId;
        public int label;

        @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$confirmPurchase$1$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {MatroskaExtractor.ID_TRACK_ENTRY}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$confirmPurchase$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public final /* synthetic */ String $developerPayload;
            public final /* synthetic */ String $purchaseId;
            public int label;
            public final /* synthetic */ PurchasesUseCase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PurchasesUseCase purchasesUseCase, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = purchasesUseCase;
                this.$purchaseId = str;
                this.$developerPayload = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$purchaseId, this.$developerPayload, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objMo15372confirmPurchase0E7RQCE;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PurchasesInteractor purchasesInteractor = this.this$0.purchasesInteractor;
                    String str = this.$purchaseId;
                    String str2 = this.$developerPayload;
                    this.label = 1;
                    objMo15372confirmPurchase0E7RQCE = purchasesInteractor.mo15372confirmPurchase0E7RQCE(str, str2, this);
                    if (objMo15372confirmPurchase0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objMo15372confirmPurchase0E7RQCE = ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(objMo15372confirmPurchase0E7RQCE);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115591(String str, String str2, Continuation<? super C115591> continuation) {
            super(1, continuation);
            this.$purchaseId = str;
            this.$developerPayload = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PurchasesUseCase.this.new C115591(this.$purchaseId, this.$developerPayload, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0049  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizedWrapper authorizedWrapper = AuthorizedWrapper.INSTANCE;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PurchasesUseCase.this, this.$purchaseId, this.$developerPayload, null);
                this.label = 1;
                if (authorizedWrapper.runAuthorized(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (obj == null) {
                        PurchasesUseCase.this.getClearWebAuthorizationInfoUseCase().m7468a();
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            C11524k getUserIdUseCase = PurchasesUseCase.this.getGetUserIdUseCase();
            this.label = 2;
            obj = getUserIdUseCase.m7470a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (obj == null) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C115591) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$deletePurchase$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {157}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$deletePurchase$1 */
    /* loaded from: classes8.dex */
    public static final class C115601 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $purchaseId;
        public int label;

        @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", ""}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$deletePurchase$1$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DF6}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$deletePurchase$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public final /* synthetic */ String $purchaseId;
            public int label;
            public final /* synthetic */ PurchasesUseCase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PurchasesUseCase purchasesUseCase, String str, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = purchasesUseCase;
                this.$purchaseId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$purchaseId, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objMo15374deletePurchasegIAlus;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PurchasesInteractor purchasesInteractor = this.this$0.purchasesInteractor;
                    String str = this.$purchaseId;
                    this.label = 1;
                    objMo15374deletePurchasegIAlus = purchasesInteractor.mo15374deletePurchasegIAlus(str, this);
                    if (objMo15374deletePurchasegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objMo15374deletePurchasegIAlus = ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(objMo15374deletePurchasegIAlus);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115601(String str, Continuation<? super C115601> continuation) {
            super(1, continuation);
            this.$purchaseId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PurchasesUseCase.this.new C115601(this.$purchaseId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizedWrapper authorizedWrapper = AuthorizedWrapper.INSTANCE;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PurchasesUseCase.this, this.$purchaseId, null);
                this.label = 1;
                if (authorizedWrapper.runAuthorized(anonymousClass1, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C115601) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lru/rustore/sdk/billingclient/model/purchase/Purchase;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchaseInfo$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLW}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchaseInfo$1 */
    /* loaded from: classes8.dex */
    public static final class C115611 extends SuspendLambda implements Function1<Continuation<? super Purchase>, Object> {
        public final /* synthetic */ String $purchaseId;
        public int label;

        @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lru/rustore/sdk/billingclient/model/purchase/Purchase;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchaseInfo$1$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLY, Cea708Decoder.COMMAND_RST}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchaseInfo$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Purchase>, Object> {
            public final /* synthetic */ String $purchaseId;
            public Object L$0;
            public int label;
            public final /* synthetic */ PurchasesUseCase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PurchasesUseCase purchasesUseCase, String str, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = purchasesUseCase;
                this.$purchaseId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$purchaseId, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0067  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objMo15376getPurchaseInfoV2gIAlus;
                Object obj2;
                C11510g c11510g;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PurchasesInteractor purchasesInteractor = this.this$0.purchasesInteractor;
                    String str = this.$purchaseId;
                    this.label = 1;
                    objMo15376getPurchaseInfoV2gIAlus = purchasesInteractor.mo15376getPurchaseInfoV2gIAlus(str, this);
                    if (objMo15376getPurchaseInfoV2gIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.L$0;
                        ResultKt.throwOnFailure(obj);
                        c11510g = (C11510g) obj;
                        if (c11510g != null) {
                            throw new RuStoreUserUnauthorizedException();
                        }
                        long j = c11510g.f10495a;
                        boolean zM7469a = this.this$0.getGetSandboxInfoUseCase().m7469a();
                        ResultKt.throwOnFailure(obj2);
                        return C11422b.m7442a((com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase) obj2, j, zM7469a);
                    }
                    ResultKt.throwOnFailure(obj);
                    objMo15376getPurchaseInfoV2gIAlus = ((Result) obj).getValue();
                }
                C11524k getUserIdUseCase = this.this$0.getGetUserIdUseCase();
                this.L$0 = objMo15376getPurchaseInfoV2gIAlus;
                this.label = 2;
                Object objM7470a = getUserIdUseCase.m7470a(this);
                if (objM7470a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = objMo15376getPurchaseInfoV2gIAlus;
                obj = objM7470a;
                c11510g = (C11510g) obj;
                if (c11510g != null) {
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Purchase> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115611(String str, Continuation<? super C115611> continuation) {
            super(1, continuation);
            this.$purchaseId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PurchasesUseCase.this.new C115611(this.$purchaseId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizedWrapper authorizedWrapper = AuthorizedWrapper.INSTANCE;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PurchasesUseCase.this, this.$purchaseId, null);
                this.label = 1;
                obj = authorizedWrapper.runAuthorized(anonymousClass1, this);
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Purchase> continuation) {
            return ((C115611) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lru/rustore/sdk/billingclient/model/purchase/Purchase;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchases$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {124}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchases$1 */
    /* loaded from: classes8.dex */
    public static final class C115621 extends SuspendLambda implements Function1<Continuation<? super List<? extends Purchase>>, Object> {
        public int label;

        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lru/rustore/sdk/billingclient/model/purchase/Purchase;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchases$1$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {125, 127}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$getPurchases$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super List<? extends Purchase>>, Object> {
            public Object L$0;
            public int label;
            public final /* synthetic */ PurchasesUseCase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PurchasesUseCase purchasesUseCase, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = purchasesUseCase;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Purchase>> continuation) {
                return invoke2((Continuation<? super List<Purchase>>) continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objMo15378getPurchasesV2IoAF18A;
                Object obj2;
                C11510g c11510g;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PurchasesInteractor purchasesInteractor = this.this$0.purchasesInteractor;
                    this.label = 1;
                    objMo15378getPurchasesV2IoAF18A = purchasesInteractor.mo15378getPurchasesV2IoAF18A(this);
                    if (objMo15378getPurchasesV2IoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.L$0;
                        ResultKt.throwOnFailure(obj);
                        c11510g = (C11510g) obj;
                        if (c11510g != null) {
                            throw new RuStoreUserUnauthorizedException();
                        }
                        long j = c11510g.f10495a;
                        boolean zM7469a = this.this$0.getGetSandboxInfoUseCase().m7469a();
                        ResultKt.throwOnFailure(obj2);
                        Iterable iterable = (Iterable) obj2;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C11422b.m7442a((com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase) it.next(), j, zM7469a));
                        }
                        return arrayList;
                    }
                    ResultKt.throwOnFailure(obj);
                    objMo15378getPurchasesV2IoAF18A = ((Result) obj).getValue();
                }
                C11524k getUserIdUseCase = this.this$0.getGetUserIdUseCase();
                this.L$0 = objMo15378getPurchasesV2IoAF18A;
                this.label = 2;
                Object objM7470a = getUserIdUseCase.m7470a(this);
                if (objM7470a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = objMo15378getPurchasesV2IoAF18A;
                obj = objM7470a;
                c11510g = (C11510g) obj;
                if (c11510g != null) {
                }
            }

            /* renamed from: invoke */
            public final Object invoke2(Continuation<? super List<Purchase>> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C115621(Continuation<? super C115621> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PurchasesUseCase.this.new C115621(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Purchase>> continuation) {
            return invoke2((Continuation<? super List<Purchase>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizedWrapper authorizedWrapper = AuthorizedWrapper.INSTANCE;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PurchasesUseCase.this, null);
                this.label = 1;
                obj = authorizedWrapper.runAuthorized(anonymousClass1, this);
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

        /* renamed from: invoke */
        public final Object invoke2(Continuation<? super List<Purchase>> continuation) {
            return ((C115621) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$purchaseProduct$1", m7120f = "PurchasesUseCase.kt", m7121i = {}, m7122l = {100, 106}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$purchaseProduct$1 */
    /* loaded from: classes8.dex */
    public static final class C115631 extends SuspendLambda implements Function1<Continuation<? super PaymentResult>, Object> {
        public final /* synthetic */ String $developerPayload;
        public final /* synthetic */ String $orderId;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ Integer $quantity;
        public int label;

        @Metadata(m7104d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m7105d2 = {"<anonymous>", "Lru/rustore/sdk/billingclient/model/purchase/PaymentResult;"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$purchaseProduct$1$1", m7120f = "PurchasesUseCase.kt", m7121i = {0}, m7122l = {110}, m7123m = "invokeSuspend", m7124n = {"sandboxInfo"}, m7125s = {"Z$0"})
        /* renamed from: ru.rustore.sdk.billingclient.usecase.PurchasesUseCase$purchaseProduct$1$1 */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super PaymentResult>, Object> {
            public final /* synthetic */ String $developerPayload;
            public final /* synthetic */ String $orderId;
            public final /* synthetic */ String $productId;
            public final /* synthetic */ Integer $quantity;
            public final /* synthetic */ Long $userId;
            public boolean Z$0;
            public int label;
            public final /* synthetic */ PurchasesUseCase this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PurchasesUseCase purchasesUseCase, String str, String str2, Integer num, String str3, Long l, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = purchasesUseCase;
                this.$productId = str;
                this.$orderId = str2;
                this.$quantity = num;
                this.$developerPayload = str3;
                this.$userId = l;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$productId, this.$orderId, this.$quantity, this.$developerPayload, this.$userId, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z;
                PaymentResult failure;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.purchaseProductInternal(this.$productId, this.$orderId, this.$quantity, this.$developerPayload);
                    boolean zM7469a = this.this$0.getGetSandboxInfoUseCase().m7469a();
                    Flow<PaylibResult> flowResultObserver = this.this$0.paylibNativeRouter.resultObserver();
                    this.Z$0 = zM7469a;
                    this.label = 1;
                    Object objFirst = FlowKt.first(flowResultObserver, this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = zM7469a;
                    obj = objFirst;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    z = z2;
                }
                PaylibResult toInternal = (PaylibResult) obj;
                Intrinsics.checkNotNullParameter(toInternal, "$this$toInternal");
                if (toInternal instanceof PaylibResultUnknown) {
                    failure = PaymentResult.InvalidPaymentState.INSTANCE;
                } else {
                    if (!(toInternal instanceof PaylibResultPayment)) {
                        throw new IllegalStateException("Unexpected PaylibResult".toString());
                    }
                    PaylibResultPayment paylibResultPayment = (PaylibResultPayment) toInternal;
                    PaylibResultCasePayload payload = paylibResultPayment.getCase().getPayload();
                    if ((paylibResultPayment.getCase() instanceof PaylibResultCase.Cancelled) && (payload instanceof PaylibResultPayment.Product.Completion)) {
                        failure = new PaymentResult.Cancelled(((PaylibResultPayment.Product.Completion) payload).getPurchaseId(), z);
                    } else if ((paylibResultPayment.getCase() instanceof PaylibResultCase.Succeed) && (payload instanceof PaylibResultPayment.Product.Completion)) {
                        PaylibResultPayment.Product.Completion completion = (PaylibResultPayment.Product.Completion) payload;
                        failure = new PaymentResult.Success(completion.getOrderId(), completion.getPurchaseId(), completion.getProductId(), completion.getInvoiceId(), z, null, 32, null);
                    } else {
                        if (!(paylibResultPayment.getCase() instanceof PaylibResultCase.Failed) || !(payload instanceof PaylibResultPayment.Product.Failure)) {
                            throw new IllegalStateException("Unexpected PaylibResultPayment".toString());
                        }
                        PaylibResultPayment.Product.Failure failure2 = (PaylibResultPayment.Product.Failure) payload;
                        failure = new PaymentResult.Failure(failure2.getPurchaseId(), failure2.getInvoiceId(), failure2.getOrderId(), failure2.getQuantity(), failure2.getProductId(), z, failure2.getErrorCode());
                    }
                }
                PaymentResult paymentResultUpdateWithSubscriptionToken = this.this$0.updateWithSubscriptionToken(failure, this.$userId);
                this.this$0.sendPaymentResultAnalytics(paymentResultUpdateWithSubscriptionToken);
                return paymentResultUpdateWithSubscriptionToken;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super PaymentResult> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115631(String str, String str2, Integer num, String str3, Continuation<? super C115631> continuation) {
            super(1, continuation);
            this.$productId = str;
            this.$orderId = str2;
            this.$quantity = num;
            this.$developerPayload = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return PurchasesUseCase.this.new C115631(this.$productId, this.$orderId, this.$quantity, this.$developerPayload, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C11524k getUserIdUseCase = PurchasesUseCase.this.getGetUserIdUseCase();
                this.label = 1;
                obj = getUserIdUseCase.m7470a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C11510g c11510g = (C11510g) obj;
            Long lBoxLong = c11510g != null ? Boxing.boxLong(c11510g.f10495a) : null;
            if (lBoxLong == null) {
                PurchasesUseCase.this.getClearWebAuthorizationInfoUseCase().m7468a();
            }
            PurchasesUseCase.this.getPendingPurchaseRepository().m7455a(this.$productId);
            AuthorizedWrapper authorizedWrapper = AuthorizedWrapper.INSTANCE;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(PurchasesUseCase.this, this.$productId, this.$orderId, this.$quantity, this.$developerPayload, lBoxLong, null);
            this.label = 2;
            obj = authorizedWrapper.runAuthorized(anonymousClass1, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super PaymentResult> continuation) {
            return ((C115631) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public PurchasesUseCase(PurchasesInteractor purchasesInteractor, PaylibNativeRouter paylibNativeRouter) {
        Intrinsics.checkNotNullParameter(purchasesInteractor, "purchasesInteractor");
        Intrinsics.checkNotNullParameter(paylibNativeRouter, "paylibNativeRouter");
        this.purchasesInteractor = purchasesInteractor;
        this.paylibNativeRouter = paylibNativeRouter;
    }

    public static /* synthetic */ Task confirmPurchase$default(PurchasesUseCase purchasesUseCase, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return purchasesUseCase.confirmPurchase(str, str2);
    }

    public static /* synthetic */ Task purchaseProduct$default(PurchasesUseCase purchasesUseCase, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return purchasesUseCase.purchaseProduct(str, str2, num, str3);
    }

    public static /* synthetic */ void purchaseProductInternal$default(PurchasesUseCase purchasesUseCase, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        purchasesUseCase.purchaseProductInternal(str, str2, num, str3);
    }

    @Deprecated(message = "Данный метод работает только для флоу с авторизированным пользователем в RuStore")
    public final Task<PurchaseAvailabilityResult> checkPurchasesAvailability() {
        return TaskHelper.wrap$default(TaskHelper.INSTANCE, null, new C115581(null), 1, null);
    }

    public final Task<Unit> confirmPurchase(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return confirmPurchase$default(this, purchaseId, null, 2, null);
    }

    public final Task<Unit> deletePurchase(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return TaskHelper.INSTANCE.wrap(getDispatcher().mo7479a(), new C115601(purchaseId, null));
    }

    public final C11405a getBillingAnalytics() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11405a) C11497a.C11965b.m7463a().f10397w.getValue();
    }

    public final C11514a getClearWebAuthorizationInfoUseCase() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11514a) C11497a.C11965b.m7463a().f10370h0.getValue();
    }

    public final InterfaceC11549a getDispatcher() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (InterfaceC11549a) C11497a.C11965b.m7463a().f10368g0.getValue();
    }

    public final C11519f getGetSandboxInfoUseCase() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11519f) C11497a.C11965b.m7463a().f10349U.getValue();
    }

    public final C11524k getGetUserIdUseCase() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11524k) C11497a.C11965b.m7463a().f10351W.getValue();
    }

    public final C11481i getPendingPurchaseRepository() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11481i) C11497a.C11965b.m7463a().f10354Z.getValue();
    }

    public final Task<Purchase> getPurchaseInfo(String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return TaskHelper.INSTANCE.wrap(getDispatcher().mo7479a(), new C115611(purchaseId, null));
    }

    public final Task<List<Purchase>> getPurchases() {
        return TaskHelper.INSTANCE.wrap(getDispatcher().mo7479a(), new C115621(null));
    }

    public final C11502b isPurchasesAvailableInteractor() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11502b) C11497a.C11965b.m7463a().f10350V.getValue();
    }

    public final Task<PaymentResult> purchaseProduct(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return purchaseProduct$default(this, productId, null, null, null, 14, null);
    }

    public final void purchaseProductInternal(String productId, String orderId, Integer num, String developerPayload) {
        this.paylibNativeRouter.purchaseProduct(new PaylibPurchaseParams(productId, orderId, num, developerPayload));
        C11405a billingAnalytics = getBillingAnalytics();
        billingAnalytics.getClass();
        Intrinsics.checkNotNullParameter(productId, "productId");
        C11474b c11474b = billingAnalytics.f10160a;
        Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
        mapCreateMapBuilder.putAll((Map) billingAnalytics.f10167h.getValue());
        mapCreateMapBuilder.put("productId", productId);
        if (orderId != null) {
            mapCreateMapBuilder.put("orderId", orderId);
        }
        Unit unit = Unit.INSTANCE;
        SingleSubscribeKt.subscribe$default(c11474b.m7454a(new C11413i("paySheetLoad", MapsKt__MapsJVMKt.build(mapCreateMapBuilder)), billingAnalytics.m7440a()), null, C11409e.f10173a, 1, null);
    }

    public final void sendPaymentResultAnalytics(PaymentResult updatedPaymentResult) {
        if (updatedPaymentResult instanceof PaymentResult.Failure) {
            C11405a billingAnalytics = getBillingAnalytics();
            PaymentResult.Failure failure = (PaymentResult.Failure) updatedPaymentResult;
            String purchaseId = failure.getPurchaseId();
            String invoiceId = failure.getInvoiceId();
            Integer errorCode = failure.getErrorCode();
            billingAnalytics.getClass();
            Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
            mapCreateMapBuilder.putAll((Map) billingAnalytics.f10167h.getValue());
            if (purchaseId != null) {
            }
            if (invoiceId != null) {
            }
            if (errorCode != null) {
                mapCreateMapBuilder.put("error_code", String.valueOf(errorCode.intValue()));
            }
            SingleSubscribeKt.subscribe$default(billingAnalytics.f10160a.m7454a(new C11413i("paySheetError", MapsKt__MapsJVMKt.build(mapCreateMapBuilder)), billingAnalytics.m7440a()), null, C11408d.f10172a, 1, null);
            return;
        }
        if (!(updatedPaymentResult instanceof PaymentResult.Success)) {
            if (updatedPaymentResult instanceof PaymentResult.Cancelled) {
                C11405a billingAnalytics2 = getBillingAnalytics();
                String purchaseId2 = ((PaymentResult.Cancelled) updatedPaymentResult).getPurchaseId();
                billingAnalytics2.getClass();
                Intrinsics.checkNotNullParameter(purchaseId2, "purchaseId");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll((Map) billingAnalytics2.f10167h.getValue());
                linkedHashMap.put("purchaseId", purchaseId2);
                SingleSubscribeKt.subscribe$default(billingAnalytics2.f10160a.m7454a(new C11413i("paySheetCancel", linkedHashMap), billingAnalytics2.m7440a()), null, C11407c.f10171a, 1, null);
                return;
            }
            return;
        }
        C11405a billingAnalytics3 = getBillingAnalytics();
        PaymentResult.Success success = (PaymentResult.Success) updatedPaymentResult;
        String orderId = success.getOrderId();
        String purchaseId3 = success.getPurchaseId();
        String invoiceId2 = success.getInvoiceId();
        billingAnalytics3.getClass();
        Intrinsics.checkNotNullParameter(purchaseId3, "purchaseId");
        Intrinsics.checkNotNullParameter(invoiceId2, "invoiceId");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll((Map) billingAnalytics3.f10167h.getValue());
        linkedHashMap2.put("invoiceId", invoiceId2);
        linkedHashMap2.put("purchaseId", purchaseId3);
        if (orderId != null) {
            linkedHashMap2.put("orderId", orderId);
        }
        SingleSubscribeKt.subscribe$default(billingAnalytics3.f10160a.m7454a(new C11413i("paySheetPaymentSuccess", linkedHashMap2), billingAnalytics3.m7440a()), null, C11410f.f10174a, 1, null);
    }

    public final PaymentResult updateWithSubscriptionToken(PaymentResult paymentResult, Long l) {
        if (!(paymentResult instanceof PaymentResult.Success) || l == null) {
            return paymentResult;
        }
        PaymentResult.Success success = (PaymentResult.Success) paymentResult;
        String invoiceId = success.getInvoiceId();
        long jLongValue = l.longValue();
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        return PaymentResult.Success.copy$default(success, null, null, null, null, false, invoiceId + '.' + jLongValue, 31, null);
    }

    public final Task<Unit> confirmPurchase(String purchaseId, String developerPayload) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return TaskHelper.INSTANCE.wrap(getDispatcher().mo7479a(), new C115591(purchaseId, developerPayload, null));
    }

    public final Task<PaymentResult> purchaseProduct(String productId, String str) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return purchaseProduct$default(this, productId, str, null, null, 12, null);
    }

    public final Task<PaymentResult> purchaseProduct(String productId, String str, Integer num) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return purchaseProduct$default(this, productId, str, num, null, 8, null);
    }

    public final Task<PaymentResult> purchaseProduct(String productId, String orderId, Integer num, String developerPayload) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return TaskHelper.wrap$default(TaskHelper.INSTANCE, null, new C115631(productId, orderId, num, developerPayload, null), 1, null);
    }
}
