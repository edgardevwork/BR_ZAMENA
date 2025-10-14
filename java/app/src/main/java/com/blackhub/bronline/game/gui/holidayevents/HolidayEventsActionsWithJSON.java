package com.blackhub.bronline.game.gui.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.gui.holidayevents.enums.HolidayEventsScreenEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HolidayEventsActionsWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class HolidayEventsActionsWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public HolidayEventsActionsWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 30;
    }

    @NotNull
    public final GUIManager getGuiManager() {
        return this.guiManager;
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendPlayPressed(int id) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 5);
        jSONObject.put("b", 4);
        jSONObject.put("id", id);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendBuyDarkEnergy(int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put("e", value);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendTaskPressed(int taskId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 5);
        jSONObject.put("b", 2);
        jSONObject.put("id", taskId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendButtonGainLvlUpPressed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendRefreshRating() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 5);
        jSONObject.put("b", HolidayEventsScreenEnum.RATING.getValue());
        jSONObject.put("s", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendOnButtonBpOfferClick() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 3);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendScreenPressed(int screen) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 5);
        jSONObject.put("b", screen);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendButtonGetPressed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 6);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendGoToPurchaseBc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 7);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendLastChanceClicked() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 8);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

