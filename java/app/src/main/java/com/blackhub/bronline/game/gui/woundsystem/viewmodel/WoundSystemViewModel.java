package com.blackhub.bronline.game.gui.woundsystem.viewmodel;

import android.os.CountDownTimer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.blackhub.bronline.game.gui.woundsystem.data.PlayerInfo;
import com.blackhub.bronline.game.gui.woundsystem.network.ActionsWithJSON;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WoundSystemViewModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class WoundSystemViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final ActionsWithJSON actionWithJson;

    @NotNull
    public final StateFlow<Boolean> isButtonHospitalBlocked;

    @NotNull
    public final MutableStateFlow<Boolean> mutableIsButtonHospitalBlocked;

    @NotNull
    public final MutableStateFlow<PlayerInfo> mutablePlayer;

    @NotNull
    public final MutableStateFlow<Long> mutableTimer;

    @NotNull
    public final StateFlow<PlayerInfo> player;

    @Nullable
    public CountDownTimer timer;

    @NotNull
    public final StateFlow<Long> timerSec;

    @Inject
    public WoundSystemViewModel(@NotNull ActionsWithJSON actionWithJson) {
        Intrinsics.checkNotNullParameter(actionWithJson, "actionWithJson");
        this.actionWithJson = actionWithJson;
        MutableStateFlow<PlayerInfo> MutableStateFlow = StateFlowKt.MutableStateFlow(new PlayerInfo("", 0));
        this.mutablePlayer = MutableStateFlow;
        this.player = MutableStateFlow;
        MutableStateFlow<Long> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0L);
        this.mutableTimer = MutableStateFlow2;
        this.timerSec = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.mutableIsButtonHospitalBlocked = MutableStateFlow3;
        this.isButtonHospitalBlocked = MutableStateFlow3;
    }

    @NotNull
    public final StateFlow<PlayerInfo> getPlayer() {
        return this.player;
    }

    @NotNull
    public final StateFlow<Long> getTimerSec() {
        return this.timerSec;
    }

    @NotNull
    public final StateFlow<Boolean> isButtonHospitalBlocked() {
        return this.isButtonHospitalBlocked;
    }

    public final void initData(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        MutableStateFlow<PlayerInfo> mutableStateFlow = this.mutablePlayer;
        String strOptString = json.optString("p");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        mutableStateFlow.setValue(new PlayerInfo(strOptString, json.optInt("id")));
    }

    public final void pressButton(int typeKey) throws JSONException {
        this.actionWithJson.sendPressButton(typeKey);
    }

    public final void startTimer(long seconds) {
        this.mutableIsButtonHospitalBlocked.setValue(Boolean.TRUE);
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = new CountDownTimer(seconds * 1000) { // from class: com.blackhub.bronline.game.gui.woundsystem.viewmodel.WoundSystemViewModel.startTimer.1
            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                WoundSystemViewModel.this.mutableTimer.setValue(Long.valueOf(millisUntilFinished / 1000));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                WoundSystemViewModel.this.mutableIsButtonHospitalBlocked.setValue(Boolean.FALSE);
            }
        }.start();
    }
}

