package com.blackhub.bronline.game.common;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LocalNotification.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LocalNotification {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public LocalNotification(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void showErrorNotification(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("o", 1);
            jSONObject.put("t", 2);
            jSONObject.put("d", 2);
            jSONObject.put("i", message);
            jSONObject.put("s", -99);
            this.guiManager.onPacketIncoming(13, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void showPositiveNotification(@NotNull String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("o", 1);
            jSONObject.put("t", 3);
            jSONObject.put("d", 3);
            jSONObject.put("i", message);
            jSONObject.put("s", -99);
            jSONObject.put("b", 0);
            this.guiManager.onPacketIncoming(13, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

