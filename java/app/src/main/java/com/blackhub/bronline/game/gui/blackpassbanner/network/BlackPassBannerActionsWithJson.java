package com.blackhub.bronline.game.gui.blackpassbanner.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BlackPassBannerActionsWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BlackPassBannerActionsWithJson {
    public static final int $stable = 8;
    public final int guiId;

    @NotNull
    public final GUIManager guiManager;

    @Inject
    public BlackPassBannerActionsWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.guiId = 35;
    }

    public final void clickOnButton(int action) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", action);
        this.guiManager.sendJsonData(this.guiId, jSONObject);
    }
}

