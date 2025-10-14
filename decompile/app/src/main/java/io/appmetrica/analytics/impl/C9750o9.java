package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.o9 */
/* loaded from: classes7.dex */
public final class C9750o9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9700m9 fromModel(@NonNull C9725n9 c9725n9) {
        C9700m9 c9700m9 = new C9700m9();
        String str = c9725n9.f8719a;
        if (str != null) {
            c9700m9.f8645a = str.getBytes();
        }
        return c9700m9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9725n9 toModel(@NonNull C9700m9 c9700m9) {
        return new C9725n9(new String(c9700m9.f8645a));
    }
}
