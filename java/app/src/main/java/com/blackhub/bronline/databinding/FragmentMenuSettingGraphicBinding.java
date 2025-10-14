package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.CustomSliderWithFourDots;
import com.blackhub.bronline.game.gui.menupausesettingandmap.p016ui.CustomSliderWithThreeDots;
import com.bless.client.R;
import com.google.android.material.slider.Slider;

/* loaded from: classes.dex */
public final class FragmentMenuSettingGraphicBinding implements ViewBinding {

    @NonNull
    public final CustomSliderWithFourDots effectsQualitySeekBar;

    @NonNull
    public final Slider fpsSeekBar;

    @NonNull
    public final Slider graphicSeekBar;

    @NonNull
    public final TextView newMenuSettingSubInfoSmoothing;

    @NonNull
    public final SwitchCompat newMenuSettingSwitchSmoothing;

    @NonNull
    public final TextView newMenuSettingTitleEffectsQuality;

    @NonNull
    public final TextView newMenuSettingTitleFps;

    @NonNull
    public final TextView newMenuSettingTitleGraphic;

    @NonNull
    public final TextView newMenuSettingTitleReflectionOnCar;

    @NonNull
    public final TextView newMenuSettingTitleShadowQuality;

    @NonNull
    public final TextView newMenuSettingTitleSmoothing;

    @NonNull
    public final TextView newMenuSettingTitleVegetation;

    @NonNull
    public final TextView newMenuSettingTitleVisibilityRange;

    @NonNull
    public final TextView newMenuSettingTitleWaterQuality;

    @NonNull
    public final TextView newMenuSettingValueEffectsQuality;

    @NonNull
    public final TextView newMenuSettingValueFps;

    @NonNull
    public final TextView newMenuSettingValueGraphic;

    @NonNull
    public final TextView newMenuSettingValueReflectionOnCar;

    @NonNull
    public final TextView newMenuSettingValueShadowQuality;

    @NonNull
    public final TextView newMenuSettingValueVegetation;

    @NonNull
    public final TextView newMenuSettingValueVisibilityRange;

    @NonNull
    public final TextView newMenuSettingValueWaterQuality;

    @NonNull
    public final CustomSliderWithFourDots reflectionOnCarSeekBar;

    @NonNull
    public final NestedScrollView rootView;

    @NonNull
    public final View settingMenuLeftBlock;

    @NonNull
    public final CustomSliderWithFourDots shadowQualitySeekBar;

    @NonNull
    public final CustomSliderWithThreeDots vegetationSeekBar;

    @NonNull
    public final CustomSliderWithFourDots visibilityDistanceSeekBar;

    @NonNull
    public final CustomSliderWithFourDots waterQualitySeekBar;

