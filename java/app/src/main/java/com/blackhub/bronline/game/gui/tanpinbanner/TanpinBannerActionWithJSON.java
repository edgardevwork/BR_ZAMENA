package com.blackhub.bronline.game.gui.tanpinbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TanpinBannerActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TanpinBannerActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public TanpinBannerActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 75;
    }

    public final void sendClickToOpen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickToClose() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

