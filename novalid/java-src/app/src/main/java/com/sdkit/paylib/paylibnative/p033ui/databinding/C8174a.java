package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.a */
/* loaded from: classes5.dex */
public final class C8174a implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f2087a;

    /* renamed from: b */
    public final TextView f2088b;

    public C8174a(FrameLayout frameLayout, TextView textView) {
        this.f2087a = frameLayout;
        this.f2088b = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f2087a;
    }

    /* renamed from: a */
    public static C8174a m2104a(View view) {
        int i = C11403R.id.tv_additional_info;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new C8174a((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
