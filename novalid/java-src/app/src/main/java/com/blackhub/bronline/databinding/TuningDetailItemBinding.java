package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningDetailItemBinding implements ViewBinding {

    @NonNull
    public final View bgHeaderDetail;

    @NonNull
    public final View bgViewDetail;

    @NonNull
    public final ConstraintLayout containerCostDetail;

    @NonNull
    public final ImageView iconDetails;

    @NonNull
    public final ImageView iconValueCost;

    @NonNull
    public final TextView nameDetail;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView valueCost;

    public TuningDetailItemBinding(@NonNull RelativeLayout rootView, @NonNull View bgHeaderDetail, @NonNull View bgViewDetail, @NonNull ConstraintLayout containerCostDetail, @NonNull ImageView iconDetails, @NonNull ImageView iconValueCost, @NonNull TextView nameDetail, @NonNull TextView valueCost) {
        this.rootView = rootView;
        this.bgHeaderDetail = bgHeaderDetail;
        this.bgViewDetail = bgViewDetail;
        this.containerCostDetail = containerCostDetail;
        this.iconDetails = iconDetails;
        this.iconValueCost = iconValueCost;
        this.nameDetail = nameDetail;
        this.valueCost = valueCost;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningDetailItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningDetailItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_detail_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningDetailItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_header_detail;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_header_detail);
        if (viewFindChildViewById != null) {
            i = R.id.bg_view_detail;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_view_detail);
            if (viewFindChildViewById2 != null) {
                i = R.id.container_cost_detail;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container_cost_detail);
                if (constraintLayout != null) {
                    i = R.id.icon_details;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_details);
                    if (imageView != null) {
                        i = R.id.icon_value_cost;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_value_cost);
                        if (imageView2 != null) {
                            i = R.id.name_detail;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name_detail);
                            if (textView != null) {
                                i = R.id.value_cost;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_cost);
                                if (textView2 != null) {
                                    return new TuningDetailItemBinding((RelativeLayout) rootView, viewFindChildViewById, viewFindChildViewById2, constraintLayout, imageView, imageView2, textView, textView2);
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
