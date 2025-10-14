package com.blackhub.bronline.game.gui.calendar.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CalendarActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CalendarActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public CalendarActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 71;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final void onClickButton(int buttonId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put("b", buttonId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void getReward(int typeGetReward, int rewardId, int rewardFrom) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", typeGetReward);
        jSONObject.put("l", rewardFrom);
        jSONObject.put("id", rewardId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

