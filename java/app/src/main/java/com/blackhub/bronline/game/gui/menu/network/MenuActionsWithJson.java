package com.blackhub.bronline.game.gui.menu.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MenuActionsWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MenuActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public MenuActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 14;
    }

    public final void putJSONObject(int index) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", index);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void openSettings() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("o", 1);
        this.guiManager.onPacketIncoming(47, jSONObject);
    }

    public final void dialogOpened() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", -1);
        jSONObject.put("i", 0);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void dialogClosed() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", -1);
        jSONObject.put("i", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

