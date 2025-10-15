package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.d */
/* loaded from: classes5.dex */
public final class C8180d implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2114a;

    /* renamed from: b */
    public final RecyclerView f2115b;

    /* renamed from: c */
    public final View f2116c;

    /* renamed from: d */
    public final C8199t f2117d;

    /* renamed from: e */
    public final ImageView f2118e;

    /* renamed from: f */
    public final TextView f2119f;

    /* renamed from: g */
    public final TextView f2120g;

    /* renamed from: h */
    public final Group f2121h;

    /* renamed from: i */
    public final C8204y f2122i;

    public C8180d(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, C8199t c8199t, ImageView imageView, TextView textView, TextView textView2, Group group, C8204y c8204y) {
        this.f2114a = constraintLayout;
        this.f2115b = recyclerView;
        this.f2116c = view;
        this.f2117d = c8199t;
        this.f2118e = imageView;
        this.f2119f = textView;
        this.f2120g = textView2;
        this.f2121h = group;
        this.f2122i = c8204y;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2114a;
    }

    /* renamed from: a */
    public static C8180d m2117a(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = C11403R.id.banks_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.bottom_sheet_handle))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11403R.id.loading))) != null) {
            C8199t c8199tM2155a = C8199t.m2155a(viewFindChildViewById2);
            i = C11403R.id.no_apps_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11403R.id.no_apps_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C11403R.id.no_apps_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C11403R.id.no_apps_view;
                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                        if (group != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = C11403R.id.title))) != null) {
                            return new C8180d((ConstraintLayout) view, recyclerView, viewFindChildViewById, c8199tM2155a, imageView, textView, textView2, group, C8204y.m2165a(viewFindChildViewById3));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
