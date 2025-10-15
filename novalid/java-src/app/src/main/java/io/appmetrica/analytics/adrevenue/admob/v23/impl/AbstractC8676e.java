package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8676e implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    @NonNull
    protected final C8673b f6011a;

    /* renamed from: b */
    public final ClientContext f6012b;

    public AbstractC8676e(@NonNull C8673b c8673b, @NonNull ClientContext clientContext) {
        this.f6011a = c8673b;
        this.f6012b = clientContext;
    }

    /* renamed from: a */
    public final void m4891a(@NonNull ModuleAdRevenue moduleAdRevenue) {
        this.f6012b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }
}
