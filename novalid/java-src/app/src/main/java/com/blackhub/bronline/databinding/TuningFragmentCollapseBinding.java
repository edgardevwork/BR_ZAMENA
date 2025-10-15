package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentCollapseBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton backToSubmenuCollapse;

    @NonNull
    public final View bgSeekbarCollapse;

    @NonNull
    public final AppCompatButton buttonResetCollapse;

    @NonNull
    public final AppCompatButton buttonViewCarCollapse;

    @NonNull
    public final LinearLayout menuBlockCollapse;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout seekbarCollapse;

    @NonNull
    public final TextView seekbarTitleCollapse;

    @NonNull
    public final TextView titlePriceBlockCollapse;

    @NonNull
    public final ConstraintLayout tuningPriceCollapse;

    @NonNull
    public final SeekBar tuningSeekbarCollapse;

    @NonNull
    public final TextView tuningValuePriceCollapse;

    @NonNull
    public final TextView valueThisCorner;

    public TuningFragmentCollapseBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton backToSubmenuCollapse, @NonNull View bgSeekbarCollapse, @NonNull AppCompatButton buttonResetCollapse, @NonNull AppCompatButton buttonViewCarCollapse, @NonNull LinearLayout menuBlockCollapse, @NonNull RelativeLayout seekbarCollapse, @NonNull TextView seekbarTitleCollapse, @NonNull TextView titlePriceBlockCollapse, @NonNull ConstraintLayout tuningPriceCollapse, @NonNull SeekBar tuningSeekbarCollapse, @NonNull TextView tuningValuePriceCollapse, @NonNull TextView valueThisCorner) {
        this.rootView = rootView;
        this.backToSubmenuCollapse = backToSubmenuCollapse;
        this.bgSeekbarCollapse = bgSeekbarCollapse;
        this.buttonResetCollapse = buttonResetCollapse;
        this.buttonViewCarCollapse = buttonViewCarCollapse;
        this.menuBlockCollapse = menuBlockCollapse;
        this.seekbarCollapse = seekbarCollapse;
        this.seekbarTitleCollapse = seekbarTitleCollapse;
        this.titlePriceBlockCollapse = titlePriceBlockCollapse;
        this.tuningPriceCollapse = tuningPriceCollapse;
        this.tuningSeekbarCollapse = tuningSeekbarCollapse;
        this.tuningValuePriceCollapse = tuningValuePriceCollapse;
        this.valueThisCorner = valueThisCorner;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentCollapseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentCollapseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_collapse, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentCollapseBinding bind(@NonNull View rootView) {
        int i = R.id.back_to_submenu_collapse;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.back_to_submenu_collapse);
        if (appCompatButton != null) {
            i = R.id.bg_seekbar_collapse;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_seekbar_collapse);
            if (viewFindChildViewById != null) {
                i = R.id.button_reset_collapse;
                AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_reset_collapse);
                if (appCompatButton2 != null) {
                    i = R.id.button_view_car_collapse;
                    AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_view_car_collapse);
                    if (appCompatButton3 != null) {
                        i = R.id.menu_block_collapse;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_block_collapse);
                        if (linearLayout != null) {
                            i = R.id.seekbar_collapse;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.seekbar_collapse);
                            if (relativeLayout != null) {
                                i = R.id.seekbar_title_collapse;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.seekbar_title_collapse);
                                if (textView != null) {
                                    i = R.id.title_price_block_collapse;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_price_block_collapse);
                                    if (textView2 != null) {
                                        i = R.id.tuning_price_collapse;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tuning_price_collapse);
                                        if (constraintLayout != null) {
                                            i = R.id.tuning_seekbar_collapse;
                                            SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.tuning_seekbar_collapse);
                                            if (seekBar != null) {
                                                i = R.id.tuning_value_price_collapse;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tuning_value_price_collapse);
                                                if (textView3 != null) {
                                                    i = R.id.value_this_corner;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_this_corner);
                                                    if (textView4 != null) {
                                                        return new TuningFragmentCollapseBinding((RelativeLayout) rootView, appCompatButton, viewFindChildViewById, appCompatButton2, appCompatButton3, linearLayout, relativeLayout, textView, textView2, constraintLayout, seekBar, textView3, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
