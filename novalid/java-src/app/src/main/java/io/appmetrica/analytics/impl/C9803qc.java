package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qc */
/* loaded from: classes6.dex */
public final class C9803qc implements InterfaceC8819C8, InterfaceC9136P8 {

    /* renamed from: a */
    public final C9062M6 f8938a;

    /* renamed from: b */
    public final C9607ig f8939b;

    /* renamed from: c */
    public final AtomicLong f8940c;

    public C9803qc(@NotNull C9062M6 c9062m6, @NotNull C9607ig c9607ig) {
        this.f8938a = c9062m6;
        this.f8939b = c9607ig;
        this.f8940c = new AtomicLong(c9062m6.m5390a());
        c9062m6.m5397a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9136P8
    /* renamed from: a */
    public final void mo5100a(@NotNull List<Integer> list) {
        this.f8940c.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8819C8
    /* renamed from: b */
    public final boolean mo5021b() {
        return this.f8940c.get() >= ((long) ((C8902Fg) this.f8939b.m6880a()).f6605j);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9136P8
    /* renamed from: a */
    public final void mo5099a() {
        this.f8940c.set(this.f8938a.m5390a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9136P8
    /* renamed from: b */
    public final void mo5101b(@NotNull List<Integer> list) {
        this.f8940c.addAndGet(-list.size());
    }
}
