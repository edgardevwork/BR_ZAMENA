package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes7.dex */
public class FrameworkDetector {

    /* renamed from: a */
    private static final String f6201a = new FrameworkDetector().detectFramework();

    @VisibleForTesting
    public FrameworkDetector() {
    }

    @NonNull
    public static String framework() {
        return f6201a;
    }

    @NonNull
    @VisibleForTesting
    public String detectFramework() {
        if (ReflectionUtils.detectClassExists("com.unity3d.player.UnityPlayer")) {
            return PluginErrorDetails.Platform.UNITY;
        }
        if (ReflectionUtils.detectClassExists("mono.MonoPackageManager")) {
            return PluginErrorDetails.Platform.XAMARIN;
        }
        if (ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin")) {
            return PluginErrorDetails.Platform.CORDOVA;
        }
        if (ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView")) {
            return "react";
        }
        if (!ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine")) {
            return PluginErrorDetails.Platform.NATIVE;
        }
        return PluginErrorDetails.Platform.FLUTTER;
    }
}
