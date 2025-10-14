package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes7.dex */
public class GeofencingClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public GeofencingClient(@NonNull Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @NonNull
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public Task<Void> addGeofences(@NonNull GeofencingRequest geofencingRequest, @NonNull final PendingIntent pendingIntent) {
        final GeofencingRequest geofencingRequestZza = geofencingRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall(geofencingRequestZza, pendingIntent) { // from class: com.google.android.gms.location.zzaq
            private final GeofencingRequest zza;
            private final PendingIntent zzb;

            {
                this.zza = geofencingRequestZza;
                this.zzb = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzv(this.zza, this.zzb, new zzat((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2424).build());
    }

    @NonNull
    public Task<Void> removeGeofences(@NonNull final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzar
            private final PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzx(this.zza, new zzat((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2425).build());
    }

    public GeofencingClient(@NonNull Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @NonNull
    public Task<Void> removeGeofences(@NonNull final List<String> list) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(list) { // from class: com.google.android.gms.location.zzas
            private final List zza;

            {
                this.zza = list;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzy(this.zza, new zzat((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2425).build());
    }
}
