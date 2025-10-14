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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/plates/PlatesActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "sendButtonClick", "", "buttonType", "sendChangeCountry", "countryId", "sendChangedText", "plateNumber", "", "plateRegion", "sendPurchasePlate", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
