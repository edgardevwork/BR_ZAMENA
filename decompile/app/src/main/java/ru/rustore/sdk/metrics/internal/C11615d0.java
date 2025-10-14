package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@JvmInline
/* renamed from: ru.rustore.sdk.metrics.internal.d0 */
/* loaded from: classes8.dex */
public final class C11615d0 {

    /* renamed from: a */
    public final String f10671a;

    public final boolean equals(Object obj) {
        return (obj instanceof C11615d0) && Intrinsics.areEqual(this.f10671a, ((C11615d0) obj).f10671a);
    }

    public final int hashCode() {
        return this.f10671a.hashCode();
    }

    public final String toString() {
        return "VersionName(value=" + this.f10671a + ')';
    }
}
