package com.blackhub.bronline.game.gui.rateapp.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RateAppActionWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RateAppActionWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public RateAppActionWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 72;
    }

    public final void sendButtonPressed(int type, int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", type);
        jSONObject.put("r", value);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendButtonClosePressed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

