package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
@zzh
/* loaded from: classes3.dex */
public final class ExternalOfferReportingDetails {
    public final String externalTransactionToken;

    public ExternalOfferReportingDetails(String str) throws JSONException {
        this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
