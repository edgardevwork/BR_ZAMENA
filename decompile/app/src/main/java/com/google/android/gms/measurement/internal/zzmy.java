package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zznc;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzmy<T extends Context & zznc> {
    private final T zza;

    @MainThread
    public final int zza(final Intent intent, int i, final int i2) throws IllegalStateException {
        final zzgo zzgoVarZzj = zzhy.zza(this.zza, null, null).zzj();
        if (intent == null) {
            zzgoVarZzj.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzgoVarZzj.zzp().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzna
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(i2, zzgoVarZzj, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzic(zznv.zza(this.zza));
        }
        zzc().zzu().zza("onBind received unknown action", action);
        return null;
    }

    private final zzgo zzc() {
        return zzhy.zza(this.zza, null, null).zzj();
    }

    public zzmy(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    public final /* synthetic */ void zza(int i, zzgo zzgoVar, Intent intent) {
        if (this.zza.zza(i)) {
            zzgoVar.zzp().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzp().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }

    public final /* synthetic */ void zza(zzgo zzgoVar, JobParameters jobParameters) {
        zzgoVar.zzp().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    @MainThread
    public final void zza() {
        zzhy.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzb() {
        zzhy.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzb(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onRebind called with null intent");
        } else {
            zzc().zzp().zza("onRebind called. action", intent.getAction());
        }
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zznv zznvVarZza = zznv.zza(this.zza);
        zznvVarZza.zzl().zzb(new zzmz(this, zznvVarZza, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zza(final JobParameters jobParameters) throws IllegalStateException {
        final zzgo zzgoVarZzj = zzhy.zza(this.zza, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzgoVarZzj.zzp().zza("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzmx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(zzgoVarZzj, jobParameters);
            }
        });
        return true;
    }

    @MainThread
    public final boolean zzc(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzp().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
