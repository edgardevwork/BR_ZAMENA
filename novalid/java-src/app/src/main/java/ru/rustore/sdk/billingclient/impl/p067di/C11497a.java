package ru.rustore.sdk.billingclient.impl.p067di;

import android.content.Context;
import com.sdkit.paylib.paylibpayment.api.config.BackendUrlProvider;
import com.sdkit.paylib.paylibpayment.api.domain.PaylibTokenProvider;
import com.sdkit.paylib.paylibsdk.client.PaylibSdk;
import com.sdkit.paylib.paylibsdk.client.PaylibSdkClient;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.analytics.AnalyticsEventProvider;
import ru.rustore.sdk.billingclient.impl.C11404a;
import ru.rustore.sdk.billingclient.impl.C11418c;
import ru.rustore.sdk.billingclient.impl.analytics.C11405a;
import ru.rustore.sdk.billingclient.impl.analytics.C11414j;
import ru.rustore.sdk.billingclient.impl.analytics.C11416l;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11423a;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11424b;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11425c;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11426d;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11427e;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11429g;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11431i;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11432j;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11433k;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11434l;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11435m;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11436n;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11437o;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11438p;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11441s;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11442t;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11443u;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11444v;
import ru.rustore.sdk.billingclient.impl.data.deserializer.C11445a;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11446a;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11448c;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11449d;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11450e;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11451f;
import ru.rustore.sdk.billingclient.impl.data.mapper.C11452g;
import ru.rustore.sdk.billingclient.impl.data.network.C11456b;
import ru.rustore.sdk.billingclient.impl.data.provider.C11457a;
import ru.rustore.sdk.billingclient.impl.data.provider.C11458b;
import ru.rustore.sdk.billingclient.impl.data.provider.C11459c;
import ru.rustore.sdk.billingclient.impl.data.provider.C11460d;
import ru.rustore.sdk.billingclient.impl.data.provider.C11461e;
import ru.rustore.sdk.billingclient.impl.data.provider.C11462f;
import ru.rustore.sdk.billingclient.impl.data.provider.C11467k;
import ru.rustore.sdk.billingclient.impl.data.provider.C11472p;
import ru.rustore.sdk.billingclient.impl.data.repository.C11473a;
import ru.rustore.sdk.billingclient.impl.data.repository.C11474b;
import ru.rustore.sdk.billingclient.impl.data.repository.C11478f;
import ru.rustore.sdk.billingclient.impl.data.repository.C11479g;
import ru.rustore.sdk.billingclient.impl.data.repository.C11480h;
import ru.rustore.sdk.billingclient.impl.data.repository.C11481i;
import ru.rustore.sdk.billingclient.impl.data.repository.C11483k;
import ru.rustore.sdk.billingclient.impl.data.repository.C11485m;
import ru.rustore.sdk.billingclient.impl.data.repository.C11486n;
import ru.rustore.sdk.billingclient.impl.data.repository.C11487o;
import ru.rustore.sdk.billingclient.impl.data.repository.C11488p;
import ru.rustore.sdk.billingclient.impl.data.repository.C11489q;
import ru.rustore.sdk.billingclient.impl.data.repository.C11490r;
import ru.rustore.sdk.billingclient.impl.data.repository.C11491s;
import ru.rustore.sdk.billingclient.impl.data.repository.C11493u;
import ru.rustore.sdk.billingclient.impl.data.repository.C11494v;
import ru.rustore.sdk.billingclient.impl.data.repository.C11495w;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;
import ru.rustore.sdk.billingclient.impl.domain.factory.C11499a;
import ru.rustore.sdk.billingclient.impl.domain.factory.C11500b;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11502b;
import ru.rustore.sdk.billingclient.impl.domain.interactor.C11503c;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11514a;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11515b;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11516c;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11517d;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11518e;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11519f;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11523j;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11524k;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11525l;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11526m;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11527n;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11528o;
import ru.rustore.sdk.billingclient.impl.domain.usecase.C11529p;
import ru.rustore.sdk.billingclient.impl.logger.C11531b;
import ru.rustore.sdk.billingclient.impl.paylib.unauthorized.C11532a;
import ru.rustore.sdk.billingclient.impl.paylib.unauthorized.C11533b;
import ru.rustore.sdk.billingclient.impl.presentation.auth.C11534a;
import ru.rustore.sdk.billingclient.impl.presentation.auth.C11543j;
import ru.rustore.sdk.billingclient.impl.presentation.handler.C11546a;
import ru.rustore.sdk.billingclient.impl.utils.C11550b;
import ru.rustore.sdk.billingclient.impl.utils.InterfaceC11549a;
import ru.rustore.sdk.billingclient.model.common.ConsoleApplicationId;
import ru.rustore.sdk.billingclient.presentation.C11557a;
import ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider;
import ru.rustore.sdk.billingclient.provider.logger.ExternalPaymentLoggerFactory;
import ru.rustore.sdk.metrics.MetricsClient;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.store.versionprovider.StoreVersionProvider;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* renamed from: ru.rustore.sdk.billingclient.impl.di.a */
/* loaded from: classes5.dex */
public final class C11497a {

