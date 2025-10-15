package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.location.impl.n */
/* loaded from: classes8.dex */
public final class C10057n implements LocationListener {

    /* renamed from: a */
    public final C10059p f9456a;

    public C10057n(C10059p c10059p) {
        this.f9456a = c10059p;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            C10059p c10059p = this.f9456a;
            c10059p.getClass();
            String provider = location.getProvider();
            C10063t c10063t = (C10063t) c10059p.f9462e.get(provider);
            if (c10063t == null) {
                C10063t c10063t2 = new C10063t(c10059p.f9458a.f9436a);
                c10063t2.f9469c.add(c10059p.f9460c);
                Iterator it = c10059p.f9461d.iterator();
                while (it.hasNext()) {
                    c10063t2.f9469c.add((Consumer) it.next());
                }
                c10059p.f9462e.put(provider, c10063t2);
                c10063t = c10063t2;
            } else {
                c10063t.f9467a = c10059p.f9458a.f9436a;
            }
            if (c10063t.f9470d != null) {
                boolean zDidTimePassMillis = c10063t.f9468b.didTimePassMillis(c10063t.f9471e, c10063t.f9467a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z = location.distanceTo(c10063t.f9470d) > c10063t.f9467a.getUpdateDistanceInterval();
                boolean z2 = c10063t.f9470d == null || location.getTime() - c10063t.f9470d.getTime() >= 0;
                if ((!zDidTimePassMillis && !z) || !z2) {
                    return;
                }
            }
            c10063t.f9470d = location;
            c10063t.f9471e = System.currentTimeMillis();
            Iterator it2 = c10063t.f9469c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
