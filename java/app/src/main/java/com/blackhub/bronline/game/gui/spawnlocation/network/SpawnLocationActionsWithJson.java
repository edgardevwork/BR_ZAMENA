package com.blackhub.bronline.game.gui.spawnlocation.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SpawnLocationActionsWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SpawnLocationActionsWithJson {
    public static final int $stable = 8;

    @Nullable
    public final GUIManager guiManager;

    public SpawnLocationActionsWithJson(@Nullable GUIManager gUIManager) {
        this.guiManager = gUIManager;
    }

    public final void sendKey(int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", value);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(50, jSONObject);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

