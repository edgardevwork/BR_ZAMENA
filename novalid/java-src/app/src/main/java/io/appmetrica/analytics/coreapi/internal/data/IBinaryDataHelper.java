package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public interface IBinaryDataHelper {
    byte[] get(@NonNull String str);

    void insert(@NonNull String str, @NonNull byte[] bArr);

    void remove(@NonNull String str);
}
