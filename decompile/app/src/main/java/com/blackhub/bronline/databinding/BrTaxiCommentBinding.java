package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blackhub.bronline.game.gui.taxi.TaxiViewModel;
import com.bless.client.R;

/* loaded from: classes2.dex */
public abstract class BrTaxiCommentBinding extends ViewDataBinding {

    @NonNull
    public final AppCompatButton brTaxiCommentClose;

    @NonNull
    public final TextView brTaxiCommentComm;

    @NonNull
    public final TextView brTaxiCommentTitle;

    @Bindable
    public TaxiViewModel mData;

    public abstract void setData(@Nullable TaxiViewModel data);

    public BrTaxiCommentBinding(Object _bindingComponent, View _root, int _localFieldCount, AppCompatButton brTaxiCommentClose, TextView brTaxiCommentComm, TextView brTaxiCommentTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.brTaxiCommentClose = brTaxiCommentClose;
        this.brTaxiCommentComm = brTaxiCommentComm;
        this.brTaxiCommentTitle = brTaxiCommentTitle;
    }

    @Nullable
    public TaxiViewModel getData() {
        return this.mData;
    }

    @NonNull
    public static BrTaxiCommentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BrTaxiCommentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (BrTaxiCommentBinding) ViewDataBinding.inflateInternal(inflater, R.layout.br_taxi_comment, root, attachToRoot, component);
    }

    @NonNull
    public static BrTaxiCommentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BrTaxiCommentBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (BrTaxiCommentBinding) ViewDataBinding.inflateInternal(inflater, R.layout.br_taxi_comment, null, false, component);
    }

    public static BrTaxiCommentBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BrTaxiCommentBinding bind(@NonNull View view, @Nullable Object component) {
        return (BrTaxiCommentBinding) ViewDataBinding.bind(component, view, R.layout.br_taxi_comment);
    }
}
