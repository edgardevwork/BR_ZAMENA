package com.blackhub.bronline.game.gui.radialmenuforcar.netrowk;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RadialMenuActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RadialMenuActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public RadialMenuActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void sendServerThisOperation(int valueKey) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", valueKey);
            this.guiManager.sendJsonData(27, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void showMessageError() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("o", 1);
            jSONObject.put("t", 2);
            jSONObject.put("d", 2);
            jSONObject.put("i", "Недоступно для данного вида транспорта");
            jSONObject.put("s", -1);
            this.guiManager.onPacketIncoming(13, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

