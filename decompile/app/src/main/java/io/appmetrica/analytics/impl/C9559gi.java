package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.gi */
/* loaded from: classes5.dex */
public final class C9559gi {

    /* renamed from: a */
    public final Revenue f8202a;

    /* renamed from: b */
    public final C9364Yl f8203b;

    /* renamed from: c */
    public final C9563gm f8204c;

    /* renamed from: d */
    public final C9563gm f8205d;

    /* renamed from: e */
    public final PublicLogger f8206e;

    public C9559gi(Revenue revenue, PublicLogger publicLogger) {
        this.f8206e = publicLogger;
        this.f8202a = revenue;
        this.f8203b = new C9364Yl(30720, "revenue payload", publicLogger);
        this.f8204c = new C9563gm(new C9364Yl(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f8205d = new C9563gm(new C9413am(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
