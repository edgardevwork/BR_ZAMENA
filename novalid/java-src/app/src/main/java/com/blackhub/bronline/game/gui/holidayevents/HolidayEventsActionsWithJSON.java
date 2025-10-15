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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/holidayevents/HolidayEventsActionsWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "getGuiManager", "()Lcom/blackhub/bronline/game/GUIManager;", "screenId", "", "sendButtonGainLvlUpPressed", "", "sendButtonGetPressed", "sendBuyDarkEnergy", "value", "sendCloseScreen", "sendGoToPurchaseBc", "sendLastChanceClicked", "sendOnButtonBpOfferClick", "sendPlayPressed", "id", "sendRefreshRating", "sendScreenPressed", "screen", "sendTaskPressed", "taskId", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
