package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1;
import java.util.LinkedHashSet;

/* renamed from: io.appmetrica.analytics.billingv6.impl.g */
/* loaded from: classes8.dex */
public final class C8701g {

    /* renamed from: a */
    public final BillingClient f6045a;

    /* renamed from: b */
    public final UtilsProvider f6046b;

    /* renamed from: c */
    public final LinkedHashSet f6047c = new LinkedHashSet();

    public C8701g(BillingClient billingClient, BillingLibraryMonitor$updateBilling$1$runSafety$1 billingLibraryMonitor$updateBilling$1$runSafety$1) {
        this.f6045a = billingClient;
        this.f6046b = billingLibraryMonitor$updateBilling$1$runSafety$1;
    }

    /* renamed from: a */
    public final void m4892a(Object obj) {
        this.f6047c.remove(obj);
        if (this.f6047c.size() == 0) {
            this.f6046b.getUiExecutor().execute(new C8700f(this));
        }
    }
}
