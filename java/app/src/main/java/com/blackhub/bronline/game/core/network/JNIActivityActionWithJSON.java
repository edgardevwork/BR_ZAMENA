package com.blackhub.bronline.game.core.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: JNIActivityActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class JNIActivityActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public JNIActivityActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void isNeedInformingServerAndOpenErrorDialog() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        this.guiManager.sendJsonData(100, jSONObject);
    }
}

