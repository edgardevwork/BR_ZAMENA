package com.blackhub.bronline.game.gui.rent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RentActionWithJSON.kt */
@StabilityInferred(parameters = 0)

public final class RentActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public RentActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 6;
    }

    public final void sendOnClickButtonWithId(int buttonId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", buttonId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCloseInterface() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("s", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

