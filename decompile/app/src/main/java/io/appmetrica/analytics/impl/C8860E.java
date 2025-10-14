package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;

/* renamed from: io.appmetrica.analytics.impl.E */
/* loaded from: classes7.dex */
public final class C8860E implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f6505a;

    /* renamed from: b */
    public final /* synthetic */ C8910G f6506b;

    public C8860E(C8910G c8910g, Context context) {
        this.f6506b = c8910g;
        this.f6505a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a */
    public final AdTrackingInfoResult get() {
        return this.f6506b.f6635a.mo5041a(this.f6505a);
    }
}
