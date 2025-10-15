package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Sj */
/* loaded from: classes7.dex */
public final class C9218Sj extends AbstractC9058M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC9058M2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C9171Qj();
    }

    @NotNull
    /* renamed from: b */
    public final C9171Qj m5579b() {
        return new C9171Qj();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9058M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C9171Qj();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9171Qj toState(@NotNull byte[] bArr) {
        return (C9171Qj) MessageNano.mergeFrom(new C9171Qj(), bArr);
    }
}
