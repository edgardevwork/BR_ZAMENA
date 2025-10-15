package io.appmetrica.analytics.impl;

import android.content.Context;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.preferences.Preferences;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.p045db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.a7 */
/* loaded from: classes6.dex */
public final class C9398a7 {

    /* renamed from: t */
    public static volatile C9398a7 f7685t;

    /* renamed from: e */
    public final Context f7690e;

    /* renamed from: f */
    public C9373Z6 f7691f;

    /* renamed from: g */
    public C9373Z6 f7692g;

    /* renamed from: h */
    public C9644k3 f7693h;

    /* renamed from: i */
    public C9669l3 f7694i;

    /* renamed from: j */
    public C9644k3 f7695j;

    /* renamed from: k */
    public C9669l3 f7696k;

    /* renamed from: l */
    public C9727nb f7697l;

    /* renamed from: m */
    public C9752ob f7698m;

    /* renamed from: n */
    public C9838rm f7699n;

    /* renamed from: o */
    public C9863sm f7700o;

    /* renamed from: p */
    public C9727nb f7701p;

    /* renamed from: q */
    public C9752ob f7702q;

    /* renamed from: r */
    public C9210Sb f7703r;

    /* renamed from: a */
    public final HashMap f7686a = new HashMap();

    /* renamed from: b */
    public final HashMap f7687b = new HashMap();

    /* renamed from: c */
    public final HashMap f7688c = new HashMap();

    /* renamed from: d */
    public final C9086N6 f7689d = AbstractC8841D5.m5055a();

    /* renamed from: s */
    public final C9448c7 f7704s = new C9448c7();

    public C9398a7(Context context) {
        this.f7690e = context;
    }

