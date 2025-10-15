package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.u */
/* loaded from: classes5.dex */
public final class C8200u implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2241a;

    /* renamed from: b */
    public final C8203x f2242b;

    /* renamed from: c */
    public final TextView f2243c;

    public C8200u(ConstraintLayout constraintLayout, C8203x c8203x, TextView textView) {
        this.f2241a = constraintLayout;
        this.f2242b = c8203x;
        this.f2243c = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2241a;
    }

    /* renamed from: a */
    public static C8200u m2157a(View view) {
        int i = C11403R.id.loading_progress_bar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C8203x c8203xM2163a = C8203x.m2163a(viewFindChildViewById);
            int i2 = C11403R.id.loading_user_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new C8200u((ConstraintLayout) view, c8203xM2163a, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
