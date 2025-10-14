package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.q4 */
/* loaded from: classes7.dex */
public final class C9795q4 {

    /* renamed from: a */
    public final Object f8920a;

    /* renamed from: b */
    public final C9721n5 f8921b;

    /* renamed from: c */
    public final HashMap f8922c;

    /* renamed from: d */
    public final C9726na f8923d;

    /* renamed from: e */
    public final Context f8924e;

    /* renamed from: f */
    public final C9970x4 f8925f;

    public C9795q4(Context context, C9721n5 c9721n5) {
        this(context, c9721n5, new C9970x4());
    }

    /* renamed from: a */
    public final InterfaceC9895u4 m6692a(C9520f4 c9520f4, C8865E4 c8865e4) {
        InterfaceC9895u4 interfaceC9895u4Mo4967a;
        synchronized (this.f8920a) {
            try {
                interfaceC9895u4Mo4967a = (InterfaceC9895u4) this.f8922c.get(c9520f4);
                if (interfaceC9895u4Mo4967a == null) {
                    this.f8925f.getClass();
                    interfaceC9895u4Mo4967a = C9970x4.m6951a(c9520f4).mo4967a(this.f8924e, this.f8921b, c9520f4, c8865e4);
                    this.f8922c.put(c9520f4, interfaceC9895u4Mo4967a);
                    this.f8923d.m6504a(new C9770p4(c9520f4.f8053b, c9520f4.f8054c, c9520f4.f8055d), c9520f4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC9895u4Mo4967a;
    }

    public C9795q4(Context context, C9721n5 c9721n5, C9970x4 c9970x4) {
        this.f8920a = new Object();
        this.f8922c = new HashMap();
        this.f8923d = new C9726na();
        this.f8924e = context.getApplicationContext();
        this.f8921b = c9721n5;
        this.f8925f = c9970x4;
    }

    /* renamed from: a */
    public final void m6693a(int i, String str, String str2) {
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.f8920a) {
            try {
                C9726na c9726na = this.f8923d;
                Collection collection = (Collection) c9726na.f8720a.remove(new C9770p4(str, numValueOf, str2));
                if (!AbstractC9664kn.m6344a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC9895u4) this.f8922c.remove((C9520f4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC9895u4) it2.next()).mo5289a();
                    }
                }
            } finally {
            }
        }
    }
}
