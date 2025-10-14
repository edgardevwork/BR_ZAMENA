package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Il */
/* loaded from: classes8.dex */
public final class C8981Il implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10037zl fromModel(@NotNull C8957Hl c8957Hl) {
        C10037zl c10037zl = new C10037zl();
        c10037zl.f9408a = c8957Hl.f6734a;
        return c10037zl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C8957Hl(((C10037zl) obj).f9408a);
    }

    @NotNull
    /* renamed from: a */
    public final C8957Hl m5279a(@NotNull C10037zl c10037zl) {
        return new C8957Hl(c10037zl.f9408a);
    }
}
