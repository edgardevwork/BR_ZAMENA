package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.k */
/* loaded from: classes5.dex */
public final class C8190k implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f2189a;

    /* renamed from: b */
    public final View f2190b;

    /* renamed from: c */
    public final ImageView f2191c;

    /* renamed from: d */
    public final PaylibButton f2192d;

    /* renamed from: e */
    public final C8198s f2193e;

    /* renamed from: f */
    public final C8199t f2194f;

    /* renamed from: g */
    public final TextView f2195g;

    /* renamed from: h */
    public final TextView f2196h;

    /* renamed from: i */
    public final EditText f2197i;

    /* renamed from: j */
    public final C8204y f2198j;

    /* renamed from: k */
    public final View f2199k;

    public C8190k(ConstraintLayout constraintLayout, View view, ImageView imageView, PaylibButton paylibButton, C8198s c8198s, C8199t c8199t, TextView textView, TextView textView2, EditText editText, C8204y c8204y, View view2) {
        this.f2189a = constraintLayout;
        this.f2190b = view;
        this.f2191c = imageView;
        this.f2192d = paylibButton;
        this.f2193e = c8198s;
        this.f2194f = c8199t;
        this.f2195g = textView;
        this.f2196h = textView2;
        this.f2197i = editText;
        this.f2198j = c8204y;
        this.f2199k = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f2189a;
    }

    /* renamed from: a */
    public static C8190k m2137a(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C11403R.id.bottom_sheet_handle;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = C11403R.id.clear_button;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11403R.id.continue_button;
                PaylibButton paylibButton = (PaylibButton) ViewBindings.findChildViewById(view, i);
                if (paylibButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C11403R.id.invoice_details))) != null) {
                    C8198s c8198sM2153a = C8198s.m2153a(viewFindChildViewById);
                    i = C11403R.id.loading;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, i);
                    if (viewFindChildViewById4 != null) {
                        C8199t c8199tM2155a = C8199t.m2155a(viewFindChildViewById4);
                        i = C11403R.id.phone_disclaimer;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C11403R.id.phone_error;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C11403R.id.phone_input;
                                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                                if (editText != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C11403R.id.title))) != null) {
                                    C8204y c8204yM2165a = C8204y.m2165a(viewFindChildViewById2);
                                    i = C11403R.id.view_divider;
                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i);
                                    if (viewFindChildViewById5 != null) {
                                        return new C8190k((ConstraintLayout) view, viewFindChildViewById3, imageView, paylibButton, c8198sM2153a, c8199tM2155a, textView, textView2, editText, c8204yM2165a, viewFindChildViewById5);
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
