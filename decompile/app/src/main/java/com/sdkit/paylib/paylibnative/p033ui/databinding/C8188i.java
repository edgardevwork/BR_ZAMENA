package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.i */
/* loaded from: classes5.dex */
public final class C8188i implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2170a;

    /* renamed from: b */
    public final C8197r f2171b;

    /* renamed from: c */
    public final PaylibButton f2172c;

    /* renamed from: d */
    public final C8198s f2173d;

    /* renamed from: e */
    public final View f2174e;

    public C8188i(ConstraintLayout constraintLayout, C8197r c8197r, PaylibButton paylibButton, C8198s c8198s, View view) {
        this.f2170a = constraintLayout;
        this.f2171b = c8197r;
        this.f2172c = paylibButton;
        this.f2173d = c8198s;
        this.f2174e = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2170a;
    }

    /* renamed from: a */
    public static C8188i m2133a(View view) {
        View viewFindChildViewById;
        int i = C11403R.id.button_close;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            C8197r c8197rM2151a = C8197r.m2151a(viewFindChildViewById2);
            i = C11403R.id.button_update;
            PaylibButton paylibButton = (PaylibButton) ViewBindings.findChildViewById(view, i);
            if (paylibButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.invoice_details))) != null) {
                C8198s c8198sM2153a = C8198s.m2153a(viewFindChildViewById);
                i = C11403R.id.view_divider;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById3 != null) {
                    return new C8188i((ConstraintLayout) view, c8197rM2151a, paylibButton, c8198sM2153a, viewFindChildViewById3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
