package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes3.dex */
public final class ConsumeParams {
    public String zza;

    /* compiled from: com.android.billingclient:billing@@7.0.0 */
    public static final class Builder {
        public String zza;

        public Builder() {
            throw null;
        }

        public /* synthetic */ Builder(zzcf zzcfVar) {
        }

        @NonNull
        public ConsumeParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            consumeParams.zza = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    public ConsumeParams() {
        throw null;
    }

    public /* synthetic */ ConsumeParams(zzcg zzcgVar) {
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
