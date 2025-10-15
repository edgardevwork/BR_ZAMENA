package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wm */
/* loaded from: classes7.dex */
public final class C9963wm implements ProtobufConverter {

    /* renamed from: a */
    public final C8906Fk f9285a;

    public C9963wm() {
        this(new C8906Fk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C9522f6 fromModel(@NonNull C9938vm c9938vm) {
        C9522f6 c9522f6 = new C9522f6();
        Integer num = c9938vm.f9240e;
        c9522f6.f8063e = num == null ? -1 : num.intValue();
        c9522f6.f8062d = c9938vm.f9239d;
        c9522f6.f8060b = c9938vm.f9237b;
        c9522f6.f8059a = c9938vm.f9236a;
        c9522f6.f8061c = c9938vm.f9238c;
        C8906Fk c8906Fk = this.f9285a;
        List list = c9938vm.f9241f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8956Hk((StackTraceElement) it.next()));
        }
        c9522f6.f8064f = c8906Fk.fromModel(arrayList);
        return c9522f6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9963wm(C8906Fk c8906Fk) {
        this.f9285a = c8906Fk;
    }

    @NonNull
    /* renamed from: a */
    public final C9938vm m6934a(@NonNull C9522f6 c9522f6) {
        throw new UnsupportedOperationException();
    }
}
