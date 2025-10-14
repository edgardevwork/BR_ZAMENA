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
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tuning/viewmodel/TuningViewCarViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;", "(Lcom/blackhub/bronline/game/gui/tuning/network/TuningActionWithJSON;)V", "doorSwitch", "Lkotlinx/coroutines/flow/StateFlow;", "", "getDoorSwitch", "()Lkotlinx/coroutines/flow/StateFlow;", "lightSwitch", "getLightSwitch", "mutableDoorSwitch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableIfShowViewCar", "mutableLightSwitch", "newIfShowViewCar", "getNewIfShowViewCar", "sendDoorAction", "", "newDoorStatus", "sendLightStatus", "newLightStatus", "setShowStatus", "newStatus", "updateDoorStatus", "updateLightStatus", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
