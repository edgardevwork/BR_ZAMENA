package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Jj */
/* loaded from: classes8.dex */
public final class C9003Jj {

    /* renamed from: a */
    public final C9571h5 f6830a;

    /* renamed from: b */
    public final C9411ak f6831b;

    /* renamed from: c */
    public final C9075Mj f6832c;

    /* renamed from: d */
    public long f6833d;

    /* renamed from: e */
    public long f6834e;

    /* renamed from: f */
    public AtomicLong f6835f;

    /* renamed from: g */
    public boolean f6836g;

    /* renamed from: h */
    public volatile C9362Yj f6837h;

    /* renamed from: i */
    public long f6838i;

    /* renamed from: j */
    public long f6839j;

    /* renamed from: k */
    public final SystemTimeProvider f6840k;

    public C9003Jj(C9571h5 c9571h5, C9411ak c9411ak, C9075Mj c9075Mj, SystemTimeProvider systemTimeProvider) {
        this.f6830a = c9571h5;
        this.f6831b = c9411ak;
        this.f6832c = c9075Mj;
        this.f6840k = systemTimeProvider;
        m5312a();
    }

    /* renamed from: a */
    public final void m5312a() {
        C9075Mj c9075Mj = this.f6832c;
        long jElapsedRealtime = this.f6840k.elapsedRealtime();
        Long l = c9075Mj.f6996c;
        if (l != null) {
            jElapsedRealtime = l.longValue();
        }
        this.f6834e = jElapsedRealtime;
        Long l2 = this.f6832c.f6995b;
        this.f6833d = l2 == null ? -1L : l2.longValue();
        Long l3 = this.f6832c.f6998e;
        this.f6835f = new AtomicLong(l3 == null ? 0L : l3.longValue());
        Boolean bool = this.f6832c.f6999f;
        this.f6836g = bool == null ? true : bool.booleanValue();
        Long l4 = this.f6832c.f7000g;
        long jLongValue = l4 != null ? l4.longValue() : 0L;
        this.f6838i = jLongValue;
        C9075Mj c9075Mj2 = this.f6832c;
        long jLongValue2 = jLongValue - this.f6834e;
        Long l5 = c9075Mj2.f7001h;
        if (l5 != null) {
            jLongValue2 = l5.longValue();
        }
        this.f6839j = jLongValue2;
    }

    public final String toString() {
        return "Session{id=" + this.f6833d + ", creationTime=" + this.f6834e + ", currentReportId=" + this.f6835f + ", sessionRequestParams=" + this.f6837h + ", sleepStart=" + this.f6838i + '}';
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5313a(long j) {
        boolean z;
        boolean z2;
        boolean z3 = this.f6833d >= 0;
        if (this.f6837h == null) {
            synchronized (this) {
                if (this.f6837h == null) {
                    try {
                        String asString = this.f6830a.f8233f.m5392a(this.f6833d, this.f6832c.f6994a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            this.f6837h = new C9362Yj(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        C9362Yj c9362Yj = this.f6837h;
        if (c9362Yj == null) {
            z = false;
            break;
        }
        C8902Fg c8902Fg = (C8902Fg) this.f6830a.f8239l.m6880a();
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.valueOf(TextUtils.equals(c8902Fg.getAnalyticsSdkVersionName(), c9362Yj.f7600a)), Boolean.valueOf(TextUtils.equals(c8902Fg.getAnalyticsSdkBuildNumber(), c9362Yj.f7601b)), Boolean.valueOf(TextUtils.equals(c8902Fg.getAppVersion(), c9362Yj.f7602c)), Boolean.valueOf(TextUtils.equals(c8902Fg.getAppBuildNumber(), c9362Yj.f7603d)), Boolean.valueOf(TextUtils.equals(c8902Fg.getOsVersion(), c9362Yj.f7604e)), Boolean.valueOf(c9362Yj.f7605f == c8902Fg.getOsApiLevel()), Boolean.valueOf(c9362Yj.f7606g == c8902Fg.f6614s)});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        long jElapsedRealtime = this.f6840k.elapsedRealtime();
        long j2 = this.f6838i;
        boolean z4 = jElapsedRealtime < j2;
        long j3 = j - j2;
        long j4 = j - this.f6834e;
        if (!z4) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C9075Mj c9075Mj = this.f6832c;
            int iIntValue = ((C8902Fg) this.f6830a.f8239l.m6880a()).f6602g;
            Integer num = c9075Mj.f6997d;
            if (num != null) {
                iIntValue = num.intValue();
            }
            z2 = j3 >= timeUnit.toMillis((long) iIntValue) || j4 >= timeUnit.toMillis(AbstractC9099Nj.f7037a);
        }
        return z3 && z && (z2 ^ true);
    }
}
