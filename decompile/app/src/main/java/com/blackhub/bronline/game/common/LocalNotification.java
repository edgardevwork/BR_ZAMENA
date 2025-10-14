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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/LocalNotification;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "showErrorNotification", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "showPositiveNotification", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
