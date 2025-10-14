package com.blackhub.bronline.game.gui.clicker.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ClickerActionsWithJson.kt */
@StabilityInferred(parameters = 0)

public final class ClickerActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public ClickerActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 79;
    }

    @NotNull
    public final GUIManager getGuiManager() {
        return this.guiManager;
    }

    public final void sendCloseInterface() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendGameOverWithResult(int gameResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", gameResult);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

