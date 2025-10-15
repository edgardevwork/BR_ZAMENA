package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentDetailsListBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton backToSubmenuDetail;

    @NonNull
    public final ImageView buttonInfoBrake;

    @NonNull
    public final AppCompatButton buttonResetDetail;

    @NonNull
    public final AppCompatButton buttonViewCarDetailsList;

    @NonNull
    public final View helpViewAboveListInDetailList;

    @NonNull
    public final View helpViewInDetailList;

    @NonNull
    public final LinearLayout menuBlockDetail;

    @NonNull
    public final RecyclerView recvDetailsList;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView titleDetailsList;

    @NonNull
    public final TextView titlePriceBlockDetails;

    @NonNull
    public final AppCompatButton tuningPriceDetail;

    public TuningFragmentDetailsListBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton backToSubmenuDetail, @NonNull ImageView buttonInfoBrake, @NonNull AppCompatButton buttonResetDetail, @NonNull AppCompatButton buttonViewCarDetailsList, @NonNull View helpViewAboveListInDetailList, @NonNull View helpViewInDetailList, @NonNull LinearLayout menuBlockDetail, @NonNull RecyclerView recvDetailsList, @NonNull TextView titleDetailsList, @NonNull TextView titlePriceBlockDetails, @NonNull AppCompatButton tuningPriceDetail) {
        this.rootView = rootView;
        this.backToSubmenuDetail = backToSubmenuDetail;
        this.buttonInfoBrake = buttonInfoBrake;
        this.buttonResetDetail = buttonResetDetail;
        this.buttonViewCarDetailsList = buttonViewCarDetailsList;
        this.helpViewAboveListInDetailList = helpViewAboveListInDetailList;
        this.helpViewInDetailList = helpViewInDetailList;
        this.menuBlockDetail = menuBlockDetail;
        this.recvDetailsList = recvDetailsList;
        this.titleDetailsList = titleDetailsList;
        this.titlePriceBlockDetails = titlePriceBlockDetails;
        this.tuningPriceDetail = tuningPriceDetail;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentDetailsListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentDetailsListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_details_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentDetailsListBinding bind(@NonNull View rootView) {
        int i = R.id.back_to_submenu_detail;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.back_to_submenu_detail);
        if (appCompatButton != null) {
            i = R.id.button_info_brake;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_info_brake);
            if (imageView != null) {
                i = R.id.button_reset_detail;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_reset_detail);
                if (appCompatButton2 != null) {
                    i = R.id.button_view_car_details_list;
                    AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_view_car_details_list);
                    if (appCompatButton3 != null) {
                        i = R.id.help_view_above_list_in_detail_list;
                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.help_view_above_list_in_detail_list);
                        if (viewFindChildViewById != null) {
                            i = R.id.help_view_in_detail_list;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.help_view_in_detail_list);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.menu_block_detail;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_block_detail);
                                if (linearLayout != null) {
                                    i = R.id.recv_details_list;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recv_details_list);
                                    if (recyclerView != null) {
                                        i = R.id.title_details_list;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_details_list);
                                        if (textView != null) {
                                            i = R.id.title_price_block_details;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_price_block_details);
                                            if (textView2 != null) {
                                                i = R.id.tuning_price_detail;
                                                AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.tuning_price_detail);
                                                if (appCompatButton4 != null) {
                                                    return new TuningFragmentDetailsListBinding((RelativeLayout) rootView, appCompatButton, imageView, appCompatButton2, appCompatButton3, viewFindChildViewById, viewFindChildViewById2, linearLayout, recyclerView, textView, textView2, appCompatButton4);
                                                }
                                            }
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
