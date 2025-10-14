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
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J&\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/inventory/network/InvActionWithJSON;", "", "()V", "sendIdAndPositionToServer", "", "typeKey", "", "idItem", "positionInSlot", "sendIdWithCountAndSlotToServer", CatchStreamerKeys.COUNT_KEY, "position", "sendIdWithCountToServer", "sendIdWithOldAndNewPositionsToServer", "oldPosition", "newPosition", "sendMessageToServer", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "sendPressButton", "valueMoney", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
