package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.os.Bundle;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.g */
/* loaded from: classes5.dex */
public final class C11540g extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11537d f10567a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f10568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11540g(C11537d c11537d, Bundle bundle) {
        super(0);
        this.f10567a = c11537d;
        this.f10568b = bundle;
    }

    /* renamed from: a */
    public final void m7477a() {
        final WebView webView = this.f10567a.f10558a;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("authWebView");
            webView = null;
        }
        final C11537d c11537d = this.f10567a;
        final Bundle bundle = this.f10568b;
        webView.post(new Runnable() { // from class: ru.rustore.sdk.billingclient.impl.presentation.auth.g$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11540g.m7476a(c11537d, webView, bundle);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        m7477a();
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public static final void m7476a(C11537d this$0, WebView this_with, Bundle bundle) {
        Bundle bundle2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        int i = C11537d.f10557e;
        this$0.getClass();
        this_with.addJavascriptInterface(new C11545l(new C11538e(this$0), new C11539f(this$0), new C11540g(this$0, bundle)), "Android");
        this_with.getSettings().setJavaScriptEnabled(true);
        this_with.setWebViewClient(new C11541h());
        if (bundle == null || (bundle2 = bundle.getBundle("WEB_VIEW_STATE_KEY")) == null) {
            return;
        }
        this_with.restoreState(bundle2);
    }
}
