package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.tb */
/* loaded from: classes6.dex */
public final class C9877tb implements ConfigProvider {

    /* renamed from: a */
    public final C9571h5 f9118a;

    /* renamed from: b */
    public final Lazy f9119b = LazyKt__LazyJVMKt.lazy(new C9852sb(this));

    public C9877tb(@NotNull C9571h5 c9571h5) {
        this.f9118a = c9571h5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* renamed from: a */
    public final C8902Fg getConfig() {
        return (C8902Fg) this.f9119b.getValue();
    }
}
