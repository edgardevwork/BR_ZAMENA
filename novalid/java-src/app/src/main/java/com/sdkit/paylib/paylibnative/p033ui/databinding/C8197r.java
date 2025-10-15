package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.r */
/* loaded from: classes5.dex */
public final class C8197r implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f2231a;

    /* renamed from: b */
    public final ImageView f2232b;

    public C8197r(FrameLayout frameLayout, ImageView imageView) {
        this.f2231a = frameLayout;
        this.f2232b = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f2231a;
    }

    /* renamed from: a */
    public static C8197r m2151a(View view) {
        int i = C11403R.id.icon_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new C8197r((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
