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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentColorListBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton backToSubmenuColor;

    @NonNull
    public final View bgSeekbarViewColor;

    @NonNull
    public final RelativeLayout blockTextColor;

    @NonNull
    public final AppCompatButton buttonResetToningReady;

    @NonNull
    public final AppCompatButton buttonViewCarColor;

    @NonNull
    public final View helpView1;

    @NonNull
    public final TextView listReadyColors;

    @NonNull
    public final TextView listRgbColors;

    @NonNull
    public final LinearLayout menuBlockColor;

    @NonNull
    public final RecyclerView recvColorsList;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final TextView seekbarHeaderColor;

    @NonNull
    public final RelativeLayout seekbarViewColor;

    @NonNull
    public final TextView titlePriceBlockColor;

    @NonNull
    public final TextView tuningPriceColor;

    @NonNull
    public final SeekBar tuningSeekbarColor;

    @NonNull
    public final View underlineReadyColors;

    @NonNull
    public final View underlineRgb;

    @NonNull
    public final TextView valueTransparencyColor;

    public TuningFragmentColorListBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatButton backToSubmenuColor, @NonNull View bgSeekbarViewColor, @NonNull RelativeLayout blockTextColor, @NonNull AppCompatButton buttonResetToningReady, @NonNull AppCompatButton buttonViewCarColor, @NonNull View helpView1, @NonNull TextView listReadyColors, @NonNull TextView listRgbColors, @NonNull LinearLayout menuBlockColor, @NonNull RecyclerView recvColorsList, @NonNull TextView seekbarHeaderColor, @NonNull RelativeLayout seekbarViewColor, @NonNull TextView titlePriceBlockColor, @NonNull TextView tuningPriceColor, @NonNull SeekBar tuningSeekbarColor, @NonNull View underlineReadyColors, @NonNull View underlineRgb, @NonNull TextView valueTransparencyColor) {
        this.rootView = rootView;
        this.backToSubmenuColor = backToSubmenuColor;
        this.bgSeekbarViewColor = bgSeekbarViewColor;
        this.blockTextColor = blockTextColor;
        this.buttonResetToningReady = buttonResetToningReady;
        this.buttonViewCarColor = buttonViewCarColor;
        this.helpView1 = helpView1;
        this.listReadyColors = listReadyColors;
        this.listRgbColors = listRgbColors;
        this.menuBlockColor = menuBlockColor;
        this.recvColorsList = recvColorsList;
        this.seekbarHeaderColor = seekbarHeaderColor;
        this.seekbarViewColor = seekbarViewColor;
        this.titlePriceBlockColor = titlePriceBlockColor;
        this.tuningPriceColor = tuningPriceColor;
        this.tuningSeekbarColor = tuningSeekbarColor;
        this.underlineReadyColors = underlineReadyColors;
        this.underlineRgb = underlineRgb;
        this.valueTransparencyColor = valueTransparencyColor;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentColorListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentColorListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_color_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentColorListBinding bind(@NonNull View rootView) {
        int i = R.id.back_to_submenu_color;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.back_to_submenu_color);
        if (appCompatButton != null) {
            i = R.id.bg_seekbar_view_color;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_seekbar_view_color);
            if (viewFindChildViewById != null) {
                i = R.id.block_text_color;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.block_text_color);
                if (relativeLayout != null) {
                    i = R.id.button_reset_toning_ready;
                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_reset_toning_ready);
                    if (appCompatButton2 != null) {
                        i = R.id.button_view_car_color;
                        AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_view_car_color);
                        if (appCompatButton3 != null) {
                            i = R.id.help_view_1;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.help_view_1);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.list_ready_colors;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.list_ready_colors);
                                if (textView != null) {
                                    i = R.id.list_rgb_colors;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.list_rgb_colors);
                                    if (textView2 != null) {
                                        i = R.id.menu_block_color;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_block_color);
                                        if (linearLayout != null) {
                                            i = R.id.recv_colors_list;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recv_colors_list);
                                            if (recyclerView != null) {
                                                i = R.id.seekbar_header_color;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.seekbar_header_color);
                                                if (textView3 != null) {
                                                    i = R.id.seekbar_view_color;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.seekbar_view_color);
                                                    if (relativeLayout2 != null) {
                                                        i = R.id.title_price_block_color;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_price_block_color);
                                                        if (textView4 != null) {
                                                            i = R.id.tuning_price_color;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tuning_price_color);
                                                            if (textView5 != null) {
                                                                i = R.id.tuning_seekbar_color;
                                                                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.tuning_seekbar_color);
                                                                if (seekBar != null) {
                                                                    i = R.id.underline_ready_colors;
                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.underline_ready_colors);
                                                                    if (viewFindChildViewById3 != null) {
                                                                        i = R.id.underline_rgb;
                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.underline_rgb);
                                                                        if (viewFindChildViewById4 != null) {
                                                                            i = R.id.value_transparency_color;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_transparency_color);
                                                                            if (textView6 != null) {
                                                                                return new TuningFragmentColorListBinding((RelativeLayout) rootView, appCompatButton, viewFindChildViewById, relativeLayout, appCompatButton2, appCompatButton3, viewFindChildViewById2, textView, textView2, linearLayout, recyclerView, textView3, relativeLayout2, textView4, textView5, seekBar, viewFindChildViewById3, viewFindChildViewById4, textView6);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
