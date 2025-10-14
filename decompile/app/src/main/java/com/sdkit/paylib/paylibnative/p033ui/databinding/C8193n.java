package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.n */
/* loaded from: classes5.dex */
public final class C8193n implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2212a;

    /* renamed from: b */
    public final C8174a f2213b;

    /* renamed from: c */
    public final PaylibButton f2214c;

    /* renamed from: d */
    public final PaylibButton f2215d;

    /* renamed from: e */
    public final TextView f2216e;

    /* renamed from: f */
    public final C8204y f2217f;

    /* renamed from: g */
    public final TextView f2218g;

    public C8193n(ConstraintLayout constraintLayout, C8174a c8174a, PaylibButton paylibButton, PaylibButton paylibButton2, TextView textView, C8204y c8204y, TextView textView2) {
        this.f2212a = constraintLayout;
        this.f2213b = c8174a;
        this.f2214c = paylibButton;
        this.f2215d = paylibButton2;
        this.f2216e = textView;
        this.f2217f = c8204y;
        this.f2218g = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2212a;
    }

    /* renamed from: a */
    public static C8193n m2143a(View view) {
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
                    i = C11403R.id.error_message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.title))) != null) {
                        C8204y c8204yM2165a = C8204y.m2165a(viewFindChildViewById);
                        i = C11403R.id.trace_id_view;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C8193n((ConstraintLayout) view, c8174aM2104a, paylibButton, paylibButton2, textView, c8204yM2165a, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
