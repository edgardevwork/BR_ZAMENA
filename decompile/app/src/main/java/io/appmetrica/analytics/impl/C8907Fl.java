package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Fl */
/* loaded from: classes8.dex */
public final class C8907Fl {

    /* renamed from: a */
    public final C8932Gl f6626a;

    /* renamed from: b */
    public volatile NetworkTask f6627b;

    public C8907Fl(@NotNull C8932Gl c8932Gl) {
        this.f6626a = c8932Gl;
    }

    @NotNull
    /* renamed from: b */
    public final Context m5197b() {
        return this.f6626a.f6682a;
    }

    @Nullable
    /* renamed from: c */
    public final synchronized NetworkTask m5199c() {
        NetworkTask networkTask;
        try {
            if (m5203g()) {
                if (this.f6627b == null) {
                    C9537fl c9537flM5200d = m5200d();
                    C9829rd c9829rd = C9829rd.f8994a;
                    C9437bl c9437bl = new C9437bl(new C8824Cd(), C9676la.f8552C.m6376m());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c9537flM5200d);
                    this.f6627b = new NetworkTask(new SynchronizedBlockingExecutor(), new C9925v9(this.f6626a.f6682a), new AllHostsExponentialBackoffPolicy(c9829rd.m6755a(EnumC9779pd.STARTUP)), new C8857Dl(this, new C9291Vk(), new FullUrlFormer(c9437bl, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), CollectionsKt__CollectionsKt.emptyList(), C9829rd.f8996c);
                }
                networkTask = this.f6627b;
            } else {
                networkTask = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return networkTask;
    }

    @NotNull
    /* renamed from: d */
    public final C9537fl m5200d() {
        return (C9537fl) this.f6626a.f6693l.m6880a();
    }

    @NotNull
    /* renamed from: e */
    public final C9637jl m5201e() {
        C9637jl c9637jl;
        C9076Mk c9076Mk = this.f6626a.f6693l;
        synchronized (c9076Mk) {
            c9637jl = c9076Mk.f9213c.f7143a;
        }
        return c9637jl;
    }

    /* renamed from: f */
    public final void m5202f() {
        C9637jl c9637jl;
        C9076Mk c9076Mk = this.f6626a.f6693l;
        synchronized (c9076Mk) {
            c9637jl = c9076Mk.f9213c.f7143a;
        }
        C9737nl c9737nl = c9637jl.f8454c;
        C9712ml c9712mlM6564a = c9737nl.m6564a(c9737nl.f8777m);
        String strM5346a = c9637jl.f8452a;
        String str = c9637jl.f8453b;
        C9764on c9764on = this.f6626a.f6695n;
        String str2 = c9637jl.f8455d;
        c9764on.getClass();
        if (!C9764on.m6610a(str2)) {
            c9712mlM6564a.f8663a = this.f6626a.f6694m.m5808a().f9419id;
        }
        String str3 = c9637jl.f8452a;
        if (str3 == null || str3.length() == 0) {
            strM5346a = this.f6626a.f6689h.m5346a();
            str = "";
        }
        List<String> list = this.f6626a.f6684c.f7969e;
        if (list == null || !(!list.isEmpty())) {
            list = null;
        }
        c9712mlM6564a.f8669g = list;
        C9637jl c9637jl2 = new C9637jl(strM5346a, str, new C9737nl(c9712mlM6564a));
        m5198b(c9637jl2);
        m5195a(c9637jl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[PHI: r1
  0x005c: PHI (r1v4 boolean) = (r1v3 boolean), (r1v7 boolean), (r1v7 boolean) binds: [B:43:0x0025, B:52:0x0057, B:53:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean m5203g() {
        boolean z;
        boolean z2;
        try {
            C9637jl c9637jlM5201e = m5201e();
            Set set = AbstractC9562gl.f8211a;
            boolean z3 = false;
            z = true;
            if (!c9637jlM5201e.f8474w) {
                z2 = AbstractC9562gl.f8212b.currentTimeSeconds() > c9637jlM5201e.f8466o + ((long) c9637jlM5201e.f8449A.f6734a);
            }
            if (z2) {
                z = z2;
            } else {
                if (AbstractC9562gl.m6192a(c9637jlM5201e.f8455d) && AbstractC9562gl.m6192a(c9637jlM5201e.f8452a) && AbstractC9562gl.m6192a(c9637jlM5201e.f8453b)) {
                    z3 = true;
                }
                z2 = !z3;
                C9250U3 c9250u3 = this.f6626a.f6692k;
                Map map = m5200d().f8140h;
                C9178R3 c9178r3 = this.f6626a.f6691j;
                c9250u3.getClass();
                boolean zM5629a = C9250U3.m5629a(map, c9637jlM5201e, c9178r3);
                if (z2 || zM5629a) {
                }
            }
        } finally {
        }
        return z;
    }

    /* renamed from: h */
    public final synchronized void m5204h() {
        this.f6627b = null;
    }

    @NotNull
    /* renamed from: a */
    public final C9396a5 m5190a() {
        return this.f6626a.f6687f;
    }

    /* renamed from: b */
    public final synchronized void m5198b(C9637jl c9637jl) {
        this.f6626a.f6693l.m6882a(c9637jl);
        C9612il c9612il = this.f6626a.f6688g;
        c9612il.f8373b.m6909a(c9637jl.f8452a);
        c9612il.f8373b.m6911b(c9637jl.f8453b);
        c9612il.f8372a.save(c9637jl.f8454c);
        this.f6626a.f6686e.mo5082a(c9637jl);
    }

    /* renamed from: a */
    public final synchronized boolean m5196a(@Nullable List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC9562gl.m6191a(m5201e(), list, map, new C8882El(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003e  */
    @VisibleForTesting
    @NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9637jl m5191a(@NotNull C9587hl c9587hl, @NotNull C9537fl c9537fl, long j) {
        String str;
        boolean zEquals;
        String strM5334a = AbstractC9029Kl.m5334a(c9537fl.f8140h);
        Map map = c9537fl.f8141i.f6805a;
        String str2 = c9587hl.f8299j;
        String str3 = m5201e().f8462k;
        if (!AbstractC9029Kl.m5336a(AbstractC9029Kl.m5335a(str2))) {
            str2 = AbstractC9029Kl.m5336a(AbstractC9029Kl.m5335a(str3)) ? str3 : null;
        }
        String str4 = m5201e().f8452a;
        if (str4 != null) {
            str = StringsKt__StringsJVMKt.isBlank(str4) ^ true ? str4 : null;
            if (str == null) {
            }
        } else {
            str = c9587hl.f8297h;
        }
        C9712ml c9712ml = new C9712ml(c9587hl.f8291b);
        String str5 = c9587hl.f8298i;
        c9712ml.f8677o = this.f6626a.f6690i.currentTimeSeconds();
        c9712ml.f8663a = m5201e().f8455d;
        c9712ml.f8665c = c9587hl.f8293d;
        c9712ml.f8668f = c9587hl.f8292c;
        c9712ml.f8669g = c9537fl.f8137e;
        c9712ml.f8664b = c9587hl.f8294e;
        c9712ml.f8666d = c9587hl.f8295f;
        c9712ml.f8667e = c9587hl.f8296g;
        c9712ml.f8670h = c9587hl.f8303n;
        c9712ml.f8671i = c9587hl.f8304o;
        c9712ml.f8672j = str2;
        c9712ml.f8673k = strM5334a;
        this.f6626a.f6692k.getClass();
        HashMap mapM5335a = AbstractC9029Kl.m5335a(str2);
        if (AbstractC9664kn.m6345a(map)) {
            zEquals = AbstractC9664kn.m6345a((Map) mapM5335a);
        } else {
            zEquals = mapM5335a.equals(map);
        }
        c9712ml.f8679q = zEquals;
        c9712ml.f8674l = AbstractC9029Kl.m5334a(map);
        c9712ml.f8680r = c9587hl.f8302m;
        c9712ml.f8676n = c9587hl.f8300k;
        c9712ml.f8681s = c9587hl.f8305p;
        c9712ml.f8678p = true;
        c9712ml.f8682t = j;
        C9537fl c9537flM5200d = m5200d();
        if (c9537flM5200d.f8146n == 0) {
            c9537flM5200d.f8146n = j;
        }
        c9712ml.f8683u = c9537flM5200d.f8146n;
        c9712ml.f8684v = false;
        c9712ml.f8685w = c9587hl.f8306q;
        c9712ml.f8687y = c9587hl.f8308s;
        c9712ml.f8686x = c9587hl.f8307r;
        c9712ml.f8688z = c9587hl.f8309t;
        c9712ml.f8660A = c9587hl.f8310u;
        c9712ml.f8661B = c9587hl.f8311v;
        c9712ml.f8662C = c9587hl.f8312w;
        return new C9637jl(str, str5, new C9737nl(c9712ml));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:30:0x0001, B:32:0x0007, B:41:0x0037, B:43:0x003e), top: B:50:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5194a(@NotNull C9587hl c9587hl, @NotNull C9537fl c9537fl, @Nullable Map<String, ? extends List<String>> map) {
        Long lValueOf;
        C9637jl c9637jlM5191a;
        synchronized (this) {
            if (!AbstractC9664kn.m6345a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC9664kn.m6344a((Collection) list)) {
                    try {
                        lValueOf = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long jLongValue = lValueOf == null ? lValueOf.longValue() : 0L;
                    AbstractC9710mj.f8655a.m6558a(jLongValue, c9587hl.f8301l);
                    c9637jlM5191a = m5191a(c9587hl, c9537fl, jLongValue);
                    m5204h();
                    m5198b(c9637jlM5191a);
                    Unit unit = Unit.INSTANCE;
                } else {
                    lValueOf = null;
                    if (lValueOf == null) {
                    }
                    AbstractC9710mj.f8655a.m6558a(jLongValue, c9587hl.f8301l);
                    c9637jlM5191a = m5191a(c9587hl, c9537fl, jLongValue);
                    m5204h();
                    m5198b(c9637jlM5191a);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        m5195a(c9637jlM5191a);
    }

    /* renamed from: a */
    public final void m5195a(C9637jl c9637jl) {
        ArrayList arrayList;
        C8932Gl c8932Gl = this.f6626a;
        C9004Jk c9004Jk = c8932Gl.f6685d;
        String str = c8932Gl.f6683b;
        synchronized (c9004Jk.f6841a.f6950b) {
            try {
                C9052Lk c9052Lk = c9004Jk.f6841a;
                c9052Lk.f6951c = c9637jl;
                Collection collection = (Collection) c9052Lk.f6949a.f8720a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC9267Uk) it.next()).mo5381a(c9637jl);
        }
    }

    /* renamed from: a */
    public final void m5192a(@NotNull EnumC9100Nk enumC9100Nk) {
        synchronized (this) {
            this.f6627b = null;
        }
        C8932Gl c8932Gl = this.f6626a;
        c8932Gl.f6685d.m5314a(c8932Gl.f6687f.f7668a, enumC9100Nk, m5201e());
    }

    /* renamed from: a */
    public final synchronized void m5193a(@NotNull C9487dl c9487dl) {
        try {
            this.f6626a.f6693l.mo5408a(c9487dl);
            C9537fl c9537flM5200d = m5200d();
            if (c9537flM5200d.f8143k) {
                List list = c9537flM5200d.f8142j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC9664kn.m6343a(list, c9537flM5200d.f8137e)) {
                        C9637jl c9637jlM5201e = m5201e();
                        C9737nl c9737nl = c9637jlM5201e.f8454c;
                        C9712ml c9712mlM6564a = c9737nl.m6564a(c9737nl.f8777m);
                        String str = c9637jlM5201e.f8452a;
                        String str2 = c9637jlM5201e.f8453b;
                        c9712mlM6564a.f8669g = list;
                        C9637jl c9637jl = new C9637jl(str, str2, new C9737nl(c9712mlM6564a));
                        m5198b(c9637jl);
                        m5195a(c9637jl);
                    }
                } else {
                    if (c9537flM5200d.f8137e != null && (!r5.isEmpty())) {
                        C9637jl c9637jlM5201e2 = m5201e();
                        C9737nl c9737nl2 = c9637jlM5201e2.f8454c;
                        C9712ml c9712mlM6564a2 = c9737nl2.m6564a(c9737nl2.f8777m);
                        String str3 = c9637jlM5201e2.f8452a;
                        String str4 = c9637jlM5201e2.f8453b;
                        c9712mlM6564a2.f8669g = null;
                        C9637jl c9637jl2 = new C9637jl(str3, str4, new C9737nl(c9712mlM6564a2));
                        m5198b(c9637jl2);
                        m5195a(c9637jl2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
