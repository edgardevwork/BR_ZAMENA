package com.sdkit.paylib.paylibpayment.impl.p038di;

import android.content.Context;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.domain.NetworkDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.PingInternetDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientFactory;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.config.PayLibPaymentFeatureFlags;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibClientInfoProvider;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibpayment.api.network.applications.ApplicationsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.bistro.BistroNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.cards.CardsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.invoice.InvoiceNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.products.ProductsNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.purchases.PurchasesNetworkClient;
import com.sdkit.paylib.paylibpayment.api.network.subscriptions.SubscriptionsNetworkClient;
import com.sdkit.paylib.paylibpayment.impl.domain.info.C8508c;
import com.sdkit.paylib.paylibpayment.impl.domain.info.C8510e;
import com.sdkit.paylib.paylibpayment.impl.domain.info.C8513h;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8516c;
import com.sdkit.paylib.paylibpayment.impl.domain.network.applications.C8518e;
import com.sdkit.paylib.paylibpayment.impl.domain.network.bistro.C8522b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.cards.C8525c;
import com.sdkit.paylib.paylibpayment.impl.domain.network.cards.C8527e;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8531d;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8536i;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8541l;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.C8542m;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.interceptor.C8538b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp.C8546b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.data.okhttp.C8548d;
import com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.C8551c;
import com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.C8553e;
import com.sdkit.paylib.paylibpayment.impl.domain.network.invoice.C8555g;
import com.sdkit.paylib.paylibpayment.impl.domain.network.products.C8562c;
import com.sdkit.paylib.paylibpayment.impl.domain.network.products.C8564e;
import com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.C8567c;
import com.sdkit.paylib.paylibpayment.impl.domain.network.purchases.C8569e;
import com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.C8581b;
import com.sdkit.paylib.paylibpayment.impl.domain.network.subscriptions.C8583d;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a */
/* loaded from: classes7.dex */
public abstract class AbstractC8496a {

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$b */
    public static final class b {

        /* renamed from: a */
        public PaylibNetworkTools f4765a;

        /* renamed from: b */
        public PaylibLoggingTools f4766b;

        /* renamed from: c */
        public PaylibPaymentDependencies f4767c;

        /* renamed from: d */
        public PaylibPlatformTools f4768d;

        public b() {
        }

