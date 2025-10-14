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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "sendCloseScreen", "", "sendGiftOpen", "sendOpenScreen", "type", "sendTopListOpen", "typeTopList", "sendUpgradeObjectUpgradeClick", "giftPosition", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
