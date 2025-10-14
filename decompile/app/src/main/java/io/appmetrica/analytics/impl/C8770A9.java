package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.A9 */
/* loaded from: classes8.dex */
public final class C8770A9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9937vl fromModel(@Nullable C10025z9 c10025z9) {
        C9937vl c9937vl = new C9937vl();
        if (c10025z9 != null) {
            c9937vl.f9235a = c10025z9.f9398a;
        }
        return c9937vl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C10025z9(((C9937vl) obj).f9235a);
    }

    @NotNull
    /* renamed from: a */
    public final C10025z9 m4932a(@NotNull C9937vl c9937vl) {
        return new C10025z9(c9937vl.f9235a);
    }
}
