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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/network/BlackPassActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "confirmationLevelUp", "", "levelsToBuy", "exchangeTask", "taskId", "getPrize", "currentLayout", "id", "isPremium", "purchasePremium", "premiumId", "requestInitData", "sendRefreshRating", "sendTaskPressed", "showCurrentLayout", "layoutId", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
