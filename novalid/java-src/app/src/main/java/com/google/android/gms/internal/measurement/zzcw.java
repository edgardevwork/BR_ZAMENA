package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzcw {
    public static final int zza;

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? NTLMEngineImpl.FLAG_REQUEST_VERSION : 0;
    }
}
