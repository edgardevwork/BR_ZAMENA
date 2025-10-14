package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.view.View;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.impl.presentation.auth.InterfaceC11544k;

/* renamed from: ru.rustore.sdk.billingclient.impl.presentation.auth.c */
/* loaded from: classes5.dex */
public final class C11536c extends Lambda implements Function1<InterfaceC11544k, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C11537d f10556a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11536c(C11537d c11537d) {
        super(1);
        this.f10556a = c11537d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC11544k interfaceC11544k) {
        InterfaceC11544k state = interfaceC11544k;
        Intrinsics.checkNotNullParameter(state, "state");
        WebView webView = null;
        if (state instanceof InterfaceC11544k.b) {
            View view = this.f10556a.f10559b;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("processBar");
                view = null;
            }
            view.setVisibility(0);
            WebView webView2 = this.f10556a.f10558a;
            if (webView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authWebView");
            } else {
                webView = webView2;
            }
            webView.setVisibility(8);
        } else if (state instanceof InterfaceC11544k.a) {
            View view2 = this.f10556a.f10559b;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("processBar");
                view2 = null;
            }
            view2.setVisibility(8);
            WebView webView3 = this.f10556a.f10558a;
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authWebView");
                webView3 = null;
            }
            webView3.setVisibility(0);
            WebView webView4 = this.f10556a.f10558a;
            if (webView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("authWebView");
            } else {
                webView = webView4;
            }
            webView.loadUrl(((InterfaceC11544k.a) state).f10574a);
        }
        return Unit.INSTANCE;
    }
}
