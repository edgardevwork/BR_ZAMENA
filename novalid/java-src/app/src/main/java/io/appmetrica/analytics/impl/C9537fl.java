package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: io.appmetrica.analytics.impl.fl */
/* loaded from: classes7.dex */
public final class C9537fl extends C9204S5 {

    /* renamed from: d */
    public List f8136d;

    /* renamed from: e */
    public List f8137e;

    /* renamed from: f */
    public String f8138f;

    /* renamed from: g */
    public String f8139g;

    /* renamed from: h */
    public Map f8140h;

    /* renamed from: i */
    public C8987J3 f8141i;

    /* renamed from: j */
    public List f8142j;

    /* renamed from: k */
    public boolean f8143k;

    /* renamed from: l */
    public boolean f8144l;

    /* renamed from: m */
    public String f8145m;

    /* renamed from: n */
    public long f8146n;

    /* renamed from: o */
    public final C8851Df f8147o;

    /* renamed from: p */
    public final C8918G7 f8148p;

    public C9537fl() {
        this(C9676la.m6362h().m6381r(), new C8918G7());
    }

    /* renamed from: a */
    public final long m6130a(long j) {
        if (this.f8146n == 0) {
            this.f8146n = j;
        }
        return this.f8146n;
    }

    @NonNull
    /* renamed from: c */
    public final C8987J3 m6134c() {
        return this.f8141i;
    }

    @Nullable
    /* renamed from: d */
    public final Map<String, String> m6135d() {
        return this.f8140h;
    }

    /* renamed from: e */
    public final String m6136e() {
        return this.f8145m;
    }

    @Nullable
    /* renamed from: f */
    public final String m6137f() {
        return this.f8138f;
    }

    /* renamed from: g */
    public final long m6138g() {
        return this.f8146n;
    }

    @Nullable
    /* renamed from: h */
    public final String m6139h() {
        return this.f8139g;
    }

    @Nullable
    /* renamed from: i */
    public final List<String> m6140i() {
        return this.f8142j;
    }

    @NonNull
    /* renamed from: j */
    public final C8851Df m6141j() {
        return this.f8147o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> m6142k() {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!AbstractC9664kn.m6344a((Collection) this.f8136d)) {
            linkedHashSet.addAll(this.f8136d);
        }
        if (!AbstractC9664kn.m6344a((Collection) this.f8137e)) {
            linkedHashSet.addAll(this.f8137e);
        }
        String[] strArr = (String[]) this.f8148p.f6657a.m5678a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || !(!StringsKt__StringsJVMKt.isBlank(str))) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList == null) {
                String[] strArr2 = BuildConfig.DEFAULT_HOSTS;
                arrayList = new ArrayList();
                for (String str2 : strArr2) {
                    if (str2 == null || !(!StringsKt__StringsJVMKt.isBlank(str2))) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: l */
    public final List<String> m6143l() {
        return this.f8137e;
    }

    /* renamed from: m */
    public final List<String> m6144m() {
        return this.f8136d;
    }

    @Nullable
    /* renamed from: n */
    public final boolean m6145n() {
        return this.f8143k;
    }

    /* renamed from: o */
    public final boolean m6146o() {
        return this.f8144l;
    }

    @Override // io.appmetrica.analytics.impl.C9204S5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f8136d + ", mStartupHostsFromClient=" + this.f8137e + ", mDistributionReferrer='" + this.f8138f + "', mInstallReferrerSource='" + this.f8139g + "', mClidsFromClient=" + this.f8140h + ", mNewCustomHosts=" + this.f8142j + ", mHasNewCustomHosts=" + this.f8143k + ", mSuccessfulStartup=" + this.f8144l + ", mCountryInit='" + this.f8145m + "', mFirstStartupTime=" + this.f8146n + "} " + super.toString();
    }

    public C9537fl(C8851Df c8851Df, C8918G7 c8918g7) {
        this.f8141i = new C8987J3(null, EnumC9159Q7.f7146c);
        this.f8146n = 0L;
        this.f8147o = c8851Df;
        this.f8148p = c8918g7;
    }

    /* renamed from: a */
    public final void m6132a(@Nullable List<String> list) {
        this.f8142j = list;
    }

    /* renamed from: a */
    public final void m6133a(boolean z) {
        this.f8143k = z;
    }

    /* renamed from: a */
    public final void m6131a(String str) {
        this.f8145m = str;
    }
}
