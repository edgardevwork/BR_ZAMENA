package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Lm */
/* loaded from: classes6.dex */
public final class C9054Lm implements InterfaceC9869t3 {

    /* renamed from: a */
    @Nullable
    public final Object f6954a;

    /* renamed from: b */
    @NonNull
    public final InterfaceC9869t3 f6955b;

    public C9054Lm(@Nullable Object obj, @NonNull InterfaceC9869t3 interfaceC9869t3) {
        this.f6954a = obj;
        this.f6955b = interfaceC9869t3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9869t3
    public final int getBytesTruncated() {
        return this.f6955b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f6954a + ", metaInfo=" + this.f6955b + '}';
    }
}
