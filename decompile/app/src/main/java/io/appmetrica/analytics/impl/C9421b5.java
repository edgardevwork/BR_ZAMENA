package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.b5 */
/* loaded from: classes6.dex */
public final class C9421b5 {

    /* renamed from: a */
    public final CopyOnWriteArrayList f7766a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m5892a(@NonNull InterfaceC9895u4 interfaceC9895u4) {
        this.f7766a.add(interfaceC9895u4);
    }

    /* renamed from: b */
    public final void m5893b(@NonNull InterfaceC9895u4 interfaceC9895u4) {
        this.f7766a.remove(interfaceC9895u4);
    }

    /* renamed from: a */
    public final List<InterfaceC9895u4> m5891a() {
        return this.f7766a;
    }
}
