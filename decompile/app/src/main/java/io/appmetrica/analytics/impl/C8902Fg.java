package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Fg */
/* loaded from: classes8.dex */
public final class C8902Fg extends C9204S5 {

    /* renamed from: d */
    public boolean f6599d;

    /* renamed from: e */
    public Location f6600e;

    /* renamed from: f */
    public boolean f6601f;

    /* renamed from: g */
    public int f6602g;

    /* renamed from: h */
    public int f6603h;

    /* renamed from: i */
    public boolean f6604i;

    /* renamed from: j */
    public int f6605j;

    /* renamed from: k */
    public Boolean f6606k;

    /* renamed from: l */
    public InterfaceC8827Cg f6607l;

    /* renamed from: m */
    public final InterfaceC8877Eg f6608m;

    /* renamed from: n */
    public String f6609n;

    /* renamed from: o */
    public boolean f6610o;

    /* renamed from: p */
    public boolean f6611p;

    /* renamed from: q */
    public String f6612q;

    /* renamed from: r */
    public List f6613r;

    /* renamed from: s */
    public int f6614s;

    /* renamed from: t */
    public long f6615t;

    /* renamed from: u */
    public long f6616u;

    /* renamed from: v */
    public boolean f6617v;

    /* renamed from: w */
    public long f6618w;

    /* renamed from: x */
    public List f6619x;

    public C8902Fg(C9571h5 c9571h5) {
        this.f6608m = c9571h5;
    }

    /* renamed from: a */
    public final void m5150a(Location location) {
        this.f6600e = location;
    }

    /* renamed from: b */
    public final void m5156b(List<String> list) {
        this.f6613r = list;
    }

    /* renamed from: c */
    public final String m5158c() {
        return this.f6609n;
    }

    /* renamed from: d */
    public final void m5164d(boolean z) {
        this.f6599d = z;
    }

    /* renamed from: e */
    public final void m5166e(boolean z) {
        this.f6604i = z;
    }

    /* renamed from: f */
    public final void m5167f(boolean z) {
        this.f6610o = z;
    }

    @NonNull
    /* renamed from: g */
    public final String m5169g() {
        return (String) WrapUtils.getOrDefault(this.f6612q, "");
    }

    /* renamed from: h */
    public final boolean m5170h() {
        return this.f6607l.mo5003a(this.f6606k);
    }

    /* renamed from: i */
    public final int m5171i() {
        return this.f6603h;
    }

    /* renamed from: j */
    public final Location m5172j() {
        return this.f6600e;
    }

    /* renamed from: k */
    public final long m5173k() {
        return this.f6618w;
    }

    /* renamed from: l */
    public final int m5174l() {
        return this.f6605j;
    }

    /* renamed from: m */
    public final long m5175m() {
        return this.f6615t;
    }

    /* renamed from: n */
    public final long m5176n() {
        return this.f6616u;
    }

    /* renamed from: o */
    public final List<String> m5177o() {
        return this.f6613r;
    }

    /* renamed from: p */
    public final int m5178p() {
        return this.f6602g;
    }

    /* renamed from: q */
    public final boolean m5179q() {
        return this.f6611p;
    }

    /* renamed from: r */
    public final boolean m5180r() {
        return this.f6601f;
    }

    /* renamed from: s */
    public final boolean m5181s() {
        return this.f6599d;
    }

    /* renamed from: t */
    public final boolean m5182t() {
        return this.f6610o;
    }

    @Override // io.appmetrica.analytics.impl.C9204S5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f6599d + ", mManualLocation=" + this.f6600e + ", mFirstActivationAsUpdate=" + this.f6601f + ", mSessionTimeout=" + this.f6602g + ", mDispatchPeriod=" + this.f6603h + ", mLogEnabled=" + this.f6604i + ", mMaxReportsCount=" + this.f6605j + ", dataSendingEnabledFromArguments=" + this.f6606k + ", dataSendingStrategy=" + this.f6607l + ", mPreloadInfoSendingStrategy=" + this.f6608m + ", mApiKey='" + this.f6609n + "', mPermissionsCollectingEnabled=" + this.f6610o + ", mFeaturesCollectingEnabled=" + this.f6611p + ", mClidsFromStartupResponse='" + this.f6612q + "', mReportHosts=" + this.f6613r + ", mAttributionId=" + this.f6614s + ", mPermissionsCollectingIntervalSeconds=" + this.f6615t + ", mPermissionsForceSendIntervalSeconds=" + this.f6616u + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f6617v + ", mMaxReportsInDbCount=" + this.f6618w + ", mCertificates=" + this.f6619x + "} " + super.toString();
    }

    /* renamed from: u */
    public final boolean m5183u() {
        return isIdentifiersValid() && !AbstractC9664kn.m6344a((Collection) this.f6613r) && this.f6617v;
    }

    /* renamed from: v */
    public final boolean m5184v() {
        return ((C9571h5) this.f6608m).m6204B();
    }

    /* renamed from: a */
    public final void m5148a(int i) {
        this.f6614s = i;
    }

    /* renamed from: b */
    public final void m5155b(long j) {
        this.f6615t = j;
    }

    /* renamed from: c */
    public final void m5160c(long j) {
        this.f6616u = j;
    }

    /* renamed from: d */
    public final void m5163d(int i) {
        this.f6602g = i;
    }

    @Nullable
    /* renamed from: e */
    public final List<String> m5165e() {
        return this.f6619x;
    }

    /* renamed from: f */
    public final boolean m5168f() {
        return this.f6617v;
    }

    /* renamed from: a */
    public final void m5149a(long j) {
        this.f6618w = j;
    }

    /* renamed from: b */
    public final void m5157b(boolean z) {
        this.f6611p = z;
    }

    /* renamed from: c */
    public final void m5161c(boolean z) {
        this.f6601f = z;
    }

    /* renamed from: d */
    public final int m5162d() {
        return this.f6614s;
    }

    /* renamed from: a */
    public final void m5152a(@NonNull List<String> list) {
        this.f6619x = list;
    }

    /* renamed from: b */
    public final void m5154b(int i) {
        this.f6603h = i;
    }

    /* renamed from: c */
    public final void m5159c(int i) {
        this.f6605j = i;
    }

    /* renamed from: a */
    public final void m5151a(@Nullable Boolean bool, @NonNull InterfaceC8827Cg interfaceC8827Cg) {
        this.f6606k = bool;
        this.f6607l = interfaceC8827Cg;
    }

    /* renamed from: a */
    public final void m5153a(boolean z) {
        this.f6617v = z;
    }
}
