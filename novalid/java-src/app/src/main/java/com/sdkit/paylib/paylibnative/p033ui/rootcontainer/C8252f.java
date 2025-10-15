package com.sdkit.paylib.paylibnative.p033ui.rootcontainer;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.f */
/* loaded from: classes8.dex */
public final class C8252f {

    /* renamed from: a */
    public final AtomicReference f2584a = new AtomicReference(null);

    /* renamed from: a */
    public final InterfaceC8251e m2426a() {
        return (InterfaceC8251e) this.f2584a.get();
    }

    /* renamed from: b */
    public final void m2428b(InterfaceC8251e handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f2584a.set(handler);
    }

    /* renamed from: a */
    public final void m2427a(InterfaceC8251e handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m34m(this.f2584a, handler, null);
    }
}
