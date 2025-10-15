package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes6.dex */
public abstract class zzm extends zzw implements zzn {
    public zzm() {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzx.zza(parcel, Bundle.CREATOR);
        zzx.zzb(parcel);
        zza(bundle);
        return true;
    }
}
