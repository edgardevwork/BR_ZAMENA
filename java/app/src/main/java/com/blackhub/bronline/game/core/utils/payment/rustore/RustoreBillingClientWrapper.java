package com.blackhub.bronline.game.core.utils.payment.rustore;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.core.utils.payment.BillingInfo;
import com.blackhub.bronline.game.core.utils.payment.rustore.model.RustoreBillingPurchaseRequest;
import com.blackhub.bronline.game.gui.donate.data.BillingItem;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.RuStoreBillingClient;
import ru.rustore.sdk.billingclient.RuStoreBillingClientFactory;
import ru.rustore.sdk.billingclient.model.purchase.PaymentResult;
import ru.rustore.sdk.billingclient.model.purchase.Purchase;
import ru.rustore.sdk.billingclient.model.purchase.PurchaseState;
import ru.rustore.sdk.billingclient.model.user.UserAuthorizationStatus;
import ru.rustore.sdk.billingclient.usecase.PurchasesUseCase;
import ru.rustore.sdk.billingclient.usecase.UserInfoUseCase;
import ru.rustore.sdk.core.tasks.OnFailureListener;
import ru.rustore.sdk.core.tasks.OnSuccessListener;
import ru.rustore.sdk.core.tasks.Task;

/* compiled from: RustoreBillingClientWrapper.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRustoreBillingClientWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RustoreBillingClientWrapper.kt\ncom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1#2:253\n1549#3:254\n1620#3,3:255\n1549#3:258\n1620#3,3:259\n*S KotlinDebug\n*F\n+ 1 RustoreBillingClientWrapper.kt\ncom/blackhub/bronline/game/core/utils/payment/rustore/RustoreBillingClientWrapper\n*L\n70#1:254\n70#1:255,3\n93#1:258\n93#1:259,3\n*E\n"})
/* loaded from: classes3.dex */
public final class RustoreBillingClientWrapper {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<List<RustoreBillingPurchaseRequest>> _unconfirmedPayment;

    @Nullable
    public RuStoreBillingClient billingClient;

    @NotNull
    public final StateFlow<List<RustoreBillingPurchaseRequest>> unconfirmedPayment;

    @Inject
    public RustoreBillingClientWrapper(@NotNull Application appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        MutableStateFlow<List<RustoreBillingPurchaseRequest>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this._unconfirmedPayment = MutableStateFlow;
        this.unconfirmedPayment = FlowKt.asStateFlow(MutableStateFlow);
        if (UtilsKt.isRustoreBuildVariant()) {
            this.billingClient = RuStoreBillingClientFactory.create$default(RuStoreBillingClientFactory.INSTANCE, appContext, BuildConfig.RUSTORE_APP_ID, "com.launcher.brgame-rustore-billing", new BillingClientThemeProviderImpl(), null, false, null, 64, null);
        }
    }

    @Nullable
    public final RuStoreBillingClient getBillingClient() {
        return this.billingClient;
    }

    public final void setBillingClient(@Nullable RuStoreBillingClient ruStoreBillingClient) {
        this.billingClient = ruStoreBillingClient;
    }

    @NotNull
    public final StateFlow<List<RustoreBillingPurchaseRequest>> getUnconfirmedPayment() {
        return this.unconfirmedPayment;
    }

    /* compiled from: RustoreBillingClientWrapper.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "Lcom/blackhub/bronline/game/core/utils/payment/rustore/PaymentLogger;", "tag", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$1 */
    /* loaded from: classes2.dex */
    public static final class C35541 extends Lambda implements Function1<String, PaymentLogger> {
        public static final C35541 INSTANCE = new C35541();

        public C35541() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final PaymentLogger invoke(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new PaymentLogger(RustoreBillingClientWrapperKt.PaymentLoggerTag, tag);
        }
    }

