package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class SocialNetworkLinkButtonBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final View socialNetworkLinkButtonAura;

    @NonNull
    public final View socialNetworkLinkButtonBgColorNotActive;

    @NonNull
    public final View socialNetworkLinkButtonBgStyleNotActive;

    @NonNull
    public final View socialNetworkLinkButtonBorder;

    @NonNull
    public final View socialNetworkLinkButtonIcon;

    @NonNull
    public final TextView socialNetworkLinkButtonName;

    public SocialNetworkLinkButtonBinding(@NonNull ConstraintLayout rootView, @NonNull View socialNetworkLinkButtonAura, @NonNull View socialNetworkLinkButtonBgColorNotActive, @NonNull View socialNetworkLinkButtonBgStyleNotActive, @NonNull View socialNetworkLinkButtonBorder, @NonNull View socialNetworkLinkButtonIcon, @NonNull TextView socialNetworkLinkButtonName) {
        this.rootView = rootView;
        this.socialNetworkLinkButtonAura = socialNetworkLinkButtonAura;
        this.socialNetworkLinkButtonBgColorNotActive = socialNetworkLinkButtonBgColorNotActive;
        this.socialNetworkLinkButtonBgStyleNotActive = socialNetworkLinkButtonBgStyleNotActive;
        this.socialNetworkLinkButtonBorder = socialNetworkLinkButtonBorder;
        this.socialNetworkLinkButtonIcon = socialNetworkLinkButtonIcon;
        this.socialNetworkLinkButtonName = socialNetworkLinkButtonName;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SocialNetworkLinkButtonBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SocialNetworkLinkButtonBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.social_network_link_button, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static SocialNetworkLinkButtonBinding bind(@NonNull View rootView) {
        int i = R.id.social_network_link_button_aura;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_aura);
        if (viewFindChildViewById != null) {
            i = R.id.social_network_link_button_bg_color_not_active;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_bg_color_not_active);
            if (viewFindChildViewById2 != null) {
                i = R.id.social_network_link_button_bg_style_not_active;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_bg_style_not_active);
                if (viewFindChildViewById3 != null) {
                    i = R.id.social_network_link_button_border;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_border);
                    if (viewFindChildViewById4 != null) {
                        i = R.id.social_network_link_button_icon;
                        View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_icon);
                        if (viewFindChildViewById5 != null) {
                            i = R.id.social_network_link_button_name;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.social_network_link_button_name);
                            if (textView != null) {
                                return new SocialNetworkLinkButtonBinding((ConstraintLayout) rootView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
