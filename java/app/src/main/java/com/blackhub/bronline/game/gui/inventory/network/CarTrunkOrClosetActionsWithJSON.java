package com.blackhub.bronline.game.gui.inventory.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CarTrunkOrClosetActionsWithJSON.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CarTrunkOrClosetActionsWithJSON {
    public static final int $stable = 0;

    @NotNull
    public static final CarTrunkOrClosetActionsWithJSON INSTANCE = new CarTrunkOrClosetActionsWithJSON();

    public final void sendPressButton(int typeKey) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            GUIManager.INSTANCE.getInstance().sendJsonData(34, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void openRadialMenu() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("o", 1);
            GUIManager.INSTANCE.getInstance().onPacketIncoming(14, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendIdWithOldAndNewPositionsAndValueToServer(int typeKey, int idItem, int oldPosition, int newPosition, int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("ga", idItem);
            jSONObject.put("os", oldPosition);
            jSONObject.put("ns", newPosition);
            jSONObject.put("v", value);
            GUIManager.INSTANCE.getInstance().sendJsonData(34, jSONObject);
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
            GUIManager.INSTANCE.getInstance().sendJsonData(34, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendPositionToServer(int typeKey, int positionInSlot) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", typeKey);
            jSONObject.put("s", positionInSlot);
            GUIManager.INSTANCE.getInstance().sendJsonData(34, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendMessageError(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("o", 1);
            jSONObject.put("t", 2);
            jSONObject.put("d", 2);
            jSONObject.put("i", message);
            jSONObject.put("s", -1);
            GUIManager.INSTANCE.getInstance().onPacketIncoming(13, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

