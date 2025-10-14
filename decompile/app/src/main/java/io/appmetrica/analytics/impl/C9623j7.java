package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.j7 */
/* loaded from: classes5.dex */
public final class C9623j7 {

    /* renamed from: a */
    public final Context f8408a;

    /* renamed from: b */
    public final int f8409b;

    /* renamed from: c */
    public final C9160Q8 f8410c;

    /* renamed from: d */
    public final C9974x8 f8411d;

    /* renamed from: e */
    public final C9466d0 f8412e;

    /* renamed from: f */
    public final C8919G8 f8413f;

    /* renamed from: g */
    public final C9698m7 f8414g;

    /* renamed from: h */
    public final C9252U5 f8415h;

    public C9623j7(Context context, C9386Zj c9386Zj, int i, C9160Q8 c9160q8, C9974x8 c9974x8, C9466d0 c9466d0, C8919G8 c8919g8, C9698m7 c9698m7) {
        this.f8408a = context;
        this.f8409b = i;
        this.f8410c = c9160q8;
        this.f8411d = c9974x8;
        this.f8412e = c9466d0;
        this.f8413f = c8919g8;
        this.f8414g = c9698m7;
        this.f8415h = c9974x8.f9298a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static String m6301b() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C9738nm c9738nmM6389z = C9676la.f8552C.m6389z();
        C9598i7 c9598i7 = new C9598i7(objectRef);
        synchronized (c9738nmM6389z) {
            c9738nmM6389z.f8792b.mo5628a(c9598i7);
        }
        return (String) objectRef.element;
    }

    /* renamed from: a */
    public final C9523f7 m6302a() throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        C8934Gn c8934Gn;
        Location location;
        Integer numValueOf = Integer.valueOf(this.f8415h.f7313e);
        String name = this.f8415h.getName();
        String value = this.f8415h.getValue();
        C9160Q8 c9160q8 = this.f8410c;
        int i = this.f8409b;
        C9964wn c9964wn = c9160q8.f7151a.f7199a;
        synchronized (c9964wn) {
            jSONObjectOptJSONObject = c9964wn.f9286a.m6979a().optJSONObject("numbers_of_type");
        }
        long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong(String.valueOf(i)) : 0L;
        c9160q8.f7151a.m5520a(i, 1 + jOptLong);
        Long lValueOf = Long.valueOf(jOptLong);
        C9698m7 c9698m7 = this.f8414g;
        C8902Fg c8902Fg = c9698m7.f8635a;
        Location location2 = c8902Fg.f6600e;
        if (location2 != null) {
            int i2 = C8934Gn.f6696b;
            Location location3 = new Location(location2);
            String provider = location3.getProvider();
            location3.setProvider("");
            c8934Gn = new C8934Gn(location3, provider);
        } else {
            c8934Gn = (!c8902Fg.f6599d || (location = C9676la.f8552C.m6373j().getLocation()) == null) ? null : new C8934Gn(new Location(location), "");
        }
        boolean z = c9698m7.f8635a.f6599d;
        Double dValueOf = c8934Gn != null ? Double.valueOf(c8934Gn.getLatitude()) : null;
        Double dValueOf2 = c8934Gn != null ? Double.valueOf(c8934Gn.getLongitude()) : null;
        Long lValueOf2 = c8934Gn != null ? Long.valueOf(c8934Gn.getTime()) : null;
        Integer numValueOf2 = c8934Gn != null ? Integer.valueOf((int) c8934Gn.getAccuracy()) : null;
        C9648k7 c9648k7 = new C9648k7(Boolean.valueOf(z), dValueOf2, dValueOf, c8934Gn != null ? Integer.valueOf((int) c8934Gn.getAltitude()) : null, c8934Gn != null ? Integer.valueOf((int) c8934Gn.getBearing()) : null, numValueOf2, c8934Gn != null ? Integer.valueOf((int) c8934Gn.getSpeed()) : null, lValueOf2, c8934Gn != null ? c8934Gn.getProvider() : null, c8934Gn != null ? c8934Gn.f6697a : null);
        String str = this.f8415h.f7311c;
        C9466d0 c9466d0 = this.f8412e;
        String str2 = c9466d0.f7885a;
        Long lValueOf3 = Long.valueOf(c9466d0.f7886b);
        Integer numValueOf3 = Integer.valueOf(this.f8415h.f7315g);
        Context context = this.f8408a;
        SafePackageManager safePackageManager = AbstractC9380Zd.f7639a;
        Integer num = (Integer) AbstractC9380Zd.f7642d.m6635a((EnumC9356Yd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC9356Yd.UNDEFINED, new C9332Xd()));
        num.intValue();
        String strM6301b = m6301b();
        EnumC8894F8 enumC8894F8 = this.f8411d.f9299b;
        C9252U5 c9252u5 = this.f8415h;
        return new C9523f7(numValueOf, name, value, lValueOf, c9648k7, str, str2, lValueOf3, numValueOf3, num, strM6301b, enumC8894F8, c9252u5.f7316h, c9252u5.f7319k, c9252u5.f7320l, c9252u5.f7322n, c9252u5.f7323o, this.f8413f.fromModel(c9252u5.f7324p));
    }

    public /* synthetic */ C9623j7(Context context, C9386Zj c9386Zj, int i, C9160Q8 c9160q8, C9974x8 c9974x8, C8902Fg c8902Fg, C9466d0 c9466d0) {
        this(context, c9386Zj, i, c9160q8, c9974x8, c9466d0, new C8919G8(), new C9698m7(c8902Fg));
    }
}
