package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.w */
/* loaded from: classes5.dex */
public final class C8202w implements ViewBinding {

    /* renamed from: a */
    public final View f2251a;

    /* renamed from: b */
    public final ImageView f2252b;

    /* renamed from: c */
    public final TextView f2253c;

    public C8202w(View view, ImageView imageView, TextView textView) {
        this.f2251a = view;
        this.f2252b = imageView;
        this.f2253c = textView;
    }

    /* renamed from: a */
    public static C8202w m2161a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11403R.layout.paylib_native_view_payment_button, viewGroup);
        return m2162a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f2251a;
    }

    /* renamed from: a */
    public static C8202w m2162a(View view) {
        int i = C11403R.id.icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11403R.id.text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C8202w(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
