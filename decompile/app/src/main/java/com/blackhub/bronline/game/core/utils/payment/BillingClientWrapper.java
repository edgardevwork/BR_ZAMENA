package com.blackhub.bronline.game.core.utils.payment;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.blackhub.bronline.game.core.constants.LogTagConstants;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.core.utils.payment.model.BillingPurchaseRequest;
import com.blackhub.bronline.game.gui.donate.data.BillingItem;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.launcher.Settings;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BillingClientWrapper.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u001e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\bH\u0002J\u0006\u0010'\u001a\u00020\u001bJ\b\u0010(\u001a\u00020\u001bH\u0002J\u0010\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020&H\u0002J\u001e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110/H\u0016J \u00100\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010/H\u0016J\u0010\u00102\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020&H\u0002J\u0016\u0010*\u001a\u00020\u001b2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0011J\u000e\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u000208J\u001e\u00109\u001a\u00020\u001b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0/2\u0006\u00107\u001a\u00020\u0002H\u0002J(\u0010<\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020!2\b\b\u0002\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b0@H\u0002J\u001e\u0010A\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020!2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001b0@H\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006B"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/BillingClientWrapper;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/ProductDetailsResponseListener;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_unconfirmedPayment", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/blackhub/bronline/game/core/utils/payment/model/BillingPurchaseRequest;", "getApplication", "()Landroid/app/Application;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "handlerReconnect", "Landroid/os/Handler;", "localProductDetails", "Lcom/android/billingclient/api/ProductDetails;", "onPurchaseListener", "Lcom/blackhub/bronline/game/core/utils/payment/OnPurchaseListener;", "requestCounter", "", "unconfirmedPayment", "Lkotlinx/coroutines/flow/StateFlow;", "getUnconfirmedPayment", "()Lkotlinx/coroutines/flow/StateFlow;", "checkCurrencyByRub", "", "products", "createBillingClient", "deleteRequestAfterSuccessOrError", "endConnection", "getPurchaseState", "", "purchaseState", "handlePurchases", "funName", "purchases", "Lcom/android/billingclient/api/Purchase;", "initBillingClient", "initHandlers", "mapProductDetailToResponse", FirebaseAnalytics.Event.PURCHASE, "onProductDetailsResponse", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "productDetailsList", "", "onPurchasesUpdated", "purchaseList", "processPurchase", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "productDetails", "queryProducts", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/blackhub/bronline/game/core/utils/payment/OnQueryProductsListener;", "queryProductsForType", "productList", "Lcom/android/billingclient/api/QueryProductDetailsParams$Product;", "reconnectToBillingService", "retryDelayMillis", "", "block", "Lkotlin/Function0;", "startConnection", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBillingClientWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingClientWrapper.kt\ncom/blackhub/bronline/game/core/utils/payment/BillingClientWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,444:1\n1855#2,2:445\n1549#2:447\n1620#2,2:448\n288#2,2:450\n1622#2:452\n1194#2,2:453\n1222#2,4:455\n1855#2,2:459\n288#2,2:461\n288#2,2:463\n1045#2:465\n*S KotlinDebug\n*F\n+ 1 BillingClientWrapper.kt\ncom/blackhub/bronline/game/core/utils/payment/BillingClientWrapper\n*L\n80#1:445,2\n88#1:447\n88#1:448,2\n89#1:450,2\n88#1:452\n114#1:453,2\n114#1:455,4\n142#1:459,2\n408#1:461,2\n422#1:463,2\n159#1:465\n*E\n"})
/* loaded from: classes2.dex */
public final class BillingClientWrapper implements PurchasesUpdatedListener, ProductDetailsResponseListener {
    public static final int $stable = 8;

    @NotNull
    public final MutableStateFlow<List<BillingPurchaseRequest>> _unconfirmedPayment;

    @NotNull
    public final Application application;

    @Nullable
    public BillingClient billingClient;

    @Nullable
    public Handler handlerReconnect;

    @NotNull
    public List<ProductDetails> localProductDetails;

    @Nullable
    public OnPurchaseListener onPurchaseListener;
    public int requestCounter;

    @NotNull
    public final StateFlow<List<BillingPurchaseRequest>> unconfirmedPayment;

    @Inject
    public BillingClientWrapper(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.localProductDetails = CollectionsKt__CollectionsKt.emptyList();
        MutableStateFlow<List<BillingPurchaseRequest>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this._unconfirmedPayment = MutableStateFlow;
        this.unconfirmedPayment = FlowKt.asStateFlow(MutableStateFlow);
        initBillingClient();
    }

