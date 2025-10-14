package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;
import com.google.android.material.slider.Slider;

/* loaded from: classes.dex */
public final class FragmentMenuSettingControlBinding implements ViewBinding {

    @NonNull
    public final TextView newMenuSettingButtonChangeWidget;

    @NonNull
    public final SwitchCompat newMenuSettingSwitchLookBack;

    @NonNull
    public final TextView newMenuSettingTitleChangeWidget;

    @NonNull
    public final TextView newMenuSettingTitleLookBack;

    @NonNull
    public final NestedScrollView nsvNewMenuControlLayout;

    @NonNull
    public final NestedScrollView rootView;

    @NonNull
    public final RecyclerView rvSettingMenuSwitchChat;

    @NonNull
    public final RecyclerView rvSettingMenuSwitchControl;

    @NonNull
    public final RecyclerView rvSettingMenuSwitchHud;

    @NonNull
    public final RecyclerView rvSettingMenuSwitchKeyboard;

    @NonNull
    public final Slider seekBarsSettingsAimingCamSensX;

    @NonNull
    public final Slider seekBarsSettingsAimingCamSensY;

    @NonNull
    public final Slider seekBarsSettingsCarCamSensX;

    @NonNull
    public final Slider seekBarsSettingsCarCamSensY;

    @NonNull
    public final Slider seekBarsSettingsCarControlSensibility;

    @NonNull
    public final TextView settingMenuCarControlSpinner;

    @NonNull
    public final TextView settingMenuCarControlTitle;

    @NonNull
    public final View settingMenuLeftBlock;

    @NonNull
    public final View settingMenuRightBlock;

    @NonNull
    public final TextView settingsMenuCarControlCamSensXTitle;

    @NonNull
    public final TextView settingsMenuCarControlCamSensXValue;

    @NonNull
    public final TextView settingsMenuCarControlCamSensYTitle;

    @NonNull
    public final TextView settingsMenuCarControlCamSensYValue;

    @NonNull
    public final TextView settingsMenuCarControlSensibilityTitle;

    @NonNull
    public final TextView settingsMenuCarControlSensibilityValue;

    @NonNull
    public final TextView settingsMenuControlAimingCamSensXTitle;

    @NonNull
    public final TextView settingsMenuControlAimingCamSensXValue;

    @NonNull
    public final TextView settingsMenuControlAimingCamSensYTitle;

    @NonNull
    public final TextView settingsMenuControlAimingCamSensYValue;

    @NonNull
    public final TextView tvSettingMenuSwitchChatSpinner;

    @NonNull
    public final TextView tvSettingMenuSwitchChatTitle;

    @NonNull
    public final TextView tvSettingMenuSwitchHudSpinner;

    @NonNull
    public final TextView tvSettingMenuSwitchHudTitle;

    @NonNull
    public final TextView tvSettingMenuSwitchKeyboardSpinner;

    @NonNull
    public final TextView tvSettingMenuSwitchKeyboardTitle;

