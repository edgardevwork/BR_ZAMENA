package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.t4 */
/* loaded from: classes7.dex */
public final class C9870t4 {

    /* renamed from: a */
    public final SystemTimeProvider f9084a;

    public C9870t4() {
        this(new SystemTimeProvider());
    }

    /* renamed from: a */
    public final void m6817a() {
        this.f9084a.elapsedRealtime();
    }

    public C9870t4(SystemTimeProvider systemTimeProvider) {
        this.f9084a = systemTimeProvider;
    }
}
