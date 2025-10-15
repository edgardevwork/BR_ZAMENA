package ru.rustore.sdk.billingclient.impl.data.repository;

import android.net.Uri;
import com.sdkit.paylib.paylibpayment.api.network.entity.products.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.impl.data.converter.C11421a;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11449d;
import ru.rustore.sdk.billingclient.model.product.ProductStatus;
import ru.rustore.sdk.billingclient.model.product.ProductSubscription;
import ru.rustore.sdk.billingclient.model.product.ProductType;
import ru.rustore.sdk.billingclient.model.product.SubscriptionPeriod;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.l */
/* loaded from: classes8.dex */
public final /* synthetic */ class C11484l extends FunctionReferenceImpl implements Function1<List<? extends Product>, List<? extends ru.rustore.sdk.billingclient.model.product.Product>> {
    public C11484l(C11449d c11449d) {
        super(1, c11449d, C11449d.class, "mapToModel", "mapToModel(Ljava/util/List;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends ru.rustore.sdk.billingclient.model.product.Product> invoke(List<? extends Product> list) {
        ProductType productType;
        ProductStatus productStatus;
        Iterator it;
        ProductSubscription productSubscription;
        SubscriptionPeriod subscriptionPeriod;
        List<? extends Product> products = list;
        Intrinsics.checkNotNullParameter(products, "p0");
        ((C11449d) this.receiver).getClass();
        Intrinsics.checkNotNullParameter(products, "products");
        ArrayList arrayList = new ArrayList();
        for (Object obj : products) {
            if (((Product) obj).getProductType() != com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType.APPLICATION) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Product product = (Product) it2.next();
            Intrinsics.checkNotNullParameter(product, "<this>");
            String productId = product.getProductId();
            com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType productType2 = product.getProductType();
            if (productType2 != null) {
                Intrinsics.checkNotNullParameter(productType2, "<this>");
                int i = C11421a.f10201a[productType2.ordinal()];
                if (i == 1) {
                    productType = ProductType.NON_CONSUMABLE;
                } else if (i == 2) {
                    productType = ProductType.CONSUMABLE;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productType = null;
                } else {
                    productType = ProductType.SUBSCRIPTION;
                }
            } else {
                productType = null;
            }
            int i2 = C11421a.f10202b[product.getProductStatus().ordinal()];
            if (i2 == 1) {
                productStatus = ProductStatus.ACTIVE;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                productStatus = ProductStatus.INACTIVE;
            }
            ProductStatus productStatus2 = productStatus;
            String priceLabel = product.getPriceLabel();
            Integer price = product.getPrice();
            String currency = product.getCurrency();
            String language = product.getLanguage();
            String title = product.getTitle();
            String description = product.getDescription();
            Uri imageUrl = product.getImageUrl();
            Uri promoImageUrl = product.getPromoImageUrl();
            com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductSubscription subscription = product.getSubscription();
            if (subscription != null) {
                com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod subscriptionPeriod2 = subscription.getSubscriptionPeriod();
                if (subscriptionPeriod2 != null) {
                    it = it2;
                    subscriptionPeriod = new SubscriptionPeriod(subscriptionPeriod2.getYears(), subscriptionPeriod2.getMonths(), subscriptionPeriod2.getDays());
                } else {
                    it = it2;
                    subscriptionPeriod = null;
                }
                com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod freeTrialPeriod = subscription.getFreeTrialPeriod();
                SubscriptionPeriod subscriptionPeriod3 = freeTrialPeriod != null ? new SubscriptionPeriod(freeTrialPeriod.getYears(), freeTrialPeriod.getMonths(), freeTrialPeriod.getDays()) : null;
                com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod gracePeriod = subscription.getGracePeriod();
                SubscriptionPeriod subscriptionPeriod4 = gracePeriod != null ? new SubscriptionPeriod(gracePeriod.getYears(), gracePeriod.getMonths(), gracePeriod.getDays()) : null;
                String introductoryPrice = subscription.getIntroductoryPrice();
                String introductoryPriceAmount = subscription.getIntroductoryPriceAmount();
                com.sdkit.paylib.paylibpayment.api.network.entity.products.SubscriptionPeriod introductoryPricePeriod = subscription.getIntroductoryPricePeriod();
                productSubscription = new ProductSubscription(subscriptionPeriod, subscriptionPeriod3, subscriptionPeriod4, introductoryPrice, introductoryPriceAmount, introductoryPricePeriod != null ? new SubscriptionPeriod(introductoryPricePeriod.getYears(), introductoryPricePeriod.getMonths(), introductoryPricePeriod.getDays()) : null);
            } else {
                it = it2;
                productSubscription = null;
            }
            arrayList2.add(new ru.rustore.sdk.billingclient.model.product.Product(productId, productType, productStatus2, priceLabel, price, currency, language, title, description, imageUrl, promoImageUrl, productSubscription));
            it2 = it;
        }
        return arrayList2;
    }
}
