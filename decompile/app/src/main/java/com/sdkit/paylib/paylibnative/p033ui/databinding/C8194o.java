package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.o */
/* loaded from: classes5.dex */
public final class C8194o implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2219a;

    /* renamed from: b */
    public final TextView f2220b;

    /* renamed from: c */
    public final ImageView f2221c;

    /* renamed from: d */
    public final C8198s f2222d;

    /* renamed from: e */
    public final TextView f2223e;

    /* renamed from: f */
    public final View f2224f;

    public C8194o(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, C8198s c8198s, TextView textView2, View view) {
        this.f2219a = constraintLayout;
        this.f2220b = textView;
        this.f2221c = imageView;
        this.f2222d = c8198s;
        this.f2223e = textView2;
        this.f2224f = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2219a;
    }

    /* renamed from: a */
    public static C8194o m2145a(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C11403R.id.additional_message;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C11403R.id.icon_success;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.invoice_details))) != null) {
                C8198s c8198sM2153a = C8198s.m2153a(viewFindChildViewById);
                i = C11403R.id.message;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11403R.id.view_divider))) != null) {
                    return new C8194o((ConstraintLayout) view, textView, imageView, c8198sM2153a, textView2, viewFindChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
