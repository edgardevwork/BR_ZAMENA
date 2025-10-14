package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.W3 */
/* loaded from: classes7.dex */
public final class C9298W3 extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final C9830re f7387a;

    public C9298W3(@NotNull C9830re c9830re) {
        super(c9830re.m6770e(), "[ClientApiTrackingStatusToggle]");
        this.f7387a = c9830re;
    }

    /* renamed from: a */
    public final void m5701a(boolean z) {
        updateState(z);
        this.f7387a.m6769d(z);
    }
}
