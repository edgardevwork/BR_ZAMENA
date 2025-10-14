package com.blackhub.bronline.game.gui.chat.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChatActionsWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ChatActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public ChatActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 80;
    }

    @NotNull
    public final GUIManager getGuiManager() {
        return this.guiManager;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final void sendOnVoteClick() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendText(@NotNull String text) throws JSONException {
        Intrinsics.checkNotNullParameter(text, "text");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        jSONObject.put("tx", text);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

