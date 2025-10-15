package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.x3 */
/* loaded from: classes7.dex */
public final class C9969x3 implements ProtobufConverter {
    @NonNull
    /* renamed from: a */
    public final C9887tl m6949a(@NonNull C9919v3 c9919v3) {
        C9887tl c9887tl = new C9887tl();
        c9887tl.f9134a = c9919v3.f9210a;
        return c9887tl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C9887tl c9887tl = new C9887tl();
        c9887tl.f9134a = ((C9919v3) obj).f9210a;
        return c9887tl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C9919v3(((C9887tl) obj).f9134a);
    }

    @NonNull
    /* renamed from: a */
    public final C9919v3 m6950a(@NonNull C9887tl c9887tl) {
        return new C9919v3(c9887tl.f9134a);
    }
}
