package com.blackhub.bronline.game.gui.interactionwithnpc;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractionWithNpcActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InteractionWithNpcActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public InteractionWithNpcActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 63;
    }

    public final void sendButtonClick(int buttonKey) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InteractionWithNpcKeys.INTERACTION_WITH_NPC_BUTTON_KEY, buttonKey);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCloseScreen(int screen) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", screen);
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

