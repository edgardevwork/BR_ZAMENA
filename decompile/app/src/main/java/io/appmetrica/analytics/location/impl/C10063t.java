package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.location.impl.t */
/* loaded from: classes8.dex */
public final class C10063t {

    /* renamed from: a */
    public LocationFilter f9467a;

    /* renamed from: d */
    public Location f9470d;

    /* renamed from: e */
    public long f9471e;

    /* renamed from: c */
    public final CopyOnWriteArrayList f9469c = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final TimePassedChecker f9468b = new TimePassedChecker();

    public C10063t(LocationFilter locationFilter) {
        this.f9467a = locationFilter;
    }
}
