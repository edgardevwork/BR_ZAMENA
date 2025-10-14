package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.location.impl.h */
/* loaded from: classes5.dex */
public final class C10051h implements Consumer {

    /* renamed from: a */
    public final C10056m f9435a;

    public C10051h(@NonNull C10056m c10056m) {
        this.f9435a = c10056m;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable Location location) {
        if (location != null) {
            this.f9435a.updateData(location);
        }
    }
}
