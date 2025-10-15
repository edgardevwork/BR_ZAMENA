package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Ml */
/* loaded from: classes8.dex */
public final class C9077Ml implements ProtobufConverter {
    @NonNull
    /* renamed from: a */
    public final C8782Al m5409a(@NonNull C9053Ll c9053Ll) {
        C8782Al c8782Al = new C8782Al();
        c8782Al.f6349a = c9053Ll.f6953a;
        return c8782Al;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C8782Al c8782Al = new C8782Al();
        c8782Al.f6349a = ((C9053Ll) obj).f6953a;
        return c8782Al;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C9053Ll(((C8782Al) obj).f6349a);
    }

    @NonNull
    /* renamed from: a */
    public final C9053Ll m5410a(@NonNull C8782Al c8782Al) {
        return new C9053Ll(c8782Al.f6349a);
    }
}
