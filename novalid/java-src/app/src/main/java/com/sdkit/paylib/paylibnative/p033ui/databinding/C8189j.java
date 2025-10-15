package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.j */
/* loaded from: classes5.dex */
public final class C8189j implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2175a;

    /* renamed from: b */
    public final View f2176b;

    /* renamed from: c */
    public final ImageView f2177c;

    /* renamed from: d */
    public final PaylibButton f2178d;

    /* renamed from: e */
    public final Barrier f2179e;

    /* renamed from: f */
    public final EditText f2180f;

    /* renamed from: g */
    public final C8198s f2181g;

    /* renamed from: h */
    public final C8199t f2182h;

    /* renamed from: i */
    public final TextView f2183i;

    /* renamed from: j */
    public final TextView f2184j;

    /* renamed from: k */
    public final TextView f2185k;

    /* renamed from: l */
    public final TextView f2186l;

    /* renamed from: m */
    public final C8204y f2187m;

    /* renamed from: n */
    public final View f2188n;

    public C8189j(ConstraintLayout constraintLayout, View view, ImageView imageView, PaylibButton paylibButton, Barrier barrier, EditText editText, C8198s c8198s, C8199t c8199t, TextView textView, TextView textView2, TextView textView3, TextView textView4, C8204y c8204y, View view2) {
        this.f2175a = constraintLayout;
        this.f2176b = view;
        this.f2177c = imageView;
        this.f2178d = paylibButton;
        this.f2179e = barrier;
        this.f2180f = editText;
        this.f2181g = c8198s;
        this.f2182h = c8199t;
        this.f2183i = textView;
        this.f2184j = textView2;
        this.f2185k = textView3;
        this.f2186l = textView4;
        this.f2187m = c8204y;
        this.f2188n = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2175a;
    }

    /* renamed from: a */
    public static C8189j m2135a(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C11403R.id.bottom_sheet_handle;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = C11403R.id.clear_sms;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11403R.id.continue_button;
                PaylibButton paylibButton = (PaylibButton) ViewBindings.findChildViewById(view, i);
                if (paylibButton != null) {
                    i = C11403R.id.description_barrier;
                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                    if (barrier != null) {
                        i = C11403R.id.enter_sms;
                        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                        if (editText != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.invoice_details))) != null) {
                            C8198s c8198sM2153a = C8198s.m2153a(viewFindChildViewById);
                            i = C11403R.id.loading;
                            View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                            if (viewFindChildViewById4 != null) {
                                C8199t c8199tM2155a = C8199t.m2155a(viewFindChildViewById4);
                                i = C11403R.id.sms_description;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = C11403R.id.sms_error;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C11403R.id.sms_resend;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C11403R.id.sms_timer;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11403R.id.title))) != null) {
                                                C8204y c8204yM2165a = C8204y.m2165a(viewFindChildViewById2);
                                                i = C11403R.id.view_divider;
                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                                                if (viewFindChildViewById5 != null) {
                                                    return new C8189j((ConstraintLayout) view, viewFindChildViewById3, imageView, paylibButton, barrier, editText, c8198sM2153a, c8199tM2155a, textView, textView2, textView3, textView4, c8204yM2165a, viewFindChildViewById5);
                                                }
                                            }
                                        }
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
