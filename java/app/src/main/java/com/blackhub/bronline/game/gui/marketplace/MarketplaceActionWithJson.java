package com.blackhub.bronline.game.gui.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.google.android.datatransport.cct.CctTransportBackend;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MarketplaceActionWithJson.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MarketplaceActionWithJson {
    public static final int $stable = 8;

    @NotNull
    public final GUIManager guiManager;
    public final int screenId;

    public MarketplaceActionWithJson(@NotNull GUIManager guiManager) {
        Intrinsics.checkNotNullParameter(guiManager, "guiManager");
        this.guiManager = guiManager;
        this.screenId = 77;
    }

    public final void sendClickToTab(int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", value);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickToPage(int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 6);
        jSONObject.put("lt", value);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickToDonat() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 7);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickFilters(@NotNull Set<Integer> filterValues) throws JSONException {
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 8);
        jSONObject.put("f", new JSONArray((Collection) filterValues));
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickToCreateProductLot() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 9);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickToSellButton(int productId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 10);
        jSONObject.put("id", productId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendConfirmPublishProductLot(@NotNull MarketplaceProduct marketplaceProduct, boolean isHaveAdds) throws JSONException {
        Intrinsics.checkNotNullParameter(marketplaceProduct, "product");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 11);
        jSONObject.put("ct", marketplaceProduct.getCount());
        jSONObject.put("cs", marketplaceProduct.getPrice());
        jSONObject.put("rs", isHaveAdds ? 1 : 0);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickBuy(int productId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 12);
        jSONObject.put("id", productId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendBuyVip() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 20);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendConfirmBuy(int id, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", id);
        jSONObject.put("ct", i);
        jSONObject.put("t", 13);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendLike(int productId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 14);
        jSONObject.put("id", productId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendSearchWord(@NotNull String word) throws JSONException {
        Intrinsics.checkNotNullParameter(word, "word");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 19);
        jSONObject.put("s", word);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendNotifyBuyVip() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 25);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendClickHistoryCard(int productId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 18);
        jSONObject.put("id", productId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendEditProduct(int productId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 15);
        jSONObject.put("id", productId);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendConfirmEdit(@NotNull MarketplaceProduct marketplaceProduct, boolean isHaveAdds) throws JSONException {
        Intrinsics.checkNotNullParameter(marketplaceProduct, "product");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 16);
        jSONObject.put("cs", marketplaceProduct.getPrice());
        jSONObject.put("rs", isHaveAdds ? 1 : 0);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendDeleteProductLot() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 17);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendSortFilter(int value) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("t", 21);
        jSONObject.put("st", value);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }

    public final void sendCloseInterface() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", 1);
        this.guiManager.sendJsonData(this.screenId, jSONObject);
    }
}

