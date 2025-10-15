package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Tf */
/* loaded from: classes5.dex */
public final class C9238Tf implements InterfaceC9267Uk, InterfaceC8871Ea {

    /* renamed from: a */
    public final Context f7291a;

    /* renamed from: b */
    public final C9396a5 f7292b;

    /* renamed from: c */
    public final C9421b5 f7293c;

    /* renamed from: d */
    public final C8907Fl f7294d;

    /* renamed from: e */
    public final InterfaceC9090Na f7295e;

    public C9238Tf(@NotNull Context context, @NotNull C9396a5 c9396a5, @NotNull C8865E4 c8865e4, @NotNull InterfaceC9596i5 interfaceC9596i5, @NotNull C9421b5 c9421b5, @NotNull C9052Lk c9052Lk) {
        this.f7291a = context;
        this.f7292b = c9396a5;
        this.f7293c = c9421b5;
        C8907Fl c8907FlM5367a = c9052Lk.m5367a(context, c9396a5, c8865e4.f6522a);
        this.f7294d = c8907FlM5367a;
        this.f7295e = interfaceC9596i5.mo5750a(context, c9396a5, c8865e4.f6523b, c8907FlM5367a);
        c9052Lk.m5368a(c9396a5, this);
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: a */
    public final C9396a5 m5616a() {
        return this.f7292b;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: b */
    public final Context m5619b() {
        return this.f7291a;
    }

    /* renamed from: a */
    public final void m5618a(@NotNull InterfaceC9895u4 interfaceC9895u4) {
        this.f7293c.f7766a.add(interfaceC9895u4);
    }

    /* renamed from: b */
    public final void m5620b(@NotNull InterfaceC9895u4 interfaceC9895u4) {
        this.f7293c.f7766a.remove(interfaceC9895u4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9267Uk
    /* renamed from: a */
    public final void mo5381a(@NotNull C9637jl c9637jl) {
        this.f7295e.mo5381a(c9637jl);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9267Uk
    /* renamed from: a */
    public final void mo5378a(@NotNull EnumC9100Nk enumC9100Nk, @Nullable C9637jl c9637jl) {
        ((C9571h5) this.f7295e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8871Ea
    /* renamed from: a */
    public final void mo5111a(@NotNull C8865E4 c8865e4) {
        this.f7294d.m5193a(c8865e4.f6522a);
        this.f7295e.mo5023a(c8865e4.f6523b);
    }

    /* renamed from: a */
    public final void m5617a(@NotNull C9252U5 c9252u5, @NotNull C8865E4 c8865e4) {
        if (!AbstractC9875t9.f9107c.contains(EnumC9329Xa.m5744a(c9252u5.f7312d))) {
            this.f7295e.mo5023a(c8865e4.f6523b);
        }
        ((C9571h5) this.f7295e).mo5440a(c9252u5);
    }

    public C9238Tf(@NotNull Context context, @NotNull C9396a5 c9396a5, @NotNull C8865E4 c8865e4, @NotNull InterfaceC9596i5 interfaceC9596i5) {
        this(context, c9396a5, c8865e4, interfaceC9596i5, new C9421b5(), C9052Lk.m5366a());
    }
}
