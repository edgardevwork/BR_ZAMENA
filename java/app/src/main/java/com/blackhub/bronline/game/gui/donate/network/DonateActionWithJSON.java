package com.blackhub.bronline.game.gui.donate.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DonateActionWithJSON.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class DonateActionWithJSON {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;

    public DonateActionWithJSON(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
    }

    public final void closeDialog() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 3);
            this.guiManager.sendJsonData(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final boolean sendBuyTokens(int value) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 5);
            jSONObject.put("s", value);
            this.guiManager.sendJsonData(22, jSONObject);
            return true;
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            return false;
        }
    }

    public final void sendCloseDialogBuyBC() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 6);
            this.guiManager.sendJsonData(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void openingSurprise() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 2);
            this.guiManager.sendJsonData(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public static /* synthetic */ void buySkinsOrMoneyOrAccessoriesOrServices$default(DonateActionWithJSON donateActionWithJSON, int i, Integer num, Integer num2, int i2, Object obj) throws JSONException {
        if ((i2 & 2) != 0) {
            num = -1;
        }
        if ((i2 & 4) != 0) {
            num2 = -1;
        }
        donateActionWithJSON.buySkinsOrMoneyOrAccessoriesOrServices(i, num, num2);
    }

    public final void buySkinsOrMoneyOrAccessoriesOrServices(int itemPrice, @Nullable Integer itemId, @Nullable Integer itemCount) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 0);
            jSONObject.put("m", itemPrice);
            jSONObject.put("p", itemId);
            jSONObject.put("c", itemCount);
            this.guiManager.sendJsonData(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void showLocalError(int keyT, @NotNull String title, @NotNull String body) throws JSONException {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("y", 0);
            jSONObject.put("m", title);
            jSONObject.put("n", body);
            jSONObject.put("t", keyT);
            this.guiManager.onPacketIncoming(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void openHeaderBoxes() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 1);
            this.guiManager.sendJsonData(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public static /* synthetic */ void buyCar$default(DonateActionWithJSON donateActionWithJSON, int i, Integer num, int i2, int i3, Object obj) throws JSONException {
        if ((i3 & 2) != 0) {
            num = -1;
        }
        donateActionWithJSON.buyCar(i, num, i2);
    }

    public final void buyCar(int itemPrice, @Nullable Integer itemId, int carColor) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 0);
            jSONObject.put("m", itemPrice);
            jSONObject.put("p", itemId);
            jSONObject.put("l", carColor);
            this.guiManager.sendJsonData(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    public final void sendCustomValueOfMoney(int strValueOfMoney) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", 4);
            jSONObject.put("v", strValueOfMoney);
            this.guiManager.sendJsonData(22, jSONObject);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}

