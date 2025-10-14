package com.blackhub.bronline.game.gui.taxi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TaxiActionWithJSON.kt */
@StabilityInferred(parameters = 0)

public final class TaxiActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screen;

    public TaxiActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screen = 16;
    }

    public final void sendNext() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("b", 0);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendPrew() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("b", 1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendAccept() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("b", 2);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", -1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }
}

