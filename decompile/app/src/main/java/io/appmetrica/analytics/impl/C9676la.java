package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.locationapi.internal.LocationClient;

/* renamed from: io.appmetrica.analytics.impl.la */
/* loaded from: classes5.dex */
public final class C9676la {

    /* renamed from: C */
    public static volatile C9676la f8552C;

    /* renamed from: a */
    public final Context f8555a;

    /* renamed from: b */
    public volatile C8851Df f8556b;

    /* renamed from: c */
    public volatile C8892F6 f8557c;

    /* renamed from: e */
    public volatile C9394a3 f8559e;

    /* renamed from: f */
    public volatile C8904Fi f8560f;

    /* renamed from: g */
    public volatile C9198S f8561g;

    /* renamed from: h */
    public volatile C9443c2 f8562h;

    /* renamed from: i */
    public volatile PlatformIdentifiers f8563i;

    /* renamed from: j */
    public volatile C9046Le f8564j;

    /* renamed from: k */
    public volatile C9178R3 f8565k;

    /* renamed from: l */
    public volatile C9830re f8566l;

    /* renamed from: m */
    public volatile C10039zn f8567m;

    /* renamed from: n */
    public volatile C9959wi f8568n;

    /* renamed from: o */
    public volatile C8772Ab f8569o;

    /* renamed from: p */
    public C8881Ek f8570p;

    /* renamed from: r */
    public volatile C8855Dj f8572r;

    /* renamed from: w */
    public volatile InterfaceC8872Eb f8577w;

    /* renamed from: x */
    public volatile C9738nm f8578x;

    /* renamed from: y */
    public volatile C9986xk f8579y;

    /* renamed from: z */
    public volatile C9379Zc f8580z;

    /* renamed from: q */
    public final C9651ka f8571q = new C9651ka();

    /* renamed from: s */
    public final C8848Dc f8573s = new C8848Dc();

    /* renamed from: t */
    public final C8898Fc f8574t = new C8898Fc();

    /* renamed from: u */
    public final C9687ll f8575u = new C9687ll();

    /* renamed from: v */
    public final C9860sj f8576v = new C9860sj();

    /* renamed from: A */
    public final C9729nd f8553A = new C9729nd();

    /* renamed from: B */
    public final UtilityServiceProvider f8554B = new UtilityServiceProvider();

    /* renamed from: d */
    public final C9985xj f8558d = new C9985xj();

    public C9676la(Context context) {
        this.f8555a = context;
    }

