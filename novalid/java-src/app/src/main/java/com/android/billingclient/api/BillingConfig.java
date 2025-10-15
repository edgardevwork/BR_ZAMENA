package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
@zzi
/* loaded from: classes3.dex */
public final class BillingConfig {
    public final String countryCode;
    public final String jsonString;
    public final JSONObject parsedJson;

    public BillingConfig(String str) throws JSONException {
        this.jsonString = str;
        JSONObject jSONObject = new JSONObject(str);
        this.parsedJson = jSONObject;
        this.countryCode = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
    }

    @NonNull
    public String getCountryCode() {
        return this.countryCode;
    }
}
