package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ua */
/* loaded from: classes5.dex */
public final class C9901ua implements HostRetryInfoProvider {

    /* renamed from: a */
    public final C9830re f9172a;

    /* renamed from: b */
    public final EnumC9779pd f9173b;

    public C9901ua(@NotNull C9830re c9830re, @NotNull EnumC9779pd enumC9779pd) {
        this.f9172a = c9830re;
        this.f9173b = enumC9779pd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f9172a.m6759a(this.f9173b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f9172a.m6756a(this.f9173b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.f9172a.m6763b(this.f9173b, j).m6648b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.f9172a.m6762b(this.f9173b, i).m6648b();
    }
}
