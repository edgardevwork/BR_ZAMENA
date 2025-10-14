package com.blackhub.bronline.game.gui.menupausesettingandmap.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NewMenuActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class NewMenuActionWithJSON {
    public static final int $stable = 8;

    @Nullable
    public final GUIManager guiManager;

    public NewMenuActionWithJSON(@Nullable GUIManager gUIManager) {
        this.guiManager = gUIManager;
    }

    public final void clickButton(int thisButton) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("b", thisButton);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(47, jSONObject);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void changeWidget() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("b", 5);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(47, jSONObject);
            }
            GUIManager gUIManager2 = this.guiManager;
            if (gUIManager2 != null) {
                gUIManager2.closeGUI(null, 47);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void closeSettings() {
        GUIManager gUIManager = this.guiManager;
        if (gUIManager != null) {
            gUIManager.closeGUI(null, 47);
        }
    }
}

