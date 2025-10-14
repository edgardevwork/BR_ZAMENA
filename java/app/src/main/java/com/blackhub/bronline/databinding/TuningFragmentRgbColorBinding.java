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
import com.blackhub.bronline.game.common.colorpickerview.AlphaTileView;
import com.blackhub.bronline.game.common.colorpickerview.ColorPickerView;
import com.blackhub.bronline.game.common.colorpickerview.sliders.BrightnessSlideBar;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class TuningFragmentRgbColorBinding implements ViewBinding {

    @NonNull
    public final AlphaTileView alphaTileViewRgbColor;

    @NonNull
    public final AppCompatButton backToSubmenuRgbColor;

    @NonNull
    public final View bgChoiceViewRgbColor;

    @NonNull
    public final View bgSeekbarViewColor;

    @NonNull
    public final View bgSeekbarViewRgbColor;

    @NonNull
    public final RelativeLayout blockTextRgbColor;

    @NonNull
    public final ConstraintLayout blockWithThisRgbColor;

    @NonNull
    public final View border;

    @NonNull
    public final AppCompatButton buttonResetToningRgb;

    @NonNull
    public final AppCompatButton buttonSelectedColor;

    @NonNull
    public final AppCompatButton buttonViewCarRgbColor;

    @NonNull
    public final RelativeLayout choiceViewRgbColor;

    @NonNull
    public final ColorPickerView colorPickerRgb;

    @NonNull
    public final View helpViewRgb;

    @NonNull
    public final TextView listReadyColorsRgbColor;

    @NonNull
    public final TextView listRgbRgbColors;

    @NonNull
    public final LinearLayout menuBlockRadialColor;

    @NonNull
    public final LinearLayout menuBlockRgbColor;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout seekbarBlockRgbTransparency;

    @NonNull
    public final TextView seekbarHeaderColor;

    @NonNull
    public final TextView seekbarHeaderRgbColor;

    @NonNull
    public final RelativeLayout seekbarViewRgbColor;

    @NonNull
    public final TextView titlePriceBlockRgbColor;

    @NonNull
    public final TextView titleRbgColor;

    @NonNull
    public final ConstraintLayout tuningPriceRgbColor;

    @NonNull
    public final BrightnessSlideBar tuningSeekbarRgbColor;

    @NonNull
    public final SeekBar tuningSeekbarRgbTransparency;

    @NonNull
    public final TextView tuningValuePriceRgbColor;

    @NonNull
    public final View underlineReadyColorsRgbColor;

    @NonNull
    public final View underlineRgbRgbColor;

    @NonNull
    public final TextView valueTransparencyColor;

    public TuningFragmentRgbColorBinding(@NonNull RelativeLayout rootView, @NonNull AlphaTileView alphaTileViewRgbColor, @NonNull AppCompatButton backToSubmenuRgbColor, @NonNull View bgChoiceViewRgbColor, @NonNull View bgSeekbarViewColor, @NonNull View bgSeekbarViewRgbColor, @NonNull RelativeLayout blockTextRgbColor, @NonNull ConstraintLayout blockWithThisRgbColor, @NonNull View border, @NonNull AppCompatButton buttonResetToningRgb, @NonNull AppCompatButton buttonSelectedColor, @NonNull AppCompatButton buttonViewCarRgbColor, @NonNull RelativeLayout choiceViewRgbColor, @NonNull ColorPickerView colorPickerRgb, @NonNull View helpViewRgb, @NonNull TextView listReadyColorsRgbColor, @NonNull TextView listRgbRgbColors, @NonNull LinearLayout menuBlockRadialColor, @NonNull LinearLayout menuBlockRgbColor, @NonNull RelativeLayout seekbarBlockRgbTransparency, @NonNull TextView seekbarHeaderColor, @NonNull TextView seekbarHeaderRgbColor, @NonNull RelativeLayout seekbarViewRgbColor, @NonNull TextView titlePriceBlockRgbColor, @NonNull TextView titleRbgColor, @NonNull ConstraintLayout tuningPriceRgbColor, @NonNull BrightnessSlideBar tuningSeekbarRgbColor, @NonNull SeekBar tuningSeekbarRgbTransparency, @NonNull TextView tuningValuePriceRgbColor, @NonNull View underlineReadyColorsRgbColor, @NonNull View underlineRgbRgbColor, @NonNull TextView valueTransparencyColor) {
        this.rootView = rootView;
        this.alphaTileViewRgbColor = alphaTileViewRgbColor;
        this.backToSubmenuRgbColor = backToSubmenuRgbColor;
        this.bgChoiceViewRgbColor = bgChoiceViewRgbColor;
        this.bgSeekbarViewColor = bgSeekbarViewColor;
        this.bgSeekbarViewRgbColor = bgSeekbarViewRgbColor;
        this.blockTextRgbColor = blockTextRgbColor;
        this.blockWithThisRgbColor = blockWithThisRgbColor;
        this.border = border;
        this.buttonResetToningRgb = buttonResetToningRgb;
        this.buttonSelectedColor = buttonSelectedColor;
        this.buttonViewCarRgbColor = buttonViewCarRgbColor;
        this.choiceViewRgbColor = choiceViewRgbColor;
        this.colorPickerRgb = colorPickerRgb;
        this.helpViewRgb = helpViewRgb;
        this.listReadyColorsRgbColor = listReadyColorsRgbColor;
        this.listRgbRgbColors = listRgbRgbColors;
        this.menuBlockRadialColor = menuBlockRadialColor;
        this.menuBlockRgbColor = menuBlockRgbColor;
        this.seekbarBlockRgbTransparency = seekbarBlockRgbTransparency;
        this.seekbarHeaderColor = seekbarHeaderColor;
        this.seekbarHeaderRgbColor = seekbarHeaderRgbColor;
        this.seekbarViewRgbColor = seekbarViewRgbColor;
        this.titlePriceBlockRgbColor = titlePriceBlockRgbColor;
        this.titleRbgColor = titleRbgColor;
        this.tuningPriceRgbColor = tuningPriceRgbColor;
        this.tuningSeekbarRgbColor = tuningSeekbarRgbColor;
        this.tuningSeekbarRgbTransparency = tuningSeekbarRgbTransparency;
        this.tuningValuePriceRgbColor = tuningValuePriceRgbColor;
        this.underlineReadyColorsRgbColor = underlineReadyColorsRgbColor;
        this.underlineRgbRgbColor = underlineRgbRgbColor;
        this.valueTransparencyColor = valueTransparencyColor;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static TuningFragmentRgbColorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static TuningFragmentRgbColorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.tuning_fragment_rgb_color, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static TuningFragmentRgbColorBinding bind(@NonNull View rootView) {
        int i = R.id.alpha_tile_view_rgb_color;
        AlphaTileView alphaTileView = (AlphaTileView) ViewBindings.findChildViewById(rootView, R.id.alpha_tile_view_rgb_color);
        if (alphaTileView != null) {
            i = R.id.back_to_submenu_rgb_color;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.back_to_submenu_rgb_color);
            if (appCompatButton != null) {
                i = R.id.bg_choice_view_rgb_color;
                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg_choice_view_rgb_color);
                if (viewFindChildViewById != null) {
                    i = R.id.bg_seekbar_view_color;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.bg_seekbar_view_color);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.bg_seekbar_view_rgb_color;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.bg_seekbar_view_rgb_color);
                        if (viewFindChildViewById3 != null) {
                            i = R.id.block_text_rgb_color;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.block_text_rgb_color);
                            if (relativeLayout != null) {
                                i = R.id.block_with_this_rgb_color;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.block_with_this_rgb_color);
                                if (constraintLayout != null) {
                                    i = R.id.border;
                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.border);
                                    if (viewFindChildViewById4 != null) {
                                        i = R.id.button_reset_toning_rgb;
                                        AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_reset_toning_rgb);
                                        if (appCompatButton2 != null) {
                                            i = R.id.button_selected_color;
                                            AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_selected_color);
                                            if (appCompatButton3 != null) {
                                                i = R.id.button_view_car_rgb_color;
                                                AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_view_car_rgb_color);
                                                if (appCompatButton4 != null) {
                                                    i = R.id.choice_view_rgb_color;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.choice_view_rgb_color);
                                                    if (relativeLayout2 != null) {
                                                        i = R.id.color_picker_rgb;
                                                        ColorPickerView colorPickerView = (ColorPickerView) ViewBindings.findChildViewById(rootView, R.id.color_picker_rgb);
                                                        if (colorPickerView != null) {
                                                            i = R.id.help_view_rgb;
                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.help_view_rgb);
                                                            if (viewFindChildViewById5 != null) {
                                                                i = R.id.list_ready_colors_rgb_color;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.list_ready_colors_rgb_color);
                                                                if (textView != null) {
                                                                    i = R.id.list_rgb_rgb_colors;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.list_rgb_rgb_colors);
                                                                    if (textView2 != null) {
                                                                        i = R.id.menu_block_radial_color;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_block_radial_color);
                                                                        if (linearLayout != null) {
                                                                            i = R.id.menu_block_rgb_color;
                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.menu_block_rgb_color);
                                                                            if (linearLayout2 != null) {
                                                                                i = R.id.seekbar_block_rgb_transparency;
                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.seekbar_block_rgb_transparency);
                                                                                if (relativeLayout3 != null) {
                                                                                    i = R.id.seekbar_header_color;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.seekbar_header_color);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.seekbar_header_rgb_color;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.seekbar_header_rgb_color);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.seekbar_view_rgb_color;
                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.seekbar_view_rgb_color);
                                                                                            if (relativeLayout4 != null) {
                                                                                                i = R.id.title_price_block_rgb_color;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_price_block_rgb_color);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.title_rbg_color;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_rbg_color);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.tuning_price_rgb_color;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.tuning_price_rgb_color);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i = R.id.tuning_seekbar_rgb_color;
                                                                                                            BrightnessSlideBar brightnessSlideBar = (BrightnessSlideBar) ViewBindings.findChildViewById(rootView, R.id.tuning_seekbar_rgb_color);
                                                                                                            if (brightnessSlideBar != null) {
                                                                                                                i = R.id.tuning_seekbar_rgb_transparency;
                                                                                                                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.tuning_seekbar_rgb_transparency);
                                                                                                                if (seekBar != null) {
                                                                                                                    i = R.id.tuning_value_price_rgb_color;
                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tuning_value_price_rgb_color);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i = R.id.underline_ready_colors_rgb_color;
                                                                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(rootView, R.id.underline_ready_colors_rgb_color);
                                                                                                                        if (viewFindChildViewById6 != null) {
                                                                                                                            i = R.id.underline_rgb_rgb_color;
                                                                                                                            View viewFindChildViewById7 = ViewBindings.findChildViewById(rootView, R.id.underline_rgb_rgb_color);
                                                                                                                            if (viewFindChildViewById7 != null) {
                                                                                                                                i = R.id.value_transparency_color;
                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.value_transparency_color);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    return new TuningFragmentRgbColorBinding((RelativeLayout) rootView, alphaTileView, appCompatButton, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, relativeLayout, constraintLayout, viewFindChildViewById4, appCompatButton2, appCompatButton3, appCompatButton4, relativeLayout2, colorPickerView, viewFindChildViewById5, textView, textView2, linearLayout, linearLayout2, relativeLayout3, textView3, textView4, relativeLayout4, textView5, textView6, constraintLayout2, brightnessSlideBar, seekBar, textView7, viewFindChildViewById6, viewFindChildViewById7, textView8);
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
