package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.U */
/* loaded from: classes7.dex */
public final class C9246U implements ProtobufConverter {

    /* renamed from: a */
    public final C9963wm f7302a;

    public C9246U(@NonNull C9963wm c9963wm) {
        this.f7302a = c9963wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C9300W5 fromModel(@NonNull C9222T c9222t) {
        C9300W5 c9300w5 = new C9300W5();
        C9938vm c9938vm = c9222t.f7269a;
        if (c9938vm != null) {
            c9300w5.f7391a = this.f7302a.fromModel(c9938vm);
        }
        c9300w5.f7392b = new C9522f6[c9222t.f7270b.size()];
        Iterator it = c9222t.f7270b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c9300w5.f7392b[i] = this.f7302a.fromModel((C9938vm) it.next());
            i++;
        }
        String str = c9222t.f7271c;
        if (str != null) {
            c9300w5.f7393c = str;
        }
        return c9300w5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: a */
    public final C9222T m5622a(@NonNull C9300W5 c9300w5) {
        throw new UnsupportedOperationException();
    }
}
