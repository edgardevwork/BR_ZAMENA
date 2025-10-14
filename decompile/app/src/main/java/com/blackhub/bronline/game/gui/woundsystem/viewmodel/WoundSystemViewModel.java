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
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/woundsystem/viewmodel/WoundSystemViewModel;", "Landroidx/lifecycle/ViewModel;", "actionWithJson", "Lcom/blackhub/bronline/game/gui/woundsystem/network/ActionsWithJSON;", "(Lcom/blackhub/bronline/game/gui/woundsystem/network/ActionsWithJSON;)V", "isButtonHospitalBlocked", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "mutableIsButtonHospitalBlocked", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutablePlayer", "Lcom/blackhub/bronline/game/gui/woundsystem/data/PlayerInfo;", "mutableTimer", "", "player", "getPlayer", "timer", "Landroid/os/CountDownTimer;", "timerSec", "getTimerSec", "initData", "", "json", "Lorg/json/JSONObject;", "pressButton", "typeKey", "", "startTimer", "seconds", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
