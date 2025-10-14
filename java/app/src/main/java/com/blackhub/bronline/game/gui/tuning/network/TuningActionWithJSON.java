package com.blackhub.bronline.game.gui.tuning.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TuningActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class TuningActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager = GUIManager.INSTANCE.getInstance();

    public final void putIntegerDataToServer(int typeKey, int data) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("d", data);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putActionResetDetailsToServer(int typeKey, int selectorId, int typeOfDetail) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("m", selectorId);
            jSONObject.put("mt", typeOfDetail);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putPlayersActionToServer(int typeKey) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putIntegerDataWithSelectorIDToServer(int typeKey, int id, int selector) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("d", id);
            jSONObject.put("m", selector);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putColorDataWithSelectorIDToServer(int typeKey, @Nullable String color, int selector) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("d", color);
            jSONObject.put("m", selector);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putSelectorToClient(int typeKey, int selector) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("s", selector);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putDetailOrCollapseToClient(int typeKey, int idDetailOrValueCollapse) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("d", idDetailOrValueCollapse);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putColorToClient(int typeKey, @Nullable String color) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("co", color);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putVinylToClient(int typeKey, @Nullable String nameVinyl) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("v", nameVinyl);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putSoundToClient(int typeKey, int idSound) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("h", idSound);
            this.guiManager.sendJsonData(28, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

