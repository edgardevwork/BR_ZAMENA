package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.data.DisplayFPS;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuSettingGraphicViewModel.kt */
@StabilityInferred(parameters = 0)

public final class MenuSettingGraphicViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MutableLiveData<Integer> _vegetation;

    @NotNull
    public final LiveData<DisplayFPS> displayFPS;

    @NotNull
    public final LiveData<Integer> effectQuality;

    @NotNull
    public final MutableLiveData<DisplayFPS> mutableDisplayFPS;

    @NotNull
    public final MutableLiveData<Integer> mutableEffectQuality;

    @NotNull
    public final MutableLiveData<Integer> mutableGraphicsDistance;

    @NotNull
    public final MutableLiveData<Integer> mutableGraphicsShadowQuality;

    @NotNull
    public final MutableLiveData<Integer> mutableGraphicsWaterQuality;

    @NotNull
    public final MutableLiveData<Integer> mutableParametersReflectionOnCar;

    @NotNull
    public final MutableLiveData<Boolean> mutableSSAA;

    @NotNull
    public final MutableLiveData<Integer> mutableValueOfResolution;

    @NotNull
    public final LiveData<Integer> newGraphicsDistance;

    @NotNull
    public final LiveData<Integer> newGraphicsShadowQuality;

    @NotNull
    public final LiveData<Integer> newGraphicsWaterQuality;

    @NotNull
    public final LiveData<Integer> newParametersReflectionOnCar;

    @NotNull
    public final LiveData<Boolean> newSSAA;

    @NotNull
    public final LiveData<Integer> newValueOfResolution;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final LiveData<Integer> vegetation;

    @Inject
    public MenuSettingGraphicViewModel(@NotNull PreferencesRepository preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableValueOfResolution = mutableLiveData;
        this.newValueOfResolution = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.mutableEffectQuality = mutableLiveData2;
        this.effectQuality = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.mutableGraphicsWaterQuality = mutableLiveData3;
        this.newGraphicsWaterQuality = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.mutableGraphicsShadowQuality = mutableLiveData4;
        this.newGraphicsShadowQuality = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>();
        this.mutableParametersReflectionOnCar = mutableLiveData5;
        this.newParametersReflectionOnCar = mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6 = new MutableLiveData<>();
        this.mutableGraphicsDistance = mutableLiveData6;
        this.newGraphicsDistance = mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7 = new MutableLiveData<>();
        this._vegetation = mutableLiveData7;
        this.vegetation = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.mutableSSAA = mutableLiveData8;
        this.newSSAA = mutableLiveData8;
        MutableLiveData<DisplayFPS> mutableLiveData9 = new MutableLiveData<>();
        this.mutableDisplayFPS = mutableLiveData9;
        this.displayFPS = mutableLiveData9;
    }

    @NotNull
    public final LiveData<Integer> getNewValueOfResolution() {
        return this.newValueOfResolution;
    }

    @NotNull
    public final LiveData<Integer> getEffectQuality() {
        return this.effectQuality;
    }

    @NotNull
    public final LiveData<Integer> getNewGraphicsWaterQuality() {
        return this.newGraphicsWaterQuality;
    }

    @NotNull
    public final LiveData<Integer> getNewGraphicsShadowQuality() {
        return this.newGraphicsShadowQuality;
    }

    @NotNull
    public final LiveData<Integer> getNewParametersReflectionOnCar() {
        return this.newParametersReflectionOnCar;
    }

    @NotNull
    public final LiveData<Integer> getNewGraphicsDistance() {
        return this.newGraphicsDistance;
    }

    @NotNull
    public final LiveData<Integer> getVegetation() {
        return this.vegetation;
    }

    @NotNull
    public final LiveData<Boolean> getNewSSAA() {
        return this.newSSAA;
    }

    @NotNull
    public final LiveData<DisplayFPS> getDisplayFPS() {
        return this.displayFPS;
    }

    public final void setResolution(int valueOfResolution) {
        this.mutableValueOfResolution.postValue(Integer.valueOf(valueOfResolution));
    }

    public final void setEffectQuality(int valueOfQuality) {
        this.mutableEffectQuality.postValue(Integer.valueOf(valueOfQuality));
    }

    public final void setGraphicsWaterQuality(int graphicsWaterQuality) {
        this.mutableGraphicsWaterQuality.postValue(Integer.valueOf(graphicsWaterQuality));
    }

    public final void setGraphicsShadowQuality(int graphicsShadowQuality) {
        this.mutableGraphicsShadowQuality.postValue(Integer.valueOf(graphicsShadowQuality));
    }

    public final void setParametersReflectionOnCar(int parametersReflectionOnCar) {
        this.mutableParametersReflectionOnCar.postValue(Integer.valueOf(parametersReflectionOnCar));
    }

    public final void setGraphicsDistance(int graphicsDistance) {
        this.mutableGraphicsDistance.postValue(Integer.valueOf(graphicsDistance));
    }

    public final void setVegetation(int vegetationValue) {
        this._vegetation.postValue(Integer.valueOf(vegetationValue));
    }

    public final void setSSAA(boolean isChecked) {
        this.mutableSSAA.postValue(Boolean.valueOf(isChecked));
    }

    public final void initFPS(@Nullable Float currentFPS, int maxFPS) {
        Number number = currentFPS;
        if (currentFPS == null) {
            number = 60;
        }
        this.mutableDisplayFPS.setValue(new DisplayFPS(maxFPS, number.intValue()));
    }

    public final void setValueOfFPS(int valueOfFPS) {
        DisplayFPS value = this.mutableDisplayFPS.getValue();
        DisplayFPS displayFPS = new DisplayFPS(60, 60);
        if (value != null) {
            if (valueOfFPS > value.getMaxFPS()) {
                valueOfFPS = value.getMaxFPS();
            }
            value.setCurrentFPS(valueOfFPS);
            displayFPS.setMaxFPS(value.getMaxFPS());
            displayFPS.setCurrentFPS(value.getCurrentFPS());
        }
        this.mutableDisplayFPS.setValue(displayFPS);
    }

    public final void sendNewSettingParameter(@NotNull String currentSettingKey, int newParameter) {
        Intrinsics.checkNotNullParameter(currentSettingKey, "currentSettingKey");
        this.preferencesRepository.putInteger(currentSettingKey, newParameter);
    }

    public final void setDefaultParameters() {
        setResolution(100);
        setEffectQuality(1);
        setGraphicsWaterQuality(0);
        setGraphicsShadowQuality(0);
        setParametersReflectionOnCar(0);
        setGraphicsDistance(1);
        setVegetation(0);
        DisplayFPS value = this.mutableDisplayFPS.getValue();
        setValueOfFPS(value != null ? value.getCurrentFPS() : 60);
        setSSAA(false);
        PreferencesRepository preferencesRepository = this.preferencesRepository;
        preferencesRepository.putInteger(NewMenuConstants.RESOLUTION, 100);
        preferencesRepository.putInteger(NewMenuConstants.EFFECT_QUALITY, 1);
        preferencesRepository.putInteger(NewMenuConstants.WATER_QUALITY, 0);
        preferencesRepository.putInteger(NewMenuConstants.SHADOW_QUALITY, 0);
        preferencesRepository.putInteger(NewMenuConstants.REFLECTION_ON_CAR, 0);
        preferencesRepository.putInteger(NewMenuConstants.DISTANCE, 1);
        preferencesRepository.putInteger(NewMenuConstants.VEGETATION, 0);
        DisplayFPS value2 = this.mutableDisplayFPS.getValue();
        preferencesRepository.putInteger(NewMenuConstants.FPS, value2 != null ? value2.getCurrentFPS() : 60);
        preferencesRepository.putInteger(NewMenuConstants.SSAA, 0);
        setInitFlag();
    }

    private final void setInitFlag() {
        this.preferencesRepository.putInteger(NewMenuConstants.IS_INIT_SETTING_GRAPHIC, 1);
    }

    public final void initialParameters() {
        if (PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.IS_INIT_SETTING_GRAPHIC, 0, 2, null) == -1) {
            setDefaultParameters();
            return;
        }
        PreferencesRepository preferencesRepository = this.preferencesRepository;
        setResolution(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.RESOLUTION, 0, 2, null));
        setEffectQuality(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.EFFECT_QUALITY, 0, 2, null));
        setGraphicsWaterQuality(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.WATER_QUALITY, 0, 2, null));
        setGraphicsShadowQuality(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.SHADOW_QUALITY, 0, 2, null));
        setParametersReflectionOnCar(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.REFLECTION_ON_CAR, 0, 2, null));
        setGraphicsDistance(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.DISTANCE, 0, 2, null));
        int integer$default = PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.VEGETATION, 0, 2, null);
        if (integer$default == -1) {
            sendNewSettingParameter(NewMenuConstants.VEGETATION, 0);
            integer$default = 0;
        }
        setVegetation(integer$default);
        setValueOfFPS(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.FPS, 0, 2, null));
        setSSAA(PreferencesRepository.getInteger$default(preferencesRepository, NewMenuConstants.SSAA, 0, 2, null) == 1);
    }
}

