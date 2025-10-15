package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Vh */
/* loaded from: classes5.dex */
public final class C9288Vh implements InterfaceC9869t3 {

    /* renamed from: a */
    @NonNull
    public final Object f7371a;

    /* renamed from: b */
    @NonNull
    public final InterfaceC9869t3 f7372b;

    public C9288Vh(@NonNull Object obj, @NonNull InterfaceC9869t3 interfaceC9869t3) {
        this.f7371a = obj;
        this.f7372b = interfaceC9869t3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9869t3
    public final int getBytesTruncated() {
        return this.f7372b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f7371a + ", metaInfo=" + this.f7372b + '}';
    }
}
