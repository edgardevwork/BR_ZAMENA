package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.blackhub.bronline.game.gui.notification.viewmodel.NotificationViewModel;
import com.bless.client.R;

/* loaded from: classes2.dex */
public abstract class FragmentNotificationBinding extends ViewDataBinding {

    @Bindable
    public NotificationViewModel mVm;

    @NonNull
    public final RecyclerView notificationList;

    public abstract void setVm(@Nullable NotificationViewModel vm);

    public FragmentNotificationBinding(Object _bindingComponent, View _root, int _localFieldCount, RecyclerView notificationList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.notificationList = notificationList;
    }

    @Nullable
    public NotificationViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentNotificationBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_notification, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentNotificationBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_notification, null, false, component);
    }

    public static FragmentNotificationBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentNotificationBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentNotificationBinding) ViewDataBinding.bind(component, view, R.layout.fragment_notification);
    }
}
