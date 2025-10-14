package com.blackhub.bronline.game.gui.taxiorder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TaxiOrderActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TaxiOrderActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screen;

    public TaxiOrderActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screen = 17;
    }

    public final void openLocationMenu() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void orderTaxi(@NotNull TaxiOrderData orderData) throws JSONException {
        Intrinsics.checkNotNullParameter(orderData, "orderData");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 0);
        jSONObject.put("x", orderData.getX());
        jSONObject.put("y", orderData.getY());
        jSONObject.put("a", orderData.getCompanyId());
        jSONObject.put("p", orderData.getRateId());
        jSONObject.put("m", orderData.getPaymentId());
        jSONObject.put("ma", orderData.getPrice());
        jSONObject.put("co", orderData.getComment());
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", -1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }

    public final void dismissOrder() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screen, jSONObject);
    }
}

