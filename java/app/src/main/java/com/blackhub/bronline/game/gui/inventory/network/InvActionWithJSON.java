package com.blackhub.bronline.game.gui.inventory.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InvActionWithJSON.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class InvActionWithJSON {
    public static final int $stable = 0;

    @NotNull
    public static final InvActionWithJSON INSTANCE = new InvActionWithJSON();

    public final void sendIdAndPositionToServer(int typeKey, int idItem, int positionInSlot) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("ga", idItem);
            jSONObject.put("s", positionInSlot);
            GUIManager.INSTANCE.getInstance().sendJsonData(33, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendIdWithOldAndNewPositionsToServer(int typeKey, int idItem, int oldPosition, int newPosition) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("ga", idItem);
            jSONObject.put("os", oldPosition);
            jSONObject.put("s", newPosition);
            GUIManager.INSTANCE.getInstance().sendJsonData(33, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendPressButton(int typeKey) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            GUIManager.INSTANCE.getInstance().sendJsonData(33, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendPressButton(int typeKey, int valueMoney) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("em", valueMoney);
            GUIManager.INSTANCE.getInstance().sendJsonData(33, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendIdWithCountAndSlotToServer(int typeKey, int idItem, int count, int position) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("ga", idItem);
            jSONObject.put("s", count);
            jSONObject.put("os", position);
            GUIManager.INSTANCE.getInstance().sendJsonData(33, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendIdWithCountToServer(int typeKey, int idItem, int count, int position) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("ga", idItem);
            jSONObject.put("s", count);
            jSONObject.put("sl", position);
            GUIManager.INSTANCE.getInstance().sendJsonData(33, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendMessageToServer(int typeKey, @NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("tx", message);
            GUIManager.INSTANCE.getInstance().sendJsonData(33, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

