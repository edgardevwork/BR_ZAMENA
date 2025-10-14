package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.c */
/* loaded from: classes5.dex */
public final class C8178c implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2106a;

    /* renamed from: b */
    public final TextView f2107b;

    /* renamed from: c */
    public final ImageView f2108c;

    /* renamed from: d */
    public final TextView f2109d;

    public C8178c(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f2106a = constraintLayout;
        this.f2107b = textView;
        this.f2108c = imageView;
        this.f2109d = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2106a;
    }

    /* renamed from: a */
    public static C8178c m2113a(View view) {
        int i = C11403R.id.card_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C11403R.id.card_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11403R.id.card_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    return new C8178c((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
