package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.media3.datasource.cache.CacheDataSink;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Nd */
/* loaded from: classes6.dex */
public final class C9093Nd implements Converter {

    /* renamed from: a */
    public final C9876ta f7031a;

    public C9093Nd() {
        this(new C9876ta(CacheDataSink.DEFAULT_BUFFER_SIZE, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9288Vh fromModel(@NonNull Map<String, String> map) {
        C9054Lm c9054LmMo5318a = this.f7031a.mo5318a(map);
        C9649k8 c9649k8 = new C9649k8();
        c9649k8.f8506b = ((C8815C4) c9054LmMo5318a.f6955b).f6426b;
        Map map2 = (Map) c9054LmMo5318a.f6954a;
        if (map2 != null) {
            c9649k8.f8505a = new C9624j8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c9649k8.f8505a[i] = new C9624j8();
                c9649k8.f8505a[i].f8417a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c9649k8.f8505a[i].f8418b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC9869t3 interfaceC9869t3 = c9054LmMo5318a.f6955b;
        int i2 = ((C8815C4) interfaceC9869t3).f9034a;
        return new C9288Vh(c9649k8, interfaceC9869t3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C9093Nd(@NonNull C9876ta c9876ta) {
        this.f7031a = c9876ta;
    }

    @NonNull
    /* renamed from: a */
    public final Map<String, String> m5442a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
