package com.sdkit.paylib.paylibdomain.impl.p028di;

import android.content.Context;
import com.sdkit.paylib.paylibdomain.api.applications.ApplicationsInteractor;
import com.sdkit.paylib.paylibdomain.api.cards.CardsHolder;
import com.sdkit.paylib.paylibdomain.api.cards.CardsInteractor;
import com.sdkit.paylib.paylibdomain.api.config.PaylibDomainFeatureFlags;
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
import com.sdkit.paylib.paylibdomain.impl.applications.C8034b;
import com.sdkit.paylib.paylibdomain.impl.cards.C8036b;
import com.sdkit.paylib.paylibdomain.impl.cards.C8038d;
import com.sdkit.paylib.paylibdomain.impl.deeplink.C8040b;
import com.sdkit.paylib.paylibdomain.impl.deeplink.C8042d;
import com.sdkit.paylib.paylibdomain.impl.deeplink.C8044f;
import com.sdkit.paylib.paylibdomain.impl.deeplink.interactors.C8047b;
import com.sdkit.paylib.paylibdomain.impl.invoice.C8058b;
import com.sdkit.paylib.paylibdomain.impl.invoice.C8059c;
import com.sdkit.paylib.paylibdomain.impl.invoice.C8060d;
import com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.C8061a;
import com.sdkit.paylib.paylibdomain.impl.mobileb.interactors.C8062b;
import com.sdkit.paylib.paylibdomain.impl.payment.C8064b;
import com.sdkit.paylib.paylibdomain.impl.products.C8066b;
import com.sdkit.paylib.paylibdomain.impl.purchases.C8068b;
import com.sdkit.paylib.paylibdomain.impl.sbol.interactors.C8070b;
import com.sdkit.paylib.paylibdomain.impl.sbp.interactors.C8071a;
import com.sdkit.paylib.paylibdomain.impl.subscriptions.C8072a;
import com.sdkit.paylib.paylibdomain.impl.tbank.interactors.C8073a;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.bistro.BistroNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.products.ProductsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a */
/* loaded from: classes6.dex */
public abstract class AbstractC8049a {

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$b */
    public static final class b {

        /* renamed from: a */
        public PaylibDomainDependencies f1166a;

        /* renamed from: b */
        public PaylibLoggingTools f1167b;

        /* renamed from: c */
        public PaylibPaymentTools f1168c;

        /* renamed from: d */
        public PaylibPlatformTools f1169d;

        public b() {
        }

