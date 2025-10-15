package com.sdkit.paylib.paylibnetwork.impl.p036di;

import android.content.Context;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.payliblogging.api.p029di.PaylibLoggingTools;
import com.sdkit.paylib.paylibnetwork.api.domain.NetworkDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.PingInternetDetector;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import com.sdkit.paylib.paylibnetwork.api.domain.client.WebClientFactory;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8460a;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8461b;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8478d;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8481g;
import com.sdkit.paylib.paylibnetwork.impl.domain.certificatepinning.C8465c;
import com.sdkit.paylib.paylibnetwork.impl.domain.client.C8468b;
import com.sdkit.paylib.paylibnetwork.impl.domain.client.C8470d;
import com.sdkit.paylib.paylibnetwork.impl.domain.client.C8472f;
import com.sdkit.paylib.paylibnetwork.impl.domain.client.C8474h;
import com.sdkit.paylib.paylibnetwork.impl.domain.client.C8475i;
import com.sdkit.paylib.paylibnetwork.impl.domain.client.InterfaceC8467a;
import com.sdkit.paylib.paylibplatform.api.p039di.PaylibPlatformTools;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.a */
/* loaded from: classes6.dex */
public abstract class AbstractC8455a {

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.a$b */
    public static final class b {

        /* renamed from: a */
        public PaylibLoggingTools f4111a;

        /* renamed from: b */
        public PaylibPlatformTools f4112b;

        public b() {
        }

        /* renamed from: a */
        public b m3793a(PaylibLoggingTools paylibLoggingTools) {
            this.f4111a = (PaylibLoggingTools) Preconditions.checkNotNull(paylibLoggingTools);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: a */
        public b m3794a(PaylibPlatformTools paylibPlatformTools) {
            this.f4112b = (PaylibPlatformTools) Preconditions.checkNotNull(paylibPlatformTools);
            return this;
        }

        /* renamed from: a */
        public InterfaceC8456b m3795a() {
            Preconditions.checkBuilderRequirement(this.f4111a, PaylibLoggingTools.class);
            Preconditions.checkBuilderRequirement(this.f4112b, PaylibPlatformTools.class);
            return new c(this.f4111a, this.f4112b);
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.a$c */
    public static final class c implements InterfaceC8456b {

        /* renamed from: b */
        public final PaylibPlatformTools f4113b;

        /* renamed from: c */
        public final c f4114c;

        /* renamed from: d */
        public Provider f4115d;

        /* renamed from: e */
        public Provider f4116e;

        /* renamed from: f */
        public Provider f4117f;

        /* renamed from: g */
        public Provider f4118g;

        /* renamed from: h */
        public Provider f4119h;

        /* renamed from: i */
        public Provider f4120i;

        /* renamed from: j */
        public Provider f4121j;

        /* renamed from: k */
        public Provider f4122k;

        /* renamed from: l */
        public C8475i f4123l;

        /* renamed from: m */
        public Provider f4124m;

        /* renamed from: n */
        public Provider f4125n;

        /* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.a$c$a */
        public static final class a implements Provider {

            /* renamed from: a */
            public final PaylibPlatformTools f4126a;

            public a(PaylibPlatformTools paylibPlatformTools) {
                this.f4126a = paylibPlatformTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public Context get() {
                return (Context) Preconditions.checkNotNullFromComponent(this.f4126a.getContext());
            }
        }

        /* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.a$c$b */
        public static final class b implements Provider {

            /* renamed from: a */
            public final PaylibLoggingTools f4127a;

            public b(PaylibLoggingTools paylibLoggingTools) {
                this.f4127a = paylibLoggingTools;
            }

            @Override // javax.inject.Provider
            /* renamed from: a */
            public PaylibLoggerFactory get() {
                return (PaylibLoggerFactory) Preconditions.checkNotNullFromComponent(this.f4127a.getLoggerFactory());
            }
        }

        public c(PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
            this.f4114c = this;
            this.f4113b = paylibPlatformTools;
            m3797a(paylibLoggingTools, paylibPlatformTools);
        }

        /* renamed from: a */
        public final C8460a m3796a() {
            return new C8460a((Context) Preconditions.checkNotNullFromComponent(this.f4113b.getContext()));
        }

        /* renamed from: b */
        public final C8474h m3798b() {
            return new C8474h((InterfaceC8467a) this.f4124m.get());
        }

        @Override // com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools
        public NetworkDetector getNetworkDetector() {
            return m3796a();
        }

        @Override // com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools
        public PingInternetDetector getPingInternetDetector() {
            return new C8461b();
        }

        @Override // com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools
        public WebClientFactory getWebClientFactory() {
            return m3798b();
        }

        @Override // com.sdkit.paylib.paylibnetwork.api.p035di.PaylibNetworkTools
        public WebViewCertificateVerifier getWebViewCertificateVerifier() {
            return (WebViewCertificateVerifier) this.f4125n.get();
        }

        public /* synthetic */ c(PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools, a aVar) {
            this(paylibLoggingTools, paylibPlatformTools);
        }

        /* renamed from: a */
        public final void m3797a(PaylibLoggingTools paylibLoggingTools, PaylibPlatformTools paylibPlatformTools) {
            this.f4115d = DoubleCheck.provider(C8465c.m3817a());
            this.f4116e = new a(paylibPlatformTools);
            b bVar = new b(paylibLoggingTools);
            this.f4117f = bVar;
            Provider provider = DoubleCheck.provider(C8481g.m3859a(this.f4116e, bVar));
            this.f4118g = provider;
            Provider provider2 = DoubleCheck.provider(C8459e.m3807a(provider));
            this.f4119h = provider2;
            Provider provider3 = DoubleCheck.provider(C8478d.m3842a(this.f4115d, provider2));
            this.f4120i = provider3;
            C8472f c8472fM3830a = C8472f.m3830a(provider3);
            this.f4121j = c8472fM3830a;
            C8470d c8470dM3825a = C8470d.m3825a(c8472fM3830a);
            this.f4122k = c8470dM3825a;
            C8475i c8475iM3836a = C8475i.m3836a(c8470dM3825a);
            this.f4123l = c8475iM3836a;
            this.f4124m = C8468b.m3822a(c8475iM3836a);
            this.f4125n = DoubleCheck.provider(C8458d.m3805a(this.f4116e, this.f4117f));
        }
    }

    /* renamed from: a */
    public static b m3792a() {
        return new b();
    }
}
