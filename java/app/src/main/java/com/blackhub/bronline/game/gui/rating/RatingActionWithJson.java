package com.blackhub.bronline.game.gui.rating;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RatingActionWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RatingActionWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public RatingActionWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 82;
    }

    public final void sendCloseInterface() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

