package com.blackhub.bronline.game.gui.fuelfill.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FuelFillActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FuelFillActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public FuelFillActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void closeInterface() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 1);
            this.guiManager.sendJsonData(2, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void purchaseOfFuel(int selectedFuelPos, int valueOfFuel) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 0);
            jSONObject.put("v", valueOfFuel);
            jSONObject.put("f", selectedFuelPos);
            this.guiManager.sendJsonData(2, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

