package com.google.android.play.core.review;

import android.os.Bundle;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jfrog.gradle.plugin.artifactory.Constant;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public final class zzj {
    public static final Set zza = new HashSet(Arrays.asList(PluginErrorDetails.Platform.NATIVE, PluginErrorDetails.Platform.UNITY));
    public static final Map zzb = new HashMap();
    public static final com.google.android.play.core.review.internal.zzi zzc = new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");

    public static Bundle zza() {
        Bundle bundle = new Bundle();
        Map mapZzb = zzb();
        bundle.putInt("playcore_version_code", ((Integer) mapZzb.get(Constant.JAVA)).intValue());
        if (mapZzb.containsKey(PluginErrorDetails.Platform.NATIVE)) {
            bundle.putInt("playcore_native_version", ((Integer) mapZzb.get(PluginErrorDetails.Platform.NATIVE)).intValue());
        }
        if (mapZzb.containsKey(PluginErrorDetails.Platform.UNITY)) {
            bundle.putInt("playcore_unity_version", ((Integer) mapZzb.get(PluginErrorDetails.Platform.UNITY)).intValue());
        }
        return bundle;
    }

    public static synchronized Map zzb() {
        Map map;
        map = zzb;
        map.put(Constant.JAVA, 11004);
        return map;
    }
}