        /* renamed from: a */
        public b m1494a(PaylibDomainDependencies paylibDomainDependencies) {
            this.f1166a = (PaylibDomainDependencies) Preconditions.checkNotNull(paylibDomainDependencies);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: a */
        public b m1495a(PaylibLoggingTools paylibLoggingTools) {
            this.f1167b = (PaylibLoggingTools) Preconditions.checkNotNull(paylibLoggingTools);
            return this;
        }

        /* renamed from: a */
        public b m1496a(PaylibPaymentTools paylibPaymentTools) {
            this.f1168c = (PaylibPaymentTools) Preconditions.checkNotNull(paylibPaymentTools);
            return this;
        }

        /* renamed from: a */
        public b m1497a(PaylibPlatformTools paylibPlatformTools) {
            this.f1169d = (PaylibPlatformTools) Preconditions.checkNotNull(paylibPlatformTools);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8050b m1498a() {
            Preconditions.checkBuilderRequirement(this.f1166a, PaylibDomainDependencies.class);
            Preconditions.checkBuilderRequirement(this.f1167b, PaylibLoggingTools.class);
            Preconditions.checkBuilderRequirement(this.f1168c, PaylibPaymentTools.class);
            Preconditions.checkBuilderRequirement(this.f1169d, PaylibPlatformTools.class);
            return new c(this.f1166a, this.f1167b, this.f1168c, this.f1169d);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC8050b {

        /* renamed from: A */
        public Provider f1170A;

        /* renamed from: b */
        public final PaylibPaymentTools f1171b;

        /* renamed from: c */
        public final PaylibPlatformTools f1172c;

        /* renamed from: d */
        public final PaylibLoggingTools f1173d;

        /* renamed from: e */
        public final c f1174e;

        /* renamed from: f */
        public Provider f1175f;

        /* renamed from: g */
        public Provider f1176g;

        /* renamed from: h */
        public Provider f1177h;

        /* renamed from: i */
        public Provider f1178i;

        /* renamed from: j */
        public Provider f1179j;

        /* renamed from: k */
        public Provider f1180k;

        /* renamed from: l */
        public Provider f1181l;

        /* renamed from: m */
        public Provider f1182m;

        /* renamed from: n */
        public Provider f1183n;

        /* renamed from: o */
        public Provider f1184o;

        /* renamed from: p */
        public Provider f1185p;

        /* renamed from: q */
        public Provider f1186q;

        /* renamed from: r */
        public Provider f1187r;

        /* renamed from: s */
        public Provider f1188s;

        /* renamed from: t */
        public Provider f1189t;

        /* renamed from: u */
        public Provider f1190u;

        /* renamed from: v */
        public Provider f1191v;

        /* renamed from: w */
        public Provider f1192w;

        /* renamed from: x */
        public Provider f1193x;

        /* renamed from: y */
        public Provider f1194y;

        /* renamed from: z */
        public Provider f1195z;

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements Provider {

            /* renamed from: a */
            public final PaylibPaymentTools f1196a;

            public a(PaylibPaymentTools paylibPaymentTools) {
                this.f1196a = paylibPaymentTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public ApplicationsNetworkClient get() {
                return (ApplicationsNetworkClient) Preconditions.checkNotNullFromComponent(this.f1196a.getApplicationNetworkClient());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$b */
        /* loaded from: classes6.dex */
        public static final class b implements Provider {

            /* renamed from: a */
            public final PaylibPaymentTools f1197a;

            public b(PaylibPaymentTools paylibPaymentTools) {
                this.f1197a = paylibPaymentTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public CardsNetworkClient get() {
                return (CardsNetworkClient) Preconditions.checkNotNullFromComponent(this.f1197a.getCardsNetworkClient());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$c */
        /* loaded from: classes6.dex */
        public static final class C11905c implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f1198a;

            public C11905c(PaylibPlatformTools paylibPlatformTools) {
                this.f1198a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public Context get() {
                return (Context) Preconditions.checkNotNullFromComponent(this.f1198a.getContext());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$d */
        /* loaded from: classes6.dex */
        public static final class d implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f1199a;

            public d(PaylibPlatformTools paylibPlatformTools) {
                this.f1199a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public CoroutineDispatchers get() {
                return (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.f1199a.getCoroutineDispatchers());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$e */
        /* loaded from: classes6.dex */
        public static final class e implements Provider {

            /* renamed from: a */
            public final PaylibDomainDependencies f1200a;

            public e(PaylibDomainDependencies paylibDomainDependencies) {
                this.f1200a = paylibDomainDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibDomainFeatureFlags get() {
                return (PaylibDomainFeatureFlags) Preconditions.checkNotNullFromComponent(this.f1200a.getFeatureFlags());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$f */
        /* loaded from: classes6.dex */
        public static final class f implements Provider {

            /* renamed from: a */
            public final PaylibPaymentTools f1201a;

            public f(PaylibPaymentTools paylibPaymentTools) {
                this.f1201a = paylibPaymentTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public InvoiceNetworkClient get() {
                return (InvoiceNetworkClient) Preconditions.checkNotNullFromComponent(this.f1201a.getInvoiceNetworkClient());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$g */
        /* loaded from: classes6.dex */
        public static final class g implements Provider {

            /* renamed from: a */
            public final PaylibLoggingTools f1202a;

            public g(PaylibLoggingTools paylibLoggingTools) {
                this.f1202a = paylibLoggingTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibLoggerFactory get() {
                return (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f1202a.getLoggerFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$h */
        /* loaded from: classes6.dex */
        public static final class h implements Provider {

            /* renamed from: a */
            public final PaylibPaymentTools f1203a;

            public h(PaylibPaymentTools paylibPaymentTools) {
                this.f1203a = paylibPaymentTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public ProductsNetworkClient get() {
                return (ProductsNetworkClient) Preconditions.checkNotNullFromComponent(this.f1203a.getProductsNetworkClient());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibdomain.impl.di.a$c$i */
        /* loaded from: classes6.dex */
        public static final class i implements Provider {

            /* renamed from: a */
            public final PaylibPaymentTools f1204a;

            public i(PaylibPaymentTools paylibPaymentTools) {
                this.f1204a = paylibPaymentTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PurchasesNetworkClient get() {
                return (PurchasesNetworkClient) Preconditions.checkNotNullFromComponent(this.f1204a.getPurchasesNetworkClient());
            }
        }

        public c(PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
            this.f1174e = this;
            this.f1171b = paylibPaymentTools;
            this.f1172c = paylibPlatformTools;
            this.f1173d = paylibLoggingTools;
            m1500a(paylibDomainDependencies, paylibLoggingTools, paylibPaymentTools, paylibPlatformTools);
        }

        /* renamed from: a */
        public final C8071a m1499a() {
            return new C8071a((BistroNetworkClient) Preconditions.checkNotNullFromComponent(this.f1171b.getBistroNetworkClient()), (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.f1172c.getCoroutineDispatchers()), (Context) Preconditions.checkNotNullFromComponent(this.f1172c.getContext()), (Json) this.f1175f.get());
        }

        /* renamed from: b */
        public final C8059c m1501b() {
            return new C8059c((InvoiceHolder) this.f1185p.get(), (InvoiceNetworkClient) Preconditions.checkNotNullFromComponent(this.f1171b.getInvoiceNetworkClient()), (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.f1172c.getCoroutineDispatchers()), (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f1173d.getLoggerFactory()), (PaymentMethodSelector) this.f1180k.get());
        }

        /* renamed from: c */
        public final C8060d m1502c() {
            return new C8060d((InvoiceNetworkClient) Preconditions.checkNotNullFromComponent(this.f1171b.getInvoiceNetworkClient()), (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f1173d.getLoggerFactory()));
        }

        /* renamed from: d */
        public final C8061a m1503d() {
            return new C8061a((CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.f1172c.getCoroutineDispatchers()), (InvoiceHolder) this.f1185p.get(), (InvoiceNetworkClient) Preconditions.checkNotNullFromComponent(this.f1171b.getInvoiceNetworkClient()));
        }

        /* renamed from: e */
        public final C8062b m1504e() {
            return new C8062b((InvoiceHolder) this.f1185p.get(), (InvoiceNetworkClient) Preconditions.checkNotNullFromComponent(this.f1171b.getInvoiceNetworkClient()), (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.f1172c.getCoroutineDispatchers()));
        }

        /* renamed from: f */
        public final C8072a m1505f() {
            return new C8072a((SubscriptionsNetworkClient) Preconditions.checkNotNullFromComponent(this.f1171b.getSubscriptionsNetworkClient()), (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f1173d.getLoggerFactory()));
        }

        /* renamed from: g */
        public final C8073a m1506g() {
            return new C8073a((Context) Preconditions.checkNotNullFromComponent(this.f1172c.getContext()));
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public ApplicationsInteractor getApplicationsInteractor() {
            return (ApplicationsInteractor) this.f1170A.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public BanksInteractor getBanksInteractor() {
            return m1499a();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public CardsHolder getCardsHolder() {
            return (CardsHolder) this.f1181l.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public CardsInteractor getCardsInteractor() {
            return (CardsInteractor) this.f1192w.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public DeeplinkSupportInteractor getDeeplinkSupportInteractor() {
            return (DeeplinkSupportInteractor) this.f1187r.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public InvoiceHolder getInvoiceHolder() {
            return (InvoiceHolder) this.f1185p.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public InvoicePaymentInteractor getInvoicePaymentInteractor() {
            return m1501b();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public InvoicesInteractor getInvoicesInteractor() {
            return m1502c();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public MoblieBOtpCodeInteractor getMoblieBOtpCodeInteractor() {
            return m1504e();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public MobileBPaymentsInteractor getMoblieBPaymentsInteractor() {
            return m1503d();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public PaylibDeeplinkFactory getPaylibDeeplinkFactory() {
            return (PaylibDeeplinkFactory) this.f1178i.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public PaylibDeeplinkParser getPaylibDeeplinkParser() {
            return (PaylibDeeplinkParser) this.f1179j.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public PaymentMethodSelector getPaymentMethodSelector() {
            return (PaymentMethodSelector) this.f1180k.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public ProductsInteractor getProductsInteractor() {
            return (ProductsInteractor) this.f1190u.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public PurchasesInteractor getPurchasesInteractor() {
            return (PurchasesInteractor) this.f1194y.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public SbolAvailabilityInteractor getSbolAccesabilityInteractor() {
            return (SbolAvailabilityInteractor) this.f1188s.get();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public SubscriptionsInteractor getSubscriptionsInteractor() {
            return m1505f();
        }

        @Override // com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools
        public TBankAvailabilityInteractor getTBankAvailabilityInteractor() {
            return m1506g();
        }

        public /* synthetic */ c(PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools, a aVar) {
            this(paylibDomainDependencies, paylibLoggingTools, paylibPaymentTools, paylibPlatformTools);
        }

        /* renamed from: a */
        public final void m1500a(PaylibDomainDependencies paylibDomainDependencies, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
            this.f1175f = DoubleCheck.provider(C8052d.m1519a());
            g gVar = new g(paylibLoggingTools);
            this.f1176g = gVar;
            C8040b c8040bM1470a = C8040b.m1470a(gVar);
            this.f1177h = c8040bM1470a;
            this.f1178i = SingleCheck.provider(C8042d.m1476a(c8040bM1470a, this.f1176g));
            this.f1179j = SingleCheck.provider(C8044f.m1487a(this.f1177h, this.f1176g));
            Provider provider = DoubleCheck.provider(C8064b.m1619a(this.f1176g));
            this.f1180k = provider;
            this.f1181l = DoubleCheck.provider(C8036b.m1447a(provider));
            this.f1182m = new d(paylibPlatformTools);
            this.f1183n = new e(paylibDomainDependencies);
            f fVar = new f(paylibPaymentTools);
            this.f1184o = fVar;
            this.f1185p = DoubleCheck.provider(C8058b.m1574a(this.f1181l, this.f1182m, this.f1183n, fVar, this.f1176g));
            C11905c c11905c = new C11905c(paylibPlatformTools);
            this.f1186q = c11905c;
            this.f1187r = SingleCheck.provider(C8047b.m1491a(c11905c));
            this.f1188s = SingleCheck.provider(C8070b.m1648a(this.f1186q));
            h hVar = new h(paylibPaymentTools);
            this.f1189t = hVar;
            this.f1190u = SingleCheck.provider(C8066b.m1624a(hVar, this.f1176g));
            b bVar = new b(paylibPaymentTools);
            this.f1191v = bVar;
            this.f1192w = SingleCheck.provider(C8038d.m1459a(bVar, this.f1176g));
            i iVar = new i(paylibPaymentTools);
            this.f1193x = iVar;
            this.f1194y = SingleCheck.provider(C8068b.m1644a(iVar, this.f1176g));
            a aVar = new a(paylibPaymentTools);
            this.f1195z = aVar;
            this.f1170A = SingleCheck.provider(C8034b.m1442a(aVar, this.f1176g));
        }
    }

    /* renamed from: a */
    public static b m1493a() {
        return new b();
    }
}
