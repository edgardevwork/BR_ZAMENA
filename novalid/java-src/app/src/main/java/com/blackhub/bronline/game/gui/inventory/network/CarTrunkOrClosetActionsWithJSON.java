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
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J.\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/network/CarTrunkOrClosetActionsWithJSON;", "", "()V", "openRadialMenu", "", "sendIdWithOldAndNewPositionsAndValueToServer", "typeKey", "", "idItem", "oldPosition", "newPosition", "value", "sendIdWithOldAndNewPositionsToServer", "sendMessageError", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "sendPositionToServer", "positionInSlot", "sendPressButton", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
