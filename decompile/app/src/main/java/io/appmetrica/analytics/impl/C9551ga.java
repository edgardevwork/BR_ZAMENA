package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ga */
/* loaded from: classes8.dex */
public final class C9551ga implements InterfaceC9041L9 {

    /* renamed from: a */
    public final C8919G8 f8189a = new C8919G8();

    @NotNull
    /* renamed from: a */
    public final C9425b9[] m6177a(@Nullable byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C9425b9[0];
        }
        Map<String, byte[]> model = this.f8189a.toModel(bArr);
        C9425b9[] c9425b9Arr = new C9425b9[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C9425b9 c9425b9 = new C9425b9();
            c9425b9.f7776a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c9425b9.f7777b = (byte[]) entry.getValue();
            c9425b9Arr[i] = c9425b9;
            i = i2;
        }
        return c9425b9Arr;
    }
}
