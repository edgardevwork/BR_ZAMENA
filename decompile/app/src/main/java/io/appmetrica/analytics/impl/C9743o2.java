package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.o2 */
/* loaded from: classes7.dex */
public final class C9743o2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9837rl fromModel(@NonNull C9718n2 c9718n2) {
        C9787pl c9787pl;
        C9837rl c9837rl = new C9837rl();
        c9837rl.f9022a = new C9812ql[c9718n2.f8694a.size()];
        for (int i = 0; i < c9718n2.f8694a.size(); i++) {
            C9812ql c9812ql = new C9812ql();
            Pair pair = (Pair) c9718n2.f8694a.get(i);
            c9812ql.f8961a = (String) pair.first;
            if (pair.second != null) {
                c9812ql.f8962b = new C9787pl();
                C9693m2 c9693m2 = (C9693m2) pair.second;
                if (c9693m2 == null) {
                    c9787pl = null;
                } else {
                    C9787pl c9787pl2 = new C9787pl();
                    c9787pl2.f8907a = c9693m2.f8620a;
                    c9787pl = c9787pl2;
                }
                c9812ql.f8962b = c9787pl;
            }
            c9837rl.f9022a[i] = c9812ql;
        }
        return c9837rl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9718n2 toModel(@NonNull C9837rl c9837rl) {
        ArrayList arrayList = new ArrayList();
        for (C9812ql c9812ql : c9837rl.f9022a) {
            String str = c9812ql.f8961a;
            C9787pl c9787pl = c9812ql.f8962b;
            arrayList.add(new Pair(str, c9787pl == null ? null : new C9693m2(c9787pl.f8907a)));
        }
        return new C9718n2(arrayList);
    }
}
