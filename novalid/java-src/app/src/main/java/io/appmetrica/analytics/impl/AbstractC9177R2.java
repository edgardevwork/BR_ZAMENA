package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.p048io.Base64Utils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.R2 */
/* loaded from: classes7.dex */
public abstract class AbstractC9177R2 implements InterfaceC8796Ba {

    /* renamed from: m */
    public static final HashSet f7183m = new HashSet(Arrays.asList(1, 13));

    /* renamed from: n */
    public static final C9130P2 f7184n = new C9130P2();

    /* renamed from: a */
    protected final Context f7185a;

    /* renamed from: b */
    protected final C9383Zg f7186b;

    /* renamed from: c */
    @NonNull
    protected final PublicLogger f7187c;

    /* renamed from: d */
    @NonNull
    protected final C9174Qm f7188d;

    /* renamed from: e */
    @NonNull
    protected final C9310Wf f7189e;

    /* renamed from: f */
    @NonNull
    protected final C9947w6 f7190f;

    /* renamed from: g */
    public final C9342Y f7191g;

    /* renamed from: h */
    protected final C9145Ph f7192h;

    /* renamed from: i */
    public C9627jb f7193i;

    /* renamed from: j */
    public final C9282Vb f7194j;

    /* renamed from: k */
    public final C9017K9 f7195k;

    /* renamed from: l */
    public final C9455ce f7196l;

    public AbstractC9177R2(Context context, C9145Ph c9145Ph, C9383Zg c9383Zg, C9017K9 c9017k9, C9282Vb c9282Vb, C9174Qm c9174Qm, C9310Wf c9310Wf, C9947w6 c9947w6, C9342Y c9342y, C9455ce c9455ce) {
        this.f7185a = context.getApplicationContext();
        this.f7192h = c9145Ph;
        this.f7186b = c9383Zg;
        this.f7195k = c9017k9;
        this.f7188d = c9174Qm;
        this.f7189e = c9310Wf;
        this.f7190f = c9947w6;
        this.f7191g = c9342y;
        this.f7196l = c9455ce;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c9383Zg.m5796b().getApiKey());
        this.f7187c = orCreatePublicLogger;
        c9383Zg.m5811a(new C9936vk(orCreatePublicLogger, "Crash Environment"));
        if (AbstractC9794q3.m6691a(c9383Zg.m5796b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f7194j = c9282Vb;
    }

    /* renamed from: a */
    public void mo4941a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f7187c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f7187c.info("Put error environment pair <%s, %s>", str, str2);
        C8794B8 c8794b8 = this.f7186b.f7643c;
        c8794b8.f6367b.m6900b(c8794b8.f6366a, str, str2);
    }

