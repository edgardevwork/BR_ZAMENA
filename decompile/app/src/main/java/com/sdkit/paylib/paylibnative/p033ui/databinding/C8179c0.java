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

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.c0 */
/* loaded from: classes5.dex */
public final class C8179c0 implements ViewBinding {

    /* renamed from: a */
    public final View f2110a;

    /* renamed from: b */
    public final ImageView f2111b;

    /* renamed from: c */
    public final TextView f2112c;

    /* renamed from: d */
    public final WidgetCheckBoxView f2113d;

    public C8179c0(View view, ImageView imageView, TextView textView, WidgetCheckBoxView widgetCheckBoxView) {
        this.f2110a = view;
        this.f2111b = imageView;
        this.f2112c = textView;
        this.f2113d = widgetCheckBoxView;
    }

    /* renamed from: a */
    public static C8179c0 m2115a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11403R.layout.paylib_native_view_widget_mobile, viewGroup);
        return m2116a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f2110a;
    }

    /* renamed from: a */
    public static C8179c0 m2116a(View view) {
        int i = C11403R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11403R.id.tv_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C11403R.id.widget_checkbox;
                WidgetCheckBoxView widgetCheckBoxView = (WidgetCheckBoxView) ViewBindings.findChildViewById(view, i);
                if (widgetCheckBoxView != null) {
                    return new C8179c0(view, imageView, textView, widgetCheckBoxView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
