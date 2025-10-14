package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.xc */
/* loaded from: classes5.dex */
public final class C9978xc implements InterfaceC9813qm {

    /* renamed from: a */
    public final Context f9307a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f9308b;

    /* renamed from: c */
    public final CellularNetworkTypeExtractor f9309c;

    /* renamed from: d */
    public final CachedDataProvider.CachedData f9310d;

    public C9978xc(@NotNull Context context) {
        this.f9307a = context;
        this.f9308b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C9676la.m6362h().m6371g(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f9309c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f9310d = new CachedDataProvider.CachedData(millis, millis * 2, "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9813qm
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C9953wc mo6719a() {
        C9953wc c9953wc;
        try {
            c9953wc = (C9953wc) this.f9310d.getData();
            if (c9953wc == null || this.f9310d.shouldUpdateData()) {
                c9953wc = new C9953wc(this.f9308b.hasNecessaryPermissions(this.f9307a) ? this.f9309c.getNetworkType() : "unknown");
                this.f9310d.setData(c9953wc);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c9953wc;
    }
}
