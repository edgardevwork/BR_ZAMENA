package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.appmetrica.analytics.impl.Cm */
/* loaded from: classes6.dex */
public final class C8833Cm {

    /* renamed from: a */
    public final InterfaceC8808Bm f6436a;

    /* renamed from: b */
    public final BiFunction f6437b;

    /* renamed from: c */
    public final C9282Vb f6438c;

    public C8833Cm() {
        this(new C10038zm(), new C9626ja(), C9820r4.m6725i().m6738l());
    }

    /* renamed from: a */
    public final ArrayList m5040a(Thread thread, Thread thread2) {
        Map mapMo5011c;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C8783Am());
        try {
            mapMo5011c = this.f6436a.mo5011c();
        } catch (SecurityException unused) {
            mapMo5011c = null;
        }
        if (mapMo5011c != null) {
            treeMap.putAll(mapMo5011c);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C9938vm) this.f6437b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public C8833Cm(InterfaceC8808Bm interfaceC8808Bm, C9626ja c9626ja, C9282Vb c9282Vb) {
        this.f6436a = interfaceC8808Bm;
        this.f6437b = c9626ja;
        this.f6438c = c9282Vb;
    }
}
