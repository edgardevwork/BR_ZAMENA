package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.s */
/* loaded from: classes5.dex */
public final class C8198s implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2233a;

    /* renamed from: b */
    public final View f2234b;

    /* renamed from: c */
    public final ImageView f2235c;

    /* renamed from: d */
    public final C8174a f2236d;

    /* renamed from: e */
    public final TextView f2237e;

    /* renamed from: f */
    public final TextView f2238f;

    /* renamed from: g */
    public final TextView f2239g;

    public C8198s(ConstraintLayout constraintLayout, View view, ImageView imageView, C8174a c8174a, TextView textView, TextView textView2, TextView textView3) {
        this.f2233a = constraintLayout;
        this.f2234b = view;
        this.f2235c = imageView;
        this.f2236d = c8174a;
        this.f2237e = textView;
        this.f2238f = textView2;
        this.f2239g = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2233a;
    }

    /* renamed from: a */
    public static C8198s m2153a(View view) {
        View viewFindChildViewById;
        int i = C11403R.id.bottom_sheet_handle;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = C11403R.id.iv_payment_source;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.tv_additional_info))) != null) {
                C8174a c8174aM2104a = C8174a.m2104a(viewFindChildViewById);
                i = C11403R.id.tv_additional_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C11403R.id.tv_payment_amount;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C11403R.id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new C8198s((ConstraintLayout) view, viewFindChildViewById2, imageView, c8174aM2104a, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
