package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.a */
/* loaded from: classes5.dex */
public final class C8672a implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    public final ArrayList f6010a;

    public C8672a(@NonNull C8673b c8673b, @NonNull ClientContext clientContext) {
        ArrayList arrayList = new ArrayList();
        this.f6010a = arrayList;
        arrayList.add(new C8675d(c8673b, clientContext));
        arrayList.add(new C8677f(c8673b, clientContext));
        arrayList.add(new C8678g(c8673b, clientContext));
        arrayList.add(new C8679h(c8673b, clientContext));
        arrayList.add(new C8680i(c8673b, clientContext));
        arrayList.add(new C8674c(c8673b, clientContext));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Iterator it = this.f6010a.iterator();
        while (it.hasNext()) {
            if (((ModuleAdRevenueProcessor) it.next()).process(objArr)) {
                return true;
            }
        }
        return false;
    }
}
