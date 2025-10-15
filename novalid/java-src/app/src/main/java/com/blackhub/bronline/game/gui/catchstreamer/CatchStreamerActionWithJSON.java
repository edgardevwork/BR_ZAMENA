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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/catchstreamer/CatchStreamerActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "buyTickets", "", "emailOrSocial", "", "countTickets", "sendClickGame", "sendClickParticipate", "sendCloseScreen", "screen", "sendIsParticipate", "isSuccess", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
