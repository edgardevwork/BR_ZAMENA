package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.p */
/* loaded from: classes5.dex */
public final class C8195p implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2225a;

    /* renamed from: b */
    public final C8200u f2226b;

    /* renamed from: c */
    public final ConstraintLayout f2227c;

    /* renamed from: d */
    public final C8205z f2228d;

    public C8195p(ConstraintLayout constraintLayout, C8200u c8200u, ConstraintLayout constraintLayout2, C8205z c8205z) {
        this.f2225a = constraintLayout;
        this.f2226b = c8200u;
        this.f2227c = constraintLayout2;
        this.f2228d = c8205z;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2225a;
    }

    /* renamed from: a */
    public static C8195p m2147a(View view) {
        int i = C11403R.id.loading;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C8200u c8200uM2157a = C8200u.m2157a(viewFindChildViewById);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C11403R.id.web_payment;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (viewFindChildViewById2 != null) {
                return new C8195p(constraintLayout, c8200uM2157a, constraintLayout, C8205z.m2167a(viewFindChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
