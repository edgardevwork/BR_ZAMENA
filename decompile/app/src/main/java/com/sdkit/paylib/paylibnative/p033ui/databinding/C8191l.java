package com.sdkit.paylib.paylibnative.p033ui.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.FragmentContainer;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.databinding.l */
/* loaded from: classes5.dex */
public final class C8191l implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f2200a;

    /* renamed from: b */
    public final View f2201b;

    /* renamed from: c */
    public final ImageView f2202c;

    /* renamed from: d */
    public final ConstraintLayout f2203d;

    /* renamed from: e */
    public final FragmentContainer f2204e;

    /* renamed from: f */
    public final FrameLayout f2205f;

    public C8191l(FrameLayout frameLayout, View view, ImageView imageView, ConstraintLayout constraintLayout, FragmentContainer fragmentContainer, FrameLayout frameLayout2) {
        this.f2200a = frameLayout;
        this.f2201b = view;
        this.f2202c = imageView;
        this.f2203d = constraintLayout;
        this.f2204e = fragmentContainer;
        this.f2205f = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f2200a;
    }

    /* renamed from: a */
    public static C8191l m2139a(View view) {
        int i = C11403R.id.bottom_sheet_default_handle;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C11403R.id.bottom_sheet_handle_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11403R.id.bottom_sheet_root;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C11403R.id.fragment_container;
                    FragmentContainer fragmentContainer = (FragmentContainer) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainer != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        return new C8191l(frameLayout, viewFindChildViewById, imageView, constraintLayout, fragmentContainer, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
