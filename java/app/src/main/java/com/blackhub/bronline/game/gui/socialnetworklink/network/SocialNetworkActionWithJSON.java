package com.blackhub.bronline.game.gui.socialnetworklink.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.gui.socialnetworklink.SocialNetworkLinkUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SocialNetworkActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SocialNetworkActionWithJSON {
    public static final int $stable = 8;
    public final int guiId = 52;

    @Nullable
    public final GUIManager guiManager;

    public SocialNetworkActionWithJSON(@Nullable GUIManager gUIManager) {
        this.guiManager = gUIManager;
    }

    public final void clickOnButton(int buttonId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put(SocialNetworkLinkUtils.KEY_BUTTON_ID, buttonId);
        GUIManager gUIManager = this.guiManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(this.guiId, jSONObject);
        }
    }

    public final void ifActiveCheckbox() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        jSONObject.put("s", 1);
        GUIManager gUIManager = this.guiManager;
        if (gUIManager != null) {
            gUIManager.sendJsonData(this.guiId, jSONObject);
        }
    }
}

