package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
public abstract class FragmentTaxiBinding extends ViewDataBinding {

    @NonNull
    public final BrTaxiCommentBinding blockTaxiComment;

    @NonNull
    public final AppCompatButton brTaxiAccept;

    @NonNull
    public final TextView brTaxiCash;

    @NonNull
    public final AppCompatButton brTaxiClose;

    @NonNull
    public final ImageView brTaxiComm;

    @NonNull
    public final TextView brTaxiCountOrders;

    @NonNull
    public final TextView brTaxiDist;

    @NonNull
    public final TextView brTaxiEnd;

    @NonNull
    public final AppCompatButton brTaxiNext;

    @NonNull
    public final TextView brTaxiOrderText;

    @NonNull
    public final AppCompatButton brTaxiPrev;

    @NonNull
    public final TextView brTaxiPrice;

    @NonNull
    public final TextView brTaxiRating;

    @NonNull
    public final TextView brTaxiStart;

    @NonNull
    public final TextView brTaxiTime;

    @NonNull
    public final TextView brTaxiType;

    @NonNull
    public final TextView brTaxiTypeText;

    @NonNull
    public final View brTaxiVborder;

    @Bindable
    public TaxiViewModel mVm;

    @NonNull
    public final View view5;

    public abstract void setVm(@Nullable TaxiViewModel vm);

    public FragmentTaxiBinding(Object _bindingComponent, View _root, int _localFieldCount, BrTaxiCommentBinding blockTaxiComment, AppCompatButton brTaxiAccept, TextView brTaxiCash, AppCompatButton brTaxiClose, ImageView brTaxiComm, TextView brTaxiCountOrders, TextView brTaxiDist, TextView brTaxiEnd, AppCompatButton brTaxiNext, TextView brTaxiOrderText, AppCompatButton brTaxiPrev, TextView brTaxiPrice, TextView brTaxiRating, TextView brTaxiStart, TextView brTaxiTime, TextView brTaxiType, TextView brTaxiTypeText, View brTaxiVborder, View view5) {
        super(_bindingComponent, _root, _localFieldCount);
        this.blockTaxiComment = blockTaxiComment;
        this.brTaxiAccept = brTaxiAccept;
        this.brTaxiCash = brTaxiCash;
        this.brTaxiClose = brTaxiClose;
        this.brTaxiComm = brTaxiComm;
        this.brTaxiCountOrders = brTaxiCountOrders;
        this.brTaxiDist = brTaxiDist;
        this.brTaxiEnd = brTaxiEnd;
        this.brTaxiNext = brTaxiNext;
        this.brTaxiOrderText = brTaxiOrderText;
        this.brTaxiPrev = brTaxiPrev;
        this.brTaxiPrice = brTaxiPrice;
        this.brTaxiRating = brTaxiRating;
        this.brTaxiStart = brTaxiStart;
        this.brTaxiTime = brTaxiTime;
        this.brTaxiType = brTaxiType;
        this.brTaxiTypeText = brTaxiTypeText;
        this.brTaxiVborder = brTaxiVborder;
        this.view5 = view5;
    }

    @Nullable
    public TaxiViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static FragmentTaxiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTaxiBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentTaxiBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_taxi, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentTaxiBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentTaxiBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentTaxiBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_taxi, null, false, component);
    }

    public static FragmentTaxiBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTaxiBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentTaxiBinding) ViewDataBinding.bind(component, view, R.layout.fragment_taxi);
    }
}
