package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes6.dex */
final class zzgn implements zzcw {
    static final zzcw zza = new zzgn();

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i) {
        zzgo zzgoVar = zzgo.BROADCAST_ACTION_UNSPECIFIED;
        if (i != 0) {
            zzgoVar = i != 1 ? i != 2 ? i != 3 ? null : zzgo.ALTERNATIVE_BILLING_ACTION : zzgo.LOCAL_PURCHASES_UPDATED_ACTION : zzgo.PURCHASES_UPDATED_ACTION;
        }
        return zzgoVar != null;
    }
}
