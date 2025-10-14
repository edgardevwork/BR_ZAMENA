package com.blackhub.bronline.game.gui.minigameshelper;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MiniGamesHelperWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MiniGamesHelperWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public MiniGamesHelperWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 31;
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendIfUntieScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendEndOfTime() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendLineHit() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendLineNotHit() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s", 0);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

