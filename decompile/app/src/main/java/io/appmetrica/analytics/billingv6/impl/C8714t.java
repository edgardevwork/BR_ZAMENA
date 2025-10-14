package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.billingv6.impl.t */
/* loaded from: classes8.dex */
public final class C8714t {
    /* renamed from: a */
    public static void m4893a(Map map, Map map2, String str, BillingInfoManager billingInfoManager) {
        long jCurrentTimeMillis = new SystemTimeProvider().currentTimeMillis();
        for (BillingInfo billingInfo : map.values()) {
            if (map2.containsKey(billingInfo.productId)) {
                billingInfo.sendTime = jCurrentTimeMillis;
            } else {
                BillingInfo billingInfo2 = billingInfoManager.get(billingInfo.productId);
                if (billingInfo2 != null) {
                    billingInfo.sendTime = billingInfo2.sendTime;
                }
            }
        }
        billingInfoManager.update(map);
        if (billingInfoManager.isFirstInappCheckOccurred() || !Intrinsics.areEqual("inapp", str)) {
            return;
        }
        billingInfoManager.markFirstInappCheckOccurred();
    }
}
