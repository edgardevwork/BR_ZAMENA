package com.blackhub.bronline.game.gui.brsimbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BrSimBannerActionsWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BrSimBannerActionsWithJson {
    public static final int $stable = 8;
    public final int guiId;

    @NotNull
    public final GUIManager guiManager;

    @Inject
    public BrSimBannerActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.guiId = 67;
    }

    public final void sendButtonPressed(int action) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", action);
        this.guiManager.sendJsonData(this.guiId, jSONObject);
    }
}

