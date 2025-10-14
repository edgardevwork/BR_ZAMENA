package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
@zzl
/* loaded from: classes2.dex */
public final class UserChoiceDetails {
    public final String mOriginalJson;
    public final JSONObject mParsedJson;
    public final List<Product> mProducts;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    @zzl
    public static class Product {

        /* renamed from: id */
        public final String f374id;

        @Nullable
        public final String offerToken;
        public final String type;

        public Product(String str, String str2, @Nullable String str3) {
            this.f374id = str;
            this.type = str2;
            this.offerToken = str3;
        }

        public Product(JSONObject jSONObject) {
            this.f374id = jSONObject.optString("productId");
            this.type = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.offerToken = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f374id.equals(product.getId()) && this.type.equals(product.getType()) && Objects.equals(this.offerToken, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.f374id;
        }

        @Nullable
        public String getOfferToken() {
            return this.offerToken;
        }

        @NonNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.f374id, this.type, this.offerToken);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f374id, this.type, this.offerToken);
        }
    }

    public UserChoiceDetails(String str) throws JSONException {
        this.mOriginalJson = str;
        JSONObject jSONObject = new JSONObject(str);
        this.mParsedJson = jSONObject;
        this.mProducts = toProductList(jSONObject.optJSONArray("products"));
    }

    public static List<Product> toProductList(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.mParsedJson.optString("externalTransactionToken");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String strOptString = this.mParsedJson.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.mProducts;
    }
}
