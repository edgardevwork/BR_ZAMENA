package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.al */
/* loaded from: classes6.dex */
public final class C9412al {

    /* renamed from: a */
    public final HashSet f7741a;

    /* renamed from: b */
    public final HashMap f7742b;

    /* renamed from: c */
    public final C9339Xk f7743c;

    /* renamed from: d */
    public List f7744d;

    /* renamed from: e */
    public HashMap f7745e;

    /* renamed from: f */
    public long f7746f;

    /* renamed from: g */
    public boolean f7747g;

    /* renamed from: h */
    public long f7748h;

    /* renamed from: i */
    public final C9730ne f7749i;

    /* renamed from: j */
    public final C8959I f7750j;

    /* renamed from: k */
    public final C9250U3 f7751k;

    /* renamed from: l */
    public final C9997y6 f7752l;

    /* renamed from: m */
    public final C9184R9 f7753m;

    /* renamed from: n */
    public final C9161Q9 f7754n;

    /* renamed from: o */
    public final C9764on f7755o;

    public C9412al(Context context, C9730ne c9730ne) {
        this(c9730ne, new C8959I(), new C9250U3(), C9820r4.m6725i().m6726a(context), new C9997y6(), new C9184R9(), new C9161Q9(), new C9764on());
    }

    /* renamed from: a */
    public final synchronized boolean m5882a(List list) {
        boolean z;
        boolean z2;
        try {
            z = true;
            boolean z3 = !m5881a(CollectionsKt___CollectionsKt.intersect(list, AbstractC9562gl.f8211a));
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (this.f7741a.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            boolean z4 = AbstractC9562gl.f8212b.currentTimeSeconds() > this.f7748h;
            if (!z3 && !z2 && !z4) {
                if (!this.f7747g) {
                    z = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* renamed from: b */
    public final void m5883b(IdentifiersResult identifiersResult) {
        if (m5878a(identifiersResult)) {
            return;
        }
        this.f7742b.put("appmetrica_clids", identifiersResult);
    }

    /* renamed from: c */
    public final void m5886c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C9764on c9764on = this.f7755o;
            String str = identifiersResult.f9419id;
            c9764on.getClass();
            if (C9764on.m6610a(str)) {
                this.f7742b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m5884b() {
        return m5882a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    /* renamed from: c */
    public final void m5885c() {
        C9232T9 c9232t9;
        C9730ne c9730neM6523d = this.f7749i.m6536i((IdentifiersResult) this.f7742b.get(StartupParamsCallback.APPMETRICA_UUID)).m6527e((IdentifiersResult) this.f7742b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).m6524d((IdentifiersResult) this.f7742b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).m6512a((IdentifiersResult) this.f7742b.get("appmetrica_get_ad_url")).m6519b((IdentifiersResult) this.f7742b.get("appmetrica_report_ad_url")).m6526e(this.f7746f).m6533h((IdentifiersResult) this.f7742b.get("appmetrica_clids")).m6540j(AbstractC9029Kl.m5334a((Map) this.f7745e)).m6530f((IdentifiersResult) this.f7742b.get("appmetrica_google_adv_id")).m6531g((IdentifiersResult) this.f7742b.get("appmetrica_huawei_oaid")).m6539j((IdentifiersResult) this.f7742b.get("appmetrica_yandex_adv_id")).m6520b(this.f7747g).m6522c(this.f7752l.f9350d).m6523d(this.f7748h);
        C9184R9 c9184r9 = this.f7753m;
        synchronized (c9184r9) {
            c9232t9 = c9184r9.f7201b;
        }
        c9730neM6523d.m6511a(c9232t9).m6648b();
    }

    public C9412al(C9730ne c9730ne, C8959I c8959i, C9250U3 c9250u3, C9379Zc c9379Zc, C9997y6 c9997y6, C9184R9 c9184r9, C9161Q9 c9161q9, C9764on c9764on) {
        HashSet hashSet = new HashSet();
        this.f7741a = hashSet;
        this.f7742b = new HashMap();
        this.f7743c = new C9339Xk();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f7749i = c9730ne;
        this.f7750j = c8959i;
        this.f7751k = c9250u3;
        this.f7752l = c9997y6;
        this.f7753m = c9184r9;
        this.f7754n = c9161q9;
        this.f7755o = c9764on;
        m5886c(c9379Zc.m5808a());
        m5879a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c9730ne.m6541j());
        m5879a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c9730ne.m6537i());
        m5879a("appmetrica_get_ad_url", c9730ne.m6525d());
        m5879a("appmetrica_report_ad_url", c9730ne.m6528e());
        m5883b(c9730ne.m6547o());
        m5879a("appmetrica_google_adv_id", c9730ne.m6544l());
        m5879a("appmetrica_huawei_oaid", c9730ne.m6545m());
        m5879a("appmetrica_yandex_adv_id", c9730ne.m6550r());
        c9997y6.m6988a(c9730ne.m6534h());
        c9184r9.m5521a(c9730ne.m6542k());
        this.f7744d = c9730ne.m6532g();
        String strM6538i = c9730ne.m6538i((String) null);
        this.f7745e = strM6538i != null ? AbstractC9029Kl.m5335a(strM6538i) : null;
        this.f7747g = c9730ne.m6517a(true);
        this.f7746f = c9730ne.m6518b(0L);
        this.f7748h = c9730ne.m6546n();
        m5885c();
    }

    /* renamed from: a */
    public final boolean m5880a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7742b.get("appmetrica_clids");
        if (!m5878a(identifiersResult) && identifiersResult.f9419id.isEmpty()) {
            return AbstractC9664kn.m6345a((Map) this.f7745e);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m5878a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f9419id == null;
    }

    /* renamed from: a */
    public final void m5879a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f9419id)) {
            return;
        }
        this.f7742b.put(str, identifiersResult);
    }

    /* renamed from: a */
    public final synchronized boolean m5881a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f7742b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f7752l.f9349c.get(str2);
                }
                if (identifiersResult == null) {
                    C9232T9 c9232t9 = this.f7753m.f7201b;
                    if (!Intrinsics.areEqual(str2, "appmetrica_lib_ssl_enabled") || (bool = c9232t9.f7285a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c9232t9.f7286b;
                        String str3 = c9232t9.f7287c;
                        if (zBooleanValue) {
                            str = "true";
                        } else if (!zBooleanValue) {
                            str = "false";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f7747g || m5878a(identifiersResult) || (identifiersResult.f9419id.isEmpty() && !AbstractC9664kn.m6345a((Map) this.f7745e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f9419id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
