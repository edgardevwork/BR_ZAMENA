package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes4.dex */
final class zzgp extends ContentObserver {
    private final /* synthetic */ zzgn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgp(zzgn zzgnVar, Handler handler) {
        super(null);
        this.zza = zzgnVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zza.set(true);
    }
}
