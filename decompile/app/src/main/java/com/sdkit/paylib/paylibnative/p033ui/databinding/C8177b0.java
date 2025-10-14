package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.WidgetCheckBoxView;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.b0 */
/* loaded from: classes5.dex */
public final class C8177b0 implements ViewBinding {

    /* renamed from: a */
    public final View f2098a;

    /* renamed from: b */
    public final Barrier f2099b;

    /* renamed from: c */
    public final ConstraintLayout f2100c;

    /* renamed from: d */
    public final TextView f2101d;

    /* renamed from: e */
    public final ImageView f2102e;

    /* renamed from: f */
    public final TextView f2103f;

    /* renamed from: g */
    public final WidgetCheckBoxView f2104g;

    /* renamed from: h */
    public final TextView f2105h;

    public C8177b0(View view, Barrier barrier, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, WidgetCheckBoxView widgetCheckBoxView, TextView textView3) {
        this.f2098a = view;
        this.f2099b = barrier;
        this.f2100c = constraintLayout;
        this.f2101d = textView;
        this.f2102e = imageView;
        this.f2103f = textView2;
        this.f2104g = widgetCheckBoxView;
        this.f2105h = textView3;
    }

    /* renamed from: a */
    public static C8177b0 m2111a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11403R.layout.paylib_native_view_widget_card, viewGroup);
        return m2112a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f2098a;
    }

    /* renamed from: a */
    public static C8177b0 m2112a(View view) {
        int i = C11403R.id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
        if (barrier != null) {
            i = C11403R.id.card_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C11403R.id.card_first_line;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C11403R.id.card_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C11403R.id.card_second_line;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C11403R.id.card_view_radiobutton;
                            WidgetCheckBoxView widgetCheckBoxView = (WidgetCheckBoxView) ViewBindings.findChildViewById(view, i);
                            if (widgetCheckBoxView != null) {
                                i = C11403R.id.change_payment_way_view;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new C8177b0(view, barrier, constraintLayout, textView, imageView, textView2, widgetCheckBoxView, textView3);
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
