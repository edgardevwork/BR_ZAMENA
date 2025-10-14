package com.sdkit.paylib.paylibnative.p033ui.p034di;

import android.content.Context;
import com.sdkit.paylib.paylibdomain.api.deeplink.DeeplinkHandler;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.config.PaylibNativeFeatureFlags;
import com.sdkit.paylib.paylibnative.api.deviceauth.DeviceAuthDelegate;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeConfigProvider;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter;
import com.sdkit.paylib.paylibnative.p033ui.analytics.C8099h;
import com.sdkit.paylib.paylibnative.p033ui.config.AbstractC8130a;
import com.sdkit.paylib.paylibnative.p033ui.config.C8133d;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8134e;
import com.sdkit.paylib.paylibnative.p033ui.core.interactors.sbp.C8144c;
import com.sdkit.paylib.paylibnative.p033ui.domain.savecardscreen.C8222d;
import com.sdkit.paylib.paylibnative.p033ui.launcher.C8224b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.C8226d;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8228b;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8234h;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8236j;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.C8240n;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools;
import com.sdkit.paylib.paylibpayment.api.config.InternalConfigProvider;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.ui.di.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8210a {

    /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$b */
    public static final class b {

        /* renamed from: a */
        public InterfaceC8134e f2292a;

        /* renamed from: b */
        public PaylibDomainTools f2293b;

        /* renamed from: c */
        public PaylibLoggingTools f2294c;

        /* renamed from: d */
        public PaylibNetworkTools f2295d;

        /* renamed from: e */
        public PaylibPaymentTools f2296e;

        /* renamed from: f */
        public PaylibPlatformTools f2297f;

        public b() {
        }

        /* renamed from: a */
        public b m2187a(PaylibDomainTools paylibDomainTools) {
            this.f2293b = (PaylibDomainTools) Preconditions.checkNotNull(paylibDomainTools);
            return this;
        }

        /* renamed from: a */
        public b m2188a(PaylibLoggingTools paylibLoggingTools) {
            this.f2294c = (PaylibLoggingTools) Preconditions.checkNotNull(paylibLoggingTools);
            return this;
        }

        /* renamed from: a */
        public b m2189a(InterfaceC8134e interfaceC8134e) {
            this.f2292a = (InterfaceC8134e) Preconditions.checkNotNull(interfaceC8134e);
            return this;
        }

        /* renamed from: a */
        public b m2190a(PaylibNetworkTools paylibNetworkTools) {
            this.f2295d = (PaylibNetworkTools) Preconditions.checkNotNull(paylibNetworkTools);
            return this;
        }

        /* renamed from: a */
        public b m2191a(PaylibPaymentTools paylibPaymentTools) {
            this.f2296e = (PaylibPaymentTools) Preconditions.checkNotNull(paylibPaymentTools);
            return this;
        }

        /* renamed from: a */
        public b m2192a(PaylibPlatformTools paylibPlatformTools) {
            this.f2297f = (PaylibPlatformTools) Preconditions.checkNotNull(paylibPlatformTools);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8211b m2193a() {
            Preconditions.checkBuilderRequirement(this.f2292a, InterfaceC8134e.class);
            Preconditions.checkBuilderRequirement(this.f2293b, PaylibDomainTools.class);
            Preconditions.checkBuilderRequirement(this.f2294c, PaylibLoggingTools.class);
            Preconditions.checkBuilderRequirement(this.f2295d, PaylibNetworkTools.class);
            Preconditions.checkBuilderRequirement(this.f2296e, PaylibPaymentTools.class);
            Preconditions.checkBuilderRequirement(this.f2297f, PaylibPlatformTools.class);
            return new c(this.f2292a, this.f2293b, this.f2294c, this.f2295d, this.f2296e, this.f2297f);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC8211b {

        /* renamed from: A */
        public Provider f2298A;

        /* renamed from: B */
        public Provider f2299B;

        /* renamed from: C */
        public Provider f2300C;

        /* renamed from: D */
        public Provider f2301D;

        /* renamed from: E */
        public Provider f2302E;

        /* renamed from: F */
        public Provider f2303F;

        /* renamed from: G */
        public Provider f2304G;

        /* renamed from: H */
        public Provider f2305H;

        /* renamed from: I */
        public Provider f2306I;

        /* renamed from: J */
        public Provider f2307J;

        /* renamed from: K */
        public Provider f2308K;

        /* renamed from: c */
        public final c f2309c;

        /* renamed from: d */
        public Provider f2310d;

        /* renamed from: e */
        public Provider f2311e;

        /* renamed from: f */
        public Provider f2312f;

        /* renamed from: g */
        public Provider f2313g;

        /* renamed from: h */
        public Provider f2314h;

        /* renamed from: i */
        public Provider f2315i;

        /* renamed from: j */
        public Provider f2316j;

        /* renamed from: k */
        public Provider f2317k;

        /* renamed from: l */
        public Provider f2318l;

        /* renamed from: m */
        public Provider f2319m;

        /* renamed from: n */
        public Provider f2320n;

        /* renamed from: o */
        public Provider f2321o;

        /* renamed from: p */
        public Provider f2322p;

        /* renamed from: q */
        public Provider f2323q;

        /* renamed from: r */
        public Provider f2324r;

        /* renamed from: s */
        public Provider f2325s;

        /* renamed from: t */
        public Provider f2326t;

        /* renamed from: u */
        public Provider f2327u;

        /* renamed from: v */
        public Provider f2328v;

        /* renamed from: w */
        public Provider f2329w;

        /* renamed from: x */
        public Provider f2330x;

        /* renamed from: y */
        public Provider f2331y;

        /* renamed from: z */
        public Provider f2332z;

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$a */
        public static final class a implements Provider {

            /* renamed from: a */
            public final InterfaceC8134e f2333a;

            public a(InterfaceC8134e interfaceC8134e) {
                this.f2333a = interfaceC8134e;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomPaylibAnalytics get() {
                return this.f2333a.mo2019b();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$b */
        public static final class b implements Provider {

            /* renamed from: a */
            public final InterfaceC8134e f2334a;

            public b(InterfaceC8134e interfaceC8134e) {
                this.f2334a = interfaceC8134e;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InternalConfigProvider get() {
                return this.f2334a.getConfigProvider();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$c, reason: collision with other inner class name */
        public static final class C11911c implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f2335a;

            public C11911c(PaylibPlatformTools paylibPlatformTools) {
                this.f2335a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Context get() {
                return (Context) Preconditions.checkNotNullFromComponent(this.f2335a.getContext());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$d */
        public static final class d implements Provider {

            /* renamed from: a */
            public final InterfaceC8134e f2336a;

            public d(InterfaceC8134e interfaceC8134e) {
                this.f2336a = interfaceC8134e;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DeeplinkHandler get() {
                return (DeeplinkHandler) Preconditions.checkNotNullFromComponent(this.f2336a.getDeeplinkHandler());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$e */
        public static final class e implements Provider {

            /* renamed from: a */
            public final InterfaceC8134e f2337a;

            public e(InterfaceC8134e interfaceC8134e) {
                this.f2337a = interfaceC8134e;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DeviceAuthDelegate get() {
                return this.f2337a.getDeviceAuthDelegate();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$f */
        public static final class f implements Provider {

            /* renamed from: a */
            public final InterfaceC8134e f2338a;

            public f(InterfaceC8134e interfaceC8134e) {
                this.f2338a = interfaceC8134e;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC8130a get() {
                return (AbstractC8130a) Preconditions.checkNotNullFromComponent(this.f2338a.mo2018a());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$g */
        public static final class g implements Provider {

            /* renamed from: a */
            public final InterfaceC8134e f2339a;

            public g(InterfaceC8134e interfaceC8134e) {
                this.f2339a = interfaceC8134e;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibNativeFeatureFlags get() {
                return this.f2339a.getFeatureFlags();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$h */
        public static final class h implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2340a;

            public h(PaylibDomainTools paylibDomainTools) {
                this.f2340a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InvoicePaymentInteractor get() {
                return (InvoicePaymentInteractor) Preconditions.checkNotNullFromComponent(this.f2340a.getInvoicePaymentInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$i */
        public static final class i implements Provider {

            /* renamed from: a */
            public final PaylibLoggingTools f2341a;

            public i(PaylibLoggingTools paylibLoggingTools) {
                this.f2341a = paylibLoggingTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibLoggerFactory get() {
                return (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f2341a.getLoggerFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$j */
        public static final class j implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2342a;

            public j(PaylibDomainTools paylibDomainTools) {
                this.f2342a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibDeeplinkFactory get() {
                return (PaylibDeeplinkFactory) Preconditions.checkNotNullFromComponent(this.f2342a.getPaylibDeeplinkFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$k */
        public static final class k implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2343a;

            public k(PaylibDomainTools paylibDomainTools) {
                this.f2343a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibDeeplinkParser get() {
                return (PaylibDeeplinkParser) Preconditions.checkNotNullFromComponent(this.f2343a.getPaylibDeeplinkParser());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$l */
        public static final class l implements Provider {

            /* renamed from: a */
            public final InterfaceC8134e f2344a;

            public l(InterfaceC8134e interfaceC8134e) {
                this.f2344a = interfaceC8134e;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibNativeConfigProvider get() {
                return this.f2344a.getPaylibNativeConfigProvider();
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$m */
        public static final class m implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f2345a;

            public m(PaylibDomainTools paylibDomainTools) {
                this.f2345a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaymentMethodSelector get() {
                return (PaymentMethodSelector) Preconditions.checkNotNullFromComponent(this.f2345a.getPaymentMethodSelector());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.ui.di.a$c$n */
        public static final class n implements Provider {

            /* renamed from: a */
            public final PaylibNetworkTools f2346a;

            public n(PaylibNetworkTools paylibNetworkTools) {
                this.f2346a = paylibNetworkTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public WebViewCertificateVerifier get() {
                return (WebViewCertificateVerifier) Preconditions.checkNotNullFromComponent(this.f2346a.getWebViewCertificateVerifier());
            }
        }

        public c(InterfaceC8134e interfaceC8134e, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibNetworkTools paylibNetworkTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
            this.f2309c = this;
            m2194a(interfaceC8134e, paylibDomainTools, paylibLoggingTools, paylibNetworkTools, paylibPaymentTools, paylibPlatformTools);
        }

        /* renamed from: a */
        public final void m2194a(InterfaceC8134e interfaceC8134e, PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibNetworkTools paylibNetworkTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools) {
            this.f2310d = new C11911c(paylibPlatformTools);
            i iVar = new i(paylibLoggingTools);
            this.f2311e = iVar;
            Provider provider = DoubleCheck.provider(C8234h.m2288a(iVar));
            this.f2312f = provider;
            Provider provider2 = DoubleCheck.provider(C8240n.m2358a(this.f2311e, provider));
            this.f2313g = provider2;
            C8236j c8236jM2296a = C8236j.m2296a(provider2);
            this.f2314h = c8236jM2296a;
            C8228b c8228bM2271a = C8228b.m2271a(this.f2313g, c8236jM2296a, this.f2311e);
            this.f2315i = c8228bM2271a;
            this.f2316j = DoubleCheck.provider(c8228bM2271a);
            f fVar = new f(interfaceC8134e);
            this.f2317k = fVar;
            this.f2318l = C8224b.m2250a(this.f2310d, this.f2316j, fVar, this.f2311e);
            this.f2319m = DoubleCheck.provider(C8216g.m2231a());
            this.f2320n = InstanceFactory.create(paylibDomainTools);
            this.f2321o = InstanceFactory.create(paylibLoggingTools);
            this.f2322p = InstanceFactory.create(paylibPaymentTools);
            this.f2323q = InstanceFactory.create(paylibPlatformTools);
            this.f2324r = new g(interfaceC8134e);
            this.f2325s = new b(interfaceC8134e);
            l lVar = new l(interfaceC8134e);
            this.f2326t = lVar;
            this.f2327u = C8133d.m2016a(this.f2324r, this.f2325s, lVar);
            Factory factoryCreate = InstanceFactory.create(interfaceC8134e);
            this.f2328v = factoryCreate;
            this.f2329w = C8215f.m2229a(factoryCreate);
            a aVar = new a(interfaceC8134e);
            this.f2330x = aVar;
            this.f2331y = C8099h.m1833a(aVar, this.f2327u, this.f2313g);
            this.f2332z = new d(interfaceC8134e);
            this.f2298A = new e(interfaceC8134e);
            this.f2299B = DoubleCheck.provider(C8222d.m2242a(this.f2311e));
            this.f2300C = new h(paylibDomainTools);
            this.f2301D = new j(paylibDomainTools);
            m mVar = new m(paylibDomainTools);
            this.f2302E = mVar;
            this.f2303F = C8144c.m2046a(this.f2300C, this.f2332z, this.f2301D, this.f2313g, this.f2311e, mVar);
            n nVar = new n(paylibNetworkTools);
            this.f2304G = nVar;
            this.f2305H = C8213d.m2224a(this.f2320n, this.f2321o, this.f2322p, this.f2323q, this.f2327u, this.f2329w, this.f2331y, this.f2316j, this.f2332z, this.f2298A, this.f2319m, this.f2313g, this.f2312f, this.f2299B, this.f2303F, nVar);
            k kVar = new k(paylibDomainTools);
            this.f2306I = kVar;
            C8226d c8226dM2265a = C8226d.m2265a(this.f2318l, this.f2319m, this.f2316j, this.f2313g, this.f2305H, this.f2311e, kVar);
            this.f2307J = c8226dM2265a;
            this.f2308K = DoubleCheck.provider(c8226dM2265a);
        }

        @Override // com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools
        public PaylibNativeDeeplinkRouter getPaylibNativeDeeplinkRouter() {
            return (PaylibNativeDeeplinkRouter) this.f2308K.get();
        }

        @Override // com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools
        public PaylibNativeRouter getPaylibNativeRouter() {
            return (PaylibNativeRouter) this.f2308K.get();
        }
    }

    /* renamed from: a */
    public static b m2186a() {
        return new b();
    }
}