    public final void getRustoreBillingPurchases(@NotNull final Context context) {
        UserInfoUseCase userInfo;
        Task<UserAuthorizationStatus> authorizationStatus;
        Task<UserAuthorizationStatus> taskAddOnSuccessListener;
        Intrinsics.checkNotNullParameter(context, "context");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (userInfo = ruStoreBillingClient.getUserInfo()) == null || (authorizationStatus = userInfo.getAuthorizationStatus()) == null || (taskAddOnSuccessListener = authorizationStatus.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda2
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$4(this.f$0, context, (UserAuthorizationStatus) obj);
            }
        })) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda3
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$5(th);
            }
        });
    }

    public static final void getRustoreBillingPurchases$lambda$4(final RustoreBillingClientWrapper this$0, final Context context, UserAuthorizationStatus authorizationStatus) {
        PurchasesUseCase purchases;
        Task<List<Purchase>> purchases2;
        Task<List<Purchase>> taskAddOnSuccessListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(authorizationStatus, "authorizationStatus");
        if (authorizationStatus.getAuthorized()) {
            RuStoreBillingClient ruStoreBillingClient = this$0.billingClient;
            if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (purchases2 = purchases.getPurchases()) == null || (taskAddOnSuccessListener = purchases2.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda8
                @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$4$lambda$2(this.f$0, context, (List) obj);
                }
            })) == null) {
                return;
            }
            taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda9
                @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                public final void onFailure(Throwable th) {
                    RustoreBillingClientWrapper.getRustoreBillingPurchases$lambda$4$lambda$3(th);
                }
            });
            return;
        }
        UtilsKt.crashlyticsLog("Игрок НЕ авторизован при входе на сервер");
    }

    public static final void getRustoreBillingPurchases$lambda$4$lambda$2(RustoreBillingClientWrapper this$0, Context context, List purchaseList) {
        Integer numValueOf;
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        MutableStateFlow<List<RustoreBillingPurchaseRequest>> mutableStateFlow = this$0._unconfirmedPayment;
        List<Purchase> list = purchaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Purchase purchase : list) {
            String productId = purchase.getProductId();
            String invoiceId = purchase.getInvoiceId();
            String str = invoiceId == null ? "" : invoiceId;
            String purchaseId = purchase.getPurchaseId();
            String str2 = purchaseId == null ? "" : purchaseId;
            Iterator<T> it = BillingInfo.INSTANCE.getBillingObj().iterator();
            while (true) {
                numValueOf = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((BillingItem) next).getProductId(), purchase.getProductId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BillingItem billingItem = (BillingItem) next;
            if (billingItem != null) {
                numValueOf = Integer.valueOf(billingItem.getOldPrice());
            }
            arrayList.add(this$0.mapProductToRustoreBillingPurchaseRequest(context, productId, IntExtensionKt.getOrZero(numValueOf), str, str2));
        }
        mutableStateFlow.setValue(arrayList);
        UtilsKt.crashlyticsLog("Игрок авторизован при входе на сервер. Размер списка платежей: " + this$0._unconfirmedPayment.getValue().size());
    }

    public static final void getRustoreBillingPurchases$lambda$4$lambda$3(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("getPurchases addOnFailureListener " + t);
    }

    public static final void getRustoreBillingPurchases$lambda$5(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("getAuthorizationStatus addOnFailureListener " + t);
    }

    public final void getRustoreBillingPurchasesWithoutRequirementAuthorization(@NotNull final Context context) {
        PurchasesUseCase purchases;
        Task<List<Purchase>> purchases2;
        Task<List<Purchase>> taskAddOnSuccessListener;
        Intrinsics.checkNotNullParameter(context, "context");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (purchases2 = purchases.getPurchases()) == null || (taskAddOnSuccessListener = purchases2.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda4
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.m972xe5478b80(this.f$0, context, (List) obj);
            }
        })) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda5
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.m973xe5478b81(th);
            }
        });
    }

    /* renamed from: getRustoreBillingPurchasesWithoutRequirementAuthorization$lambda$8 */
    public static final void m972xe5478b80(RustoreBillingClientWrapper this$0, Context context, List purchaseList) {
        Integer numValueOf;
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        MutableStateFlow<List<RustoreBillingPurchaseRequest>> mutableStateFlow = this$0._unconfirmedPayment;
        List<Purchase> list = purchaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Purchase purchase : list) {
            String productId = purchase.getProductId();
            String invoiceId = purchase.getInvoiceId();
            String str = invoiceId == null ? "" : invoiceId;
            String purchaseId = purchase.getPurchaseId();
            String str2 = purchaseId == null ? "" : purchaseId;
            Iterator<T> it = BillingInfo.INSTANCE.getBillingObj().iterator();
            while (true) {
                numValueOf = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((BillingItem) next).getProductId(), purchase.getProductId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BillingItem billingItem = (BillingItem) next;
            if (billingItem != null) {
                numValueOf = Integer.valueOf(billingItem.getOldPrice());
            }
            arrayList.add(this$0.mapProductToRustoreBillingPurchaseRequest(context, productId, IntExtensionKt.getOrZero(numValueOf), str, str2));
        }
        mutableStateFlow.setValue(arrayList);
        UtilsKt.crashlyticsLog("getRustoreBillingPurchasesWithoutRequirementAuthorization _unconfirmedPayment size " + this$0._unconfirmedPayment.getValue().size());
    }

    /* renamed from: getRustoreBillingPurchasesWithoutRequirementAuthorization$lambda$9 */
    public static final void m973xe5478b81(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("getRustoreBillingPurchasesWithoutRequirementAuthorization addOnFailureListener " + t);
    }

    public final void purchaseProduct(@NotNull final String productId, @NotNull final FragmentActivity activity, @Nullable final Integer price) {
        Task<PaymentResult> taskPurchaseProduct;
        Task<PaymentResult> taskAddOnSuccessListener;
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(activity, "activity");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        PurchasesUseCase purchases = ruStoreBillingClient != null ? ruStoreBillingClient.getPurchases() : null;
        if (purchases == null || (taskPurchaseProduct = purchases.purchaseProduct(productId, UUID.randomUUID().toString(), 1, null)) == null || (taskAddOnSuccessListener = taskPurchaseProduct.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda12
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.purchaseProduct$lambda$12(this.f$0, price, activity, productId, (PaymentResult) obj);
            }
        })) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda13
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.purchaseProduct$lambda$13(th);
            }
        });
    }

    public static final void purchaseProduct$lambda$12(final RustoreBillingClientWrapper this$0, final Integer num, final FragmentActivity activity, final String productId, final PaymentResult paymentResult) {
        PurchasesUseCase purchases;
        Task<Purchase> purchaseInfo;
        Task<Purchase> taskAddOnSuccessListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(productId, "$productId");
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        if (Intrinsics.areEqual(paymentResult, PaymentResult.InvalidPaymentState.INSTANCE)) {
            UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: PaymentResult.InvalidPaymentState");
            return;
        }
        if (paymentResult instanceof PaymentResult.Cancelled) {
            UtilsKt.crashlyticsLog("Rustore: purchaseProduct: PaymentResult.Cancelled " + ((PaymentResult.Cancelled) paymentResult).getPurchaseId() + " ");
            return;
        }
        if (paymentResult instanceof PaymentResult.Failure) {
            PaymentResult.Failure failure = (PaymentResult.Failure) paymentResult;
            UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: PaymentResult.Failure " + failure.getErrorCode() + " " + failure.getOrderId());
            return;
        }
        if (paymentResult instanceof PaymentResult.Success) {
            UtilsKt.crashlyticsLog("purchaseProduct: Success " + paymentResult);
            RuStoreBillingClient ruStoreBillingClient = this$0.billingClient;
            if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (purchaseInfo = purchases.getPurchaseInfo(((PaymentResult.Success) paymentResult).getPurchaseId())) == null || (taskAddOnSuccessListener = purchaseInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda6
                @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    RustoreBillingClientWrapper.purchaseProduct$lambda$12$lambda$10(paymentResult, this$0, num, activity, productId, (Purchase) obj);
                }
            })) == null) {
                return;
            }
            taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda7
                @Override // ru.rustore.sdk.core.tasks.OnFailureListener
                public final void onFailure(Throwable th) {
                    RustoreBillingClientWrapper.purchaseProduct$lambda$12$lambda$11(paymentResult, th);
                }
            });
        }
    }

    public static final void purchaseProduct$lambda$12$lambda$10(PaymentResult paymentResult, RustoreBillingClientWrapper this$0, Integer num, FragmentActivity activity, String productId, Purchase purchase) {
        Intrinsics.checkNotNullParameter(paymentResult, "$paymentResult");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(productId, "$productId");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        UtilsKt.crashlyticsLog("purchaseProduct:getPurchaseInfo: Success " + paymentResult + " " + purchase);
        if (purchase.getPurchaseState() != PurchaseState.INVOICE_CREATED) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this$0.unconfirmedPayment.getValue());
            if (num != null) {
                PaymentResult.Success success = (PaymentResult.Success) paymentResult;
                arrayList.add(this$0.mapProductToRustoreBillingPurchaseRequest(activity, productId, num.intValue(), success.getInvoiceId(), success.getPurchaseId()));
            } else {
                PaymentResult.Success success2 = (PaymentResult.Success) paymentResult;
                UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: getPurchaseInfo: price == null paymentResult.invoiceId " + success2.getInvoiceId() + " purchaseId " + success2.getPurchaseId());
            }
            UtilsKt.crashlyticsLog("purchaseProduct:getPurchaseInfo: Success список: " + arrayList);
            this$0._unconfirmedPayment.setValue(arrayList);
        }
    }

    public static final void purchaseProduct$lambda$12$lambda$11(PaymentResult paymentResult, Throwable throwable) {
        Intrinsics.checkNotNullParameter(paymentResult, "$paymentResult");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: getPurchaseInfo: addOnFailureListener purchaseId" + ((PaymentResult.Success) paymentResult).getPurchaseId() + " " + throwable);
    }

    public static final void purchaseProduct$lambda$13(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UtilsKt.crashlyticsRecordNewException("Rustore: purchaseProduct: addOnFailureListener " + throwable);
    }

    public final void deleteRequestAfterSuccessOrError(@NotNull final String purchaseId) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.unconfirmedPayment.getValue());
        final Function1<RustoreBillingPurchaseRequest, Boolean> function1 = new Function1<RustoreBillingPurchaseRequest, Boolean>() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$deleteRequestAfterSuccessOrError$payment$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RustoreBillingPurchaseRequest it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Intrinsics.areEqual(it.getPurchaseId(), purchaseId));
            }
        };
        arrayList.removeIf(new Predicate() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda14
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return RustoreBillingClientWrapper.deleteRequestAfterSuccessOrError$lambda$16$lambda$15(function1, obj);
            }
        });
        this._unconfirmedPayment.setValue(arrayList);
    }

    public static final boolean deleteRequestAfterSuccessOrError$lambda$16$lambda$15(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    public final void confirmPurchase(@NotNull final String purchaseId) {
        PurchasesUseCase purchases;
        Task taskConfirmPurchase$default;
        Task taskAddOnSuccessListener;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (taskConfirmPurchase$default = PurchasesUseCase.confirmPurchase$default(purchases, purchaseId, null, 2, null)) == null || (taskAddOnSuccessListener = taskConfirmPurchase$default.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda10
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.confirmPurchase$lambda$17(purchaseId, (Unit) obj);
            }
        })) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda11
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.confirmPurchase$lambda$18(th);
            }
        });
    }

    public static final void confirmPurchase$lambda$17(String purchaseId, Unit it) {
        Intrinsics.checkNotNullParameter(purchaseId, "$purchaseId");
        Intrinsics.checkNotNullParameter(it, "it");
        UtilsKt.crashlyticsLog("confirmPurchase " + purchaseId);
    }

    public static final void confirmPurchase$lambda$18(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("confirmPurchase: FAILURE " + t);
    }

    public final void deletePurchase(@NotNull final String purchaseId) {
        PurchasesUseCase purchases;
        Task<Unit> taskDeletePurchase;
        Task<Unit> taskAddOnSuccessListener;
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient == null || (purchases = ruStoreBillingClient.getPurchases()) == null || (taskDeletePurchase = purchases.deletePurchase(purchaseId)) == null || (taskAddOnSuccessListener = taskDeletePurchase.addOnSuccessListener(new OnSuccessListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda0
            @Override // ru.rustore.sdk.core.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RustoreBillingClientWrapper.deletePurchase$lambda$19(purchaseId, (Unit) obj);
            }
        })) == null) {
            return;
        }
        taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener() { // from class: com.blackhub.bronline.game.core.utils.payment.rustore.RustoreBillingClientWrapper$$ExternalSyntheticLambda1
            @Override // ru.rustore.sdk.core.tasks.OnFailureListener
            public final void onFailure(Throwable th) {
                RustoreBillingClientWrapper.deletePurchase$lambda$20(purchaseId, th);
            }
        });
    }

    public static final void deletePurchase$lambda$19(String purchaseId, Unit it) {
        Intrinsics.checkNotNullParameter(purchaseId, "$purchaseId");
        Intrinsics.checkNotNullParameter(it, "it");
        UtilsKt.crashlyticsLog("deletePurchase addOnSuccessListener " + purchaseId);
    }

    public static final void deletePurchase$lambda$20(String purchaseId, Throwable t) {
        Intrinsics.checkNotNullParameter(purchaseId, "$purchaseId");
        Intrinsics.checkNotNullParameter(t, "t");
        UtilsKt.crashlyticsRecordNewException("deletePurchase addOnFailureListener " + t + " " + purchaseId);
    }

    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        RuStoreBillingClient ruStoreBillingClient = this.billingClient;
        if (ruStoreBillingClient != null) {
            ruStoreBillingClient.onNewIntent(intent);
        }
    }

    public final RustoreBillingPurchaseRequest mapProductToRustoreBillingPurchaseRequest(Context context, String productId, int price, String invoiceId, String purchaseId) {
        String string = Preferences.getString(context, NewMenuConstants.PLAYERS_NICK);
        String string2 = Preferences.getString(context, Preferences.USER_APPMETRICA_DEVICE_ID);
        if (string2.length() == 0) {
            string2 = null;
        }
        String str = string2;
        int integer = Preferences.getInteger(context, Preferences.USER_SERVER, -2);
        int integer2 = Preferences.getInteger(context, Preferences.USER_ACCOUNT_ID, -1);
        if (integer < 200) {
            integer++;
        }
        int i = integer;
        Intrinsics.checkNotNull(string);
        return new RustoreBillingPurchaseRequest(string, integer2, productId, i, price, invoiceId, str, purchaseId);
    }
}

