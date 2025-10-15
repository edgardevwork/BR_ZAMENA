package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FragmentGasmanMainContainerBinding implements ViewBinding {

    @NonNull
    public final Group containerGroup;

    @NonNull
    public final FragmentContainerView fragmentContainer;

    @NonNull
    public final ImageButton ibExit;

    @NonNull
    public final ImageButton ibInfo;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView tvQuantityOfChecks;

    @NonNull
    public final View vBackgroundForPlots;

    @NonNull
    public final View vResultOfCheck1;

    @NonNull
    public final View vResultOfCheck2;

    @NonNull
    public final View vResultOfCheck3;

    public FragmentGasmanMainContainerBinding(@NonNull ConstraintLayout rootView, @NonNull Group containerGroup, @NonNull FragmentContainerView fragmentContainer, @NonNull ImageButton ibExit, @NonNull ImageButton ibInfo, @NonNull TextView tvQuantityOfChecks, @NonNull View vBackgroundForPlots, @NonNull View vResultOfCheck1, @NonNull View vResultOfCheck2, @NonNull View vResultOfCheck3) {
        this.rootView = rootView;
        this.containerGroup = containerGroup;
        this.fragmentContainer = fragmentContainer;
        this.ibExit = ibExit;
        this.ibInfo = ibInfo;
        this.tvQuantityOfChecks = tvQuantityOfChecks;
        this.vBackgroundForPlots = vBackgroundForPlots;
        this.vResultOfCheck1 = vResultOfCheck1;
        this.vResultOfCheck2 = vResultOfCheck2;
        this.vResultOfCheck3 = vResultOfCheck3;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentGasmanMainContainerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentGasmanMainContainerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_gasman_main_container, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentGasmanMainContainerBinding bind(@NonNull View rootView) {
        int i = R.id.containerGroup;
        Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.containerGroup);
        if (group != null) {
            i = R.id.fragmentContainer;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.fragmentContainer);
            if (fragmentContainerView != null) {
                i = R.id.ibExit;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.ibExit);
                if (imageButton != null) {
                    i = R.id.ibInfo;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.ibInfo);
                    if (imageButton2 != null) {
                        i = R.id.tvQuantityOfChecks;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvQuantityOfChecks);
                        if (textView != null) {
                            i = R.id.vBackgroundForPlots;
                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.vBackgroundForPlots);
                            if (viewFindChildViewById != null) {
                                i = R.id.vResultOfCheck1;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.vResultOfCheck1);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.vResultOfCheck2;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.vResultOfCheck2);
                                    if (viewFindChildViewById3 != null) {
                                        i = R.id.vResultOfCheck3;
                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.vResultOfCheck3);
                                        if (viewFindChildViewById4 != null) {
                                            return new FragmentGasmanMainContainerBinding((ConstraintLayout) rootView, group, fragmentContainerView, imageButton, imageButton2, textView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
