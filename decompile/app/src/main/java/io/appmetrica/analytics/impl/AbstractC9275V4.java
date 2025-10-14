package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.V4 */
/* loaded from: classes7.dex */
public abstract class AbstractC9275V4 extends AbstractC9921v5 {
    public AbstractC9275V4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, C9157Q5> componentLoader, @NonNull C9637jl c9637jl, @NonNull BaseRequestConfig.BaseRequestArguments<C8840D4, Object> baseRequestArguments) {
        super(componentLoader, c9637jl, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9921v5
    /* renamed from: a */
    public final void mo5408a(@NonNull Object obj) {
        C8840D4 c8840d4 = (C8840D4) obj;
        synchronized (this) {
            super.mo5408a((Object) c8840d4);
        }
    }

    /* renamed from: a */
    public final synchronized void m5688a(@NonNull C8840D4 c8840d4) {
        super.mo5408a((Object) c8840d4);
    }
}
