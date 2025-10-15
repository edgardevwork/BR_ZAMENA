package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public abstract class ActivityLifecycleObserver {
    @NonNull
    @KeepForSdk
    /* renamed from: of */
    public static final ActivityLifecycleObserver m1058of(@NonNull Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    @NonNull
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@NonNull Runnable runnable);
}
