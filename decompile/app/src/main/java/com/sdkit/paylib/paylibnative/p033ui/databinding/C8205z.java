package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.z */
/* loaded from: classes5.dex */
public final class C8205z implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2262a;

    /* renamed from: b */
    public final C8174a f2263b;

    /* renamed from: c */
    public final ConstraintLayout f2264c;

    /* renamed from: d */
    public final ImageButton f2265d;

    /* renamed from: e */
    public final ConstraintLayout f2266e;

    /* renamed from: f */
    public final WebView f2267f;

    public C8205z(ConstraintLayout constraintLayout, C8174a c8174a, ConstraintLayout constraintLayout2, ImageButton imageButton, ConstraintLayout constraintLayout3, WebView webView) {
        this.f2262a = constraintLayout;
        this.f2263b = c8174a;
        this.f2264c = constraintLayout2;
        this.f2265d = imageButton;
        this.f2266e = constraintLayout3;
        this.f2267f = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2262a;
    }

    /* renamed from: a */
    public static C8205z m2167a(View view) {
        int i = C11403R.id.web_payment_additional_title;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C8174a c8174aM2104a = C8174a.m2104a(viewFindChildViewById);
            i = C11403R.id.web_payment_app_bar;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C11403R.id.web_payment_exit_button;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                    i = C11403R.id.web_payment_web_view;
                    WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
                    if (webView != null) {
                        return new C8205z(constraintLayout2, c8174aM2104a, constraintLayout, imageButton, constraintLayout2, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
