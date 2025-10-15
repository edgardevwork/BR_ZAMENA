package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.Sk */
/* loaded from: classes5.dex */
public final class C9219Sk implements InterfaceC9243Tk {

    /* renamed from: k */
    public static final Map f7258k = Collections.unmodifiableMap(new C9148Pk());

    /* renamed from: a */
    public final List f7259a;

    /* renamed from: b */
    public final C9145Ph f7260b;

    /* renamed from: c */
    public final C9412al f7261c;

    /* renamed from: d */
    public final Handler f7262d;

    /* renamed from: e */
    public PublicLogger f7263e;

    /* renamed from: f */
    public final C9172Qk f7264f;

    /* renamed from: g */
    public final Object f7265g;

    /* renamed from: h */
    public final WeakHashMap f7266h;

    /* renamed from: i */
    public HashMap f7267i;

    /* renamed from: j */
    public boolean f7268j;

    public C9219Sk(@NonNull Context context, C9145Ph c9145Ph, C9730ne c9730ne, @NonNull Handler handler) {
        this(c9145Ph, new C9412al(context, c9730ne), handler);
    }

    /* renamed from: a */
    public final void m5585a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        synchronized (this.f7265g) {
            try {
                C9412al c9412al = this.f7261c;
                c9412al.getClass();
                if (!AbstractC9664kn.m6345a((Map) map) && !AbstractC9664kn.m6343a(map, c9412al.f7745e)) {
                    c9412al.f7745e = new HashMap(map);
                    c9412al.f7747g = true;
                    c9412al.m5885c();
                }
                m5584a(startupParamsCallback, list);
                if (this.f7261c.m5882a((List) list)) {
                    m5588a(list, new C9195Rk(this, startupParamsCallback), map);
                } else {
                    m5583a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:12:0x0085, B:14:0x00b4, B:15:0x00bb, B:17:0x00c1, B:18:0x00c8, B:20:0x00dd, B:23:0x00e8, B:24:0x00f4, B:21:0x00e2, B:11:0x0082), top: B:30:0x0063 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5591b(Bundle bundle) {
        IdentifiersResult identifiersResultM6274a = C9595i4.m6274a(bundle, "Uuid");
        IdentifiersResult identifiersResultM6274a2 = C9595i4.m6274a(bundle, "DeviceId");
        IdentifiersResult identifiersResultM6274a3 = C9595i4.m6274a(bundle, "DeviceIdHash");
        IdentifiersResult identifiersResultM6274a4 = C9595i4.m6274a(bundle, "AdUrlReport");
        IdentifiersResult identifiersResultM6274a5 = C9595i4.m6274a(bundle, "AdUrlGet");
        IdentifiersResult identifiersResultM6274a6 = C9595i4.m6274a(bundle, "Clids");
        IdentifiersResult identifiersResultM6274a7 = C9595i4.m6274a(bundle, "RequestClids");
        IdentifiersResult identifiersResultM6274a8 = C9595i4.m6274a(bundle, "GAID");
        IdentifiersResult identifiersResultM6274a9 = C9595i4.m6274a(bundle, "HOAID");
        IdentifiersResult identifiersResultM6274a10 = C9595i4.m6274a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult identifiersResultM6274a11 = C9595i4.m6274a(bundle, "CUSTOM_SDK_HOSTS");
        long j = bundle.getLong("ServerTimeOffset");
        long j2 = bundle.getLong("NextStartupTime");
        C9232T9 c9232t9M6272a = C9595i4.m6272a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        C9412al c9412al = this.f7261c;
        synchronized (c9412al) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) c9412al.f7742b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    C9764on c9764on = c9412al.f7755o;
                    String str = identifiersResult.f9419id;
                    c9764on.getClass();
                    if (!C9764on.m6610a(str)) {
                        c9412al.m5886c(identifiersResultM6274a);
                    }
                }
                c9412al.m5879a(StartupParamsCallback.APPMETRICA_DEVICE_ID, identifiersResultM6274a2);
                c9412al.m5879a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, identifiersResultM6274a3);
                c9412al.f7742b.put("appmetrica_google_adv_id", identifiersResultM6274a8);
                c9412al.f7742b.put("appmetrica_huawei_oaid", identifiersResultM6274a9);
                c9412al.f7742b.put("appmetrica_yandex_adv_id", identifiersResultM6274a10);
                c9412al.f7752l.m6988a(identifiersResultM6274a11);
                c9412al.f7753m.m5521a(c9232t9M6272a);
                if (!C9412al.m5878a(identifiersResultM6274a5)) {
                    c9412al.f7742b.put("appmetrica_get_ad_url", identifiersResultM6274a5);
                }
                if (!C9412al.m5878a(identifiersResultM6274a4)) {
                    c9412al.f7742b.put("appmetrica_report_ad_url", identifiersResultM6274a4);
                }
                c9412al.f7746f = j;
                C9250U3 c9250u3 = c9412al.f7751k;
                HashMap map = c9412al.f7745e;
                HashMap mapM5967a = AbstractC9452cb.m5967a(identifiersResultM6274a7.f9419id);
                c9250u3.getClass();
                if (AbstractC9664kn.m6345a((Map) map) ? AbstractC9664kn.m6345a((Map) mapM5967a) : map.equals(mapM5967a)) {
                    c9412al.f7742b.put("appmetrica_clids", identifiersResultM6274a6);
                    c9412al.f7747g = false;
                }
                c9412al.f7748h = j2;
                c9412al.m5885c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C9820r4.m6725i().m6737k().m6571a(bundle2, new SdkIdentifiers(identifiersResultM6274a.f9419id, identifiersResultM6274a2.f9419id, identifiersResultM6274a3.f9419id));
        m5600h();
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: c */
    public final InterfaceC8792B6 m5595c() {
        return this.f7264f;
    }

