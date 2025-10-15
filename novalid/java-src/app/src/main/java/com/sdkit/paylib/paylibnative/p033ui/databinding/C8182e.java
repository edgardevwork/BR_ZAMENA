package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.e */
/* loaded from: classes5.dex */
public final class C8182e implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2128a;

    /* renamed from: b */
    public final C8174a f2129b;

    /* renamed from: c */
    public final PaylibButton f2130c;

    /* renamed from: d */
    public final PaylibButton f2131d;

    /* renamed from: e */
    public final ConstraintLayout f2132e;

    /* renamed from: f */
    public final C8200u f2133f;

    /* renamed from: g */
    public final TextView f2134g;

    /* renamed from: h */
    public final TextView f2135h;

    public C8182e(ConstraintLayout constraintLayout, C8174a c8174a, PaylibButton paylibButton, PaylibButton paylibButton2, ConstraintLayout constraintLayout2, C8200u c8200u, TextView textView, TextView textView2) {
        this.f2128a = constraintLayout;
        this.f2129b = c8174a;
        this.f2130c = paylibButton;
        this.f2131d = paylibButton2;
        this.f2132e = constraintLayout2;
        this.f2133f = c8200u;
        this.f2134g = textView;
        this.f2135h = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2128a;
    }

    /* renamed from: a */
    public static C8182e m2121a(View view) {
        View viewFindChildViewById;
        int i = C11403R.id.additional_title;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            C8174a c8174aM2104a = C8174a.m2104a(viewFindChildViewById2);
            i = C11403R.id.button_action;
            PaylibButton paylibButton = (PaylibButton) ViewBindings.findChildViewById(view, i);
            if (paylibButton != null) {
                i = C11403R.id.button_cancel;
                PaylibButton paylibButton2 = (PaylibButton) ViewBindings.findChildViewById(view, i);
                if (paylibButton2 != null) {
                    i = C11403R.id.content;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.loading))) != null) {
                        C8200u c8200uM2157a = C8200u.m2157a(viewFindChildViewById);
                        i = C11403R.id.proposal;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C11403R.id.title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C8182e((ConstraintLayout) view, c8174aM2104a, paylibButton, paylibButton2, constraintLayout, c8200uM2157a, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
