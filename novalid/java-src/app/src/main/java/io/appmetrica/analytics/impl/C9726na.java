package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.na */
/* loaded from: classes7.dex */
public final class C9726na {

    /* renamed from: a */
    public final HashMap f8720a;

    /* renamed from: b */
    public final boolean f8721b;

    public C9726na() {
        this(false);
    }

    /* renamed from: a */
    public final void m6504a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f8720a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f8720a.toString();
    }

    public C9726na(boolean z) {
        this.f8720a = new HashMap();
        this.f8721b = z;
    }
}
