package com.sdkit.paylib.paylibpayment.api.p037di;

import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.bistro.BistroNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.products.ProductsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibpayment/api/di/PaylibPaymentTools;", "", "applicationNetworkClient", "Lcom/sdkit/paylib/paylibpayment/api/network/applications/ApplicationsNetworkClient;", "getApplicationNetworkClient", "()Lcom/sdkit/paylib/paylibpayment/api/network/applications/ApplicationsNetworkClient;", "bistroNetworkClient", "Lcom/sdkit/paylib/paylibpayment/api/network/bistro/BistroNetworkClient;", "getBistroNetworkClient", "()Lcom/sdkit/paylib/paylibpayment/api/network/bistro/BistroNetworkClient;", "cardsNetworkClient", "Lcom/sdkit/paylib/paylibpayment/api/network/cards/CardsNetworkClient;", "getCardsNetworkClient", "()Lcom/sdkit/paylib/paylibpayment/api/network/cards/CardsNetworkClient;", "invoiceNetworkClient", "Lcom/sdkit/paylib/paylibpayment/api/network/invoice/InvoiceNetworkClient;", "getInvoiceNetworkClient", "()Lcom/sdkit/paylib/paylibpayment/api/network/invoice/InvoiceNetworkClient;", "productsNetworkClient", "Lcom/sdkit/paylib/paylibpayment/api/network/products/ProductsNetworkClient;", "getProductsNetworkClient", "()Lcom/sdkit/paylib/paylibpayment/api/network/products/ProductsNetworkClient;", "purchasesNetworkClient", "Lcom/sdkit/paylib/paylibpayment/api/network/purchases/PurchasesNetworkClient;", "getPurchasesNetworkClient", "()Lcom/sdkit/paylib/paylibpayment/api/network/purchases/PurchasesNetworkClient;", "subscriptionsNetworkClient", "Lcom/sdkit/paylib/paylibpayment/api/network/subscriptions/SubscriptionsNetworkClient;", "getSubscriptionsNetworkClient", "()Lcom/sdkit/paylib/paylibpayment/api/network/subscriptions/SubscriptionsNetworkClient;", "com-sdkit-assistant_paylib_payment_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibPaymentTools {
    ApplicationsNetworkClient getApplicationNetworkClient();

    BistroNetworkClient getBistroNetworkClient();

    CardsNetworkClient getCardsNetworkClient();

    InvoiceNetworkClient getInvoiceNetworkClient();

    ProductsNetworkClient getProductsNetworkClient();

    PurchasesNetworkClient getPurchasesNetworkClient();

    SubscriptionsNetworkClient getSubscriptionsNetworkClient();
}
