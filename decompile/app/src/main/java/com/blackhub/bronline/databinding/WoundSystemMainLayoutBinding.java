package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes3.dex */
public final class WoundSystemMainLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton buttonNeedHelp;

    @NonNull
    public final AppCompatButton buttonNeedHospital;

    @NonNull
    public final TextView playersNickAndId;

    @NonNull
    public final ConstraintLayout rootView;

    @NonNull
    public final TextView textInfoNeedHelp;

    @NonNull
    public final TextView textInfoNeedHospital1;

    @NonNull
    public final TextView textInfoNeedHospital2;

    @NonNull
    public final TextView textInfoNeedHospital3;

    @NonNull
    public final TextView titleDamage;

    @NonNull
    public final View viewSmile;

    @NonNull
    public final Group woundSystemHospitalTimerGroup;

    @NonNull
    public final Group woundSystemMainGroup;

    public WoundSystemMainLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton buttonNeedHelp, @NonNull AppCompatButton buttonNeedHospital, @NonNull TextView playersNickAndId, @NonNull TextView textInfoNeedHelp, @NonNull TextView textInfoNeedHospital1, @NonNull TextView textInfoNeedHospital2, @NonNull TextView textInfoNeedHospital3, @NonNull TextView titleDamage, @NonNull View viewSmile, @NonNull Group woundSystemHospitalTimerGroup, @NonNull Group woundSystemMainGroup) {
        this.rootView = rootView;
        this.buttonNeedHelp = buttonNeedHelp;
        this.buttonNeedHospital = buttonNeedHospital;
        this.playersNickAndId = playersNickAndId;
        this.textInfoNeedHelp = textInfoNeedHelp;
        this.textInfoNeedHospital1 = textInfoNeedHospital1;
        this.textInfoNeedHospital2 = textInfoNeedHospital2;
        this.textInfoNeedHospital3 = textInfoNeedHospital3;
        this.titleDamage = titleDamage;
        this.viewSmile = viewSmile;
        this.woundSystemHospitalTimerGroup = woundSystemHospitalTimerGroup;
        this.woundSystemMainGroup = woundSystemMainGroup;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WoundSystemMainLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WoundSystemMainLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wound_system_main_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static WoundSystemMainLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.button_need_help;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_need_help);
        if (appCompatButton != null) {
            i = R.id.button_need_hospital;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.button_need_hospital);
            if (appCompatButton2 != null) {
                i = R.id.players_nick_and_id;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.players_nick_and_id);
                if (textView != null) {
                    i = R.id.text_info_need_help;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_info_need_help);
                    if (textView2 != null) {
                        i = R.id.text_info_need_hospital_1;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_info_need_hospital_1);
                        if (textView3 != null) {
                            i = R.id.text_info_need_hospital_2;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_info_need_hospital_2);
                            if (textView4 != null) {
                                i = R.id.text_info_need_hospital_3;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text_info_need_hospital_3);
                                if (textView5 != null) {
                                    i = R.id.title_damage;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_damage);
                                    if (textView6 != null) {
                                        i = R.id.view_smile;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.view_smile);
                                        if (viewFindChildViewById != null) {
                                            i = R.id.wound_system_hospital_timer_group;
                                            Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.wound_system_hospital_timer_group);
                                            if (group != null) {
                                                i = R.id.wound_system_main_group;
                                                Group group2 = (Group) ViewBindings.findChildViewById(rootView, R.id.wound_system_main_group);
                                                if (group2 != null) {
                                                    return new WoundSystemMainLayoutBinding((ConstraintLayout) rootView, appCompatButton, appCompatButton2, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById, group, group2);
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
