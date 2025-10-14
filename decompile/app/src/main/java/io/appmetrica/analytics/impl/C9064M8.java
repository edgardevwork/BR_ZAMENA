package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.M8 */
/* loaded from: classes8.dex */
public final class C9064M8 implements ProtobufConverter {
    /* renamed from: a */
    public static C9825r9 m5402a(C9040L8 c9040l8) {
        C9825r9 c9825r9 = new C9825r9();
        c9825r9.f8992d = new int[c9040l8.f6928b.size()];
        Iterator it = c9040l8.f6928b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c9825r9.f8992d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        c9825r9.f8991c = c9040l8.f6930d;
        c9825r9.f8990b = c9040l8.f6929c;
        c9825r9.f8989a = c9040l8.f6927a;
        return c9825r9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return m5402a((C9040L8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C9825r9 c9825r9 = (C9825r9) obj;
        return new C9040L8(c9825r9.f8989a, c9825r9.f8990b, c9825r9.f8991c, CollectionUtils.hashSetFromIntArray(c9825r9.f8992d));
    }
}
