package com.blackhub.bronline.game.gui.cases.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.gui.cases.CasesKeys;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CasesActionWithJSON.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006J&\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/network/CasesActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "getScreenId", "()I", "backToDonate", "", "bcButtonClick", "closeBanner", "getBonus", "bonusId", "isClosedWithError", "openBpRewards", "openCases", "caseId", "type", "openCasesFromBanner", "openSuperCase", "selectCase", "takeRewards", "gettingRewardList", "", "sprayedRewardList", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class CasesActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    @Inject
    public CasesActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 73;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final void bcButtonClick() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 4);
        jSONObject.put("d", 2);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void selectCase(int caseId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 1);
        jSONObject.put("cs", caseId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void openCases(int caseId, int type) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 2);
        jSONObject.put("cs", caseId);
        jSONObject.put("type", type);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void getBonus(int bonusId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 7);
        jSONObject.put("b", bonusId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void backToDonate() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 4);
        jSONObject.put("d", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void openBpRewards() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 6);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void takeRewards(@Nullable List<Integer> gettingRewardList, @Nullable List<Integer> sprayedRewardList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 3);
        if (gettingRewardList != null) {
            jSONObject.put(CasesKeys.GET_REWARDS_KEY, new JSONArray((Collection) gettingRewardList));
        }
        if (sprayedRewardList != null) {
            jSONObject.put(CasesKeys.SPRAY_REWARDS_KEY, new JSONArray((Collection) sprayedRewardList));
        }
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void openSuperCase() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 5);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void openCasesFromBanner() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 8);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void closeBanner() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        jSONObject.put("b", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void isClosedWithError() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}
