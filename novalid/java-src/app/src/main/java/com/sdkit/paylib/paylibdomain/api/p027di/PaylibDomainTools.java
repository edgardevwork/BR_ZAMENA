package com.sdkit.paylib.paylibdomain.api.p027di;

import com.sdkit.paylib.paylibdomain.api.applications.ApplicationsInteractor;
import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.cards.CardsInteractor;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MobileBPaymentsInteractor;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MoblieBOtpCodeInteractor;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibdomain.api.products.ProductsInteractor;
import com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor;
import com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor;
import com.sdkit.paylib.paylibdomain.api.sbp.interactors.BanksInteractor;
import com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor;
import com.sdkit.paylib.paylibdomain.api.tbank.interactors.TBankAvailabilityInteractor;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0012\u00102\u001a\u000203X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010:\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020?X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0012\u0010B\u001a\u00020CX¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0012\u0010F\u001a\u00020GX¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006J"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdomain/api/di/PaylibDomainTools;", "", "applicationsInteractor", "Lcom/sdkit/paylib/paylibdomain/api/applications/ApplicationsInteractor;", "getApplicationsInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/applications/ApplicationsInteractor;", "banksInteractor", "Lcom/sdkit/paylib/paylibdomain/api/sbp/interactors/BanksInteractor;", "getBanksInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/sbp/interactors/BanksInteractor;", "cardsHolder", "Lcom/sdkit/paylib/paylibdomain/api/cards/CardsHolder;", "getCardsHolder", "()Lcom/sdkit/paylib/paylibdomain/api/cards/CardsHolder;", "cardsInteractor", "Lcom/sdkit/paylib/paylibdomain/api/cards/CardsInteractor;", "getCardsInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/cards/CardsInteractor;", "deeplinkSupportInteractor", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/interactors/DeeplinkSupportInteractor;", "getDeeplinkSupportInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/interactors/DeeplinkSupportInteractor;", "invoiceHolder", "Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoiceHolder;", "getInvoiceHolder", "()Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoiceHolder;", "invoicePaymentInteractor", "Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoicePaymentInteractor;", "getInvoicePaymentInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoicePaymentInteractor;", "invoicesInteractor", "Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoicesInteractor;", "getInvoicesInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoicesInteractor;", "moblieBOtpCodeInteractor", "Lcom/sdkit/paylib/paylibdomain/api/mobileb/interactors/MoblieBOtpCodeInteractor;", "getMoblieBOtpCodeInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/mobileb/interactors/MoblieBOtpCodeInteractor;", "moblieBPaymentsInteractor", "Lcom/sdkit/paylib/paylibdomain/api/mobileb/interactors/MobileBPaymentsInteractor;", "getMoblieBPaymentsInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/mobileb/interactors/MobileBPaymentsInteractor;", "paylibDeeplinkFactory", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/PaylibDeeplinkFactory;", "getPaylibDeeplinkFactory", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/PaylibDeeplinkFactory;", "paylibDeeplinkParser", "Lcom/sdkit/paylib/paylibdomain/api/deeplink/PaylibDeeplinkParser;", "getPaylibDeeplinkParser", "()Lcom/sdkit/paylib/paylibdomain/api/deeplink/PaylibDeeplinkParser;", "paymentMethodSelector", "Lcom/sdkit/paylib/paylibdomain/api/payment/PaymentMethodSelector;", "getPaymentMethodSelector", "()Lcom/sdkit/paylib/paylibdomain/api/payment/PaymentMethodSelector;", "productsInteractor", "Lcom/sdkit/paylib/paylibdomain/api/products/ProductsInteractor;", "getProductsInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/products/ProductsInteractor;", "purchasesInteractor", "Lcom/sdkit/paylib/paylibdomain/api/purchases/PurchasesInteractor;", "getPurchasesInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/purchases/PurchasesInteractor;", "sbolAccesabilityInteractor", "Lcom/sdkit/paylib/paylibdomain/api/sbol/interactors/SbolAvailabilityInteractor;", "getSbolAccesabilityInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/sbol/interactors/SbolAvailabilityInteractor;", "subscriptionsInteractor", "Lcom/sdkit/paylib/paylibdomain/api/subscriptions/SubscriptionsInteractor;", "getSubscriptionsInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/subscriptions/SubscriptionsInteractor;", "tBankAvailabilityInteractor", "Lcom/sdkit/paylib/paylibdomain/api/tbank/interactors/TBankAvailabilityInteractor;", "getTBankAvailabilityInteractor", "()Lcom/sdkit/paylib/paylibdomain/api/tbank/interactors/TBankAvailabilityInteractor;", "com-sdkit-assistant_paylib_domain_api"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public interface PaylibDomainTools {
    ApplicationsInteractor getApplicationsInteractor();

    BanksInteractor getBanksInteractor();

    CardsHolder getCardsHolder();

    CardsInteractor getCardsInteractor();

    DeeplinkSupportInteractor getDeeplinkSupportInteractor();

    InvoiceHolder getInvoiceHolder();

    InvoicePaymentInteractor getInvoicePaymentInteractor();

    InvoicesInteractor getInvoicesInteractor();

    MoblieBOtpCodeInteractor getMoblieBOtpCodeInteractor();

    MobileBPaymentsInteractor getMoblieBPaymentsInteractor();

    PaylibDeeplinkFactory getPaylibDeeplinkFactory();

    PaylibDeeplinkParser getPaylibDeeplinkParser();

    PaymentMethodSelector getPaymentMethodSelector();

    ProductsInteractor getProductsInteractor();

    PurchasesInteractor getPurchasesInteractor();

    SbolAvailabilityInteractor getSbolAccesabilityInteractor();

    SubscriptionsInteractor getSubscriptionsInteractor();

    TBankAvailabilityInteractor getTBankAvailabilityInteractor();
}