    /* renamed from: a */
    public static void m6361a(Context context) {
        if (f8552C == null) {
            synchronized (C9676la.class) {
                try {
                    if (f8552C == null) {
                        f8552C = new C9676la(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: h */
    public static C9676la m6362h() {
        return f8552C;
    }

    /* renamed from: A */
    public final synchronized C10039zn m6363A() {
        try {
            if (this.f8567m == null) {
                this.f8567m = new C10039zn(this.f8555a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8567m;
    }

    /* renamed from: B */
    public final void m6364B() {
        if (this.f8564j == null) {
            synchronized (this) {
                try {
                    if (this.f8564j == null) {
                        AbstractC9292Vl abstractC9292VlM5684a = C9268Ul.m5684a(C9930ve.class);
                        Context context = this.f8555a;
                        ProtobufStateStorage<Object> protobufStateStorageMo5468a = abstractC9292VlM5684a.mo5468a(context, abstractC9292VlM5684a.mo5469c(context));
                        C9930ve c9930ve = (C9930ve) protobufStateStorageMo5468a.read();
                        this.f8564j = new C9046Le(this.f8555a, protobufStateStorageMo5468a, new C8825Ce(), new C9880te(c9930ve), new C9022Ke(), new C8800Be(this.f8555a), new C8925Ge(m6362h().m6386w()), new C9955we(), c9930ve, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final C9443c2 m6366b() {
        C9443c2 c9443c2 = this.f8562h;
        if (c9443c2 == null) {
            synchronized (this) {
                try {
                    c9443c2 = this.f8562h;
                    if (c9443c2 == null) {
                        c9443c2 = new C9443c2(this.f8555a, AbstractC9468d2.m6000a());
                        this.f8562h = c9443c2;
                    }
                } finally {
                }
            }
        }
        return c9443c2;
    }

    /* renamed from: c */
    public final C9593i2 m6367c() {
        return m6372i().f6322b;
    }

    /* renamed from: d */
    public final C9178R3 m6368d() {
        if (this.f8565k == null) {
            synchronized (this) {
                try {
                    if (this.f8565k == null) {
                        AbstractC9292Vl abstractC9292VlM5684a = C9268Ul.m5684a(C9011K3.class);
                        Context context = this.f8555a;
                        ProtobufStateStorage<Object> protobufStateStorageMo5468a = abstractC9292VlM5684a.mo5468a(context, abstractC9292VlM5684a.mo5469c(context));
                        this.f8565k = new C9178R3(this.f8555a, protobufStateStorageMo5468a, new C9202S3(), new C8889F3(), new C9274V3(), new C9684li(this.f8555a), new C9226T3(m6386w()), new C8914G3(), (C9011K3) protobufStateStorageMo5468a.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f8565k;
    }

    /* renamed from: e */
    public final Context m6369e() {
        return this.f8555a;
    }

    /* renamed from: f */
    public final C8892F6 m6370f() {
        if (this.f8557c == null) {
            synchronized (this) {
                try {
                    if (this.f8557c == null) {
                        this.f8557c = new C8892F6(new C8867E6(m6386w()));
                    }
                } finally {
                }
            }
        }
        return this.f8557c;
    }

    /* renamed from: g */
    public final PermissionExtractor m6371g() {
        C9986xk c9986xk = this.f8579y;
        if (c9986xk != null) {
            return c9986xk;
        }
        synchronized (this) {
            try {
                C9986xk c9986xk2 = this.f8579y;
                if (c9986xk2 != null) {
                    return c9986xk2;
                }
                C9986xk c9986xk3 = new C9986xk(m6376m().f6493c.getAskForPermissionStrategy());
                this.f8579y = c9986xk3;
                return c9986xk3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final C8772Ab m6372i() {
        C8772Ab c8772Ab = this.f8569o;
        if (c8772Ab == null) {
            synchronized (this) {
                try {
                    c8772Ab = this.f8569o;
                    if (c8772Ab == null) {
                        c8772Ab = new C8772Ab(new C9321X2(this.f8555a, this.f8558d.m6966a()), new C9593i2());
                        this.f8569o = c8772Ab;
                    }
                } finally {
                }
            }
        }
        return c8772Ab;
    }

    /* renamed from: j */
    public final InterfaceC8872Eb m6373j() {
        InterfaceC8872Eb c8922Gb = this.f8577w;
        if (c8922Gb == null) {
            synchronized (this) {
                try {
                    c8922Gb = this.f8577w;
                    if (c8922Gb == null) {
                        Context context = this.f8555a;
                        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        c8922Gb = locationClient == null ? new C8922Gb() : new C8897Fb(context, new C9043Lb(), locationClient);
                        this.f8577w = c8922Gb;
                    }
                } finally {
                }
            }
        }
        return c8922Gb;
    }

    /* renamed from: k */
    public final InterfaceC8872Eb m6374k() {
        return m6373j();
    }

    /* renamed from: l */
    public final C8898Fc m6375l() {
        return this.f8574t;
    }

    /* renamed from: m */
    public final C8855Dj m6376m() {
        C8855Dj c8855Dj = this.f8572r;
        if (c8855Dj == null) {
            synchronized (this) {
                try {
                    c8855Dj = this.f8572r;
                    if (c8855Dj == null) {
                        c8855Dj = new C8855Dj();
                        this.f8572r = c8855Dj;
                    }
                } finally {
                }
            }
        }
        return c8855Dj;
    }

    /* renamed from: n */
    public final C9379Zc m6377n() {
        C9379Zc c9379Zc = this.f8580z;
        if (c9379Zc == null) {
            synchronized (this) {
                try {
                    c9379Zc = this.f8580z;
                    if (c9379Zc == null) {
                        c9379Zc = new C9379Zc(this.f8555a, new C9714mn());
                        this.f8580z = c9379Zc;
                    }
                } finally {
                }
            }
        }
        return c9379Zc;
    }

    /* renamed from: o */
    public final C9729nd m6378o() {
        return this.f8553A;
    }

    /* renamed from: p */
    public final PlatformIdentifiers m6379p() {
        PlatformIdentifiers platformIdentifiers = this.f8563i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.f8563i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(m6385v(), m6366b());
                        this.f8563i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    /* renamed from: q */
    public final C9046Le m6380q() {
        m6364B();
        return this.f8564j;
    }

    /* renamed from: r */
    public final C8851Df m6381r() {
        if (this.f8556b == null) {
            synchronized (this) {
                try {
                    if (this.f8556b == null) {
                        this.f8556b = new C8851Df(this.f8555a, f8552C.m6363A().f9411c);
                    }
                } finally {
                }
            }
        }
        return this.f8556b;
    }

    /* renamed from: s */
    public final C9959wi m6382s() {
        C9959wi c9959wi = this.f8568n;
        if (c9959wi == null) {
            synchronized (this) {
                try {
                    c9959wi = this.f8568n;
                    if (c9959wi == null) {
                        c9959wi = new C9959wi(this.f8555a);
                        this.f8568n = c9959wi;
                    }
                } finally {
                }
            }
        }
        return c9959wi;
    }

    /* renamed from: t */
    public final synchronized C8904Fi m6383t() {
        return this.f8560f;
    }

    /* renamed from: u */
    public final C9985xj m6384u() {
        return this.f8558d;
    }

    /* renamed from: v */
    public final C9198S m6385v() {
        C9198S c9198s = this.f8561g;
        if (c9198s == null) {
            synchronized (this) {
                try {
                    c9198s = this.f8561g;
                    if (c9198s == null) {
                        c9198s = new C9198S(new C9127P(), new C9055M(), new C9031L(), this.f8558d.m6966a(), "ServiceInternal");
                        this.f8575u.m6405a(c9198s);
                        this.f8561g = c9198s;
                    }
                } finally {
                }
            }
        }
        return c9198s;
    }

    /* renamed from: w */
    public final C9830re m6386w() {
        if (this.f8566l == null) {
            synchronized (this) {
                try {
                    if (this.f8566l == null) {
                        this.f8566l = new C9830re(C9398a7.m5836a(this.f8555a).m5841c());
                    }
                } finally {
                }
            }
        }
        return this.f8566l;
    }

    /* renamed from: x */
    public final synchronized InterfaceC9225T2 m6387x() {
        try {
            if (this.f8570p == null) {
                C8881Ek c8881Ek = new C8881Ek(this.f8555a);
                this.f8570p = c8881Ek;
                this.f8575u.m6405a(c8881Ek);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8570p;
    }

    /* renamed from: y */
    public final C9687ll m6388y() {
        return this.f8575u;
    }

    /* renamed from: z */
    public final C9738nm m6389z() {
        C9738nm c9738nm = this.f8578x;
        if (c9738nm == null) {
            synchronized (this) {
                try {
                    c9738nm = this.f8578x;
                    if (c9738nm == null) {
                        c9738nm = new C9738nm(this.f8555a);
                        this.f8578x = c9738nm;
                    }
                } finally {
                }
            }
        }
        return c9738nm;
    }

    /* renamed from: a */
    public final WaitForActivationDelayBarrier m6365a() {
        return this.f8554B.getActivationBarrier();
    }
}
