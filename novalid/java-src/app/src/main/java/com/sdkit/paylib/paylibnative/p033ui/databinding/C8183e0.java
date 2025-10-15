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

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.e0 */
/* loaded from: classes5.dex */
public final class C8183e0 implements ViewBinding {

    /* renamed from: a */
    public final View f2136a;

    /* renamed from: b */
    public final ImageView f2137b;

    /* renamed from: c */
    public final TextView f2138c;

    /* renamed from: d */
    public final TextView f2139d;

    /* renamed from: e */
    public final WidgetCheckBoxView f2140e;

    public C8183e0(View view, ImageView imageView, TextView textView, TextView textView2, WidgetCheckBoxView widgetCheckBoxView) {
        this.f2136a = view;
        this.f2137b = imageView;
        this.f2138c = textView;
        this.f2139d = textView2;
        this.f2140e = widgetCheckBoxView;
    }

    /* renamed from: a */
    public static C8183e0 m2123a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11403R.layout.paylib_native_view_widget_tbank, viewGroup);
        return m2124a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f2136a;
    }

    /* renamed from: a */
    public static C8183e0 m2124a(View view) {
        int i = C11403R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11403R.id.tv_info;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C11403R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C11403R.id.widget_checkbox;
                    WidgetCheckBoxView widgetCheckBoxView = (WidgetCheckBoxView) ViewBindings.findChildViewById(view, i);
                    if (widgetCheckBoxView != null) {
                        return new C8183e0(view, imageView, textView, textView2, widgetCheckBoxView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
