package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MenuSettingSoundViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MenuSettingSoundViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MutableLiveData<Boolean> _alwaysOnVoiceChat;

    @NotNull
    public final MutableLiveData<Boolean> _radioWithoutCensorship;

    @NotNull
    public final LiveData<Boolean> alwaysOnVoiceChat;

    @NotNull
    public final LiveData<Boolean> isShowSpeakers;

    @NotNull
    public final LiveData<Boolean> isShowVoiceChat;

    @NotNull
    public final MutableLiveData<Integer> mutableAllSound;

    @NotNull
    public final MutableLiveData<Boolean> mutableIsShowSpeakers;

    @NotNull
    public final MutableLiveData<Boolean> mutableIsShowVoiceChat;

    @NotNull
    public final MutableLiveData<Integer> mutableMuteTheMicrophone;

    @NotNull
    public final MutableLiveData<Integer> mutableSpeakerVolume;

    @NotNull
    public final LiveData<Integer> muteTheMicrophone;

    @NotNull
    public final LiveData<Integer> newAllSound;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final LiveData<Boolean> radioWithoutCensorship;

    @NotNull
    public final LiveData<Integer> speakerVolume;

    @Inject
    public MenuSettingSoundViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableAllSound = mutableLiveData;
        this.newAllSound = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mutableSpeakerVolume = mutableLiveData2;
        this.speakerVolume = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.mutableMuteTheMicrophone = mutableLiveData3;
        this.muteTheMicrophone = mutableLiveData3;
        Boolean bool = Boolean.TRUE;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>(bool);
        this.mutableIsShowSpeakers = mutableLiveData4;
        this.isShowSpeakers = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>(bool);
        this.mutableIsShowVoiceChat = mutableLiveData5;
        this.isShowVoiceChat = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>(bool);
        this._alwaysOnVoiceChat = mutableLiveData6;
        this.alwaysOnVoiceChat = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>(Boolean.FALSE);
        this._radioWithoutCensorship = mutableLiveData7;
        this.radioWithoutCensorship = mutableLiveData7;
    }

    @NotNull
    public final LiveData<Integer> getNewAllSound() {
        return this.newAllSound;
    }

    @NotNull
    public final LiveData<Integer> getSpeakerVolume() {
        return this.speakerVolume;
    }

    @NotNull
    public final LiveData<Integer> getMuteTheMicrophone() {
        return this.muteTheMicrophone;
    }

    @NotNull
    public final LiveData<Boolean> isShowSpeakers() {
        return this.isShowSpeakers;
    }

    @NotNull
    public final LiveData<Boolean> isShowVoiceChat() {
        return this.isShowVoiceChat;
    }

    @NotNull
    public final LiveData<Boolean> getAlwaysOnVoiceChat() {
        return this.alwaysOnVoiceChat;
    }

    @NotNull
    public final LiveData<Boolean> getRadioWithoutCensorship() {
        return this.radioWithoutCensorship;
    }

    public final void setAllSound(int newSoundValue) {
        this.mutableAllSound.postValue(Integer.valueOf(newSoundValue));
    }

    public final void setSpeakerVolume(int newSpeakerVolume) {
        this.mutableSpeakerVolume.setValue(Integer.valueOf(newSpeakerVolume));
    }

    public final void setTimerMuteTheMicrophone(int newTimer) {
        this.mutableMuteTheMicrophone.setValue(Integer.valueOf(newTimer));
    }

    public final void setShowSpeakers(boolean isShowing) {
        this.mutableIsShowSpeakers.setValue(Boolean.valueOf(isShowing));
    }

    public final void setShowVoiceChat(boolean isShowing) {
        this.mutableIsShowVoiceChat.setValue(Boolean.valueOf(isShowing));
    }

    public final void setTurnOnVoiceChat(boolean alwaysOn) {
        this._alwaysOnVoiceChat.setValue(Boolean.valueOf(alwaysOn));
    }

    public final void setRadioWithoutCensorship(boolean value) {
        this._radioWithoutCensorship.setValue(Boolean.valueOf(value));
    }

    public final void saveNewSettingParameter(@NotNull String currentSettingKey, int newParameter) {
        Intrinsics.checkNotNullParameter(currentSettingKey, "currentSettingKey");
        this.preferencesRepository.putInteger(currentSettingKey, newParameter);
    }

    public final void setDefaultParameters() {
        setAllSound(100);
        setSpeakerVolume(100);
        setTimerMuteTheMicrophone(20);
        setShowSpeakers(true);
        setShowVoiceChat(true);
        setTurnOnVoiceChat(true);
        setRadioWithoutCensorship(false);
        saveNewSettingParameter(NewMenuConstants.ALL_SOUNDS, 100);
        saveNewSettingParameter(NewMenuConstants.PARAM_1, 100);
        saveNewSettingParameter(NewMenuConstants.PARAM_2, 20);
        saveNewSettingParameter(NewMenuConstants.PARAM_3, 1);
        saveNewSettingParameter(NewMenuConstants.PARAM_4, 1);
        saveNewSettingParameter(NewMenuConstants.PARAM_5, 1);
        saveNewSettingParameter(NewMenuConstants.PARAM_6, 0);
        setInitFlag();
    }

    private final void setInitFlag() {
        this.preferencesRepository.putInteger(NewMenuConstants.IS_INIT_SETTING_SOUND, 1);
    }

    public final void initialParameters() {
        if (PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.IS_INIT_SETTING_SOUND, 0, 2, null) == -1) {
            setDefaultParameters();
            return;
        }
        this.mutableAllSound.setValue(Integer.valueOf(PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.ALL_SOUNDS, 0, 2, null)));
        this.mutableSpeakerVolume.setValue(Integer.valueOf(PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_1, 0, 2, null)));
        this.mutableMuteTheMicrophone.setValue(Integer.valueOf(PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_2, 0, 2, null)));
        this.mutableIsShowSpeakers.setValue(Boolean.valueOf(IntExtensionKt.isOne(Integer.valueOf(PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_3, 0, 2, null)))));
        this.mutableIsShowVoiceChat.setValue(Boolean.valueOf(IntExtensionKt.isOne(Integer.valueOf(PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_4, 0, 2, null)))));
        this._alwaysOnVoiceChat.setValue(Boolean.valueOf(IntExtensionKt.isOne(Integer.valueOf(PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_5, 0, 2, null)))));
        this._radioWithoutCensorship.setValue(Boolean.valueOf(IntExtensionKt.isOne(Integer.valueOf(PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.PARAM_6, 0, 2, null)))));
    }
}

