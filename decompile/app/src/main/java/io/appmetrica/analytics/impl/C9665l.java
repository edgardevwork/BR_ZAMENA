package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.l */
/* loaded from: classes6.dex */
public final class C9665l implements InterfaceC9715n {

    /* renamed from: a */
    public final HashSet f8533a = new HashSet();

    public C9665l(@NonNull C9765p c9765p) {
        c9765p.m6616a(this, new EnumC9690m[0]);
    }

    /* renamed from: a */
    public final synchronized void m6347a(@NonNull InterfaceC9640k interfaceC9640k) {
        this.f8533a.add(interfaceC9640k);
    }

    /* renamed from: a */
    public final void m6346a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f8533a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C9884ti) ((InterfaceC9640k) it.next())).m6828a(activity);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9715n
    @MainThread
    /* renamed from: a */
    public final void mo5297a(@NonNull Activity activity, @NonNull EnumC9690m enumC9690m) {
        C9820r4.m6725i().f8968c.m6201a().execute(new RunnableC9615j(this, activity));
    }
}
