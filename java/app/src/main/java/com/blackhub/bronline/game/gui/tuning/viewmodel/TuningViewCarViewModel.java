package com.blackhub.bronline.game.gui.tuning.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* compiled from: TuningViewCarViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TuningViewCarViewModel extends ViewModel implements ViewModelProvider.Factory {
    public static final int $stable = 8;

    @NotNull
    public final TuningActionWithJSON actionWithJson;

    @NotNull
    public final StateFlow<Boolean> doorSwitch;

    @NotNull
    public final StateFlow<Boolean> lightSwitch;

    @NotNull
    public final MutableStateFlow<Boolean> mutableDoorSwitch;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIfShowViewCar;

    @NotNull
    public final MutableStateFlow<Boolean> mutableLightSwitch;

    @NotNull
    public final StateFlow<Boolean> newIfShowViewCar;

    @Inject
    public TuningViewCarViewModel(@NotNull TuningActionWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.mutableDoorSwitch = MutableStateFlow;
        this.doorSwitch = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.mutableLightSwitch = MutableStateFlow2;
        this.lightSwitch = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.mutableIfShowViewCar = MutableStateFlow3;
        this.newIfShowViewCar = MutableStateFlow3;
    }

    @NotNull
    public final StateFlow<Boolean> getDoorSwitch() {
        return this.doorSwitch;
    }

    @NotNull
    public final StateFlow<Boolean> getLightSwitch() {
        return this.lightSwitch;
    }

    @NotNull
    public final StateFlow<Boolean> getNewIfShowViewCar() {
        return this.newIfShowViewCar;
    }

    public final void updateDoorStatus() throws JSONException {
        boolean zBooleanValue = this.mutableDoorSwitch.getValue().booleanValue();
        this.mutableDoorSwitch.setValue(Boolean.valueOf(!zBooleanValue));
        sendDoorAction(!zBooleanValue);
    }

    public final void updateLightStatus() throws JSONException {
        boolean zBooleanValue = this.mutableLightSwitch.getValue().booleanValue();
        this.mutableLightSwitch.setValue(Boolean.valueOf(!zBooleanValue));
        sendLightStatus(!zBooleanValue);
    }

    public final void sendDoorAction(boolean newDoorStatus) throws JSONException {
        if (newDoorStatus) {
            this.actionWithJson.putPlayersActionToServer(13);
        } else {
            this.actionWithJson.putPlayersActionToServer(14);
        }
    }

    public final void sendLightStatus(boolean newLightStatus) throws JSONException {
        if (newLightStatus) {
            this.actionWithJson.putPlayersActionToServer(15);
        } else {
            this.actionWithJson.putPlayersActionToServer(16);
        }
    }

    public final void setShowStatus(boolean newStatus) {
        this.mutableIfShowViewCar.setValue(Boolean.valueOf(newStatus));
    }
}

