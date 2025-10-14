package com.blackhub.bronline.game.gui.notification.network;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.launcher.App;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class NotificationActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public NotificationActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void clickButton(int type, int id, int subId) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("c", 13);
            jSONObject.put("t", type);
            jSONObject.put("s", id);
            jSONObject.put("b", subId);
            this.guiManager.sendJsonData(13, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendOther(@NotNull Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("d", 1);
            jSONObject.put("t", App.INSTANCE.getInput(context));
            this.guiManager.sendJsonData(13, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

