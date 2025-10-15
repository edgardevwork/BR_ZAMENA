package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes3.dex */
public final class zzbe extends com.google.android.gms.internal.play_billing.zzc {
    public final AlternativeBillingOnlyReportingDetailsListener zza;
    public final zzcc zzb;
    public final int zzc;

    public /* synthetic */ zzbe(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, zzcc zzccVar, int i, zzbd zzbdVar) {
        this.zza = alternativeBillingOnlyReportingDetailsListener;
        this.zzb = zzccVar;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzcc zzccVar = this.zzb;
            BillingResult billingResult = zzce.zzj;
            zzccVar.zzb(zzcb.zza(71, 15, billingResult), this.zzc);
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzce.zza(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iZzb);
            this.zzb.zzb(zzcb.zza(23, 15, billingResultZza), this.zzc);
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResultZza, null);
            return;
        }
        try {
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResultZza, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e);
            zzcc zzccVar2 = this.zzb;
            BillingResult billingResult2 = zzce.zzj;
            zzccVar2.zzb(zzcb.zza(72, 15, billingResult2), this.zzc);
            this.zza.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
