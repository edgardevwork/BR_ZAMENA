package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.q2 */
/* loaded from: classes7.dex */
public final class C9793q2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9862sl fromModel(@NonNull BillingConfig billingConfig) {
        C9862sl c9862sl = new C9862sl();
        c9862sl.f9054a = billingConfig.sendFrequencySeconds;
        c9862sl.f9055b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c9862sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C9862sl c9862sl = (C9862sl) obj;
        return new BillingConfig(c9862sl.f9054a, c9862sl.f9055b);
    }

    @NonNull
    /* renamed from: a */
    public final BillingConfig m6689a(@NonNull C9862sl c9862sl) {
        return new BillingConfig(c9862sl.f9054a, c9862sl.f9055b);
    }
}
