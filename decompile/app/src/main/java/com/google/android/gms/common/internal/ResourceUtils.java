package com.google.android.gms.common.internal;

import android.net.Uri;
import androidx.media3.datasource.DefaultDataSource;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes6.dex */
public final class ResourceUtils {
    private static final Uri zza = new Uri.Builder().scheme(DefaultDataSource.SCHEME_ANDROID_RESOURCE).authority("com.google.android.gms").appendPath("drawable").build();

    private ResourceUtils() {
    }
}
