package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.bless.client.R;


public final class DialogGasmanHintBinding implements ViewBinding {

    @NonNull
    public final DotViewIndicator anyViewIndicator;

    @NonNull
    public final ImageButton ibClose;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvInstruction;

    @NonNull
    public final View vBgEffectShadow;

    @NonNull
    public final View vMainContainer;

    @NonNull
    public final ViewPager2 vp2;

    public DialogGasmanHintBinding(@NonNull ConstraintLayout rootView, @NonNull DotViewIndicator anyViewIndicator, @NonNull ImageButton ibClose, @NonNull TextView tvInstruction, @NonNull View vBgEffectShadow, @NonNull View vMainContainer, @NonNull ViewPager2 vp2) {
        this.rootView = rootView;
        this.anyViewIndicator = anyViewIndicator;
        this.ibClose = ibClose;
        this.tvInstruction = tvInstruction;
        this.vBgEffectShadow = vBgEffectShadow;
        this.vMainContainer = vMainContainer;
        this.vp2 = vp2;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogGasmanHintBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogGasmanHintBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_gasman_hint, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DialogGasmanHintBinding bind(@NonNull View rootView) {
        int i = R.id.anyViewIndicator;
        DotViewIndicator dotViewIndicator = (DotViewIndicator) ViewBindings.findChildViewById(rootView, R.id.anyViewIndicator);
        if (dotViewIndicator != null) {
            i = R.id.ibClose;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.ibClose);
            if (imageButton != null) {
                i = R.id.tvInstruction;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvInstruction);
                if (textView != null) {
                    i = R.id.vBgEffectShadow;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.vBgEffectShadow);
                    if (viewFindChildViewById != null) {
                        i = R.id.vMainContainer;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.vMainContainer);
                        if (viewFindChildViewById2 != null) {
                            i = R.id.vp2;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, R.id.vp2);
                            if (viewPager2 != null) {
                                return new DialogGasmanHintBinding((ConstraintLayout) rootView, dotViewIndicator, imageButton, textView, viewFindChildViewById, viewFindChildViewById2, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