    /* renamed from: d */
    public final String m5596d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7261c.f7742b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f9419id;
    }

    @NonNull
    /* renamed from: e */
    public final C9280V9 m5597e() {
        C9232T9 c9232t9;
        C9412al c9412al = this.f7261c;
        C9161Q9 c9161q9 = c9412al.f7754n;
        C9184R9 c9184r9 = c9412al.f7753m;
        synchronized (c9184r9) {
            c9232t9 = c9184r9.f7201b;
        }
        c9161q9.getClass();
        Boolean bool = c9232t9.f7285a;
        return new C9280V9();
    }

    /* renamed from: f */
    public final long m5598f() {
        return this.f7261c.f7746f;
    }

    /* renamed from: g */
    public final String m5599g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7261c.f7742b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f9419id;
    }

    /* renamed from: h */
    public final void m5600h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f7266h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f7261c.m5881a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                m5583a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    /* renamed from: i */
    public final void m5601i() {
        synchronized (this.f7265g) {
            try {
                if (!this.f7268j || this.f7261c.m5884b()) {
                    this.f7268j = true;
                    m5588a(this.f7259a, this.f7264f, this.f7267i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C9219Sk(C9145Ph c9145Ph, C9412al c9412al, Handler handler) {
        this.f7259a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f7265g = new Object();
        this.f7266h = new WeakHashMap();
        this.f7268j = false;
        this.f7260b = c9145Ph;
        this.f7261c = c9412al;
        this.f7262d = handler;
        this.f7264f = new C9172Qk(this);
    }

    /* renamed from: a */
    public final void m5582a(@NonNull Bundle bundle) {
        m5592b(bundle, null);
    }

    /* renamed from: a */
    public final void m5586a(@NonNull PublicLogger publicLogger) {
        this.f7263e = publicLogger;
    }

    /* renamed from: a */
    public final void m5588a(List list, InterfaceC8792B6 interfaceC8792B6, Map map) {
        ResultReceiverC8817C6 resultReceiverC8817C6 = new ResultReceiverC8817C6(this.f7262d, interfaceC8792B6);
        C9145Ph c9145Ph = this.f7260b;
        c9145Ph.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C9281Va(resultReceiverC8817C6, list, map));
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC9875t9.f9105a;
        C9445c4 c9445c4 = new C9445c4("", "", 1536, 0, anonymousInstance);
        c9445c4.f7321m = bundle;
        C9251U4 c9251u4 = c9145Ph.f7115a;
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9251u4), c9251u4, 1, null);
    }

    /* renamed from: a */
    public final void m5589a(Map<String, String> map) {
        if (AbstractC9664kn.m6345a((Map) map)) {
            return;
        }
        synchronized (this.f7265g) {
            try {
                HashMap mapM5337b = AbstractC9029Kl.m5337b(map);
                this.f7267i = mapM5337b;
                this.f7260b.m5495a(mapM5337b);
                C9412al c9412al = this.f7261c;
                c9412al.getClass();
                if (!AbstractC9664kn.m6345a((Map) mapM5337b) && !AbstractC9664kn.m6343a(mapM5337b, c9412al.f7745e)) {
                    c9412al.f7745e = new HashMap(mapM5337b);
                    c9412al.f7747g = true;
                    c9412al.m5885c();
                }
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final void m5592b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        synchronized (this.f7265g) {
            try {
                m5591b(bundle);
                m5600h();
                if (startupParamsCallback != null) {
                    m5583a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m5587a(String str) {
        synchronized (this.f7265g) {
            this.f7260b.m5494a(str);
        }
    }

    /* renamed from: b */
    public final void m5594b(List<String> list) {
        synchronized (this.f7265g) {
            try {
                List list2 = this.f7261c.f7744d;
                if (AbstractC9664kn.m6344a((Collection) list)) {
                    if (!AbstractC9664kn.m6344a((Collection) list2)) {
                        C9412al c9412al = this.f7261c;
                        c9412al.f7744d = null;
                        c9412al.f7749i.m6514a((List<String>) null);
                        this.f7260b.m5496a((List) null);
                    }
                } else if (!AbstractC9664kn.m6343a(list, list2)) {
                    C9412al c9412al2 = this.f7261c;
                    c9412al2.f7744d = list;
                    c9412al2.f7749i.m6514a(list);
                    this.f7260b.m5496a(list);
                } else {
                    this.f7260b.m5496a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void m5583a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        EnumC9100Nk enumC9100Nk;
        if (this.f7266h.containsKey(startupParamsCallback)) {
            List list = (List) this.f7266h.get(startupParamsCallback);
            if (this.f7261c.m5881a((Collection) list)) {
                startupParamsCallback.onReceive(m5581a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    enumC9100Nk = EnumC9100Nk.UNKNOWN;
                    if (i == 1) {
                        enumC9100Nk = EnumC9100Nk.NETWORK;
                    } else if (i == 2) {
                        enumC9100Nk = EnumC9100Nk.PARSE;
                    }
                } else {
                    enumC9100Nk = null;
                }
                if (enumC9100Nk == null) {
                    if (!this.f7261c.m5880a()) {
                        PublicLogger publicLogger = this.f7263e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f7267i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        enumC9100Nk = EnumC9100Nk.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f7258k, enumC9100Nk, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, m5581a(list));
            }
            this.f7266h.remove(startupParamsCallback);
            if (this.f7266h.isEmpty()) {
                C9616j0 c9616j0 = this.f7260b.f7118d;
                synchronized (c9616j0.f8383f) {
                    c9616j0.f8380c = false;
                    c9616j0.m6298c();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m5593b(@Nullable String str) {
        synchronized (this.f7265g) {
            this.f7260b.m5497b(str);
        }
    }

    /* renamed from: b */
    public final Map<String, String> m5590b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7261c.f7742b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f9419id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC9452cb.m5967a(str);
        }
        return this.f7267i;
    }

    /* renamed from: a */
    public final StartupParamsCallback.Result m5581a(List list) {
        HashMap map = new HashMap();
        C9412al c9412al = this.f7261c;
        synchronized (c9412al) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c9412al.f7742b.get(str);
                    if (identifiersResult != null) {
                        map.put(str, c9412al.f7743c.m5758a(identifiersResult));
                    }
                }
                c9412al.f7752l.m6989a(list, map);
                c9412al.f7753m.m5522a(list, map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(map);
    }

    /* renamed from: a */
    public final void m5584a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f7266h.isEmpty()) {
            C9616j0 c9616j0 = this.f7260b.f7118d;
            synchronized (c9616j0.f8383f) {
                c9616j0.f8380c = true;
                c9616j0.m6297b();
            }
        }
        this.f7266h.put(startupParamsCallback, list);
    }

    @NonNull
    /* renamed from: a */
    public final AdvIdentifiersResult m5580a() {
        C9412al c9412al = this.f7261c;
        C8959I c8959i = c9412al.f7750j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c9412al.f7742b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c9412al.f7742b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c9412al.f7742b.get("appmetrica_yandex_adv_id");
        c8959i.getClass();
        return new AdvIdentifiersResult(C8959I.m5255a(identifiersResult), C8959I.m5255a(identifiersResult2), C8959I.m5255a(identifiersResult3));
    }
}
