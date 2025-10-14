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

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.a0 */
/* loaded from: classes5.dex */
public final class C8175a0 implements ViewBinding {

    /* renamed from: a */
    public final View f2089a;

    /* renamed from: b */
    public final ImageView f2090b;

    /* renamed from: c */
    public final TextView f2091c;

    /* renamed from: d */
    public final TextView f2092d;

    /* renamed from: e */
    public final WidgetCheckBoxView f2093e;

    public C8175a0(View view, ImageView imageView, TextView textView, TextView textView2, WidgetCheckBoxView widgetCheckBoxView) {
        this.f2089a = view;
        this.f2090b = imageView;
        this.f2091c = textView;
        this.f2092d = textView2;
        this.f2093e = widgetCheckBoxView;
    }

    /* renamed from: a */
    public static C8175a0 m2106a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11403R.layout.paylib_native_view_widget_bistro, viewGroup);
        return m2107a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.f2089a;
    }

    /* renamed from: a */
    public static C8175a0 m2107a(View view) {
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
                        return new C8175a0(view, imageView, textView, textView2, widgetCheckBoxView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
