package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Z */
/* loaded from: classes5.dex */
public final class C9366Z implements InterfaceC8808Bm {

    /* renamed from: a */
    public final /* synthetic */ C9391a0 f7609a;

    public C9366Z(C9391a0 c9391a0) {
        this.f7609a = c9391a0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8808Bm
    @NotNull
    /* renamed from: a */
    public final Thread mo5009a() {
        return this.f7609a.f7658b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8808Bm
    @Nullable
    /* renamed from: b */
    public final StackTraceElement[] mo5010b() {
        C9391a0 c9391a0 = this.f7609a;
        return (StackTraceElement[]) c9391a0.f7657a.get(c9391a0.f7658b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8808Bm
    @NotNull
    /* renamed from: c */
    public final Map<Thread, StackTraceElement[]> mo5011c() {
        return this.f7609a.f7657a;
    }
}
