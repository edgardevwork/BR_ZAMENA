package com.blackhub.bronline.game.gui.admintools;

import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.services.ScanBuild;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdminToolsActionWithJSON.kt */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAdminToolsActionWithJSON.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdminToolsActionWithJSON.kt\ncom/blackhub/bronline/game/gui/admintools/AdminToolsActionWithJSON\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes3.dex */
public final class AdminToolsActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public AdminToolsActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 66;
    }

    public final void sendButtonId(@IntRange(from = 1, m10to = 3) int typeScreen, int buttonId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", typeScreen);
        jSONObject.put(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_ID_KEY, buttonId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendButton(@IntRange(from = 1, m10to = 3) int typeScreen, int buttonId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", typeScreen);
        jSONObject.put("b", buttonId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendTableButtonId(int typeScreen, int tableButtonId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", typeScreen);
        jSONObject.put(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_ID_KEY, tableButtonId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendReport(@NotNull String reportText) throws JSONException {
        Intrinsics.checkNotNullParameter(reportText, "reportText");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 5);
        jSONObject.put("rt", reportText);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendTableButtonIdForRemove(int tableButtonId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 8);
        jSONObject.put(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_ID_KEY, tableButtonId);
        jSONObject.put("bn", ScanBuild.XRAY_FATAL_FAIL_STATUS);
        jSONObject.put(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_DESC_KEY, ScanBuild.XRAY_FATAL_FAIL_STATUS);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public static /* synthetic */ void sendTemplateEdit$default(AdminToolsActionWithJSON adminToolsActionWithJSON, int i, String str, String str2, Integer num, int i2, Object obj) throws JSONException {
        if ((i2 & 8) != 0) {
            num = null;
        }
        adminToolsActionWithJSON.sendTemplateEdit(i, str, str2, num);
    }

    public final void sendTemplateEdit(int templateId, @NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer templateTime) throws JSONException {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 8);
        jSONObject.put(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_ID_KEY, templateId);
        jSONObject.put("bn", templateTitle);
        jSONObject.put(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_DESC_KEY, templateDesc);
        if (templateTime != null) {
            jSONObject.put("br", templateTime.intValue());
        }
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendTemplateCreate(@NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer templateTime) throws JSONException {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 9);
        jSONObject.put("bn", templateTitle);
        jSONObject.put(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_DESC_KEY, templateDesc);
        if (templateTime != null) {
            jSONObject.put("br", templateTime.intValue());
        }
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCloseScreen() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

