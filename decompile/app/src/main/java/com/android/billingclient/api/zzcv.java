package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.android.billingclient.api.ProductDetails;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzcv {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;

    @Nullable
    public final ProductDetails.PricingPhase zzf;

    public zzcv(JSONObject jSONObject) throws JSONException {
        this.zza = jSONObject.getString("productId");
        this.zzb = jSONObject.optString("title");
        this.zzc = jSONObject.optString("name");
        this.zzd = jSONObject.optString("description");
        this.zze = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.zzf = jSONObjectOptJSONObject == null ? null : new ProductDetails.PricingPhase(jSONObjectOptJSONObject);
    }
}
