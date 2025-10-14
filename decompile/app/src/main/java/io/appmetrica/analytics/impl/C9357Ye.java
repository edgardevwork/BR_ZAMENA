package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ye */
/* loaded from: classes5.dex */
public final class C9357Ye implements Converter {

    /* renamed from: a */
    public final C9776pa f7595a;

    public C9357Ye() {
        this(new C9776pa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9288Vh fromModel(@NonNull List<String> list) {
        C9054Lm c9054LmMo5318a = this.f7595a.mo5318a((List<Object>) list);
        List list2 = (List) c9054LmMo5318a.f6954a;
        C9724n8[] c9724n8Arr = new C9724n8[0];
        if (list2 != null) {
            c9724n8Arr = new C9724n8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C9724n8 c9724n8 = new C9724n8();
                c9724n8Arr[i] = c9724n8;
                c9724n8.f8718a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        c9054LmMo5318a.f6955b.getBytesTruncated();
        return new C9288Vh(c9724n8Arr, c9054LmMo5318a.f6955b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C9357Ye(@NonNull C9776pa c9776pa) {
        this.f7595a = c9776pa;
    }

    @NonNull
    /* renamed from: a */
    public final List<String> m5785a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