    /* renamed from: u0 */
    public static final Lazy<C11497a> f10328u0 = LazyKt__LazyJVMKt.lazy(C11964a.f10427a);

    /* renamed from: X */
    public final Lazy f10352X;

    /* renamed from: Y */
    public final Lazy f10353Y;

    /* renamed from: Z */
    public final Lazy f10354Z;

    /* renamed from: a */
    public String f10355a;

    /* renamed from: a0 */
    public final Lazy f10356a0;

    /* renamed from: b */
    public Map<String, ? extends Object> f10357b;

    /* renamed from: b0 */
    public final Lazy f10358b0;

    /* renamed from: c */
    public String f10359c;

    /* renamed from: c0 */
    public final Lazy f10360c0;

    /* renamed from: d */
    public BillingClientThemeProvider f10361d;

    /* renamed from: d0 */
    public final Lazy f10362d0;

    /* renamed from: e */
    public ExternalPaymentLoggerFactory f10363e;

    /* renamed from: e0 */
    public final Lazy f10364e0;

    /* renamed from: f */
    public boolean f10365f;

    /* renamed from: f0 */
    public final Lazy f10366f0;

    /* renamed from: g0 */
    public final Lazy f10368g0;

    /* renamed from: h0 */
    public final Lazy f10370h0;

    /* renamed from: i */
    public WeakReference<Context> f10371i;

    /* renamed from: i0 */
    public final Lazy f10372i0;

    /* renamed from: j0 */
    public final Lazy f10374j0;

    /* renamed from: k0 */
    public final Lazy f10376k0;

    /* renamed from: l0 */
    public final Lazy f10378l0;

    /* renamed from: m0 */
    public final Lazy f10380m0;

    /* renamed from: n0 */
    public final Lazy f10382n0;

    /* renamed from: o0 */
    public final Lazy f10384o0;

    /* renamed from: p0 */
    public final Lazy f10386p0;

    /* renamed from: q0 */
    public final Lazy f10388q0;

    /* renamed from: r0 */
    public final Lazy f10390r0;

    /* renamed from: s0 */
    public final Lazy f10392s0;

    /* renamed from: t0 */
    public final Lazy f10394t0;

    /* renamed from: g */
    public final Lazy f10367g = LazyKt__LazyJVMKt.lazy(O.f10415a);

    /* renamed from: h */
    public final Lazy f10369h = LazyKt__LazyJVMKt.lazy(N.f10414a);

    /* renamed from: j */
    public final Lazy f10373j = LazyKt__LazyJVMKt.lazy(new M());

    /* renamed from: k */
    public final Lazy f10375k = LazyKt__LazyJVMKt.lazy(new C());

    /* renamed from: l */
    public final Lazy f10377l = LazyKt__LazyJVMKt.lazy(new L());

    /* renamed from: m */
    public final Lazy f10379m = LazyKt__LazyJVMKt.lazy(new b0());

    /* renamed from: n */
    public final Lazy f10381n = LazyKt__LazyJVMKt.lazy(new Z());

    /* renamed from: o */
    public final Lazy f10383o = LazyKt__LazyJVMKt.lazy(a0.f10428a);

    /* renamed from: p */
    public final Lazy f10385p = LazyKt__LazyJVMKt.lazy(C11974k.f10446a);

    /* renamed from: q */
    public final Lazy f10387q = LazyKt__LazyJVMKt.lazy(A.f10401a);

    /* renamed from: r */
    public final Lazy f10389r = LazyKt__LazyJVMKt.lazy(T.f10420a);

    /* renamed from: s */
    public final Lazy f10391s = LazyKt__LazyJVMKt.lazy(new c0());

    /* renamed from: t */
    public final Lazy f10393t = LazyKt__LazyJVMKt.lazy(new U());

    /* renamed from: u */
    public final Lazy f10395u = LazyKt__LazyJVMKt.lazy(new C11975l());

