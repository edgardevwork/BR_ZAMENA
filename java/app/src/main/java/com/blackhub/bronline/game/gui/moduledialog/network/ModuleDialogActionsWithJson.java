package com.blackhub.bronline.game.gui.moduledialog.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ModuleDialogActionsWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ModuleDialogActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public ModuleDialogActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 81;
    }

    @NotNull
    public final GUIManager getGuiManager() {
        return this.guiManager;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final void sendButtonClicked(int btnId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", btnId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

