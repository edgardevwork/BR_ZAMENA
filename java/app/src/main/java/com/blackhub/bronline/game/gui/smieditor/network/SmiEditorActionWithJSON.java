package com.blackhub.bronline.game.gui.smieditor.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SmiEditorActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SmiEditorActionWithJSON {
    public static final int $stable = 8;

    @Nullable
    public final GUIManager guiManager;

    public SmiEditorActionWithJSON(@Nullable GUIManager gUIManager) {
        this.guiManager = gUIManager;
    }

    public final void putInfoForClickCancelOrNextOrDismiss(int valueKey) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", valueKey);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(24, jSONObject);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void putDataToServer(@NotNull String data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", 1);
            jSONObject.put("s", data);
            GUIManager gUIManager = this.guiManager;
            if (gUIManager != null) {
                gUIManager.sendJsonData(24, jSONObject);
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

