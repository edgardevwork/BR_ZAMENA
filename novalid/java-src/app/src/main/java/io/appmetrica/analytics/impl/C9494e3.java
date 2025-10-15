package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.e3 */
/* loaded from: classes8.dex */
public final class C9494e3 implements BillingInfoSender {

    /* renamed from: a */
    public final InterfaceC9090Na f7984a;

    /* renamed from: b */
    public final ICommonExecutor f7985b;

    public C9494e3(@NonNull InterfaceC9090Na interfaceC9090Na) {
        this(interfaceC9090Na, C9676la.m6362h().m6384u().m6970e());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@NonNull List<ProductInfo> list) {
        Iterator<ProductInfo> it = list.iterator();
        while (it.hasNext()) {
            this.f7985b.execute(new C9469d3(this, it.next()));
        }
    }

    public C9494e3(@NonNull InterfaceC9090Na interfaceC9090Na, @NonNull ICommonExecutor iCommonExecutor) {
        this.f7984a = interfaceC9090Na;
        this.f7985b = iCommonExecutor;
    }
}
