package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.b */
/* loaded from: classes5.dex */
public final class C8176b implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2094a;

    /* renamed from: b */
    public final View f2095b;

    /* renamed from: c */
    public final ImageView f2096c;

    /* renamed from: d */
    public final TextView f2097d;

    public C8176b(ConstraintLayout constraintLayout, View view, ImageView imageView, TextView textView) {
        this.f2094a = constraintLayout;
        this.f2095b = view;
        this.f2096c = imageView;
        this.f2097d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2094a;
    }

    /* renamed from: a */
    public static C8176b m2108a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11403R.layout.paylib_native_bank_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return m2109a(viewInflate);
    }

    /* renamed from: a */
    public static C8176b m2109a(View view) {
        int i = C11403R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C11403R.id.icon_view;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11403R.id.title_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C8176b((ConstraintLayout) view, viewFindChildViewById, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
