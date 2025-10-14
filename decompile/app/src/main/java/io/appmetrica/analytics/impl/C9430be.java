package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.be */
/* loaded from: classes8.dex */
public final class C9430be implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9348Y5[] fromModel(@NotNull Map<String, String> map) {
        int size = map.size();
        C9348Y5[] c9348y5Arr = new C9348Y5[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c9348y5Arr[i2] = new C9348Y5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C9348Y5 c9348y5 = c9348y5Arr[i];
            String key = entry.getKey();
            Charset charset = Charsets.UTF_8;
            c9348y5.f7561a = key.getBytes(charset);
            c9348y5Arr[i].f7562b = entry.getValue().getBytes(charset);
            i++;
        }
        return c9348y5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m5915a(@NotNull C9348Y5[] c9348y5Arr) {
        throw new UnsupportedOperationException();
    }
}
