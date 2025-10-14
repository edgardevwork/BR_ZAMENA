package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Bn */
/* loaded from: classes8.dex */
public final class C8809Bn extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final WeakHashMap f6416a;

    public C8809Bn() {
        super(false, "[WakelocksToggle]");
        this.f6416a = new WeakHashMap();
    }

    /* renamed from: a */
    public final synchronized void m5012a(@NotNull Object obj) {
        this.f6416a.put(obj, null);
        if (this.f6416a.size() == 1) {
            updateState(true);
        }
    }

    /* renamed from: b */
    public final synchronized void m5013b(@NotNull Object obj) {
        this.f6416a.remove(obj);
        if (this.f6416a.isEmpty()) {
            updateState(false);
        }
    }
}
