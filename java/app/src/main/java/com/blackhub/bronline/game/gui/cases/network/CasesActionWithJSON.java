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

