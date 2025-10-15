package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.y */
/* loaded from: classes5.dex */
public final class C8204y implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2256a;

    /* renamed from: b */
    public final C8174a f2257b;

    /* renamed from: c */
    public final TextView f2258c;

    /* renamed from: d */
    public final C8196q f2259d;

    /* renamed from: e */
    public final C8197r f2260e;

    /* renamed from: f */
    public final TextView f2261f;

    public C8204y(ConstraintLayout constraintLayout, C8174a c8174a, TextView textView, C8196q c8196q, C8197r c8197r, TextView textView2) {
        this.f2256a = constraintLayout;
        this.f2257b = c8174a;
        this.f2258c = textView;
        this.f2259d = c8196q;
        this.f2260e = c8197r;
        this.f2261f = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2256a;
    }

    /* renamed from: a */
    public static C8204y m2165a(View view) {
        View viewFindChildViewById;
        int i = C11403R.id.additional_info;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            C8174a c8174aM2104a = C8174a.m2104a(viewFindChildViewById2);
            i = C11403R.id.additional_title_label;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.back_button))) != null) {
                C8196q c8196qM2149a = C8196q.m2149a(viewFindChildViewById);
                i = C11403R.id.close_button;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    C8197r c8197rM2151a = C8197r.m2151a(viewFindChildViewById3);
                    i = C11403R.id.title_label;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        return new C8204y((ConstraintLayout) view, c8174aM2104a, textView, c8196qM2149a, c8197rM2151a, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
