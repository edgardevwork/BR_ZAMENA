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
import com.bless.client.R;
import com.google.android.material.slider.Slider;

/* loaded from: classes.dex */
public final class FragmentMenuSettingSoundBinding implements ViewBinding {

    @NonNull
    public final Slider allSoundSeekBar;

    @NonNull
    public final SwitchCompat newMenuSettingSwitchAlwaysTurnOnVoiceChat;

    @NonNull
    public final SwitchCompat newMenuSettingSwitchRadioWithoutCensorship;

    @NonNull
    public final SwitchCompat newMenuSettingSwitchShowSpeakers;

    @NonNull
    public final SwitchCompat newMenuSettingSwitchShowVoiceChat;

    @NonNull
    public final TextView newMenuSettingTitleAlwaysTurnOnVoiceChat;

    @NonNull
    public final TextView newMenuSettingTitleMuteTheMicrophone;

    @NonNull
    public final TextView newMenuSettingTitleRadioWithoutCensorship;

    @NonNull
    public final TextView newMenuSettingTitleShowSpeakers;

    @NonNull
    public final TextView newMenuSettingTitleShowVoiceChat;

    @NonNull
    public final TextView newMenuSettingTitleSound;

    @NonNull
    public final TextView newMenuSettingTitleSpeakerVolume;

    @NonNull
    public final TextView newMenuSettingValueSound;

    @NonNull
    public final TextView newMenuSettingValueSpeakerVolume;

    @NonNull
    public final NestedScrollView rootView;

    @NonNull
    public final Slider seekBarMuteTheMicrophone;

    @NonNull
    public final Slider seekBarSpeakerVolume;

    public FragmentMenuSettingSoundBinding(@NonNull NestedScrollView rootView, @NonNull Slider allSoundSeekBar, @NonNull SwitchCompat newMenuSettingSwitchAlwaysTurnOnVoiceChat, @NonNull SwitchCompat newMenuSettingSwitchRadioWithoutCensorship, @NonNull SwitchCompat newMenuSettingSwitchShowSpeakers, @NonNull SwitchCompat newMenuSettingSwitchShowVoiceChat, @NonNull TextView newMenuSettingTitleAlwaysTurnOnVoiceChat, @NonNull TextView newMenuSettingTitleMuteTheMicrophone, @NonNull TextView newMenuSettingTitleRadioWithoutCensorship, @NonNull TextView newMenuSettingTitleShowSpeakers, @NonNull TextView newMenuSettingTitleShowVoiceChat, @NonNull TextView newMenuSettingTitleSound, @NonNull TextView newMenuSettingTitleSpeakerVolume, @NonNull TextView newMenuSettingValueSound, @NonNull TextView newMenuSettingValueSpeakerVolume, @NonNull Slider seekBarMuteTheMicrophone, @NonNull Slider seekBarSpeakerVolume) {
        this.rootView = rootView;
        this.allSoundSeekBar = allSoundSeekBar;
        this.newMenuSettingSwitchAlwaysTurnOnVoiceChat = newMenuSettingSwitchAlwaysTurnOnVoiceChat;
        this.newMenuSettingSwitchRadioWithoutCensorship = newMenuSettingSwitchRadioWithoutCensorship;
        this.newMenuSettingSwitchShowSpeakers = newMenuSettingSwitchShowSpeakers;
        this.newMenuSettingSwitchShowVoiceChat = newMenuSettingSwitchShowVoiceChat;
        this.newMenuSettingTitleAlwaysTurnOnVoiceChat = newMenuSettingTitleAlwaysTurnOnVoiceChat;
        this.newMenuSettingTitleMuteTheMicrophone = newMenuSettingTitleMuteTheMicrophone;
        this.newMenuSettingTitleRadioWithoutCensorship = newMenuSettingTitleRadioWithoutCensorship;
        this.newMenuSettingTitleShowSpeakers = newMenuSettingTitleShowSpeakers;
        this.newMenuSettingTitleShowVoiceChat = newMenuSettingTitleShowVoiceChat;
        this.newMenuSettingTitleSound = newMenuSettingTitleSound;
        this.newMenuSettingTitleSpeakerVolume = newMenuSettingTitleSpeakerVolume;
        this.newMenuSettingValueSound = newMenuSettingValueSound;
        this.newMenuSettingValueSpeakerVolume = newMenuSettingValueSpeakerVolume;
        this.seekBarMuteTheMicrophone = seekBarMuteTheMicrophone;
        this.seekBarSpeakerVolume = seekBarSpeakerVolume;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentMenuSettingSoundBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMenuSettingSoundBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_menu_setting_sound, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static FragmentMenuSettingSoundBinding bind(@NonNull View rootView) {
        int i = R.id.all_sound_seek_bar;
        Slider slider = (Slider) ViewBindings.findChildViewById(rootView, R.id.all_sound_seek_bar);
        if (slider != null) {
            i = R.id.new_menu_setting_switch_always_turn_on_voice_chat;
            SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_switch_always_turn_on_voice_chat);
            if (switchCompat != null) {
                i = R.id.new_menu_setting_switch_radio_without_censorship;
                SwitchCompat switchCompat2 = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_switch_radio_without_censorship);
                if (switchCompat2 != null) {
                    i = R.id.new_menu_setting_switch_show_speakers;
                    SwitchCompat switchCompat3 = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_switch_show_speakers);
                    if (switchCompat3 != null) {
                        i = R.id.new_menu_setting_switch_show_voice_chat;
                        SwitchCompat switchCompat4 = (SwitchCompat) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_switch_show_voice_chat);
                        if (switchCompat4 != null) {
                            i = R.id.new_menu_setting_title_always_turn_on_voice_chat;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_always_turn_on_voice_chat);
                            if (textView != null) {
                                i = R.id.new_menu_setting_title_mute_the_microphone;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_mute_the_microphone);
                                if (textView2 != null) {
                                    i = R.id.new_menu_setting_title_radio_without_censorship;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_radio_without_censorship);
                                    if (textView3 != null) {
                                        i = R.id.new_menu_setting_title_show_speakers;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_show_speakers);
                                        if (textView4 != null) {
                                            i = R.id.new_menu_setting_title_show_voice_chat;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_show_voice_chat);
                                            if (textView5 != null) {
                                                i = R.id.new_menu_setting_title_sound;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_sound);
                                                if (textView6 != null) {
                                                    i = R.id.new_menu_setting_title_speaker_volume;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_title_speaker_volume);
                                                    if (textView7 != null) {
                                                        i = R.id.new_menu_setting_value_sound;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_sound);
                                                        if (textView8 != null) {
                                                            i = R.id.new_menu_setting_value_speaker_volume;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_menu_setting_value_speaker_volume);
                                                            if (textView9 != null) {
                                                                i = R.id.seek_bar_mute_the_microphone;
                                                                Slider slider2 = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bar_mute_the_microphone);
                                                                if (slider2 != null) {
                                                                    i = R.id.seek_bar_speaker_volume;
                                                                    Slider slider3 = (Slider) ViewBindings.findChildViewById(rootView, R.id.seek_bar_speaker_volume);
                                                                    if (slider3 != null) {
                                                                        return new FragmentMenuSettingSoundBinding((NestedScrollView) rootView, slider, switchCompat, switchCompat2, switchCompat3, switchCompat4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, slider2, slider3);
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
