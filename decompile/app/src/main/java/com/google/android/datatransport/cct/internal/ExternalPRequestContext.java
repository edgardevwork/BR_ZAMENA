package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class ExternalPRequestContext {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ExternalPRequestContext build();

        @NonNull
        public abstract Builder setOriginAssociatedProductId(@Nullable Integer num);
    }

    @Nullable
    public abstract Integer getOriginAssociatedProductId();

    @NonNull
    public static Builder builder() {
        return new AutoValue_ExternalPRequestContext.Builder();
    }
}
