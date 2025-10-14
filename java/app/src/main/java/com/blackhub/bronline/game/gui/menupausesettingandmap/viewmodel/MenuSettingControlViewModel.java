package com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.core.extension.ViewModelExtensionKt;
import com.blackhub.bronline.game.core.preferences.PreferencesRepository;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.blackhub.bronline.game.gui.menupausesettingandmap.network.NewMenuActionWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* compiled from: MenuSettingControlViewModel.kt */
@StabilityInferred(parameters = 0)

public final class MenuSettingControlViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final MutableLiveData<Integer> _chatVersion;

    @NotNull
    public final MutableLiveData<Integer> _hudVersion;

    @NotNull
    public final MutableLiveData<Integer> _keyboardVersion;

    @NotNull
    public final NewMenuActionWithJSON actionWithJson;

    @NotNull
    public final LiveData<Integer> chatVersion;

    @NotNull
    public final LiveData<Integer> hudVersion;

    @NotNull
    public final LiveData<Integer> keyboardVersion;

    @NotNull
    public final MutableLiveData<Integer> mutableCarControl;

    @NotNull
    public final MutableLiveData<Boolean> mutableLookBack;

    @NotNull
    public final MutableLiveData<Float> mutableValueOfAimingCamXSensibility;

    @NotNull
    public final MutableLiveData<Float> mutableValueOfAimingCamYSensibility;

    @NotNull
    public final MutableLiveData<Float> mutableValueOfCamXSensibility;

    @NotNull
    public final MutableLiveData<Float> mutableValueOfCamYSensibility;

    @NotNull
    public final MutableLiveData<Float> mutableValueOfCarControlSensibility;

    @NotNull
    public final LiveData<Integer> newCarControl;

    @NotNull
    public final LiveData<Boolean> newLookBack;

    @NotNull
    public final PreferencesRepository preferencesRepository;

    @NotNull
    public final LiveData<Float> valueOfAimingCamXSensibility;

    @NotNull
    public final LiveData<Float> valueOfAimingCamYSensibility;

    @NotNull
    public final LiveData<Float> valueOfCamXSensibility;

    @NotNull
    public final LiveData<Float> valueOfCamYSensibility;

    @NotNull
    public final LiveData<Float> valueOfCarControlSensibility;

    @Inject
    public MenuSettingControlViewModel(@NotNull PreferencesRepository preferencesRepository, @NotNull NewMenuActionWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.preferencesRepository = preferencesRepository;
        this.actionWithJson = actionWithJson;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.mutableCarControl = mutableLiveData;
        this.newCarControl = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this._hudVersion = mutableLiveData2;
        this.hudVersion = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this._chatVersion = mutableLiveData3;
        this.chatVersion = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this._keyboardVersion = mutableLiveData4;
        this.keyboardVersion = mutableLiveData4;
        MutableLiveData<Float> mutableLiveData5 = new MutableLiveData<>();
        this.mutableValueOfCarControlSensibility = mutableLiveData5;
        this.valueOfCarControlSensibility = mutableLiveData5;
        MutableLiveData<Float> mutableLiveData6 = new MutableLiveData<>();
        this.mutableValueOfCamXSensibility = mutableLiveData6;
        this.valueOfCamXSensibility = mutableLiveData6;
        MutableLiveData<Float> mutableLiveData7 = new MutableLiveData<>();
        this.mutableValueOfCamYSensibility = mutableLiveData7;
        this.valueOfCamYSensibility = mutableLiveData7;
        MutableLiveData<Float> mutableLiveData8 = new MutableLiveData<>();
        this.mutableValueOfAimingCamXSensibility = mutableLiveData8;
        this.valueOfAimingCamXSensibility = mutableLiveData8;
        MutableLiveData<Float> mutableLiveData9 = new MutableLiveData<>();
        this.mutableValueOfAimingCamYSensibility = mutableLiveData9;
        this.valueOfAimingCamYSensibility = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>();
        this.mutableLookBack = mutableLiveData10;
        this.newLookBack = mutableLiveData10;
    }

    @NotNull
    public final LiveData<Integer> getNewCarControl() {
        return this.newCarControl;
    }

    @NotNull
    public final LiveData<Integer> getHudVersion() {
        return this.hudVersion;
    }

    @NotNull
    public final LiveData<Integer> getChatVersion() {
        return this.chatVersion;
    }

    @NotNull
    public final LiveData<Integer> getKeyboardVersion() {
        return this.keyboardVersion;
    }

    @NotNull
    public final LiveData<Float> getValueOfCarControlSensibility() {
        return this.valueOfCarControlSensibility;
    }

    @NotNull
    public final LiveData<Float> getValueOfCamXSensibility() {
        return this.valueOfCamXSensibility;
    }

    @NotNull
    public final LiveData<Float> getValueOfCamYSensibility() {
        return this.valueOfCamYSensibility;
    }

    @NotNull
    public final LiveData<Float> getValueOfAimingCamXSensibility() {
        return this.valueOfAimingCamXSensibility;
    }

    @NotNull
    public final LiveData<Float> getValueOfAimingCamYSensibility() {
        return this.valueOfAimingCamYSensibility;
    }

    @NotNull
    public final LiveData<Boolean> getNewLookBack() {
        return this.newLookBack;
    }

    public final void setCarControl(int controlStatus) {
        this.mutableCarControl.postValue(Integer.valueOf(controlStatus));
        this.preferencesRepository.putInteger(NewMenuConstants.CAR_CONTROL, controlStatus);
    }

    public final void setHudVersion(int version) {
        if (version == -1) {
            version = 1;
        }
        this._hudVersion.postValue(Integer.valueOf(version));
        this.preferencesRepository.putInteger(NewMenuConstants.HUD_VERSION, version);
    }

    public final void setChatVersion(int version) {
        if (version == -1) {
            version = 1;
        }
        this._chatVersion.postValue(Integer.valueOf(version));
        this.preferencesRepository.putInteger(NewMenuConstants.CHAT_VERSION, version);
    }

    public final void setKeyboardVersion(int version) {
        if (version == -1) {
            version = 1;
        }
        this._keyboardVersion.postValue(Integer.valueOf(version));
        this.preferencesRepository.putInteger(NewMenuConstants.KEYBOARD_VERSION, version);
    }

    public final void setLookBack(boolean newStatusLookBack) {
        this.mutableLookBack.postValue(Boolean.valueOf(newStatusLookBack));
        if (newStatusLookBack) {
            this.preferencesRepository.putInteger(NewMenuConstants.LOOK_BACK, 1);
        } else {
            this.preferencesRepository.putInteger(NewMenuConstants.LOOK_BACK, 0);
        }
    }

    public final void setValueOfCarControlSensibility(float valueOfSensibility) {
        this.mutableValueOfCarControlSensibility.postValue(Float.valueOf(valueOfSensibility));
    }

    public final void setValueOfCamXSensibility(float valueOfCamXSensibility) {
        this.mutableValueOfCamXSensibility.postValue(Float.valueOf(valueOfCamXSensibility));
    }

    public final void setValueOfCamYSensibility(float valueOfCamYSensibility) {
        this.mutableValueOfCamYSensibility.postValue(Float.valueOf(valueOfCamYSensibility));
    }

    public final void setValueOfAimingCamXSensibility(float valueOfCamXSensibility) {
        this.mutableValueOfAimingCamXSensibility.postValue(Float.valueOf(valueOfCamXSensibility));
    }

    public final void setValueOfAimingCamYSensibility(float valueOfCamYSensibility) {
        this.mutableValueOfAimingCamYSensibility.postValue(Float.valueOf(valueOfCamYSensibility));
    }

    public final void saveInPreferencesFloatParams(@NotNull String key, float savedValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferencesRepository.putFloat(key, savedValue);
    }

    public final void setDefaultParameters() {
        setCarControl(0);
        setHudVersion(1);
        setChatVersion(1);
        setKeyboardVersion(1);
        setLookBack(true);
        setValueOfCarControlSensibility(1.0f);
        setValueOfCamXSensibility(1.0f);
        setValueOfCamYSensibility(1.0f);
        setValueOfAimingCamXSensibility(1.0f);
        setValueOfAimingCamYSensibility(1.0f);
        saveAllDataInPreference();
        setInitFlag();
    }

    public final void saveAllDataInPreference() {
        saveInPreferencesFloatParams(NewMenuConstants.CAR_CONTROL_SENSIBILITY, 1.0f);
        saveInPreferencesFloatParams(NewMenuConstants.CAR_CAMERA_X_SENSIBILITY, 1.0f);
        saveInPreferencesFloatParams(NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY, 1.0f);
        saveInPreferencesFloatParams(NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY, 1.0f);
        saveInPreferencesFloatParams(NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY, 1.0f);
    }

    private final void setInitFlag() {
        this.preferencesRepository.putInteger(NewMenuConstants.IS_INIT_SETTING_CONTROL, 1);
    }

    public final void initialParameters() {
        if (PreferencesRepository.getInteger$default(this.preferencesRepository, NewMenuConstants.IS_INIT_SETTING_CONTROL, 0, 2, null) == -1) {
            setDefaultParameters();
        } else {
            ViewModelExtensionKt.launchOnDefault$default(this, null, new C43661(null), 1, null);
        }
    }

    /* compiled from: MenuSettingControlViewModel.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel$initialParameters$1", m7120f = "MenuSettingControlViewModel.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.gui.menupausesettingandmap.viewmodel.MenuSettingControlViewModel$initialParameters$1 */
    /* loaded from: classes7.dex */
    public static final class C43661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C43661(Continuation<? super C43661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenuSettingControlViewModel.this.new C43661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C43661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                int integer$default = PreferencesRepository.getInteger$default(MenuSettingControlViewModel.this.preferencesRepository, NewMenuConstants.HUD_VERSION, 0, 2, null);
                if (integer$default == -1) {
                    integer$default = 1;
                }
                int integer$default2 = PreferencesRepository.getInteger$default(MenuSettingControlViewModel.this.preferencesRepository, NewMenuConstants.CHAT_VERSION, 0, 2, null);
                if (integer$default2 == -1) {
                    integer$default2 = 1;
                }
                int integer$default3 = PreferencesRepository.getInteger$default(MenuSettingControlViewModel.this.preferencesRepository, NewMenuConstants.KEYBOARD_VERSION, 0, 2, null);
                if (integer$default3 == -1) {
                    integer$default3 = 1;
                }
                MenuSettingControlViewModel.this.mutableCarControl.postValue(Boxing.boxInt(PreferencesRepository.getInteger$default(MenuSettingControlViewModel.this.preferencesRepository, NewMenuConstants.CAR_CONTROL, 0, 2, null)));
                MenuSettingControlViewModel.this._hudVersion.postValue(Boxing.boxInt(integer$default));
                MenuSettingControlViewModel.this._chatVersion.postValue(Boxing.boxInt(integer$default2));
                MenuSettingControlViewModel.this._keyboardVersion.postValue(Boxing.boxInt(integer$default3));
                MenuSettingControlViewModel.this.mutableLookBack.postValue(Boxing.boxBoolean(PreferencesRepository.getInteger$default(MenuSettingControlViewModel.this.preferencesRepository, NewMenuConstants.LOOK_BACK, 0, 2, null) == 1));
                MenuSettingControlViewModel menuSettingControlViewModel = MenuSettingControlViewModel.this;
                menuSettingControlViewModel.setValueOfCarControlSensibility(menuSettingControlViewModel.preferencesRepository.getFloat(NewMenuConstants.CAR_CONTROL_SENSIBILITY));
                MenuSettingControlViewModel menuSettingControlViewModel2 = MenuSettingControlViewModel.this;
                menuSettingControlViewModel2.setValueOfCamXSensibility(menuSettingControlViewModel2.preferencesRepository.getFloat(NewMenuConstants.CAR_CAMERA_X_SENSIBILITY));
                MenuSettingControlViewModel menuSettingControlViewModel3 = MenuSettingControlViewModel.this;
                menuSettingControlViewModel3.setValueOfCamYSensibility(menuSettingControlViewModel3.preferencesRepository.getFloat(NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY));
                MenuSettingControlViewModel menuSettingControlViewModel4 = MenuSettingControlViewModel.this;
                menuSettingControlViewModel4.setValueOfAimingCamXSensibility(menuSettingControlViewModel4.preferencesRepository.getFloat(NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY));
                MenuSettingControlViewModel menuSettingControlViewModel5 = MenuSettingControlViewModel.this;
                menuSettingControlViewModel5.setValueOfAimingCamYSensibility(menuSettingControlViewModel5.preferencesRepository.getFloat(NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void changeWidget() throws JSONException {
        this.actionWithJson.changeWidget();
    }
}

