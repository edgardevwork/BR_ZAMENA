package io.appmetrica.analytics.billinginterface.internal.update;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import java.util.Map;

/* loaded from: classes8.dex */
public interface UpdatePolicy {
    @NonNull
    Map<String, BillingInfo> getBillingInfoToUpdate(@NonNull BillingConfig billingConfig, @NonNull Map<String, BillingInfo> map, @NonNull BillingInfoManager billingInfoManager);
}
