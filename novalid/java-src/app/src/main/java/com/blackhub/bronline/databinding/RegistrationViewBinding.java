package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.common.UIContainer;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class RegistrationViewBinding implements ViewBinding {

    @NonNull
    public final ImageView brlogo;

    @NonNull
    public final View healthBar;

    @NonNull
    public final UIContainer regContainer;

    @NonNull
    public final TextView regHeader;

    @NonNull
    public final TextView regInfo;

    @NonNull
    public final TextView regNickname;

    @NonNull
    public final ImageView regPerson;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    public final View view8;

    public RegistrationViewBinding(@NonNull LinearLayout rootView, @NonNull ImageView brlogo, @NonNull View healthBar, @NonNull UIContainer regContainer, @NonNull TextView regHeader, @NonNull TextView regInfo, @NonNull TextView regNickname, @NonNull ImageView regPerson, @NonNull View view8) {
        this.rootView = rootView;
        this.brlogo = brlogo;
        this.healthBar = healthBar;
        this.regContainer = regContainer;
        this.regHeader = regHeader;
        this.regInfo = regInfo;
        this.regNickname = regNickname;
        this.regPerson = regPerson;
        this.view8 = view8;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RegistrationViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RegistrationViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.registration_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RegistrationViewBinding bind(@NonNull View rootView) {
        int i = R.id.brlogo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.brlogo);
        if (imageView != null) {
            i = R.id.health_bar;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.health_bar);
            if (viewFindChildViewById != null) {
                i = R.id.reg_container;
                UIContainer uIContainer = (UIContainer) ViewBindings.findChildViewById(rootView, R.id.reg_container);
                if (uIContainer != null) {
                    i = R.id.reg_header;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.reg_header);
                    if (textView != null) {
                        i = R.id.reg_info;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reg_info);
                        if (textView2 != null) {
                            i = R.id.reg_nickname;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reg_nickname);
                            if (textView3 != null) {
                                i = R.id.reg_person;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.reg_person);
                                if (imageView2 != null) {
                                    i = R.id.view8;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.view8);
                                    if (viewFindChildViewById2 != null) {
                                        return new RegistrationViewBinding((LinearLayout) rootView, imageView, viewFindChildViewById, uIContainer, textView, textView2, textView3, imageView2, viewFindChildViewById2);
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
