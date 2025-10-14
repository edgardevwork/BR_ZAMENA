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

