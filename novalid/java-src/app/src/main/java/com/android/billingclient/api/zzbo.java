package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes3.dex */
public final class zzbo extends com.google.android.gms.internal.play_billing.zzm {
    public final AlternativeBillingOnlyAvailabilityListener zza;
    public final zzcc zzb;
    public final int zzc;

    public /* synthetic */ zzbo(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, zzcc zzccVar, int i, zzbn zzbnVar) {
        this.zza = alternativeBillingOnlyAvailabilityListener;
        this.zzb = zzccVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzn
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcc zzccVar = this.zzb;
            BillingResult billingResult = zzce.zzj;
            zzccVar.zzb(zzcb.zza(67, 14, billingResult), this.zzc);
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzce.zza(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            this.zzb.zzb(zzcb.zza(23, 14, billingResultZza), this.zzc);
        }
        this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResultZza);
    }
}
