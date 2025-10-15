package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.webkit.JavascriptInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.l */
/* loaded from: classes7.dex */
public final class C11545l {

    /* renamed from: a */
    public final Function1<String, Unit> f10577a;

    /* renamed from: b */
    public final Function1<String, Unit> f10578b;

    /* renamed from: c */
    public final Function0<Unit> f10579c;

    public C11545l(C11538e onPayInfoLoaded, C11539f onPageReceived, C11540g onErrorReceived) {
        Intrinsics.checkNotNullParameter(onPayInfoLoaded, "onPayInfoLoaded");
        Intrinsics.checkNotNullParameter(onPageReceived, "onPageReceived");
        Intrinsics.checkNotNullParameter(onErrorReceived, "onErrorReceived");
        this.f10577a = onPayInfoLoaded;
        this.f10578b = onPageReceived;
        this.f10579c = onErrorReceived;
    }

    @JavascriptInterface
    public final void handleError() {
        this.f10579c.invoke();
    }

    @JavascriptInterface
    public final void openPage(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f10578b.invoke(url);
    }

    @JavascriptInterface
    public final void setPayToken(String payTokenResponse) {
        Intrinsics.checkNotNullParameter(payTokenResponse, "payTokenResponse");
        this.f10577a.invoke(payTokenResponse);
    }
}
