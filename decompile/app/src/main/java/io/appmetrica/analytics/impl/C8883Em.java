package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Em */
/* loaded from: classes8.dex */
public final class C8883Em implements ProtobufConverter {

    /* renamed from: a */
    public final C8906Fk f6558a;

    public C8883Em() {
        this(new C8906Fk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C9547g6 fromModel(@NonNull C8908Fm c8908Fm) {
        C9547g6 c9547g6 = new C9547g6();
        c9547g6.f8166a = (String) WrapUtils.getOrDefault(c8908Fm.f6628a, "");
        c9547g6.f8167b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c8908Fm.f6629b, ""));
        List<C8956Hk> list = c8908Fm.f6630c;
        if (list != null) {
            c9547g6.f8168c = this.f6558a.fromModel(list);
        }
        C8908Fm c8908Fm2 = c8908Fm.f6631d;
        if (c8908Fm2 != null) {
            c9547g6.f8169d = fromModel(c8908Fm2);
        }
        List list2 = c8908Fm.f6632e;
        int i = 0;
        if (list2 == null) {
            c9547g6.f8170e = new C9547g6[0];
        } else {
            c9547g6.f8170e = new C9547g6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c9547g6.f8170e[i] = fromModel((C8908Fm) it.next());
                i++;
            }
        }
        return c9547g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C8883Em(C8906Fk c8906Fk) {
        this.f6558a = c8906Fk;
    }

    @NonNull
    /* renamed from: a */
    public final C8908Fm m5121a(@NonNull C9547g6 c9547g6) {
        throw new UnsupportedOperationException();
    }
}
