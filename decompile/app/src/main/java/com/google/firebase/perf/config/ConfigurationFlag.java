package com.google.firebase.perf.config;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
abstract class ConfigurationFlag<T> {
    public abstract T getDefault();

    @Nullable
    public String getDeviceCacheFlag() {
        return null;
    }

    @Nullable
    public String getMetadataFlag() {
        return null;
    }

    @Nullable
    public String getRemoteConfigFlag() {
        return null;
    }

    public T getDefaultOnRcFetchFail() {
        return getDefault();
    }
}
