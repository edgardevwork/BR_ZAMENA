package com.blackhub.bronline.game.gui.upgradeobjectevent;

import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UpgradeObjectEventActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class UpgradeObjectEventActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public UpgradeObjectEventActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 68;
    }

    public final void sendOpenScreen(@IntRange(from = 1, m10to = 2) int type) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", type);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendUpgradeObjectUpgradeClick(@IntRange(from = 1, m10to = 3) int giftPosition) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 3);
        jSONObject.put(UpgradeObjectEventKeys.EVENT_UPGRADE_POSITION_KEY, giftPosition);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendTopListOpen(@IntRange(from = 4, m10to = 5) int typeTopList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", typeTopList);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendGiftOpen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 6);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

