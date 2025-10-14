package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.helpers.MessageFormatter;

/* renamed from: io.appmetrica.analytics.billingv6.impl.q */
/* loaded from: classes5.dex */
public final class C8711q extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8712r f6077a;

    /* renamed from: b */
    public final /* synthetic */ BillingResult f6078b;

    /* renamed from: c */
    public final /* synthetic */ List f6079c;

    public C8711q(C8712r c8712r, BillingResult billingResult, List list) {
        this.f6077a = c8712r;
        this.f6078b = billingResult;
        this.f6079c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0195  */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runSafety() {
        ProductInfo productInfo;
        String originalJson;
        String priceCurrencyCode;
        String originalJson2;
        C8712r c8712r = this.f6077a;
        BillingResult billingResult = this.f6078b;
        List<Purchase> list = this.f6079c;
        c8712r.getClass();
        if (billingResult.getResponseCode() == 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Purchase purchase : list) {
                Iterator<String> it = purchase.getProducts().iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), purchase);
                }
            }
            List<PurchaseHistoryRecord> list2 = c8712r.f6082c;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list2) {
                Iterator<String> it2 = purchaseHistoryRecord.getProducts().iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put(it2.next(), purchaseHistoryRecord);
                }
            }
            List<ProductDetails> list3 = c8712r.f6083d;
            ArrayList arrayList = new ArrayList();
            for (ProductDetails productDetails : list3) {
                PurchaseHistoryRecord purchaseHistoryRecord2 = (PurchaseHistoryRecord) linkedHashMap2.get(productDetails.getProductId());
                if (purchaseHistoryRecord2 != null) {
                    Purchase purchase2 = (Purchase) linkedHashMap.get(productDetails.getProductId());
                    String productType = productDetails.getProductType();
                    int iHashCode = productType.hashCode();
                    if (iHashCode != 3541555) {
                        if (iHashCode == 100343516 && productType.equals("inapp")) {
                            String productType2 = productDetails.getProductType();
                            ProductType productType3 = Intrinsics.areEqual(productType2, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(productType2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN;
                            String productId = productDetails.getProductId();
                            int quantity = purchaseHistoryRecord2.getQuantity();
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                            long priceAmountMicros = oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.getPriceAmountMicros() : 0L;
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails2 = productDetails.getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails2 == null || (priceCurrencyCode = oneTimePurchaseOfferDetails2.getPriceCurrencyCode()) == null) {
                                priceCurrencyCode = "";
                            }
                            productInfo = new ProductInfo(productType3, productId, quantity, priceAmountMicros, priceCurrencyCode, 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson2 = purchase2.getOriginalJson()) == null) ? MessageFormatter.DELIM_STR : originalJson2);
                        } else {
                            productInfo = null;
                        }
                    } else if (productType.equals("subs")) {
                        String productType4 = productDetails.getProductType();
                        productInfo = new ProductInfo(Intrinsics.areEqual(productType4, "inapp") ? ProductType.INAPP : Intrinsics.areEqual(productType4, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, productDetails.getProductId(), purchaseHistoryRecord2.getQuantity(), 0L, "", 0L, null, 1, null, purchaseHistoryRecord2.getSignature(), purchaseHistoryRecord2.getPurchaseToken(), purchaseHistoryRecord2.getPurchaseTime(), purchase2 != null ? purchase2.isAutoRenewing() : false, (purchase2 == null || (originalJson = purchase2.getOriginalJson()) == null) ? MessageFormatter.DELIM_STR : originalJson);
                    }
                }
                if (productInfo != null) {
                    arrayList.add(productInfo);
                }
            }
            c8712r.f6080a.getBillingInfoSender().sendInfo(arrayList);
            c8712r.f6081b.invoke();
        }
        C8712r c8712r2 = this.f6077a;
        c8712r2.f6084e.m4892a(c8712r2);
    }
}
