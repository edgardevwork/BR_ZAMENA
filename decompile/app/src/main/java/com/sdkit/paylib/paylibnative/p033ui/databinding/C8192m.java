package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.m */
/* loaded from: classes5.dex */
public final class C8192m implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2206a;

    /* renamed from: b */
    public final PaylibButton f2207b;

    /* renamed from: c */
    public final ConstraintLayout f2208c;

    /* renamed from: d */
    public final C8198s f2209d;

    /* renamed from: e */
    public final C8200u f2210e;

    /* renamed from: f */
    public final View f2211f;

    public C8192m(ConstraintLayout constraintLayout, PaylibButton paylibButton, ConstraintLayout constraintLayout2, C8198s c8198s, C8200u c8200u, View view) {
        this.f2206a = constraintLayout;
        this.f2207b = paylibButton;
        this.f2208c = constraintLayout2;
        this.f2209d = c8198s;
        this.f2210e = c8200u;
        this.f2211f = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2206a;
    }

    /* renamed from: a */
    public static C8192m m2141a(View view) {
        int i = C11403R.id.btn_cancel;
        PaylibButton paylibButton = (PaylibButton) ViewBindings.findChildViewById(view, i);
        if (paylibButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C11403R.id.invoice_details;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
            if (viewFindChildViewById != null) {
                C8198s c8198sM2153a = C8198s.m2153a(viewFindChildViewById);
                i = C11403R.id.loading;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
                if (viewFindChildViewById2 != null) {
                    C8200u c8200uM2157a = C8200u.m2157a(viewFindChildViewById2);
                    i = C11403R.id.view_divider;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById3 != null) {
                        return new C8192m(constraintLayout, paylibButton, constraintLayout, c8198sM2153a, c8200uM2157a, viewFindChildViewById3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
