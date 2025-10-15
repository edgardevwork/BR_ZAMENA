package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Q3 */
/* loaded from: classes7.dex */
public final class C9155Q3 extends AbstractC9058M2 {
    @Override // io.appmetrica.analytics.impl.AbstractC9058M2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C9131P3();
    }

    @NotNull
    /* renamed from: b */
    public final C9131P3 m5499b() {
        return new C9131P3();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9058M2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C9131P3();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9131P3 toState(@NotNull byte[] bArr) {
        return (C9131P3) MessageNano.mergeFrom(new C9131P3(), bArr);
    }
}
