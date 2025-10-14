package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Fk */
/* loaded from: classes8.dex */
public final class C8906Fk implements ListConverter {

    /* renamed from: a */
    public final C8931Gk f6625a = new C8931Gk();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9497e6[] fromModel(@NonNull List<C8956Hk> list) {
        C9497e6[] c9497e6Arr = new C9497e6[list.size()];
        Iterator<C8956Hk> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c9497e6Arr[i] = this.f6625a.fromModel(it.next());
            i++;
        }
        return c9497e6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: a */
    public final List<C8956Hk> m5187a(C9497e6[] c9497e6Arr) {
        throw new UnsupportedOperationException();
    }
}
