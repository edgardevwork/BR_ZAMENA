package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.math.MathKt__MathJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Of */
/* loaded from: classes5.dex */
public final class C9119Of {

    /* renamed from: a */
    public final Context f7059a;

    /* renamed from: b */
    public final SafePackageManager f7060b;

    /* renamed from: c */
    public final InterfaceC9138Pa f7061c;

    /* renamed from: d */
    public final C9778pc f7062d;

    /* renamed from: e */
    public final long f7063e;

    /* renamed from: f */
    public final String f7064f;

    /* renamed from: g */
    public final String f7065g;

    public C9119Of(Context context, SafePackageManager safePackageManager, InterfaceC9138Pa interfaceC9138Pa) {
        this.f7059a = context;
        this.f7060b = safePackageManager;
        this.f7061c = interfaceC9138Pa;
        C9778pc c9778pc = new C9778pc(0);
        c9778pc.m6636a(EnumC8876Ef.f6550d, 1);
        c9778pc.m6636a(EnumC8876Ef.f6549c, 2);
        this.f7062d = c9778pc;
        this.f7063e = TimeUnit.DAYS.toSeconds(1L);
        this.f7064f = "com.android.vending";
        this.f7065g = "com.huawei.appmarket";
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0098  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8901Ff m5460a(List list) {
        C8901Ff c8901Ff;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (C8901Ff) list.get(0);
        }
        SafePackageManager safePackageManager = this.f7060b;
        Context context = this.f7059a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C8901Ff c8901Ff2 = (C8901Ff) it.next();
            Pair pairM7112to = TuplesKt.m7112to(c8901Ff2, Long.valueOf(Math.abs(c8901Ff2.f6597c - seconds)));
            while (it.hasNext()) {
                C8901Ff c8901Ff3 = (C8901Ff) it.next();
                Pair pairM7112to2 = TuplesKt.m7112to(c8901Ff3, Long.valueOf(Math.abs(c8901Ff3.f6597c - seconds)));
                if (ComparisonsKt__ComparisonsKt.compareValues((Comparable) pairM7112to.getSecond(), (Comparable) pairM7112to2.getSecond()) > 0) {
                    pairM7112to = pairM7112to2;
                }
            }
            c8901Ff = (C8901Ff) pairM7112to.component1();
            if (((Number) pairM7112to.component2()).longValue() >= this.f7063e) {
                c8901Ff = null;
            }
        }
        if (c8901Ff == null) {
            Comparator comparator = new Comparator() { // from class: io.appmetrica.analytics.impl.Of$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C9119Of.m5459a(this.f$0, (C8901Ff) obj, (C8901Ff) obj2);
                }
            };
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            C8901Ff c8901Ff4 = (C8901Ff) it2.next();
            while (it2.hasNext()) {
                C8901Ff c8901Ff5 = (C8901Ff) it2.next();
                if (comparator.compare(c8901Ff4, c8901Ff5) < 0) {
                    c8901Ff4 = c8901Ff5;
                }
            }
            c8901Ff = c8901Ff4;
        }
        InterfaceC9138Pa interfaceC9138Pa = this.f7061c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C8901Ff c8901Ff6 = (C8901Ff) it3.next();
            arrayList.add(new JSONObject().put("referrer", c8901Ff6.f6595a).put("install_timestamp_seconds", c8901Ff6.f6597c).put("click_timestamp_seconds", c8901Ff6.f6596b).put("source", c8901Ff6.f6598d.f6552a));
        }
        interfaceC9138Pa.reportEvent("several_filled_referrers", jSONObject.put("candidates", AbstractC9664kn.m6344a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", c8901Ff.f6595a).put("install_timestamp_seconds", c8901Ff.f6597c).put("click_timestamp_seconds", c8901Ff.f6596b).put("source", c8901Ff.f6598d.f6552a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c8901Ff;
    }

    public /* synthetic */ C9119Of(Context context) {
        this(context, new SafePackageManager(), AbstractC9742o1.m6565a());
    }

    /* renamed from: a */
    public static final int m5459a(C9119Of c9119Of, C8901Ff c8901Ff, C8901Ff c8901Ff2) {
        int sign = MathKt__MathJVMKt.getSign(c8901Ff.f6597c - c8901Ff2.f6597c);
        return sign == 0 ? ((Number) c9119Of.f7062d.m6635a(c8901Ff.f6598d)).intValue() - ((Number) c9119Of.f7062d.m6635a(c8901Ff2.f6598d)).intValue() : sign;
    }
}
