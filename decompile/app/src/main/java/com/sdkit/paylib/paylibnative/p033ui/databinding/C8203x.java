package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.x */
/* loaded from: classes5.dex */
public final class C8203x implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f2254a;

    /* renamed from: b */
    public final ProgressBar f2255b;

    public C8203x(FrameLayout frameLayout, ProgressBar progressBar) {
        this.f2254a = frameLayout;
        this.f2255b = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f2254a;
    }

    /* renamed from: a */
    public static C8203x m2163a(View view) {
        int i = C11403R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
        if (progressBar != null) {
            return new C8203x((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
