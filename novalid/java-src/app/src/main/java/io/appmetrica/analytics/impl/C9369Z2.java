package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.Z2 */
/* loaded from: classes5.dex */
public final class C9369Z2 implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C9394a3 f7615a;

    public C9369Z2(C9394a3 c9394a3) {
        this.f7615a = c9394a3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f7615a.f7663b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f7615a.getClass();
        BatteryInfo batteryInfoM5825a = C9394a3.m5825a(intent);
        this.f7615a.f7663b = batteryInfoM5825a;
        if (chargeType != batteryInfoM5825a.chargeType) {
            this.f7615a.f7662a.execute(new C9345Y2(this, batteryInfoM5825a));
        }
    }
}
