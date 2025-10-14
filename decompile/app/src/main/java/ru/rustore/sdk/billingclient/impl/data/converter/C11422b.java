package ru.rustore.sdk.billingclient.impl.data.converter;

import com.sdkit.paylib.paylibpayment.api.network.entity.purchases.PurchaseState;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.model.product.ProductType;
import ru.rustore.sdk.billingclient.model.purchase.Purchase;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.converter.b */
/* loaded from: classes5.dex */
public final class C11422b {

    /* renamed from: ru.rustore.sdk.billingclient.impl.data.converter.b$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10203a;

        static {
            int[] iArr = new int[PurchaseState.values().length];
            try {
                iArr[PurchaseState.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseState.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseState.PAID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseState.INVOICE_CREATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseState.CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchaseState.CONSUMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchaseState.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PurchaseState.TERMINATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PurchaseState.PAUSED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f10203a = iArr;
        }
    }

    /* renamed from: a */
    public static final Purchase m7442a(com.sdkit.paylib.paylibpayment.api.network.entity.purchases.Purchase purchase, long j, boolean z) {
        ProductType productType;
        ru.rustore.sdk.billingclient.model.purchase.PurchaseState purchaseState;
        ru.rustore.sdk.billingclient.model.purchase.PurchaseState purchaseState2;
        String str;
        String string;
        ru.rustore.sdk.billingclient.model.purchase.PurchaseState purchaseState3;
        ProductType productType2;
        String purchaseId = purchase.getPurchaseId();
        String productId = purchase.getProductId();
        com.sdkit.paylib.paylibpayment.api.network.entity.products.ProductType productType3 = purchase.getProductType();
        if (productType3 != null) {
            Intrinsics.checkNotNullParameter(productType3, "<this>");
            int i = C11421a.f10201a[productType3.ordinal()];
            if (i == 1) {
                productType2 = ProductType.NON_CONSUMABLE;
            } else if (i == 2) {
                productType2 = ProductType.CONSUMABLE;
            } else if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                productType = null;
            } else {
                productType2 = ProductType.SUBSCRIPTION;
            }
            productType = productType2;
        } else {
            productType = null;
        }
        String invoiceId = purchase.getInvoiceId();
        String language = purchase.getLanguage();
        Date purchaseTime = purchase.getPurchaseTime();
        String orderId = purchase.getOrderId();
        String amountLabel = purchase.getAmountLabel();
        Integer amount = purchase.getAmount();
        String currency = purchase.getCurrency();
        Integer quantity = purchase.getQuantity();
        PurchaseState purchaseState4 = purchase.getPurchaseState();
        if (purchaseState4 != null) {
            Intrinsics.checkNotNullParameter(purchaseState4, "<this>");
            switch (a.f10203a[purchaseState4.ordinal()]) {
                case 1:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.CONFIRMED;
                    break;
                case 2:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.CREATED;
                    break;
                case 3:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.PAID;
                    break;
                case 4:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.INVOICE_CREATED;
                    break;
                case 5:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.CANCELLED;
                    break;
                case 6:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.CONSUMED;
                    break;
                case 7:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.CLOSED;
                    break;
                case 8:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.TERMINATED;
                    break;
                case 9:
                    purchaseState3 = ru.rustore.sdk.billingclient.model.purchase.PurchaseState.PAUSED;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            purchaseState = purchaseState3;
        } else {
            purchaseState = null;
        }
        String developerPayload = purchase.getDeveloperPayload();
        String invoiceId2 = purchase.getInvoiceId();
        if (invoiceId2 != null) {
            Intrinsics.checkNotNullParameter(invoiceId2, "invoiceId");
            StringBuilder sb = new StringBuilder();
            sb.append(invoiceId2);
            sb.append('.');
            purchaseState2 = purchaseState;
            str = developerPayload;
            sb.append(j);
            string = sb.toString();
        } else {
            purchaseState2 = purchaseState;
            str = developerPayload;
            string = null;
        }
        return new Purchase(purchaseId, productId, productType, invoiceId, language, purchaseTime, orderId, amountLabel, amount, currency, quantity, purchaseState2, str, string, z);
    }
}
