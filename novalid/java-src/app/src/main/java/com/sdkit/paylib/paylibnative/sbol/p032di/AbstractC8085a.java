package com.sdkit.paylib.paylibnative.sbol.p032di;

import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkFactory;
import com.sdkit.paylib.paylibdomain.api.deeplink.PaylibDeeplinkParser;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoiceHolder;
import com.sdkit.paylib.paylibdomain.api.invoice.InvoicePaymentInteractor;
import com.sdkit.paylib.paylibdomain.api.p027di.PaylibDomainTools;
import com.sdkit.paylib.paylibdomain.api.payment.PaymentMethodSelector;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnative.api.analytics.CustomPaylibAnalytics;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeDeeplinkRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibNativeRouter;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibSbolPayReturnDeepLinkProvider;
import com.sdkit.paylib.paylibnative.sbol.C8084b;
import com.sdkit.paylib.paylibpayment.api.p037di.PaylibPaymentTools;
import com.sdkit.paylib.paylibplatform.api.coroutines.CoroutineDispatchers;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a */
/* loaded from: classes8.dex */
public abstract class AbstractC8085a {

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$b */
    public static final class b {

        /* renamed from: a */
        public PaylibDomainTools f1693a;

        /* renamed from: b */
        public PaylibLoggingTools f1694b;

        /* renamed from: c */
        public PaylibPaymentTools f1695c;

        /* renamed from: d */
        public PaylibPlatformTools f1696d;

        /* renamed from: e */
        public SbolAnalyticsPaylibNativeDependencies f1697e;

        /* renamed from: f */
        public SbolPaylibNativeDependencies f1698f;

        public b() {
        }

        /* renamed from: a */
        public b m1757a(PaylibDomainTools paylibDomainTools) {
            this.f1693a = (PaylibDomainTools) Preconditions.checkNotNull(paylibDomainTools);
            return this;
        }

        /* renamed from: a */
        public b m1758a(PaylibLoggingTools paylibLoggingTools) {
            this.f1694b = (PaylibLoggingTools) Preconditions.checkNotNull(paylibLoggingTools);
            return this;
        }

        /* renamed from: a */
        public b m1759a(SbolAnalyticsPaylibNativeDependencies sbolAnalyticsPaylibNativeDependencies) {
            this.f1697e = (SbolAnalyticsPaylibNativeDependencies) Preconditions.checkNotNull(sbolAnalyticsPaylibNativeDependencies);
            return this;
        }

        /* renamed from: a */
        public b m1760a(SbolPaylibNativeDependencies sbolPaylibNativeDependencies) {
            this.f1698f = (SbolPaylibNativeDependencies) Preconditions.checkNotNull(sbolPaylibNativeDependencies);
            return this;
        }

        /* renamed from: a */
        public b m1761a(PaylibPaymentTools paylibPaymentTools) {
            this.f1695c = (PaylibPaymentTools) Preconditions.checkNotNull(paylibPaymentTools);
            return this;
        }

