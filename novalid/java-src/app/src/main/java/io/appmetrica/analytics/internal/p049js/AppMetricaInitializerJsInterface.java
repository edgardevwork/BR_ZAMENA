package io.appmetrica.analytics.internal.p049js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C9692m1;

/* loaded from: classes8.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a */
    private final C9692m1 f9423a;

    public AppMetricaInitializerJsInterface(@NonNull C9692m1 c9692m1) {
        this.f9423a = c9692m1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f9423a.m6450c(str);
    }
}
