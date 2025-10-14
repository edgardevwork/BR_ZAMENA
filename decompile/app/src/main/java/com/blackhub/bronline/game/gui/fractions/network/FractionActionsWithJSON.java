package com.blackhub.bronline.game.gui.fractions.network;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.BillingFlowParams;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FractionActionsWithJSON.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ&\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/network/FractionActionsWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "sendAnswerChosen", "", "chosenAnswerIndex", "", "sendButtonAcquaintedPressed", "documentId", "documentNumber", "sendButtonPressed", "currentLayout", "button", "sendChangeRankOrReprimand", "buttonKey", Const.FRACTION_CONTROL_CHANGE_RANK_OR_REPRIMAND, "sendItemInShopPressed", Const.FRACTION_SHOP_UNIQUE_ID, "sendKeyWithType", "currentPage", "typeKey", "mainKey", "", "value", "sendPlayerChosenId", BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, "sendStartQuest", "taskId", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class FractionActionsWithJSON {
    public static final int $stable = 8;

    @Nullable
    public final GUIManager guiManager;

    public FractionActionsWithJSON(@Nullable GUIManager gUIManager) {
        this.guiManager = gUIManager;
    }

    public final void sendKeyWithType(int currentPage, int typeKey, @NotNull String mainKey, int value) throws JSONException {
        Intrinsics.checkNotNullParameter(mainKey, "mainKey");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, currentPage);
            jSONObject.put("type", typeKey);
            jSONObject.put(mainKey, value);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "put data sendKey: typeKey= " + typeKey + ", mainKey = " + mainKey + ", value = " + value);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendButtonPressed(int currentLayout, int button) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, currentLayout);
            jSONObject.put("button", button);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "put data sendPressButton: currentLayout= " + currentLayout + ", button = " + button);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendButtonAcquaintedPressed(int documentId, int documentNumber) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, 4);
            jSONObject.put("button", 9);
            jSONObject.put(Const.FRACTION_DOCUMENT_ID, documentId);
            jSONObject.put(Const.FRACTION_DOCUMENT_NUMBER, documentNumber);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "put data sendPressButton: currentLayout= 4, button = 9, documentId=" + documentId + ", documentNumber=" + documentNumber + " ");
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendStartQuest(int taskId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, 3);
            jSONObject.put("button", 10);
            jSONObject.put(Const.FRACTION_TASK_ID, taskId);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "page, 3)button, 10, sendStartQuest: taskId = " + taskId);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendAnswerChosen(int chosenAnswerIndex) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, 5);
            jSONObject.put("button", 13);
            jSONObject.put(Const.FRACTION_TESTING_CHOSEN_ANSWER, chosenAnswerIndex);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "put data sendPressButton: typeKey = 13,  chosenAnswerIndex = " + chosenAnswerIndex);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendPlayerChosenId(int accountId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, 9);
            jSONObject.put("button", 15);
            jSONObject.put(Const.FRACTION_CONTROL_ACCOUNT_ID, accountId);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "put data sendPressButton: page=9, button = 15, account_id = " + accountId);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendChangeRankOrReprimand(int buttonKey, int change) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, 9);
            jSONObject.put("button", buttonKey);
            jSONObject.put(Const.FRACTION_CONTROL_CHANGE_RANK_OR_REPRIMAND, change);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "put data sendPressButton: buttonKey = " + buttonKey + ", changeRank= " + change);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendItemInShopPressed(int buttonKey, int uniqueID) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Const.PAGE_KEY, 8);
            jSONObject.put("button", buttonKey);
            jSONObject.put(Const.FRACTION_SHOP_UNIQUE_ID, uniqueID);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(46, jSONObject);
            }
            Log.v(Const.LOG_FRACTION_S, "put data sendPressButton: buttonKey = " + buttonKey + ", uniqueID= " + uniqueID);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}
