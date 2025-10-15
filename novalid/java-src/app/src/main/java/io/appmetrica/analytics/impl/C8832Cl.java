package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Cl */
/* loaded from: classes7.dex */
public final class C8832Cl extends AbstractC9058M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC9058M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8807Bl defaultValue() {
        C8807Bl c8807Bl = new C8807Bl();
        c8807Bl.f6398i = new C9962wl();
        return c8807Bl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8807Bl toState(@NonNull byte[] bArr) throws IOException {
        return (C8807Bl) MessageNano.mergeFrom(new C8807Bl(), bArr);
    }
}
