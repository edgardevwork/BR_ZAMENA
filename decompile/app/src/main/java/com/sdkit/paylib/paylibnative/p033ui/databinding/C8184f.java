package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.f */
/* loaded from: classes5.dex */
public final class C8184f implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f2141a;

    /* renamed from: b */
    public final View f2142b;

    /* renamed from: c */
    public final PaylibButton f2143c;

    /* renamed from: d */
    public final ConstraintLayout f2144d;

    /* renamed from: e */
    public final C8198s f2145e;

    /* renamed from: f */
    public final C8199t f2146f;

    /* renamed from: g */
    public final FrameLayout f2147g;

    /* renamed from: h */
    public final RecyclerView f2148h;

    /* renamed from: i */
    public final C8204y f2149i;

    /* renamed from: j */
    public final View f2150j;

    public C8184f(FrameLayout frameLayout, View view, PaylibButton paylibButton, ConstraintLayout constraintLayout, C8198s c8198s, C8199t c8199t, FrameLayout frameLayout2, RecyclerView recyclerView, C8204y c8204y, View view2) {
        this.f2141a = frameLayout;
        this.f2142b = view;
        this.f2143c = paylibButton;
        this.f2144d = constraintLayout;
        this.f2145e = c8198s;
        this.f2146f = c8199t;
        this.f2147g = frameLayout2;
        this.f2148h = recyclerView;
        this.f2149i = c8204y;
        this.f2150j = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f2141a;
    }

    /* renamed from: a */
    public static C8184f m2125a(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C11403R.id.bottom_sheet_handle;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = C11403R.id.btn_add_card_and_pay;
            PaylibButton paylibButton = (PaylibButton) ViewBindings.findChildViewById(view, i);
            if (paylibButton != null) {
                i = C11403R.id.content;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.invoice_details))) != null) {
                    C8198s c8198sM2153a = C8198s.m2153a(viewFindChildViewById);
                    i = C11403R.id.loading;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        C8199t c8199tM2155a = C8199t.m2155a(viewFindChildViewById4);
                        FrameLayout frameLayout = (FrameLayout) view;
                        i = C11403R.id.rv_cards;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11403R.id.title))) != null) {
                            C8204y c8204yM2165a = C8204y.m2165a(viewFindChildViewById2);
                            i = C11403R.id.view_divider;
                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                            if (viewFindChildViewById5 != null) {
                                return new C8184f(frameLayout, viewFindChildViewById3, paylibButton, constraintLayout, c8198sM2153a, c8199tM2155a, frameLayout, recyclerView, c8204yM2165a, viewFindChildViewById5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
