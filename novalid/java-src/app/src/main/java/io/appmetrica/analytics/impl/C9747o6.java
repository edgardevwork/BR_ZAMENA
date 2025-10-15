package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.o6 */
/* loaded from: classes6.dex */
public final class C9747o6 implements InterfaceC8846Da {

    /* renamed from: a */
    public final CopyOnWriteArrayList f8804a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC8846Da
    /* renamed from: a */
    public final void mo5058a(@Nullable Throwable th, @NotNull C9222T c9222t) {
        Iterator it = this.f8804a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8846Da) it.next()).mo5058a(th, c9222t);
        }
    }

    /* renamed from: a */
    public final void m6577a(@NotNull InterfaceC8846Da... interfaceC8846DaArr) {
        CollectionsKt__MutableCollectionsKt.addAll(this.f8804a, interfaceC8846DaArr);
    }

    /* renamed from: a */
    public final void m6576a(@NotNull List<? extends InterfaceC8846Da> list) {
        this.f8804a.addAll(list);
    }

    /* renamed from: a */
    public final void m6575a() {
        this.f8804a.clear();
    }
}
