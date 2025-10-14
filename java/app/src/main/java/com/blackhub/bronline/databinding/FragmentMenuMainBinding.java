package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.UIContainer;
import com.bless.client.R;

/* loaded from: classes.dex */
public final class FragmentMenuMainBinding implements ViewBinding {

    @NonNull
    public final UIContainer newMenuMainContainer;

    @NonNull
    public final Chronometer newMenuPauseChronometer;

    @NonNull
    public final TextView newMenuPauseTitle;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final Group timerGroup;

    public FragmentMenuMainBinding(@NonNull ConstraintLayout rootView, @NonNull UIContainer newMenuMainContainer, @NonNull Chronometer newMenuPauseChronometer, @NonNull TextView newMenuPauseTitle, @NonNull Group timerGroup) {
        this.rootView = rootView;
        this.newMenuMainContainer = newMenuMainContainer;
        this.newMenuPauseChronometer = newMenuPauseChronometer;
        this.newMenuPauseTitle = newMenuPauseTitle;
        this.timerGroup = timerGroup;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMenuMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMenuMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_menu_main, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentMenuMainBinding bind(@NonNull View rootView) {
        int i = R.id.new_menu_main_container;
        UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.new_menu_main_container);
        if (uIContainer != null) {
            i = R.id.new_menu_pause_chronometer;
            Chronometer chronometer = (Chronometer) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_chronometer);
            if (chronometer != null) {
                i = R.id.new_menu_pause_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_pause_title);
                if (textView != null) {
                    i = R.id.timer_group;
                    Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.timer_group);
                    if (group != null) {
                        return new FragmentMenuMainBinding((ConstraintLayout) rootView, uIContainer, chronometer, textView, group);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