    public FragmentMenuSettingControlBinding(@NonNull NestedScrollView rootView, @NonNull TextView newMenuSettingButtonChangeWidget, @NonNull SwitchCompat newMenuSettingSwitchLookBack, @NonNull TextView newMenuSettingTitleChangeWidget, @NonNull TextView newMenuSettingTitleLookBack, @NonNull NestedScrollView nsvNewMenuControlLayout, @NonNull RecyclerView rvSettingMenuSwitchChat, @NonNull RecyclerView rvSettingMenuSwitchControl, @NonNull RecyclerView rvSettingMenuSwitchHud, @NonNull RecyclerView rvSettingMenuSwitchKeyboard, @NonNull Slider seekBarsSettingsAimingCamSensX, @NonNull Slider seekBarsSettingsAimingCamSensY, @NonNull Slider seekBarsSettingsCarCamSensX, @NonNull Slider seekBarsSettingsCarCamSensY, @NonNull Slider seekBarsSettingsCarControlSensibility, @NonNull TextView settingMenuCarControlSpinner, @NonNull TextView settingMenuCarControlTitle, @NonNull View settingMenuLeftBlock, @NonNull View settingMenuRightBlock, @NonNull TextView settingsMenuCarControlCamSensXTitle, @NonNull TextView settingsMenuCarControlCamSensXValue, @NonNull TextView settingsMenuCarControlCamSensYTitle, @NonNull TextView settingsMenuCarControlCamSensYValue, @NonNull TextView settingsMenuCarControlSensibilityTitle, @NonNull TextView settingsMenuCarControlSensibilityValue, @NonNull TextView settingsMenuControlAimingCamSensXTitle, @NonNull TextView settingsMenuControlAimingCamSensXValue, @NonNull TextView settingsMenuControlAimingCamSensYTitle, @NonNull TextView settingsMenuControlAimingCamSensYValue, @NonNull TextView tvSettingMenuSwitchChatSpinner, @NonNull TextView tvSettingMenuSwitchChatTitle, @NonNull TextView tvSettingMenuSwitchHudSpinner, @NonNull TextView tvSettingMenuSwitchHudTitle, @NonNull TextView tvSettingMenuSwitchKeyboardSpinner, @NonNull TextView tvSettingMenuSwitchKeyboardTitle) {
        this.rootView = rootView;
        this.newMenuSettingButtonChangeWidget = newMenuSettingButtonChangeWidget;
        this.newMenuSettingSwitchLookBack = newMenuSettingSwitchLookBack;
        this.newMenuSettingTitleChangeWidget = newMenuSettingTitleChangeWidget;
        this.newMenuSettingTitleLookBack = newMenuSettingTitleLookBack;
        this.nsvNewMenuControlLayout = nsvNewMenuControlLayout;
        this.rvSettingMenuSwitchChat = rvSettingMenuSwitchChat;
        this.rvSettingMenuSwitchControl = rvSettingMenuSwitchControl;
        this.rvSettingMenuSwitchHud = rvSettingMenuSwitchHud;
        this.rvSettingMenuSwitchKeyboard = rvSettingMenuSwitchKeyboard;
        this.seekBarsSettingsAimingCamSensX = seekBarsSettingsAimingCamSensX;
        this.seekBarsSettingsAimingCamSensY = seekBarsSettingsAimingCamSensY;
        this.seekBarsSettingsCarCamSensX = seekBarsSettingsCarCamSensX;
        this.seekBarsSettingsCarCamSensY = seekBarsSettingsCarCamSensY;
        this.seekBarsSettingsCarControlSensibility = seekBarsSettingsCarControlSensibility;
        this.settingMenuCarControlSpinner = settingMenuCarControlSpinner;
        this.settingMenuCarControlTitle = settingMenuCarControlTitle;
        this.settingMenuLeftBlock = settingMenuLeftBlock;
        this.settingMenuRightBlock = settingMenuRightBlock;
        this.settingsMenuCarControlCamSensXTitle = settingsMenuCarControlCamSensXTitle;
        this.settingsMenuCarControlCamSensXValue = settingsMenuCarControlCamSensXValue;
        this.settingsMenuCarControlCamSensYTitle = settingsMenuCarControlCamSensYTitle;
        this.settingsMenuCarControlCamSensYValue = settingsMenuCarControlCamSensYValue;
        this.settingsMenuCarControlSensibilityTitle = settingsMenuCarControlSensibilityTitle;
        this.settingsMenuCarControlSensibilityValue = settingsMenuCarControlSensibilityValue;
        this.settingsMenuControlAimingCamSensXTitle = settingsMenuControlAimingCamSensXTitle;
        this.settingsMenuControlAimingCamSensXValue = settingsMenuControlAimingCamSensXValue;
        this.settingsMenuControlAimingCamSensYTitle = settingsMenuControlAimingCamSensYTitle;
        this.settingsMenuControlAimingCamSensYValue = settingsMenuControlAimingCamSensYValue;
        this.tvSettingMenuSwitchChatSpinner = tvSettingMenuSwitchChatSpinner;
        this.tvSettingMenuSwitchChatTitle = tvSettingMenuSwitchChatTitle;
        this.tvSettingMenuSwitchHudSpinner = tvSettingMenuSwitchHudSpinner;
        this.tvSettingMenuSwitchHudTitle = tvSettingMenuSwitchHudTitle;
        this.tvSettingMenuSwitchKeyboardSpinner = tvSettingMenuSwitchKeyboardSpinner;
        this.tvSettingMenuSwitchKeyboardTitle = tvSettingMenuSwitchKeyboardTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMenuSettingControlBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMenuSettingControlBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_menu_setting_control, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentMenuSettingControlBinding bind(@NonNull View rootView) {
        int i = R.id.new_menu_setting_button_change_widget;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_button_change_widget);
        if (textView != null) {
            i = R.id.new_menu_setting_switch_look_back;
            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_switch_look_back);
            if (switchCompat != null) {
                i = R.id.new_menu_setting_title_change_widget;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_change_widget);
                if (textView2 != null) {
                    i = R.id.new_menu_setting_title_look_back;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_look_back);
                    if (textView3 != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) rootView;
                        i = R.id.rvSettingMenuSwitchChat;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvSettingMenuSwitchChat);
                        if (recyclerView != null) {
                            i = R.id.rvSettingMenuSwitchControl;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvSettingMenuSwitchControl);
                            if (recyclerView2 != null) {
                                i = R.id.rvSettingMenuSwitchHud;
                                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvSettingMenuSwitchHud);
                                if (recyclerView3 != null) {
                                    i = R.id.rvSettingMenuSwitchKeyboard;
                                    RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvSettingMenuSwitchKeyboard);
                                    if (recyclerView4 != null) {
                                        i = R.id.seek_bars_settings_aiming_cam_sens_x;
                                        Slider slider = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bars_settings_aiming_cam_sens_x);
                                        if (slider != null) {
                                            i = R.id.seek_bars_settings_aiming_cam_sens_y;
                                            Slider slider2 = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bars_settings_aiming_cam_sens_y);
                                            if (slider2 != null) {
                                                i = R.id.seek_bars_settings_car_cam_sens_x;
                                                Slider slider3 = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bars_settings_car_cam_sens_x);
                                                if (slider3 != null) {
                                                    i = R.id.seek_bars_settings_car_cam_sens_y;
                                                    Slider slider4 = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bars_settings_car_cam_sens_y);
                                                    if (slider4 != null) {
                                                        i = R.id.seek_bars_settings_car_control_sensibility;
                                                        Slider slider5 = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bars_settings_car_control_sensibility);
                                                        if (slider5 != null) {
                                                            i = R.id.setting_menu_car_control_spinner;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.setting_menu_car_control_spinner);
                                                            if (textView4 != null) {
                                                                i = R.id.setting_menu_car_control_title;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.setting_menu_car_control_title);
                                                                if (textView5 != null) {
                                                                    i = R.id.setting_menu_left_block;
                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.setting_menu_left_block);
                                                                    if (viewFindChildViewById != null) {
                                                                        i = R.id.setting_menu_right_block;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.setting_menu_right_block);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            i = R.id.settings_menu_car_control_cam_sens_x_title;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_car_control_cam_sens_x_title);
                                                                            if (textView6 != null) {
                                                                                i = R.id.settings_menu_car_control_cam_sens_x_value;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_car_control_cam_sens_x_value);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.settings_menu_car_control_cam_sens_y_title;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_car_control_cam_sens_y_title);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.settings_menu_car_control_cam_sens_y_value;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_car_control_cam_sens_y_value);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.settings_menu_car_control_sensibility_title;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_car_control_sensibility_title);
                                                                                            if (textView10 != null) {
                                                                                                i = R.id.settings_menu_car_control_sensibility_value;
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_car_control_sensibility_value);
                                                                                                if (textView11 != null) {
                                                                                                    i = R.id.settings_menu_control_aiming_cam_sens_x_title;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_control_aiming_cam_sens_x_title);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.settings_menu_control_aiming_cam_sens_x_value;
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_control_aiming_cam_sens_x_value);
                                                                                                        if (textView13 != null) {
                                                                                                            i = R.id.settings_menu_control_aiming_cam_sens_y_title;
                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_control_aiming_cam_sens_y_title);
                                                                                                            if (textView14 != null) {
                                                                                                                i = R.id.settings_menu_control_aiming_cam_sens_y_value;
                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_menu_control_aiming_cam_sens_y_value);
                                                                                                                if (textView15 != null) {
                                                                                                                    i = R.id.tvSettingMenuSwitchChatSpinner;
                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSettingMenuSwitchChatSpinner);
                                                                                                                    if (textView16 != null) {
                                                                                                                        i = R.id.tvSettingMenuSwitchChatTitle;
                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSettingMenuSwitchChatTitle);
                                                                                                                        if (textView17 != null) {
                                                                                                                            i = R.id.tvSettingMenuSwitchHudSpinner;
                                                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSettingMenuSwitchHudSpinner);
                                                                                                                            if (textView18 != null) {
                                                                                                                                i = R.id.tvSettingMenuSwitchHudTitle;
                                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSettingMenuSwitchHudTitle);
                                                                                                                                if (textView19 != null) {
                                                                                                                                    i = R.id.tvSettingMenuSwitchKeyboardSpinner;
                                                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSettingMenuSwitchKeyboardSpinner);
                                                                                                                                    if (textView20 != null) {
                                                                                                                                        i = R.id.tvSettingMenuSwitchKeyboardTitle;
                                                                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvSettingMenuSwitchKeyboardTitle);
                                                                                                                                        if (textView21 != null) {
                                                                                                                                            return new FragmentMenuSettingControlBinding(nestedScrollView, textView, switchCompat, textView2, textView3, nestedScrollView, recyclerView, recyclerView2, recyclerView3, recyclerView4, slider, slider2, slider3, slider4, slider5, textView4, textView5, viewFindChildViewById, viewFindChildViewById2, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
