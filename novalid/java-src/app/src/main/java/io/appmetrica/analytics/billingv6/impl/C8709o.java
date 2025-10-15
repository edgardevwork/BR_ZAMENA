package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* renamed from: io.appmetrica.analytics.billingv6.impl.o */
/* loaded from: classes5.dex */
public final class C8709o extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ C8710p f6069a;

    /* renamed from: b */
    public final /* synthetic */ List f6070b;

    /* renamed from: c */
    public final /* synthetic */ C8705k f6071c;

    public C8709o(C8710p c8710p, List list, C8705k c8705k) {
        this.f6069a = c8710p;
        this.f6070b = list;
        this.f6071c = c8705k;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        if (!this.f6069a.f6073b.isReady()) {
            this.f6069a.f6074c.getWorkerExecutor().execute(new C8708n(this.f6069a, this.f6071c));
            return;
        }
        BillingClient billingClient = this.f6069a.f6073b;
        QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
        List list = this.f6070b;
        C8710p c8710p = this.f6069a;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(c8710p.f6075d).build());
        }
        billingClient.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), this.f6071c);
    }
}
