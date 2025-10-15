package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes3.dex */
public final class AcknowledgePurchaseParams {
    public String zza;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class Builder {
        public String zza;

        public Builder() {
            throw null;
        }

        public /* synthetic */ Builder(zza zzaVar) {
        }

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(null);
            acknowledgePurchaseParams.zza = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    public AcknowledgePurchaseParams() {
        throw null;
    }

    public /* synthetic */ AcknowledgePurchaseParams(zzb zzbVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.zza;
    }
}
