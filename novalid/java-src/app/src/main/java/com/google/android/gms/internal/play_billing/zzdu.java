package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes6.dex */
final class zzdu implements zzep {
    private static final zzea zza = new zzds();
    private final zzea zzb;

    public zzdu() {
        zzea zzeaVar;
        zzcm zzcmVarZza = zzcm.zza();
        try {
            zzeaVar = (zzea) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzeaVar = zza;
        }
        zzdt zzdtVar = new zzdt(zzcmVarZza, zzeaVar);
        byte[] bArr = zzda.zzd;
        this.zzb = zzdtVar;
    }

    private static boolean zzb(zzdz zzdzVar) {
        return zzdzVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final zzeo zza(Class cls) {
        zzeq.zzr(cls);
        zzdz zzdzVarZzb = this.zzb.zzb(cls);
        return zzdzVarZzb.zzb() ? zzcs.class.isAssignableFrom(cls) ? zzeg.zzc(zzeq.zzn(), zzcg.zzb(), zzdzVarZzb.zza()) : zzeg.zzc(zzeq.zzm(), zzcg.zza(), zzdzVarZzb.zza()) : zzcs.class.isAssignableFrom(cls) ? zzb(zzdzVarZzb) ? zzef.zzl(cls, zzdzVarZzb, zzej.zzb(), zzdq.zzd(), zzeq.zzn(), zzcg.zzb(), zzdy.zzb()) : zzef.zzl(cls, zzdzVarZzb, zzej.zzb(), zzdq.zzd(), zzeq.zzn(), null, zzdy.zzb()) : zzb(zzdzVarZzb) ? zzef.zzl(cls, zzdzVarZzb, zzej.zza(), zzdq.zzc(), zzeq.zzm(), zzcg.zza(), zzdy.zza()) : zzef.zzl(cls, zzdzVarZzb, zzej.zza(), zzdq.zzc(), zzeq.zzm(), null, zzdy.zza());
    }
}
