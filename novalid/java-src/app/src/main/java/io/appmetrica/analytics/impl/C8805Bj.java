package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Bj */
/* loaded from: classes7.dex */
public final class C8805Bj implements InterfaceC9903uc {
    @Override // io.appmetrica.analytics.impl.InterfaceC9903uc
    /* renamed from: a */
    public final void mo4971a(@NotNull Context context) {
        AbstractC9292Vl abstractC9292VlM5684a = C9268Ul.m5684a(C9737nl.class);
        ProtobufStateStorage<Object> protobufStateStorageMo5468a = abstractC9292VlM5684a.mo5468a(context, abstractC9292VlM5684a.mo5470d(context));
        C9737nl c9737nl = (C9737nl) protobufStateStorageMo5468a.read();
        C9712ml c9712mlM6564a = c9737nl.m6564a(c9737nl.f8777m);
        c9712mlM6564a.f8677o = 0L;
        protobufStateStorageMo5468a.save(new C9737nl(c9712mlM6564a));
    }
}
