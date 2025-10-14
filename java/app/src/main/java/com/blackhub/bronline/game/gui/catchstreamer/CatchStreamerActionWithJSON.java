package com.blackhub.bronline.game.gui.catchstreamer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CatchStreamerActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CatchStreamerActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public CatchStreamerActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 57;
    }

    public final void buyTickets(@NotNull String emailOrSocial, int countTickets) throws JSONException {
        Intrinsics.checkNotNullParameter(emailOrSocial, "emailOrSocial");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        jSONObject.put("email", emailOrSocial);
        jSONObject.put(CatchStreamerKeys.COUNT_KEY, countTickets);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickGame() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 3);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCloseScreen(int screen) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", screen);
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(screen, jSONObject);
    }

    public final void sendIsParticipate(int isSuccess) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put("button", isSuccess);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickParticipate() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("u", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

