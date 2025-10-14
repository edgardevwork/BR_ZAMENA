package com.blackhub.bronline.game.gui.bprewards;

import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.binary.Base32;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BpRewardsActionWithJSON.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/bprewards/BpRewardsActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "sendButtonCasesPressed", "", "sendButtonFilterPressed", "filterPressed", "sendCloseScreen", "sendOnItemPressed", "id", "typeOfClickedButton", "sendRequestForNewItems", "sendRequestForNewItemsIfLessTwelve", "sendUpdateTanpin", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class BpRewardsActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public BpRewardsActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 74;
    }

    public final void sendUpdateTanpin() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 5);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendOnItemPressed(int id, int typeOfClickedButton) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 4);
        jSONObject.put("id", id);
        jSONObject.put("s", typeOfClickedButton);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendButtonFilterPressed(@IntRange(from = 1, m10to = Base32.MASK_3BITS) int filterPressed) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put(BpRewardsKeys.LIST_OF_ALARMS_FOR_BUTTONS_KEY, filterPressed);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendButtonCasesPressed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 3);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendRequestForNewItems() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendRequestForNewItemsIfLessTwelve() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        jSONObject.put("u", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}
