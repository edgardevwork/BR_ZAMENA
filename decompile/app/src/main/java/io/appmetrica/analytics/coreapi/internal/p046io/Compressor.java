package io.appmetrica.analytics.coreapi.internal.p046io;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes7.dex */
public interface Compressor {
    @Nullable
    byte[] compress(@NonNull byte[] bArr) throws IOException;

    @Nullable
    byte[] uncompress(@NonNull byte[] bArr) throws IOException;
}
