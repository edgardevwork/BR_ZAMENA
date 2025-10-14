package com.blackhub.bronline.game.gui.gasmangame.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GasmanActionsWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GasmanActionsWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public GasmanActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void sendExit(int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", value);
        this.guiManager.sendJsonData(58, jSONObject);
    }

    public final void sendGasAnimated() throws JSONException {
        GUIManager gUIManager = this.guiManager;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("s", 1);
        Unit unit = Unit.INSTANCE;
        gUIManager.sendJsonData(58, jSONObject);
    }
}

