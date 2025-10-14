package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.N8 */
/* loaded from: classes7.dex */
public final class C9088N8 extends AbstractC9058M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC9058M2
    @NonNull
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C9825r9();
    }

    @NonNull
    /* renamed from: b */
    public final C9825r9 m5439b() {
        return new C9825r9();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9058M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return new C9825r9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9825r9 toState(@NonNull byte[] bArr) throws IOException {
        return (C9825r9) MessageNano.mergeFrom(new C9825r9(), bArr);
    }
}
