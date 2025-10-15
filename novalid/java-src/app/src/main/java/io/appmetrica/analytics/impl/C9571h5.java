package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ScanBuild;

/* renamed from: io.appmetrica.analytics.impl.h5 */
/* loaded from: classes7.dex */
public class C9571h5 implements InterfaceC9090Na, InterfaceC8821Ca, InterfaceC9850s9, InterfaceC8877Eg {

    /* renamed from: a */
    public final Context f8228a;

    /* renamed from: b */
    public final C9396a5 f8229b;

    /* renamed from: c */
    public final C9755oe f8230c;

    /* renamed from: d */
    public final C9830re f8231d;

    /* renamed from: e */
    public final C9121Oh f8232e;

    /* renamed from: f */
    public final C9062M6 f8233f;

    /* renamed from: g */
    public final C9073Mh f8234g;

    /* renamed from: h */
    public final C9303W8 f8235h;

    /* renamed from: i */
    public final C9491e0 f8236i;

    /* renamed from: j */
    public final C9516f0 f8237j;

    /* renamed from: k */
    public final C9338Xj f8238k;

    /* renamed from: l */
    public final C9607ig f8239l;

    /* renamed from: m */
    public final C8992J8 f8240m;

    /* renamed from: n */
    public final PublicLogger f8241n;

    /* renamed from: o */
    public final C9625j9 f8242o;

    /* renamed from: p */
    public final C9446c5 f8243p;

    /* renamed from: q */
    public final C9775p9 f8244q;

    /* renamed from: r */
    public final C8866E5 f8245r;

    /* renamed from: s */
    public final C8864E3 f8246s;

    /* renamed from: t */
    public final TimePassedChecker f8247t;

    /* renamed from: u */
    public final C9046Le f8248u;

    /* renamed from: v */
    public final C9964wn f8249v;

    /* renamed from: w */
    public final C9147Pj f8250w;

    public C9571h5(@NonNull Context context, @NonNull C9637jl c9637jl, @NonNull C9396a5 c9396a5, @NonNull C8840D4 c8840d4, @NonNull InterfaceC8827Cg interfaceC8827Cg, @NonNull AbstractC9521f5 abstractC9521f5) {
        this(context, c9396a5, new C9516f0(), new TimePassedChecker(), new C9696m5(context, c9396a5, c8840d4, abstractC9521f5, c9637jl, interfaceC8827Cg, C9676la.m6362h().m6384u().m6969d(), PackageManagerUtils.getAppVersionCodeInt(context), C9676la.m6362h().m6372i()));
    }

    /* renamed from: A */
    public final boolean m6203A() {
        C8902Fg c8902Fg = (C8902Fg) this.f8239l.m6880a();
        return c8902Fg.f6610o && this.f8247t.didTimePassSeconds(this.f8242o.f8430l, c8902Fg.f6616u, "should force send permissions");
    }

    /* renamed from: B */
    public final boolean m6204B() {
        C9637jl c9637jl;
        C9046Le c9046Le = this.f8248u;
        c9046Le.f7025h.mo4928a(c9046Le.f7018a);
        boolean z = ((C8974Ie) c9046Le.m5437c()).f6783d;
        C9607ig c9607ig = this.f8239l;
        synchronized (c9607ig) {
            c9637jl = c9607ig.f9213c.f7143a;
        }
        return !(z && c9637jl.f8468q);
    }

    /* renamed from: C */
    public void mo6124C() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9090Na, io.appmetrica.analytics.impl.InterfaceC9267Uk
    /* renamed from: a */
    public final void mo5378a(@NonNull EnumC9100Nk enumC9100Nk, @Nullable C9637jl c9637jl) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8821Ca
    @NonNull
    /* renamed from: b */
    public final C9396a5 mo5024b() {
        return this.f8229b;
    }

    @NonNull
    /* renamed from: c */
    public CounterConfigurationReporterType mo5025c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    /* renamed from: d */
    public final void m6207d() {
        C9491e0 c9491e0 = this.f8236i;
        synchronized (c9491e0) {
            c9491e0.f7978a = new C9828rc();
        }
        this.f8237j.m6078a(this.f8236i.m6036a(), this.f8230c);
    }

    /* renamed from: e */
    public final synchronized void m6208e() {
        this.f8232e.m6408b();
    }

    @NonNull
    /* renamed from: f */
    public final C8864E3 m6209f() {
        return this.f8246s;
    }

