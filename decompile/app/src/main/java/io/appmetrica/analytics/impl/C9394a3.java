package io.appmetrica.analytics.impl;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.a3 */
/* loaded from: classes5.dex */
public final class C9394a3 implements ChargeTypeProvider {

    /* renamed from: d */
    public static final ChargeType f7661d = ChargeType.UNKNOWN;

    /* renamed from: a */
    public final ICommonExecutor f7662a;

    /* renamed from: b */
    public volatile BatteryInfo f7663b;

    /* renamed from: c */
    public final ArrayList f7664c = new ArrayList();

    public C9394a3(@NonNull ICommonExecutor iCommonExecutor, @NonNull C9321X2 c9321x2) {
        C9369Z2 c9369z2 = new C9369Z2(this);
        this.f7662a = iCommonExecutor;
        this.f7663b = m5825a(c9321x2.m5727a(c9369z2));
    }

    /* renamed from: a */
    public static BatteryInfo m5825a(Intent intent) {
        ChargeType chargeType = f7661d;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = ChargeType.WIRELESS;
            }
        }
        return new BatteryInfo(numValueOf, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @Nullable
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f7663b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @NonNull
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f7663b;
        return batteryInfo == null ? ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(@NonNull ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f7664c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
