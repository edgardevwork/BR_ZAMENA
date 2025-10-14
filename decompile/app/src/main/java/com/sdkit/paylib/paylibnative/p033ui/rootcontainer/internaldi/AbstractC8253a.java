package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi;

import android.content.Context;
import androidx.fragment.app.FragmentFactory;
import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.interactors.DeeplinkSupportInteractor;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MobileBPaymentsInteractor;
import com.sdkit.paylib.paylibdomain.api.mobileb.interactors.MoblieBOtpCodeInteractor;
import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.paylibdomain.api.sbol.interactors.SbolAvailabilityInteractor;
import com.sdkit.paylib.paylibdomain.api.sbp.interactors.BanksInteractor;
import com.sdkit.paylib.paylibdomain.api.subscriptions.SubscriptionsInteractor;
import com.sdkit.paylib.paylibdomain.api.tbank.interactors.TBankAvailabilityInteractor;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.analytics.C8095d;
import com.sdkit.paylib.paylibnative.p033ui.analytics.InterfaceC8097f;
import com.sdkit.paylib.paylibnative.p033ui.common.C8103b;
import com.sdkit.paylib.paylibnative.p033ui.common.C8104c;
import com.sdkit.paylib.paylibnative.p033ui.common.C8111f;
import com.sdkit.paylib.paylibnative.p033ui.common.error.C8109c;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import com.sdkit.paylib.paylibnative.p033ui.core.common.C8138c;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.InterfaceC8142a;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions.C8149c;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.actions.C8152f;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain.C8154b;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.domain.C8157e;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.models.C8165c;
import com.sdkit.paylib.paylibnative.p033ui.core.purchase.models.C8168f;
import com.sdkit.paylib.paylibnative.p033ui.core.sbolpay.C8173a;
import com.sdkit.paylib.paylibnative.p033ui.deviceauth.C8209d;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.InterfaceC8220b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8230d;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8241o;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8232f;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.InterfaceC8238l;
import com.sdkit.paylib.paylibnative.p033ui.p034di.C8212c;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8252f;
import com.sdkit.paylib.paylibnative.p033ui.routing.C8264d;
import com.sdkit.paylib.paylibnative.p033ui.routing.InternalPaylibRouter;
import com.sdkit.paylib.paylibnative.p033ui.screens.banks.C8267b;
import com.sdkit.paylib.paylibnative.p033ui.screens.banks.C8268c;
import com.sdkit.paylib.paylibnative.p033ui.screens.banks.C8269d;
import com.sdkit.paylib.paylibnative.p033ui.screens.banks.C8270e;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.C8275b;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.C8276c;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.C8277d;
import com.sdkit.paylib.paylibnative.p033ui.screens.cards.C8278e;
import com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving.C8282a;
import com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving.C8283b;
import com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving.C8284c;
import com.sdkit.paylib.paylibnative.p033ui.screens.cardsaving.C8285d;
import com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult.C8287a;
import com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult.C8288b;
import com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult.C8290d;
import com.sdkit.paylib.paylibnative.p033ui.screens.deeplinkresult.C8292f;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.C8294a;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.C8295b;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.C8296c;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.C8297d;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8300c;
import com.sdkit.paylib.paylibnative.p033ui.screens.invoice.viewobjects.C8304g;
import com.sdkit.paylib.paylibnative.p033ui.screens.loading.C8310a;
import com.sdkit.paylib.paylibnative.p033ui.screens.loading.C8311b;
import com.sdkit.paylib.paylibnative.p033ui.screens.loading.C8312c;
import com.sdkit.paylib.paylibnative.p033ui.screens.loading.LoadingViewModel;
import com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate.C8314a;
import com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate.C8315b;
import com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate.C8316c;
import com.sdkit.paylib.paylibnative.p033ui.screens.manualupdate.C8317d;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileb.C8319a;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileb.C8320b;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileb.C8321c;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileb.C8322d;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8324a;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8325b;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8326c;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8327d;
import com.sdkit.paylib.paylibnative.p033ui.screens.mobileconfirm.C8330g;
import com.sdkit.paylib.paylibnative.p033ui.screens.payment.C8332a;
import com.sdkit.paylib.paylibnative.p033ui.screens.payment.C8333b;
import com.sdkit.paylib.paylibnative.p033ui.screens.payment.C8334c;
import com.sdkit.paylib.paylibnative.p033ui.screens.payment.C8335d;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8339c;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8341e;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8342f;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymenterror.C8343g;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8345a;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8347c;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8348d;
import com.sdkit.paylib.paylibnative.p033ui.screens.paymentsuccess.C8349e;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.C8351a;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.C8352b;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.C8354d;
import com.sdkit.paylib.paylibnative.p033ui.screens.webpayment.C8355e;
import com.sdkit.paylib.paylibnative.p033ui.widgets.bistro.C8382d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.C8394g;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.domain.C8390c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.C8398d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.card.viewobjects.mappers.C8402c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.mobile.C8406d;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.C8417c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.C8423i;
import com.sdkit.paylib.paylibnative.p033ui.widgets.sbolpay.C8432f;
import com.sdkit.paylib.paylibnative.p033ui.widgets.tbank.C8447c;
import com.sdkit.paylib.paylibnative.p033ui.widgets.webpay.C8454e;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8253a {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$b */
    public static final class b {

        /* renamed from: a */
        public C8212c f2585a;

        /* renamed from: b */
        public PaylibPaymentTools f2586b;

        /* renamed from: c */
        public PaylibDomainTools f2587c;

        /* renamed from: d */
        public PaylibLoggingTools f2588d;

        /* renamed from: e */
        public PaylibPlatformTools f2589e;

        public b() {
        }

        /* renamed from: a */
        public b m2430a(PaylibDomainTools paylibDomainTools) {
            this.f2587c = (PaylibDomainTools) Preconditions.checkNotNull(paylibDomainTools);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: a */
        public b m2431a(PaylibLoggingTools paylibLoggingTools) {
            this.f2588d = (PaylibLoggingTools) Preconditions.checkNotNull(paylibLoggingTools);
            return this;
        }

        /* renamed from: a */
        public b m2432a(C8212c c8212c) {
            this.f2585a = (C8212c) Preconditions.checkNotNull(c8212c);
            return this;
        }

        /* renamed from: a */
        public b m2433a(PaylibPaymentTools paylibPaymentTools) {
            this.f2586b = (PaylibPaymentTools) Preconditions.checkNotNull(paylibPaymentTools);
            return this;
        }

        /* renamed from: a */
        public b m2434a(PaylibPlatformTools paylibPlatformTools) {
            this.f2589e = (PaylibPlatformTools) Preconditions.checkNotNull(paylibPlatformTools);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8254b m2435a() {
            Preconditions.checkBuilderRequirement(this.f2585a, C8212c.class);
            Preconditions.checkBuilderRequirement(this.f2586b, PaylibPaymentTools.class);
            Preconditions.checkBuilderRequirement(this.f2587c, PaylibDomainTools.class);
            Preconditions.checkBuilderRequirement(this.f2588d, PaylibLoggingTools.class);
            Preconditions.checkBuilderRequirement(this.f2589e, PaylibPlatformTools.class);
            return new c(this.f2585a, this.f2586b, this.f2587c, this.f2588d, this.f2589e);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC8254b {

        /* renamed from: A */
        public Provider f2590A;

        /* renamed from: A0 */
        public Provider f2591A0;

        /* renamed from: B */
        public Provider f2592B;

        /* renamed from: B0 */
        public Provider f2593B0;

        /* renamed from: C */
        public Provider f2594C;

        /* renamed from: C0 */
        public Provider f2595C0;

        /* renamed from: D */
        public Provider f2596D;

        /* renamed from: D0 */
        public Provider f2597D0;

        /* renamed from: E */
        public Provider f2598E;

        /* renamed from: E0 */
        public Provider f2599E0;

        /* renamed from: F */
        public Provider f2600F;

        /* renamed from: F0 */
        public Provider f2601F0;

        /* renamed from: G */
        public Provider f2602G;

        /* renamed from: G0 */
        public Provider f2603G0;

        /* renamed from: H */
        public Provider f2604H;

        /* renamed from: H0 */
        public Provider f2605H0;

        /* renamed from: I */
        public Provider f2606I;

        /* renamed from: I0 */
        public Provider f2607I0;

        /* renamed from: J */
        public Provider f2608J;

        /* renamed from: J0 */
        public Provider f2609J0;

        /* renamed from: K */
        public Provider f2610K;

        /* renamed from: K0 */
        public Provider f2611K0;

        /* renamed from: L */
        public Provider f2612L;

        /* renamed from: L0 */
        public Provider f2613L0;

        /* renamed from: M */
        public Provider f2614M;

        /* renamed from: M0 */
        public Provider f2615M0;

        /* renamed from: N */
        public Provider f2616N;

        /* renamed from: O */
        public Provider f2617O;

        /* renamed from: P */
        public Provider f2618P;

        /* renamed from: Q */
        public Provider f2619Q;

        /* renamed from: R */
        public Provider f2620R;

        /* renamed from: S */
        public Provider f2621S;

        /* renamed from: T */
        public Provider f2622T;

        /* renamed from: U */
        public Provider f2623U;

        /* renamed from: V */
        public Provider f2624V;

        /* renamed from: W */
        public Provider f2625W;

        /* renamed from: X */
        public Provider f2626X;

        /* renamed from: Y */
        public Provider f2627Y;

        /* renamed from: Z */
        public Provider f2628Z;

        /* renamed from: a0 */
        public Provider f2629a0;

        /* renamed from: b */
        public final C8212c f2630b;

        /* renamed from: b0 */
        public Provider f2631b0;

        /* renamed from: c */
        public final PaylibLoggingTools f2632c;

        /* renamed from: c0 */
        public Provider f2633c0;

        /* renamed from: d */
        public final c f2634d;

        /* renamed from: d0 */
        public Provider f2635d0;

        /* renamed from: e */
        public Provider f2636e;

        /* renamed from: e0 */
        public Provider f2637e0;

        /* renamed from: f */
        public Provider f2638f;

        /* renamed from: f0 */
        public Provider f2639f0;

        /* renamed from: g */
        public Provider f2640g;

        /* renamed from: g0 */
        public Provider f2641g0;

        /* renamed from: h */
        public Provider f2642h;

        /* renamed from: h0 */
        public Provider f2643h0;

        /* renamed from: i */
        public Provider f2644i;

        /* renamed from: i0 */
        public Provider f2645i0;

        /* renamed from: j */
        public Provider f2646j;

        /* renamed from: j0 */
        public Provider f2647j0;

        /* renamed from: k */
        public Provider f2648k;

        /* renamed from: k0 */
        public Provider f2649k0;

        /* renamed from: l */
        public Provider f2650l;

        /* renamed from: l0 */
        public Provider f2651l0;

        /* renamed from: m */
        public Provider f2652m;

        /* renamed from: m0 */
        public Provider f2653m0;

        /* renamed from: n */
        public Provider f2654n;

        /* renamed from: n0 */
        public Provider f2655n0;

        /* renamed from: o */
        public Provider f2656o;

        /* renamed from: o0 */
        public Provider f2657o0;

        /* renamed from: p */
        public Provider f2658p;

        /* renamed from: p0 */
        public Provider f2659p0;

        /* renamed from: q */
        public Provider f2660q;

        /* renamed from: q0 */
        public Provider f2661q0;

        /* renamed from: r */
        public Provider f2662r;

        /* renamed from: r0 */
        public Provider f2663r0;

        /* renamed from: s */
        public Provider f2664s;

        /* renamed from: s0 */
        public Provider f2665s0;

        /* renamed from: t */
        public Provider f2666t;

        /* renamed from: t0 */
        public Provider f2667t0;

        /* renamed from: u */
        public Provider f2668u;

        /* renamed from: u0 */
        public Provider f2669u0;

        /* renamed from: v */
        public Provider f2670v;

        /* renamed from: v0 */
        public Provider f2671v0;

        /* renamed from: w */
        public Provider f2672w;

        /* renamed from: w0 */
        public Provider f2673w0;

        /* renamed from: x */
        public Provider f2674x;

        /* renamed from: x0 */
        public Provider f2675x0;

        /* renamed from: y */
        public Provider f2676y;

        /* renamed from: y0 */
        public Provider f2677y0;

        /* renamed from: z */
        public Provider f2678z;

        /* renamed from: z0 */
        public Provider f2679z0;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$a */
        /* loaded from: classes5.dex */
        public static final class a implements Provider {

            /* renamed from: a */
            public final PaylibPaymentTools f2680a;

            public a(PaylibPaymentTools paylibPaymentTools) {
                this.f2680a = paylibPaymentTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public ApplicationsNetworkClient get() {
                return (ApplicationsNetworkClient) Preconditions.checkNotNullFromComponent(this.f2680a.getApplicationNetworkClient());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$a0 */
        /* loaded from: classes5.dex */
        public static final class a0 implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2681a;

            public a0(PaylibDomainTools paylibDomainTools) {
                this.f2681a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public TBankAvailabilityInteractor get() {
                return (TBankAvailabilityInteractor) Preconditions.checkNotNullFromComponent(this.f2681a.getTBankAvailabilityInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$b */
        public static final class b implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2682a;

            public b(PaylibDomainTools paylibDomainTools) {
                this.f2682a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public BanksInteractor get() {
                return (BanksInteractor) Preconditions.checkNotNullFromComponent(this.f2682a.getBanksInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$b0 */
        public static final class b0 implements Provider {

            /* renamed from: a */
            public final C8212c f2683a;

            public b0(C8212c c8212c) {
                this.f2683a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public WebViewCertificateVerifier get() {
                return (WebViewCertificateVerifier) Preconditions.checkNotNullFromComponent(this.f2683a.m2222m());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$c */
        public static final class C11913c implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2684a;

            public C11913c(PaylibDomainTools paylibDomainTools) {
                this.f2684a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public CardsHolder get() {
                return (CardsHolder) Preconditions.checkNotNullFromComponent(this.f2684a.getCardsHolder());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$d */
        public static final class d implements Provider {

            /* renamed from: a */
            public final C8212c f2685a;

            public d(C8212c c8212c) {
                this.f2685a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InterfaceC8131b get() {
                return (InterfaceC8131b) Preconditions.checkNotNullFromComponent(this.f2685a.m2211b());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$e */
        public static final class e implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f2686a;

            public e(PaylibPlatformTools paylibPlatformTools) {
                this.f2686a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public Context get() {
                return (Context) Preconditions.checkNotNullFromComponent(this.f2686a.getContext());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$f */
        public static final class f implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f2687a;

            public f(PaylibPlatformTools paylibPlatformTools) {
                this.f2687a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public CoroutineDispatchers get() {
                return (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.f2687a.getCoroutineDispatchers());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$g */
        public static final class g implements Provider {

            /* renamed from: a */
            public final C8212c f2688a;

            public g(C8212c c8212c) {
                this.f2688a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public DeeplinkHandler get() {
                return (DeeplinkHandler) Preconditions.checkNotNullFromComponent(this.f2688a.m2212c());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$h */
        public static final class h implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2689a;

            public h(PaylibDomainTools paylibDomainTools) {
                this.f2689a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public DeeplinkSupportInteractor get() {
                return (DeeplinkSupportInteractor) Preconditions.checkNotNullFromComponent(this.f2689a.getDeeplinkSupportInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$i */
        public static final class i implements Provider {

            /* renamed from: a */
            public final C8212c f2690a;

            public i(C8212c c8212c) {
                this.f2690a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public DeviceAuthDelegate get() {
                return this.f2690a.m2213d();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$j */
        public static final class j implements Provider {

            /* renamed from: a */
            public final C8212c f2691a;

            public j(C8212c c8212c) {
                this.f2691a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public FinishCodeReceiver get() {
                return (FinishCodeReceiver) Preconditions.checkNotNullFromComponent(this.f2691a.m2214e());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$k */
        public static final class k implements Provider {

            /* renamed from: a */
            public final C8212c f2692a;

            public k(C8212c c8212c) {
                this.f2692a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibHostRouter get() {
                return this.f2692a.m2215f();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$l */
        public static final class l implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2693a;

            public l(PaylibDomainTools paylibDomainTools) {
                this.f2693a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InvoiceHolder get() {
                return (InvoiceHolder) Preconditions.checkNotNullFromComponent(this.f2693a.getInvoiceHolder());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$m */
        public static final class m implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2694a;

            public m(PaylibDomainTools paylibDomainTools) {
                this.f2694a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InvoicePaymentInteractor get() {
                return (InvoicePaymentInteractor) Preconditions.checkNotNullFromComponent(this.f2694a.getInvoicePaymentInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$n */
        public static final class n implements Provider {

            /* renamed from: a */
            public final PaylibLoggingTools f2695a;

            public n(PaylibLoggingTools paylibLoggingTools) {
                this.f2695a = paylibLoggingTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibLoggerFactory get() {
                return (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f2695a.getLoggerFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$o */
        public static final class o implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2696a;

            public o(PaylibDomainTools paylibDomainTools) {
                this.f2696a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public MoblieBOtpCodeInteractor get() {
                return (MoblieBOtpCodeInteractor) Preconditions.checkNotNullFromComponent(this.f2696a.getMoblieBOtpCodeInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$p */
        public static final class p implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2697a;

            public p(PaylibDomainTools paylibDomainTools) {
                this.f2697a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public MobileBPaymentsInteractor get() {
                return (MobileBPaymentsInteractor) Preconditions.checkNotNullFromComponent(this.f2697a.getMoblieBPaymentsInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$q */
        public static final class q implements Provider {

            /* renamed from: a */
            public final C8212c f2698a;

            public q(C8212c c8212c) {
                this.f2698a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InterfaceC8142a get() {
                return (InterfaceC8142a) Preconditions.checkNotNullFromComponent(this.f2698a.m2216g());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$r */
        public static final class r implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2699a;

            public r(PaylibDomainTools paylibDomainTools) {
                this.f2699a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibDeeplinkFactory get() {
                return (PaylibDeeplinkFactory) Preconditions.checkNotNullFromComponent(this.f2699a.getPaylibDeeplinkFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$s */
        public static final class s implements Provider {

            /* renamed from: a */
            public final C8212c f2700a;

            public s(C8212c c8212c) {
                this.f2700a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InterfaceC8097f get() {
                return (InterfaceC8097f) Preconditions.checkNotNullFromComponent(this.f2700a.m2217h());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$t */
        public static final class t implements Provider {

            /* renamed from: a */
            public final C8212c f2701a;

            public t(C8212c c8212c) {
                this.f2701a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InterfaceC8232f get() {
                return (InterfaceC8232f) Preconditions.checkNotNullFromComponent(this.f2701a.m2218i());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$u */
        public static final class u implements Provider {

            /* renamed from: a */
            public final C8212c f2702a;

            public u(C8212c c8212c) {
                this.f2702a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InterfaceC8220b get() {
                return (InterfaceC8220b) Preconditions.checkNotNullFromComponent(this.f2702a.m2219j());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$v */
        public static final class v implements Provider {

            /* renamed from: a */
            public final C8212c f2703a;

            public v(C8212c c8212c) {
                this.f2703a = c8212c;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InterfaceC8238l get() {
                return (InterfaceC8238l) Preconditions.checkNotNullFromComponent(this.f2703a.m2220k());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$w */
        public static final class w implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2704a;

            public w(PaylibDomainTools paylibDomainTools) {
                this.f2704a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaymentMethodSelector get() {
                return (PaymentMethodSelector) Preconditions.checkNotNullFromComponent(this.f2704a.getPaymentMethodSelector());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$x */
        public static final class x implements Provider {

            /* renamed from: a */
            public final PaylibPaymentTools f2705a;

            public x(PaylibPaymentTools paylibPaymentTools) {
                this.f2705a = paylibPaymentTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PurchasesNetworkClient get() {
                return (PurchasesNetworkClient) Preconditions.checkNotNullFromComponent(this.f2705a.getPurchasesNetworkClient());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$y */
        public static final class y implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2706a;

            public y(PaylibDomainTools paylibDomainTools) {
                this.f2706a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public SbolAvailabilityInteractor get() {
                return (SbolAvailabilityInteractor) Preconditions.checkNotNullFromComponent(this.f2706a.getSbolAccesabilityInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.internaldi.a$c$z */
        public static final class z implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2707a;

            public z(PaylibDomainTools paylibDomainTools) {
                this.f2707a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public SubscriptionsInteractor get() {
                return (SubscriptionsInteractor) Preconditions.checkNotNullFromComponent(this.f2707a.getSubscriptionsInteractor());
            }
        }

        public c(C8212c c8212c, PaylibPaymentTools paylibPaymentTools, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
            this.f2634d = this;
            this.f2630b = c8212c;
            this.f2632c = paylibLoggingTools;
            m2437a(c8212c, paylibPaymentTools, paylibDomainTools, paylibLoggingTools, paylibPlatformTools);
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        /* renamed from: a */
        public InternalPaylibRouter mo2436a() {
            return (InternalPaylibRouter) this.f2654n.get();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        /* renamed from: b */
        public C8252f mo2438b() {
            return (C8252f) this.f2636e.get();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        /* renamed from: c */
        public C8241o mo2439c() {
            return (C8241o) Preconditions.checkNotNullFromComponent(this.f2630b.m2221l());
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        /* renamed from: d */
        public InterfaceC8131b mo2440d() {
            return (InterfaceC8131b) Preconditions.checkNotNullFromComponent(this.f2630b.m2211b());
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        /* renamed from: e */
        public C8103b mo2441e() {
            return (C8103b) this.f2675x0.get();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        /* renamed from: f */
        public FragmentFactory mo2442f() {
            return m2444h();
        }

        /* renamed from: g */
        public final Map m2443g() {
            return MapBuilder.newMapBuilder(13).put(C8267b.class, this.f2593B0).put(C8275b.class, this.f2595C0).put(C8332a.class, this.f2597D0).put(C8319a.class, this.f2599E0).put(C8310a.class, this.f2601F0).put(C8351a.class, this.f2679z0).put(C8287a.class, this.f2603G0).put(C8345a.class, this.f2605H0).put(C8339c.class, this.f2607I0).put(C8282a.class, this.f2609J0).put(C8294a.class, this.f2611K0).put(C8314a.class, this.f2613L0).put(C8324a.class, this.f2615M0).build();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        public PaylibHostRouter getHostRouter() {
            return this.f2630b.m2215f();
        }

        @Override // com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b
        public PaylibLoggerFactory getLoggerFactory() {
            return (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f2632c.getLoggerFactory());
        }

        /* renamed from: h */
        public final C8257e m2444h() {
            return new C8257e(m2443g());
        }

        public /* synthetic */ c(C8212c c8212c, PaylibPaymentTools paylibPaymentTools, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools, a aVar) {
            this(c8212c, paylibPaymentTools, paylibDomainTools, paylibLoggingTools, paylibPlatformTools);
        }

        /* renamed from: a */
        public final void m2437a(C8212c c8212c, PaylibPaymentTools paylibPaymentTools, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
            this.f2636e = DoubleCheck.provider(C8256d.m2475a());
            this.f2638f = new k(c8212c);
            this.f2640g = new v(c8212c);
            this.f2642h = new s(c8212c);
            this.f2644i = new d(c8212c);
            this.f2646j = new e(paylibPlatformTools);
            this.f2648k = new b(paylibDomainTools);
            this.f2650l = new q(c8212c);
            this.f2652m = new j(c8212c);
            this.f2654n = new DelegateFactory();
            n nVar = new n(paylibLoggingTools);
            this.f2656o = nVar;
            this.f2658p = C8270e.m2614a(this.f2642h, this.f2644i, this.f2646j, this.f2648k, this.f2650l, this.f2652m, this.f2654n, nVar);
            this.f2660q = new l(paylibDomainTools);
            this.f2662r = new m(paylibDomainTools);
            this.f2664s = new f(paylibPlatformTools);
            this.f2666t = DoubleCheck.provider(C8417c.m3656a(this.f2642h));
            this.f2668u = new g(c8212c);
            this.f2670v = new r(paylibDomainTools);
            this.f2672w = new y(paylibDomainTools);
            h hVar = new h(paylibDomainTools);
            this.f2674x = hVar;
            this.f2676y = SingleCheck.provider(C8173a.m2102a(this.f2640g, this.f2668u, this.f2670v, this.f2672w, hVar, this.f2644i, this.f2656o));
            w wVar = new w(paylibDomainTools);
            this.f2678z = wVar;
            this.f2590A = C8432f.m3732a(this.f2662r, this.f2642h, this.f2664s, this.f2660q, this.f2666t, this.f2676y, this.f2654n, wVar);
            this.f2592B = DoubleCheck.provider(C8398d.m3584a());
            this.f2594C = new C11913c(paylibDomainTools);
            u uVar = new u(c8212c);
            this.f2596D = uVar;
            this.f2598E = C8278e.m2671a(this.f2652m, this.f2660q, this.f2654n, this.f2590A, this.f2644i, this.f2592B, this.f2642h, this.f2666t, this.f2594C, uVar);
            i iVar = new i(c8212c);
            this.f2600F = iVar;
            this.f2602G = C8209d.m2184a(iVar, this.f2656o);
            this.f2604H = C8095d.m1787a(this.f2640g, this.f2666t);
            this.f2606I = C8157e.m2074a(this.f2640g);
            this.f2608J = new x(paylibPaymentTools);
            a aVar = new a(paylibPaymentTools);
            this.f2610K = aVar;
            this.f2612L = C8152f.m2067a(this.f2606I, this.f2608J, aVar, this.f2656o);
            C8138c c8138cM2029a = C8138c.m2029a(this.f2664s, this.f2656o);
            this.f2614M = c8138cM2029a;
            this.f2616N = DoubleCheck.provider(C8168f.m2092a(this.f2612L, c8138cM2029a));
            t tVar = new t(c8212c);
            this.f2617O = tVar;
            this.f2618P = C8111f.m1938a(this.f2642h, this.f2644i, this.f2616N, this.f2662r, this.f2640g, tVar, this.f2654n, this.f2656o);
            Provider provider = SingleCheck.provider(C8109c.m1927a(this.f2654n));
            this.f2619Q = provider;
            this.f2620R = C8335d.m3196a(this.f2642h, this.f2602G, this.f2660q, this.f2662r, this.f2652m, this.f2654n, this.f2644i, this.f2604H, this.f2618P, provider, this.f2640g);
            p pVar = new p(paylibDomainTools);
            this.f2621S = pVar;
            this.f2622T = C8322d.m3031a(this.f2652m, pVar, this.f2654n, this.f2642h, this.f2644i);
            this.f2623U = SingleCheck.provider(C8230d.m2278a(this.f2660q, this.f2640g, this.f2656o));
            Provider provider2 = SingleCheck.provider(C8154b.m2071a(this.f2640g));
            this.f2624V = provider2;
            C8149c c8149cM2060a = C8149c.m2060a(provider2, this.f2608J, this.f2610K, this.f2656o);
            this.f2625W = c8149cM2060a;
            this.f2626X = DoubleCheck.provider(C8165c.m2089a(c8149cM2060a, this.f2614M));
            z zVar = new z(paylibDomainTools);
            this.f2627Y = zVar;
            this.f2628Z = C8312c.m2951a(this.f2660q, this.f2623U, this.f2626X, this.f2652m, this.f2640g, this.f2654n, this.f2644i, this.f2676y, zVar, this.f2656o);
            this.f2629a0 = C8355e.m3411a(this.f2662r, this.f2652m, this.f2642h, this.f2654n, this.f2618P, this.f2619Q, this.f2656o, this.f2664s, this.f2678z, this.f2644i, this.f2640g);
            this.f2631b0 = C8292f.m2781a(this.f2642h, this.f2660q, this.f2654n, this.f2640g, this.f2618P, this.f2619Q, this.f2644i, this.f2623U, this.f2656o);
            this.f2633c0 = C8349e.m3305a(this.f2642h, this.f2664s, this.f2660q, this.f2652m, this.f2654n, this.f2644i, this.f2604H, this.f2640g);
            this.f2635d0 = C8343g.m3255a(this.f2642h, this.f2652m, this.f2654n, this.f2604H, this.f2644i, this.f2640g);
            this.f2637e0 = C8285d.m2713a(this.f2654n, this.f2642h, this.f2644i);
            this.f2639f0 = DoubleCheck.provider(C8300c.m2890a(this.f2644i));
            this.f2641g0 = C8304g.m2916a(this.f2644i, this.f2666t);
            this.f2643h0 = C8382d.m3500a(this.f2660q, this.f2654n, this.f2644i, this.f2666t, this.f2664s, this.f2656o);
            a0 a0Var = new a0(paylibDomainTools);
            this.f2645i0 = a0Var;
            this.f2647j0 = C8447c.m3761a(this.f2660q, this.f2662r, this.f2654n, this.f2644i, this.f2666t, this.f2664s, this.f2656o, this.f2674x, a0Var, this.f2668u, this.f2640g, this.f2670v, this.f2646j, this.f2678z);
            this.f2649k0 = C8406d.m3616a(this.f2660q, this.f2654n, this.f2644i, this.f2666t, this.f2664s, this.f2656o);
            this.f2651l0 = C8454e.m3789a(this.f2660q, this.f2654n, this.f2644i, this.f2666t, this.f2664s, this.f2642h, this.f2596D);
            Provider provider3 = DoubleCheck.provider(C8390c.m3548a());
            this.f2653m0 = provider3;
            Provider provider4 = DoubleCheck.provider(C8402c.m3599a(provider3));
            this.f2655n0 = provider4;
            C8394g c8394gM3574a = C8394g.m3574a(this.f2660q, this.f2678z, this.f2654n, this.f2642h, this.f2664s, provider4, this.f2666t, this.f2592B, this.f2594C);
            this.f2657o0 = c8394gM3574a;
            C8423i c8423iM3704a = C8423i.m3704a(this.f2660q, this.f2642h, this.f2654n, this.f2664s, this.f2590A, this.f2643h0, this.f2647j0, this.f2649k0, this.f2651l0, c8394gM3574a, this.f2666t, this.f2640g);
            this.f2659p0 = c8423iM3704a;
            this.f2661q0 = C8297d.m2886a(this.f2660q, this.f2652m, this.f2642h, this.f2654n, this.f2640g, this.f2656o, this.f2639f0, this.f2641g0, this.f2666t, c8423iM3704a, this.f2594C, this.f2596D);
            this.f2663r0 = C8317d.m2985a(this.f2654n, this.f2660q, this.f2644i, this.f2652m, this.f2666t, this.f2656o);
            o oVar = new o(paylibDomainTools);
            this.f2665s0 = oVar;
            this.f2667t0 = C8327d.m3111a(this.f2646j, oVar, this.f2652m, this.f2654n, C8330g.m3129a(), this.f2642h, this.f2644i);
            MapProviderFactory mapProviderFactoryBuild = MapProviderFactory.builder(13).put((MapProviderFactory.Builder) C8269d.class, this.f2658p).put((MapProviderFactory.Builder) C8277d.class, this.f2598E).put((MapProviderFactory.Builder) C8334c.class, this.f2620R).put((MapProviderFactory.Builder) C8321c.class, this.f2622T).put((MapProviderFactory.Builder) LoadingViewModel.class, this.f2628Z).put((MapProviderFactory.Builder) C8354d.class, this.f2629a0).put((MapProviderFactory.Builder) C8290d.class, this.f2631b0).put((MapProviderFactory.Builder) C8348d.class, this.f2633c0).put((MapProviderFactory.Builder) C8342f.class, this.f2635d0).put((MapProviderFactory.Builder) C8284c.class, this.f2637e0).put((MapProviderFactory.Builder) C8296c.class, this.f2661q0).put((MapProviderFactory.Builder) C8316c.class, this.f2663r0).put((MapProviderFactory.Builder) C8326c.class, this.f2667t0).build();
            this.f2669u0 = mapProviderFactoryBuild;
            C8260h c8260hM2483a = C8260h.m2483a(mapProviderFactoryBuild, this.f2656o);
            this.f2671v0 = c8260hM2483a;
            this.f2673w0 = SingleCheck.provider(c8260hM2483a);
            this.f2675x0 = SingleCheck.provider(C8104c.m1869a(this.f2644i, this.f2656o));
            b0 b0Var = new b0(c8212c);
            this.f2677y0 = b0Var;
            C8352b c8352bM3350a = C8352b.m3350a(this.f2673w0, this.f2675x0, b0Var, this.f2656o);
            this.f2679z0 = c8352bM3350a;
            C8264d c8264dM2546a = C8264d.m2546a(this.f2636e, this.f2638f, this.f2640g, c8352bM3350a, this.f2656o);
            this.f2591A0 = c8264dM2546a;
            DelegateFactory.setDelegate(this.f2654n, DoubleCheck.provider(c8264dM2546a));
            this.f2593B0 = C8268c.m2584a(this.f2673w0, this.f2675x0);
            this.f2595C0 = C8276c.m2641a(this.f2673w0, this.f2675x0);
            this.f2597D0 = C8333b.m3156a(this.f2673w0, this.f2675x0);
            this.f2599E0 = C8320b.m3015a(this.f2673w0, this.f2675x0);
            this.f2601F0 = C8311b.m2948a(this.f2673w0, this.f2675x0);
            this.f2603G0 = C8288b.m2735a(this.f2673w0, this.f2675x0, this.f2656o);
            this.f2605H0 = C8347c.m3283a(this.f2673w0, this.f2675x0);
            this.f2607I0 = C8341e.m3245a(this.f2673w0, this.f2675x0);
            this.f2609J0 = C8283b.m2702a(this.f2673w0, this.f2675x0);
            this.f2611K0 = C8295b.m2834a(this.f2673w0, this.f2675x0, this.f2656o);
            this.f2613L0 = C8315b.m2969a(this.f2673w0, this.f2675x0);
            this.f2615M0 = C8325b.m3067a(this.f2673w0, this.f2675x0);
        }
    }

    /* renamed from: a */
    public static b m2429a() {
        return new b();
    }
}
