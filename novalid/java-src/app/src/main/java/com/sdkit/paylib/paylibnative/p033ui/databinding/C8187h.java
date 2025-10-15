package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.PaymentWaysView;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.h */
/* loaded from: classes5.dex */
public final class C8187h implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2160a;

    /* renamed from: b */
    public final C8197r f2161b;

    /* renamed from: c */
    public final C8198s f2162c;

    /* renamed from: d */
    public final C8199t f2163d;

    /* renamed from: e */
    public final TextView f2164e;

    /* renamed from: f */
    public final PaylibButton f2165f;

    /* renamed from: g */
    public final FrameLayout f2166g;

    /* renamed from: h */
    public final PaymentWaysView f2167h;

    /* renamed from: i */
    public final ConstraintLayout f2168i;

    /* renamed from: j */
    public final View f2169j;

    public C8187h(ConstraintLayout constraintLayout, C8197r c8197r, C8198s c8198s, C8199t c8199t, TextView textView, PaylibButton paylibButton, FrameLayout frameLayout, PaymentWaysView paymentWaysView, ConstraintLayout constraintLayout2, View view) {
        this.f2160a = constraintLayout;
        this.f2161b = c8197r;
        this.f2162c = c8198s;
        this.f2163d = c8199t;
        this.f2164e = textView;
        this.f2165f = paylibButton;
        this.f2166g = frameLayout;
        this.f2167h = paymentWaysView;
        this.f2168i = constraintLayout2;
        this.f2169j = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2160a;
    }

    /* renamed from: a */
    public static C8187h m2131a(View view) {
        int i = C11403R.id.icon_close;
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
                    C8199t c8199tM2155a = C8199t.m2155a(viewFindChildViewById3);
                    i = C11403R.id.offer_info_label;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C11403R.id.payment_button;
                        PaylibButton paylibButton = (PaylibButton) ViewBindings.findChildViewById(view, i);
                        if (paylibButton != null) {
                            i = C11403R.id.payment_button_container;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout != null) {
                                i = C11403R.id.payment_ways;
                                PaymentWaysView paymentWaysView = (PaymentWaysView) ViewBindings.findChildViewById(view, i);
                                if (paymentWaysView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i = C11403R.id.view_divider;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                                    if (viewFindChildViewById4 != null) {
                                        return new C8187h(constraintLayout, c8197rM2151a, c8198sM2153a, c8199tM2155a, textView, paylibButton, frameLayout, paymentWaysView, constraintLayout, viewFindChildViewById4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
