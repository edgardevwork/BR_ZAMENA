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
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\bJ\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006'"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceActionWithJson;", "", "guiManager", "Lcom/blackhub/bronline/game/GUIManager;", "(Lcom/blackhub/bronline/game/GUIManager;)V", "screenId", "", "sendBuyVip", "", "sendClickBuy", "productId", "sendClickFilters", "filterValues", "", "sendClickHistoryCard", "sendClickToCreateProductLot", "sendClickToDonat", "sendClickToPage", "value", "sendClickToSellButton", "sendClickToTab", "sendCloseInterface", "sendConfirmBuy", "id", CatchStreamerKeys.COUNT_KEY, "sendConfirmEdit", CctTransportBackend.KEY_PRODUCT, "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "isHaveAdds", "", "sendConfirmPublishProductLot", "sendDeleteProductLot", "sendEditProduct", "sendLike", "sendNotifyBuyVip", "sendSearchWord", "word", "", "sendSortFilter", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
