package com.blackhub.bronline.game.gui.entertainmentsystem.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EntertainmentSystemActionsWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class EntertainmentSystemActionsWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public EntertainmentSystemActionsWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void sendPressButtonForEntertainmentSystem(int typeKey) throws JSONException {
        sendPressButton(typeKey, 42);
    }

    public final void sendPressButtonForFinalWindow(int typeKey) throws JSONException {
        sendPressButton(typeKey, 43);
    }

    public final void sendPressButton(int typeKey, int fragmentId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            this.guiManager.sendJsonData(fragmentId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendGetLobby(int lobbiesNumber) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            jSONObject.put("g", lobbiesNumber);
            this.guiManager.sendJsonData(42, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