    /* renamed from: a */
    public static C9398a7 m5836a(Context context) {
        if (f7685t == null) {
            synchronized (C9398a7.class) {
                try {
                    if (f7685t == null) {
                        f7685t = new C9398a7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f7685t;
    }

    /* renamed from: b */
    public final synchronized InterfaceC8896Fa m5840b(C9396a5 c9396a5) {
        InterfaceC8896Fa c9727nb;
        String str = new C9299W4(c9396a5).f7388a;
        c9727nb = (InterfaceC8896Fa) this.f7687b.get(str);
        if (c9727nb == null) {
            c9727nb = new C9727nb(new C9911uk(m5842c(c9396a5)));
            this.f7687b.put(str, c9727nb);
        }
        return c9727nb;
    }

    /* renamed from: c */
    public final synchronized C9373Z6 m5842c(C9396a5 c9396a5) {
        C9373Z6 c9373z6;
        try {
            C9299W4 c9299w4 = new C9299W4(c9396a5);
            c9373z6 = (C9373Z6) this.f7686a.get(c9299w4.f7388a);
            if (c9373z6 == null) {
                Context context = this.f7690e;
                C9448c7 c9448c7 = this.f7704s;
                String strM5899a = new C9423b7(c9448c7.f7833a, c9448c7.f7834b, false).m5899a(context, c9299w4);
                C9086N6 c9086n6 = this.f7689d;
                c9086n6.getClass();
                String str = c9396a5.f7669b;
                if (str == null) {
                    str = BuildConfig.CDN_USERNAME;
                }
                String str2 = String.format("component-%s", str);
                C9613im c9613im = c9086n6.f7017c;
                C9325X6 c9325x6 = c9086n6.f7015a;
                C9134P6 c9134p6 = c9325x6.f7468a;
                C9158Q6 c9158q6 = c9325x6.f7469b;
                C9726na c9726na = new C9726na(false);
                c9726na.m6504a(112, new C9371Z4());
                C9663km c9663km = new C9663km(str2, c9086n6.f7016b.f9251a);
                c9613im.getClass();
                c9373z6 = new C9373Z6(context, strM5899a, new C9638jm(c9134p6, c9158q6, c9726na, c9663km), PublicLogger.getAnonymousInstance());
                this.f7686a.put(c9299w4.f7388a, c9373z6);
            }
        } finally {
        }
        return c9373z6;
    }

    /* renamed from: d */
    public final synchronized InterfaceC8896Fa m5843d() {
        try {
            if (this.f7697l == null) {
                this.f7697l = new C9727nb(new C9911uk(m5847h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7697l;
    }

    /* renamed from: e */
    public final IBinaryDataHelper m5844e() {
        if (this.f7695j == null) {
            if (this.f7692g == null) {
                Context context = this.f7690e;
                C9448c7 c9448c7 = this.f7704s;
                String strM5899a = new C9423b7(c9448c7.f7833a, c9448c7.f7834b, false).m5899a(context, new C9968x2());
                C9086N6 c9086n6 = this.f7689d;
                c9086n6.getClass();
                HashMap map = new HashMap();
                map.put("binary_data", AbstractC9996y5.f9346a);
                C9613im c9613im = c9086n6.f7017c;
                C9325X6 c9325x6 = c9086n6.f7015a;
                C9181R6 c9181r6 = c9325x6.f7474g;
                C9205S6 c9205s6 = c9325x6.f7475h;
                C9726na c9726na = new C9726na(false);
                C9663km c9663km = new C9663km("auto_inapp", map);
                c9613im.getClass();
                this.f7692g = new C9373Z6(context, strM5899a, new C9638jm(c9181r6, c9205s6, c9726na, c9663km), PublicLogger.getAnonymousInstance());
            }
            this.f7695j = new C9644k3(new C9911uk(this.f7692g));
        }
        return this.f7695j;
    }

    /* renamed from: f */
    public final InterfaceC8896Fa m5845f() {
        C9210Sb c9210Sb;
        if (this.f7701p == null) {
            synchronized (this) {
                try {
                    if (this.f7703r == null) {
                        C9448c7 c9448c7 = this.f7704s;
                        String strM5899a = new C9423b7(c9448c7.f7833a, c9448c7.f7834b, true).m5899a(this.f7690e, new C9470d4());
                        Context context = this.f7690e;
                        C9086N6 c9086n6 = this.f7689d;
                        c9086n6.getClass();
                        HashMap map = new HashMap();
                        map.put(Preferences.NAME, InterfaceC8766A5.f6317a);
                        C9613im c9613im = c9086n6.f7017c;
                        C9325X6 c9325x6 = c9086n6.f7015a;
                        C9229T6 c9229t6 = c9325x6.f7470c;
                        C9253U6 c9253u6 = c9325x6.f7471d;
                        C9726na c9726na = new C9726na(false);
                        c9726na.m6504a(112, new C9495e4());
                        C9663km c9663km = new C9663km("service database", map);
                        c9613im.getClass();
                        this.f7703r = new C9210Sb(context, strM5899a, new C9304W9(strM5899a), new C9638jm(c9229t6, c9253u6, c9726na, c9663km));
                    }
                    c9210Sb = this.f7703r;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7701p = new C9727nb(c9210Sb);
        }
        return this.f7701p;
    }

    /* renamed from: g */
    public final IBinaryDataHelper m5846g() {
        if (this.f7693h == null) {
            this.f7693h = new C9644k3(new C9911uk(m5847h()));
        }
        return this.f7693h;
    }

    /* renamed from: h */
    public final synchronized C9373Z6 m5847h() {
        try {
            if (this.f7691f == null) {
                Context context = this.f7690e;
                C9448c7 c9448c7 = this.f7704s;
                String strM5899a = new C9423b7(c9448c7.f7833a, c9448c7.f7834b, true).m5899a(context, new C9885tj());
                C9086N6 c9086n6 = this.f7689d;
                c9086n6.getClass();
                HashMap map = new HashMap();
                map.put(Preferences.NAME, InterfaceC8766A5.f6317a);
                map.put("binary_data", AbstractC9996y5.f9346a);
                map.put("temp_cache", AbstractC9913um.f9199a);
                Iterator<ModuleServicesDatabase> it = C9676la.f8552C.m6376m().mo4989a().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        map.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C9613im c9613im = c9086n6.f7017c;
                C9325X6 c9325x6 = c9086n6.f7015a;
                C9277V6 c9277v6 = c9325x6.f7472e;
                C9301W6 c9301w6 = c9325x6.f7473f;
                C9726na c9726na = new C9726na(false);
                c9726na.m6504a(114, new C9910uj());
                Iterator<ModuleServicesDatabase> it2 = C9676la.f8552C.m6376m().mo4989a().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c9726na.m6504a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C9663km c9663km = new C9663km("service database", map);
                c9613im.getClass();
                this.f7691f = new C9373Z6(context, strM5899a, new C9638jm(c9277v6, c9301w6, c9726na, c9663km), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7691f;
    }

    /* renamed from: b */
    public final synchronized InterfaceC8896Fa m5839b() {
        return m5845f();
    }

    /* renamed from: a */
    public final synchronized IBinaryDataHelper m5837a(C9396a5 c9396a5) {
        IBinaryDataHelper c9644k3;
        String str = new C9299W4(c9396a5).f7388a;
        c9644k3 = (IBinaryDataHelper) this.f7688c.get(str);
        if (c9644k3 == null) {
            c9644k3 = new C9644k3(new C9911uk(m5842c(c9396a5)));
            this.f7688c.put(str, c9644k3);
        }
        return c9644k3;
    }

    /* renamed from: a */
    public final synchronized InterfaceC8896Fa m5838a() {
        try {
            if (this.f7702q == null) {
                this.f7702q = new C9752ob(m5845f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7702q;
    }

    /* renamed from: c */
    public final synchronized InterfaceC8896Fa m5841c() {
        try {
            if (this.f7698m == null) {
                if (this.f7697l == null) {
                    this.f7697l = new C9727nb(new C9911uk(m5847h()));
                }
                this.f7698m = new C9752ob(this.f7697l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7698m;
    }
}
