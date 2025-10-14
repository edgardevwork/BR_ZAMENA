package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.M4 */
/* loaded from: classes6.dex */
public final class C9060M4 implements InterfaceC8821Ca, InterfaceC9267Uk, InterfaceC8871Ea {

    /* renamed from: a */
    public final Context f6961a;

    /* renamed from: b */
    public final C9396a5 f6962b;

    /* renamed from: c */
    public final C8907Fl f6963c;

    /* renamed from: d */
    public final C9263Ug f6964d;

    /* renamed from: e */
    public final C9198S f6965e;

    /* renamed from: f */
    public final C9227T4 f6966f;

    /* renamed from: g */
    public final C9688lm f6967g;

    /* renamed from: h */
    public ArrayList f6968h;

    /* renamed from: i */
    public final C9421b5 f6969i;

    /* renamed from: j */
    public final C8851Df f6970j;

    /* renamed from: k */
    public final C9620j4 f6971k;

    /* renamed from: l */
    public final C8975If f6972l;

    /* renamed from: m */
    public final Object f6973m;

    public C9060M4(@NonNull Context context, @NonNull C9052Lk c9052Lk, @NonNull C9396a5 c9396a5, @NonNull C8865E4 c8865e4, @NonNull C8851Df c8851Df) {
        this(context, c9052Lk, c9396a5, c8865e4, new C9263Ug(c8865e4.f6523b), c8851Df, new C9421b5(), new C9108O4(), new C9198S(new C9151Q(), new C9079N(), new C9031L(), C9676la.m6362h().m6384u().m6966a(), "ServicePublic"), new C8975If());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8821Ca
    /* renamed from: a */
    public final void mo5023a(@NonNull C8840D4 c8840d4) {
        C9263Ug c9263Ug = this.f6964d;
        c9263Ug.f7335a = c9263Ug.f7335a.mergeFrom(c8840d4);
    }

    /* renamed from: b */
    public final synchronized void m5382b(@NonNull C8988J4 c8988j4) {
        this.f6969i.f7766a.remove(c8988j4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8821Ca
    @NonNull
    /* renamed from: c */
    public final CounterConfigurationReporterType mo5025c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    @NonNull
    /* renamed from: d */
    public final C8840D4 m5383d() {
        return this.f6964d.f7335a;
    }

    @NonNull
    /* renamed from: e */
    public final C8851Df m5384e() {
        return this.f6970j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8821Ca
    @NonNull
    public final Context getContext() {
        return this.f6961a;
    }

    /* renamed from: a */
    public final synchronized void m5377a(@NonNull C8988J4 c8988j4) {
        this.f6969i.f7766a.add(c8988j4);
        ResultReceiverC8817C6.m5020a(c8988j4.f6809c, this.f6971k.m6300a(AbstractC9029Kl.m5335a(this.f6963c.m5201e().f8463l)));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8821Ca
    @NonNull
    /* renamed from: b */
    public final C9396a5 mo5024b() {
        return this.f6962b;
    }

    /* renamed from: a */
    public final void m5379a(@NonNull C9252U5 c9252u5, @NonNull C8988J4 c8988j4) {
        C9227T4 c9227t4 = this.f6966f;
        c9227t4.getClass();
        c9227t4.m5446a(c9252u5, new C9203S4(c8988j4));
    }

    public C9060M4(Context context, C9052Lk c9052Lk, C9396a5 c9396a5, C8865E4 c8865e4, C9263Ug c9263Ug, C8851Df c8851Df, C9421b5 c9421b5, C9108O4 c9108o4, C9198S c9198s, C8975If c8975If) {
        this.f6968h = new ArrayList();
        this.f6973m = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f6961a = applicationContext;
        this.f6962b = c9396a5;
        this.f6964d = c9263Ug;
        this.f6969i = c9421b5;
        this.f6966f = C9108O4.m5453a(this);
        C8907Fl c8907FlM5367a = c9052Lk.m5367a(applicationContext, c9396a5, c8865e4.f6522a);
        this.f6963c = c8907FlM5367a;
        this.f6965e = c9198s;
        c9198s.mo5537a(applicationContext, c8907FlM5367a.m5201e());
        this.f6971k = AbstractC9645k4.m6325a(c8907FlM5367a, c9198s, applicationContext);
        this.f6967g = c9108o4.m5454a(this, c8907FlM5367a);
        this.f6970j = c8851Df;
        this.f6972l = c8975If;
        c9052Lk.m5368a(c9396a5, this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9267Uk
    /* renamed from: a */
    public final void mo5381a(@NonNull C9637jl c9637jl) {
        this.f6965e.f7216c = c9637jl;
        synchronized (this.f6973m) {
            try {
                Iterator it = this.f6969i.f7766a.iterator();
                while (it.hasNext()) {
                    C8988J4 c8988j4 = (C8988J4) it.next();
                    ResultReceiverC8817C6.m5020a(c8988j4.f6809c, this.f6971k.m6300a(AbstractC9029Kl.m5335a(c9637jl.f8463l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f6968h.iterator();
                while (it2.hasNext()) {
                    C9281Va c9281Va = (C9281Va) it2.next();
                    if (AbstractC9562gl.m6191a(c9637jl, c9281Va.f7353b, c9281Va.f7354c, new C9233Ta())) {
                        ResultReceiverC8817C6.m5020a(c9281Va.f7352a, this.f6971k.m6300a(c9281Va.f7354c));
                    } else {
                        arrayList.add(c9281Va);
                    }
                }
                this.f6968h = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f6967g.m6408b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9267Uk
    /* renamed from: a */
    public final void mo5378a(@NonNull EnumC9100Nk enumC9100Nk, @Nullable C9637jl c9637jl) {
        synchronized (this.f6973m) {
            try {
                Iterator it = this.f6968h.iterator();
                while (it.hasNext()) {
                    C9281Va c9281Va = (C9281Va) it.next();
                    ResultReceiverC8817C6.m5019a(c9281Va.f7352a, enumC9100Nk, this.f6971k.m6300a(c9281Va.f7354c));
                }
                this.f6968h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m5380a(@Nullable C9281Va c9281Va) {
        ResultReceiver resultReceiver;
        HashMap map;
        List<String> list;
        HashMap map2 = new HashMap();
        if (c9281Va != null) {
            list = c9281Va.f7353b;
            resultReceiver = c9281Va.f7352a;
            map = c9281Va.f7354c;
        } else {
            resultReceiver = null;
            map = map2;
            list = null;
        }
        boolean zM5196a = this.f6963c.m5196a(list, map);
        if (!zM5196a) {
            ResultReceiverC8817C6.m5020a(resultReceiver, this.f6971k.m6300a(map));
        }
        if (!this.f6963c.m5203g()) {
            if (zM5196a) {
                ResultReceiverC8817C6.m5020a(resultReceiver, this.f6971k.m6300a(map));
                return;
            }
            return;
        }
        synchronized (this.f6973m) {
            if (zM5196a && c9281Va != null) {
                try {
                    this.f6968h.add(c9281Va);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f6967g.m6408b();
    }

    /* renamed from: a */
    public final void m5376a(@Nullable ResultReceiver resultReceiver) {
        this.f6972l.m5274a(new C9036L4(resultReceiver));
    }

    @NonNull
    /* renamed from: a */
    public final C9620j4 m5375a() {
        return this.f6971k;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8871Ea
    /* renamed from: a */
    public final void mo5111a(@NonNull C8865E4 c8865e4) {
        this.f6963c.m5193a(c8865e4.f6522a);
        mo5023a(c8865e4.f6523b);
    }
}