    public FragmentMenuSettingGraphicBinding(@NonNull NestedScrollView rootView, @NonNull CustomSliderWithFourDots effectsQualitySeekBar, @NonNull Slider fpsSeekBar, @NonNull Slider graphicSeekBar, @NonNull TextView newMenuSettingSubInfoSmoothing, @NonNull SwitchCompat newMenuSettingSwitchSmoothing, @NonNull TextView newMenuSettingTitleEffectsQuality, @NonNull TextView newMenuSettingTitleFps, @NonNull TextView newMenuSettingTitleGraphic, @NonNull TextView newMenuSettingTitleReflectionOnCar, @NonNull TextView newMenuSettingTitleShadowQuality, @NonNull TextView newMenuSettingTitleSmoothing, @NonNull TextView newMenuSettingTitleVegetation, @NonNull TextView newMenuSettingTitleVisibilityRange, @NonNull TextView newMenuSettingTitleWaterQuality, @NonNull TextView newMenuSettingValueEffectsQuality, @NonNull TextView newMenuSettingValueFps, @NonNull TextView newMenuSettingValueGraphic, @NonNull TextView newMenuSettingValueReflectionOnCar, @NonNull TextView newMenuSettingValueShadowQuality, @NonNull TextView newMenuSettingValueVegetation, @NonNull TextView newMenuSettingValueVisibilityRange, @NonNull TextView newMenuSettingValueWaterQuality, @NonNull CustomSliderWithFourDots reflectionOnCarSeekBar, @NonNull View settingMenuLeftBlock, @NonNull CustomSliderWithFourDots shadowQualitySeekBar, @NonNull CustomSliderWithThreeDots vegetationSeekBar, @NonNull CustomSliderWithFourDots visibilityDistanceSeekBar, @NonNull CustomSliderWithFourDots waterQualitySeekBar) {
        this.rootView = rootView;
        this.effectsQualitySeekBar = effectsQualitySeekBar;
        this.fpsSeekBar = fpsSeekBar;
        this.graphicSeekBar = graphicSeekBar;
        this.newMenuSettingSubInfoSmoothing = newMenuSettingSubInfoSmoothing;
        this.newMenuSettingSwitchSmoothing = newMenuSettingSwitchSmoothing;
        this.newMenuSettingTitleEffectsQuality = newMenuSettingTitleEffectsQuality;
        this.newMenuSettingTitleFps = newMenuSettingTitleFps;
        this.newMenuSettingTitleGraphic = newMenuSettingTitleGraphic;
        this.newMenuSettingTitleReflectionOnCar = newMenuSettingTitleReflectionOnCar;
        this.newMenuSettingTitleShadowQuality = newMenuSettingTitleShadowQuality;
        this.newMenuSettingTitleSmoothing = newMenuSettingTitleSmoothing;
        this.newMenuSettingTitleVegetation = newMenuSettingTitleVegetation;
        this.newMenuSettingTitleVisibilityRange = newMenuSettingTitleVisibilityRange;
        this.newMenuSettingTitleWaterQuality = newMenuSettingTitleWaterQuality;
        this.newMenuSettingValueEffectsQuality = newMenuSettingValueEffectsQuality;
        this.newMenuSettingValueFps = newMenuSettingValueFps;
        this.newMenuSettingValueGraphic = newMenuSettingValueGraphic;
        this.newMenuSettingValueReflectionOnCar = newMenuSettingValueReflectionOnCar;
        this.newMenuSettingValueShadowQuality = newMenuSettingValueShadowQuality;
        this.newMenuSettingValueVegetation = newMenuSettingValueVegetation;
        this.newMenuSettingValueVisibilityRange = newMenuSettingValueVisibilityRange;
        this.newMenuSettingValueWaterQuality = newMenuSettingValueWaterQuality;
        this.reflectionOnCarSeekBar = reflectionOnCarSeekBar;
        this.settingMenuLeftBlock = settingMenuLeftBlock;
        this.shadowQualitySeekBar = shadowQualitySeekBar;
        this.vegetationSeekBar = vegetationSeekBar;
        this.visibilityDistanceSeekBar = visibilityDistanceSeekBar;
        this.waterQualitySeekBar = waterQualitySeekBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMenuSettingGraphicBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMenuSettingGraphicBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_menu_setting_graphic, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentMenuSettingGraphicBinding bind(@NonNull View rootView) {
        int i = R.id.effects_quality_seek_bar;
        CustomSliderWithFourDots customSliderWithFourDots = (CustomSliderWithFourDots) ViewBindings.findChildViewById(rootView, R.id.effects_quality_seek_bar);
        if (customSliderWithFourDots != null) {
            i = R.id.fps_seek_bar;
            Slider slider = (Slider) ViewBindings.findChildViewById(rootView, R.id.fps_seek_bar);
            if (slider != null) {
                i = R.id.graphic_seek_bar;
                Slider slider2 = (Slider) ViewBindings.findChildViewById(rootView, R.id.graphic_seek_bar);
                if (slider2 != null) {
                    i = R.id.new_menu_setting_sub_info_smoothing;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_sub_info_smoothing);
                    if (textView != null) {
                        i = R.id.new_menu_setting_switch_smoothing;
                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_switch_smoothing);
                        if (switchCompat != null) {
                            i = R.id.new_menu_setting_title_effects_quality;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_effects_quality);
                            if (textView2 != null) {
                                i = R.id.new_menu_setting_title_fps;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_fps);
                                if (textView3 != null) {
                                    i = R.id.new_menu_setting_title_graphic;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_graphic);
                                    if (textView4 != null) {
                                        i = R.id.new_menu_setting_title_reflection_on_car;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_reflection_on_car);
                                        if (textView5 != null) {
                                            i = R.id.new_menu_setting_title_shadow_quality;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_shadow_quality);
                                            if (textView6 != null) {
                                                i = R.id.new_menu_setting_title_smoothing;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_smoothing);
                                                if (textView7 != null) {
                                                    i = R.id.new_menu_setting_title_vegetation;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_vegetation);
                                                    if (textView8 != null) {
                                                        i = R.id.new_menu_setting_title_visibility_range;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_visibility_range);
                                                        if (textView9 != null) {
                                                            i = R.id.new_menu_setting_title_water_quality;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_water_quality);
                                                            if (textView10 != null) {
                                                                i = R.id.new_menu_setting_value_effects_quality;
                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_effects_quality);
                                                                if (textView11 != null) {
                                                                    i = R.id.new_menu_setting_value_fps;
                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_fps);
                                                                    if (textView12 != null) {
                                                                        i = R.id.new_menu_setting_value_graphic;
                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_graphic);
                                                                        if (textView13 != null) {
                                                                            i = R.id.new_menu_setting_value_reflection_on_car;
                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_reflection_on_car);
                                                                            if (textView14 != null) {
                                                                                i = R.id.new_menu_setting_value_shadow_quality;
                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_shadow_quality);
                                                                                if (textView15 != null) {
                                                                                    i = R.id.new_menu_setting_value_vegetation;
                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_vegetation);
                                                                                    if (textView16 != null) {
                                                                                        i = R.id.new_menu_setting_value_visibility_range;
                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_visibility_range);
                                                                                        if (textView17 != null) {
                                                                                            i = R.id.new_menu_setting_value_water_quality;
                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_water_quality);
                                                                                            if (textView18 != null) {
                                                                                                i = R.id.reflection_on_car_seek_bar;
                                                                                                CustomSliderWithFourDots customSliderWithFourDots2 = (CustomSliderWithFourDots) ViewBindings.findChildViewById(rootView, R.id.reflection_on_car_seek_bar);
                                                                                                if (customSliderWithFourDots2 != null) {
                                                                                                    i = R.id.setting_menu_left_block;
                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.setting_menu_left_block);
                                                                                                    if (viewFindChildViewById != null) {
                                                                                                        i = R.id.shadow_quality_seek_bar;
                                                                                                        CustomSliderWithFourDots customSliderWithFourDots3 = (CustomSliderWithFourDots) ViewBindings.findChildViewById(rootView, R.id.shadow_quality_seek_bar);
                                                                                                        if (customSliderWithFourDots3 != null) {
                                                                                                            i = R.id.vegetation_seek_bar;
                                                                                                            CustomSliderWithThreeDots customSliderWithThreeDots = (CustomSliderWithThreeDots) ViewBindings.findChildViewById(rootView, R.id.vegetation_seek_bar);
                                                                                                            if (customSliderWithThreeDots != null) {
                                                                                                                i = R.id.visibility_distance_seek_bar;
                                                                                                                CustomSliderWithFourDots customSliderWithFourDots4 = (CustomSliderWithFourDots) ViewBindings.findChildViewById(rootView, R.id.visibility_distance_seek_bar);
                                                                                                                if (customSliderWithFourDots4 != null) {
                                                                                                                    i = R.id.water_quality_seek_bar;
                                                                                                                    CustomSliderWithFourDots customSliderWithFourDots5 = (CustomSliderWithFourDots) ViewBindings.findChildViewById(rootView, R.id.water_quality_seek_bar);
                                                                                                                    if (customSliderWithFourDots5 != null) {
                                                                                                                        return new FragmentMenuSettingGraphicBinding((NestedScrollView) rootView, customSliderWithFourDots, slider, slider2, textView, switchCompat, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, customSliderWithFourDots2, viewFindChildViewById, customSliderWithFourDots3, customSliderWithThreeDots, customSliderWithFourDots4, customSliderWithFourDots5);
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