    @NonNull
    /* renamed from: g */
    public final C9755oe m6210g() {
        return this.f8230c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8821Ca
    @NonNull
    public final Context getContext() {
        return this.f8228a;
    }

    @NonNull
    /* renamed from: h */
    public final C9062M6 m6211h() {
        return this.f8233f;
    }

    @NonNull
    /* renamed from: i */
    public final C8992J8 m6212i() {
        return this.f8240m;
    }

    @NonNull
    /* renamed from: j */
    public final C9303W8 m6213j() {
        return this.f8235h;
    }

    @NonNull
    /* renamed from: k */
    public final C9625j9 m6214k() {
        return this.f8242o;
    }

    @NonNull
    /* renamed from: l */
    public final C9775p9 m6215l() {
        return this.f8244q;
    }

    @NonNull
    /* renamed from: m */
    public final C8902Fg m6216m() {
        return (C8902Fg) this.f8239l.m6880a();
    }

    @Nullable
    /* renamed from: n */
    public final String m6217n() {
        return this.f8230c.m6606i();
    }

    @NonNull
    /* renamed from: o */
    public final PublicLogger m6218o() {
        return this.f8241n;
    }

    @NonNull
    /* renamed from: p */
    public final InterfaceC9136P8 m6219p() {
        return this.f8245r;
    }

    @NonNull
    /* renamed from: q */
    public final C9830re m6220q() {
        return this.f8231d;
    }

    @NonNull
    /* renamed from: r */
    public final C9147Pj m6221r() {
        return this.f8250w;
    }

    @NonNull
    /* renamed from: s */
    public final C9338Xj m6222s() {
        return this.f8238k;
    }

    @NonNull
    /* renamed from: t */
    public final C9637jl m6223t() {
        C9637jl c9637jl;
        C9607ig c9607ig = this.f8239l;
        synchronized (c9607ig) {
            c9637jl = c9607ig.f9213c.f7143a;
        }
        return c9637jl;
    }

    @NonNull
    /* renamed from: u */
    public final C9964wn m6224u() {
        return this.f8249v;
    }

    /* renamed from: v */
    public final void m6225v() {
        C9625j9 c9625j9 = this.f8242o;
        int i = c9625j9.f8429k;
        c9625j9.f8431m = i;
        c9625j9.f8419a.m6592a(i).m6648b();
    }

    /* renamed from: w */
    public final void m6226w() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        C9964wn c9964wn = this.f8249v;
        synchronized (c9964wn) {
            iOptInt = c9964wn.f9286a.m6979a().optInt("last_migration_api_level", 0);
        }
        if (iOptInt < libraryApiLevel) {
            this.f8243p.getClass();
            Iterator it = CollectionsKt__CollectionsJVMKt.listOf(new C9496e5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC9471d5) it.next()).m6002a(iOptInt);
            }
            this.f8249v.m6941b(libraryApiLevel);
        }
    }

    /* renamed from: x */
    public final boolean m6227x() {
        C8902Fg c8902Fg = (C8902Fg) this.f8239l.m6880a();
        return c8902Fg.f6610o && c8902Fg.isIdentifiersValid() && this.f8247t.didTimePassSeconds(this.f8242o.f8430l, c8902Fg.f6615t, "need to check permissions");
    }

    /* renamed from: y */
    public final boolean m6228y() {
        C9625j9 c9625j9 = this.f8242o;
        return c9625j9.f8431m < c9625j9.f8429k && ((C8902Fg) this.f8239l.m6880a()).f6611p && ((C8902Fg) this.f8239l.m6880a()).isIdentifiersValid();
    }

    /* renamed from: z */
    public final void m6229z() {
        C9607ig c9607ig = this.f8239l;
        synchronized (c9607ig) {
            c9607ig.f9211a = null;
        }
    }

    /* renamed from: b */
    public final void m6206b(C9252U5 c9252u5) {
        this.f8236i.m6037a(c9252u5.f7314f);
        C9466d0 c9466d0M6036a = this.f8236i.m6036a();
        C9516f0 c9516f0 = this.f8237j;
        C9755oe c9755oe = this.f8230c;
        synchronized (c9516f0) {
            if (c9466d0M6036a.f7886b > c9755oe.m6598d().f7886b) {
                c9755oe.m6594a(c9466d0M6036a).m6648b();
                this.f8241n.info("Save new app environment for %s. Value: %s", this.f8229b, c9466d0M6036a.f7885a);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9090Na
    /* renamed from: a */
    public final void mo5440a(@NonNull C9252U5 c9252u5) {
        String strM6185a = AbstractC9556gf.m6185a("Event received on service", EnumC9329Xa.m5744a(c9252u5.f7312d), c9252u5.getName(), c9252u5.getValue());
        if (strM6185a != null) {
            this.f8241n.info(strM6185a, new Object[0]);
        }
        String str = this.f8229b.f7669b;
        if (TextUtils.isEmpty(str) || ScanBuild.XRAY_FATAL_FAIL_STATUS.equals(str)) {
            return;
        }
        this.f8234g.m5446a(c9252u5, new C9049Lh());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9090Na, io.appmetrica.analytics.impl.InterfaceC8821Ca
    /* renamed from: a */
    public synchronized void mo5023a(@NonNull C8840D4 c8840d4) {
        try {
            this.f8239l.m5688a(c8840d4);
            if (Boolean.TRUE.equals(c8840d4.f6452h)) {
                this.f8241n.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c8840d4.f6452h)) {
                    this.f8241n.setEnabled(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C9571h5(Context context, C9396a5 c9396a5, C9516f0 c9516f0, TimePassedChecker timePassedChecker, C9696m5 c9696m5) {
        this.f8228a = context.getApplicationContext();
        this.f8229b = c9396a5;
        this.f8237j = c9516f0;
        this.f8247t = timePassedChecker;
        C9964wn c9964wnM6474f = c9696m5.m6474f();
        this.f8249v = c9964wnM6474f;
        this.f8248u = C9676la.m6362h().m6380q();
        C9607ig c9607igM6467a = c9696m5.m6467a(this);
        this.f8239l = c9607igM6467a;
        PublicLogger publicLoggerM6326a = c9696m5.m6472d().m6326a();
        this.f8241n = publicLoggerM6326a;
        C9755oe c9755oeM6353a = c9696m5.m6473e().m6353a();
        this.f8230c = c9755oeM6353a;
        this.f8231d = C9676la.m6362h().m6386w();
        C9491e0 c9491e0M6077a = c9516f0.m6077a(c9396a5, publicLoggerM6326a, c9755oeM6353a);
        this.f8236i = c9491e0M6077a;
        this.f8240m = c9696m5.m6466a();
        C9062M6 c9062m6M6469b = c9696m5.m6469b(this);
        this.f8233f = c9062m6M6469b;
        C9121Oh c9121OhM6471d = c9696m5.m6471d(this);
        this.f8232e = c9121OhM6471d;
        this.f8243p = C9696m5.m6463b();
        C9803qc c9803qcM6462a = C9696m5.m6462a(c9062m6M6469b, c9607igM6467a);
        C8866E5 c8866e5M6458a = C9696m5.m6458a(c9062m6M6469b);
        this.f8245r = c8866e5M6458a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c9803qcM6462a);
        arrayList.add(c8866e5M6458a);
        this.f8244q = C9696m5.m6461a(arrayList, this);
        m6226w();
        C9338Xj c9338XjM6460a = C9696m5.m6460a(this, c9964wnM6474f, new C9546g5(this));
        this.f8238k = c9338XjM6460a;
        publicLoggerM6326a.info("Read app environment for component %s. Value: %s", c9396a5.toString(), c9491e0M6077a.m6036a().f7885a);
        C9147Pj c9147PjM6470c = c9696m5.m6470c();
        this.f8250w = c9147PjM6470c;
        this.f8242o = c9696m5.m6468a(c9755oeM6353a, c9964wnM6474f, c9338XjM6460a, c9062m6M6469b, c9491e0M6077a, c9147PjM6470c, c9121OhM6471d);
        C9303W8 c9303w8M6464c = C9696m5.m6464c(this);
        this.f8235h = c9303w8M6464c;
        this.f8234g = C9696m5.m6459a(this, c9303w8M6464c);
        this.f8246s = c9696m5.m6465a(c9755oeM6353a);
        c9062m6M6469b.m5400d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9090Na, io.appmetrica.analytics.impl.InterfaceC9267Uk
    /* renamed from: a */
    public synchronized void mo5381a(@NonNull C9637jl c9637jl) {
        this.f8239l.m6882a(c9637jl);
        this.f8244q.m6633b();
    }

    /* renamed from: a */
    public final void m6205a(@Nullable String str) {
        this.f8230c.m6607j(str).m6648b();
    }
}
