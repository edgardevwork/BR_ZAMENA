package ru.rustore.sdk.remoteconfig.internal;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.MetricsClient;
import ru.rustore.sdk.remoteconfig.ConfigRequestParameterProvider;
import ru.rustore.sdk.remoteconfig.RemoteConfigClient;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener;
import ru.rustore.sdk.remoteconfig.UpdateBehaviour;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.G0 */
/* loaded from: classes5.dex */
public abstract class AbstractC11678G0 {

    /* renamed from: A */
    public final Lazy f10756A;

    /* renamed from: B */
    public final Lazy f10757B;

    /* renamed from: C */
    public final Lazy f10758C;

    /* renamed from: D */
    public final Lazy f10759D;

    /* renamed from: E */
    public final Lazy f10760E;

    /* renamed from: F */
    public final Lazy f10761F;

    /* renamed from: G */
    public final Lazy f10762G;

    /* renamed from: H */
    public final Lazy f10763H;

    /* renamed from: I */
    public final Lazy f10764I;

    /* renamed from: J */
    public final Lazy f10765J;

    /* renamed from: K */
    public final Lazy f10766K;

    /* renamed from: a */
    public final Context f10767a;

    /* renamed from: b */
    public final String f10768b;

    /* renamed from: c */
    public final C11711X0 f10769c;

    /* renamed from: d */
    public final UpdateBehaviour f10770d;

    /* renamed from: e */
    public final ConfigRequestParameterProvider f10771e;

    /* renamed from: f */
    public final RemoteConfigClientEventListener f10772f;

    /* renamed from: g */
    public final Map<String, Object> f10773g;

    /* renamed from: h */
    public final Lazy f10774h;

    /* renamed from: i */
    public final Lazy f10775i;

    /* renamed from: j */
    public final Lazy f10776j;

    /* renamed from: k */
    public final Lazy f10777k;

    /* renamed from: l */
    public final Lazy f10778l;

    /* renamed from: m */
    public final Lazy f10779m;

    /* renamed from: n */
    public final Lazy f10780n;

    /* renamed from: o */
    public final Lazy f10781o;

    /* renamed from: p */
    public final Lazy f10782p;

    /* renamed from: q */
    public final Lazy f10783q;

    /* renamed from: r */
    public final Lazy f10784r;

    /* renamed from: s */
    public final Lazy f10785s;

    /* renamed from: t */
    public final Lazy f10786t;

    /* renamed from: u */
    public final Lazy f10787u;

    /* renamed from: v */
    public final Lazy f10788v;

    /* renamed from: w */
    public final Lazy f10789w;

    /* renamed from: x */
    public final Lazy f10790x;

    /* renamed from: y */
    public final Lazy f10791y;

