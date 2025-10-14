package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pc */
/* loaded from: classes7.dex */
public class C9778pc {

    /* renamed from: a */
    public final Map f8894a;

    /* renamed from: b */
    public final Object f8895b;

    public C9778pc(Object obj) {
        this(new HashMap(), obj);
    }

    /* renamed from: a */
    public final void m6636a(Object obj, Object obj2) {
        this.f8894a.put(obj, obj2);
    }

    public C9778pc(HashMap map, Object obj) {
        this.f8894a = map;
        this.f8895b = obj;
    }

    /* renamed from: a */
    public final Object m6635a(Object obj) {
        Object obj2 = this.f8894a.get(obj);
        return obj2 == null ? this.f8895b : obj2;
    }
}