    /* renamed from: v */
    public final Lazy f10396v = LazyKt__LazyJVMKt.lazy(new k0());

    /* renamed from: w */
    public final Lazy f10397w = LazyKt__LazyJVMKt.lazy(new C11969f());

    /* renamed from: x */
    public final Lazy f10398x = LazyKt__LazyJVMKt.lazy(new C11971h());

    /* renamed from: y */
    public final Lazy f10399y = LazyKt__LazyJVMKt.lazy(C11970g.f10438a);

    /* renamed from: z */
    public final Lazy f10400z = LazyKt__LazyJVMKt.lazy(new B());

    /* renamed from: A */
    public final Lazy f10329A = LazyKt__LazyJVMKt.lazy(new V());

    /* renamed from: B */
    public final Lazy f10330B = LazyKt__LazyJVMKt.lazy(new C11966c());

    /* renamed from: C */
    public final Lazy f10331C = LazyKt__LazyJVMKt.lazy(new X());

    /* renamed from: D */
    public final Lazy f10332D = LazyKt__LazyJVMKt.lazy(new C11977n());

    /* renamed from: E */
    public final Lazy f10333E = LazyKt__LazyJVMKt.lazy(new C11976m());

    /* renamed from: F */
    public final Lazy f10334F = LazyKt__LazyJVMKt.lazy(C11973j.f10444a);

    /* renamed from: G */
    public final Lazy f10335G = LazyKt__LazyJVMKt.lazy(d0.f10433a);

    /* renamed from: H */
    public final Lazy f10336H = LazyKt__LazyJVMKt.lazy(new Q());

    /* renamed from: I */
    public final Lazy f10337I = LazyKt__LazyJVMKt.lazy(new P());

    /* renamed from: J */
    public final Lazy f10338J = LazyKt__LazyJVMKt.lazy(p0.f10457a);

    /* renamed from: K */
    public final Lazy f10339K = LazyKt__LazyJVMKt.lazy(new n0());

    /* renamed from: L */
    public final Lazy f10340L = LazyKt__LazyJVMKt.lazy(new Y());

    /* renamed from: M */
    public final Lazy f10341M = LazyKt__LazyJVMKt.lazy(new C11987x());

    /* renamed from: N */
    public final Lazy f10342N = LazyKt__LazyJVMKt.lazy(new R());

    /* renamed from: O */
    public final Lazy f10343O = LazyKt__LazyJVMKt.lazy(new S());

    /* renamed from: P */
    public final Lazy f10344P = LazyKt__LazyJVMKt.lazy(C11979p.f10456a);

    /* renamed from: Q */
    public final Lazy f10345Q = LazyKt__LazyJVMKt.lazy(new o0());

    /* renamed from: R */
    public final Lazy f10346R = LazyKt__LazyJVMKt.lazy(new C11988y());

    /* renamed from: S */
    public final Lazy f10347S = LazyKt__LazyJVMKt.lazy(new W());

    /* renamed from: T */
    public final Lazy f10348T = LazyKt__LazyJVMKt.lazy(new l0());

    /* renamed from: U */
    public final Lazy f10349U = LazyKt__LazyJVMKt.lazy(new C11984u());

    /* renamed from: V */
    public final Lazy f10350V = LazyKt__LazyJVMKt.lazy(new C11989z());

    /* renamed from: W */
    public final Lazy f10351W = LazyKt__LazyJVMKt.lazy(new C11986w());

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$A */
    /* loaded from: classes8.dex */
    public static final class A extends Lambda implements Function0<C11427e> {

        /* renamed from: a */
        public static final A f10401a = new A();

