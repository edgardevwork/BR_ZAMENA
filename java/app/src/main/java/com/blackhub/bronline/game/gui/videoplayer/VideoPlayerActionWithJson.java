package com.blackhub.bronline.game.gui.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VideoPlayerActionWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class VideoPlayerActionWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screen;

    public VideoPlayerActionWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screen = 76;
    }

    public final void sendConfirmInModalWindow() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("g", 1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendDismissInModalWindow() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("g", 2);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }
}

