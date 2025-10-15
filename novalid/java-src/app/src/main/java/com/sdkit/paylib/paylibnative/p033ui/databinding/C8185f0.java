package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.common.view.WidgetCheckBoxView;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.f0 */
/* loaded from: classes5.dex */
public final class C8185f0 implements ViewBinding {

    /* renamed from: a */
    public final View f2151a;

    /* renamed from: b */
    public final TextView f2152b;

    /* renamed from: c */
    public final ImageView f2153c;

    /* renamed from: d */
    public final WidgetCheckBoxView f2154d;

    public C8185f0(View view, TextView textView, ImageView imageView, WidgetCheckBoxView widgetCheckBoxView) {
        this.f2151a = view;
        this.f2152b = textView;
        this.f2153c = imageView;
        this.f2154d = widgetCheckBoxView;
    }

    /* renamed from: a */
    public static C8185f0 m2127a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11403R.layout.paylib_native_view_widget_web_payment, viewGroup);
        return m2128a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f2151a;
    }

    /* renamed from: a */
    public static C8185f0 m2128a(View view) {
        int i = C11403R.id.title;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C11403R.id.web_pay_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11403R.id.widget_checkbox;
                WidgetCheckBoxView widgetCheckBoxView = (WidgetCheckBoxView) ViewBindings.findChildViewById(view, i);
                if (widgetCheckBoxView != null) {
                    return new C8185f0(view, textView, imageView, widgetCheckBoxView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
