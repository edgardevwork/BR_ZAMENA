package io.appmetrica.analytics.billingv6.internal;

import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.C8698d;
import io.appmetrica.analytics.billingv6.impl.C8701g;
import io.appmetrica.analytics.billingv6.impl.C8713s;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m7105d2 = {"io/appmetrica/analytics/billingv6/internal/BillingLibraryMonitor$updateBilling$1", "Lio/appmetrica/analytics/coreutils/internal/executors/SafeRunnable;", "", "runSafety", "billing-v6_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class BillingLibraryMonitor$updateBilling$1 extends SafeRunnable {

    /* renamed from: a */
    final /* synthetic */ BillingLibraryMonitor f6093a;

    /* renamed from: b */
    final /* synthetic */ BillingConfig f6094b;

    public BillingLibraryMonitor$updateBilling$1(BillingLibraryMonitor billingLibraryMonitor, BillingConfig billingConfig) {
        this.f6093a = billingLibraryMonitor;
        this.f6094b = billingConfig;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1] */
    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public void runSafety() {
        BillingClient billingClientBuild = BillingClient.newBuilder(this.f6093a.f6086a).setListener(new C8713s()).enablePendingPurchases().build();
        BillingConfig billingConfig = this.f6094b;
        final BillingLibraryMonitor billingLibraryMonitor = this.f6093a;
        ?? r3 = new UtilsProvider() { // from class: io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1$runSafety$1
            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            @NotNull
            public BillingInfoManager getBillingInfoManager() {
                return billingLibraryMonitor.f6090e;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            @NotNull
            public BillingInfoSender getBillingInfoSender() {
                return billingLibraryMonitor.f6089d;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            @NotNull
            public Executor getUiExecutor() {
                return billingLibraryMonitor.f6088c;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            @NotNull
            public UpdatePolicy getUpdatePolicy() {
                return billingLibraryMonitor.f6091f;
            }

            @Override // io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider
            @NotNull
            public Executor getWorkerExecutor() {
                return billingLibraryMonitor.f6087b;
            }
        };
        billingClientBuild.startConnection(new C8698d(billingConfig, billingClientBuild, r3, new C8701g(billingClientBuild, r3)));
    }
}
