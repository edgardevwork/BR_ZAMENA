package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.blackhub.bronline.game.common.dotrvindicator.DotViewIndicator;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class DialogGameInstructionsBinding implements ViewBinding {

    @NonNull
    public final DotViewIndicator anyViewIndicator;

    @NonNull
    public final ImageButton btnClose;

    @NonNull
    public final ImageView imgGameHintBack;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvInstruction;

    @NonNull
    public final View vMainContainer;

    @NonNull
    public final ViewPager2 vpGameInstructions;

    public DialogGameInstructionsBinding(@NonNull ConstraintLayout rootView, @NonNull DotViewIndicator anyViewIndicator, @NonNull ImageButton btnClose, @NonNull ImageView imgGameHintBack, @NonNull TextView tvInstruction, @NonNull View vMainContainer, @NonNull ViewPager2 vpGameInstructions) {
        this.rootView = rootView;
        this.anyViewIndicator = anyViewIndicator;
        this.btnClose = btnClose;
        this.imgGameHintBack = imgGameHintBack;
        this.tvInstruction = tvInstruction;
        this.vMainContainer = vMainContainer;
        this.vpGameInstructions = vpGameInstructions;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogGameInstructionsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogGameInstructionsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_game_instructions, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static DialogGameInstructionsBinding bind(@NonNull View rootView) {
        int i = R.id.anyViewIndicator;
        DotViewIndicator dotViewIndicator = (DotViewIndicator) ViewBindings.findChildViewById(rootView, R.id.anyViewIndicator);
        if (dotViewIndicator != null) {
            i = R.id.btnClose;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btnClose);
            if (imageButton != null) {
                i = R.id.imgGameHintBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.imgGameHintBack);
                if (imageView != null) {
                    i = R.id.tvInstruction;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvInstruction);
                    if (textView != null) {
                        i = R.id.vMainContainer;
                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.vMainContainer);
                        if (viewFindChildViewById != null) {
                            i = R.id.vpGameInstructions;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(rootView, R.id.vpGameInstructions);
                            if (viewPager2 != null) {
                                return new DialogGameInstructionsBinding((ConstraintLayout) rootView, dotViewIndicator, imageButton, imageView, textView, viewFindChildViewById, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
