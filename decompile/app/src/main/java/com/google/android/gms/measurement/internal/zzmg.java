package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes7.dex */
final class zzmg extends zzav {
    private final /* synthetic */ zzls zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmg(zzls zzlsVar, zzjc zzjcVar) {
        super(zzjcVar);
        this.zza = zzlsVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzav
    public final void zzb() {
        this.zza.zzj().zzu().zza("Tasks have been queued for a long time");
    }
}
