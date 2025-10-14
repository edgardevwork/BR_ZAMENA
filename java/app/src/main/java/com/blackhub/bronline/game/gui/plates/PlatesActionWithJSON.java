package com.blackhub.bronline.game.gui.plates;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlatesActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PlatesActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public PlatesActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 1;
    }

    public final void sendButtonClick(int buttonType) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", buttonType);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendChangeCountry(int countryId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put("c", countryId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendPurchasePlate(@NotNull String plateNumber, @NotNull String plateRegion) throws JSONException {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 3);
        jSONObject.put("p", plateNumber);
        jSONObject.put("r", plateRegion);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendChangedText(int countryId, @NotNull String plateNumber, @NotNull String plateRegion) throws JSONException {
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 4);
        jSONObject.put("c", countryId);
        jSONObject.put("p", plateNumber);
        jSONObject.put("r", plateRegion);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

