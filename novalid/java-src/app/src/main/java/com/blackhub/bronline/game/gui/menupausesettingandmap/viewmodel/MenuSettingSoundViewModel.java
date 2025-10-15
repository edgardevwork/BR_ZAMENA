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
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0011J\u0006\u0010&\u001a\u00020\u001fJ\b\u0010'\u001a\u00020\u001fH\u0002J\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0011J\u000e\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0011J\u000e\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\r¨\u00063"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menupausesettingandmap/viewmodel/MenuSettingSoundViewModel;", "Landroidx/lifecycle/ViewModel;", "preferencesRepository", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "(Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;)V", "_alwaysOnVoiceChat", "Landroidx/lifecycle/MutableLiveData;", "", "_radioWithoutCensorship", "kotlin.jvm.PlatformType", "alwaysOnVoiceChat", "Landroidx/lifecycle/LiveData;", "getAlwaysOnVoiceChat", "()Landroidx/lifecycle/LiveData;", "isShowSpeakers", "isShowVoiceChat", "mutableAllSound", "", "mutableIsShowSpeakers", "mutableIsShowVoiceChat", "mutableMuteTheMicrophone", "mutableSpeakerVolume", "muteTheMicrophone", "getMuteTheMicrophone", "newAllSound", "getNewAllSound", "radioWithoutCensorship", "getRadioWithoutCensorship", "speakerVolume", "getSpeakerVolume", "initialParameters", "", "saveNewSettingParameter", "currentSettingKey", "", "newParameter", "setAllSound", "newSoundValue", "setDefaultParameters", "setInitFlag", "setRadioWithoutCensorship", "value", "setShowSpeakers", "isShowing", "setShowVoiceChat", "setSpeakerVolume", "newSpeakerVolume", "setTimerMuteTheMicrophone", "newTimer", "setTurnOnVoiceChat", "alwaysOn", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
