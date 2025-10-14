package io.appmetrica.analytics.internal.p049js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C9692m1;

/* loaded from: classes8.dex */
public class AppMetricaJsInterface {

    /* renamed from: a */
    private final C9692m1 f9424a;

    public AppMetricaJsInterface(@NonNull C9692m1 c9692m1) {
        this.f9424a = c9692m1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f9424a.m6454d(str, str2);
    }
}
