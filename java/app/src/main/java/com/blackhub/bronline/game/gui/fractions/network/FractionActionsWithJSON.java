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

