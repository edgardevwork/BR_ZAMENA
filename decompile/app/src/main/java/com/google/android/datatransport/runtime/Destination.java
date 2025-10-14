package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface Destination {
    @Nullable
    byte[] getExtras();

    @NonNull
    String getName();
}
