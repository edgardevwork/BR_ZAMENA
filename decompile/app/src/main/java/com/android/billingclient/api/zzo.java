package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzo {
    public final Context zza;
    public final PurchasesUpdatedListener zzb;
    public final zzc zzc;
    public final UserChoiceBillingListener zzd;
    public final zzcc zze;
    public final zzn zzf = new zzn(this, true);
    public final zzn zzg = new zzn(this, false);
    public boolean zzh;

    public zzo(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzck zzckVar, zzc zzcVar, UserChoiceBillingListener userChoiceBillingListener, zzcc zzccVar) {
        this.zza = context;
        this.zzb = purchasesUpdatedListener;
        this.zzc = zzcVar;
        this.zzd = userChoiceBillingListener;
        this.zze = zzccVar;
    }

    @Nullable
    public final PurchasesUpdatedListener zzd() {
        return this.zzb;
    }

    public final void zzf() {
        this.zzf.zzc(this.zza);
        this.zzg.zzc(this.zza);
    }

    public final void zzg(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzh = z;
        this.zzg.zza(this.zza, intentFilter2);
        if (this.zzh) {
            this.zzf.zzb(this.zza, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.zzf.zza(this.zza, intentFilter);
        }
    }
}
