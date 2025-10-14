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
public final class TuningDiagnosticItemBinding implements ViewBinding {

    @NonNull
    public final View bgHeaderDetailInDiagnostic;

    @NonNull
    public final View bgViewDetailInDiagnostic;

    @NonNull
    public final ConstraintLayout containerCostDetailInDiagnostic;

    @NonNull
    public final ImageView iconDetailInDiagnostic;

    @NonNull
    public final ImageView iconDetailsInDiagnostic;

    @NonNull
    public final ImageView iconStateDetailInDiagnostic;

    @NonNull
    public final TextView nameDetailInDiagnostic;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView valueCostDetailInDiagnostic;

    @NonNull
    public final TextView valueStateDetailInDiagnostic;

    public TuningDiagnosticItemBinding(@NonNull RelativeLayout rootView, @NonNull View bgHeaderDetailInDiagnostic, @NonNull View bgViewDetailInDiagnostic, @NonNull ConstraintLayout containerCostDetailInDiagnostic, @NonNull ImageView iconDetailInDiagnostic, @NonNull ImageView iconDetailsInDiagnostic, @NonNull ImageView iconStateDetailInDiagnostic, @NonNull TextView nameDetailInDiagnostic, @NonNull TextView valueCostDetailInDiagnostic, @NonNull TextView valueStateDetailInDiagnostic) {
        this.rootView = rootView;
        this.bgHeaderDetailInDiagnostic = bgHeaderDetailInDiagnostic;
        this.bgViewDetailInDiagnostic = bgViewDetailInDiagnostic;
        this.containerCostDetailInDiagnostic = containerCostDetailInDiagnostic;
        this.iconDetailInDiagnostic = iconDetailInDiagnostic;
        this.iconDetailsInDiagnostic = iconDetailsInDiagnostic;
        this.iconStateDetailInDiagnostic = iconStateDetailInDiagnostic;
        this.nameDetailInDiagnostic = nameDetailInDiagnostic;
        this.valueCostDetailInDiagnostic = valueCostDetailInDiagnostic;
        this.valueStateDetailInDiagnostic = valueStateDetailInDiagnostic;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningDiagnosticItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningDiagnosticItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_diagnostic_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningDiagnosticItemBinding bind(@NonNull View rootView) {
        int i = R.id.bg_header_detail_in_diagnostic;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_header_detail_in_diagnostic);
        if (viewFindChildViewById != null) {
            i = R.id.bg_view_detail_in_diagnostic;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_view_detail_in_diagnostic);
            if (viewFindChildViewById2 != null) {
                i = R.id.container_cost_detail_in_diagnostic;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.container_cost_detail_in_diagnostic);
                if (constraintLayout != null) {
                    i = R.id.icon_detail_in_diagnostic;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_detail_in_diagnostic);
                    if (imageView != null) {
                        i = R.id.icon_details_in_diagnostic;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_details_in_diagnostic);
                        if (imageView2 != null) {
                            i = R.id.icon_state_detail_in_diagnostic;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon_state_detail_in_diagnostic);
                            if (imageView3 != null) {
                                i = R.id.name_detail_in_diagnostic;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name_detail_in_diagnostic);
                                if (textView != null) {
                                    i = R.id.value_cost_detail_in_diagnostic;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_cost_detail_in_diagnostic);
                                    if (textView2 != null) {
                                        i = R.id.value_state_detail_in_diagnostic;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_state_detail_in_diagnostic);
                                        if (textView3 != null) {
                                            return new TuningDiagnosticItemBinding((RelativeLayout) rootView, viewFindChildViewById, viewFindChildViewById2, constraintLayout, imageView, imageView2, imageView3, textView, textView2, textView3);
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
