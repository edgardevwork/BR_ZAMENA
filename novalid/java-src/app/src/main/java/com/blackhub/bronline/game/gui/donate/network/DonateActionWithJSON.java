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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bJ\u001e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/network/DonateActionWithJSON;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "buyCar", "", "itemPrice", "", "itemId", "carColor", "(ILjava/lang/Integer;I)V", "buySkinsOrMoneyOrAccessoriesOrServices", "itemCount", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "closeDialog", "openHeaderBoxes", "openingSurprise", "sendBuyTokens", "", "value", "sendCloseDialogBuyBC", "sendCustomValueOfMoney", "strValueOfMoney", "showLocalError", "keyT", "title", "", "body", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
