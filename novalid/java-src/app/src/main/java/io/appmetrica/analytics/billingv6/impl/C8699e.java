package io.appmetrica.analytics.billingv6.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.billingv6.impl.e */
/* loaded from: classes5.dex */
public final class C8699e implements BillingInfoManager {

    /* renamed from: a */
    public final BillingInfoStorage f6041a;

    /* renamed from: b */
    public boolean f6042b;

    /* renamed from: c */
    public final LinkedHashMap f6043c;

    public C8699e(@NotNull BillingInfoStorage billingInfoStorage) {
        this.f6041a = billingInfoStorage;
        this.f6042b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f6043c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    @Nullable
    public final BillingInfo get(@NotNull String str) {
        return (BillingInfo) this.f6043c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final boolean isFirstInappCheckOccurred() {
        return this.f6042b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void markFirstInappCheckOccurred() {
        if (this.f6042b) {
            return;
        }
        this.f6042b = true;
        this.f6041a.saveInfo(CollectionsKt___CollectionsKt.toList(this.f6043c.values()), this.f6042b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    @WorkerThread
    public final void update(@NotNull Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f6043c.put(billingInfo.productId, billingInfo);
        }
        this.f6041a.saveInfo(CollectionsKt___CollectionsKt.toList(this.f6043c.values()), this.f6042b);
    }
}
