package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.game.gui.socialnetworklink.viewmodel.SocialNetworkLinkViewModel;
import com.bless.client.R;

/* loaded from: classes2.dex */
public abstract class SocialNetworkLinkLayoutBinding extends ViewDataBinding {

    @Bindable
    public SocialNetworkLinkViewModel mVm;

    @NonNull
    public final View socialNetworkLinkAdd;

    @NonNull
    public final AppCompatButton socialNetworkLinkButtonClose;

    @NonNull
    public final RecyclerView socialNetworkLinkButtons;

    @NonNull
    public final AppCompatCheckBox socialNetworkLinkCheckbox;

    @NonNull
    public final TextView socialNetworkLinkCheckboxText;

    @NonNull
    public final TextView socialNetworkLinkDescription;

    @NonNull
    public final View socialNetworkLinkMoneyPresentBg;

    @NonNull
    public final TextView socialNetworkLinkPresentsTitle;

    @NonNull
    public final View socialNetworkLinkTitle;

    @NonNull
    public final View socialNetworkLinkVipPresentBg;

    public abstract void setVm(@Nullable SocialNetworkLinkViewModel vm);

    public SocialNetworkLinkLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount, View socialNetworkLinkAdd, AppCompatButton socialNetworkLinkButtonClose, RecyclerView socialNetworkLinkButtons, AppCompatCheckBox socialNetworkLinkCheckbox, TextView socialNetworkLinkCheckboxText, TextView socialNetworkLinkDescription, View socialNetworkLinkMoneyPresentBg, TextView socialNetworkLinkPresentsTitle, View socialNetworkLinkTitle, View socialNetworkLinkVipPresentBg) {
        super(_bindingComponent, _root, _localFieldCount);
        this.socialNetworkLinkAdd = socialNetworkLinkAdd;
        this.socialNetworkLinkButtonClose = socialNetworkLinkButtonClose;
        this.socialNetworkLinkButtons = socialNetworkLinkButtons;
        this.socialNetworkLinkCheckbox = socialNetworkLinkCheckbox;
        this.socialNetworkLinkCheckboxText = socialNetworkLinkCheckboxText;
        this.socialNetworkLinkDescription = socialNetworkLinkDescription;
        this.socialNetworkLinkMoneyPresentBg = socialNetworkLinkMoneyPresentBg;
        this.socialNetworkLinkPresentsTitle = socialNetworkLinkPresentsTitle;
        this.socialNetworkLinkTitle = socialNetworkLinkTitle;
        this.socialNetworkLinkVipPresentBg = socialNetworkLinkVipPresentBg;
    }

    @Nullable
    public SocialNetworkLinkViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static SocialNetworkLinkLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static SocialNetworkLinkLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (SocialNetworkLinkLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.social_network_link_layout, root, attachToRoot, component);
    }

    @NonNull
    public static SocialNetworkLinkLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static SocialNetworkLinkLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (SocialNetworkLinkLayoutBinding) ViewDataBinding.inflateInternal(inflater, R.layout.social_network_link_layout, null, false, component);
    }

    public static SocialNetworkLinkLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static SocialNetworkLinkLayoutBinding bind(@NonNull View view, @Nullable Object component) {
        return (SocialNetworkLinkLayoutBinding) ViewDataBinding.bind(component, view, R.layout.social_network_link_layout);
    }
}
