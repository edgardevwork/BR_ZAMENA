package com.blackhub.bronline.game.gui.electric.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MiniGamesElectricActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ElectricActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screen;

    public ElectricActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screen = 56;
    }

    public final void sendStartGame() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendFinishGame(int isWin) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", isWin);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 4);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }
}

