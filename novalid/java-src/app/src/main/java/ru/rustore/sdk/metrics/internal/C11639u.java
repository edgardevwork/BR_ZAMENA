package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
/* renamed from: ru.rustore.sdk.metrics.internal.u */
/* loaded from: classes8.dex */
public final class C11639u {

    /* renamed from: a */
    public final String f10711a;

    public final boolean equals(Object obj) {
        return (obj instanceof C11639u) && Intrinsics.areEqual(this.f10711a, ((C11639u) obj).f10711a);
    }

    public final int hashCode() {
        return this.f10711a.hashCode();
    }

    public final String toString() {
        return "MetricsEventUuid(value=" + this.f10711a + ')';
    }
}
