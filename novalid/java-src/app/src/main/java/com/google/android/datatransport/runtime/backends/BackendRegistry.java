package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface BackendRegistry {
    @Nullable
    TransportBackend get(String str);
}