    /* renamed from: z */
    public final Lazy f10792z;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$A */
    /* loaded from: classes6.dex */
    public static final class A extends Lambda implements Function0<C11748l0> {
        public A() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11748l0 invoke() {
            return new C11748l0(AbstractC11678G0.this.f10767a);
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$B */
    /* loaded from: classes6.dex */
    public static final class B extends Lambda implements Function0<C11713Y0> {

        /* renamed from: a */
        public static final B f10794a = new B();

        public B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11713Y0 invoke() {
            return new C11713Y0();
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$C */
    /* loaded from: classes6.dex */
    public static final class C extends Lambda implements Function0<C11715Z0> {
        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11715Z0 invoke() {
            return new C11715Z0((C11713Y0) AbstractC11678G0.this.f10757B.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$D */
    /* loaded from: classes6.dex */
    public static final class D extends Lambda implements Function0<InterfaceC11721b1> {
        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC11721b1 invoke() {
            C11724c1 c11724c1;
            AbstractC11678G0 abstractC11678G0 = AbstractC11678G0.this;
            UpdateBehaviour updateBehaviour = abstractC11678G0.f10770d;
            if (updateBehaviour instanceof UpdateBehaviour.Actual) {
                return new C11684J0();
            }
            if (updateBehaviour instanceof UpdateBehaviour.Default) {
                c11724c1 = new C11724c1((C11715Z0) abstractC11678G0.f10758C.getValue(), (C11720b0) AbstractC11678G0.this.f10790x.getValue(), (C11744j0) AbstractC11678G0.this.f10764I.getValue(), (C11702T) AbstractC11678G0.this.f10784r.getValue(), ((UpdateBehaviour.Default) AbstractC11678G0.this.f10770d).m17665getMinUpdateIntervalUwyO8pc());
            } else {
                if (!(updateBehaviour instanceof UpdateBehaviour.Snapshot)) {
                    throw new NoWhenBranchMatchedException();
                }
                c11724c1 = new C11724c1((C11715Z0) abstractC11678G0.f10758C.getValue(), (C11720b0) AbstractC11678G0.this.f10790x.getValue(), (C11744j0) AbstractC11678G0.this.f10764I.getValue(), (C11702T) AbstractC11678G0.this.f10784r.getValue(), ((UpdateBehaviour.Snapshot) AbstractC11678G0.this.f10770d).m17669getMinUpdateIntervalUwyO8pc());
            }
            return c11724c1;
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$a */
    /* loaded from: classes6.dex */
    public static final class C11990a extends Lambda implements Function0<C11739h> {
        public C11990a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11739h invoke() {
            C11710X c11710x = new C11710X();
            return new C11739h(new C11719b(new C11687L("ACTUAL_CONFIG_CACHE_DIR", AbstractC11678G0.this.f10767a), new C11732e(new C11682I0())), (C11706V) AbstractC11678G0.this.f10788v.getValue(), c11710x, new C11729d());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$b */
    /* loaded from: classes6.dex */
    public static final class C11991b extends Lambda implements Function0<C11771x> {
        public C11991b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11771x invoke() {
            return new C11771x((C11736f0) AbstractC11678G0.this.f10761F.getValue(), new C11767v());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$c */
    /* loaded from: classes6.dex */
    public static final class C11992c extends Lambda implements Function0<C11681I> {
        public C11992c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11681I invoke() {
            return new C11681I(AbstractC11678G0.this.f10772f);
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$d */
    /* loaded from: classes6.dex */
    public static final class C11993d extends Lambda implements Function0<C11691N> {
        public C11993d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11691N invoke() {
            return new C11691N((C11739h) AbstractC11678G0.this.f10791y.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$e */
    /* loaded from: classes6.dex */
    public static final class e extends Lambda implements Function0<C11693O> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11693O invoke() {
            return new C11693O((C11771x) AbstractC11678G0.this.f10765J.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$f */
    /* loaded from: classes6.dex */
    public static final class f extends Lambda implements Function0<C11695P> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11695P invoke() {
            return new C11695P((C11694O0) AbstractC11678G0.this.f10792z.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$g */
    /* loaded from: classes6.dex */
    public static final class g extends Lambda implements Function0<MetricsClient> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MetricsClient invoke() {
            return MetricsClient.INSTANCE.getInstance(AbstractC11678G0.this.f10767a);
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$h */
    /* loaded from: classes6.dex */
    public static final class h extends Lambda implements Function0<C11702T> {

        /* renamed from: a */
        public static final h f10804a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11702T invoke() {
            return new C11702T(new C11700S());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$i */
    /* loaded from: classes6.dex */
    public static final class i extends Lambda implements Function0<C11706V> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11706V invoke() {
            C11712Y c11712y = new C11712Y();
            AbstractC11678G0 abstractC11678G0 = AbstractC11678G0.this;
            return new C11706V(c11712y, new C11714Z(abstractC11678G0.f10768b, abstractC11678G0.f10769c, abstractC11678G0.f10771e, (C11768v0) abstractC11678G0.f10786t.getValue(), (SSLSocketFactory) AbstractC11678G0.this.f10787u.getValue()));
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$j */
    /* loaded from: classes6.dex */
    public static final class j extends Lambda implements Function0<C11717a0> {

        /* renamed from: a */
        public static final j f10806a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11717a0 invoke() {
            return new C11717a0();
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$k */
    /* loaded from: classes6.dex */
    public static final class k extends Lambda implements Function0<C11720b0> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11720b0 invoke() {
            return new C11720b0((C11706V) AbstractC11678G0.this.f10788v.getValue(), (C11717a0) AbstractC11678G0.this.f10789w.getValue(), new C11710X());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$l */
    /* loaded from: classes6.dex */
    public static final class l extends Lambda implements Function0<C11740h0> {

        /* renamed from: a */
        public static final l f10808a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11740h0 invoke() {
            return new C11740h0();
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$m */
    /* loaded from: classes6.dex */
    public static final class m extends Lambda implements Function0<C11742i0> {

        /* renamed from: a */
        public static final m f10809a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11742i0 invoke() {
            return new C11742i0();
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$n */
    /* loaded from: classes6.dex */
    public static final class n extends Lambda implements Function0<C11744j0> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11744j0 invoke() {
            return new C11744j0((C11736f0) AbstractC11678G0.this.f10761F.getValue(), (C11713Y0) AbstractC11678G0.this.f10757B.getValue(), (C11742i0) AbstractC11678G0.this.f10759D.getValue(), (C11740h0) AbstractC11678G0.this.f10763H.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$o */
    /* loaded from: classes6.dex */
    public static final class o extends Lambda implements Function0<C11736f0> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11736f0 invoke() {
            return new C11736f0((C11687L) AbstractC11678G0.this.f10760E.getValue(), new C11746k0(new C11682I0()));
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$p */
    /* loaded from: classes6.dex */
    public static final class p extends Lambda implements Function0<C11687L> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11687L invoke() {
            return new C11687L("PERSISTABLE_CONFIG_CACHE_DIR", AbstractC11678G0.this.f10767a);
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$q */
    /* loaded from: classes6.dex */
    public static final class q extends Lambda implements Function0<C11752n0> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11752n0 invoke() {
            return new C11752n0((C11764t0) AbstractC11678G0.this.f10777k.getValue(), (C11770w0) AbstractC11678G0.this.f10778l.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$r */
    /* loaded from: classes6.dex */
    public static final class r extends Lambda implements Function0<C11764t0> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11764t0 invoke() {
            return new C11764t0(new C11756p0(), (MetricsClient) AbstractC11678G0.this.f10776j.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$s */
    /* loaded from: classes6.dex */
    public static final class s extends Lambda implements Function0<RemoteConfigClient> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RemoteConfigClient invoke() {
            return new RemoteConfigClient((InterfaceC11766u0) AbstractC11678G0.this.f10781o.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$t */
    /* loaded from: classes6.dex */
    public static final class t extends Lambda implements Function0<InterfaceC11766u0> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC11766u0 invoke() {
            AbstractC11678G0 abstractC11678G0 = AbstractC11678G0.this;
            UpdateBehaviour updateBehaviour = abstractC11678G0.f10770d;
            if (updateBehaviour instanceof UpdateBehaviour.Actual) {
                return new C11747l((C11748l0) abstractC11678G0.f10756A.getValue(), (C11691N) AbstractC11678G0.this.f10783q.getValue(), (RemoteConfigClientEventListener) AbstractC11678G0.this.f10782p.getValue(), (C11752n0) AbstractC11678G0.this.f10780n.getValue(), (C11670C0) AbstractC11678G0.this.f10779m.getValue());
            }
            if (updateBehaviour instanceof UpdateBehaviour.Default) {
                return new C11673E((C11748l0) abstractC11678G0.f10756A.getValue(), (InterfaceC11721b1) AbstractC11678G0.this.f10775i.getValue(), (C11670C0) AbstractC11678G0.this.f10779m.getValue(), (C11693O) AbstractC11678G0.this.f10766K.getValue(), (RemoteConfigClientEventListener) AbstractC11678G0.this.f10782p.getValue(), (C11752n0) AbstractC11678G0.this.f10780n.getValue());
            }
            if (!(updateBehaviour instanceof UpdateBehaviour.Snapshot)) {
                throw new NoWhenBranchMatchedException();
            }
            return new C11703T0((C11748l0) abstractC11678G0.f10756A.getValue(), (InterfaceC11721b1) AbstractC11678G0.this.f10775i.getValue(), (RemoteConfigClientEventListener) AbstractC11678G0.this.f10782p.getValue(), (C11695P) AbstractC11678G0.this.f10785s.getValue(), (C11670C0) AbstractC11678G0.this.f10779m.getValue(), (C11752n0) AbstractC11678G0.this.f10780n.getValue());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$u */
    /* loaded from: classes6.dex */
    public static final class u extends Lambda implements Function0<C11768v0> {

        /* renamed from: a */
        public static final u f10817a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11768v0 invoke() {
            return new C11768v0();
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$v */
    /* loaded from: classes6.dex */
    public static final class v extends Lambda implements Function0<SSLSocketFactory> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SSLSocketFactory invoke() throws NoSuchAlgorithmException, KeyManagementException {
            X509TrustManager trustManager = (X509TrustManager) ((C11676F0) AbstractC11678G0.this).f10751O.getValue();
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, new X509TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getInstance(\"TLSv1.2\")\n …           .socketFactory");
            return socketFactory;
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$w */
    /* loaded from: classes6.dex */
    public static final class w extends Lambda implements Function0<C11770w0> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11770w0 invoke() {
            return new C11770w0(new C11772x0(), new C11774y0(AbstractC11678G0.this.f10773g), new C11776z0());
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$x */
    /* loaded from: classes6.dex */
    public static final class x extends Lambda implements Function0<C11670C0> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11670C0 invoke() {
            return new C11670C0(new C11674E0(new C11672D0()), new C11668B0(new C11666A0(AbstractC11678G0.this.f10767a), new C11682I0()));
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$y */
    /* loaded from: classes6.dex */
    public static final class y extends Lambda implements Function0<C11688L0> {

        /* renamed from: a */
        public static final y f10821a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11688L0 invoke() {
            return new C11688L0();
        }
    }

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.G0$z */
    /* loaded from: classes6.dex */
    public static final class z extends Lambda implements Function0<C11694O0> {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11694O0 invoke() {
            return new C11694O0((C11688L0) AbstractC11678G0.this.f10762G.getValue(), (C11736f0) AbstractC11678G0.this.f10761F.getValue(), new C11690M0());
        }
    }

    public AbstractC11678G0(Context applicationContext, String appId, C11711X0 staticRequestParameterHolder, UpdateBehaviour updateBehaviour, ConfigRequestParameterProvider configRequestParameterProvider, RemoteConfigClientEventListener remoteConfigClientEventListener, Map map) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(staticRequestParameterHolder, "staticRequestParameterHolder");
        Intrinsics.checkNotNullParameter(updateBehaviour, "updateBehaviour");
        Intrinsics.checkNotNullParameter(configRequestParameterProvider, "configRequestParameterProvider");
        Intrinsics.checkNotNullParameter(remoteConfigClientEventListener, "remoteConfigClientEventListener");
        this.f10767a = applicationContext;
        this.f10768b = appId;
        this.f10769c = staticRequestParameterHolder;
        this.f10770d = updateBehaviour;
        this.f10771e = configRequestParameterProvider;
        this.f10772f = remoteConfigClientEventListener;
        this.f10773g = map;
        this.f10774h = LazyKt__LazyJVMKt.lazy(new s());
        this.f10775i = LazyKt__LazyJVMKt.lazy(new D());
        this.f10776j = LazyKt__LazyJVMKt.lazy(new g());
        this.f10777k = LazyKt__LazyJVMKt.lazy(new r());
        this.f10778l = LazyKt__LazyJVMKt.lazy(new w());
        this.f10779m = LazyKt__LazyJVMKt.lazy(new x());
        this.f10780n = LazyKt__LazyJVMKt.lazy(new q());
        this.f10781o = LazyKt__LazyJVMKt.lazy(new t());
        this.f10782p = LazyKt__LazyJVMKt.lazy(new C11992c());
        this.f10783q = LazyKt__LazyJVMKt.lazy(new C11993d());
        this.f10784r = LazyKt__LazyJVMKt.lazy(h.f10804a);
        this.f10785s = LazyKt__LazyJVMKt.lazy(new f());
        this.f10786t = LazyKt__LazyJVMKt.lazy(u.f10817a);
        this.f10787u = LazyKt__LazyJVMKt.lazy(new v());
        this.f10788v = LazyKt__LazyJVMKt.lazy(new i());
        this.f10789w = LazyKt__LazyJVMKt.lazy(j.f10806a);
        this.f10790x = LazyKt__LazyJVMKt.lazy(new k());
        this.f10791y = LazyKt__LazyJVMKt.lazy(new C11990a());
        this.f10792z = LazyKt__LazyJVMKt.lazy(new z());
        this.f10756A = LazyKt__LazyJVMKt.lazy(new A());
        this.f10757B = LazyKt__LazyJVMKt.lazy(B.f10794a);
        this.f10758C = LazyKt__LazyJVMKt.lazy(new C());
        this.f10759D = LazyKt__LazyJVMKt.lazy(m.f10809a);
        this.f10760E = LazyKt__LazyJVMKt.lazy(new p());
        this.f10761F = LazyKt__LazyJVMKt.lazy(new o());
        this.f10762G = LazyKt__LazyJVMKt.lazy(y.f10821a);
        this.f10763H = LazyKt__LazyJVMKt.lazy(l.f10808a);
        this.f10764I = LazyKt__LazyJVMKt.lazy(new n());
        this.f10765J = LazyKt__LazyJVMKt.lazy(new C11991b());
        this.f10766K = LazyKt__LazyJVMKt.lazy(new e());
    }
}
