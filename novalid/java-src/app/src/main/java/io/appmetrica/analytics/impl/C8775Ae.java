package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Ae */
/* loaded from: classes7.dex */
public final class C8775Ae extends AbstractC9058M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC9058M2
    @NonNull
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C8900Fe();
    }

    @NonNull
    /* renamed from: b */
    public final C8900Fe m4954b() {
        return new C8900Fe();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9058M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C8900Fe();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8900Fe toState(@NonNull byte[] bArr) throws IOException {
        return (C8900Fe) MessageNano.mergeFrom(new C8900Fe(), bArr);
    }
}
