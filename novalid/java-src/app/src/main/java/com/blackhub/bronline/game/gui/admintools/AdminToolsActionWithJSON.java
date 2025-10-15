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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006J%\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0017J/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/admintools/AdminToolsActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "sendButton", "", "typeScreen", "buttonId", "sendButtonId", "sendCloseScreen", "sendReport", "reportText", "", "sendTableButtonId", "tableButtonId", "sendTableButtonIdForRemove", "sendTemplateCreate", "templateTitle", "templateDesc", "templateTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sendTemplateEdit", "templateId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
