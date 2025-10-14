package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.Y2 */
/* loaded from: classes5.dex */
public final class C9345Y2 extends SafeRunnable {

    /* renamed from: a */
    public final /* synthetic */ BatteryInfo f7549a;

    /* renamed from: b */
    public final /* synthetic */ C9369Z2 f7550b;

    public C9345Y2(C9369Z2 c9369z2, BatteryInfo batteryInfo) {
        this.f7550b = c9369z2;
        this.f7549a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C9394a3 c9394a3 = this.f7550b.f7615a;
        ChargeType chargeType = this.f7549a.chargeType;
        ChargeType chargeType2 = C9394a3.f7661d;
        synchronized (c9394a3) {
            Iterator it = c9394a3.f7664c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