        public A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11427e invoke() {
            return new C11427e();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$B */
    /* loaded from: classes8.dex */
    public static final class B extends Lambda implements Function0<MetricsClient> {
        public B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MetricsClient invoke() {
            MetricsClient.Companion companion = MetricsClient.INSTANCE;
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return companion.getInstance(context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$C */
    /* loaded from: classes8.dex */
    public static final class C extends Lambda implements Function0<String> {
        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context != null) {
                return context.getPackageName();
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$D */
    /* loaded from: classes8.dex */
    public static final class D extends Lambda implements Function0<PaylibSdk> {
        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PaylibSdk invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            String str = C11497a.this.f10359c;
            ConsoleApplicationId consoleApplicationIdM17589boximpl = str != null ? ConsoleApplicationId.m17589boximpl(str) : null;
            if (consoleApplicationIdM17589boximpl == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String consoleApplicationId = consoleApplicationIdM17589boximpl.m17595unboximpl();
            String deeplink = C11497a.this.f10355a;
            if (deeplink == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deeplink");
                deeplink = null;
            }
            C11497a c11497a = C11497a.this;
            BillingClientThemeProvider billingClientThemeProvider = c11497a.f10361d;
            ExternalPaymentLoggerFactory externalPaymentLoggerFactory = c11497a.f10363e;
            C11405a billingAnalytics = (C11405a) c11497a.f10397w.getValue();
            boolean z = C11497a.this.f10365f;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(consoleApplicationId, "consoleApplicationId");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(billingAnalytics, "billingAnalytics");
            PaylibSdkClient paylibSdkClient = PaylibSdkClient.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            C11461e c11461e = new C11461e();
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            C11462f c11462f = new C11462f(c11461e, applicationContext2, packageName);
            C11457a c11457a = new C11457a();
            Context applicationContext3 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "applicationContext");
            C11546a c11546a = new C11546a(deeplink, applicationContext3);
            C11557a c11557a = new C11557a(billingClientThemeProvider);
            C11458b c11458b = new C11458b(consoleApplicationId);
            C11416l c11416l = new C11416l(billingAnalytics, new C11414j());
            C11531b c11531b = externalPaymentLoggerFactory != null ? new C11531b(externalPaymentLoggerFactory) : null;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return PaylibSdkClient.installDefault(applicationContext, c11462f, (80 & 4) != 0 ? null : c11457a, (80 & 8) != 0 ? null : c11546a, (80 & 16) != 0 ? null : null, (80 & 32) != 0 ? null : c11557a, (80 & 64) != 0 ? null : null, (80 & 128) != 0 ? null : c11458b, (80 & 256) != 0 ? null : c11531b, (80 & 512) == 0 ? c11416l : null, (80 & 1024) != 0 ? false : z);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$E */
    /* loaded from: classes8.dex */
    public static final class E extends Lambda implements Function0<C11481i> {

        /* renamed from: a */
        public static final E f10405a = new E();

        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11481i invoke() {
            return new C11481i();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$F */
    /* loaded from: classes8.dex */
    public static final class F extends Lambda implements Function0<C11429g> {
        public F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11429g invoke() {
            return new C11429g((C11456b) C11497a.this.f10372i0.getValue(), new C11445a());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$G */
    /* loaded from: classes8.dex */
    public static final class G extends Lambda implements Function0<C11456b> {
        public G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11456b invoke() {
            C11499a c11499a = (C11499a) C11497a.this.f10331C.getValue();
            C11479g c11479g = (C11479g) C11497a.this.f10332D.getValue();
            Object value = C11497a.this.f10375k.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-packageName>(...)");
            return new C11456b(c11499a, c11479g, (String) value);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$H */
    /* loaded from: classes8.dex */
    public static final class H extends Lambda implements Function0<C11483k> {
        public H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11483k invoke() {
            return new C11483k((C11429g) C11497a.this.f10374j0.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$I */
    /* loaded from: classes8.dex */
    public static final class I extends Lambda implements Function0<C11404a> {
        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11404a invoke() {
            return new C11404a((C11518e) C11497a.this.f10382n0.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$J */
    /* loaded from: classes8.dex */
    public static final class J extends Lambda implements Function0<C11431i> {
        public J() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11431i invoke() {
            C11532a c11532a = (C11532a) C11497a.this.f10356a0.getValue();
            PaylibTokenProvider tokenProvider = (PaylibTokenProvider) C11497a.this.f10386p0.getValue();
            BackendUrlProvider backendUrlProvider = (BackendUrlProvider) C11497a.this.f10388q0.getValue();
            c11532a.getClass();
            Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
            Intrinsics.checkNotNullParameter(backendUrlProvider, "backendUrlProvider");
            return new C11431i(PaylibSdkClient.installDefault(c11532a.f10544b, tokenProvider, (80 & 4) != 0 ? null : backendUrlProvider, (80 & 8) != 0 ? null : null, (80 & 16) != 0 ? null : null, (80 & 32) != 0 ? null : null, (80 & 64) != 0 ? null : null, (80 & 128) != 0 ? null : new C11458b(c11532a.f10543a), (80 & 256) != 0 ? null : null, (80 & 512) == 0 ? null : null, (80 & 1024) != 0 ? false : false).productsInteractor(), Dispatchers.INSTANCE);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$K */
    /* loaded from: classes8.dex */
    public static final class K extends Lambda implements Function0<C11485m> {
        public K() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11485m invoke() {
            return new C11485m((C11431i) C11497a.this.f10360c0.getValue(), new C11449d());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$L */
    /* loaded from: classes8.dex */
    public static final class L extends Lambda implements Function0<C11432j> {
        public L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11432j invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11432j(context, (C11467k) C11497a.this.f10369h.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$M */
    /* loaded from: classes8.dex */
    public static final class M extends Lambda implements Function0<C11433k> {
        public M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11433k invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11433k(context, (C11472p) C11497a.this.f10367g.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$N */
    /* loaded from: classes8.dex */
    public static final class N extends Lambda implements Function0<C11467k> {

        /* renamed from: a */
        public static final N f10414a = new N();

        public N() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11467k invoke() {
            return new C11467k();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$O */
    /* loaded from: classes8.dex */
    public static final class O extends Lambda implements Function0<C11472p> {

        /* renamed from: a */
        public static final O f10415a = new O();

        public O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11472p invoke() {
            return new C11472p();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$P */
    /* loaded from: classes8.dex */
    public static final class P extends Lambda implements Function0<C11434l> {
        public P() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11434l invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11434l(context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$Q */
    /* loaded from: classes8.dex */
    public static final class Q extends Lambda implements Function0<C11486n> {
        public Q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11486n invoke() {
            return new C11486n((C11434l) C11497a.this.f10337I.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$R */
    /* loaded from: classes8.dex */
    public static final class R extends Lambda implements Function0<C11487o> {
        public R() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11487o invoke() {
            return new C11487o((C11435m) C11497a.this.f10343O.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$S */
    /* loaded from: classes8.dex */
    public static final class S extends Lambda implements Function0<C11435m> {
        public S() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11435m invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            UserProfileProvider userProfileProvider = new UserProfileProvider(context);
            Object value = C11497a.this.f10375k.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-packageName>(...)");
            return new C11435m(userProfileProvider, (String) value);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$T */
    /* loaded from: classes8.dex */
    public static final class T extends Lambda implements Function0<C11450e> {

        /* renamed from: a */
        public static final T f10420a = new T();

        public T() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11450e invoke() {
            return new C11450e();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$U */
    /* loaded from: classes8.dex */
    public static final class U extends Lambda implements Function0<C11488p> {
        public U() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11488p invoke() {
            return new C11488p((C11433k) C11497a.this.f10373j.getValue(), (C11432j) C11497a.this.f10377l.getValue(), (C11424b) C11497a.this.f10385p.getValue(), (C11427e) C11497a.this.f10387q.getValue(), (C11450e) C11497a.this.f10389r.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$V */
    /* loaded from: classes8.dex */
    public static final class V extends Lambda implements Function0<C11489q> {
        public V() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11489q invoke() {
            return new C11489q(new C11436n(), new C11437o(C11497a.this.f10357b), new C11438p());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$W */
    /* loaded from: classes8.dex */
    public static final class W extends Lambda implements Function0<C11527n> {
        public W() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11527n invoke() {
            return new C11527n((C11496x) C11497a.this.f10338J.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$X */
    /* loaded from: classes8.dex */
    public static final class X extends Lambda implements Function0<C11499a> {
        public X() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11499a invoke() {
            C11459c c11459c = (C11459c) C11497a.this.f10334F.getValue();
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11499a(c11459c, context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$Y */
    /* loaded from: classes8.dex */
    public static final class Y extends Lambda implements Function0<C11528o> {
        public Y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11528o invoke() {
            return new C11528o((C11495w) C11497a.this.f10339K.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$Z */
    /* loaded from: classes8.dex */
    public static final class Z extends Lambda implements Function0<C11441s> {
        public Z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11441s invoke() {
            return new C11441s((StoreVersionProvider) C11497a.this.f10379m.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$a */
    /* loaded from: classes8.dex */
    public static final class C11964a extends Lambda implements Function0<C11497a> {

        /* renamed from: a */
        public static final C11964a f10427a = new C11964a();

        public C11964a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11497a invoke() {
            return new C11497a();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$a0 */
    /* loaded from: classes8.dex */
    public static final class a0 extends Lambda implements Function0<C11451f> {

        /* renamed from: a */
        public static final a0 f10428a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11451f invoke() {
            return new C11451f();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$b */
    public static final class C11965b {
        /* renamed from: a */
        public static C11497a m7463a() {
            return C11497a.f10328u0.getValue();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$b0 */
    /* loaded from: classes8.dex */
    public static final class b0 extends Lambda implements Function0<StoreVersionProvider> {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final StoreVersionProvider invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(\n        …der?.get(),\n            )");
            return new StoreVersionProvider(context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$c */
    /* loaded from: classes8.dex */
    public static final class C11966c extends Lambda implements Function0<C11473a> {
        public C11966c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11473a invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11473a(new C11423a(context));
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$c0 */
    /* loaded from: classes8.dex */
    public static final class c0 extends Lambda implements Function0<C11490r> {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11490r invoke() {
            return new C11490r((C11441s) C11497a.this.f10381n.getValue(), (C11451f) C11497a.this.f10383o.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$d */
    /* loaded from: classes8.dex */
    public static final class C11967d extends Lambda implements Function0<C11534a> {
        public C11967d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11534a invoke() {
            C11486n c11486n = (C11486n) C11497a.this.f10336H.getValue();
            C11489q c11489q = (C11489q) C11497a.this.f10329A.getValue();
            C11474b c11474b = (C11474b) C11497a.this.f10398x.getValue();
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11534a(c11486n, c11489q, c11474b, context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$d0 */
    /* loaded from: classes8.dex */
    public static final class d0 extends Lambda implements Function0<C11491s> {

        /* renamed from: a */
        public static final d0 f10433a = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11491s invoke() {
            return new C11491s(new C11442t());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$e */
    /* loaded from: classes8.dex */
    public static final class C11968e extends Lambda implements Function0<C11543j> {
        public C11968e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11543j invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11543j(context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$e0 */
    /* loaded from: classes8.dex */
    public static final class e0 extends Lambda implements Function0<C11498b> {

        /* renamed from: a */
        public static final e0 f10435a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11498b invoke() {
            return new C11498b();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$f */
    /* loaded from: classes8.dex */
    public static final class C11969f extends Lambda implements Function0<C11405a> {
        public C11969f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11405a invoke() {
            C11474b c11474b = (C11474b) C11497a.this.f10398x.getValue();
            C11486n c11486n = (C11486n) C11497a.this.f10336H.getValue();
            C11473a c11473a = (C11473a) C11497a.this.f10330B.getValue();
            C11489q c11489q = (C11489q) C11497a.this.f10329A.getValue();
            C11519f c11519f = (C11519f) C11497a.this.f10349U.getValue();
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "requireNotNull(contextProvider?.get()).packageName");
            return new C11405a(c11474b, c11486n, c11473a, c11489q, c11519f, packageName);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$f0 */
    /* loaded from: classes8.dex */
    public static final class f0 extends Lambda implements Function0<C11532a> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11532a invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Context applicationContext = context.getApplicationContext();
            String str = C11497a.this.f10359c;
            ConsoleApplicationId consoleApplicationIdM17589boximpl = str != null ? ConsoleApplicationId.m17589boximpl(str) : null;
            if (consoleApplicationIdM17589boximpl == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String strM17595unboximpl = consoleApplicationIdM17589boximpl.m17595unboximpl();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new C11532a(strM17595unboximpl, applicationContext);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$g */
    /* loaded from: classes8.dex */
    public static final class C11970g extends Lambda implements Function0<C11446a> {

        /* renamed from: a */
        public static final C11970g f10438a = new C11970g();

        public C11970g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11446a invoke() {
            return new C11446a();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$g0 */
    /* loaded from: classes8.dex */
    public static final class g0 extends Lambda implements Function0<C11533b> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11533b invoke() {
            return new C11533b((C11517d) C11497a.this.f10378l0.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$h */
    /* loaded from: classes8.dex */
    public static final class C11971h extends Lambda implements Function0<C11474b> {
        public C11971h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11474b invoke() {
            C11446a c11446a = (C11446a) C11497a.this.f10399y.getValue();
            MetricsClient metricsClient = (MetricsClient) C11497a.this.f10400z.getValue();
            AnalyticsEventProvider analyticsEventProvider = AnalyticsEventProvider.INSTANCE;
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11474b(analyticsEventProvider, metricsClient, c11446a, context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$h0 */
    /* loaded from: classes8.dex */
    public static final class h0 extends Lambda implements Function0<C11452g> {

        /* renamed from: a */
        public static final h0 f10441a = new h0();

        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11452g invoke() {
            return new C11452g();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$i */
    /* loaded from: classes8.dex */
    public static final class C11972i extends Lambda implements Function0<C11514a> {
        public C11972i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11514a invoke() {
            return new C11514a((C11494v) C11497a.this.f10358b0.getValue(), (C11481i) C11497a.this.f10354Z.getValue(), (C11496x) C11497a.this.f10338J.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$i0 */
    /* loaded from: classes8.dex */
    public static final class i0 extends Lambda implements Function0<C11493u> {
        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11493u invoke() {
            return new C11493u((C11431i) C11497a.this.f10360c0.getValue(), (C11452g) C11497a.this.f10362d0.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$j */
    /* loaded from: classes8.dex */
    public static final class C11973j extends Lambda implements Function0<C11459c> {

        /* renamed from: a */
        public static final C11973j f10444a = new C11973j();

        public C11973j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11459c invoke() {
            return new C11459c(new C11460d(), new C11448c());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$j0 */
    /* loaded from: classes8.dex */
    public static final class j0 extends Lambda implements Function0<C11494v> {

        /* renamed from: a */
        public static final j0 f10445a = new j0();

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11494v invoke() {
            return new C11494v();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$k */
    /* loaded from: classes8.dex */
    public static final class C11974k extends Lambda implements Function0<C11424b> {

        /* renamed from: a */
        public static final C11974k f10446a = new C11974k();

        public C11974k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11424b invoke() {
            return new C11424b();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$k0 */
    /* loaded from: classes8.dex */
    public static final class k0 extends Lambda implements Function0<C11529p> {
        public k0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11529p invoke() {
            return new C11529p((C11490r) C11497a.this.f10391s.getValue(), (C11488p) C11497a.this.f10393t.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$l */
    /* loaded from: classes8.dex */
    public static final class C11975l extends Lambda implements Function0<C11478f> {
        public C11975l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11478f invoke() {
            return new C11478f((C11424b) C11497a.this.f10385p.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$l0 */
    /* loaded from: classes8.dex */
    public static final class l0 extends Lambda implements Function0<C11503c> {
        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11503c invoke() {
            return new C11503c((C11496x) C11497a.this.f10338J.getValue(), (C11525l) C11497a.this.f10341M.getValue(), (C11528o) C11497a.this.f10340L.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$m */
    public static final class C11976m extends Lambda implements Function0<C11425c> {
        public C11976m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11425c invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11425c(context);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$m0 */
    /* loaded from: classes8.dex */
    public static final class m0 extends Lambda implements Function0<C11418c> {
        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11418c invoke() {
            return new C11418c((C11524k) C11497a.this.f10351W.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$n */
    public static final class C11977n extends Lambda implements Function0<C11479g> {
        public C11977n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11479g invoke() {
            return new C11479g((C11425c) C11497a.this.f10333E.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$n0 */
    public static final class n0 extends Lambda implements Function0<C11495w> {
        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11495w invoke() {
            WeakReference<Context> weakReference = C11497a.this.f10371i;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(context, "requireNotNull(contextProvider?.get())");
            return new C11495w(new C11443u(context));
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$o */
    public static final class C11978o extends Lambda implements Function0<C11550b> {

        /* renamed from: a */
        public static final C11978o f10454a = new C11978o();

        public C11978o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11550b invoke() {
            return new C11550b();
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$o0 */
    public static final class o0 extends Lambda implements Function0<C11500b> {
        public o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11500b invoke() {
            return new C11500b((C11491s) C11497a.this.f10335G.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$p */
    public static final class C11979p extends Lambda implements Function0<C11480h> {

        /* renamed from: a */
        public static final C11979p f10456a = new C11979p();

        public C11979p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11480h invoke() {
            return new C11480h(new C11426d());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$p0 */
    public static final class p0 extends Lambda implements Function0<C11496x> {

        /* renamed from: a */
        public static final p0 f10457a = new p0();

        public p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11496x invoke() {
            return new C11496x(new C11444v());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$q */
    public static final class C11980q extends Lambda implements Function0<C11515b> {
        public C11980q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11515b invoke() {
            C11479g c11479g = (C11479g) C11497a.this.f10332D.getValue();
            C11489q c11489q = (C11489q) C11497a.this.f10329A.getValue();
            C11499a c11499a = (C11499a) C11497a.this.f10331C.getValue();
            Object value = C11497a.this.f10375k.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-packageName>(...)");
            return new C11515b(c11479g, c11489q, c11499a, (String) value);
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$r */
    public static final class C11981r extends Lambda implements Function0<C11516c> {
        public C11981r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11516c invoke() {
            return new C11516c((C11480h) C11497a.this.f10344P.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$s */
    public static final class C11982s extends Lambda implements Function0<C11517d> {
        public C11982s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11517d invoke() {
            return new C11517d((C11483k) C11497a.this.f10376k0.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$t */
    public static final class C11983t extends Lambda implements Function0<C11518e> {
        public C11983t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11518e invoke() {
            return new C11518e((C11485m) C11497a.this.f10384o0.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$u */
    public static final class C11984u extends Lambda implements Function0<C11519f> {
        public C11984u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11519f invoke() {
            return new C11519f((C11486n) C11497a.this.f10336H.getValue(), (C11488p) C11497a.this.f10393t.getValue(), (C11496x) C11497a.this.f10338J.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$v */
    public static final class C11985v extends Lambda implements Function0<C11523j> {
        public C11985v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11523j invoke() {
            return new C11523j((C11481i) C11497a.this.f10354Z.getValue(), (C11493u) C11497a.this.f10364e0.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$w */
    public static final class C11986w extends Lambda implements Function0<C11524k> {
        public C11986w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11524k invoke() {
            return new C11524k((C11486n) C11497a.this.f10336H.getValue(), (C11496x) C11497a.this.f10338J.getValue(), (C11487o) C11497a.this.f10342N.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$x */
    public static final class C11987x extends Lambda implements Function0<C11525l> {
        public C11987x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11525l invoke() {
            return new C11525l((C11496x) C11497a.this.f10338J.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$y */
    public static final class C11988y extends Lambda implements Function0<C11526m> {
        public C11988y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11526m invoke() {
            return new C11526m((C11496x) C11497a.this.f10338J.getValue(), (C11491s) C11497a.this.f10335G.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.billingclient.impl.di.a$z */
    public static final class C11989z extends Lambda implements Function0<C11502b> {
        public C11989z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11502b invoke() {
            C11529p c11529p = (C11529p) C11497a.this.f10396v.getValue();
            C11486n c11486n = (C11486n) C11497a.this.f10336H.getValue();
            C11487o c11487o = (C11487o) C11497a.this.f10342N.getValue();
            Object value = C11497a.this.f10375k.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-packageName>(...)");
            return new C11502b(c11486n, c11487o, c11529p, (InterfaceC11549a) C11497a.this.f10368g0.getValue(), (String) value);
        }
    }

    public C11497a() {
        LazyKt__LazyJVMKt.lazy(new C11981r());
        this.f10352X = LazyKt__LazyJVMKt.lazy(new C11968e());
        this.f10353Y = LazyKt__LazyJVMKt.lazy(new C11967d());
        this.f10354Z = LazyKt__LazyJVMKt.lazy(E.f10405a);
        this.f10356a0 = LazyKt__LazyJVMKt.lazy(new f0());
        this.f10358b0 = LazyKt__LazyJVMKt.lazy(j0.f10445a);
        this.f10360c0 = LazyKt__LazyJVMKt.lazy(new J());
        this.f10362d0 = LazyKt__LazyJVMKt.lazy(h0.f10441a);
        this.f10364e0 = LazyKt__LazyJVMKt.lazy(new i0());
        this.f10366f0 = LazyKt__LazyJVMKt.lazy(new C11985v());
        this.f10368g0 = LazyKt__LazyJVMKt.lazy(C11978o.f10454a);
        this.f10370h0 = LazyKt__LazyJVMKt.lazy(new C11972i());
        this.f10372i0 = LazyKt__LazyJVMKt.lazy(new G());
        this.f10374j0 = LazyKt__LazyJVMKt.lazy(new F());
        this.f10376k0 = LazyKt__LazyJVMKt.lazy(new H());
        this.f10378l0 = LazyKt__LazyJVMKt.lazy(new C11982s());
        this.f10380m0 = LazyKt__LazyJVMKt.lazy(new I());
        this.f10382n0 = LazyKt__LazyJVMKt.lazy(new C11983t());
        this.f10384o0 = LazyKt__LazyJVMKt.lazy(new K());
        this.f10386p0 = LazyKt__LazyJVMKt.lazy(new g0());
        this.f10388q0 = LazyKt__LazyJVMKt.lazy(e0.f10435a);
        this.f10390r0 = LazyKt__LazyJVMKt.lazy(new C11980q());
        this.f10392s0 = LazyKt__LazyJVMKt.lazy(new m0());
        this.f10394t0 = LazyKt__LazyJVMKt.lazy(new D());
    }
}