        /* renamed from: a */
        public b m3908a(PaylibLoggingTools paylibLoggingTools) {
            this.f4766b = (PaylibLoggingTools) Preconditions.checkNotNull(paylibLoggingTools);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: a */
        public b m3909a(PaylibNetworkTools paylibNetworkTools) {
            this.f4765a = (PaylibNetworkTools) Preconditions.checkNotNull(paylibNetworkTools);
            return this;
        }

        /* renamed from: a */
        public b m3910a(PaylibPaymentDependencies paylibPaymentDependencies) {
            this.f4767c = (PaylibPaymentDependencies) Preconditions.checkNotNull(paylibPaymentDependencies);
            return this;
        }

        /* renamed from: a */
        public b m3911a(PaylibPlatformTools paylibPlatformTools) {
            this.f4768d = (PaylibPlatformTools) Preconditions.checkNotNull(paylibPlatformTools);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8497b m3912a() {
            Preconditions.checkBuilderRequirement(this.f4765a, PaylibNetworkTools.class);
            Preconditions.checkBuilderRequirement(this.f4766b, PaylibLoggingTools.class);
            Preconditions.checkBuilderRequirement(this.f4767c, PaylibPaymentDependencies.class);
            Preconditions.checkBuilderRequirement(this.f4768d, PaylibPlatformTools.class);
            return new c(this.f4765a, this.f4766b, this.f4767c, this.f4768d);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c */
    /* loaded from: classes6.dex */
    public static final class c implements InterfaceC8497b {

        /* renamed from: A */
        public Provider f4769A;

        /* renamed from: B */
        public Provider f4770B;

        /* renamed from: C */
        public Provider f4771C;

        /* renamed from: D */
        public Provider f4772D;

        /* renamed from: E */
        public Provider f4773E;

        /* renamed from: F */
        public Provider f4774F;

        /* renamed from: G */
        public Provider f4775G;

        /* renamed from: H */
        public Provider f4776H;

        /* renamed from: I */
        public Provider f4777I;

        /* renamed from: J */
        public Provider f4778J;

        /* renamed from: K */
        public Provider f4779K;

        /* renamed from: L */
        public Provider f4780L;

        /* renamed from: M */
        public Provider f4781M;

        /* renamed from: N */
        public Provider f4782N;

        /* renamed from: O */
        public Provider f4783O;

        /* renamed from: b */
        public final c f4784b;

        /* renamed from: c */
        public Provider f4785c;

        /* renamed from: d */
        public Provider f4786d;

        /* renamed from: e */
        public Provider f4787e;

        /* renamed from: f */
        public Provider f4788f;

        /* renamed from: g */
        public Provider f4789g;

        /* renamed from: h */
        public Provider f4790h;

        /* renamed from: i */
        public Provider f4791i;

        /* renamed from: j */
        public Provider f4792j;

        /* renamed from: k */
        public Provider f4793k;

        /* renamed from: l */
        public Provider f4794l;

        /* renamed from: m */
        public Provider f4795m;

        /* renamed from: n */
        public Provider f4796n;

        /* renamed from: o */
        public Provider f4797o;

        /* renamed from: p */
        public Provider f4798p;

        /* renamed from: q */
        public C8542m f4799q;

        /* renamed from: r */
        public Provider f4800r;

        /* renamed from: s */
        public Provider f4801s;

        /* renamed from: t */
        public Provider f4802t;

        /* renamed from: u */
        public Provider f4803u;

        /* renamed from: v */
        public Provider f4804v;

        /* renamed from: w */
        public Provider f4805w;

        /* renamed from: x */
        public Provider f4806x;

        /* renamed from: y */
        public Provider f4807y;

        /* renamed from: z */
        public Provider f4808z;

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$a */
        public static final class a implements Provider {

            /* renamed from: a */
            public final PaylibPaymentDependencies f4809a;

            public a(PaylibPaymentDependencies paylibPaymentDependencies) {
                this.f4809a = paylibPaymentDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public BackendUrlProvider get() {
                return this.f4809a.getBackendUrlProvider();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$b */
        public static final class b implements Provider {

            /* renamed from: a */
            public final PaylibPaymentDependencies f4810a;

            public b(PaylibPaymentDependencies paylibPaymentDependencies) {
                this.f4810a = paylibPaymentDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibClientInfoProvider get() {
                return this.f4810a.getClientInfoProvider();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$c */
        public static final class C11948c implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f4811a;

            public C11948c(PaylibPlatformTools paylibPlatformTools) {
                this.f4811a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public Context get() {
                return (Context) Preconditions.checkNotNullFromComponent(this.f4811a.getContext());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$d */
        public static final class d implements Provider {

            /* renamed from: a */
            public final PaylibPaymentDependencies f4812a;

            public d(PaylibPaymentDependencies paylibPaymentDependencies) {
                this.f4812a = paylibPaymentDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PayLibPaymentFeatureFlags get() {
                return (PayLibPaymentFeatureFlags) Preconditions.checkNotNullFromComponent(this.f4812a.getFeatureFlags());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$e */
        public static final class e implements Provider {

            /* renamed from: a */
            public final PaylibLoggingTools f4813a;

            public e(PaylibLoggingTools paylibLoggingTools) {
                this.f4813a = paylibLoggingTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibLoggerFactory get() {
                return (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f4813a.getLoggerFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$f */
        public static final class f implements Provider {

            /* renamed from: a */
            public final PaylibNetworkTools f4814a;

            public f(PaylibNetworkTools paylibNetworkTools) {
                this.f4814a = paylibNetworkTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public NetworkDetector get() {
                return (NetworkDetector) Preconditions.checkNotNullFromComponent(this.f4814a.getNetworkDetector());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$g */
        public static final class g implements Provider {

            /* renamed from: a */
            public final PaylibNetworkTools f4815a;

            public g(PaylibNetworkTools paylibNetworkTools) {
                this.f4815a = paylibNetworkTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PingInternetDetector get() {
                return (PingInternetDetector) Preconditions.checkNotNullFromComponent(this.f4815a.getPingInternetDetector());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$h */
        public static final class h implements Provider {

            /* renamed from: a */
            public final PaylibPaymentDependencies f4816a;

            public h(PaylibPaymentDependencies paylibPaymentDependencies) {
                this.f4816a = paylibPaymentDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibTokenProvider get() {
                return (PaylibTokenProvider) Preconditions.checkNotNullFromComponent(this.f4816a.getTokenProvider());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibpayment.impl.di.a$c$i */
        public static final class i implements Provider {

            /* renamed from: a */
            public final PaylibNetworkTools f4817a;

            public i(PaylibNetworkTools paylibNetworkTools) {
                this.f4817a = paylibNetworkTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public WebClientFactory get() {
                return (WebClientFactory) Preconditions.checkNotNullFromComponent(this.f4817a.getWebClientFactory());
            }
        }

        public c(PaylibNetworkTools paylibNetworkTools, PaylibLoggingTools paylibLoggingTools, PaylibPaymentDependencies paylibPaymentDependencies, PaylibPlatformTools paylibPlatformTools) {
            this.f4784b = this;
            m3913a(paylibNetworkTools, paylibLoggingTools, paylibPaymentDependencies, paylibPlatformTools);
        }

        /* renamed from: a */
        public final void m3913a(PaylibNetworkTools paylibNetworkTools, PaylibLoggingTools paylibLoggingTools, PaylibPaymentDependencies paylibPaymentDependencies, PaylibPlatformTools paylibPlatformTools) {
            this.f4785c = new d(paylibPaymentDependencies);
            Factory factoryCreate = InstanceFactory.create(paylibPaymentDependencies);
            this.f4786d = factoryCreate;
            Provider provider = DoubleCheck.provider(C8500e.m3932a(factoryCreate));
            this.f4787e = provider;
            this.f4788f = DoubleCheck.provider(C8499d.m3928a(provider));
            i iVar = new i(paylibNetworkTools);
            this.f4789g = iVar;
            this.f4790h = C8546b.m4099a(this.f4785c, this.f4788f, iVar, C8548d.m4102a());
            this.f4791i = new h(paylibPaymentDependencies);
            e eVar = new e(paylibLoggingTools);
            this.f4792j = eVar;
            this.f4793k = DoubleCheck.provider(C8502g.m3938a(this.f4791i, eVar));
            this.f4794l = new a(paylibPaymentDependencies);
            this.f4795m = new f(paylibNetworkTools);
            g gVar = new g(paylibNetworkTools);
            this.f4796n = gVar;
            this.f4797o = C8531d.m4004a(this.f4795m, gVar);
            this.f4798p = C8538b.m4068a(this.f4792j);
            C8542m c8542mM4088a = C8542m.m4088a(this.f4785c, this.f4792j);
            this.f4799q = c8542mM4088a;
            Provider providerM4086a = C8541l.m4086a(c8542mM4088a);
            this.f4800r = providerM4086a;
            this.f4801s = DoubleCheck.provider(C8536i.m4055a(this.f4790h, this.f4793k, this.f4794l, this.f4797o, this.f4798p, providerM4086a, this.f4792j));
            C11948c c11948c = new C11948c(paylibPlatformTools);
            this.f4802t = c11948c;
            C8508c c8508cM3947a = C8508c.m3947a(c11948c);
            this.f4803u = c8508cM3947a;
            this.f4804v = DoubleCheck.provider(c8508cM3947a);
            this.f4805w = C8510e.m3951a(this.f4802t);
            b bVar = new b(paylibPaymentDependencies);
            this.f4806x = bVar;
            C8513h c8513hM3955a = C8513h.m3955a(this.f4804v, this.f4805w, bVar, this.f4785c);
            this.f4807y = c8513hM3955a;
            this.f4808z = DoubleCheck.provider(c8513hM3955a);
            Provider provider2 = DoubleCheck.provider(C8501f.m3934a());
            this.f4769A = provider2;
            this.f4770B = C8555g.m4142a(this.f4788f, provider2);
            C8551c c8551cM4125a = C8551c.m4125a(C8553e.m4135a(), this.f4801s, this.f4808z, this.f4770B, this.f4769A, this.f4792j);
            this.f4771C = c8551cM4125a;
            this.f4772D = DoubleCheck.provider(c8551cM4125a);
            C8525c c8525cM3991a = C8525c.m3991a(C8527e.m3995a(), this.f4801s, this.f4808z, this.f4769A, this.f4792j);
            this.f4773E = c8525cM3991a;
            this.f4774F = DoubleCheck.provider(c8525cM3991a);
            C8562c c8562cM4160a = C8562c.m4160a(C8564e.m4163a(), this.f4801s, this.f4808z, this.f4769A, this.f4792j);
            this.f4775G = c8562cM4160a;
            this.f4776H = DoubleCheck.provider(c8562cM4160a);
            C8567c c8567cM4183a = C8567c.m4183a(C8569e.m4191a(), this.f4801s, this.f4808z, this.f4769A, this.f4792j);
            this.f4777I = c8567cM4183a;
            this.f4778J = DoubleCheck.provider(c8567cM4183a);
            this.f4779K = DoubleCheck.provider(C8581b.m4630a(C8583d.m4640a(), this.f4801s, this.f4769A, this.f4792j));
            C8516c c8516cM3966a = C8516c.m3966a(C8518e.m3971a(), this.f4801s, this.f4769A, this.f4792j);
            this.f4780L = c8516cM3966a;
            this.f4781M = DoubleCheck.provider(c8516cM3966a);
            C8522b c8522bM3980a = C8522b.m3980a(this.f4801s, this.f4769A, this.f4792j);
            this.f4782N = c8522bM3980a;
            this.f4783O = DoubleCheck.provider(c8522bM3980a);
        }

        @Override // com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools
        public ApplicationsNetworkClient getApplicationNetworkClient() {
            return (ApplicationsNetworkClient) this.f4781M.get();
        }

        @Override // com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools
        public BistroNetworkClient getBistroNetworkClient() {
            return (BistroNetworkClient) this.f4783O.get();
        }

        @Override // com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools
        public CardsNetworkClient getCardsNetworkClient() {
            return (CardsNetworkClient) this.f4774F.get();
        }

        @Override // com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools
        public InvoiceNetworkClient getInvoiceNetworkClient() {
            return (InvoiceNetworkClient) this.f4772D.get();
        }

        @Override // com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools
        public ProductsNetworkClient getProductsNetworkClient() {
            return (ProductsNetworkClient) this.f4776H.get();
        }

        @Override // com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools
        public PurchasesNetworkClient getPurchasesNetworkClient() {
            return (PurchasesNetworkClient) this.f4778J.get();
        }

        @Override // com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools
        public SubscriptionsNetworkClient getSubscriptionsNetworkClient() {
            return (SubscriptionsNetworkClient) this.f4779K.get();
        }

        public /* synthetic */ c(PaylibNetworkTools paylibNetworkTools, PaylibLoggingTools paylibLoggingTools, PaylibPaymentDependencies paylibPaymentDependencies, PaylibPlatformTools paylibPlatformTools, a aVar) {
            this(paylibNetworkTools, paylibLoggingTools, paylibPaymentDependencies, paylibPlatformTools);
        }
    }

    /* renamed from: a */
    public static b m3907a() {
        return new b();
    }
}
