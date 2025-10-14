package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class RadialMenuDialogBinding implements ViewBinding {

    @NonNull
    public final ImageView bgControlSuspension;

    @NonNull
    public final ImageView bgDoorLight;

    @NonNull
    public final ImageView bgLightSubmenu;

    @NonNull
    public final ImageView bgParkingKey;

    @NonNull
    public final ImageView bgSuspensionSubmenu;

    @NonNull
    public final ImageView bgTurboEngine;

    @NonNull
    public final ImageView bgTurboSubmenu;

    @NonNull
    public final ImageView buttonComfortPlus;

    @NonNull
    public final ImageView buttonDoor;

    @NonNull
    public final ImageView buttonDrift;

    @NonNull
    public final ImageView buttonEngine;

    @NonNull
    public final ImageView buttonHeadlights;

    @NonNull
    public final ImageView buttonHighLight;

    @NonNull
    public final ImageView buttonHydraulics;

    @NonNull
    public final ImageView buttonKey;

    @NonNull
    public final ImageView buttonLaunchControl;

    @NonNull
    public final ImageView buttonLight;

    @NonNull
    public final ImageView buttonNeon;

    @NonNull
    public final ImageView buttonParking;

    @NonNull
    public final ImageView buttonPnevmo1;

    @NonNull
    public final ImageView buttonPnevmo2;

    @NonNull
    public final ImageView buttonPnevmo3;

    @NonNull
    public final ImageView buttonSport;

    @NonNull
    public final ImageView buttonSportPlus;

    @NonNull
    public final ImageView buttonStroboscope;

    @NonNull
    public final ImageView buttonSuspension;

    @NonNull
    public final ImageView buttonTurbo;

    @NonNull
    public final Group groupLight;

    @NonNull
    public final Group groupSuspension;

    @NonNull
    public final Group groupTurbo;

    @NonNull
    public final ImageView radialClose;

    @NonNull
    public final ConstraintLayout rootView;

    public RadialMenuDialogBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bgControlSuspension, @NonNull ImageView bgDoorLight, @NonNull ImageView bgLightSubmenu, @NonNull ImageView bgParkingKey, @NonNull ImageView bgSuspensionSubmenu, @NonNull ImageView bgTurboEngine, @NonNull ImageView bgTurboSubmenu, @NonNull ImageView buttonComfortPlus, @NonNull ImageView buttonDoor, @NonNull ImageView buttonDrift, @NonNull ImageView buttonEngine, @NonNull ImageView buttonHeadlights, @NonNull ImageView buttonHighLight, @NonNull ImageView buttonHydraulics, @NonNull ImageView buttonKey, @NonNull ImageView buttonLaunchControl, @NonNull ImageView buttonLight, @NonNull ImageView buttonNeon, @NonNull ImageView buttonParking, @NonNull ImageView buttonPnevmo1, @NonNull ImageView buttonPnevmo2, @NonNull ImageView buttonPnevmo3, @NonNull ImageView buttonSport, @NonNull ImageView buttonSportPlus, @NonNull ImageView buttonStroboscope, @NonNull ImageView buttonSuspension, @NonNull ImageView buttonTurbo, @NonNull Group groupLight, @NonNull Group groupSuspension, @NonNull Group groupTurbo, @NonNull ImageView radialClose) {
        this.rootView = rootView;
        this.bgControlSuspension = bgControlSuspension;
        this.bgDoorLight = bgDoorLight;
        this.bgLightSubmenu = bgLightSubmenu;
        this.bgParkingKey = bgParkingKey;
        this.bgSuspensionSubmenu = bgSuspensionSubmenu;
        this.bgTurboEngine = bgTurboEngine;
        this.bgTurboSubmenu = bgTurboSubmenu;
        this.buttonComfortPlus = buttonComfortPlus;
        this.buttonDoor = buttonDoor;
        this.buttonDrift = buttonDrift;
        this.buttonEngine = buttonEngine;
        this.buttonHeadlights = buttonHeadlights;
        this.buttonHighLight = buttonHighLight;
        this.buttonHydraulics = buttonHydraulics;
        this.buttonKey = buttonKey;
        this.buttonLaunchControl = buttonLaunchControl;
        this.buttonLight = buttonLight;
        this.buttonNeon = buttonNeon;
        this.buttonParking = buttonParking;
        this.buttonPnevmo1 = buttonPnevmo1;
        this.buttonPnevmo2 = buttonPnevmo2;
        this.buttonPnevmo3 = buttonPnevmo3;
        this.buttonSport = buttonSport;
        this.buttonSportPlus = buttonSportPlus;
        this.buttonStroboscope = buttonStroboscope;
        this.buttonSuspension = buttonSuspension;
        this.buttonTurbo = buttonTurbo;
        this.groupLight = groupLight;
        this.groupSuspension = groupSuspension;
        this.groupTurbo = groupTurbo;
        this.radialClose = radialClose;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static RadialMenuDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static RadialMenuDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.radial_menu_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static RadialMenuDialogBinding bind(@NonNull View rootView) {
        int i = R.id.bg_control_suspension;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_control_suspension);
        if (imageView != null) {
            i = R.id.bg_door_light;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_door_light);
            if (imageView2 != null) {
                i = R.id.bg_light_submenu;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_light_submenu);
                if (imageView3 != null) {
                    i = R.id.bg_parking_key;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_parking_key);
                    if (imageView4 != null) {
                        i = R.id.bg_suspension_submenu;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_suspension_submenu);
                        if (imageView5 != null) {
                            i = R.id.bg_turbo_engine;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_turbo_engine);
                            if (imageView6 != null) {
                                i = R.id.bg_turbo_submenu;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bg_turbo_submenu);
                                if (imageView7 != null) {
                                    i = R.id.button_comfort_plus;
                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_comfort_plus);
                                    if (imageView8 != null) {
                                        i = R.id.button_door;
                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_door);
                                        if (imageView9 != null) {
                                            i = R.id.button_drift;
                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_drift);
                                            if (imageView10 != null) {
                                                i = R.id.button_engine;
                                                ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_engine);
                                                if (imageView11 != null) {
                                                    i = R.id.button_headlights;
                                                    ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_headlights);
                                                    if (imageView12 != null) {
                                                        i = R.id.button_high_light;
                                                        ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_high_light);
                                                        if (imageView13 != null) {
                                                            i = R.id.button_hydraulics;
                                                            ImageView imageView14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_hydraulics);
                                                            if (imageView14 != null) {
                                                                i = R.id.button_key;
                                                                ImageView imageView15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_key);
                                                                if (imageView15 != null) {
                                                                    i = R.id.button_launch_control;
                                                                    ImageView imageView16 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_launch_control);
                                                                    if (imageView16 != null) {
                                                                        i = R.id.button_light;
                                                                        ImageView imageView17 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_light);
                                                                        if (imageView17 != null) {
                                                                            i = R.id.button_neon;
                                                                            ImageView imageView18 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_neon);
                                                                            if (imageView18 != null) {
                                                                                i = R.id.button_parking;
                                                                                ImageView imageView19 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_parking);
                                                                                if (imageView19 != null) {
                                                                                    i = R.id.button_pnevmo1;
                                                                                    ImageView imageView20 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_pnevmo1);
                                                                                    if (imageView20 != null) {
                                                                                        i = R.id.button_pnevmo2;
                                                                                        ImageView imageView21 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_pnevmo2);
                                                                                        if (imageView21 != null) {
                                                                                            i = R.id.button_pnevmo3;
                                                                                            ImageView imageView22 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_pnevmo3);
                                                                                            if (imageView22 != null) {
                                                                                                i = R.id.button_sport;
                                                                                                ImageView imageView23 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_sport);
                                                                                                if (imageView23 != null) {
                                                                                                    i = R.id.button_sport_plus;
                                                                                                    ImageView imageView24 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_sport_plus);
                                                                                                    if (imageView24 != null) {
                                                                                                        i = R.id.button_stroboscope;
                                                                                                        ImageView imageView25 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_stroboscope);
                                                                                                        if (imageView25 != null) {
                                                                                                            i = R.id.button_suspension;
                                                                                                            ImageView imageView26 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_suspension);
                                                                                                            if (imageView26 != null) {
                                                                                                                i = R.id.button_turbo;
                                                                                                                ImageView imageView27 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.button_turbo);
                                                                                                                if (imageView27 != null) {
                                                                                                                    i = R.id.group_light;
                                                                                                                    Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.group_light);
                                                                                                                    if (group != null) {
                                                                                                                        i = R.id.group_suspension;
                                                                                                                        Group group2 = (Group) ViewBindings.findChildViewById(rootView, R.id.group_suspension);
                                                                                                                        if (group2 != null) {
                                                                                                                            i = R.id.group_turbo;
                                                                                                                            Group group3 = (Group) ViewBindings.findChildViewById(rootView, R.id.group_turbo);
                                                                                                                            if (group3 != null) {
                                                                                                                                i = R.id.radial_close;
                                                                                                                                ImageView imageView28 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.radial_close);
                                                                                                                                if (imageView28 != null) {
                                                                                                                                    return new RadialMenuDialogBinding((ConstraintLayout) rootView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, imageView23, imageView24, imageView25, imageView26, imageView27, group, group2, group3, imageView28);
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
