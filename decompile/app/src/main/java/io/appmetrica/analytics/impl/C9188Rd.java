package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Rd */
/* loaded from: classes8.dex */
public final class C9188Rd implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10012yl fromModel(@NonNull C9165Qd c9165Qd) {
        C10012yl c10012yl = new C10012yl();
        c10012yl.f9371a = c9165Qd.f7157a;
        c10012yl.f9372b = c9165Qd.f7158b;
        return c10012yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C10012yl c10012yl = (C10012yl) obj;
        return new C9165Qd(c10012yl.f9371a, c10012yl.f9372b);
    }

    @NonNull
    /* renamed from: a */
    public final C9165Qd m5523a(@NonNull C10012yl c10012yl) {
        return new C9165Qd(c10012yl.f9371a, c10012yl.f9372b);
    }
}
