package ru.rustore.sdk.billingclient.impl.data.repository;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import ru.rustore.sdk.billingclient.impl.data.datasource.C11444v;
import ru.rustore.sdk.billingclient.impl.domain.model.C11511h;
import ru.rustore.sdk.billingclient.impl.domain.model.InterfaceC11512i;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.repository.x */
/* loaded from: classes5.dex */
public final class C11496x {

    /* renamed from: a */
    public final C11444v f10326a;

    /* renamed from: b */
    public final MutableSharedFlow<InterfaceC11512i> f10327b;

    public C11496x(C11444v dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f10326a = dataSource;
        this.f10327b = SharedFlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
    }

    /* renamed from: a */
    public final C11511h m7461a() {
        C11511h c11511h;
        C11444v c11444v = this.f10326a;
        synchronized (c11444v) {
            c11511h = c11444v.f10234a;
        }
        return c11511h;
    }

    /* renamed from: a */
    public final void m7462a(C11511h c11511h) {
        synchronized (this) {
            try {
                this.f10326a.m7447a(c11511h);
                this.f10327b.tryEmit(c11511h != null ? new InterfaceC11512i.b(c11511h) : InterfaceC11512i.a.f10500a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
