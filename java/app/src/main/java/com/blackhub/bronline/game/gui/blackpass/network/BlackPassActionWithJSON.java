package com.blackhub.bronline.game.gui.blackpass.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BlackPassActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BlackPassActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public BlackPassActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 22;
    }

    public final void requestInitData() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", -2);
            this.guiManager.sendJsonData(this.screenId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void confirmationLevelUp(int levelsToBuy) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", -1);
            jSONObject.put("ty", 1);
            jSONObject.put("la", 0);
            jSONObject.put("id", 0);
            jSONObject.put("p", levelsToBuy);
            this.guiManager.sendJsonData(this.screenId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void getPrize(int currentLayout, int id, int isPremium) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", -1);
            jSONObject.put("la", currentLayout);
            jSONObject.put("ty", 2);
            jSONObject.put("id", id);
            jSONObject.put("p", isPremium);
            this.guiManager.sendJsonData(this.screenId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void showCurrentLayout(int layoutId) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", -1);
            jSONObject.put("ty", 0);
            jSONObject.put("la", layoutId);
            this.guiManager.sendJsonData(this.screenId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void exchangeTask(int taskId) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", -1);
            jSONObject.put("ty", 1);
            jSONObject.put("la", 1);
            jSONObject.put("id", taskId);
            this.guiManager.sendJsonData(this.screenId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendRefreshRating() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", -1);
            jSONObject.put("ty", 1);
            jSONObject.put("la", 3);
            jSONObject.put("id", 0);
            this.guiManager.sendJsonData(this.screenId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void purchasePremium(int premiumId) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", -1);
            jSONObject.put("ty", 1);
            jSONObject.put("la", 4);
            jSONObject.put("id", premiumId);
            this.guiManager.sendJsonData(this.screenId, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendTaskPressed(int taskId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", -1);
        jSONObject.put("ty", 0);
        jSONObject.put("la", 1);
        jSONObject.put("id", taskId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

