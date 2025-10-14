package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.w2 */
/* loaded from: classes6.dex */
public final class C9943w2 extends AbstractC9058M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC9058M2
    @NonNull
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C9918v2();
    }

    @NonNull
    /* renamed from: b */
    public final C9918v2 m6916b() {
        return new C9918v2();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9058M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C9918v2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9918v2 toState(@NonNull byte[] bArr) throws IOException {
        return (C9918v2) MessageNano.mergeFrom(new C9918v2(), bArr);
    }
}
