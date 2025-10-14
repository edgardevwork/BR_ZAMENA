package com.blackhub.bronline.game.gui.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GiftsActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GiftsActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public GiftsActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 69;
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendPurchaseBc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendOpenGift(int giftType) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", giftType);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

