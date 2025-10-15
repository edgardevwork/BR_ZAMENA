package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.t */
/* loaded from: classes5.dex */
public final class C8199t implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f2240a;

    public C8199t(FrameLayout frameLayout) {
        this.f2240a = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f2240a;
    }

    /* renamed from: a */
    public static C8199t m2155a(View view) {
        if (view != null) {
            return new C8199t((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }
}
