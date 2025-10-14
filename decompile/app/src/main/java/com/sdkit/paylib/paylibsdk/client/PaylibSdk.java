package com.sdkit.paylib.paylibsdk.client;

import com.sdkit.paylib.paylibdomain.api.applications.ApplicationsInteractor;
import com.sdkit.paylib.paylibdomain.api.cards.CardsInteractor;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicesInteractor;
import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.paylibdomain.api.products.ProductsInteractor;
import com.sdkit.paylib.paylibdomain.api.purchases.PurchasesInteractor;
import com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor;
import com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import dagger.Lazy;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\b\u0001\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u001a\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0010H\u0007J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001d¨\u0006*"}, m7105d2 = {"Lcom/sdkit/paylib/paylibsdk/client/PaylibSdk;", "", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeRouter;", "paylibNativeRouter", "Lcom/sdkit/paylib/paylibnative/api/presentation/PaylibNativeDeeplinkRouter;", "paylibNativeDeeplinkRouter", "Lcom/sdkit/paylib/paylibdomain/api/invoice/InvoicesInteractor;", "invoicesInteractor", "Lcom/sdkit/paylib/paylibdomain/api/cards/CardsInteractor;", "cardsInteractor", "Lcom/sdkit/paylib/paylibdomain/api/products/ProductsInteractor;", "productsInteractor", "Lcom/sdkit/paylib/paylibdomain/api/purchases/PurchasesInteractor;", "purchasesInteractor", "Lcom/sdkit/paylib/paylibdomain/api/subscriptions/SubscriptionsInteractor;", "subscriptionsInteractor", "Lcom/sdkit/paylib/paylibpayment/api/network/applications/ApplicationsNetworkClient;", "applicationNetworkClient", "Lcom/sdkit/paylib/paylibdomain/api/applications/ApplicationsInteractor;", "applicationsInteractor", "", "tag", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLogger;", "paylibLogger", "Lcom/sdkit/paylib/paylibdomain/api/sbol/interactors/SbolAvailabilityInteractor;", "sbolAccesabilityInteractor", "Ldagger/Lazy;", "Lcom/sdkit/paylib/payliblogging/api/di/PaylibLoggingTools;", "a", "Ldagger/Lazy;", "paylibLoggingToolsProvider", "Lcom/sdkit/paylib/paylibpayment/api/di/PaylibPaymentTools;", "b", "paylibPaymentToolsProvider", "Lcom/sdkit/paylib/paylibdomain/api/di/PaylibDomainTools;", "c", "paylibDomainToolsProvider", "Lcom/sdkit/paylib/paylibnative/api/di/PaylibNativeTools;", "d", "paylibNativeToolsProvider", SegmentConstantPool.INITSTRING, "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "com-sdkit-assistant_paylibsdk_client"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class PaylibSdk {

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy paylibLoggingToolsProvider;

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy paylibPaymentToolsProvider;

    /* renamed from: c, reason: from kotlin metadata */
    public final Lazy paylibDomainToolsProvider;

    /* renamed from: d, reason: from kotlin metadata */
    public final Lazy paylibNativeToolsProvider;

    @Inject
    public PaylibSdk(Lazy<PaylibLoggingTools> paylibLoggingToolsProvider, Lazy<PaylibPaymentTools> paylibPaymentToolsProvider, Lazy<PaylibDomainTools> paylibDomainToolsProvider, Lazy<PaylibNativeTools> paylibNativeToolsProvider) {
        Intrinsics.checkNotNullParameter(paylibLoggingToolsProvider, "paylibLoggingToolsProvider");
        Intrinsics.checkNotNullParameter(paylibPaymentToolsProvider, "paylibPaymentToolsProvider");
        Intrinsics.checkNotNullParameter(paylibDomainToolsProvider, "paylibDomainToolsProvider");
        Intrinsics.checkNotNullParameter(paylibNativeToolsProvider, "paylibNativeToolsProvider");
        this.paylibLoggingToolsProvider = paylibLoggingToolsProvider;
        this.paylibPaymentToolsProvider = paylibPaymentToolsProvider;
        this.paylibDomainToolsProvider = paylibDomainToolsProvider;
        this.paylibNativeToolsProvider = paylibNativeToolsProvider;
    }

    @Deprecated(message = "Use the new ApplicationsInteractor")
    public final ApplicationsNetworkClient applicationNetworkClient() {
        return ((PaylibPaymentTools) this.paylibPaymentToolsProvider.get()).getApplicationNetworkClient();
    }

    public final ApplicationsInteractor applicationsInteractor() {
        return ((PaylibDomainTools) this.paylibDomainToolsProvider.get()).getApplicationsInteractor();
    }

    public final CardsInteractor cardsInteractor() {
        return ((PaylibDomainTools) this.paylibDomainToolsProvider.get()).getCardsInteractor();
    }

    public final InvoicesInteractor invoicesInteractor() {
        return ((PaylibDomainTools) this.paylibDomainToolsProvider.get()).getInvoicesInteractor();
    }

    public final PaylibLogger paylibLogger(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return ((PaylibLoggingTools) this.paylibLoggingToolsProvider.get()).getLoggerFactory().get(tag);
    }

    public final PaylibNativeDeeplinkRouter paylibNativeDeeplinkRouter() {
        return ((PaylibNativeTools) this.paylibNativeToolsProvider.get()).getPaylibNativeDeeplinkRouter();
    }

    public final PaylibNativeRouter paylibNativeRouter() {
        return ((PaylibNativeTools) this.paylibNativeToolsProvider.get()).getPaylibNativeRouter();
    }

    public final ProductsInteractor productsInteractor() {
        return ((PaylibDomainTools) this.paylibDomainToolsProvider.get()).getProductsInteractor();
    }

    public final PurchasesInteractor purchasesInteractor() {
        return ((PaylibDomainTools) this.paylibDomainToolsProvider.get()).getPurchasesInteractor();
    }

    public final SbolAvailabilityInteractor sbolAccesabilityInteractor() {
        return ((PaylibDomainTools) this.paylibDomainToolsProvider.get()).getSbolAccesabilityInteractor();
    }

    public final SubscriptionsInteractor subscriptionsInteractor() {
        return ((PaylibDomainTools) this.paylibDomainToolsProvider.get()).getSubscriptionsInteractor();
    }
}
