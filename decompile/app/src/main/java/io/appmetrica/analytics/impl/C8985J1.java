package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.J1 */
/* loaded from: classes6.dex */
public final class C8985J1 implements InterfaceC9835rj {

    /* renamed from: b */
    @NotNull
    public static final C8961I1 f6801b = new C8961I1();

    /* renamed from: c */
    public static final int f6802c = 1;

    /* renamed from: a */
    public final InterfaceC9691m0 f6803a;

    public C8985J1(@NotNull InterfaceC9691m0 interfaceC9691m0) {
        this.f6803a = interfaceC9691m0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9835rj
    @WorkerThread
    public final void reportData(int i, @NotNull Bundle bundle) {
        ((C8912G1) this.f6803a).m5207a(bundle);
    }
}
