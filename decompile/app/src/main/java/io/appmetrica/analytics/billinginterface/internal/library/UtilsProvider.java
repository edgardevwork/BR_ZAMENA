package io.appmetrica.analytics.billinginterface.internal.library;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public interface UtilsProvider {
    @NonNull
    BillingInfoManager getBillingInfoManager();

    @NonNull
    BillingInfoSender getBillingInfoSender();

    @NonNull
    Executor getUiExecutor();

    @NonNull
    UpdatePolicy getUpdatePolicy();

    @NonNull
    Executor getWorkerExecutor();
}