        /* renamed from: a */
        public b m1762a(PaylibPlatformTools paylibPlatformTools) {
            this.f1696d = (PaylibPlatformTools) Preconditions.checkNotNull(paylibPlatformTools);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8086b m1763a() {
            Preconditions.checkBuilderRequirement(this.f1693a, PaylibDomainTools.class);
            Preconditions.checkBuilderRequirement(this.f1694b, PaylibLoggingTools.class);
            Preconditions.checkBuilderRequirement(this.f1695c, PaylibPaymentTools.class);
            Preconditions.checkBuilderRequirement(this.f1696d, PaylibPlatformTools.class);
            Preconditions.checkBuilderRequirement(this.f1697e, SbolAnalyticsPaylibNativeDependencies.class);
            Preconditions.checkBuilderRequirement(this.f1698f, SbolPaylibNativeDependencies.class);
            return new c(this.f1693a, this.f1694b, this.f1695c, this.f1696d, this.f1697e, this.f1698f);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c */
    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC8086b {

        /* renamed from: c */
        public final c f1699c;

        /* renamed from: d */
        public Provider f1700d;

        /* renamed from: e */
        public Provider f1701e;

        /* renamed from: f */
        public Provider f1702f;

        /* renamed from: g */
        public Provider f1703g;

        /* renamed from: h */
        public Provider f1704h;

        /* renamed from: i */
        public Provider f1705i;

        /* renamed from: j */
        public Provider f1706j;

        /* renamed from: k */
        public Provider f1707k;

        /* renamed from: l */
        public Provider f1708l;

        /* renamed from: m */
        public Provider f1709m;

        /* renamed from: n */
        public Provider f1710n;

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$a */
        public static final class a implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f1711a;

            public a(PaylibPlatformTools paylibPlatformTools) {
                this.f1711a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CoroutineDispatchers get() {
                return (CoroutineDispatchers) Preconditions.checkNotNullFromComponent(this.f1711a.getCoroutineDispatchers());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$b */
        public static final class b implements Provider {

            /* renamed from: a */
            public final SbolAnalyticsPaylibNativeDependencies f1712a;

            public b(SbolAnalyticsPaylibNativeDependencies sbolAnalyticsPaylibNativeDependencies) {
                this.f1712a = sbolAnalyticsPaylibNativeDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomPaylibAnalytics get() {
                return (CustomPaylibAnalytics) Preconditions.checkNotNullFromComponent(this.f1712a.getCustomPaylibAnalytics());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$c, reason: collision with other inner class name */
        public static final class C11906c implements Provider {

            /* renamed from: a */
            public final SbolPaylibNativeDependencies f1713a;

            public C11906c(SbolPaylibNativeDependencies sbolPaylibNativeDependencies) {
                this.f1713a = sbolPaylibNativeDependencies;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibSbolPayReturnDeepLinkProvider get() {
                return (PaylibSbolPayReturnDeepLinkProvider) Preconditions.checkNotNullFromComponent(this.f1713a.getDeepLinkProvider());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$d */
        public static final class d implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f1714a;

            public d(PaylibDomainTools paylibDomainTools) {
                this.f1714a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InvoiceHolder get() {
                return (InvoiceHolder) Preconditions.checkNotNullFromComponent(this.f1714a.getInvoiceHolder());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$e */
        public static final class e implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f1715a;

            public e(PaylibDomainTools paylibDomainTools) {
                this.f1715a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InvoicePaymentInteractor get() {
                return (InvoicePaymentInteractor) Preconditions.checkNotNullFromComponent(this.f1715a.getInvoicePaymentInteractor());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$f */
        public static final class f implements Provider {

            /* renamed from: a */
            public final PaylibLoggingTools f1716a;

            public f(PaylibLoggingTools paylibLoggingTools) {
                this.f1716a = paylibLoggingTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibLoggerFactory get() {
                return (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f1716a.getLoggerFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$g */
        public static final class g implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f1717a;

            public g(PaylibDomainTools paylibDomainTools) {
                this.f1717a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibDeeplinkFactory get() {
                return (PaylibDeeplinkFactory) Preconditions.checkNotNullFromComponent(this.f1717a.getPaylibDeeplinkFactory());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$h */
        public static final class h implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f1718a;

            public h(PaylibDomainTools paylibDomainTools) {
                this.f1718a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaylibDeeplinkParser get() {
                return (PaylibDeeplinkParser) Preconditions.checkNotNullFromComponent(this.f1718a.getPaylibDeeplinkParser());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnative.sbol.di.a$c$i */
        public static final class i implements Provider {

            /* renamed from: a */
            public final PaylibDomainTools f1719a;

            public i(PaylibDomainTools paylibDomainTools) {
                this.f1719a = paylibDomainTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaymentMethodSelector get() {
                return (PaymentMethodSelector) Preconditions.checkNotNullFromComponent(this.f1719a.getPaymentMethodSelector());
            }
        }

        public c(PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools, SbolAnalyticsPaylibNativeDependencies sbolAnalyticsPaylibNativeDependencies, SbolPaylibNativeDependencies sbolPaylibNativeDependencies) {
            this.f1699c = this;
            m1764a(paylibDomainTools, paylibLoggingTools, paylibPaymentTools, paylibPlatformTools, sbolAnalyticsPaylibNativeDependencies, sbolPaylibNativeDependencies);
        }

        /* renamed from: a */
        public final void m1764a(PaylibDomainTools paylibDomainTools, PaylibLoggingTools paylibLoggingTools, PaylibPaymentTools paylibPaymentTools, PaylibPlatformTools paylibPlatformTools, SbolAnalyticsPaylibNativeDependencies sbolAnalyticsPaylibNativeDependencies, SbolPaylibNativeDependencies sbolPaylibNativeDependencies) {
            this.f1700d = new d(paylibDomainTools);
            this.f1701e = new e(paylibDomainTools);
            this.f1702f = new a(paylibPlatformTools);
            this.f1703g = new C11906c(sbolPaylibNativeDependencies);
            this.f1704h = new b(sbolAnalyticsPaylibNativeDependencies);
            this.f1705i = new f(paylibLoggingTools);
            this.f1706j = new h(paylibDomainTools);
            this.f1707k = new g(paylibDomainTools);
            i iVar = new i(paylibDomainTools);
            this.f1708l = iVar;
            C8084b c8084bM1754a = C8084b.m1754a(this.f1700d, this.f1701e, this.f1702f, this.f1703g, this.f1704h, this.f1705i, this.f1706j, this.f1707k, iVar);
            this.f1709m = c8084bM1754a;
            this.f1710n = DoubleCheck.provider(c8084bM1754a);
        }

        @Override // com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools
        public PaylibNativeDeeplinkRouter getPaylibNativeDeeplinkRouter() {
            return (PaylibNativeDeeplinkRouter) this.f1710n.get();
        }

        @Override // com.sdkit.paylib.paylibnative.api.p031di.PaylibNativeTools
        public PaylibNativeRouter getPaylibNativeRouter() {
            return (PaylibNativeRouter) this.f1710n.get();
        }
    }

    /* renamed from: a */
    public static b m1756a() {
        return new b();
    }
}
