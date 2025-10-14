package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.gb */
/* loaded from: classes5.dex */
public final class C9552gb {

    /* renamed from: a */
    public final C9568h2 f8190a = new C9568h2();

    /* renamed from: b */
    public final C9747o6 f8191b = new C9747o6();

    /* renamed from: c */
    public C10013ym f8192c;

    /* renamed from: d */
    public boolean f8193d;

    /* renamed from: e */
    public boolean f8194e;

    /* renamed from: a */
    public final synchronized void m6179a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC9185Ra interfaceC9185Ra) {
        if (this.f8194e) {
            return;
        }
        CollectionsKt__MutableCollectionsKt.addAll(this.f8191b.f8804a, new InterfaceC8846Da[]{this.f8190a.m6199a(context, appMetricaConfig, interfaceC9185Ra)});
        this.f8194e = true;
    }

    /* renamed from: b */
    public final synchronized void m6180b() {
        if (this.f8193d) {
            return;
        }
        C9747o6 c9747o6 = this.f8191b;
        ArrayList arrayList = C9820r4.m6725i().f8974i.f8689a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c9747o6.f8804a.addAll(arrayList2);
        this.f8193d = true;
    }

    /* renamed from: c */
    public final synchronized void m6181c() {
        try {
            if (this.f8192c != null) {
                return;
            }
            C9153Q1 c9153q1 = new C9153Q1(this.f8191b);
            this.f8192c = new C10013ym(c9153q1);
            C9988xm c9988xm = new C9988xm();
            c9988xm.f9330a.add(c9153q1);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c9988xm.f9330a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c9988xm);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void m6178a() {
        this.f8191b.f8804a.clear();
        this.f8193d = false;
        this.f8194e = false;
    }
}