    @NotNull
    public final Application getApplication() {
        return this.application;
    }

    @NotNull
    public final StateFlow<List<BillingPurchaseRequest>> getUnconfirmedPayment() {
        return this.unconfirmedPayment;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(@NotNull BillingResult billingResult, @Nullable List<Purchase> purchaseList) {
        String str;
        Object next;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        List listEmptyList = null;
        if (responseCode == 0) {
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.onPurchasesUpdated, Покупка прошла успешно, обрабатываем платеж, purchaseList.size=" + (purchaseList != null ? Integer.valueOf(purchaseList.size()) : null), LogTagConstants.MARKET_BILLING_TAG);
            if (purchaseList == null) {
                OnPurchaseListener onPurchaseListener = this.onPurchaseListener;
                if (onPurchaseListener != null) {
                    onPurchaseListener.onPurchaseSuccess(null);
                    return;
                }
                return;
            }
            Iterator<T> it = purchaseList.iterator();
            while (it.hasNext()) {
                processPurchase((Purchase) it.next());
            }
            return;
        }
        if (responseCode == 7) {
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper.onPurchasesUpdated, responseCode=BillingClient.BillingResponseCode.ITEM_ALREADY_OWNED", LogTagConstants.MARKET_BILLING_TAG);
            return;
        }
        if (purchaseList != null) {
            List<Purchase> list = purchaseList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Purchase purchase : list) {
                Iterator<T> it2 = this.localProductDetails.iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    String productId = ((ProductDetails) next).getProductId();
                    List<String> products = purchase.getProducts();
                    Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
                    String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull((List) products);
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (Intrinsics.areEqual(productId, str2)) {
                        break;
                    }
                }
                ProductDetails productDetails = (ProductDetails) next;
                String priceCurrencyCode = (productDetails == null || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null) ? null : oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                if (priceCurrencyCode != null) {
                    str = priceCurrencyCode;
                }
                arrayList.add(str);
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper.onPurchasesUpdated, responseCode=other, error occurred or user canceled, region=" + Settings.COUNTRY_MARKET_BY_TELEPHONE_MANAGER + ", allCurrency=" + listEmptyList, LogTagConstants.MARKET_BILLING_TAG);
        OnPurchaseListener onPurchaseListener2 = this.onPurchaseListener;
        if (onPurchaseListener2 != null) {
            int responseCode2 = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
            onPurchaseListener2.onPurchaseFailure(new BillingError(responseCode2, debugMessage));
        }
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(@NotNull BillingResult billingResult, @NotNull List<ProductDetails> productDetailsList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        if (responseCode == 0) {
            Map mapEmptyMap = MapsKt__MapsKt.emptyMap();
            if (productDetailsList.isEmpty()) {
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper.onProductDetailsResponse, productDetailsList empty", LogTagConstants.MARKET_BILLING_TAG);
            } else {
                List<ProductDetails> list = productDetailsList;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj : list) {
                    String productId = ((ProductDetails) obj).getProductId();
                    Intrinsics.checkNotNullExpressionValue(productId, "getProductId(...)");
                    linkedHashMap.put(productId, obj);
                }
                mapEmptyMap = linkedHashMap;
            }
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.onProductDetailsResponse, newMap.size=" + mapEmptyMap.size(), LogTagConstants.MARKET_BILLING_TAG);
            return;
        }
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper.onProductDetailsResponse, onProductDetailsResponse code=" + responseCode + ", message=" + debugMessage, LogTagConstants.MARKET_BILLING_TAG);
    }

    public final void initBillingClient() {
        if (com.blackhub.bronline.game.core.utils.UtilsKt.isMarketBuildVariant() && this.billingClient == null) {
            endConnection();
            createBillingClient();
            initHandlers();
        }
    }

    public final void queryProducts(@NotNull final OnQueryProductsListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = BillingInfo.INSTANCE.getBillingObj().iterator();
        while (it.hasNext()) {
            QueryProductDetailsParams.Product productBuild = QueryProductDetailsParams.Product.newBuilder().setProductId(((BillingItem) it.next()).getProductId()).setProductType("inapp").build();
            Intrinsics.checkNotNullExpressionValue(productBuild, "build(...)");
            arrayList.add(productBuild);
        }
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.queryProducts, productList.size=" + arrayList.size(), LogTagConstants.MARKET_BILLING_TAG);
        queryProductsForType(arrayList, new ProductDetailsResponseListener() { // from class: com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                BillingClientWrapper.queryProducts$lambda$5(this.f$0, listener, billingResult, list);
            }
        });
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new PurchasesResponseListener() { // from class: com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper$$ExternalSyntheticLambda1
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    BillingClientWrapper.queryProducts$lambda$6(this.f$0, billingResult, list);
                }
            });
        }
    }

    public static final void queryProducts$lambda$5(BillingClientWrapper this$0, OnQueryProductsListener listener, BillingResult billingResult, List productDetailsList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsList, "productDetailsList");
        if (billingResult.getResponseCode() == 0) {
            com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.queryProducts, OK, size " + productDetailsList.size(), LogTagConstants.MARKET_BILLING_TAG);
            List<ProductDetails> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.distinct(productDetailsList), new Comparator() { // from class: com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper$queryProducts$lambda$5$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = ((ProductDetails) t).getOneTimePurchaseOfferDetails();
                    String formattedPrice = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getFormattedPrice() : null;
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = ((ProductDetails) t2).getOneTimePurchaseOfferDetails();
                    return ComparisonsKt__ComparisonsKt.compareValues(formattedPrice, oneTimePurchaseOfferDetails2 != null ? oneTimePurchaseOfferDetails2.getFormattedPrice() : null);
                }
            });
            this$0.localProductDetails = listSortedWith;
            this$0.checkCurrencyByRub(listSortedWith);
            listener.onSuccess(listSortedWith);
            return;
        }
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper.queryProducts, listener.onFailure, code=" + billingResult.getResponseCode() + ", message=" + billingResult.getDebugMessage(), LogTagConstants.MARKET_BILLING_TAG);
        int responseCode = billingResult.getResponseCode();
        String debugMessage = billingResult.getDebugMessage();
        Intrinsics.checkNotNullExpressionValue(debugMessage, "getDebugMessage(...)");
        listener.onFailure(new BillingError(responseCode, debugMessage));
    }

    public static final void queryProducts$lambda$6(BillingClientWrapper this$0, BillingResult billingResult, List purchases) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        this$0.handlePurchases("queryProducts", purchases);
    }

    public final void purchase(@NotNull final Activity activity, @NotNull final ProductDetails productDetails) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        startConnection(FirebaseAnalytics.Event.PURCHASE, new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper.purchase.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BillingFlowParams billingFlowParamsBuild = BillingFlowParams.newBuilder().setProductDetailsParamsList(CollectionsKt__CollectionsJVMKt.listOf(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build())).build();
                Intrinsics.checkNotNullExpressionValue(billingFlowParamsBuild, "build(...)");
                BillingClient billingClient = this.billingClient;
                BillingResult billingResultLaunchBillingFlow = billingClient != null ? billingClient.launchBillingFlow(activity, billingFlowParamsBuild) : null;
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.purchase, productDetails=" + productDetails, LogTagConstants.MARKET_BILLING_TAG);
                if (billingResultLaunchBillingFlow != null && billingResultLaunchBillingFlow.getResponseCode() == 0) {
                    com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.purchase, BillingResponseCode.OK billingResult", LogTagConstants.MARKET_BILLING_TAG);
                    return;
                }
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper.purchase, billingResult?.responseCode != OK, billingResult.message=" + (billingResultLaunchBillingFlow != null ? billingResultLaunchBillingFlow.getDebugMessage() : null), LogTagConstants.MARKET_BILLING_TAG);
            }
        });
    }

    public final void endConnection() {
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.endConnection, Завершаем платежное соединение", LogTagConstants.MARKET_BILLING_TAG);
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.endConnection();
        }
        this.billingClient = null;
        Handler handler = this.handlerReconnect;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.handlerReconnect = null;
    }

    public final void deleteRequestAfterSuccessOrError() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.unconfirmedPayment.getValue());
        if (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        this._unconfirmedPayment.setValue(arrayList);
    }

    public final void createBillingClient() {
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.createBillingClient, BillingClientWrapper createBillingClient: создаем платежное соединение", LogTagConstants.MARKET_BILLING_TAG);
        this.billingClient = BillingClient.newBuilder(this.application).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(this).build();
    }

    public final void initHandlers() {
        this.handlerReconnect = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void reconnectToBillingService$default(BillingClientWrapper billingClientWrapper, String str, long j, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 3000;
        }
        billingClientWrapper.reconnectToBillingService(str, j, function0);
    }

    public final void reconnectToBillingService(final String funName, long retryDelayMillis, final Function0<Unit> block) {
        if (retryDelayMillis != 0) {
            endConnection();
        }
        createBillingClient();
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.reconnectToBillingService, Попытка переподключения через " + retryDelayMillis + " миллисекунд", LogTagConstants.MARKET_BILLING_TAG);
        if (this.handlerReconnect == null) {
            initHandlers();
        }
        int i = this.requestCounter + 1;
        this.requestCounter = i;
        if (i < 3) {
            Handler handler = this.handlerReconnect;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BillingClientWrapper.reconnectToBillingService$lambda$9(this.f$0, funName, block);
                    }
                }, retryDelayMillis);
                return;
            }
            return;
        }
        this.requestCounter = 0;
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Превышен лимит запросов, будет старый UI", LogTagConstants.MARKET_BILLING_TAG);
    }

    public static final void reconnectToBillingService$lambda$9(BillingClientWrapper this$0, String funName, Function0 block) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(funName, "$funName");
        Intrinsics.checkNotNullParameter(block, "$block");
        this$0.startConnection(funName, block);
    }

    public final void queryProductsForType(final List<QueryProductDetailsParams.Product> productList, final ProductDetailsResponseListener listener) {
        startConnection("queryProductsForType", new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper.queryProductsForType.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.queryProductsForType, productList size " + productList.size(), LogTagConstants.MARKET_BILLING_TAG);
                QueryProductDetailsParams queryProductDetailsParamsBuild = QueryProductDetailsParams.newBuilder().setProductList(productList).build();
                Intrinsics.checkNotNullExpressionValue(queryProductDetailsParamsBuild, "build(...)");
                BillingClient billingClient = this.billingClient;
                if (billingClient != null) {
                    billingClient.queryProductDetailsAsync(queryProductDetailsParamsBuild, listener);
                }
            }
        });
    }

    public final void processPurchase(Purchase purchase) {
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.processPurchase, purchase = " + purchase, LogTagConstants.MARKET_BILLING_TAG);
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper.processPurchase, purchase.purchaseState = " + getPurchaseState(purchase.getPurchaseState()), LogTagConstants.MARKET_BILLING_TAG);
        if (purchase.getPurchaseState() == 1) {
            BillingPurchaseRequest billingPurchaseRequestMapProductDetailToResponse = mapProductDetailToResponse(purchase);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.unconfirmedPayment.getValue());
            arrayList.add(billingPurchaseRequestMapProductDetailToResponse);
            this._unconfirmedPayment.setValue(arrayList);
        }
    }

    public final void startConnection(final String funName, final Function0<Unit> block) {
        Unit unit;
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            billingClient.startConnection(new BillingClientStateListener() { // from class: com.blackhub.bronline.game.core.utils.payment.BillingClientWrapper.startConnection.1
                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingSetupFinished(@NotNull BillingResult billingResult) {
                    Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                    int responseCode = billingResult.getResponseCode();
                    if (responseCode != 12) {
                        switch (responseCode) {
                            case -2:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Функция не поддерживается", LogTagConstants.MARKET_BILLING_TAG);
                                break;
                            case -1:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Сервис отключен", LogTagConstants.MARKET_BILLING_TAG);
                                BillingClientWrapper.reconnectToBillingService$default(this, funName, 0L, block, 2, null);
                                break;
                            case 0:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper." + funName + ", Успешное подключение к BillingClient", LogTagConstants.MARKET_BILLING_TAG);
                                block.invoke();
                                this.requestCounter = 0;
                                break;
                            case 1:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper." + funName + ", Пользователь отменил подключение к BillingClient", LogTagConstants.MARKET_BILLING_TAG);
                                break;
                            case 2:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Сервис недоступен", LogTagConstants.MARKET_BILLING_TAG);
                                BillingClientWrapper.reconnectToBillingService$default(this, funName, 0L, block, 2, null);
                                break;
                            case 3:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Биллинг недоступен, вероятно из-за отсутствия авторизации в маркете", LogTagConstants.MARKET_BILLING_TAG);
                                BillingClientWrapper.reconnectToBillingService$default(this, funName, 0L, block, 2, null);
                                break;
                            case 4:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Товар недоступен", LogTagConstants.MARKET_BILLING_TAG);
                                break;
                            case 5:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Ошибка разработчика", LogTagConstants.MARKET_BILLING_TAG);
                                break;
                            case 6:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Общая ошибка", LogTagConstants.MARKET_BILLING_TAG);
                                break;
                            case 7:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Товар уже куплен", LogTagConstants.MARKET_BILLING_TAG);
                                break;
                            case 8:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Товар не куплен", LogTagConstants.MARKET_BILLING_TAG);
                                break;
                            default:
                                com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Неизвестный код ответа: " + billingResult.getResponseCode(), LogTagConstants.MARKET_BILLING_TAG);
                                break;
                        }
                    }
                    com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", Ошибка сети", LogTagConstants.MARKET_BILLING_TAG);
                    BillingClientWrapper.reconnectToBillingService$default(this, funName, 0L, block, 2, null);
                }

                @Override // com.android.billingclient.api.BillingClientStateListener
                public void onBillingServiceDisconnected() {
                    com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsRecordNewException("funName=BillingClientWrapper." + funName + ", BillingService отключен. Пытаемся переподключиться...", LogTagConstants.MARKET_BILLING_TAG);
                    BillingClientWrapper.reconnectToBillingService$default(this, funName, 0L, block, 2, null);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            reconnectToBillingService(funName, 0L, block);
        }
    }

    public final String getPurchaseState(int purchaseState) {
        if (purchaseState == 0) {
            return "Purchase.PurchaseState.UNSPECIFIED_STATE";
        }
        if (purchaseState == 1) {
            return "Purchase.PurchaseState.PURCHASED";
        }
        if (purchaseState == 2) {
            return "Purchase.PurchaseState.PENDING";
        }
        return "purchaseState unknown";
    }

    public final void handlePurchases(String funName, List<? extends Purchase> purchases) {
        com.blackhub.bronline.game.core.utils.UtilsKt.crashlyticsLog("funName=BillingClientWrapper." + funName + ", handlePurchases, purchases=" + purchases, LogTagConstants.MARKET_BILLING_TAG);
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Purchase> it = purchases.iterator();
        while (it.hasNext()) {
            arrayList.add(mapProductDetailToResponse(it.next()));
        }
        this._unconfirmedPayment.setValue(arrayList);
    }

    public final BillingPurchaseRequest mapProductDetailToResponse(Purchase purchase) {
        Object next;
        Object next2;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2;
        List<String> products = purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull((List) products);
        String str2 = str == null ? "" : str;
        Iterator<T> it = this.localProductDetails.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ProductDetails) next).getProductId(), str2)) {
                break;
            }
        }
        ProductDetails productDetails = (ProductDetails) next;
        String purchaseToken = purchase.getPurchaseToken();
        Intrinsics.checkNotNullExpressionValue(purchaseToken, "getPurchaseToken(...)");
        String string = Preferences.getString(this.application, NewMenuConstants.PLAYERS_NICK);
        int integer = Preferences.getInteger(this.application, Preferences.USER_SERVER, -1);
        if (integer < 200) {
            integer++;
        }
        int i = integer;
        String priceCurrencyCode = (productDetails == null || (oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails()) == null) ? null : oneTimePurchaseOfferDetails2.getPriceCurrencyCode();
        String str3 = priceCurrencyCode == null ? "" : priceCurrencyCode;
        String strValueOf = String.valueOf(FloatExtensionKt.getOrZero((productDetails == null || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null) ? null : Float.valueOf(oneTimePurchaseOfferDetails.getPriceAmountMicros())) / 1000000);
        Iterator<T> it2 = BillingInfo.INSTANCE.getBillingObj().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.areEqual(((BillingItem) next2).getProductId(), productDetails != null ? productDetails.getProductId() : null)) {
                break;
            }
        }
        BillingItem billingItem = (BillingItem) next2;
        int orZero = IntExtensionKt.getOrZero(billingItem != null ? Integer.valueOf(billingItem.getOldPrice()) : null);
        int integer2 = Preferences.getInteger(this.application, Preferences.USER_ACCOUNT_ID);
        Intrinsics.checkNotNull(string);
        return new BillingPurchaseRequest(purchaseToken, string, null, i, strValueOf, str3, orZero, null, str2, integer2, 132, null);
    }

    public final void checkCurrencyByRub(List<ProductDetails> products) {
        String lowerCase;
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        String priceCurrencyCode;
        ProductDetails productDetails = (ProductDetails) CollectionsKt___CollectionsKt.firstOrNull((List) products);
        if (productDetails == null || (oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails()) == null || (priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode()) == null) {
            lowerCase = null;
        } else {
            lowerCase = priceCurrencyCode.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        if (lowerCase == null) {
            lowerCase = "";
        }
        Settings.IS_RU_REGION = Intrinsics.areEqual(lowerCase, "rub");
    }
}
