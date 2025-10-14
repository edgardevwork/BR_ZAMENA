package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Gk */
/* loaded from: classes8.dex */
public final class C8931Gk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9497e6 fromModel(@NonNull C8956Hk c8956Hk) {
        C9497e6 c9497e6 = new C9497e6();
        c9497e6.f7987a = (String) WrapUtils.getOrDefault(c8956Hk.f6728a, c9497e6.f7987a);
        c9497e6.f7988b = (String) WrapUtils.getOrDefault(c8956Hk.f6729b, c9497e6.f7988b);
        c9497e6.f7989c = ((Integer) WrapUtils.getOrDefault(c8956Hk.f6730c, Integer.valueOf(c9497e6.f7989c))).intValue();
        c9497e6.f7992f = ((Integer) WrapUtils.getOrDefault(c8956Hk.f6731d, Integer.valueOf(c9497e6.f7992f))).intValue();
        c9497e6.f7990d = (String) WrapUtils.getOrDefault(c8956Hk.f6732e, c9497e6.f7990d);
        c9497e6.f7991e = ((Boolean) WrapUtils.getOrDefault(c8956Hk.f6733f, Boolean.valueOf(c9497e6.f7991e))).booleanValue();
        return c9497e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: a */
    public final C8956Hk m5231a(@NonNull C9497e6 c9497e6) {
        throw new UnsupportedOperationException();
    }
}
