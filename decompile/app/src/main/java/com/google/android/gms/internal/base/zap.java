package com.google.android.gms.internal.base;

import android.os.Build;
import org.apache.http.impl.auth.NTLMEngineImpl;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes4.dex */
public final class zap {
    public static final int zaa;

    static {
        zaa = Build.VERSION.SDK_INT >= 31 ? NTLMEngineImpl.FLAG_REQUEST_VERSION : 0;
    }
}