    /* renamed from: b */
    public final void m5514b(Map<String, String> map) {
        if (AbstractC9664kn.m6345a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo4941a(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m5515c(String str) {
        if (this.f7186b.mo5630f()) {
            return;
        }
        this.f7192h.f7118d.m6298c();
        C9627jb c9627jb = this.f7193i;
        c9627jb.f8432a.removeCallbacks(c9627jb.f8434c, c9627jb.f8433b.f7186b.f7617b.getApiKey());
        this.f7186b.f7645e = true;
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4("", str, 3, 0, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f7187c.info("Clear app environment", new Object[0]);
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        C9252U5 c9252u5M5935n = C9445c4.m5935n();
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str = c9383Zg.f7646f;
        }
        c9145Ph.m5491a(new C9168Qg(c9252u5M5935n, false, 1, null, new C9383Zg(c9213Se, counterConfiguration, str)));
    }

    /* renamed from: d */
    public final void m5516d(String str) {
        this.f7192h.f7118d.m6297b();
        C9627jb c9627jb = this.f7193i;
        C9627jb.m6310a(c9627jb.f8432a, c9627jb.f8433b, c9627jb.f8434c);
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4("", str, 6400, 0, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        this.f7186b.f7645e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    /* renamed from: k */
    public String mo5517k() {
        return "[BaseReporter]";
    }

    /* renamed from: l */
    public void mo5518l() {
        String str;
        C8974Ie c8974Ie;
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        C9070Me c9070Me = c9383Zg.f7644d;
        synchronized (c9383Zg) {
            str = c9383Zg.f7646f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c9383Zg.f7617b.getApiKey());
        Set set = AbstractC9875t9.f9105a;
        JSONObject jSONObject = new JSONObject();
        if (c9070Me != null && (c8974Ie = c9070Me.f6991a) != null) {
            try {
                jSONObject.put("preloadInfo", c8974Ie.m5273c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(string, "", 6144, 0, orCreatePublicLogger);
        c9445c4.mo5656c(str);
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f7187c.info("Pause session", new Object[0]);
        m5515c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f7187c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f7187c.info("Put app environment: <%s, %s>", str, str2);
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        C9252U5 c9252u5M5934b = C9445c4.m5934b(str, str2);
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str3 = c9383Zg.f7646f;
        }
        c9145Ph.m5491a(new C9168Qg(c9252u5M5934b, false, 1, null, new C9383Zg(c9213Se, counterConfiguration, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArrMo5010b;
        C9366Z c9366z = new C9366Z(new C9391a0(this, map));
        C9626ja c9626ja = new C9626ja();
        C9282Vb c9282Vb = C9820r4.m6725i().f8966a;
        Thread threadMo5009a = c9366z.mo5009a();
        Map mapMo5011c = null;
        try {
            stackTraceElementArrMo5010b = c9366z.mo5010b();
            if (stackTraceElementArrMo5010b == null) {
                try {
                    stackTraceElementArrMo5010b = threadMo5009a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrMo5010b = null;
        }
        C9938vm c9938vm = (C9938vm) c9626ja.apply(threadMo5009a, stackTraceElementArrMo5010b);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C8783Am());
        try {
            mapMo5011c = c9366z.mo5011c();
        } catch (SecurityException unused3) {
        }
        if (mapMo5011c != null) {
            treeMap.putAll(mapMo5011c);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != threadMo5009a && thread != null) {
                arrayList.add((C9938vm) c9626ja.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        mo4965a(new C9222T(c9938vm, arrayList, c9282Vb.m5691b()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.f7187c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        for (C9288Vh c9288Vh : eCommerceEvent.toProto()) {
            C9445c4 c9445c4 = new C9445c4(LoggerStorage.getOrCreatePublicLogger(c9383Zg.f7617b.getApiKey()));
            EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
            c9445c4.f7312d = 41000;
            c9445c4.f7310b = c9445c4.m5942e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) c9288Vh.f7371a)));
            c9445c4.f7315g = c9288Vh.f7372b.getBytesTruncated();
            C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
            synchronized (c9383Zg) {
                str = c9383Zg.f7646f;
            }
            c9145Ph.m5491a(new C9168Qg(c9445c4, false, 1, null, new C9383Zg(c9213Se, counterConfiguration, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th) {
        C9286Vf c9286Vf = new C9286Vf(str, m5512a(th));
        C9145Ph c9145Ph = this.f7192h;
        byte[] byteArray = MessageNano.toByteArray(this.f7189e.fromModel(c9286Vf));
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(byteArray, str, 5892, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        this.f7187c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f7187c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4("", str, 1, 0, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        C9534fi c9534fi = AbstractC9154Q2.f7139a;
        c9534fi.getClass();
        C9789pn c9789pnMo5086a = c9534fi.mo5086a(revenue);
        if (!c9789pnMo5086a.f8908a) {
            this.f7187c.warning("Passed revenue is not valid. Reason: " + c9789pnMo5086a.f8909b, new Object[0]);
            return;
        }
        C9145Ph c9145Ph = this.f7192h;
        C9559gi c9559gi = new C9559gi(revenue, this.f7187c);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        C9445c4 c9445c4M5933a = C9445c4.m5933a(LoggerStorage.getOrCreatePublicLogger(c9383Zg.f7617b.getApiKey()), c9559gi);
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str = c9383Zg.f7646f;
        }
        c9145Ph.m5491a(new C9168Qg(c9445c4M5933a, false, 1, null, new C9383Zg(c9213Se, counterConfiguration, str)));
        this.f7187c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        C9150Pm c9150PmM5602a = AbstractC9221Sm.m5602a(th, new C9222T(null, null, this.f7194j.m5691b()), null, (String) this.f7195k.f6881a.m5678a(), (Boolean) this.f7195k.f6882b.m5678a());
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.f7118d.m6297b();
        c9145Ph.m5491a(c9145Ph.f7116b.m5531a(c9150PmM5602a, c9383Zg));
        this.f7187c.info("Unhandled exception received: " + c9150PmM5602a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C9464cn c9464cn = new C9464cn(C9464cn.f7880c);
        Iterator<UserProfileUpdate<? extends InterfaceC9489dn>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC9489dn userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((AbstractC9504ed) userProfileUpdatePatcher).f8008e = this.f7187c;
            userProfileUpdatePatcher.mo5257a(c9464cn);
        }
        C9589hn c9589hn = new C9589hn();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c9464cn.f7881a.size(); i++) {
            SparseArray sparseArray = c9464cn.f7881a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C9514en) it2.next());
            }
        }
        c9589hn.f8320a = (C9514en[]) arrayList.toArray(new C9514en[arrayList.size()]);
        C9789pn c9789pnMo5086a = f7184n.mo5086a(c9589hn);
        if (!c9789pnMo5086a.f8908a) {
            this.f7187c.warning("UserInfo wasn't sent because " + c9789pnMo5086a.f8909b, new Object[0]);
            return;
        }
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        C9252U5 c9252u5M5931a = C9445c4.m5931a(c9589hn);
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str = c9383Zg.f7646f;
        }
        c9145Ph.m5491a(new C9168Qg(c9252u5M5931a, false, 1, null, new C9383Zg(c9213Se, counterConfiguration, str)));
        this.f7187c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        m5516d(null);
        this.f7187c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.f7187c.info("Send event buffer", new Object[0]);
        C9145Ph c9145Ph = this.f7192h;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        C9445c4 c9445c4 = new C9445c4("", "", 256, 0, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f7186b.f7617b.setDataSendingEnabled(z);
        this.f7187c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c9445c4.f7324p = Collections.singletonMap(str, bArr);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        String str2;
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        C9445c4 c9445c4 = new C9445c4(LoggerStorage.getOrCreatePublicLogger(c9383Zg.f7617b.getApiKey()));
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9445c4.f7312d = 40962;
        c9445c4.mo5656c(str);
        c9445c4.f7310b = c9445c4.m5942e(str);
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str2 = c9383Zg.f7646f;
        }
        c9145Ph.m5491a(new C9168Qg(c9445c4, false, 1, null, new C9383Zg(c9213Se, counterConfiguration, str2)));
        this.f7187c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        String str;
        C9145Ph c9145Ph = this.f7192h;
        C8785B c8785b = new C8785B(adRevenue, z, this.f7187c);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        C9445c4 c9445c4M5932a = C9445c4.m5932a(LoggerStorage.getOrCreatePublicLogger(c9383Zg.f7617b.getApiKey()), c8785b);
        C9213Se c9213Se = new C9213Se(c9383Zg.f7616a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c9383Zg.f7617b);
        synchronized (c9383Zg) {
            str = c9383Zg.f7646f;
        }
        c9145Ph.m5491a(new C9168Qg(c9445c4M5932a, false, 1, null, new C9383Zg(c9213Se, counterConfiguration, str)));
        this.f7187c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC9452cb.m5968b(adRevenue.payload) + ", autoCollected=" + z + WebvttCssParser.RULE_END, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: b */
    public final void mo4986b(@NonNull String str, @Nullable String str2) {
        this.f7187c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(str2, str, 1, 0, publicLogger);
        c9445c4.f7320l = EnumC9675l9.JS;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    /* renamed from: a */
    public final void m5513a(Map<String, String> map) {
        if (AbstractC9664kn.m6345a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f7187c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(str2, str, 1, 0, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
    }

    /* renamed from: a */
    public final C9150Pm m5512a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTrace;
        if (th == null) {
            stackTrace = null;
            th2 = null;
        } else if (th instanceof C9129P1) {
            stackTrace = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTrace = null;
        }
        return AbstractC9221Sm.m5602a(th2, new C9222T(null, null, this.f7194j.m5691b()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f7195k.f6881a.m5678a(), (Boolean) this.f7195k.f6882b.m5678a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        C9922v6 c9922v6 = new C9922v6(new C9286Vf(str2, m5512a(th)), str);
        C9145Ph c9145Ph = this.f7192h;
        byte[] byteArray = MessageNano.toByteArray(this.f7190f.fromModel(c9922v6));
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(byteArray, str2, 5896, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        this.f7187c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: b */
    public final boolean mo4987b() {
        return this.f7186b.mo5630f();
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        C9150Pm c9150PmM5984a = this.f7196l.m5984a(pluginErrorDetails);
        C9145Ph c9145Ph = this.f7192h;
        C8908Fm c8908Fm = c9150PmM5984a.f7124a;
        String str = c8908Fm != null ? (String) WrapUtils.getOrDefault(c8908Fm.f6628a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f7188d.fromModel(c9150PmM5984a));
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(byteArray, str, 5891, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        this.f7187c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        C9145Ph c9145Ph = this.f7192h;
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        c9145Ph.m5493a(new C9445c4("", str, 1, 0, publicLogger), this.f7186b, 1, map);
        PublicLogger publicLogger2 = this.f7187c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9138Pa, io.appmetrica.analytics.impl.InterfaceC9209Sa
    /* renamed from: a */
    public void mo4964a(@NonNull C9150Pm c9150Pm) {
        C9145Ph c9145Ph = this.f7192h;
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.f7118d.m6297b();
        C9168Qg c9168QgM5531a = c9145Ph.f7116b.m5531a(c9150Pm, c9383Zg);
        C9383Zg c9383Zg2 = c9168QgM5531a.f7165e;
        InterfaceC9243Tk interfaceC9243Tk = c9145Ph.f7119e;
        if (interfaceC9243Tk != null) {
            c9383Zg2.f7617b.setUuid(((C9219Sk) interfaceC9243Tk).m5599g());
        } else {
            c9383Zg2.getClass();
        }
        c9145Ph.f7117c.m5503b(c9168QgM5531a);
        this.f7187c.info("Unhandled exception received: " + c9150Pm, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        C9150Pm c9150PmM5984a;
        C9455ce c9455ce = this.f7196l;
        if (pluginErrorDetails != null) {
            c9150PmM5984a = c9455ce.m5984a(pluginErrorDetails);
        } else {
            c9455ce.getClass();
            c9150PmM5984a = null;
        }
        C9286Vf c9286Vf = new C9286Vf(str, c9150PmM5984a);
        C9145Ph c9145Ph = this.f7192h;
        byte[] byteArray = MessageNano.toByteArray(this.f7189e.fromModel(c9286Vf));
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(byteArray, str, 5896, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        this.f7187c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        if (f7183m.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        int type = moduleEvent.getType();
        String name = moduleEvent.getName();
        String value = moduleEvent.getValue();
        Map<String, Object> environment = moduleEvent.getEnvironment();
        Map<String, byte[]> extras = moduleEvent.getExtras();
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(value, name, 8192, type, publicLogger);
        c9445c4.f7311c = AbstractC9452cb.m5968b(environment);
        if (extras != null) {
            c9445c4.f7324p = extras;
        }
        this.f7192h.m5493a(c9445c4, this.f7186b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9138Pa, io.appmetrica.analytics.impl.InterfaceC9416b0
    /* renamed from: a */
    public final void mo4965a(@NonNull C9222T c9222t) {
        C9318X c9318x = new C9318X(c9222t, (String) this.f7195k.f6881a.m5678a(), (Boolean) this.f7195k.f6882b.m5678a());
        C9145Ph c9145Ph = this.f7192h;
        byte[] byteArray = MessageNano.toByteArray(this.f7191g.fromModel(c9318x));
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(byteArray, "", 5968, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        String str = null;
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        PublicLogger publicLogger2 = this.f7187c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C9938vm c9938vm = c9222t.f7269a;
        if (c9938vm != null) {
            str = "Thread[name=" + c9938vm.f9236a + ",tid={" + c9938vm.f9238c + ", priority=" + c9938vm.f9237b + ", group=" + c9938vm.f9239d + "}] at " + CollectionsKt___CollectionsKt.joinToString$default(c9938vm.f9241f, StringUtils.f9903LF, null, null, 0, null, null, 62, null);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        C9150Pm c9150PmM5984a;
        C9455ce c9455ce = this.f7196l;
        if (pluginErrorDetails != null) {
            c9150PmM5984a = c9455ce.m5984a(pluginErrorDetails);
        } else {
            c9455ce.getClass();
            c9150PmM5984a = null;
        }
        C9922v6 c9922v6 = new C9922v6(new C9286Vf(str2, c9150PmM5984a), str);
        C9145Ph c9145Ph = this.f7192h;
        byte[] byteArray = MessageNano.toByteArray(this.f7190f.fromModel(c9922v6));
        PublicLogger publicLogger = this.f7187c;
        Set set = AbstractC9875t9.f9105a;
        EnumC9329Xa enumC9329Xa = EnumC9329Xa.EVENT_TYPE_UNDEFINED;
        C9445c4 c9445c4 = new C9445c4(byteArray, str2, 5896, publicLogger);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9445c4, c9383Zg), c9383Zg, 1, null);
        this.f7187c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8796Ba
    /* renamed from: a */
    public final void mo4985a(@NonNull String str) {
        C9145Ph c9145Ph = this.f7192h;
        C9252U5 c9252u5M5639a = C9252U5.m5639a(str);
        C9383Zg c9383Zg = this.f7186b;
        c9145Ph.getClass();
        c9145Ph.m5493a(C9145Ph.m5490a(c9252u5M5639a, c9383Zg), c9383Zg, 1, null);
    }
}
