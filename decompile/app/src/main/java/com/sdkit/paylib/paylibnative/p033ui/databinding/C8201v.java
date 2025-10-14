package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.PaylibToggleButton;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.v */
/* loaded from: classes5.dex */
public final class C8201v implements ViewBinding {

    /* renamed from: a */
    public final View f2244a;

    /* renamed from: b */
    public final PaylibToggleButton f2245b;

    /* renamed from: c */
    public final FrameLayout f2246c;

    /* renamed from: d */
    public final TextView f2247d;

    /* renamed from: e */
    public final TextView f2248e;

    /* renamed from: f */
    public final FrameLayout f2249f;

    /* renamed from: g */
    public final TextView f2250g;

    public C8201v(View view, PaylibToggleButton paylibToggleButton, FrameLayout frameLayout, TextView textView, TextView textView2, FrameLayout frameLayout2, TextView textView3) {
        this.f2244a = view;
        this.f2245b = paylibToggleButton;
        this.f2246c = frameLayout;
        this.f2247d = textView;
        this.f2248e = textView2;
        this.f2249f = frameLayout2;
        this.f2250g = textView3;
    }

    /* renamed from: a */
    public static C8201v m2159a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11403R.layout.paylib_native_view_loyalty, viewGroup);
        return m2160a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f2244a;
    }

    /* renamed from: a */
    public static C8201v m2160a(View view) {
        int i = C11403R.id.loyalty_checkbox;
        PaylibToggleButton paylibToggleButton = (PaylibToggleButton) ViewBindings.findChildViewById(view, i);
        if (paylibToggleButton != null) {
            i = C11403R.id.loyalty_info;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C11403R.id.loyalty_info_label;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C11403R.id.loyalty_loading;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C11403R.id.loyalty_root;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = C11403R.id.loyalty_unavailable;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new C8201v(view, paylibToggleButton, frameLayout, textView, textView2, frameLayout2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
