package com.blackhub.bronline.game.gui.playerslist.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayersListActionWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PlayersListActionWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public PlayersListActionWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void updateData() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            this.guiManager.sendJsonData(25, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void closedWindow() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 2);
            this.guiManager.sendJsonData(25, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

