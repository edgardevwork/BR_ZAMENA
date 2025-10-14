package com.blackhub.bronline.game.gui.fishing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FishingActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FishingActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public FishingActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 59;
    }

    public final void fishingResult(int status) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FishingKeys.FISH_RESULT_KEY, status);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendInfoToServer(int action) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", action);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

