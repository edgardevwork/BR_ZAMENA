package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.g */
/* loaded from: classes5.dex */
public final class C8186g implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2155a;

    /* renamed from: b */
    public final C8197r f2156b;

    /* renamed from: c */
    public final C8198s f2157c;

    /* renamed from: d */
    public final C8200u f2158d;

    /* renamed from: e */
    public final View f2159e;

    public C8186g(ConstraintLayout constraintLayout, C8197r c8197r, C8198s c8198s, C8200u c8200u, View view) {
        this.f2155a = constraintLayout;
        this.f2156b = c8197r;
        this.f2157c = c8198s;
        this.f2158d = c8200u;
        this.f2159e = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2155a;
    }

    /* renamed from: a */
    public static C8186g m2129a(View view) {
        int i = C11403R.id.close_button;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C8197r c8197rM2151a = C8197r.m2151a(viewFindChildViewById);
            i = C11403R.id.invoice_details;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById2 != null) {
                C8198s c8198sM2153a = C8198s.m2153a(viewFindChildViewById2);
                i = C11403R.id.loading;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    C8200u c8200uM2157a = C8200u.m2157a(viewFindChildViewById3);
                    i = C11403R.id.view_divider;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        return new C8186g((ConstraintLayout) view, c8197rM2151a, c8198sM2153a, c8200uM2157a, viewFindChildViewById4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
